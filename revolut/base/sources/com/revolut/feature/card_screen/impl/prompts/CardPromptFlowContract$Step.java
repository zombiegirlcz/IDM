package com.revolut.feature.card_screen.impl.prompts;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.domain.models.transactions.ThreeDSTransaction;
import com.revolut.kompot.navigable.flow.FlowStep;
import com.revolut.retail.core.navigation.NaviCommand;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"com/revolut/feature/card_screen/impl/prompts/CardPromptFlowContract$Step", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "<init>", "()V", "AskLocationSecurityPrompt", "MerchantRedirectPrompt", "SwitchToNewCreditCard", "Lcom/revolut/feature/card_screen/impl/prompts/CardPromptFlowContract$Step$AskLocationSecurityPrompt;", "Lcom/revolut/feature/card_screen/impl/prompts/CardPromptFlowContract$Step$MerchantRedirectPrompt;", "Lcom/revolut/feature/card_screen/impl/prompts/CardPromptFlowContract$Step$SwitchToNewCreditCard;", "feature_card_screen_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class CardPromptFlowContract$Step implements FlowStep {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/card_screen/impl/prompts/CardPromptFlowContract$Step$AskLocationSecurityPrompt;", "Lcom/revolut/feature/card_screen/impl/prompts/CardPromptFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_card_screen_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class AskLocationSecurityPrompt extends CardPromptFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<AskLocationSecurityPrompt> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f65506a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new AskLocationSecurityPrompt(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new AskLocationSecurityPrompt[i];
            }
        }

        public AskLocationSecurityPrompt(String cardId) {
            Intrinsics.checkNotNullParameter(cardId, "cardId");
            this.f65506a = cardId;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof AskLocationSecurityPrompt) && Intrinsics.f(this.f65506a, ((AskLocationSecurityPrompt) obj2).f65506a);
        }

        public final int hashCode() {
            return this.f65506a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f65506a);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/card_screen/impl/prompts/CardPromptFlowContract$Step$MerchantRedirectPrompt;", "Lcom/revolut/feature/card_screen/impl/prompts/CardPromptFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_card_screen_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class MerchantRedirectPrompt extends CardPromptFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<MerchantRedirectPrompt> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ThreeDSTransaction f65507a;

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
            this.f65507a = transaction;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof MerchantRedirectPrompt) && Intrinsics.f(this.f65507a, ((MerchantRedirectPrompt) obj2).f65507a);
        }

        public final int hashCode() {
            return this.f65507a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f65507a, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/card_screen/impl/prompts/CardPromptFlowContract$Step$SwitchToNewCreditCard;", "Lcom/revolut/feature/card_screen/impl/prompts/CardPromptFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_card_screen_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class SwitchToNewCreditCard extends CardPromptFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<SwitchToNewCreditCard> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f65508a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final List f65509b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final NaviCommand f65510c;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new SwitchToNewCreditCard(parcel.readString(), parcel.createStringArrayList(), (NaviCommand) parcel.readParcelable(SwitchToNewCreditCard.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new SwitchToNewCreditCard[i];
            }
        }

        public SwitchToNewCreditCard(String cardId, List cardsToTerminate, NaviCommand naviCommand) {
            Intrinsics.checkNotNullParameter(cardId, "cardId");
            Intrinsics.checkNotNullParameter(cardsToTerminate, "cardsToTerminate");
            this.f65508a = cardId;
            this.f65509b = cardsToTerminate;
            this.f65510c = naviCommand;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof SwitchToNewCreditCard)) {
                return false;
            }
            SwitchToNewCreditCard switchToNewCreditCard = (SwitchToNewCreditCard) obj2;
            return Intrinsics.f(this.f65508a, switchToNewCreditCard.f65508a) && Intrinsics.f(this.f65509b, switchToNewCreditCard.f65509b) && Intrinsics.f(this.f65510c, switchToNewCreditCard.f65510c);
        }

        public final int hashCode() {
            int iD = p.a.d(this.f65508a.hashCode() * 31, 31, this.f65509b);
            NaviCommand naviCommand = this.f65510c;
            return iD + (naviCommand == null ? 0 : naviCommand.hashCode());
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f65508a);
            dest.writeStringList(this.f65509b);
            dest.writeParcelable(this.f65510c, i);
        }
    }

    private CardPromptFlowContract$Step() {
    }
}
