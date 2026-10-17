package com.revolut.feature.retail.savings.impl.creation.presentation.account_creation_flow.steps.option_selection;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.retail.savings.api.domain.models.SavingsOption;
import com.revolut.kompot.common.IOData$Input;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/retail/savings/impl/creation/presentation/account_creation_flow/steps/option_selection/SavingsOptionSelectionContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_retail_savings_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class SavingsOptionSelectionContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<SavingsOptionSelectionContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SavingsOption f83279a;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new SavingsOptionSelectionContract$InputData((SavingsOption) parcel.readParcelable(SavingsOptionSelectionContract$InputData.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new SavingsOptionSelectionContract$InputData[i];
        }
    }

    public SavingsOptionSelectionContract$InputData(SavingsOption savingsOption) {
        this.f83279a = savingsOption;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof SavingsOptionSelectionContract$InputData) && this.f83279a == ((SavingsOptionSelectionContract$InputData) obj2).f83279a;
    }

    public final int hashCode() {
        SavingsOption savingsOption = this.f83279a;
        if (savingsOption == null) {
            return 0;
        }
        return savingsOption.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f83279a, i);
    }

    public SavingsOptionSelectionContract$InputData() {
        this(null);
    }
}
