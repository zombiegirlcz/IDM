package qh0;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes19.dex */
@mlm.g
public final class d0 implements h0 {

    @NotNull
    public static final c0 Companion = new c0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f246391a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f246392b;

    public /* synthetic */ d0(int i, String str, String str2) {
        if (3 != (i & 3)) {
            j1.f(b0.f246389a.getDescriptor(), i, 3);
            throw null;
        }
        this.f246391a = str;
        this.f246392b = str2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d0)) {
            return false;
        }
        d0 d0Var = (d0) obj2;
        return Intrinsics.f(this.f246391a, d0Var.f246391a) && Intrinsics.f(this.f246392b, d0Var.f246392b);
    }

    public final int hashCode() {
        return this.f246392b.hashCode() + (this.f246391a.hashCode() * 31);
    }
}
