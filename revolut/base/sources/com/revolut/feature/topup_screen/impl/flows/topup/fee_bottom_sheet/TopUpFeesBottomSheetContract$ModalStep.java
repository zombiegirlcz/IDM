package com.revolut.feature.topup_screen.impl.flows.topup.fee_bottom_sheet;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.navigable.flow.FlowStep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0001\u0002\u0082\u0001\u0001\u0003¨\u0006\u0004À\u0006\u0003"}, d2 = {"com/revolut/feature/topup_screen/impl/flows/topup/fee_bottom_sheet/TopUpFeesBottomSheetContract$ModalStep", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "BreakdownInfo", "Lcom/revolut/feature/topup_screen/impl/flows/topup/fee_bottom_sheet/TopUpFeesBottomSheetContract$ModalStep$BreakdownInfo;", "feature_topup_screen_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface TopUpFeesBottomSheetContract$ModalStep extends FlowStep {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/topup_screen/impl/flows/topup/fee_bottom_sheet/TopUpFeesBottomSheetContract$ModalStep$BreakdownInfo;", "Lcom/revolut/feature/topup_screen/impl/flows/topup/fee_bottom_sheet/TopUpFeesBottomSheetContract$ModalStep;", "", "toString", "()Ljava/lang/String;", "feature_topup_screen_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class BreakdownInfo implements TopUpFeesBottomSheetContract$ModalStep {

        @NotNull
        public static final Parcelable.Creator<BreakdownInfo> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f90825a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f90826b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new BreakdownInfo(parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new BreakdownInfo[i];
            }
        }

        public BreakdownInfo(String title, String description) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(description, "description");
            this.f90825a = title;
            this.f90826b = description;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof BreakdownInfo)) {
                return false;
            }
            BreakdownInfo breakdownInfo = (BreakdownInfo) obj2;
            return Intrinsics.f(this.f90825a, breakdownInfo.f90825a) && Intrinsics.f(this.f90826b, breakdownInfo.f90826b);
        }

        public final int hashCode() {
            return this.f90826b.hashCode() + (this.f90825a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f90825a);
            dest.writeString(this.f90826b);
        }
    }
}
