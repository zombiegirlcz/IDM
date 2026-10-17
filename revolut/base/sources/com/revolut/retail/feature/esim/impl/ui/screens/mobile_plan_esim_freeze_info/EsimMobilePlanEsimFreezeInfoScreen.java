package com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_esim_freeze_info;

import a0.d;
import afj.v;
import aii.q;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.k;
import com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController;
import com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_esim_freeze_info.EsimMobilePlanEsimFreezeInfoScreen;
import java.util.List;
import jii.e;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import m72.b;
import te0.w;
import vc.s;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/retail/feature/esim/impl/ui/screens/mobile_plan_esim_freeze_info/EsimMobilePlanEsimFreezeInfoScreen;", "Lcom/revolut/kompot/common/bottom_sheet/BaseBottomSheetRecyclerController;", "Laii/q;", "Lcli/k;", "<init>", "()V", "feature_retail_esim_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class EsimMobilePlanEsimFreezeInfoScreen extends BaseBottomSheetRecyclerController<q, k> {
    public static final /* synthetic */ KProperty[] U = {o0.f186429a.j(new h0(EsimMobilePlanEsimFreezeInfoScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenBottomSheetBaseBinding;", 0))};
    public final h Q = s.t(this, a.f);
    public final List R = b.v(null, null, 7);
    public final Object S;
    public final Object T;

    public static final /* synthetic */ class a extends kotlin.jvm.internal.q implements Function1 {
        public static final a f = new a();

        public a() {
            super(1, e.class, "bind", "bind(Landroid/view/View;)Lcom/revolut/kompot/common/databinding/ScreenBottomSheetBaseBinding;", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj2) {
            View p0 = (View) obj2;
            Intrinsics.checkNotNullParameter(p0, "p0");
            return e.a(p0);
        }
    }

    public EsimMobilePlanEsimFreezeInfoScreen() {
        final int i = 0;
        this.S = w.y0(new Function0(this) { // from class: zjj.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ EsimMobilePlanEsimFreezeInfoScreen f322872b;

            {
                this.f322872b = this;
            }

            /* JADX WARN: Type inference failed for: r0v17, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                EsimMobilePlanEsimFreezeInfoScreen esimMobilePlanEsimFreezeInfoScreen = this.f322872b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = EsimMobilePlanEsimFreezeInfoScreen.U;
                        phm.a aVar = (phm.a) ue0.e.j(esimMobilePlanEsimFreezeInfoScreen.m2()).a().get(afj.b.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(d.q("Api ", afj.b.class, " is not found"));
                        }
                        afj.b bVar = ((afj.b) aVar2.b()).D;
                        v vVar = new v();
                        vVar.f4489a = e4m.b.b(new a1e.a(vVar, 1, 5));
                        vVar.f4490b = e4m.b.b(new a1e.a(vVar, 0, 5));
                        return vVar;
                    default:
                        KProperty[] kPropertyArr2 = EsimMobilePlanEsimFreezeInfoScreen.U;
                        return (b) ((v) esimMobilePlanEsimFreezeInfoScreen.S.getValue()).f4490b.get();
                }
            }
        });
        final int i2 = 1;
        this.T = w.y0(new Function0(this) { // from class: zjj.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ EsimMobilePlanEsimFreezeInfoScreen f322872b;

            {
                this.f322872b = this;
            }

            /* JADX WARN: Type inference failed for: r0v17, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                EsimMobilePlanEsimFreezeInfoScreen esimMobilePlanEsimFreezeInfoScreen = this.f322872b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = EsimMobilePlanEsimFreezeInfoScreen.U;
                        phm.a aVar = (phm.a) ue0.e.j(esimMobilePlanEsimFreezeInfoScreen.m2()).a().get(afj.b.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(d.q("Api ", afj.b.class, " is not found"));
                        }
                        afj.b bVar = ((afj.b) aVar2.b()).D;
                        v vVar = new v();
                        vVar.f4489a = e4m.b.b(new a1e.a(vVar, 1, 5));
                        vVar.f4490b = e4m.b.b(new a1e.a(vVar, 0, 5));
                        return vVar;
                    default:
                        KProperty[] kPropertyArr2 = EsimMobilePlanEsimFreezeInfoScreen.U;
                        return (b) ((v) esimMobilePlanEsimFreezeInfoScreen.S.getValue()).f4490b.get();
                }
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (v) this.S.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController, com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final pki.b d() {
        return (zjj.b) this.T.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewBinding value = this.Q.getValue(this, U[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((e) value).f174513b.f), null, new z3f.b(this, null, 18), 3);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController
    /* JADX INFO: renamed from: k3 */
    public final dli.b R2() {
        return (zjj.b) this.T.getValue();
    }

    @Override // com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController
    /* JADX INFO: renamed from: l3, reason: from getter */
    public final List getQ() {
        return this.R;
    }
}
