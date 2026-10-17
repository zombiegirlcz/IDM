package zg6;

import androidx.room.util.SQLiteStatementUtil;
import androidx.sqlite.SQLiteConnection;
import androidx.sqlite.SQLiteStatement;
import com.google.crypto.tink.shaded.protobuf.t1;
import com.revolut.core.ui_kit.delegates.CellDetailsActionDelegate;
import com.revolut.data.model.Data;
import com.revolut.feature.external_accounts.impl.mandate.bottom_sheet.MandateSetupBottomSheetController;
import com.revolut.retail.core.navigation.NaviCommand;
import com.revolut.shared.feature.wealth.models.instrument.InstrumentTicker;
import dej.o0;
import ip0.s7;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import le.u1;
import zga.i;
import zga.j;
import zga.k;
import zgj.a0;
import zgj.q;
import zgj.r;
import zhm.d0;
import zhm.f0;
import zhm.h0;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class c implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f322078a;

    public /* synthetic */ c(int i) {
        this.f322078a = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Object obj3 = null;
        switch (this.f322078a) {
            case 0:
                CellDetailsActionDelegate.Model it8 = (CellDetailsActionDelegate.Model) obj2;
                int i = MandateSetupBottomSheetController.W;
                Intrinsics.checkNotNullParameter(it8, "it");
                return Boolean.valueOf(v.k("ITEM_ID_MAX_PER_TRANSFER", "ITEM_ID_MAX_PER_MONTH").contains(it8.f51781a));
            case 1:
                zga.f status = (zga.f) obj2;
                Intrinsics.checkNotNullParameter(status, "status");
                if (status instanceof zga.d) {
                    return ((zga.d) status).f322097a;
                }
                if (status instanceof zga.e) {
                    return null;
                }
                throw new NoWhenBranchMatchedException();
            case 2:
                k status2 = (k) obj2;
                Intrinsics.checkNotNullParameter(status2, "status");
                if (status2 instanceof i) {
                    return ((i) status2).f322102a;
                }
                if (status2 instanceof j) {
                    return null;
                }
                throw new NoWhenBranchMatchedException();
            case 3:
                r currentState = (r) obj2;
                Intrinsics.checkNotNullParameter(currentState, "currentState");
                return currentState.f322176c;
            case 4:
                r update = (r) obj2;
                Intrinsics.checkNotNullParameter(update, "$this$update");
                return r.a(update, null, null, null, null, null, null, null, null, zi0.c.P(Optional.empty(), false, null, 3), zi0.c.P(Optional.empty(), false, null, 3), null, null, null, null, null, 31999);
            case 5:
                r currentState2 = (r) obj2;
                Intrinsics.checkNotNullParameter(currentState2, "currentState");
                return currentState2.f322180l;
            case 6:
                dej.a esimCheckout = (dej.a) obj2;
                Intrinsics.checkNotNullParameter(esimCheckout, "esimCheckout");
                return u1.a(esimCheckout.i.f100421c);
            case 7:
                r currentState3 = (r) obj2;
                Intrinsics.checkNotNullParameter(currentState3, "currentState");
                return t1.t(currentState3.f322175b, currentState3.f322179j);
            case 8:
                r update2 = (r) obj2;
                Intrinsics.checkNotNullParameter(update2, "$this$update");
                return r.a(update2, null, null, new Data(null, null, true, 3, null), null, null, null, h0.f322473a, null, null, null, null, new Data(null, null, true, 3, null), null, null, null, 30651);
            case 9:
                r it9 = (r) obj2;
                Intrinsics.checkNotNullParameter(it9, "it");
                return it9.f322180l;
            case 10:
                Pair pair = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair, "<destruct>");
                dej.a aVar = (dej.a) pair.f186385a;
                Iterator it10 = ((List) pair.f186386b).iterator();
                while (true) {
                    if (it10.hasNext()) {
                        Object next = it10.next();
                        if (Intrinsics.f(((o0) next).a().f100423a, aVar.f113479n)) {
                            obj3 = next;
                        }
                    }
                }
                return u1.a(obj3);
            case 11:
                r currentState4 = (r) obj2;
                Intrinsics.checkNotNullParameter(currentState4, "currentState");
                return currentState4.f322180l;
            case 12:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                q.Companion.getClass();
                List listK = v.k(new s7("loadingItemId1", 0, 0, 0, 0, false, null, 126), new s7("loadingItemId2", 0, 0, 0, 0, false, null, 126), new s7("loadingItemId3", 0, 0, 0, 0, false, null, 126));
                yp0.b.k(listK, 0, 0, 0, 0, 31);
                List listC = u.c(new s7("loadingItemId4", 0, 0, 0, 0, false, null, 126));
                yp0.b.k(listC, 0, 0, 0, 0, 31);
                return new a0(null, i2b.a.o(listK, listC), q.f322171c);
            case 13:
                NaviCommand it11 = (NaviCommand) obj2;
                Intrinsics.checkNotNullParameter(it11, "it");
                return u1.a(it11);
            case 14:
                SQLiteStatement sQLiteStatementPrepare = ((SQLiteConnection) obj2).prepare("SELECT * FROM shops_brand_recent_search ORDER BY searchTimestamp DESC");
                try {
                    int columnIndexOrThrow = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "query");
                    int columnIndexOrThrow2 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "searchTimestamp");
                    ArrayList arrayList = new ArrayList();
                    while (sQLiteStatementPrepare.step()) {
                        arrayList.add(new aid.a(sQLiteStatementPrepare.isNull(columnIndexOrThrow) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow), sQLiteStatementPrepare.getLong(columnIndexOrThrow2)));
                        break;
                    }
                    return arrayList;
                } finally {
                    sQLiteStatementPrepare.close();
                }
            case 15:
                List it12 = (List) obj2;
                Intrinsics.checkNotNullParameter(it12, "it");
                return (InstrumentTicker) d0.d0(it12);
            case 16:
                List it13 = (List) obj2;
                Intrinsics.checkNotNullParameter(it13, "it");
                return (InstrumentTicker) d0.d0(it13);
            case 17:
                Data it14 = (Data) obj2;
                Intrinsics.checkNotNullParameter(it14, "it");
                return Boolean.valueOf(it14.getContent() != null);
            case 18:
                Data it15 = (Data) obj2;
                Intrinsics.checkNotNullParameter(it15, "it");
                Object content = it15.getContent();
                Intrinsics.h(content);
                return content;
            case 19:
                Data it16 = (Data) obj2;
                Intrinsics.checkNotNullParameter(it16, "it");
                return it16.getError() != null ? efm.d0.l(it16.getError()) : efm.d0.m(it16);
            case 20:
                Data it17 = (Data) obj2;
                Intrinsics.checkNotNullParameter(it17, "it");
                return Boolean.valueOf(it17.getError() == null);
            case 21:
                Data it18 = (Data) obj2;
                Intrinsics.checkNotNullParameter(it18, "it");
                return Boolean.valueOf(it18.getContent() != null);
            case 22:
                Data it19 = (Data) obj2;
                Intrinsics.checkNotNullParameter(it19, "it");
                Object content2 = it19.getContent();
                Intrinsics.h(content2);
                return content2;
            case 23:
                Data it20 = (Data) obj2;
                Intrinsics.checkNotNullParameter(it20, "it");
                if (it20.getContent() == null && it20.getLoading()) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 24:
                Data data = (Data) obj2;
                Intrinsics.checkNotNullParameter(data, "data");
                return Boolean.valueOf(data.getContent() == null && data.getLoading());
            case 25:
                return Boolean.TRUE;
            case 26:
                Data data2 = (Data) obj2;
                Intrinsics.checkNotNullParameter(data2, "data");
                return data2.getContent() == null ? Data.copy$default(data2, f0.f322471a, null, false, 6, null) : data2;
            case 27:
                Pair pair2 = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair2, "<destruct>");
                return (Data) ((hhm.g) pair2.f186386b).f152432a;
            case 28:
                Throwable error = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(error, "error");
                return efm.b.n(zii.h.i(error));
            default:
                return Unit.f186387a;
        }
    }

    public /* synthetic */ c(Object obj2, int i) {
        this.f322078a = i;
    }
}
