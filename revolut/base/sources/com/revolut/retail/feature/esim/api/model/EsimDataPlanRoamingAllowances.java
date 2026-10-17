package com.revolut.retail.feature.esim.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import m72.b;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/esim/api/model/EsimDataPlanRoamingAllowances;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_retail_esim_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class EsimDataPlanRoamingAllowances implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<EsimDataPlanRoamingAllowances> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f100247a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Long f100248b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Long f100249c;
    public final Long d;
    public final boolean e;
    public final boolean f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f100250g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final EsimCoverage f100251h;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            boolean z;
            boolean z3;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String string = parcel.readString();
            Long lValueOf = parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong());
            Long lValueOf2 = parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong());
            Long lValueOf3 = parcel.readInt() != 0 ? Long.valueOf(parcel.readLong()) : null;
            boolean z4 = false;
            boolean z6 = true;
            if (parcel.readInt() != 0) {
                z = false;
                z4 = true;
            } else {
                z = false;
            }
            if (parcel.readInt() != 0) {
                z3 = true;
            } else {
                z3 = true;
                z6 = z;
            }
            if (parcel.readInt() == 0) {
                z3 = z;
            }
            return new EsimDataPlanRoamingAllowances(string, lValueOf, lValueOf2, lValueOf3, z4, z6, z3, (EsimCoverage) parcel.readParcelable(EsimDataPlanRoamingAllowances.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new EsimDataPlanRoamingAllowances[i];
        }
    }

    public EsimDataPlanRoamingAllowances(String name, Long l2, Long l3, Long l4, boolean z, boolean z3, boolean z4, EsimCoverage coverage) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(coverage, "coverage");
        this.f100247a = name;
        this.f100248b = l2;
        this.f100249c = l3;
        this.d = l4;
        this.e = z;
        this.f = z3;
        this.f100250g = z4;
        this.f100251h = coverage;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof EsimDataPlanRoamingAllowances)) {
            return false;
        }
        EsimDataPlanRoamingAllowances esimDataPlanRoamingAllowances = (EsimDataPlanRoamingAllowances) obj2;
        return Intrinsics.f(this.f100247a, esimDataPlanRoamingAllowances.f100247a) && Intrinsics.f(this.f100248b, esimDataPlanRoamingAllowances.f100248b) && Intrinsics.f(this.f100249c, esimDataPlanRoamingAllowances.f100249c) && Intrinsics.f(this.d, esimDataPlanRoamingAllowances.d) && this.e == esimDataPlanRoamingAllowances.e && this.f == esimDataPlanRoamingAllowances.f && this.f100250g == esimDataPlanRoamingAllowances.f100250g && Intrinsics.f(this.f100251h, esimDataPlanRoamingAllowances.f100251h);
    }

    public final int hashCode() {
        int iHashCode = this.f100247a.hashCode() * 31;
        Long l2 = this.f100248b;
        int iHashCode2 = (iHashCode + (l2 == null ? 0 : l2.hashCode())) * 31;
        Long l3 = this.f100249c;
        int iHashCode3 = (iHashCode2 + (l3 == null ? 0 : l3.hashCode())) * 31;
        Long l4 = this.d;
        return this.f100251h.hashCode() + j6.a.c(j6.a.c(j6.a.c((iHashCode3 + (l4 != null ? l4.hashCode() : 0)) * 31, 31, this.e), 31, this.f), 31, this.f100250g);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f100247a);
        Long l2 = this.f100248b;
        if (l2 == null) {
            dest.writeInt(0);
        } else {
            b.A(dest, 1, l2);
        }
        Long l3 = this.f100249c;
        if (l3 == null) {
            dest.writeInt(0);
        } else {
            b.A(dest, 1, l3);
        }
        Long l4 = this.d;
        if (l4 == null) {
            dest.writeInt(0);
        } else {
            b.A(dest, 1, l4);
        }
        dest.writeInt(this.e ? 1 : 0);
        dest.writeInt(this.f ? 1 : 0);
        dest.writeInt(this.f100250g ? 1 : 0);
        dest.writeParcelable(this.f100251h, i);
    }
}
