package com.revolut.feature.insurance_car.impl.ui.screen.policy.cancellation.refund;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.insurance_car.impl.data.model.QuestionnaireAnswer;
import com.revolut.kompot.common.IOData$Input;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/insurance_car/impl/ui/screen/policy/cancellation/refund/CancellationRefundScreenContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_insurance_car_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CancellationRefundScreenContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<CancellationRefundScreenContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f75645a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f75646b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String string = parcel.readString();
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            int iA = 0;
            while (iA != i) {
                iA = org.bouncycastle.jcajce.provider.digest.a.a(QuestionnaireAnswer.CREATOR, parcel, arrayList, iA, 1);
            }
            return new CancellationRefundScreenContract$InputData(string, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CancellationRefundScreenContract$InputData[i];
        }
    }

    public CancellationRefundScreenContract$InputData(String policyId, ArrayList answers) {
        Intrinsics.checkNotNullParameter(policyId, "policyId");
        Intrinsics.checkNotNullParameter(answers, "answers");
        this.f75645a = policyId;
        this.f75646b = answers;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof CancellationRefundScreenContract$InputData)) {
            return false;
        }
        CancellationRefundScreenContract$InputData cancellationRefundScreenContract$InputData = (CancellationRefundScreenContract$InputData) obj2;
        return Intrinsics.f(this.f75645a, cancellationRefundScreenContract$InputData.f75645a) && this.f75646b.equals(cancellationRefundScreenContract$InputData.f75646b);
    }

    public final int hashCode() {
        return this.f75646b.hashCode() + (this.f75645a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f75645a);
        Iterator itY = j6.a.y(this.f75646b, dest);
        while (itY.hasNext()) {
            ((QuestionnaireAnswer) itY.next()).writeToParcel(dest, i);
        }
    }
}
