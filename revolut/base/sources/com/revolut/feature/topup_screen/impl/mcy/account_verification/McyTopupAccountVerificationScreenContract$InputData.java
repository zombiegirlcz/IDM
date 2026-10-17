package com.revolut.feature.topup_screen.impl.mcy.account_verification;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.domain.models.topup.methods.TopupMethodType;
import com.revolut.kompot.common.IOData$Input;
import dj0.d;
import ip0.v7;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"com/revolut/feature/topup_screen/impl/mcy/account_verification/McyTopupAccountVerificationScreenContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "FromTopUp", "FromDeeplink", "Lcom/revolut/feature/topup_screen/impl/mcy/account_verification/McyTopupAccountVerificationScreenContract$InputData$FromDeeplink;", "Lcom/revolut/feature/topup_screen/impl/mcy/account_verification/McyTopupAccountVerificationScreenContract$InputData$FromTopUp;", "feature_topup_screen_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface McyTopupAccountVerificationScreenContract$InputData extends IOData$Input {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/topup_screen/impl/mcy/account_verification/McyTopupAccountVerificationScreenContract$InputData$FromDeeplink;", "Lcom/revolut/feature/topup_screen/impl/mcy/account_verification/McyTopupAccountVerificationScreenContract$InputData;", "", "toString", "()Ljava/lang/String;", "feature_topup_screen_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class FromDeeplink implements McyTopupAccountVerificationScreenContract$InputData {

        @NotNull
        public static final Parcelable.Creator<FromDeeplink> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f91065a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final d f91066b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final TopupMethodType f91067c;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new FromDeeplink(parcel.readString(), (d) parcel.readSerializable(), TopupMethodType.valueOf(parcel.readString()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new FromDeeplink[i];
            }
        }

        public FromDeeplink(String id10, d amount, TopupMethodType topUpMethodType) {
            Intrinsics.checkNotNullParameter(id10, "id");
            Intrinsics.checkNotNullParameter(amount, "amount");
            Intrinsics.checkNotNullParameter(topUpMethodType, "topUpMethodType");
            this.f91065a = id10;
            this.f91066b = amount;
            this.f91067c = topUpMethodType;
        }

        @Override // com.revolut.feature.topup_screen.impl.mcy.account_verification.McyTopupAccountVerificationScreenContract$InputData
        /* JADX INFO: renamed from: I5, reason: from getter */
        public final TopupMethodType getF91069b() {
            return this.f91067c;
        }

        @Override // com.revolut.feature.topup_screen.impl.mcy.account_verification.McyTopupAccountVerificationScreenContract$InputData
        /* JADX INFO: renamed from: Z0, reason: from getter */
        public final d getF91068a() {
            return this.f91066b;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof FromDeeplink)) {
                return false;
            }
            FromDeeplink fromDeeplink = (FromDeeplink) obj2;
            return Intrinsics.f(this.f91065a, fromDeeplink.f91065a) && Intrinsics.f(this.f91066b, fromDeeplink.f91066b) && this.f91067c == fromDeeplink.f91067c;
        }

        public final int hashCode() {
            return this.f91067c.hashCode() + v7.c(this.f91065a.hashCode() * 31, 31, this.f91066b);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f91065a);
            dest.writeSerializable(this.f91066b);
            dest.writeString(this.f91067c.name());
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/topup_screen/impl/mcy/account_verification/McyTopupAccountVerificationScreenContract$InputData$FromTopUp;", "Lcom/revolut/feature/topup_screen/impl/mcy/account_verification/McyTopupAccountVerificationScreenContract$InputData;", "", "toString", "()Ljava/lang/String;", "feature_topup_screen_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class FromTopUp implements McyTopupAccountVerificationScreenContract$InputData {

        @NotNull
        public static final Parcelable.Creator<FromTopUp> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final d f91068a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final TopupMethodType f91069b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new FromTopUp(TopupMethodType.valueOf(parcel.readString()), (d) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new FromTopUp[i];
            }
        }

        public FromTopUp(TopupMethodType topUpMethodType, d amount) {
            Intrinsics.checkNotNullParameter(amount, "amount");
            Intrinsics.checkNotNullParameter(topUpMethodType, "topUpMethodType");
            this.f91068a = amount;
            this.f91069b = topUpMethodType;
        }

        @Override // com.revolut.feature.topup_screen.impl.mcy.account_verification.McyTopupAccountVerificationScreenContract$InputData
        /* JADX INFO: renamed from: I5, reason: from getter */
        public final TopupMethodType getF91069b() {
            return this.f91069b;
        }

        @Override // com.revolut.feature.topup_screen.impl.mcy.account_verification.McyTopupAccountVerificationScreenContract$InputData
        /* JADX INFO: renamed from: Z0, reason: from getter */
        public final d getF91068a() {
            return this.f91068a;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof FromTopUp)) {
                return false;
            }
            FromTopUp fromTopUp = (FromTopUp) obj2;
            return Intrinsics.f(this.f91068a, fromTopUp.f91068a) && this.f91069b == fromTopUp.f91069b;
        }

        public final int hashCode() {
            return this.f91069b.hashCode() + (this.f91068a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f91068a);
            dest.writeString(this.f91069b.name());
        }
    }

    /* JADX INFO: renamed from: I5 */
    TopupMethodType getF91069b();

    /* JADX INFO: renamed from: Z0 */
    d getF91068a();
}
