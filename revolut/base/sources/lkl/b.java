package lkl;

import com.revolut.sso.impl.domain.models.SsoServerError;
import java.time.ZonedDateTime;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import jkl.a4;
import jkl.b3;
import jkl.b4;
import jkl.c3;
import jkl.c4;
import jkl.d3;
import jkl.d4;
import jkl.e3;
import jkl.e4;
import jkl.f3;
import jkl.f4;
import jkl.g4;
import jkl.h3;
import jkl.h4;
import jkl.i;
import jkl.i3;
import jkl.i4;
import jkl.j3;
import jkl.k3;
import jkl.l3;
import jkl.m3;
import jkl.n3;
import jkl.o3;
import jkl.p3;
import jkl.q3;
import jkl.r3;
import jkl.s3;
import jkl.t3;
import jkl.u3;
import jkl.v3;
import jkl.w3;
import jkl.x3;
import jkl.y3;
import jkl.z3;
import kg.o;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import mmm.h;
import okhttp3.ResponseBody;
import rd0.c;
import rd0.d;
import retrofit2.HttpException;
import retrofit2.Response;
import ulm.b1;
import ulm.s1;
import zhm.h0;
import zhm.v;

/* JADX INFO: loaded from: classes13.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o f196479a;

    public b(o gson) {
        Intrinsics.checkNotNullParameter(gson, "gson");
        this.f196479a = gson;
    }

    public final SsoServerError a(HttpException exception) {
        ResponseBody responseBodyErrorBody;
        i4 i4Var;
        Intrinsics.checkNotNullParameter(exception, "exception");
        Response<?> response = exception.response();
        if (response != null && (responseBodyErrorBody = response.errorBody()) != null) {
            s1 s1Var = ResponseBody.Companion;
            h hVarClone = responseBodyErrorBody.source().getBuffer().clone();
            b1 b1VarContentType = responseBodyErrorBody.contentType();
            long jContentLength = responseBodyErrorBody.contentLength();
            s1Var.getClass();
            String strString = s1.b(hVarClone, b1VarContentType, jContentLength).string();
            if (strString != null) {
                try {
                    i4Var = (i4) this.f196479a.c(strString, i4.class);
                } catch (Exception e) {
                    h0 h0Var = h0.f322473a;
                    CopyOnWriteArrayList copyOnWriteArrayList = d.f253311a;
                    d.a(c.ERROR, null, null, e, h0Var);
                    i4Var = null;
                }
                if (i4Var != null) {
                    if (i4Var instanceof b3) {
                        return new SsoServerError.AccountIsNotRelatedToUser(((b3) i4Var).getMessage());
                    }
                    if (i4Var instanceof c3) {
                        c3 c3Var = (c3) i4Var;
                        ZonedDateTime zonedDateTimeB = c3Var.getCooldown();
                        Set setA = c3Var.getActions();
                        if (setA == null) {
                            setA = h0.f322473a;
                        }
                        return new SsoServerError.AuthenticationRejected(zonedDateTimeB, setA, c3Var.getMessage());
                    }
                    if (i4Var instanceof d3) {
                        return new SsoServerError.AuthenticationReviewing(((d3) i4Var).getMessage());
                    }
                    if (i4Var instanceof e3) {
                        return new SsoServerError.CaptchaRequired(((e3) i4Var).getMessage());
                    }
                    if (i4Var instanceof f3) {
                        return new SsoServerError.ChallengeNoLongerAvailable(((f3) i4Var).getMessage());
                    }
                    if (i4Var instanceof h3) {
                        return new SsoServerError.CountryMismatch(((h3) i4Var).getMessage());
                    }
                    if (i4Var instanceof i3) {
                        return new SsoServerError.DeviceIdHardwareIdMismatch(((i3) i4Var).getMessage());
                    }
                    if (i4Var instanceof k3) {
                        k3 k3Var = (k3) i4Var;
                        Integer secondsToCompletion = k3Var.getSecondsToCompletion();
                        return new SsoServerError.EvidenceNotVerifiedYet(secondsToCompletion != null ? secondsToCompletion.intValue() : 0, k3Var.getMessage());
                    }
                    if (i4Var instanceof j3) {
                        return new SsoServerError.EmailIsTheSame(((j3) i4Var).getMessage());
                    }
                    if (i4Var instanceof m3) {
                        return new SsoServerError.ExternalIdentityVerificationFailed(((m3) i4Var).getMessage());
                    }
                    if (i4Var instanceof n3) {
                        return new SsoServerError.IdentityInUse(((n3) i4Var).getMessage());
                    }
                    if (i4Var instanceof o3) {
                        return new SsoServerError.LocationDistance(((o3) i4Var).getMessage());
                    }
                    if (i4Var instanceof p3) {
                        return new SsoServerError.LocationRequired(((p3) i4Var).getMessage());
                    }
                    if (i4Var instanceof f4) {
                        f4 f4Var = (f4) i4Var;
                        i iVarD = f4Var.getMethod();
                        ZonedDateTime zonedDateTimeB2 = f4Var.getCooldown();
                        Set setA2 = f4Var.getActions();
                        if (setA2 == null) {
                            setA2 = h0.f322473a;
                        }
                        return new SsoServerError.TooManyChallenges(iVarD, zonedDateTimeB2, setA2, f4Var.getMessage());
                    }
                    if (i4Var instanceof q3) {
                        return new SsoServerError.PasscodeContainsBirthDate(((q3) i4Var).getMessage());
                    }
                    if (i4Var instanceof r3) {
                        return new SsoServerError.PasscodeContainsCurrentDate(((r3) i4Var).getMessage());
                    }
                    if (i4Var instanceof s3) {
                        return new SsoServerError.PasscodeContainsIndividualCreatedDate(((s3) i4Var).getMessage());
                    }
                    if (i4Var instanceof t3) {
                        return new SsoServerError.PasscodeIsNotStrong(((t3) i4Var).getMessage());
                    }
                    if (i4Var instanceof u3) {
                        return new SsoServerError.PasscodeIsTheSame(((u3) i4Var).getMessage());
                    }
                    if (i4Var instanceof v3) {
                        return new SsoServerError.PasswordInvalid(((v3) i4Var).getMessage());
                    }
                    if (i4Var instanceof w3) {
                        return new SsoServerError.PasswordIsTheSame(((w3) i4Var).getMessage());
                    }
                    if (i4Var instanceof x3) {
                        return new SsoServerError.PasswordNotStrongEnough(((x3) i4Var).getMessage());
                    }
                    if (i4Var instanceof y3) {
                        return new SsoServerError.PasswordTooLong(((y3) i4Var).getMessage());
                    }
                    if (i4Var instanceof z3) {
                        return new SsoServerError.PhoneIsTheSame(((z3) i4Var).getMessage());
                    }
                    if (i4Var instanceof a4) {
                        return new SsoServerError.PhoneResidencyMismatch(((a4) i4Var).getMessage());
                    }
                    if (i4Var instanceof b4) {
                        return new SsoServerError.SessionTokenAuthFailed(((b4) i4Var).getMessage());
                    }
                    if (i4Var instanceof c4) {
                        return new SsoServerError.SessionTokenExpired(((c4) i4Var).getMessage());
                    }
                    if (i4Var instanceof d4) {
                        return new SsoServerError.SocialAccountUnlinked(((d4) i4Var).getMessage());
                    }
                    if (i4Var instanceof e4) {
                        e4 e4Var = (e4) i4Var;
                        List listA = e4Var.getAcceptedAuthenticationContexts();
                        if (listA == null) {
                            listA = v.l(e4Var.getAcceptedLevel());
                        }
                        return new SsoServerError.SsoRequired(e4Var.getState(), e4Var.getMessage(), listA);
                    }
                    if (i4Var instanceof g4) {
                        g4 g4Var = (g4) i4Var;
                        return new SsoServerError.Unauthorised(g4Var.getMethod(), g4Var.getRemainingAttempts(), g4Var.getMessage());
                    }
                    if (i4Var instanceof l3) {
                        return new SsoServerError.CodeExpiredOrInvalid(((l3) i4Var).getMessage());
                    }
                    if (i4Var instanceof h4) {
                        return null;
                    }
                    throw new NoWhenBranchMatchedException();
                }
            }
        }
        return null;
    }
}
