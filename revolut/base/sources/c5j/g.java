package c5j;

import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.retail.feature.beneficiary.impl.ui_kompot.beneficiary_creation.missing_fields.MissingFieldsScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import yhm.o;

/* JADX INFO: loaded from: classes10.dex */
public final class g extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ MissingFieldsScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(MissingFieldsScreen missingFieldsScreen, Continuation continuation) {
        super(2, continuation);
        this.v = missingFieldsScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        g gVar = new g(this.v, continuation);
        gVar.u = obj2;
        return gVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((g) create((InputTextDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        InputTextDelegate.Model model = (InputTextDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        l lVarE3 = this.v.d();
        String str = model.f52580a;
        ((com.revolut.retail.feature.beneficiary.impl.ui_kompot.beneficiary_creation.missing_fields.a) lVarE3).getClass();
        return Unit.f186387a;
    }
}
