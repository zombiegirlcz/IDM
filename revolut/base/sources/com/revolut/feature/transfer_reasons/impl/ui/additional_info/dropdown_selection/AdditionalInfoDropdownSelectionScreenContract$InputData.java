package com.revolut.feature.transfer_reasons.impl.ui.additional_info.dropdown_selection;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.kompot.common.IOData$Input;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/transfer_reasons/impl/ui/additional_info/dropdown_selection/AdditionalInfoDropdownSelectionScreenContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_transfer_reasons_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class AdditionalInfoDropdownSelectionScreenContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<AdditionalInfoDropdownSelectionScreenContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Clause f92384a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f92385b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f92386c;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Clause clause = (Clause) j6.a.f(parcel, "parcel", AdditionalInfoDropdownSelectionScreenContract$InputData.class);
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            int iE = 0;
            while (iE != i) {
                iE = j6.a.e(AdditionalInfoDropdownSelectionScreenContract$InputData.class, parcel, arrayList, iE, 1);
            }
            return new AdditionalInfoDropdownSelectionScreenContract$InputData(clause, parcel.readString(), arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new AdditionalInfoDropdownSelectionScreenContract$InputData[i];
        }
    }

    public AdditionalInfoDropdownSelectionScreenContract$InputData(Clause title, String str, List options) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(options, "options");
        this.f92384a = title;
        this.f92385b = options;
        this.f92386c = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof AdditionalInfoDropdownSelectionScreenContract$InputData)) {
            return false;
        }
        AdditionalInfoDropdownSelectionScreenContract$InputData additionalInfoDropdownSelectionScreenContract$InputData = (AdditionalInfoDropdownSelectionScreenContract$InputData) obj2;
        return Intrinsics.f(this.f92384a, additionalInfoDropdownSelectionScreenContract$InputData.f92384a) && Intrinsics.f(this.f92385b, additionalInfoDropdownSelectionScreenContract$InputData.f92385b) && Intrinsics.f(this.f92386c, additionalInfoDropdownSelectionScreenContract$InputData.f92386c);
    }

    public final int hashCode() {
        int iD = p.a.d(this.f92384a.hashCode() * 31, 31, this.f92385b);
        String str = this.f92386c;
        return iD + (str == null ? 0 : str.hashCode());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f92384a, i);
        Iterator itV = p.a.v(this.f92385b, dest);
        while (itV.hasNext()) {
            dest.writeParcelable((Parcelable) itV.next(), i);
        }
        dest.writeString(this.f92386c);
    }
}
