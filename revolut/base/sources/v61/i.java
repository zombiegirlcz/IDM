package v61;

import com.revolut.domain.models.moneyrequest.SplitBillItemType;
import java.io.Serializable;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class i implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f286293a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final SplitBillItemType f286294b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f286295c;
    public final String d;
    public final Long e;
    public final String f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ArrayList f286296g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f286297h;
    public final String i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final String f286298j;

    public i(String id10, SplitBillItemType type, String str, String str2, Long l2, String str3, ArrayList arrayList, String str4, String str5, String str6, int i) {
        str = (i & 4) != 0 ? null : str;
        str2 = (i & 8) != 0 ? null : str2;
        l2 = (i & 16) != 0 ? null : l2;
        str3 = (i & 32) != 0 ? null : str3;
        str4 = (i & 128) != 0 ? null : str4;
        str5 = (i & 256) != 0 ? null : str5;
        str6 = (i & 512) != 0 ? null : str6;
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(type, "type");
        this.f286293a = id10;
        this.f286294b = type;
        this.f286295c = str;
        this.d = str2;
        this.e = l2;
        this.f = str3;
        this.f286296g = arrayList;
        this.f286297h = str4;
        this.i = str5;
        this.f286298j = str6;
    }

    public final String a() {
        return this.f286295c;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return Intrinsics.f(this.f286293a, iVar.f286293a) && this.f286294b == iVar.f286294b && Intrinsics.f(this.f286295c, iVar.f286295c) && Intrinsics.f(this.d, iVar.d) && Intrinsics.f(this.e, iVar.e) && Intrinsics.f(this.f, iVar.f) && Intrinsics.f(this.f286296g, iVar.f286296g) && Intrinsics.f(this.f286297h, iVar.f286297h) && Intrinsics.f(this.i, iVar.i) && Intrinsics.f(this.f286298j, iVar.f286298j);
    }

    public final int hashCode() {
        int iHashCode = (this.f286294b.hashCode() + (this.f286293a.hashCode() * 31)) * 31;
        String str = this.f286295c;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.d;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Long l2 = this.e;
        int iHashCode4 = (iHashCode3 + (l2 == null ? 0 : l2.hashCode())) * 31;
        String str3 = this.f;
        int iHashCode5 = (iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        ArrayList arrayList = this.f286296g;
        int iHashCode6 = (iHashCode5 + (arrayList == null ? 0 : arrayList.hashCode())) * 31;
        String str4 = this.f286297h;
        int iHashCode7 = (iHashCode6 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.i;
        int iHashCode8 = (iHashCode7 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.f286298j;
        return iHashCode8 + (str6 != null ? str6.hashCode() : 0);
    }
}
