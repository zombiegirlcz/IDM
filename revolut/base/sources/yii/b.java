package yii;

import cli.j;
import com.revolut.kompot.navigable.vc.ui.States$PersistentDomain;
import gim.i;
import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.text.a0;
import kotlinx.coroutines.CoroutineScope;
import yhm.o;
import zhm.h0;

/* JADX INFO: loaded from: classes10.dex */
public final class b extends i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ c v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(c cVar, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = cVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new b(this.v, continuation, 0);
            default:
                return new b(this.v, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        CoroutineScope coroutineScope = (CoroutineScope) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((b) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        j jVar;
        int i = this.u;
        c cVar = this.v;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                cVar.f314331b.clear();
                break;
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                e eVar = cVar.f314331b;
                Set setKeys = eVar.keys();
                ArrayList<String> arrayList = new ArrayList();
                for (Object obj3 : setKeys) {
                    if (a0.H((String) obj3, "model_state_", false)) {
                        arrayList.add(obj3);
                    }
                }
                for (String str : arrayList) {
                    try {
                        jVar = (j) eVar.T2(str, States$PersistentDomain.class);
                    } catch (Throwable th10) {
                        h0 h0Var = h0.f322473a;
                        CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                        rd0.d.a(rd0.c.ERROR, null, null, th10, h0Var);
                        eVar.I0(str);
                        jVar = null;
                    }
                    if (jVar != null) {
                        cVar.f314332c.d(str, jVar);
                    }
                    break;
                }
                break;
        }
        return Unit.f186387a;
    }
}
