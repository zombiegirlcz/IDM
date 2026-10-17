package com.revolut.feature.salary_switch.impl.models.v2;

import a0.d;
import android.os.Parcel;
import android.os.Parcelable;
import bqc.k;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kqc.g;
import m72.b;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0081\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/salary_switch/impl/models/v2/SalarySwitchV2StatusSummary;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_retail_salary_switch_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class SalarySwitchV2StatusSummary implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<SalarySwitchV2StatusSummary> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f85260a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k f85261b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f85262c;
    public final Long d;
    public final String e;
    public final Employer f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Long f85263g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Long f85264h;
    public final g i;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new SalarySwitchV2StatusSummary(parcel.readString(), k.valueOf(parcel.readString()), parcel.readLong(), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readString(), parcel.readInt() == 0 ? null : Employer.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readInt() != 0 ? g.valueOf(parcel.readString()) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new SalarySwitchV2StatusSummary[i];
        }
    }

    public SalarySwitchV2StatusSummary(String id10, k state, long j2, Long l2, String str, Employer employer, Long l3, Long l4, g gVar) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(state, "state");
        this.f85260a = id10;
        this.f85261b = state;
        this.f85262c = j2;
        this.d = l2;
        this.e = str;
        this.f = employer;
        this.f85263g = l3;
        this.f85264h = l4;
        this.i = gVar;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof SalarySwitchV2StatusSummary)) {
            return false;
        }
        SalarySwitchV2StatusSummary salarySwitchV2StatusSummary = (SalarySwitchV2StatusSummary) obj2;
        return Intrinsics.f(this.f85260a, salarySwitchV2StatusSummary.f85260a) && this.f85261b == salarySwitchV2StatusSummary.f85261b && this.f85262c == salarySwitchV2StatusSummary.f85262c && Intrinsics.f(this.d, salarySwitchV2StatusSummary.d) && Intrinsics.f(this.e, salarySwitchV2StatusSummary.e) && Intrinsics.f(this.f, salarySwitchV2StatusSummary.f) && Intrinsics.f(this.f85263g, salarySwitchV2StatusSummary.f85263g) && Intrinsics.f(this.f85264h, salarySwitchV2StatusSummary.f85264h) && this.i == salarySwitchV2StatusSummary.i;
    }

    public final int hashCode() {
        int iC = d.c((this.f85261b.hashCode() + (this.f85260a.hashCode() * 31)) * 31, 31, this.f85262c);
        Long l2 = this.d;
        int iHashCode = (iC + (l2 == null ? 0 : l2.hashCode())) * 31;
        String str = this.e;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Employer employer = this.f;
        int iHashCode3 = (iHashCode2 + (employer == null ? 0 : employer.hashCode())) * 31;
        Long l3 = this.f85263g;
        int iHashCode4 = (iHashCode3 + (l3 == null ? 0 : l3.hashCode())) * 31;
        Long l4 = this.f85264h;
        int iHashCode5 = (iHashCode4 + (l4 == null ? 0 : l4.hashCode())) * 31;
        g gVar = this.i;
        return iHashCode5 + (gVar != null ? gVar.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f85260a);
        dest.writeString(this.f85261b.name());
        dest.writeLong(this.f85262c);
        Long l2 = this.d;
        if (l2 == null) {
            dest.writeInt(0);
        } else {
            b.A(dest, 1, l2);
        }
        dest.writeString(this.e);
        Employer employer = this.f;
        if (employer == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            employer.writeToParcel(dest, i);
        }
        Long l3 = this.f85263g;
        if (l3 == null) {
            dest.writeInt(0);
        } else {
            b.A(dest, 1, l3);
        }
        Long l4 = this.f85264h;
        if (l4 == null) {
            dest.writeInt(0);
        } else {
            b.A(dest, 1, l4);
        }
        g gVar = this.i;
        if (gVar == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(gVar.name());
        }
    }
}
