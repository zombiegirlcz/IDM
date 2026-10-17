package com.revolut.feature.wealth_protection.sso.api;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.exchange.models.ExchangeLinkedOrderSpec;
import com.revolut.feature.exchange.models.ExchangeOrderSpec;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0004\b\t\n\u000b¨\u0006\f"}, d2 = {"Lcom/revolut/feature/wealth_protection/sso/api/WealthProtectionSsoFlowType;", "Landroid/os/Parcelable;", "<init>", "()V", "HotelsWithdrawal", "FxOrder", "TakeProfitStopLossOrder", "Retry", "Lcom/revolut/feature/wealth_protection/sso/api/WealthProtectionSsoFlowType$FxOrder;", "Lcom/revolut/feature/wealth_protection/sso/api/WealthProtectionSsoFlowType$HotelsWithdrawal;", "Lcom/revolut/feature/wealth_protection/sso/api/WealthProtectionSsoFlowType$Retry;", "Lcom/revolut/feature/wealth_protection/sso/api/WealthProtectionSsoFlowType$TakeProfitStopLossOrder;", "feature_wealth_protection_sso_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class WealthProtectionSsoFlowType implements Parcelable {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/wealth_protection/sso/api/WealthProtectionSsoFlowType$FxOrder;", "Lcom/revolut/feature/wealth_protection/sso/api/WealthProtectionSsoFlowType;", "", "toString", "()Ljava/lang/String;", "feature_wealth_protection_sso_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class FxOrder extends WealthProtectionSsoFlowType {

        @NotNull
        public static final Parcelable.Creator<FxOrder> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ExchangeOrderSpec f96306a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f96307b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new FxOrder((ExchangeOrderSpec) parcel.readParcelable(FxOrder.class.getClassLoader()), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new FxOrder[i];
            }
        }

        public FxOrder(ExchangeOrderSpec spec, String idempotencyKey) {
            Intrinsics.checkNotNullParameter(spec, "spec");
            Intrinsics.checkNotNullParameter(idempotencyKey, "idempotencyKey");
            this.f96306a = spec;
            this.f96307b = idempotencyKey;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof FxOrder)) {
                return false;
            }
            FxOrder fxOrder = (FxOrder) obj2;
            return Intrinsics.f(this.f96306a, fxOrder.f96306a) && Intrinsics.f(this.f96307b, fxOrder.f96307b);
        }

        public final int hashCode() {
            return this.f96307b.hashCode() + (this.f96306a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f96306a, i);
            dest.writeString(this.f96307b);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/wealth_protection/sso/api/WealthProtectionSsoFlowType$HotelsWithdrawal;", "Lcom/revolut/feature/wealth_protection/sso/api/WealthProtectionSsoFlowType;", "", "toString", "()Ljava/lang/String;", "feature_wealth_protection_sso_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class HotelsWithdrawal extends WealthProtectionSsoFlowType {

        @NotNull
        public static final Parcelable.Creator<HotelsWithdrawal> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f96308a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f96309b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new HotelsWithdrawal(parcel.readString(), parcel.readLong());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new HotelsWithdrawal[i];
            }
        }

        public HotelsWithdrawal(String vaultId, long j2) {
            Intrinsics.checkNotNullParameter(vaultId, "vaultId");
            this.f96308a = vaultId;
            this.f96309b = j2;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof HotelsWithdrawal)) {
                return false;
            }
            HotelsWithdrawal hotelsWithdrawal = (HotelsWithdrawal) obj2;
            return Intrinsics.f(this.f96308a, hotelsWithdrawal.f96308a) && this.f96309b == hotelsWithdrawal.f96309b;
        }

        public final int hashCode() {
            return Long.hashCode(this.f96309b) + (this.f96308a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f96308a);
            dest.writeLong(this.f96309b);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/wealth_protection/sso/api/WealthProtectionSsoFlowType$Retry;", "Lcom/revolut/feature/wealth_protection/sso/api/WealthProtectionSsoFlowType;", "<init>", "()V", "feature_wealth_protection_sso_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Retry extends WealthProtectionSsoFlowType {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Retry f96310a = new Retry();

        @NotNull
        public static final Parcelable.Creator<Retry> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Retry.f96310a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Retry[i];
            }
        }

        private Retry() {
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/wealth_protection/sso/api/WealthProtectionSsoFlowType$TakeProfitStopLossOrder;", "Lcom/revolut/feature/wealth_protection/sso/api/WealthProtectionSsoFlowType;", "", "toString", "()Ljava/lang/String;", "feature_wealth_protection_sso_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class TakeProfitStopLossOrder extends WealthProtectionSsoFlowType {

        @NotNull
        public static final Parcelable.Creator<TakeProfitStopLossOrder> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ExchangeLinkedOrderSpec f96311a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f96312b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new TakeProfitStopLossOrder((ExchangeLinkedOrderSpec) parcel.readParcelable(TakeProfitStopLossOrder.class.getClassLoader()), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new TakeProfitStopLossOrder[i];
            }
        }

        public TakeProfitStopLossOrder(ExchangeLinkedOrderSpec spec, String idempotencyKey) {
            Intrinsics.checkNotNullParameter(spec, "spec");
            Intrinsics.checkNotNullParameter(idempotencyKey, "idempotencyKey");
            this.f96311a = spec;
            this.f96312b = idempotencyKey;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof TakeProfitStopLossOrder)) {
                return false;
            }
            TakeProfitStopLossOrder takeProfitStopLossOrder = (TakeProfitStopLossOrder) obj2;
            return Intrinsics.f(this.f96311a, takeProfitStopLossOrder.f96311a) && Intrinsics.f(this.f96312b, takeProfitStopLossOrder.f96312b);
        }

        public final int hashCode() {
            return this.f96312b.hashCode() + (this.f96311a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f96311a, i);
            dest.writeString(this.f96312b);
        }
    }

    private WealthProtectionSsoFlowType() {
    }
}
