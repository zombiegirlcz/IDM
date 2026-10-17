package quj;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes11.dex */
@mlm.g
public final class k {

    @NotNull
    public static final j Companion = new j();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f249471a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f249472b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f249473c;
    public final String d;
    public final String e;
    public final String f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final m1c.m f249474g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final no3.b f249475h;
    public final String i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final String f249476j;
    public final String k;

    public /* synthetic */ k(int i, String str, boolean z, String str2, String str3, String str4, String str5, m1c.m mVar, no3.b bVar, String str6, String str7, String str8) {
        if (2047 != (i & 2047)) {
            j1.f(i.f249470a.getDescriptor(), i, 2047);
            throw null;
        }
        this.f249471a = str;
        this.f249472b = z;
        this.f249473c = str2;
        this.d = str3;
        this.e = str4;
        this.f = str5;
        this.f249474g = mVar;
        this.f249475h = bVar;
        this.i = str6;
        this.f249476j = str7;
        this.k = str8;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof k)) {
            return false;
        }
        k kVar = (k) obj2;
        return Intrinsics.f(this.f249471a, kVar.f249471a) && this.f249472b == kVar.f249472b && Intrinsics.f(this.f249473c, kVar.f249473c) && Intrinsics.f(this.d, kVar.d) && Intrinsics.f(this.e, kVar.e) && Intrinsics.f(this.f, kVar.f) && Intrinsics.f(this.f249474g, kVar.f249474g) && Intrinsics.f(this.f249475h, kVar.f249475h) && Intrinsics.f(this.i, kVar.i) && Intrinsics.f(this.f249476j, kVar.f249476j) && Intrinsics.f(this.k, kVar.k);
    }

    public final int hashCode() {
        int iC = j6.a.c(this.f249471a.hashCode() * 31, 31, this.f249472b);
        String str = this.f249473c;
        int iC2 = p.a.c(p.a.c(p.a.c((iC + (str == null ? 0 : str.hashCode())) * 31, 31, this.d), 31, this.e), 31, this.f);
        m1c.m mVar = this.f249474g;
        int iHashCode = (iC2 + (mVar == null ? 0 : mVar.hashCode())) * 31;
        no3.b bVar = this.f249475h;
        int iHashCode2 = (iHashCode + (bVar == null ? 0 : bVar.hashCode())) * 31;
        String str2 = this.i;
        return this.k.hashCode() + p.a.c((iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31, 31, this.f249476j);
    }
}
