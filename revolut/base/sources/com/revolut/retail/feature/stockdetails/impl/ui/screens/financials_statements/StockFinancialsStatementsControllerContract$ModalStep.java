package com.revolut.retail.feature.stockdetails.impl.ui.screens.financials_statements;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.navigable.flow.FlowStep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import uqk.e;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0001\u0002\u0082\u0001\u0001\u0003¨\u0006\u0004À\u0006\u0003"}, d2 = {"com/revolut/retail/feature/stockdetails/impl/ui/screens/financials_statements/StockFinancialsStatementsControllerContract$ModalStep", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "PeriodChooser", "Lcom/revolut/retail/feature/stockdetails/impl/ui/screens/financials_statements/StockFinancialsStatementsControllerContract$ModalStep$PeriodChooser;", "feature_stock_details_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface StockFinancialsStatementsControllerContract$ModalStep extends FlowStep {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/stockdetails/impl/ui/screens/financials_statements/StockFinancialsStatementsControllerContract$ModalStep$PeriodChooser;", "Lcom/revolut/retail/feature/stockdetails/impl/ui/screens/financials_statements/StockFinancialsStatementsControllerContract$ModalStep;", "", "toString", "()Ljava/lang/String;", "feature_stock_details_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class PeriodChooser implements StockFinancialsStatementsControllerContract$ModalStep {

        @NotNull
        public static final Parcelable.Creator<PeriodChooser> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final e f103964a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new PeriodChooser(e.valueOf(parcel.readString()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new PeriodChooser[i];
            }
        }

        public PeriodChooser(e selectedPeriod) {
            Intrinsics.checkNotNullParameter(selectedPeriod, "selectedPeriod");
            this.f103964a = selectedPeriod;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof PeriodChooser) && this.f103964a == ((PeriodChooser) obj2).f103964a;
        }

        public final int hashCode() {
            return this.f103964a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f103964a.name());
        }
    }
}
