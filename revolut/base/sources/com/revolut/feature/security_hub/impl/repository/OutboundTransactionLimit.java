package com.revolut.feature.security_hub.impl.repository;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.security_hub.impl.interactor.FeatureItem;
import cuc.e;
import cuc.f;
import cuc.g;
import cuc.h;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0081\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/security_hub/impl/repository/OutboundTransactionLimit;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_security_hub_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class OutboundTransactionLimit implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<OutboundTransactionLimit> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f f85475a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LimitValue f85476b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final LimitValue f85477c;
    public final g d;
    public final String e;
    public final String f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f85478g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f85479h;
    public final h i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final e f85480j;
    public final List k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final LimitValue f85481l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final Integer f85482m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final Integer f85483n;
    public final boolean o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final List f85484p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final OutboundTransactionLimitDeviceCooldown f85485q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final Boolean f85486r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final ReadOnlyDialog f85487s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final boolean f85488t;
    public final String u;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            LimitValue limitValue;
            ArrayList arrayList2;
            g gVar;
            LimitValue limitValue2;
            boolean z;
            Boolean boolValueOf;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            f fVarValueOf = f.valueOf(parcel.readString());
            Class<OutboundTransactionLimit> cls = OutboundTransactionLimit.class;
            LimitValue limitValue3 = (LimitValue) parcel.readParcelable(cls.getClassLoader());
            LimitValue limitValue4 = (LimitValue) parcel.readParcelable(cls.getClassLoader());
            g gVarValueOf = parcel.readInt() == 0 ? null : g.valueOf(parcel.readString());
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            h hVarValueOf = h.valueOf(parcel.readString());
            e eVarValueOf = e.valueOf(parcel.readString());
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i = parcel.readInt();
                ArrayList arrayList3 = new ArrayList(i);
                int iA = 0;
                while (iA != i) {
                    iA = org.bouncycastle.jcajce.provider.digest.a.a(FeatureItem.CREATOR, parcel, arrayList3, iA, 1);
                    cls = cls;
                }
                arrayList = arrayList3;
            }
            LimitValue limitValue5 = (LimitValue) parcel.readParcelable(cls.getClassLoader());
            Integer numValueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            Integer numValueOf2 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            boolean z3 = parcel.readInt() != 0;
            if (parcel.readInt() == 0) {
                limitValue = limitValue5;
                gVar = gVarValueOf;
                limitValue2 = limitValue3;
                z = true;
                arrayList2 = null;
            } else {
                int i2 = parcel.readInt();
                limitValue = limitValue5;
                arrayList2 = new ArrayList(i2);
                gVar = gVarValueOf;
                int iA2 = 0;
                while (iA2 != i2) {
                    iA2 = org.bouncycastle.jcajce.provider.digest.a.a(OutboundTransactionLimitGroupConfig.CREATOR, parcel, arrayList2, iA2, 1);
                    fVarValueOf = fVarValueOf;
                    limitValue3 = limitValue3;
                }
                limitValue2 = limitValue3;
                z = true;
            }
            f fVar = fVarValueOf;
            OutboundTransactionLimitDeviceCooldown outboundTransactionLimitDeviceCooldownCreateFromParcel = parcel.readInt() == 0 ? null : OutboundTransactionLimitDeviceCooldown.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0 ? z : false);
            }
            return new OutboundTransactionLimit(fVar, limitValue2, limitValue4, gVar, string, string2, string3, string4, hVarValueOf, eVarValueOf, arrayList, limitValue, numValueOf, numValueOf2, z3, arrayList2, outboundTransactionLimitDeviceCooldownCreateFromParcel, boolValueOf, parcel.readInt() == 0 ? null : ReadOnlyDialog.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? z : false, parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new OutboundTransactionLimit[i];
        }
    }

    public OutboundTransactionLimit(f status, LimitValue max, LimitValue used, g gVar, String name, String label, String str, String icon, h type, e category, List list, LimitValue limitValue, Integer num, Integer num2, boolean z, List list2, OutboundTransactionLimitDeviceCooldown outboundTransactionLimitDeviceCooldown, Boolean bool, ReadOnlyDialog readOnlyDialog, boolean z3, String str2) {
        Intrinsics.checkNotNullParameter(status, "status");
        Intrinsics.checkNotNullParameter(max, "max");
        Intrinsics.checkNotNullParameter(used, "used");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(label, "label");
        Intrinsics.checkNotNullParameter(icon, "icon");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(category, "category");
        this.f85475a = status;
        this.f85476b = max;
        this.f85477c = used;
        this.d = gVar;
        this.e = name;
        this.f = label;
        this.f85478g = str;
        this.f85479h = icon;
        this.i = type;
        this.f85480j = category;
        this.k = list;
        this.f85481l = limitValue;
        this.f85482m = num;
        this.f85483n = num2;
        this.o = z;
        this.f85484p = list2;
        this.f85485q = outboundTransactionLimitDeviceCooldown;
        this.f85486r = bool;
        this.f85487s = readOnlyDialog;
        this.f85488t = z3;
        this.u = str2;
    }

    public static OutboundTransactionLimit a(OutboundTransactionLimit outboundTransactionLimit, LimitValue limitValue, String str, h hVar, int i) {
        f status = outboundTransactionLimit.f85475a;
        LimitValue max = (i & 2) != 0 ? outboundTransactionLimit.f85476b : limitValue;
        LimitValue used = outboundTransactionLimit.f85477c;
        g gVar = outboundTransactionLimit.d;
        String name = (i & 16) != 0 ? outboundTransactionLimit.e : str;
        String label = outboundTransactionLimit.f;
        String str2 = outboundTransactionLimit.f85478g;
        String icon = outboundTransactionLimit.f85479h;
        h type = (i & 256) != 0 ? outboundTransactionLimit.i : hVar;
        e category = outboundTransactionLimit.f85480j;
        List list = outboundTransactionLimit.k;
        LimitValue limitValue2 = outboundTransactionLimit.f85481l;
        Integer num = outboundTransactionLimit.f85482m;
        Integer num2 = outboundTransactionLimit.f85483n;
        boolean z = outboundTransactionLimit.o;
        List list2 = outboundTransactionLimit.f85484p;
        OutboundTransactionLimitDeviceCooldown outboundTransactionLimitDeviceCooldown = outboundTransactionLimit.f85485q;
        Boolean bool = outboundTransactionLimit.f85486r;
        ReadOnlyDialog readOnlyDialog = outboundTransactionLimit.f85487s;
        boolean z3 = outboundTransactionLimit.f85488t;
        String str3 = outboundTransactionLimit.u;
        outboundTransactionLimit.getClass();
        Intrinsics.checkNotNullParameter(status, "status");
        Intrinsics.checkNotNullParameter(max, "max");
        Intrinsics.checkNotNullParameter(used, "used");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(label, "label");
        Intrinsics.checkNotNullParameter(icon, "icon");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(category, "category");
        return new OutboundTransactionLimit(status, max, used, gVar, name, label, str2, icon, type, category, list, limitValue2, num, num2, z, list2, outboundTransactionLimitDeviceCooldown, bool, readOnlyDialog, z3, str3);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof OutboundTransactionLimit)) {
            return false;
        }
        OutboundTransactionLimit outboundTransactionLimit = (OutboundTransactionLimit) obj2;
        return this.f85475a == outboundTransactionLimit.f85475a && Intrinsics.f(this.f85476b, outboundTransactionLimit.f85476b) && Intrinsics.f(this.f85477c, outboundTransactionLimit.f85477c) && this.d == outboundTransactionLimit.d && Intrinsics.f(this.e, outboundTransactionLimit.e) && Intrinsics.f(this.f, outboundTransactionLimit.f) && Intrinsics.f(this.f85478g, outboundTransactionLimit.f85478g) && Intrinsics.f(this.f85479h, outboundTransactionLimit.f85479h) && this.i == outboundTransactionLimit.i && this.f85480j == outboundTransactionLimit.f85480j && Intrinsics.f(this.k, outboundTransactionLimit.k) && Intrinsics.f(this.f85481l, outboundTransactionLimit.f85481l) && Intrinsics.f(this.f85482m, outboundTransactionLimit.f85482m) && Intrinsics.f(this.f85483n, outboundTransactionLimit.f85483n) && this.o == outboundTransactionLimit.o && Intrinsics.f(this.f85484p, outboundTransactionLimit.f85484p) && Intrinsics.f(this.f85485q, outboundTransactionLimit.f85485q) && Intrinsics.f(this.f85486r, outboundTransactionLimit.f85486r) && Intrinsics.f(this.f85487s, outboundTransactionLimit.f85487s) && this.f85488t == outboundTransactionLimit.f85488t && Intrinsics.f(this.u, outboundTransactionLimit.u);
    }

    public final int hashCode() {
        int iHashCode = (this.f85477c.hashCode() + ((this.f85476b.hashCode() + (this.f85475a.hashCode() * 31)) * 31)) * 31;
        g gVar = this.d;
        int iC = p.a.c(p.a.c((iHashCode + (gVar == null ? 0 : gVar.hashCode())) * 31, 31, this.e), 31, this.f);
        String str = this.f85478g;
        int iHashCode2 = (this.f85480j.hashCode() + ((this.i.hashCode() + p.a.c((iC + (str == null ? 0 : str.hashCode())) * 31, 31, this.f85479h)) * 31)) * 31;
        List list = this.k;
        int iHashCode3 = (iHashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        LimitValue limitValue = this.f85481l;
        int iHashCode4 = (iHashCode3 + (limitValue == null ? 0 : limitValue.hashCode())) * 31;
        Integer num = this.f85482m;
        int iHashCode5 = (iHashCode4 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.f85483n;
        int iC2 = j6.a.c((iHashCode5 + (num2 == null ? 0 : num2.hashCode())) * 31, 31, this.o);
        List list2 = this.f85484p;
        int iHashCode6 = (iC2 + (list2 == null ? 0 : list2.hashCode())) * 31;
        OutboundTransactionLimitDeviceCooldown outboundTransactionLimitDeviceCooldown = this.f85485q;
        int iHashCode7 = (iHashCode6 + (outboundTransactionLimitDeviceCooldown == null ? 0 : outboundTransactionLimitDeviceCooldown.hashCode())) * 31;
        Boolean bool = this.f85486r;
        int iHashCode8 = (iHashCode7 + (bool == null ? 0 : bool.hashCode())) * 31;
        ReadOnlyDialog readOnlyDialog = this.f85487s;
        int iC3 = j6.a.c((iHashCode8 + (readOnlyDialog == null ? 0 : readOnlyDialog.hashCode())) * 31, 31, this.f85488t);
        String str2 = this.u;
        return iC3 + (str2 != null ? str2.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f85475a.name());
        dest.writeParcelable(this.f85476b, i);
        dest.writeParcelable(this.f85477c, i);
        g gVar = this.d;
        if (gVar == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(gVar.name());
        }
        dest.writeString(this.e);
        dest.writeString(this.f);
        dest.writeString(this.f85478g);
        dest.writeString(this.f85479h);
        dest.writeString(this.i.name());
        dest.writeString(this.f85480j.name());
        List list = this.k;
        if (list == null) {
            dest.writeInt(0);
        } else {
            Iterator itQ = v0.a.q(dest, 1, list);
            while (itQ.hasNext()) {
                ((FeatureItem) itQ.next()).writeToParcel(dest, i);
            }
        }
        dest.writeParcelable(this.f85481l, i);
        Integer num = this.f85482m;
        if (num == null) {
            dest.writeInt(0);
        } else {
            p.a.B(dest, 1, num);
        }
        Integer num2 = this.f85483n;
        if (num2 == null) {
            dest.writeInt(0);
        } else {
            p.a.B(dest, 1, num2);
        }
        dest.writeInt(this.o ? 1 : 0);
        List list2 = this.f85484p;
        if (list2 == null) {
            dest.writeInt(0);
        } else {
            Iterator itQ2 = v0.a.q(dest, 1, list2);
            while (itQ2.hasNext()) {
                ((OutboundTransactionLimitGroupConfig) itQ2.next()).writeToParcel(dest, i);
            }
        }
        OutboundTransactionLimitDeviceCooldown outboundTransactionLimitDeviceCooldown = this.f85485q;
        if (outboundTransactionLimitDeviceCooldown == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            outboundTransactionLimitDeviceCooldown.writeToParcel(dest, i);
        }
        Boolean bool = this.f85486r;
        if (bool == null) {
            dest.writeInt(0);
        } else {
            p.a.A(dest, 1, bool);
        }
        ReadOnlyDialog readOnlyDialog = this.f85487s;
        if (readOnlyDialog == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            readOnlyDialog.writeToParcel(dest, i);
        }
        dest.writeInt(this.f85488t ? 1 : 0);
        dest.writeString(this.u);
    }
}
