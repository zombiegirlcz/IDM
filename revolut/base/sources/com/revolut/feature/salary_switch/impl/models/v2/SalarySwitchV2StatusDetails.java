package com.revolut.feature.salary_switch.impl.models.v2;

import a0.d;
import android.os.Parcel;
import android.os.Parcelable;
import bqc.k;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kqc.g;
import kqc.h;
import m72.b;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0081\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/salary_switch/impl/models/v2/SalarySwitchV2StatusDetails;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_retail_salary_switch_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class SalarySwitchV2StatusDetails implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<SalarySwitchV2StatusDetails> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h f85251a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Institution f85252b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f85253c;
    public final String d;
    public final AccountIdentifier e;
    public final String f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Employer f85254g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final k f85255h;
    public final long i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Long f85256j;
    public final Long k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Long f85257l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final Long f85258m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final g f85259n;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new SalarySwitchV2StatusDetails(h.valueOf(parcel.readString()), Institution.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : AccountIdentifier.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readInt() == 0 ? null : Employer.CREATOR.createFromParcel(parcel), k.valueOf(parcel.readString()), parcel.readLong(), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readInt() != 0 ? g.valueOf(parcel.readString()) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new SalarySwitchV2StatusDetails[i];
        }
    }

    public SalarySwitchV2StatusDetails(h scheme, Institution sourceAgent, String str, String str2, AccountIdentifier accountIdentifier, String str3, Employer employer, k state, long j2, Long l2, Long l3, Long l4, Long l5, g gVar) {
        Intrinsics.checkNotNullParameter(scheme, "scheme");
        Intrinsics.checkNotNullParameter(sourceAgent, "sourceAgent");
        Intrinsics.checkNotNullParameter(state, "state");
        this.f85251a = scheme;
        this.f85252b = sourceAgent;
        this.f85253c = str;
        this.d = str2;
        this.e = accountIdentifier;
        this.f = str3;
        this.f85254g = employer;
        this.f85255h = state;
        this.i = j2;
        this.f85256j = l2;
        this.k = l3;
        this.f85257l = l4;
        this.f85258m = l5;
        this.f85259n = gVar;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof SalarySwitchV2StatusDetails)) {
            return false;
        }
        SalarySwitchV2StatusDetails salarySwitchV2StatusDetails = (SalarySwitchV2StatusDetails) obj2;
        return this.f85251a == salarySwitchV2StatusDetails.f85251a && Intrinsics.f(this.f85252b, salarySwitchV2StatusDetails.f85252b) && Intrinsics.f(this.f85253c, salarySwitchV2StatusDetails.f85253c) && Intrinsics.f(this.d, salarySwitchV2StatusDetails.d) && Intrinsics.f(this.e, salarySwitchV2StatusDetails.e) && Intrinsics.f(this.f, salarySwitchV2StatusDetails.f) && Intrinsics.f(this.f85254g, salarySwitchV2StatusDetails.f85254g) && this.f85255h == salarySwitchV2StatusDetails.f85255h && this.i == salarySwitchV2StatusDetails.i && Intrinsics.f(this.f85256j, salarySwitchV2StatusDetails.f85256j) && Intrinsics.f(this.k, salarySwitchV2StatusDetails.k) && Intrinsics.f(this.f85257l, salarySwitchV2StatusDetails.f85257l) && Intrinsics.f(this.f85258m, salarySwitchV2StatusDetails.f85258m) && this.f85259n == salarySwitchV2StatusDetails.f85259n;
    }

    public final int hashCode() {
        int iHashCode = (this.f85252b.hashCode() + (this.f85251a.hashCode() * 31)) * 31;
        String str = this.f85253c;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.d;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        AccountIdentifier accountIdentifier = this.e;
        int iHashCode4 = (iHashCode3 + (accountIdentifier == null ? 0 : accountIdentifier.hashCode())) * 31;
        String str3 = this.f;
        int iHashCode5 = (iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Employer employer = this.f85254g;
        int iC = d.c((this.f85255h.hashCode() + ((iHashCode5 + (employer == null ? 0 : employer.hashCode())) * 31)) * 31, 31, this.i);
        Long l2 = this.f85256j;
        int iHashCode6 = (iC + (l2 == null ? 0 : l2.hashCode())) * 31;
        Long l3 = this.k;
        int iHashCode7 = (iHashCode6 + (l3 == null ? 0 : l3.hashCode())) * 31;
        Long l4 = this.f85257l;
        int iHashCode8 = (iHashCode7 + (l4 == null ? 0 : l4.hashCode())) * 31;
        Long l5 = this.f85258m;
        int iHashCode9 = (iHashCode8 + (l5 == null ? 0 : l5.hashCode())) * 31;
        g gVar = this.f85259n;
        return iHashCode9 + (gVar != null ? gVar.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f85251a.name());
        this.f85252b.writeToParcel(dest, i);
        dest.writeString(this.f85253c);
        dest.writeString(this.d);
        AccountIdentifier accountIdentifier = this.e;
        if (accountIdentifier == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            accountIdentifier.writeToParcel(dest, i);
        }
        dest.writeString(this.f);
        Employer employer = this.f85254g;
        if (employer == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            employer.writeToParcel(dest, i);
        }
        dest.writeString(this.f85255h.name());
        dest.writeLong(this.i);
        Long l2 = this.f85256j;
        if (l2 == null) {
            dest.writeInt(0);
        } else {
            b.A(dest, 1, l2);
        }
        Long l3 = this.k;
        if (l3 == null) {
            dest.writeInt(0);
        } else {
            b.A(dest, 1, l3);
        }
        Long l4 = this.f85257l;
        if (l4 == null) {
            dest.writeInt(0);
        } else {
            b.A(dest, 1, l4);
        }
        Long l5 = this.f85258m;
        if (l5 == null) {
            dest.writeInt(0);
        } else {
            b.A(dest, 1, l5);
        }
        g gVar = this.f85259n;
        if (gVar == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(gVar.name());
        }
    }
}
