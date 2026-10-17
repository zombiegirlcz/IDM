package com.revolut.retail.feature.esim.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/esim/api/model/EsimProfileLock;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_retail_esim_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class EsimProfileLock implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<EsimProfileLock> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f100447a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f100448b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f100449c;
    public final boolean d;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new EsimProfileLock(parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new EsimProfileLock[i];
        }
    }

    public EsimProfileLock(boolean z, boolean z3, boolean z4, boolean z6) {
        this.f100447a = z;
        this.f100448b = z3;
        this.f100449c = z4;
        this.d = z6;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof EsimProfileLock)) {
            return false;
        }
        EsimProfileLock esimProfileLock = (EsimProfileLock) obj2;
        return this.f100447a == esimProfileLock.f100447a && this.f100448b == esimProfileLock.f100448b && this.f100449c == esimProfileLock.f100449c && this.d == esimProfileLock.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + j6.a.c(j6.a.c(Boolean.hashCode(this.f100447a) * 31, 31, this.f100448b), 31, this.f100449c);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeInt(this.f100447a ? 1 : 0);
        dest.writeInt(this.f100448b ? 1 : 0);
        dest.writeInt(this.f100449c ? 1 : 0);
        dest.writeInt(this.d ? 1 : 0);
    }
}
