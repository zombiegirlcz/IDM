package hl7;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@mlm.g
public final class p5 {

    @NotNull
    public static final o5 Companion = new o5();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f153254a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f153255b;

    public /* synthetic */ p5(int i, String str, boolean z) {
        if (3 != (i & 3)) {
            qlm.j1.f(n5.f153226a.getDescriptor(), i, 3);
            throw null;
        }
        this.f153254a = str;
        this.f153255b = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof p5)) {
            return false;
        }
        p5 p5Var = (p5) obj2;
        return Intrinsics.f(this.f153254a, p5Var.f153254a) && this.f153255b == p5Var.f153255b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f153255b) + (this.f153254a.hashCode() * 31);
    }
}
