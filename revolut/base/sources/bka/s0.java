package bka;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes5.dex */
@mlm.g
public final class s0 {

    @NotNull
    public static final r0 Companion = new r0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f16337a;

    public /* synthetic */ s0(int i, String str) {
        if (1 == (i & 1)) {
            this.f16337a = str;
        } else {
            j1.f(q0.f16332a.getDescriptor(), i, 1);
            throw null;
        }
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof s0) && Intrinsics.f(this.f16337a, ((s0) obj2).f16337a);
    }

    public final int hashCode() {
        return this.f16337a.hashCode();
    }

    public s0(String text) {
        Intrinsics.checkNotNullParameter(text, "text");
        this.f16337a = text;
    }
}
