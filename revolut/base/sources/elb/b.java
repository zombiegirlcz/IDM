package elb;

import cxe.u;
import e7l.g;
import ik3.c;
import kotlin.jvm.internal.Intrinsics;
import rd0.e;
import w4l.k;

/* JADX INFO: loaded from: classes6.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final fk3.a f127284a;

    public b(fk3.a configurationInteractor) {
        Intrinsics.checkNotNullParameter(configurationInteractor, "configurationInteractor");
        this.f127284a = configurationInteractor;
    }

    public final u a(k loadingStrategy) {
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        return nim.a.A(nim.a.v(e.b(((c) this.f127284a).l(g.b.f123407a, loadingStrategy)), new a(0)), new a(1));
    }
}
