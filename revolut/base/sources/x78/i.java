package x78;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import vkm.q;
import yhm.o;

/* JADX INFO: loaded from: classes4.dex */
public final class i extends gim.i implements Function1 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ k f303168w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ String f303169x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i(k kVar, String str, Continuation continuation, int i) {
        super(1, continuation);
        this.u = i;
        this.f303168w = kVar;
        this.f303169x = str;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        switch (this.u) {
            case 0:
                return new i(this.f303168w, this.f303169x, continuation, 0);
            default:
                return new i(this.f303168w, this.f303169x, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Continuation continuation = (Continuation) obj2;
        switch (this.u) {
        }
        return ((i) create(continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        switch (this.u) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                String str = this.f303169x;
                k kVar = this.f303168w;
                if (i == 0) {
                    o.b(obj2);
                    jhi.b bVarG = mo3.a.g(rd0.e.b(kVar.f303173r.Z(str, w4l.h.f294642c)), null, new x48.a(9), 1);
                    this.v = 1;
                    obj2 = q.x(bVarG, this);
                    if (obj2 == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                kVar.C2(new e(str, ((fo3.c) obj2).d));
                return Unit.f186387a;
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 == 0) {
                    o.b(obj2);
                    k kVar2 = this.f303168w;
                    i iVar = new i(kVar2, this.f303169x, null, 0);
                    this.v = 1;
                    if (kVar2.p2(this, iVar) == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return Unit.f186387a;
        }
    }
}
