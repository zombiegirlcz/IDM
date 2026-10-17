package com.revolut.feature.incentive_reward.impl.ui.incentive_selection.flow;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.common.IOData$Input;
import com.revolut.retail.core.navigation.NaviCommand;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/incentive_reward/impl/ui/incentive_selection/flow/IncentiveSelectionFlowContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_retail_incentive_reward_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class IncentiveSelectionFlowContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<IncentiveSelectionFlowContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f74868a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map f74869b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final NaviCommand f74870c;
    public final boolean d;
    public final String e;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            boolean z = parcel.readInt() != 0;
            int i = parcel.readInt();
            LinkedHashMap linkedHashMap = new LinkedHashMap(i);
            int iD = 0;
            while (iD != i) {
                iD = j6.a.d(parcel, linkedHashMap, parcel.readString(), iD, 1);
            }
            return new IncentiveSelectionFlowContract$InputData(z, linkedHashMap, (NaviCommand) parcel.readParcelable(IncentiveSelectionFlowContract$InputData.class.getClassLoader()), parcel.readInt() != 0, parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new IncentiveSelectionFlowContract$InputData[i];
        }
    }

    public IncentiveSelectionFlowContract$InputData(boolean z, Map contextParams, NaviCommand naviCommand, boolean z3, String str) {
        Intrinsics.checkNotNullParameter(contextParams, "contextParams");
        this.f74868a = z;
        this.f74869b = contextParams;
        this.f74870c = naviCommand;
        this.d = z3;
        this.e = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof IncentiveSelectionFlowContract$InputData)) {
            return false;
        }
        IncentiveSelectionFlowContract$InputData incentiveSelectionFlowContract$InputData = (IncentiveSelectionFlowContract$InputData) obj2;
        return this.f74868a == incentiveSelectionFlowContract$InputData.f74868a && Intrinsics.f(this.f74869b, incentiveSelectionFlowContract$InputData.f74869b) && Intrinsics.f(this.f74870c, incentiveSelectionFlowContract$InputData.f74870c) && this.d == incentiveSelectionFlowContract$InputData.d && Intrinsics.f(this.e, incentiveSelectionFlowContract$InputData.e);
    }

    public final int hashCode() {
        int iE = p.a.e(Boolean.hashCode(this.f74868a) * 31, 31, this.f74869b);
        NaviCommand naviCommand = this.f74870c;
        int iC = j6.a.c((iE + (naviCommand == null ? 0 : naviCommand.hashCode())) * 31, 31, this.d);
        String str = this.e;
        return iC + (str != null ? str.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeInt(this.f74868a ? 1 : 0);
        Iterator itZ = j6.a.z(this.f74869b, dest);
        while (itZ.hasNext()) {
            Map.Entry entry = (Map.Entry) itZ.next();
            dest.writeString((String) entry.getKey());
            dest.writeString((String) entry.getValue());
        }
        dest.writeParcelable(this.f74870c, i);
        dest.writeInt(this.d ? 1 : 0);
        dest.writeString(this.e);
    }
}
