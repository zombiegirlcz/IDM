package b22;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.feature.apm.core.ui.impl.ui.alias_claim.form.upload.ApmAliasClaimUploadScreen;
import e60.s;
import ip0.u00;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import yhm.o;
import zhm.d0;

/* JADX INFO: loaded from: classes20.dex */
public final class d extends gim.i implements Function2 {
    public final /* synthetic */ ApmAliasClaimUploadScreen u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(ApmAliasClaimUploadScreen apmAliasClaimUploadScreen, Continuation continuation) {
        super(2, continuation);
        this.u = apmAliasClaimUploadScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new d(this.u, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((d) create((RowDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        e60.a aVar2 = this.u.d().o;
        u00 u00Var = u00.BACK;
        e60.o.Companion.getClass();
        s sVar = (s) aVar2;
        sVar.T(new e60.i(null, null, null, true, 0, 0, d0.E0(e60.b.f122837b, e60.b.f122838c), null, false, u00Var, null, 15799));
        return Unit.f186387a;
    }
}
