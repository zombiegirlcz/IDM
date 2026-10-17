package vii;

import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import org.jetbrains.annotations.NotNull;
import ukm.f;
import vge.r;
import vkm.q;
import vkm.y;
import vkm.z1;
import w4l.h;
import w4l.i;
import w4l.k;

/* JADX INFO: loaded from: classes10.dex */
public final class b implements Flow {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final z1 f289600a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final y f289601b;

    public /* synthetic */ b() {
        this(h.f294642c);
    }

    public final void a() {
        this.f289600a.k(i.f294643c);
    }

    @Override // kotlinx.coroutines.flow.Flow
    public final Object collect(FlowCollector flowCollector, Continuation continuation) {
        return this.f289601b.collect(flowCollector, continuation);
    }

    public b(k initialLoadingStrategy) {
        Intrinsics.checkNotNullParameter(initialLoadingStrategy, "initialLoadingStrategy");
        Companion.getClass();
        z1 internalFlow = q.b(1, 1, f.DROP_OLDEST);
        Intrinsics.checkNotNullParameter(internalFlow, "internalFlow");
        Intrinsics.checkNotNullParameter(initialLoadingStrategy, "initialLoadingStrategy");
        y yVar = new y(new r(initialLoadingStrategy, null, 15), internalFlow);
        this.f289600a = internalFlow;
        this.f289601b = yVar;
    }
}
