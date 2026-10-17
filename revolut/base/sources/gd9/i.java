package gd9;

import com.revolut.feature.terms.api.model.Terms;
import g37.z;
import gd9.e;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import vkm.j2;
import yhm.o;

/* JADX INFO: loaded from: classes5.dex */
public final class i extends gim.i implements Function2 {
    public j u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ j f143120w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(j jVar, Continuation continuation) {
        super(2, continuation);
        this.f143120w = jVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new i(this.f143120w, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((i) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        j jVar;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.v;
        if (i == 0) {
            o.b(obj2);
            j jVar2 = this.f143120w;
            Terms terms = (Terms) ((d) ((j2) jVar2.f143122q.f22677a).getValue()).f143116a.f224257a;
            Continuation continuation = null;
            if (terms == null) {
                return null;
            }
            z zVar = new z(jVar2, terms, continuation, 28);
            this.u = jVar2;
            this.v = 1;
            if (jVar2.p2(this, zVar) == aVar) {
                return aVar;
            }
            jVar = jVar2;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            jVar = this.u;
            o.b(obj2);
        }
        jVar.C2(e.a.f143117a);
        return Unit.f186387a;
    }
}
