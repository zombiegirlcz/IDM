package com.revolut.retail.feature.pricing_plans.waitlist.impl.ui.flow;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.common.IOData$Input;
import gok.b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/retail/feature/pricing_plans/waitlist/impl/ui/flow/WaitlistControllerFlowContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_retail_pricing_plans_waitlist_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class WaitlistControllerFlowContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<WaitlistControllerFlowContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f103684a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f103685b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f103686c;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String string = parcel.readString();
            String string2 = parcel.readString();
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i);
                for (int i2 = 0; i2 != i; i2++) {
                    arrayList2.add(b.valueOf(parcel.readString()));
                }
                arrayList = arrayList2;
            }
            return new WaitlistControllerFlowContract$InputData(string, string2, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new WaitlistControllerFlowContract$InputData[i];
        }
    }

    public WaitlistControllerFlowContract$InputData(String str, String str2, List list) {
        this.f103684a = str;
        this.f103685b = str2;
        this.f103686c = list;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof WaitlistControllerFlowContract$InputData)) {
            return false;
        }
        WaitlistControllerFlowContract$InputData waitlistControllerFlowContract$InputData = (WaitlistControllerFlowContract$InputData) obj2;
        return Intrinsics.f(this.f103684a, waitlistControllerFlowContract$InputData.f103684a) && Intrinsics.f(this.f103685b, waitlistControllerFlowContract$InputData.f103685b) && Intrinsics.f(this.f103686c, waitlistControllerFlowContract$InputData.f103686c);
    }

    public final int hashCode() {
        String str = this.f103684a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f103685b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        List list = this.f103686c;
        return iHashCode2 + (list != null ? list.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f103684a);
        dest.writeString(this.f103685b);
        List list = this.f103686c;
        if (list == null) {
            dest.writeInt(0);
            return;
        }
        Iterator itQ = v0.a.q(dest, 1, list);
        while (itQ.hasNext()) {
            dest.writeString(((b) itQ.next()).name());
        }
    }
}
