package com.revolut.feature.cashback.api.navigation;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.core.ui_kit.views.slider_layout.HomeOverlayConfig;
import com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig;
import com.revolut.kompot.bridge.navigation.KompotDestination;
import com.revolut.kompot.common.IOData$EmptyInput;
import com.revolut.kompot.common.InternalDestination;
import com.revolut.kompot.common.ParcelableDestination;
import com.revolut.kompot.common.transition.ZoomTarget;
import com.revolut.kompot.navigable.TransitionAnimation;
import com.revolut.retail.core.navigation.ActivityAnimation;
import dj0.d;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0006\u0002\u0003\u0004\u0005\u0006\u0007\u0082\u0001\u0002\b\t¨\u0006\n"}, d2 = {"Lcom/revolut/feature/cashback/api/navigation/YourCashbackFeatureConfig;", "Lcom/revolut/kompot/bridge/navigation/KompotBridgeFeatureConfig;", "Home", "PlanCashbackDetails", "HomeDestination", "ProductDestination", "WithdrawPlanCashbackDestination", "PlanCashbackDetailsDestination", "Lcom/revolut/feature/cashback/api/navigation/YourCashbackFeatureConfig$Home;", "Lcom/revolut/feature/cashback/api/navigation/YourCashbackFeatureConfig$PlanCashbackDetails;", "feature_cashback_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class YourCashbackFeatureConfig extends KompotBridgeFeatureConfig {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/cashback/api/navigation/YourCashbackFeatureConfig$Home;", "Lcom/revolut/feature/cashback/api/navigation/YourCashbackFeatureConfig;", "<init>", "()V", "feature_cashback_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Home extends YourCashbackFeatureConfig {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final Home f65691g = new Home();

        @NotNull
        public static final Parcelable.Creator<Home> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Home.f65691g;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Home[i];
            }
        }

        private Home() {
            super(new HomeDestination(0));
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig, android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(1);
        }
    }

    /* JADX INFO: loaded from: classes13.dex */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/cashback/api/navigation/YourCashbackFeatureConfig$HomeDestination;", "Lcom/revolut/kompot/common/InternalDestination;", "Lcom/revolut/kompot/common/IOData$EmptyInput;", "Lcom/revolut/kompot/bridge/navigation/KompotDestination;", "", "toString", "()Ljava/lang/String;", "feature_cashback_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class HomeDestination extends InternalDestination<IOData$EmptyInput> implements KompotDestination {

        @NotNull
        public static final Parcelable.Creator<HomeDestination> CREATOR = new a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final ZoomTarget f65692b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f65693c;

        /* JADX INFO: loaded from: classes21.dex */
        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new HomeDestination((ZoomTarget) parcel.readParcelable(HomeDestination.class.getClassLoader()), parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new HomeDestination[i];
            }
        }

        public HomeDestination() {
            this(0);
        }

        @Override // aii.d0
        /* JADX INFO: renamed from: Y0 */
        public final TransitionAnimation getF87419a() {
            ZoomTarget zoomTarget = this.f65692b;
            if (zoomTarget == null) {
                return null;
            }
            TransitionAnimation.Companion companion = TransitionAnimation.INSTANCE;
            HomeOverlayConfig.INSTANCE.getClass();
            return com.revolut.kompot.common.transition.a.d(companion, zoomTarget, HomeOverlayConfig.f59654b);
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
            return Intrinsics.f(this.f65692b, homeDestination.f65692b) && this.f65693c == homeDestination.f65693c;
        }

        public final int hashCode() {
            ZoomTarget zoomTarget = this.f65692b;
            return Boolean.hashCode(this.f65693c) + ((zoomTarget == null ? 0 : zoomTarget.hashCode()) * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f65692b, i);
            dest.writeInt(this.f65693c ? 1 : 0);
        }

        public /* synthetic */ HomeDestination(int i) {
            this(null, false);
        }

        public HomeDestination(ZoomTarget zoomTarget, boolean z) {
            super(IOData$EmptyInput.f98299a);
            this.f65692b = zoomTarget;
            this.f65693c = z;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/cashback/api/navigation/YourCashbackFeatureConfig$PlanCashbackDetails;", "Lcom/revolut/feature/cashback/api/navigation/YourCashbackFeatureConfig;", "", "toString", "()Ljava/lang/String;", "feature_cashback_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class PlanCashbackDetails extends YourCashbackFeatureConfig {

        @NotNull
        public static final Parcelable.Creator<PlanCashbackDetails> CREATOR = new a();

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final d f65694g;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new PlanCashbackDetails((d) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new PlanCashbackDetails[i];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public PlanCashbackDetails(d balance) {
            super(new PlanCashbackDetailsDestination(balance));
            Intrinsics.checkNotNullParameter(balance, "balance");
            this.f65694g = balance;
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof PlanCashbackDetails) && Intrinsics.f(this.f65694g, ((PlanCashbackDetails) obj2).f65694g);
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
        public final int hashCode() {
            return this.f65694g.hashCode();
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig, android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f65694g);
        }
    }

    /* JADX INFO: loaded from: classes13.dex */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/cashback/api/navigation/YourCashbackFeatureConfig$PlanCashbackDetailsDestination;", "Lcom/revolut/kompot/bridge/navigation/KompotDestination;", "", "toString", "()Ljava/lang/String;", "feature_cashback_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class PlanCashbackDetailsDestination implements KompotDestination {

        @NotNull
        public static final Parcelable.Creator<PlanCashbackDetailsDestination> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final d f65695a;

        /* JADX INFO: loaded from: classes21.dex */
        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new PlanCashbackDetailsDestination((d) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new PlanCashbackDetailsDestination[i];
            }
        }

        public PlanCashbackDetailsDestination(d balance) {
            Intrinsics.checkNotNullParameter(balance, "balance");
            this.f65695a = balance;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof PlanCashbackDetailsDestination) && Intrinsics.f(this.f65695a, ((PlanCashbackDetailsDestination) obj2).f65695a);
        }

        public final int hashCode() {
            return this.f65695a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f65695a);
        }
    }

    /* JADX INFO: loaded from: classes13.dex */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/cashback/api/navigation/YourCashbackFeatureConfig$ProductDestination;", "Lcom/revolut/kompot/bridge/navigation/KompotDestination;", "", "toString", "()Ljava/lang/String;", "feature_cashback_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class ProductDestination implements KompotDestination {

        @NotNull
        public static final Parcelable.Creator<ProductDestination> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final uc3.d f65696a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f65697b;

        /* JADX INFO: loaded from: classes21.dex */
        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new ProductDestination(uc3.d.valueOf(parcel.readString()), parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ProductDestination[i];
            }
        }

        public ProductDestination(uc3.d cashbackSourceType, boolean z) {
            Intrinsics.checkNotNullParameter(cashbackSourceType, "cashbackSourceType");
            this.f65696a = cashbackSourceType;
            this.f65697b = z;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof ProductDestination)) {
                return false;
            }
            ProductDestination productDestination = (ProductDestination) obj2;
            return this.f65696a == productDestination.f65696a && this.f65697b == productDestination.f65697b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f65697b) + (this.f65696a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f65696a.name());
            dest.writeInt(this.f65697b ? 1 : 0);
        }
    }

    /* JADX INFO: loaded from: classes13.dex */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/cashback/api/navigation/YourCashbackFeatureConfig$WithdrawPlanCashbackDestination;", "Lcom/revolut/kompot/bridge/navigation/KompotDestination;", "", "toString", "()Ljava/lang/String;", "feature_cashback_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class WithdrawPlanCashbackDestination implements KompotDestination {

        @NotNull
        public static final Parcelable.Creator<WithdrawPlanCashbackDestination> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final uc3.a f65698a;

        /* JADX INFO: loaded from: classes21.dex */
        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new WithdrawPlanCashbackDestination((uc3.a) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new WithdrawPlanCashbackDestination[i];
            }
        }

        public WithdrawPlanCashbackDestination(uc3.a cashbackBox) {
            Intrinsics.checkNotNullParameter(cashbackBox, "cashbackBox");
            this.f65698a = cashbackBox;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof WithdrawPlanCashbackDestination) && Intrinsics.f(this.f65698a, ((WithdrawPlanCashbackDestination) obj2).f65698a);
        }

        public final int hashCode() {
            return this.f65698a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f65698a);
        }
    }

    public YourCashbackFeatureConfig(KompotDestination kompotDestination) {
        super((ActivityAnimation) null, (ParcelableDestination) kompotDestination, false, (Integer) null, 0, 60);
    }
}
