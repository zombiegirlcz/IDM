package gu7;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@mlm.g
public final class v5 {

    @NotNull
    public static final u5 Companion = new u5();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f146850a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f146851b;

    public /* synthetic */ v5(int i, String str, String str2) {
        if (3 != (i & 3)) {
            qlm.j1.f(t5.f146837a.getDescriptor(), i, 3);
            throw null;
        }
        this.f146850a = str;
        this.f146851b = str2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof v5)) {
            return false;
        }
        v5 v5Var = (v5) obj2;
        return Intrinsics.f(this.f146850a, v5Var.f146850a) && Intrinsics.f(this.f146851b, v5Var.f146851b);
    }

    public final int hashCode() {
        return this.f146851b.hashCode() + (this.f146850a.hashCode() * 31);
    }
}
