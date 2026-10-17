package com.revolut.feature.credit.application.plugins.impl.ui.mortgage_refinancing_details_v2.loan_selector;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.common.IOData$Input;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import xy3.g;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/credit/application/plugins/impl/ui/mortgage_refinancing_details_v2/loan_selector/LoanSelectorControllerContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_credit_application_plugins_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class LoanSelectorControllerContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<LoanSelectorControllerContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zv3.a f68022a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g f68023b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new LoanSelectorControllerContract$InputData(zv3.a.valueOf(parcel.readString()), (g) parcel.readSerializable());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new LoanSelectorControllerContract$InputData[i];
        }
    }

    public LoanSelectorControllerContract$InputData(zv3.a navigationIcon, g configuration) {
        Intrinsics.checkNotNullParameter(navigationIcon, "navigationIcon");
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        this.f68022a = navigationIcon;
        this.f68023b = configuration;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof LoanSelectorControllerContract$InputData)) {
            return false;
        }
        LoanSelectorControllerContract$InputData loanSelectorControllerContract$InputData = (LoanSelectorControllerContract$InputData) obj2;
        return this.f68022a == loanSelectorControllerContract$InputData.f68022a && Intrinsics.f(this.f68023b, loanSelectorControllerContract$InputData.f68023b);
    }

    public final int hashCode() {
        return this.f68023b.hashCode() + (this.f68022a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f68022a.name());
        dest.writeSerializable(this.f68023b);
    }
}
