package com.revolut.sso.impl.ui.auth;

import akl.f1;
import akl.i0;
import akl.n1;
import cjl.s;
import com.revolut.sso.api.accounts.RevolutAccount;
import com.revolut.sso.api.login.RevolutSsoApi$DefaultIdentifier;
import com.revolut.sso.api.models.PasswordEvidence;
import com.revolut.sso.api.models.PinEvidence;
import com.revolut.sso.api.models.RevolutAccountSession;
import com.revolut.sso.impl.domain.models.Claim;
import com.revolut.sso.impl.domain.models.InitialAuthenticationCredential;
import com.revolut.sso.impl.domain.models.SessionToken;
import com.revolut.sso.impl.ui.auth.AuthenticationFlowContract$InputData;
import com.revolut.sso.impl.ui.auth.AuthenticationFlowContract$State;
import gkl.r0;
import gkl.s0;
import gkl.u0;
import gkl.v0;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.t;
import zhm.h0;
import zhm.v;
import zhm.y0;

/* JADX INFO: loaded from: classes12.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AuthenticationFlowContract$InputData f106356a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f1 f106357b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final i0 f106358c;
    public final f86.a d;

    public a(AuthenticationFlowContract$InputData inputData, f1 sessionTokenRepository, i0 pendingAuthenticationRepository, f86.a deviceLockProtectionChecker) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(sessionTokenRepository, "sessionTokenRepository");
        Intrinsics.checkNotNullParameter(pendingAuthenticationRepository, "pendingAuthenticationRepository");
        Intrinsics.checkNotNullParameter(deviceLockProtectionChecker, "deviceLockProtectionChecker");
        this.f106356a = inputData;
        this.f106357b = sessionTokenRepository;
        this.f106358c = pendingAuthenticationRepository;
        this.d = deviceLockProtectionChecker;
    }

    public static Claim c(RevolutSsoApi$DefaultIdentifier revolutSsoApi$DefaultIdentifier) {
        if (revolutSsoApi$DefaultIdentifier instanceof RevolutSsoApi$DefaultIdentifier.Predefined.Email) {
            String value = ((RevolutSsoApi$DefaultIdentifier.Predefined.Email) revolutSsoApi$DefaultIdentifier).f105841a;
            Intrinsics.checkNotNullParameter(value, "value");
            return new Claim.Email(value);
        }
        if (revolutSsoApi$DefaultIdentifier instanceof RevolutSsoApi$DefaultIdentifier.Predefined.Phone) {
            String value2 = ((RevolutSsoApi$DefaultIdentifier.Predefined.Phone) revolutSsoApi$DefaultIdentifier).f105842a;
            Intrinsics.checkNotNullParameter(value2, "value");
            return new Claim.Phone(value2);
        }
        if (revolutSsoApi$DefaultIdentifier == RevolutSsoApi$DefaultIdentifier.Preferred.Phone || revolutSsoApi$DefaultIdentifier == RevolutSsoApi$DefaultIdentifier.Preferred.Email) {
            return null;
        }
        throw new NoWhenBranchMatchedException();
    }

    public final AuthenticationFlowContract$State a(String codeChallenge) {
        Intrinsics.checkNotNullParameter(codeChallenge, "codeChallenge");
        v0 v0VarD = this.f106358c.d();
        if (v0VarD == null || !Intrinsics.f(v0VarD.a(), codeChallenge)) {
            v0VarD = null;
        }
        boolean z = v0VarD instanceof r0;
        AuthenticationFlowContract$InputData authenticationFlowContract$InputData = this.f106356a;
        if (!z) {
            if (!(v0VarD instanceof s0)) {
                if (v0VarD == null) {
                    return b(authenticationFlowContract$InputData, codeChallenge);
                }
                throw new NoWhenBranchMatchedException();
            }
            s0 s0Var = (s0) v0VarD;
            if (!(authenticationFlowContract$InputData instanceof AuthenticationFlowContract$InputData.SignIn)) {
                IllegalArgumentException illegalArgumentException = new IllegalArgumentException(a0.d.q("Unexpected input data '", authenticationFlowContract$InputData.getClass(), "' with pending account authentication"));
                h0 h0Var = h0.f322473a;
                CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                rd0.d.a(rd0.c.ERROR, "Revolut SSO", null, illegalArgumentException, h0Var);
                return b(authenticationFlowContract$InputData, codeChallenge);
            }
            AuthenticationFlowContract$InputData.SignIn signIn = (AuthenticationFlowContract$InputData.SignIn) authenticationFlowContract$InputData;
            RevolutAccountSession revolutAccountSession = signIn.f106232a;
            RevolutAccount account = revolutAccountSession != null ? revolutAccountSession.f105973a : null;
            if (account == null) {
                IllegalStateException illegalStateException = new IllegalStateException("Unexpected pending account authentication without an account");
                h0 h0Var2 = h0.f322473a;
                CopyOnWriteArrayList copyOnWriteArrayList2 = rd0.d.f253311a;
                rd0.d.a(rd0.c.ERROR, "Revolut SSO", null, illegalStateException, h0Var2);
                account = null;
            } else {
                Intrinsics.checkNotNullParameter(account, "account");
            }
            AuthenticationFlowContract$InputData.SignIn.Origin origin = signIn.f106234c;
            boolean z3 = origin instanceof AuthenticationFlowContract$InputData.SignIn.Origin.SubAccount;
            AuthenticationFlowContract$InputData.SignIn.Origin.SubAccount subAccount = z3 ? (AuthenticationFlowContract$InputData.SignIn.Origin.SubAccount) origin : null;
            String str = subAccount != null ? subAccount.f106247a : null;
            AuthenticationFlowContract$InputData.SignIn.Origin.SubAccount subAccount2 = z3 ? (AuthenticationFlowContract$InputData.SignIn.Origin.SubAccount) origin : null;
            Boolean bool = subAccount2 != null ? subAccount2.f106248b : null;
            AuthenticationFlowContract$InputData.SignIn.Origin.DuplicateAccount duplicateAccount = origin instanceof AuthenticationFlowContract$InputData.SignIn.Origin.DuplicateAccount ? (AuthenticationFlowContract$InputData.SignIn.Origin.DuplicateAccount) origin : null;
            List list = duplicateAccount != null ? duplicateAccount.f106239c : null;
            AuthenticationFlowContract$InputData.SignIn.Origin.Default r56 = origin instanceof AuthenticationFlowContract$InputData.SignIn.Origin.Default ? (AuthenticationFlowContract$InputData.SignIn.Origin.Default) origin : null;
            return new AuthenticationFlowContract$State.SignIn(codeChallenge, account != null ? new InitialAuthenticationCredential.Account(account) : null, null, str, bool, list, null, s0Var.f144495b, null, null, null, r56 != null ? r56.f106236b : false, 97988);
        }
        r0 r0Var = (r0) v0VarD;
        u0 u0Var = r0Var.f144487b;
        List list2 = r0Var.e;
        String sessionToken = r0Var.f144488c;
        aim.f builder = new aim.f();
        builder.put(AuthenticationFlowContract$InputData.AccessRecovery.class, u0.ACCESS_RECOVERY);
        builder.put(AuthenticationFlowContract$InputData.ExternalClientAuthentication.class, u0.EXTERNAL_CLIENT);
        builder.put(AuthenticationFlowContract$InputData.OperationBoundAuthentication.class, u0.OPERATION_BOUND_AUTHENTICATION);
        builder.put(AuthenticationFlowContract$InputData.SignIn.class, u0.SIGN_IN);
        builder.put(AuthenticationFlowContract$InputData.SignInWithRevolutId.class, u0.SIGN_IN_WITH_REVOLUT_ID);
        Intrinsics.checkNotNullParameter(builder, "builder");
        if (builder.b().get(authenticationFlowContract$InputData.getClass()) != u0Var) {
            CopyOnWriteArrayList copyOnWriteArrayList3 = rd0.d.f253311a;
            rd0.d.b(rd0.c.WARNING, "Revolut SSO", t.f("Stored pending authentication doesn't match requested authentication type\n                    |Requested input data:" + authenticationFlowContract$InputData.getClass() + "\n                    |Stored authentication type: " + u0Var.getClass()), null, null, 16);
            return b(authenticationFlowContract$InputData, codeChallenge);
        }
        if (authenticationFlowContract$InputData instanceof AuthenticationFlowContract$InputData.AccessRecovery) {
            String str2 = r0Var.f144486a;
            Intrinsics.checkNotNullParameter(sessionToken, "sessionToken");
            return new AuthenticationFlowContract$State.AccessRecovery(str2, new InitialAuthenticationCredential.SessionToken(sessionToken), r0Var.f144489g, r0Var.f144490h, 15996);
        }
        if (authenticationFlowContract$InputData instanceof AuthenticationFlowContract$InputData.SignIn) {
            String secret = r0Var.f144491j;
            if (secret != null) {
                Intrinsics.checkNotNullParameter(secret, "secret");
            } else {
                secret = null;
            }
            String secret2 = r0Var.k;
            if (secret2 != null) {
                Intrinsics.checkNotNullParameter(secret2, "secret");
            } else {
                secret2 = null;
            }
            List listL = v.l(secret != null ? new PinEvidence(secret) : secret2 != null ? new PasswordEvidence(secret2) : null);
            String str3 = r0Var.f144486a;
            Intrinsics.checkNotNullParameter(sessionToken, "sessionToken");
            AuthenticationFlowContract$InputData.SignIn signIn2 = (AuthenticationFlowContract$InputData.SignIn) authenticationFlowContract$InputData;
            Claim claimC = c(signIn2.f106233b);
            Set set = r0Var.f144489g;
            Set set2 = r0Var.f144490h;
            AuthenticationFlowContract$InputData.SignIn.Origin origin2 = signIn2.f106234c;
            AuthenticationFlowContract$InputData.SignIn.Origin.SubAccount subAccount3 = origin2 instanceof AuthenticationFlowContract$InputData.SignIn.Origin.SubAccount ? (AuthenticationFlowContract$InputData.SignIn.Origin.SubAccount) origin2 : null;
            return new AuthenticationFlowContract$State.SignIn(str3, new InitialAuthenticationCredential.SessionToken(sessionToken), claimC, subAccount3 != null ? subAccount3.f106247a : null, r0Var.i, r0Var.e, null, listL, null, set, set2, r0Var.f144492l, 94912);
        }
        if (authenticationFlowContract$InputData instanceof AuthenticationFlowContract$InputData.OperationBoundAuthentication) {
            String str4 = r0Var.f144486a;
            Intrinsics.checkNotNullParameter(sessionToken, "sessionToken");
            s sVar = r0Var.d;
            if (list2 == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            AuthenticationFlowContract$InputData.OperationBoundAuthentication operationBoundAuthentication = (AuthenticationFlowContract$InputData.OperationBoundAuthentication) authenticationFlowContract$InputData;
            return new AuthenticationFlowContract$State.OperationBoundAuthentication(str4, new InitialAuthenticationCredential.SessionToken(sessionToken), sVar, list2, r0Var.f, operationBoundAuthentication.d, operationBoundAuthentication.e, null, r0Var.f144489g, r0Var.f144490h, 499584);
        }
        if (authenticationFlowContract$InputData instanceof AuthenticationFlowContract$InputData.ExternalClientAuthentication) {
            String str5 = r0Var.f144486a;
            Intrinsics.checkNotNullParameter(sessionToken, "sessionToken");
            InitialAuthenticationCredential.SessionToken sessionToken2 = new InitialAuthenticationCredential.SessionToken(sessionToken);
            String str6 = ((AuthenticationFlowContract$InputData.ExternalClientAuthentication) authenticationFlowContract$InputData).f106223b;
            if (list2 != null) {
                return new AuthenticationFlowContract$State.ExternalClientAuthentication(str5, sessionToken2, str6, list2, r0Var.f, r0Var.f144489g, r0Var.f144490h, 59872);
            }
            throw new IllegalArgumentException("Required value was null.");
        }
        if (!(authenticationFlowContract$InputData instanceof AuthenticationFlowContract$InputData.SignInWithRevolutId)) {
            throw new NoWhenBranchMatchedException();
        }
        String str7 = r0Var.f144486a;
        AuthenticationFlowContract$InputData.SignInWithRevolutId signInWithRevolutId = (AuthenticationFlowContract$InputData.SignInWithRevolutId) authenticationFlowContract$InputData;
        String str8 = signInWithRevolutId.d;
        String str9 = signInWithRevolutId.f106251c;
        String str10 = signInWithRevolutId.f106249a;
        String str11 = signInWithRevolutId.f106250b;
        Intrinsics.checkNotNullParameter(sessionToken, "sessionToken");
        return new AuthenticationFlowContract$State.SignInWithRevolutIdAuthentication(str7, new InitialAuthenticationCredential.SessionToken(sessionToken), str10, str11, str8, str9);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v10, types: [com.revolut.sso.impl.domain.models.InitialAuthenticationCredential] */
    /* JADX WARN: Type inference failed for: r5v13, types: [com.revolut.sso.impl.domain.models.InitialAuthenticationCredential] */
    /* JADX WARN: Type inference failed for: r5v15, types: [com.revolut.sso.impl.domain.models.InitialAuthenticationCredential] */
    /* JADX WARN: Type inference failed for: r5v16, types: [com.revolut.sso.impl.domain.models.InitialAuthenticationCredential] */
    /* JADX WARN: Type inference failed for: r8v13, types: [java.lang.Boolean] */
    /* JADX WARN: Type inference failed for: r8v6, types: [java.lang.Boolean] */
    public final AuthenticationFlowContract$State b(AuthenticationFlowContract$InputData authenticationFlowContract$InputData, String str) {
        Set setB;
        if (authenticationFlowContract$InputData instanceof AuthenticationFlowContract$InputData.AccessRecovery) {
            AuthenticationFlowContract$InputData.AccessRecovery.Origin origin = ((AuthenticationFlowContract$InputData.AccessRecovery) authenticationFlowContract$InputData).f106219b;
            if (origin instanceof AuthenticationFlowContract$InputData.AccessRecovery.Origin.ForgotPasscode) {
                return new AuthenticationFlowContract$State.AccessRecovery(str, null, null, y0.b(jkl.i.PIN), 16124);
            }
            if (origin instanceof AuthenticationFlowContract$InputData.AccessRecovery.Origin.UnlockAppWithBiometrics) {
                return new AuthenticationFlowContract$State.AccessRecovery(str, null, null, null, 16380);
            }
            throw new NoWhenBranchMatchedException();
        }
        if (!(authenticationFlowContract$InputData instanceof AuthenticationFlowContract$InputData.SignIn)) {
            if (authenticationFlowContract$InputData instanceof AuthenticationFlowContract$InputData.OperationBoundAuthentication) {
                AuthenticationFlowContract$InputData.OperationBoundAuthentication operationBoundAuthentication = (AuthenticationFlowContract$InputData.OperationBoundAuthentication) authenticationFlowContract$InputData;
                return new AuthenticationFlowContract$State.OperationBoundAuthentication(str, null, operationBoundAuthentication.f106225a, operationBoundAuthentication.f106226b, operationBoundAuthentication.f106227c, operationBoundAuthentication.d, operationBoundAuthentication.e, operationBoundAuthentication.f, null, null, 523904);
            }
            if (!(authenticationFlowContract$InputData instanceof AuthenticationFlowContract$InputData.ExternalClientAuthentication)) {
                if (!(authenticationFlowContract$InputData instanceof AuthenticationFlowContract$InputData.SignInWithRevolutId)) {
                    throw new NoWhenBranchMatchedException();
                }
                AuthenticationFlowContract$InputData.SignInWithRevolutId signInWithRevolutId = (AuthenticationFlowContract$InputData.SignInWithRevolutId) authenticationFlowContract$InputData;
                return new AuthenticationFlowContract$State.SignInWithRevolutIdAuthentication(str, null, signInWithRevolutId.f106249a, signInWithRevolutId.f106250b, signInWithRevolutId.d, signInWithRevolutId.f106251c);
            }
            RevolutAccount account = null;
            AuthenticationFlowContract$InputData.ExternalClientAuthentication externalClientAuthentication = (AuthenticationFlowContract$InputData.ExternalClientAuthentication) authenticationFlowContract$InputData;
            RevolutAccountSession revolutAccountSession = externalClientAuthentication.f106222a;
            if (revolutAccountSession != null) {
                account = revolutAccountSession.f105973a;
            }
            if (account == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            Intrinsics.checkNotNullParameter(account, "account");
            return new AuthenticationFlowContract$State.ExternalClientAuthentication(str, new InitialAuthenticationCredential.Account(account), externalClientAuthentication.f106223b, externalClientAuthentication.f106224c, externalClientAuthentication.d, null, null, 61408);
        }
        AuthenticationFlowContract$InputData.SignIn signIn = (AuthenticationFlowContract$InputData.SignIn) authenticationFlowContract$InputData;
        RevolutSsoApi$DefaultIdentifier revolutSsoApi$DefaultIdentifier = signIn.f106233b;
        RevolutAccountSession revolutAccountSession2 = signIn.f106232a;
        RevolutAccount account2 = revolutAccountSession2 != null ? revolutAccountSession2.f105973a : null;
        AuthenticationFlowContract$InputData.SignIn.Origin origin2 = signIn.f106234c;
        if (origin2 instanceof AuthenticationFlowContract$InputData.SignIn.Origin.Default) {
            if (account2 != null) {
                Intrinsics.checkNotNullParameter(account2, "account");
            } else {
                account2 = null;
            }
            AuthenticationFlowContract$InputData.SignIn.Origin.Default r06 = (AuthenticationFlowContract$InputData.SignIn.Origin.Default) origin2;
            return new AuthenticationFlowContract$State.SignIn(str, account2 != null ? new InitialAuthenticationCredential.Account(account2) : null, c(revolutSsoApi$DefaultIdentifier), null, r06.f106235a ? Boolean.TRUE : null, null, null, null, null, null, null, r06.f106236b, 98240);
        }
        boolean z = origin2 instanceof AuthenticationFlowContract$InputData.SignIn.Origin.SignUp.ClaimRequired;
        f1 f1Var = this.f106357b;
        if (z) {
            SessionToken sessionTokenG = ((n1) f1Var).g();
            if (account2 != null) {
                Intrinsics.checkNotNullParameter(account2, "account");
                sessionToken = new InitialAuthenticationCredential.Account(account2);
            } else if (sessionTokenG != null) {
                String sessionToken = sessionTokenG.f106160a;
                Intrinsics.checkNotNullParameter(sessionToken, "sessionToken");
                sessionToken = new InitialAuthenticationCredential.SessionToken(sessionToken);
            }
            return new AuthenticationFlowContract$State.SignIn(str, sessionToken, null, null, Boolean.valueOf(((AuthenticationFlowContract$InputData.SignIn.Origin.SignUp.ClaimRequired) origin2).f106241a), null, null, null, null, null, null, false, 131012);
        }
        if (origin2 instanceof AuthenticationFlowContract$InputData.SignIn.Origin.SignUp.EvidenceRequired) {
            SessionToken sessionTokenG2 = ((n1) f1Var).g();
            if (account2 != null) {
                Intrinsics.checkNotNullParameter(account2, "account");
                sessionToken = new InitialAuthenticationCredential.Account(account2);
            } else if (sessionTokenG2 != null) {
                String sessionToken2 = sessionTokenG2.f106160a;
                Intrinsics.checkNotNullParameter(sessionToken2, "sessionToken");
                sessionToken = new InitialAuthenticationCredential.SessionToken(sessionToken2);
            }
            AuthenticationFlowContract$InputData.SignIn.Origin.SignUp.EvidenceRequired evidenceRequired = (AuthenticationFlowContract$InputData.SignIn.Origin.SignUp.EvidenceRequired) origin2;
            return new AuthenticationFlowContract$State.SignIn(str, sessionToken, c(revolutSsoApi$DefaultIdentifier), null, Boolean.valueOf(evidenceRequired.f106243a), null, evidenceRequired.f106244b, null, evidenceRequired.f106245c, null, null, false, 130368);
        }
        if (origin2 instanceof AuthenticationFlowContract$InputData.SignIn.Origin.SignUp.Social) {
            SessionToken sessionTokenG3 = ((n1) f1Var).g();
            if (account2 != null) {
                Intrinsics.checkNotNullParameter(account2, "account");
                sessionToken = new InitialAuthenticationCredential.Account(account2);
            } else if (sessionTokenG3 != null) {
                String sessionToken3 = sessionTokenG3.f106160a;
                Intrinsics.checkNotNullParameter(sessionToken3, "sessionToken");
                sessionToken = new InitialAuthenticationCredential.SessionToken(sessionToken3);
            }
            return new AuthenticationFlowContract$State.SignIn(str, sessionToken, null, null, Boolean.valueOf(((AuthenticationFlowContract$InputData.SignIn.Origin.SignUp.Social) origin2).f106246a), null, null, null, null, null, null, false, 131012);
        }
        if (origin2 instanceof AuthenticationFlowContract$InputData.SignIn.Origin.DuplicateAccount) {
            AuthenticationFlowContract$InputData.SignIn.Origin.DuplicateAccount duplicateAccount = (AuthenticationFlowContract$InputData.SignIn.Origin.DuplicateAccount) origin2;
            String str2 = duplicateAccount.f106237a;
            gkl.m mVar = duplicateAccount.f106238b;
            if (mVar == null || (setB = y0.b(mVar)) == null) {
                setB = h0.f322473a;
            }
            return new AuthenticationFlowContract$State.SignIn(str, null, new Claim.IdentityId(str2), null, duplicateAccount.d ? Boolean.TRUE : null, duplicateAccount.f106239c, null, null, null, setB, null, false, 129984);
        }
        if (origin2 instanceof AuthenticationFlowContract$InputData.SignIn.Origin.LostAccess) {
            return new AuthenticationFlowContract$State.SignIn(str, null, null, null, null, null, null, null, null, null, null, false, 131012);
        }
        if (!(origin2 instanceof AuthenticationFlowContract$InputData.SignIn.Origin.SubAccount)) {
            throw new NoWhenBranchMatchedException();
        }
        if (account2 != null) {
            Intrinsics.checkNotNullParameter(account2, "account");
        } else {
            account2 = null;
        }
        AuthenticationFlowContract$InputData.SignIn.Origin.SubAccount subAccount = (AuthenticationFlowContract$InputData.SignIn.Origin.SubAccount) origin2;
        return new AuthenticationFlowContract$State.SignIn(str, account2 != null ? new InitialAuthenticationCredential.Account(account2) : null, c(revolutSsoApi$DefaultIdentifier), subAccount.f106247a, subAccount.f106248b, null, null, null, null, null, null, false, 131008);
    }
}
