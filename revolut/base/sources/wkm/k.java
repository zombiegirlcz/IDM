package wkm;

import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: classes13.dex */
public final class k implements FlowCollector {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Ref$ObjectRef f298318a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ CoroutineScope f298319b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ l f298320c;
    public final /* synthetic */ FlowCollector d;

    public k(Ref$ObjectRef ref$ObjectRef, CoroutineScope coroutineScope, l lVar, FlowCollector flowCollector) {
        this.f298318a = ref$ObjectRef;
        this.f298319b = coroutineScope;
        this.f298320c = lVar;
        this.d = flowCollector;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // kotlinx.coroutines.flow.FlowCollector
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object emit(java.lang.Object r8, kotlin.coroutines.Continuation r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof wkm.j
            if (r0 == 0) goto L13
            r0 = r9
            wkm.j r0 = (wkm.j) r0
            int r1 = r0.z
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.z = r1
            goto L18
        L13:
            wkm.j r0 = new wkm.j
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.f298316x
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.z
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            java.lang.Object r8 = r0.v
            wkm.k r0 = r0.u
            yhm.o.b(r9)
            goto L56
        L2b:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L33:
            yhm.o.b(r9)
            kotlin.jvm.internal.Ref$ObjectRef r9 = r7.f298318a
            java.lang.Object r9 = r9.f186409a
            kotlinx.coroutines.Job r9 = (kotlinx.coroutines.Job) r9
            if (r9 == 0) goto L55
            kotlinx.coroutines.flow.internal.ChildCancelledException r2 = new kotlinx.coroutines.flow.internal.ChildCancelledException
            r2.<init>()
            r9.f(r2)
            r0.u = r7
            r0.v = r8
            r0.f298315w = r9
            r0.z = r3
            java.lang.Object r9 = r9.u(r0)
            if (r9 != r1) goto L55
            return r1
        L55:
            r0 = r7
        L56:
            kotlin.jvm.internal.Ref$ObjectRef r9 = r0.f298318a
            kotlinx.coroutines.CoroutineScope r1 = r0.f298319b
            skm.d0 r2 = skm.d0.UNDISPATCHED
            wkm.i r4 = new wkm.i
            wkm.l r5 = r0.f298320c
            kotlinx.coroutines.flow.FlowCollector r0 = r0.d
            r6 = 0
            r4.<init>(r5, r0, r8, r6)
            skm.a2 r8 = skm.e0.C(r1, r6, r2, r4, r3)
            r9.f186409a = r8
            kotlin.Unit r8 = kotlin.Unit.f186387a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: wkm.k.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
