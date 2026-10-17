package kr;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
@mlm.g
public final class i0 {

    @NotNull
    public static final h0 Companion = new h0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f188509a;

    public /* synthetic */ i0(int i, String str) {
        if (1 == (i & 1)) {
            this.f188509a = str;
        } else {
            qlm.j1.f(g0.f188499a.getDescriptor(), i, 1);
            throw null;
        }
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof i0) && Intrinsics.f(this.f188509a, ((i0) obj2).f188509a);
    }

    public final int hashCode() {
        return this.f188509a.hashCode();
    }

    public i0(String status) {
        Intrinsics.checkNotNullParameter(status, "status");
        this.f188509a = status;
    }
}
