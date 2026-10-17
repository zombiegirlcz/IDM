package com.revolut.retail.feature.crypto_deposits.impl.ui.deposit_flow;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.navigable.flow.FlowStep;
import com.revolut.retail.feature.crypto_deposits.api.navigation.CryptoDepositInput;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\nÀ\u0006\u0003"}, d2 = {"com/revolut/retail/feature/crypto_deposits/impl/ui/deposit_flow/CryptoDepositFlowContract$Step", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "Restricted", "ProductArticle", "Overview", "DirectDeposit", "Lcom/revolut/retail/feature/crypto_deposits/impl/ui/deposit_flow/CryptoDepositFlowContract$Step$DirectDeposit;", "Lcom/revolut/retail/feature/crypto_deposits/impl/ui/deposit_flow/CryptoDepositFlowContract$Step$Overview;", "Lcom/revolut/retail/feature/crypto_deposits/impl/ui/deposit_flow/CryptoDepositFlowContract$Step$ProductArticle;", "Lcom/revolut/retail/feature/crypto_deposits/impl/ui/deposit_flow/CryptoDepositFlowContract$Step$Restricted;", "feature_crypto_deposits_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface CryptoDepositFlowContract$Step extends FlowStep {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/crypto_deposits/impl/ui/deposit_flow/CryptoDepositFlowContract$Step$DirectDeposit;", "Lcom/revolut/retail/feature/crypto_deposits/impl/ui/deposit_flow/CryptoDepositFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_crypto_deposits_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class DirectDeposit implements CryptoDepositFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<DirectDeposit> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final CryptoDepositInput.DirectDeposit f100052a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new DirectDeposit((CryptoDepositInput.DirectDeposit) parcel.readParcelable(DirectDeposit.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new DirectDeposit[i];
            }
        }

        public DirectDeposit(CryptoDepositInput.DirectDeposit input) {
            Intrinsics.checkNotNullParameter(input, "input");
            this.f100052a = input;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof DirectDeposit) && Intrinsics.f(this.f100052a, ((DirectDeposit) obj2).f100052a);
        }

        public final int hashCode() {
            return this.f100052a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f100052a, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/crypto_deposits/impl/ui/deposit_flow/CryptoDepositFlowContract$Step$Overview;", "Lcom/revolut/retail/feature/crypto_deposits/impl/ui/deposit_flow/CryptoDepositFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_crypto_deposits_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Overview implements CryptoDepositFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<Overview> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final CryptoDepositInput f100053a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Overview((CryptoDepositInput) parcel.readParcelable(Overview.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Overview[i];
            }
        }

        public Overview(CryptoDepositInput input) {
            Intrinsics.checkNotNullParameter(input, "input");
            this.f100053a = input;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Overview) && Intrinsics.f(this.f100053a, ((Overview) obj2).f100053a);
        }

        public final int hashCode() {
            return this.f100053a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f100053a, i);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/retail/feature/crypto_deposits/impl/ui/deposit_flow/CryptoDepositFlowContract$Step$ProductArticle;", "Lcom/revolut/retail/feature/crypto_deposits/impl/ui/deposit_flow/CryptoDepositFlowContract$Step;", "<init>", "()V", "feature_crypto_deposits_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class ProductArticle implements CryptoDepositFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final ProductArticle f100054a = new ProductArticle();

        @NotNull
        public static final Parcelable.Creator<ProductArticle> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return ProductArticle.f100054a;
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/retail/feature/crypto_deposits/impl/ui/deposit_flow/CryptoDepositFlowContract$Step$Restricted;", "Lcom/revolut/retail/feature/crypto_deposits/impl/ui/deposit_flow/CryptoDepositFlowContract$Step;", "<init>", "()V", "feature_crypto_deposits_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Restricted implements CryptoDepositFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Restricted f100055a = new Restricted();

        @NotNull
        public static final Parcelable.Creator<Restricted> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Restricted.f100055a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Restricted[i];
            }
        }

        private Restricted() {
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
}
