package com.revolut.feature.wealth.models.robo;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/wealth/models/robo/BenchmarkInfo;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_wealth_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class BenchmarkInfo implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<BenchmarkInfo> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f95697a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f95698b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new BenchmarkInfo(parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new BenchmarkInfo[i];
        }
    }

    public BenchmarkInfo(String ref2, String name) {
        Intrinsics.checkNotNullParameter(ref2, "ref");
        Intrinsics.checkNotNullParameter(name, "name");
        this.f95697a = ref2;
        this.f95698b = name;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof BenchmarkInfo)) {
            return false;
        }
        BenchmarkInfo benchmarkInfo = (BenchmarkInfo) obj2;
        return Intrinsics.f(this.f95697a, benchmarkInfo.f95697a) && Intrinsics.f(this.f95698b, benchmarkInfo.f95698b);
    }

    public final int hashCode() {
        return this.f95698b.hashCode() + (this.f95697a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f95697a);
        dest.writeString(this.f95698b);
    }
}
