package s0e;

import ang.f;
import d8l.d;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import oki.h;
import ryd.l;
import yki.i;
import yki.j;

/* JADX INFO: loaded from: classes7.dex */
public final class b extends h implements j {
    public final f o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final i f258957p;

    public b(f userInteractor) {
        Intrinsics.checkNotNullParameter(userInteractor, "userInteractor");
        this.o = userInteractor;
        this.f258957p = d.a(this, new l(this, 23));
    }

    @Override // yki.j
    public final void M0() {
        l2(new rhl.b(this, (Continuation) null, 10), new yi5.b(26));
    }

    @Override // yki.g
    public final yki.b s() {
        return this.f258957p;
    }
}
