package com.revolut.retail.feature.esim.impl.ui.flows.installation;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.common.IOData$Input;
import com.revolut.retail.feature.esim.api.model.EsimProfile;
import com.revolut.retail.feature.esim.api.navigation.EsimInstallationFlowDescriptor$Start;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/retail/feature/esim/impl/ui/flows/installation/EsimInstallationFlowContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_retail_esim_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class EsimInstallationFlowContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<EsimInstallationFlowContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final EsimProfile f100688a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final EsimInstallationFlowDescriptor$Start f100689b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f100690c;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new EsimInstallationFlowContract$InputData((EsimProfile) parcel.readParcelable(EsimInstallationFlowContract$InputData.class.getClassLoader()), (EsimInstallationFlowDescriptor$Start) parcel.readParcelable(EsimInstallationFlowContract$InputData.class.getClassLoader()), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new EsimInstallationFlowContract$InputData[i];
        }
    }

    public EsimInstallationFlowContract$InputData(EsimProfile esimProfile, EsimInstallationFlowDescriptor$Start start, boolean z) {
        Intrinsics.checkNotNullParameter(esimProfile, "esimProfile");
        Intrinsics.checkNotNullParameter(start, "start");
        this.f100688a = esimProfile;
        this.f100689b = start;
        this.f100690c = z;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof EsimInstallationFlowContract$InputData)) {
            return false;
        }
        EsimInstallationFlowContract$InputData esimInstallationFlowContract$InputData = (EsimInstallationFlowContract$InputData) obj2;
        return Intrinsics.f(this.f100688a, esimInstallationFlowContract$InputData.f100688a) && this.f100689b == esimInstallationFlowContract$InputData.f100689b && this.f100690c == esimInstallationFlowContract$InputData.f100690c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f100690c) + ((this.f100689b.hashCode() + (this.f100688a.hashCode() * 31)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f100688a, i);
        dest.writeParcelable(this.f100689b, i);
        dest.writeInt(this.f100690c ? 1 : 0);
    }
}
