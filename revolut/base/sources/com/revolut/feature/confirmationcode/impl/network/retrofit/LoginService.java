package com.revolut.feature.confirmationcode.impl.network.retrofit;

import com.revolut.data.network.models.login.ResendRequestDto;
import efm.b;
import efm.d0;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.HeaderMap;
import retrofit2.http.Headers;
import retrofit2.http.POST;
import retrofit2.http.Query;
import zj0.a;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\b`\u0018\u00002\u00020\u0001J%\u0010\u0007\u001a\u00020\u00062\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u0004H'¢\u0006\u0004\b\u0007\u0010\bJ/\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010\u0005\u001a\u00020\u00042\u0014\b\u0001\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\tH'¢\u0006\u0004\b\u0007\u0010\u000bJ%\u0010\f\u001a\u00020\u00062\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u0004H'¢\u0006\u0004\b\f\u0010\bJ/\u0010\f\u001a\u00020\u00062\b\b\u0001\u0010\u0005\u001a\u00020\u00042\u0014\b\u0001\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\tH'¢\u0006\u0004\b\f\u0010\u000bJ%\u0010\r\u001a\u00020\u00062\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u0004H'¢\u0006\u0004\b\r\u0010\bJ/\u0010\r\u001a\u00020\u00062\b\b\u0001\u0010\u0005\u001a\u00020\u00042\u0014\b\u0001\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\tH'¢\u0006\u0004\b\r\u0010\u000bJ%\u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u00100\u000f2\b\b\u0001\u0010\u000e\u001a\u00020\u0002H'¢\u0006\u0004\b\u0012\u0010\u0013J;\u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u00100\u000f2\b\b\u0001\u0010\u000e\u001a\u00020\u00022\u0014\b\u0001\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\tH'¢\u0006\u0004\b\u0012\u0010\u0014¨\u0006\u0015À\u0006\u0003"}, d2 = {"Lcom/revolut/feature/confirmationcode/impl/network/retrofit/LoginService;", "", "", "captchaToken", "Lcom/revolut/data/network/models/login/ResendRequestDto;", "body", "Lefm/b;", "resendSMSCode", "(Ljava/lang/String;Lcom/revolut/data/network/models/login/ResendRequestDto;)Lefm/b;", "", "headers", "(Lcom/revolut/data/network/models/login/ResendRequestDto;Ljava/util/Map;)Lefm/b;", "requestVoiceCall", "resendEmailCode", "phone", "Lefm/d0;", "", "Lzk3/a;", "requestVerificationOptions", "(Ljava/lang/String;)Lefm/d0;", "(Ljava/lang/String;Ljava/util/Map;)Lefm/d0;", "feature_confirmation_code_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface LoginService {
    @a
    @GET("verification-codes/channels")
    @NotNull
    @Headers({"X-Anonymous-Fallback-App-Auth: true"})
    d0<List<zk3.a>> requestVerificationOptions(@NotNull @Query("phone") String phone);

    @a
    @GET("verification-codes/channels")
    @NotNull
    @Headers({"CUSTOM_APP_AUTH_NAME: true"})
    d0<List<zk3.a>> requestVerificationOptions(@NotNull @Query("phone") String phone, @HeaderMap @NotNull Map<String, String> headers);

    @Headers({"CUSTOM_APP_AUTH_NAME: true"})
    @POST("verification-codes/call")
    @NotNull
    b requestVoiceCall(@Body @NotNull ResendRequestDto body, @HeaderMap @NotNull Map<String, String> headers);

    @Headers({"X-Anonymous-Fallback-App-Auth: true"})
    @POST("verification-codes/call")
    @NotNull
    b requestVoiceCall(@Header("X-Captcha-Token") String captchaToken, @Body @NotNull ResendRequestDto body);

    @Headers({"CUSTOM_APP_AUTH_NAME: true"})
    @POST("verification-codes/email")
    @NotNull
    b resendEmailCode(@Body @NotNull ResendRequestDto body, @HeaderMap @NotNull Map<String, String> headers);

    @Headers({"X-Anonymous-Fallback-App-Auth: true"})
    @POST("verification-codes/email")
    @NotNull
    b resendEmailCode(@Header("X-Captcha-Token") String captchaToken, @Body @NotNull ResendRequestDto body);

    @Headers({"CUSTOM_APP_AUTH_NAME: true"})
    @POST("verification-codes/sms")
    @NotNull
    b resendSMSCode(@Body @NotNull ResendRequestDto body, @HeaderMap @NotNull Map<String, String> headers);

    @Headers({"X-Anonymous-Fallback-App-Auth: true"})
    @POST("verification-codes/sms")
    @NotNull
    b resendSMSCode(@Header("X-Captcha-Token") String captchaToken, @Body @NotNull ResendRequestDto body);
}
