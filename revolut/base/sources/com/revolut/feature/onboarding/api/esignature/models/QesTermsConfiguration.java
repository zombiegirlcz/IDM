package com.revolut.feature.onboarding.api.esignature.models;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.data.database.models.openbanking.d;
import com.revolut.feature.onboarding.api.qes_terms.QesTermsAuthenticationMethod;
import ehe.n;
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

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/onboarding/api/esignature/models/QesTermsConfiguration;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_retail_onboarding_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class QesTermsConfiguration implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<QesTermsConfiguration> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Clause f78154a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Clause f78155b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f78156c;
    public final List d;
    public final QesTermsAuthenticationMethod e;
    public final boolean f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final List f78157g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final List f78158h;
    public final List i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Set f78159j;
    public final boolean k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Clause f78160l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final Clause f78161m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final Clause f78162n;
    public final QesTermsAcknowledgementSection o;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Clause clause = (Clause) j6.a.f(parcel, "parcel", QesTermsConfiguration.class);
            Clause clause2 = (Clause) parcel.readParcelable(QesTermsConfiguration.class.getClassLoader());
            int i = parcel.readInt();
            int i2 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i2);
            int iE = 0;
            while (iE != i2) {
                iE = j6.a.e(QesTermsConfiguration.class, parcel, arrayList, iE, 1);
            }
            QesTermsAuthenticationMethod qesTermsAuthenticationMethod = (QesTermsAuthenticationMethod) parcel.readParcelable(QesTermsConfiguration.class.getClassLoader());
            boolean z = parcel.readInt() != 0;
            int i3 = parcel.readInt();
            ArrayList arrayList2 = new ArrayList(i3);
            int iE2 = 0;
            while (iE2 != i3) {
                iE2 = j6.a.e(QesTermsConfiguration.class, parcel, arrayList2, iE2, 1);
            }
            int i5 = parcel.readInt();
            ArrayList arrayList3 = new ArrayList(i5);
            int iE3 = 0;
            while (iE3 != i5) {
                iE3 = j6.a.e(QesTermsConfiguration.class, parcel, arrayList3, iE3, 1);
            }
            int i6 = parcel.readInt();
            ArrayList arrayList4 = new ArrayList(i6);
            int iE4 = 0;
            while (iE4 != i6) {
                iE4 = j6.a.e(QesTermsConfiguration.class, parcel, arrayList4, iE4, 1);
            }
            int i21 = parcel.readInt();
            LinkedHashSet linkedHashSet = new LinkedHashSet(i21);
            int iE5 = 0;
            while (iE5 != i21) {
                iE5 = d.e(QesTermsConfiguration.class, parcel, linkedHashSet, iE5, 1);
            }
            return new QesTermsConfiguration(clause, clause2, i, arrayList, qesTermsAuthenticationMethod, z, arrayList2, arrayList3, arrayList4, linkedHashSet, parcel.readInt() != 0, (Clause) parcel.readParcelable(QesTermsConfiguration.class.getClassLoader()), (Clause) parcel.readParcelable(QesTermsConfiguration.class.getClassLoader()), (Clause) parcel.readParcelable(QesTermsConfiguration.class.getClassLoader()), parcel.readInt() == 0 ? null : QesTermsAcknowledgementSection.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new QesTermsConfiguration[i];
        }
    }

    public QesTermsConfiguration(Clause title, Clause clause, int i, List disclaimers, QesTermsAuthenticationMethod authenticationMethod, boolean z, List termsToSignTypes, List optionalTermsToSignTypes, List termsToAcceptTypes, Set preselectedTermsTypes, boolean z3, Clause mainButtonText, Clause clause2, Clause consentDisclosuresSubHeader, QesTermsAcknowledgementSection qesTermsAcknowledgementSection) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(disclaimers, "disclaimers");
        Intrinsics.checkNotNullParameter(authenticationMethod, "authenticationMethod");
        Intrinsics.checkNotNullParameter(termsToSignTypes, "termsToSignTypes");
        Intrinsics.checkNotNullParameter(optionalTermsToSignTypes, "optionalTermsToSignTypes");
        Intrinsics.checkNotNullParameter(termsToAcceptTypes, "termsToAcceptTypes");
        Intrinsics.checkNotNullParameter(preselectedTermsTypes, "preselectedTermsTypes");
        Intrinsics.checkNotNullParameter(mainButtonText, "mainButtonText");
        Intrinsics.checkNotNullParameter(consentDisclosuresSubHeader, "consentDisclosuresSubHeader");
        this.f78154a = title;
        this.f78155b = clause;
        this.f78156c = i;
        this.d = disclaimers;
        this.e = authenticationMethod;
        this.f = z;
        this.f78157g = termsToSignTypes;
        this.f78158h = optionalTermsToSignTypes;
        this.i = termsToAcceptTypes;
        this.f78159j = preselectedTermsTypes;
        this.k = z3;
        this.f78160l = mainButtonText;
        this.f78161m = clause2;
        this.f78162n = consentDisclosuresSubHeader;
        this.o = qesTermsAcknowledgementSection;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof QesTermsConfiguration)) {
            return false;
        }
        QesTermsConfiguration qesTermsConfiguration = (QesTermsConfiguration) obj2;
        return Intrinsics.f(this.f78154a, qesTermsConfiguration.f78154a) && Intrinsics.f(this.f78155b, qesTermsConfiguration.f78155b) && this.f78156c == qesTermsConfiguration.f78156c && Intrinsics.f(this.d, qesTermsConfiguration.d) && Intrinsics.f(this.e, qesTermsConfiguration.e) && this.f == qesTermsConfiguration.f && Intrinsics.f(this.f78157g, qesTermsConfiguration.f78157g) && Intrinsics.f(this.f78158h, qesTermsConfiguration.f78158h) && Intrinsics.f(this.i, qesTermsConfiguration.i) && Intrinsics.f(this.f78159j, qesTermsConfiguration.f78159j) && this.k == qesTermsConfiguration.k && Intrinsics.f(this.f78160l, qesTermsConfiguration.f78160l) && Intrinsics.f(this.f78161m, qesTermsConfiguration.f78161m) && Intrinsics.f(this.f78162n, qesTermsConfiguration.f78162n) && Intrinsics.f(this.o, qesTermsConfiguration.o);
    }

    public final int hashCode() {
        int iHashCode = this.f78154a.hashCode() * 31;
        Clause clause = this.f78155b;
        int iA = p.a.a(j6.a.c(p.a.f(p.a.d(p.a.d(p.a.d(j6.a.c((this.e.hashCode() + p.a.d(j6.a.b(this.f78156c, (iHashCode + (clause == null ? 0 : clause.hashCode())) * 31, 31), 31, this.d)) * 31, 31, this.f), 31, this.f78157g), 31, this.f78158h), 31, this.i), 31, this.f78159j), 31, this.k), 31, this.f78160l);
        Clause clause2 = this.f78161m;
        int iA2 = p.a.a((iA + (clause2 == null ? 0 : clause2.hashCode())) * 31, 31, this.f78162n);
        QesTermsAcknowledgementSection qesTermsAcknowledgementSection = this.o;
        return iA2 + (qesTermsAcknowledgementSection != null ? qesTermsAcknowledgementSection.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f78154a, i);
        dest.writeParcelable(this.f78155b, i);
        dest.writeInt(this.f78156c);
        Iterator itV = p.a.v(this.d, dest);
        while (itV.hasNext()) {
            dest.writeParcelable((Parcelable) itV.next(), i);
        }
        dest.writeParcelable(this.e, i);
        dest.writeInt(this.f ? 1 : 0);
        Iterator itV2 = p.a.v(this.f78157g, dest);
        while (itV2.hasNext()) {
            dest.writeParcelable((Parcelable) itV2.next(), i);
        }
        Iterator itV3 = p.a.v(this.f78158h, dest);
        while (itV3.hasNext()) {
            dest.writeParcelable((Parcelable) itV3.next(), i);
        }
        Iterator itV4 = p.a.v(this.i, dest);
        while (itV4.hasNext()) {
            dest.writeParcelable((Parcelable) itV4.next(), i);
        }
        Iterator itV5 = n.v(this.f78159j, dest);
        while (itV5.hasNext()) {
            dest.writeParcelable((Parcelable) itV5.next(), i);
        }
        dest.writeInt(this.k ? 1 : 0);
        dest.writeParcelable(this.f78160l, i);
        dest.writeParcelable(this.f78161m, i);
        dest.writeParcelable(this.f78162n, i);
        QesTermsAcknowledgementSection qesTermsAcknowledgementSection = this.o;
        if (qesTermsAcknowledgementSection == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            qesTermsAcknowledgementSection.writeToParcel(dest, i);
        }
    }

    public QesTermsConfiguration(TextLocalisedClause textLocalisedClause, TextLocalisedClause textLocalisedClause2, int i, List list, QesTermsAuthenticationMethod qesTermsAuthenticationMethod, boolean z, List list2, List list3, List list4, Set set, TextLocalisedClause textLocalisedClause3, TextLocalisedClause textLocalisedClause4, TextLocalisedClause textLocalisedClause5, QesTermsAcknowledgementSection qesTermsAcknowledgementSection, int i2) {
        this(textLocalisedClause, textLocalisedClause2, i, list, qesTermsAuthenticationMethod, (i2 & 32) != 0 ? false : z, list2, (i2 & 128) != 0 ? f0.f322471a : list3, list4, (i2 & 512) != 0 ? h0.f322473a : set, (i2 & 1024) != 0, textLocalisedClause3, (i2 & 4096) != 0 ? null : textLocalisedClause4, textLocalisedClause5, (i2 & 16384) != 0 ? null : qesTermsAcknowledgementSection);
    }
}
