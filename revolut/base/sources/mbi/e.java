package mbi;

import com.revolut.core.ui_kit.delegates.SelectableDelegate;
import com.revolut.feature_retail_user_declarations.gender.GenderScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import yhm.o;

/* JADX INFO: loaded from: classes10.dex */
public final class e extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ GenderScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(GenderScreen genderScreen, Continuation continuation) {
        super(2, continuation);
        this.v = genderScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        e eVar = new e(this.v, continuation);
        eVar.u = obj2;
        return eVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((e) create((SelectableDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        SelectableDelegate.Model model = (SelectableDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        j jVarE3 = this.v.R2();
        Intrinsics.h(model);
        com.revolut.feature_retail_user_declarations.gender.a aVar2 = (com.revolut.feature_retail_user_declarations.gender.a) jVarE3;
        aVar2.getClass();
        Intrinsics.checkNotNullParameter(model, "model");
        String str = model.f53304a;
        aVar2.H2(aVar2.f97653p, new m98.k(Intrinsics.f(str, "ID_ROW_FEMALE") ? bj0.b.FEMALE : Intrinsics.f(str, "ID_ROW_MALE") ? bj0.b.MALE : null, 10));
        return Unit.f186387a;
    }
}
