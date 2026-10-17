package n5j;

import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class j implements vu.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final su.a f212625a = su.a.TITLE;

    @Override // vu.c
    public final su.a F() {
        return this.f212625a;
    }

    @Override // vu.c
    public final Set H0() {
        su.j[] elements = {new su.c(false), su.g.f265624a, su.f.f265623a, new su.e(false), su.h.f265625a};
        Intrinsics.checkNotNullParameter(elements, "elements");
        return kotlin.collections.d.y0(elements);
    }

    @Override // vu.c
    public final su.b o0() {
        return su.b.CONFETTI;
    }
}
