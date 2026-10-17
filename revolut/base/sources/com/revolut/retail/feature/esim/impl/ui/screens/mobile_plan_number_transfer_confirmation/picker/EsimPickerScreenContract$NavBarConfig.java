package com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_number_transfer_confirmation.picker;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.core.ui_kit.models.Clause;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/retail/feature/esim/impl/ui/screens/mobile_plan_number_transfer_confirmation/picker/EsimPickerScreenContract$NavBarConfig", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_retail_esim_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class EsimPickerScreenContract$NavBarConfig implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<EsimPickerScreenContract$NavBarConfig> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Clause f101328a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Clause f101329b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new EsimPickerScreenContract$NavBarConfig((Clause) parcel.readParcelable(EsimPickerScreenContract$NavBarConfig.class.getClassLoader()), (Clause) parcel.readParcelable(EsimPickerScreenContract$NavBarConfig.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new EsimPickerScreenContract$NavBarConfig[i];
        }
    }

    public EsimPickerScreenContract$NavBarConfig(Clause title, Clause searchHint) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(searchHint, "searchHint");
        this.f101328a = title;
        this.f101329b = searchHint;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof EsimPickerScreenContract$NavBarConfig)) {
            return false;
        }
        EsimPickerScreenContract$NavBarConfig esimPickerScreenContract$NavBarConfig = (EsimPickerScreenContract$NavBarConfig) obj2;
        return Intrinsics.f(this.f101328a, esimPickerScreenContract$NavBarConfig.f101328a) && Intrinsics.f(this.f101329b, esimPickerScreenContract$NavBarConfig.f101329b);
    }

    public final int hashCode() {
        return this.f101329b.hashCode() + (this.f101328a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f101328a, i);
        dest.writeParcelable(this.f101329b, i);
    }
}
