package com.revolut.feature.freelancer.common.models;

import android.os.Parcel;
import android.os.Parcelable;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/freelancer/common/models/FreelancerCashbackRates;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_freelancer_common_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class FreelancerCashbackRates implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<FreelancerCashbackRates> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinkedHashMap f73279a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final BigDecimal f73280b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            int i = parcel.readInt();
            LinkedHashMap linkedHashMap = new LinkedHashMap(i);
            for (int i2 = 0; i2 != i; i2++) {
                linkedHashMap.put(parcel.readString(), parcel.readSerializable());
            }
            return new FreelancerCashbackRates(linkedHashMap, (BigDecimal) parcel.readSerializable());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new FreelancerCashbackRates[i];
        }
    }

    public FreelancerCashbackRates(LinkedHashMap ratesPerPricingPlanCode, BigDecimal bigDecimal) {
        Intrinsics.checkNotNullParameter(ratesPerPricingPlanCode, "ratesPerPricingPlanCode");
        this.f73279a = ratesPerPricingPlanCode;
        this.f73280b = bigDecimal;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof FreelancerCashbackRates)) {
            return false;
        }
        FreelancerCashbackRates freelancerCashbackRates = (FreelancerCashbackRates) obj2;
        return this.f73279a.equals(freelancerCashbackRates.f73279a) && Intrinsics.f(this.f73280b, freelancerCashbackRates.f73280b);
    }

    public final int hashCode() {
        int iHashCode = this.f73279a.hashCode() * 31;
        BigDecimal bigDecimal = this.f73280b;
        return iHashCode + (bigDecimal == null ? 0 : bigDecimal.hashCode());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        LinkedHashMap linkedHashMap = this.f73279a;
        dest.writeInt(linkedHashMap.size());
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            dest.writeString((String) entry.getKey());
            dest.writeSerializable((Serializable) entry.getValue());
        }
        dest.writeSerializable(this.f73280b);
    }
}
