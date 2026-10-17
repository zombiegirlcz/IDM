package com.revolut.feature.contacts_chooser.api.navigation;

import android.os.Parcel;
import android.os.Parcelable;
import cn3.h;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.data.database.models.openbanking.d;
import com.revolut.feature.contacts_chooser.api.models.ContactsFilter;
import com.revolut.feature.contacts_chooser.api.navigation.ContactsChooserEmptyState;
import com.revolut.feature.contacts_chooser.api.navigation.ContactsChooserMode;
import com.revolut.kompot.common.IOData$Input;
import ehe.n;
import grl.k9;
import h30.l;
import ip0.v7;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.f0;
import zhm.h0;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/contacts_chooser/api/navigation/ContactsChooserInputData;", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_contacts_chooser_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class ContactsChooserInputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<ContactsChooserInputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Clause f66062a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Clause f66063b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f66064c;
    public final List d;
    public final ContactsChooserMode e;
    public final boolean f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f66065g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f66066h;
    public final boolean i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final ContactsFilter f66067j;
    public final ContactsChooserBannerContent k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final ContactsChooserEmptyState f66068l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final AnalyticsProduct f66069m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final Clause f66070n;
    public final boolean o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final Set f66071p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final ContactsPrimaryButtonClause f66072q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final h f66073r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final int f66074s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final Set f66075t;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Clause clause = (Clause) j6.a.f(parcel, "parcel", ContactsChooserInputData.class);
            Clause clause2 = (Clause) parcel.readParcelable(ContactsChooserInputData.class.getClassLoader());
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            int iE = 0;
            while (iE != i) {
                iE = j6.a.e(ContactsChooserInputData.class, parcel, arrayList, iE, 1);
            }
            int i2 = parcel.readInt();
            ArrayList arrayList2 = new ArrayList(i2);
            int iC = 0;
            while (iC != i2) {
                iC = ch.qos.logback.core.util.a.c(parcel, arrayList2, iC, 1);
            }
            ContactsChooserMode contactsChooserMode = (ContactsChooserMode) parcel.readParcelable(ContactsChooserInputData.class.getClassLoader());
            boolean z = parcel.readInt() != 0;
            boolean z3 = parcel.readInt() != 0;
            boolean z4 = parcel.readInt() != 0;
            boolean z6 = parcel.readInt() != 0;
            ContactsFilter contactsFilter = (ContactsFilter) parcel.readParcelable(ContactsChooserInputData.class.getClassLoader());
            ContactsChooserBannerContent contactsChooserBannerContentCreateFromParcel = parcel.readInt() == 0 ? null : ContactsChooserBannerContent.CREATOR.createFromParcel(parcel);
            ContactsChooserEmptyState contactsChooserEmptyState = (ContactsChooserEmptyState) parcel.readParcelable(ContactsChooserInputData.class.getClassLoader());
            AnalyticsProduct analyticsProduct = (AnalyticsProduct) parcel.readParcelable(ContactsChooserInputData.class.getClassLoader());
            Clause clause3 = (Clause) parcel.readParcelable(ContactsChooserInputData.class.getClassLoader());
            boolean z11 = parcel.readInt() != 0;
            int i3 = parcel.readInt();
            LinkedHashSet linkedHashSet = new LinkedHashSet(i3);
            int iD = 0;
            while (iD != i3) {
                iD = v7.d(parcel, linkedHashSet, iD, 1);
                i3 = i3;
            }
            ContactsPrimaryButtonClause contactsPrimaryButtonClause = (ContactsPrimaryButtonClause) parcel.readParcelable(ContactsChooserInputData.class.getClassLoader());
            h hVarValueOf = h.valueOf(parcel.readString());
            int i5 = parcel.readInt();
            int i6 = parcel.readInt();
            LinkedHashSet linkedHashSet2 = new LinkedHashSet(i6);
            int iE2 = 0;
            while (iE2 != i6) {
                iE2 = d.e(ContactsChooserInputData.class, parcel, linkedHashSet2, iE2, 1);
                i6 = i6;
            }
            return new ContactsChooserInputData(clause, clause2, arrayList, arrayList2, contactsChooserMode, z, z3, z4, z6, contactsFilter, contactsChooserBannerContentCreateFromParcel, contactsChooserEmptyState, analyticsProduct, clause3, z11, linkedHashSet, contactsPrimaryButtonClause, hVarValueOf, i5, linkedHashSet2);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new ContactsChooserInputData[i];
        }
    }

    public ContactsChooserInputData(Clause titleClause, Clause searchHintClause, List contactTypes, List preselectedContacts, ContactsChooserMode mode, boolean z, boolean z3, boolean z4, boolean z6, ContactsFilter contactsFilter, ContactsChooserBannerContent contactsChooserBannerContent, ContactsChooserEmptyState emptyState, AnalyticsProduct analyticsProduct, Clause clause, boolean z11, Set transactionsCurrencies, ContactsPrimaryButtonClause contactsPrimaryButtonClause, h contactsGrouping, int i, Set additionalConfiguration) {
        Intrinsics.checkNotNullParameter(titleClause, "titleClause");
        Intrinsics.checkNotNullParameter(searchHintClause, "searchHintClause");
        Intrinsics.checkNotNullParameter(contactTypes, "contactTypes");
        Intrinsics.checkNotNullParameter(preselectedContacts, "preselectedContacts");
        Intrinsics.checkNotNullParameter(mode, "mode");
        Intrinsics.checkNotNullParameter(emptyState, "emptyState");
        Intrinsics.checkNotNullParameter(analyticsProduct, "analyticsProduct");
        Intrinsics.checkNotNullParameter(transactionsCurrencies, "transactionsCurrencies");
        Intrinsics.checkNotNullParameter(contactsGrouping, "contactsGrouping");
        Intrinsics.checkNotNullParameter(additionalConfiguration, "additionalConfiguration");
        this.f66062a = titleClause;
        this.f66063b = searchHintClause;
        this.f66064c = contactTypes;
        this.d = preselectedContacts;
        this.e = mode;
        this.f = z;
        this.f66065g = z3;
        this.f66066h = z4;
        this.i = z6;
        this.f66067j = contactsFilter;
        this.k = contactsChooserBannerContent;
        this.f66068l = emptyState;
        this.f66069m = analyticsProduct;
        this.f66070n = clause;
        this.o = z11;
        this.f66071p = transactionsCurrencies;
        this.f66072q = contactsPrimaryButtonClause;
        this.f66073r = contactsGrouping;
        this.f66074s = i;
        this.f66075t = additionalConfiguration;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof ContactsChooserInputData)) {
            return false;
        }
        ContactsChooserInputData contactsChooserInputData = (ContactsChooserInputData) obj2;
        return Intrinsics.f(this.f66062a, contactsChooserInputData.f66062a) && Intrinsics.f(this.f66063b, contactsChooserInputData.f66063b) && Intrinsics.f(this.f66064c, contactsChooserInputData.f66064c) && Intrinsics.f(this.d, contactsChooserInputData.d) && Intrinsics.f(this.e, contactsChooserInputData.e) && this.f == contactsChooserInputData.f && this.f66065g == contactsChooserInputData.f66065g && this.f66066h == contactsChooserInputData.f66066h && this.i == contactsChooserInputData.i && Intrinsics.f(this.f66067j, contactsChooserInputData.f66067j) && Intrinsics.f(this.k, contactsChooserInputData.k) && Intrinsics.f(this.f66068l, contactsChooserInputData.f66068l) && Intrinsics.f(this.f66069m, contactsChooserInputData.f66069m) && Intrinsics.f(this.f66070n, contactsChooserInputData.f66070n) && this.o == contactsChooserInputData.o && Intrinsics.f(this.f66071p, contactsChooserInputData.f66071p) && Intrinsics.f(this.f66072q, contactsChooserInputData.f66072q) && this.f66073r == contactsChooserInputData.f66073r && this.f66074s == contactsChooserInputData.f66074s && Intrinsics.f(this.f66075t, contactsChooserInputData.f66075t);
    }

    public final int hashCode() {
        int iC = j6.a.c(j6.a.c(j6.a.c(j6.a.c((this.e.hashCode() + p.a.d(p.a.d(p.a.a(this.f66062a.hashCode() * 31, 31, this.f66063b), 31, this.f66064c), 31, this.d)) * 31, 31, this.f), 31, this.f66065g), 31, this.f66066h), 31, this.i);
        ContactsFilter contactsFilter = this.f66067j;
        int iHashCode = (iC + (contactsFilter == null ? 0 : contactsFilter.hashCode())) * 31;
        ContactsChooserBannerContent contactsChooserBannerContent = this.k;
        int iA = l.a((this.f66068l.hashCode() + ((iHashCode + (contactsChooserBannerContent == null ? 0 : contactsChooserBannerContent.hashCode())) * 31)) * 31, 31, this.f66069m);
        Clause clause = this.f66070n;
        int iF = p.a.f(j6.a.c((iA + (clause == null ? 0 : clause.hashCode())) * 31, 31, this.o), 31, this.f66071p);
        ContactsPrimaryButtonClause contactsPrimaryButtonClause = this.f66072q;
        return this.f66075t.hashCode() + j6.a.b(this.f66074s, (this.f66073r.hashCode() + ((iF + (contactsPrimaryButtonClause != null ? contactsPrimaryButtonClause.hashCode() : 0)) * 31)) * 31, 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f66062a, i);
        dest.writeParcelable(this.f66063b, i);
        Iterator itV = p.a.v(this.f66064c, dest);
        while (itV.hasNext()) {
            dest.writeParcelable((Parcelable) itV.next(), i);
        }
        Iterator itV2 = p.a.v(this.d, dest);
        while (itV2.hasNext()) {
            dest.writeSerializable((Serializable) itV2.next());
        }
        dest.writeParcelable(this.e, i);
        dest.writeInt(this.f ? 1 : 0);
        dest.writeInt(this.f66065g ? 1 : 0);
        dest.writeInt(this.f66066h ? 1 : 0);
        dest.writeInt(this.i ? 1 : 0);
        dest.writeParcelable(this.f66067j, i);
        ContactsChooserBannerContent contactsChooserBannerContent = this.k;
        if (contactsChooserBannerContent == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            contactsChooserBannerContent.writeToParcel(dest, i);
        }
        dest.writeParcelable(this.f66068l, i);
        dest.writeParcelable(this.f66069m, i);
        dest.writeParcelable(this.f66070n, i);
        dest.writeInt(this.o ? 1 : 0);
        Iterator itV3 = n.v(this.f66071p, dest);
        while (itV3.hasNext()) {
            dest.writeSerializable((Serializable) itV3.next());
        }
        dest.writeParcelable(this.f66072q, i);
        dest.writeString(this.f66073r.name());
        dest.writeInt(this.f66074s);
        Iterator itV4 = n.v(this.f66075t, dest);
        while (itV4.hasNext()) {
            dest.writeParcelable((Parcelable) itV4.next(), i);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public ContactsChooserInputData(Clause clause, Clause clause2, List list, List list2, ContactsChooserMode contactsChooserMode, boolean z, boolean z3, boolean z4, boolean z6, ContactsFilter contactsFilter, ContactsChooserBannerContent contactsChooserBannerContent, ContactsChooserEmptyState contactsChooserEmptyState, AnalyticsProduct analyticsProduct, Clause clause3, Set set, ContactsPrimaryButtonClause contactsPrimaryButtonClause, h hVar, int i, Set set2, int i2) {
        AnalyticsProduct analyticsProductH;
        List list3 = (i2 & 8) != 0 ? f0.f322471a : list2;
        ContactsChooserMode multiSelect = (i2 & 16) != 0 ? new ContactsChooserMode.MultiSelect(null) : contactsChooserMode;
        boolean z11 = (i2 & 32) != 0 ? true : z;
        boolean z12 = (i2 & 64) != 0 ? true : z3;
        boolean z29 = (i2 & 128) != 0 ? false : z4;
        boolean z31 = (i2 & 256) != 0 ? false : z6;
        ContactsFilter contactsFilter2 = (i2 & 512) != 0 ? null : contactsFilter;
        ContactsChooserBannerContent contactsChooserBannerContent2 = (i2 & 1024) != 0 ? null : contactsChooserBannerContent;
        ContactsChooserEmptyState contactsChooserEmptyState2 = (i2 & 2048) != 0 ? new ContactsChooserEmptyState.Default(null, null) : contactsChooserEmptyState;
        if ((i2 & 4096) != 0) {
            k9 k9Var = k9.Payments;
            Parcelable.Creator<AnalyticsProduct.Retail> creator = AnalyticsProduct.Retail.CREATOR;
            analyticsProductH = com.google.android.gms.internal.mlkit_vision_face.a.h(k9Var, "value", k9Var);
        } else {
            analyticsProductH = analyticsProduct;
        }
        this(clause, clause2, list, list3, multiSelect, z11, z12, z29, z31, contactsFilter2, contactsChooserBannerContent2, contactsChooserEmptyState2, analyticsProductH, (i2 & 8192) != 0 ? null : clause3, (i2 & 16384) == 0, (32768 & i2) != 0 ? h0.f322473a : set, (65536 & i2) != 0 ? null : contactsPrimaryButtonClause, (131072 & i2) != 0 ? h.GROUPED_BY_FIRST_CHAR : hVar, (262144 & i2) != 0 ? R$drawable.uikit_icn_24_back_button_arrow : i, (i2 & 524288) != 0 ? h0.f322473a : set2);
    }
}
