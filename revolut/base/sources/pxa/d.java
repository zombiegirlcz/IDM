package pxa;

import aii.u;
import cn3.h;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.contacts_chooser.api.models.ContactsFilter;
import com.revolut.feature.contacts_chooser.api.navigation.ContactType;
import com.revolut.feature.contacts_chooser.api.navigation.ContactsChooserBannerContent;
import com.revolut.feature.contacts_chooser.api.navigation.ContactsChooserEmptyState;
import com.revolut.feature.contacts_chooser.api.navigation.ContactsChooserInputData;
import com.revolut.feature.contacts_chooser.api.navigation.ContactsChooserMode;
import com.revolut.feature.contacts_chooser.api.navigation.ContactsPrimaryButtonClause;
import com.revolut.feature.referrals.api.ReferralsDeeplinkApi$Toggles;
import com.revolut.feature.referrals.impl.R$string;
import com.revolut.feature.referrals.impl.personalized_tracking.PersonalizedTrackingController;
import com.revolut.feature.referrals.impl.personalized_tracking.PersonalizedTrackingControllerContract$PersonalizedTrackingNavigationDestination;
import com.revolut.feature.referrals.impl.referrals_flow.InviteFriendsViaContactsDestination;
import dki.g;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import zhm.v;

/* JADX INFO: loaded from: classes13.dex */
public final class d implements ohi.a, nte.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final jt0.b f240598a;

    public d(ln3.b contactsChooserNavigationScreenProvider, jt0.b inviteFriendsMessagingContextHandlerFactory) {
        Intrinsics.checkNotNullParameter(contactsChooserNavigationScreenProvider, "contactsChooserNavigationScreenProvider");
        Intrinsics.checkNotNullParameter(inviteFriendsMessagingContextHandlerFactory, "inviteFriendsMessagingContextHandlerFactory");
        this.f240598a = inviteFriendsMessagingContextHandlerFactory;
    }

    @Override // nte.a
    public final List e() {
        return ReferralsDeeplinkApi$Toggles.a();
    }

    @Override // nhi.f
    public final com.revolut.kompot.navigable.a g(u destination, g flowModel) {
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(flowModel, "flowModel");
        if (destination instanceof PersonalizedTrackingControllerContract$PersonalizedTrackingNavigationDestination) {
            return new PersonalizedTrackingController(((PersonalizedTrackingControllerContract$PersonalizedTrackingNavigationDestination) destination).getF81792b());
        }
        if (destination instanceof InviteFriendsViaContactsDestination) {
            return gc0.c.b(ln3.b.b(new ContactsChooserInputData((Clause) new TextLocalisedClause(R$string.referrals_invite_campaign_invite_friends_title, null, null, 14), (Clause) new TextLocalisedClause(R$string.referrals_invite_campaign_invite_friends_search_placeholder, null, null, 14), v.k(ContactType.RevolutContact.Local.f66038a, new ContactType.RevolutContact.Remote(0)), (List) null, (ContactsChooserMode) null, false, true, false, true, (ContactsFilter) null, (ContactsChooserBannerContent) null, (ContactsChooserEmptyState) null, (AnalyticsProduct) null, (Clause) null, (Set) null, (ContactsPrimaryButtonClause) null, (h) null, R$drawable.uikit_icn_24_back, (Set) null, 786072), this.f240598a.k0(((InviteFriendsViaContactsDestination) destination).getF81801b())), new ogk.b(this, 14));
        }
        return null;
    }
}
