package is9;

import cn3.h;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.contacts_chooser.api.models.ContactsFilter;
import com.revolut.feature.contacts_chooser.api.navigation.ContactType;
import com.revolut.feature.contacts_chooser.api.navigation.ContactType$DeviceContact$Email;
import com.revolut.feature.contacts_chooser.api.navigation.ContactType$DeviceContact$Phone;
import com.revolut.feature.contacts_chooser.api.navigation.ContactsChooserBannerContent;
import com.revolut.feature.contacts_chooser.api.navigation.ContactsChooserEmptyState;
import com.revolut.feature.contacts_chooser.api.navigation.ContactsChooserInputData;
import com.revolut.feature.contacts_chooser.api.navigation.ContactsChooserMode;
import com.revolut.feature.contacts_chooser.api.navigation.ContactsPrimaryButtonClause;
import com.revolut.feature.contacts_chooser.impl.ui.ContactsChooserScreen;
import com.revolut.feature.payments.groups.api.R$string;
import hd.r;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import mq9.f;
import nd.o;
import os9.c;
import yr9.d;
import zhm.f0;
import zhm.v;
import zhm.w;

/* JADX INFO: loaded from: classes5.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r f168168a;

    public a(ln3.b contactsChooserNavigationScreenProvider, r groupContactSelectorContextFactory, b groupContactsFilterProvider) {
        Intrinsics.checkNotNullParameter(contactsChooserNavigationScreenProvider, "contactsChooserNavigationScreenProvider");
        Intrinsics.checkNotNullParameter(groupContactSelectorContextFactory, "groupContactSelectorContextFactory");
        Intrinsics.checkNotNullParameter(groupContactsFilterProvider, "groupContactsFilterProvider");
        this.f168168a = groupContactSelectorContextFactory;
    }

    public final ContactsChooserScreen a(List existingContacts, String groupId, xi0.b bVar, wi0.b bVar2) {
        ContactsFilter and;
        Intrinsics.checkNotNullParameter(existingContacts, "existingContacts");
        Intrinsics.checkNotNullParameter(groupId, "groupId");
        Intrinsics.checkNotNullParameter(existingContacts, "existingContacts");
        List list = existingContacts;
        ArrayList arrayList = new ArrayList(w.t(list, 10));
        Iterator it8 = list.iterator();
        while (it8.hasNext()) {
            arrayList.add(new ContactsFilter.Contact((zm3.a) it8.next()));
        }
        ContactsFilter.Companion companion = ContactsFilter.INSTANCE;
        ContactsFilter[] contactsFilterArr = (ContactsFilter[]) arrayList.toArray(new ContactsFilter[0]);
        ContactsFilter[] contactsFilterArr2 = (ContactsFilter[]) Arrays.copyOf(contactsFilterArr, contactsFilterArr.length);
        companion.getClass();
        ContactsFilter.Not notA = ContactsFilter.Companion.a(contactsFilterArr2);
        xi0.b.Companion.getClass();
        if (!Intrinsics.f(bVar, xi0.b.D) || bVar2 == null) {
            and = notA;
        } else {
            wi0.b.Companion.getClass();
            wi0.b bVar3 = wi0.b.A;
            and = new ContactsFilter.And(v.k(notA, bVar2.equals(bVar3) ? new ContactsFilter.Country(bVar3) : new ContactsFilter.Not(new ContactsFilter.Country(bVar3))));
        }
        ContactsChooserInputData contactsChooserInputData = new ContactsChooserInputData((Clause) new TextLocalisedClause(R$string.payments_groups_actions_add_members, null, null, 14), (Clause) new TextLocalisedClause(R$string.payments_groups_members_search_hint, null, null, 14), v.k(ContactType.RevolutContact.Local.f66038a, new ContactType.RevolutContact.Remote(0), ContactType$DeviceContact$Phone.f66036a, ContactType$DeviceContact$Email.f66035a, ContactType.UsernameContact.f66040a), (List) f0.f322471a, (ContactsChooserMode) new ContactsChooserMode.MultiSelect(null), true, false, false, true, and, (ContactsChooserBannerContent) null, (ContactsChooserEmptyState) null, (AnalyticsProduct) null, (Clause) new TextLocalisedClause(R$string.group_add_members_header_subtitle, null, null, 14), (Set) null, (ContactsPrimaryButtonClause) null, h.ALL_TOGETHER, 0, (Set) null, 908416);
        Intrinsics.checkNotNullParameter(groupId, "groupId");
        r rVar = this.f168168a;
        return ln3.b.b(contactsChooserInputData, new d((c) rVar.f151364a, groupId, (c70.a) rVar.f151365b, (o) rVar.f151366c, (f) rVar.d, (wj0.a) rVar.e, (f01.c) rVar.f));
    }
}
