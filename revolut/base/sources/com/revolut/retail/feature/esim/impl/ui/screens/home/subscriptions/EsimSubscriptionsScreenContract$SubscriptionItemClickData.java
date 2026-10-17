package com.revolut.retail.feature.esim.impl.ui.screens.home.subscriptions;

import a0.d;
import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.retail.feature.esim.api.model.EsimCoverage;
import com.revolut.retail.feature.esim.api.model.EsimDataPlanOfferInfo;
import com.revolut.retail.feature.esim.api.model.EsimTerms;
import dej.l;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0004\b\t\n\u000b¨\u0006\f"}, d2 = {"com/revolut/retail/feature/esim/impl/ui/screens/home/subscriptions/EsimSubscriptionsScreenContract$SubscriptionItemClickData", "Landroid/os/Parcelable;", "<init>", "()V", "DataPlanSubscription", "MobilePlanSubscription", "RoamingAllowance", "PlanOffer", "Lcom/revolut/retail/feature/esim/impl/ui/screens/home/subscriptions/EsimSubscriptionsScreenContract$SubscriptionItemClickData$DataPlanSubscription;", "Lcom/revolut/retail/feature/esim/impl/ui/screens/home/subscriptions/EsimSubscriptionsScreenContract$SubscriptionItemClickData$MobilePlanSubscription;", "Lcom/revolut/retail/feature/esim/impl/ui/screens/home/subscriptions/EsimSubscriptionsScreenContract$SubscriptionItemClickData$PlanOffer;", "Lcom/revolut/retail/feature/esim/impl/ui/screens/home/subscriptions/EsimSubscriptionsScreenContract$SubscriptionItemClickData$RoamingAllowance;", "feature_retail_esim_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class EsimSubscriptionsScreenContract$SubscriptionItemClickData implements Parcelable {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/esim/impl/ui/screens/home/subscriptions/EsimSubscriptionsScreenContract$SubscriptionItemClickData$DataPlanSubscription;", "Lcom/revolut/retail/feature/esim/impl/ui/screens/home/subscriptions/EsimSubscriptionsScreenContract$SubscriptionItemClickData;", "", "toString", "()Ljava/lang/String;", "feature_retail_esim_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class DataPlanSubscription extends EsimSubscriptionsScreenContract$SubscriptionItemClickData {

        @NotNull
        public static final Parcelable.Creator<DataPlanSubscription> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f101065a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f101066b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new DataPlanSubscription(parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new DataPlanSubscription[i];
            }
        }

        public DataPlanSubscription(String dataPlanId, String subscriptionId) {
            Intrinsics.checkNotNullParameter(dataPlanId, "dataPlanId");
            Intrinsics.checkNotNullParameter(subscriptionId, "subscriptionId");
            this.f101065a = dataPlanId;
            this.f101066b = subscriptionId;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof DataPlanSubscription)) {
                return false;
            }
            DataPlanSubscription dataPlanSubscription = (DataPlanSubscription) obj2;
            return Intrinsics.f(this.f101065a, dataPlanSubscription.f101065a) && Intrinsics.f(this.f101066b, dataPlanSubscription.f101066b);
        }

        public final int hashCode() {
            return this.f101066b.hashCode() + (this.f101065a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f101065a);
            dest.writeString(this.f101066b);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/esim/impl/ui/screens/home/subscriptions/EsimSubscriptionsScreenContract$SubscriptionItemClickData$MobilePlanSubscription;", "Lcom/revolut/retail/feature/esim/impl/ui/screens/home/subscriptions/EsimSubscriptionsScreenContract$SubscriptionItemClickData;", "", "toString", "()Ljava/lang/String;", "feature_retail_esim_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class MobilePlanSubscription extends EsimSubscriptionsScreenContract$SubscriptionItemClickData {

        @NotNull
        public static final Parcelable.Creator<MobilePlanSubscription> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f101067a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f101068b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new MobilePlanSubscription(parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new MobilePlanSubscription[i];
            }
        }

        public MobilePlanSubscription(String dataPlanId, String subscriptionId) {
            Intrinsics.checkNotNullParameter(dataPlanId, "dataPlanId");
            Intrinsics.checkNotNullParameter(subscriptionId, "subscriptionId");
            this.f101067a = dataPlanId;
            this.f101068b = subscriptionId;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof MobilePlanSubscription)) {
                return false;
            }
            MobilePlanSubscription mobilePlanSubscription = (MobilePlanSubscription) obj2;
            return Intrinsics.f(this.f101067a, mobilePlanSubscription.f101067a) && Intrinsics.f(this.f101068b, mobilePlanSubscription.f101068b);
        }

        public final int hashCode() {
            return this.f101068b.hashCode() + (this.f101067a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f101067a);
            dest.writeString(this.f101068b);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/esim/impl/ui/screens/home/subscriptions/EsimSubscriptionsScreenContract$SubscriptionItemClickData$PlanOffer;", "Lcom/revolut/retail/feature/esim/impl/ui/screens/home/subscriptions/EsimSubscriptionsScreenContract$SubscriptionItemClickData;", "", "toString", "()Ljava/lang/String;", "feature_retail_esim_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class PlanOffer extends EsimSubscriptionsScreenContract$SubscriptionItemClickData {

        @NotNull
        public static final Parcelable.Creator<PlanOffer> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f101069a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f101070b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final long f101071c;
        public final EsimCoverage d;
        public final EsimDataPlanOfferInfo e;
        public final EsimTerms f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final l f101072g;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new PlanOffer(parcel.readString(), parcel.readInt(), parcel.readLong(), (EsimCoverage) parcel.readParcelable(PlanOffer.class.getClassLoader()), (EsimDataPlanOfferInfo) parcel.readParcelable(PlanOffer.class.getClassLoader()), (EsimTerms) parcel.readParcelable(PlanOffer.class.getClassLoader()), parcel.readInt() == 0 ? null : l.valueOf(parcel.readString()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new PlanOffer[i];
            }
        }

        public PlanOffer(String dataPlanId, int i, long j2, EsimCoverage coverage, EsimDataPlanOfferInfo planOfferInfo, EsimTerms terms, l lVar) {
            Intrinsics.checkNotNullParameter(dataPlanId, "dataPlanId");
            Intrinsics.checkNotNullParameter(coverage, "coverage");
            Intrinsics.checkNotNullParameter(planOfferInfo, "planOfferInfo");
            Intrinsics.checkNotNullParameter(terms, "terms");
            this.f101069a = dataPlanId;
            this.f101070b = i;
            this.f101071c = j2;
            this.d = coverage;
            this.e = planOfferInfo;
            this.f = terms;
            this.f101072g = lVar;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof PlanOffer)) {
                return false;
            }
            PlanOffer planOffer = (PlanOffer) obj2;
            return Intrinsics.f(this.f101069a, planOffer.f101069a) && this.f101070b == planOffer.f101070b && this.f101071c == planOffer.f101071c && Intrinsics.f(this.d, planOffer.d) && Intrinsics.f(this.e, planOffer.e) && Intrinsics.f(this.f, planOffer.f) && this.f101072g == planOffer.f101072g;
        }

        public final int hashCode() {
            int iHashCode = (this.f.hashCode() + ((this.e.hashCode() + ((this.d.hashCode() + d.c(j6.a.b(this.f101070b, this.f101069a.hashCode() * 31, 31), 31, this.f101071c)) * 31)) * 31)) * 31;
            l lVar = this.f101072g;
            return iHashCode + (lVar == null ? 0 : lVar.hashCode());
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f101069a);
            dest.writeInt(this.f101070b);
            dest.writeLong(this.f101071c);
            dest.writeParcelable(this.d, i);
            dest.writeParcelable(this.e, i);
            dest.writeParcelable(this.f, i);
            l lVar = this.f101072g;
            if (lVar == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                dest.writeString(lVar.name());
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/esim/impl/ui/screens/home/subscriptions/EsimSubscriptionsScreenContract$SubscriptionItemClickData$RoamingAllowance;", "Lcom/revolut/retail/feature/esim/impl/ui/screens/home/subscriptions/EsimSubscriptionsScreenContract$SubscriptionItemClickData;", "", "toString", "()Ljava/lang/String;", "feature_retail_esim_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class RoamingAllowance extends EsimSubscriptionsScreenContract$SubscriptionItemClickData {

        @NotNull
        public static final Parcelable.Creator<RoamingAllowance> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f101073a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f101074b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new RoamingAllowance(parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new RoamingAllowance[i];
            }
        }

        public RoamingAllowance(String dataPlanId, String subscriptionId) {
            Intrinsics.checkNotNullParameter(dataPlanId, "dataPlanId");
            Intrinsics.checkNotNullParameter(subscriptionId, "subscriptionId");
            this.f101073a = dataPlanId;
            this.f101074b = subscriptionId;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof RoamingAllowance)) {
                return false;
            }
            RoamingAllowance roamingAllowance = (RoamingAllowance) obj2;
            return Intrinsics.f(this.f101073a, roamingAllowance.f101073a) && Intrinsics.f(this.f101074b, roamingAllowance.f101074b);
        }

        public final int hashCode() {
            return this.f101074b.hashCode() + (this.f101073a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f101073a);
            dest.writeString(this.f101074b);
        }
    }

    private EsimSubscriptionsScreenContract$SubscriptionItemClickData() {
    }
}
