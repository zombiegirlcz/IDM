package com.revolut.feature_retail_user_declarations.email.screen;

import ang.f;
import cli.y;
import com.revolut.feature.referrals.code.data.api.ReferrerDetailsState;
import com.revolut.feature_retail_user_declarations.UserDeclarationsApi$Toggles;
import com.revolut.feature_retail_user_declarations.email.flow.EmailFlowInputData;
import hx7.e;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import mra.d;
import mre.c;
import oki.h;
import org.jetbrains.annotations.NotNull;
import rch.o;
import skm.e0;
import skm.r;
import vkm.j2;
import vkm.q;
import y8a.g;
import y99.x;
import yai.j;
import yai.k;
import yai.l;
import yai.n;
import yai.s;
import yai.u;
import zhm.f0;

/* JADX INFO: loaded from: classes10.dex */
public final class a extends h implements l {

    @NotNull
    public static final n Companion = new n();
    public final EmailScreenContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final yva.a f97588p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final c f97589q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final zzl.b f97590r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final f f97591s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final gte.a f97592t;
    public final qai.a u;
    public r v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final y f97593w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final com.revolut.kompot.navigable.vc.modal.a f97594x;

    public a(u stateMapper, EmailScreenContract$InputData inputData, yva.a referralCodeInteractor, c termsNavigationFactory, zzl.b regexMatcher, f userInteractor, gte.a featureToggleInteractor, qai.a emailDomainSuggestionsBehaviour) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(referralCodeInteractor, "referralCodeInteractor");
        Intrinsics.checkNotNullParameter(termsNavigationFactory, "termsNavigationFactory");
        Intrinsics.checkNotNullParameter(regexMatcher, "regexMatcher");
        Intrinsics.checkNotNullParameter(userInteractor, "userInteractor");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        Intrinsics.checkNotNullParameter(emailDomainSuggestionsBehaviour, "emailDomainSuggestionsBehaviour");
        this.o = inputData;
        this.f97588p = referralCodeInteractor;
        this.f97589q = termsNavigationFactory;
        this.f97590r = regexMatcher;
        this.f97591s = userInteractor;
        this.f97592t = featureToggleInteractor;
        this.u = emailDomainSuggestionsBehaviour;
        EmailFlowInputData.PrefillEmailData prefillEmailData = inputData.f97586g;
        String str = prefillEmailData != null ? prefillEmailData.f97561a : null;
        str = str == null ? "" : str;
        String str2 = prefillEmailData != null ? prefillEmailData.f97561a : null;
        String str3 = str2 != null ? str2 : "";
        String str4 = prefillEmailData != null ? prefillEmailData.f97561a : null;
        j jVar = new j(str3, !(str4 == null || str4.length() == 0));
        EmailFlowInputData.PrefillEmailData prefillEmailData2 = inputData.f97586g;
        this.f97593w = d.b(this, new k(str, jVar, prefillEmailData2 != null ? prefillEmailData2.f97563c : true, inputData.f97584b, ReferrerDetailsState.Disabled.f81679a, f0.f322471a), stateMapper, null, false, 12);
        this.f97594x = e.a(this, new g(this, 4));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object I2(com.revolut.feature_retail_user_declarations.email.screen.a r10, java.lang.String r11, kotlin.coroutines.Continuation r12) {
        /*
            r10.getClass()
            boolean r0 = r12 instanceof yai.o
            if (r0 == 0) goto L16
            r0 = r12
            yai.o r0 = (yai.o) r0
            int r1 = r0.z
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.z = r1
            goto L1b
        L16:
            yai.o r0 = new yai.o
            r0.<init>(r10, r12)
        L1b:
            java.lang.Object r12 = r0.f312039x
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.z
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L42
            if (r2 == r4) goto L38
            if (r2 != r3) goto L30
            java.lang.String r10 = r0.u
            yhm.o.b(r12)
            goto Lbb
        L30:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L38:
            long r5 = r0.f312038w
            boolean r11 = r0.v
            java.lang.String r2 = r0.u
            yhm.o.b(r12)
            goto L67
        L42:
            yhm.o.b(r12)
            zzl.b r12 = r10.f97590r
            java.lang.String r2 = "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z0-9-]{2,63}$"
            zzl.c r12 = (zzl.c) r12
            boolean r12 = r12.a(r2, r11)
            if (r12 == 0) goto L54
            r5 = 300(0x12c, double:1.48E-321)
            goto L56
        L54:
            r5 = 800(0x320, double:3.953E-321)
        L56:
            r0.u = r11
            r0.v = r12
            r0.f312038w = r5
            r0.z = r4
            java.lang.Object r2 = skm.k0.b(r5, r0)
            if (r2 != r1) goto L65
            goto Lb9
        L65:
            r2 = r11
            r11 = r12
        L67:
            if (r11 != 0) goto L70
            yai.j r10 = new yai.j
            r11 = 0
            r10.<init>(r2, r11)
            return r10
        L70:
            ang.f r10 = r10.f97591s
            r10.getClass()
            java.lang.String r12 = "email"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r12)
            gng.a r10 = r10.f7769a
            hng.q r10 = (hng.q) r10
            r10.getClass()
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r12)
            eng.c r12 = new eng.c
            r12.<init>(r2)
            com.revolut.feature.user.impl.network.service.UserService r7 = r10.f154114a
            efm.b r12 = r7.validateEmail(r12)
            zlg.l r7 = zlg.l.f323259a
            pfm.z r12 = r12.D(r7)
            hng.i r7 = new hng.i
            r8 = 1
            r7.<init>(r10, r8)
            pfm.z r10 = new pfm.z
            r8 = 0
            r9 = 1
            r10.<init>(r12, r9, r7, r8)
            java.lang.String r12 = "onErrorReturn(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r10, r12)
            ufm.n r10 = te0.w.i0(r10)
            r0.u = r2
            r0.v = r11
            r0.f312038w = r5
            r0.z = r3
            java.lang.Object r12 = nim.a.b(r10, r0)
            if (r12 != r1) goto Lba
        Lb9:
            return r1
        Lba:
            r10 = r2
        Lbb:
            zlg.m r12 = (zlg.m) r12
            yai.j r11 = new yai.j
            boolean r12 = r12 instanceof zlg.j
            r12 = r12 ^ r4
            r11.<init>(r10, r12)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature_retail_user_declarations.email.screen.a.I2(com.revolut.feature_retail_user_declarations.email.screen.a, java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // yji.l
    public final void I1() {
        Continuation continuation = null;
        if (((jte.d) this.f97592t).c(UserDeclarationsApi$Toggles.EmailDomainSuggestions.f97477c)) {
            l2(new yai.r(this, continuation, 0), new yi5.b(26));
        }
        EmailScreenContract$InputData emailScreenContract$InputData = this.o;
        if (emailScreenContract$InputData.f97585c) {
            if (!emailScreenContract$InputData.d) {
                this.v = e0.b();
            }
            l2(new yai.r(this, continuation, 1), new yi5.b(26));
        }
    }

    public final void J2(String str) {
        y yVar = this.f97593w;
        C2(new s(((k) ((j2) yVar.f22677a).getValue()).f312032a, str, ((k) ((j2) yVar.f22677a).getValue()).f312034c));
    }

    @Override // zki.h
    public final com.revolut.kompot.navigable.vc.modal.a K() {
        return this.f97594x;
    }

    @Override // yji.l
    public final void T1(long j2) {
        yji.l.b1(this, q.H(new o(2, this, a.class, "getEmailValidationResult", "getEmailValidationResult(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0, 28), q.q(this.f97593w.B(new x(18)))), null, new y83.d(this, (Continuation) null, 6), 3);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f97593w;
    }
}
