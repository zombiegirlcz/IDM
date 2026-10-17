package kv;

import com.revolut.camerakit.client.api.models.CameraCaptureSettings;
import java.io.Serializable;
import java.nio.ByteBuffer;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: classes16.dex */
public final class k extends gim.i implements Function2 {
    public /* synthetic */ Object A;
    public final /* synthetic */ CameraCaptureSettings B;
    public final /* synthetic */ p C;
    public final /* synthetic */ xv.l D;
    public vw.a u;
    public ByteBuffer v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public Serializable f189896w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public FlowCollector f189897x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public p f189898y;
    public int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(CameraCaptureSettings cameraCaptureSettings, p pVar, xv.l lVar, Continuation continuation) {
        super(2, continuation);
        this.B = cameraCaptureSettings;
        this.C = pVar;
        this.D = lVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        k kVar = new k(this.B, this.C, this.D, continuation);
        kVar.A = obj2;
        return kVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((k) create((FlowCollector) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0182, code lost:
    
        if (r0 != r8) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x01c6, code lost:
    
        if (r7.emit(r3, r14) != r8) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x01e1, code lost:
    
        if (kv.p.c(r3, r0, r1, r14) == r8) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0254, code lost:
    
        if (r7.emit(r1, r14) != r8) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x028a, code lost:
    
        if (r0 != r8) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0079, code lost:
    
        if (r7.emit(r3, r16) == r8) goto L9;
     */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x020e A[PHI: r1 r14
      0x020e: PHI (r1v30 vw.a) = (r1v28 vw.a), (r1v34 vw.a) binds: [B:64:0x020a, B:15:0x00a3] A[DONT_GENERATE, DONT_INLINE]
      0x020e: PHI (r14v8 kv.k) = (r14v6 kv.k), (r14v9 kv.k) binds: [B:64:0x020a, B:15:0x00a3] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0233 A[PHI: r0 r14
      0x0233: PHI (r0v37 java.lang.Object) = (r0v36 java.lang.Object), (r0v42 java.lang.Object) binds: [B:67:0x0230, B:14:0x009b] A[DONT_GENERATE, DONT_INLINE]
      0x0233: PHI (r14v10 kv.k) = (r14v8 kv.k), (r14v11 kv.k) binds: [B:67:0x0230, B:14:0x009b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Type inference failed for: r0v50, types: [byte[], java.io.Serializable] */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r17) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 736
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kv.k.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
