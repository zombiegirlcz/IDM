package com.revolut.retail.feature.crypto_deposits.impl.ui.return_deposit.summary;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.navigable.flow.FlowStep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0001\u0002\u0082\u0001\u0001\u0003¨\u0006\u0004À\u0006\u0003"}, d2 = {"com/revolut/retail/feature/crypto_deposits/impl/ui/return_deposit/summary/ReturnCryptoDepositSummaryScreenContract$Modal", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "FeeInfo", "Lcom/revolut/retail/feature/crypto_deposits/impl/ui/return_deposit/summary/ReturnCryptoDepositSummaryScreenContract$Modal$FeeInfo;", "feature_crypto_deposits_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface ReturnCryptoDepositSummaryScreenContract$Modal extends FlowStep {

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/retail/feature/crypto_deposits/impl/ui/return_deposit/summary/ReturnCryptoDepositSummaryScreenContract$Modal$FeeInfo;", "Lcom/revolut/retail/feature/crypto_deposits/impl/ui/return_deposit/summary/ReturnCryptoDepositSummaryScreenContract$Modal;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "feature_crypto_deposits_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class FeeInfo implements ReturnCryptoDepositSummaryScreenContract$Modal {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final FeeInfo f100129a = new FeeInfo();

        @NotNull
        public static final Parcelable.Creator<FeeInfo> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return FeeInfo.f100129a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new FeeInfo[i];
            }
        }

        private FeeInfo() {
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            return this == obj2 || (obj2 instanceof FeeInfo);
        }

        public final int hashCode() {
            return -116404715;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(1);
        }
    }
}
