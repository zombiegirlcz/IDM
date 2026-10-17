package x29;

import ang.f;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import r10.q;
import vkm.i;
import w4l.h;

/* JADX INFO: loaded from: classes4.dex */
public final class b implements a29.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q f302533a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f f302534b;

    public b(f userInteractor, q userRegisteredIdentitiesInteractor) {
        Intrinsics.checkNotNullParameter(userRegisteredIdentitiesInteractor, "userRegisteredIdentitiesInteractor");
        Intrinsics.checkNotNullParameter(userInteractor, "userInteractor");
        this.f302533a = userRegisteredIdentitiesInteractor;
        this.f302534b = userInteractor;
    }

    public final Flow a() {
        return !this.f302533a.E() ? i.f290039a : nim.a.v(a.a.k(this.f302534b.j(h.f294642c), new a(0)), new a(1));
    }
}
