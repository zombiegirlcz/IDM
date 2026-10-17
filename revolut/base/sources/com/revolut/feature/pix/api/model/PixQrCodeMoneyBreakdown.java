package com.revolut.feature.pix.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import dj0.d;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import xi0.b;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/pix/api/model/PixQrCodeMoneyBreakdown;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_pix_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class PixQrCodeMoneyBreakdown implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<PixQrCodeMoneyBreakdown> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f80464a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d f80465b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final d f80466c;
    public final d d;
    public final d e;
    public final d f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final d f80467g;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new PixQrCodeMoneyBreakdown((d) parcel.readSerializable(), (d) parcel.readSerializable(), (d) parcel.readSerializable(), (d) parcel.readSerializable(), (d) parcel.readSerializable(), (d) parcel.readSerializable(), (b) parcel.readSerializable());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new PixQrCodeMoneyBreakdown[i];
        }
    }

    public PixQrCodeMoneyBreakdown(d dVar, d dVar2, d dVar3, d dVar4, d dVar5, d dVar6, b bVar) {
        this.f80464a = bVar;
        this.f80465b = dVar;
        this.f80466c = dVar2;
        this.d = dVar3;
        this.e = dVar4;
        this.f = dVar5;
        this.f80467g = dVar6;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof PixQrCodeMoneyBreakdown)) {
            return false;
        }
        PixQrCodeMoneyBreakdown pixQrCodeMoneyBreakdown = (PixQrCodeMoneyBreakdown) obj2;
        return Intrinsics.f(this.f80464a, pixQrCodeMoneyBreakdown.f80464a) && Intrinsics.f(this.f80465b, pixQrCodeMoneyBreakdown.f80465b) && Intrinsics.f(this.f80466c, pixQrCodeMoneyBreakdown.f80466c) && Intrinsics.f(this.d, pixQrCodeMoneyBreakdown.d) && Intrinsics.f(this.e, pixQrCodeMoneyBreakdown.e) && Intrinsics.f(this.f, pixQrCodeMoneyBreakdown.f) && Intrinsics.f(this.f80467g, pixQrCodeMoneyBreakdown.f80467g);
    }

    public final int hashCode() {
        b bVar = this.f80464a;
        int iHashCode = (bVar == null ? 0 : bVar.hashCode()) * 31;
        d dVar = this.f80465b;
        int iHashCode2 = (iHashCode + (dVar == null ? 0 : dVar.hashCode())) * 31;
        d dVar2 = this.f80466c;
        int iHashCode3 = (iHashCode2 + (dVar2 == null ? 0 : dVar2.hashCode())) * 31;
        d dVar3 = this.d;
        int iHashCode4 = (iHashCode3 + (dVar3 == null ? 0 : dVar3.hashCode())) * 31;
        d dVar4 = this.e;
        int iHashCode5 = (iHashCode4 + (dVar4 == null ? 0 : dVar4.hashCode())) * 31;
        d dVar5 = this.f;
        int iHashCode6 = (iHashCode5 + (dVar5 == null ? 0 : dVar5.hashCode())) * 31;
        d dVar6 = this.f80467g;
        return iHashCode6 + (dVar6 != null ? dVar6.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeSerializable(this.f80464a);
        dest.writeSerializable(this.f80465b);
        dest.writeSerializable(this.f80466c);
        dest.writeSerializable(this.d);
        dest.writeSerializable(this.e);
        dest.writeSerializable(this.f);
        dest.writeSerializable(this.f80467g);
    }
}
