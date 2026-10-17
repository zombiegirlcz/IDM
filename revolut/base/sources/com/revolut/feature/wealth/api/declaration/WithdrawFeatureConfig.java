package com.revolut.feature.wealth.api.declaration;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.wealth.models.addmoney.TransferSubjectId;
import com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig;
import com.revolut.kompot.bridge.navigation.KompotDestination;
import com.revolut.kompot.common.ParcelableDestination;
import com.revolut.retail.core.navigation.ActivityAnimation;
import com.revolut.shared.feature.wealth.models.account.WealthAccountType;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import xi0.b;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/wealth/api/declaration/WithdrawFeatureConfig;", "Lcom/revolut/kompot/bridge/navigation/KompotBridgeFeatureConfig;", "", "toString", "()Ljava/lang/String;", "Destination", "feature_wealth_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class WithdrawFeatureConfig extends KompotBridgeFeatureConfig {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final TransferSubjectId f95217g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final WealthAccountType f95218h;
    public final b i;

    /* JADX INFO: loaded from: classes13.dex */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002J\u0010\u0010\u0004\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/wealth/api/declaration/WithdrawFeatureConfig$Destination;", "Landroid/os/Parcelable;", "Lcom/revolut/kompot/bridge/navigation/KompotDestination;", "", "toString", "()Ljava/lang/String;", "feature_wealth_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Destination implements Parcelable, KompotDestination {

        @NotNull
        public static final Parcelable.Creator<Destination> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final TransferSubjectId f95219a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final WealthAccountType f95220b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final b f95221c;

        /* JADX INFO: loaded from: classes9.dex */
        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Destination((TransferSubjectId) parcel.readParcelable(Destination.class.getClassLoader()), (WealthAccountType) parcel.readParcelable(Destination.class.getClassLoader()), (b) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Destination[i];
            }
        }

        public Destination(TransferSubjectId transferSubjectId, WealthAccountType product, b targetCurrency) {
            Intrinsics.checkNotNullParameter(transferSubjectId, "transferSubjectId");
            Intrinsics.checkNotNullParameter(product, "product");
            Intrinsics.checkNotNullParameter(targetCurrency, "targetCurrency");
            this.f95219a = transferSubjectId;
            this.f95220b = product;
            this.f95221c = targetCurrency;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Destination)) {
                return false;
            }
            Destination destination = (Destination) obj2;
            return Intrinsics.f(this.f95219a, destination.f95219a) && this.f95220b == destination.f95220b && Intrinsics.f(this.f95221c, destination.f95221c);
        }

        public final int hashCode() {
            return this.f95221c.hashCode() + m72.b.e(this.f95220b, this.f95219a.hashCode() * 31, 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f95219a, i);
            dest.writeParcelable(this.f95220b, i);
            dest.writeSerializable(this.f95221c);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WithdrawFeatureConfig(TransferSubjectId transferSubjectId, WealthAccountType product, b targetCurrency) {
        super((ActivityAnimation) null, (ParcelableDestination) new Destination(transferSubjectId, product, targetCurrency), false, (Integer) null, 0, 60);
        Intrinsics.checkNotNullParameter(transferSubjectId, "transferSubjectId");
        Intrinsics.checkNotNullParameter(product, "product");
        Intrinsics.checkNotNullParameter(targetCurrency, "targetCurrency");
        this.f95217g = transferSubjectId;
        this.f95218h = product;
        this.i = targetCurrency;
    }

    @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
    /* JADX INFO: renamed from: a */
    public final ActivityAnimation getF81832g() {
        return null;
    }

    @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof WithdrawFeatureConfig)) {
            return false;
        }
        WithdrawFeatureConfig withdrawFeatureConfig = (WithdrawFeatureConfig) obj2;
        return Intrinsics.f(this.f95217g, withdrawFeatureConfig.f95217g) && this.f95218h == withdrawFeatureConfig.f95218h && Intrinsics.f(this.i, withdrawFeatureConfig.i);
    }

    @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
    public final int hashCode() {
        return this.i.hashCode() + m72.b.e(this.f95218h, this.f95217g.hashCode() * 31, 31);
    }
}
