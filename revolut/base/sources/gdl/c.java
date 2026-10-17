package gdl;

import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;
import yhm.j;
import yhm.k;

/* JADX INFO: loaded from: classes12.dex */
@mlm.g
public final class c {

    @NotNull
    public static final b Companion = new b();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Lazy[] f143198b = {j.c(k.PUBLICATION, new gaa.b(9))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e f143199a;

    public /* synthetic */ c(int i, e eVar) {
        if (1 == (i & 1)) {
            this.f143199a = eVar;
        } else {
            j1.f(a.f143197a.getDescriptor(), i, 1);
            throw null;
        }
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof c) && this.f143199a == ((c) obj2).f143199a;
    }

    public final int hashCode() {
        return this.f143199a.hashCode();
    }

    public c(e state) {
        Intrinsics.checkNotNullParameter(state, "state");
        this.f143199a = state;
    }
}
