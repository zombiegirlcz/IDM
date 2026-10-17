package com.revolut.retail.feature.esim.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/esim/api/model/EsimProfileSummary;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_retail_esim_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class EsimProfileSummary implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<EsimProfileSummary> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f100455a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f100456b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f100457c;
    public final String d;
    public final boolean e;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            boolean z;
            boolean z3;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String string = parcel.readString();
            if (parcel.readInt() != 0) {
                z = false;
                z3 = true;
            } else {
                z = false;
                z3 = false;
            }
            String string2 = parcel.readString();
            boolean z4 = true;
            String string3 = parcel.readString();
            if (parcel.readInt() == 0) {
                z4 = z;
            }
            return new EsimProfileSummary(string, string2, string3, z3, z4);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new EsimProfileSummary[i];
        }
    }

    public EsimProfileSummary(String esimProfileId, String str, String str2, boolean z, boolean z3) {
        Intrinsics.checkNotNullParameter(esimProfileId, "esimProfileId");
        this.f100455a = esimProfileId;
        this.f100456b = z;
        this.f100457c = str;
        this.d = str2;
        this.e = z3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof EsimProfileSummary)) {
            return false;
        }
        EsimProfileSummary esimProfileSummary = (EsimProfileSummary) obj2;
        return Intrinsics.f(this.f100455a, esimProfileSummary.f100455a) && this.f100456b == esimProfileSummary.f100456b && Intrinsics.f(this.f100457c, esimProfileSummary.f100457c) && Intrinsics.f(this.d, esimProfileSummary.d) && this.e == esimProfileSummary.e;
    }

    public final int hashCode() {
        int iC = j6.a.c(this.f100455a.hashCode() * 31, 31, this.f100456b);
        String str = this.f100457c;
        int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.d;
        return Boolean.hashCode(this.e) + ((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f100455a);
        dest.writeInt(this.f100456b ? 1 : 0);
        dest.writeString(this.f100457c);
        dest.writeString(this.d);
        dest.writeInt(this.e ? 1 : 0);
    }
}
