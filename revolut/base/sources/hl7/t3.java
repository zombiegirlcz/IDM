package hl7;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@mlm.g
public final class t3 {

    @NotNull
    public static final s3 Companion = new s3();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f153312a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f153313b;

    public /* synthetic */ t3(int i, String str, String str2) {
        if (3 != (i & 3)) {
            qlm.j1.f(r3.f153286a.getDescriptor(), i, 3);
            throw null;
        }
        this.f153312a = str;
        this.f153313b = str2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof t3)) {
            return false;
        }
        t3 t3Var = (t3) obj2;
        return Intrinsics.f(this.f153312a, t3Var.f153312a) && Intrinsics.f(this.f153313b, t3Var.f153313b);
    }

    public final int hashCode() {
        return this.f153313b.hashCode() + (this.f153312a.hashCode() * 31);
    }
}
