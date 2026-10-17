package wvg;

import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
public final class y0 {

    @NotNull
    private static final x0 Companion = new x0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ue0.c f300501a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CoroutineScope f300502b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final x4l.c f300503c;

    public y0(ue0.c storage, CoroutineScope appCoroutineScope, oim.n fromNetwork, Function2 dtoMapper, Function1 fromMemory, Function2 toMemory, Function2 fromStorage, Function3 toStorage) {
        wf0.r0 onRemove = new wf0.r0(2, 1, null);
        Intrinsics.checkNotNullParameter(storage, "storage");
        Intrinsics.checkNotNullParameter(appCoroutineScope, "appCoroutineScope");
        Intrinsics.checkNotNullParameter(fromNetwork, "fromNetwork");
        Intrinsics.checkNotNullParameter(dtoMapper, "dtoMapper");
        Intrinsics.checkNotNullParameter(fromMemory, "fromMemory");
        Intrinsics.checkNotNullParameter(toMemory, "toMemory");
        Intrinsics.checkNotNullParameter(fromStorage, "fromStorage");
        Intrinsics.checkNotNullParameter(toStorage, "toStorage");
        Intrinsics.checkNotNullParameter(onRemove, "onRemove");
        this.f300501a = storage;
        this.f300502b = appCoroutineScope;
        this.f300503c = new x4l.c(new e0f.m1(this, fromNetwork, dtoMapper, fromMemory, fromStorage, null), new v1.m(10, fromMemory), new f2.a(4, toMemory), new k01.i(fromStorage, null, 2), new ahe.y0(toStorage, this, (Continuation) null), new wtj.f(onRemove, null, 1));
    }

    public static akg.n b(y0 y0Var, a1 params, long j2, w4l.k loadingStrategy) {
        y0Var.getClass();
        Intrinsics.checkNotNullParameter(params, "params");
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        return nim.a.v(qe0.o.c(do3.q.f(y0Var.f300503c, y0Var.f300502b), params, j2, loadingStrategy, 16), new wuk.c(25));
    }

    public final akg.n a(a1 params, w4l.k loadingStrategy) {
        Intrinsics.checkNotNullParameter(params, "params");
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        return nim.a.v(this.f300503c.b(params, loadingStrategy), new wuk.c(24));
    }
}
