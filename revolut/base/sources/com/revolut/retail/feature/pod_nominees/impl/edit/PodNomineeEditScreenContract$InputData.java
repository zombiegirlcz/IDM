package com.revolut.retail.feature.pod_nominees.impl.edit;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.common.IOData$Input;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/retail/feature/pod_nominees/impl/edit/PodNomineeEditScreenContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_pod_nominees_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class PodNomineeEditScreenContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<PodNomineeEditScreenContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PodNomineeEditScreenContract$LaunchType f102589a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f102590b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f102591c;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new PodNomineeEditScreenContract$InputData((PodNomineeEditScreenContract$LaunchType) parcel.readParcelable(PodNomineeEditScreenContract$InputData.class.getClassLoader()), parcel.readInt() != 0, parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new PodNomineeEditScreenContract$InputData[i];
        }
    }

    public PodNomineeEditScreenContract$InputData(PodNomineeEditScreenContract$LaunchType launchType, boolean z, boolean z3) {
        Intrinsics.checkNotNullParameter(launchType, "launchType");
        this.f102589a = launchType;
        this.f102590b = z;
        this.f102591c = z3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof PodNomineeEditScreenContract$InputData)) {
            return false;
        }
        PodNomineeEditScreenContract$InputData podNomineeEditScreenContract$InputData = (PodNomineeEditScreenContract$InputData) obj2;
        return Intrinsics.f(this.f102589a, podNomineeEditScreenContract$InputData.f102589a) && this.f102590b == podNomineeEditScreenContract$InputData.f102590b && this.f102591c == podNomineeEditScreenContract$InputData.f102591c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f102591c) + j6.a.c(this.f102589a.hashCode() * 31, 31, this.f102590b);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f102589a, i);
        dest.writeInt(this.f102590b ? 1 : 0);
        dest.writeInt(this.f102591c ? 1 : 0);
    }
}
