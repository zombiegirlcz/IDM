package com.revolut.retail.feature.esim.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import java.time.Instant;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/esim/api/model/EsimConnectivityTroubleshootingInfo;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_retail_esim_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class EsimConnectivityTroubleshootingInfo implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<EsimConnectivityTroubleshootingInfo> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f100199a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Instant f100200b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Instant f100201c;
    public final Instant d;
    public final boolean e;
    public final boolean f;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            boolean z;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String string = parcel.readString();
            Instant instant = (Instant) parcel.readSerializable();
            Instant instant2 = (Instant) parcel.readSerializable();
            Instant instant3 = (Instant) parcel.readSerializable();
            boolean z3 = false;
            if (parcel.readInt() != 0) {
                z = false;
                z3 = true;
            } else {
                z = false;
            }
            return new EsimConnectivityTroubleshootingInfo(string, instant, instant2, instant3, z3, parcel.readInt() == 0 ? z : true);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new EsimConnectivityTroubleshootingInfo[i];
        }
    }

    public EsimConnectivityTroubleshootingInfo(String simProfileId, Instant instant, Instant instant2, Instant instant3, boolean z, boolean z3) {
        Intrinsics.checkNotNullParameter(simProfileId, "simProfileId");
        this.f100199a = simProfileId;
        this.f100200b = instant;
        this.f100201c = instant2;
        this.d = instant3;
        this.e = z;
        this.f = z3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof EsimConnectivityTroubleshootingInfo)) {
            return false;
        }
        EsimConnectivityTroubleshootingInfo esimConnectivityTroubleshootingInfo = (EsimConnectivityTroubleshootingInfo) obj2;
        return Intrinsics.f(this.f100199a, esimConnectivityTroubleshootingInfo.f100199a) && Intrinsics.f(this.f100200b, esimConnectivityTroubleshootingInfo.f100200b) && Intrinsics.f(this.f100201c, esimConnectivityTroubleshootingInfo.f100201c) && Intrinsics.f(this.d, esimConnectivityTroubleshootingInfo.d) && this.e == esimConnectivityTroubleshootingInfo.e && this.f == esimConnectivityTroubleshootingInfo.f;
    }

    public final int hashCode() {
        int iHashCode = this.f100199a.hashCode() * 31;
        Instant instant = this.f100200b;
        int iHashCode2 = (iHashCode + (instant == null ? 0 : instant.hashCode())) * 31;
        Instant instant2 = this.f100201c;
        int iHashCode3 = (iHashCode2 + (instant2 == null ? 0 : instant2.hashCode())) * 31;
        Instant instant3 = this.d;
        return Boolean.hashCode(this.f) + j6.a.c((iHashCode3 + (instant3 != null ? instant3.hashCode() : 0)) * 31, 31, this.e);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f100199a);
        dest.writeSerializable(this.f100200b);
        dest.writeSerializable(this.f100201c);
        dest.writeSerializable(this.d);
        dest.writeInt(this.e ? 1 : 0);
        dest.writeInt(this.f ? 1 : 0);
    }
}
