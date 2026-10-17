package no;

import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes.dex */
public final class u2 extends gim.i implements Function2 {
    public int A;
    public final /* synthetic */ Function0 B;
    public final /* synthetic */ com.revolut.analytics.tracking.v3.l C;
    public final /* synthetic */ AnalyticsProduct D;
    public final /* synthetic */ boolean E;
    public com.revolut.analytics.tracking.v3.l u;
    public AnalyticsProduct v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public com.google.protobuf.w0 f217849w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f217850x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f217851y;
    public int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u2(Function0 function0, com.revolut.analytics.tracking.v3.l lVar, AnalyticsProduct analyticsProduct, boolean z, Continuation continuation) {
        super(2, continuation);
        this.B = function0;
        this.C = lVar;
        this.D = analyticsProduct;
        this.E = z;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new u2(this.B, this.C, this.D, this.E, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((u2) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:44:0x0113, code lost:
    
        if (r0 != r2) goto L46;
     */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0111 A[Catch: Exception -> 0x0021, TryCatch #0 {Exception -> 0x0021, blocks: (B:8:0x001c, B:46:0x0116, B:15:0x0036, B:40:0x00f0, B:43:0x0111, B:18:0x004d, B:28:0x0099, B:30:0x00a1, B:32:0x00a9, B:34:0x00b3, B:36:0x00cb, B:22:0x0063, B:24:0x006b, B:47:0x0119), top: B:52:0x000c }] */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r21) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 296
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: no.u2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
