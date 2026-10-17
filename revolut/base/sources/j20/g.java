package j20;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes19.dex */
@mlm.g
public final class g {

    @NotNull
    public static final f Companion = new f();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f170642a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f170643b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f170644c;
    public final String d;
    public final String e;

    public /* synthetic */ g(int i, String str, float f, String str2, String str3, String str4) {
        if (7 != (i & 7)) {
            j1.f(e.f170641a.getDescriptor(), i, 7);
            throw null;
        }
        this.f170642a = str;
        this.f170643b = f;
        this.f170644c = str2;
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = str3;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = str4;
        }
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return Intrinsics.f(this.f170642a, gVar.f170642a) && Float.compare(this.f170643b, gVar.f170643b) == 0 && Intrinsics.f(this.f170644c, gVar.f170644c) && Intrinsics.f(this.d, gVar.d) && Intrinsics.f(this.e, gVar.e);
    }

    public final int hashCode() {
        int iC = p.a.c(m72.b.b(this.f170643b, this.f170642a.hashCode() * 31, 31), 31, this.f170644c);
        String str = this.d;
        int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.e;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }
}
