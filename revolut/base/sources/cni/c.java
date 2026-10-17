package cni;

import aw0.n6;
import cli.y;
import com.revolut.oauth.impl.ui.consent.screen.ConsentScreen;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import vkm.j2;
import zhm.w;

/* JADX INFO: loaded from: classes10.dex */
public final class c extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ ConsentScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(ConsentScreen consentScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = consentScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new c(this.v, continuation, 0);
            case 1:
                return new c(this.v, continuation, 1);
            default:
                return new c(this.v, continuation, 2);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
        }
        return ((c) create((n6) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        j jVar = j.f25441a;
        ConsentScreen consentScreen = this.v;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((q) consentScreen.d()).C2(jVar);
                break;
            case 1:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((q) consentScreen.d()).C2(jVar);
                break;
            default:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                q qVar = (q) consentScreen.d();
                y yVar = qVar.f25450s;
                f fVar = (f) zi0.c.I(((g) ((j2) yVar.f22677a).getValue()).f25436a);
                ArrayList arrayList = fVar.f25434a.f315016b;
                ArrayList arrayList2 = new ArrayList(w.t(arrayList, 10));
                Iterator it8 = arrayList.iterator();
                while (it8.hasNext()) {
                    arrayList2.add(((ymi.k) it8.next()).f315018a);
                }
                ArrayList arrayList3 = new ArrayList();
                for (Object obj3 : arrayList2) {
                    if (!((g) ((j2) yVar.f22677a).getValue()).f25437b.contains((String) obj3)) {
                        arrayList3.add(obj3);
                    }
                }
                if (!arrayList3.isEmpty()) {
                    qVar.l2(new a31.w(fVar, qVar, arrayList3, (Continuation) null), new cma.b(qVar, fVar, 2));
                }
                break;
        }
        return Unit.f186387a;
    }
}
