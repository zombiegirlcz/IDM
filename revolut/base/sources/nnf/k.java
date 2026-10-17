package nnf;

import iuf.y;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import yhm.o;

/* JADX INFO: loaded from: classes8.dex */
public final class k extends gim.i implements Function1 {
    public int u;
    public final /* synthetic */ l v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ dj0.d f217621w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ String f217622x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(l lVar, dj0.d dVar, String str, Continuation continuation) {
        super(1, continuation);
        this.v = lVar;
        this.f217621w = dVar;
        this.f217622x = str;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new k(this.v, this.f217621w, this.f217622x, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((k) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        l lVar = this.v;
        if (i == 0) {
            o.b(obj2);
            j60.a.v(lVar.f217626s, false, null, 3);
            y yVar = new y(this.f217621w, 11);
            nk9.l lVar2 = new nk9.l(lVar, this.f217622x, null, 6);
            this.u = 1;
            obj2 = n14.k.V(lVar, null, null, yVar, lVar2, this, 3);
            if (obj2 == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj2);
        }
        if (((nii.h) obj2) instanceof nii.g) {
            lVar.v2(e.f217617a);
        }
        return Unit.f186387a;
    }
}
