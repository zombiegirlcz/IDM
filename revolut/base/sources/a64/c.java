package a64;

import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.feature.credit.application.plugins.impl.ui.birth_place.screen.country.BirthCountryScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import yhm.o;

/* JADX INFO: loaded from: classes22.dex */
public final class c extends gim.i implements Function2 {
    public final /* synthetic */ BirthCountryScreen u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(BirthCountryScreen birthCountryScreen, Continuation continuation) {
        super(2, continuation);
        this.u = birthCountryScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new c(this.u, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((c) create((InputTextDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        j jVar = (j) ((h) this.u.Y.getValue());
        jVar.v2(new g(((d) jVar.t2()).f1536a));
        return Unit.f186387a;
    }
}
