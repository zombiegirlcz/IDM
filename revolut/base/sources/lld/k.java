package lld;

import com.revolut.feature.slot_manager.api.model.SlotContext;
import com.revolut.feature.slot_manager.api.model.checklist.SlotChecklist;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class k extends gim.i implements Function1 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.slot_manager.impl.ui.screen.checklist.a f196718w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ SlotChecklist f196719x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k(com.revolut.feature.slot_manager.impl.ui.screen.checklist.a aVar, SlotChecklist slotChecklist, Continuation continuation, int i) {
        super(1, continuation);
        this.u = i;
        this.f196718w = aVar;
        this.f196719x = slotChecklist;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        switch (this.u) {
            case 0:
                return new k(this.f196718w, this.f196719x, continuation, 0);
            default:
                return new k(this.f196718w, this.f196719x, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Continuation continuation = (Continuation) obj2;
        switch (this.u) {
        }
        return ((k) create(continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        switch (this.u) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                if (i == 0) {
                    yhm.o.b(obj2);
                    u uVar = this.f196718w.o;
                    this.v = 1;
                    skd.i iVar = uVar.f196735b;
                    Object objL = iVar.l(uVar.f196736c.c(uVar.f196734a.f87361a), new skd.b(this.f196719x, iVar, 1), this);
                    if (objL != aVar) {
                        objL = Unit.f186387a;
                    }
                    if (objL != aVar) {
                        objL = Unit.f186387a;
                    }
                    if (objL == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 == 0) {
                    yhm.o.b(obj2);
                    u uVar2 = this.f196718w.o;
                    this.v = 1;
                    skd.i iVar2 = uVar2.f196735b;
                    SlotContext slotContext = uVar2.f196736c.c(uVar2.f196734a.f87361a);
                    akd.a actionType = akd.a.VIEW;
                    skd.a aVar3 = iVar2.f263837c;
                    Intrinsics.checkNotNullParameter(slotContext, "slotContext");
                    SlotChecklist checklist = this.f196719x;
                    Intrinsics.checkNotNullParameter(checklist, "checklist");
                    Intrinsics.checkNotNullParameter(actionType, "actionType");
                    String strB = aVar3.f263817a.b(slotContext.f87254a);
                    SlotChecklist.Meta meta = checklist.f87261a;
                    Object objD = iVar2.f263835a.d(new tkd.e(strB, meta.f87271b, tkd.d.CHECKLIST, actionType, meta.f87272c), this);
                    if (objD != aVar2) {
                        objD = Unit.f186387a;
                    }
                    if (objD != aVar2) {
                        objD = Unit.f186387a;
                    }
                    if (objD == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
        }
    }
}
