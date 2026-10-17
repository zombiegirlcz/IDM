package lfa;

import ffk.t;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;
import pfa.l;
import qfa.e;
import z9h.n;

/* JADX INFO: loaded from: classes5.dex */
public final class b implements ffa.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e f194835a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l f194836b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final mfa.b f194837c;

    public b(t pricingPlanInteractor, e repository, l commandProvider, mfa.b statusInteractor) {
        Intrinsics.checkNotNullParameter(pricingPlanInteractor, "pricingPlanInteractor");
        Intrinsics.checkNotNullParameter(repository, "repository");
        Intrinsics.checkNotNullParameter(commandProvider, "commandProvider");
        Intrinsics.checkNotNullParameter(statusInteractor, "statusInteractor");
        this.f194835a = repository;
        this.f194836b = commandProvider;
        this.f194837c = statusInteractor;
    }

    public final gfa.a a(String flowId) {
        Object next;
        Intrinsics.checkNotNullParameter(flowId, "flowId");
        Iterator<E> it8 = ofa.b.b().iterator();
        while (true) {
            if (!it8.hasNext()) {
                next = null;
                break;
            }
            next = it8.next();
            if (Intrinsics.f(((ofa.b) next).name(), flowId)) {
                break;
            }
        }
        ofa.b bVar = (ofa.b) next;
        if (bVar != null) {
            return nfa.b.a(bVar);
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(gim.c r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof lfa.a
            if (r0 == 0) goto L13
            r0 = r5
            lfa.a r0 = (lfa.a) r0
            int r1 = r0.f194834w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f194834w = r1
            goto L18
        L13:
            lfa.a r0 = new lfa.a
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f194834w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r5)
            goto L3d
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L2f:
            yhm.o.b(r5)
            r0.f194834w = r3
            pfa.l r5 = r4.f194836b
            java.lang.Object r5 = r5.b(r0)
            if (r5 != r1) goto L3d
            return r1
        L3d:
            if (r5 == 0) goto L40
            goto L41
        L40:
            r3 = 0
        L41:
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r3)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: lfa.b.b(gim.c):java.lang.Object");
    }

    public final void c(String planId) {
        Intrinsics.checkNotNullParameter(planId, "planId");
        e eVar = this.f194835a;
        eVar.getClass();
        Intrinsics.checkNotNullParameter(planId, "planId");
        n.l(String.class, eVar.f245284c, "SELECTED_PLAN_ID_KEY", planId);
    }
}
