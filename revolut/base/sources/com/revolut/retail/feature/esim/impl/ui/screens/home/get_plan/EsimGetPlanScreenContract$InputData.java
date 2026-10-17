package com.revolut.retail.feature.esim.impl.ui.screens.home.get_plan;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.common.IOData$Input;
import com.revolut.retail.feature.esim.api.model.EsimGetPlanLaunchMode;
import com.revolut.retail.feature.esim.api.model.EsimGiftRecipient;
import dej.m;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/retail/feature/esim/impl/ui/screens/home/get_plan/EsimGetPlanScreenContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_retail_esim_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class EsimGetPlanScreenContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<EsimGetPlanScreenContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f100993a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final m f100994b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final EsimGetPlanLaunchMode f100995c;
    public final EsimGiftRecipient d;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new EsimGetPlanScreenContract$InputData(parcel.readString(), parcel.readInt() == 0 ? null : m.valueOf(parcel.readString()), (EsimGetPlanLaunchMode) parcel.readParcelable(EsimGetPlanScreenContract$InputData.class.getClassLoader()), (EsimGiftRecipient) parcel.readParcelable(EsimGetPlanScreenContract$InputData.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new EsimGetPlanScreenContract$InputData[i];
        }
    }

    public EsimGetPlanScreenContract$InputData(String str, m mVar, EsimGetPlanLaunchMode esimGetPlanLaunchMode, EsimGiftRecipient esimGiftRecipient) {
        this.f100993a = str;
        this.f100994b = mVar;
        this.f100995c = esimGetPlanLaunchMode;
        this.d = esimGiftRecipient;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof EsimGetPlanScreenContract$InputData)) {
            return false;
        }
        EsimGetPlanScreenContract$InputData esimGetPlanScreenContract$InputData = (EsimGetPlanScreenContract$InputData) obj2;
        return Intrinsics.f(this.f100993a, esimGetPlanScreenContract$InputData.f100993a) && this.f100994b == esimGetPlanScreenContract$InputData.f100994b && Intrinsics.f(this.f100995c, esimGetPlanScreenContract$InputData.f100995c) && Intrinsics.f(this.d, esimGetPlanScreenContract$InputData.d);
    }

    public final int hashCode() {
        String str = this.f100993a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        m mVar = this.f100994b;
        int iHashCode2 = (iHashCode + (mVar == null ? 0 : mVar.hashCode())) * 31;
        EsimGetPlanLaunchMode esimGetPlanLaunchMode = this.f100995c;
        int iHashCode3 = (iHashCode2 + (esimGetPlanLaunchMode == null ? 0 : esimGetPlanLaunchMode.hashCode())) * 31;
        EsimGiftRecipient esimGiftRecipient = this.d;
        return iHashCode3 + (esimGiftRecipient != null ? esimGiftRecipient.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f100993a);
        m mVar = this.f100994b;
        if (mVar == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(mVar.name());
        }
        dest.writeParcelable(this.f100995c, i);
        dest.writeParcelable(this.d, i);
    }

    public EsimGetPlanScreenContract$InputData() {
        this(null, null, null, null);
    }
}
