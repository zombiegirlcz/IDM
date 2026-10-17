package dd5;

import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: classes3.dex */
public final class c extends i implements Function2 {
    public int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ f f113108w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ xi0.b f113109x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(f fVar, xi0.b bVar, Continuation continuation) {
        super(2, continuation);
        this.f113108w = fVar;
        this.f113109x = bVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        c cVar = new c(this.f113108w, this.f113109x, continuation);
        cVar.v = obj2;
        return cVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((c) create((FlowCollector) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x003d, code lost:
    
        if (r0.emit(r11, r10) == r1) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0099, code lost:
    
        if (r11 == r1) goto L26;
     */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) throws java.lang.Throwable {
        /*
            r10 = this;
            java.lang.Object r0 = r10.v
            kotlinx.coroutines.flow.FlowCollector r0 = (kotlinx.coroutines.flow.FlowCollector) r0
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r10.u
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L21
            if (r2 == r4) goto L1d
            if (r2 != r3) goto L15
            yhm.o.b(r11)
            goto L9c
        L15:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L1d:
            yhm.o.b(r11)
            goto L40
        L21:
            yhm.o.b(r11)
            dd5.f r11 = r10.f113108w
            gte.a r2 = r11.f113116p
            com.revolut.feature.staking.api.StakingApi$FeatureToggles$FlexibleStaking r5 = com.revolut.feature.staking.api.StakingApi$FeatureToggles.FlexibleStaking.f88055c
            jte.d r2 = (jte.d) r2
            boolean r2 = r2.c(r5)
            r5 = 0
            if (r2 != 0) goto L43
            zhm.f0 r11 = zhm.f0.f322471a
            r10.v = r5
            r10.u = r4
            java.lang.Object r11 = r0.emit(r11, r10)
            if (r11 != r1) goto L40
            goto L9b
        L40:
            kotlin.Unit r11 = kotlin.Unit.f186387a
            return r11
        L43:
            yud.g r2 = r11.f113113l
            w4l.h r6 = w4l.h.f294642c
            xi0.b r7 = r10.f113109x
            cxe.u r2 = r2.b(r7, r6)
            dd5.e r6 = new dd5.e
            r7 = 0
            r6.<init>(r2, r7)
            kotlinx.coroutines.flow.Flow r2 = vkm.q.q(r6)
            ang.f r6 = r11.f113114m
            w4l.j r8 = w4l.j.f294644c
            akg.n r6 = r6.j(r8)
            a07.p r8 = new a07.p
            r9 = 14
            r8.<init>(r6, r9)
            kotlinx.coroutines.flow.Flow r6 = vkm.q.q(r8)
            bwb.n r8 = new bwb.n
            r9 = 20
            r8.<init>(r11, r5, r9)
            r10.v = r5
            r10.u = r3
            vkm.q.w(r0)
            kotlinx.coroutines.flow.Flow[] r11 = new kotlinx.coroutines.flow.Flow[r3]
            r11[r7] = r2
            r11[r4] = r6
            vdl.c1 r2 = new vdl.c1
            r3 = 15
            r2.<init>(r8, r5, r3)
            vkm.s1 r3 = vkm.s1.f290118a
            java.lang.Object r11 = mif.e0.g(r10, r3, r2, r0, r11)
            fim.a r0 = fim.a.COROUTINE_SUSPENDED
            if (r11 != r0) goto L90
            goto L92
        L90:
            kotlin.Unit r11 = kotlin.Unit.f186387a
        L92:
            fim.a r0 = fim.a.COROUTINE_SUSPENDED
            if (r11 != r0) goto L97
            goto L99
        L97:
            kotlin.Unit r11 = kotlin.Unit.f186387a
        L99:
            if (r11 != r1) goto L9c
        L9b:
            return r1
        L9c:
            kotlin.Unit r11 = kotlin.Unit.f186387a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: dd5.c.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
