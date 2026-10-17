package com.revolut.retail.feature.esim.impl.ui.screens.home.subscriptions;

import aii.r;
import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.retail.feature.esim.api.model.EsimGiftRecipient;
import com.revolut.retail.feature.esim.api.model.EsimPhoneNumberPorting;
import com.revolut.retail.feature.esim.api.model.EsimPhoneNumberSelections;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import pij.x;
import wp5.y;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000H\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u00012\u00020\u0002:\u000f\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0082\u0001\u000e\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f¨\u0006 À\u0006\u0003"}, d2 = {"com/revolut/retail/feature/esim/impl/ui/screens/home/subscriptions/EsimSubscriptionsScreenContract$OutputData", "Laii/r;", "Landroid/os/Parcelable;", "pij/x", "GoToGetPlan", "GoToExpiredPlans", "GiftPlanClicked", "DataPlanSubscriptionClicked", "MobilePlanSubscriptionClicked", "BuyAgainClicked", "InstallationInstructionsClicked", "EnableEsimClicked", "HelpClicked", "MobilePlanResubscribeClicked", "MobilePlanPortingCreateClick", "MobilePlanPortingUpdateClick", "PlanChange", "PlanUpgrade", "Lcom/revolut/retail/feature/esim/impl/ui/screens/home/subscriptions/EsimSubscriptionsScreenContract$OutputData$BuyAgainClicked;", "Lcom/revolut/retail/feature/esim/impl/ui/screens/home/subscriptions/EsimSubscriptionsScreenContract$OutputData$DataPlanSubscriptionClicked;", "Lcom/revolut/retail/feature/esim/impl/ui/screens/home/subscriptions/EsimSubscriptionsScreenContract$OutputData$EnableEsimClicked;", "Lcom/revolut/retail/feature/esim/impl/ui/screens/home/subscriptions/EsimSubscriptionsScreenContract$OutputData$GiftPlanClicked;", "Lcom/revolut/retail/feature/esim/impl/ui/screens/home/subscriptions/EsimSubscriptionsScreenContract$OutputData$GoToExpiredPlans;", "Lcom/revolut/retail/feature/esim/impl/ui/screens/home/subscriptions/EsimSubscriptionsScreenContract$OutputData$GoToGetPlan;", "Lcom/revolut/retail/feature/esim/impl/ui/screens/home/subscriptions/EsimSubscriptionsScreenContract$OutputData$HelpClicked;", "Lcom/revolut/retail/feature/esim/impl/ui/screens/home/subscriptions/EsimSubscriptionsScreenContract$OutputData$InstallationInstructionsClicked;", "Lcom/revolut/retail/feature/esim/impl/ui/screens/home/subscriptions/EsimSubscriptionsScreenContract$OutputData$MobilePlanPortingCreateClick;", "Lcom/revolut/retail/feature/esim/impl/ui/screens/home/subscriptions/EsimSubscriptionsScreenContract$OutputData$MobilePlanPortingUpdateClick;", "Lcom/revolut/retail/feature/esim/impl/ui/screens/home/subscriptions/EsimSubscriptionsScreenContract$OutputData$MobilePlanResubscribeClicked;", "Lcom/revolut/retail/feature/esim/impl/ui/screens/home/subscriptions/EsimSubscriptionsScreenContract$OutputData$MobilePlanSubscriptionClicked;", "Lcom/revolut/retail/feature/esim/impl/ui/screens/home/subscriptions/EsimSubscriptionsScreenContract$OutputData$PlanChange;", "Lcom/revolut/retail/feature/esim/impl/ui/screens/home/subscriptions/EsimSubscriptionsScreenContract$OutputData$PlanUpgrade;", "feature_retail_esim_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface EsimSubscriptionsScreenContract$OutputData extends r, Parcelable {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/esim/impl/ui/screens/home/subscriptions/EsimSubscriptionsScreenContract$OutputData$BuyAgainClicked;", "Lcom/revolut/retail/feature/esim/impl/ui/screens/home/subscriptions/EsimSubscriptionsScreenContract$OutputData;", "", "toString", "()Ljava/lang/String;", "feature_retail_esim_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class BuyAgainClicked implements EsimSubscriptionsScreenContract$OutputData {

        @NotNull
        public static final Parcelable.Creator<BuyAgainClicked> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f101044a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new BuyAgainClicked(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new BuyAgainClicked[i];
            }
        }

        public BuyAgainClicked(String dataPlanId) {
            Intrinsics.checkNotNullParameter(dataPlanId, "dataPlanId");
            this.f101044a = dataPlanId;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof BuyAgainClicked) && Intrinsics.f(this.f101044a, ((BuyAgainClicked) obj2).f101044a);
        }

        public final int hashCode() {
            return this.f101044a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f101044a);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/esim/impl/ui/screens/home/subscriptions/EsimSubscriptionsScreenContract$OutputData$DataPlanSubscriptionClicked;", "Lcom/revolut/retail/feature/esim/impl/ui/screens/home/subscriptions/EsimSubscriptionsScreenContract$OutputData;", "", "toString", "()Ljava/lang/String;", "feature_retail_esim_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class DataPlanSubscriptionClicked implements EsimSubscriptionsScreenContract$OutputData {

        @NotNull
        public static final Parcelable.Creator<DataPlanSubscriptionClicked> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f101045a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new DataPlanSubscriptionClicked(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new DataPlanSubscriptionClicked[i];
            }
        }

        public DataPlanSubscriptionClicked(String subscriptionId) {
            Intrinsics.checkNotNullParameter(subscriptionId, "subscriptionId");
            this.f101045a = subscriptionId;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof DataPlanSubscriptionClicked) && Intrinsics.f(this.f101045a, ((DataPlanSubscriptionClicked) obj2).f101045a);
        }

        public final int hashCode() {
            return this.f101045a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f101045a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/retail/feature/esim/impl/ui/screens/home/subscriptions/EsimSubscriptionsScreenContract$OutputData$EnableEsimClicked;", "Lcom/revolut/retail/feature/esim/impl/ui/screens/home/subscriptions/EsimSubscriptionsScreenContract$OutputData;", "<init>", "()V", "feature_retail_esim_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class EnableEsimClicked implements EsimSubscriptionsScreenContract$OutputData {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final EnableEsimClicked f101046a = new EnableEsimClicked();

        @NotNull
        public static final Parcelable.Creator<EnableEsimClicked> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return EnableEsimClicked.f101046a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new EnableEsimClicked[i];
            }
        }

        private EnableEsimClicked() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/retail/feature/esim/impl/ui/screens/home/subscriptions/EsimSubscriptionsScreenContract$OutputData$GiftPlanClicked;", "Lcom/revolut/retail/feature/esim/impl/ui/screens/home/subscriptions/EsimSubscriptionsScreenContract$OutputData;", "<init>", "()V", "feature_retail_esim_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class GiftPlanClicked implements EsimSubscriptionsScreenContract$OutputData {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final GiftPlanClicked f101047a = new GiftPlanClicked();

        @NotNull
        public static final Parcelable.Creator<GiftPlanClicked> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return GiftPlanClicked.f101047a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new GiftPlanClicked[i];
            }
        }

        private GiftPlanClicked() {
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/esim/impl/ui/screens/home/subscriptions/EsimSubscriptionsScreenContract$OutputData$GoToExpiredPlans;", "Lcom/revolut/retail/feature/esim/impl/ui/screens/home/subscriptions/EsimSubscriptionsScreenContract$OutputData;", "", "toString", "()Ljava/lang/String;", "feature_retail_esim_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class GoToExpiredPlans implements EsimSubscriptionsScreenContract$OutputData {

        @NotNull
        public static final Parcelable.Creator<GoToExpiredPlans> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final x f101048a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new GoToExpiredPlans(x.valueOf(parcel.readString()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new GoToExpiredPlans[i];
            }
        }

        public GoToExpiredPlans() {
            this(0);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof GoToExpiredPlans) && this.f101048a == ((GoToExpiredPlans) obj2).f101048a;
        }

        public final int hashCode() {
            return this.f101048a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f101048a.name());
        }

        public /* synthetic */ GoToExpiredPlans(int i) {
            this(x.USER_ACTION);
        }

        public GoToExpiredPlans(x source) {
            Intrinsics.checkNotNullParameter(source, "source");
            this.f101048a = source;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/esim/impl/ui/screens/home/subscriptions/EsimSubscriptionsScreenContract$OutputData$GoToGetPlan;", "Lcom/revolut/retail/feature/esim/impl/ui/screens/home/subscriptions/EsimSubscriptionsScreenContract$OutputData;", "", "toString", "()Ljava/lang/String;", "feature_retail_esim_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class GoToGetPlan implements EsimSubscriptionsScreenContract$OutputData {

        @NotNull
        public static final Parcelable.Creator<GoToGetPlan> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final x f101049a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new GoToGetPlan(x.valueOf(parcel.readString()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new GoToGetPlan[i];
            }
        }

        public GoToGetPlan() {
            this(0);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof GoToGetPlan) && this.f101049a == ((GoToGetPlan) obj2).f101049a;
        }

        public final int hashCode() {
            return this.f101049a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f101049a.name());
        }

        public /* synthetic */ GoToGetPlan(int i) {
            this(x.USER_ACTION);
        }

        public GoToGetPlan(x source) {
            Intrinsics.checkNotNullParameter(source, "source");
            this.f101049a = source;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/retail/feature/esim/impl/ui/screens/home/subscriptions/EsimSubscriptionsScreenContract$OutputData$HelpClicked;", "Lcom/revolut/retail/feature/esim/impl/ui/screens/home/subscriptions/EsimSubscriptionsScreenContract$OutputData;", "<init>", "()V", "feature_retail_esim_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class HelpClicked implements EsimSubscriptionsScreenContract$OutputData {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final HelpClicked f101050a = new HelpClicked();

        @NotNull
        public static final Parcelable.Creator<HelpClicked> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return HelpClicked.f101050a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new HelpClicked[i];
            }
        }

        private HelpClicked() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/retail/feature/esim/impl/ui/screens/home/subscriptions/EsimSubscriptionsScreenContract$OutputData$InstallationInstructionsClicked;", "Lcom/revolut/retail/feature/esim/impl/ui/screens/home/subscriptions/EsimSubscriptionsScreenContract$OutputData;", "<init>", "()V", "feature_retail_esim_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class InstallationInstructionsClicked implements EsimSubscriptionsScreenContract$OutputData {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final InstallationInstructionsClicked f101051a = new InstallationInstructionsClicked();

        @NotNull
        public static final Parcelable.Creator<InstallationInstructionsClicked> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return InstallationInstructionsClicked.f101051a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new InstallationInstructionsClicked[i];
            }
        }

        private InstallationInstructionsClicked() {
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/esim/impl/ui/screens/home/subscriptions/EsimSubscriptionsScreenContract$OutputData$MobilePlanPortingCreateClick;", "Lcom/revolut/retail/feature/esim/impl/ui/screens/home/subscriptions/EsimSubscriptionsScreenContract$OutputData;", "", "toString", "()Ljava/lang/String;", "feature_retail_esim_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class MobilePlanPortingCreateClick implements EsimSubscriptionsScreenContract$OutputData {

        @NotNull
        public static final Parcelable.Creator<MobilePlanPortingCreateClick> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f101052a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final EsimPhoneNumberPorting f101053b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final EsimPhoneNumberSelections f101054c;
        public final EsimGiftRecipient d;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                String string = parcel.readString();
                return new MobilePlanPortingCreateClick((EsimGiftRecipient) parcel.readParcelable(MobilePlanPortingCreateClick.class.getClassLoader()), (EsimPhoneNumberPorting) parcel.readParcelable(MobilePlanPortingCreateClick.class.getClassLoader()), (EsimPhoneNumberSelections) parcel.readParcelable(MobilePlanPortingCreateClick.class.getClassLoader()), string);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new MobilePlanPortingCreateClick[i];
            }
        }

        public MobilePlanPortingCreateClick(EsimGiftRecipient esimGiftRecipient, EsimPhoneNumberPorting porting, EsimPhoneNumberSelections phoneNumberSelections, String subscriptionId) {
            Intrinsics.checkNotNullParameter(subscriptionId, "subscriptionId");
            Intrinsics.checkNotNullParameter(porting, "porting");
            Intrinsics.checkNotNullParameter(phoneNumberSelections, "phoneNumberSelections");
            this.f101052a = subscriptionId;
            this.f101053b = porting;
            this.f101054c = phoneNumberSelections;
            this.d = esimGiftRecipient;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof MobilePlanPortingCreateClick)) {
                return false;
            }
            MobilePlanPortingCreateClick mobilePlanPortingCreateClick = (MobilePlanPortingCreateClick) obj2;
            return Intrinsics.f(this.f101052a, mobilePlanPortingCreateClick.f101052a) && Intrinsics.f(this.f101053b, mobilePlanPortingCreateClick.f101053b) && Intrinsics.f(this.f101054c, mobilePlanPortingCreateClick.f101054c) && Intrinsics.f(this.d, mobilePlanPortingCreateClick.d);
        }

        public final int hashCode() {
            int iHashCode = (this.f101054c.hashCode() + y.c(this.f101053b, this.f101052a.hashCode() * 31, 31)) * 31;
            EsimGiftRecipient esimGiftRecipient = this.d;
            return iHashCode + (esimGiftRecipient == null ? 0 : esimGiftRecipient.hashCode());
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f101052a);
            dest.writeParcelable(this.f101053b, i);
            dest.writeParcelable(this.f101054c, i);
            dest.writeParcelable(this.d, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/esim/impl/ui/screens/home/subscriptions/EsimSubscriptionsScreenContract$OutputData$MobilePlanPortingUpdateClick;", "Lcom/revolut/retail/feature/esim/impl/ui/screens/home/subscriptions/EsimSubscriptionsScreenContract$OutputData;", "", "toString", "()Ljava/lang/String;", "feature_retail_esim_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class MobilePlanPortingUpdateClick implements EsimSubscriptionsScreenContract$OutputData {

        @NotNull
        public static final Parcelable.Creator<MobilePlanPortingUpdateClick> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f101055a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f101056b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final EsimPhoneNumberPorting f101057c;
        public final EsimGiftRecipient d;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new MobilePlanPortingUpdateClick(parcel.readString(), parcel.readString(), (EsimPhoneNumberPorting) parcel.readParcelable(MobilePlanPortingUpdateClick.class.getClassLoader()), (EsimGiftRecipient) parcel.readParcelable(MobilePlanPortingUpdateClick.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new MobilePlanPortingUpdateClick[i];
            }
        }

        public MobilePlanPortingUpdateClick(String subscriptionId, String phoneNumber, EsimPhoneNumberPorting porting, EsimGiftRecipient esimGiftRecipient) {
            Intrinsics.checkNotNullParameter(subscriptionId, "subscriptionId");
            Intrinsics.checkNotNullParameter(phoneNumber, "phoneNumber");
            Intrinsics.checkNotNullParameter(porting, "porting");
            this.f101055a = subscriptionId;
            this.f101056b = phoneNumber;
            this.f101057c = porting;
            this.d = esimGiftRecipient;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof MobilePlanPortingUpdateClick)) {
                return false;
            }
            MobilePlanPortingUpdateClick mobilePlanPortingUpdateClick = (MobilePlanPortingUpdateClick) obj2;
            return Intrinsics.f(this.f101055a, mobilePlanPortingUpdateClick.f101055a) && Intrinsics.f(this.f101056b, mobilePlanPortingUpdateClick.f101056b) && Intrinsics.f(this.f101057c, mobilePlanPortingUpdateClick.f101057c) && Intrinsics.f(this.d, mobilePlanPortingUpdateClick.d);
        }

        public final int hashCode() {
            int iC = y.c(this.f101057c, p.a.c(this.f101055a.hashCode() * 31, 31, this.f101056b), 31);
            EsimGiftRecipient esimGiftRecipient = this.d;
            return iC + (esimGiftRecipient == null ? 0 : esimGiftRecipient.hashCode());
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f101055a);
            dest.writeString(this.f101056b);
            dest.writeParcelable(this.f101057c, i);
            dest.writeParcelable(this.d, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/esim/impl/ui/screens/home/subscriptions/EsimSubscriptionsScreenContract$OutputData$MobilePlanResubscribeClicked;", "Lcom/revolut/retail/feature/esim/impl/ui/screens/home/subscriptions/EsimSubscriptionsScreenContract$OutputData;", "", "toString", "()Ljava/lang/String;", "feature_retail_esim_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class MobilePlanResubscribeClicked implements EsimSubscriptionsScreenContract$OutputData {

        @NotNull
        public static final Parcelable.Creator<MobilePlanResubscribeClicked> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f101058a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f101059b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new MobilePlanResubscribeClicked(parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new MobilePlanResubscribeClicked[i];
            }
        }

        public MobilePlanResubscribeClicked(String mobilePlanId, String subscriptionId) {
            Intrinsics.checkNotNullParameter(mobilePlanId, "mobilePlanId");
            Intrinsics.checkNotNullParameter(subscriptionId, "subscriptionId");
            this.f101058a = mobilePlanId;
            this.f101059b = subscriptionId;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof MobilePlanResubscribeClicked)) {
                return false;
            }
            MobilePlanResubscribeClicked mobilePlanResubscribeClicked = (MobilePlanResubscribeClicked) obj2;
            return Intrinsics.f(this.f101058a, mobilePlanResubscribeClicked.f101058a) && Intrinsics.f(this.f101059b, mobilePlanResubscribeClicked.f101059b);
        }

        public final int hashCode() {
            return this.f101059b.hashCode() + (this.f101058a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f101058a);
            dest.writeString(this.f101059b);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/esim/impl/ui/screens/home/subscriptions/EsimSubscriptionsScreenContract$OutputData$MobilePlanSubscriptionClicked;", "Lcom/revolut/retail/feature/esim/impl/ui/screens/home/subscriptions/EsimSubscriptionsScreenContract$OutputData;", "", "toString", "()Ljava/lang/String;", "feature_retail_esim_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class MobilePlanSubscriptionClicked implements EsimSubscriptionsScreenContract$OutputData {

        @NotNull
        public static final Parcelable.Creator<MobilePlanSubscriptionClicked> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f101060a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new MobilePlanSubscriptionClicked(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new MobilePlanSubscriptionClicked[i];
            }
        }

        public MobilePlanSubscriptionClicked(String subscriptionId) {
            Intrinsics.checkNotNullParameter(subscriptionId, "subscriptionId");
            this.f101060a = subscriptionId;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof MobilePlanSubscriptionClicked) && Intrinsics.f(this.f101060a, ((MobilePlanSubscriptionClicked) obj2).f101060a);
        }

        public final int hashCode() {
            return this.f101060a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f101060a);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/esim/impl/ui/screens/home/subscriptions/EsimSubscriptionsScreenContract$OutputData$PlanChange;", "Lcom/revolut/retail/feature/esim/impl/ui/screens/home/subscriptions/EsimSubscriptionsScreenContract$OutputData;", "", "toString", "()Ljava/lang/String;", "feature_retail_esim_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class PlanChange implements EsimSubscriptionsScreenContract$OutputData {

        @NotNull
        public static final Parcelable.Creator<PlanChange> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f101061a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f101062b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new PlanChange(parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new PlanChange[i];
            }
        }

        public PlanChange(String mobilePlanId, String str) {
            Intrinsics.checkNotNullParameter(mobilePlanId, "mobilePlanId");
            this.f101061a = mobilePlanId;
            this.f101062b = str;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof PlanChange)) {
                return false;
            }
            PlanChange planChange = (PlanChange) obj2;
            return Intrinsics.f(this.f101061a, planChange.f101061a) && Intrinsics.f(this.f101062b, planChange.f101062b);
        }

        public final int hashCode() {
            int iHashCode = this.f101061a.hashCode() * 31;
            String str = this.f101062b;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f101061a);
            dest.writeString(this.f101062b);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/esim/impl/ui/screens/home/subscriptions/EsimSubscriptionsScreenContract$OutputData$PlanUpgrade;", "Lcom/revolut/retail/feature/esim/impl/ui/screens/home/subscriptions/EsimSubscriptionsScreenContract$OutputData;", "", "toString", "()Ljava/lang/String;", "feature_retail_esim_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class PlanUpgrade implements EsimSubscriptionsScreenContract$OutputData {

        @NotNull
        public static final Parcelable.Creator<PlanUpgrade> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f101063a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f101064b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new PlanUpgrade(parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new PlanUpgrade[i];
            }
        }

        public PlanUpgrade(String mobilePlanId, String str) {
            Intrinsics.checkNotNullParameter(mobilePlanId, "mobilePlanId");
            this.f101063a = mobilePlanId;
            this.f101064b = str;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof PlanUpgrade)) {
                return false;
            }
            PlanUpgrade planUpgrade = (PlanUpgrade) obj2;
            return Intrinsics.f(this.f101063a, planUpgrade.f101063a) && Intrinsics.f(this.f101064b, planUpgrade.f101064b);
        }

        public final int hashCode() {
            int iHashCode = this.f101063a.hashCode() * 31;
            String str = this.f101064b;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f101063a);
            dest.writeString(this.f101064b);
        }
    }
}
