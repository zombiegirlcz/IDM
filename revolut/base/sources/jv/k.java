package jv;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes16.dex */
public final class k extends gim.i implements Function2 {
    public gv.m u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f178706w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ r f178707x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ uv.f f178708y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(r rVar, uv.f fVar, Continuation continuation) {
        super(2, continuation);
        this.f178707x = rVar;
        this.f178708y = fVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        k kVar = new k(this.f178707x, this.f178708y, continuation);
        kVar.f178706w = obj2;
        return kVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((k) create((kv.g) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:102:0x0262, code lost:
    
        if (r5.emit(r10, r24) == r7) goto L103;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0068, code lost:
    
        if (r5.emit(r0, r24) == r7) goto L103;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0124, code lost:
    
        if (r0 != r7) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x01d1, code lost:
    
        if (r2.j(false) != r7) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x0224, code lost:
    
        if (r5.emit(r0, r24) == r7) goto L103;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x0249, code lost:
    
        if (r0.emit(r2, r24) == r7) goto L103;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x003f A[PHI: r0
      0x003f: PHI (r0v25 gv.m) = (r0v23 gv.m), (r0v44 gv.m) binds: [B:32:0x00ae, B:9:0x003a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0177 A[LOOP:0: B:60:0x0171->B:62:0x0177, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01b2 A[PHI: r10
      0x01b2: PHI (r10v11 gv.m) = (r10v7 gv.m), (r10v12 gv.m) binds: [B:64:0x01ae, B:7:0x002a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01c5 A[PHI: r10
      0x01c5: PHI (r10v13 gv.m) = (r10v11 gv.m), (r10v14 gv.m) binds: [B:67:0x01c1, B:6:0x0024] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r25) {
        /*
            Method dump skipped, instruction units count: 648
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: jv.k.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
