package akd;

import kotlin.Lazy;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes7.dex */
@mlm.g
public final class q {

    @NotNull
    public static final o Companion = new o();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Lazy[] f5798b = {yhm.j.c(yhm.k.PUBLICATION, new aj0.o(22))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p f5799a;

    public /* synthetic */ q(int i, p pVar) {
        if (1 == (i & 1)) {
            this.f5799a = pVar;
        } else {
            j1.f(n.f5797a.getDescriptor(), i, 1);
            throw null;
        }
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof q) && this.f5799a == ((q) obj2).f5799a;
    }

    public final int hashCode() {
        return this.f5799a.hashCode();
    }
}
