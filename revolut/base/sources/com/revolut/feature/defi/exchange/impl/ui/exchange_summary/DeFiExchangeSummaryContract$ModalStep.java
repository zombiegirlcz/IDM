package com.revolut.feature.defi.exchange.impl.ui.exchange_summary;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.defi.common.models.domain.DeFiAssetRiskContent;
import com.revolut.feature.defi.exchange.impl.ui.exchange_amount.model.DeFiExchangeOrderDraft;
import com.revolut.kompot.navigable.flow.FlowStep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0001\u0002\u0082\u0001\u0001\u0003¨\u0006\u0004À\u0006\u0003"}, d2 = {"com/revolut/feature/defi/exchange/impl/ui/exchange_summary/DeFiExchangeSummaryContract$ModalStep", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "RiskConfirmation", "Lcom/revolut/feature/defi/exchange/impl/ui/exchange_summary/DeFiExchangeSummaryContract$ModalStep$RiskConfirmation;", "feature_defi_exchange_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface DeFiExchangeSummaryContract$ModalStep extends FlowStep {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/defi/exchange/impl/ui/exchange_summary/DeFiExchangeSummaryContract$ModalStep$RiskConfirmation;", "Lcom/revolut/feature/defi/exchange/impl/ui/exchange_summary/DeFiExchangeSummaryContract$ModalStep;", "", "toString", "()Ljava/lang/String;", "feature_defi_exchange_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class RiskConfirmation implements DeFiExchangeSummaryContract$ModalStep {

        @NotNull
        public static final Parcelable.Creator<RiskConfirmation> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final DeFiAssetRiskContent f71773a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final DeFiExchangeOrderDraft f71774b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f71775c;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new RiskConfirmation((DeFiAssetRiskContent) parcel.readParcelable(RiskConfirmation.class.getClassLoader()), DeFiExchangeOrderDraft.CREATOR.createFromParcel(parcel), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new RiskConfirmation[i];
            }
        }

        public RiskConfirmation(DeFiAssetRiskContent content, DeFiExchangeOrderDraft draft, String signature) {
            Intrinsics.checkNotNullParameter(content, "content");
            Intrinsics.checkNotNullParameter(draft, "draft");
            Intrinsics.checkNotNullParameter(signature, "signature");
            this.f71773a = content;
            this.f71774b = draft;
            this.f71775c = signature;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof RiskConfirmation)) {
                return false;
            }
            RiskConfirmation riskConfirmation = (RiskConfirmation) obj2;
            return Intrinsics.f(this.f71773a, riskConfirmation.f71773a) && Intrinsics.f(this.f71774b, riskConfirmation.f71774b) && Intrinsics.f(this.f71775c, riskConfirmation.f71775c);
        }

        public final int hashCode() {
            return this.f71775c.hashCode() + ((this.f71774b.hashCode() + (this.f71773a.f71688a.hashCode() * 31)) * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f71773a, i);
            this.f71774b.writeToParcel(dest, i);
            dest.writeString(this.f71775c);
        }
    }
}
