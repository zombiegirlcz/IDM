package hl7;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@mlm.g
public final class t6 {

    @NotNull
    public static final s6 Companion = new s6();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f153315a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f153316b;

    public /* synthetic */ t6(int i, String str, String str2) {
        if (3 != (i & 3)) {
            qlm.j1.f(r6.f153290a.getDescriptor(), i, 3);
            throw null;
        }
        this.f153315a = str;
        this.f153316b = str2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof t6)) {
            return false;
        }
        t6 t6Var = (t6) obj2;
        return Intrinsics.f(this.f153315a, t6Var.f153315a) && Intrinsics.f(this.f153316b, t6Var.f153316b);
    }

    public final int hashCode() {
        return this.f153316b.hashCode() + (this.f153315a.hashCode() * 31);
    }
}
