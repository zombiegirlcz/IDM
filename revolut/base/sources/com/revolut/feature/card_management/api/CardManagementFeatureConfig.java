package com.revolut.feature.card_management.api;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.core.model.account.AccountId;
import com.revolut.retail.core.navigation.NaviCommand;
import com.revolut.retail.core.navigation.feature.FeatureConfig;
import h30.l;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import wy2.b;
import wy2.d;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0006\u0004\u0005\u0006\u0007\b\tB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0004\n\u000b\f\r¨\u0006\u000e"}, d2 = {"Lcom/revolut/feature/card_management/api/CardManagementFeatureConfig;", "Lcom/revolut/retail/core/navigation/feature/FeatureConfig;", "<init>", "()V", "Settings", "JuniorSettings", "CardSelectReplaceReason", "CardReplaceExpectations", "wy2/b", "wy2/a", "Lcom/revolut/feature/card_management/api/CardManagementFeatureConfig$CardReplaceExpectations;", "Lcom/revolut/feature/card_management/api/CardManagementFeatureConfig$CardSelectReplaceReason;", "Lcom/revolut/feature/card_management/api/CardManagementFeatureConfig$JuniorSettings;", "Lcom/revolut/feature/card_management/api/CardManagementFeatureConfig$Settings;", "feature_card_management_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class CardManagementFeatureConfig implements FeatureConfig {

    /* JADX INFO: loaded from: classes21.dex */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/card_management/api/CardManagementFeatureConfig$CardReplaceExpectations;", "Lcom/revolut/feature/card_management/api/CardManagementFeatureConfig;", "", "toString", "()Ljava/lang/String;", "feature_card_management_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class CardReplaceExpectations extends CardManagementFeatureConfig {

        @NotNull
        public static final Parcelable.Creator<CardReplaceExpectations> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final d f64775a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f64776b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final NaviCommand f64777c;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new CardReplaceExpectations(d.valueOf(parcel.readString()), parcel.readString(), (NaviCommand) parcel.readParcelable(CardReplaceExpectations.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new CardReplaceExpectations[i];
            }
        }

        public CardReplaceExpectations(d reason, String cardId, NaviCommand nextCommand) {
            Intrinsics.checkNotNullParameter(reason, "reason");
            Intrinsics.checkNotNullParameter(cardId, "cardId");
            Intrinsics.checkNotNullParameter(nextCommand, "nextCommand");
            this.f64775a = reason;
            this.f64776b = cardId;
            this.f64777c = nextCommand;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof CardReplaceExpectations)) {
                return false;
            }
            CardReplaceExpectations cardReplaceExpectations = (CardReplaceExpectations) obj2;
            return this.f64775a == cardReplaceExpectations.f64775a && Intrinsics.f(this.f64776b, cardReplaceExpectations.f64776b) && Intrinsics.f(this.f64777c, cardReplaceExpectations.f64777c);
        }

        public final int hashCode() {
            return this.f64777c.hashCode() + p.a.c(this.f64775a.hashCode() * 31, 31, this.f64776b);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f64775a.name());
            dest.writeString(this.f64776b);
            dest.writeParcelable(this.f64777c, i);
        }
    }

    /* JADX INFO: loaded from: classes21.dex */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/card_management/api/CardManagementFeatureConfig$CardSelectReplaceReason;", "Lcom/revolut/feature/card_management/api/CardManagementFeatureConfig;", "", "toString", "()Ljava/lang/String;", "feature_card_management_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class CardSelectReplaceReason extends CardManagementFeatureConfig {

        @NotNull
        public static final Parcelable.Creator<CardSelectReplaceReason> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f64778a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final d f64779b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new CardSelectReplaceReason(parcel.readString(), parcel.readInt() == 0 ? null : d.valueOf(parcel.readString()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new CardSelectReplaceReason[i];
            }
        }

        public CardSelectReplaceReason(String cardId, d dVar) {
            Intrinsics.checkNotNullParameter(cardId, "cardId");
            this.f64778a = cardId;
            this.f64779b = dVar;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof CardSelectReplaceReason)) {
                return false;
            }
            CardSelectReplaceReason cardSelectReplaceReason = (CardSelectReplaceReason) obj2;
            return Intrinsics.f(this.f64778a, cardSelectReplaceReason.f64778a) && this.f64779b == cardSelectReplaceReason.f64779b;
        }

        public final int hashCode() {
            int iHashCode = this.f64778a.hashCode() * 31;
            d dVar = this.f64779b;
            return iHashCode + (dVar == null ? 0 : dVar.hashCode());
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f64778a);
            d dVar = this.f64779b;
            if (dVar == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                dest.writeString(dVar.name());
            }
        }
    }

    /* JADX INFO: loaded from: classes21.dex */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/card_management/api/CardManagementFeatureConfig$JuniorSettings;", "Lcom/revolut/feature/card_management/api/CardManagementFeatureConfig;", "", "toString", "()Ljava/lang/String;", "feature_card_management_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class JuniorSettings extends CardManagementFeatureConfig {

        @NotNull
        public static final Parcelable.Creator<JuniorSettings> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f64780a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new JuniorSettings(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new JuniorSettings[i];
            }
        }

        public JuniorSettings(String cardId) {
            Intrinsics.checkNotNullParameter(cardId, "cardId");
            this.f64780a = cardId;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof JuniorSettings) && Intrinsics.f(this.f64780a, ((JuniorSettings) obj2).f64780a);
        }

        public final int hashCode() {
            return this.f64780a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f64780a);
        }
    }

    private CardManagementFeatureConfig() {
    }

    /* JADX INFO: loaded from: classes21.dex */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/card_management/api/CardManagementFeatureConfig$Settings;", "Lcom/revolut/feature/card_management/api/CardManagementFeatureConfig;", "", "toString", "()Ljava/lang/String;", "feature_card_management_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Settings extends CardManagementFeatureConfig {

        @NotNull
        public static final Parcelable.Creator<Settings> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f64781a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final AccountId f64782b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final b f64783c;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Settings(parcel.readString(), (AccountId) parcel.readParcelable(Settings.class.getClassLoader()), b.valueOf(parcel.readString()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Settings[i];
            }
        }

        public Settings(String cardId, AccountId accountId, b flowType) {
            Intrinsics.checkNotNullParameter(cardId, "cardId");
            Intrinsics.checkNotNullParameter(accountId, "accountId");
            Intrinsics.checkNotNullParameter(flowType, "flowType");
            this.f64781a = cardId;
            this.f64782b = accountId;
            this.f64783c = flowType;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Settings)) {
                return false;
            }
            Settings settings = (Settings) obj2;
            return Intrinsics.f(this.f64781a, settings.f64781a) && Intrinsics.f(this.f64782b, settings.f64782b) && this.f64783c == settings.f64783c;
        }

        public final int hashCode() {
            return this.f64783c.hashCode() + l.b(this.f64782b, this.f64781a.hashCode() * 31, 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f64781a);
            dest.writeParcelable(this.f64782b, i);
            dest.writeString(this.f64783c.name());
        }

        public /* synthetic */ Settings(String str) {
            this(str, AccountId.Personal.f51414a, b.DEFAULT);
        }
    }
}
