package com.revolut.feature.external_accounts.impl.mandate.bottom_sheet;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.external_accounts.impl.mandate.limit_input.MandateLimitConfig;
import com.revolut.kompot.navigable.flow.FlowStep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0001\u0005¨\u0006\u0006"}, d2 = {"com/revolut/feature/external_accounts/impl/mandate/bottom_sheet/MandateSetupBottomSheetContract$ModalStep", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "<init>", "()V", "LimitInputStep", "Lcom/revolut/feature/external_accounts/impl/mandate/bottom_sheet/MandateSetupBottomSheetContract$ModalStep$LimitInputStep;", "feature_external_accounts_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class MandateSetupBottomSheetContract$ModalStep implements FlowStep {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/external_accounts/impl/mandate/bottom_sheet/MandateSetupBottomSheetContract$ModalStep$LimitInputStep;", "Lcom/revolut/feature/external_accounts/impl/mandate/bottom_sheet/MandateSetupBottomSheetContract$ModalStep;", "", "toString", "()Ljava/lang/String;", "feature_external_accounts_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class LimitInputStep extends MandateSetupBottomSheetContract$ModalStep {

        @NotNull
        public static final Parcelable.Creator<LimitInputStep> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final MandateLimitType f72427a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final MandateLimitConfig f72428b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new LimitInputStep(MandateLimitType.CREATOR.createFromParcel(parcel), (MandateLimitConfig) parcel.readParcelable(LimitInputStep.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new LimitInputStep[i];
            }
        }

        public LimitInputStep(MandateLimitType limitType, MandateLimitConfig limitConfig) {
            Intrinsics.checkNotNullParameter(limitType, "limitType");
            Intrinsics.checkNotNullParameter(limitConfig, "limitConfig");
            this.f72427a = limitType;
            this.f72428b = limitConfig;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof LimitInputStep)) {
                return false;
            }
            LimitInputStep limitInputStep = (LimitInputStep) obj2;
            return this.f72427a == limitInputStep.f72427a && Intrinsics.f(this.f72428b, limitInputStep.f72428b);
        }

        public final int hashCode() {
            return this.f72428b.hashCode() + (this.f72427a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            this.f72427a.writeToParcel(dest, i);
            dest.writeParcelable(this.f72428b, i);
        }
    }

    private MandateSetupBottomSheetContract$ModalStep() {
    }
}
