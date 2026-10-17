package o8l;

import kotlin.jvm.internal.Intrinsics;
import kye.e;
import m8l.g;
import nd.m;
import t7i.i;
import t7i.p;

/* JADX INFO: loaded from: classes12.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g f223045a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p f223046b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final i f223047c;
    public final m d;
    public final e e;
    public final t7i.b f;

    public c(g repository, p savingsMoveMoneyDelegate, i investMoveMoneyDelegate, m collateralMoveMoneyDelegate, e extraAttributesInteractor, t7i.b backgroundBalanceUpdateDelegate) {
        Intrinsics.checkNotNullParameter(repository, "repository");
        Intrinsics.checkNotNullParameter(savingsMoveMoneyDelegate, "savingsMoveMoneyDelegate");
        Intrinsics.checkNotNullParameter(investMoveMoneyDelegate, "investMoveMoneyDelegate");
        Intrinsics.checkNotNullParameter(collateralMoveMoneyDelegate, "collateralMoveMoneyDelegate");
        Intrinsics.checkNotNullParameter(extraAttributesInteractor, "extraAttributesInteractor");
        Intrinsics.checkNotNullParameter(backgroundBalanceUpdateDelegate, "backgroundBalanceUpdateDelegate");
        od0.i customTransferHandler = od0.i.f224256b;
        Intrinsics.checkNotNullParameter(customTransferHandler, "customTransferHandler");
        this.f223045a = repository;
        this.f223046b = savingsMoveMoneyDelegate;
        this.f223047c = investMoveMoneyDelegate;
        this.d = collateralMoveMoneyDelegate;
        this.e = extraAttributesInteractor;
        this.f = backgroundBalanceUpdateDelegate;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x025b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0128 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01dd  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001a  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x025a A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(j8l.k r26, gim.c r27) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 628
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o8l.c.a(j8l.k, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(j8l.k r5, gim.c r6) throws java.lang.Throwable {
        /*
            r4 = this;
            boolean r0 = r6 instanceof o8l.b
            if (r0 == 0) goto L13
            r0 = r6
            o8l.b r0 = (o8l.b) r0
            int r1 = r0.f223044x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f223044x = r1
            goto L18
        L13:
            o8l.b r0 = new o8l.b
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f223044x
            r3 = 2
            if (r2 == 0) goto L3c
            r5 = 1
            if (r2 == r5) goto L34
            if (r2 != r3) goto L2c
            j8l.k r5 = r0.u
            yhm.o.b(r6)
            goto L5c
        L2c:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L34:
            j8l.k r5 = r0.u
            yhm.o.b(r6)
            j8l.i r6 = (j8l.i) r6
            goto L40
        L3c:
            yhm.o.b(r6)
            r6 = 0
        L40:
            j8l.i r2 = j8l.i.f172234a
            boolean r2 = kotlin.jvm.internal.Intrinsics.f(r6, r2)
            if (r2 != 0) goto L51
            if (r6 != 0) goto L4b
            goto L51
        L4b:
            kotlin.NoWhenBranchMatchedException r5 = new kotlin.NoWhenBranchMatchedException
            r5.<init>()
            throw r5
        L51:
            r0.u = r5
            r0.f223044x = r3
            java.lang.Object r6 = r4.a(r5, r0)
            if (r6 != r1) goto L5c
            return r1
        L5c:
            j8l.l r6 = (j8l.l) r6
            j8l.h r0 = r5.f172239b
            j8l.h r5 = r5.f172240c
            if (r0 == 0) goto L6c
            if (r5 != 0) goto L67
            goto L6c
        L67:
            t7i.b r1 = r4.f
            r1.a(r0, r5)
        L6c:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: o8l.c.b(j8l.k, gim.c):java.lang.Object");
    }
}
