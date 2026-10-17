package aw;

import android.util.Size;
import androidx.camera.video.VideoRecordEvent;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.channels.ProducerScope;

/* JADX INFO: loaded from: classes16.dex */
public final class f0 extends gim.i implements Function2 {
    public int A;
    public /* synthetic */ Object B;
    public final /* synthetic */ j0 C;
    public final /* synthetic */ c0 D;
    public final /* synthetic */ ProducerScope E;
    public final /* synthetic */ VideoRecordEvent F;
    public c0 u;
    public Size v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public Object f10156w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f10157x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f10158y;
    public long z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(j0 j0Var, c0 c0Var, ProducerScope producerScope, VideoRecordEvent videoRecordEvent, Continuation continuation) {
        super(2, continuation);
        this.C = j0Var;
        this.D = c0Var;
        this.E = producerScope;
        this.F = videoRecordEvent;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        f0 f0Var = new f0(this.C, this.D, this.E, this.F, continuation);
        f0Var.B = obj2;
        return f0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((f0) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00cb, code lost:
    
        if (aw.h0.b(r5, r3, r18) == r2) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0142, code lost:
    
        if (r3 == r2) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0182, code lost:
    
        if (aw.h0.b(r5, r0, r18) == r2) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x01a9, code lost:
    
        if (aw.h0.b(r5, r8, r18) == r2) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x01c6, code lost:
    
        if (aw.h0.b(r5, r0, r18) == r2) goto L71;
     */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0185  */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r19) {
        /*
            Method dump skipped, instruction units count: 484
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: aw.f0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
