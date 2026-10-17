package b8e;

import com.revolut.chat.domain.model.ChatListFilter;
import com.revolut.chat.domain.model.ChatTarget;
import com.revolut.chat.domain.model.TicketCreationContext;
import com.revolut.chat.navigation.ChatFlowDestination;
import com.revolut.core.ui_kit.delegates.CellDetailsChevronDelegate;
import com.revolut.feature.shared.help_centre.api.faq.SharedFaqDestination;
import com.revolut.feature.subaccount.api.models.Subaccount;
import com.revolut.feature.subaccount.api.models.SubaccountType;
import com.revolut.feature.subaccount.impl.ui.details.screen.SubaccountDetailsScreen;
import com.revolut.feature.support.api.navigation.HelpCentreFeatureConfig;
import com.revolut.kompot.bridge.navigation.BridgeDestination;
import com.revolut.retail.core.navigation.FeatureCommand;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import v6e.r;
import yhm.o;
import zh9.u0;

/* JADX INFO: loaded from: classes8.dex */
public final class c extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ SubaccountDetailsScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(SubaccountDetailsScreen subaccountDetailsScreen, Continuation continuation) {
        super(2, continuation);
        this.v = subaccountDetailsScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        c cVar = new c(this.v, continuation);
        cVar.u = obj2;
        return cVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((c) create((CellDetailsChevronDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        FeatureCommand featureCommand;
        ?? r06 = this.v.R;
        CellDetailsChevronDelegate.Model model = (CellDetailsChevronDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        String str = model.f51822a;
        if (Intrinsics.f(str, "SUBACCOUNT_DETAILS_ITEM_FAQ_ID")) {
            g gVar = (g) r06.getValue();
            Object obj3 = model.e;
            Intrinsics.i(obj3, "null cannot be cast to non-null type com.revolut.feature.subaccount.api.models.Subaccount");
            Subaccount subaccount = (Subaccount) obj3;
            m mVar = (m) gVar;
            mVar.getClass();
            Intrinsics.checkNotNullParameter(subaccount, "subaccount");
            g6e.g gVar2 = mVar.f13219p;
            SubaccountType subaccountType = subaccount.c();
            ((r) gVar2).getClass();
            Intrinsics.checkNotNullParameter(subaccountType, "subaccountType");
            if (subaccountType.equals(SubaccountType.Group.f88960a) || subaccountType.equals(SubaccountType.Personal.f88963a) || subaccountType.equals(SubaccountType.Pro.f88964a) || subaccountType.equals(SubaccountType.ProTax.f88965a)) {
                featureCommand = new FeatureCommand(new HelpCentreFeatureConfig.Topic("topic.vaults", "SOURCE_TRACKING_VAULT_DETAILS"));
            } else if (subaccountType.equals(SubaccountType.Joint.f88961a)) {
                featureCommand = u0.f(new SharedFaqDestination((SharedFaqDestination.StartPoint) new SharedFaqDestination.StartPoint.FaqExplicit("topic.joint-accounts", 14), (SharedFaqDestination.PassthroughData) null, false, 14));
            } else if (subaccountType.equals(SubaccountType.Junior.f88962a)) {
                featureCommand = u0.f(new SharedFaqDestination((SharedFaqDestination.StartPoint) new SharedFaqDestination.StartPoint.FaqExplicit("question.18-save", 14), (SharedFaqDestination.PassthroughData) null, false, 14));
            } else {
                if (!subaccountType.equals(SubaccountType.Teen.f88966a)) {
                    throw new NoWhenBranchMatchedException();
                }
                featureCommand = u0.f(new SharedFaqDestination((SharedFaqDestination.StartPoint) new SharedFaqDestination.StartPoint.FaqExplicit("question.teen-save", 14), (SharedFaqDestination.PassthroughData) null, false, 14));
            }
            mVar.C1(new BridgeDestination(featureCommand));
        } else if (Intrinsics.f(str, "SUBACCOUNT_DETAILS_ITEM_REPORT_BUG_ID")) {
            m mVar2 = (m) ((g) r06.getValue());
            ((r) mVar2.f13219p).getClass();
            mVar2.C1(new BridgeDestination(u0.f(new ChatFlowDestination(new ChatTarget.ChatList((ChatListFilter) null, (TicketCreationContext) null, (String) null, 15), true))));
        }
        return Unit.f186387a;
    }
}
