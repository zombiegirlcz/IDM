package com.revolut.feature.call_security_info.impl.ui.call_detection;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.Click;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.feature.call_security_info.impl.R$string;
import com.revolut.feature.call_security_info.impl.ui.call_detection.CallDetectionScreen;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import eu2.c;
import eu2.f;
import jii.m;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.jvm.internal.q;
import kotlin.reflect.KProperty;
import te0.w;
import vc.s;
import xki.e;
import yo5.r;
import zhm.u;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/call_security_info/impl/ui/call_detection/CallDetectionScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "", "Ldli/a;", "Leu2/f;", "<init>", "()V", "feature_call_security_info_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class CallDetectionScreen extends ViewController<Object> implements dli.a {
    public static final /* synthetic */ KProperty[] Q = {o0.f186429a.j(new h0(CallDetectionScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarBinding;", 0))};
    public final int K = R$layout.screen_recycler_navbar;
    public final h L = s.t(this, a.f);
    public final RowDelegate M = new RowDelegate(null, null, 7);
    public final Object N;
    public final Object O;
    public final Object P;

    public static final /* synthetic */ class a extends q implements Function1 {
        public static final a f = new a();

        public a() {
            super(1, m.class, "bind", "bind(Landroid/view/View;)Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarBinding;", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj2) {
            View p0 = (View) obj2;
            Intrinsics.checkNotNullParameter(p0, "p0");
            return m.a(p0);
        }
    }

    public CallDetectionScreen() {
        final int i = 0;
        this.N = w.y0(new Function0(this) { // from class: eu2.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CallDetectionScreen f129476b;

            {
                this.f129476b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v22, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                CallDetectionScreen callDetectionScreen = this.f129476b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = CallDetectionScreen.Q;
                        CallDetectionScreen callDetectionScreen2 = this.f129476b;
                        return dli.f.a(callDetectionScreen2, (e) callDetectionScreen2.P.getValue(), u.c(callDetectionScreen2.M), 0, null, null, null, 60);
                    case 1:
                        KProperty[] kPropertyArr2 = CallDetectionScreen.Q;
                        phm.a aVar = (phm.a) ue0.e.j(callDetectionScreen.m2()).a().get(yt2.g.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", yt2.g.class, " is not found"));
                        }
                        yt2.g gVar = ((yt2.g) aVar2.b()).i;
                        yt2.e eVar = new yt2.e();
                        eVar.f316610a = e4m.b.b(new r(gVar, 6));
                        return eVar;
                    default:
                        KProperty[] kPropertyArr3 = CallDetectionScreen.Q;
                        return (e) ((yt2.e) callDetectionScreen.O.getValue()).f316610a.get();
                }
            }
        });
        final int i2 = 1;
        this.O = w.y0(new Function0(this) { // from class: eu2.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CallDetectionScreen f129476b;

            {
                this.f129476b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v22, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                CallDetectionScreen callDetectionScreen = this.f129476b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = CallDetectionScreen.Q;
                        CallDetectionScreen callDetectionScreen2 = this.f129476b;
                        return dli.f.a(callDetectionScreen2, (e) callDetectionScreen2.P.getValue(), u.c(callDetectionScreen2.M), 0, null, null, null, 60);
                    case 1:
                        KProperty[] kPropertyArr2 = CallDetectionScreen.Q;
                        phm.a aVar = (phm.a) ue0.e.j(callDetectionScreen.m2()).a().get(yt2.g.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", yt2.g.class, " is not found"));
                        }
                        yt2.g gVar = ((yt2.g) aVar2.b()).i;
                        yt2.e eVar = new yt2.e();
                        eVar.f316610a = e4m.b.b(new r(gVar, 6));
                        return eVar;
                    default:
                        KProperty[] kPropertyArr3 = CallDetectionScreen.Q;
                        return (e) ((yt2.e) callDetectionScreen.O.getValue()).f316610a.get();
                }
            }
        });
        final int i3 = 2;
        this.P = w.y0(new Function0(this) { // from class: eu2.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CallDetectionScreen f129476b;

            {
                this.f129476b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v22, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                CallDetectionScreen callDetectionScreen = this.f129476b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = CallDetectionScreen.Q;
                        CallDetectionScreen callDetectionScreen2 = this.f129476b;
                        return dli.f.a(callDetectionScreen2, (e) callDetectionScreen2.P.getValue(), u.c(callDetectionScreen2.M), 0, null, null, null, 60);
                    case 1:
                        KProperty[] kPropertyArr2 = CallDetectionScreen.Q;
                        phm.a aVar = (phm.a) ue0.e.j(callDetectionScreen.m2()).a().get(yt2.g.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", yt2.g.class, " is not found"));
                        }
                        yt2.g gVar = ((yt2.g) aVar2.b()).i;
                        yt2.e eVar = new yt2.e();
                        eVar.f316610a = e4m.b.b(new r(gVar, 6));
                        return eVar;
                    default:
                        KProperty[] kPropertyArr3 = CallDetectionScreen.Q;
                        return (e) ((yt2.e) callDetectionScreen.O.getValue()).f316610a.get();
                }
            }
        });
    }

    @Override // cli.w
    public final /* bridge */ void B(o oVar, cli.q qVar) {
        dli.a.z0((f) oVar);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (yt2.e) this.O.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final pki.b R2() {
        return (eu2.e) this.P.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        NavBarWithToolbar navBarWithToolbar = d3().f174539b;
        navBarWithToolbar.setToolbarTitle(new TextLocalisedClause(R$string.in_app_calls_screen_call_detection_title, null, null, 14));
        navBarWithToolbar.setTitle(new TextLocalisedClause(R$string.in_app_calls_screen_call_detection_title, null, null, 14), null);
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(ofm.q.k(q2())));
        navBarWithToolbar.setSecondDescriptionVisible(true);
        navBarWithToolbar.setSecondDescriptionText(new TextLocalisedClause(R$string.in_app_calls_screen_call_detection_subtitle, u.c(new TextLocalisedClause(R$string.in_app_calls_screen_call_detection_learn_more, null, new Click(30, (Integer) null, (Object) null, "CALL_DETECTION_LEARN_MORE_ID", false), 10)), null, 12));
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewController.P2(this, rd0.e.b(d3().f174539b.f59410q), new eu2.b(this, null, 0), 3);
        ViewController.P2(this, rd0.e.b(d3().f174539b.x0()), new eu2.b(this, null, 1), 3);
        RowDelegate rowDelegate = this.M;
        ViewController.P2(this, vkm.q.J(rd0.e.b(rowDelegate.f53225r), rd0.e.b(rowDelegate.f53218h)), new c(this, null), 3);
    }

    public final m d3() {
        ViewBinding value = this.L.getValue(this, Q[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (m) value;
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getM() {
        return this.K;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.N.getValue();
    }
}
