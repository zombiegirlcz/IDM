package vo8;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.feature.junior_settings.impl.ui_kompot.security_and_privacy.JuniorSecurityAndPrivacyController;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class h extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ JuniorSecurityAndPrivacyController v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(JuniorSecurityAndPrivacyController juniorSecurityAndPrivacyController, Continuation continuation) {
        super(2, continuation);
        this.v = juniorSecurityAndPrivacyController;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        h hVar = new h(this.v, continuation);
        hVar.u = obj2;
        return hVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((h) create((RowDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        RowDelegate.Model item = (RowDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        k kVarE3 = this.v.d();
        Intrinsics.h(item);
        com.revolut.feature.junior_settings.impl.ui_kompot.security_and_privacy.b bVar = (com.revolut.feature.junior_settings.impl.ui_kompot.security_and_privacy.b) kVarE3;
        bVar.getClass();
        Intrinsics.checkNotNullParameter(item, "item");
        bVar.n2(new n0(item, bVar, null), new whi.b(6));
        return Unit.f186387a;
    }
}
