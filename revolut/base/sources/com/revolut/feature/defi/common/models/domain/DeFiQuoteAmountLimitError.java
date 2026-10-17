package com.revolut.feature.defi.common.models.domain;

import android.os.Parcel;
import android.os.Parcelable;
import dj0.d;
import ej0.b;
import ip0.v7;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0002\u0005\u0006¨\u0006\u0007À\u0006\u0003"}, d2 = {"Lcom/revolut/feature/defi/common/models/domain/DeFiQuoteAmountLimitError;", "Landroid/os/Parcelable;", "BelowMinimum", "AboveMaximum", "UsageLimit", "Lcom/revolut/feature/defi/common/models/domain/DeFiQuoteAmountLimitError$AboveMaximum;", "Lcom/revolut/feature/defi/common/models/domain/DeFiQuoteAmountLimitError$BelowMinimum;", "feature_defi_common_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface DeFiQuoteAmountLimitError extends Parcelable {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/defi/common/models/domain/DeFiQuoteAmountLimitError$AboveMaximum;", "Lcom/revolut/feature/defi/common/models/domain/DeFiQuoteAmountLimitError;", "", "toString", "()Ljava/lang/String;", "feature_defi_common_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class AboveMaximum implements DeFiQuoteAmountLimitError {

        @NotNull
        public static final Parcelable.Creator<AboveMaximum> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final b f71696a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final UsageLimit f71697b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new AboveMaximum((b) parcel.readSerializable(), parcel.readInt() == 0 ? null : UsageLimit.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new AboveMaximum[i];
            }
        }

        public AboveMaximum(b limit, UsageLimit usageLimit) {
            Intrinsics.checkNotNullParameter(limit, "limit");
            this.f71696a = limit;
            this.f71697b = usageLimit;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof AboveMaximum)) {
                return false;
            }
            AboveMaximum aboveMaximum = (AboveMaximum) obj2;
            return Intrinsics.f(this.f71696a, aboveMaximum.f71696a) && Intrinsics.f(this.f71697b, aboveMaximum.f71697b);
        }

        public final int hashCode() {
            int iHashCode = this.f71696a.hashCode() * 31;
            UsageLimit usageLimit = this.f71697b;
            return iHashCode + (usageLimit == null ? 0 : usageLimit.hashCode());
        }

        @Override // com.revolut.feature.defi.common.models.domain.DeFiQuoteAmountLimitError
        /* JADX INFO: renamed from: w, reason: from getter */
        public final b getF71698a() {
            return this.f71696a;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f71696a);
            UsageLimit usageLimit = this.f71697b;
            if (usageLimit == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                usageLimit.writeToParcel(dest, i);
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/defi/common/models/domain/DeFiQuoteAmountLimitError$BelowMinimum;", "Lcom/revolut/feature/defi/common/models/domain/DeFiQuoteAmountLimitError;", "", "toString", "()Ljava/lang/String;", "feature_defi_common_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class BelowMinimum implements DeFiQuoteAmountLimitError {

        @NotNull
        public static final Parcelable.Creator<BelowMinimum> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final b f71698a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new BelowMinimum((b) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new BelowMinimum[i];
            }
        }

        public BelowMinimum(b limit) {
            Intrinsics.checkNotNullParameter(limit, "limit");
            this.f71698a = limit;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof BelowMinimum) && Intrinsics.f(this.f71698a, ((BelowMinimum) obj2).f71698a);
        }

        public final int hashCode() {
            return this.f71698a.hashCode();
        }

        @Override // com.revolut.feature.defi.common.models.domain.DeFiQuoteAmountLimitError
        /* JADX INFO: renamed from: w, reason: from getter */
        public final b getF71698a() {
            return this.f71698a;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f71698a);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/defi/common/models/domain/DeFiQuoteAmountLimitError$UsageLimit;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "com/revolut/feature/defi/common/models/domain/a", "feature_defi_common_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class UsageLimit implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<UsageLimit> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final com.revolut.feature.defi.common.models.domain.a f71699a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final d f71700b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final d f71701c;
        public final d d;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new UsageLimit(com.revolut.feature.defi.common.models.domain.a.valueOf(parcel.readString()), (d) parcel.readSerializable(), (d) parcel.readSerializable(), (d) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new UsageLimit[i];
            }
        }

        public UsageLimit(com.revolut.feature.defi.common.models.domain.a type, d maximumTradeFiatAmount, d usage, d limit) {
            Intrinsics.checkNotNullParameter(type, "type");
            Intrinsics.checkNotNullParameter(maximumTradeFiatAmount, "maximumTradeFiatAmount");
            Intrinsics.checkNotNullParameter(usage, "usage");
            Intrinsics.checkNotNullParameter(limit, "limit");
            this.f71699a = type;
            this.f71700b = maximumTradeFiatAmount;
            this.f71701c = usage;
            this.d = limit;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof UsageLimit)) {
                return false;
            }
            UsageLimit usageLimit = (UsageLimit) obj2;
            return this.f71699a == usageLimit.f71699a && Intrinsics.f(this.f71700b, usageLimit.f71700b) && Intrinsics.f(this.f71701c, usageLimit.f71701c) && Intrinsics.f(this.d, usageLimit.d);
        }

        public final int hashCode() {
            return this.d.hashCode() + v7.c(v7.c(this.f71699a.hashCode() * 31, 31, this.f71700b), 31, this.f71701c);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f71699a.name());
            dest.writeSerializable(this.f71700b);
            dest.writeSerializable(this.f71701c);
            dest.writeSerializable(this.d);
        }
    }

    /* JADX INFO: renamed from: w */
    b getF71698a();
}
