package com.revolut.feature.structured_note.details.impl.ui.screens.performance_tracker.pages.terms;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.structured_note.details.impl.ui.common.PayoutScenarioMapper$CalculatorParcel;
import com.revolut.kompot.navigable.flow.FlowStep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0001\u0005¨\u0006\u0006"}, d2 = {"com/revolut/feature/structured_note/details/impl/ui/screens/performance_tracker/pages/terms/PerformanceTrackerTermsControllerContract$ModalStep", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "<init>", "()V", "PayoutCalculator", "Lcom/revolut/feature/structured_note/details/impl/ui/screens/performance_tracker/pages/terms/PerformanceTrackerTermsControllerContract$ModalStep$PayoutCalculator;", "feature_structured_note_details_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class PerformanceTrackerTermsControllerContract$ModalStep implements FlowStep {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/structured_note/details/impl/ui/screens/performance_tracker/pages/terms/PerformanceTrackerTermsControllerContract$ModalStep$PayoutCalculator;", "Lcom/revolut/feature/structured_note/details/impl/ui/screens/performance_tracker/pages/terms/PerformanceTrackerTermsControllerContract$ModalStep;", "", "toString", "()Ljava/lang/String;", "feature_structured_note_details_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class PayoutCalculator extends PerformanceTrackerTermsControllerContract$ModalStep {

        @NotNull
        public static final Parcelable.Creator<PayoutCalculator> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final PayoutScenarioMapper$CalculatorParcel f88908a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new PayoutCalculator(PayoutScenarioMapper$CalculatorParcel.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new PayoutCalculator[i];
            }
        }

        public PayoutCalculator(PayoutScenarioMapper$CalculatorParcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            this.f88908a = parcel;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof PayoutCalculator) && Intrinsics.f(this.f88908a, ((PayoutCalculator) obj2).f88908a);
        }

        public final int hashCode() {
            return this.f88908a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            this.f88908a.writeToParcel(dest, i);
        }
    }

    private PerformanceTrackerTermsControllerContract$ModalStep() {
    }
}
