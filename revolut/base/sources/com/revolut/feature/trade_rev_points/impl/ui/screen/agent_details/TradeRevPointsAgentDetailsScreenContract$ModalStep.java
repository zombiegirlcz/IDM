package com.revolut.feature.trade_rev_points.impl.ui.screen.agent_details;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.rev_points.giftcards.api.navigation.descriptor.RevPointsGiftcardsPurchaseController$InputData;
import com.revolut.feature.trade_rev_points.models.TradeRevPointsRedeemOption;
import com.revolut.kompot.navigable.flow.FlowStep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0005\u0002\u0003\u0004\u0005\u0006\u0082\u0001\u0005\u0007\b\t\n\u000b¨\u0006\fÀ\u0006\u0003"}, d2 = {"com/revolut/feature/trade_rev_points/impl/ui/screen/agent_details/TradeRevPointsAgentDetailsScreenContract$ModalStep", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "BrandInfo", "AccountUnlinking", "RevPointsGiftCardsPurchase", "AccountRegistrationByTaxId", "RedeemOptions", "Lcom/revolut/feature/trade_rev_points/impl/ui/screen/agent_details/TradeRevPointsAgentDetailsScreenContract$ModalStep$AccountRegistrationByTaxId;", "Lcom/revolut/feature/trade_rev_points/impl/ui/screen/agent_details/TradeRevPointsAgentDetailsScreenContract$ModalStep$AccountUnlinking;", "Lcom/revolut/feature/trade_rev_points/impl/ui/screen/agent_details/TradeRevPointsAgentDetailsScreenContract$ModalStep$BrandInfo;", "Lcom/revolut/feature/trade_rev_points/impl/ui/screen/agent_details/TradeRevPointsAgentDetailsScreenContract$ModalStep$RedeemOptions;", "Lcom/revolut/feature/trade_rev_points/impl/ui/screen/agent_details/TradeRevPointsAgentDetailsScreenContract$ModalStep$RevPointsGiftCardsPurchase;", "feature_trade_rev_points_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface TradeRevPointsAgentDetailsScreenContract$ModalStep extends FlowStep {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/trade_rev_points/impl/ui/screen/agent_details/TradeRevPointsAgentDetailsScreenContract$ModalStep$AccountRegistrationByTaxId;", "Lcom/revolut/feature/trade_rev_points/impl/ui/screen/agent_details/TradeRevPointsAgentDetailsScreenContract$ModalStep;", "", "toString", "()Ljava/lang/String;", "feature_trade_rev_points_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class AccountRegistrationByTaxId implements TradeRevPointsAgentDetailsScreenContract$ModalStep {

        @NotNull
        public static final Parcelable.Creator<AccountRegistrationByTaxId> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f91140a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f91141b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new AccountRegistrationByTaxId(parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new AccountRegistrationByTaxId[i];
            }
        }

        public AccountRegistrationByTaxId(String taxId, String agentId) {
            Intrinsics.checkNotNullParameter(taxId, "taxId");
            Intrinsics.checkNotNullParameter(agentId, "agentId");
            this.f91140a = taxId;
            this.f91141b = agentId;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof AccountRegistrationByTaxId)) {
                return false;
            }
            AccountRegistrationByTaxId accountRegistrationByTaxId = (AccountRegistrationByTaxId) obj2;
            return Intrinsics.f(this.f91140a, accountRegistrationByTaxId.f91140a) && Intrinsics.f(this.f91141b, accountRegistrationByTaxId.f91141b);
        }

        public final int hashCode() {
            return this.f91141b.hashCode() + (this.f91140a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f91140a);
            dest.writeString(this.f91141b);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/trade_rev_points/impl/ui/screen/agent_details/TradeRevPointsAgentDetailsScreenContract$ModalStep$AccountUnlinking;", "Lcom/revolut/feature/trade_rev_points/impl/ui/screen/agent_details/TradeRevPointsAgentDetailsScreenContract$ModalStep;", "", "toString", "()Ljava/lang/String;", "feature_trade_rev_points_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class AccountUnlinking implements TradeRevPointsAgentDetailsScreenContract$ModalStep {

        @NotNull
        public static final Parcelable.Creator<AccountUnlinking> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f91142a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new AccountUnlinking(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new AccountUnlinking[i];
            }
        }

        public AccountUnlinking(String name) {
            Intrinsics.checkNotNullParameter(name, "name");
            this.f91142a = name;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof AccountUnlinking) && Intrinsics.f(this.f91142a, ((AccountUnlinking) obj2).f91142a);
        }

        public final int hashCode() {
            return this.f91142a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f91142a);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/trade_rev_points/impl/ui/screen/agent_details/TradeRevPointsAgentDetailsScreenContract$ModalStep$BrandInfo;", "Lcom/revolut/feature/trade_rev_points/impl/ui/screen/agent_details/TradeRevPointsAgentDetailsScreenContract$ModalStep;", "", "toString", "()Ljava/lang/String;", "feature_trade_rev_points_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class BrandInfo implements TradeRevPointsAgentDetailsScreenContract$ModalStep {

        @NotNull
        public static final Parcelable.Creator<BrandInfo> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f91143a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f91144b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f91145c;
        public final String d;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new BrandInfo(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new BrandInfo[i];
            }
        }

        public BrandInfo(String imageUrl, String title, String description, String learnMoreUrl) {
            Intrinsics.checkNotNullParameter(imageUrl, "imageUrl");
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(description, "description");
            Intrinsics.checkNotNullParameter(learnMoreUrl, "learnMoreUrl");
            this.f91143a = imageUrl;
            this.f91144b = title;
            this.f91145c = description;
            this.d = learnMoreUrl;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof BrandInfo)) {
                return false;
            }
            BrandInfo brandInfo = (BrandInfo) obj2;
            return Intrinsics.f(this.f91143a, brandInfo.f91143a) && Intrinsics.f(this.f91144b, brandInfo.f91144b) && Intrinsics.f(this.f91145c, brandInfo.f91145c) && Intrinsics.f(this.d, brandInfo.d);
        }

        public final int hashCode() {
            return this.d.hashCode() + p.a.c(p.a.c(this.f91143a.hashCode() * 31, 31, this.f91144b), 31, this.f91145c);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f91143a);
            dest.writeString(this.f91144b);
            dest.writeString(this.f91145c);
            dest.writeString(this.d);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/trade_rev_points/impl/ui/screen/agent_details/TradeRevPointsAgentDetailsScreenContract$ModalStep$RedeemOptions;", "Lcom/revolut/feature/trade_rev_points/impl/ui/screen/agent_details/TradeRevPointsAgentDetailsScreenContract$ModalStep;", "", "toString", "()Ljava/lang/String;", "feature_trade_rev_points_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class RedeemOptions implements TradeRevPointsAgentDetailsScreenContract$ModalStep {

        @NotNull
        public static final Parcelable.Creator<RedeemOptions> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final TradeRevPointsRedeemOption f91146a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new RedeemOptions((TradeRevPointsRedeemOption) parcel.readParcelable(RedeemOptions.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new RedeemOptions[i];
            }
        }

        public RedeemOptions(TradeRevPointsRedeemOption redeemOption) {
            Intrinsics.checkNotNullParameter(redeemOption, "redeemOption");
            this.f91146a = redeemOption;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof RedeemOptions) && Intrinsics.f(this.f91146a, ((RedeemOptions) obj2).f91146a);
        }

        public final int hashCode() {
            return this.f91146a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f91146a, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/trade_rev_points/impl/ui/screen/agent_details/TradeRevPointsAgentDetailsScreenContract$ModalStep$RevPointsGiftCardsPurchase;", "Lcom/revolut/feature/trade_rev_points/impl/ui/screen/agent_details/TradeRevPointsAgentDetailsScreenContract$ModalStep;", "", "toString", "()Ljava/lang/String;", "feature_trade_rev_points_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class RevPointsGiftCardsPurchase implements TradeRevPointsAgentDetailsScreenContract$ModalStep {

        @NotNull
        public static final Parcelable.Creator<RevPointsGiftCardsPurchase> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final RevPointsGiftcardsPurchaseController$InputData f91147a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new RevPointsGiftCardsPurchase((RevPointsGiftcardsPurchaseController$InputData) parcel.readParcelable(RevPointsGiftCardsPurchase.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new RevPointsGiftCardsPurchase[i];
            }
        }

        public RevPointsGiftCardsPurchase(RevPointsGiftcardsPurchaseController$InputData input) {
            Intrinsics.checkNotNullParameter(input, "input");
            this.f91147a = input;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof RevPointsGiftCardsPurchase) && Intrinsics.f(this.f91147a, ((RevPointsGiftCardsPurchase) obj2).f91147a);
        }

        public final int hashCode() {
            return this.f91147a.f83671a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f91147a, i);
        }
    }
}
