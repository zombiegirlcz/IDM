package com.revolut.retail.feature.esim.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/esim/api/model/EsimSubscriptionPlanChange;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_retail_esim_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class EsimSubscriptionPlanChange implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<EsimSubscriptionPlanChange> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f100495a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f100496b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final EsimSubscriptionNextPlan f100497c;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new EsimSubscriptionPlanChange(parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() == 0 ? null : EsimSubscriptionNextPlan.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new EsimSubscriptionPlanChange[i];
        }
    }

    public EsimSubscriptionPlanChange(boolean z, boolean z3, EsimSubscriptionNextPlan esimSubscriptionNextPlan) {
        this.f100495a = z;
        this.f100496b = z3;
        this.f100497c = esimSubscriptionNextPlan;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof EsimSubscriptionPlanChange)) {
            return false;
        }
        EsimSubscriptionPlanChange esimSubscriptionPlanChange = (EsimSubscriptionPlanChange) obj2;
        return this.f100495a == esimSubscriptionPlanChange.f100495a && this.f100496b == esimSubscriptionPlanChange.f100496b && Intrinsics.f(this.f100497c, esimSubscriptionPlanChange.f100497c);
    }

    public final int hashCode() {
        int iC = j6.a.c(Boolean.hashCode(this.f100495a) * 31, 31, this.f100496b);
        EsimSubscriptionNextPlan esimSubscriptionNextPlan = this.f100497c;
        return iC + (esimSubscriptionNextPlan == null ? 0 : esimSubscriptionNextPlan.hashCode());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeInt(this.f100495a ? 1 : 0);
        dest.writeInt(this.f100496b ? 1 : 0);
        EsimSubscriptionNextPlan esimSubscriptionNextPlan = this.f100497c;
        if (esimSubscriptionNextPlan == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            esimSubscriptionNextPlan.writeToParcel(dest, i);
        }
    }
}
