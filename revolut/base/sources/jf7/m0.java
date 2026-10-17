package jf7;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
@mlm.g
public final class m0 {

    @NotNull
    public static final l0 Companion = new l0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f173690a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f173691b;

    public /* synthetic */ m0(int i, String str, String str2) {
        if (3 != (i & 3)) {
            qlm.j1.f(k0.f173687a.getDescriptor(), i, 3);
            throw null;
        }
        this.f173690a = str;
        this.f173691b = str2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof m0)) {
            return false;
        }
        m0 m0Var = (m0) obj2;
        return Intrinsics.f(this.f173690a, m0Var.f173690a) && Intrinsics.f(this.f173691b, m0Var.f173691b);
    }

    public final int hashCode() {
        return this.f173691b.hashCode() + (this.f173690a.hashCode() * 31);
    }
}
