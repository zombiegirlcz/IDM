package com.revolut.feature.security_hub.api.models;

import android.os.Parcel;
import android.os.Parcelable;
import dj0.d;
import h30.l;
import ip0.v7;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import xi0.b;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"Lcom/revolut/feature/security_hub/api/models/WealthProtectionFeatureDetails;", "Landroid/os/Parcelable;", "Disabled", "Enabled", "Lcom/revolut/feature/security_hub/api/models/WealthProtectionFeatureDetails$Disabled;", "Lcom/revolut/feature/security_hub/api/models/WealthProtectionFeatureDetails$Enabled;", "feature_security_hub_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface WealthProtectionFeatureDetails extends Parcelable {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/security_hub/api/models/WealthProtectionFeatureDetails$Disabled;", "Lcom/revolut/feature/security_hub/api/models/WealthProtectionFeatureDetails;", "", "toString", "()Ljava/lang/String;", "feature_security_hub_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Disabled implements WealthProtectionFeatureDetails {

        @NotNull
        public static final Parcelable.Creator<Disabled> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f85437a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final b f85438b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final d f85439c;
        public final WealthProtectionSuggestedAmount d;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Disabled(parcel.readString(), (b) parcel.readSerializable(), (d) parcel.readSerializable(), parcel.readInt() == 0 ? null : WealthProtectionSuggestedAmount.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Disabled[i];
            }
        }

        public Disabled(String name, b currency, d dVar, WealthProtectionSuggestedAmount wealthProtectionSuggestedAmount) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(currency, "currency");
            this.f85437a = name;
            this.f85438b = currency;
            this.f85439c = dVar;
            this.d = wealthProtectionSuggestedAmount;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Disabled)) {
                return false;
            }
            Disabled disabled = (Disabled) obj2;
            return Intrinsics.f(this.f85437a, disabled.f85437a) && Intrinsics.f(this.f85438b, disabled.f85438b) && Intrinsics.f(this.f85439c, disabled.f85439c) && Intrinsics.f(this.d, disabled.d);
        }

        public final int hashCode() {
            int iJ = l.j(this.f85438b, this.f85437a.hashCode() * 31, 31);
            d dVar = this.f85439c;
            int iHashCode = (iJ + (dVar == null ? 0 : dVar.hashCode())) * 31;
            WealthProtectionSuggestedAmount wealthProtectionSuggestedAmount = this.d;
            return iHashCode + (wealthProtectionSuggestedAmount != null ? wealthProtectionSuggestedAmount.hashCode() : 0);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f85437a);
            dest.writeSerializable(this.f85438b);
            dest.writeSerializable(this.f85439c);
            WealthProtectionSuggestedAmount wealthProtectionSuggestedAmount = this.d;
            if (wealthProtectionSuggestedAmount == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                wealthProtectionSuggestedAmount.writeToParcel(dest, i);
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/security_hub/api/models/WealthProtectionFeatureDetails$Enabled;", "Lcom/revolut/feature/security_hub/api/models/WealthProtectionFeatureDetails;", "", "toString", "()Ljava/lang/String;", "feature_security_hub_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Enabled implements WealthProtectionFeatureDetails {

        @NotNull
        public static final Parcelable.Creator<Enabled> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f85440a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final d f85441b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final d f85442c;
        public final d d;
        public final WealthProtectionSuggestedAmount e;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Enabled(parcel.readString(), (d) parcel.readSerializable(), (d) parcel.readSerializable(), (d) parcel.readSerializable(), parcel.readInt() == 0 ? null : WealthProtectionSuggestedAmount.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Enabled[i];
            }
        }

        public Enabled(String name, d maxAmount, d usedAmount, d dVar, WealthProtectionSuggestedAmount wealthProtectionSuggestedAmount) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(maxAmount, "maxAmount");
            Intrinsics.checkNotNullParameter(usedAmount, "usedAmount");
            this.f85440a = name;
            this.f85441b = maxAmount;
            this.f85442c = usedAmount;
            this.d = dVar;
            this.e = wealthProtectionSuggestedAmount;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Enabled)) {
                return false;
            }
            Enabled enabled = (Enabled) obj2;
            return Intrinsics.f(this.f85440a, enabled.f85440a) && Intrinsics.f(this.f85441b, enabled.f85441b) && Intrinsics.f(this.f85442c, enabled.f85442c) && Intrinsics.f(this.d, enabled.d) && Intrinsics.f(this.e, enabled.e);
        }

        public final int hashCode() {
            int iC = v7.c(v7.c(this.f85440a.hashCode() * 31, 31, this.f85441b), 31, this.f85442c);
            d dVar = this.d;
            int iHashCode = (iC + (dVar == null ? 0 : dVar.hashCode())) * 31;
            WealthProtectionSuggestedAmount wealthProtectionSuggestedAmount = this.e;
            return iHashCode + (wealthProtectionSuggestedAmount != null ? wealthProtectionSuggestedAmount.hashCode() : 0);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f85440a);
            dest.writeSerializable(this.f85441b);
            dest.writeSerializable(this.f85442c);
            dest.writeSerializable(this.d);
            WealthProtectionSuggestedAmount wealthProtectionSuggestedAmount = this.e;
            if (wealthProtectionSuggestedAmount == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                wealthProtectionSuggestedAmount.writeToParcel(dest, i);
            }
        }
    }
}
