package com.revolut.feature.credit.post_termination_plan.api.models;

import android.os.Parcel;
import android.os.Parcelable;
import dj0.d;
import ip0.v7;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/post_termination_plan/api/models/CreditPostTerminationPlanRepaymentInfo;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_credit_post_termination_plan_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CreditPostTerminationPlanRepaymentInfo implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<CreditPostTerminationPlanRepaymentInfo> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f70657a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d f70658b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final d f70659c;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new CreditPostTerminationPlanRepaymentInfo((d) parcel.readSerializable(), (d) parcel.readSerializable(), (d) parcel.readSerializable());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CreditPostTerminationPlanRepaymentInfo[i];
        }
    }

    public CreditPostTerminationPlanRepaymentInfo(d minimumRepayment, d maximumRepayment, d dVar) {
        Intrinsics.checkNotNullParameter(minimumRepayment, "minimumRepayment");
        Intrinsics.checkNotNullParameter(maximumRepayment, "maximumRepayment");
        this.f70657a = minimumRepayment;
        this.f70658b = maximumRepayment;
        this.f70659c = dVar;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof CreditPostTerminationPlanRepaymentInfo)) {
            return false;
        }
        CreditPostTerminationPlanRepaymentInfo creditPostTerminationPlanRepaymentInfo = (CreditPostTerminationPlanRepaymentInfo) obj2;
        return Intrinsics.f(this.f70657a, creditPostTerminationPlanRepaymentInfo.f70657a) && Intrinsics.f(this.f70658b, creditPostTerminationPlanRepaymentInfo.f70658b) && Intrinsics.f(this.f70659c, creditPostTerminationPlanRepaymentInfo.f70659c);
    }

    public final int hashCode() {
        int iC = v7.c(this.f70657a.hashCode() * 31, 31, this.f70658b);
        d dVar = this.f70659c;
        return iC + (dVar == null ? 0 : dVar.hashCode());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeSerializable(this.f70657a);
        dest.writeSerializable(this.f70658b);
        dest.writeSerializable(this.f70659c);
    }
}
