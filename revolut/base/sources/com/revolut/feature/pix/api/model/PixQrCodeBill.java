package com.revolut.feature.pix.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import m72.b;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/pix/api/model/PixQrCodeBill;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_pix_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class PixQrCodeBill implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<PixQrCodeBill> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Long f80426a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Long f80427b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f80428c;
    public final String d;
    public final Long e;
    public final String f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final PixQrCodeDebtor f80429g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final List f80430h;
    public final PixQrCodeMoneyBreakdown i;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            Long lValueOf = parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong());
            Long lValueOf2 = parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong());
            String string = parcel.readString();
            String string2 = parcel.readString();
            Long lValueOf3 = parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong());
            String string3 = parcel.readString();
            PixQrCodeDebtor pixQrCodeDebtorCreateFromParcel = parcel.readInt() == 0 ? null : PixQrCodeDebtor.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i);
                int iA = 0;
                while (iA != i) {
                    iA = org.bouncycastle.jcajce.provider.digest.a.a(PixQrCodeAdditionalInformation.CREATOR, parcel, arrayList2, iA, 1);
                }
                arrayList = arrayList2;
            }
            return new PixQrCodeBill(lValueOf, lValueOf2, string, string2, lValueOf3, string3, pixQrCodeDebtorCreateFromParcel, arrayList, parcel.readInt() != 0 ? PixQrCodeMoneyBreakdown.CREATOR.createFromParcel(parcel) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new PixQrCodeBill[i];
        }
    }

    public PixQrCodeBill(Long l2, Long l3, String str, String str2, Long l4, String str3, PixQrCodeDebtor pixQrCodeDebtor, ArrayList arrayList, PixQrCodeMoneyBreakdown pixQrCodeMoneyBreakdown) {
        this.f80426a = l2;
        this.f80427b = l3;
        this.f80428c = str;
        this.d = str2;
        this.e = l4;
        this.f = str3;
        this.f80429g = pixQrCodeDebtor;
        this.f80430h = arrayList;
        this.i = pixQrCodeMoneyBreakdown;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof PixQrCodeBill)) {
            return false;
        }
        PixQrCodeBill pixQrCodeBill = (PixQrCodeBill) obj2;
        return Intrinsics.f(this.f80426a, pixQrCodeBill.f80426a) && Intrinsics.f(this.f80427b, pixQrCodeBill.f80427b) && Intrinsics.f(this.f80428c, pixQrCodeBill.f80428c) && Intrinsics.f(this.d, pixQrCodeBill.d) && Intrinsics.f(this.e, pixQrCodeBill.e) && Intrinsics.f(this.f, pixQrCodeBill.f) && Intrinsics.f(this.f80429g, pixQrCodeBill.f80429g) && Intrinsics.f(this.f80430h, pixQrCodeBill.f80430h) && Intrinsics.f(this.i, pixQrCodeBill.i);
    }

    public final int hashCode() {
        Long l2 = this.f80426a;
        int iHashCode = (l2 == null ? 0 : l2.hashCode()) * 31;
        Long l3 = this.f80427b;
        int iHashCode2 = (iHashCode + (l3 == null ? 0 : l3.hashCode())) * 31;
        String str = this.f80428c;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.d;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Long l4 = this.e;
        int iHashCode5 = (iHashCode4 + (l4 == null ? 0 : l4.hashCode())) * 31;
        String str3 = this.f;
        int iHashCode6 = (iHashCode5 + (str3 == null ? 0 : str3.hashCode())) * 31;
        PixQrCodeDebtor pixQrCodeDebtor = this.f80429g;
        int iHashCode7 = (iHashCode6 + (pixQrCodeDebtor == null ? 0 : pixQrCodeDebtor.hashCode())) * 31;
        List list = this.f80430h;
        int iHashCode8 = (iHashCode7 + (list == null ? 0 : list.hashCode())) * 31;
        PixQrCodeMoneyBreakdown pixQrCodeMoneyBreakdown = this.i;
        return iHashCode8 + (pixQrCodeMoneyBreakdown != null ? pixQrCodeMoneyBreakdown.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        Long l2 = this.f80426a;
        if (l2 == null) {
            dest.writeInt(0);
        } else {
            b.A(dest, 1, l2);
        }
        Long l3 = this.f80427b;
        if (l3 == null) {
            dest.writeInt(0);
        } else {
            b.A(dest, 1, l3);
        }
        dest.writeString(this.f80428c);
        dest.writeString(this.d);
        Long l4 = this.e;
        if (l4 == null) {
            dest.writeInt(0);
        } else {
            b.A(dest, 1, l4);
        }
        dest.writeString(this.f);
        PixQrCodeDebtor pixQrCodeDebtor = this.f80429g;
        if (pixQrCodeDebtor == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            pixQrCodeDebtor.writeToParcel(dest, i);
        }
        List list = this.f80430h;
        if (list == null) {
            dest.writeInt(0);
        } else {
            Iterator itQ = v0.a.q(dest, 1, list);
            while (itQ.hasNext()) {
                ((PixQrCodeAdditionalInformation) itQ.next()).writeToParcel(dest, i);
            }
        }
        PixQrCodeMoneyBreakdown pixQrCodeMoneyBreakdown = this.i;
        if (pixQrCodeMoneyBreakdown == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            pixQrCodeMoneyBreakdown.writeToParcel(dest, i);
        }
    }
}
