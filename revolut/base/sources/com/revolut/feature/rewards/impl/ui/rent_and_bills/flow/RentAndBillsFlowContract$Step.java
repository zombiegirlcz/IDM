package com.revolut.feature.rewards.impl.ui.rent_and_bills.flow;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.rewards.api.model.rent_and_bills.RentAndBillsConfigurations;
import com.revolut.kompot.navigable.flow.FlowStep;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u00004\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\n\u0004\u0005\u0006\u0007\b\t\n\u000b\f\rB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\n\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017¨\u0006\u0018"}, d2 = {"com/revolut/feature/rewards/impl/ui/rent_and_bills/flow/RentAndBillsFlowContract$Step", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "<init>", "()V", "RevPointsOptIn", "ProductArticle", "Home", "LinkPaymentInfo", "SelectPayment", "ManageLinkedPayments", "AllowanceDetails", "EarnRateDetails", "UnlinkPayments", "RevPointsEarnedPrompt", "Lcom/revolut/feature/rewards/impl/ui/rent_and_bills/flow/RentAndBillsFlowContract$Step$AllowanceDetails;", "Lcom/revolut/feature/rewards/impl/ui/rent_and_bills/flow/RentAndBillsFlowContract$Step$EarnRateDetails;", "Lcom/revolut/feature/rewards/impl/ui/rent_and_bills/flow/RentAndBillsFlowContract$Step$Home;", "Lcom/revolut/feature/rewards/impl/ui/rent_and_bills/flow/RentAndBillsFlowContract$Step$LinkPaymentInfo;", "Lcom/revolut/feature/rewards/impl/ui/rent_and_bills/flow/RentAndBillsFlowContract$Step$ManageLinkedPayments;", "Lcom/revolut/feature/rewards/impl/ui/rent_and_bills/flow/RentAndBillsFlowContract$Step$ProductArticle;", "Lcom/revolut/feature/rewards/impl/ui/rent_and_bills/flow/RentAndBillsFlowContract$Step$RevPointsEarnedPrompt;", "Lcom/revolut/feature/rewards/impl/ui/rent_and_bills/flow/RentAndBillsFlowContract$Step$RevPointsOptIn;", "Lcom/revolut/feature/rewards/impl/ui/rent_and_bills/flow/RentAndBillsFlowContract$Step$SelectPayment;", "Lcom/revolut/feature/rewards/impl/ui/rent_and_bills/flow/RentAndBillsFlowContract$Step$UnlinkPayments;", "feature_retail_rewards_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class RentAndBillsFlowContract$Step implements FlowStep {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/rewards/impl/ui/rent_and_bills/flow/RentAndBillsFlowContract$Step$AllowanceDetails;", "Lcom/revolut/feature/rewards/impl/ui/rent_and_bills/flow/RentAndBillsFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_retail_rewards_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class AllowanceDetails extends RentAndBillsFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<AllowanceDetails> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final egc.a f84955a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final RentAndBillsConfigurations.Configuration f84956b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final double f84957c;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new AllowanceDetails(egc.a.valueOf(parcel.readString()), (RentAndBillsConfigurations.Configuration) parcel.readParcelable(AllowanceDetails.class.getClassLoader()), parcel.readDouble());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new AllowanceDetails[i];
            }
        }

        public AllowanceDetails(egc.a categoryType, RentAndBillsConfigurations.Configuration perkConfiguration, double d) {
            Intrinsics.checkNotNullParameter(categoryType, "categoryType");
            Intrinsics.checkNotNullParameter(perkConfiguration, "perkConfiguration");
            this.f84955a = categoryType;
            this.f84956b = perkConfiguration;
            this.f84957c = d;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof AllowanceDetails)) {
                return false;
            }
            AllowanceDetails allowanceDetails = (AllowanceDetails) obj2;
            return this.f84955a == allowanceDetails.f84955a && Intrinsics.f(this.f84956b, allowanceDetails.f84956b) && Double.compare(this.f84957c, allowanceDetails.f84957c) == 0;
        }

        public final int hashCode() {
            return Double.hashCode(this.f84957c) + ((this.f84956b.hashCode() + (this.f84955a.hashCode() * 31)) * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f84955a.name());
            dest.writeParcelable(this.f84956b, i);
            dest.writeDouble(this.f84957c);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/rewards/impl/ui/rent_and_bills/flow/RentAndBillsFlowContract$Step$EarnRateDetails;", "Lcom/revolut/feature/rewards/impl/ui/rent_and_bills/flow/RentAndBillsFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_retail_rewards_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class EarnRateDetails extends RentAndBillsFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<EarnRateDetails> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final egc.a f84958a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final RentAndBillsConfigurations.Configuration f84959b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new EarnRateDetails(egc.a.valueOf(parcel.readString()), (RentAndBillsConfigurations.Configuration) parcel.readParcelable(EarnRateDetails.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new EarnRateDetails[i];
            }
        }

        public EarnRateDetails(egc.a categoryType, RentAndBillsConfigurations.Configuration perkConfiguration) {
            Intrinsics.checkNotNullParameter(categoryType, "categoryType");
            Intrinsics.checkNotNullParameter(perkConfiguration, "perkConfiguration");
            this.f84958a = categoryType;
            this.f84959b = perkConfiguration;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof EarnRateDetails)) {
                return false;
            }
            EarnRateDetails earnRateDetails = (EarnRateDetails) obj2;
            return this.f84958a == earnRateDetails.f84958a && Intrinsics.f(this.f84959b, earnRateDetails.f84959b);
        }

        public final int hashCode() {
            return this.f84959b.hashCode() + (this.f84958a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f84958a.name());
            dest.writeParcelable(this.f84959b, i);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/rewards/impl/ui/rent_and_bills/flow/RentAndBillsFlowContract$Step$Home;", "Lcom/revolut/feature/rewards/impl/ui/rent_and_bills/flow/RentAndBillsFlowContract$Step;", "<init>", "()V", "feature_retail_rewards_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Home extends RentAndBillsFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Home f84960a = new Home();

        @NotNull
        public static final Parcelable.Creator<Home> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Home.f84960a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Home[i];
            }
        }

        private Home() {
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/rewards/impl/ui/rent_and_bills/flow/RentAndBillsFlowContract$Step$LinkPaymentInfo;", "Lcom/revolut/feature/rewards/impl/ui/rent_and_bills/flow/RentAndBillsFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_retail_rewards_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class LinkPaymentInfo extends RentAndBillsFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<LinkPaymentInfo> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final egc.a f84961a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final RentAndBillsConfigurations.Configuration f84962b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new LinkPaymentInfo(egc.a.valueOf(parcel.readString()), (RentAndBillsConfigurations.Configuration) parcel.readParcelable(LinkPaymentInfo.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new LinkPaymentInfo[i];
            }
        }

        public LinkPaymentInfo(egc.a categoryType, RentAndBillsConfigurations.Configuration perkConfiguration) {
            Intrinsics.checkNotNullParameter(categoryType, "categoryType");
            Intrinsics.checkNotNullParameter(perkConfiguration, "perkConfiguration");
            this.f84961a = categoryType;
            this.f84962b = perkConfiguration;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof LinkPaymentInfo)) {
                return false;
            }
            LinkPaymentInfo linkPaymentInfo = (LinkPaymentInfo) obj2;
            return this.f84961a == linkPaymentInfo.f84961a && Intrinsics.f(this.f84962b, linkPaymentInfo.f84962b);
        }

        public final int hashCode() {
            return this.f84962b.hashCode() + (this.f84961a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f84961a.name());
            dest.writeParcelable(this.f84962b, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/rewards/impl/ui/rent_and_bills/flow/RentAndBillsFlowContract$Step$ManageLinkedPayments;", "Lcom/revolut/feature/rewards/impl/ui/rent_and_bills/flow/RentAndBillsFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_retail_rewards_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class ManageLinkedPayments extends RentAndBillsFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<ManageLinkedPayments> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final egc.a f84963a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final RentAndBillsConfigurations.Configuration f84964b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new ManageLinkedPayments(egc.a.valueOf(parcel.readString()), (RentAndBillsConfigurations.Configuration) parcel.readParcelable(ManageLinkedPayments.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ManageLinkedPayments[i];
            }
        }

        public ManageLinkedPayments(egc.a categoryType, RentAndBillsConfigurations.Configuration perkConfiguration) {
            Intrinsics.checkNotNullParameter(categoryType, "categoryType");
            Intrinsics.checkNotNullParameter(perkConfiguration, "perkConfiguration");
            this.f84963a = categoryType;
            this.f84964b = perkConfiguration;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof ManageLinkedPayments)) {
                return false;
            }
            ManageLinkedPayments manageLinkedPayments = (ManageLinkedPayments) obj2;
            return this.f84963a == manageLinkedPayments.f84963a && Intrinsics.f(this.f84964b, manageLinkedPayments.f84964b);
        }

        public final int hashCode() {
            return this.f84964b.hashCode() + (this.f84963a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f84963a.name());
            dest.writeParcelable(this.f84964b, i);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/rewards/impl/ui/rent_and_bills/flow/RentAndBillsFlowContract$Step$ProductArticle;", "Lcom/revolut/feature/rewards/impl/ui/rent_and_bills/flow/RentAndBillsFlowContract$Step;", "<init>", "()V", "feature_retail_rewards_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class ProductArticle extends RentAndBillsFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final ProductArticle f84965a = new ProductArticle();

        @NotNull
        public static final Parcelable.Creator<ProductArticle> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return ProductArticle.f84965a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ProductArticle[i];
            }
        }

        private ProductArticle() {
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/rewards/impl/ui/rent_and_bills/flow/RentAndBillsFlowContract$Step$RevPointsEarnedPrompt;", "Lcom/revolut/feature/rewards/impl/ui/rent_and_bills/flow/RentAndBillsFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_retail_rewards_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class RevPointsEarnedPrompt extends RentAndBillsFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<RevPointsEarnedPrompt> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f84966a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new RevPointsEarnedPrompt(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new RevPointsEarnedPrompt[i];
            }
        }

        public RevPointsEarnedPrompt(String loyaltyTransactionId) {
            Intrinsics.checkNotNullParameter(loyaltyTransactionId, "loyaltyTransactionId");
            this.f84966a = loyaltyTransactionId;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof RevPointsEarnedPrompt) && Intrinsics.f(this.f84966a, ((RevPointsEarnedPrompt) obj2).f84966a);
        }

        public final int hashCode() {
            return this.f84966a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f84966a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/rewards/impl/ui/rent_and_bills/flow/RentAndBillsFlowContract$Step$RevPointsOptIn;", "Lcom/revolut/feature/rewards/impl/ui/rent_and_bills/flow/RentAndBillsFlowContract$Step;", "<init>", "()V", "feature_retail_rewards_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class RevPointsOptIn extends RentAndBillsFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final RevPointsOptIn f84967a = new RevPointsOptIn();

        @NotNull
        public static final Parcelable.Creator<RevPointsOptIn> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return RevPointsOptIn.f84967a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new RevPointsOptIn[i];
            }
        }

        private RevPointsOptIn() {
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/rewards/impl/ui/rent_and_bills/flow/RentAndBillsFlowContract$Step$SelectPayment;", "Lcom/revolut/feature/rewards/impl/ui/rent_and_bills/flow/RentAndBillsFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_retail_rewards_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class SelectPayment extends RentAndBillsFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<SelectPayment> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final egc.a f84968a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final RentAndBillsConfigurations.Configuration f84969b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new SelectPayment(egc.a.valueOf(parcel.readString()), (RentAndBillsConfigurations.Configuration) parcel.readParcelable(SelectPayment.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new SelectPayment[i];
            }
        }

        public SelectPayment(egc.a categoryType, RentAndBillsConfigurations.Configuration perkConfiguration) {
            Intrinsics.checkNotNullParameter(categoryType, "categoryType");
            Intrinsics.checkNotNullParameter(perkConfiguration, "perkConfiguration");
            this.f84968a = categoryType;
            this.f84969b = perkConfiguration;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof SelectPayment)) {
                return false;
            }
            SelectPayment selectPayment = (SelectPayment) obj2;
            return this.f84968a == selectPayment.f84968a && Intrinsics.f(this.f84969b, selectPayment.f84969b);
        }

        public final int hashCode() {
            return this.f84969b.hashCode() + (this.f84968a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f84968a.name());
            dest.writeParcelable(this.f84969b, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/rewards/impl/ui/rent_and_bills/flow/RentAndBillsFlowContract$Step$UnlinkPayments;", "Lcom/revolut/feature/rewards/impl/ui/rent_and_bills/flow/RentAndBillsFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_retail_rewards_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class UnlinkPayments extends RentAndBillsFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<UnlinkPayments> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final egc.a f84970a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final List f84971b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final ArrayList f84972c;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                egc.a aVarValueOf = egc.a.valueOf(parcel.readString());
                int i = parcel.readInt();
                ArrayList arrayList = new ArrayList(i);
                int iE = 0;
                int iC = 0;
                while (iC != i) {
                    iC = ch.qos.logback.core.util.a.c(parcel, arrayList, iC, 1);
                }
                int i2 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i2);
                while (iE != i2) {
                    iE = j6.a.e(UnlinkPayments.class, parcel, arrayList2, iE, 1);
                }
                return new UnlinkPayments(aVarValueOf, arrayList, arrayList2);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new UnlinkPayments[i];
            }
        }

        public UnlinkPayments(egc.a categoryType, List recurringPayments, ArrayList linkedPaymentsForCategory) {
            Intrinsics.checkNotNullParameter(categoryType, "categoryType");
            Intrinsics.checkNotNullParameter(recurringPayments, "recurringPayments");
            Intrinsics.checkNotNullParameter(linkedPaymentsForCategory, "linkedPaymentsForCategory");
            this.f84970a = categoryType;
            this.f84971b = recurringPayments;
            this.f84972c = linkedPaymentsForCategory;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof UnlinkPayments)) {
                return false;
            }
            UnlinkPayments unlinkPayments = (UnlinkPayments) obj2;
            return this.f84970a == unlinkPayments.f84970a && this.f84971b.equals(unlinkPayments.f84971b) && this.f84972c.equals(unlinkPayments.f84972c);
        }

        public final int hashCode() {
            return this.f84972c.hashCode() + p.a.d(this.f84970a.hashCode() * 31, 31, this.f84971b);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f84970a.name());
            Iterator itV = p.a.v(this.f84971b, dest);
            while (itV.hasNext()) {
                dest.writeSerializable((Serializable) itV.next());
            }
            Iterator itY = j6.a.y(this.f84972c, dest);
            while (itY.hasNext()) {
                dest.writeParcelable((Parcelable) itY.next(), i);
            }
        }
    }

    private RentAndBillsFlowContract$Step() {
    }
}
