package f1a;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes5.dex */
@mlm.g
public final class l {

    @NotNull
    public static final k Companion = new k();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f131211a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f131212b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f131213c;
    public final long d;
    public final long e;
    public final String f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final dj0.d f131214g;

    public /* synthetic */ l(int i, String str, String str2, String str3, long j2, long j3, String str4, dj0.d dVar) {
        if (63 != (i & 63)) {
            j1.f(j.f131210a.getDescriptor(), i, 63);
            throw null;
        }
        this.f131211a = str;
        this.f131212b = str2;
        this.f131213c = str3;
        this.d = j2;
        this.e = j3;
        this.f = str4;
        if ((i & 64) == 0) {
            this.f131214g = null;
        } else {
            this.f131214g = dVar;
        }
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof l)) {
            return false;
        }
        l lVar = (l) obj2;
        return Intrinsics.f(this.f131211a, lVar.f131211a) && Intrinsics.f(this.f131212b, lVar.f131212b) && Intrinsics.f(this.f131213c, lVar.f131213c) && this.d == lVar.d && this.e == lVar.e && Intrinsics.f(this.f, lVar.f) && Intrinsics.f(this.f131214g, lVar.f131214g);
    }

    public final int hashCode() {
        int iC = p.a.c(a0.d.c(a0.d.c(p.a.c(p.a.c(this.f131211a.hashCode() * 31, 31, this.f131212b), 31, this.f131213c), 31, this.d), 31, this.e), 31, this.f);
        dj0.d dVar = this.f131214g;
        return iC + (dVar == null ? 0 : dVar.hashCode());
    }
}
