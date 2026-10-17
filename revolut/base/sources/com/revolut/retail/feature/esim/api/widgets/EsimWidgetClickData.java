package com.revolut.retail.feature.esim.api.widgets;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.analytics.ads.model.ViewableRecordItem$Type;
import dej.m;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zn.d;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u00012\u00020\u0002:\u0004\u0005\u0006\u0007\bB\t\b\u0004¢\u0006\u0004\b\u0003\u0010\u0004\u0082\u0001\u0004\t\n\u000b\f¨\u0006\r"}, d2 = {"Lcom/revolut/retail/feature/esim/api/widgets/EsimWidgetClickData;", "Landroid/os/Parcelable;", "Lzn/d;", "<init>", "()V", "Reload", "SubscriptionDetails", "PurchaseDataPlan", "EsimHome", "Lcom/revolut/retail/feature/esim/api/widgets/EsimWidgetClickData$EsimHome;", "Lcom/revolut/retail/feature/esim/api/widgets/EsimWidgetClickData$PurchaseDataPlan;", "Lcom/revolut/retail/feature/esim/api/widgets/EsimWidgetClickData$Reload;", "Lcom/revolut/retail/feature/esim/api/widgets/EsimWidgetClickData$SubscriptionDetails;", "feature_retail_esim_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class EsimWidgetClickData implements Parcelable, d {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/esim/api/widgets/EsimWidgetClickData$EsimHome;", "Lcom/revolut/retail/feature/esim/api/widgets/EsimWidgetClickData;", "", "toString", "()Ljava/lang/String;", "feature_retail_esim_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class EsimHome extends EsimWidgetClickData {

        @NotNull
        public static final Parcelable.Creator<EsimHome> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f100555a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Parcelable f100556b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final ViewableRecordItem$Type f100557c;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new EsimHome(parcel.readString(), parcel.readParcelable(EsimHome.class.getClassLoader()), (ViewableRecordItem$Type) parcel.readParcelable(EsimHome.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new EsimHome[i];
            }
        }

        public EsimHome(String identifier, Parcelable parcelable, ViewableRecordItem$Type viewableRecordType) {
            Intrinsics.checkNotNullParameter(identifier, "identifier");
            Intrinsics.checkNotNullParameter(viewableRecordType, "viewableRecordType");
            this.f100555a = identifier;
            this.f100556b = parcelable;
            this.f100557c = viewableRecordType;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof EsimHome)) {
                return false;
            }
            EsimHome esimHome = (EsimHome) obj2;
            return Intrinsics.f(this.f100555a, esimHome.f100555a) && Intrinsics.f(this.f100556b, esimHome.f100556b) && Intrinsics.f(this.f100557c, esimHome.f100557c);
        }

        @Override // zn.d
        /* JADX INFO: renamed from: getAnalyticsContext, reason: from getter */
        public final Parcelable getD() {
            return this.f100556b;
        }

        @Override // zn.d
        /* JADX INFO: renamed from: getIdentifier, reason: from getter */
        public final String getF100566c() {
            return this.f100555a;
        }

        public final int hashCode() {
            int iHashCode = this.f100555a.hashCode() * 31;
            Parcelable parcelable = this.f100556b;
            return this.f100557c.hashCode() + ((iHashCode + (parcelable == null ? 0 : parcelable.hashCode())) * 31);
        }

        @Override // zn.d
        /* JADX INFO: renamed from: p0, reason: from getter */
        public final ViewableRecordItem$Type getE() {
            return this.f100557c;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f100555a);
            dest.writeParcelable(this.f100556b, i);
            dest.writeParcelable(this.f100557c, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/esim/api/widgets/EsimWidgetClickData$PurchaseDataPlan;", "Lcom/revolut/retail/feature/esim/api/widgets/EsimWidgetClickData;", "", "toString", "()Ljava/lang/String;", "feature_retail_esim_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class PurchaseDataPlan extends EsimWidgetClickData {

        @NotNull
        public static final Parcelable.Creator<PurchaseDataPlan> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f100558a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final m f100559b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f100560c;
        public final Parcelable d;
        public final ViewableRecordItem$Type e;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new PurchaseDataPlan(parcel.readString(), parcel.readInt() == 0 ? null : m.valueOf(parcel.readString()), parcel.readString(), parcel.readParcelable(PurchaseDataPlan.class.getClassLoader()), (ViewableRecordItem$Type) parcel.readParcelable(PurchaseDataPlan.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new PurchaseDataPlan[i];
            }
        }

        public PurchaseDataPlan(String str, m mVar, String identifier, Parcelable parcelable, ViewableRecordItem$Type viewableRecordType) {
            Intrinsics.checkNotNullParameter(identifier, "identifier");
            Intrinsics.checkNotNullParameter(viewableRecordType, "viewableRecordType");
            this.f100558a = str;
            this.f100559b = mVar;
            this.f100560c = identifier;
            this.d = parcelable;
            this.e = viewableRecordType;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof PurchaseDataPlan)) {
                return false;
            }
            PurchaseDataPlan purchaseDataPlan = (PurchaseDataPlan) obj2;
            return Intrinsics.f(this.f100558a, purchaseDataPlan.f100558a) && this.f100559b == purchaseDataPlan.f100559b && Intrinsics.f(this.f100560c, purchaseDataPlan.f100560c) && Intrinsics.f(this.d, purchaseDataPlan.d) && Intrinsics.f(this.e, purchaseDataPlan.e);
        }

        @Override // zn.d
        /* JADX INFO: renamed from: getAnalyticsContext, reason: from getter */
        public final Parcelable getD() {
            return this.d;
        }

        @Override // zn.d
        /* JADX INFO: renamed from: getIdentifier, reason: from getter */
        public final String getF100566c() {
            return this.f100560c;
        }

        public final int hashCode() {
            String str = this.f100558a;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            m mVar = this.f100559b;
            int iC = p.a.c((iHashCode + (mVar == null ? 0 : mVar.hashCode())) * 31, 31, this.f100560c);
            Parcelable parcelable = this.d;
            return this.e.hashCode() + ((iC + (parcelable != null ? parcelable.hashCode() : 0)) * 31);
        }

        @Override // zn.d
        /* JADX INFO: renamed from: p0, reason: from getter */
        public final ViewableRecordItem$Type getE() {
            return this.e;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f100558a);
            m mVar = this.f100559b;
            if (mVar == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                dest.writeString(mVar.name());
            }
            dest.writeString(this.f100560c);
            dest.writeParcelable(this.d, i);
            dest.writeParcelable(this.e, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/esim/api/widgets/EsimWidgetClickData$Reload;", "Lcom/revolut/retail/feature/esim/api/widgets/EsimWidgetClickData;", "", "toString", "()Ljava/lang/String;", "feature_retail_esim_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Reload extends EsimWidgetClickData {

        @NotNull
        public static final Parcelable.Creator<Reload> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f100561a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f100562b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Parcelable f100563c;
        public final ViewableRecordItem$Type d;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Reload(parcel.readString(), parcel.readString(), parcel.readParcelable(Reload.class.getClassLoader()), (ViewableRecordItem$Type) parcel.readParcelable(Reload.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Reload[i];
            }
        }

        public Reload(String widgetId, String identifier, Parcelable parcelable, ViewableRecordItem$Type viewableRecordType) {
            Intrinsics.checkNotNullParameter(widgetId, "widgetId");
            Intrinsics.checkNotNullParameter(identifier, "identifier");
            Intrinsics.checkNotNullParameter(viewableRecordType, "viewableRecordType");
            this.f100561a = widgetId;
            this.f100562b = identifier;
            this.f100563c = parcelable;
            this.d = viewableRecordType;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Reload)) {
                return false;
            }
            Reload reload = (Reload) obj2;
            return Intrinsics.f(this.f100561a, reload.f100561a) && Intrinsics.f(this.f100562b, reload.f100562b) && Intrinsics.f(this.f100563c, reload.f100563c) && Intrinsics.f(this.d, reload.d);
        }

        @Override // zn.d
        /* JADX INFO: renamed from: getAnalyticsContext, reason: from getter */
        public final Parcelable getD() {
            return this.f100563c;
        }

        @Override // zn.d
        /* JADX INFO: renamed from: getIdentifier, reason: from getter */
        public final String getF100566c() {
            return this.f100562b;
        }

        public final int hashCode() {
            int iC = p.a.c(this.f100561a.hashCode() * 31, 31, this.f100562b);
            Parcelable parcelable = this.f100563c;
            return this.d.hashCode() + ((iC + (parcelable == null ? 0 : parcelable.hashCode())) * 31);
        }

        @Override // zn.d
        /* JADX INFO: renamed from: p0, reason: from getter */
        public final ViewableRecordItem$Type getE() {
            return this.d;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f100561a);
            dest.writeString(this.f100562b);
            dest.writeParcelable(this.f100563c, i);
            dest.writeParcelable(this.d, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/esim/api/widgets/EsimWidgetClickData$SubscriptionDetails;", "Lcom/revolut/retail/feature/esim/api/widgets/EsimWidgetClickData;", "", "toString", "()Ljava/lang/String;", "feature_retail_esim_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class SubscriptionDetails extends EsimWidgetClickData {

        @NotNull
        public static final Parcelable.Creator<SubscriptionDetails> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f100564a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final m f100565b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f100566c;
        public final Parcelable d;
        public final ViewableRecordItem$Type e;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new SubscriptionDetails(parcel.readString(), m.valueOf(parcel.readString()), parcel.readString(), parcel.readParcelable(SubscriptionDetails.class.getClassLoader()), (ViewableRecordItem$Type) parcel.readParcelable(SubscriptionDetails.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new SubscriptionDetails[i];
            }
        }

        public SubscriptionDetails(String subscriptionId, m planType, String identifier, Parcelable parcelable, ViewableRecordItem$Type viewableRecordType) {
            Intrinsics.checkNotNullParameter(subscriptionId, "subscriptionId");
            Intrinsics.checkNotNullParameter(planType, "planType");
            Intrinsics.checkNotNullParameter(identifier, "identifier");
            Intrinsics.checkNotNullParameter(viewableRecordType, "viewableRecordType");
            this.f100564a = subscriptionId;
            this.f100565b = planType;
            this.f100566c = identifier;
            this.d = parcelable;
            this.e = viewableRecordType;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof SubscriptionDetails)) {
                return false;
            }
            SubscriptionDetails subscriptionDetails = (SubscriptionDetails) obj2;
            return Intrinsics.f(this.f100564a, subscriptionDetails.f100564a) && this.f100565b == subscriptionDetails.f100565b && Intrinsics.f(this.f100566c, subscriptionDetails.f100566c) && Intrinsics.f(this.d, subscriptionDetails.d) && Intrinsics.f(this.e, subscriptionDetails.e);
        }

        @Override // zn.d
        /* JADX INFO: renamed from: getAnalyticsContext, reason: from getter */
        public final Parcelable getD() {
            return this.d;
        }

        @Override // zn.d
        /* JADX INFO: renamed from: getIdentifier, reason: from getter */
        public final String getF100566c() {
            return this.f100566c;
        }

        public final int hashCode() {
            int iC = p.a.c((this.f100565b.hashCode() + (this.f100564a.hashCode() * 31)) * 31, 31, this.f100566c);
            Parcelable parcelable = this.d;
            return this.e.hashCode() + ((iC + (parcelable == null ? 0 : parcelable.hashCode())) * 31);
        }

        @Override // zn.d
        /* JADX INFO: renamed from: p0, reason: from getter */
        public final ViewableRecordItem$Type getE() {
            return this.e;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f100564a);
            dest.writeString(this.f100565b.name());
            dest.writeString(this.f100566c);
            dest.writeParcelable(this.d, i);
            dest.writeParcelable(this.e, i);
        }
    }

    private EsimWidgetClickData() {
    }
}
