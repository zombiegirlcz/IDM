package yjl;

import com.revolut.sso.impl.domain.models.Challenge;
import com.revolut.sso.impl.domain.models.ChallengeDetails;
import com.revolut.sso.impl.domain.models.Operation;
import java.util.ArrayList;
import java.util.List;
import jkl.l2;
import jkl.t;
import jkl.w;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.time.b;

/* JADX INFO: loaded from: classes12.dex */
public abstract class f {
    public static final Challenge a(jkl.w wVar) {
        int i;
        gkl.k kVar;
        ChallengeDetails webAuthn;
        kotlin.time.b bVar;
        long jG;
        long jG2;
        gkl.k kVar2;
        Intrinsics.checkNotNullParameter(wVar, "<this>");
        jkl.i method = wVar.getMethod();
        w.a state = wVar.getState();
        int i2 = state == null ? -1 : e.f314542a[state.ordinal()];
        if (i2 == -1) {
            i = 2;
            kVar = null;
        } else {
            if (i2 == 1) {
                kVar2 = gkl.k.PREPARED;
            } else if (i2 != 2) {
                if (i2 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                i = 2;
                kVar = null;
            } else {
                kVar2 = gkl.k.UNDER_VERIFICATION;
            }
            kVar = kVar2;
            i = 2;
        }
        String id10 = wVar.getId();
        String hint = wVar.getHint();
        String code = wVar.getCode();
        Long expiresAt = wVar.getExpiresAt();
        jkl.v details = wVar.getDetails();
        if (details == null) {
            webAuthn = null;
        } else if (details instanceof jkl.k) {
            webAuthn = new ChallengeDetails.BankId(((jkl.k) details).getDeeplink());
        } else if (details instanceof jkl.l) {
            webAuthn = new ChallengeDetails.BiometricVerification(((jkl.l) details).getVerificationToken());
        } else if (details instanceof jkl.m) {
            webAuthn = new ChallengeDetails.DAP(((jkl.m) details).getDeeplink());
        } else if (details instanceof jkl.n) {
            jkl.n nVar = (jkl.n) details;
            webAuthn = new ChallengeDetails.InSms(nVar.getPhone(), nVar.getText());
        } else if (details instanceof jkl.o) {
            jkl.o oVar = (jkl.o) details;
            webAuthn = new ChallengeDetails.Okta(oVar.getAuthorizationUrl(), oVar.getCallbackUrl());
        } else if (details instanceof jkl.p) {
            webAuthn = new ChallengeDetails.PushOtp(((jkl.p) details).getVisible());
        } else if (details instanceof jkl.q) {
            Long timeoutInMillis = ((jkl.q) details).getTimeoutInMillis();
            if (timeoutInMillis != null) {
                b.Companion companion = kotlin.time.b.INSTANCE;
                jG2 = kotlin.time.c.h(timeoutInMillis.longValue(), pkm.e.MILLISECONDS);
            } else {
                b.Companion companion2 = kotlin.time.b.INSTANCE;
                jG2 = kotlin.time.c.g(60, pkm.e.SECONDS);
            }
            webAuthn = new ChallengeDetails.Rcs(jG2);
        } else if (details instanceof jkl.r) {
            jkl.r rVar = (jkl.r) details;
            String checkUrl = rVar.getCheckUrl();
            Long timeoutInMillis2 = rVar.getTimeoutInMillis();
            if (timeoutInMillis2 != null) {
                b.Companion companion3 = kotlin.time.b.INSTANCE;
                jG = kotlin.time.c.h(timeoutInMillis2.longValue(), pkm.e.MILLISECONDS);
            } else {
                b.Companion companion4 = kotlin.time.b.INSTANCE;
                jG = kotlin.time.c.g(i, pkm.e.SECONDS);
            }
            webAuthn = new ChallengeDetails.SilentAuth(checkUrl, jG);
        } else if (details instanceof jkl.s) {
            jkl.s sVar = (jkl.s) details;
            webAuthn = new ChallengeDetails.UaePass(sVar.getAuthorizationUrl(), sVar.getCallbackUrl());
        } else if (details instanceof jkl.u) {
            Long timeoutInMillis3 = ((jkl.u) details).getTimeoutInMillis();
            if (timeoutInMillis3 != null) {
                b.Companion companion5 = kotlin.time.b.INSTANCE;
                bVar = new kotlin.time.b(kotlin.time.c.h(timeoutInMillis3.longValue(), pkm.e.MILLISECONDS));
            } else {
                bVar = null;
            }
            webAuthn = new ChallengeDetails.WhatsApp(bVar);
        } else {
            if (!(details instanceof jkl.t)) {
                throw new NoWhenBranchMatchedException();
            }
            jkl.t tVar = (jkl.t) details;
            List<t.a> algorithms = tVar.getAlgorithms();
            ArrayList arrayList = new ArrayList(zhm.w.t(algorithms, 10));
            for (t.a aVar : algorithms) {
                arrayList.add(new ChallengeDetails.WebAuthn.Algorithm(aVar.getName(), aVar.getValue()));
            }
            webAuthn = new ChallengeDetails.WebAuthn(tVar.getRelyingParty(), arrayList, tVar.getCredentials());
        }
        l2 operation = wVar.getOperation();
        return new Challenge(method, kVar, id10, hint, code, expiresAt, webAuthn, operation != null ? new Operation(operation.getTitle(), operation.getSubtitle()) : null);
    }
}
