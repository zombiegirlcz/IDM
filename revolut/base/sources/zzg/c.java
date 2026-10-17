package zzg;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f326730a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f326731b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f326732c;
    public final String d;
    public final String e;
    public final List f;

    public c(String title, String str, String str2, List topHoldings, String str3, String str4) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(topHoldings, "topHoldings");
        this.f326730a = title;
        this.f326731b = str;
        this.f326732c = str2;
        this.d = str3;
        this.e = str4;
        this.f = topHoldings;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f326730a, cVar.f326730a) && Intrinsics.f(this.f326731b, cVar.f326731b) && Intrinsics.f(this.f326732c, cVar.f326732c) && Intrinsics.f(this.d, cVar.d) && Intrinsics.f(this.e, cVar.e) && Intrinsics.f(this.f, cVar.f);
    }

    public final int hashCode() {
        int iHashCode = this.f326730a.hashCode() * 31;
        String str = this.f326731b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f326732c;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.d;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.e;
        return this.f.hashCode() + ((iHashCode4 + (str4 != null ? str4.hashCode() : 0)) * 31);
    }
}
