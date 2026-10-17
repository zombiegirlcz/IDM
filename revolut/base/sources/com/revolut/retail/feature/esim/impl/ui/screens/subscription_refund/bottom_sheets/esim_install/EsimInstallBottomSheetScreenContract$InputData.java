package com.revolut.retail.feature.esim.impl.ui.screens.subscription_refund.bottom_sheets.esim_install;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.common.IOData$Input;
import com.revolut.retail.feature.esim.api.model.EsimProfile;
import hnj.d;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"com/revolut/retail/feature/esim/impl/ui/screens/subscription_refund/bottom_sheets/esim_install/EsimInstallBottomSheetScreenContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "hnj/d", "feature_retail_esim_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class EsimInstallBottomSheetScreenContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<EsimInstallBottomSheetScreenContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f101439a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final EsimProfile f101440b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f101441c;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new EsimInstallBottomSheetScreenContract$InputData(d.valueOf(parcel.readString()), (EsimProfile) parcel.readParcelable(EsimInstallBottomSheetScreenContract$InputData.class.getClassLoader()), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new EsimInstallBottomSheetScreenContract$InputData[i];
        }
    }

    public EsimInstallBottomSheetScreenContract$InputData(d ctaConfig, EsimProfile esimProfile, boolean z) {
        Intrinsics.checkNotNullParameter(ctaConfig, "ctaConfig");
        Intrinsics.checkNotNullParameter(esimProfile, "esimProfile");
        this.f101439a = ctaConfig;
        this.f101440b = esimProfile;
        this.f101441c = z;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof EsimInstallBottomSheetScreenContract$InputData)) {
            return false;
        }
        EsimInstallBottomSheetScreenContract$InputData esimInstallBottomSheetScreenContract$InputData = (EsimInstallBottomSheetScreenContract$InputData) obj2;
        return this.f101439a == esimInstallBottomSheetScreenContract$InputData.f101439a && Intrinsics.f(this.f101440b, esimInstallBottomSheetScreenContract$InputData.f101440b) && this.f101441c == esimInstallBottomSheetScreenContract$InputData.f101441c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f101441c) + ((this.f101440b.hashCode() + (this.f101439a.hashCode() * 31)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f101439a.name());
        dest.writeParcelable(this.f101440b, i);
        dest.writeInt(this.f101441c ? 1 : 0);
    }
}
