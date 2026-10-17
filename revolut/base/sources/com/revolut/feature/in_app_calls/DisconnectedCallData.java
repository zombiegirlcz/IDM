package com.revolut.feature.in_app_calls;

import a0.d;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/in_app_calls/DisconnectedCallData;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_in_app_calls_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class DisconnectedCallData implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<DisconnectedCallData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Exception f74781a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f74782b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f74783c;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new DisconnectedCallData((Exception) parcel.readSerializable(), parcel.readLong(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new DisconnectedCallData[i];
        }
    }

    public DisconnectedCallData(Exception exc2, long j2, String str) {
        this.f74781a = exc2;
        this.f74782b = j2;
        this.f74783c = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof DisconnectedCallData)) {
            return false;
        }
        DisconnectedCallData disconnectedCallData = (DisconnectedCallData) obj2;
        return Intrinsics.f(this.f74781a, disconnectedCallData.f74781a) && this.f74782b == disconnectedCallData.f74782b && Intrinsics.f(this.f74783c, disconnectedCallData.f74783c);
    }

    public final int hashCode() {
        Exception exc2 = this.f74781a;
        int iC = d.c((exc2 == null ? 0 : exc2.hashCode()) * 31, 31, this.f74782b);
        String str = this.f74783c;
        return iC + (str != null ? str.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeSerializable(this.f74781a);
        dest.writeLong(this.f74782b);
        dest.writeString(this.f74783c);
    }
}
