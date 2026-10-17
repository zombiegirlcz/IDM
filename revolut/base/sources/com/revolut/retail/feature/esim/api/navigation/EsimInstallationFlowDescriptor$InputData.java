package com.revolut.retail.feature.esim.api.navigation;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.common.IOData$Input;
import com.revolut.retail.feature.esim.api.model.EsimProfile;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/retail/feature/esim/api/navigation/EsimInstallationFlowDescriptor$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_retail_esim_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class EsimInstallationFlowDescriptor$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<EsimInstallationFlowDescriptor$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final EsimProfile f100552a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final EsimInstallationFlowDescriptor$Start f100553b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f100554c;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new EsimInstallationFlowDescriptor$InputData(EsimProfile.CREATOR.createFromParcel(parcel), EsimInstallationFlowDescriptor$Start.CREATOR.createFromParcel(parcel), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new EsimInstallationFlowDescriptor$InputData[i];
        }
    }

    public EsimInstallationFlowDescriptor$InputData(EsimProfile esimProfile, EsimInstallationFlowDescriptor$Start start, boolean z) {
        Intrinsics.checkNotNullParameter(esimProfile, "esimProfile");
        Intrinsics.checkNotNullParameter(start, "start");
        this.f100552a = esimProfile;
        this.f100553b = start;
        this.f100554c = z;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final EsimProfile getF100552a() {
        return this.f100552a;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final boolean getF100554c() {
        return this.f100554c;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final EsimInstallationFlowDescriptor$Start getF100553b() {
        return this.f100553b;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof EsimInstallationFlowDescriptor$InputData)) {
            return false;
        }
        EsimInstallationFlowDescriptor$InputData esimInstallationFlowDescriptor$InputData = (EsimInstallationFlowDescriptor$InputData) obj2;
        return Intrinsics.f(this.f100552a, esimInstallationFlowDescriptor$InputData.f100552a) && this.f100553b == esimInstallationFlowDescriptor$InputData.f100553b && this.f100554c == esimInstallationFlowDescriptor$InputData.f100554c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f100554c) + ((this.f100553b.hashCode() + (this.f100552a.hashCode() * 31)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        this.f100552a.writeToParcel(dest, i);
        this.f100553b.writeToParcel(dest, i);
        dest.writeInt(this.f100554c ? 1 : 0);
    }
}
