package com.revolut.retail.feature.stockdetails.impl.ui.flows.etf_details;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.navigable.flow.FlowStep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0001\u0002\u0082\u0001\u0001\u0003¨\u0006\u0004À\u0006\u0003"}, d2 = {"com/revolut/retail/feature/stockdetails/impl/ui/flows/etf_details/EtfDetailsFlowControllerContract$ModalStep", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "LeveragedInfo", "Lcom/revolut/retail/feature/stockdetails/impl/ui/flows/etf_details/EtfDetailsFlowControllerContract$ModalStep$LeveragedInfo;", "feature_stock_details_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface EtfDetailsFlowControllerContract$ModalStep extends FlowStep {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/retail/feature/stockdetails/impl/ui/flows/etf_details/EtfDetailsFlowControllerContract$ModalStep$LeveragedInfo;", "Lcom/revolut/retail/feature/stockdetails/impl/ui/flows/etf_details/EtfDetailsFlowControllerContract$ModalStep;", "<init>", "()V", "feature_stock_details_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class LeveragedInfo implements EtfDetailsFlowControllerContract$ModalStep {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final LeveragedInfo f103840a = new LeveragedInfo();

        @NotNull
        public static final Parcelable.Creator<LeveragedInfo> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return LeveragedInfo.f103840a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new LeveragedInfo[i];
            }
        }

        private LeveragedInfo() {
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
