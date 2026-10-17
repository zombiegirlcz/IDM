package com.revolut.feature.insurance_embedded.impl.ui.screen.embedded.make_claim;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.insurance_embedded.impl.data.model.BottomSheet;
import com.revolut.kompot.navigable.flow.FlowStep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0001\u0005¨\u0006\u0006"}, d2 = {"com/revolut/feature/insurance_embedded/impl/ui/screen/embedded/make_claim/MakeClaimScreenContract$ModalStep", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "<init>", "()V", "BottomSheetStep", "Lcom/revolut/feature/insurance_embedded/impl/ui/screen/embedded/make_claim/MakeClaimScreenContract$ModalStep$BottomSheetStep;", "feature_insurance_embedded_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class MakeClaimScreenContract$ModalStep implements FlowStep {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/insurance_embedded/impl/ui/screen/embedded/make_claim/MakeClaimScreenContract$ModalStep$BottomSheetStep;", "Lcom/revolut/feature/insurance_embedded/impl/ui/screen/embedded/make_claim/MakeClaimScreenContract$ModalStep;", "", "toString", "()Ljava/lang/String;", "feature_insurance_embedded_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class BottomSheetStep extends MakeClaimScreenContract$ModalStep {

        @NotNull
        public static final Parcelable.Creator<BottomSheetStep> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final BottomSheet f76129a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new BottomSheetStep(BottomSheet.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new BottomSheetStep[i];
            }
        }

        public BottomSheetStep(BottomSheet layout) {
            Intrinsics.checkNotNullParameter(layout, "layout");
            this.f76129a = layout;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof BottomSheetStep) && Intrinsics.f(this.f76129a, ((BottomSheetStep) obj2).f76129a);
        }

        public final int hashCode() {
            return this.f76129a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            this.f76129a.writeToParcel(dest, i);
        }
    }

    private MakeClaimScreenContract$ModalStep() {
    }
}
