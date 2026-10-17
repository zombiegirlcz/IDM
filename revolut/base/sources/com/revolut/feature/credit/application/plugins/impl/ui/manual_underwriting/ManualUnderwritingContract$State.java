package com.revolut.feature.credit.application.plugins.impl.ui.manual_underwriting;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.credit.application.plugins.api.models.plugins.manual_underwriting.ManualUnderwritingSummary;
import com.revolut.kompot.navigable.flow.FlowState;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/credit/application/plugins/impl/ui/manual_underwriting/ManualUnderwritingContract$State", "Lcom/revolut/kompot/navigable/flow/FlowState;", "", "toString", "()Ljava/lang/String;", "feature_credit_application_plugins_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class ManualUnderwritingContract$State implements FlowState {

    @NotNull
    public static final Parcelable.Creator<ManualUnderwritingContract$State> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ManualUnderwritingSummary f67901a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f67902b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new ManualUnderwritingContract$State((ManualUnderwritingSummary) parcel.readParcelable(ManualUnderwritingContract$State.class.getClassLoader()), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new ManualUnderwritingContract$State[i];
        }
    }

    public ManualUnderwritingContract$State() {
        this(null, 3, 0);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof ManualUnderwritingContract$State)) {
            return false;
        }
        ManualUnderwritingContract$State manualUnderwritingContract$State = (ManualUnderwritingContract$State) obj2;
        return Intrinsics.f(this.f67901a, manualUnderwritingContract$State.f67901a) && this.f67902b == manualUnderwritingContract$State.f67902b;
    }

    public final int hashCode() {
        ManualUnderwritingSummary manualUnderwritingSummary = this.f67901a;
        return Integer.hashCode(this.f67902b) + ((manualUnderwritingSummary == null ? 0 : manualUnderwritingSummary.hashCode()) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f67901a, i);
        dest.writeInt(this.f67902b);
    }

    public ManualUnderwritingContract$State(ManualUnderwritingSummary manualUnderwritingSummary, int i) {
        this.f67901a = manualUnderwritingSummary;
        this.f67902b = i;
    }

    public /* synthetic */ ManualUnderwritingContract$State(ManualUnderwritingSummary manualUnderwritingSummary, int i, int i2) {
        this((i & 1) != 0 ? null : manualUnderwritingSummary, 0);
    }
}
