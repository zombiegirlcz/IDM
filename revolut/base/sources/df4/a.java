package df4;

import androidx.lifecycle.LifecycleOwnerKt;
import com.revolut.core.ui_kit.views.navbar.NavBarLargeCentred;
import com.revolut.feature.credit.application.plugins.impl.ui.offer.animated_intro.AnimatedIntroScreen;
import com.revolut.feature.credit.application.plugins.impl.ui.offer.animated_intro.AnimatedIntroScreenContract$InputData;
import dee.x;
import dw3.s8;
import dw3.t8;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import skm.e0;
import vkm.j2;

/* JADX INFO: loaded from: classes22.dex */
public final /* synthetic */ class a implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f113779a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AnimatedIntroScreen f113780b;

    public /* synthetic */ a(AnimatedIntroScreen animatedIntroScreen, int i) {
        this.f113779a = i;
        this.f113780b = animatedIntroScreen;
    }

    /* JADX WARN: Type inference failed for: r0v17, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v30, types: [java.lang.Object, kotlin.Lazy] */
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.f113779a;
        AnimatedIntroScreen animatedIntroScreen = this.f113780b;
        switch (i) {
            case 0:
                KProperty[] kPropertyArr = AnimatedIntroScreen.T;
                ?? r06 = animatedIntroScreen.Q;
                if (!((d) ((j2) ((g) ((e) r06.getValue())).f113786q.f22677a).getValue()).f113781a) {
                    g gVar = (g) ((e) r06.getValue());
                    gVar.H2(gVar.f113786q, new x(2));
                    i iVar = animatedIntroScreen.M;
                    NavBarLargeCentred navBarLargeCentredE3 = animatedIntroScreen.e3();
                    a aVar = new a(animatedIntroScreen, 4);
                    iVar.getClass();
                    i.c(navBarLargeCentredE3, aVar);
                }
                return Unit.f186387a;
            case 1:
                KProperty[] kPropertyArr2 = AnimatedIntroScreen.T;
                qji.b bVarU2 = animatedIntroScreen.U2();
                Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.credit.application.plugins.impl.ui.offer.animated_intro.di.AnimatedIntroScreenInjector");
                s8 s8Var = (s8) ((ef4.a) bVarU2).c().mo3808a(animatedIntroScreen);
                AnimatedIntroScreenContract$InputData animatedIntroScreenContract$InputData = animatedIntroScreen.L;
                switch (s8Var.f119790a) {
                    case 0:
                        animatedIntroScreenContract$InputData.getClass();
                        s8Var.d = animatedIntroScreenContract$InputData;
                        break;
                    case 1:
                        animatedIntroScreenContract$InputData.getClass();
                        s8Var.d = animatedIntroScreenContract$InputData;
                        break;
                    default:
                        animatedIntroScreenContract$InputData.getClass();
                        s8Var.d = animatedIntroScreenContract$InputData;
                        break;
                }
                return (t8) s8Var.mo3783build();
            case 2:
                KProperty[] kPropertyArr3 = AnimatedIntroScreen.T;
                t8 t8Var = (t8) animatedIntroScreen.P.getValue();
                switch (t8Var.f119867a) {
                    case 0:
                        return (e) t8Var.f119871h.get();
                    case 1:
                        return (e) t8Var.f119871h.get();
                    default:
                        return (e) t8Var.f119871h.get();
                }
            case 3:
                KProperty[] kPropertyArr4 = AnimatedIntroScreen.T;
                return n14.e.a(animatedIntroScreen, (e) animatedIntroScreen.Q.getValue());
            default:
                KProperty[] kPropertyArr5 = AnimatedIntroScreen.T;
                e0.C(LifecycleOwnerKt.getLifecycleScope(animatedIntroScreen), null, null, new c(animatedIntroScreen, null, 1), 3);
                return Unit.f186387a;
        }
    }
}
