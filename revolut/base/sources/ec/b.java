package ec;

import java.util.concurrent.Executor;
import java.util.logging.Logger;
import zb.s;

/* JADX INFO: loaded from: classes.dex */
public final class b implements d {
    public static final Logger f = Logger.getLogger(s.class.getName());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final gpk.c f124394a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Executor f124395b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ac.f f124396c;
    public final gc.d d;
    public final hc.b e;

    public b(Executor executor, ac.f fVar, gpk.c cVar, gc.d dVar, hc.b bVar) {
        this.f124395b = executor;
        this.f124396c = fVar;
        this.f124394a = cVar;
        this.d = dVar;
        this.e = bVar;
    }
}
