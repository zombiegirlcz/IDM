package akl;

import com.revolut.sso.impl.domain.models.AuthAction;
import com.revolut.sso.impl.domain.models.AuthResult;
import com.revolut.sso.impl.domain.models.SessionToken;
import com.revolut.sso.impl.domain.models.SsoServerError;
import com.revolut.sso.impl.network.services.AuthenticationService;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import vkm.z1;

/* JADX INFO: loaded from: classes12.dex */
public final class h implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AuthenticationService f6019a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k f6020b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final f1 f6021c;
    public final o0 d;
    public final i0 e;
    public final bjl.p0 f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final yjl.v f6022g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final z1 f6023h;
    public mkl.d i;

    public h(AuthenticationService service, k challengesRepository, f1 sessionTokenRepository, o0 revolutAccountUserInfoRepository, i0 pendingAuthenticationRepository, bjl.p0 revolutSsoDependenciesProvider, yjl.v serverResponseErrorMapper) {
        Intrinsics.checkNotNullParameter(service, "service");
        Intrinsics.checkNotNullParameter(challengesRepository, "challengesRepository");
        Intrinsics.checkNotNullParameter(sessionTokenRepository, "sessionTokenRepository");
        Intrinsics.checkNotNullParameter(revolutAccountUserInfoRepository, "revolutAccountUserInfoRepository");
        Intrinsics.checkNotNullParameter(pendingAuthenticationRepository, "pendingAuthenticationRepository");
        Intrinsics.checkNotNullParameter(revolutSsoDependenciesProvider, "revolutSsoDependenciesProvider");
        Intrinsics.checkNotNullParameter(serverResponseErrorMapper, "serverResponseErrorMapper");
        this.f6019a = service;
        this.f6020b = challengesRepository;
        this.f6021c = sessionTokenRepository;
        this.d = revolutAccountUserInfoRepository;
        this.e = pendingAuthenticationRepository;
        this.f = revolutSsoDependenciesProvider;
        this.f6022g = serverResponseErrorMapper;
        this.f6023h = vkm.q.b(0, 7, null);
    }

    public static final AuthResult a(h hVar, SsoServerError ssoServerError) {
        if (ssoServerError instanceof SsoServerError.AuthenticationRejected) {
            SsoServerError.AuthenticationRejected authenticationRejected = (SsoServerError.AuthenticationRejected) ssoServerError;
            return new AuthResult.AuthenticationRejected(authenticationRejected.f106162a, authenticationRejected.f106163b);
        }
        if (ssoServerError instanceof SsoServerError.AuthenticationReviewing) {
            return AuthResult.AuthenticationReviewing.f106070a;
        }
        if (ssoServerError instanceof SsoServerError.CaptchaRequired) {
            return AuthResult.CaptchaRequired.f106072a;
        }
        if ((ssoServerError instanceof SsoServerError.ChallengeNoLongerAvailable) || (ssoServerError instanceof SsoServerError.CountryMismatch) || (ssoServerError instanceof SsoServerError.CodeExpiredOrInvalid)) {
            return null;
        }
        if (ssoServerError instanceof SsoServerError.ConfirmationRequired) {
            return AuthResult.ConfirmationRequired.f106075a;
        }
        if (ssoServerError instanceof SsoServerError.EvidenceNotVerifiedYet) {
            return new AuthResult.EvidenceNotVerifiedYet(((SsoServerError.EvidenceNotVerifiedYet) ssoServerError).f106172a);
        }
        if (ssoServerError instanceof SsoServerError.ExternalIdentityVerificationFailed) {
            return null;
        }
        if (ssoServerError instanceof SsoServerError.Forbidden) {
            return AuthResult.Forbidden.f106081a;
        }
        if ((ssoServerError instanceof SsoServerError.LocationDistance) || (ssoServerError instanceof SsoServerError.LocationRequired)) {
            return null;
        }
        if (ssoServerError instanceof SsoServerError.LoginRejected) {
            return AuthResult.LoginRejected.f106083a;
        }
        if (ssoServerError instanceof SsoServerError.FeatureNotAvailable) {
            return AuthResult.FeatureNotAvailable.f106080a;
        }
        if ((ssoServerError instanceof SsoServerError.AccountIsNotRelatedToUser) || (ssoServerError instanceof SsoServerError.DeviceIdHardwareIdMismatch) || (ssoServerError instanceof SsoServerError.IdentityInUse) || (ssoServerError instanceof SsoServerError.EmailIsTheSame) || (ssoServerError instanceof SsoServerError.PasscodeContainsBirthDate) || (ssoServerError instanceof SsoServerError.PasscodeContainsCurrentDate) || (ssoServerError instanceof SsoServerError.PasscodeContainsIndividualCreatedDate) || (ssoServerError instanceof SsoServerError.PasscodeIsNotStrong) || (ssoServerError instanceof SsoServerError.PasscodeIsTheSame) || (ssoServerError instanceof SsoServerError.PasswordInvalid) || (ssoServerError instanceof SsoServerError.PasswordIsTheSame) || (ssoServerError instanceof SsoServerError.PasswordNotStrongEnough) || (ssoServerError instanceof SsoServerError.PasswordTooLong) || (ssoServerError instanceof SsoServerError.PhoneIsTheSame) || (ssoServerError instanceof SsoServerError.PhoneResidencyMismatch) || (ssoServerError instanceof SsoServerError.SessionTokenAuthFailed)) {
            return null;
        }
        if (ssoServerError instanceof SsoServerError.SessionTokenExpired) {
            return AuthResult.SessionTokenExpired.f106087a;
        }
        if (ssoServerError instanceof SsoServerError.SessionTokenInvalid) {
            return AuthResult.SessionTokenInvalid.f106088a;
        }
        if (ssoServerError instanceof SsoServerError.SocialAccountUnlinked) {
            return AuthResult.SocialAccountUnlinked.f106089a;
        }
        if (ssoServerError instanceof SsoServerError.SsoRequired) {
            return null;
        }
        if (ssoServerError instanceof SsoServerError.TooManyChallenges) {
            SsoServerError.TooManyChallenges tooManyChallenges = (SsoServerError.TooManyChallenges) ssoServerError;
            return new AuthResult.TooManyChallenges(tooManyChallenges.f106197a, tooManyChallenges.f106198b, tooManyChallenges.f106199c);
        }
        if (ssoServerError instanceof SsoServerError.Unauthorised) {
            return AuthResult.Unauthorised.f106097a;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final void b(h hVar, boolean z) {
        i0 i0Var = hVar.e;
        if (i0Var.d() instanceof gkl.r0) {
            if (z) {
                i0Var.f();
            } else {
                i0Var.a();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object c(akl.h r7, com.revolut.sso.impl.domain.models.AuthAction r8, gim.c r9) {
        /*
            Method dump skipped, instruction units count: 210
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: akl.h.c(akl.h, com.revolut.sso.impl.domain.models.AuthAction, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object d(akl.h r5, java.lang.String r6, jkl.r2 r7, com.revolut.sso.impl.domain.models.AuthAction r8, gim.c r9) {
        /*
            boolean r0 = r9 instanceof akl.g
            if (r0 == 0) goto L13
            r0 = r9
            akl.g r0 = (akl.g) r0
            int r1 = r0.f6018y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f6018y = r1
            goto L18
        L13:
            akl.g r0 = new akl.g
            r0.<init>(r5, r9)
        L18:
            java.lang.Object r9 = r0.f6016w
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f6018y
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3a
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            com.revolut.sso.api.models.UserInfo r5 = r0.v
            yhm.o.b(r9)
            return r5
        L2c:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L34:
            jkl.r2 r7 = r0.u
            yhm.o.b(r9)
            goto L54
        L3a:
            yhm.o.b(r9)
            akl.o0 r9 = r5.d
            java.lang.String r2 = r7.getSessionToken()
            java.lang.Integer r8 = yjl.a.c(r8)
            r0.u = r7
            r0.f6018y = r4
            akl.e1 r9 = (akl.e1) r9
            java.lang.Object r9 = r9.g(r6, r2, r8, r0)
            if (r9 != r1) goto L54
            goto L72
        L54:
            com.revolut.sso.api.models.UserInfo r9 = (com.revolut.sso.api.models.UserInfo) r9
            r6 = 0
            if (r9 == 0) goto L74
            akl.f1 r5 = r5.f6021c
            com.revolut.sso.impl.domain.models.SessionToken r8 = new com.revolut.sso.impl.domain.models.SessionToken
            java.lang.String r7 = r7.getSessionToken()
            r8.<init>(r7)
            r0.u = r6
            r0.v = r9
            r0.f6018y = r3
            akl.n1 r5 = (akl.n1) r5
            java.lang.Object r5 = r5.h(r9, r8, r0)
            if (r5 != r1) goto L73
        L72:
            return r1
        L73:
            return r9
        L74:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: akl.h.d(akl.h, java.lang.String, jkl.r2, com.revolut.sso.impl.domain.models.AuthAction, gim.c):java.lang.Object");
    }

    @Override // od0.e
    public final void clear() {
        g(null);
    }

    public final Object e(AuthAction authAction, gkl.i iVar, gim.c cVar) {
        skm.p0 p0Var = skm.p0.f264001a;
        return skm.e0.J(elm.f.f127540b, new e(this, authAction, iVar, null), cVar);
    }

    public final void g(mkl.d dVar) {
        this.i = dVar;
        boolean z = dVar instanceof mkl.b;
        f1 f1Var = this.f6021c;
        if (z) {
            ((n1) f1Var).i(new SessionToken(((mkl.b) dVar).f206501a));
        } else {
            if ((dVar instanceof mkl.a) || (dVar instanceof mkl.c)) {
                return;
            }
            if (dVar != null) {
                throw new NoWhenBranchMatchedException();
            }
            ((n1) f1Var).i(null);
        }
    }
}
