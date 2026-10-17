package s0l;

import com.revolut.core.ui_kit.delegates.pf;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.contacts_chooser.api.navigation.ContactType;
import com.revolut.feature.contacts_chooser.api.navigation.ContactsChooserConfiguration;
import com.revolut.feature.contacts_chooser.api.navigation.ContactsChooserFeatureConfig;
import com.revolut.kompot.bridge.navigation.BridgeDestination;
import com.revolut.retail.core.navigation.FeatureCommand;
import com.revolut.retail.feature.trading_onboarding.impl.R$string;
import com.revolut.retail.feature.trading_onboarding.impl.ui.partner_consent_request.consent_request.ConsentRequestScreen;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import zhm.h0;

/* JADX INFO: loaded from: classes12.dex */
public final class d extends gim.i implements Function2 {
    public int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ ConsentRequestScreen f258975w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(ConsentRequestScreen consentRequestScreen, Continuation continuation) {
        super(2, continuation);
        this.f258975w = consentRequestScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        d dVar = new d(this.f258975w, continuation);
        dVar.v = obj2;
        return dVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((d) create((pf) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Type inference failed for: r13v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        pf pfVar = (pf) this.v;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        if (i == 0) {
            yhm.o.b(obj2);
            h hVar = (h) this.f258975w.c0.getValue();
            this.v = null;
            this.u = 1;
            s sVar = (s) hVar;
            sVar.getClass();
            if (Intrinsics.f(pfVar.f, "SELECT_PARTNER_ITEM_ACTION_ID")) {
                sVar.C1(new BridgeDestination(new FeatureCommand(new ContactsChooserFeatureConfig(new ContactsChooserConfiguration("REQUEST_SPOUSE_CONSENT_CONTACT_SELECTION_REQUEST_ID", new TextLocalisedClause(R$string.trading_onboarding_spouse_consent_select_contact_title, null, null, 14), new TextLocalisedClause(R$string.trading_onboarding_spouse_consent_select_contact_search_hint, null, null, 14), zhm.u.c(ContactType.RevolutContact.Local.f66038a), null, 32528), null))));
            } else {
                Object obj3 = pfVar.f;
                IllegalStateException illegalStateException = new IllegalStateException(a0.d.s("Unexpected action: parcelType=", obj3 != null ? obj3.getClass().getSimpleName() : null, ", tag=", pfVar.f54594g));
                h0 h0Var = h0.f322473a;
                CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                rd0.d.a(rd0.c.ERROR, null, null, illegalStateException, h0Var);
            }
            if (Unit.f186387a == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            yhm.o.b(obj2);
        }
        return Unit.f186387a;
    }
}
