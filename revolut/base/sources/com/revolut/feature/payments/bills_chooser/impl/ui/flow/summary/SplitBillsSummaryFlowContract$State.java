package com.revolut.feature.payments.bills_chooser.impl.ui.flow.summary;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.payments.bills_chooser.api.common.SplitMethod;
import com.revolut.feature.payments.bills_chooser.api.splits.SplitMembersType;
import com.revolut.kompot.navigable.flow.FlowState;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/payments/bills_chooser/impl/ui/flow/summary/SplitBillsSummaryFlowContract$State", "Lcom/revolut/kompot/navigable/flow/FlowState;", "", "toString", "()Ljava/lang/String;", "feature_payments_bills_chooser_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class SplitBillsSummaryFlowContract$State implements FlowState {

    @NotNull
    public static final Parcelable.Creator<SplitBillsSummaryFlowContract$State> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SplitMembersType f79260a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f79261b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final SplitMethod f79262c;
    public final List d;
    public final Map e;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            SplitMembersType splitMembersType = (SplitMembersType) j6.a.f(parcel, "parcel", SplitBillsSummaryFlowContract$State.class);
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            int iE = 0;
            while (iE != i) {
                iE = j6.a.e(SplitBillsSummaryFlowContract$State.class, parcel, arrayList, iE, 1);
            }
            SplitMethod splitMethod = (SplitMethod) parcel.readParcelable(SplitBillsSummaryFlowContract$State.class.getClassLoader());
            int i2 = parcel.readInt();
            ArrayList arrayList2 = new ArrayList(i2);
            int iE2 = 0;
            while (iE2 != i2) {
                iE2 = j6.a.e(SplitBillsSummaryFlowContract$State.class, parcel, arrayList2, iE2, 1);
            }
            int i3 = parcel.readInt();
            LinkedHashMap linkedHashMap = new LinkedHashMap(i3);
            for (int i5 = 0; i5 != i3; i5++) {
                linkedHashMap.put(parcel.readParcelable(SplitBillsSummaryFlowContract$State.class.getClassLoader()), parcel.readParcelable(SplitBillsSummaryFlowContract$State.class.getClassLoader()));
            }
            return new SplitBillsSummaryFlowContract$State(splitMembersType, arrayList, splitMethod, arrayList2, linkedHashMap);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new SplitBillsSummaryFlowContract$State[i];
        }
    }

    public SplitBillsSummaryFlowContract$State(SplitMembersType splitMembersType, List bills, SplitMethod method, List doneBills, Map splits) {
        Intrinsics.checkNotNullParameter(splitMembersType, "splitMembersType");
        Intrinsics.checkNotNullParameter(bills, "bills");
        Intrinsics.checkNotNullParameter(method, "method");
        Intrinsics.checkNotNullParameter(doneBills, "doneBills");
        Intrinsics.checkNotNullParameter(splits, "splits");
        this.f79260a = splitMembersType;
        this.f79261b = bills;
        this.f79262c = method;
        this.d = doneBills;
        this.e = splits;
    }

    public static SplitBillsSummaryFlowContract$State a(SplitBillsSummaryFlowContract$State splitBillsSummaryFlowContract$State, SplitMembersType splitMembersType, ArrayList arrayList, Map splits, int i) {
        if ((i & 1) != 0) {
            splitMembersType = splitBillsSummaryFlowContract$State.f79260a;
        }
        SplitMembersType splitMembersType2 = splitMembersType;
        List bills = splitBillsSummaryFlowContract$State.f79261b;
        SplitMethod method = splitBillsSummaryFlowContract$State.f79262c;
        List list = arrayList;
        if ((i & 8) != 0) {
            list = splitBillsSummaryFlowContract$State.d;
        }
        List doneBills = list;
        splitBillsSummaryFlowContract$State.getClass();
        Intrinsics.checkNotNullParameter(splitMembersType2, "splitMembersType");
        Intrinsics.checkNotNullParameter(bills, "bills");
        Intrinsics.checkNotNullParameter(method, "method");
        Intrinsics.checkNotNullParameter(doneBills, "doneBills");
        Intrinsics.checkNotNullParameter(splits, "splits");
        return new SplitBillsSummaryFlowContract$State(splitMembersType2, bills, method, doneBills, splits);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof SplitBillsSummaryFlowContract$State)) {
            return false;
        }
        SplitBillsSummaryFlowContract$State splitBillsSummaryFlowContract$State = (SplitBillsSummaryFlowContract$State) obj2;
        return Intrinsics.f(this.f79260a, splitBillsSummaryFlowContract$State.f79260a) && Intrinsics.f(this.f79261b, splitBillsSummaryFlowContract$State.f79261b) && Intrinsics.f(this.f79262c, splitBillsSummaryFlowContract$State.f79262c) && Intrinsics.f(this.d, splitBillsSummaryFlowContract$State.d) && Intrinsics.f(this.e, splitBillsSummaryFlowContract$State.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + p.a.d((this.f79262c.hashCode() + p.a.d(this.f79260a.hashCode() * 31, 31, this.f79261b)) * 31, 31, this.d);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f79260a, i);
        Iterator itV = p.a.v(this.f79261b, dest);
        while (itV.hasNext()) {
            dest.writeParcelable((Parcelable) itV.next(), i);
        }
        dest.writeParcelable(this.f79262c, i);
        Iterator itV2 = p.a.v(this.d, dest);
        while (itV2.hasNext()) {
            dest.writeParcelable((Parcelable) itV2.next(), i);
        }
        Iterator itZ = j6.a.z(this.e, dest);
        while (itZ.hasNext()) {
            Map.Entry entry = (Map.Entry) itZ.next();
            dest.writeParcelable((Parcelable) entry.getKey(), i);
            dest.writeParcelable((Parcelable) entry.getValue(), i);
        }
    }
}
