package hl7;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@mlm.g
public final class n4 {

    @NotNull
    public static final m4 Companion = new m4();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f153224a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f153225b;

    public /* synthetic */ n4(int i, String str, String str2) {
        if (3 != (i & 3)) {
            qlm.j1.f(l4.f153185a.getDescriptor(), i, 3);
            throw null;
        }
        this.f153224a = str;
        this.f153225b = str2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof n4)) {
            return false;
        }
        n4 n4Var = (n4) obj2;
        return Intrinsics.f(this.f153224a, n4Var.f153224a) && Intrinsics.f(this.f153225b, n4Var.f153225b);
    }

    public final int hashCode() {
        return this.f153225b.hashCode() + (this.f153224a.hashCode() * 31);
    }
}
