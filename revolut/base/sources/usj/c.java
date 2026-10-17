package usj;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes11.dex */
@mlm.g
public final class c {

    @NotNull
    public static final b Companion = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final x f282938a;

    public /* synthetic */ c(int i, x xVar) {
        if (1 == (i & 1)) {
            this.f282938a = xVar;
        } else {
            j1.f(a.f282932a.getDescriptor(), i, 1);
            throw null;
        }
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof c) && Intrinsics.f(this.f282938a, ((c) obj2).f282938a);
    }

    public final int hashCode() {
        return this.f282938a.hashCode();
    }

    public c(x newValue) {
        Intrinsics.checkNotNullParameter(newValue, "newValue");
        this.f282938a = newValue;
    }
}
