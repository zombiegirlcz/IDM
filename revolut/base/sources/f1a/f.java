package f1a;

import ip0.v7;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes5.dex */
@mlm.g
public final class f {

    @NotNull
    public static final e Companion = new e();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f131197a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f131198b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f131199c;
    public final Long d;
    public final String e;
    public final String f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f131200g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final dj0.d f131201h;
    public final dj0.d i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final dj0.d f131202j;

    public /* synthetic */ f(int i, String str, String str2, long j2, Long l2, String str3, String str4, String str5, dj0.d dVar, dj0.d dVar2, dj0.d dVar3) {
        if (343 != (i & 343)) {
            j1.f(d.f131196a.getDescriptor(), i, 343);
            throw null;
        }
        this.f131197a = str;
        this.f131198b = str2;
        this.f131199c = j2;
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = l2;
        }
        this.e = str3;
        if ((i & 32) == 0) {
            this.f = null;
        } else {
            this.f = str4;
        }
        this.f131200g = str5;
        if ((i & 128) == 0) {
            this.f131201h = null;
        } else {
            this.f131201h = dVar;
        }
        this.i = dVar2;
        if ((i & 512) == 0) {
            this.f131202j = null;
        } else {
            this.f131202j = dVar3;
        }
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.f131197a, fVar.f131197a) && Intrinsics.f(this.f131198b, fVar.f131198b) && this.f131199c == fVar.f131199c && Intrinsics.f(this.d, fVar.d) && Intrinsics.f(this.e, fVar.e) && Intrinsics.f(this.f, fVar.f) && Intrinsics.f(this.f131200g, fVar.f131200g) && Intrinsics.f(this.f131201h, fVar.f131201h) && Intrinsics.f(this.i, fVar.i) && Intrinsics.f(this.f131202j, fVar.f131202j);
    }

    public final int hashCode() {
        int iC = a0.d.c(p.a.c(this.f131197a.hashCode() * 31, 31, this.f131198b), 31, this.f131199c);
        Long l2 = this.d;
        int iC2 = p.a.c((iC + (l2 == null ? 0 : l2.hashCode())) * 31, 31, this.e);
        String str = this.f;
        int iC3 = p.a.c((iC2 + (str == null ? 0 : str.hashCode())) * 31, 31, this.f131200g);
        dj0.d dVar = this.f131201h;
        int iC4 = v7.c((iC3 + (dVar == null ? 0 : dVar.hashCode())) * 31, 31, this.i);
        dj0.d dVar2 = this.f131202j;
        return iC4 + (dVar2 != null ? dVar2.hashCode() : 0);
    }
}
