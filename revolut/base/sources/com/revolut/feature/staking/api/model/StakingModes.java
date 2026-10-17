package com.revolut.feature.staking.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import dj0.d;
import ip0.v7;
import java.math.BigDecimal;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001:\u0003\u0005\u0006\u0007J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\b"}, d2 = {"Lcom/revolut/feature/staking/api/model/StakingModes;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "StakingMode", "Manual", "Auto", "feature_staking_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class StakingModes implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<StakingModes> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Manual f88071a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Auto f88072b;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/staking/api/model/StakingModes$Auto;", "Lcom/revolut/feature/staking/api/model/StakingModes$StakingMode;", "", "toString", "()Ljava/lang/String;", "feature_staking_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Auto implements StakingMode {

        @NotNull
        public static final Parcelable.Creator<Auto> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final BigDecimal f88073a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f88074b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f88075c;
        public final boolean d;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Auto((BigDecimal) parcel.readSerializable(), parcel.readInt(), parcel.readInt(), parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Auto[i];
            }
        }

        public Auto(BigDecimal rate, int i, int i2, boolean z) {
            Intrinsics.checkNotNullParameter(rate, "rate");
            this.f88073a = rate;
            this.f88074b = i;
            this.f88075c = i2;
            this.d = z;
        }

        @Override // com.revolut.feature.staking.api.model.StakingModes.StakingMode
        /* JADX INFO: renamed from: A, reason: from getter */
        public final BigDecimal getF88076a() {
            return this.f88073a;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Auto)) {
                return false;
            }
            Auto auto = (Auto) obj2;
            return Intrinsics.f(this.f88073a, auto.f88073a) && this.f88074b == auto.f88074b && this.f88075c == auto.f88075c && this.d == auto.d;
        }

        @Override // com.revolut.feature.staking.api.model.StakingModes.StakingMode
        /* JADX INFO: renamed from: f2, reason: from getter */
        public final int getD() {
            return this.f88075c;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.d) + j6.a.b(this.f88075c, j6.a.b(this.f88074b, this.f88073a.hashCode() * 31, 31), 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f88073a);
            dest.writeInt(this.f88074b);
            dest.writeInt(this.f88075c);
            dest.writeInt(this.d ? 1 : 0);
        }

        @Override // com.revolut.feature.staking.api.model.StakingModes.StakingMode
        /* JADX INFO: renamed from: x8, reason: from getter */
        public final int getF88077b() {
            return this.f88074b;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/staking/api/model/StakingModes$Manual;", "Lcom/revolut/feature/staking/api/model/StakingModes$StakingMode;", "", "toString", "()Ljava/lang/String;", "feature_staking_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Manual implements StakingMode {

        @NotNull
        public static final Parcelable.Creator<Manual> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final BigDecimal f88076a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f88077b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f88078c;
        public final int d;
        public final d e;
        public final d f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final d f88079g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final d f88080h;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Manual((BigDecimal) parcel.readSerializable(), parcel.readInt(), parcel.readInt(), parcel.readInt(), (d) parcel.readSerializable(), (d) parcel.readSerializable(), (d) parcel.readSerializable(), (d) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Manual[i];
            }
        }

        public Manual(BigDecimal rate, int i, int i2, int i3, d minimumStakingAmount, d minimumTopUpAmount, d maximumStakingAmount, d minimumWithdrawAmount) {
            Intrinsics.checkNotNullParameter(rate, "rate");
            Intrinsics.checkNotNullParameter(minimumStakingAmount, "minimumStakingAmount");
            Intrinsics.checkNotNullParameter(minimumTopUpAmount, "minimumTopUpAmount");
            Intrinsics.checkNotNullParameter(maximumStakingAmount, "maximumStakingAmount");
            Intrinsics.checkNotNullParameter(minimumWithdrawAmount, "minimumWithdrawAmount");
            this.f88076a = rate;
            this.f88077b = i;
            this.f88078c = i2;
            this.d = i3;
            this.e = minimumStakingAmount;
            this.f = minimumTopUpAmount;
            this.f88079g = maximumStakingAmount;
            this.f88080h = minimumWithdrawAmount;
        }

        @Override // com.revolut.feature.staking.api.model.StakingModes.StakingMode
        /* JADX INFO: renamed from: A, reason: from getter */
        public final BigDecimal getF88076a() {
            return this.f88076a;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Manual)) {
                return false;
            }
            Manual manual = (Manual) obj2;
            return Intrinsics.f(this.f88076a, manual.f88076a) && this.f88077b == manual.f88077b && this.f88078c == manual.f88078c && this.d == manual.d && Intrinsics.f(this.e, manual.e) && Intrinsics.f(this.f, manual.f) && Intrinsics.f(this.f88079g, manual.f88079g) && Intrinsics.f(this.f88080h, manual.f88080h);
        }

        @Override // com.revolut.feature.staking.api.model.StakingModes.StakingMode
        /* JADX INFO: renamed from: f2, reason: from getter */
        public final int getD() {
            return this.d;
        }

        public final int hashCode() {
            return this.f88080h.hashCode() + v7.c(v7.c(v7.c(j6.a.b(this.d, j6.a.b(this.f88078c, j6.a.b(this.f88077b, this.f88076a.hashCode() * 31, 31), 31), 31), 31, this.e), 31, this.f), 31, this.f88079g);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f88076a);
            dest.writeInt(this.f88077b);
            dest.writeInt(this.f88078c);
            dest.writeInt(this.d);
            dest.writeSerializable(this.e);
            dest.writeSerializable(this.f);
            dest.writeSerializable(this.f88079g);
            dest.writeSerializable(this.f88080h);
        }

        @Override // com.revolut.feature.staking.api.model.StakingModes.StakingMode
        /* JADX INFO: renamed from: x8, reason: from getter */
        public final int getF88077b() {
            return this.f88077b;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001\u0082\u0001\u0002\u0002\u0003¨\u0006\u0004À\u0006\u0003"}, d2 = {"Lcom/revolut/feature/staking/api/model/StakingModes$StakingMode;", "Landroid/os/Parcelable;", "Lcom/revolut/feature/staking/api/model/StakingModes$Auto;", "Lcom/revolut/feature/staking/api/model/StakingModes$Manual;", "feature_staking_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface StakingMode extends Parcelable {
        /* JADX INFO: renamed from: A */
        BigDecimal getF88076a();

        /* JADX INFO: renamed from: f2 */
        int getD();

        /* JADX INFO: renamed from: x8 */
        int getF88077b();
    }

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new StakingModes(parcel.readInt() == 0 ? null : Manual.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? Auto.CREATOR.createFromParcel(parcel) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new StakingModes[i];
        }
    }

    public StakingModes(Manual manual, Auto auto) {
        this.f88071a = manual;
        this.f88072b = auto;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof StakingModes)) {
            return false;
        }
        StakingModes stakingModes = (StakingModes) obj2;
        return Intrinsics.f(this.f88071a, stakingModes.f88071a) && Intrinsics.f(this.f88072b, stakingModes.f88072b);
    }

    public final int hashCode() {
        Manual manual = this.f88071a;
        int iHashCode = (manual == null ? 0 : manual.hashCode()) * 31;
        Auto auto = this.f88072b;
        return iHashCode + (auto != null ? auto.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        Manual manual = this.f88071a;
        if (manual == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            manual.writeToParcel(dest, i);
        }
        Auto auto = this.f88072b;
        if (auto == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            auto.writeToParcel(dest, i);
        }
    }
}
