package suc;

import ha3.x;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes7.dex */
public final class k extends gim.i implements Function1 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ m f265710w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ String f265711x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k(m mVar, String str, Continuation continuation, int i) {
        super(1, continuation);
        this.u = i;
        this.f265710w = mVar;
        this.f265711x = str;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        switch (this.u) {
            case 0:
                return new k(this.f265710w, this.f265711x, continuation, 0);
            default:
                return new k(this.f265710w, this.f265711x, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Continuation continuation = (Continuation) obj2;
        switch (this.u) {
        }
        return ((k) create(continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        switch (this.u) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                m mVar = this.f265710w;
                if (i == 0) {
                    yhm.o.b(obj2);
                    pfm.h hVarL = ((x) mVar.f265714p).l(this.f265711x);
                    this.v = 1;
                    if (nim.a.a(hVarL, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                mVar.C2(e.f265706a);
                return Unit.f186387a;
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                m mVar2 = this.f265710w;
                if (i2 == 0) {
                    yhm.o.b(obj2);
                    pfm.h hVarM = ((x) mVar2.f265714p).m(this.f265711x);
                    this.v = 1;
                    if (nim.a.a(hVarM, this) == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                mVar2.C2(f.f265707a);
                return Unit.f186387a;
        }
    }
}
