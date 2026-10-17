package lld;

import aw0.n6;
import com.revolut.feature.slot_manager.impl.ui.screen.checklist.SlotChecklistController;
import java.util.concurrent.CopyOnWriteArrayList;
import kkd.d;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import zhm.h0;

/* JADX INFO: loaded from: classes7.dex */
public final class g extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ SlotChecklistController f196714w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g(SlotChecklistController slotChecklistController, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f196714w = slotChecklistController;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                g gVar = new g(this.f196714w, continuation, 0);
                gVar.v = obj2;
                return gVar;
            default:
                g gVar2 = new g(this.f196714w, continuation, 1);
                gVar2.v = obj2;
                return gVar2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((g) create((ty0.a) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((g) create((n6) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        SlotChecklistController slotChecklistController = this.f196714w;
        switch (i) {
            case 0:
                ty0.a aVar = (ty0.a) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                i iVarM3 = slotChecklistController.d();
                Object obj3 = aVar.d;
                com.revolut.feature.slot_manager.impl.ui.screen.checklist.a aVar3 = (com.revolut.feature.slot_manager.impl.ui.screen.checklist.a) iVarM3;
                aVar3.getClass();
                String str = obj3 instanceof String ? (String) obj3 : null;
                if (str == null) {
                    IllegalArgumentException illegalArgumentException = new IllegalArgumentException(v0.a.h(obj3, "Parcel ", " is not a url"));
                    h0 h0Var = h0.f322473a;
                    CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                    rd0.d.a(rd0.c.ERROR, null, null, illegalArgumentException, h0Var);
                } else {
                    aVar3.n2(new ll6.i(aVar3, new o(aVar3, str, null, 2), (Continuation) null), new whi.b(6));
                }
                break;
            default:
                n6 n6Var = (n6) this.v;
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                i iVarM32 = slotChecklistController.d();
                Object obj4 = n6Var.k;
                String str2 = n6Var.f;
                com.revolut.feature.slot_manager.impl.ui.screen.checklist.a aVar5 = (com.revolut.feature.slot_manager.impl.ui.screen.checklist.a) iVarM32;
                aVar5.getClass();
                Continuation continuation = null;
                if (obj4 instanceof pld.a) {
                    aVar5.n2(new ll6.i(aVar5, new l(aVar5, obj4, str2, continuation, 0), (Continuation) null), new whi.b(6));
                } else if (obj4 instanceof String) {
                    aVar5.n2(new ll6.i(aVar5, new l(aVar5, obj4, str2, continuation, 1), (Continuation) null), new whi.b(6));
                } else {
                    aVar5.C2(d.a.f184576a);
                }
                break;
        }
        return Unit.f186387a;
    }
}
