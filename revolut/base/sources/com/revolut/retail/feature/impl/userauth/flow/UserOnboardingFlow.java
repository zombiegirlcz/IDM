package com.revolut.retail.feature.impl.userauth.flow;

import a82.v;
import android.app.Activity;
import android.content.Intent;
import android.view.View;
import androidx.core.util.Consumer;
import androidx.view.ComponentActivity;
import androidx.viewbinding.ViewBinding;
import ao.h;
import bjl.r0;
import bjl.s0;
import com.revolut.core.ui_kit.R$style;
import com.revolut.core.ui_kit.background.AnimatedBackgroundType;
import com.revolut.core.ui_kit.background.StatefulAnimatedBackground;
import com.revolut.kompot.R$id;
import com.revolut.kompot.bridge.navigation.BridgeDestination;
import com.revolut.kompot.bridge.navigation.KompotDestination;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.kompot.view.ControllerContainerFrameLayout;
import com.revolut.retail.core.navigation.CollapseApplicationCommand;
import com.revolut.retail.core.ui.activity.BaseDelegatesActivity;
import com.revolut.retail.core.ui.activity.CustomTheme;
import com.revolut.retail.feature.impl.userauth.flow.UserOnboardingFlow;
import com.revolut.retail.feature.impl.userauth.flow.UserOnboardingFlowContract$InputData;
import com.revolut.retail.feature.impl.userauth.flow.UserOnboardingFlowContract$Step;
import com.revolut.retail.feature.impl.userauth.flow.UserOnboardingFlowDestination;
import com.revolut.retail.feature.impl.userauth.screen.revolut_sso.SsoDeeplinkDataConfiguration$DeeplinkData;
import com.revolut.retail.feature.impl.userauth.shared.UserAuthUseCase;
import ik3.g;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import kji.k;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import ljl.q0;
import te0.w;
import vc.s;
import yki.i;
import zhm.y0;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\b\u0012\u0004\u0012\u00020\u00050\u0004¨\u0006\u0006"}, d2 = {"Lcom/revolut/retail/feature/impl/userauth/flow/UserOnboardingFlow;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "", "Luki/c;", "Landroidx/core/util/Consumer;", "Landroid/content/Intent;", "feature_user_auth_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class UserOnboardingFlow extends ViewController<Object> implements uki.c, Consumer<Intent> {
    public static final /* synthetic */ KProperty[] T = {o0.f186429a.j(new h0(UserOnboardingFlow.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/FlowStatefulAnimatedBackgroundBinding;", 0))};
    public final UserOnboardingFlowContract$InputData K;
    public final int L;
    public final h M;
    public final boolean N;
    public final Integer O;
    public final Object P;
    public final Object Q;
    public final Object R;
    public final Object S;

    public UserOnboardingFlow(UserOnboardingFlowContract$InputData inputData) {
        boolean z;
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = R$layout.flow_stateful_animated_background;
        this.M = s.t(this, cwj.c.f);
        UserAuthUseCase userAuthUseCase = inputData.f101652a;
        if (userAuthUseCase instanceof UserAuthUseCase.ForgotPasscode) {
            z = false;
        } else {
            if (!(userAuthUseCase instanceof UserAuthUseCase.SignIn) && !(userAuthUseCase instanceof UserAuthUseCase.SignUp) && !(userAuthUseCase instanceof UserAuthUseCase.CombinedAuthentication) && !(userAuthUseCase instanceof UserAuthUseCase.PersonalisedGraduationSignUp) && userAuthUseCase != null) {
                throw new NoWhenBranchMatchedException();
            }
            z = true;
        }
        this.N = z;
        this.O = z ? Integer.valueOf(R$style.UiKitTheme_TransparentCompat) : null;
        final int i = 0;
        this.P = w.y0(new Function0(this) { // from class: cwj.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ UserOnboardingFlow f109833b;

            {
                this.f109833b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                UserOnboardingFlow userOnboardingFlow = this.f109833b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = UserOnboardingFlow.T;
                        phm.a aVar = (phm.a) ue0.e.j(userOnboardingFlow.m2()).a().get(ewj.c.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", ewj.c.class, " is not found"));
                        }
                        ewj.c cVar = ((ewj.c) aVar2.b()).f130315s;
                        UserOnboardingFlowContract$InputData userOnboardingFlowContract$InputData = userOnboardingFlow.K;
                        userOnboardingFlowContract$InputData.getClass();
                        return new ewj.d(cVar, userOnboardingFlowContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = UserOnboardingFlow.T;
                        return czi.c.a(R$id.container, (e) userOnboardingFlow.R.getValue(), userOnboardingFlow);
                    case 2:
                        KProperty[] kPropertyArr3 = UserOnboardingFlow.T;
                        return (e) userOnboardingFlow.R1().d.get();
                    default:
                        UserOnboardingFlow userOnboardingFlow2 = this.f109833b;
                        ao.h hVar = userOnboardingFlow2.M;
                        if (!userOnboardingFlow2.N) {
                            return zhm.h0.f322473a;
                        }
                        KProperty[] kPropertyArr4 = UserOnboardingFlow.T;
                        ViewBinding value = hVar.getValue(userOnboardingFlow2, kPropertyArr4[0]);
                        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
                        StatefulAnimatedBackground background = ((jii.d) value).f174507b;
                        Intrinsics.checkNotNullExpressionValue(background, "background");
                        ViewBinding value2 = hVar.getValue(userOnboardingFlow2, kPropertyArr4[0]);
                        Intrinsics.checkNotNullExpressionValue(value2, "getValue(...)");
                        ControllerContainerFrameLayout container = ((jii.d) value2).f174508c;
                        Intrinsics.checkNotNullExpressionValue(container, "container");
                        a aVar3 = (a) userOnboardingFlow2.R1().f130317b.f130303a.P.get();
                        s.j(aVar3);
                        fk3.b bVarB = userOnboardingFlow2.R1().f130317b.d.b();
                        s.j(bVarB);
                        boolean z3 = ((ik3.g) bVarB).f161888g.b().H1;
                        lll.a aVar4 = (lll.a) ((q0) userOnboardingFlow2.R1().f130317b.f).f196080v0.get();
                        s.j(aVar4);
                        return y0.b(new g99.h(userOnboardingFlow2, background, container, aVar3, z3, new g99.i(new v(vkm.q.h(aVar4.f196828a), 2))));
                }
            }
        });
        final int i2 = 1;
        this.Q = w.y0(new Function0(this) { // from class: cwj.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ UserOnboardingFlow f109833b;

            {
                this.f109833b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                UserOnboardingFlow userOnboardingFlow = this.f109833b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = UserOnboardingFlow.T;
                        phm.a aVar = (phm.a) ue0.e.j(userOnboardingFlow.m2()).a().get(ewj.c.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", ewj.c.class, " is not found"));
                        }
                        ewj.c cVar = ((ewj.c) aVar2.b()).f130315s;
                        UserOnboardingFlowContract$InputData userOnboardingFlowContract$InputData = userOnboardingFlow.K;
                        userOnboardingFlowContract$InputData.getClass();
                        return new ewj.d(cVar, userOnboardingFlowContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = UserOnboardingFlow.T;
                        return czi.c.a(R$id.container, (e) userOnboardingFlow.R.getValue(), userOnboardingFlow);
                    case 2:
                        KProperty[] kPropertyArr3 = UserOnboardingFlow.T;
                        return (e) userOnboardingFlow.R1().d.get();
                    default:
                        UserOnboardingFlow userOnboardingFlow2 = this.f109833b;
                        ao.h hVar = userOnboardingFlow2.M;
                        if (!userOnboardingFlow2.N) {
                            return zhm.h0.f322473a;
                        }
                        KProperty[] kPropertyArr4 = UserOnboardingFlow.T;
                        ViewBinding value = hVar.getValue(userOnboardingFlow2, kPropertyArr4[0]);
                        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
                        StatefulAnimatedBackground background = ((jii.d) value).f174507b;
                        Intrinsics.checkNotNullExpressionValue(background, "background");
                        ViewBinding value2 = hVar.getValue(userOnboardingFlow2, kPropertyArr4[0]);
                        Intrinsics.checkNotNullExpressionValue(value2, "getValue(...)");
                        ControllerContainerFrameLayout container = ((jii.d) value2).f174508c;
                        Intrinsics.checkNotNullExpressionValue(container, "container");
                        a aVar3 = (a) userOnboardingFlow2.R1().f130317b.f130303a.P.get();
                        s.j(aVar3);
                        fk3.b bVarB = userOnboardingFlow2.R1().f130317b.d.b();
                        s.j(bVarB);
                        boolean z3 = ((ik3.g) bVarB).f161888g.b().H1;
                        lll.a aVar4 = (lll.a) ((q0) userOnboardingFlow2.R1().f130317b.f).f196080v0.get();
                        s.j(aVar4);
                        return y0.b(new g99.h(userOnboardingFlow2, background, container, aVar3, z3, new g99.i(new v(vkm.q.h(aVar4.f196828a), 2))));
                }
            }
        });
        final int i3 = 2;
        this.R = w.y0(new Function0(this) { // from class: cwj.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ UserOnboardingFlow f109833b;

            {
                this.f109833b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                UserOnboardingFlow userOnboardingFlow = this.f109833b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = UserOnboardingFlow.T;
                        phm.a aVar = (phm.a) ue0.e.j(userOnboardingFlow.m2()).a().get(ewj.c.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", ewj.c.class, " is not found"));
                        }
                        ewj.c cVar = ((ewj.c) aVar2.b()).f130315s;
                        UserOnboardingFlowContract$InputData userOnboardingFlowContract$InputData = userOnboardingFlow.K;
                        userOnboardingFlowContract$InputData.getClass();
                        return new ewj.d(cVar, userOnboardingFlowContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = UserOnboardingFlow.T;
                        return czi.c.a(R$id.container, (e) userOnboardingFlow.R.getValue(), userOnboardingFlow);
                    case 2:
                        KProperty[] kPropertyArr3 = UserOnboardingFlow.T;
                        return (e) userOnboardingFlow.R1().d.get();
                    default:
                        UserOnboardingFlow userOnboardingFlow2 = this.f109833b;
                        ao.h hVar = userOnboardingFlow2.M;
                        if (!userOnboardingFlow2.N) {
                            return zhm.h0.f322473a;
                        }
                        KProperty[] kPropertyArr4 = UserOnboardingFlow.T;
                        ViewBinding value = hVar.getValue(userOnboardingFlow2, kPropertyArr4[0]);
                        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
                        StatefulAnimatedBackground background = ((jii.d) value).f174507b;
                        Intrinsics.checkNotNullExpressionValue(background, "background");
                        ViewBinding value2 = hVar.getValue(userOnboardingFlow2, kPropertyArr4[0]);
                        Intrinsics.checkNotNullExpressionValue(value2, "getValue(...)");
                        ControllerContainerFrameLayout container = ((jii.d) value2).f174508c;
                        Intrinsics.checkNotNullExpressionValue(container, "container");
                        a aVar3 = (a) userOnboardingFlow2.R1().f130317b.f130303a.P.get();
                        s.j(aVar3);
                        fk3.b bVarB = userOnboardingFlow2.R1().f130317b.d.b();
                        s.j(bVarB);
                        boolean z3 = ((ik3.g) bVarB).f161888g.b().H1;
                        lll.a aVar4 = (lll.a) ((q0) userOnboardingFlow2.R1().f130317b.f).f196080v0.get();
                        s.j(aVar4);
                        return y0.b(new g99.h(userOnboardingFlow2, background, container, aVar3, z3, new g99.i(new v(vkm.q.h(aVar4.f196828a), 2))));
                }
            }
        });
        final int i5 = 3;
        this.S = w.y0(new Function0(this) { // from class: cwj.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ UserOnboardingFlow f109833b;

            {
                this.f109833b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i5;
                UserOnboardingFlow userOnboardingFlow = this.f109833b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = UserOnboardingFlow.T;
                        phm.a aVar = (phm.a) ue0.e.j(userOnboardingFlow.m2()).a().get(ewj.c.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", ewj.c.class, " is not found"));
                        }
                        ewj.c cVar = ((ewj.c) aVar2.b()).f130315s;
                        UserOnboardingFlowContract$InputData userOnboardingFlowContract$InputData = userOnboardingFlow.K;
                        userOnboardingFlowContract$InputData.getClass();
                        return new ewj.d(cVar, userOnboardingFlowContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = UserOnboardingFlow.T;
                        return czi.c.a(R$id.container, (e) userOnboardingFlow.R.getValue(), userOnboardingFlow);
                    case 2:
                        KProperty[] kPropertyArr3 = UserOnboardingFlow.T;
                        return (e) userOnboardingFlow.R1().d.get();
                    default:
                        UserOnboardingFlow userOnboardingFlow2 = this.f109833b;
                        ao.h hVar = userOnboardingFlow2.M;
                        if (!userOnboardingFlow2.N) {
                            return zhm.h0.f322473a;
                        }
                        KProperty[] kPropertyArr4 = UserOnboardingFlow.T;
                        ViewBinding value = hVar.getValue(userOnboardingFlow2, kPropertyArr4[0]);
                        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
                        StatefulAnimatedBackground background = ((jii.d) value).f174507b;
                        Intrinsics.checkNotNullExpressionValue(background, "background");
                        ViewBinding value2 = hVar.getValue(userOnboardingFlow2, kPropertyArr4[0]);
                        Intrinsics.checkNotNullExpressionValue(value2, "getValue(...)");
                        ControllerContainerFrameLayout container = ((jii.d) value2).f174508c;
                        Intrinsics.checkNotNullExpressionValue(container, "container");
                        a aVar3 = (a) userOnboardingFlow2.R1().f130317b.f130303a.P.get();
                        s.j(aVar3);
                        fk3.b bVarB = userOnboardingFlow2.R1().f130317b.d.b();
                        s.j(bVarB);
                        boolean z3 = ((ik3.g) bVarB).f161888g.b().H1;
                        lll.a aVar4 = (lll.a) ((q0) userOnboardingFlow2.R1().f130317b.f).f196080v0.get();
                        s.j(aVar4);
                        return y0.b(new g99.h(userOnboardingFlow2, background, container, aVar3, z3, new g99.i(new v(vkm.q.h(aVar4.f196828a), 2))));
                }
            }
        });
    }

    @Override // com.revolut.kompot.navigable.a
    /* JADX INFO: renamed from: A2, reason: from getter */
    public final Integer getO() {
        return this.O;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController, com.revolut.kompot.navigable.a
    public final boolean F2() {
        if (super.F2()) {
            return true;
        }
        f fVar = (f) ((cwj.e) this.R.getValue());
        if (fVar.M.d() instanceof UserOnboardingFlowContract$Step.Authentication) {
            return false;
        }
        fVar.C1(new BridgeDestination(CollapseApplicationCommand.f98628a));
        return true;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final pki.b d() {
        return (cwj.e) this.R.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        Activity activityM2 = m2();
        Intrinsics.i(activityM2, "null cannot be cast to non-null type androidx.activity.ComponentActivity");
        ((ComponentActivity) activityM2).addOnNewIntentListener(this);
        if (this.N) {
            k.Companion.getClass();
            Intrinsics.checkNotNullParameter(this, "controller");
            this.F.addObserver(new esi.c(this));
            Activity activityM22 = m2();
            if (!(activityM22 instanceof BaseDelegatesActivity)) {
                IllegalStateException illegalStateException = new IllegalStateException("Onboarding: cannot apply transparent theme flag, expected hosting Activity to be BaseDelegatesActivity");
                zhm.h0 h0Var = zhm.h0.f322473a;
                CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                rd0.d.a(rd0.c.ERROR, null, null, illegalStateException, h0Var);
                return;
            }
            fk3.b bVarB = R1().f130317b.d.b();
            s.j(bVarB);
            AnimatedBackgroundType animatedBackgroundType = ((g) bVarB).f161888g.b().H1 ? AnimatedBackgroundType.ONBOARDING.f51478a : AnimatedBackgroundType.DEFAULT.f51471a;
            CustomTheme.INSTANCE.getClass();
            ((BaseDelegatesActivity) activityM22).T0(CustomTheme.Companion.a(animatedBackgroundType), false);
        }
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Z2() {
        Activity activityM2 = m2();
        Intrinsics.i(activityM2, "null cannot be cast to non-null type androidx.activity.ComponentActivity");
        ((ComponentActivity) activityM2).removeOnNewIntentListener(this);
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.Lazy] */
    @Override // androidx.core.util.Consumer
    public final void accept(Intent intent) {
        Intent intent2 = intent;
        Intrinsics.checkNotNullParameter(intent2, "intent");
        KompotDestination kompotDestination = (KompotDestination) intent2.getParcelableExtra("intent_kompot_destination_key");
        if (kompotDestination instanceof cwj.f) {
            cwj.f destination = (cwj.f) kompotDestination;
            f fVar = (f) ((cwj.e) this.R.getValue());
            i iVar = fVar.M;
            Intrinsics.checkNotNullParameter(destination, "destination");
            if (destination instanceof UserOnboardingFlowDestination.SsoEmailOtpAuthentication) {
                bjl.f fVar2 = fVar.f101679t;
                String otpCode = ((UserOnboardingFlowDestination.SsoEmailOtpAuthentication) destination).f101668b;
                xjl.e eVar = (xjl.e) fVar2;
                eVar.getClass();
                Intrinsics.checkNotNullParameter(otpCode, "otpCode");
                eVar.f306554a.a(otpCode);
                return;
            }
            if (destination instanceof UserOnboardingFlowDestination.SsoDeeplinkAuthentication) {
                SsoDeeplinkDataConfiguration$DeeplinkData ssoDeeplinkDataConfiguration$DeeplinkData = ((UserOnboardingFlowDestination.SsoDeeplinkAuthentication) destination).f101666b;
                fkl.i iVar2 = fVar.u;
                if (ssoDeeplinkDataConfiguration$DeeplinkData instanceof SsoDeeplinkDataConfiguration$DeeplinkData.BankId) {
                    r0 result = new r0(((SsoDeeplinkDataConfiguration$DeeplinkData.BankId) ssoDeeplinkDataConfiguration$DeeplinkData).f101705a);
                    iVar2.getClass();
                    Intrinsics.checkNotNullParameter(result, "result");
                    iVar2.f135870a.k(result);
                    return;
                }
                if (!(ssoDeeplinkDataConfiguration$DeeplinkData instanceof SsoDeeplinkDataConfiguration$DeeplinkData.DAP)) {
                    throw new NoWhenBranchMatchedException();
                }
                s0 result2 = new s0(((SsoDeeplinkDataConfiguration$DeeplinkData.DAP) ssoDeeplinkDataConfiguration$DeeplinkData).f101706a);
                iVar2.getClass();
                Intrinsics.checkNotNullParameter(result2, "result");
                iVar2.f135870a.k(result2);
                return;
            }
            if (!(destination instanceof UserOnboardingFlowDestination.UserOnboarding)) {
                throw new NoWhenBranchMatchedException();
            }
            UserAuthUseCase userAuthUseCase = ((UserOnboardingFlowDestination.UserOnboarding) destination).f101669a;
            if (userAuthUseCase instanceof UserAuthUseCase.SignIn) {
                oki.h.r2(iVar);
                oki.h.t2(fVar, iVar, new UserOnboardingFlowContract$Step.Authentication(userAuthUseCase), false, null, false, 12);
            } else {
                if (!(userAuthUseCase instanceof UserAuthUseCase.CombinedAuthentication) && !(userAuthUseCase instanceof UserAuthUseCase.ForgotPasscode) && !(userAuthUseCase instanceof UserAuthUseCase.PersonalisedGraduationSignUp) && !(userAuthUseCase instanceof UserAuthUseCase.SignUp)) {
                    throw new NoWhenBranchMatchedException();
                }
                IllegalStateException illegalStateException = new IllegalStateException(userAuthUseCase.getClass().getName().concat(" use case is not supported. Make sure it's expected"));
                zhm.h0 h0Var = zhm.h0.f322473a;
                CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                rd0.d.a(rd0.c.ERROR, null, null, illegalStateException, h0Var);
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController, qji.c
    /* JADX INFO: renamed from: d3, reason: merged with bridge method [inline-methods] */
    public final ewj.d R1() {
        return (ewj.d) this.P.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getV() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (uki.a) this.Q.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController, com.revolut.kompot.navigable.a
    public final Set o2() {
        return (Set) this.S.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final yki.c k() {
        return (uki.a) this.Q.getValue();
    }
}
