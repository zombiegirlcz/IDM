package slf;

import cmf.g;
import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function3;
import tof.a3;

/* JADX INFO: loaded from: classes8.dex */
public final class b extends i implements Function3 {
    public /* synthetic */ g u;
    public /* synthetic */ a3 v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ c f264200w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(c cVar, Continuation continuation) {
        super(3, continuation);
        this.f264200w = cVar;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj2, Object obj3, Object obj4) {
        b bVar = new b(this.f264200w, (Continuation) obj4);
        bVar.u = (g) obj2;
        bVar.v = (a3) obj3;
        return bVar.invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0052  */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r15) {
        /*
            r14 = this;
            cmf.g r0 = r14.u
            tof.a3 r1 = r14.v
            fim.a r2 = fim.a.COROUTINE_SUSPENDED
            yhm.o.b(r15)
            boolean r15 = r0 instanceof cmf.h
            if (r15 == 0) goto L79
            r2 = r0
            cmf.h r2 = (cmf.h) r2
            com.revolut.core.ui_kit.models.Clause r15 = r2.f25231a
            tof.l0 r0 = r1.Q1
            r1 = 0
            if (r0 == 0) goto L1a
            tof.h0 r0 = r0.f272897c
            goto L1b
        L1a:
            r0 = r1
        L1b:
            boolean r3 = r15 instanceof com.revolut.core.ui_kit.models.MoneyClause
            if (r3 == 0) goto L23
            r3 = r15
            com.revolut.core.ui_kit.models.MoneyClause r3 = (com.revolut.core.ui_kit.models.MoneyClause) r3
            goto L24
        L23:
            r3 = r1
        L24:
            if (r3 == 0) goto L52
            com.revolut.core.ui_kit.models.MoneyClause$Format r3 = r3.f57822b
            if (r3 == 0) goto L52
            aw0.k7 r3 = r3.getF57832a()
            if (r3 == 0) goto L52
            int[] r4 = slf.a.f264199a
            int r3 = r3.ordinal()
            r3 = r4[r3]
            r4 = 1
            if (r3 == r4) goto L4d
            r4 = 2
            if (r3 == r4) goto L4a
            r4 = 3
            if (r3 != r4) goto L44
            aw0.p9 r3 = aw0.p9.NEVER
            goto L4f
        L44:
            kotlin.NoWhenBranchMatchedException r15 = new kotlin.NoWhenBranchMatchedException
            r15.<init>()
            throw r15
        L4a:
            aw0.p9 r3 = aw0.p9.ONLY_NEGATIVE
            goto L4f
        L4d:
            aw0.p9 r3 = aw0.p9.ALWAYS
        L4f:
            if (r3 == 0) goto L52
            goto L54
        L52:
            aw0.p9 r3 = aw0.p9.ALWAYS
        L54:
            boolean r4 = r15 instanceof aw0.fa
            if (r4 == 0) goto L5b
            aw0.fa r15 = (aw0.fa) r15
            goto L5c
        L5b:
            r15 = r1
        L5c:
            if (r15 == 0) goto L62
            com.revolut.core.ui_kit.models.Style r1 = r15.getE()
        L62:
            if (r0 == 0) goto L78
            com.revolut.core.ui_kit.models.AssetClause r3 = qkf.a.a(r0, r3, r1)
            r12 = 0
            r13 = 2046(0x7fe, float:2.867E-42)
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            cmf.h r15 = cmf.h.a(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            return r15
        L78:
            return r2
        L79:
            cmf.g$b r15 = cmf.g.b.f25230a
            boolean r15 = kotlin.jvm.internal.Intrinsics.f(r0, r15)
            if (r15 == 0) goto L82
            return r0
        L82:
            kotlin.NoWhenBranchMatchedException r15 = new kotlin.NoWhenBranchMatchedException
            r15.<init>()
            throw r15
        */
        throw new UnsupportedOperationException("Method not decompiled: slf.b.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
