package com.revolut.shared.feature.wealth.models.trading_accounts;

import android.os.Parcel;
import android.os.Parcelable;
import java.time.Instant;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/revolut/shared/feature/wealth/models/trading_accounts/Settings;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "BuyBlockSettings", "feature_shared_wealth_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class Settings implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<Settings> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BuyBlockSettings f105178a;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/shared/feature/wealth/models/trading_accounts/Settings$BuyBlockSettings;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_shared_wealth_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class BuyBlockSettings implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<BuyBlockSettings> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Boolean f105179a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Instant f105180b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Boolean boolValueOf;
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                if (parcel.readInt() == 0) {
                    boolValueOf = null;
                } else {
                    boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
                }
                return new BuyBlockSettings(boolValueOf, (Instant) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new BuyBlockSettings[i];
            }
        }

        public BuyBlockSettings(Boolean bool, Instant instant) {
            this.f105179a = bool;
            this.f105180b = instant;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof BuyBlockSettings)) {
                return false;
            }
            BuyBlockSettings buyBlockSettings = (BuyBlockSettings) obj2;
            return Intrinsics.f(this.f105179a, buyBlockSettings.f105179a) && Intrinsics.f(this.f105180b, buyBlockSettings.f105180b);
        }

        public final int hashCode() {
            Boolean bool = this.f105179a;
            int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
            Instant instant = this.f105180b;
            return iHashCode + (instant != null ? instant.hashCode() : 0);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            Boolean bool = this.f105179a;
            if (bool == null) {
                dest.writeInt(0);
            } else {
                p.a.A(dest, 1, bool);
            }
            dest.writeSerializable(this.f105180b);
        }
    }

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new Settings(BuyBlockSettings.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new Settings[i];
        }
    }

    public Settings(BuyBlockSettings buyBlockSettings) {
        Intrinsics.checkNotNullParameter(buyBlockSettings, "buyBlockSettings");
        this.f105178a = buyBlockSettings;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof Settings) && Intrinsics.f(this.f105178a, ((Settings) obj2).f105178a);
    }

    public final int hashCode() {
        return this.f105178a.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        this.f105178a.writeToParcel(dest, i);
    }
}
