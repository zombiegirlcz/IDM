package adk;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@mlm.g
public final class y0 {

    @NotNull
    public static final x0 Companion = new x0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f3457a;

    public /* synthetic */ y0(int i, String str) {
        if (1 == (i & 1)) {
            this.f3457a = str;
        } else {
            qlm.j1.f(w0.f3453a.getDescriptor(), i, 1);
            throw null;
        }
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof y0) && Intrinsics.f(this.f3457a, ((y0) obj2).f3457a);
    }

    public final int hashCode() {
        return this.f3457a.hashCode();
    }
}
