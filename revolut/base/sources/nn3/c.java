package nn3;

import com.revolut.data.model.Data;
import com.revolut.feature.contacts_chooser.api.navigation.ContactsChooserBannerContent;
import com.revolut.feature.contacts_chooser.api.navigation.ContactsChooserEmptyState;
import com.revolut.feature.contacts_chooser.api.navigation.ContactsChooserMode;
import com.revolut.feature.contacts_chooser.api.navigation.ContactsPrimaryButtonClause;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class c implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f217438a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f217439b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f217440c;
    public final List d;
    public final ContactsChooserMode e;
    public final d f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final a f217441g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f217442h;
    public final boolean i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final ContactsChooserBannerContent f217443j;
    public final boolean k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final cn3.h f217444l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final ContactsChooserEmptyState f217445m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final int f217446n;
    public final ContactsPrimaryButtonClause o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final List f217447p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final Set f217448q;

    public c(Data contactsData, List selectedContacts, List revtagResultClicked, List contactTypes, ContactsChooserMode mode, d recipientsSelectionState, a aVar, boolean z, boolean z3, ContactsChooserBannerContent contactsChooserBannerContent, boolean z4, cn3.h contactsGrouping, ContactsChooserEmptyState emptyState, int i, ContactsPrimaryButtonClause contactsPrimaryButtonClause, List list, Set additionalConfiguration) {
        Intrinsics.checkNotNullParameter(contactsData, "contactsData");
        Intrinsics.checkNotNullParameter(selectedContacts, "selectedContacts");
        Intrinsics.checkNotNullParameter(revtagResultClicked, "revtagResultClicked");
        Intrinsics.checkNotNullParameter(contactTypes, "contactTypes");
        Intrinsics.checkNotNullParameter(mode, "mode");
        Intrinsics.checkNotNullParameter(recipientsSelectionState, "recipientsSelectionState");
        Intrinsics.checkNotNullParameter(contactsGrouping, "contactsGrouping");
        Intrinsics.checkNotNullParameter(emptyState, "emptyState");
        Intrinsics.checkNotNullParameter(additionalConfiguration, "additionalConfiguration");
        this.f217438a = contactsData;
        this.f217439b = selectedContacts;
        this.f217440c = revtagResultClicked;
        this.d = contactTypes;
        this.e = mode;
        this.f = recipientsSelectionState;
        this.f217441g = aVar;
        this.f217442h = z;
        this.i = z3;
        this.f217443j = contactsChooserBannerContent;
        this.k = z4;
        this.f217444l = contactsGrouping;
        this.f217445m = emptyState;
        this.f217446n = i;
        this.o = contactsPrimaryButtonClause;
        this.f217447p = list;
        this.f217448q = additionalConfiguration;
    }

    public static c a(c cVar, Data data, List list, ArrayList arrayList, d dVar, a aVar, boolean z, boolean z3, ContactsChooserBannerContent contactsChooserBannerContent, int i, List list2, int i2) {
        Data contactsData = (i2 & 1) != 0 ? cVar.f217438a : data;
        List selectedContacts = (i2 & 2) != 0 ? cVar.f217439b : list;
        List revtagResultClicked = (i2 & 4) != 0 ? cVar.f217440c : arrayList;
        List contactTypes = cVar.d;
        ContactsChooserMode mode = cVar.e;
        d recipientsSelectionState = (i2 & 32) != 0 ? cVar.f : dVar;
        a aVar2 = (i2 & 64) != 0 ? cVar.f217441g : aVar;
        boolean z4 = (i2 & 128) != 0 ? cVar.f217442h : z;
        boolean z6 = (i2 & 256) != 0 ? cVar.i : z3;
        ContactsChooserBannerContent contactsChooserBannerContent2 = (i2 & 512) != 0 ? cVar.f217443j : contactsChooserBannerContent;
        boolean z11 = cVar.k;
        cn3.h contactsGrouping = cVar.f217444l;
        ContactsChooserEmptyState emptyState = cVar.f217445m;
        int i3 = (i2 & 8192) != 0 ? cVar.f217446n : i;
        ContactsPrimaryButtonClause contactsPrimaryButtonClause = cVar.o;
        List list3 = (i2 & 32768) != 0 ? cVar.f217447p : list2;
        Set additionalConfiguration = cVar.f217448q;
        cVar.getClass();
        Intrinsics.checkNotNullParameter(contactsData, "contactsData");
        Intrinsics.checkNotNullParameter(selectedContacts, "selectedContacts");
        Intrinsics.checkNotNullParameter(revtagResultClicked, "revtagResultClicked");
        Intrinsics.checkNotNullParameter(contactTypes, "contactTypes");
        Intrinsics.checkNotNullParameter(mode, "mode");
        Intrinsics.checkNotNullParameter(recipientsSelectionState, "recipientsSelectionState");
        Intrinsics.checkNotNullParameter(contactsGrouping, "contactsGrouping");
        Intrinsics.checkNotNullParameter(emptyState, "emptyState");
        Intrinsics.checkNotNullParameter(additionalConfiguration, "additionalConfiguration");
        return new c(contactsData, selectedContacts, revtagResultClicked, contactTypes, mode, recipientsSelectionState, aVar2, z4, z6, contactsChooserBannerContent2, z11, contactsGrouping, emptyState, i3, contactsPrimaryButtonClause, list3, additionalConfiguration);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f217438a, cVar.f217438a) && Intrinsics.f(this.f217439b, cVar.f217439b) && Intrinsics.f(this.f217440c, cVar.f217440c) && Intrinsics.f(this.d, cVar.d) && Intrinsics.f(this.e, cVar.e) && this.f == cVar.f && this.f217441g == cVar.f217441g && this.f217442h == cVar.f217442h && this.i == cVar.i && Intrinsics.f(this.f217443j, cVar.f217443j) && this.k == cVar.k && this.f217444l == cVar.f217444l && Intrinsics.f(this.f217445m, cVar.f217445m) && this.f217446n == cVar.f217446n && Intrinsics.f(this.o, cVar.o) && Intrinsics.f(this.f217447p, cVar.f217447p) && Intrinsics.f(this.f217448q, cVar.f217448q);
    }

    public final int hashCode() {
        int iHashCode = (this.f.hashCode() + ((this.e.hashCode() + p.a.d(p.a.d(p.a.d(this.f217438a.hashCode() * 31, 31, this.f217439b), 31, this.f217440c), 31, this.d)) * 31)) * 31;
        a aVar = this.f217441g;
        int iC = j6.a.c(j6.a.c((iHashCode + (aVar == null ? 0 : aVar.hashCode())) * 31, 31, this.f217442h), 31, this.i);
        ContactsChooserBannerContent contactsChooserBannerContent = this.f217443j;
        int iB = j6.a.b(this.f217446n, (this.f217445m.hashCode() + ((this.f217444l.hashCode() + j6.a.c((iC + (contactsChooserBannerContent == null ? 0 : contactsChooserBannerContent.hashCode())) * 31, 31, this.k)) * 31)) * 31, 31);
        ContactsPrimaryButtonClause contactsPrimaryButtonClause = this.o;
        int iHashCode2 = (iB + (contactsPrimaryButtonClause == null ? 0 : contactsPrimaryButtonClause.hashCode())) * 31;
        List list = this.f217447p;
        return this.f217448q.hashCode() + ((iHashCode2 + (list != null ? list.hashCode() : 0)) * 31);
    }
}
