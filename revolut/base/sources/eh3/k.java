package eh3;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.feature.checklist_challenges_ui.impl.ui.checklist_collection.ChecklistCollectionScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes21.dex */
public final class k extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ ChecklistCollectionScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(ChecklistCollectionScreen checklistCollectionScreen, Continuation continuation) {
        super(2, continuation);
        this.v = checklistCollectionScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        k kVar = new k(this.v, continuation);
        kVar.u = obj2;
        return kVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((k) create((RowDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) throws Throwable {
        RowDelegate.Model model = (RowDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        q qVarE3 = this.v.R2();
        Object obj3 = model.u;
        com.revolut.feature.checklist_challenges_ui.impl.ui.checklist_collection.a aVar2 = (com.revolut.feature.checklist_challenges_ui.impl.ui.checklist_collection.a) qVarE3;
        aVar2.getClass();
        String str = obj3 instanceof String ? (String) obj3 : null;
        if (str != null) {
            aVar2.n2(new e8e.w(aVar2, new w(aVar2, str, null, 2), (Continuation) null), new whi.b(6));
        } else {
            hx7.e.n(new IllegalArgumentException(a0.d.m(obj3, "parcel should be a deeplink string, got: ")));
        }
        return Unit.f186387a;
    }
}
