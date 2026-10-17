package wt9;

import ang.f;
import e7l.g;
import efm.r;
import ik3.g;
import kotlin.jvm.internal.Intrinsics;
import te0.w;

/* JADX INFO: loaded from: classes5.dex */
public final class a implements uo9.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f f299841a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final fk3.b f299842b;

    public a(f userInteractor, fk3.b configRepository) {
        Intrinsics.checkNotNullParameter(userInteractor, "userInteractor");
        Intrinsics.checkNotNullParameter(configRepository, "configRepository");
        this.f299841a = userInteractor;
        this.f299842b = configRepository;
    }

    public final r a() {
        return w.v(m70.a.g(((g) this.f299842b).a(g.b.f123407a, false), null, new wsg.e(17), 1), m70.a.g(this.f299841a.k(false), null, new wsg.e(18), 1), new wsg.e(19));
    }
}
