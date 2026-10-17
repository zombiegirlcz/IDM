package com.revolut.retail.feature.stockdetails.impl.ui.flows.insights.screens.technicals;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.navigable.flow.FlowStep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"com/revolut/retail/feature/stockdetails/impl/ui/flows/insights/screens/technicals/TechnicalInsightsControllerContract$ModalStep", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "MovingAveragesDetails", "OscillatorsDetails", "Lcom/revolut/retail/feature/stockdetails/impl/ui/flows/insights/screens/technicals/TechnicalInsightsControllerContract$ModalStep$MovingAveragesDetails;", "Lcom/revolut/retail/feature/stockdetails/impl/ui/flows/insights/screens/technicals/TechnicalInsightsControllerContract$ModalStep$OscillatorsDetails;", "feature_stock_details_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface TechnicalInsightsControllerContract$ModalStep extends FlowStep {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/retail/feature/stockdetails/impl/ui/flows/insights/screens/technicals/TechnicalInsightsControllerContract$ModalStep$MovingAveragesDetails;", "Lcom/revolut/retail/feature/stockdetails/impl/ui/flows/insights/screens/technicals/TechnicalInsightsControllerContract$ModalStep;", "<init>", "()V", "feature_stock_details_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class MovingAveragesDetails implements TechnicalInsightsControllerContract$ModalStep {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final MovingAveragesDetails f103868a = new MovingAveragesDetails();

        @NotNull
        public static final Parcelable.Creator<MovingAveragesDetails> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return MovingAveragesDetails.f103868a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new MovingAveragesDetails[i];
            }
        }

        private MovingAveragesDetails() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/retail/feature/stockdetails/impl/ui/flows/insights/screens/technicals/TechnicalInsightsControllerContract$ModalStep$OscillatorsDetails;", "Lcom/revolut/retail/feature/stockdetails/impl/ui/flows/insights/screens/technicals/TechnicalInsightsControllerContract$ModalStep;", "<init>", "()V", "feature_stock_details_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class OscillatorsDetails implements TechnicalInsightsControllerContract$ModalStep {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final OscillatorsDetails f103869a = new OscillatorsDetails();

        @NotNull
        public static final Parcelable.Creator<OscillatorsDetails> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return OscillatorsDetails.f103869a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new OscillatorsDetails[i];
            }
        }

        private OscillatorsDetails() {
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
