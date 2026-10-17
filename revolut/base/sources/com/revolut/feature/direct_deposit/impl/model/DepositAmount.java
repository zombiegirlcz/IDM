package com.revolut.feature.direct_deposit.impl.model;

import android.os.Parcel;
import android.os.Parcelable;
import dj0.d;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import xi0.b;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"Lcom/revolut/feature/direct_deposit/impl/model/DepositAmount;", "Landroid/os/Parcelable;", "<init>", "()V", "EntirePaycheck", "PercentageOfPaycheck", "FixedAmount", "Lcom/revolut/feature/direct_deposit/impl/model/DepositAmount$EntirePaycheck;", "Lcom/revolut/feature/direct_deposit/impl/model/DepositAmount$FixedAmount;", "Lcom/revolut/feature/direct_deposit/impl/model/DepositAmount$PercentageOfPaycheck;", "feature_direct_deposit_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class DepositAmount implements Parcelable {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/direct_deposit/impl/model/DepositAmount$EntirePaycheck;", "Lcom/revolut/feature/direct_deposit/impl/model/DepositAmount;", "<init>", "()V", "feature_direct_deposit_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class EntirePaycheck extends DepositAmount {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final EntirePaycheck f71945a = new EntirePaycheck();

        @NotNull
        public static final Parcelable.Creator<EntirePaycheck> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return EntirePaycheck.f71945a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new EntirePaycheck[i];
            }
        }

        private EntirePaycheck() {
        }

        @Override // com.revolut.feature.direct_deposit.impl.model.DepositAmount
        public final boolean a() {
            return true;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(1);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/direct_deposit/impl/model/DepositAmount$FixedAmount;", "Lcom/revolut/feature/direct_deposit/impl/model/DepositAmount;", "", "toString", "()Ljava/lang/String;", "feature_direct_deposit_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class FixedAmount extends DepositAmount {

        @NotNull
        public static final Parcelable.Creator<FixedAmount> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final d f71946a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new FixedAmount((d) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new FixedAmount[i];
            }
        }

        public FixedAmount() {
            this(0);
        }

        @Override // com.revolut.feature.direct_deposit.impl.model.DepositAmount
        public final boolean a() {
            return this.f71946a.f115082a > 0;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof FixedAmount) && Intrinsics.f(this.f71946a, ((FixedAmount) obj2).f71946a);
        }

        public final int hashCode() {
            return this.f71946a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f71946a);
        }

        public FixedAmount(d money) {
            Intrinsics.checkNotNullParameter(money, "money");
            this.f71946a = money;
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public FixedAmount(int i) {
            this(cp5.d.d0(b.i));
            b.Companion.getClass();
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/direct_deposit/impl/model/DepositAmount$PercentageOfPaycheck;", "Lcom/revolut/feature/direct_deposit/impl/model/DepositAmount;", "", "toString", "()Ljava/lang/String;", "feature_direct_deposit_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class PercentageOfPaycheck extends DepositAmount {

        @NotNull
        public static final Parcelable.Creator<PercentageOfPaycheck> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final double f71947a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new PercentageOfPaycheck(parcel.readDouble());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new PercentageOfPaycheck[i];
            }
        }

        public PercentageOfPaycheck() {
            this(0);
        }

        @Override // com.revolut.feature.direct_deposit.impl.model.DepositAmount
        public final boolean a() {
            double d = this.f71947a;
            return d >= 1.0d && d <= 100.0d;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof PercentageOfPaycheck) && Double.compare(this.f71947a, ((PercentageOfPaycheck) obj2).f71947a) == 0;
        }

        public final int hashCode() {
            return Double.hashCode(this.f71947a);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeDouble(this.f71947a);
        }

        public PercentageOfPaycheck(double d) {
            this.f71947a = d;
        }

        public /* synthetic */ PercentageOfPaycheck(int i) {
            this(100.0d);
        }
    }

    private DepositAmount() {
    }

    public abstract boolean a();
}
