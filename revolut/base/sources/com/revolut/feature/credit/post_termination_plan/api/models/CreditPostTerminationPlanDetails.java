package com.revolut.feature.credit.post_termination_plan.api.models;

import android.os.Parcel;
import android.os.Parcelable;
import dj0.d;
import ia5.b;
import ip0.v7;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001:\u0002\u0005\u0006J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/credit/post_termination_plan/api/models/CreditPostTerminationPlanDetails;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "ia5/b", "ia5/a", "feature_credit_post_termination_plan_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CreditPostTerminationPlanDetails implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<CreditPostTerminationPlanDetails> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f70652a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f70653b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final d f70654c;
    public final d d;
    public final d e;
    public final Integer f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f70655g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ia5.a f70656h;
    public final CreditPostTerminationPlanRepaymentInfo i;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new CreditPostTerminationPlanDetails(parcel.readString(), b.valueOf(parcel.readString()), (d) parcel.readSerializable(), (d) parcel.readSerializable(), (d) parcel.readSerializable(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt(), ia5.a.valueOf(parcel.readString()), CreditPostTerminationPlanRepaymentInfo.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CreditPostTerminationPlanDetails[i];
        }
    }

    public CreditPostTerminationPlanDetails(String planId, b type, d amountDue, d dVar, d dVar2, Integer num, int i, ia5.a status, CreditPostTerminationPlanRepaymentInfo repaymentInfo) {
        Intrinsics.checkNotNullParameter(planId, "planId");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(amountDue, "amountDue");
        Intrinsics.checkNotNullParameter(status, "status");
        Intrinsics.checkNotNullParameter(repaymentInfo, "repaymentInfo");
        this.f70652a = planId;
        this.f70653b = type;
        this.f70654c = amountDue;
        this.d = dVar;
        this.e = dVar2;
        this.f = num;
        this.f70655g = i;
        this.f70656h = status;
        this.i = repaymentInfo;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof CreditPostTerminationPlanDetails)) {
            return false;
        }
        CreditPostTerminationPlanDetails creditPostTerminationPlanDetails = (CreditPostTerminationPlanDetails) obj2;
        return Intrinsics.f(this.f70652a, creditPostTerminationPlanDetails.f70652a) && this.f70653b == creditPostTerminationPlanDetails.f70653b && Intrinsics.f(this.f70654c, creditPostTerminationPlanDetails.f70654c) && Intrinsics.f(this.d, creditPostTerminationPlanDetails.d) && Intrinsics.f(this.e, creditPostTerminationPlanDetails.e) && Intrinsics.f(this.f, creditPostTerminationPlanDetails.f) && this.f70655g == creditPostTerminationPlanDetails.f70655g && this.f70656h == creditPostTerminationPlanDetails.f70656h && Intrinsics.f(this.i, creditPostTerminationPlanDetails.i);
    }

    public final int hashCode() {
        int iC = v7.c((this.f70653b.hashCode() + (this.f70652a.hashCode() * 31)) * 31, 31, this.f70654c);
        d dVar = this.d;
        int iHashCode = (iC + (dVar == null ? 0 : dVar.hashCode())) * 31;
        d dVar2 = this.e;
        int iHashCode2 = (iHashCode + (dVar2 == null ? 0 : dVar2.hashCode())) * 31;
        Integer num = this.f;
        return this.i.hashCode() + ((this.f70656h.hashCode() + j6.a.b(this.f70655g, (iHashCode2 + (num != null ? num.hashCode() : 0)) * 31, 31)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f70652a);
        dest.writeString(this.f70653b.name());
        dest.writeSerializable(this.f70654c);
        dest.writeSerializable(this.d);
        dest.writeSerializable(this.e);
        Integer num = this.f;
        if (num == null) {
            dest.writeInt(0);
        } else {
            p.a.B(dest, 1, num);
        }
        dest.writeInt(this.f70655g);
        dest.writeString(this.f70656h.name());
        this.i.writeToParcel(dest, i);
    }
}
