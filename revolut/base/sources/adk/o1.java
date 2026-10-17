package adk;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@mlm.g
public final class o1 {

    @NotNull
    public static final n1 Companion = new n1();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f3418a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f3419b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f3420c;

    public /* synthetic */ o1(int i, String str, boolean z, String str2) {
        if (3 != (i & 3)) {
            qlm.j1.f(m1.f3413a.getDescriptor(), i, 3);
            throw null;
        }
        this.f3418a = str;
        this.f3419b = str2;
        if ((i & 4) == 0) {
            this.f3420c = true;
        } else {
            this.f3420c = z;
        }
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof o1)) {
            return false;
        }
        o1 o1Var = (o1) obj2;
        return Intrinsics.f(this.f3418a, o1Var.f3418a) && Intrinsics.f(this.f3419b, o1Var.f3419b) && this.f3420c == o1Var.f3420c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f3420c) + p.a.c(this.f3418a.hashCode() * 31, 31, this.f3419b);
    }
}
