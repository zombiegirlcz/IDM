package fhf;

import com.revolut.data.model.Data;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import tof.a3;
import vkm.j2;
import whf.p;
import yhm.o;
import zhm.d0;

/* JADX INFO: loaded from: classes8.dex */
public final class i extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ j f135222w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i(j jVar, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f135222w = jVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                i iVar = new i(this.f135222w, continuation, 0);
                iVar.v = obj2;
                return iVar;
            default:
                i iVar2 = new i(this.f135222w, continuation, 1);
                iVar2.v = obj2;
                return iVar2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((i) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((i) create((f5j.a) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        List list;
        int i = this.u;
        j jVar = this.f135222w;
        switch (i) {
            case 0:
                Data data = (Data) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                jVar.H2(jVar.f135225r, new f9a.i(data, 10));
                j2 j2Var = jVar.f135226s;
                p pVar = (p) data.getContent();
                j2Var.setValue((pVar == null || (list = pVar.f297646a) == null) ? null : (a3) d0.d0(list));
                break;
            default:
                f5j.a aVar2 = (f5j.a) this.v;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                jVar.H2(jVar.f135225r, new d3j.c(aVar2, 1));
                break;
        }
        return Unit.f186387a;
    }
}
