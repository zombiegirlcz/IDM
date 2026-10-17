package si5;

import com.revolut.core.ui_kit.delegates.ActionWidgetDelegate;
import com.revolut.core.ui_kit.delegates.t;
import jhi.k;
import ji5.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import rch.o;
import sbb.w;

/* JADX INFO: loaded from: classes3.dex */
public final class b extends bi5.a {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final i f263515l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final xh5.a f263516m;

    public b(i onboardingInteractor, xh5.a cryptoFeatureEnabledInteractor) {
        Intrinsics.checkNotNullParameter(onboardingInteractor, "onboardingInteractor");
        Intrinsics.checkNotNullParameter(cryptoFeatureEnabledInteractor, "cryptoFeatureEnabledInteractor");
        this.f263515l = onboardingInteractor;
        this.f263516m = cryptoFeatureEnabledInteractor;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object c3(si5.b r7, ec5.c r8, kotlin.coroutines.Continuation r9) {
        /*
            r7.getClass()
            boolean r0 = r9 instanceof si5.a
            if (r0 == 0) goto L16
            r0 = r9
            si5.a r0 = (si5.a) r0
            int r1 = r0.f263514y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.f263514y = r1
            goto L1b
        L16:
            si5.a r0 = new si5.a
            r0.<init>(r7, r9)
        L1b:
            java.lang.Object r9 = r0.f263512w
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f263514y
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L3b
            if (r2 != r4) goto L33
            ec5.d r7 = r0.v
            ec5.c r8 = r0.u
            yhm.o.b(r9)
            yhm.m r9 = (yhm.m) r9
            java.lang.Object r9 = r9.f314193a
            goto L69
        L33:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L3b:
            yhm.o.b(r9)
            ec5.d r9 = r8.f124434c
            if (r9 != 0) goto L43
            return r8
        L43:
            ec5.j r2 = r8.f124432a
            ec5.j r5 = ec5.j.COMPLETED
            if (r2 != r5) goto L9e
            boolean r2 = r9.d
            if (r2 == 0) goto L9e
            java.lang.String r2 = r9.f124437c
            if (r2 == 0) goto L57
            int r2 = r2.length()
            if (r2 != 0) goto L9e
        L57:
            ji5.i r7 = r7.f263515l
            r0.u = r8
            r0.v = r9
            r0.f263514y = r4
            java.lang.Object r7 = r7.c(r3, r0)
            if (r7 != r1) goto L66
            return r1
        L66:
            r6 = r9
            r9 = r7
            r7 = r6
        L69:
            yhm.o.b(r9)
            ec5.c r9 = (ec5.c) r9
            ec5.d r0 = r9.f124434c
            if (r0 == 0) goto L74
            java.lang.String r3 = r0.f124437c
        L74:
            if (r3 == 0) goto L96
            ec5.h r0 = r8.d
            if (r0 != 0) goto L7c
            ec5.h r0 = r9.d
        L7c:
            java.lang.String r9 = r7.f124435a
            java.lang.String r1 = r7.f124436b
            boolean r7 = r7.d
            ec5.d r2 = new ec5.d
            r2.<init>(r9, r1, r3, r7)
            ec5.j r7 = r8.f124432a
            boolean r8 = r8.f124433b
            java.lang.String r9 = "status"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r9)
            ec5.c r9 = new ec5.c
            r9.<init>(r7, r8, r2, r0)
            return r9
        L96:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "Remediation workflow ID is missing from the onboarding start response"
            r7.<init>(r8)
            throw r7
        L9e:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: si5.b.c3(si5.b, ec5.c, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // bi5.a
    public final Unit Z2(t tVar) {
        Object obj2 = tVar.f54722b.f51596l;
        Continuation continuation = null;
        bi5.c cVar = obj2 instanceof bi5.c ? (bi5.c) obj2 : null;
        if (cVar == null) {
            return Unit.f186387a;
        }
        if (Intrinsics.f(tVar.f54721a, ActionWidgetDelegate.a.c.f51609a)) {
            T2(new w(this, cVar, continuation, 11), new yi5.b(27));
        }
        return Unit.f186387a;
    }

    @Override // bi5.a
    public final k b3() {
        return nim.a.u(new o(2, this, b.class, "prepareRemediationWorkflow", "prepareRemediationWorkflow(Lcom/revolut/feature/crypto/account/api/model/CryptoAccountOnboarding;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0, 6), this.f263515l.a(false));
    }
}
