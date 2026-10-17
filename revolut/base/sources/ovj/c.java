package ovj;

import com.revolut.retail.feature.api.travel_trips.widget.TripItineraryWidgetContext;
import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: classes11.dex */
public final class c extends i implements Function2 {
    public int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ d f230233w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ String f230234x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ String f230235y;
    public final /* synthetic */ TripItineraryWidgetContext z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(d dVar, String str, String str2, TripItineraryWidgetContext tripItineraryWidgetContext, Continuation continuation) {
        super(2, continuation);
        this.f230233w = dVar;
        this.f230234x = str;
        this.f230235y = str2;
        this.z = tripItineraryWidgetContext;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        c cVar = new c(this.f230233w, this.f230234x, this.f230235y, this.z, continuation);
        cVar.v = obj2;
        return cVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((c) create((FlowCollector) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x004f, code lost:
    
        if (vkm.q.u(r0, r8, r7) == r1) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x005e, code lost:
    
        if (vkm.q.u(r0, r8, r7) == r1) goto L22;
     */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            java.lang.Object r0 = r7.v
            kotlinx.coroutines.flow.FlowCollector r0 = (kotlinx.coroutines.flow.FlowCollector) r0
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r7.u
            ovj.d r3 = r7.f230233w
            r4 = 2
            r5 = 1
            r6 = 3
            if (r2 == 0) goto L26
            if (r2 == r5) goto L22
            if (r2 == r4) goto L1e
            if (r2 != r6) goto L16
            goto L1e
        L16:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L1e:
            yhm.o.b(r8)
            goto L61
        L22:
            yhm.o.b(r8)
            goto L36
        L26:
            yhm.o.b(r8)
            r7.v = r0
            r7.u = r5
            java.lang.String r8 = r7.f230234x
            java.lang.Object r8 = r3.c(r8, r7)
            if (r8 != r1) goto L36
            goto L60
        L36:
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            r2 = 0
            if (r8 == 0) goto L52
            java.lang.String r8 = r7.f230235y
            com.revolut.retail.feature.api.travel_trips.widget.TripItineraryWidgetContext r5 = r7.z
            cxe.u r8 = r3.j(r8, r5)
            r7.v = r2
            r7.u = r4
            java.lang.Object r8 = vkm.q.u(r0, r8, r7)
            if (r8 != r1) goto L61
            goto L60
        L52:
            vkm.v1 r8 = org.bouncycastle.jcajce.provider.digest.a.s(r6, r2)
            r7.v = r2
            r7.u = r6
            java.lang.Object r8 = vkm.q.u(r0, r8, r7)
            if (r8 != r1) goto L61
        L60:
            return r1
        L61:
            kotlin.Unit r8 = kotlin.Unit.f186387a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: ovj.c.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
