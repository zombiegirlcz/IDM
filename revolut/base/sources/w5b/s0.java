package w5b;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@mlm.g
public final class s0 {

    @NotNull
    public static final r0 Companion = new r0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f295004a;

    public /* synthetic */ s0(int i, String str) {
        if (1 == (i & 1)) {
            this.f295004a = str;
        } else {
            qlm.j1.f(q0.f294981a.getDescriptor(), i, 1);
            throw null;
        }
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof s0) && Intrinsics.f(this.f295004a, ((s0) obj2).f295004a);
    }

    public final int hashCode() {
        return this.f295004a.hashCode();
    }
}
