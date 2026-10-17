package uya;

import com.revolut.core.ui_kit.delegates.PromptContentDelegate;
import com.revolut.feature.referrals.shared.ui.impl.ui.multilevel_modal.MultilevelCampaignModalScreen;
import com.revolut.kompot.common.ExternalDestination;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import yhm.o;

/* JADX INFO: loaded from: classes5.dex */
public final class f extends gim.i implements Function2 {
    public final /* synthetic */ MultilevelCampaignModalScreen u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(MultilevelCampaignModalScreen multilevelCampaignModalScreen, Continuation continuation) {
        super(2, continuation);
        this.u = multilevelCampaignModalScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new f(this.u, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((f) create((PromptContentDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        h hVar = (h) ((b) this.u.f81908a0.getValue());
        String str = hVar.f284124p.f81907c;
        if (str != null) {
            hVar.C1(new ExternalDestination.Browser(str, null));
        }
        return Unit.f186387a;
    }
}
