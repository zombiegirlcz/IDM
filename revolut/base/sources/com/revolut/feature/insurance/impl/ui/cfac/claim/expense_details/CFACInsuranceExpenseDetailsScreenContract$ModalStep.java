package com.revolut.feature.insurance.impl.ui.cfac.claim.expense_details;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.navigable.flow.FlowStep;
import java.io.File;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0001\u0005¨\u0006\u0006"}, d2 = {"com/revolut/feature/insurance/impl/ui/cfac/claim/expense_details/CFACInsuranceExpenseDetailsScreenContract$ModalStep", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "<init>", "()V", "BottomSheet", "Lcom/revolut/feature/insurance/impl/ui/cfac/claim/expense_details/CFACInsuranceExpenseDetailsScreenContract$ModalStep$BottomSheet;", "feature_insurance_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class CFACInsuranceExpenseDetailsScreenContract$ModalStep implements FlowStep {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/insurance/impl/ui/cfac/claim/expense_details/CFACInsuranceExpenseDetailsScreenContract$ModalStep$BottomSheet;", "Lcom/revolut/feature/insurance/impl/ui/cfac/claim/expense_details/CFACInsuranceExpenseDetailsScreenContract$ModalStep;", "", "toString", "()Ljava/lang/String;", "feature_insurance_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class BottomSheet extends CFACInsuranceExpenseDetailsScreenContract$ModalStep {

        @NotNull
        public static final Parcelable.Creator<BottomSheet> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final nj7.a f75079a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final File f75080b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new BottomSheet(nj7.a.valueOf(parcel.readString()), (File) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new BottomSheet[i];
            }
        }

        public BottomSheet(nj7.a configuration, File file) {
            Intrinsics.checkNotNullParameter(configuration, "configuration");
            this.f75079a = configuration;
            this.f75080b = file;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof BottomSheet)) {
                return false;
            }
            BottomSheet bottomSheet = (BottomSheet) obj2;
            return this.f75079a == bottomSheet.f75079a && Intrinsics.f(this.f75080b, bottomSheet.f75080b);
        }

        public final int hashCode() {
            int iHashCode = this.f75079a.hashCode() * 31;
            File file = this.f75080b;
            return iHashCode + (file == null ? 0 : file.hashCode());
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f75079a.name());
            dest.writeSerializable(this.f75080b);
        }
    }

    private CFACInsuranceExpenseDetailsScreenContract$ModalStep() {
    }
}
