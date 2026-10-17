package zg3;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes21.dex */
@mlm.g
public final class g {

    @NotNull
    public static final f Companion = new f();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f322056a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f322057b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final j f322058c;
    public final String d;
    public final String e;

    public /* synthetic */ g(int i, String str, String str2, j jVar, String str3, String str4) {
        if (31 != (i & 31)) {
            j1.f(e.f322055a.getDescriptor(), i, 31);
            throw null;
        }
        this.f322056a = str;
        this.f322057b = str2;
        this.f322058c = jVar;
        this.d = str3;
        this.e = str4;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return Intrinsics.f(this.f322056a, gVar.f322056a) && Intrinsics.f(this.f322057b, gVar.f322057b) && Intrinsics.f(this.f322058c, gVar.f322058c) && Intrinsics.f(this.d, gVar.d) && Intrinsics.f(this.e, gVar.e);
    }

    public final int hashCode() {
        int iC = p.a.c((this.f322058c.hashCode() + p.a.c(this.f322056a.hashCode() * 31, 31, this.f322057b)) * 31, 31, this.d);
        String str = this.e;
        return iC + (str == null ? 0 : str.hashCode());
    }
}
