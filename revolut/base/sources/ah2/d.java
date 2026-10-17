package ah2;

import android.content.Context;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import wsg.n;

/* JADX INFO: loaded from: classes21.dex */
public final class d {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f4874a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final uw1.c f4875b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final n f4876c;
    public final kbb.c d;
    public final zzl.b e;

    public d(Context context, uw1.c apmFeatureChecker, n walletInteractor, kbb.c accountDetailsInteractor, zzl.b regexMatcher) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(apmFeatureChecker, "apmFeatureChecker");
        Intrinsics.checkNotNullParameter(walletInteractor, "walletInteractor");
        Intrinsics.checkNotNullParameter(accountDetailsInteractor, "accountDetailsInteractor");
        Intrinsics.checkNotNullParameter(regexMatcher, "regexMatcher");
        this.f4874a = context;
        this.f4875b = apmFeatureChecker;
        this.f4876c = walletInteractor;
        this.d = accountDetailsInteractor;
        this.e = regexMatcher;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(gim.c r7) {
        /*
            Method dump skipped, instruction units count: 227
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ah2.d.a(gim.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x007b, code lost:
    
        if (r13 == r1) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(gim.c r13) {
        /*
            r12 = this;
            boolean r0 = r13 instanceof ah2.c
            if (r0 == 0) goto L13
            r0 = r13
            ah2.c r0 = (ah2.c) r0
            int r1 = r0.f4873w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f4873w = r1
            goto L18
        L13:
            ah2.c r0 = new ah2.c
            r0.<init>(r12, r13)
        L18:
            java.lang.Object r13 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f4873w
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L36
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            yhm.o.b(r13)
            goto L7e
        L2a:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r0)
            throw r13
        L32:
            yhm.o.b(r13)
            goto L4a
        L36:
            yhm.o.b(r13)
            wsg.n r13 = r12.f4876c
            com.revolut.core.model.account.AccountId$Personal r2 = com.revolut.core.model.account.AccountId.Personal.f51414a
            ufm.i r13 = r13.E(r2)
            r0.f4873w = r4
            java.lang.Object r13 = nim.a.b(r13, r0)
            if (r13 != r1) goto L4a
            goto L7d
        L4a:
            r7 = r13
            java.lang.String r7 = (java.lang.String) r7
            kotlin.jvm.internal.Intrinsics.h(r7)
            xi0.a r13 = xi0.b.Companion
            r13.getClass()
            xi0.b r8 = xi0.b.E
            io3.l r9 = io3.l.CURRENT
            io3.i r10 = io3.i.INTERNAL
            wi0.a r13 = wi0.b.Companion
            r13.getClass()
            wi0.b r11 = wi0.b.O0
            kbb.c r5 = r12.d
            w4l.h r6 = w4l.h.f294642c
            efm.r r13 = r5.G(r6, r7, r8, r9, r10, r11)
            ah1.p r2 = new ah1.p
            r5 = 1
            r2.<init>(r5)
            r5 = 0
            efm.r r13 = m70.a.g(r13, r5, r2, r4)
            r0.f4873w = r3
            java.lang.Object r13 = nim.a.c(r13, r0)
            if (r13 != r1) goto L7e
        L7d:
            return r1
        L7e:
            dda.a r13 = (dda.a) r13
            kotlin.jvm.internal.Intrinsics.h(r13)
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: ah2.d.b(gim.c):java.lang.Object");
    }
}
