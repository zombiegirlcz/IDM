package ieg;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes9.dex */
public final class w extends gim.i implements Function2 {
    public int u;
    public final /* synthetic */ com.revolut.feature.travel.hotels.impl.ui_kompot.screen.rooms_selection.b v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ nag.b f160738w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(com.revolut.feature.travel.hotels.impl.ui_kompot.screen.rooms_selection.b bVar, Continuation continuation, nag.b bVar2) {
        super(2, continuation);
        this.v = bVar;
        this.f160738w = bVar2;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new w(this.v, continuation, this.f160738w);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((w) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        if (i == 0) {
            yhm.o.b(obj2);
            nag.b bVar = this.f160738w;
            com.revolut.feature.travel.hotels.impl.ui_kompot.screen.rooms_selection.b bVar2 = this.v;
            afa.u uVar = new afa.u(bVar, bVar2, null, 27);
            this.u = 1;
            if (bVar2.p2(this, uVar) == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            yhm.o.b(obj2);
        }
        return Unit.f186387a;
    }
}
