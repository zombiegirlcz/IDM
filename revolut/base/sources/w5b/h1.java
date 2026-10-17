package w5b;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@mlm.g
public final class h1 {

    @NotNull
    public static final g1 Companion = new g1();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f294860a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f294861b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f294862c;

    public /* synthetic */ h1(int i, String str, String str2, String str3) {
        if (7 != (i & 7)) {
            qlm.j1.f(f1.f294831a.getDescriptor(), i, 7);
            throw null;
        }
        this.f294860a = str;
        this.f294861b = str2;
        this.f294862c = str3;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h1)) {
            return false;
        }
        h1 h1Var = (h1) obj2;
        return Intrinsics.f(this.f294860a, h1Var.f294860a) && Intrinsics.f(this.f294861b, h1Var.f294861b) && Intrinsics.f(this.f294862c, h1Var.f294862c);
    }

    public final int hashCode() {
        return this.f294862c.hashCode() + p.a.c(this.f294860a.hashCode() * 31, 31, this.f294861b);
    }
}
