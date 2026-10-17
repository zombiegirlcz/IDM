package fqc;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes6.dex */
@mlm.g
public final class i {

    @NotNull
    public static final h Companion = new h();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f137246a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f137247b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f137248c;
    public final long d;
    public final Long e;
    public final String f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f137249g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Long f137250h;
    public final String i;

    public /* synthetic */ i(int i, String str, String str2, String str3, long j2, Long l2, String str4, String str5, Long l3, String str6) {
        if (15 != (i & 15)) {
            j1.f(g.f137245a.getDescriptor(), i, 15);
            throw null;
        }
        this.f137246a = str;
        this.f137247b = str2;
        this.f137248c = str3;
        this.d = j2;
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = l2;
        }
        if ((i & 32) == 0) {
            this.f = null;
        } else {
            this.f = str4;
        }
        if ((i & 64) == 0) {
            this.f137249g = null;
        } else {
            this.f137249g = str5;
        }
        if ((i & 128) == 0) {
            this.f137250h = null;
        } else {
            this.f137250h = l3;
        }
        if ((i & 256) == 0) {
            this.i = null;
        } else {
            this.i = str6;
        }
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return Intrinsics.f(this.f137246a, iVar.f137246a) && Intrinsics.f(this.f137247b, iVar.f137247b) && Intrinsics.f(this.f137248c, iVar.f137248c) && this.d == iVar.d && Intrinsics.f(this.e, iVar.e) && Intrinsics.f(this.f, iVar.f) && Intrinsics.f(this.f137249g, iVar.f137249g) && Intrinsics.f(this.f137250h, iVar.f137250h) && Intrinsics.f(this.i, iVar.i);
    }

    public final int hashCode() {
        int iC = a0.d.c(p.a.c(p.a.c(this.f137246a.hashCode() * 31, 31, this.f137247b), 31, this.f137248c), 31, this.d);
        Long l2 = this.e;
        int iHashCode = (iC + (l2 == null ? 0 : l2.hashCode())) * 31;
        String str = this.f;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f137249g;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Long l3 = this.f137250h;
        int iHashCode4 = (iHashCode3 + (l3 == null ? 0 : l3.hashCode())) * 31;
        String str3 = this.i;
        return iHashCode4 + (str3 != null ? str3.hashCode() : 0);
    }
}
