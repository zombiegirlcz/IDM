package com.revolut.feature.store.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import t1e.a0;
import t1e.y;
import t1e.z;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/store/api/model/StorePurchaseDetailsResponse;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_store_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class StorePurchaseDetailsResponse implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<StorePurchaseDetailsResponse> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f88583a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a0 f88584b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f88585c;
    public final String d;
    public final y e;
    public final String f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f88586g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f88587h;
    public final z i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final String f88588j;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new StorePurchaseDetailsResponse(parcel.readString(), a0.valueOf(parcel.readString()), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : y.valueOf(parcel.readString()), parcel.readString(), parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0 ? z.valueOf(parcel.readString()) : null, parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new StorePurchaseDetailsResponse[i];
        }
    }

    public StorePurchaseDetailsResponse(String id10, a0 status, String str, String str2, y yVar, String str3, boolean z, boolean z3, z zVar, String str4) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(status, "status");
        this.f88583a = id10;
        this.f88584b = status;
        this.f88585c = str;
        this.d = str2;
        this.e = yVar;
        this.f = str3;
        this.f88586g = z;
        this.f88587h = z3;
        this.i = zVar;
        this.f88588j = str4;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof StorePurchaseDetailsResponse)) {
            return false;
        }
        StorePurchaseDetailsResponse storePurchaseDetailsResponse = (StorePurchaseDetailsResponse) obj2;
        return Intrinsics.f(this.f88583a, storePurchaseDetailsResponse.f88583a) && this.f88584b == storePurchaseDetailsResponse.f88584b && Intrinsics.f(this.f88585c, storePurchaseDetailsResponse.f88585c) && Intrinsics.f(this.d, storePurchaseDetailsResponse.d) && this.e == storePurchaseDetailsResponse.e && Intrinsics.f(this.f, storePurchaseDetailsResponse.f) && this.f88586g == storePurchaseDetailsResponse.f88586g && this.f88587h == storePurchaseDetailsResponse.f88587h && this.i == storePurchaseDetailsResponse.i && Intrinsics.f(this.f88588j, storePurchaseDetailsResponse.f88588j);
    }

    public final int hashCode() {
        int iHashCode = (this.f88584b.hashCode() + (this.f88583a.hashCode() * 31)) * 31;
        String str = this.f88585c;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.d;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        y yVar = this.e;
        int iHashCode4 = (iHashCode3 + (yVar == null ? 0 : yVar.hashCode())) * 31;
        String str3 = this.f;
        int iC = j6.a.c(j6.a.c((iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31, 31, this.f88586g), 31, this.f88587h);
        z zVar = this.i;
        int iHashCode5 = (iC + (zVar == null ? 0 : zVar.hashCode())) * 31;
        String str4 = this.f88588j;
        return iHashCode5 + (str4 != null ? str4.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f88583a);
        dest.writeString(this.f88584b.name());
        dest.writeString(this.f88585c);
        dest.writeString(this.d);
        y yVar = this.e;
        if (yVar == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(yVar.name());
        }
        dest.writeString(this.f);
        dest.writeInt(this.f88586g ? 1 : 0);
        dest.writeInt(this.f88587h ? 1 : 0);
        z zVar = this.i;
        if (zVar == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(zVar.name());
        }
        dest.writeString(this.f88588j);
    }
}
