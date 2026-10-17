package qe0;

import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: classes19.dex */
public final class n implements FlowCollector {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ FlowCollector f245035a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AtomicBoolean f245036b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Function1 f245037c;
    public final /* synthetic */ o d;
    public final /* synthetic */ k e;
    public final /* synthetic */ l f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f245038g;

    public n(FlowCollector flowCollector, AtomicBoolean atomicBoolean, Function1 function1, o oVar, k kVar, l lVar, boolean z) {
        this.f245036b = atomicBoolean;
        this.f245037c = function1;
        this.d = oVar;
        this.e = kVar;
        this.f = lVar;
        this.f245038g = z;
        this.f245035a = flowCollector;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0063, code lost:
    
        if (r14.emit(r6, r0) == r1) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0115, code lost:
    
        if (r14 == r1) goto L68;
     */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // kotlinx.coroutines.flow.FlowCollector
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object emit(java.lang.Object r13, kotlin.coroutines.Continuation r14) {
        /*
            Method dump skipped, instruction units count: 291
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: qe0.n.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
