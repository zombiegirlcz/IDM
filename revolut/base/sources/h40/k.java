package h40;

import com.revolut.chat.ui.archive.ArchiveScreen;
import com.revolut.core.ui_kit.delegates.LabelButtonDelegate;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes19.dex */
public final class k extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ ArchiveScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(ArchiveScreen archiveScreen, Continuation continuation) {
        super(2, continuation);
        this.v = archiveScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        k kVar = new k(this.v, continuation);
        kVar.u = obj2;
        return kVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((k) create((LabelButtonDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        LabelButtonDelegate.Model model = (LabelButtonDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        b bVarE3 = this.v.d();
        n nVar = (n) bVarE3;
        nVar.I2(model.e, model.f52603a);
        return Unit.f186387a;
    }
}
