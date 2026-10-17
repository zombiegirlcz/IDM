package com.revolut.feature.security_hub.api.models;

import android.os.Parcel;
import android.os.Parcelable;
import dj0.d;
import ip0.v7;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import xi0.b;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"Lcom/revolut/feature/security_hub/api/models/WealthProtectionFeatureState;", "Landroid/os/Parcelable;", "NotVisible", "Visible", "Lcom/revolut/feature/security_hub/api/models/WealthProtectionFeatureState$NotVisible;", "Lcom/revolut/feature/security_hub/api/models/WealthProtectionFeatureState$Visible;", "feature_security_hub_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface WealthProtectionFeatureState extends Parcelable {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/security_hub/api/models/WealthProtectionFeatureState$NotVisible;", "Lcom/revolut/feature/security_hub/api/models/WealthProtectionFeatureState;", "<init>", "()V", "feature_security_hub_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class NotVisible implements WealthProtectionFeatureState {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final NotVisible f85443a = new NotVisible();

        @NotNull
        public static final Parcelable.Creator<NotVisible> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return NotVisible.f85443a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new NotVisible[i];
            }
        }

        private NotVisible() {
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

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/security_hub/api/models/WealthProtectionFeatureState$Visible;", "Lcom/revolut/feature/security_hub/api/models/WealthProtectionFeatureState;", "Enabled", "Disabled", "Lcom/revolut/feature/security_hub/api/models/WealthProtectionFeatureState$Visible$Disabled;", "Lcom/revolut/feature/security_hub/api/models/WealthProtectionFeatureState$Visible$Enabled;", "feature_security_hub_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static abstract class Visible implements WealthProtectionFeatureState {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final b f85444a;

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/security_hub/api/models/WealthProtectionFeatureState$Visible$Disabled;", "Lcom/revolut/feature/security_hub/api/models/WealthProtectionFeatureState$Visible;", "", "toString", "()Ljava/lang/String;", "feature_security_hub_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Disabled extends Visible {

            @NotNull
            public static final Parcelable.Creator<Disabled> CREATOR = new a();

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final b f85445b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final d f85446c;
            public final WealthProtectionSuggestedAmount d;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new Disabled((b) parcel.readSerializable(), (d) parcel.readSerializable(), parcel.readInt() == 0 ? null : WealthProtectionSuggestedAmount.CREATOR.createFromParcel(parcel));
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new Disabled[i];
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Disabled(b currency, d dVar, WealthProtectionSuggestedAmount wealthProtectionSuggestedAmount) {
                super(currency);
                Intrinsics.checkNotNullParameter(currency, "currency");
                this.f85445b = currency;
                this.f85446c = dVar;
                this.d = wealthProtectionSuggestedAmount;
            }

            @Override // com.revolut.feature.security_hub.api.models.WealthProtectionFeatureState.Visible
            /* JADX INFO: renamed from: a, reason: from getter */
            public final d getD() {
                return this.f85446c;
            }

            @Override // com.revolut.feature.security_hub.api.models.WealthProtectionFeatureState.Visible
            /* JADX INFO: renamed from: b, reason: from getter */
            public final WealthProtectionSuggestedAmount getE() {
                return this.d;
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
                return Intrinsics.f(this.f85445b, disabled.f85445b) && Intrinsics.f(this.f85446c, disabled.f85446c) && Intrinsics.f(this.d, disabled.d);
            }

            @Override // com.revolut.feature.security_hub.api.models.WealthProtectionFeatureState.Visible
            /* JADX INFO: renamed from: getCurrency, reason: from getter */
            public final b getF85444a() {
                return this.f85445b;
            }

            public final int hashCode() {
                int iHashCode = this.f85445b.hashCode() * 31;
                d dVar = this.f85446c;
                int iHashCode2 = (iHashCode + (dVar == null ? 0 : dVar.hashCode())) * 31;
                WealthProtectionSuggestedAmount wealthProtectionSuggestedAmount = this.d;
                return iHashCode2 + (wealthProtectionSuggestedAmount != null ? wealthProtectionSuggestedAmount.hashCode() : 0);
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeSerializable(this.f85445b);
                dest.writeSerializable(this.f85446c);
                WealthProtectionSuggestedAmount wealthProtectionSuggestedAmount = this.d;
                if (wealthProtectionSuggestedAmount == null) {
                    dest.writeInt(0);
                } else {
                    dest.writeInt(1);
                    wealthProtectionSuggestedAmount.writeToParcel(dest, i);
                }
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/security_hub/api/models/WealthProtectionFeatureState$Visible$Enabled;", "Lcom/revolut/feature/security_hub/api/models/WealthProtectionFeatureState$Visible;", "", "toString", "()Ljava/lang/String;", "feature_security_hub_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Enabled extends Visible {

            @NotNull
            public static final Parcelable.Creator<Enabled> CREATOR = new a();

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final d f85447b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final d f85448c;
            public final d d;
            public final WealthProtectionSuggestedAmount e;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new Enabled((d) parcel.readSerializable(), (d) parcel.readSerializable(), (d) parcel.readSerializable(), parcel.readInt() == 0 ? null : WealthProtectionSuggestedAmount.CREATOR.createFromParcel(parcel));
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new Enabled[i];
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Enabled(d maxAmount, d usedAmount, d dVar, WealthProtectionSuggestedAmount wealthProtectionSuggestedAmount) {
                super(maxAmount.f115083b);
                Intrinsics.checkNotNullParameter(maxAmount, "maxAmount");
                Intrinsics.checkNotNullParameter(usedAmount, "usedAmount");
                this.f85447b = maxAmount;
                this.f85448c = usedAmount;
                this.d = dVar;
                this.e = wealthProtectionSuggestedAmount;
            }

            @Override // com.revolut.feature.security_hub.api.models.WealthProtectionFeatureState.Visible
            /* JADX INFO: renamed from: a, reason: from getter */
            public final d getD() {
                return this.d;
            }

            @Override // com.revolut.feature.security_hub.api.models.WealthProtectionFeatureState.Visible
            /* JADX INFO: renamed from: b, reason: from getter */
            public final WealthProtectionSuggestedAmount getE() {
                return this.e;
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
                return Intrinsics.f(this.f85447b, enabled.f85447b) && Intrinsics.f(this.f85448c, enabled.f85448c) && Intrinsics.f(this.d, enabled.d) && Intrinsics.f(this.e, enabled.e);
            }

            public final int hashCode() {
                int iC = v7.c(this.f85447b.hashCode() * 31, 31, this.f85448c);
                d dVar = this.d;
                int iHashCode = (iC + (dVar == null ? 0 : dVar.hashCode())) * 31;
                WealthProtectionSuggestedAmount wealthProtectionSuggestedAmount = this.e;
                return iHashCode + (wealthProtectionSuggestedAmount != null ? wealthProtectionSuggestedAmount.hashCode() : 0);
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeSerializable(this.f85447b);
                dest.writeSerializable(this.f85448c);
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

        public Visible(b bVar) {
            this.f85444a = bVar;
        }

        /* JADX INFO: renamed from: a */
        public abstract d getD();

        /* JADX INFO: renamed from: b */
        public abstract WealthProtectionSuggestedAmount getE();

        /* JADX INFO: renamed from: getCurrency, reason: from getter */
        public b getF85444a() {
            return this.f85444a;
        }
    }
}
