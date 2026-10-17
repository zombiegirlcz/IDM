package mg7;

import com.revolut.feature.incentive_reward.impl.ui.incentive_selection.screen.selection.IncentiveSelectionController;
import com.revolut.kompot.common.ExternalDestination;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import m2f.b0;
import mg7.m;
import vkm.j2;
import zhm.h0;

/* JADX INFO: loaded from: classes22.dex */
public final class b extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ IncentiveSelectionController v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(IncentiveSelectionController incentiveSelectionController, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = incentiveSelectionController;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new b(this.v, continuation, 0);
            case 1:
                return new b(this.v, continuation, 1);
            case 2:
                return new b(this.v, continuation, 2);
            default:
                return new b(this.v, continuation, 3);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((b) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 1:
                return ((b) create((ty0.a) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 2:
                return ((b) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((b) create((String) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        g gVar;
        List list;
        Object next;
        int i = this.u;
        Continuation continuation = null;
        IncentiveSelectionController incentiveSelectionController = this.v;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((u) incentiveSelectionController.d()).B2();
                break;
            case 1:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                u uVar = (u) incentiveSelectionController.d();
                i iVar = (i) ((j) ((j2) uVar.u.f22677a).getValue()).f205172a.getContent();
                String str = iVar != null ? iVar.f205171c : null;
                if (str == null) {
                    RuntimeException runtimeException = new RuntimeException("No content");
                    h0 h0Var = h0.f322473a;
                    CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                    rd0.d.a(rd0.c.ERROR, null, null, runtimeException, h0Var);
                } else {
                    uVar.C1(new ExternalDestination.Browser(str, null));
                }
                break;
            case 2:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                u uVar2 = (u) incentiveSelectionController.d();
                i iVar2 = (i) ((j) ((j2) uVar2.u.f22677a).getValue()).f205172a.getContent();
                if (iVar2 == null || (list = iVar2.d) == null) {
                    gVar = null;
                } else {
                    Iterator it8 = list.iterator();
                    while (true) {
                        if (it8.hasNext()) {
                            next = it8.next();
                            if (((g) next).f) {
                            }
                        } else {
                            next = null;
                        }
                    }
                    gVar = (g) next;
                }
                if (gVar == null) {
                    RuntimeException runtimeException2 = new RuntimeException("No selected incentive");
                    h0 h0Var2 = h0.f322473a;
                    CopyOnWriteArrayList copyOnWriteArrayList2 = rd0.d.f253311a;
                    rd0.d.a(rd0.c.ERROR, null, null, runtimeException2, h0Var2);
                } else {
                    uVar2.l2(new b0(uVar2, gVar, continuation, 26), new yi5.b(26));
                }
                break;
            default:
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((u) incentiveSelectionController.d()).C2(m.a.f205174a);
                break;
        }
        return Unit.f186387a;
    }
}
