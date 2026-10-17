package hl7;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@mlm.g
public final class g8 {

    @NotNull
    public static final f8 Companion = new f8();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d8 f153120a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d8 f153121b;

    public /* synthetic */ g8(int i, d8 d8Var, d8 d8Var2) {
        if (3 != (i & 3)) {
            qlm.j1.f(e8.f153081a.getDescriptor(), i, 3);
            throw null;
        }
        this.f153120a = d8Var;
        this.f153121b = d8Var2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g8)) {
            return false;
        }
        g8 g8Var = (g8) obj2;
        return Intrinsics.f(this.f153120a, g8Var.f153120a) && Intrinsics.f(this.f153121b, g8Var.f153121b);
    }

    public final int hashCode() {
        return this.f153121b.hashCode() + (this.f153120a.hashCode() * 31);
    }
}
