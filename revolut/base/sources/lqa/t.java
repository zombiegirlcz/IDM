package lqa;

import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes5.dex */
@mlm.g
public final class t {

    @NotNull
    public static final s Companion = new s();
    public static final Lazy[] k = {null, null, null, null, null, null, null, null, null, yhm.j.c(yhm.k.PUBLICATION, new lkf.f0(10))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f199270a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f199271b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f199272c;
    public final String d;
    public final String e;
    public final String f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f199273g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f199274h;
    public final w i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final List f199275j;

    public /* synthetic */ t(int i, boolean z, boolean z3, String str, String str2, String str3, String str4, String str5, boolean z4, w wVar, List list) {
        if (1023 != (i & 1023)) {
            j1.f(r.f199269a.getDescriptor(), i, 1023);
            throw null;
        }
        this.f199270a = z;
        this.f199271b = z3;
        this.f199272c = str;
        this.d = str2;
        this.e = str3;
        this.f = str4;
        this.f199273g = str5;
        this.f199274h = z4;
        this.i = wVar;
        this.f199275j = list;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof t)) {
            return false;
        }
        t tVar = (t) obj2;
        return this.f199270a == tVar.f199270a && this.f199271b == tVar.f199271b && Intrinsics.f(this.f199272c, tVar.f199272c) && Intrinsics.f(this.d, tVar.d) && Intrinsics.f(this.e, tVar.e) && Intrinsics.f(this.f, tVar.f) && Intrinsics.f(this.f199273g, tVar.f199273g) && this.f199274h == tVar.f199274h && Intrinsics.f(this.i, tVar.i) && Intrinsics.f(this.f199275j, tVar.f199275j);
    }

    public final int hashCode() {
        int iC = p.a.c(p.a.c(p.a.c(p.a.c(j6.a.c(Boolean.hashCode(this.f199270a) * 31, 31, this.f199271b), 31, this.f199272c), 31, this.d), 31, this.e), 31, this.f);
        String str = this.f199273g;
        int iC2 = j6.a.c((iC + (str == null ? 0 : str.hashCode())) * 31, 31, this.f199274h);
        w wVar = this.i;
        int iHashCode = (iC2 + (wVar == null ? 0 : Integer.hashCode(wVar.f199277a))) * 31;
        List list = this.f199275j;
        return iHashCode + (list != null ? list.hashCode() : 0);
    }
}
