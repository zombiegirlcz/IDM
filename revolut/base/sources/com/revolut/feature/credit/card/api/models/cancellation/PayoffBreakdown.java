package com.revolut.feature.credit.card.api.models.cancellation;

import android.os.Parcel;
import android.os.Parcelable;
import dj0.d;
import ip0.v7;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/card/api/models/cancellation/PayoffBreakdown;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_credit_card_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class PayoffBreakdown implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<PayoffBreakdown> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f68715a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d f68716b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final d f68717c;
    public final d d;
    public final d e;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new PayoffBreakdown((d) parcel.readSerializable(), (d) parcel.readSerializable(), (d) parcel.readSerializable(), (d) parcel.readSerializable(), (d) parcel.readSerializable());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new PayoffBreakdown[i];
        }
    }

    public PayoffBreakdown(d creditBalance, d dVar, d totalInterest, d pendingFees, d dVar2) {
        Intrinsics.checkNotNullParameter(creditBalance, "creditBalance");
        Intrinsics.checkNotNullParameter(totalInterest, "totalInterest");
        Intrinsics.checkNotNullParameter(pendingFees, "pendingFees");
        this.f68715a = creditBalance;
        this.f68716b = dVar;
        this.f68717c = totalInterest;
        this.d = pendingFees;
        this.e = dVar2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof PayoffBreakdown)) {
            return false;
        }
        PayoffBreakdown payoffBreakdown = (PayoffBreakdown) obj2;
        return Intrinsics.f(this.f68715a, payoffBreakdown.f68715a) && Intrinsics.f(this.f68716b, payoffBreakdown.f68716b) && Intrinsics.f(this.f68717c, payoffBreakdown.f68717c) && Intrinsics.f(this.d, payoffBreakdown.d) && Intrinsics.f(this.e, payoffBreakdown.e);
    }

    public final int hashCode() {
        int iHashCode = this.f68715a.hashCode() * 31;
        d dVar = this.f68716b;
        int iC = v7.c(v7.c((iHashCode + (dVar == null ? 0 : dVar.hashCode())) * 31, 31, this.f68717c), 31, this.d);
        d dVar2 = this.e;
        return iC + (dVar2 != null ? dVar2.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeSerializable(this.f68715a);
        dest.writeSerializable(this.f68716b);
        dest.writeSerializable(this.f68717c);
        dest.writeSerializable(this.d);
        dest.writeSerializable(this.e);
    }
}
