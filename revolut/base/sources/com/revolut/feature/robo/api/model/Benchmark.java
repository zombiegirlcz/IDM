package com.revolut.feature.robo.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/robo/api/model/Benchmark;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_robo_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class Benchmark implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<Benchmark> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f85027a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f85028b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f85029c;
    public final String d;
    public final String e;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new Benchmark(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new Benchmark[i];
        }
    }

    public Benchmark(String shortDescription, String str, String str2, String name, String ref2) {
        Intrinsics.checkNotNullParameter(shortDescription, "shortDescription");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(ref2, "ref");
        this.f85027a = shortDescription;
        this.f85028b = str;
        this.f85029c = str2;
        this.d = name;
        this.e = ref2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof Benchmark)) {
            return false;
        }
        Benchmark benchmark = (Benchmark) obj2;
        return Intrinsics.f(this.f85027a, benchmark.f85027a) && Intrinsics.f(this.f85028b, benchmark.f85028b) && Intrinsics.f(this.f85029c, benchmark.f85029c) && Intrinsics.f(this.d, benchmark.d) && Intrinsics.f(this.e, benchmark.e);
    }

    public final int hashCode() {
        int iHashCode = this.f85027a.hashCode() * 31;
        String str = this.f85028b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f85029c;
        return this.e.hashCode() + p.a.c((iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31, 31, this.d);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f85027a);
        dest.writeString(this.f85028b);
        dest.writeString(this.f85029c);
        dest.writeString(this.d);
        dest.writeString(this.e);
    }
}
