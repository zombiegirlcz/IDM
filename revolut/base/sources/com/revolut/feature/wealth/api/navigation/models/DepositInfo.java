package com.revolut.feature.wealth.api.navigation.models;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.retail.trading.core.domain.PocketInfo;
import dj0.d;
import java.time.LocalDate;
import k4l.c0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import wp5.y;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"Lcom/revolut/feature/wealth/api/navigation/models/DepositInfo;", "Landroid/os/Parcelable;", "OneOffDeposit", "RecurringDeposit", "Lcom/revolut/feature/wealth/api/navigation/models/DepositInfo$OneOffDeposit;", "Lcom/revolut/feature/wealth/api/navigation/models/DepositInfo$RecurringDeposit;", "feature_wealth_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface DepositInfo extends Parcelable {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/wealth/api/navigation/models/DepositInfo$OneOffDeposit;", "Lcom/revolut/feature/wealth/api/navigation/models/DepositInfo;", "", "toString", "()Ljava/lang/String;", "feature_wealth_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class OneOffDeposit implements DepositInfo {

        @NotNull
        public static final Parcelable.Creator<OneOffDeposit> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final d f95319a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final PocketInfo f95320b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new OneOffDeposit((d) parcel.readSerializable(), (PocketInfo) parcel.readParcelable(OneOffDeposit.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new OneOffDeposit[i];
            }
        }

        public OneOffDeposit(d amount, PocketInfo pocketInfo) {
            Intrinsics.checkNotNullParameter(amount, "amount");
            Intrinsics.checkNotNullParameter(pocketInfo, "pocketInfo");
            this.f95319a = amount;
            this.f95320b = pocketInfo;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof OneOffDeposit)) {
                return false;
            }
            OneOffDeposit oneOffDeposit = (OneOffDeposit) obj2;
            return Intrinsics.f(this.f95319a, oneOffDeposit.f95319a) && Intrinsics.f(this.f95320b, oneOffDeposit.f95320b);
        }

        @Override // com.revolut.feature.wealth.api.navigation.models.DepositInfo
        /* JADX INFO: renamed from: f, reason: from getter */
        public final d getF95321a() {
            return this.f95319a;
        }

        public final int hashCode() {
            return this.f95320b.hashCode() + (this.f95319a.hashCode() * 31);
        }

        @Override // com.revolut.feature.wealth.api.navigation.models.DepositInfo
        /* JADX INFO: renamed from: o9, reason: from getter */
        public final PocketInfo getF95322b() {
            return this.f95320b;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f95319a);
            dest.writeParcelable(this.f95320b, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/wealth/api/navigation/models/DepositInfo$RecurringDeposit;", "Lcom/revolut/feature/wealth/api/navigation/models/DepositInfo;", "", "toString", "()Ljava/lang/String;", "feature_wealth_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class RecurringDeposit implements DepositInfo {

        @NotNull
        public static final Parcelable.Creator<RecurringDeposit> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final d f95321a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final PocketInfo f95322b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final c0 f95323c;
        public final LocalDate d;
        public final String e;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new RecurringDeposit((d) parcel.readSerializable(), (PocketInfo) parcel.readParcelable(RecurringDeposit.class.getClassLoader()), c0.valueOf(parcel.readString()), (LocalDate) parcel.readSerializable(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new RecurringDeposit[i];
            }
        }

        public RecurringDeposit(d amount, PocketInfo pocketInfo, c0 period, LocalDate startDate, String str) {
            Intrinsics.checkNotNullParameter(amount, "amount");
            Intrinsics.checkNotNullParameter(pocketInfo, "pocketInfo");
            Intrinsics.checkNotNullParameter(period, "period");
            Intrinsics.checkNotNullParameter(startDate, "startDate");
            this.f95321a = amount;
            this.f95322b = pocketInfo;
            this.f95323c = period;
            this.d = startDate;
            this.e = str;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof RecurringDeposit)) {
                return false;
            }
            RecurringDeposit recurringDeposit = (RecurringDeposit) obj2;
            return Intrinsics.f(this.f95321a, recurringDeposit.f95321a) && Intrinsics.f(this.f95322b, recurringDeposit.f95322b) && this.f95323c == recurringDeposit.f95323c && Intrinsics.f(this.d, recurringDeposit.d) && Intrinsics.f(this.e, recurringDeposit.e);
        }

        @Override // com.revolut.feature.wealth.api.navigation.models.DepositInfo
        /* JADX INFO: renamed from: f, reason: from getter */
        public final d getF95321a() {
            return this.f95321a;
        }

        public final int hashCode() {
            int iA = y.a((this.f95323c.hashCode() + ((this.f95322b.hashCode() + (this.f95321a.hashCode() * 31)) * 31)) * 31, 31, this.d);
            String str = this.e;
            return iA + (str == null ? 0 : str.hashCode());
        }

        @Override // com.revolut.feature.wealth.api.navigation.models.DepositInfo
        /* JADX INFO: renamed from: o9, reason: from getter */
        public final PocketInfo getF95322b() {
            return this.f95322b;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f95321a);
            dest.writeParcelable(this.f95322b, i);
            dest.writeString(this.f95323c.name());
            dest.writeSerializable(this.d);
            dest.writeString(this.e);
        }
    }

    /* JADX INFO: renamed from: f */
    d getF95321a();

    /* JADX INFO: renamed from: o9 */
    PocketInfo getF95322b();
}
