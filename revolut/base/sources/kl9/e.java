package kl9;

import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: classes5.dex */
public final class e extends i implements Function2 {
    public int u;
    public long v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f185412w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f185413x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ d f185414y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(d dVar, Continuation continuation) {
        super(2, continuation);
        this.f185414y = dVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        e eVar = new e(this.f185414y, continuation);
        eVar.f185413x = obj2;
        return eVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((e) create((FlowCollector) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0042, code lost:
    
        if (r0.emit(r9, r8) == r1) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x007e, code lost:
    
        if (r0.emit(r9, r8) != r1) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0086  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x007e -> B:28:0x0081). Please report as a decompilation issue!!! */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            java.lang.Object r0 = r8.f185413x
            kotlinx.coroutines.flow.FlowCollector r0 = (kotlinx.coroutines.flow.FlowCollector) r0
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r8.f185412w
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L2f
            if (r2 == r5) goto L29
            if (r2 == r4) goto L21
            if (r2 != r3) goto L19
            int r2 = r8.u
            yhm.o.b(r9)
            goto L81
        L19:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L21:
            long r6 = r8.v
            int r2 = r8.u
            yhm.o.b(r9)
            goto L6c
        L29:
            int r2 = r8.u
            yhm.o.b(r9)
            goto L45
        L2f:
            yhm.o.b(r9)
            java.lang.Integer r9 = new java.lang.Integer
            r2 = 0
            r9.<init>(r2)
            r8.f185413x = r0
            r8.u = r2
            r8.f185412w = r5
            java.lang.Object r9 = r0.emit(r9, r8)
            if (r9 != r1) goto L45
            goto L80
        L45:
            kl9.d r9 = r8.f185414y
            r9.f185411a = r2
        L49:
            r9 = 99
            if (r2 >= r9) goto L86
            kotlin.coroutines.CoroutineContext r9 = r8.getContext()
            skm.e0.p(r9)
            r9 = 80
            if (r2 >= r9) goto L5b
            r6 = 100
            goto L5d
        L5b:
            r6 = 1000(0x3e8, double:4.94E-321)
        L5d:
            r8.f185413x = r0
            r8.u = r2
            r8.v = r6
            r8.f185412w = r4
            java.lang.Object r9 = skm.k0.b(r6, r8)
            if (r9 != r1) goto L6c
            goto L80
        L6c:
            int r2 = r2 + r5
            java.lang.Integer r9 = new java.lang.Integer
            r9.<init>(r2)
            r8.f185413x = r0
            r8.u = r2
            r8.v = r6
            r8.f185412w = r3
            java.lang.Object r9 = r0.emit(r9, r8)
            if (r9 != r1) goto L81
        L80:
            return r1
        L81:
            kl9.d r9 = r8.f185414y
            r9.f185411a = r2
            goto L49
        L86:
            kotlin.Unit r9 = kotlin.Unit.f186387a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: kl9.e.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
