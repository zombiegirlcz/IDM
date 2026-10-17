package rb9;

import cli.n;
import cli.y;
import com.revolut.core.error.data.model.ServerError;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.onboarding.impl.R$string;
import com.revolut.feature.onboarding.impl.onboarding.risk_check.RiskCheckScreenContract$InputData;
import com.revolut.revolut.feature_fourthline_impl.R;
import fwj.p;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.TimeUnit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import nii.y0;
import nii.z;
import org.jetbrains.annotations.NotNull;
import yji.l;
import zhm.h0;

/* JADX INFO: loaded from: classes5.dex */
public final class i extends oki.h implements d {

    @NotNull
    public static final f Companion = new f();

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final long f253003r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final long f253004s;
    public final p o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final sf0.h f253005p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final y f253006q;

    static {
        TimeUnit timeUnit = TimeUnit.SECONDS;
        f253003r = timeUnit.toMillis(4L);
        f253004s = timeUnit.toMillis(2L);
    }

    public i(RiskCheckScreenContract$InputData inputData, n stateMapper, p userOnboardingInteractor, sf0.h serverErrorParser) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(userOnboardingInteractor, "userOnboardingInteractor");
        Intrinsics.checkNotNullParameter(serverErrorParser, "serverErrorParser");
        this.o = userOnboardingInteractor;
        this.f253005p = serverErrorParser;
        this.f253006q = mra.d.b(this, new b(inputData.f78485a), stateMapper, null, false, 12);
    }

    public static final void I2(i iVar, Throwable th10) {
        iVar.getClass();
        h0 h0Var = h0.f322473a;
        CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
        Continuation continuation = null;
        rd0.d.a(rd0.c.ERROR, null, null, th10, h0Var);
        ServerError serverErrorA = iVar.f253005p.a(th10);
        Integer numValueOf = serverErrorA != null ? Integer.valueOf(serverErrorA.f51362a) : null;
        int iA = i89.a.CAN_NOT_OPEN_ACCOUNT.a();
        if (numValueOf == null || numValueOf.intValue() != iA) {
            int iA2 = i89.a.CAN_NOT_OPEN_ACCOUNT_FOREIGN_APPLICANT.a();
            if (numValueOf == null || numValueOf.intValue() != iA2) {
                l.a1(iVar, iVar.X1(new y0("DIALOG_ID", new z(new TextLocalisedClause(R$string.qes_error_dialog_title, null, null, 14), null, new TextLocalisedClause(R.string.common_action_try_again, null, null, 14), null, null, null, true, null, null, null, null, null, null, 32502), false, 4)), null, null, new r5e.e(iVar, continuation, 15), 3);
                return;
            }
        }
        iVar.C2(c.f252998a);
    }

    @Override // yji.l
    public final void I1() {
        l2(new g(this, null, 0), new qi3.i(1, this, i.class, "handleError", "handleError(Ljava/lang/Throwable;)Z", 0, 22));
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:30:0x008b -> B:21:0x004c). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object J2(long r8, gim.c r10) {
        /*
            r7 = this;
            boolean r0 = r10 instanceof rb9.h
            if (r0 == 0) goto L13
            r0 = r10
            rb9.h r0 = (rb9.h) r0
            int r1 = r0.f253002x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f253002x = r1
            goto L18
        L13:
            rb9.h r0 = new rb9.h
            r0.<init>(r7, r10)
        L18:
            java.lang.Object r10 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f253002x
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L3e
            if (r2 == r5) goto L38
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            goto L38
        L2a:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L32:
            long r8 = r0.u
            yhm.o.b(r10)
            goto L6c
        L38:
            long r8 = r0.u
            yhm.o.b(r10)
            goto L4c
        L3e:
            yhm.o.b(r10)
            r0.u = r8
            r0.f253002x = r5
            java.lang.Object r10 = skm.k0.b(r8, r0)
            if (r10 != r1) goto L4c
            goto L8d
        L4c:
            kotlin.coroutines.CoroutineContext r10 = r0.getContext()
            boolean r10 = skm.e0.x(r10)
            if (r10 == 0) goto L8e
            fwj.p r10 = r7.o
            t0j.a r10 = r10.f138685a
            twj.f r10 = (twj.f) r10
            r2 = 0
            ufm.i r10 = r10.d(r2)
            r0.u = r8
            r0.f253002x = r4
            java.lang.Object r10 = nim.a.b(r10, r0)
            if (r10 != r1) goto L6c
            goto L8d
        L6c:
            java.util.List r10 = (java.util.List) r10
            kotlin.jvm.internal.Intrinsics.h(r10)
            java.lang.Object r10 = zhm.d0.d0(r10)
            com.revolut.retail.feature.api.userauth.models.UserAuthElement r10 = (com.revolut.retail.feature.api.userauth.models.UserAuthElement) r10
            boolean r10 = r10 instanceof com.revolut.retail.feature.api.userauth.models.UserAuthElement.RiskCheck
            if (r10 != 0) goto L81
            rb9.c r8 = rb9.c.f252998a
            r7.C2(r8)
            goto L8e
        L81:
            r0.u = r8
            r0.f253002x = r3
            long r5 = rb9.i.f253004s
            java.lang.Object r10 = skm.k0.b(r5, r0)
            if (r10 != r1) goto L4c
        L8d:
            return r1
        L8e:
            kotlin.Unit r8 = kotlin.Unit.f186387a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: rb9.i.J2(long, gim.c):java.lang.Object");
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f253006q;
    }
}
