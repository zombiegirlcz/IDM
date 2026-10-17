package com.revolut.feature.pricingplans.models;

import android.os.Parcel;
import android.os.Parcelable;
import hha.g;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.joda.time.Period;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/pricingplans/models/PricingPlanNextPlanInfo;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_pricing_plans_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class PricingPlanNextPlanInfo implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<PricingPlanNextPlanInfo> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f81118a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g f81119b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Period f81120c;
    public final Long d;
    public final Long e;
    public final boolean f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f81121g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Boolean f81122h;
    public final hha.e i;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            boolean z;
            boolean z3;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String string = parcel.readString();
            g gVar = (g) parcel.readSerializable();
            Period period = (Period) parcel.readSerializable();
            Boolean boolValueOf = null;
            Long lValueOf = parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong());
            Long lValueOf2 = parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong());
            if (parcel.readInt() != 0) {
                z3 = false;
                z = true;
            } else {
                z = false;
                z3 = false;
            }
            String string2 = parcel.readString();
            if (parcel.readInt() != 0) {
                boolValueOf = Boolean.valueOf(parcel.readInt() == 0 ? z3 : true);
            }
            return new PricingPlanNextPlanInfo(string, gVar, period, lValueOf, lValueOf2, z, string2, boolValueOf, hha.e.valueOf(parcel.readString()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new PricingPlanNextPlanInfo[i];
        }
    }

    public PricingPlanNextPlanInfo(String id10, g gVar, Period period, Long l2, Long l3, boolean z, String str, Boolean bool, hha.e accountType) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(accountType, "accountType");
        this.f81118a = id10;
        this.f81119b = gVar;
        this.f81120c = period;
        this.d = l2;
        this.e = l3;
        this.f = z;
        this.f81121g = str;
        this.f81122h = bool;
        this.i = accountType;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof PricingPlanNextPlanInfo)) {
            return false;
        }
        PricingPlanNextPlanInfo pricingPlanNextPlanInfo = (PricingPlanNextPlanInfo) obj2;
        return Intrinsics.f(this.f81118a, pricingPlanNextPlanInfo.f81118a) && Intrinsics.f(this.f81119b, pricingPlanNextPlanInfo.f81119b) && Intrinsics.f(this.f81120c, pricingPlanNextPlanInfo.f81120c) && Intrinsics.f(this.d, pricingPlanNextPlanInfo.d) && Intrinsics.f(this.e, pricingPlanNextPlanInfo.e) && this.f == pricingPlanNextPlanInfo.f && Intrinsics.f(this.f81121g, pricingPlanNextPlanInfo.f81121g) && Intrinsics.f(this.f81122h, pricingPlanNextPlanInfo.f81122h) && this.i == pricingPlanNextPlanInfo.i;
    }

    public final int hashCode() {
        int iHashCode = this.f81118a.hashCode() * 31;
        g gVar = this.f81119b;
        int iHashCode2 = (iHashCode + (gVar == null ? 0 : gVar.hashCode())) * 31;
        Period period = this.f81120c;
        int iHashCode3 = (iHashCode2 + (period == null ? 0 : period.hashCode())) * 31;
        Long l2 = this.d;
        int iHashCode4 = (iHashCode3 + (l2 == null ? 0 : l2.hashCode())) * 31;
        Long l3 = this.e;
        int iC = j6.a.c((iHashCode4 + (l3 == null ? 0 : l3.hashCode())) * 31, 31, this.f);
        String str = this.f81121g;
        int iHashCode5 = (iC + (str == null ? 0 : str.hashCode())) * 31;
        Boolean bool = this.f81122h;
        return this.i.hashCode() + ((iHashCode5 + (bool != null ? bool.hashCode() : 0)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f81118a);
        dest.writeSerializable(this.f81119b);
        dest.writeSerializable(this.f81120c);
        Long l2 = this.d;
        if (l2 == null) {
            dest.writeInt(0);
        } else {
            m72.b.A(dest, 1, l2);
        }
        Long l3 = this.e;
        if (l3 == null) {
            dest.writeInt(0);
        } else {
            m72.b.A(dest, 1, l3);
        }
        dest.writeInt(this.f ? 1 : 0);
        dest.writeString(this.f81121g);
        Boolean bool = this.f81122h;
        if (bool == null) {
            dest.writeInt(0);
        } else {
            p.a.A(dest, 1, bool);
        }
        dest.writeString(this.i.name());
    }
}
