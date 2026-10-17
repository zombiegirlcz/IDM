package a5g;

import android.widget.TextView;
import androidx.room.support.AutoClosingRoomOpenHelper;
import androidx.sqlite.SQLiteConnection;
import androidx.sqlite.SQLiteStatement;
import androidx.sqlite.db.SupportSQLiteDatabase;
import com.revolut.core.ui_kit.internal.views.navbar.VersatileTitleView;
import com.revolut.data.model.Data;
import com.revolut.feature.credit.card.api.models.instalment.CreditCardStatementDeferralQuote;
import com.revolut.feature.retail.reverywhere.impl.web_app.c;
import com.revolut.feature.rev_points.impl.ui.terms_review.flow.RevPointsTermsReviewFlowContract$State;
import com.revolut.feature.tab.accounts.impl.ui.tab.TabAccountsScreenContract$State;
import d6j.o;
import ip0.gj0;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jmrtd.lds.LDSFile;
import zhm.a1;
import zhm.d0;
import zhm.v;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class i implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1385a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f1386b;

    public /* synthetic */ i(int i, int i2) {
        this.f1385a = i2;
        this.f1386b = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Data content;
        iw4.k kVarA;
        Data data;
        int i = this.f1385a;
        int i2 = 0;
        int i3 = this.f1386b;
        switch (i) {
            case 0:
                e update = (e) obj2;
                Intrinsics.checkNotNullParameter(update, "$this$update");
                Set set = update.f1382c;
                return e.a(update, null, set.contains(Integer.valueOf(i3)) ? a1.j(set, Integer.valueOf(i3)) : a1.m(set, Integer.valueOf(i3)), null, 11);
            case 1:
                adg.g update2 = (adg.g) obj2;
                Intrinsics.checkNotNullParameter(update2, "$this$update");
                if (i3 <= 0 || i3 < 0) {
                    return update2;
                }
                List list = update2.f3344a;
                if (i3 >= list.size() || list.size() <= 1) {
                    return update2;
                }
                ArrayList roomsList = new ArrayList();
                for (Object obj3 : list) {
                    int i5 = i2 + 1;
                    if (i2 < 0) {
                        v.s();
                        throw null;
                    }
                    if (i2 != i3) {
                        roomsList.add(obj3);
                    }
                    i2 = i5;
                }
                Intrinsics.checkNotNullParameter(roomsList, "roomsList");
                return new adg.g(roomsList);
            case 2:
                return ahf.l.a((ahf.l) obj2, null, null, null, false, null, null, null, this.f1386b, 0, null, 1791);
            case 3:
                return aqh.i.a((aqh.i) obj2, null, null, Integer.valueOf(i3), false, 191);
            case 4:
                TextView applyToTitleTextViews = (TextView) obj2;
                int i6 = VersatileTitleView.f57360l;
                Intrinsics.checkNotNullParameter(applyToTitleTextViews, "$this$applyToTitleTextViews");
                applyToTitleTextViews.setGravity(i3);
                return Unit.f186387a;
            case 5:
                TextView applyToTitleTextViews2 = (TextView) obj2;
                int i21 = VersatileTitleView.f57360l;
                Intrinsics.checkNotNullParameter(applyToTitleTextViews2, "$this$applyToTitleTextViews");
                jb3.l.e(applyToTitleTextViews2, i3);
                return Unit.f186387a;
            case 6:
                TextView applyToTitleTextViews3 = (TextView) obj2;
                int i22 = VersatileTitleView.f57360l;
                Intrinsics.checkNotNullParameter(applyToTitleTextViews3, "$this$applyToTitleTextViews");
                applyToTitleTextViews3.setTextColor(i3);
                return Unit.f186387a;
            case 7:
                List it8 = (List) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                return d0.V0(it8, i3);
            case 8:
                return AutoClosingRoomOpenHelper.AutoClosingSupportSQLiteDatabase._set_version_$lambda$1(i3, (SupportSQLiteDatabase) obj2);
            case 9:
                return TabAccountsScreenContract$State.a((TabAccountsScreenContract$State) obj2, null, null, null, null, null, null, null, null, null, null, null, false, null, false, i3 > 0 ? Integer.valueOf(i3) : null, null, null, null, null, false, false, null, 4177919);
            case 10:
                cxi.d update3 = (cxi.d) obj2;
                Intrinsics.checkNotNullParameter(update3, "$this$update");
                return cxi.d.a(update3, i3);
            case 11:
                o update4 = (o) obj2;
                Intrinsics.checkNotNullParameter(update4, "$this$update");
                return o.f(update4, null, false, null, null, null, null, null, null, this.f1386b, null, null, null, null, null, null, null, null, null, null, null, false, null, 33553407);
            case 12:
                dkb.d update5 = (dkb.d) obj2;
                Intrinsics.checkNotNullParameter(update5, "$this$update");
                return dkb.d.a(update5, null, i3, null, 5);
            case 13:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                return iii.c.c(i3);
            case 14:
                ezb.g update6 = (ezb.g) obj2;
                Intrinsics.checkNotNullParameter(update6, "$this$update");
                return ezb.g.a(update6, (ezb.i) ezb.i.a().get(i3), null, 2);
            case 15:
                f2c.h update7 = (f2c.h) obj2;
                Intrinsics.checkNotNullParameter(update7, "$this$update");
                return f2c.h.a(update7, 0, new f2c.j(i3), null, null, null, 29);
            case 16:
                fz6.h update8 = (fz6.h) obj2;
                Intrinsics.checkNotNullParameter(update8, "$this$update");
                ArrayList arrayListF1 = d0.f1(update8.d);
                arrayListF1.remove(i3);
                Unit unit = Unit.f186387a;
                return fz6.h.a(update8, null, null, null, arrayListF1, null, null, false, LDSFile.EF_SOD_TAG);
            case 17:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                return g6f.j.a(i3);
            case 18:
                g6g.d update9 = (g6g.d) obj2;
                Intrinsics.checkNotNullParameter(update9, "$this$update");
                List bounds = update9.f140942a;
                boolean z = update9.f140944c;
                Intrinsics.checkNotNullParameter(bounds, "bounds");
                return new g6g.d(i3, bounds, z);
            case 19:
                h2c.i update10 = (h2c.i) obj2;
                Intrinsics.checkNotNullParameter(update10, "$this$update");
                return h2c.i.a(update10, 0, new h2c.k(i3), null, null, null, 29);
            case 20:
                SQLiteStatement sQLiteStatementPrepare = ((SQLiteConnection) obj2).prepare("UPDATE converter_items SET weight = weight + ?");
                try {
                    sQLiteStatementPrepare.bindLong(1, i3);
                    sQLiteStatementPrepare.step();
                    return null;
                } finally {
                    sQLiteStatementPrepare.close();
                }
            case 21:
                RevPointsTermsReviewFlowContract$State update11 = (RevPointsTermsReviewFlowContract$State) obj2;
                Intrinsics.checkNotNullParameter(update11, "$this$update");
                update11.getClass();
                return new RevPointsTermsReviewFlowContract$State(i3);
            case 22:
                od0.i error = (od0.i) obj2;
                Intrinsics.checkNotNullParameter(error, "error");
                return new gj0(i3, error);
            case 23:
                iw4.l update12 = (iw4.l) obj2;
                Intrinsics.checkNotNullParameter(update12, "$this$update");
                Data data2 = update12.f168950a;
                try {
                    Object content2 = data2.getContent();
                    if (content2 != null) {
                        iw4.k kVar = (iw4.k) content2;
                        for (Object obj4 : kVar.f168947a) {
                            if (((CreditCardStatementDeferralQuote) obj4).f68801a == i3) {
                                kVarA = iw4.k.a(kVar, null, null, (CreditCardStatementDeferralQuote) obj4, 27);
                            }
                        }
                        throw new NoSuchElementException("Collection contains no element matching the predicate.");
                    }
                    kVarA = null;
                    content = new Data(kVarA, data2.getError(), data2.getLoading());
                } catch (Throwable th10) {
                    content = new Data(null, th10, data2.getLoading());
                }
                Intrinsics.checkNotNullParameter(content, "content");
                return new iw4.l(content);
            case 24:
                jb1.g updateState = (jb1.g) obj2;
                Intrinsics.checkNotNullParameter(updateState, "$this$updateState");
                return jb1.g.a(updateState, null, null, null, null, null, this.f1386b, 31);
            case 25:
                jb1.g updateState2 = (jb1.g) obj2;
                Intrinsics.checkNotNullParameter(updateState2, "$this$updateState");
                return jb1.g.a(updateState2, null, null, null, null, null, this.f1386b, 31);
            case 26:
                List data3 = (List) obj2;
                Intrinsics.checkNotNullParameter(data3, "data");
                return new hw5.a(i3, data3, data3.isEmpty());
            case 27:
                com.revolut.feature.retail.reverywhere.impl.web_app.b update13 = (com.revolut.feature.retail.reverywhere.impl.web_app.b) obj2;
                Intrinsics.checkNotNullParameter(update13, "$this$update");
                return com.revolut.feature.retail.reverywhere.impl.web_app.b.a(update13, null, null, new Data(null, null, true, 3, null), this.f1386b, c.b.f82933a, 71);
            case 28:
                Data it9 = (Data) obj2;
                Intrinsics.checkNotNullParameter(it9, "it");
                try {
                    Object content3 = it9.getContent();
                    data = new Data(content3 != null ? uj3.b.y((List) content3) : null, it9.getError(), it9.getLoading());
                    break;
                } catch (Throwable th11) {
                    data = new Data(null, th11, it9.getLoading());
                }
                return new ekc.e(data, i3);
            default:
                jrd.b update14 = (jrd.b) obj2;
                Intrinsics.checkNotNullParameter(update14, "$this$update");
                return jrd.b.a(update14, 0, i3, null, 27);
        }
    }

    public /* synthetic */ i(g6f.j jVar, int i) {
        this.f1385a = 17;
        this.f1386b = i;
    }
}
