package n85;

import com.revolut.core.ui_kit.views.q;
import java.util.Iterator;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import yhm.o;

/* JADX INFO: loaded from: classes21.dex */
public final class i extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ k f213214w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i(k kVar, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f213214w = kVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                i iVar = new i(this.f213214w, continuation, 0);
                iVar.v = obj2;
                return iVar;
            default:
                i iVar2 = new i(this.f213214w, continuation, 1);
                iVar2.v = obj2;
                return iVar2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((i) create((f) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((i) create((Pair) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        Object next;
        int i = this.u;
        k kVar = this.f213214w;
        switch (i) {
            case 0:
                f fVar = (f) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                kVar.x2(new n7h.c(fVar, 1));
                break;
            default:
                Pair pair = (Pair) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                h hVar = (h) pair.f186385a;
                int iIntValue = ((Number) pair.f186386b).intValue();
                Iterator it8 = hVar.f213212b.iterator();
                while (true) {
                    if (it8.hasNext()) {
                        next = it8.next();
                        if (Integer.parseInt(((q) next).f59614a) <= iIntValue) {
                        }
                    } else {
                        next = null;
                    }
                }
                kVar.x2(new n7h.c((q) next, 2));
                break;
        }
        return Unit.f186387a;
    }
}
