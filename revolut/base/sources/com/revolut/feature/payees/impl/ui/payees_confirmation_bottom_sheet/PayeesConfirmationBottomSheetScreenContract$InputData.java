package com.revolut.feature.payees.impl.ui.payees_confirmation_bottom_sheet;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.data.database.models.openbanking.d;
import com.revolut.feature.payees.impl.ui.PayeesFlowType;
import com.revolut.kompot.common.IOData$Input;
import ehe.n;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/payees/impl/ui/payees_confirmation_bottom_sheet/PayeesConfirmationBottomSheetScreenContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_payees_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class PayeesConfirmationBottomSheetScreenContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<PayeesConfirmationBottomSheetScreenContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PayeesFlowType f79002a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Set f79003b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            PayeesFlowType payeesFlowType = (PayeesFlowType) j6.a.f(parcel, "parcel", PayeesConfirmationBottomSheetScreenContract$InputData.class);
            int i = parcel.readInt();
            LinkedHashSet linkedHashSet = new LinkedHashSet(i);
            int iE = 0;
            while (iE != i) {
                iE = d.e(PayeesConfirmationBottomSheetScreenContract$InputData.class, parcel, linkedHashSet, iE, 1);
            }
            return new PayeesConfirmationBottomSheetScreenContract$InputData(payeesFlowType, linkedHashSet);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new PayeesConfirmationBottomSheetScreenContract$InputData[i];
        }
    }

    public PayeesConfirmationBottomSheetScreenContract$InputData(PayeesFlowType flowType, Set recipients) {
        Intrinsics.checkNotNullParameter(flowType, "flowType");
        Intrinsics.checkNotNullParameter(recipients, "recipients");
        this.f79002a = flowType;
        this.f79003b = recipients;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof PayeesConfirmationBottomSheetScreenContract$InputData)) {
            return false;
        }
        PayeesConfirmationBottomSheetScreenContract$InputData payeesConfirmationBottomSheetScreenContract$InputData = (PayeesConfirmationBottomSheetScreenContract$InputData) obj2;
        return Intrinsics.f(this.f79002a, payeesConfirmationBottomSheetScreenContract$InputData.f79002a) && Intrinsics.f(this.f79003b, payeesConfirmationBottomSheetScreenContract$InputData.f79003b);
    }

    public final int hashCode() {
        return this.f79003b.hashCode() + (this.f79002a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f79002a, i);
        Iterator itV = n.v(this.f79003b, dest);
        while (itV.hasNext()) {
            dest.writeParcelable((Parcelable) itV.next(), i);
        }
    }
}
