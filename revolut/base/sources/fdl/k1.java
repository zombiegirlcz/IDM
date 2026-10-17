package fdl;

import java.time.Instant;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@mlm.g
public final class k1 {

    @NotNull
    public static final j1 Companion = new j1();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Instant f134178a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f134179b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f134180c;

    public /* synthetic */ k1(int i, String str, String str2, Instant instant) {
        if (7 != (i & 7)) {
            qlm.j1.f(i1.f134156a.getDescriptor(), i, 7);
            throw null;
        }
        this.f134178a = instant;
        this.f134179b = str;
        this.f134180c = str2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof k1)) {
            return false;
        }
        k1 k1Var = (k1) obj2;
        return Intrinsics.f(this.f134178a, k1Var.f134178a) && Intrinsics.f(this.f134179b, k1Var.f134179b) && Intrinsics.f(this.f134180c, k1Var.f134180c);
    }

    public final int hashCode() {
        return this.f134180c.hashCode() + p.a.c(this.f134178a.hashCode() * 31, 31, this.f134179b);
    }
}
