package wz6;

import cli.y;
import com.revolut.core.ui_kit.delegates.ai;
import com.revolut.feature.freelancer.impl.ui.perks.list.FreelancerPerksListScreen;
import com.revolut.feature.freelancer.impl.ui.perks.list.FreelancerPerksListScreenContract$PerkId;
import ip0.qs;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import vkm.j2;
import wvg.d0;
import yhm.o;

/* JADX INFO: loaded from: classes3.dex */
public final class c extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ FreelancerPerksListScreen f301371w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(FreelancerPerksListScreen freelancerPerksListScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f301371w = freelancerPerksListScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                c cVar = new c(this.f301371w, continuation, 0);
                cVar.v = obj2;
                return cVar;
            default:
                c cVar2 = new c(this.f301371w, continuation, 1);
                cVar2.v = obj2;
                return cVar2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((c) create((ai) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((c) create((qs) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        Object next;
        int i = this.u;
        FreelancerPerksListScreen freelancerPerksListScreen = this.f301371w;
        switch (i) {
            case 0:
                ai aiVar = (ai) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                g gVarD3 = freelancerPerksListScreen.R2();
                String selectedId = aiVar.f53687a;
                gVarD3.getClass();
                Intrinsics.checkNotNullParameter(selectedId, "selectedId");
                y yVar = gVarD3.f301377q;
                ht6.b bVar = (ht6.b) ((d) ((j2) yVar.f22677a).getValue()).f301372a.getContent();
                if (bVar != null) {
                    Iterator it8 = bVar.f155329b.iterator();
                    while (true) {
                        if (it8.hasNext()) {
                            next = it8.next();
                            if (Intrinsics.f(((cgc.g) next).f23912a, selectedId)) {
                            }
                        } else {
                            next = null;
                        }
                    }
                    cgc.g gVar = (cgc.g) next;
                    if (gVar != null) {
                        gVarD3.H2(yVar, new d0(gVar, 25));
                    }
                }
                break;
            default:
                qs qsVar = (qs) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                g gVarD32 = freelancerPerksListScreen.R2();
                Object obj3 = qsVar.i;
                gVarD32.getClass();
                if (obj3 instanceof FreelancerPerksListScreenContract$PerkId) {
                    gVarD32.C2(new e(((FreelancerPerksListScreenContract$PerkId) obj3).f74014a));
                }
                break;
        }
        return Unit.f186387a;
    }
}
