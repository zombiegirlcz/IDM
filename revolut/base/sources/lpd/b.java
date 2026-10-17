package lpd;

import com.revolut.core.ui_kit.delegates.g6;
import com.revolut.feature.spending_analytics.impl.ui.rev10.custom_period.edit.EditCycleScreen;
import ip0.ep0;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class b extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ EditCycleScreen f198968w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(EditCycleScreen editCycleScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f198968w = editCycleScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                b bVar = new b(this.f198968w, continuation, 0);
                bVar.v = obj2;
                return bVar;
            case 1:
                b bVar2 = new b(this.f198968w, continuation, 1);
                bVar2.v = obj2;
                return bVar2;
            default:
                b bVar3 = new b(this.f198968w, continuation, 2);
                bVar3.v = obj2;
                return bVar3;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((b) create((ep0) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 1:
                return ((b) create((g6) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((b) create((Pair) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        Object obj3;
        int i = this.u;
        EditCycleScreen editCycleScreen = this.f198968w;
        switch (i) {
            case 0:
                ep0 dayOfWeek = (ep0) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                n nVarG3 = editCycleScreen.T2();
                Intrinsics.h(dayOfWeek);
                r rVar = (r) nVarG3;
                rVar.getClass();
                Intrinsics.checkNotNullParameter(dayOfWeek, "dayOfWeek");
                k kVar = ((l) rVar.t2()).f198977a;
                obj3 = kVar instanceof j ? (j) kVar : null;
                if (obj3 != null) {
                    rVar.x2(new llh.j(obj3, dayOfWeek, 14));
                }
                break;
            case 1:
                g6 g6Var = (g6) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                n nVarG32 = editCycleScreen.T2();
                String tabId = g6Var.f54199a;
                r rVar2 = (r) nVarG32;
                rVar2.getClass();
                Intrinsics.checkNotNullParameter(tabId, "tabId");
                k kVarY2 = (k) ((l) rVar2.t2()).f198978b.get(tabId);
                if (kVarY2 != null) {
                    rVar2.x2(new p(kVarY2, 1));
                } else {
                    int iHashCode = tabId.hashCode();
                    if (iHashCode != -1490630666) {
                        if (iHashCode != 921679240) {
                            if (iHashCode == 921917552 && tabId.equals("TAB_ID_LAST")) {
                                kVarY2 = r.y2(new lzi.e(lzi.d.LAST), false);
                                ((l) rVar2.t2()).f198978b.put(tabId, kVarY2);
                            }
                        } else if (tabId.equals("TAB_ID_DATE")) {
                            kVarY2 = r.y2(new lzi.c(0, 3), false);
                            ((l) rVar2.t2()).f198978b.put(tabId, kVarY2);
                        }
                    } else if (tabId.equals("TAB_ID_FIRST")) {
                        kVarY2 = r.y2(new lzi.e(lzi.d.FIRST), false);
                        ((l) rVar2.t2()).f198978b.put(tabId, kVarY2);
                    }
                    rVar2.x2(new p(kVarY2, 1));
                }
                break;
            default:
                Pair pair = (Pair) this.v;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                int iIntValue = ((Number) pair.f186386b).intValue();
                r rVar3 = (r) editCycleScreen.T2();
                k kVar2 = ((l) rVar3.t2()).f198977a;
                obj3 = kVar2 instanceof e ? (e) kVar2 : null;
                if (obj3 != null) {
                    rVar3.x2(new abf.n(obj3, iIntValue, 19));
                }
                break;
        }
        return Unit.f186387a;
    }
}
