package ekd;

import kotlin.Lazy;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes7.dex */
@mlm.g
public final class y {

    @NotNull
    public static final w Companion = new w();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Lazy[] f127027b = {yhm.j.c(yhm.k.PUBLICATION, new egb.m0(27))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final x f127028a;

    public /* synthetic */ y(int i, x xVar) {
        if (1 == (i & 1)) {
            this.f127028a = xVar;
        } else {
            j1.f(v.f127026a.getDescriptor(), i, 1);
            throw null;
        }
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof y) && this.f127028a == ((y) obj2).f127028a;
    }

    public final int hashCode() {
        return this.f127028a.hashCode();
    }
}
