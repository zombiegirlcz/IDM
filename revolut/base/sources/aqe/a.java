package aqe;

import akb.s;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.camera.core.Preview;
import androidx.lifecycle.LifecycleOwnerKt;
import arf.l;
import asj.j;
import au0.e4;
import au0.e5;
import au0.h2;
import au0.y3;
import aw.c0;
import aw.j0;
import aw.r;
import aw.w;
import aw0.f4;
import b4g.f0;
import b9d.i;
import com.revolut.core.ui_kit.internal.views.navbar.NavBarContentCenterView;
import com.revolut.core.ui_kit_core.displayers.image.drawables.blockies.BlockiesDrawable;
import com.revolut.core.ui_kit_core.displayers.image.models.CryptoAssetImage;
import com.revolut.feature.apm.bills.pagopa.impl.ui.flow.PagoPAFlow;
import com.revolut.feature.cards_core.api.CardsCoreApi$Toggles;
import com.revolut.feature.insurance_embedded.impl.ui.screen.coverage_list.CoverageListScreen;
import com.revolut.feature.insurance_pet.impl.ui.hub.issues.address_not_supported.AddressNotSupportedActivity;
import com.revolut.feature.insurance_pet.impl.ui.hub.issues.address_not_supported.AddressNotSupportedContract$Configuration;
import com.revolut.feature.rev_points.spare_change.impl.ui.screen.breakdown.RevPointsSpareChangeBreakdownController;
import com.revolut.feature.shared.help_centre.impl.faq.screens.article.FaqArticleScreen;
import com.revolut.feature.shared.help_centre.impl.faq.screens.troubleshooter.cards.troubleshooter.CardTroubleshooterScreen;
import com.revolut.feature.tax_residency.impl.v2.ui.where_to_find_tin.WhereToFindTinBottomSheetScreen;
import com.revolut.feature.trading_orders.api.investment_plan.projection.InvestmentProjectionsContract$InputData;
import com.revolut.feature.transfer.core.impl.ui.transfer.recall.TransferRecallScreen;
import com.revolut.retail.feature.impl.budgeting.ui.rev10.set_budgets.flow.SetBudgetsFlow;
import com.revolut.trading.orders.ui.flows.investment_plan.projection.InvestmentProjectionsFlowViewController;
import efm.k;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlin.reflect.KProperty;
import kotlin.text.d0;
import lk0.g;
import skm.e0;
import tq1.h;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class a implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8418a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f8419b;

    public /* synthetic */ a(Object obj2, int i) {
        this.f8418a = i;
        this.f8419b = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v101, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v19, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v25, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v36, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v54, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v84, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v94, types: [java.lang.Object, kotlin.Lazy] */
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        kw.d dVar;
        int i = this.f8418a;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        Object obj2 = this.f8419b;
        switch (i) {
            case 0:
                return new f(new e(((WhereToFindTinBottomSheetScreen) obj2).Q));
            case 1:
                return (ar1.a) ((h) ((br1.a) ((PagoPAFlow) obj2).P.getValue())).e.get();
            case 2:
                ar2.c cVar = (ar2.c) obj2;
                return cVar.d.a(ar2.e.c(cVar.f8504a));
            case 3:
                return ((com.revolut.feature.spending_analytics.impl.ui.rev10.select.a) obj2).D;
            case 4:
                g gVar = ((com.revolut.feature.spending_analytics.impl.ui.rev10.select.a) ((a) obj2).f8419b).D;
                if (gVar != null) {
                    return k.g(gVar);
                }
                rfm.h hVar = rfm.h.f253943a;
                Intrinsics.checkNotNullExpressionValue(hVar, "empty(...)");
                return hVar;
            case 5:
                KProperty[] kPropertyArr = TransferRecallScreen.f92225b0;
                return (l) ((lpf.k) ((TransferRecallScreen) obj2).Z.getValue()).i.get();
            case 6:
                return (j) ((erj.k) ((SetBudgetsFlow) obj2).P.getValue()).d.get();
            case 7:
                int i2 = at0.a.f;
                ViewParent parent = ((at0.a) obj2).getParent();
                ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
                return Boolean.valueOf((viewGroup == null || viewGroup.getClipChildren()) ? false : true);
            case 8:
                return new com.revolut.trading.orders.ui.flows.investment_plan.projection.a((InvestmentProjectionsContract$InputData) obj2);
            case 9:
                InvestmentProjectionsFlowViewController investmentProjectionsFlowViewController = (InvestmentProjectionsFlowViewController) obj2;
                return czi.c.d(0, 6, null, investmentProjectionsFlowViewController, (com.revolut.trading.orders.ui.flows.investment_plan.projection.a) investmentProjectionsFlowViewController.L.getValue());
            case 10:
                return Float.valueOf(((h2) obj2).f9221c);
            case 11:
                ihm.f fVar = ((NavBarContentCenterView) obj2).z;
                Unit unit = Unit.f186387a;
                fVar.onNext(unit);
                return unit;
            case 12:
                ((at4.b) obj2).invoke();
                return Unit.f186387a;
            case 13:
                return Float.valueOf(((y3) obj2).e);
            case 14:
                return Float.valueOf(((Number) ((e4) obj2).f9179b.invoke()).floatValue());
            case 15:
                return wr0.a.a(((e5) obj2).f9186a);
            case 16:
                KProperty[] kPropertyArr2 = CoverageListScreen.f76084d0;
                return (av7.h) ((lu7.g) ((CoverageListScreen) obj2).X.getValue()).f200099c.get();
            case 17:
                aw.k kVar = (aw.k) obj2;
                e0.C(LifecycleOwnerKt.getLifecycleScope(kVar.f10176a), null, null, new s(kVar, objArr == true ? 1 : 0, 22), 3);
                return Unit.f186387a;
            case 18:
                r rVar = (r) obj2;
                e0.C(LifecycleOwnerKt.getLifecycleScope(rVar.f10198a), null, null, new s(rVar, objArr2 == true ? 1 : 0, 23), 3);
                return Unit.f186387a;
            case 19:
                Preview previewBuild = new Preview.Builder().build();
                previewBuild.setSurfaceProvider(((w) obj2).f10215a.getSurfaceProvider());
                return previewBuild;
            case 20:
                c0 c0Var = (c0) ((j0) obj2).f.get();
                if (c0Var == null || (dVar = c0Var.f10144b) == null) {
                    return null;
                }
                return dVar;
            case 21:
                return Boolean.valueOf(((jte.d) ((ay2.s) obj2).f11055a).c(CardsCoreApi$Toggles.CardPricingIncludingTaxes.f65560c));
            case 22:
                ((az.k) obj2).f11285s.getClass();
                return uy.a.a();
            case 23:
                cz0.a aVar = cz0.c.Companion;
                String seed = ((CryptoAssetImage) obj2).f59909b;
                aVar.getClass();
                Intrinsics.checkNotNullParameter(seed, "seed");
                long[] jArr = new long[4];
                vim.f it8 = d0.O(seed).iterator();
                while (it8.f289625c) {
                    int iNextInt = it8.nextInt();
                    int i3 = iNextInt % 4;
                    long j2 = jArr[i3];
                    long j3 = j2 << 5;
                    if (j3 > -2 || j3 < 0) {
                        j3 = (int) j3;
                    }
                    jArr[i3] = (j3 - j2) + ((long) Character.codePointAt(seed, iNextInt));
                }
                Intrinsics.checkNotNullParameter(jArr, "<this>");
                Intrinsics.checkNotNullParameter(jArr, "<this>");
                vim.f it9 = new IntRange(0, 3, 1).iterator();
                while (it9.f289625c) {
                    jArr[it9.nextInt()] = (int) jArr[r3];
                }
                int iB = cz0.a.a(jArr).b();
                int iB2 = cz0.a.a(jArr).b();
                int iB3 = cz0.a.a(jArr).b();
                double[] dArr = new double[64];
                vim.f it10 = kotlin.ranges.f.o(0, 8).iterator();
                while (it10.f289625c) {
                    int iNextInt2 = it10.nextInt();
                    vim.f it11 = kotlin.ranges.f.o(0, 4).iterator();
                    while (it11.f289625c) {
                        int iNextInt3 = it11.nextInt();
                        cz0.c.Companion.getClass();
                        double dFloor = Math.floor(cz0.a.b(jArr) * 2.3d);
                        dArr[(iNextInt2 * 8) + iNextInt3] = dFloor;
                        dArr[(((iNextInt2 + 1) * 8) - iNextInt3) - 1] = dFloor;
                    }
                }
                return new BlockiesDrawable(new cz0.c(iB, iB2, iB3, dArr));
            case 24:
                int i5 = AddressNotSupportedActivity.f76318w0;
                return ((AddressNotSupportedContract$Configuration) ((AddressNotSupportedActivity) obj2).G0()).f76322a;
            case 25:
                int i6 = RevPointsSpareChangeBreakdownController.V;
                return (b2c.b) ((w1c.b) ((RevPointsSpareChangeBreakdownController) obj2).S.getValue()).f293823b.get();
            case 26:
                com.revolut.feature_move_money.impl.amount.c cVar2 = (com.revolut.feature_move_money.impl.amount.c) obj2;
                cVar2.f97293y.b(new f4(c8g.c.h(cVar2.Q2().f12784b), true));
                cVar2.H2(cVar2.Y, new f0(19));
                return Unit.f186387a;
            case 27:
                KProperty[] kPropertyArr3 = FaqArticleScreen.m0;
                return (b8d.s) ((r7d.f) ((FaqArticleScreen) obj2).Z.getValue()).k.get();
            case 28:
                KProperty[] kPropertyArr4 = CardTroubleshooterScreen.f86318e0;
                return (i) ((r7d.c) ((CardTroubleshooterScreen) obj2).c0.getValue()).f252103c.get();
            default:
                bb6.d dVar2 = (bb6.d) obj2;
                Integer num = dVar2.f14174b;
                if (num != null) {
                    View viewFindViewById = dVar2.f14173a.D2().findViewById(num.intValue());
                    if (viewFindViewById != null) {
                        Intrinsics.checkNotNullParameter(viewFindViewById, "<this>");
                        viewFindViewById.requestFocus();
                        if (!viewFindViewById.hasWindowFocus()) {
                            viewFindViewById.getViewTreeObserver().addOnWindowFocusChangeListener(new bb6.c(viewFindViewById));
                        } else if (viewFindViewById.isFocused()) {
                            viewFindViewById.post(new bb6.b(viewFindViewById, 0));
                        }
                    }
                }
                return Unit.f186387a;
        }
    }
}
