package com.revolut.feature.referrals.impl.personalized_tracking;

import cli.g;
import cli.y;
import com.revolut.feature.referrals.impl.personalized_tracking.PersonalizedTrackingControllerContract$InputData;
import jul.o;
import jxa.f;
import jxa.i;
import jxa.k;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import lhk.a0;
import mra.d;
import n8a.r;
import nxa.c0;
import nxa.l;
import nxa.p;
import nxa.w;
import oki.h;
import org.jetbrains.annotations.NotNull;
import vii.b;
import vkm.q;
import wli.x;

/* JADX INFO: loaded from: classes5.dex */
public final class a extends h implements p {

    @NotNull
    private static final w Companion = new w();
    public final PersonalizedTrackingControllerContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final o f81793p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final x f81794q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final f f81795r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final i f81796s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final k f81797t;
    public final yva.a u;
    public final gte.a v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final b f81798w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final y f81799x;

    public a(c0 stateMapper, PersonalizedTrackingControllerContract$InputData inputData, o personalizedTrackingInteractor, x deeplinkHandler, f sharedCryptoInteractor, i sharedProInteractor, k sharedSalaryInteractor, yva.a referralCodeInteractor, gte.a featureToggleInteractor) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(personalizedTrackingInteractor, "personalizedTrackingInteractor");
        Intrinsics.checkNotNullParameter(deeplinkHandler, "deeplinkHandler");
        Intrinsics.checkNotNullParameter(sharedCryptoInteractor, "sharedCryptoInteractor");
        Intrinsics.checkNotNullParameter(sharedProInteractor, "sharedProInteractor");
        Intrinsics.checkNotNullParameter(sharedSalaryInteractor, "sharedSalaryInteractor");
        Intrinsics.checkNotNullParameter(referralCodeInteractor, "referralCodeInteractor");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        this.o = inputData;
        this.f81793p = personalizedTrackingInteractor;
        this.f81794q = deeplinkHandler;
        this.f81795r = sharedCryptoInteractor;
        this.f81796s = sharedProInteractor;
        this.f81797t = sharedSalaryInteractor;
        this.u = referralCodeInteractor;
        this.v = featureToggleInteractor;
        this.f81798w = new b(w4l.i.f294643c);
        this.f81799x = d.b(this, new l(0), stateMapper, null, false, 12);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object I2(com.revolut.feature.referrals.impl.personalized_tracking.a r5, gim.c r6) throws java.lang.Throwable {
        /*
            boolean r0 = r6 instanceof nxa.y
            if (r0 == 0) goto L13
            r0 = r6
            nxa.y r0 = (nxa.y) r0
            int r1 = r0.f220539w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f220539w = r1
            goto L18
        L13:
            nxa.y r0 = new nxa.y
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f220539w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r6)
            goto L76
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            yhm.o.b(r6)
            cli.y r6 = r5.f81799x
            java.lang.Object r6 = r6.f22677a
            vkm.j2 r6 = (vkm.j2) r6
            java.lang.Object r6 = r6.getValue()
            nxa.l r6 = (nxa.l) r6
            java.lang.String r6 = r6.f220501a
            r2 = 0
            if (r6 == 0) goto L69
            jul.o r5 = r5.f81793p
            r0.f220539w = r3
            java.lang.Object r5 = r5.f178695b
            gxa.c r5 = (gxa.c) r5
            r5.getClass()
            gxa.b r3 = new gxa.b
            r4 = 0
            r3.<init>(r5, r6, r2, r4)
            skm.p0 r5 = skm.p0.f264001a
            elm.f r5 = elm.f.f127540b
            java.lang.Object r5 = skm.e0.J(r5, r3, r0)
            if (r5 != r1) goto L5f
            goto L61
        L5f:
            kotlin.Unit r5 = kotlin.Unit.f186387a
        L61:
            if (r5 != r1) goto L64
            goto L66
        L64:
            kotlin.Unit r5 = kotlin.Unit.f186387a
        L66:
            if (r5 != r1) goto L76
            return r1
        L69:
            zhm.h0 r5 = zhm.h0.f322473a
            java.util.concurrent.CopyOnWriteArrayList r6 = rd0.d.f253311a
            rd0.c r6 = rd0.c.ERROR
            java.lang.String r0 = "inviteId is null when accepting invitation"
            java.lang.String r1 = "PersonalizedTrackingControllerModel"
            rd0.d.a(r6, r1, r0, r2, r5)
        L76:
            kotlin.Unit r5 = kotlin.Unit.f186387a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.referrals.impl.personalized_tracking.a.I2(com.revolut.feature.referrals.impl.personalized_tracking.a, gim.c):java.lang.Object");
    }

    @Override // yji.l
    public final void I1() {
        PersonalizedTrackingControllerContract$InputData personalizedTrackingControllerContract$InputData = this.o;
        Continuation continuation = null;
        if (!(personalizedTrackingControllerContract$InputData instanceof PersonalizedTrackingControllerContract$InputData.InviteId)) {
            if (!(personalizedTrackingControllerContract$InputData instanceof PersonalizedTrackingControllerContract$InputData.Code)) {
                throw new NoWhenBranchMatchedException();
            }
            PersonalizedTrackingControllerContract$InputData.Code code = (PersonalizedTrackingControllerContract$InputData.Code) personalizedTrackingControllerContract$InputData;
            l2(new r(this, code.f81788a, code.f81789b, continuation, 28), new yi5.b(26));
            return;
        }
        String str = ((PersonalizedTrackingControllerContract$InputData.InviteId) personalizedTrackingControllerContract$InputData).f81790a;
        H2(this.f81799x, new nj8.b(str, 18));
        yji.l.a1(this, q.Q(this.f81798w, new k25.o(continuation, this, str, 23)), null, null, new a0(this, str, continuation, 24), 3);
    }

    @Override // cli.z
    public final g getState() {
        return this.f81799x;
    }
}
