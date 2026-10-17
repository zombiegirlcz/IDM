package com.revolut.nfc_reader_documents;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/nfc_reader_documents/NfcDocument$PassportRaw", "", "", "toString", "()Ljava/lang/String;", "nfc_reader_documents_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class NfcDocument$PassportRaw implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<NfcDocument$PassportRaw> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f98470a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f98471b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f98472c;
    public final List d;
    public final List e;
    public final List f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final List f98473g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final List f98474h;
    public final List i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final List f98475j;
    public final List k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final List f98476l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final List f98477m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final List f98478n;
    public final List o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final List f98479p;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            ArrayList arrayList2;
            ArrayList arrayList3;
            ArrayList arrayList4;
            ArrayList arrayList5;
            ArrayList arrayList6;
            ArrayList arrayList7;
            ArrayList arrayList8;
            ArrayList arrayList9;
            ArrayList arrayList10;
            ArrayList arrayList11;
            ArrayList arrayList12;
            ArrayList arrayList13;
            ArrayList arrayList14;
            ArrayList arrayList15;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            ArrayList arrayList16 = null;
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i = parcel.readInt();
                ArrayList arrayList17 = new ArrayList(i);
                for (int i2 = 0; i2 != i; i2++) {
                    arrayList17.add(Byte.valueOf(parcel.readByte()));
                }
                arrayList = arrayList17;
            }
            if (parcel.readInt() == 0) {
                arrayList2 = null;
            } else {
                int i3 = parcel.readInt();
                ArrayList arrayList18 = new ArrayList(i3);
                for (int i5 = 0; i5 != i3; i5++) {
                    arrayList18.add(Byte.valueOf(parcel.readByte()));
                }
                arrayList2 = arrayList18;
            }
            if (parcel.readInt() == 0) {
                arrayList3 = null;
            } else {
                int i6 = parcel.readInt();
                ArrayList arrayList19 = new ArrayList(i6);
                for (int i21 = 0; i21 != i6; i21++) {
                    arrayList19.add(Byte.valueOf(parcel.readByte()));
                }
                arrayList3 = arrayList19;
            }
            if (parcel.readInt() == 0) {
                arrayList4 = null;
            } else {
                int i22 = parcel.readInt();
                ArrayList arrayList20 = new ArrayList(i22);
                for (int i32 = 0; i32 != i22; i32++) {
                    arrayList20.add(Byte.valueOf(parcel.readByte()));
                }
                arrayList4 = arrayList20;
            }
            if (parcel.readInt() == 0) {
                arrayList5 = null;
            } else {
                int i33 = parcel.readInt();
                ArrayList arrayList21 = new ArrayList(i33);
                for (int i43 = 0; i43 != i33; i43++) {
                    arrayList21.add(Byte.valueOf(parcel.readByte()));
                }
                arrayList5 = arrayList21;
            }
            if (parcel.readInt() == 0) {
                arrayList6 = null;
            } else {
                int i59 = parcel.readInt();
                ArrayList arrayList22 = new ArrayList(i59);
                for (int i66 = 0; i66 != i59; i66++) {
                    arrayList22.add(Byte.valueOf(parcel.readByte()));
                }
                arrayList6 = arrayList22;
            }
            if (parcel.readInt() == 0) {
                arrayList7 = null;
            } else {
                int i74 = parcel.readInt();
                ArrayList arrayList23 = new ArrayList(i74);
                for (int i92 = 0; i92 != i74; i92++) {
                    arrayList23.add(Byte.valueOf(parcel.readByte()));
                }
                arrayList7 = arrayList23;
            }
            if (parcel.readInt() == 0) {
                arrayList8 = null;
            } else {
                int i96 = parcel.readInt();
                ArrayList arrayList24 = new ArrayList(i96);
                for (int i99 = 0; i99 != i96; i99++) {
                    arrayList24.add(Byte.valueOf(parcel.readByte()));
                }
                arrayList8 = arrayList24;
            }
            if (parcel.readInt() == 0) {
                arrayList9 = null;
            } else {
                int i100 = parcel.readInt();
                ArrayList arrayList25 = new ArrayList(i100);
                for (int i101 = 0; i101 != i100; i101++) {
                    arrayList25.add(Byte.valueOf(parcel.readByte()));
                }
                arrayList9 = arrayList25;
            }
            if (parcel.readInt() == 0) {
                arrayList10 = null;
            } else {
                int i102 = parcel.readInt();
                ArrayList arrayList26 = new ArrayList(i102);
                for (int i103 = 0; i103 != i102; i103++) {
                    arrayList26.add(Byte.valueOf(parcel.readByte()));
                }
                arrayList10 = arrayList26;
            }
            if (parcel.readInt() == 0) {
                arrayList11 = null;
            } else {
                int i104 = parcel.readInt();
                ArrayList arrayList27 = new ArrayList(i104);
                for (int i105 = 0; i105 != i104; i105++) {
                    arrayList27.add(Byte.valueOf(parcel.readByte()));
                }
                arrayList11 = arrayList27;
            }
            if (parcel.readInt() == 0) {
                arrayList12 = null;
            } else {
                int i106 = parcel.readInt();
                ArrayList arrayList28 = new ArrayList(i106);
                for (int i107 = 0; i107 != i106; i107++) {
                    arrayList28.add(Byte.valueOf(parcel.readByte()));
                }
                arrayList12 = arrayList28;
            }
            if (parcel.readInt() == 0) {
                arrayList13 = null;
            } else {
                int i108 = parcel.readInt();
                ArrayList arrayList29 = new ArrayList(i108);
                for (int i109 = 0; i109 != i108; i109++) {
                    arrayList29.add(Byte.valueOf(parcel.readByte()));
                }
                arrayList13 = arrayList29;
            }
            if (parcel.readInt() == 0) {
                arrayList14 = null;
            } else {
                int i110 = parcel.readInt();
                ArrayList arrayList30 = new ArrayList(i110);
                for (int i111 = 0; i111 != i110; i111++) {
                    arrayList30.add(Byte.valueOf(parcel.readByte()));
                }
                arrayList14 = arrayList30;
            }
            if (parcel.readInt() == 0) {
                arrayList15 = null;
            } else {
                int i112 = parcel.readInt();
                ArrayList arrayList31 = new ArrayList(i112);
                for (int i113 = 0; i113 != i112; i113++) {
                    arrayList31.add(Byte.valueOf(parcel.readByte()));
                }
                arrayList15 = arrayList31;
            }
            if (parcel.readInt() != 0) {
                int i114 = parcel.readInt();
                arrayList16 = new ArrayList(i114);
                for (int i115 = 0; i115 != i114; i115++) {
                    arrayList16.add(Byte.valueOf(parcel.readByte()));
                }
            }
            return new NfcDocument$PassportRaw(arrayList, arrayList2, arrayList3, arrayList4, arrayList5, arrayList6, arrayList7, arrayList8, arrayList9, arrayList10, arrayList11, arrayList12, arrayList13, arrayList14, arrayList15, arrayList16);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new NfcDocument$PassportRaw[i];
        }
    }

    public NfcDocument$PassportRaw(List list, List list2, List list3, List list4, List list5, List list6, List list7, List list8, List list9, List list10, List list11, List list12, List list13, List list14, List list15, List list16) {
        this.f98470a = list;
        this.f98471b = list2;
        this.f98472c = list3;
        this.d = list4;
        this.e = list5;
        this.f = list6;
        this.f98473g = list7;
        this.f98474h = list8;
        this.i = list9;
        this.f98475j = list10;
        this.k = list11;
        this.f98476l = list12;
        this.f98477m = list13;
        this.f98478n = list14;
        this.o = list15;
        this.f98479p = list16;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof NfcDocument$PassportRaw)) {
            return false;
        }
        NfcDocument$PassportRaw nfcDocument$PassportRaw = (NfcDocument$PassportRaw) obj2;
        return Intrinsics.f(this.f98470a, nfcDocument$PassportRaw.f98470a) && Intrinsics.f(this.f98471b, nfcDocument$PassportRaw.f98471b) && Intrinsics.f(this.f98472c, nfcDocument$PassportRaw.f98472c) && Intrinsics.f(this.d, nfcDocument$PassportRaw.d) && Intrinsics.f(this.e, nfcDocument$PassportRaw.e) && Intrinsics.f(this.f, nfcDocument$PassportRaw.f) && Intrinsics.f(this.f98473g, nfcDocument$PassportRaw.f98473g) && Intrinsics.f(this.f98474h, nfcDocument$PassportRaw.f98474h) && Intrinsics.f(this.i, nfcDocument$PassportRaw.i) && Intrinsics.f(this.f98475j, nfcDocument$PassportRaw.f98475j) && Intrinsics.f(this.k, nfcDocument$PassportRaw.k) && Intrinsics.f(this.f98476l, nfcDocument$PassportRaw.f98476l) && Intrinsics.f(this.f98477m, nfcDocument$PassportRaw.f98477m) && Intrinsics.f(this.f98478n, nfcDocument$PassportRaw.f98478n) && Intrinsics.f(this.o, nfcDocument$PassportRaw.o) && Intrinsics.f(this.f98479p, nfcDocument$PassportRaw.f98479p);
    }

    public final int hashCode() {
        List list = this.f98470a;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        List list2 = this.f98471b;
        int iHashCode2 = (iHashCode + (list2 == null ? 0 : list2.hashCode())) * 31;
        List list3 = this.f98472c;
        int iHashCode3 = (iHashCode2 + (list3 == null ? 0 : list3.hashCode())) * 31;
        List list4 = this.d;
        int iHashCode4 = (iHashCode3 + (list4 == null ? 0 : list4.hashCode())) * 31;
        List list5 = this.e;
        int iHashCode5 = (iHashCode4 + (list5 == null ? 0 : list5.hashCode())) * 31;
        List list6 = this.f;
        int iHashCode6 = (iHashCode5 + (list6 == null ? 0 : list6.hashCode())) * 31;
        List list7 = this.f98473g;
        int iHashCode7 = (iHashCode6 + (list7 == null ? 0 : list7.hashCode())) * 31;
        List list8 = this.f98474h;
        int iHashCode8 = (iHashCode7 + (list8 == null ? 0 : list8.hashCode())) * 31;
        List list9 = this.i;
        int iHashCode9 = (iHashCode8 + (list9 == null ? 0 : list9.hashCode())) * 31;
        List list10 = this.f98475j;
        int iHashCode10 = (iHashCode9 + (list10 == null ? 0 : list10.hashCode())) * 31;
        List list11 = this.k;
        int iHashCode11 = (iHashCode10 + (list11 == null ? 0 : list11.hashCode())) * 31;
        List list12 = this.f98476l;
        int iHashCode12 = (iHashCode11 + (list12 == null ? 0 : list12.hashCode())) * 31;
        List list13 = this.f98477m;
        int iHashCode13 = (iHashCode12 + (list13 == null ? 0 : list13.hashCode())) * 31;
        List list14 = this.f98478n;
        int iHashCode14 = (iHashCode13 + (list14 == null ? 0 : list14.hashCode())) * 31;
        List list15 = this.o;
        int iHashCode15 = (iHashCode14 + (list15 == null ? 0 : list15.hashCode())) * 31;
        List list16 = this.f98479p;
        return iHashCode15 + (list16 != null ? list16.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        List list = this.f98470a;
        if (list == null) {
            dest.writeInt(0);
        } else {
            Iterator itQ = v0.a.q(dest, 1, list);
            while (itQ.hasNext()) {
                dest.writeByte(((Number) itQ.next()).byteValue());
            }
        }
        List list2 = this.f98471b;
        if (list2 == null) {
            dest.writeInt(0);
        } else {
            Iterator itQ2 = v0.a.q(dest, 1, list2);
            while (itQ2.hasNext()) {
                dest.writeByte(((Number) itQ2.next()).byteValue());
            }
        }
        List list3 = this.f98472c;
        if (list3 == null) {
            dest.writeInt(0);
        } else {
            Iterator itQ3 = v0.a.q(dest, 1, list3);
            while (itQ3.hasNext()) {
                dest.writeByte(((Number) itQ3.next()).byteValue());
            }
        }
        List list4 = this.d;
        if (list4 == null) {
            dest.writeInt(0);
        } else {
            Iterator itQ4 = v0.a.q(dest, 1, list4);
            while (itQ4.hasNext()) {
                dest.writeByte(((Number) itQ4.next()).byteValue());
            }
        }
        List list5 = this.e;
        if (list5 == null) {
            dest.writeInt(0);
        } else {
            Iterator itQ5 = v0.a.q(dest, 1, list5);
            while (itQ5.hasNext()) {
                dest.writeByte(((Number) itQ5.next()).byteValue());
            }
        }
        List list6 = this.f;
        if (list6 == null) {
            dest.writeInt(0);
        } else {
            Iterator itQ6 = v0.a.q(dest, 1, list6);
            while (itQ6.hasNext()) {
                dest.writeByte(((Number) itQ6.next()).byteValue());
            }
        }
        List list7 = this.f98473g;
        if (list7 == null) {
            dest.writeInt(0);
        } else {
            Iterator itQ7 = v0.a.q(dest, 1, list7);
            while (itQ7.hasNext()) {
                dest.writeByte(((Number) itQ7.next()).byteValue());
            }
        }
        List list8 = this.f98474h;
        if (list8 == null) {
            dest.writeInt(0);
        } else {
            Iterator itQ8 = v0.a.q(dest, 1, list8);
            while (itQ8.hasNext()) {
                dest.writeByte(((Number) itQ8.next()).byteValue());
            }
        }
        List list9 = this.i;
        if (list9 == null) {
            dest.writeInt(0);
        } else {
            Iterator itQ9 = v0.a.q(dest, 1, list9);
            while (itQ9.hasNext()) {
                dest.writeByte(((Number) itQ9.next()).byteValue());
            }
        }
        List list10 = this.f98475j;
        if (list10 == null) {
            dest.writeInt(0);
        } else {
            Iterator itQ10 = v0.a.q(dest, 1, list10);
            while (itQ10.hasNext()) {
                dest.writeByte(((Number) itQ10.next()).byteValue());
            }
        }
        List list11 = this.k;
        if (list11 == null) {
            dest.writeInt(0);
        } else {
            Iterator itQ11 = v0.a.q(dest, 1, list11);
            while (itQ11.hasNext()) {
                dest.writeByte(((Number) itQ11.next()).byteValue());
            }
        }
        List list12 = this.f98476l;
        if (list12 == null) {
            dest.writeInt(0);
        } else {
            Iterator itQ12 = v0.a.q(dest, 1, list12);
            while (itQ12.hasNext()) {
                dest.writeByte(((Number) itQ12.next()).byteValue());
            }
        }
        List list13 = this.f98477m;
        if (list13 == null) {
            dest.writeInt(0);
        } else {
            Iterator itQ13 = v0.a.q(dest, 1, list13);
            while (itQ13.hasNext()) {
                dest.writeByte(((Number) itQ13.next()).byteValue());
            }
        }
        List list14 = this.f98478n;
        if (list14 == null) {
            dest.writeInt(0);
        } else {
            Iterator itQ14 = v0.a.q(dest, 1, list14);
            while (itQ14.hasNext()) {
                dest.writeByte(((Number) itQ14.next()).byteValue());
            }
        }
        List list15 = this.o;
        if (list15 == null) {
            dest.writeInt(0);
        } else {
            Iterator itQ15 = v0.a.q(dest, 1, list15);
            while (itQ15.hasNext()) {
                dest.writeByte(((Number) itQ15.next()).byteValue());
            }
        }
        List list16 = this.f98479p;
        if (list16 == null) {
            dest.writeInt(0);
            return;
        }
        Iterator itQ16 = v0.a.q(dest, 1, list16);
        while (itQ16.hasNext()) {
            dest.writeByte(((Number) itQ16.next()).byteValue());
        }
    }
}
