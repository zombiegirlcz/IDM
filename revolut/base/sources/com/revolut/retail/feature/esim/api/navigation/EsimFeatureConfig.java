package com.revolut.retail.feature.esim.api.navigation;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig;
import com.revolut.kompot.bridge.navigation.KompotDestination;
import com.revolut.kompot.common.IOData$EmptyInput;
import com.revolut.kompot.common.InternalDestination;
import com.revolut.kompot.common.ParcelableDestination;
import com.revolut.kompot.common.StackDestination;
import com.revolut.kompot.common.transition.ZoomTransitionAnimation;
import com.revolut.kompot.navigable.TransitionAnimation;
import com.revolut.retail.core.navigation.ActivityAnimation;
import com.revolut.retail.feature.esim.api.model.EsimGetPlanLaunchMode;
import dej.c4;
import dej.m;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\r\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u0082\u0001\u0004\u000f\u0010\u0011\u0012¨\u0006\u0013"}, d2 = {"Lcom/revolut/retail/feature/esim/api/navigation/EsimFeatureConfig;", "Lcom/revolut/kompot/bridge/navigation/KompotBridgeFeatureConfig;", "Home", "GetPlan", "Subscription", "MobilePlanSubscription", "HomeDestination", "GetPlanDestination", "RefundDestination", "GiftingDestination", "SharingDestination", "SubscriptionDestination", "MobilePlanSubscriptionDestination", "DebugDestination", "ConnectivityTroubleshootingDestination", "Lcom/revolut/retail/feature/esim/api/navigation/EsimFeatureConfig$GetPlan;", "Lcom/revolut/retail/feature/esim/api/navigation/EsimFeatureConfig$Home;", "Lcom/revolut/retail/feature/esim/api/navigation/EsimFeatureConfig$MobilePlanSubscription;", "Lcom/revolut/retail/feature/esim/api/navigation/EsimFeatureConfig$Subscription;", "feature_retail_esim_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class EsimFeatureConfig extends KompotBridgeFeatureConfig {

    /* JADX INFO: loaded from: classes13.dex */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/retail/feature/esim/api/navigation/EsimFeatureConfig$DebugDestination;", "Lcom/revolut/kompot/bridge/navigation/KompotDestination;", "<init>", "()V", "feature_retail_esim_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class DebugDestination implements KompotDestination {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final DebugDestination f100535a = new DebugDestination();

        @NotNull
        public static final Parcelable.Creator<DebugDestination> CREATOR = new a();

        /* JADX INFO: loaded from: classes11.dex */
        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return DebugDestination.f100535a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new DebugDestination[i];
            }
        }

        private DebugDestination() {
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/esim/api/navigation/EsimFeatureConfig$GetPlan;", "Lcom/revolut/retail/feature/esim/api/navigation/EsimFeatureConfig;", "", "toString", "()Ljava/lang/String;", "feature_retail_esim_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class GetPlan extends EsimFeatureConfig {

        @NotNull
        public static final Parcelable.Creator<GetPlan> CREATOR = new a();

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final String f100536g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final m f100537h;
        public final EsimGetPlanLaunchMode i;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new GetPlan(parcel.readString(), parcel.readInt() == 0 ? null : m.valueOf(parcel.readString()), (EsimGetPlanLaunchMode) parcel.readParcelable(GetPlan.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new GetPlan[i];
            }
        }

        public GetPlan() {
            this(null, 7);
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof GetPlan)) {
                return false;
            }
            GetPlan getPlan = (GetPlan) obj2;
            return Intrinsics.f(this.f100536g, getPlan.f100536g) && this.f100537h == getPlan.f100537h && Intrinsics.f(this.i, getPlan.i);
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
        public final int hashCode() {
            String str = this.f100536g;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            m mVar = this.f100537h;
            int iHashCode2 = (iHashCode + (mVar == null ? 0 : mVar.hashCode())) * 31;
            EsimGetPlanLaunchMode esimGetPlanLaunchMode = this.i;
            return iHashCode2 + (esimGetPlanLaunchMode != null ? esimGetPlanLaunchMode.hashCode() : 0);
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig, android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f100536g);
            m mVar = this.f100537h;
            if (mVar == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                dest.writeString(mVar.name());
            }
            dest.writeParcelable(this.i, i);
        }

        public /* synthetic */ GetPlan(String str, int i) {
            this((i & 1) != 0 ? null : str, null, null);
        }

        public GetPlan(String str, m mVar, EsimGetPlanLaunchMode esimGetPlanLaunchMode) {
            super(null, new GetPlanDestination(str, mVar, esimGetPlanLaunchMode, null, 8));
            this.f100536g = str;
            this.f100537h = mVar;
            this.i = esimGetPlanLaunchMode;
        }
    }

    /* JADX INFO: loaded from: classes13.dex */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/esim/api/navigation/EsimFeatureConfig$GetPlanDestination;", "Lcom/revolut/kompot/common/StackDestination;", "", "toString", "()Ljava/lang/String;", "feature_retail_esim_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class GetPlanDestination implements StackDestination {

        @NotNull
        public static final Parcelable.Creator<GetPlanDestination> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f100538a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final m f100539b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final EsimGetPlanLaunchMode f100540c;
        public final TransitionAnimation d;

        /* JADX INFO: loaded from: classes11.dex */
        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new GetPlanDestination(parcel.readString(), parcel.readInt() == 0 ? null : m.valueOf(parcel.readString()), (EsimGetPlanLaunchMode) parcel.readParcelable(GetPlanDestination.class.getClassLoader()), (TransitionAnimation) parcel.readParcelable(GetPlanDestination.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new GetPlanDestination[i];
            }
        }

        public GetPlanDestination() {
            this(null, null, null, null, 15);
        }

        @Override // aii.d0
        /* JADX INFO: renamed from: Y0, reason: from getter */
        public final TransitionAnimation getF86778c() {
            return this.d;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof GetPlanDestination)) {
                return false;
            }
            GetPlanDestination getPlanDestination = (GetPlanDestination) obj2;
            return Intrinsics.f(this.f100538a, getPlanDestination.f100538a) && this.f100539b == getPlanDestination.f100539b && Intrinsics.f(this.f100540c, getPlanDestination.f100540c) && Intrinsics.f(this.d, getPlanDestination.d);
        }

        public final int hashCode() {
            String str = this.f100538a;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            m mVar = this.f100539b;
            int iHashCode2 = (iHashCode + (mVar == null ? 0 : mVar.hashCode())) * 31;
            EsimGetPlanLaunchMode esimGetPlanLaunchMode = this.f100540c;
            int iHashCode3 = (iHashCode2 + (esimGetPlanLaunchMode == null ? 0 : esimGetPlanLaunchMode.hashCode())) * 31;
            TransitionAnimation transitionAnimation = this.d;
            return iHashCode3 + (transitionAnimation != null ? transitionAnimation.hashCode() : 0);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f100538a);
            m mVar = this.f100539b;
            if (mVar == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                dest.writeString(mVar.name());
            }
            dest.writeParcelable(this.f100540c, i);
            dest.writeParcelable(this.d, i);
        }

        public GetPlanDestination(String str, m mVar, EsimGetPlanLaunchMode esimGetPlanLaunchMode, TransitionAnimation transitionAnimation) {
            this.f100538a = str;
            this.f100539b = mVar;
            this.f100540c = esimGetPlanLaunchMode;
            this.d = transitionAnimation;
        }

        public /* synthetic */ GetPlanDestination(String str, m mVar, EsimGetPlanLaunchMode esimGetPlanLaunchMode, ZoomTransitionAnimation.Widgets widgets, int i) {
            this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : mVar, (i & 4) != 0 ? null : esimGetPlanLaunchMode, (i & 8) != 0 ? null : widgets);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/retail/feature/esim/api/navigation/EsimFeatureConfig$GiftingDestination;", "Lcom/revolut/kompot/bridge/navigation/KompotDestination;", "Lcom/revolut/kompot/common/InternalDestination;", "Lcom/revolut/kompot/common/IOData$EmptyInput;", "<init>", "()V", "feature_retail_esim_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class GiftingDestination extends InternalDestination<IOData$EmptyInput> implements KompotDestination {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final GiftingDestination f100541b = new GiftingDestination();

        @NotNull
        public static final Parcelable.Creator<GiftingDestination> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return GiftingDestination.f100541b;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new GiftingDestination[i];
            }
        }

        private GiftingDestination() {
            super(IOData$EmptyInput.f98299a);
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/esim/api/navigation/EsimFeatureConfig$Home;", "Lcom/revolut/retail/feature/esim/api/navigation/EsimFeatureConfig;", "", "toString", "()Ljava/lang/String;", "feature_retail_esim_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Home extends EsimFeatureConfig {

        @NotNull
        public static final Parcelable.Creator<Home> CREATOR = new a();

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final ActivityAnimation f100542g;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Home((ActivityAnimation) parcel.readParcelable(Home.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Home[i];
            }
        }

        public Home() {
            this(null);
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
        /* JADX INFO: renamed from: a, reason: from getter */
        public final ActivityAnimation getF100542g() {
            return this.f100542g;
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Home) && Intrinsics.f(this.f100542g, ((Home) obj2).f100542g);
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
        public final int hashCode() {
            ActivityAnimation activityAnimation = this.f100542g;
            if (activityAnimation == null) {
                return 0;
            }
            return activityAnimation.hashCode();
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig, android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f100542g, i);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public Home(ActivityAnimation activityAnimation) {
            super(activityAnimation, new HomeDestination((c4) null, (TransitionAnimation) (0 == true ? 1 : 0), 7));
            this.f100542g = activityAnimation;
        }
    }

    /* JADX INFO: loaded from: classes13.dex */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/retail/feature/esim/api/navigation/EsimFeatureConfig$HomeDestination;", "Lcom/revolut/kompot/bridge/navigation/KompotDestination;", "Lcom/revolut/kompot/common/InternalDestination;", "Lcom/revolut/kompot/common/IOData$EmptyInput;", "", "toString", "()Ljava/lang/String;", "feature_retail_esim_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class HomeDestination extends InternalDestination<IOData$EmptyInput> implements KompotDestination {

        @NotNull
        public static final Parcelable.Creator<HomeDestination> CREATOR = new a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f100543b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final c4 f100544c;
        public final TransitionAnimation d;

        /* JADX INFO: loaded from: classes11.dex */
        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new HomeDestination(parcel.readInt() != 0, c4.valueOf(parcel.readString()), (TransitionAnimation) parcel.readParcelable(HomeDestination.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new HomeDestination[i];
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public HomeDestination() {
            this((c4) null, (TransitionAnimation) (0 == true ? 1 : 0), 7);
        }

        @Override // aii.d0
        /* JADX INFO: renamed from: Y0, reason: from getter */
        public final TransitionAnimation getF86778c() {
            return this.d;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof HomeDestination)) {
                return false;
            }
            HomeDestination homeDestination = (HomeDestination) obj2;
            return this.f100543b == homeDestination.f100543b && this.f100544c == homeDestination.f100544c && Intrinsics.f(this.d, homeDestination.d);
        }

        public final int hashCode() {
            int iHashCode = (this.f100544c.hashCode() + (Boolean.hashCode(this.f100543b) * 31)) * 31;
            TransitionAnimation transitionAnimation = this.d;
            return iHashCode + (transitionAnimation == null ? 0 : transitionAnimation.hashCode());
        }

        @Override // aii.d0
        /* JADX INFO: renamed from: n1, reason: from getter */
        public final boolean getF100543b() {
            return this.f100543b;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(this.f100543b ? 1 : 0);
            dest.writeString(this.f100544c.name());
            dest.writeParcelable(this.d, i);
        }

        public /* synthetic */ HomeDestination(c4 c4Var, TransitionAnimation transitionAnimation, int i) {
            this((i & 1) != 0, (i & 2) != 0 ? c4.ACTIVE : c4Var, (i & 4) != 0 ? null : transitionAnimation);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public HomeDestination(boolean z, c4 subscriptionTab, TransitionAnimation transitionAnimation) {
            super(IOData$EmptyInput.f98299a);
            Intrinsics.checkNotNullParameter(subscriptionTab, "subscriptionTab");
            this.f100543b = z;
            this.f100544c = subscriptionTab;
            this.d = transitionAnimation;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/esim/api/navigation/EsimFeatureConfig$MobilePlanSubscription;", "Lcom/revolut/retail/feature/esim/api/navigation/EsimFeatureConfig;", "", "toString", "()Ljava/lang/String;", "feature_retail_esim_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class MobilePlanSubscription extends EsimFeatureConfig {

        @NotNull
        public static final Parcelable.Creator<MobilePlanSubscription> CREATOR = new a();

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final String f100545g;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new MobilePlanSubscription(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new MobilePlanSubscription[i];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public MobilePlanSubscription(String subscriptionId) {
            super(null, new MobilePlanSubscriptionDestination(subscriptionId));
            Intrinsics.checkNotNullParameter(subscriptionId, "subscriptionId");
            this.f100545g = subscriptionId;
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof MobilePlanSubscription) && Intrinsics.f(this.f100545g, ((MobilePlanSubscription) obj2).f100545g);
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
        public final int hashCode() {
            return this.f100545g.hashCode();
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig, android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f100545g);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/esim/api/navigation/EsimFeatureConfig$MobilePlanSubscriptionDestination;", "Lcom/revolut/kompot/bridge/navigation/KompotDestination;", "", "toString", "()Ljava/lang/String;", "feature_retail_esim_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class MobilePlanSubscriptionDestination implements KompotDestination {

        @NotNull
        public static final Parcelable.Creator<MobilePlanSubscriptionDestination> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f100546a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new MobilePlanSubscriptionDestination(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new MobilePlanSubscriptionDestination[i];
            }
        }

        public MobilePlanSubscriptionDestination(String subscriptionId) {
            Intrinsics.checkNotNullParameter(subscriptionId, "subscriptionId");
            this.f100546a = subscriptionId;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof MobilePlanSubscriptionDestination) && Intrinsics.f(this.f100546a, ((MobilePlanSubscriptionDestination) obj2).f100546a);
        }

        public final int hashCode() {
            return this.f100546a.hashCode();
        }

        /* JADX INFO: renamed from: t1, reason: from getter */
        public final String getF100546a() {
            return this.f100546a;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f100546a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/retail/feature/esim/api/navigation/EsimFeatureConfig$RefundDestination;", "Lcom/revolut/kompot/bridge/navigation/KompotDestination;", "Lcom/revolut/kompot/common/InternalDestination;", "Lcom/revolut/kompot/common/IOData$EmptyInput;", "<init>", "()V", "feature_retail_esim_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class RefundDestination extends InternalDestination<IOData$EmptyInput> implements KompotDestination {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final RefundDestination f100547b = new RefundDestination();

        @NotNull
        public static final Parcelable.Creator<RefundDestination> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return RefundDestination.f100547b;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new RefundDestination[i];
            }
        }

        private RefundDestination() {
            super(IOData$EmptyInput.f98299a);
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

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/retail/feature/esim/api/navigation/EsimFeatureConfig$SharingDestination;", "Lcom/revolut/kompot/bridge/navigation/KompotDestination;", "Lcom/revolut/kompot/common/InternalDestination;", "Lcom/revolut/kompot/common/IOData$EmptyInput;", "", "toString", "()Ljava/lang/String;", "feature_retail_esim_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class SharingDestination extends InternalDestination<IOData$EmptyInput> implements KompotDestination {

        @NotNull
        public static final Parcelable.Creator<SharingDestination> CREATOR = new a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f100548b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new SharingDestination(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new SharingDestination[i];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SharingDestination(String simProfileId) {
            super(IOData$EmptyInput.f98299a);
            Intrinsics.checkNotNullParameter(simProfileId, "simProfileId");
            this.f100548b = simProfileId;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final String getF100548b() {
            return this.f100548b;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof SharingDestination) && Intrinsics.f(this.f100548b, ((SharingDestination) obj2).f100548b);
        }

        public final int hashCode() {
            return this.f100548b.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f100548b);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/esim/api/navigation/EsimFeatureConfig$Subscription;", "Lcom/revolut/retail/feature/esim/api/navigation/EsimFeatureConfig;", "", "toString", "()Ljava/lang/String;", "feature_retail_esim_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Subscription extends EsimFeatureConfig {

        @NotNull
        public static final Parcelable.Creator<Subscription> CREATOR = new a();

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final String f100549g;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Subscription(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Subscription[i];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Subscription(String subscriptionId) {
            super(null, new SubscriptionDestination(subscriptionId, null));
            Intrinsics.checkNotNullParameter(subscriptionId, "subscriptionId");
            this.f100549g = subscriptionId;
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Subscription) && Intrinsics.f(this.f100549g, ((Subscription) obj2).f100549g);
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
        public final int hashCode() {
            return this.f100549g.hashCode();
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig, android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f100549g);
        }
    }

    /* JADX INFO: loaded from: classes13.dex */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/esim/api/navigation/EsimFeatureConfig$SubscriptionDestination;", "Lcom/revolut/kompot/common/StackDestination;", "", "toString", "()Ljava/lang/String;", "feature_retail_esim_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class SubscriptionDestination implements StackDestination {

        @NotNull
        public static final Parcelable.Creator<SubscriptionDestination> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f100550a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final TransitionAnimation f100551b;

        /* JADX INFO: loaded from: classes11.dex */
        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new SubscriptionDestination(parcel.readString(), (TransitionAnimation) parcel.readParcelable(SubscriptionDestination.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new SubscriptionDestination[i];
            }
        }

        public SubscriptionDestination(String subscriptionId, TransitionAnimation transitionAnimation) {
            Intrinsics.checkNotNullParameter(subscriptionId, "subscriptionId");
            this.f100550a = subscriptionId;
            this.f100551b = transitionAnimation;
        }

        @Override // aii.d0
        /* JADX INFO: renamed from: Y0, reason: from getter */
        public final TransitionAnimation getF86778c() {
            return this.f100551b;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof SubscriptionDestination)) {
                return false;
            }
            SubscriptionDestination subscriptionDestination = (SubscriptionDestination) obj2;
            return Intrinsics.f(this.f100550a, subscriptionDestination.f100550a) && Intrinsics.f(this.f100551b, subscriptionDestination.f100551b);
        }

        public final int hashCode() {
            int iHashCode = this.f100550a.hashCode() * 31;
            TransitionAnimation transitionAnimation = this.f100551b;
            return iHashCode + (transitionAnimation == null ? 0 : transitionAnimation.hashCode());
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f100550a);
            dest.writeParcelable(this.f100551b, i);
        }
    }

    public EsimFeatureConfig(ActivityAnimation activityAnimation, StackDestination stackDestination) {
        super(activityAnimation, (ParcelableDestination) stackDestination, false, (Integer) null, 0, 60);
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/esim/api/navigation/EsimFeatureConfig$ConnectivityTroubleshootingDestination;", "Lcom/revolut/kompot/bridge/navigation/KompotDestination;", "", "toString", "()Ljava/lang/String;", "feature_retail_esim_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class ConnectivityTroubleshootingDestination implements KompotDestination {

        @NotNull
        public static final Parcelable.Creator<ConnectivityTroubleshootingDestination> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f100534a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new ConnectivityTroubleshootingDestination(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ConnectivityTroubleshootingDestination[i];
            }
        }

        public ConnectivityTroubleshootingDestination(String str) {
            this.f100534a = str;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getF100534a() {
            return this.f100534a;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof ConnectivityTroubleshootingDestination) && Intrinsics.f(this.f100534a, ((ConnectivityTroubleshootingDestination) obj2).f100534a);
        }

        public final int hashCode() {
            String str = this.f100534a;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f100534a);
        }

        public ConnectivityTroubleshootingDestination() {
            this(null);
        }
    }
}
