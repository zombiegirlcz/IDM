package com.revolut.feature.apm.qvik.impl.data.models;

import android.os.Parcel;
import android.os.Parcelable;
import dj0.d;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import m72.b;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0081\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/apm/qvik/impl/data/models/QvikQrScanParams;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_apm_qvik_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class QvikQrScanParams implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<QvikQrScanParams> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f62794a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f62795b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f62796c;
    public final boolean d;
    public final Long e;
    public final String f;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            boolean z;
            boolean z3;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            d dVar = (d) parcel.readSerializable();
            boolean z4 = false;
            if (parcel.readInt() != 0) {
                z = false;
                z4 = true;
                z3 = true;
            } else {
                z = false;
                z3 = true;
            }
            String string = parcel.readString();
            if (parcel.readInt() == 0) {
                z3 = z;
            }
            return new QvikQrScanParams(dVar, z4, string, z3, parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new QvikQrScanParams[i];
        }
    }

    public QvikQrScanParams(d dVar, boolean z, String str, boolean z3, Long l2, String str2) {
        this.f62794a = dVar;
        this.f62795b = z;
        this.f62796c = str;
        this.d = z3;
        this.e = l2;
        this.f = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof QvikQrScanParams)) {
            return false;
        }
        QvikQrScanParams qvikQrScanParams = (QvikQrScanParams) obj2;
        return Intrinsics.f(this.f62794a, qvikQrScanParams.f62794a) && this.f62795b == qvikQrScanParams.f62795b && Intrinsics.f(this.f62796c, qvikQrScanParams.f62796c) && this.d == qvikQrScanParams.d && Intrinsics.f(this.e, qvikQrScanParams.e) && Intrinsics.f(this.f, qvikQrScanParams.f);
    }

    public final int hashCode() {
        d dVar = this.f62794a;
        int iC = j6.a.c((dVar == null ? 0 : dVar.hashCode()) * 31, 31, this.f62795b);
        String str = this.f62796c;
        int iC2 = j6.a.c((iC + (str == null ? 0 : str.hashCode())) * 31, 31, this.d);
        Long l2 = this.e;
        int iHashCode = (iC2 + (l2 == null ? 0 : l2.hashCode())) * 31;
        String str2 = this.f;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeSerializable(this.f62794a);
        dest.writeInt(this.f62795b ? 1 : 0);
        dest.writeString(this.f62796c);
        dest.writeInt(this.d ? 1 : 0);
        Long l2 = this.e;
        if (l2 == null) {
            dest.writeInt(0);
        } else {
            b.A(dest, 1, l2);
        }
        dest.writeString(this.f);
    }
}
