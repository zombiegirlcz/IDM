package com.revolut.feature.pay_with_smile.impl.data.network;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import pl9.a;
import pl9.b0;
import pl9.d;
import pl9.g;
import pl9.j;
import pl9.y;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.PATCH;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\b\u001a\u00020\u00072\b\b\u0001\u0010\u0006\u001a\u00020\u0005H§@¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\u000b\u001a\u00020\u00072\b\b\u0001\u0010\u0006\u001a\u00020\nH§@¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0007H§@¢\u0006\u0004\b\r\u0010\u0004J\u001a\u0010\u000f\u001a\u00020\u00072\b\b\u0001\u0010\u0006\u001a\u00020\u000eH§@¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0014\u001a\u00020\u00132\b\b\u0001\u0010\u0012\u001a\u00020\u0011H§@¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0016\u001a\u00020\u00072\b\b\u0001\u0010\u0012\u001a\u00020\u0011H§@¢\u0006\u0004\b\u0016\u0010\u0015J\u001a\u0010\u0017\u001a\u00020\u00072\b\b\u0001\u0010\u0012\u001a\u00020\u0011H§@¢\u0006\u0004\b\u0017\u0010\u0015J\u001a\u0010\u0018\u001a\u00020\u00072\b\b\u0001\u0010\u0012\u001a\u00020\u0011H§@¢\u0006\u0004\b\u0018\u0010\u0015J$\u0010\u001a\u001a\u00020\u00072\b\b\u0001\u0010\u0012\u001a\u00020\u00112\b\b\u0001\u0010\u0006\u001a\u00020\u0019H§@¢\u0006\u0004\b\u001a\u0010\u001b¨\u0006\u001cÀ\u0006\u0003"}, d2 = {"Lcom/revolut/feature/pay_with_smile/impl/data/network/BiometricPaymentsSettingsService;", "", "Lpl9/g;", "getSettings", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lpl9/b0;", "request", "", "setPasscode", "(Lpl9/b0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lpl9/y;", "setEnabled", "(Lpl9/y;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "optOutConsent", "Lpl9/a;", "acceptConsent", "(Lpl9/a;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "id", "Lpl9/d;", "getAttempt", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "initiateAttempt", "confirmAttempt", "rejectAttempt", "Lpl9/j;", "cancelAttempt", "(Ljava/lang/String;Lpl9/j;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "feature_pay_with_smile_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface BiometricPaymentsSettingsService {
    @POST("revpay/biometric-payments-terms/accept")
    Object acceptConsent(@Body @NotNull a aVar, @NotNull Continuation<? super Unit> continuation);

    @POST("revpay/biometric-payments-attempt/{id}/cancel")
    Object cancelAttempt(@Path("id") @NotNull String str, @Body @NotNull j jVar, @NotNull Continuation<? super Unit> continuation);

    @POST("revpay/biometric-payments-attempt/{id}/confirm")
    Object confirmAttempt(@Path("id") @NotNull String str, @NotNull Continuation<? super Unit> continuation);

    @GET("revpay/biometric-payments-attempt/{id}")
    Object getAttempt(@Path("id") @NotNull String str, @NotNull Continuation<? super d> continuation);

    @GET("revpay/biometric-payments-settings")
    Object getSettings(@NotNull Continuation<? super g> continuation);

    @POST("revpay/biometric-payments-attempt/{id}/initiate")
    Object initiateAttempt(@Path("id") @NotNull String str, @NotNull Continuation<? super Unit> continuation);

    @POST("revpay/biometric-payments-terms/opt-out")
    Object optOutConsent(@NotNull Continuation<? super Unit> continuation);

    @POST("revpay/biometric-payments-attempt/{id}/reject")
    Object rejectAttempt(@Path("id") @NotNull String str, @NotNull Continuation<? super Unit> continuation);

    @PATCH("revpay/biometric-payments-settings")
    Object setEnabled(@Body @NotNull y yVar, @NotNull Continuation<? super Unit> continuation);

    @PUT("revpay/biometric-payments-settings/passcode")
    Object setPasscode(@Body @NotNull b0 b0Var, @NotNull Continuation<? super Unit> continuation);
}
