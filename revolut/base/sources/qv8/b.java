package qv8;

import com.revolut.feature.kyc.impl.f;
import cu8.g1;
import cu8.i1;
import gim.i;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g1 f249542a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i1 f249543b;

    public b(g1 presentationModel, i1 router) {
        Intrinsics.checkNotNullParameter(presentationModel, "presentationModel");
        Intrinsics.checkNotNullParameter(router, "router");
        this.f249542a = presentationModel;
        this.f249543b = router;
    }

    public final Object a(i iVar) {
        Object objA = nim.a.a(((f) this.f249543b).goBack(), iVar);
        return objA == fim.a.COROUTINE_SUSPENDED ? objA : Unit.f186387a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x00b0, code lost:
    
        if (nim.a.a(r9, r0) != r1) goto L31;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(gim.c r9, java.util.List r10, wi0.b r11) {
        /*
            r8 = this;
            boolean r0 = r9 instanceof qv8.a
            if (r0 == 0) goto L13
            r0 = r9
            qv8.a r0 = (qv8.a) r0
            int r1 = r0.f249541x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f249541x = r1
            goto L18
        L13:
            qv8.a r0 = new qv8.a
            r0.<init>(r8, r9)
        L18:
            java.lang.Object r9 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f249541x
            r3 = 3
            r4 = 2
            cu8.g1 r5 = r8.f249542a
            r6 = 1
            r7 = 0
            if (r2 == 0) goto L4d
            if (r2 == r6) goto L45
            if (r2 == r4) goto L3d
            if (r2 != r3) goto L35
            java.util.List r10 = r0.u
            java.util.List r10 = (java.util.List) r10
            yhm.o.b(r9)
            goto Lb3
        L35:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L3d:
            java.util.List r10 = r0.u
            java.util.List r10 = (java.util.List) r10
            yhm.o.b(r9)
            goto La0
        L45:
            java.util.List r10 = r0.u
            java.util.List r10 = (java.util.List) r10
            yhm.o.b(r9)
            goto L65
        L4d:
            yhm.o.b(r9)
            r9 = r5
            com.revolut.feature.kyc.impl.b r9 = (com.revolut.feature.kyc.impl.b) r9
            pfm.a r9 = r9.A3(r11)
            r11 = r10
            java.util.List r11 = (java.util.List) r11
            r0.u = r11
            r0.f249541x = r6
            java.lang.Object r9 = nim.a.a(r9, r0)
            if (r9 != r1) goto L65
            goto Lb2
        L65:
            int r9 = r10.size()
            if (r9 != r6) goto L78
            java.lang.Object r9 = zhm.d0.b0(r10)
            my8.l r9 = (my8.l) r9
            com.revolut.feature.kyc.impl.b r5 = (com.revolut.feature.kyc.impl.b) r5
            pfm.h r9 = r5.x3(r9)
            goto L95
        L78:
            com.revolut.feature.kyc.impl.b r5 = (com.revolut.feature.kyc.impl.b) r5
            r5.getClass()
            java.lang.String r9 = "docs"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r10, r9)
            a09.r r9 = new a09.r
            r11 = 18
            r9.<init>(r5, r10, r11)
            pfm.n r10 = new pfm.n
            r11 = 1
            r10.<init>(r9, r11)
            java.lang.String r9 = "fromCallable(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r10, r9)
            r9 = r10
        L95:
            r0.u = r7
            r0.f249541x = r4
            java.lang.Object r9 = nim.a.a(r9, r0)
            if (r9 != r1) goto La0
            goto Lb2
        La0:
            cu8.i1 r9 = r8.f249543b
            com.revolut.feature.kyc.impl.f r9 = (com.revolut.feature.kyc.impl.f) r9
            pfm.a r9 = r9.l3()
            r0.u = r7
            r0.f249541x = r3
            java.lang.Object r9 = nim.a.a(r9, r0)
            if (r9 != r1) goto Lb3
        Lb2:
            return r1
        Lb3:
            kotlin.Unit r9 = kotlin.Unit.f186387a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: qv8.b.b(gim.c, java.util.List, wi0.b):java.lang.Object");
    }
}
