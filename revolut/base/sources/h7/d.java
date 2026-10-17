package h7;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;

/* JADX INFO: loaded from: classes23.dex */
public final class d extends gim.i implements Function2 {
    public int u;
    public final /* synthetic */ r v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Job f149769w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ int f149770x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ int f149771y;
    public final /* synthetic */ j z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(r rVar, Job job2, int i, int i2, j jVar, Continuation continuation) {
        super(2, continuation);
        this.v = rVar;
        this.f149769w = job2;
        this.f149770x = i;
        this.f149771y = i2;
        this.z = jVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new d(this.v, this.f149769w, this.f149770x, this.f149771y, this.z, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((d) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x005d  */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r6) {
        /*
            r5 = this;
            fim.a r0 = fim.a.COROUTINE_SUSPENDED
            int r1 = r5.u
            r2 = 1
            if (r1 == 0) goto L15
            if (r1 != r2) goto Ld
            yhm.o.b(r6)
            goto L55
        Ld:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L15:
            yhm.o.b(r6)
        L18:
            int[] r6 = h7.c.f149767a
            h7.r r1 = r5.v
            int r1 = r1.ordinal()
            r6 = r6[r1]
            int r1 = r5.f149770x
            if (r6 != r2) goto L31
            kotlinx.coroutines.Job r6 = r5.f149769w
            boolean r6 = r6.d()
            if (r6 == 0) goto L2f
            goto L31
        L2f:
            int r1 = r5.f149771y
        L31:
            r5.u = r2
            h7.j r6 = r5.z
            r6.getClass()
            r3 = 2147483647(0x7fffffff, float:NaN)
            if (r1 != r3) goto L48
            h7.g r3 = new h7.g
            r4 = 0
            r3.<init>(r6, r1, r4)
            java.lang.Object r6 = androidx.compose.animation.core.InfiniteAnimationPolicyKt.withInfiniteAnimationFrameNanos(r3, r5)
            goto L52
        L48:
            h7.g r3 = new h7.g
            r4 = 1
            r3.<init>(r6, r1, r4)
            java.lang.Object r6 = androidx.compose.runtime.MonotonicFrameClockKt.withFrameNanos(r3, r5)
        L52:
            if (r6 != r0) goto L55
            return r0
        L55:
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            if (r6 != 0) goto L18
            kotlin.Unit r6 = kotlin.Unit.f186387a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: h7.d.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
