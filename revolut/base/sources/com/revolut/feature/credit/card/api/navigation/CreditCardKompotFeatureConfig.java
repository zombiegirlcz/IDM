package com.revolut.feature.credit.card.api.navigation;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.credit.card.api.models.statement.CreditCardInAppStatement$AccruedInterest;
import com.revolut.feature.credit.card.api.navigation.CreditCardDescriptionDestination;
import com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig;
import com.revolut.kompot.bridge.navigation.KompotDestination;
import com.revolut.kompot.common.ParcelableDestination;
import com.revolut.retail.core.navigation.ActivityAnimation;
import h30.l;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import xi0.b;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u000b\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\u0082\u0001\t\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015¨\u0006\u0016"}, d2 = {"Lcom/revolut/feature/credit/card/api/navigation/CreditCardKompotFeatureConfig;", "Lcom/revolut/kompot/bridge/navigation/KompotBridgeFeatureConfig;", "Description", "Details", "Statement", "InAppStatement", "CashbackDetails", "Topup", "AutoPaySettings", "SetUpAutoPay", "Instalment", "CollateralMoveMoneyDestination", "CreditCardAccruedInterestsDestination", "Lcom/revolut/feature/credit/card/api/navigation/CreditCardKompotFeatureConfig$AutoPaySettings;", "Lcom/revolut/feature/credit/card/api/navigation/CreditCardKompotFeatureConfig$CashbackDetails;", "Lcom/revolut/feature/credit/card/api/navigation/CreditCardKompotFeatureConfig$Description;", "Lcom/revolut/feature/credit/card/api/navigation/CreditCardKompotFeatureConfig$Details;", "Lcom/revolut/feature/credit/card/api/navigation/CreditCardKompotFeatureConfig$InAppStatement;", "Lcom/revolut/feature/credit/card/api/navigation/CreditCardKompotFeatureConfig$Instalment;", "Lcom/revolut/feature/credit/card/api/navigation/CreditCardKompotFeatureConfig$SetUpAutoPay;", "Lcom/revolut/feature/credit/card/api/navigation/CreditCardKompotFeatureConfig$Statement;", "Lcom/revolut/feature/credit/card/api/navigation/CreditCardKompotFeatureConfig$Topup;", "feature_credit_card_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class CreditCardKompotFeatureConfig extends KompotBridgeFeatureConfig {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/credit/card/api/navigation/CreditCardKompotFeatureConfig$AutoPaySettings;", "Lcom/revolut/feature/credit/card/api/navigation/CreditCardKompotFeatureConfig;", "", "toString", "()Ljava/lang/String;", "AutoPaySettingsDestination", "feature_credit_card_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class AutoPaySettings extends CreditCardKompotFeatureConfig {

        @NotNull
        public static final Parcelable.Creator<AutoPaySettings> CREATOR = new a();

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final String f68939g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final ActivityAnimation f68940h;

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/card/api/navigation/CreditCardKompotFeatureConfig$AutoPaySettings$AutoPaySettingsDestination;", "Lcom/revolut/feature/credit/card/api/navigation/CreditCardKompotDestination;", "", "toString", "()Ljava/lang/String;", "feature_credit_card_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class AutoPaySettingsDestination implements CreditCardKompotDestination {

            @NotNull
            public static final Parcelable.Creator<AutoPaySettingsDestination> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final String f68941a;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new AutoPaySettingsDestination(parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new AutoPaySettingsDestination[i];
                }
            }

            public AutoPaySettingsDestination(String facilityId) {
                Intrinsics.checkNotNullParameter(facilityId, "facilityId");
                this.f68941a = facilityId;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                return (obj2 instanceof AutoPaySettingsDestination) && Intrinsics.f(this.f68941a, ((AutoPaySettingsDestination) obj2).f68941a);
            }

            public final int hashCode() {
                return this.f68941a.hashCode();
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeString(this.f68941a);
            }
        }

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new AutoPaySettings(parcel.readString(), (ActivityAnimation) parcel.readParcelable(AutoPaySettings.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new AutoPaySettings[i];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AutoPaySettings(String facilityId, ActivityAnimation activityAnimation) {
            super(activityAnimation, new AutoPaySettingsDestination(facilityId));
            Intrinsics.checkNotNullParameter(facilityId, "facilityId");
            this.f68939g = facilityId;
            this.f68940h = activityAnimation;
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
        /* JADX INFO: renamed from: a, reason: from getter */
        public final ActivityAnimation getF69929h() {
            return this.f68940h;
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof AutoPaySettings)) {
                return false;
            }
            AutoPaySettings autoPaySettings = (AutoPaySettings) obj2;
            return Intrinsics.f(this.f68939g, autoPaySettings.f68939g) && Intrinsics.f(this.f68940h, autoPaySettings.f68940h);
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
        public final int hashCode() {
            int iHashCode = this.f68939g.hashCode() * 31;
            ActivityAnimation activityAnimation = this.f68940h;
            return iHashCode + (activityAnimation == null ? 0 : activityAnimation.hashCode());
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig, android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f68939g);
            dest.writeParcelable(this.f68940h, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/card/api/navigation/CreditCardKompotFeatureConfig$CashbackDetails;", "Lcom/revolut/feature/credit/card/api/navigation/CreditCardKompotFeatureConfig;", "", "toString", "()Ljava/lang/String;", "feature_credit_card_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class CashbackDetails extends CreditCardKompotFeatureConfig {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final String f68942g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public CashbackDetails(String facilityId) {
            super(null, new CreditCardCashbabackDetailsDestination(facilityId, null));
            Intrinsics.checkNotNullParameter(facilityId, "facilityId");
            this.f68942g = facilityId;
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
        /* JADX INFO: renamed from: a */
        public final ActivityAnimation getF69929h() {
            return null;
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof CashbackDetails) && Intrinsics.f(this.f68942g, ((CashbackDetails) obj2).f68942g);
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
        public final int hashCode() {
            return this.f68942g.hashCode() * 31;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/credit/card/api/navigation/CreditCardKompotFeatureConfig$CollateralMoveMoneyDestination;", "Lcom/revolut/feature/credit/card/api/navigation/CreditCardKompotDestination;", "", "toString", "()Ljava/lang/String;", "com/revolut/feature/credit/card/api/navigation/a", "feature_credit_card_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class CollateralMoveMoneyDestination implements CreditCardKompotDestination {

        @NotNull
        public static final Parcelable.Creator<CollateralMoveMoneyDestination> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f68943a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final b f68944b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final com.revolut.feature.credit.card.api.navigation.a f68945c;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new CollateralMoveMoneyDestination(parcel.readString(), (b) parcel.readSerializable(), com.revolut.feature.credit.card.api.navigation.a.valueOf(parcel.readString()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new CollateralMoveMoneyDestination[i];
            }
        }

        public CollateralMoveMoneyDestination(String facilityId, b currency, com.revolut.feature.credit.card.api.navigation.a mode) {
            Intrinsics.checkNotNullParameter(facilityId, "facilityId");
            Intrinsics.checkNotNullParameter(currency, "currency");
            Intrinsics.checkNotNullParameter(mode, "mode");
            this.f68943a = facilityId;
            this.f68944b = currency;
            this.f68945c = mode;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof CollateralMoveMoneyDestination)) {
                return false;
            }
            CollateralMoveMoneyDestination collateralMoveMoneyDestination = (CollateralMoveMoneyDestination) obj2;
            return Intrinsics.f(this.f68943a, collateralMoveMoneyDestination.f68943a) && Intrinsics.f(this.f68944b, collateralMoveMoneyDestination.f68944b) && this.f68945c == collateralMoveMoneyDestination.f68945c;
        }

        public final int hashCode() {
            return this.f68945c.hashCode() + l.j(this.f68944b, this.f68943a.hashCode() * 31, 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f68943a);
            dest.writeSerializable(this.f68944b);
            dest.writeString(this.f68945c.name());
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/card/api/navigation/CreditCardKompotFeatureConfig$CreditCardAccruedInterestsDestination;", "Lcom/revolut/feature/credit/card/api/navigation/CreditCardKompotDestination;", "", "toString", "()Ljava/lang/String;", "feature_credit_card_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class CreditCardAccruedInterestsDestination implements CreditCardKompotDestination {

        @NotNull
        public static final Parcelable.Creator<CreditCardAccruedInterestsDestination> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f68946a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final ArrayList f68947b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final wi0.b f68948c;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                String string = parcel.readString();
                int i = parcel.readInt();
                ArrayList arrayList = new ArrayList(i);
                int iA = 0;
                while (iA != i) {
                    iA = org.bouncycastle.jcajce.provider.digest.a.a(CreditCardInAppStatement$AccruedInterest.CREATOR, parcel, arrayList, iA, 1);
                }
                return new CreditCardAccruedInterestsDestination(string, arrayList, (wi0.b) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new CreditCardAccruedInterestsDestination[i];
            }
        }

        public CreditCardAccruedInterestsDestination(String facilityId, ArrayList interests, wi0.b countryCode) {
            Intrinsics.checkNotNullParameter(facilityId, "facilityId");
            Intrinsics.checkNotNullParameter(interests, "interests");
            Intrinsics.checkNotNullParameter(countryCode, "countryCode");
            this.f68946a = facilityId;
            this.f68947b = interests;
            this.f68948c = countryCode;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof CreditCardAccruedInterestsDestination)) {
                return false;
            }
            CreditCardAccruedInterestsDestination creditCardAccruedInterestsDestination = (CreditCardAccruedInterestsDestination) obj2;
            return Intrinsics.f(this.f68946a, creditCardAccruedInterestsDestination.f68946a) && this.f68947b.equals(creditCardAccruedInterestsDestination.f68947b) && Intrinsics.f(this.f68948c, creditCardAccruedInterestsDestination.f68948c);
        }

        public final int hashCode() {
            return this.f68948c.f297794a.hashCode() + com.google.android.gms.internal.mlkit_vision_face.a.b(this.f68947b, this.f68946a.hashCode() * 31, 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f68946a);
            Iterator itY = j6.a.y(this.f68947b, dest);
            while (itY.hasNext()) {
                ((CreditCardInAppStatement$AccruedInterest) itY.next()).writeToParcel(dest, i);
            }
            dest.writeSerializable(this.f68948c);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/card/api/navigation/CreditCardKompotFeatureConfig$Description;", "Lcom/revolut/feature/credit/card/api/navigation/CreditCardKompotFeatureConfig;", "", "toString", "()Ljava/lang/String;", "feature_credit_card_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Description extends CreditCardKompotFeatureConfig {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final CreditCardDescriptionDestination.DescriptionConfig f68949g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Description(CreditCardDescriptionDestination.DescriptionConfig config) {
            super(null, new CreditCardDescriptionDestination(config));
            Intrinsics.checkNotNullParameter(config, "config");
            this.f68949g = config;
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
        /* JADX INFO: renamed from: a */
        public final ActivityAnimation getF69929h() {
            return null;
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Description) && Intrinsics.f(this.f68949g, ((Description) obj2).f68949g);
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
        public final int hashCode() {
            return this.f68949g.hashCode() * 31;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/card/api/navigation/CreditCardKompotFeatureConfig$Details;", "Lcom/revolut/feature/credit/card/api/navigation/CreditCardKompotFeatureConfig;", "", "toString", "()Ljava/lang/String;", "feature_credit_card_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Details extends CreditCardKompotFeatureConfig {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final String f68950g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Details(String facilityId) {
            super(null, new CreditCardDetailsDestination(facilityId));
            Intrinsics.checkNotNullParameter(facilityId, "facilityId");
            this.f68950g = facilityId;
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
        /* JADX INFO: renamed from: a */
        public final ActivityAnimation getF69929h() {
            return null;
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Details) && Intrinsics.f(this.f68950g, ((Details) obj2).f68950g);
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
        public final int hashCode() {
            return this.f68950g.hashCode() * 31;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/card/api/navigation/CreditCardKompotFeatureConfig$InAppStatement;", "Lcom/revolut/feature/credit/card/api/navigation/CreditCardKompotFeatureConfig;", "", "toString", "()Ljava/lang/String;", "feature_credit_card_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class InAppStatement extends CreditCardKompotFeatureConfig {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final String f68953g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public InAppStatement(String facilityId) {
            super(null, new CreditCardInAppStatementDestination(facilityId));
            Intrinsics.checkNotNullParameter(facilityId, "facilityId");
            this.f68953g = facilityId;
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
        /* JADX INFO: renamed from: a */
        public final ActivityAnimation getF69929h() {
            return null;
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof InAppStatement) && Intrinsics.f(this.f68953g, ((InAppStatement) obj2).f68953g);
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
        public final int hashCode() {
            return this.f68953g.hashCode() * 31;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/card/api/navigation/CreditCardKompotFeatureConfig$Instalment;", "Lcom/revolut/feature/credit/card/api/navigation/CreditCardKompotFeatureConfig;", "", "toString", "()Ljava/lang/String;", "feature_credit_card_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Instalment extends CreditCardKompotFeatureConfig {

        @NotNull
        public static final Parcelable.Creator<Instalment> CREATOR = new a();

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final String f68954g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final ActivityAnimation f68955h;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Instalment(parcel.readString(), (ActivityAnimation) parcel.readParcelable(Instalment.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Instalment[i];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Instalment(String facilityId, ActivityAnimation activityAnimation) {
            super(activityAnimation, new CreditCardInstalmentHubDestination(facilityId, null));
            Intrinsics.checkNotNullParameter(facilityId, "facilityId");
            this.f68954g = facilityId;
            this.f68955h = activityAnimation;
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
        /* JADX INFO: renamed from: a, reason: from getter */
        public final ActivityAnimation getF69929h() {
            return this.f68955h;
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Instalment)) {
                return false;
            }
            Instalment instalment = (Instalment) obj2;
            return Intrinsics.f(this.f68954g, instalment.f68954g) && Intrinsics.f(this.f68955h, instalment.f68955h);
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
        public final int hashCode() {
            int iHashCode = this.f68954g.hashCode() * 31;
            ActivityAnimation activityAnimation = this.f68955h;
            return iHashCode + (activityAnimation == null ? 0 : activityAnimation.hashCode());
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig, android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f68954g);
            dest.writeParcelable(this.f68955h, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/card/api/navigation/CreditCardKompotFeatureConfig$SetUpAutoPay;", "Lcom/revolut/feature/credit/card/api/navigation/CreditCardKompotFeatureConfig;", "", "toString", "()Ljava/lang/String;", "feature_credit_card_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class SetUpAutoPay extends CreditCardKompotFeatureConfig {

        @NotNull
        public static final Parcelable.Creator<SetUpAutoPay> CREATOR = new a();

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final String f68956g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final ActivityAnimation f68957h;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new SetUpAutoPay(parcel.readString(), (ActivityAnimation) parcel.readParcelable(SetUpAutoPay.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new SetUpAutoPay[i];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SetUpAutoPay(String facilityId, ActivityAnimation activityAnimation) {
            super(activityAnimation, new CreditCardSetupAutoPayDestination(facilityId));
            Intrinsics.checkNotNullParameter(facilityId, "facilityId");
            this.f68956g = facilityId;
            this.f68957h = activityAnimation;
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
        /* JADX INFO: renamed from: a, reason: from getter */
        public final ActivityAnimation getF69929h() {
            return this.f68957h;
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof SetUpAutoPay)) {
                return false;
            }
            SetUpAutoPay setUpAutoPay = (SetUpAutoPay) obj2;
            return Intrinsics.f(this.f68956g, setUpAutoPay.f68956g) && Intrinsics.f(this.f68957h, setUpAutoPay.f68957h);
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
        public final int hashCode() {
            int iHashCode = this.f68956g.hashCode() * 31;
            ActivityAnimation activityAnimation = this.f68957h;
            return iHashCode + (activityAnimation == null ? 0 : activityAnimation.hashCode());
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig, android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f68956g);
            dest.writeParcelable(this.f68957h, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/card/api/navigation/CreditCardKompotFeatureConfig$Statement;", "Lcom/revolut/feature/credit/card/api/navigation/CreditCardKompotFeatureConfig;", "", "toString", "()Ljava/lang/String;", "feature_credit_card_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Statement extends CreditCardKompotFeatureConfig {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final String f68958g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Statement(String facilityId) {
            super(null, new CreditCardStatementDestination(facilityId));
            Intrinsics.checkNotNullParameter(facilityId, "facilityId");
            this.f68958g = facilityId;
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
        /* JADX INFO: renamed from: a */
        public final ActivityAnimation getF69929h() {
            return null;
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Statement) && Intrinsics.f(this.f68958g, ((Statement) obj2).f68958g);
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
        public final int hashCode() {
            return this.f68958g.hashCode() * 31;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/card/api/navigation/CreditCardKompotFeatureConfig$Topup;", "Lcom/revolut/feature/credit/card/api/navigation/CreditCardKompotFeatureConfig;", "", "toString", "()Ljava/lang/String;", "feature_credit_card_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Topup extends CreditCardKompotFeatureConfig {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final String f68959g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Topup(String facilityId) {
            super(null, new CreditCardTopupDestination(facilityId, (KompotDestination) null, 6));
            Intrinsics.checkNotNullParameter(facilityId, "facilityId");
            this.f68959g = facilityId;
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
        /* JADX INFO: renamed from: a */
        public final ActivityAnimation getF69929h() {
            return null;
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Topup) && Intrinsics.f(this.f68959g, ((Topup) obj2).f68959g);
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
        public final int hashCode() {
            return this.f68959g.hashCode() * 31;
        }
    }

    public CreditCardKompotFeatureConfig(ActivityAnimation activityAnimation, CreditCardKompotDestination creditCardKompotDestination) {
        super(activityAnimation, (ParcelableDestination) creditCardKompotDestination, false, (Integer) null, 0, 60);
    }
}
