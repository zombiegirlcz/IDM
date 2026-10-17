package com.revolut.feature.card_screen.api.navigation;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.domain.models.transactions.ThreeDSTransaction;
import com.revolut.kompot.bridge.navigation.KompotDestination;
import com.revolut.retail.core.navigation.NaviCommand;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"Lcom/revolut/feature/card_screen/api/navigation/CardPromptsFlowDestination;", "Lcom/revolut/kompot/bridge/navigation/KompotDestination;", "<init>", "()V", "LocationSecurityPrompt", "MerchantRedirectPrompt", "SwitchToCreditCard", "Lcom/revolut/feature/card_screen/api/navigation/CardPromptsFlowDestination$LocationSecurityPrompt;", "Lcom/revolut/feature/card_screen/api/navigation/CardPromptsFlowDestination$MerchantRedirectPrompt;", "Lcom/revolut/feature/card_screen/api/navigation/CardPromptsFlowDestination$SwitchToCreditCard;", "feature_card_screen_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class CardPromptsFlowDestination implements KompotDestination {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/card_screen/api/navigation/CardPromptsFlowDestination$LocationSecurityPrompt;", "Lcom/revolut/feature/card_screen/api/navigation/CardPromptsFlowDestination;", "", "toString", "()Ljava/lang/String;", "feature_card_screen_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class LocationSecurityPrompt extends CardPromptsFlowDestination {

        @NotNull
        public static final Parcelable.Creator<LocationSecurityPrompt> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f65345a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new LocationSecurityPrompt(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new LocationSecurityPrompt[i];
            }
        }

        public LocationSecurityPrompt(String cardId) {
            Intrinsics.checkNotNullParameter(cardId, "cardId");
            this.f65345a = cardId;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof LocationSecurityPrompt) && Intrinsics.f(this.f65345a, ((LocationSecurityPrompt) obj2).f65345a);
        }

        /* JADX INFO: renamed from: getCardId, reason: from getter */
        public final String getF65345a() {
            return this.f65345a;
        }

        public final int hashCode() {
            return this.f65345a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f65345a);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/card_screen/api/navigation/CardPromptsFlowDestination$MerchantRedirectPrompt;", "Lcom/revolut/feature/card_screen/api/navigation/CardPromptsFlowDestination;", "", "toString", "()Ljava/lang/String;", "feature_card_screen_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class MerchantRedirectPrompt extends CardPromptsFlowDestination {

        @NotNull
        public static final Parcelable.Creator<MerchantRedirectPrompt> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ThreeDSTransaction f65346a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new MerchantRedirectPrompt((ThreeDSTransaction) parcel.readParcelable(MerchantRedirectPrompt.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new MerchantRedirectPrompt[i];
            }
        }

        public MerchantRedirectPrompt(ThreeDSTransaction transaction) {
            Intrinsics.checkNotNullParameter(transaction, "transaction");
            this.f65346a = transaction;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final ThreeDSTransaction getF65346a() {
            return this.f65346a;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof MerchantRedirectPrompt) && Intrinsics.f(this.f65346a, ((MerchantRedirectPrompt) obj2).f65346a);
        }

        public final int hashCode() {
            return this.f65346a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f65346a, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/card_screen/api/navigation/CardPromptsFlowDestination$SwitchToCreditCard;", "Lcom/revolut/feature/card_screen/api/navigation/CardPromptsFlowDestination;", "", "toString", "()Ljava/lang/String;", "feature_card_screen_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class SwitchToCreditCard extends CardPromptsFlowDestination {

        @NotNull
        public static final Parcelable.Creator<SwitchToCreditCard> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f65347a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final List f65348b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final NaviCommand f65349c;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new SwitchToCreditCard(parcel.readString(), parcel.createStringArrayList(), (NaviCommand) parcel.readParcelable(SwitchToCreditCard.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new SwitchToCreditCard[i];
            }
        }

        public SwitchToCreditCard(String cardId, List cardsToTerminate, NaviCommand naviCommand) {
            Intrinsics.checkNotNullParameter(cardId, "cardId");
            Intrinsics.checkNotNullParameter(cardsToTerminate, "cardsToTerminate");
            this.f65347a = cardId;
            this.f65348b = cardsToTerminate;
            this.f65349c = naviCommand;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final List getF65348b() {
            return this.f65348b;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final NaviCommand getF65349c() {
            return this.f65349c;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof SwitchToCreditCard)) {
                return false;
            }
            SwitchToCreditCard switchToCreditCard = (SwitchToCreditCard) obj2;
            return Intrinsics.f(this.f65347a, switchToCreditCard.f65347a) && Intrinsics.f(this.f65348b, switchToCreditCard.f65348b) && Intrinsics.f(this.f65349c, switchToCreditCard.f65349c);
        }

        /* JADX INFO: renamed from: getCardId, reason: from getter */
        public final String getF65347a() {
            return this.f65347a;
        }

        public final int hashCode() {
            int iD = p.a.d(this.f65347a.hashCode() * 31, 31, this.f65348b);
            NaviCommand naviCommand = this.f65349c;
            return iD + (naviCommand == null ? 0 : naviCommand.hashCode());
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f65347a);
            dest.writeStringList(this.f65348b);
            dest.writeParcelable(this.f65349c, i);
        }
    }

    private CardPromptsFlowDestination() {
    }
}
