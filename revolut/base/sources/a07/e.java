package a07;

import cli.y;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.feature.freelancer.common.models.tax_hub.FreelancerTaxProfile;
import com.revolut.feature.freelancer.impl.ui.profile.FreelancerProfileFlowContract$Step;
import com.revolut.feature.freelancer.impl.ui.profile.account.FreelancerAccountScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import vkm.j2;

/* JADX INFO: loaded from: classes3.dex */
public final class e extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ FreelancerAccountScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(FreelancerAccountScreen freelancerAccountScreen, Continuation continuation) {
        super(2, continuation);
        this.v = freelancerAccountScreen;
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

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        FreelancerTaxProfile freelancerTaxProfile;
        RowDelegate.Model model = (RowDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        j jVar = (j) this.v.P.getValue();
        Intrinsics.h(model);
        r rVar = (r) jVar;
        y yVar = rVar.f160q;
        Intrinsics.checkNotNullParameter(model, "model");
        String str = model.f53228a;
        switch (str.hashCode()) {
            case -1458930990:
                if (str.equals("ITEM_ID_PRO_EMAIL")) {
                    rVar.C2(new g(new FreelancerProfileFlowContract$Step.Email(((f) ((j2) yVar.f22677a).getValue()).f141a)));
                }
                break;
            case 505085138:
                if (str.equals("ITEM_ID_PRO_VAT_REMINDER") && (freelancerTaxProfile = ((f) ((j2) yVar.f22677a).getValue()).e) != null) {
                    rVar.C2(new h(freelancerTaxProfile.f73474a));
                }
                break;
            case 1191792165:
                if (str.equals("ITEM_ID_PRO_URL")) {
                    rVar.C2(new g(new FreelancerProfileFlowContract$Step.Website(((f) ((j2) yVar.f22677a).getValue()).f142b, gs6.a.REGULAR)));
                }
                break;
            case 1191792607:
                if (str.equals("ITEM_ID_PRO_VAT")) {
                    rVar.C2(new g(FreelancerProfileFlowContract$Step.Vat.f74028a));
                }
                break;
            case 1499651827:
                if (str.equals("ITEM_ID_PRO_TRADING_NAME")) {
                    rVar.C2(new g(new FreelancerProfileFlowContract$Step.TradingName(((f) ((j2) yVar.f22677a).getValue()).f, ((f) ((j2) yVar.f22677a).getValue()).f144g)));
                }
                break;
        }
        return Unit.f186387a;
    }
}
