package com.revolut.feature.crypto.exchange.fees.impl.ui;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.navigable.flow.FlowStep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"com/revolut/feature/crypto/exchange/fees/impl/ui/CryptoExchangeFeesControllerContract$ModalStep", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "ProductArticle", "LearnMoreBottomSheet", "Lcom/revolut/feature/crypto/exchange/fees/impl/ui/CryptoExchangeFeesControllerContract$ModalStep$LearnMoreBottomSheet;", "Lcom/revolut/feature/crypto/exchange/fees/impl/ui/CryptoExchangeFeesControllerContract$ModalStep$ProductArticle;", "feature_crypto_exchange_fees_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface CryptoExchangeFeesControllerContract$ModalStep extends FlowStep {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/crypto/exchange/fees/impl/ui/CryptoExchangeFeesControllerContract$ModalStep$LearnMoreBottomSheet;", "Lcom/revolut/feature/crypto/exchange/fees/impl/ui/CryptoExchangeFeesControllerContract$ModalStep;", "", "toString", "()Ljava/lang/String;", "feature_crypto_exchange_fees_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class LearnMoreBottomSheet implements CryptoExchangeFeesControllerContract$ModalStep {

        @NotNull
        public static final Parcelable.Creator<LearnMoreBottomSheet> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f70835a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new LearnMoreBottomSheet(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new LearnMoreBottomSheet[i];
            }
        }

        public LearnMoreBottomSheet(String str) {
            this.f70835a = str;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof LearnMoreBottomSheet) && Intrinsics.f(this.f70835a, ((LearnMoreBottomSheet) obj2).f70835a);
        }

        public final int hashCode() {
            String str = this.f70835a;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f70835a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/crypto/exchange/fees/impl/ui/CryptoExchangeFeesControllerContract$ModalStep$ProductArticle;", "Lcom/revolut/feature/crypto/exchange/fees/impl/ui/CryptoExchangeFeesControllerContract$ModalStep;", "<init>", "()V", "feature_crypto_exchange_fees_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class ProductArticle implements CryptoExchangeFeesControllerContract$ModalStep {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final ProductArticle f70836a = new ProductArticle();

        @NotNull
        public static final Parcelable.Creator<ProductArticle> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return ProductArticle.f70836a;
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
}
