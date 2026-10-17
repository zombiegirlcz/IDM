package com.revolut.feature.contacts_chooser.api.navigation;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.contacts_chooser.api.models.ContactsFilter;
import com.revolut.feature.contacts_chooser.api.navigation.ContactsChooserEmptyState;
import com.revolut.feature.contacts_chooser.api.navigation.ContactsChooserMode;
import grl.k9;
import h30.l;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.f0;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/contacts_chooser/api/navigation/ContactsChooserConfiguration;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_contacts_chooser_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class ContactsChooserConfiguration implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<ContactsChooserConfiguration> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f66045a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Clause f66046b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Clause f66047c;
    public final List d;
    public final List e;
    public final ContactsChooserMode f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f66048g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f66049h;
    public final boolean i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final boolean f66050j;
    public final ContactsFilter k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final ContactsChooserBannerContent f66051l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final ContactsChooserEmptyState f66052m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final AnalyticsProduct f66053n;
    public final boolean o;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            boolean z;
            boolean z3;
            boolean z4;
            boolean z6;
            boolean z11;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String string = parcel.readString();
            Clause clause = (Clause) parcel.readParcelable(ContactsChooserConfiguration.class.getClassLoader());
            Clause clause2 = (Clause) parcel.readParcelable(ContactsChooserConfiguration.class.getClassLoader());
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            int iE = 0;
            while (true) {
                z = true;
                if (iE == i) {
                    break;
                }
                iE = j6.a.e(ContactsChooserConfiguration.class, parcel, arrayList, iE, 1);
            }
            int i2 = parcel.readInt();
            ArrayList arrayList2 = new ArrayList(i2);
            int iC = 0;
            while (iC != i2) {
                iC = ch.qos.logback.core.util.a.c(parcel, arrayList2, iC, 1);
            }
            ContactsChooserMode contactsChooserMode = (ContactsChooserMode) parcel.readParcelable(ContactsChooserConfiguration.class.getClassLoader());
            if (parcel.readInt() != 0) {
                z3 = true;
            } else {
                z3 = true;
                z = false;
            }
            if (parcel.readInt() != 0) {
                z4 = z3;
            } else {
                z4 = z3;
                z3 = false;
            }
            if (parcel.readInt() != 0) {
                z6 = z4;
            } else {
                z6 = z4;
                z4 = false;
            }
            if (parcel.readInt() != 0) {
                z11 = z6;
            } else {
                z11 = z6;
                z6 = false;
            }
            return new ContactsChooserConfiguration(string, clause, clause2, arrayList, arrayList2, contactsChooserMode, z, z3, z4, z6, (ContactsFilter) parcel.readParcelable(ContactsChooserConfiguration.class.getClassLoader()), parcel.readInt() == 0 ? null : ContactsChooserBannerContent.CREATOR.createFromParcel(parcel), (ContactsChooserEmptyState) parcel.readParcelable(ContactsChooserConfiguration.class.getClassLoader()), (AnalyticsProduct) parcel.readParcelable(ContactsChooserConfiguration.class.getClassLoader()), parcel.readInt() != 0 ? z11 : false);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new ContactsChooserConfiguration[i];
        }
    }

    public ContactsChooserConfiguration(String requestId, Clause titleClause, Clause searchHintClause, List contactTypes, List preselectedContacts, ContactsChooserMode mode, boolean z, boolean z3, boolean z4, boolean z6, ContactsFilter contactsFilter, ContactsChooserBannerContent contactsChooserBannerContent, ContactsChooserEmptyState emptyState, AnalyticsProduct analyticsProduct, boolean z11) {
        Intrinsics.checkNotNullParameter(requestId, "requestId");
        Intrinsics.checkNotNullParameter(titleClause, "titleClause");
        Intrinsics.checkNotNullParameter(searchHintClause, "searchHintClause");
        Intrinsics.checkNotNullParameter(contactTypes, "contactTypes");
        Intrinsics.checkNotNullParameter(preselectedContacts, "preselectedContacts");
        Intrinsics.checkNotNullParameter(mode, "mode");
        Intrinsics.checkNotNullParameter(emptyState, "emptyState");
        Intrinsics.checkNotNullParameter(analyticsProduct, "analyticsProduct");
        this.f66045a = requestId;
        this.f66046b = titleClause;
        this.f66047c = searchHintClause;
        this.d = contactTypes;
        this.e = preselectedContacts;
        this.f = mode;
        this.f66048g = z;
        this.f66049h = z3;
        this.i = z4;
        this.f66050j = z6;
        this.k = contactsFilter;
        this.f66051l = contactsChooserBannerContent;
        this.f66052m = emptyState;
        this.f66053n = analyticsProduct;
        this.o = z11;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof ContactsChooserConfiguration)) {
            return false;
        }
        ContactsChooserConfiguration contactsChooserConfiguration = (ContactsChooserConfiguration) obj2;
        return Intrinsics.f(this.f66045a, contactsChooserConfiguration.f66045a) && Intrinsics.f(this.f66046b, contactsChooserConfiguration.f66046b) && Intrinsics.f(this.f66047c, contactsChooserConfiguration.f66047c) && Intrinsics.f(this.d, contactsChooserConfiguration.d) && Intrinsics.f(this.e, contactsChooserConfiguration.e) && Intrinsics.f(this.f, contactsChooserConfiguration.f) && this.f66048g == contactsChooserConfiguration.f66048g && this.f66049h == contactsChooserConfiguration.f66049h && this.i == contactsChooserConfiguration.i && this.f66050j == contactsChooserConfiguration.f66050j && Intrinsics.f(this.k, contactsChooserConfiguration.k) && Intrinsics.f(this.f66051l, contactsChooserConfiguration.f66051l) && Intrinsics.f(this.f66052m, contactsChooserConfiguration.f66052m) && Intrinsics.f(this.f66053n, contactsChooserConfiguration.f66053n) && this.o == contactsChooserConfiguration.o;
    }

    public final int hashCode() {
        int iC = j6.a.c(j6.a.c(j6.a.c(j6.a.c((this.f.hashCode() + p.a.d(p.a.d(p.a.a(p.a.a(this.f66045a.hashCode() * 31, 31, this.f66046b), 31, this.f66047c), 31, this.d), 31, this.e)) * 31, 31, this.f66048g), 31, this.f66049h), 31, this.i), 31, this.f66050j);
        ContactsFilter contactsFilter = this.k;
        int iHashCode = (iC + (contactsFilter == null ? 0 : contactsFilter.hashCode())) * 31;
        ContactsChooserBannerContent contactsChooserBannerContent = this.f66051l;
        return Boolean.hashCode(this.o) + l.a((this.f66052m.hashCode() + ((iHashCode + (contactsChooserBannerContent != null ? contactsChooserBannerContent.hashCode() : 0)) * 31)) * 31, 31, this.f66053n);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f66045a);
        dest.writeParcelable(this.f66046b, i);
        dest.writeParcelable(this.f66047c, i);
        Iterator itV = p.a.v(this.d, dest);
        while (itV.hasNext()) {
            dest.writeParcelable((Parcelable) itV.next(), i);
        }
        Iterator itV2 = p.a.v(this.e, dest);
        while (itV2.hasNext()) {
            dest.writeSerializable((Serializable) itV2.next());
        }
        dest.writeParcelable(this.f, i);
        dest.writeInt(this.f66048g ? 1 : 0);
        dest.writeInt(this.f66049h ? 1 : 0);
        dest.writeInt(this.i ? 1 : 0);
        dest.writeInt(this.f66050j ? 1 : 0);
        dest.writeParcelable(this.k, i);
        ContactsChooserBannerContent contactsChooserBannerContent = this.f66051l;
        if (contactsChooserBannerContent == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            contactsChooserBannerContent.writeToParcel(dest, i);
        }
        dest.writeParcelable(this.f66052m, i);
        dest.writeParcelable(this.f66053n, i);
        dest.writeInt(this.o ? 1 : 0);
    }

    public ContactsChooserConfiguration(String str, TextLocalisedClause textLocalisedClause, TextLocalisedClause textLocalisedClause2, List list, AnalyticsProduct.Retail retail, int i) {
        AnalyticsProduct.Retail retailH;
        f0 f0Var = f0.f322471a;
        ContactsChooserEmptyState.Default r132 = new ContactsChooserEmptyState.Default(null, null);
        if ((i & 8192) != 0) {
            k9 k9Var = k9.Payments;
            Parcelable.Creator<AnalyticsProduct.Retail> creator = AnalyticsProduct.Retail.CREATOR;
            retailH = com.google.android.gms.internal.mlkit_vision_face.a.h(k9Var, "value", k9Var);
        } else {
            retailH = retail;
        }
        this(str, textLocalisedClause, textLocalisedClause2, list, f0Var, ContactsChooserMode.SingleSelect.f66078a, false, false, false, false, null, null, r132, retailH, (i & 16384) == 0);
    }
}
