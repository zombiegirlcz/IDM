package q44;

import c84.t;
import gim.i;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import skm.e0;
import skm.p0;
import yhm.o;

/* JADX INFO: loaded from: classes22.dex */
public final class e extends i implements Function1 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.credit.application.plugins.impl.ui.address_v2.b f242060w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ List f242061x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(com.revolut.feature.credit.application.plugins.impl.ui.address_v2.b bVar, List list, Continuation continuation, int i) {
        super(1, continuation);
        this.u = i;
        this.f242060w = bVar;
        this.f242061x = list;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        switch (this.u) {
            case 0:
                return new e(this.f242060w, this.f242061x, continuation, 0);
            default:
                return new e(this.f242060w, this.f242061x, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Continuation continuation = (Continuation) obj2;
        switch (this.u) {
        }
        return ((e) create(continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) throws Throwable {
        int i = this.u;
        com.revolut.feature.credit.application.plugins.impl.ui.address_v2.b bVar = this.f242060w;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 == 0) {
                    o.b(obj2);
                    iw3.a aVar2 = bVar.f66978q;
                    String str = bVar.f66977p.f66972b.f66892b;
                    this.v = 1;
                    r24.d dVar = aVar2.f168935a;
                    dVar.getClass();
                    r24.c cVar = new r24.c(dVar, str, this.f242061x, null, 1);
                    p0 p0Var = p0.f264001a;
                    obj2 = e0.J(elm.f.f127540b, cVar, this);
                    if (obj2 == aVar) {
                        return aVar;
                    }
                } else {
                    if (i2 != 1) {
                        if (i2 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        o.b(obj2);
                        return Unit.f186387a;
                    }
                    o.b(obj2);
                }
                this.v = 2;
                if (t.N2(bVar, (it3.d) obj2, this, 2) == aVar) {
                    return aVar;
                }
                return Unit.f186387a;
            default:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                int i3 = this.v;
                if (i3 == 0) {
                    o.b(obj2);
                    iw3.a aVar4 = bVar.f66978q;
                    String str2 = bVar.f66977p.f66972b.f66892b;
                    this.v = 1;
                    r24.d dVar2 = aVar4.f168935a;
                    dVar2.getClass();
                    r24.c cVar2 = new r24.c(dVar2, str2, this.f242061x, null, 0);
                    p0 p0Var2 = p0.f264001a;
                    obj2 = e0.J(elm.f.f127540b, cVar2, this);
                    if (obj2 == aVar3) {
                        return aVar3;
                    }
                } else {
                    if (i3 != 1) {
                        if (i3 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        o.b(obj2);
                        return Unit.f186387a;
                    }
                    o.b(obj2);
                }
                this.v = 2;
                if (t.N2(bVar, (it3.d) obj2, this, 2) == aVar3) {
                    return aVar3;
                }
                return Unit.f186387a;
        }
    }
}
