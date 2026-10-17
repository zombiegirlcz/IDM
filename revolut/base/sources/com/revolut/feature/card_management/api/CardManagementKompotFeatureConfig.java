package com.revolut.feature.card_management.api;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.core.model.account.AccountId;
import com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig;
import com.revolut.kompot.bridge.navigation.KompotDestination;
import com.revolut.kompot.common.ParcelableDestination;
import com.revolut.retail.core.navigation.ActivityAnimation;
import h93.f0;
import i93.e;
import i93.l;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import wy2.b;
import wy2.c;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\b\u0002\u0003\u0004\u0005\u0006\u0007\b\t\u0082\u0001\u0002\n\u000b¨\u0006\f"}, d2 = {"Lcom/revolut/feature/card_management/api/CardManagementKompotFeatureConfig;", "Lcom/revolut/kompot/bridge/navigation/KompotBridgeFeatureConfig;", "Settings", "SettingsDestination", "DisposableCardSettingsDestination", "ChangePinDestination", "ActivatePinDestination", "SetTransactionLimit", "TransactionLimitDestination", "wy2/c", "Lcom/revolut/feature/card_management/api/CardManagementKompotFeatureConfig$SetTransactionLimit;", "Lcom/revolut/feature/card_management/api/CardManagementKompotFeatureConfig$Settings;", "feature_card_management_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class CardManagementKompotFeatureConfig extends KompotBridgeFeatureConfig {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/card_management/api/CardManagementKompotFeatureConfig$ActivatePinDestination;", "Lcom/revolut/kompot/bridge/navigation/KompotDestination;", "", "toString", "()Ljava/lang/String;", "feature_card_management_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class ActivatePinDestination implements KompotDestination {

        @NotNull
        public static final Parcelable.Creator<ActivatePinDestination> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f64784a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new ActivatePinDestination(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ActivatePinDestination[i];
            }
        }

        public ActivatePinDestination(String cardId) {
            Intrinsics.checkNotNullParameter(cardId, "cardId");
            this.f64784a = cardId;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof ActivatePinDestination) && Intrinsics.f(this.f64784a, ((ActivatePinDestination) obj2).f64784a);
        }

        /* JADX INFO: renamed from: getCardId, reason: from getter */
        public final String getF64784a() {
            return this.f64784a;
        }

        public final int hashCode() {
            return this.f64784a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f64784a);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/card_management/api/CardManagementKompotFeatureConfig$ChangePinDestination;", "Lcom/revolut/kompot/bridge/navigation/KompotDestination;", "", "toString", "()Ljava/lang/String;", "feature_card_management_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class ChangePinDestination implements KompotDestination {

        @NotNull
        public static final Parcelable.Creator<ChangePinDestination> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f64785a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new ChangePinDestination(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ChangePinDestination[i];
            }
        }

        public ChangePinDestination(String cardId) {
            Intrinsics.checkNotNullParameter(cardId, "cardId");
            this.f64785a = cardId;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof ChangePinDestination) && Intrinsics.f(this.f64785a, ((ChangePinDestination) obj2).f64785a);
        }

        /* JADX INFO: renamed from: getCardId, reason: from getter */
        public final String getF64785a() {
            return this.f64785a;
        }

        public final int hashCode() {
            return this.f64785a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f64785a);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/card_management/api/CardManagementKompotFeatureConfig$DisposableCardSettingsDestination;", "Lcom/revolut/kompot/bridge/navigation/KompotDestination;", "", "toString", "()Ljava/lang/String;", "feature_card_management_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class DisposableCardSettingsDestination implements KompotDestination {

        @NotNull
        public static final Parcelable.Creator<DisposableCardSettingsDestination> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final f0 f64786a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final AccountId f64787b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new DisposableCardSettingsDestination((f0) parcel.readSerializable(), (AccountId) parcel.readParcelable(DisposableCardSettingsDestination.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new DisposableCardSettingsDestination[i];
            }
        }

        public DisposableCardSettingsDestination(f0 disposableCard, AccountId accountId) {
            Intrinsics.checkNotNullParameter(disposableCard, "disposableCard");
            Intrinsics.checkNotNullParameter(accountId, "accountId");
            this.f64786a = disposableCard;
            this.f64787b = accountId;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final f0 getF64786a() {
            return this.f64786a;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof DisposableCardSettingsDestination)) {
                return false;
            }
            DisposableCardSettingsDestination disposableCardSettingsDestination = (DisposableCardSettingsDestination) obj2;
            return Intrinsics.f(this.f64786a, disposableCardSettingsDestination.f64786a) && Intrinsics.f(this.f64787b, disposableCardSettingsDestination.f64787b);
        }

        /* JADX INFO: renamed from: getAccountId, reason: from getter */
        public final AccountId getF64787b() {
            return this.f64787b;
        }

        public final int hashCode() {
            return this.f64787b.hashCode() + (this.f64786a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f64786a);
            dest.writeParcelable(this.f64787b, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/card_management/api/CardManagementKompotFeatureConfig$SetTransactionLimit;", "Lcom/revolut/feature/card_management/api/CardManagementKompotFeatureConfig;", "", "toString", "()Ljava/lang/String;", "feature_card_management_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class SetTransactionLimit extends CardManagementKompotFeatureConfig {

        @NotNull
        public static final Parcelable.Creator<SetTransactionLimit> CREATOR = new a();

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final String f64788g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final e f64789h;
        public final l i;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new SetTransactionLimit(parcel.readString(), e.valueOf(parcel.readString()), (l) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new SetTransactionLimit[i];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SetTransactionLimit(String cardId, e cardSettingsType, l transactionLimit) {
            super(new TransactionLimitDestination(c.DEEPLINK, cardId, cardSettingsType, transactionLimit));
            Intrinsics.checkNotNullParameter(cardId, "cardId");
            Intrinsics.checkNotNullParameter(cardSettingsType, "cardSettingsType");
            Intrinsics.checkNotNullParameter(transactionLimit, "transactionLimit");
            this.f64788g = cardId;
            this.f64789h = cardSettingsType;
            this.i = transactionLimit;
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof SetTransactionLimit)) {
                return false;
            }
            SetTransactionLimit setTransactionLimit = (SetTransactionLimit) obj2;
            return Intrinsics.f(this.f64788g, setTransactionLimit.f64788g) && this.f64789h == setTransactionLimit.f64789h && Intrinsics.f(this.i, setTransactionLimit.i);
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
        public final int hashCode() {
            return this.i.hashCode() + ((this.f64789h.hashCode() + (this.f64788g.hashCode() * 31)) * 31);
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig, android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f64788g);
            dest.writeString(this.f64789h.name());
            dest.writeSerializable(this.i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/card_management/api/CardManagementKompotFeatureConfig$Settings;", "Lcom/revolut/feature/card_management/api/CardManagementKompotFeatureConfig;", "", "toString", "()Ljava/lang/String;", "feature_card_management_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Settings extends CardManagementKompotFeatureConfig {

        @NotNull
        public static final Parcelable.Creator<Settings> CREATOR = new a();

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final String f64790g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final AccountId f64791h;
        public final wy2.a i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final b f64792j;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Settings(parcel.readString(), (AccountId) parcel.readParcelable(Settings.class.getClassLoader()), wy2.a.valueOf(parcel.readString()), b.valueOf(parcel.readString()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Settings[i];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Settings(String cardId, AccountId accountId, wy2.a flowName, b flowType) {
            super(new SettingsDestination(cardId, accountId, flowName, flowType));
            Intrinsics.checkNotNullParameter(cardId, "cardId");
            Intrinsics.checkNotNullParameter(accountId, "accountId");
            Intrinsics.checkNotNullParameter(flowName, "flowName");
            Intrinsics.checkNotNullParameter(flowType, "flowType");
            this.f64790g = cardId;
            this.f64791h = accountId;
            this.i = flowName;
            this.f64792j = flowType;
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Settings)) {
                return false;
            }
            Settings settings = (Settings) obj2;
            return Intrinsics.f(this.f64790g, settings.f64790g) && Intrinsics.f(this.f64791h, settings.f64791h) && this.i == settings.i && this.f64792j == settings.f64792j;
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
        public final int hashCode() {
            return this.f64792j.hashCode() + ((this.i.hashCode() + h30.l.b(this.f64791h, this.f64790g.hashCode() * 31, 31)) * 31);
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig, android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f64790g);
            dest.writeParcelable(this.f64791h, i);
            dest.writeString(this.i.name());
            dest.writeString(this.f64792j.name());
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/card_management/api/CardManagementKompotFeatureConfig$TransactionLimitDestination;", "Lcom/revolut/kompot/bridge/navigation/KompotDestination;", "", "toString", "()Ljava/lang/String;", "feature_card_management_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class TransactionLimitDestination implements KompotDestination {

        @NotNull
        public static final Parcelable.Creator<TransactionLimitDestination> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final c f64796a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f64797b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final e f64798c;
        public final l d;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new TransactionLimitDestination(c.valueOf(parcel.readString()), parcel.readString(), e.valueOf(parcel.readString()), (l) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new TransactionLimitDestination[i];
            }
        }

        public TransactionLimitDestination(c flowType, String cardId, e cardSettingsType, l transactionLimit) {
            Intrinsics.checkNotNullParameter(flowType, "flowType");
            Intrinsics.checkNotNullParameter(cardId, "cardId");
            Intrinsics.checkNotNullParameter(cardSettingsType, "cardSettingsType");
            Intrinsics.checkNotNullParameter(transactionLimit, "transactionLimit");
            this.f64796a = flowType;
            this.f64797b = cardId;
            this.f64798c = cardSettingsType;
            this.d = transactionLimit;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final e getF64798c() {
            return this.f64798c;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final c getF64796a() {
            return this.f64796a;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final l getD() {
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
            if (!(obj2 instanceof TransactionLimitDestination)) {
                return false;
            }
            TransactionLimitDestination transactionLimitDestination = (TransactionLimitDestination) obj2;
            return this.f64796a == transactionLimitDestination.f64796a && Intrinsics.f(this.f64797b, transactionLimitDestination.f64797b) && this.f64798c == transactionLimitDestination.f64798c && Intrinsics.f(this.d, transactionLimitDestination.d);
        }

        /* JADX INFO: renamed from: getCardId, reason: from getter */
        public final String getF64797b() {
            return this.f64797b;
        }

        public final int hashCode() {
            return this.d.hashCode() + ((this.f64798c.hashCode() + p.a.c(this.f64796a.hashCode() * 31, 31, this.f64797b)) * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f64796a.name());
            dest.writeString(this.f64797b);
            dest.writeString(this.f64798c.name());
            dest.writeSerializable(this.d);
        }
    }

    public CardManagementKompotFeatureConfig(KompotDestination kompotDestination) {
        super((ActivityAnimation) null, (ParcelableDestination) kompotDestination, false, (Integer) null, 0, 60);
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/card_management/api/CardManagementKompotFeatureConfig$SettingsDestination;", "Lcom/revolut/kompot/bridge/navigation/KompotDestination;", "", "toString", "()Ljava/lang/String;", "feature_card_management_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class SettingsDestination implements KompotDestination {

        @NotNull
        public static final Parcelable.Creator<SettingsDestination> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f64793a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final AccountId f64794b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final wy2.a f64795c;
        public final b d;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new SettingsDestination(parcel.readString(), (AccountId) parcel.readParcelable(SettingsDestination.class.getClassLoader()), wy2.a.valueOf(parcel.readString()), b.valueOf(parcel.readString()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new SettingsDestination[i];
            }
        }

        public SettingsDestination(String cardId, AccountId accountId, wy2.a flowName, b flowType) {
            Intrinsics.checkNotNullParameter(cardId, "cardId");
            Intrinsics.checkNotNullParameter(accountId, "accountId");
            Intrinsics.checkNotNullParameter(flowName, "flowName");
            Intrinsics.checkNotNullParameter(flowType, "flowType");
            this.f64793a = cardId;
            this.f64794b = accountId;
            this.f64795c = flowName;
            this.d = flowType;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final wy2.a getF64795c() {
            return this.f64795c;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final b getD() {
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
            if (!(obj2 instanceof SettingsDestination)) {
                return false;
            }
            SettingsDestination settingsDestination = (SettingsDestination) obj2;
            return Intrinsics.f(this.f64793a, settingsDestination.f64793a) && Intrinsics.f(this.f64794b, settingsDestination.f64794b) && this.f64795c == settingsDestination.f64795c && this.d == settingsDestination.d;
        }

        /* JADX INFO: renamed from: getAccountId, reason: from getter */
        public final AccountId getF64794b() {
            return this.f64794b;
        }

        /* JADX INFO: renamed from: getCardId, reason: from getter */
        public final String getF64793a() {
            return this.f64793a;
        }

        public final int hashCode() {
            return this.d.hashCode() + ((this.f64795c.hashCode() + h30.l.b(this.f64794b, this.f64793a.hashCode() * 31, 31)) * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f64793a);
            dest.writeParcelable(this.f64794b, i);
            dest.writeString(this.f64795c.name());
            dest.writeString(this.d.name());
        }

        public /* synthetic */ SettingsDestination(String str, AccountId accountId, wy2.a aVar, b bVar, int i) {
            this(str, (i & 2) != 0 ? AccountId.Personal.f51414a : accountId, (i & 4) != 0 ? wy2.a.DEFAULT : aVar, (i & 8) != 0 ? b.DEFAULT : bVar);
        }
    }
}
