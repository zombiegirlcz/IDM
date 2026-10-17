package com.revolut.feature.shared_separate_favourites.alerts.ui.screen.create_alert.select_type;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.common.IOData$Input;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import mgd.f;
import org.jetbrains.annotations.NotNull;
import xi0.b;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/shared_separate_favourites/alerts/ui/screen/create_alert/select_type/SelectAlertTypeControllerContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_shared_separate_favourites_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class SelectAlertTypeControllerContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<SelectAlertTypeControllerContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f86753a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f f86754b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new SelectAlertTypeControllerContract$InputData(f.valueOf(parcel.readString()), (b) parcel.readSerializable());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new SelectAlertTypeControllerContract$InputData[i];
        }
    }

    public SelectAlertTypeControllerContract$InputData(f selected, b currency) {
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(selected, "selected");
        this.f86753a = currency;
        this.f86754b = selected;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof SelectAlertTypeControllerContract$InputData)) {
            return false;
        }
        SelectAlertTypeControllerContract$InputData selectAlertTypeControllerContract$InputData = (SelectAlertTypeControllerContract$InputData) obj2;
        return Intrinsics.f(this.f86753a, selectAlertTypeControllerContract$InputData.f86753a) && this.f86754b == selectAlertTypeControllerContract$InputData.f86754b;
    }

    public final int hashCode() {
        return this.f86754b.hashCode() + (this.f86753a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeSerializable(this.f86753a);
        dest.writeString(this.f86754b.name());
    }
}
