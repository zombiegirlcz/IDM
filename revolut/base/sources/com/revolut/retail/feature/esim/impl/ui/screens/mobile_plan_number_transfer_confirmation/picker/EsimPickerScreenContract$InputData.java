package com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_number_transfer_confirmation.picker;

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

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/retail/feature/esim/impl/ui/screens/mobile_plan_number_transfer_confirmation/picker/EsimPickerScreenContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_retail_esim_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class EsimPickerScreenContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<EsimPickerScreenContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f101325a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final EsimPickerScreenContract$NavBarConfig f101326b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Clause f101327c;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            int iE = 0;
            while (iE != i) {
                iE = j6.a.e(EsimPickerScreenContract$InputData.class, parcel, arrayList, iE, 1);
            }
            return new EsimPickerScreenContract$InputData(arrayList, EsimPickerScreenContract$NavBarConfig.CREATOR.createFromParcel(parcel), (Clause) parcel.readParcelable(EsimPickerScreenContract$InputData.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new EsimPickerScreenContract$InputData[i];
        }
    }

    public EsimPickerScreenContract$InputData(List items, EsimPickerScreenContract$NavBarConfig navBarConfig, Clause noSearchResultsCaption) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(navBarConfig, "navBarConfig");
        Intrinsics.checkNotNullParameter(noSearchResultsCaption, "noSearchResultsCaption");
        this.f101325a = items;
        this.f101326b = navBarConfig;
        this.f101327c = noSearchResultsCaption;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof EsimPickerScreenContract$InputData)) {
            return false;
        }
        EsimPickerScreenContract$InputData esimPickerScreenContract$InputData = (EsimPickerScreenContract$InputData) obj2;
        return Intrinsics.f(this.f101325a, esimPickerScreenContract$InputData.f101325a) && Intrinsics.f(this.f101326b, esimPickerScreenContract$InputData.f101326b) && Intrinsics.f(this.f101327c, esimPickerScreenContract$InputData.f101327c);
    }

    public final int hashCode() {
        return this.f101327c.hashCode() + ((this.f101326b.hashCode() + (this.f101325a.hashCode() * 31)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        Iterator itV = p.a.v(this.f101325a, dest);
        while (itV.hasNext()) {
            dest.writeParcelable((Parcelable) itV.next(), i);
        }
        this.f101326b.writeToParcel(dest, i);
        dest.writeParcelable(this.f101327c, i);
    }
}
