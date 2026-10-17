package db;

import com.feature.user.details.impl.ui.details.UserDetailsController;
import com.revolut.core.ui_kit.delegates.CellDetailsActionListDelegate;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes16.dex */
public final class g extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ UserDetailsController v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(UserDetailsController userDetailsController, Continuation continuation) {
        super(2, continuation);
        this.v = userDetailsController;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        g gVar = new g(this.v, continuation);
        gVar.u = obj2;
        return gVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((g) create((CellDetailsActionListDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        CellDetailsActionListDelegate.Model model = (CellDetailsActionListDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        k kVarE3 = this.v.R2();
        Object obj3 = model.f51799g;
        Intrinsics.i(obj3, "null cannot be cast to non-null type com.feature.user.details.api.models.UserDetailsFieldParcel");
        ra.a parcel = (ra.a) obj3;
        i0 i0Var = (i0) kVarE3;
        i0Var.getClass();
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        i0Var.n2(new d3i.g(i0Var, parcel, null, 9), new whi.b(6));
        return Unit.f186387a;
    }
}
