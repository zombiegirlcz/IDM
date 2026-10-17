package com.revolut.feature.apm.wero.impl.ui.home;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import uh2.b;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/apm/wero/impl/ui/home/WeroHomeFlowContract$InputData", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_apm_wero_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class WeroHomeFlowContract$InputData implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<WeroHomeFlowContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f63063a;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new WeroHomeFlowContract$InputData(b.valueOf(parcel.readString()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new WeroHomeFlowContract$InputData[i];
        }
    }

    public WeroHomeFlowContract$InputData(b areaType) {
        Intrinsics.checkNotNullParameter(areaType, "areaType");
        this.f63063a = areaType;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof WeroHomeFlowContract$InputData) && this.f63063a == ((WeroHomeFlowContract$InputData) obj2).f63063a;
    }

    public final int hashCode() {
        return this.f63063a.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f63063a.name());
    }
}
