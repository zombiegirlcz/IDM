package sz8;

import kotlin.Lazy;
import mlm.g;
import org.jetbrains.annotations.NotNull;
import qlm.j1;
import yhm.j;
import yhm.k;

/* JADX INFO: loaded from: classes4.dex */
@g
public final class c {

    @NotNull
    public static final b Companion = new b();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Lazy[] f266776b = {j.c(k.PUBLICATION, new sq5.j(28))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final pz8.g f266777a;

    public /* synthetic */ c(int i, pz8.g gVar) {
        if (1 == (i & 1)) {
            this.f266777a = gVar;
        } else {
            j1.f(a.f266775a.getDescriptor(), i, 1);
            throw null;
        }
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof c) && this.f266777a == ((c) obj2).f266777a;
    }

    public final int hashCode() {
        return this.f266777a.hashCode();
    }
}
