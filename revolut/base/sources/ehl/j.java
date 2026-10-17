package ehl;

import kotlin.jvm.internal.Intrinsics;
import org.joda.time.DateTime;

/* JADX INFO: loaded from: classes12.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f126255a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f126256b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final DateTime f126257c;
    public final DateTime d;
    public final String e;
    public final String f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f126258g;

    public j(String symbol, String ref2, DateTime dateTime, DateTime dateTime2, String str, String str2, String str3) {
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        Intrinsics.checkNotNullParameter(ref2, "ref");
        this.f126255a = symbol;
        this.f126256b = ref2;
        this.f126257c = dateTime;
        this.d = dateTime2;
        this.e = str;
        this.f = str2;
        this.f126258g = str3;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof j)) {
            return false;
        }
        j jVar = (j) obj2;
        return Intrinsics.f(this.f126255a, jVar.f126255a) && Intrinsics.f(this.f126256b, jVar.f126256b) && Intrinsics.f(this.f126257c, jVar.f126257c) && Intrinsics.f(this.d, jVar.d) && Intrinsics.f(this.e, jVar.e) && Intrinsics.f(this.f, jVar.f) && Intrinsics.f(this.f126258g, jVar.f126258g);
    }

    public final int hashCode() {
        int iC = p.a.c(this.f126255a.hashCode() * 31, 31, this.f126256b);
        DateTime dateTime = this.f126257c;
        int iHashCode = (iC + (dateTime == null ? 0 : dateTime.hashCode())) * 31;
        DateTime dateTime2 = this.d;
        int iHashCode2 = (iHashCode + (dateTime2 == null ? 0 : dateTime2.hashCode())) * 31;
        String str = this.e;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f126258g;
        return iHashCode4 + (str3 != null ? str3.hashCode() : 0);
    }
}
