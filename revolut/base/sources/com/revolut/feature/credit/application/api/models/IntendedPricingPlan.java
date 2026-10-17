package com.revolut.feature.credit.application.api.models;

import android.os.Parcel;
import android.os.Parcelable;
import hha.i;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/application/api/models/IntendedPricingPlan;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_credit_application_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class IntendedPricingPlan implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<IntendedPricingPlan> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f66194a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i f66195b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f66196c;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new IntendedPricingPlan(parcel.readInt() == 0 ? null : i.valueOf(parcel.readString()), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new IntendedPricingPlan[i];
        }
    }

    public IntendedPricingPlan(i iVar, String planId, String str) {
        Intrinsics.checkNotNullParameter(planId, "planId");
        this.f66194a = planId;
        this.f66195b = iVar;
        this.f66196c = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof IntendedPricingPlan)) {
            return false;
        }
        IntendedPricingPlan intendedPricingPlan = (IntendedPricingPlan) obj2;
        return Intrinsics.f(this.f66194a, intendedPricingPlan.f66194a) && this.f66195b == intendedPricingPlan.f66195b && Intrinsics.f(this.f66196c, intendedPricingPlan.f66196c);
    }

    public final int hashCode() {
        int iHashCode = this.f66194a.hashCode() * 31;
        i iVar = this.f66195b;
        int iHashCode2 = (iHashCode + (iVar == null ? 0 : iVar.hashCode())) * 31;
        String str = this.f66196c;
        return iHashCode2 + (str != null ? str.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f66194a);
        i iVar = this.f66195b;
        if (iVar == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(iVar.name());
        }
        dest.writeString(this.f66196c);
    }
}
