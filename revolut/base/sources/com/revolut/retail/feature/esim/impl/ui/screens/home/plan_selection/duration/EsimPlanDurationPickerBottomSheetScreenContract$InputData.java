package com.revolut.retail.feature.esim.impl.ui.screens.home.plan_selection.duration;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.common.IOData$Input;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/retail/feature/esim/impl/ui/screens/home/plan_selection/duration/EsimPlanDurationPickerBottomSheetScreenContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_retail_esim_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class EsimPlanDurationPickerBottomSheetScreenContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<EsimPlanDurationPickerBottomSheetScreenContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f101019a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f101020b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            int iE = 0;
            while (iE != i) {
                iE = j6.a.e(EsimPlanDurationPickerBottomSheetScreenContract$InputData.class, parcel, arrayList, iE, 1);
            }
            return new EsimPlanDurationPickerBottomSheetScreenContract$InputData(parcel.readString(), arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new EsimPlanDurationPickerBottomSheetScreenContract$InputData[i];
        }
    }

    public EsimPlanDurationPickerBottomSheetScreenContract$InputData(String str, ArrayList plans) {
        Intrinsics.checkNotNullParameter(plans, "plans");
        this.f101019a = plans;
        this.f101020b = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof EsimPlanDurationPickerBottomSheetScreenContract$InputData)) {
            return false;
        }
        EsimPlanDurationPickerBottomSheetScreenContract$InputData esimPlanDurationPickerBottomSheetScreenContract$InputData = (EsimPlanDurationPickerBottomSheetScreenContract$InputData) obj2;
        return this.f101019a.equals(esimPlanDurationPickerBottomSheetScreenContract$InputData.f101019a) && Intrinsics.f(this.f101020b, esimPlanDurationPickerBottomSheetScreenContract$InputData.f101020b);
    }

    public final int hashCode() {
        int iHashCode = this.f101019a.hashCode() * 31;
        String str = this.f101020b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        Iterator itY = j6.a.y(this.f101019a, dest);
        while (itY.hasNext()) {
            dest.writeParcelable((Parcelable) itY.next(), i);
        }
        dest.writeString(this.f101020b);
    }
}
