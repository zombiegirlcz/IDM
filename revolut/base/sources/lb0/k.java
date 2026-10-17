package lb0;

import aa0.a1;
import com.revolut.core.backend_flow.impl.ui.form_screen.FormController;
import com.revolut.core.ui_kit.delegates.ProductSelectionDelegate;
import com.revolut.feature.backend_flow.domain.models.ProductSelectionItem;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import zc0.s3;

/* JADX INFO: loaded from: classes19.dex */
public final class k extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ FormController v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(FormController formController, Continuation continuation) {
        super(2, continuation);
        this.v = formController;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        k kVar = new k(this.v, continuation);
        kVar.u = obj2;
        return kVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((k) create((ProductSelectionDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        ProductSelectionDelegate.Model model = (ProductSelectionDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        q qVarK3 = this.v.k3();
        Intrinsics.h(model);
        com.revolut.core.backend_flow.impl.ui.form_screen.a aVar2 = (com.revolut.core.backend_flow.impl.ui.form_screen.a) qVarK3;
        aVar2.getClass();
        Intrinsics.checkNotNullParameter(model, "model");
        Object obj3 = model.i;
        if (obj3 instanceof s3) {
            s3 s3Var = (s3) obj3;
            aVar2.S2(new a1(s3Var.f321123b), s3Var.f321122a.getId());
        } else {
            if (!(obj3 instanceof ProductSelectionItem)) {
                throw new IllegalStateException(v0.a.h(obj3, "Unsupported parcel type ", " for product selection clicks"));
            }
            String str = model.f52973a;
            aVar2.S2(new a1(str), str);
        }
        aVar2.J2();
        return Unit.f186387a;
    }
}
