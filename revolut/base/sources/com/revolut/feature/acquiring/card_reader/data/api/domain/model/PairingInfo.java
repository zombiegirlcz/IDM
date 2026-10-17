package com.revolut.feature.acquiring.card_reader.data.api.domain.model;

import android.os.Parcel;
import android.os.Parcelable;
import dj0.d;
import fa1.f;
import fa1.k;
import ip0.v7;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/acquiring/card_reader/data/api/domain/model/PairingInfo;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_acquiring_card_reader_data_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class PairingInfo implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<PairingInfo> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f60566a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f60567b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f60568c;
    public final boolean d;
    public final boolean e;
    public final boolean f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f60569g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f60570h;
    public final boolean i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final boolean f60571j;
    public final String k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final int f60572l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final f f60573m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final d f60574n;
    public final k o;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            boolean z;
            boolean z3;
            boolean z4;
            boolean z6;
            boolean z11;
            boolean z12;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String string = parcel.readString();
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            for (int i2 = 0; i2 != i; i2++) {
                arrayList.add(Integer.valueOf(parcel.readInt()));
            }
            int i3 = parcel.readInt();
            boolean z29 = false;
            ArrayList arrayList2 = new ArrayList(i3);
            for (int i5 = 0; i5 != i3; i5++) {
                arrayList2.add(Integer.valueOf(parcel.readInt()));
            }
            boolean z31 = true;
            if (parcel.readInt() != 0) {
                z = false;
                z29 = true;
            } else {
                z = false;
            }
            if (parcel.readInt() != 0) {
                z3 = true;
            } else {
                z3 = true;
                z31 = z;
            }
            if (parcel.readInt() != 0) {
                z4 = z3;
            } else {
                z4 = z3;
                z3 = z;
            }
            if (parcel.readInt() != 0) {
                z6 = z4;
            } else {
                z6 = z4;
                z4 = z;
            }
            if (parcel.readInt() != 0) {
                z11 = z6;
            } else {
                z11 = z6;
                z6 = z;
            }
            if (parcel.readInt() != 0) {
                z12 = z11;
            } else {
                z12 = z11;
                z11 = z;
            }
            if (parcel.readInt() == 0) {
                z12 = z;
            }
            return new PairingInfo(string, arrayList, arrayList2, z29, z31, z3, z4, z6, z11, z12, parcel.readString(), parcel.readInt(), f.valueOf(parcel.readString()), (d) parcel.readSerializable(), k.valueOf(parcel.readString()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new PairingInfo[i];
        }
    }

    public PairingInfo(String terminalId, List plainEmvTags, List securedEmvTags, boolean z, boolean z3, boolean z4, boolean z6, boolean z11, boolean z12, boolean z29, String locale, int i, f captureMode, d transactionLimit, k logLevel) {
        Intrinsics.checkNotNullParameter(terminalId, "terminalId");
        Intrinsics.checkNotNullParameter(plainEmvTags, "plainEmvTags");
        Intrinsics.checkNotNullParameter(securedEmvTags, "securedEmvTags");
        Intrinsics.checkNotNullParameter(locale, "locale");
        Intrinsics.checkNotNullParameter(captureMode, "captureMode");
        Intrinsics.checkNotNullParameter(transactionLimit, "transactionLimit");
        Intrinsics.checkNotNullParameter(logLevel, "logLevel");
        this.f60566a = terminalId;
        this.f60567b = plainEmvTags;
        this.f60568c = securedEmvTags;
        this.d = z;
        this.e = z3;
        this.f = z4;
        this.f60569g = z6;
        this.f60570h = z11;
        this.i = z12;
        this.f60571j = z29;
        this.k = locale;
        this.f60572l = i;
        this.f60573m = captureMode;
        this.f60574n = transactionLimit;
        this.o = logLevel;
    }

    public final boolean a() {
        return this.d | this.e | this.f | this.f60569g | this.f60570h | this.i | this.f60571j;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof PairingInfo)) {
            return false;
        }
        PairingInfo pairingInfo = (PairingInfo) obj2;
        return Intrinsics.f(this.f60566a, pairingInfo.f60566a) && Intrinsics.f(this.f60567b, pairingInfo.f60567b) && Intrinsics.f(this.f60568c, pairingInfo.f60568c) && this.d == pairingInfo.d && this.e == pairingInfo.e && this.f == pairingInfo.f && this.f60569g == pairingInfo.f60569g && this.f60570h == pairingInfo.f60570h && this.i == pairingInfo.i && this.f60571j == pairingInfo.f60571j && Intrinsics.f(this.k, pairingInfo.k) && this.f60572l == pairingInfo.f60572l && this.f60573m == pairingInfo.f60573m && Intrinsics.f(this.f60574n, pairingInfo.f60574n) && this.o == pairingInfo.o;
    }

    public final int hashCode() {
        return this.o.hashCode() + v7.c((this.f60573m.hashCode() + j6.a.b(this.f60572l, p.a.c(j6.a.c(j6.a.c(j6.a.c(j6.a.c(j6.a.c(j6.a.c(j6.a.c(p.a.d(p.a.d(this.f60566a.hashCode() * 31, 31, this.f60567b), 31, this.f60568c), 31, this.d), 31, this.e), 31, this.f), 31, this.f60569g), 31, this.f60570h), 31, this.i), 31, this.f60571j), 31, this.k), 31)) * 31, 31, this.f60574n);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f60566a);
        Iterator itV = p.a.v(this.f60567b, dest);
        while (itV.hasNext()) {
            dest.writeInt(((Number) itV.next()).intValue());
        }
        Iterator itV2 = p.a.v(this.f60568c, dest);
        while (itV2.hasNext()) {
            dest.writeInt(((Number) itV2.next()).intValue());
        }
        dest.writeInt(this.d ? 1 : 0);
        dest.writeInt(this.e ? 1 : 0);
        dest.writeInt(this.f ? 1 : 0);
        dest.writeInt(this.f60569g ? 1 : 0);
        dest.writeInt(this.f60570h ? 1 : 0);
        dest.writeInt(this.i ? 1 : 0);
        dest.writeInt(this.f60571j ? 1 : 0);
        dest.writeString(this.k);
        dest.writeInt(this.f60572l);
        dest.writeString(this.f60573m.name());
        dest.writeSerializable(this.f60574n);
        dest.writeString(this.o.name());
    }
}
