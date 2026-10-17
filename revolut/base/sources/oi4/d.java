package oi4;

import android.os.Parcelable;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.contacts_chooser.api.navigation.ContactType;
import com.revolut.feature.contacts_chooser.api.navigation.ContactsChooserConfiguration;
import com.revolut.feature.contacts_chooser.api.navigation.ContactsChooserFeatureConfig;
import com.revolut.feature.credit.application.plugins.impl.ui.spousal_consent_initiator.request_consent.RequestConsentScreen;
import com.revolut.feature.credit.core.R$string;
import com.revolut.kompot.bridge.navigation.BridgeDestination;
import com.revolut.retail.core.navigation.FeatureCommand;
import grl.k9;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import zhm.u;

/* JADX INFO: loaded from: classes22.dex */
public final class d extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ RequestConsentScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(RequestConsentScreen requestConsentScreen, Continuation continuation) {
        super(2, continuation);
        this.v = requestConsentScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        d dVar = new d(this.v, continuation);
        dVar.u = obj2;
        return dVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((d) create((RowDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Type inference failed for: r12v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        RowDelegate.Model model = (RowDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        i iVar = (i) this.v.X.getValue();
        String listId = model.f53228a;
        p pVar = (p) iVar;
        pVar.getClass();
        Intrinsics.checkNotNullParameter(listId, "listId");
        if (Intrinsics.f(listId, "SELECT_CONTACT_ROW_ID")) {
            TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.spousal_consent_initiator_common_checking_select_partner_title, null, null, 14);
            TextLocalisedClause textLocalisedClause2 = new TextLocalisedClause(R$string.spousal_consent_initiator_common_checking_select_partner_search_hint, null, null, 14);
            List listC = u.c(ContactType.RevolutContact.Local.f66038a);
            k9 value = k9.Credit;
            Parcelable.Creator<AnalyticsProduct.Retail> creator = AnalyticsProduct.Retail.CREATOR;
            Intrinsics.checkNotNullParameter(value, "value");
            pVar.C1(new BridgeDestination(new FeatureCommand(new ContactsChooserFeatureConfig(new ContactsChooserConfiguration("CONTACT_CHOOSER_REQUEST_ID", textLocalisedClause, textLocalisedClause2, listC, new AnalyticsProduct.Retail(value), 7952), null))));
        }
        return Unit.f186387a;
    }
}
