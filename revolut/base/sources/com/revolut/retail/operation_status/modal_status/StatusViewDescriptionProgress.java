package com.revolut.retail.operation_status.modal_status;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/operation_status/modal_status/StatusViewDescriptionProgress;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "retail_operation_status_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class StatusViewDescriptionProgress implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<StatusViewDescriptionProgress> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f104391a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f104392b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new StatusViewDescriptionProgress(parcel.readInt(), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new StatusViewDescriptionProgress[i];
        }
    }

    public StatusViewDescriptionProgress(int i, int i2) {
        this.f104391a = i;
        this.f104392b = i2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof StatusViewDescriptionProgress)) {
            return false;
        }
        StatusViewDescriptionProgress statusViewDescriptionProgress = (StatusViewDescriptionProgress) obj2;
        return this.f104391a == statusViewDescriptionProgress.f104391a && this.f104392b == statusViewDescriptionProgress.f104392b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f104392b) + (Integer.hashCode(this.f104391a) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeInt(this.f104391a);
        dest.writeInt(this.f104392b);
    }
}
