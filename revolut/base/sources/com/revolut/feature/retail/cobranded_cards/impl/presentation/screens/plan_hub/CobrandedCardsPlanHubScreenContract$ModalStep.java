package com.revolut.feature.retail.cobranded_cards.impl.presentation.screens.plan_hub;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.retail.cobranded_cards.api.domain.model.CobrandedCardsPlanHubInfoBannerActionConfirmation;
import com.revolut.feature.retail.cobranded_cards.api.domain.model.CobrandedCardsPlanHubInfoBannerInfo;
import com.revolut.feature.retail.cobranded_cards.api.domain.model.CobrandedCardsPlanHubInfoRewardInfo;
import com.revolut.kompot.navigable.flow.FlowStep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\bÀ\u0006\u0003"}, d2 = {"com/revolut/feature/retail/cobranded_cards/impl/presentation/screens/plan_hub/CobrandedCardsPlanHubScreenContract$ModalStep", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "BannerInfo", "BannerActionConfirmation", "RewardInfo", "Lcom/revolut/feature/retail/cobranded_cards/impl/presentation/screens/plan_hub/CobrandedCardsPlanHubScreenContract$ModalStep$BannerActionConfirmation;", "Lcom/revolut/feature/retail/cobranded_cards/impl/presentation/screens/plan_hub/CobrandedCardsPlanHubScreenContract$ModalStep$BannerInfo;", "Lcom/revolut/feature/retail/cobranded_cards/impl/presentation/screens/plan_hub/CobrandedCardsPlanHubScreenContract$ModalStep$RewardInfo;", "feature_retail_cobranded_cards_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface CobrandedCardsPlanHubScreenContract$ModalStep extends FlowStep {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/retail/cobranded_cards/impl/presentation/screens/plan_hub/CobrandedCardsPlanHubScreenContract$ModalStep$BannerActionConfirmation;", "Lcom/revolut/feature/retail/cobranded_cards/impl/presentation/screens/plan_hub/CobrandedCardsPlanHubScreenContract$ModalStep;", "", "toString", "()Ljava/lang/String;", "feature_retail_cobranded_cards_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class BannerActionConfirmation implements CobrandedCardsPlanHubScreenContract$ModalStep {

        @NotNull
        public static final Parcelable.Creator<BannerActionConfirmation> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final CobrandedCardsPlanHubScreenContract$ActionBannerPayload f82577a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final CobrandedCardsPlanHubInfoBannerActionConfirmation f82578b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new BannerActionConfirmation((CobrandedCardsPlanHubScreenContract$ActionBannerPayload) parcel.readParcelable(BannerActionConfirmation.class.getClassLoader()), (CobrandedCardsPlanHubInfoBannerActionConfirmation) parcel.readParcelable(BannerActionConfirmation.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new BannerActionConfirmation[i];
            }
        }

        public BannerActionConfirmation(CobrandedCardsPlanHubScreenContract$ActionBannerPayload actionPayload, CobrandedCardsPlanHubInfoBannerActionConfirmation confirmation) {
            Intrinsics.checkNotNullParameter(actionPayload, "actionPayload");
            Intrinsics.checkNotNullParameter(confirmation, "confirmation");
            this.f82577a = actionPayload;
            this.f82578b = confirmation;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof BannerActionConfirmation)) {
                return false;
            }
            BannerActionConfirmation bannerActionConfirmation = (BannerActionConfirmation) obj2;
            return Intrinsics.f(this.f82577a, bannerActionConfirmation.f82577a) && Intrinsics.f(this.f82578b, bannerActionConfirmation.f82578b);
        }

        public final int hashCode() {
            return this.f82578b.hashCode() + (this.f82577a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f82577a, i);
            dest.writeParcelable(this.f82578b, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/retail/cobranded_cards/impl/presentation/screens/plan_hub/CobrandedCardsPlanHubScreenContract$ModalStep$BannerInfo;", "Lcom/revolut/feature/retail/cobranded_cards/impl/presentation/screens/plan_hub/CobrandedCardsPlanHubScreenContract$ModalStep;", "", "toString", "()Ljava/lang/String;", "feature_retail_cobranded_cards_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class BannerInfo implements CobrandedCardsPlanHubScreenContract$ModalStep {

        @NotNull
        public static final Parcelable.Creator<BannerInfo> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final CobrandedCardsPlanHubInfoBannerInfo f82579a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new BannerInfo((CobrandedCardsPlanHubInfoBannerInfo) parcel.readParcelable(BannerInfo.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new BannerInfo[i];
            }
        }

        public BannerInfo(CobrandedCardsPlanHubInfoBannerInfo info) {
            Intrinsics.checkNotNullParameter(info, "info");
            this.f82579a = info;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof BannerInfo) && Intrinsics.f(this.f82579a, ((BannerInfo) obj2).f82579a);
        }

        public final int hashCode() {
            return this.f82579a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f82579a, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/retail/cobranded_cards/impl/presentation/screens/plan_hub/CobrandedCardsPlanHubScreenContract$ModalStep$RewardInfo;", "Lcom/revolut/feature/retail/cobranded_cards/impl/presentation/screens/plan_hub/CobrandedCardsPlanHubScreenContract$ModalStep;", "", "toString", "()Ljava/lang/String;", "feature_retail_cobranded_cards_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class RewardInfo implements CobrandedCardsPlanHubScreenContract$ModalStep {

        @NotNull
        public static final Parcelable.Creator<RewardInfo> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final CobrandedCardsPlanHubInfoRewardInfo f82580a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new RewardInfo((CobrandedCardsPlanHubInfoRewardInfo) parcel.readParcelable(RewardInfo.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new RewardInfo[i];
            }
        }

        public RewardInfo(CobrandedCardsPlanHubInfoRewardInfo rewardInfo) {
            Intrinsics.checkNotNullParameter(rewardInfo, "rewardInfo");
            this.f82580a = rewardInfo;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof RewardInfo) && Intrinsics.f(this.f82580a, ((RewardInfo) obj2).f82580a);
        }

        public final int hashCode() {
            return this.f82580a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f82580a, i);
        }
    }
}
