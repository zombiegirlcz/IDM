package l0f;

import com.revolut.core.ui_kit.delegates.InputDisclosureDelegate;
import com.revolut.feature.topup_screen.impl.mcy.india_topup_declaration.IndiaTopupDeclarationScreen;
import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import yhm.o;

/* JADX INFO: loaded from: classes8.dex */
public final class b extends i implements Function2 {
    public final /* synthetic */ IndiaTopupDeclarationScreen u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(IndiaTopupDeclarationScreen indiaTopupDeclarationScreen, Continuation continuation) {
        super(2, continuation);
        this.u = indiaTopupDeclarationScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new b(this.u, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((b) create((InputDisclosureDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        g gVar = (g) this.u.N.getValue();
        gVar.getClass();
        gVar.n2(new af3.f((Object) gVar, false, (Continuation) null, 26), new whi.b(6));
        return Unit.f186387a;
    }
}
