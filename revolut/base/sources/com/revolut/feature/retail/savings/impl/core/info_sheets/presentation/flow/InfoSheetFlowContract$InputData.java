package com.revolut.feature.retail.savings.impl.core.info_sheets.presentation.flow;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.shared.savings.models.info_sheets.InfoSheetParams;
import com.revolut.kompot.common.IOData$Input;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/retail/savings/impl/core/info_sheets/presentation/flow/InfoSheetFlowContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_retail_savings_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class InfoSheetFlowContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<InfoSheetFlowContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InfoSheetParams f83212a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f83213b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new InfoSheetFlowContract$InputData((InfoSheetParams) parcel.readParcelable(InfoSheetFlowContract$InputData.class.getClassLoader()), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new InfoSheetFlowContract$InputData[i];
        }
    }

    public InfoSheetFlowContract$InputData(InfoSheetParams params, boolean z) {
        Intrinsics.checkNotNullParameter(params, "params");
        this.f83212a = params;
        this.f83213b = z;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof InfoSheetFlowContract$InputData)) {
            return false;
        }
        InfoSheetFlowContract$InputData infoSheetFlowContract$InputData = (InfoSheetFlowContract$InputData) obj2;
        return Intrinsics.f(this.f83212a, infoSheetFlowContract$InputData.f83212a) && this.f83213b == infoSheetFlowContract$InputData.f83213b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f83213b) + (this.f83212a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f83212a, i);
        dest.writeInt(this.f83213b ? 1 : 0);
    }
}
