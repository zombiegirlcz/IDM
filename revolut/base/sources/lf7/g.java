package lf7;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes22.dex */
@mlm.g
public final class g implements k {

    @NotNull
    public static final f Companion = new f();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f194659a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f194660b;

    public /* synthetic */ g(int i, String str, String str2) {
        if (3 != (i & 3)) {
            j1.f(e.f194658a.getDescriptor(), i, 3);
            throw null;
        }
        this.f194659a = str;
        this.f194660b = str2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return Intrinsics.f(this.f194659a, gVar.f194659a) && Intrinsics.f(this.f194660b, gVar.f194660b);
    }

    public final int hashCode() {
        return this.f194660b.hashCode() + (this.f194659a.hashCode() * 31);
    }
}
