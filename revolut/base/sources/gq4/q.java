package gq4;

import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import vkm.j2;

/* JADX INFO: loaded from: classes22.dex */
public final class q extends gim.i implements Function1 {
    public int u;
    public final /* synthetic */ r v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(r rVar, Continuation continuation) {
        super(1, continuation);
        this.v = rVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new q(this.v, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((q) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        r rVar = this.v;
        if (i == 0) {
            yhm.o.b(obj2);
            Object content = ((i) ((j2) rVar.f145563t.f22677a).getValue()).f145552c.getContent();
            if (content == null) {
                throw new IllegalArgumentException("Content is required");
            }
            h hVar = (h) content;
            a3b.h hVar2 = new a3b.h(rVar, 18);
            a3b.i iVar = new a3b.i(rVar, hVar, 9);
            gi2.i iVar2 = new gi2.i(rVar, hVar, null, 7);
            this.u = 1;
            obj2 = n14.k.V(rVar, null, hVar2, iVar, iVar2, this, 1);
            if (obj2 == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            yhm.o.b(obj2);
        }
        nii.h hVar3 = (nii.h) obj2;
        if (hVar3 instanceof nii.g) {
            rVar.I2();
        } else {
            if (!(hVar3 instanceof nii.f)) {
                throw new NoWhenBranchMatchedException();
            }
            int i2 = jli.h.f175850a;
        }
        return Unit.f186387a;
    }
}
