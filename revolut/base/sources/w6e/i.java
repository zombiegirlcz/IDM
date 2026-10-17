package w6e;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes8.dex */
@mlm.g
public final class i {

    @NotNull
    public static final h Companion = new h();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f295427a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f295428b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f295429c;
    public final String d;
    public final String e;
    public final String f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f295430g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f295431h;

    public /* synthetic */ i(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
        if (255 != (i & 255)) {
            j1.f(g.f295426a.getDescriptor(), i, 255);
            throw null;
        }
        this.f295427a = str;
        this.f295428b = str2;
        this.f295429c = str3;
        this.d = str4;
        this.e = str5;
        this.f = str6;
        this.f295430g = str7;
        this.f295431h = str8;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return Intrinsics.f(this.f295427a, iVar.f295427a) && Intrinsics.f(this.f295428b, iVar.f295428b) && Intrinsics.f(this.f295429c, iVar.f295429c) && Intrinsics.f(this.d, iVar.d) && Intrinsics.f(this.e, iVar.e) && Intrinsics.f(this.f, iVar.f) && Intrinsics.f(this.f295430g, iVar.f295430g) && Intrinsics.f(this.f295431h, iVar.f295431h);
    }

    public final int hashCode() {
        int iHashCode = this.f295427a.hashCode() * 31;
        String str = this.f295428b;
        return this.f295431h.hashCode() + p.a.c(p.a.c(p.a.c(p.a.c(p.a.c((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.f295429c), 31, this.d), 31, this.e), 31, this.f), 31, this.f295430g);
    }
}
