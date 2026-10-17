package com.revolut.retail.trading.core.domain;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import wi0.b;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/trading/core/domain/PocketOwnerInfo;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "trading_core_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class PocketOwnerInfo implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<PocketOwnerInfo> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f104480a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f104481b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f104482c;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new PocketOwnerInfo((b) parcel.readSerializable(), parcel.readInt() != 0, parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new PocketOwnerInfo[i];
        }
    }

    public PocketOwnerInfo(b bVar, boolean z, boolean z3) {
        this.f104480a = bVar;
        this.f104481b = z;
        this.f104482c = z3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof PocketOwnerInfo)) {
            return false;
        }
        PocketOwnerInfo pocketOwnerInfo = (PocketOwnerInfo) obj2;
        return Intrinsics.f(this.f104480a, pocketOwnerInfo.f104480a) && this.f104481b == pocketOwnerInfo.f104481b && this.f104482c == pocketOwnerInfo.f104482c;
    }

    public final int hashCode() {
        b bVar = this.f104480a;
        return Boolean.hashCode(this.f104482c) + j6.a.c((bVar == null ? 0 : bVar.f297794a.hashCode()) * 31, 31, this.f104481b);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeSerializable(this.f104480a);
        dest.writeInt(this.f104481b ? 1 : 0);
        dest.writeInt(this.f104482c ? 1 : 0);
    }
}
