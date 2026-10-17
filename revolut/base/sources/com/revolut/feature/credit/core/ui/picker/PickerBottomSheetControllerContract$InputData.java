package com.revolut.feature.credit.core.ui.picker;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.kompot.common.IOData$Input;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/credit/core/ui/picker/PickerBottomSheetControllerContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_credit_core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class PickerBottomSheetControllerContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<PickerBottomSheetControllerContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Clause f69840a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Clause f69841b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f69842c;
    public final int d;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Clause clause = (Clause) j6.a.f(parcel, "parcel", PickerBottomSheetControllerContract$InputData.class);
            Clause clause2 = (Clause) parcel.readParcelable(PickerBottomSheetControllerContract$InputData.class.getClassLoader());
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            int iC = 0;
            while (iC != i) {
                iC = ch.qos.logback.core.util.a.c(parcel, arrayList, iC, 1);
            }
            return new PickerBottomSheetControllerContract$InputData(clause, clause2, arrayList, parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new PickerBottomSheetControllerContract$InputData[i];
        }
    }

    public PickerBottomSheetControllerContract$InputData(Clause title, Clause buttonTitle, ArrayList values, int i) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(buttonTitle, "buttonTitle");
        Intrinsics.checkNotNullParameter(values, "values");
        this.f69840a = title;
        this.f69841b = buttonTitle;
        this.f69842c = values;
        this.d = i;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof PickerBottomSheetControllerContract$InputData)) {
            return false;
        }
        PickerBottomSheetControllerContract$InputData pickerBottomSheetControllerContract$InputData = (PickerBottomSheetControllerContract$InputData) obj2;
        return Intrinsics.f(this.f69840a, pickerBottomSheetControllerContract$InputData.f69840a) && Intrinsics.f(this.f69841b, pickerBottomSheetControllerContract$InputData.f69841b) && this.f69842c.equals(pickerBottomSheetControllerContract$InputData.f69842c) && this.d == pickerBottomSheetControllerContract$InputData.d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.d) + com.google.android.gms.internal.mlkit_vision_face.a.b(this.f69842c, p.a.a(this.f69840a.hashCode() * 31, 31, this.f69841b), 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f69840a, i);
        dest.writeParcelable(this.f69841b, i);
        Iterator itY = j6.a.y(this.f69842c, dest);
        while (itY.hasNext()) {
            dest.writeSerializable((Serializable) itY.next());
        }
        dest.writeInt(this.d);
    }
}
