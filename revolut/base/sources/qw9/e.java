package qw9;

import eo3.a;
import gim.i;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jmrtd.lds.LDSFile;
import zhm.u;

/* JADX INFO: loaded from: classes5.dex */
public final class e implements cpg.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ang.f f249841a;

    public e(ang.f userInteractor) {
        Intrinsics.checkNotNullParameter(userInteractor, "userInteractor");
        this.f249841a = userInteractor;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // cpg.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(kotlin.coroutines.Continuation r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof qw9.b
            if (r0 == 0) goto L13
            r0 = r5
            qw9.b r0 = (qw9.b) r0
            int r1 = r0.f249838w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f249838w = r1
            goto L1a
        L13:
            qw9.b r0 = new qw9.b
            gim.c r5 = (gim.c) r5
            r0.<init>(r4, r5)
        L1a:
            java.lang.Object r5 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f249838w
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            yhm.o.b(r5)
            goto L44
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L31:
            yhm.o.b(r5)
            ang.f r5 = r4.f249841a
            r2 = 0
            efm.d0 r5 = r5.f(r2)
            r0.f249838w = r3
            java.lang.Object r5 = nim.a.b(r5, r0)
            if (r5 != r1) goto L44
            return r1
        L44:
            do3.n r5 = (do3.n) r5
            java.lang.String r5 = r5.f
            if (r5 != 0) goto L4c
            java.lang.String r5 = ""
        L4c:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: qw9.e.a(kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // cpg.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(kotlin.coroutines.Continuation r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof qw9.c
            if (r0 == 0) goto L13
            r0 = r5
            qw9.c r0 = (qw9.c) r0
            int r1 = r0.f249839w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f249839w = r1
            goto L1a
        L13:
            qw9.c r0 = new qw9.c
            gim.c r5 = (gim.c) r5
            r0.<init>(r4, r5)
        L1a:
            java.lang.Object r5 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f249839w
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            yhm.o.b(r5)
            goto L44
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L31:
            yhm.o.b(r5)
            ang.f r5 = r4.f249841a
            r2 = 0
            efm.d0 r5 = r5.h(r2)
            r0.f249839w = r3
            java.lang.Object r5 = nim.a.b(r5, r0)
            if (r5 != r1) goto L44
            return r1
        L44:
            java.lang.String r0 = "await(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r5, r0)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: qw9.e.b(kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // cpg.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(java.lang.String r5, gim.c r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof qw9.d
            if (r0 == 0) goto L13
            r0 = r6
            qw9.d r0 = (qw9.d) r0
            int r1 = r0.f249840w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f249840w = r1
            goto L18
        L13:
            qw9.d r0 = new qw9.d
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f249840w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r6)
            goto L41
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            yhm.o.b(r6)
            ang.f r6 = r4.f249841a
            pfm.z r5 = r6.m(r5)
            r0.f249840w = r3
            java.lang.Object r6 = nim.a.b(r5, r0)
            if (r6 != r1) goto L41
            return r1
        L41:
            java.lang.String r5 = "await(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r6, r5)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: qw9.e.c(java.lang.String, gim.c):java.lang.Object");
    }

    @Override // cpg.a
    public final Object d(String str, i iVar) {
        Object objA = nim.a.a(ylg.b.c(this.f249841a, u.c(new a.b(str, null, LDSFile.EF_SOD_TAG))), iVar);
        return objA == fim.a.COROUTINE_SUSPENDED ? objA : Unit.f186387a;
    }
}
