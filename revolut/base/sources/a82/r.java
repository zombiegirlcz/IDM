package a82;

import androidx.compose.foundation.text.AndroidCursorHandle_androidKt;
import androidx.compose.foundation.text.CoreTextFieldKt;
import androidx.compose.ui.draw.CacheDrawScope;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.room.util.SQLiteConnectionUtil;
import androidx.room.util.SQLiteStatementUtil;
import androidx.sqlite.SQLiteConnection;
import androidx.sqlite.SQLiteStatement;
import com.revolut.core.ui_kit.internal.views.ProductIntroView;
import com.revolut.data.model.Data;
import com.revolut.feature.payments.groups.api.models.PaymentGroup;
import ix0.q1;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.joda.time.LocalDate;

/* JADX INFO: loaded from: classes20.dex */
public final /* synthetic */ class r implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2020a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f2021b;

    public /* synthetic */ r(long j2, int i) {
        this.f2020a = i;
        this.f2021b = j2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) throws TimeoutException {
        Data data;
        d dVar;
        SQLiteStatement sQLiteStatementPrepare;
        int i = this.f2020a;
        long j2 = this.f2021b;
        switch (i) {
            case 0:
                c cVar = (c) obj2;
                Data data2 = cVar.f1997a;
                try {
                    Object content = data2.getContent();
                    if (content != null) {
                        d dVar2 = (d) content;
                        List codes = dVar2.f2001c.f2004a;
                        Intrinsics.checkNotNullParameter(codes, "codes");
                        g withdrawalsInfo = new g(codes, j2);
                        a12.c contactsInfo = dVar2.f1999a;
                        a12.m transactionsInfo = dVar2.f2000b;
                        b cardInfo = dVar2.d;
                        Intrinsics.checkNotNullParameter(contactsInfo, "contactsInfo");
                        Intrinsics.checkNotNullParameter(transactionsInfo, "transactionsInfo");
                        Intrinsics.checkNotNullParameter(withdrawalsInfo, "withdrawalsInfo");
                        Intrinsics.checkNotNullParameter(cardInfo, "cardInfo");
                        dVar = new d(contactsInfo, transactionsInfo, withdrawalsInfo, cardInfo);
                    } else {
                        dVar = null;
                    }
                    data = new Data(dVar, data2.getError(), data2.getLoading());
                    break;
                } catch (Throwable th10) {
                    data = new Data(null, th10, data2.getLoading());
                }
                return c.a(cVar, data, false, 2);
            case 1:
                return a92.a.a((a92.a) obj2, null, j2, 1);
            case 2:
                SQLiteConnection sQLiteConnection = (SQLiteConnection) obj2;
                sQLiteStatementPrepare = sQLiteConnection.prepare("\n        DELETE FROM events\n        WHERE timestamp <= ?\n        ");
                try {
                    sQLiteStatementPrepare.bindLong(1, j2);
                    sQLiteStatementPrepare.step();
                    return Integer.valueOf(SQLiteConnectionUtil.getTotalChangedRows(sQLiteConnection));
                } finally {
                }
            case 3:
                b7a.d update = (b7a.d) obj2;
                Intrinsics.checkNotNullParameter(update, "$this$update");
                update.getClass();
                return new b7a.d(j2);
            case 4:
                be3.f updateState = (be3.f) obj2;
                Intrinsics.checkNotNullParameter(updateState, "$this$updateState");
                return be3.f.a(updateState, this.f2021b, false, null, null, 29);
            case 5:
                be3.f updateState2 = (be3.f) obj2;
                Intrinsics.checkNotNullParameter(updateState2, "$this$updateState");
                return be3.f.a(updateState2, this.f2021b, false, null, null, 29);
            case 6:
                sQLiteStatementPrepare = ((SQLiteConnection) obj2).prepare("DELETE FROM smart_notification_feed WHERE date <= ?");
                try {
                    sQLiteStatementPrepare.bindLong(1, j2);
                    sQLiteStatementPrepare.step();
                    sQLiteStatementPrepare.close();
                    return null;
                } finally {
                }
            case 7:
                c64.k update2 = (c64.k) obj2;
                Intrinsics.checkNotNullParameter(update2, "$this$update");
                return update2.e(Long.valueOf(j2));
            case 8:
                c64.k update3 = (c64.k) obj2;
                Intrinsics.checkNotNullParameter(update3, "$this$update");
                return update3.g(Long.valueOf(j2));
            case 9:
                c64.k update4 = (c64.k) obj2;
                Intrinsics.checkNotNullParameter(update4, "$this$update");
                return update4.e(Long.valueOf(j2));
            case 10:
                c64.k update5 = (c64.k) obj2;
                Intrinsics.checkNotNullParameter(update5, "$this$update");
                return update5.g(Long.valueOf(j2));
            case 11:
                c7i.r update6 = (c7i.r) obj2;
                Intrinsics.checkNotNullParameter(update6, "$this$update");
                return c7i.r.a(update6, null, this.f2021b, 0L, null, null, null, null, null, null, 509);
            case 12:
                c7i.r update7 = (c7i.r) obj2;
                Intrinsics.checkNotNullParameter(update7, "$this$update");
                return c7i.r.a(update7, null, 0L, this.f2021b, null, null, null, null, null, null, 507);
            case 13:
                return de9.h.a((de9.h) obj2, null, this.f2021b, true, null, null, 25);
            case 14:
                List groups = (List) obj2;
                Intrinsics.checkNotNullParameter(groups, "groups");
                ArrayList arrayList = new ArrayList();
                for (Object obj3 : groups) {
                    if (((PaymentGroup) obj3).getF79289h().getMillis() > j2) {
                        arrayList.add(obj3);
                    }
                }
                return arrayList;
            case 15:
                Long second = (Long) obj2;
                Intrinsics.checkNotNullParameter(second, "second");
                return Long.valueOf(j2 - (second.longValue() * 1000));
            case 16:
                sQLiteStatementPrepare = ((SQLiteConnection) obj2).prepare("DELETE FROM air_tip_state WHERE expiration_date <= ?");
                try {
                    sQLiteStatementPrepare.bindLong(1, j2);
                    sQLiteStatementPrepare.step();
                    return Unit.f186387a;
                } finally {
                }
            case 17:
                String email = ((h07.e) obj2).f148196a;
                Intrinsics.checkNotNullParameter(email, "email");
                return new h07.e(email, j2);
            case 18:
                return Boolean.valueOf(((q1) obj2).f169281a == j2);
            case 19:
                return jni.e.a((jni.e) obj2, null, this.f2021b, false, null, null, false, 123);
            case 20:
                return jx1.d.a((jx1.d) obj2, null, j2, 11);
            case 21:
                kg2.d update8 = (kg2.d) obj2;
                Intrinsics.checkNotNullParameter(update8, "$this$update");
                update8.getClass();
                return new kg2.d(j2);
            case 22:
                kw1.d update9 = (kw1.d) obj2;
                Intrinsics.checkNotNullParameter(update9, "$this$update");
                xi0.b.Companion.getClass();
                dj0.d amount = new dj0.d(j2, xi0.b.F);
                dj0.d initialAmount = update9.f190200a;
                Intrinsics.checkNotNullParameter(initialAmount, "initialAmount");
                Intrinsics.checkNotNullParameter(amount, "amount");
                return new kw1.d(initialAmount, amount);
            case 23:
                LocalDate date = (LocalDate) obj2;
                Intrinsics.checkNotNullParameter(date, "date");
                return new Pair(date, Long.valueOf(j2));
            case 24:
                me4.f update10 = (me4.f) obj2;
                Intrinsics.checkNotNullParameter(update10, "$this$update");
                dj0.d amount2 = dj0.d.c(update10.f204602a, j2, null, 2);
                Intrinsics.checkNotNullParameter(amount2, "amount");
                return new me4.f(amount2);
            case 25:
                sQLiteStatementPrepare = ((SQLiteConnection) obj2).prepare("SELECT * FROM contact WHERE id = ?");
                try {
                    sQLiteStatementPrepare.bindLong(1, j2);
                    int columnIndexOrThrow = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "id");
                    int columnIndexOrThrow2 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "point");
                    int columnIndexOrThrow3 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "displayedName");
                    int columnIndexOrThrow4 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "firstName");
                    int columnIndexOrThrow5 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "lastName");
                    int columnIndexOrThrow6 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "registeredAs");
                    int columnIndexOrThrow7 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "username");
                    int columnIndexOrThrow8 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "code");
                    int columnIndexOrThrow9 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "isRevolut");
                    int columnIndexOrThrow10 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "isNewlyJoined");
                    int columnIndexOrThrow11 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "joinDate");
                    int columnIndexOrThrow12 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "birthday");
                    int columnIndexOrThrow13 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "transactionsCount");
                    int columnIndexOrThrow14 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "timestamp");
                    int columnIndexOrThrow15 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "pictureUri");
                    int columnIndexOrThrow16 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "type");
                    int columnIndexOrThrow17 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "country");
                    int columnIndexOrThrow18 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "appMode");
                    int columnIndexOrThrow19 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "paidPlan");
                    int columnIndexOrThrow20 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "customerType");
                    return sQLiteStatementPrepare.step() ? new ml3.i(sQLiteStatementPrepare.getLong(columnIndexOrThrow), sQLiteStatementPrepare.isNull(columnIndexOrThrow2) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow2), sQLiteStatementPrepare.isNull(columnIndexOrThrow3) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow3), sQLiteStatementPrepare.isNull(columnIndexOrThrow4) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow4), sQLiteStatementPrepare.isNull(columnIndexOrThrow5) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow5), sQLiteStatementPrepare.isNull(columnIndexOrThrow6) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow6), sQLiteStatementPrepare.isNull(columnIndexOrThrow7) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow7), sQLiteStatementPrepare.isNull(columnIndexOrThrow8) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow8), ((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow9)) != 0, ((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow10)) != 0, sQLiteStatementPrepare.isNull(columnIndexOrThrow11) ? null : Long.valueOf(sQLiteStatementPrepare.getLong(columnIndexOrThrow11)), sQLiteStatementPrepare.isNull(columnIndexOrThrow12) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow12), (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow13), sQLiteStatementPrepare.getLong(columnIndexOrThrow14), sQLiteStatementPrepare.isNull(columnIndexOrThrow15) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow15), pl3.a.a(sQLiteStatementPrepare.isNull(columnIndexOrThrow16) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow16)), sQLiteStatementPrepare.isNull(columnIndexOrThrow17) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow17), sQLiteStatementPrepare.isNull(columnIndexOrThrow18) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow18), sQLiteStatementPrepare.isNull(columnIndexOrThrow19) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow19), sQLiteStatementPrepare.isNull(columnIndexOrThrow20) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow20)) : null;
                } finally {
                }
            case 26:
                Boolean isActive = (Boolean) obj2;
                ProductIntroView.Companion aVar = ProductIntroView.INSTANCE;
                Intrinsics.checkNotNullParameter(isActive, "isActive");
                return isActive.booleanValue() ? efm.r.just(Unit.f186387a).delay(j2, TimeUnit.MILLISECONDS) : efm.r.never();
            case 27:
                ProductIntroView.Companion aVar2 = ProductIntroView.INSTANCE;
                throw new TimeoutException(p.a.n(j2, "Timeout of ", "ms exceeded; videoPlayer appears to be hanging in an active state"));
            case 28:
                return AndroidCursorHandle_androidKt.drawCursorHandle$lambda$0$0$0(j2, (CacheDrawScope) obj2);
            default:
                return CoreTextFieldKt.TextFieldCursorHandle$lambda$3$0(j2, (SemanticsPropertyReceiver) obj2);
        }
    }

    public /* synthetic */ r(ml3.h hVar, long j2) {
        this.f2020a = 25;
        this.f2021b = j2;
    }
}
