package vw9;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.feature.payments.profile.impl.ui_kompot.flow.PaymentProfileFlow;
import com.revolut.feature.retail.privacy.api.navigation.RetailPrivacyFeatureConfig;
import com.revolut.retail.core.navigation.FeatureCommand;
import java.util.concurrent.CancellationException;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import yhm.m;
import zh9.u0;

/* JADX INFO: loaded from: classes5.dex */
public final class e extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ PaymentProfileFlow v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(PaymentProfileFlow paymentProfileFlow, Continuation continuation) {
        super(2, continuation);
        this.v = paymentProfileFlow;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        e eVar = new e(this.v, continuation);
        eVar.u = obj2;
        return eVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((e) create((RowDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) throws Throwable {
        Object objA;
        RowDelegate.Model model = (RowDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        g gVarE3 = this.v.R2();
        Object obj3 = model.u;
        com.revolut.feature.payments.profile.impl.ui_kompot.flow.b bVar = (com.revolut.feature.payments.profile.impl.ui_kompot.flow.b) gVarE3;
        bVar.getClass();
        try {
            m.Companion companion = yhm.m.INSTANCE;
            Intrinsics.i(obj3, "null cannot be cast to non-null type com.revolut.feature.payments.profile.impl.ui_kompot.flow.PaymentProfileFlowContract.ProfileSettingsOption");
            objA = (i) obj3;
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th10) {
            m.Companion companion2 = yhm.m.INSTANCE;
            objA = yhm.o.a(th10);
        }
        Throwable thA = yhm.m.a(objA);
        if (thA != null) {
            hx7.e.n(thA);
        }
        Continuation continuation = null;
        if (objA instanceof yhm.n) {
            objA = null;
        }
        i iVar = (i) objA;
        if (iVar != null) {
            int i = l.f292664a[iVar.ordinal()];
            if (i == 1) {
                bVar.C1(u0.b(new FeatureCommand(new RetailPrivacyFeatureConfig(jcb.a.PAYMENTS))));
            } else {
                if (i != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                bVar.n2(new m(bVar, continuation, 0), new whi.b(6));
            }
        }
        return Unit.f186387a;
    }
}
