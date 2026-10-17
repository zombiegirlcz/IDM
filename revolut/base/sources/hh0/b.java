package hh0;

import androidx.collection.ArrayMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f152238a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map f152239b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f152240c;
    public final String d;
    public final String e;
    public final String f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final a f152241g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f152242h;
    public final int i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f152243j;
    public final long k;

    public b(String str, ArrayMap data, String str2, String str3, String str4, String str5, a aVar, int i, int i2, int i3, long j2) {
        Intrinsics.checkNotNullParameter(data, "data");
        this.f152238a = str;
        this.f152239b = data;
        this.f152240c = str2;
        this.d = str3;
        this.e = str4;
        this.f = str5;
        this.f152241g = aVar;
        this.f152242h = i;
        this.i = i2;
        this.f152243j = i3;
        this.k = j2;
    }

    public final Map a() {
        return this.f152239b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f152238a, bVar.f152238a) && Intrinsics.f(this.f152239b, bVar.f152239b) && Intrinsics.f(this.f152240c, bVar.f152240c) && Intrinsics.f(this.d, bVar.d) && Intrinsics.f(this.e, bVar.e) && Intrinsics.f(this.f, bVar.f) && Intrinsics.f(this.f152241g, bVar.f152241g) && this.f152242h == bVar.f152242h && this.i == bVar.i && this.f152243j == bVar.f152243j && this.k == bVar.k;
    }

    public final int hashCode() {
        String str = this.f152238a;
        int iE = p.a.e((str == null ? 0 : str.hashCode()) * 31, 31, this.f152239b);
        String str2 = this.f152240c;
        int iHashCode = (iE + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.d;
        int iHashCode2 = (iHashCode + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.e;
        int iHashCode3 = (iHashCode2 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f;
        int iHashCode4 = (iHashCode3 + (str5 == null ? 0 : str5.hashCode())) * 31;
        a aVar = this.f152241g;
        return Long.hashCode(this.k) + j6.a.b(this.f152243j, j6.a.b(this.i, j6.a.b(this.f152242h, (iHashCode4 + (aVar != null ? aVar.hashCode() : 0)) * 31, 31), 31), 31);
    }
}
