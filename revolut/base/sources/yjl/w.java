package yjl;

import com.revolut.core.error.data.model.ServerErrorException;
import com.revolut.sso.impl.domain.models.SsoServerError;
import kotlin.jvm.internal.Intrinsics;
import retrofit2.HttpException;
import retrofit2.Response;
import zhm.h0;

/* JADX INFO: loaded from: classes12.dex */
public final class w implements v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final lkl.b f314556a;

    public w(lkl.b ssoServerErrorParser) {
        Intrinsics.checkNotNullParameter(ssoServerErrorParser, "ssoServerErrorParser");
        this.f314556a = ssoServerErrorParser;
    }

    public final SsoServerError a(Response response) {
        Intrinsics.checkNotNullParameter(response, "response");
        if (response.isSuccessful()) {
            throw new IllegalArgumentException("Mapper is not supposed to be called for successful responses");
        }
        int iCode = response.code();
        lkl.b bVar = this.f314556a;
        if (iCode == 400) {
            HttpException httpException = new HttpException(response);
            SsoServerError ssoServerErrorA = bVar.a(httpException);
            if ((ssoServerErrorA instanceof SsoServerError.DeviceIdHardwareIdMismatch) || (ssoServerErrorA instanceof SsoServerError.CaptchaRequired) || (ssoServerErrorA instanceof SsoServerError.LocationRequired)) {
                return ssoServerErrorA;
            }
            throw httpException;
        }
        if (iCode == 401) {
            SsoServerError ssoServerErrorA2 = bVar.a(new HttpException(response));
            if (ssoServerErrorA2 instanceof SsoServerError.SocialAccountUnlinked) {
                return ssoServerErrorA2;
            }
            if (!(ssoServerErrorA2 instanceof SsoServerError.Unauthorised)) {
                return ssoServerErrorA2 == null ? new SsoServerError.SessionTokenInvalid(null) : new SsoServerError.SessionTokenInvalid(ssoServerErrorA2.getMessage());
            }
            SsoServerError.Unauthorised unauthorised = (SsoServerError.Unauthorised) ssoServerErrorA2;
            Integer num = unauthorised.f106201b;
            return (num != null && num.intValue() == 0) ? new SsoServerError.TooManyChallenges(unauthorised.f106200a, null, h0.f322473a, unauthorised.f106202c) : ssoServerErrorA2;
        }
        if (iCode == 403) {
            ServerErrorException.Companion companion = ServerErrorException.INSTANCE;
            HttpException httpException2 = new HttpException(response);
            kg.o oVarA = ikl.a.a();
            companion.getClass();
            int i = ServerErrorException.Companion.c(httpException2, oVarA).f.f51362a;
            if (i == 9002) {
                return new SsoServerError.LoginRejected(0);
            }
            if (i == 9150) {
                return new SsoServerError.FeatureNotAvailable(0);
            }
            SsoServerError ssoServerErrorA3 = bVar.a(new HttpException(response));
            return ((ssoServerErrorA3 instanceof SsoServerError.TooManyChallenges) || (ssoServerErrorA3 instanceof SsoServerError.SessionTokenExpired)) ? ssoServerErrorA3 : ssoServerErrorA3 == null ? new SsoServerError.Forbidden(null) : new SsoServerError.Forbidden(ssoServerErrorA3.getMessage());
        }
        if (iCode != 422) {
            throw new HttpException(response);
        }
        ServerErrorException.Companion companion2 = ServerErrorException.INSTANCE;
        HttpException httpException3 = new HttpException(response);
        kg.o oVarA2 = ikl.a.a();
        companion2.getClass();
        int i2 = ServerErrorException.Companion.c(httpException3, oVarA2).f.f51362a;
        if (i2 == 9040) {
            return new SsoServerError.LoginRejected(0);
        }
        if (i2 == 9045) {
            return new SsoServerError.ConfirmationRequired(0);
        }
        SsoServerError ssoServerErrorA4 = bVar.a(new HttpException(response));
        if ((ssoServerErrorA4 instanceof SsoServerError.AuthenticationRejected) || (ssoServerErrorA4 instanceof SsoServerError.AuthenticationReviewing) || (ssoServerErrorA4 instanceof SsoServerError.EvidenceNotVerifiedYet) || (ssoServerErrorA4 instanceof SsoServerError.CountryMismatch) || (ssoServerErrorA4 instanceof SsoServerError.LocationDistance)) {
            return ssoServerErrorA4;
        }
        throw new HttpException(response);
    }
}
