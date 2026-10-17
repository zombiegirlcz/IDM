package fq;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;

/* JADX INFO: loaded from: classes17.dex */
public final class g extends gim.i implements Function2 {
    public int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Flow f137147w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ com.revolut.appwidget_core.a f137148x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(Flow flow, com.revolut.appwidget_core.a aVar, Continuation continuation) {
        super(2, continuation);
        this.f137147w = flow;
        this.f137148x = aVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        g gVar = new g(this.f137147w, this.f137148x, continuation);
        gVar.v = obj2;
        return gVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((g) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x005a, code lost:
    
        if (androidx.glance.appwidget.GlanceAppWidgetKt.provideContent(r3, r10, r9) == r1) goto L15;
     */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            r9 = this;
            java.lang.Object r0 = r9.v
            kotlinx.coroutines.CoroutineScope r0 = (kotlinx.coroutines.CoroutineScope) r0
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r9.u
            com.revolut.appwidget_core.a r3 = r9.f137148x
            r4 = 2
            r5 = 0
            r6 = 1
            if (r2 == 0) goto L23
            if (r2 == r6) goto L1f
            if (r2 == r4) goto L1b
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L1b:
            yhm.o.b(r10)
            goto L5d
        L1f:
            yhm.o.b(r10)
            goto L44
        L23:
            yhm.o.b(r10)
            com.revolut.appwidget_core.a$a r10 = com.revolut.appwidget_core.a.Companion
            kotlin.Lazy r10 = r3.d
            java.lang.Object r10 = r10.getValue()
            k01.l r10 = (k01.l) r10
            et6.u1 r2 = new et6.u1
            r7 = 11
            kotlinx.coroutines.flow.Flow r8 = r9.f137147w
            r2.<init>(r8, r10, r7)
            r9.v = r5
            r9.u = r6
            java.lang.Object r10 = vkm.q.N(r2, r0, r9)
            if (r10 != r1) goto L44
            goto L5c
        L44:
            kotlinx.coroutines.flow.StateFlow r10 = (kotlinx.coroutines.flow.StateFlow) r10
            fq.e r0 = new fq.e
            r0.<init>(r3, r10)
            r10 = -1511458451(0xffffffffa5e8f96d, float:-4.0414602E-16)
            androidx.compose.runtime.internal.ComposableLambda r10 = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(r10, r6, r0)
            r9.v = r5
            r9.u = r4
            java.lang.Object r10 = androidx.glance.appwidget.GlanceAppWidgetKt.provideContent(r3, r10, r9)
            if (r10 != r1) goto L5d
        L5c:
            return r1
        L5d:
            kotlin.KotlinNothingValueException r10 = new kotlin.KotlinNothingValueException
            r10.<init>()
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: fq.g.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
