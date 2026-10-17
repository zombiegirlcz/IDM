package q22;

import com.revolut.core.ui_kit.delegates.g6;
import com.revolut.feature.apm.core.ui.api.navigation.ApmNewContactNavigation$Tab;
import com.revolut.feature.apm.core.ui.impl.ui.new_contact.ApmNewContactScreen;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import zhm.h0;

/* JADX INFO: loaded from: classes20.dex */
public final class g extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ ApmNewContactScreen f241492w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g(ApmNewContactScreen apmNewContactScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f241492w = apmNewContactScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                g gVar = new g(this.f241492w, continuation, 0);
                gVar.v = obj2;
                return gVar;
            default:
                g gVar2 = new g(this.f241492w, continuation, 1);
                gVar2.v = obj2;
                return gVar2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((g) create((String) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((g) create((g6) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        Object next;
        int i = this.u;
        ApmNewContactScreen apmNewContactScreen = this.f241492w;
        switch (i) {
            case 0:
                String item = (String) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                c cVarE3 = apmNewContactScreen.e3();
                Intrinsics.h(item);
                com.revolut.feature.apm.core.ui.impl.ui.new_contact.a aVar2 = (com.revolut.feature.apm.core.ui.impl.ui.new_contact.a) cVarE3;
                aVar2.getClass();
                Intrinsics.checkNotNullParameter(item, "item");
                aVar2.f62352q.d(item);
                break;
            default:
                g6 g6Var = (g6) this.v;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                c cVarE32 = apmNewContactScreen.e3();
                String tab2 = g6Var.f54199a;
                com.revolut.feature.apm.core.ui.impl.ui.new_contact.a aVar4 = (com.revolut.feature.apm.core.ui.impl.ui.new_contact.a) cVarE32;
                aVar4.getClass();
                Intrinsics.checkNotNullParameter(tab2, "tab");
                Iterator it8 = aVar4.o.f62247b.iterator();
                while (true) {
                    if (it8.hasNext()) {
                        next = it8.next();
                        if (((ApmNewContactNavigation$Tab) next).f62251a.equals(tab2)) {
                        }
                    } else {
                        next = null;
                    }
                }
                ApmNewContactNavigation$Tab apmNewContactNavigation$Tab = (ApmNewContactNavigation$Tab) next;
                if (apmNewContactNavigation$Tab == null) {
                    IllegalStateException illegalStateException = new IllegalStateException(j6.a.q("Unknown tab clicked: ", tab2));
                    h0 h0Var = h0.f322473a;
                    CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                    rd0.d.a(rd0.c.ERROR, null, null, illegalStateException, h0Var);
                } else {
                    aVar4.H2(aVar4.u, new k(apmNewContactNavigation$Tab, 0));
                }
                break;
        }
        return Unit.f186387a;
    }
}
