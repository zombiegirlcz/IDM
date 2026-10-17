package com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_rev_points_info;

import afj.m2;
import afj.n2;
import aii.q;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import com.revolut.core.ui_kit.delegates.CellDetailsStandaloneNoteDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.retail.feature.esim.impl.R$string;
import com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_rev_points_info.EsimMobilePlanRevPointsInfoScreen;
import jii.f;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import nmj.b;
import nmj.c;
import te0.w;
import vc.s;
import xki.e;
import zhm.u;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/retail/feature/esim/impl/ui/screens/mobile_plan_rev_points_info/EsimMobilePlanRevPointsInfoScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "Ldli/a;", "Lnmj/b;", "<init>", "()V", "feature_retail_esim_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class EsimMobilePlanRevPointsInfoScreen extends ViewController<q> implements dli.a {
    public static final /* synthetic */ KProperty[] P = {o0.f186429a.j(new h0(EsimMobilePlanRevPointsInfoScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenBottomSheetListBinding;", 0))};
    public final int K = R$layout.screen_bottom_sheet_list;
    public final h L = s.t(this, a.f);
    public final Object M;
    public final Object N;
    public final Object O;

    public static final /* synthetic */ class a extends kotlin.jvm.internal.q implements Function1 {
        public static final a f = new a();

        public a() {
            super(1, f.class, "bind", "bind(Landroid/view/View;)Lcom/revolut/kompot/common/databinding/ScreenBottomSheetListBinding;", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj2) {
            View p0 = (View) obj2;
            Intrinsics.checkNotNullParameter(p0, "p0");
            return f.a(p0);
        }
    }

    public EsimMobilePlanRevPointsInfoScreen() {
        final int i = 0;
        this.M = w.y0(new Function0(this) { // from class: nmj.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ EsimMobilePlanRevPointsInfoScreen f217371b;

            {
                this.f217371b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                EsimMobilePlanRevPointsInfoScreen esimMobilePlanRevPointsInfoScreen = this.f217371b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = EsimMobilePlanRevPointsInfoScreen.P;
                        EsimMobilePlanRevPointsInfoScreen esimMobilePlanRevPointsInfoScreen2 = this.f217371b;
                        return dli.f.a(esimMobilePlanRevPointsInfoScreen2, (c) esimMobilePlanRevPointsInfoScreen2.O.getValue(), u.c(new CellDetailsStandaloneNoteDelegate()), R$id.bottomSheetList_recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = EsimMobilePlanRevPointsInfoScreen.P;
                        qji.b bVarU2 = esimMobilePlanRevPointsInfoScreen.U2();
                        if (bVarU2 != null) {
                            return (n2) ((m2) ((omj.a) bVarU2).A().mo3808a(esimMobilePlanRevPointsInfoScreen)).mo3783build();
                        }
                        throw new NullPointerException("null cannot be cast to non-null type com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_rev_points_info.di.EsimMobilePlanRevPointsInfoScreenInjector");
                    default:
                        KProperty[] kPropertyArr3 = EsimMobilePlanRevPointsInfoScreen.P;
                        n2 n2Var = (n2) esimMobilePlanRevPointsInfoScreen.N.getValue();
                        switch (n2Var.f4360a) {
                            case 0:
                                return (c) n2Var.f4362c.get();
                            case 1:
                                return (c) n2Var.f4362c.get();
                            default:
                                return (c) n2Var.f4362c.get();
                        }
                }
            }
        });
        final int i2 = 1;
        this.N = w.y0(new Function0(this) { // from class: nmj.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ EsimMobilePlanRevPointsInfoScreen f217371b;

            {
                this.f217371b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                EsimMobilePlanRevPointsInfoScreen esimMobilePlanRevPointsInfoScreen = this.f217371b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = EsimMobilePlanRevPointsInfoScreen.P;
                        EsimMobilePlanRevPointsInfoScreen esimMobilePlanRevPointsInfoScreen2 = this.f217371b;
                        return dli.f.a(esimMobilePlanRevPointsInfoScreen2, (c) esimMobilePlanRevPointsInfoScreen2.O.getValue(), u.c(new CellDetailsStandaloneNoteDelegate()), R$id.bottomSheetList_recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = EsimMobilePlanRevPointsInfoScreen.P;
                        qji.b bVarU2 = esimMobilePlanRevPointsInfoScreen.U2();
                        if (bVarU2 != null) {
                            return (n2) ((m2) ((omj.a) bVarU2).A().mo3808a(esimMobilePlanRevPointsInfoScreen)).mo3783build();
                        }
                        throw new NullPointerException("null cannot be cast to non-null type com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_rev_points_info.di.EsimMobilePlanRevPointsInfoScreenInjector");
                    default:
                        KProperty[] kPropertyArr3 = EsimMobilePlanRevPointsInfoScreen.P;
                        n2 n2Var = (n2) esimMobilePlanRevPointsInfoScreen.N.getValue();
                        switch (n2Var.f4360a) {
                            case 0:
                                return (c) n2Var.f4362c.get();
                            case 1:
                                return (c) n2Var.f4362c.get();
                            default:
                                return (c) n2Var.f4362c.get();
                        }
                }
            }
        });
        final int i3 = 2;
        this.O = w.y0(new Function0(this) { // from class: nmj.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ EsimMobilePlanRevPointsInfoScreen f217371b;

            {
                this.f217371b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                EsimMobilePlanRevPointsInfoScreen esimMobilePlanRevPointsInfoScreen = this.f217371b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = EsimMobilePlanRevPointsInfoScreen.P;
                        EsimMobilePlanRevPointsInfoScreen esimMobilePlanRevPointsInfoScreen2 = this.f217371b;
                        return dli.f.a(esimMobilePlanRevPointsInfoScreen2, (c) esimMobilePlanRevPointsInfoScreen2.O.getValue(), u.c(new CellDetailsStandaloneNoteDelegate()), R$id.bottomSheetList_recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = EsimMobilePlanRevPointsInfoScreen.P;
                        qji.b bVarU2 = esimMobilePlanRevPointsInfoScreen.U2();
                        if (bVarU2 != null) {
                            return (n2) ((m2) ((omj.a) bVarU2).A().mo3808a(esimMobilePlanRevPointsInfoScreen)).mo3783build();
                        }
                        throw new NullPointerException("null cannot be cast to non-null type com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_rev_points_info.di.EsimMobilePlanRevPointsInfoScreenInjector");
                    default:
                        KProperty[] kPropertyArr3 = EsimMobilePlanRevPointsInfoScreen.P;
                        n2 n2Var = (n2) esimMobilePlanRevPointsInfoScreen.N.getValue();
                        switch (n2Var.f4360a) {
                            case 0:
                                return (c) n2Var.f4362c.get();
                            case 1:
                                return (c) n2Var.f4362c.get();
                            default:
                                return (c) n2Var.f4362c.get();
                        }
                }
            }
        });
    }

    @Override // cli.w
    public final /* bridge */ void B(o oVar, cli.q qVar) {
        dli.a.z0((b) oVar);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (n2) this.N.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final pki.b R2() {
        return (c) this.O.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewBinding value = this.L.getValue(this, P[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        ((f) value).f174519b.setHeaderModel(new lw0.a(new TextLocalisedClause(R$string.esim_mobile_plans_checkout_pay_with_revpoints_title, null, null, 14), null, null, null, false, 30));
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getR() {
        return this.K;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.M.getValue();
    }
}
