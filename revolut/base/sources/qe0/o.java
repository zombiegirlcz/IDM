package qe0;

import a41.i1;
import java.util.LinkedHashMap;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.time.b;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import skm.a2;
import skm.e0;
import zhm.v;

/* JADX INFO: loaded from: classes19.dex */
public final class o {

    @NotNull
    public static final j Companion = new j();
    public static final qc7.c e = new qc7.c(20);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final x4l.c f245039a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CoroutineScope f245040b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final LinkedHashMap f245041c;
    public final LinkedHashMap d;

    public o(x4l.c dod2, CoroutineScope appCoroutineScope) {
        Intrinsics.checkNotNullParameter(dod2, "dod");
        Intrinsics.checkNotNullParameter(appCoroutineScope, "appCoroutineScope");
        this.f245039a = dod2;
        this.f245040b = appCoroutineScope;
        this.f245041c = new LinkedHashMap();
        this.d = new LinkedHashMap();
    }

    public static vkm.d a(o oVar, Object params, long j2, w4l.k kVar, boolean z, Function1 function1, int i) {
        if ((i & 4) != 0) {
            kVar = w4l.i.f294643c;
        }
        w4l.k loadingStrategy = kVar;
        if ((i & 8) != 0) {
            z = false;
        }
        boolean z3 = z;
        if ((i & 16) != 0) {
            function1 = e;
        }
        Function1 dodReloadJobLaunchInterceptor = function1;
        oVar.getClass();
        Intrinsics.checkNotNullParameter(params, "params");
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        Intrinsics.checkNotNullParameter(dodReloadJobLaunchInterceptor, "dodReloadJobLaunchInterceptor");
        b.Companion companion = kotlin.time.b.INSTANCE;
        return oVar.b(params, kotlin.time.c.h(j2, pkm.e.SECONDS), loadingStrategy, z3, dodReloadJobLaunchInterceptor);
    }

    public static /* synthetic */ vkm.d c(o oVar, Object obj2, long j2, w4l.k kVar, int i) {
        if ((i & 4) != 0) {
            kVar = w4l.i.f294643c;
        }
        return oVar.b(obj2, j2, kVar, (i & 8) == 0, e);
    }

    public final vkm.d b(Object params, long j2, w4l.k loadingStrategy, boolean z, Function1 dodReloadJobLaunchInterceptor) {
        Intrinsics.checkNotNullParameter(params, "params");
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        Intrinsics.checkNotNullParameter(dodReloadJobLaunchInterceptor, "dodReloadJobLaunchInterceptor");
        return vkm.q.k(new i1(this, params, loadingStrategy, dodReloadJobLaunchInterceptor, new k(params, j2), z, (Continuation) null));
    }

    public final a2 d(k kVar, l lVar, boolean z) throws Throwable {
        synchronized (this.f245041c) {
            try {
                try {
                    a2 a2VarC = e0.C(this.f245040b, null, null, new ack.o(z, kVar, this, (Continuation) null, 20), 3);
                    this.f245041c.put(kVar, a2VarC);
                    this.d.put(a2VarC, v.n(lVar));
                    a2VarC.k(new pza.d(this, 19, kVar, a2VarC));
                    return a2VarC;
                } catch (Throwable th10) {
                    th = th10;
                    throw th;
                }
            } catch (Throwable th11) {
                th = th11;
            }
        }
    }
}
