package com.revolut.feature.trusted_merchants.api;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.trusted_merchants.api.model.TrustedMerchant;
import com.revolut.retail.core.navigation.feature.FeatureConfig;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"Lcom/revolut/feature/trusted_merchants/api/TrustedMerchantsFeatureConfig;", "Lcom/revolut/retail/core/navigation/feature/FeatureConfig;", "TrustedMerchantsListFeatureConfig", "TrustedMerchantDetailsFeatureConfig", "Lcom/revolut/feature/trusted_merchants/api/TrustedMerchantsFeatureConfig$TrustedMerchantDetailsFeatureConfig;", "Lcom/revolut/feature/trusted_merchants/api/TrustedMerchantsFeatureConfig$TrustedMerchantsListFeatureConfig;", "feature_trusted_merchants_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface TrustedMerchantsFeatureConfig extends FeatureConfig {

    /* JADX INFO: loaded from: classes9.dex */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/trusted_merchants/api/TrustedMerchantsFeatureConfig$TrustedMerchantDetailsFeatureConfig;", "Lcom/revolut/feature/trusted_merchants/api/TrustedMerchantsFeatureConfig;", "", "toString", "()Ljava/lang/String;", "feature_trusted_merchants_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class TrustedMerchantDetailsFeatureConfig implements TrustedMerchantsFeatureConfig {

        @NotNull
        public static final Parcelable.Creator<TrustedMerchantDetailsFeatureConfig> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final TrustedMerchant.Approved f94402a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new TrustedMerchantDetailsFeatureConfig(TrustedMerchant.Approved.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new TrustedMerchantDetailsFeatureConfig[i];
            }
        }

        public TrustedMerchantDetailsFeatureConfig(TrustedMerchant.Approved merchant) {
            Intrinsics.checkNotNullParameter(merchant, "merchant");
            this.f94402a = merchant;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof TrustedMerchantDetailsFeatureConfig) && Intrinsics.f(this.f94402a, ((TrustedMerchantDetailsFeatureConfig) obj2).f94402a);
        }

        public final int hashCode() {
            return this.f94402a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            this.f94402a.writeToParcel(dest, i);
        }
    }

    /* JADX INFO: loaded from: classes9.dex */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/trusted_merchants/api/TrustedMerchantsFeatureConfig$TrustedMerchantsListFeatureConfig;", "Lcom/revolut/feature/trusted_merchants/api/TrustedMerchantsFeatureConfig;", "<init>", "()V", "feature_trusted_merchants_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class TrustedMerchantsListFeatureConfig implements TrustedMerchantsFeatureConfig {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final TrustedMerchantsListFeatureConfig f94403a = new TrustedMerchantsListFeatureConfig();

        @NotNull
        public static final Parcelable.Creator<TrustedMerchantsListFeatureConfig> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return TrustedMerchantsListFeatureConfig.f94403a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new TrustedMerchantsListFeatureConfig[i];
            }
        }

        private TrustedMerchantsListFeatureConfig() {
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
