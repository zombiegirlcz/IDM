package aj6;

import aj6.n;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import skm.e0;
import skm.p0;
import zhm.h0;

/* JADX INFO: loaded from: classes3.dex */
public final class w extends gim.i implements Function2 {
    public int u;
    public final /* synthetic */ x v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(x xVar, Continuation continuation) {
        super(2, continuation);
        this.v = xVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new w(this.v, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((w) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) throws Throwable {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        x61.a aVar2 = null;
        x xVar = this.v;
        try {
            if (i == 0) {
                yhm.o.b(obj2);
                xg6.b bVar = xVar.f5434s;
                l lVar = xVar.o;
                String str = lVar.f5414a;
                String str2 = lVar.f5415b;
                this.u = 1;
                hf6.i iVar = (hf6.i) ((mg6.c) bVar.f305574a).f205160a;
                iVar.getClass();
                hf6.g gVar = new hf6.g(iVar, str, str2, null, 0);
                p0 p0Var = p0.f264001a;
                obj2 = e0.J(elm.f.f127540b, gVar, this);
                if (obj2 == aVar) {
                    return aVar;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                yhm.o.b(obj2);
            }
            aVar2 = (x61.a) obj2;
        } catch (Exception e) {
            h0 h0Var = h0.f322473a;
            CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
            rd0.d.a(rd0.c.ERROR, null, null, e, h0Var);
        }
        if (aVar2 != null) {
            xVar.H2(xVar.u, new afa.q(aVar2, 11));
            return Unit.f186387a;
        }
        t tVar = x.Companion;
        xVar.C2(n.b.f5419a);
        return Unit.f186387a;
    }
}
