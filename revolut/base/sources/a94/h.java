package a94;

import a83.c0;
import com.revolut.data.model.Data;
import java.util.ArrayList;
import java.util.Collection;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import rp0.y0;
import vkm.j2;
import zhm.d0;

/* JADX INFO: loaded from: classes22.dex */
public final class h extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ k f2314w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h(k kVar, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f2314w = kVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                h hVar = new h(this.f2314w, continuation, 0);
                hVar.v = obj2;
                return hVar;
            default:
                h hVar2 = new h(this.f2314w, continuation, 1);
                hVar2.v = obj2;
                return hVar2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((h) create((mii.q) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((h) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        k kVar = this.f2314w;
        switch (i) {
            case 0:
                mii.q qVar = (mii.q) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                if (qVar instanceof mii.m) {
                    vki.a aVar2 = kVar.f2317n;
                    j2 j2Var = (j2) aVar2.f22677a;
                    j2 j2Var2 = (j2) aVar2.f22677a;
                    qu3.e eVar = ((r) j2Var.getValue()).f2329b;
                    if (eVar == null) {
                        throw new IllegalArgumentException("Required value was null.");
                    }
                    Integer num = ((r) j2Var2.getValue()).f2330c;
                    if (num == null) {
                        throw new IllegalArgumentException("Required value was null.");
                    }
                    int iIntValue = num.intValue();
                    Object content = ((r) j2Var2.getValue()).f2328a.getContent();
                    if (content == null) {
                        throw new IllegalArgumentException("Required value was null.");
                    }
                    ArrayList arrayListF1 = d0.f1((Collection) content);
                    arrayListF1.add(iIntValue, eVar);
                    kVar.X2(aVar2, new c0(1, arrayListF1));
                } else if (!(qVar instanceof mii.n)) {
                    int i2 = jli.h.f175850a;
                } else if (kotlin.collections.d.I(new y0[]{y0.SWIPED, y0.TIMEOUT}, ((mii.n) qVar).f205875b)) {
                    kVar.T2(new g(kVar, null, 0), new yi5.b(27));
                }
                return Unit.f186387a;
            default:
                Data data = (Data) this.v;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                kVar.X2(kVar.f2317n, new a07.l(data, 24));
                return Unit.f186387a;
        }
    }
}
