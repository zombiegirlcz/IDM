package j19;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@mlm.g
public final class h implements c {

    @NotNull
    public static final g Companion = new g();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f170206a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f170207b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final k19.m f170208c;
    public final k19.c d;
    public final String e;

    public /* synthetic */ h(int i, String str, String str2, k19.m mVar, k19.c cVar, String str3) {
        if (31 != (i & 31)) {
            qlm.j1.f(f.f170196a.getDescriptor(), i, 31);
            throw null;
        }
        this.f170206a = str;
        this.f170207b = str2;
        this.f170208c = mVar;
        this.d = cVar;
        this.e = str3;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return Intrinsics.f(this.f170206a, hVar.f170206a) && Intrinsics.f(this.f170207b, hVar.f170207b) && Intrinsics.f(this.f170208c, hVar.f170208c) && Intrinsics.f(this.d, hVar.d) && Intrinsics.f(this.e, hVar.e);
    }

    public final int hashCode() {
        int iHashCode = (this.d.hashCode() + ((this.f170208c.hashCode() + p.a.c(this.f170206a.hashCode() * 31, 31, this.f170207b)) * 31)) * 31;
        String str = this.e;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }
}
