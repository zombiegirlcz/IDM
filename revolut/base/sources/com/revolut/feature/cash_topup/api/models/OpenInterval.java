package com.revolut.feature.cash_topup.api.models;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/cash_topup/api/models/OpenInterval;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_cash_topup_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class OpenInterval implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<OpenInterval> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f65602a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f65603b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new OpenInterval(parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new OpenInterval[i];
        }
    }

    public OpenInterval(String begin, String end2) {
        Intrinsics.checkNotNullParameter(begin, "begin");
        Intrinsics.checkNotNullParameter(end2, "end");
        this.f65602a = begin;
        this.f65603b = end2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof OpenInterval)) {
            return false;
        }
        OpenInterval openInterval = (OpenInterval) obj2;
        return Intrinsics.f(this.f65602a, openInterval.f65602a) && Intrinsics.f(this.f65603b, openInterval.f65603b);
    }

    public final int hashCode() {
        return this.f65603b.hashCode() + (this.f65602a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f65602a);
        dest.writeString(this.f65603b);
    }
}
