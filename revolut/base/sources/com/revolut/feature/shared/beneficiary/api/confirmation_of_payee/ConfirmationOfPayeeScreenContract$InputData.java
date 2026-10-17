package com.revolut.feature.shared.beneficiary.api.confirmation_of_payee;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.domain.models.beneficiary.ConfirmationResult;
import com.revolut.kompot.common.IOData$Input;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/shared/beneficiary/api/confirmation_of_payee/ConfirmationOfPayeeScreenContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_shared_beneficiary_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class ConfirmationOfPayeeScreenContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<ConfirmationOfPayeeScreenContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConfirmationResult f86044a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final BeneficiaryCreationType f86045b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new ConfirmationOfPayeeScreenContract$InputData((ConfirmationResult) parcel.readParcelable(ConfirmationOfPayeeScreenContract$InputData.class.getClassLoader()), (BeneficiaryCreationType) parcel.readParcelable(ConfirmationOfPayeeScreenContract$InputData.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new ConfirmationOfPayeeScreenContract$InputData[i];
        }
    }

    public ConfirmationOfPayeeScreenContract$InputData(ConfirmationResult result, BeneficiaryCreationType beneType) {
        Intrinsics.checkNotNullParameter(result, "result");
        Intrinsics.checkNotNullParameter(beneType, "beneType");
        this.f86044a = result;
        this.f86045b = beneType;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof ConfirmationOfPayeeScreenContract$InputData)) {
            return false;
        }
        ConfirmationOfPayeeScreenContract$InputData confirmationOfPayeeScreenContract$InputData = (ConfirmationOfPayeeScreenContract$InputData) obj2;
        return Intrinsics.f(this.f86044a, confirmationOfPayeeScreenContract$InputData.f86044a) && Intrinsics.f(this.f86045b, confirmationOfPayeeScreenContract$InputData.f86045b);
    }

    public final int hashCode() {
        return this.f86045b.hashCode() + (this.f86044a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f86044a, i);
        dest.writeParcelable(this.f86045b, i);
    }
}
