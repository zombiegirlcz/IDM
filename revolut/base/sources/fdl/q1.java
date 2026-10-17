package fdl;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@mlm.g
public final class q1 {

    @NotNull
    public static final p1 Companion = new p1();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f134246a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f134247b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f134248c;

    public /* synthetic */ q1(int i, String str, String str2, String str3) {
        if (7 != (i & 7)) {
            qlm.j1.f(o1.f134231a.getDescriptor(), i, 7);
            throw null;
        }
        this.f134246a = str;
        this.f134247b = str2;
        this.f134248c = str3;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof q1)) {
            return false;
        }
        q1 q1Var = (q1) obj2;
        return Intrinsics.f(this.f134246a, q1Var.f134246a) && Intrinsics.f(this.f134247b, q1Var.f134247b) && Intrinsics.f(this.f134248c, q1Var.f134248c);
    }

    public final int hashCode() {
        return this.f134248c.hashCode() + p.a.c(this.f134246a.hashCode() * 31, 31, this.f134247b);
    }
}
