package h0k;

import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import mlm.g;
import org.jetbrains.annotations.NotNull;
import qlm.j1;
import yhm.j;
import yhm.k;

/* JADX INFO: loaded from: classes11.dex */
@g
public final class c {

    @NotNull
    public static final b Companion = new b();
    public static final Lazy[] k;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f148419a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f148420b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f148421c;
    public final String d;
    public final String e;
    public final String f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Integer f148422g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f148423h;
    public final List i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final List f148424j;

    static {
        k kVar = k.PUBLICATION;
        k = new Lazy[]{null, null, null, null, null, null, null, null, j.c(kVar, new gx2.a(12)), j.c(kVar, new gx2.a(13))};
    }

    public /* synthetic */ c(int i, String str, String str2, String str3, String str4, String str5, String str6, Integer num, String str7, List list, List list2) {
        if (935 != (i & 935)) {
            j1.f(a.f148418a.getDescriptor(), i, 935);
            throw null;
        }
        this.f148419a = str;
        this.f148420b = str2;
        this.f148421c = str3;
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = str4;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = str5;
        }
        this.f = str6;
        if ((i & 64) == 0) {
            this.f148422g = null;
        } else {
            this.f148422g = num;
        }
        this.f148423h = str7;
        this.i = list;
        this.f148424j = list2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f148419a, cVar.f148419a) && Intrinsics.f(this.f148420b, cVar.f148420b) && Intrinsics.f(this.f148421c, cVar.f148421c) && Intrinsics.f(this.d, cVar.d) && Intrinsics.f(this.e, cVar.e) && Intrinsics.f(this.f, cVar.f) && Intrinsics.f(this.f148422g, cVar.f148422g) && Intrinsics.f(this.f148423h, cVar.f148423h) && Intrinsics.f(this.i, cVar.i) && Intrinsics.f(this.f148424j, cVar.f148424j);
    }

    public final int hashCode() {
        int iC = p.a.c(p.a.c(this.f148419a.hashCode() * 31, 31, this.f148420b), 31, this.f148421c);
        String str = this.d;
        int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.e;
        int iC2 = p.a.c((iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.f);
        Integer num = this.f148422g;
        return this.f148424j.hashCode() + p.a.d(p.a.c((iC2 + (num != null ? num.hashCode() : 0)) * 31, 31, this.f148423h), 31, this.i);
    }
}
