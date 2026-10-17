package l3d;

import java.util.List;
import java.util.Set;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: classes7.dex */
public final class d0 extends gim.i implements Function2 {
    public final /* synthetic */ boolean A;
    public final /* synthetic */ boolean B;
    public final /* synthetic */ Integer C;
    public final /* synthetic */ List D;
    public int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ h0 f191892w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ Set f191893x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ String f191894y;
    public final /* synthetic */ boolean z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(h0 h0Var, Set set, String str, boolean z, boolean z3, boolean z4, Integer num, List list, Continuation continuation) {
        super(2, continuation);
        this.f191892w = h0Var;
        this.f191893x = set;
        this.f191894y = str;
        this.z = z;
        this.A = z3;
        this.B = z4;
        this.C = num;
        this.D = list;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        d0 d0Var = new d0(this.f191892w, this.f191893x, this.f191894y, this.z, this.A, this.B, this.C, this.D, continuation);
        d0Var.v = obj2;
        return d0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((d0) create((FlowCollector) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0064, code lost:
    
        if (vkm.q.u(r0, r14, r13) == r1) goto L15;
     */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r14) {
        /*
            r13 = this;
            java.lang.Object r0 = r13.v
            kotlinx.coroutines.flow.FlowCollector r0 = (kotlinx.coroutines.flow.FlowCollector) r0
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r13.u
            l3d.h0 r5 = r13.f191892w
            r12 = 2
            r3 = 1
            if (r2 == 0) goto L22
            if (r2 == r3) goto L1e
            if (r2 != r12) goto L16
            yhm.o.b(r14)
            goto L67
        L16:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r14.<init>(r0)
            throw r14
        L1e:
            yhm.o.b(r14)
            goto L32
        L22:
            yhm.o.b(r14)
            l3d.j0 r14 = r5.f191910b
            r13.v = r0
            r13.u = r3
            java.lang.Object r14 = r14.a(r13)
            if (r14 != r1) goto L32
            goto L66
        L32:
            java.util.Set r14 = r13.f191893x
            java.lang.Iterable r14 = (java.lang.Iterable) r14
            java.util.List r14 = zhm.d0.d1(r14)
            java.lang.String r2 = "assetTypeKeys"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r14, r2)
            m3d.i r2 = r5.f191911c
            kotlinx.coroutines.flow.Flow r14 = r2.a(r14)
            l3d.c0 r3 = new l3d.c0
            r4 = 0
            java.lang.String r6 = r13.f191894y
            boolean r7 = r13.z
            boolean r8 = r13.A
            boolean r9 = r13.B
            java.lang.Integer r10 = r13.C
            java.util.List r11 = r13.D
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11)
            wkm.l r14 = vkm.q.Q(r14, r3)
            r2 = 0
            r13.v = r2
            r13.u = r12
            java.lang.Object r14 = vkm.q.u(r0, r14, r13)
            if (r14 != r1) goto L67
        L66:
            return r1
        L67:
            kotlin.Unit r14 = kotlin.Unit.f186387a
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: l3d.d0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
