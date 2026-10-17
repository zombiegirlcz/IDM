package y12;

import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.feature.apm.core.ui.impl.ui.alias_claim.form.additional_info.ApmAliasClaimAdditionalInfoScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import yhm.o;

/* JADX INFO: loaded from: classes20.dex */
public final class c extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ ApmAliasClaimAdditionalInfoScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(ApmAliasClaimAdditionalInfoScreen apmAliasClaimAdditionalInfoScreen, Continuation continuation) {
        super(2, continuation);
        this.v = apmAliasClaimAdditionalInfoScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        c cVar = new c(this.v, continuation);
        cVar.u = obj2;
        return cVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((c) create((InputTextDelegate.TextData) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        InputTextDelegate.TextData textData = (InputTextDelegate.TextData) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        i iVar = (i) this.v.N.getValue();
        String userInput = textData.f52598b.toString();
        iVar.getClass();
        Intrinsics.checkNotNullParameter(userInput, "userInput");
        iVar.H2(iVar.o, new xf0.h(userInput, 18));
        return Unit.f186387a;
    }
}
