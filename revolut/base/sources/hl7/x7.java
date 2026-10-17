package hl7;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@mlm.g
public final class x7 {

    @NotNull
    public static final w7 Companion = new w7();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f153367a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final dj0.d f153368b;

    public /* synthetic */ x7(int i, dj0.d dVar, String str) {
        if (3 != (i & 3)) {
            qlm.j1.f(v7.f153340a.getDescriptor(), i, 3);
            throw null;
        }
        this.f153367a = str;
        this.f153368b = dVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof x7)) {
            return false;
        }
        x7 x7Var = (x7) obj2;
        return Intrinsics.f(this.f153367a, x7Var.f153367a) && Intrinsics.f(this.f153368b, x7Var.f153368b);
    }

    public final int hashCode() {
        return this.f153368b.hashCode() + (this.f153367a.hashCode() * 31);
    }
}
