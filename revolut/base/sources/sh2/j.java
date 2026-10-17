package sh2;

import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
public final class j implements c12.r {

    @NotNull
    public static final g Companion = new g();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final qh2.a f263402a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AtomicBoolean f263403b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AtomicBoolean f263404c;

    public j(qh2.a weroInteractor) {
        Intrinsics.checkNotNullParameter(weroInteractor, "weroInteractor");
        this.f263402a = weroInteractor;
        this.f263403b = new AtomicBoolean(true);
        this.f263404c = new AtomicBoolean(true);
    }

    @Override // c12.r
    public final Object a(String str, Continuation continuation) {
        return Intrinsics.f(str, "WERO_PENDING_RETRY") ? b((gim.c) continuation) : Intrinsics.f(str, "WERO_PENDING_REGISTER") ? c((gim.c) continuation) : c12.p.f20345a;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(gim.c r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof sh2.h
            if (r0 == 0) goto L13
            r0 = r6
            sh2.h r0 = (sh2.h) r0
            int r1 = r0.f263400w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f263400w = r1
            goto L18
        L13:
            sh2.h r0 = new sh2.h
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f263400w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r6)
            goto L3f
        L27:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L2f:
            yhm.o.b(r6)
            r0.f263400w = r3
            qh2.a r6 = r5.f263402a
            qh2.h r6 = (qh2.h) r6
            java.lang.Object r6 = r6.b(r0)
            if (r6 != r1) goto L3f
            return r1
        L3f:
            com.revolut.feature.apm.wero.impl.common.WeroRegistrationStatus r6 = (com.revolut.feature.apm.wero.impl.common.WeroRegistrationStatus) r6
            boolean r0 = r6 instanceof com.revolut.feature.apm.wero.impl.common.WeroRegistrationStatus.Active
            if (r0 == 0) goto L4b
            c12.o r0 = new c12.o
            r0.<init>(r6)
            return r0
        L4b:
            java.util.concurrent.atomic.AtomicBoolean r6 = r5.f263403b
            r0 = 0
            boolean r6 = r6.compareAndSet(r3, r0)
            if (r6 == 0) goto L5a
            c12.n r6 = new c12.n
            r6.<init>()
            return r6
        L5a:
            c12.l r6 = new c12.l
            com.revolut.core.ui_kit.models.TextLocalisedClause r0 = new com.revolut.core.ui_kit.models.TextLocalisedClause
            int r1 = com.revolut.feature.apm.core.api.R$string.apm_registration_pending_dialog_title
            r2 = 0
            r3 = 14
            r0.<init>(r1, r2, r2, r3)
            com.revolut.core.ui_kit.models.TextLocalisedClause r1 = new com.revolut.core.ui_kit.models.TextLocalisedClause
            int r4 = com.revolut.feature.apm.core.api.R$string.apm_registration_pending_dialog_subtitle
            r1.<init>(r4, r2, r2, r3)
            r6.<init>(r0, r1)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: sh2.j.b(gim.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0056, code lost:
    
        if (r6 == r1) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(gim.c r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof sh2.i
            if (r0 == 0) goto L13
            r0 = r6
            sh2.i r0 = (sh2.i) r0
            int r1 = r0.f263401w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f263401w = r1
            goto L18
        L13:
            sh2.i r0 = new sh2.i
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f263401w
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L36
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            yhm.o.b(r6)
            goto L59
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L32:
            yhm.o.b(r6)
            return r6
        L36:
            yhm.o.b(r6)
            java.util.concurrent.atomic.AtomicBoolean r6 = r5.f263404c
            r2 = 0
            boolean r6 = r6.compareAndSet(r4, r2)
            if (r6 != 0) goto L4c
            r0.f263401w = r4
            java.lang.Object r6 = r5.b(r0)
            if (r6 != r1) goto L4b
            goto L58
        L4b:
            return r6
        L4c:
            r0.f263401w = r3
            qh2.a r6 = r5.f263402a
            qh2.h r6 = (qh2.h) r6
            java.lang.Object r6 = r6.f(r0)
            if (r6 != r1) goto L59
        L58:
            return r1
        L59:
            i02.h r6 = (i02.h) r6
            boolean r0 = r6 instanceof i02.f
            if (r0 == 0) goto L67
            c12.o r6 = new c12.o
            kotlin.Unit r0 = kotlin.Unit.f186387a
            r6.<init>(r0)
            return r6
        L67:
            boolean r6 = r6 instanceof i02.g
            if (r6 == 0) goto L71
            c12.n r6 = new c12.n
            r6.<init>()
            return r6
        L71:
            kotlin.NoWhenBranchMatchedException r6 = new kotlin.NoWhenBranchMatchedException
            r6.<init>()
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: sh2.j.c(gim.c):java.lang.Object");
    }
}
