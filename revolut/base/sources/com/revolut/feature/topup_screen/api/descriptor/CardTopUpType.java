package com.revolut.feature.topup_screen.api.descriptor;

import android.os.Parcel;
import android.os.Parcelable;
import dj0.d;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"Lcom/revolut/feature/topup_screen/api/descriptor/CardTopUpType;", "Landroid/os/Parcelable;", "RegularTopUp", "PennyTopUp", "Lcom/revolut/feature/topup_screen/api/descriptor/CardTopUpType$PennyTopUp;", "Lcom/revolut/feature/topup_screen/api/descriptor/CardTopUpType$RegularTopUp;", "feature_topup_screen_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface CardTopUpType extends Parcelable {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/topup_screen/api/descriptor/CardTopUpType$PennyTopUp;", "Lcom/revolut/feature/topup_screen/api/descriptor/CardTopUpType;", "", "toString", "()Ljava/lang/String;", "feature_topup_screen_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class PennyTopUp implements CardTopUpType {

        @NotNull
        public static final Parcelable.Creator<PennyTopUp> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f90488a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new PennyTopUp(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new PennyTopUp[i];
            }
        }

        public PennyTopUp(String currency) {
            Intrinsics.checkNotNullParameter(currency, "currency");
            this.f90488a = currency;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof PennyTopUp) && Intrinsics.f(this.f90488a, ((PennyTopUp) obj2).f90488a);
        }

        public final int hashCode() {
            return this.f90488a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f90488a);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/topup_screen/api/descriptor/CardTopUpType$RegularTopUp;", "Lcom/revolut/feature/topup_screen/api/descriptor/CardTopUpType;", "", "toString", "()Ljava/lang/String;", "feature_topup_screen_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class RegularTopUp implements CardTopUpType {

        @NotNull
        public static final Parcelable.Creator<RegularTopUp> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final d f90489a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new RegularTopUp((d) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new RegularTopUp[i];
            }
        }

        public RegularTopUp(d amountMoney) {
            Intrinsics.checkNotNullParameter(amountMoney, "amountMoney");
            this.f90489a = amountMoney;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof RegularTopUp) && Intrinsics.f(this.f90489a, ((RegularTopUp) obj2).f90489a);
        }

        public final int hashCode() {
            return this.f90489a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f90489a);
        }
    }
}
