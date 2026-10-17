package com.revolut.retail.feature.esim.impl.ui.screens.info;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.common.IOData$Input;
import com.revolut.kompot.navigable.vc.ui.States$PersistentDomain;
import com.revolut.retail.feature.esim.api.model.EsimIcon;
import com.revolut.retail.feature.esim.api.model.EsimInfoBottomSheetData;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002J\u0010\u0010\u0004\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"com/revolut/retail/feature/esim/impl/ui/screens/info/EsimInfoBottomSheetScreenContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "Lcom/revolut/kompot/navigable/vc/ui/States$PersistentDomain;", "", "toString", "()Ljava/lang/String;", "feature_retail_esim_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class EsimInfoBottomSheetScreenContract$InputData implements IOData$Input, States$PersistentDomain {

    @NotNull
    public static final Parcelable.Creator<EsimInfoBottomSheetScreenContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final EsimIcon f101090a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final EsimInfoBottomSheetData f101091b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new EsimInfoBottomSheetScreenContract$InputData((EsimIcon) parcel.readParcelable(EsimInfoBottomSheetScreenContract$InputData.class.getClassLoader()), (EsimInfoBottomSheetData) parcel.readParcelable(EsimInfoBottomSheetScreenContract$InputData.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new EsimInfoBottomSheetScreenContract$InputData[i];
        }
    }

    public EsimInfoBottomSheetScreenContract$InputData(EsimIcon esimIcon, EsimInfoBottomSheetData details) {
        Intrinsics.checkNotNullParameter(details, "details");
        this.f101090a = esimIcon;
        this.f101091b = details;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof EsimInfoBottomSheetScreenContract$InputData)) {
            return false;
        }
        EsimInfoBottomSheetScreenContract$InputData esimInfoBottomSheetScreenContract$InputData = (EsimInfoBottomSheetScreenContract$InputData) obj2;
        return Intrinsics.f(this.f101090a, esimInfoBottomSheetScreenContract$InputData.f101090a) && Intrinsics.f(this.f101091b, esimInfoBottomSheetScreenContract$InputData.f101091b);
    }

    public final int hashCode() {
        EsimIcon esimIcon = this.f101090a;
        return this.f101091b.hashCode() + ((esimIcon == null ? 0 : esimIcon.hashCode()) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f101090a, i);
        dest.writeParcelable(this.f101091b, i);
    }
}
