package com.revolut.feature.security_hub.impl.ui.street_mode.security_delay;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import cli.q;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.buttons.TwinVerticalButton;
import com.revolut.feature.security_hub.api.navigation.SecurityDelayInputData;
import com.revolut.feature.security_hub.impl.R$id;
import com.revolut.feature.security_hub.impl.R$layout;
import com.revolut.feature.security_hub.impl.ui.street_mode.security_delay.SecurityDelayScreen;
import com.revolut.kompot.navigable.vc.ViewController;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import rtc.d;
import te0.w;
import tki.c;
import tvc.b;
import tvc.f;
import vc.s;
import vtc.i0;
import xki.e;
import zhm.v;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/security_hub/impl/ui/street_mode/security_delay/SecurityDelayScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lrtc/d;", "Ltki/c;", "Ltvc/f;", "feature_security_hub_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class SecurityDelayScreen extends ViewController<d> implements c {
    public static final /* synthetic */ KProperty[] P = {o0.f186429a.j(new h0(SecurityDelayScreen.class, "binding", "getBinding()Lcom/revolut/feature/security_hub/impl/databinding/ScreenSecurityDelayBinding;", 0))};
    public final int K;
    public final Object L;
    public final h M;
    public final Object N;
    public final Object O;

    public SecurityDelayScreen(SecurityDelayInputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = R$layout.screen_security_delay;
        final int i = 0;
        this.L = w.y0(new Function0(this) { // from class: tvc.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SecurityDelayScreen f274744b;

            {
                this.f274744b = this;
            }

            /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        KProperty[] kPropertyArr = SecurityDelayScreen.P;
                        SecurityDelayScreen securityDelayScreen = this.f274744b;
                        return tki.g.a(securityDelayScreen, (e) securityDelayScreen.O.getValue(), v.k(new RowDelegate(null, null, 7), new RowLoadingDelegate(), new FullScreenStateDelegate()), R$id.securityDelayScreen_recyclerView, null, null, null, 56);
                    default:
                        KProperty[] kPropertyArr2 = SecurityDelayScreen.P;
                        return (e) ((i0) this.f274744b.N.getValue()).f291992c.get();
                }
            }
        });
        this.M = s.t(this, b.f);
        this.N = w.y0(new tml.a(this, inputData, 19));
        final int i2 = 1;
        this.O = w.y0(new Function0(this) { // from class: tvc.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SecurityDelayScreen f274744b;

            {
                this.f274744b = this;
            }

            /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = SecurityDelayScreen.P;
                        SecurityDelayScreen securityDelayScreen = this.f274744b;
                        return tki.g.a(securityDelayScreen, (e) securityDelayScreen.O.getValue(), v.k(new RowDelegate(null, null, 7), new RowLoadingDelegate(), new FullScreenStateDelegate()), R$id.securityDelayScreen_recyclerView, null, null, null, 56);
                    default:
                        KProperty[] kPropertyArr2 = SecurityDelayScreen.P;
                        return (e) ((i0) this.f274744b.N.getValue()).f291992c.get();
                }
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [com.revolut.core.ui_kit.models.Clause, java.lang.Object] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // cli.w
    public final void B(o oVar, q qVar) {
        f uiState = (f) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        dli.a.z0(uiState);
        d3().f283083b.setHeaderModel(uiState.f274748a);
        TwinVerticalButton twinVerticalButton = d3().f283084c;
        twinVerticalButton.setMainButtonEnabled(uiState.f274750c);
        twinVerticalButton.setMainButtonText((Clause) uiState.d);
        Clause clause = uiState.e;
        twinVerticalButton.setSecondaryButtonVisible(clause != null);
        twinVerticalButton.setSecondaryButtonText(clause);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (i0) this.N.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final pki.b d() {
        return (tvc.e) this.O.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        TwinVerticalButton twinVerticalButton = d3().f283084c;
        twinVerticalButton.setMainButtonStyle(LargeActionButton.ButtonStyle.f58725a);
        twinVerticalButton.setSecondaryButtonStyle(LargeActionButton.ButtonStyle.f58726b);
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        Continuation continuation = null;
        ViewController.P2(this, rd0.e.b(d3().f283084c.o0()), new tvc.c(this, continuation, 0), 3);
        ViewController.P2(this, rd0.e.b(d3().f283084c.p0()), new tvc.c(this, continuation, 1), 3);
        ViewController.P2(this, rd0.e.b(d3().f283083b.L), new tvc.c(this, continuation, 2), 3);
    }

    public final utc.d d3() {
        ViewBinding value = this.M.getValue(this, P[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (utc.d) value;
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.K;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (tki.a) this.L.getValue();
    }
}
