package k40;

import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: classes19.dex */
public final class c extends i implements Function2 {
    public int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ d f180821w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ String f180822x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ String f180823y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(d dVar, String str, String str2, Continuation continuation) {
        super(2, continuation);
        this.f180821w = dVar;
        this.f180822x = str;
        this.f180823y = str2;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        c cVar = new c(this.f180821w, this.f180822x, this.f180823y, continuation);
        cVar.v = obj2;
        return cVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((c) create((FlowCollector) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x005d, code lost:
    
        if (r6 == r1) goto L23;
     */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r6) throws java.lang.Throwable {
        /*
            r5 = this;
            java.lang.Object r0 = r5.v
            kotlinx.coroutines.flow.FlowCollector r0 = (kotlinx.coroutines.flow.FlowCollector) r0
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r5.u
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L20
            if (r2 == r4) goto L1c
            if (r2 != r3) goto L14
            yhm.o.b(r6)
            goto L60
        L14:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L1c:
            yhm.o.b(r6)
            goto L2c
        L20:
            yhm.o.b(r6)
            r5.v = r0
            r5.u = r4
            java.lang.Boolean r6 = java.lang.Boolean.FALSE
            if (r6 != r1) goto L2c
            goto L5f
        L2c:
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            r2 = 0
            if (r6 == 0) goto L63
            k40.d r6 = r5.f180821w
            l30.b r6 = r6.f180824b
            l30.e r6 = (l30.e) r6
            vkm.t1 r6 = r6.f191836j
            r5.v = r2
            r5.u = r3
            vkm.q.w(r0)
            ahd.b r2 = new ahd.b
            r3 = 23
            java.lang.String r4 = r5.f180823y
            r2.<init>(r0, r4, r3)
            kotlinx.coroutines.flow.SharedFlow r6 = r6.f290123a
            java.lang.Object r6 = r6.collect(r2, r5)
            if (r6 != r1) goto L56
            goto L58
        L56:
            kotlin.Unit r6 = kotlin.Unit.f186387a
        L58:
            if (r6 != r1) goto L5b
            goto L5d
        L5b:
            kotlin.Unit r6 = kotlin.Unit.f186387a
        L5d:
            if (r6 != r1) goto L60
        L5f:
            return r1
        L60:
            kotlin.Unit r6 = kotlin.Unit.f186387a
            return r6
        L63:
            com.revolut.feature.widgets.api.exception.WidgetNotAvailableException r6 = new com.revolut.feature.widgets.api.exception.WidgetNotAvailableException
            r0 = 3
            r6.<init>(r2, r0)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: k40.c.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
