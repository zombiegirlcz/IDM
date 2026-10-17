package df4;

import aw0.n6;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.feature.credit.application.plugins.impl.ui.offer.animated_intro.AnimatedIntroScreen;
import cq6.k;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import kotlinx.coroutines.CoroutineScope;
import yhm.o;

/* JADX INFO: loaded from: classes22.dex */
public final class c extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ AnimatedIntroScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(AnimatedIntroScreen animatedIntroScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = animatedIntroScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new c(this.v, continuation, 0);
            default:
                return new c(this.v, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((c) create((n6) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((c) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        AnimatedIntroScreen animatedIntroScreen = this.v;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                g gVar = (g) ((e) animatedIntroScreen.Q.getValue());
                gVar.getClass();
                gVar.l2(new k(gVar, null, 16), new yi5.b(26));
                break;
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                KProperty[] kPropertyArr = AnimatedIntroScreen.T;
                Intrinsics.checkNotNullExpressionValue(animatedIntroScreen.e3().getContext(), "getContext(...)");
                animatedIntroScreen.e3().animate().translationYBy(-kli.a.k(r5, 34.0f)).setDuration(800L).start();
                animatedIntroScreen.d3().animate().translationY(BitmapDescriptorFactory.HUE_RED).setDuration(800L).start();
                break;
        }
        return Unit.f186387a;
    }
}
