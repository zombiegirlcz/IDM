package wj8;

import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.feature.junior_profile.api.models.WorkflowConfiguration;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class z extends gim.i implements Function1 {
    public final /* synthetic */ InputTextDelegate.Model u;
    public final /* synthetic */ c0 v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(InputTextDelegate.Model model, c0 c0Var, Continuation continuation) {
        super(1, continuation);
        this.u = model;
        this.v = c0Var;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new z(this.u, this.v, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((z) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        InputTextDelegate.Model model = this.u;
        String str = model.f52580a;
        boolean zF = Intrinsics.f(str, "ID_EMAIL_ITEM");
        c0 c0Var = this.v;
        if (zF) {
            c0Var.C2(p.f298014a);
        } else if (Intrinsics.f(str, "ID_GENDER_ITEM")) {
            c0Var.C2(o.f298013a);
        } else {
            Object obj3 = model.P;
            if (kotlin.text.a0.H(model.f52580a, "DYNAMIC_EDIT_FIELD_KEY", false) && (obj3 instanceof WorkflowConfiguration)) {
                c0Var.l2(new wgb.v(c0Var, new y(c0Var, (WorkflowConfiguration) obj3, null, 1), (Continuation) null), new yi5.b(26));
            }
        }
        return Unit.f186387a;
    }
}
