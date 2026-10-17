package mk0;

import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref$BooleanRef;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: classes.dex */
public final class j implements FlowCollector {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f206150a = 2;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ FlowCollector f206151b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f206152c;
    public final /* synthetic */ Object d;

    /* JADX WARN: Multi-variable type inference failed */
    public j(Ref$BooleanRef ref$BooleanRef, FlowCollector flowCollector, Function2 function2) {
        this.f206152c = ref$BooleanRef;
        this.f206151b = flowCollector;
        this.d = (gim.i) function2;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0018  */
    /* JADX WARN: Type inference failed for: r9v16, types: [gim.i, kotlin.jvm.functions.Function2] */
    @Override // kotlinx.coroutines.flow.FlowCollector
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object emit(java.lang.Object r8, kotlin.coroutines.Continuation r9) {
        /*
            Method dump skipped, instruction units count: 334
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: mk0.j.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public j(FlowCollector flowCollector, o oVar, tk0.g gVar) {
        this.f206151b = flowCollector;
        this.f206152c = oVar;
        this.d = gVar;
    }

    public j(vkm.h hVar, Ref$ObjectRef ref$ObjectRef, FlowCollector flowCollector) {
        this.f206152c = hVar;
        this.d = ref$ObjectRef;
        this.f206151b = flowCollector;
    }
}
