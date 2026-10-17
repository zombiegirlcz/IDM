package com.revolut.feature.apm.core.models.blik;

import a0.d;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/apm/core/models/blik/BlikCode;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_apm_core_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class BlikCode implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<BlikCode> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f61925a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f61926b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f61927c;
    public final long d;
    public final long e;
    public final boolean f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f61928g;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new BlikCode(parcel.readString(), parcel.readString(), parcel.readLong(), parcel.readLong(), parcel.readLong(), parcel.readInt() != 0, parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new BlikCode[i];
        }
    }

    public BlikCode(String id10, String code, long j2, long j3, long j5, boolean z, String origin) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(code, "code");
        Intrinsics.checkNotNullParameter(origin, "origin");
        this.f61925a = id10;
        this.f61926b = code;
        this.f61927c = j2;
        this.d = j3;
        this.e = j5;
        this.f = z;
        this.f61928g = origin;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof BlikCode)) {
            return false;
        }
        BlikCode blikCode = (BlikCode) obj2;
        return Intrinsics.f(this.f61925a, blikCode.f61925a) && Intrinsics.f(this.f61926b, blikCode.f61926b) && this.f61927c == blikCode.f61927c && this.d == blikCode.d && this.e == blikCode.e && this.f == blikCode.f && Intrinsics.f(this.f61928g, blikCode.f61928g);
    }

    public final int hashCode() {
        return this.f61928g.hashCode() + j6.a.c(d.c(d.c(d.c(p.a.c(this.f61925a.hashCode() * 31, 31, this.f61926b), 31, this.f61927c), 31, this.d), 31, this.e), 31, this.f);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f61925a);
        dest.writeString(this.f61926b);
        dest.writeLong(this.f61927c);
        dest.writeLong(this.d);
        dest.writeLong(this.e);
        dest.writeInt(this.f ? 1 : 0);
        dest.writeString(this.f61928g);
    }
}
