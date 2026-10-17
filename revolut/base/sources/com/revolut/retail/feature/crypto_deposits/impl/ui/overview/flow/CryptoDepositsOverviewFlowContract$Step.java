package com.revolut.retail.feature.crypto_deposits.impl.ui.overview.flow;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.crypto.remittance.api.navigation.CryptoRemittanceKompotFeatureConfig;
import com.revolut.kompot.navigable.flow.FlowStep;
import com.revolut.retail.feature.crypto_deposits.impl.ui.overview.flow.CryptoDepositsOverviewFlowContract$InputData;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"com/revolut/retail/feature/crypto_deposits/impl/ui/overview/flow/CryptoDepositsOverviewFlowContract$Step", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "SelectCurrency", "Overview", "Lcom/revolut/retail/feature/crypto_deposits/impl/ui/overview/flow/CryptoDepositsOverviewFlowContract$Step$Overview;", "Lcom/revolut/retail/feature/crypto_deposits/impl/ui/overview/flow/CryptoDepositsOverviewFlowContract$Step$SelectCurrency;", "feature_crypto_deposits_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface CryptoDepositsOverviewFlowContract$Step extends FlowStep {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/crypto_deposits/impl/ui/overview/flow/CryptoDepositsOverviewFlowContract$Step$Overview;", "Lcom/revolut/retail/feature/crypto_deposits/impl/ui/overview/flow/CryptoDepositsOverviewFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_crypto_deposits_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Overview implements CryptoDepositsOverviewFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<Overview> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final xi0.b f100102a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f100103b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final CryptoDepositsOverviewFlowContract$InputData.Source f100104c;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Overview((xi0.b) parcel.readSerializable(), parcel.readInt() != 0, (CryptoDepositsOverviewFlowContract$InputData.Source) parcel.readParcelable(Overview.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Overview[i];
            }
        }

        public Overview(xi0.b selectedCurrency, boolean z, CryptoDepositsOverviewFlowContract$InputData.Source source) {
            Intrinsics.checkNotNullParameter(selectedCurrency, "selectedCurrency");
            Intrinsics.checkNotNullParameter(source, "source");
            this.f100102a = selectedCurrency;
            this.f100103b = z;
            this.f100104c = source;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Overview)) {
                return false;
            }
            Overview overview = (Overview) obj2;
            return Intrinsics.f(this.f100102a, overview.f100102a) && this.f100103b == overview.f100103b && Intrinsics.f(this.f100104c, overview.f100104c);
        }

        public final int hashCode() {
            return this.f100104c.hashCode() + j6.a.c(this.f100102a.hashCode() * 31, 31, this.f100103b);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f100102a);
            dest.writeInt(this.f100103b ? 1 : 0);
            dest.writeParcelable(this.f100104c, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/crypto_deposits/impl/ui/overview/flow/CryptoDepositsOverviewFlowContract$Step$SelectCurrency;", "Lcom/revolut/retail/feature/crypto_deposits/impl/ui/overview/flow/CryptoDepositsOverviewFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_crypto_deposits_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class SelectCurrency implements CryptoDepositsOverviewFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<SelectCurrency> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final CryptoRemittanceKompotFeatureConfig.CurrencyPickerDestination.InputData.Currencies f100105a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f100106b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f100107c;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new SelectCurrency((CryptoRemittanceKompotFeatureConfig.CurrencyPickerDestination.InputData.Currencies) parcel.readParcelable(SelectCurrency.class.getClassLoader()), parcel.readInt() != 0, parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new SelectCurrency[i];
            }
        }

        public SelectCurrency(CryptoRemittanceKompotFeatureConfig.CurrencyPickerDestination.InputData.Currencies currencies, boolean z, boolean z3) {
            Intrinsics.checkNotNullParameter(currencies, "currencies");
            this.f100105a = currencies;
            this.f100106b = z;
            this.f100107c = z3;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof SelectCurrency)) {
                return false;
            }
            SelectCurrency selectCurrency = (SelectCurrency) obj2;
            return Intrinsics.f(this.f100105a, selectCurrency.f100105a) && this.f100106b == selectCurrency.f100106b && this.f100107c == selectCurrency.f100107c;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f100107c) + j6.a.c(this.f100105a.hashCode() * 31, 31, this.f100106b);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f100105a, i);
            dest.writeInt(this.f100106b ? 1 : 0);
            dest.writeInt(this.f100107c ? 1 : 0);
        }
    }
}
