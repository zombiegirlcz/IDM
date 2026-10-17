package com.revolut.feature.atm.impl.ui.redesign.details;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.navigable.flow.FlowStep;
import dj0.d;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import tj2.c;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0005\u0002\u0003\u0004\u0005\u0006\u0082\u0001\u0005\u0007\b\t\n\u000b¨\u0006\fÀ\u0006\u0003"}, d2 = {"com/revolut/feature/atm/impl/ui/redesign/details/AtmDetailsBottomSheetContract$ModalStep", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "ExchangeFee", "WithdrawalFee", "WeekendMarkup", "BackendDrivenBottomSheet", "WithdrawalLimits", "Lcom/revolut/feature/atm/impl/ui/redesign/details/AtmDetailsBottomSheetContract$ModalStep$BackendDrivenBottomSheet;", "Lcom/revolut/feature/atm/impl/ui/redesign/details/AtmDetailsBottomSheetContract$ModalStep$ExchangeFee;", "Lcom/revolut/feature/atm/impl/ui/redesign/details/AtmDetailsBottomSheetContract$ModalStep$WeekendMarkup;", "Lcom/revolut/feature/atm/impl/ui/redesign/details/AtmDetailsBottomSheetContract$ModalStep$WithdrawalFee;", "Lcom/revolut/feature/atm/impl/ui/redesign/details/AtmDetailsBottomSheetContract$ModalStep$WithdrawalLimits;", "feature_atm_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface AtmDetailsBottomSheetContract$ModalStep extends FlowStep {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/atm/impl/ui/redesign/details/AtmDetailsBottomSheetContract$ModalStep$BackendDrivenBottomSheet;", "Lcom/revolut/feature/atm/impl/ui/redesign/details/AtmDetailsBottomSheetContract$ModalStep;", "", "toString", "()Ljava/lang/String;", "feature_atm_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class BackendDrivenBottomSheet implements AtmDetailsBottomSheetContract$ModalStep {

        @NotNull
        public static final Parcelable.Creator<BackendDrivenBottomSheet> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f63157a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f63158b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new BackendDrivenBottomSheet(parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new BackendDrivenBottomSheet[i];
            }
        }

        public BackendDrivenBottomSheet(String bottomSheetId, String str) {
            Intrinsics.checkNotNullParameter(bottomSheetId, "bottomSheetId");
            this.f63157a = bottomSheetId;
            this.f63158b = str;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof BackendDrivenBottomSheet)) {
                return false;
            }
            BackendDrivenBottomSheet backendDrivenBottomSheet = (BackendDrivenBottomSheet) obj2;
            return Intrinsics.f(this.f63157a, backendDrivenBottomSheet.f63157a) && Intrinsics.f(this.f63158b, backendDrivenBottomSheet.f63158b);
        }

        public final int hashCode() {
            int iHashCode = this.f63157a.hashCode() * 31;
            String str = this.f63158b;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f63157a);
            dest.writeString(this.f63158b);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/atm/impl/ui/redesign/details/AtmDetailsBottomSheetContract$ModalStep$ExchangeFee;", "Lcom/revolut/feature/atm/impl/ui/redesign/details/AtmDetailsBottomSheetContract$ModalStep;", "<init>", "()V", "feature_atm_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class ExchangeFee implements AtmDetailsBottomSheetContract$ModalStep {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final ExchangeFee f63159a = new ExchangeFee();

        @NotNull
        public static final Parcelable.Creator<ExchangeFee> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return ExchangeFee.f63159a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ExchangeFee[i];
            }
        }

        private ExchangeFee() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/atm/impl/ui/redesign/details/AtmDetailsBottomSheetContract$ModalStep$WeekendMarkup;", "Lcom/revolut/feature/atm/impl/ui/redesign/details/AtmDetailsBottomSheetContract$ModalStep;", "<init>", "()V", "feature_atm_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class WeekendMarkup implements AtmDetailsBottomSheetContract$ModalStep {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final WeekendMarkup f63160a = new WeekendMarkup();

        @NotNull
        public static final Parcelable.Creator<WeekendMarkup> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return WeekendMarkup.f63160a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new WeekendMarkup[i];
            }
        }

        private WeekendMarkup() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/atm/impl/ui/redesign/details/AtmDetailsBottomSheetContract$ModalStep$WithdrawalFee;", "Lcom/revolut/feature/atm/impl/ui/redesign/details/AtmDetailsBottomSheetContract$ModalStep;", "<init>", "()V", "feature_atm_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class WithdrawalFee implements AtmDetailsBottomSheetContract$ModalStep {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final WithdrawalFee f63161a = new WithdrawalFee();

        @NotNull
        public static final Parcelable.Creator<WithdrawalFee> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return WithdrawalFee.f63161a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new WithdrawalFee[i];
            }
        }

        private WithdrawalFee() {
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/atm/impl/ui/redesign/details/AtmDetailsBottomSheetContract$ModalStep$WithdrawalLimits;", "Lcom/revolut/feature/atm/impl/ui/redesign/details/AtmDetailsBottomSheetContract$ModalStep;", "", "toString", "()Ljava/lang/String;", "feature_atm_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class WithdrawalLimits implements AtmDetailsBottomSheetContract$ModalStep {

        @NotNull
        public static final Parcelable.Creator<WithdrawalLimits> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final c f63162a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final d f63163b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new WithdrawalLimits(c.valueOf(parcel.readString()), (d) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new WithdrawalLimits[i];
            }
        }

        public WithdrawalLimits(c limitType, d limitAmount) {
            Intrinsics.checkNotNullParameter(limitType, "limitType");
            Intrinsics.checkNotNullParameter(limitAmount, "limitAmount");
            this.f63162a = limitType;
            this.f63163b = limitAmount;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof WithdrawalLimits)) {
                return false;
            }
            WithdrawalLimits withdrawalLimits = (WithdrawalLimits) obj2;
            return this.f63162a == withdrawalLimits.f63162a && Intrinsics.f(this.f63163b, withdrawalLimits.f63163b);
        }

        public final int hashCode() {
            return this.f63163b.hashCode() + (this.f63162a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f63162a.name());
            dest.writeSerializable(this.f63163b);
        }
    }
}
