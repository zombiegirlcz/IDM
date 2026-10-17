package vvh;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: classes10.dex */
public final class k extends gim.i implements Function2 {
    public int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ l f292552w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ String f292553x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ int f292554y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(int i, String str, Continuation continuation, l lVar) {
        super(2, continuation);
        this.f292552w = lVar;
        this.f292553x = str;
        this.f292554y = i;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        k kVar = new k(this.f292554y, this.f292553x, continuation, this.f292552w);
        kVar.v = obj2;
        return kVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((k) create((FlowCollector) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0092, code lost:
    
        if (vkm.q.u(r1, r3, r17) == r2) goto L19;
     */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r18) {
        /*
            r17 = this;
            r0 = r17
            java.lang.Object r1 = r0.v
            kotlinx.coroutines.flow.FlowCollector r1 = (kotlinx.coroutines.flow.FlowCollector) r1
            fim.a r2 = fim.a.COROUTINE_SUSPENDED
            int r3 = r0.u
            r4 = 2
            r5 = 1
            vvh.l r6 = r0.f292552w
            r7 = 0
            if (r3 == 0) goto L28
            if (r3 == r5) goto L22
            if (r3 != r4) goto L1a
            yhm.o.b(r18)
            goto L95
        L1a:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L22:
            yhm.o.b(r18)
            r3 = r18
            goto L3d
        L28:
            yhm.o.b(r18)
            vvh.g r3 = new vvh.g
            r3.<init>(r6, r7, r5)
            r0.v = r1
            r0.u = r5
            r8 = 5000(0x1388, double:2.4703E-320)
            java.lang.Object r3 = skm.h2.d(r8, r3, r0)
            if (r3 != r2) goto L3d
            goto L94
        L3d:
            kotlin.Unit r3 = (kotlin.Unit) r3
            if (r3 != 0) goto L54
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            r1.<init>()
            zhm.h0 r2 = zhm.h0.f322473a
            java.util.concurrent.CopyOnWriteArrayList r3 = rd0.d.f253311a
            rd0.c r3 = rd0.c.ERROR
            java.lang.String r4 = "Currency initialization timed out after 5000ms — single-pocket widget content not rendered"
            rd0.d.a(r3, r7, r4, r1, r2)
            kotlin.Unit r1 = kotlin.Unit.f186387a
            return r1
        L54:
            wsg.n r8 = r6.f292555a
            r15 = 0
            r16 = 126(0x7e, float:1.77E-43)
            w4l.j r9 = w4l.j.f294644c
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            efm.r r3 = osg.b.g(r8, r9, r10, r11, r12, r13, r14, r15, r16)
            vkm.d r3 = rd0.e.b(r3)
            vv7.l r8 = new vv7.l
            r9 = 3
            r8.<init>(r9)
            jhi.b r3 = mo3.a.g(r3, r7, r8, r5)
            t38.e r5 = new t38.e
            r8 = 25
            java.lang.String r9 = r0.f292553x
            r5.<init>(r3, r8, r6, r9)
            kotlinx.coroutines.flow.Flow r3 = vkm.q.q(r5)
            o28.d r5 = new o28.d
            int r8 = r0.f292554y
            r5.<init>(r8, r9, r7, r6)
            wkm.l r3 = vkm.q.Q(r3, r5)
            r0.v = r7
            r0.u = r4
            java.lang.Object r1 = vkm.q.u(r1, r3, r0)
            if (r1 != r2) goto L95
        L94:
            return r2
        L95:
            kotlin.Unit r1 = kotlin.Unit.f186387a
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: vvh.k.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
