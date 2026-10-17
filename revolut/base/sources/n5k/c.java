package n5k;

import androidx.sqlite.SQLiteConnection;
import androidx.sqlite.SQLiteStatement;
import androidx.window.layout.WindowMetricsCalculator;
import com.revolut.core.ui_kit.delegates.CellDetailsActionDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsNoteDelegate;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.data.model.Data;
import com.revolut.domain.models.beneficiary.BankFieldDefinition;
import com.revolut.feature_rev_points_pocket_api.model.RevPointsPocketInfo;
import com.revolut.feature_rev_points_pocket_api.model.RevPointsPocketState;
import com.revolut.shared.feature.wealth.models.config.Links;
import ip0.nb0;
import ip0.pb0;
import ip0.s7;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlin.text.d0;
import n87.t;
import n8i.y;
import z0h.o0;
import z0h.p1;
import z0h.t1;
import zhm.f0;
import zhm.u;
import zhm.v;
import zhm.w;

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class c implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f212626a;

    public /* synthetic */ c(int i) {
        this.f212626a = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        RevPointsPocketInfo revPointsPocketInfoA;
        switch (this.f212626a) {
            case 0:
                CellDetailsNoteDelegate.Model it8 = (CellDetailsNoteDelegate.Model) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                return it8.f51877l;
            case 1:
                ty0.a it9 = (ty0.a) obj2;
                Intrinsics.checkNotNullParameter(it9, "it");
                return it9.d;
            case 2:
                LargeActionButtonDelegate.Model it10 = (LargeActionButtonDelegate.Model) obj2;
                Intrinsics.checkNotNullParameter(it10, "it");
                return it10.i;
            case 3:
                CellDetailsActionDelegate.Model it11 = (CellDetailsActionDelegate.Model) obj2;
                Intrinsics.checkNotNullParameter(it11, "it");
                return it11.f51787l;
            case 4:
                RowDelegate.Model it12 = (RowDelegate.Model) obj2;
                Intrinsics.checkNotNullParameter(it12, "it");
                return it12.f53228a;
            case 5:
                return WindowMetricsCalculator.Companion.decorator$lambda$0((WindowMetricsCalculator) obj2);
            case 6:
                String it13 = (String) obj2;
                Intrinsics.checkNotNullParameter(it13, "it");
                String lowerCase = it13.toLowerCase(Locale.ROOT);
                Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
                return jli.g.e(d0.F0(lowerCase).toString());
            case 7:
                String it14 = (String) obj2;
                Intrinsics.checkNotNullParameter(it14, "it");
                String lowerCase2 = it14.toLowerCase(Locale.ROOT);
                Intrinsics.checkNotNullExpressionValue(lowerCase2, "toLowerCase(...)");
                return jli.g.e(d0.F0(lowerCase2).toString());
            case 8:
                BankFieldDefinition it15 = (BankFieldDefinition) obj2;
                Intrinsics.checkNotNullParameter(it15, "it");
                return it15.f60271a;
            case 9:
                n68.k update = (n68.k) obj2;
                Intrinsics.checkNotNullParameter(update, "$this$update");
                return n68.k.c(update, null, null, null, null, null, null, null, 239);
            case 10:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                return n68.m.f212728a;
            case 11:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                nb0 nb0Var = pb0.Companion;
                List listK = v.k(nb0.a(nb0Var, "CHECKBOX_LOADING1", false, 6), nb0.a(nb0Var, "CHECKBOX_LOADING2", false, 6));
                yp0.b.k(listK, 0, 0, 0, 0, 31);
                return listK;
            case 12:
                yhm.r rVar = (yhm.r) obj2;
                Intrinsics.checkNotNullParameter(rVar, "<destruct>");
                return zhm.d0.E0((List) rVar.f314203c, zhm.d0.E0((List) rVar.f314202b, (List) rVar.f314201a));
            case 13:
                SQLiteStatement sQLiteStatementPrepare = ((SQLiteConnection) obj2).prepare("DELETE FROM market_assets");
                try {
                    sQLiteStatementPrepare.step();
                    sQLiteStatementPrepare.close();
                    return null;
                } catch (Throwable th10) {
                    sQLiteStatementPrepare.close();
                    throw th10;
                }
            case 14:
                Data physicalDesignsData = (Data) obj2;
                Intrinsics.checkNotNullParameter(physicalDesignsData, "physicalDesignsData");
                if (physicalDesignsData.getContent() == null) {
                    return physicalDesignsData.getLoading() ? physicalDesignsData : zi0.c.P(f0.f322471a, false, null, 3);
                }
                try {
                    Object content = physicalDesignsData.getContent();
                    return new Data(content != null ? zhm.d0.V0((List) content, 3) : null, physicalDesignsData.getError(), physicalDesignsData.getLoading());
                } catch (Throwable th11) {
                    return new Data(null, th11, physicalDesignsData.getLoading());
                }
            case 15:
                yhm.r rVar2 = (yhm.r) obj2;
                Intrinsics.checkNotNullParameter(rVar2, "<destruct>");
                return new n78.d((List) rVar2.f314201a, (of8.b) rVar2.f314202b, (sf8.h) rVar2.f314203c);
            case 16:
                Data it16 = (Data) obj2;
                Intrinsics.checkNotNullParameter(it16, "it");
                RevPointsPocketState revPointsPocketState = (RevPointsPocketState) it16.getContent();
                return Boolean.valueOf(((revPointsPocketState == null || (revPointsPocketInfoA = com.revolut.feature_rev_points_pocket_api.model.a.a(revPointsPocketState)) == null) ? null : revPointsPocketInfoA.f97786c) == ddi.e.OPEN);
            case 17:
                Intrinsics.checkNotNullParameter((Function0) obj2, "<unused var>");
                IntRange intRangeO = kotlin.ranges.f.o(0, 5);
                ArrayList arrayList = new ArrayList(w.t(intRangeO, 10));
                vim.f it17 = intRangeO.iterator();
                while (it17.f289625c) {
                    arrayList.add(new s7(a0.d.n("SUMMARY_ITEM_LOADING_", it17.nextInt()), 0, 0, 0, 0, false, null, 126));
                }
                yp0.b.k(arrayList, 0, 0, 0, 0, 31);
                return arrayList;
            case 18:
                Function0 getDefaultLoadingItems = (Function0) obj2;
                Intrinsics.checkNotNullParameter(getDefaultLoadingItems, "getDefaultLoadingItems");
                return new n85.h(null, (List) getDefaultLoadingItems.invoke(), f0.f322471a);
            case 19:
                t1 disclaimersData = (t1) obj2;
                Intrinsics.checkNotNullParameter(disclaimersData, "disclaimersData");
                Links links = disclaimersData.f318563a;
                hel.b bVar = disclaimersData.f318564b;
                return new p1(u.c(new o0(links, bVar)), bVar);
            case 20:
                n87.k update2 = (n87.k) obj2;
                Intrinsics.checkNotNullParameter(update2, "$this$update");
                return n87.k.a(update2, null, false, null, null, 23);
            case 21:
                ArrayList arrayListP = kii.e.p((Function0) obj2, "it", 10);
                for (int i = 0; i < 10; i++) {
                    arrayListP.add(nb0.b(pb0.Companion, a0.d.n("GM_COLLECTION_ITEM_KEY_", i), false, 0, false, 30));
                }
                yp0.b.k(arrayListP, 0, 0, 0, 0, 31);
                return arrayListP;
            case 22:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                return null;
            case 23:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                return n8f.m.f213378a;
            case 24:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                return f0.f322471a;
            case 25:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                return f0.f322471a;
            case 26:
                n8i.q it18 = (n8i.q) obj2;
                Intrinsics.checkNotNullParameter(it18, "it");
                return (n8i.k) it18.f213461a.getContent();
            case 27:
                n8i.q it19 = (n8i.q) obj2;
                Intrinsics.checkNotNullParameter(it19, "it");
                return (y) it19.f213462b.getContent();
            case 28:
                n8i.q it20 = (n8i.q) obj2;
                Intrinsics.checkNotNullParameter(it20, "it");
                return (n8i.k) it20.f213461a.getContent();
            default:
                n8i.q it21 = (n8i.q) obj2;
                Intrinsics.checkNotNullParameter(it21, "it");
                return (n8i.k) it21.f213461a.getContent();
        }
    }

    public /* synthetic */ c(t tVar) {
        this.f212626a = 21;
    }
}
