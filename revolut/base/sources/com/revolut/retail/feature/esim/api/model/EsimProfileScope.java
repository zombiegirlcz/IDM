package com.revolut.retail.feature.esim.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import dej.m;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import wi0.b;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/esim/api/model/EsimProfileScope;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_retail_esim_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class EsimProfileScope implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<EsimProfileScope> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m f100450a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f100451b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f100452c;
    public final boolean d;
    public final boolean e;
    public final boolean f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final EsimMobilePlanNetworkProvider f100453g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f100454h;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            boolean z;
            boolean z3;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            m mVarValueOf = m.valueOf(parcel.readString());
            b bVar = (b) parcel.readSerializable();
            String string = parcel.readString();
            boolean z4 = false;
            boolean z6 = true;
            if (parcel.readInt() != 0) {
                z = false;
                z4 = true;
            } else {
                z = false;
            }
            if (parcel.readInt() != 0) {
                z3 = true;
            } else {
                z3 = true;
                z6 = z;
            }
            if (parcel.readInt() == 0) {
                z3 = z;
            }
            return new EsimProfileScope(mVarValueOf, bVar, string, z4, z6, z3, parcel.readInt() == 0 ? null : EsimMobilePlanNetworkProvider.CREATOR.createFromParcel(parcel), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new EsimProfileScope[i];
        }
    }

    public EsimProfileScope(m mobilePlanType, b bVar, String str, boolean z, boolean z3, boolean z4, EsimMobilePlanNetworkProvider esimMobilePlanNetworkProvider, String str2) {
        Intrinsics.checkNotNullParameter(mobilePlanType, "mobilePlanType");
        this.f100450a = mobilePlanType;
        this.f100451b = bVar;
        this.f100452c = str;
        this.d = z;
        this.e = z3;
        this.f = z4;
        this.f100453g = esimMobilePlanNetworkProvider;
        this.f100454h = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof EsimProfileScope)) {
            return false;
        }
        EsimProfileScope esimProfileScope = (EsimProfileScope) obj2;
        return this.f100450a == esimProfileScope.f100450a && Intrinsics.f(this.f100451b, esimProfileScope.f100451b) && Intrinsics.f(this.f100452c, esimProfileScope.f100452c) && this.d == esimProfileScope.d && this.e == esimProfileScope.e && this.f == esimProfileScope.f && Intrinsics.f(this.f100453g, esimProfileScope.f100453g) && Intrinsics.f(this.f100454h, esimProfileScope.f100454h);
    }

    public final int hashCode() {
        int iHashCode = this.f100450a.hashCode() * 31;
        b bVar = this.f100451b;
        int iHashCode2 = (iHashCode + (bVar == null ? 0 : bVar.f297794a.hashCode())) * 31;
        String str = this.f100452c;
        int iC = j6.a.c(j6.a.c(j6.a.c((iHashCode2 + (str == null ? 0 : str.hashCode())) * 31, 31, this.d), 31, this.e), 31, this.f);
        EsimMobilePlanNetworkProvider esimMobilePlanNetworkProvider = this.f100453g;
        int iHashCode3 = (iC + (esimMobilePlanNetworkProvider == null ? 0 : esimMobilePlanNetworkProvider.hashCode())) * 31;
        String str2 = this.f100454h;
        return iHashCode3 + (str2 != null ? str2.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f100450a.name());
        dest.writeSerializable(this.f100451b);
        dest.writeString(this.f100452c);
        dest.writeInt(this.d ? 1 : 0);
        dest.writeInt(this.e ? 1 : 0);
        dest.writeInt(this.f ? 1 : 0);
        EsimMobilePlanNetworkProvider esimMobilePlanNetworkProvider = this.f100453g;
        if (esimMobilePlanNetworkProvider == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            esimMobilePlanNetworkProvider.writeToParcel(dest, i);
        }
        dest.writeString(this.f100454h);
    }
}
