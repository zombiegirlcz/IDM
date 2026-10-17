package com.revolut.feature.payments.bills_chooser.api.splits;

import android.os.Parcel;
import android.os.Parcelable;
import dj0.d;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"Lcom/revolut/feature/payments/bills_chooser/api/splits/MoneySplit;", "Landroid/os/Parcelable;", "Amount", "Percentage", "Lcom/revolut/feature/payments/bills_chooser/api/splits/MoneySplit$Amount;", "Lcom/revolut/feature/payments/bills_chooser/api/splits/MoneySplit$Percentage;", "feature_payments_bills_chooser_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface MoneySplit extends Parcelable {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/payments/bills_chooser/api/splits/MoneySplit$Amount;", "Lcom/revolut/feature/payments/bills_chooser/api/splits/MoneySplit;", "", "toString", "()Ljava/lang/String;", "feature_payments_bills_chooser_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Amount implements MoneySplit {

        @NotNull
        public static final Parcelable.Creator<Amount> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final SplitMemberType f79202a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f79203b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final d f79204c;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Amount((SplitMemberType) parcel.readParcelable(Amount.class.getClassLoader()), parcel.readInt() != 0, (d) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Amount[i];
            }
        }

        public Amount(SplitMemberType owner, boolean z, d amount) {
            Intrinsics.checkNotNullParameter(owner, "owner");
            Intrinsics.checkNotNullParameter(amount, "amount");
            this.f79202a = owner;
            this.f79203b = z;
            this.f79204c = amount;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Amount)) {
                return false;
            }
            Amount amount = (Amount) obj2;
            return Intrinsics.f(this.f79202a, amount.f79202a) && this.f79203b == amount.f79203b && Intrinsics.f(this.f79204c, amount.f79204c);
        }

        public final int hashCode() {
            return this.f79204c.hashCode() + j6.a.c(this.f79202a.hashCode() * 31, 31, this.f79203b);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f79202a, i);
            dest.writeInt(this.f79203b ? 1 : 0);
            dest.writeSerializable(this.f79204c);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/payments/bills_chooser/api/splits/MoneySplit$Percentage;", "Lcom/revolut/feature/payments/bills_chooser/api/splits/MoneySplit;", "", "toString", "()Ljava/lang/String;", "feature_payments_bills_chooser_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Percentage implements MoneySplit {

        @NotNull
        public static final Parcelable.Creator<Percentage> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final SplitMemberType f79205a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f79206b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f79207c;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Percentage((SplitMemberType) parcel.readParcelable(Percentage.class.getClassLoader()), parcel.readInt() != 0, parcel.readInt());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Percentage[i];
            }
        }

        public Percentage(SplitMemberType owner, boolean z, int i) {
            Intrinsics.checkNotNullParameter(owner, "owner");
            this.f79205a = owner;
            this.f79206b = z;
            this.f79207c = i;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Percentage)) {
                return false;
            }
            Percentage percentage = (Percentage) obj2;
            return Intrinsics.f(this.f79205a, percentage.f79205a) && this.f79206b == percentage.f79206b && this.f79207c == percentage.f79207c;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f79207c) + j6.a.c(this.f79205a.hashCode() * 31, 31, this.f79206b);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f79205a, i);
            dest.writeInt(this.f79206b ? 1 : 0);
            dest.writeInt(this.f79207c);
        }
    }
}
