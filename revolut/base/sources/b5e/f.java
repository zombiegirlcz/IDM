package b5e;

import com.revolut.data.model.Data;
import com.revolut.feature.structured_note.details.impl.ui.note_details.NoteDetailsFlowController;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import vkm.j2;

/* JADX INFO: loaded from: classes7.dex */
public final class f extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ NoteDetailsFlowController v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(NoteDetailsFlowController noteDetailsFlowController, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = noteDetailsFlowController;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new f(this.v, continuation, 0);
            case 1:
                return new f(this.v, continuation, 1);
            default:
                return new f(this.v, continuation, 2);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        Unit unit = (Unit) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((f) create(unit, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        hdh.e eVar;
        hdh.e eVar2;
        int i = this.u;
        NoteDetailsFlowController noteDetailsFlowController = this.v;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                com.revolut.feature.structured_note.details.impl.ui.note_details.a aVar2 = (com.revolut.feature.structured_note.details.impl.ui.note_details.a) noteDetailsFlowController.e3();
                Data data = ((i) ((j2) aVar2.f88874w.f22677a).getValue()).e;
                if (data != null && (eVar = (hdh.e) data.getContent()) != null) {
                    aVar2.I2((a) c.b(aVar2.f88873t.a(eVar)).f186385a, eVar);
                }
                break;
            case 1:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                com.revolut.feature.structured_note.details.impl.ui.note_details.a aVar4 = (com.revolut.feature.structured_note.details.impl.ui.note_details.a) noteDetailsFlowController.e3();
                Data data2 = ((i) ((j2) aVar4.f88874w.f22677a).getValue()).e;
                if (data2 != null && (eVar2 = (hdh.e) data2.getContent()) != null) {
                    aVar4.I2((a) c.b(aVar4.f88873t.a(eVar2)).f186386b, eVar2);
                }
                break;
            default:
                fim.a aVar5 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((com.revolut.feature.structured_note.details.impl.ui.note_details.a) noteDetailsFlowController.e3()).B2();
                break;
        }
        return Unit.f186387a;
    }
}
