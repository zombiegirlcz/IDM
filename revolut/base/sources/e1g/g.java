package e1g;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: classes9.dex */
public final class g extends gim.i implements Function2 {
    public int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ j f121984w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ String f121985x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(j jVar, String str, Continuation continuation) {
        super(2, continuation);
        this.f121984w = jVar;
        this.f121985x = str;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        g gVar = new g(this.f121984w, this.f121985x, continuation);
        gVar.v = obj2;
        return gVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((g) create((FlowCollector) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0069, code lost:
    
        if (r0.emit(r4, r12) != r1) goto L21;
     */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r13) {
        /*
            r12 = this;
            java.lang.Object r0 = r12.v
            kotlinx.coroutines.flow.FlowCollector r0 = (kotlinx.coroutines.flow.FlowCollector) r0
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r12.u
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L27
            if (r2 == r5) goto L23
            if (r2 == r4) goto L1f
            if (r2 != r3) goto L17
            yhm.o.b(r13)
            goto L6c
        L17:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r0)
            throw r13
        L1f:
            yhm.o.b(r13)
            goto L54
        L23:
            yhm.o.b(r13)
            goto L3f
        L27:
            yhm.o.b(r13)
            com.revolut.data.model.Data r6 = new com.revolut.data.model.Data
            r10 = 3
            r11 = 0
            r7 = 0
            r8 = 0
            r9 = 1
            r6.<init>(r7, r8, r9, r10, r11)
            r12.v = r0
            r12.u = r5
            java.lang.Object r13 = r0.emit(r6, r12)
            if (r13 != r1) goto L3f
            goto L6b
        L3f:
            e1g.j r13 = r12.f121984w
            hyf.d r13 = r13.f121989b
            r12.v = r0
            r12.u = r4
            c1g.e0 r13 = (c1g.e0) r13
            java.lang.String r2 = r12.f121985x
            com.revolut.feature.travel.experiences.api.models.selection.TravelExperienceDatesSelection$NoDatesSelection r4 = com.revolut.feature.travel.experiences.api.models.selection.TravelExperienceDatesSelection.NoDatesSelection.f92906a
            java.lang.Object r13 = r13.a(r2, r4, r12)
            if (r13 != r1) goto L54
            goto L6b
        L54:
            r5 = r13
            com.revolut.feature.travel.experiences.api.models.search.TravelSearchResponse r5 = (com.revolut.feature.travel.experiences.api.models.search.TravelSearchResponse) r5
            com.revolut.data.model.Data r4 = new com.revolut.data.model.Data
            r8 = 6
            r9 = 0
            r6 = 0
            r7 = 0
            r4.<init>(r5, r6, r7, r8, r9)
            r13 = 0
            r12.v = r13
            r12.u = r3
            java.lang.Object r13 = r0.emit(r4, r12)
            if (r13 != r1) goto L6c
        L6b:
            return r1
        L6c:
            kotlin.Unit r13 = kotlin.Unit.f186387a
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: e1g.g.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
