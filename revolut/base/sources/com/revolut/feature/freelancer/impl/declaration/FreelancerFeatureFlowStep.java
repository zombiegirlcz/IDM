package com.revolut.feature.freelancer.impl.declaration;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.address.models.Address;
import com.revolut.feature.freelancer.api.navigation.FreelancerBizFeatureConfig;
import com.revolut.feature.freelancer.common.models.sale.FreelancerSalesFilters$CompoundFreelancerSalesFilter;
import com.revolut.kompot.FeatureFlowStep;
import com.revolut.retail.core.navigation.NaviCommand;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\u00020\u0001:\u000b\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000eB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u000b\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019¨\u0006\u001a"}, d2 = {"Lcom/revolut/feature/freelancer/impl/declaration/FreelancerFeatureFlowStep;", "Lcom/revolut/kompot/FeatureFlowStep;", "<init>", "()V", "InvoiceDetails", "AddTaxRate", "AnnualInboundVolume", "SalesFilters", "AddCustomer", "FreelancerProfile", "AddInvoiceNotes", "OrderInitPageList", "OrderInitPageDetails", "ProPostActivationPrompt", "ReferralInfo", "Lcom/revolut/feature/freelancer/impl/declaration/FreelancerFeatureFlowStep$AddCustomer;", "Lcom/revolut/feature/freelancer/impl/declaration/FreelancerFeatureFlowStep$AddInvoiceNotes;", "Lcom/revolut/feature/freelancer/impl/declaration/FreelancerFeatureFlowStep$AddTaxRate;", "Lcom/revolut/feature/freelancer/impl/declaration/FreelancerFeatureFlowStep$AnnualInboundVolume;", "Lcom/revolut/feature/freelancer/impl/declaration/FreelancerFeatureFlowStep$FreelancerProfile;", "Lcom/revolut/feature/freelancer/impl/declaration/FreelancerFeatureFlowStep$InvoiceDetails;", "Lcom/revolut/feature/freelancer/impl/declaration/FreelancerFeatureFlowStep$OrderInitPageDetails;", "Lcom/revolut/feature/freelancer/impl/declaration/FreelancerFeatureFlowStep$OrderInitPageList;", "Lcom/revolut/feature/freelancer/impl/declaration/FreelancerFeatureFlowStep$ProPostActivationPrompt;", "Lcom/revolut/feature/freelancer/impl/declaration/FreelancerFeatureFlowStep$ReferralInfo;", "Lcom/revolut/feature/freelancer/impl/declaration/FreelancerFeatureFlowStep$SalesFilters;", "feature_freelancer_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class FreelancerFeatureFlowStep implements FeatureFlowStep {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/freelancer/impl/declaration/FreelancerFeatureFlowStep$AddInvoiceNotes;", "Lcom/revolut/feature/freelancer/impl/declaration/FreelancerFeatureFlowStep;", "", "toString", "()Ljava/lang/String;", "feature_freelancer_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class AddInvoiceNotes extends FreelancerFeatureFlowStep {

        @NotNull
        public static final Parcelable.Creator<AddInvoiceNotes> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f73521a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new AddInvoiceNotes(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new AddInvoiceNotes[i];
            }
        }

        public AddInvoiceNotes(String invoiceId) {
            Intrinsics.checkNotNullParameter(invoiceId, "invoiceId");
            this.f73521a = invoiceId;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getF73521a() {
            return this.f73521a;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof AddInvoiceNotes) && Intrinsics.f(this.f73521a, ((AddInvoiceNotes) obj2).f73521a);
        }

        public final int hashCode() {
            return this.f73521a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f73521a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/freelancer/impl/declaration/FreelancerFeatureFlowStep$AddTaxRate;", "Lcom/revolut/feature/freelancer/impl/declaration/FreelancerFeatureFlowStep;", "<init>", "()V", "feature_freelancer_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class AddTaxRate extends FreelancerFeatureFlowStep {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final AddTaxRate f73522a = new AddTaxRate();

        @NotNull
        public static final Parcelable.Creator<AddTaxRate> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return AddTaxRate.f73522a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new AddTaxRate[i];
            }
        }

        private AddTaxRate() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/freelancer/impl/declaration/FreelancerFeatureFlowStep$AnnualInboundVolume;", "Lcom/revolut/feature/freelancer/impl/declaration/FreelancerFeatureFlowStep;", "<init>", "()V", "feature_freelancer_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class AnnualInboundVolume extends FreelancerFeatureFlowStep {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final AnnualInboundVolume f73523a = new AnnualInboundVolume();

        @NotNull
        public static final Parcelable.Creator<AnnualInboundVolume> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return AnnualInboundVolume.f73523a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new AnnualInboundVolume[i];
            }
        }

        private AnnualInboundVolume() {
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/freelancer/impl/declaration/FreelancerFeatureFlowStep$FreelancerProfile;", "Lcom/revolut/feature/freelancer/impl/declaration/FreelancerFeatureFlowStep;", "", "toString", "()Ljava/lang/String;", "feature_freelancer_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class FreelancerProfile extends FreelancerFeatureFlowStep {

        @NotNull
        public static final Parcelable.Creator<FreelancerProfile> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final FreelancerBizFeatureConfig.FreelancerProfileDestination.LaunchMode f73524a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new FreelancerProfile((FreelancerBizFeatureConfig.FreelancerProfileDestination.LaunchMode) parcel.readParcelable(FreelancerProfile.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new FreelancerProfile[i];
            }
        }

        public FreelancerProfile(FreelancerBizFeatureConfig.FreelancerProfileDestination.LaunchMode launchMode) {
            Intrinsics.checkNotNullParameter(launchMode, "launchMode");
            this.f73524a = launchMode;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final FreelancerBizFeatureConfig.FreelancerProfileDestination.LaunchMode getF73524a() {
            return this.f73524a;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof FreelancerProfile) && Intrinsics.f(this.f73524a, ((FreelancerProfile) obj2).f73524a);
        }

        public final int hashCode() {
            return this.f73524a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f73524a, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/freelancer/impl/declaration/FreelancerFeatureFlowStep$InvoiceDetails;", "Lcom/revolut/feature/freelancer/impl/declaration/FreelancerFeatureFlowStep;", "", "toString", "()Ljava/lang/String;", "feature_freelancer_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class InvoiceDetails extends FreelancerFeatureFlowStep {

        @NotNull
        public static final Parcelable.Creator<InvoiceDetails> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f73525a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new InvoiceDetails(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new InvoiceDetails[i];
            }
        }

        public InvoiceDetails(String invoiceId) {
            Intrinsics.checkNotNullParameter(invoiceId, "invoiceId");
            this.f73525a = invoiceId;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getF73525a() {
            return this.f73525a;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof InvoiceDetails) && Intrinsics.f(this.f73525a, ((InvoiceDetails) obj2).f73525a);
        }

        public final int hashCode() {
            return this.f73525a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f73525a);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/freelancer/impl/declaration/FreelancerFeatureFlowStep$OrderInitPageDetails;", "Lcom/revolut/feature/freelancer/impl/declaration/FreelancerFeatureFlowStep;", "", "toString", "()Ljava/lang/String;", "feature_freelancer_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class OrderInitPageDetails extends FreelancerFeatureFlowStep {

        @NotNull
        public static final Parcelable.Creator<OrderInitPageDetails> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f73526a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new OrderInitPageDetails(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new OrderInitPageDetails[i];
            }
        }

        public OrderInitPageDetails(String pageId) {
            Intrinsics.checkNotNullParameter(pageId, "pageId");
            this.f73526a = pageId;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getF73526a() {
            return this.f73526a;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof OrderInitPageDetails) && Intrinsics.f(this.f73526a, ((OrderInitPageDetails) obj2).f73526a);
        }

        public final int hashCode() {
            return this.f73526a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f73526a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/freelancer/impl/declaration/FreelancerFeatureFlowStep$OrderInitPageList;", "Lcom/revolut/feature/freelancer/impl/declaration/FreelancerFeatureFlowStep;", "<init>", "()V", "feature_freelancer_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class OrderInitPageList extends FreelancerFeatureFlowStep {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final OrderInitPageList f73527a = new OrderInitPageList();

        @NotNull
        public static final Parcelable.Creator<OrderInitPageList> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return OrderInitPageList.f73527a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new OrderInitPageList[i];
            }
        }

        private OrderInitPageList() {
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/freelancer/impl/declaration/FreelancerFeatureFlowStep$ProPostActivationPrompt;", "Lcom/revolut/feature/freelancer/impl/declaration/FreelancerFeatureFlowStep;", "", "toString", "()Ljava/lang/String;", "feature_freelancer_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class ProPostActivationPrompt extends FreelancerFeatureFlowStep {

        @NotNull
        public static final Parcelable.Creator<ProPostActivationPrompt> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final dr6.a f73528a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final FreelancerBizFeatureConfig.ProPostActivationPromptDestination.NotNowAction f73529b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final NaviCommand f73530c;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new ProPostActivationPrompt(dr6.a.valueOf(parcel.readString()), (FreelancerBizFeatureConfig.ProPostActivationPromptDestination.NotNowAction) parcel.readParcelable(ProPostActivationPrompt.class.getClassLoader()), (NaviCommand) parcel.readParcelable(ProPostActivationPrompt.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ProPostActivationPrompt[i];
            }
        }

        public ProPostActivationPrompt(dr6.a onboardingArticleContext, FreelancerBizFeatureConfig.ProPostActivationPromptDestination.NotNowAction notNowAction, NaviCommand mainScreenCommand) {
            Intrinsics.checkNotNullParameter(onboardingArticleContext, "onboardingArticleContext");
            Intrinsics.checkNotNullParameter(notNowAction, "notNowAction");
            Intrinsics.checkNotNullParameter(mainScreenCommand, "mainScreenCommand");
            this.f73528a = onboardingArticleContext;
            this.f73529b = notNowAction;
            this.f73530c = mainScreenCommand;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final NaviCommand getF73530c() {
            return this.f73530c;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final FreelancerBizFeatureConfig.ProPostActivationPromptDestination.NotNowAction getF73529b() {
            return this.f73529b;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final dr6.a getF73528a() {
            return this.f73528a;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof ProPostActivationPrompt)) {
                return false;
            }
            ProPostActivationPrompt proPostActivationPrompt = (ProPostActivationPrompt) obj2;
            return this.f73528a == proPostActivationPrompt.f73528a && Intrinsics.f(this.f73529b, proPostActivationPrompt.f73529b) && Intrinsics.f(this.f73530c, proPostActivationPrompt.f73530c);
        }

        public final int hashCode() {
            return this.f73530c.hashCode() + ((this.f73529b.hashCode() + (this.f73528a.hashCode() * 31)) * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f73528a.name());
            dest.writeParcelable(this.f73529b, i);
            dest.writeParcelable(this.f73530c, i);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/freelancer/impl/declaration/FreelancerFeatureFlowStep$ReferralInfo;", "Lcom/revolut/feature/freelancer/impl/declaration/FreelancerFeatureFlowStep;", "<init>", "()V", "feature_freelancer_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class ReferralInfo extends FreelancerFeatureFlowStep {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final ReferralInfo f73531a = new ReferralInfo();

        @NotNull
        public static final Parcelable.Creator<ReferralInfo> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return ReferralInfo.f73531a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ReferralInfo[i];
            }
        }

        private ReferralInfo() {
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/freelancer/impl/declaration/FreelancerFeatureFlowStep$SalesFilters;", "Lcom/revolut/feature/freelancer/impl/declaration/FreelancerFeatureFlowStep;", "", "toString", "()Ljava/lang/String;", "feature_freelancer_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class SalesFilters extends FreelancerFeatureFlowStep {

        @NotNull
        public static final Parcelable.Creator<SalesFilters> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final FreelancerSalesFilters$CompoundFreelancerSalesFilter f73532a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new SalesFilters((FreelancerSalesFilters$CompoundFreelancerSalesFilter) parcel.readParcelable(SalesFilters.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new SalesFilters[i];
            }
        }

        public SalesFilters(FreelancerSalesFilters$CompoundFreelancerSalesFilter filter) {
            Intrinsics.checkNotNullParameter(filter, "filter");
            this.f73532a = filter;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final FreelancerSalesFilters$CompoundFreelancerSalesFilter getF73532a() {
            return this.f73532a;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof SalesFilters) && Intrinsics.f(this.f73532a, ((SalesFilters) obj2).f73532a);
        }

        public final int hashCode() {
            return this.f73532a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f73532a, i);
        }
    }

    private FreelancerFeatureFlowStep() {
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/freelancer/impl/declaration/FreelancerFeatureFlowStep$AddCustomer;", "Lcom/revolut/feature/freelancer/impl/declaration/FreelancerFeatureFlowStep;", "", "toString", "()Ljava/lang/String;", "feature_freelancer_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class AddCustomer extends FreelancerFeatureFlowStep {

        @NotNull
        public static final Parcelable.Creator<AddCustomer> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f73518a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f73519b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f73520c;
        public final String d;
        public final String e;
        public final Address f;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new AddCustomer(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), (Address) parcel.readParcelable(AddCustomer.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new AddCustomer[i];
            }
        }

        public AddCustomer(String str, String str2, String str3, String str4, String str5, Address address) {
            this.f73518a = str;
            this.f73519b = str2;
            this.f73520c = str3;
            this.d = str4;
            this.e = str5;
            this.f = address;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final Address getF() {
            return this.f;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getD() {
            return this.d;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final String getE() {
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
            if (!(obj2 instanceof AddCustomer)) {
                return false;
            }
            AddCustomer addCustomer = (AddCustomer) obj2;
            return Intrinsics.f(this.f73518a, addCustomer.f73518a) && Intrinsics.f(this.f73519b, addCustomer.f73519b) && Intrinsics.f(this.f73520c, addCustomer.f73520c) && Intrinsics.f(this.d, addCustomer.d) && Intrinsics.f(this.e, addCustomer.e) && Intrinsics.f(this.f, addCustomer.f);
        }

        /* JADX INFO: renamed from: getEmail, reason: from getter */
        public final String getF73520c() {
            return this.f73520c;
        }

        /* JADX INFO: renamed from: getId, reason: from getter */
        public final String getF73518a() {
            return this.f73518a;
        }

        /* JADX INFO: renamed from: getName, reason: from getter */
        public final String getF73519b() {
            return this.f73519b;
        }

        public final int hashCode() {
            String str = this.f73518a;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.f73519b;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.f73520c;
            int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.d;
            int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
            String str5 = this.e;
            int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
            Address address = this.f;
            return iHashCode5 + (address != null ? address.hashCode() : 0);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f73518a);
            dest.writeString(this.f73519b);
            dest.writeString(this.f73520c);
            dest.writeString(this.d);
            dest.writeString(this.e);
            dest.writeParcelable(this.f, i);
        }

        public AddCustomer() {
            this(null, null, null, null, null, null);
        }
    }
}
