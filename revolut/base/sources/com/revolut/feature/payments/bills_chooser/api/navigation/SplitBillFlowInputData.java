package com.revolut.feature.payments.bills_chooser.api.navigation;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.payments.bills_chooser.api.common.SplitMethod;
import com.revolut.feature.payments.bills_chooser.api.splits.SplitMembersType;
import com.revolut.kompot.common.IOData$Input;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/payments/bills_chooser/api/navigation/SplitBillFlowInputData;", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_payments_bills_chooser_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class SplitBillFlowInputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<SplitBillFlowInputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SplitMembersType f79194a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f79195b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final SplitMethod f79196c;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            SplitMembersType splitMembersType = (SplitMembersType) j6.a.f(parcel, "parcel", SplitBillFlowInputData.class);
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            int iE = 0;
            while (iE != i) {
                iE = j6.a.e(SplitBillFlowInputData.class, parcel, arrayList, iE, 1);
            }
            return new SplitBillFlowInputData(splitMembersType, arrayList, (SplitMethod) parcel.readParcelable(SplitBillFlowInputData.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new SplitBillFlowInputData[i];
        }
    }

    public SplitBillFlowInputData(SplitMembersType splitMembersType, List bills, SplitMethod method) {
        Intrinsics.checkNotNullParameter(splitMembersType, "splitMembersType");
        Intrinsics.checkNotNullParameter(bills, "bills");
        Intrinsics.checkNotNullParameter(method, "method");
        this.f79194a = splitMembersType;
        this.f79195b = bills;
        this.f79196c = method;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof SplitBillFlowInputData)) {
            return false;
        }
        SplitBillFlowInputData splitBillFlowInputData = (SplitBillFlowInputData) obj2;
        return Intrinsics.f(this.f79194a, splitBillFlowInputData.f79194a) && Intrinsics.f(this.f79195b, splitBillFlowInputData.f79195b) && Intrinsics.f(this.f79196c, splitBillFlowInputData.f79196c);
    }

    public final int hashCode() {
        return this.f79196c.hashCode() + p.a.d(this.f79194a.hashCode() * 31, 31, this.f79195b);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f79194a, i);
        Iterator itV = p.a.v(this.f79195b, dest);
        while (itV.hasNext()) {
            dest.writeParcelable((Parcelable) itV.next(), i);
        }
        dest.writeParcelable(this.f79196c, i);
    }
}
