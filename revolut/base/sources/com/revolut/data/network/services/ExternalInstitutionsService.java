package com.revolut.data.network.services;

import com.revolut.data.network.models.openbanking.AcknowledgeRequestDto;
import com.revolut.data.network.models.openbanking.AuthorizationRequestDto;
import com.revolut.data.network.models.openbanking.ExternalInstitutionDto;
import com.revolut.data.network.models.openbanking.ExternalInstitutionLinkingScopeRequestDto;
import com.revolut.data.network.models.openbanking.ExternalInstitutionStatusDto;
import com.revolut.data.network.models.openbanking.ExternalPaymentStatusDto;
import com.revolut.data.network.models.openbanking.LinkTokenDto;
import com.revolut.data.network.models.openbanking.OneOffTopupRequestDto;
import com.revolut.data.network.models.openbanking.TopUpResponseDto;
import com.revolut.data.network.models.openbanking.TopupRequestDto;
import com.revolut.data.network.models.openbanking.instructions.InstructionsDto;
import com.revolut.data.network.models.openbanking.penny_verification.AccountInformationServiceUrlResponseDto;
import com.revolut.data.network.models.openbanking.penny_verification.PennyAuthorisationResultDto;
import com.revolut.data.network.models.openbanking.penny_verification.PennyVerificationTopUpRequestDto;
import com.revolut.data.network.models.topup.PayToMandateTopupRequestDto;
import efm.b;
import efm.d0;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;
import retrofit2.http.Query;
import retrofit2.http.Tag;
import ro3.e;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000¬\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J\u001b\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0002H'¢\u0006\u0004\b\u0005\u0010\u0006J+\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u00022\u000e\b\u0001\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0003H'¢\u0006\u0004\b\t\u0010\nJ\u001b\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\u00030\u0002H'¢\u0006\u0004\b\f\u0010\u0006J\u0019\u0010\u0010\u001a\u00020\u000f2\b\b\u0001\u0010\u000e\u001a\u00020\rH'¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00022\b\b\u0001\u0010\u000e\u001a\u00020\rH'¢\u0006\u0004\b\u0013\u0010\u0014J\u001f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00022\b\b\u0001\u0010\u0016\u001a\u00020\u0015H'¢\u0006\u0004\b\u0018\u0010\u0019J\u0019\u0010\u001b\u001a\u00020\u000f2\b\b\u0001\u0010\u001a\u001a\u00020\u0007H'¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010 \u001a\u00020\u001f2\b\b\u0001\u0010\u001e\u001a\u00020\u001dH§@¢\u0006\u0004\b \u0010!J)\u0010&\u001a\b\u0012\u0004\u0012\u00020%0\u00022\b\b\u0001\u0010\u001e\u001a\u00020\"2\b\b\u0003\u0010$\u001a\u00020#H'¢\u0006\u0004\b&\u0010'J#\u0010(\u001a\u00020\u000f2\b\b\u0001\u0010\u001e\u001a\u00020\"2\b\b\u0003\u0010$\u001a\u00020#H'¢\u0006\u0004\b(\u0010)J#\u0010+\u001a\u00020\u000f2\b\b\u0001\u0010\u001e\u001a\u00020*2\b\b\u0003\u0010$\u001a\u00020#H'¢\u0006\u0004\b+\u0010,J\u001f\u0010.\u001a\b\u0012\u0004\u0012\u00020%0\u00022\b\b\u0001\u0010\u001e\u001a\u00020-H'¢\u0006\u0004\b.\u0010/J\u001f\u00101\u001a\b\u0012\u0004\u0012\u00020%0\u00022\b\b\u0001\u0010\u001e\u001a\u000200H'¢\u0006\u0004\b1\u00102J9\u00108\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u000207060\u00022\b\b\u0001\u00103\u001a\u00020\u00072\b\b\u0001\u00104\u001a\u00020\u00072\b\b\u0001\u00105\u001a\u00020\u0007H'¢\u0006\u0004\b8\u00109J)\u0010>\u001a\b\u0012\u0004\u0012\u00020=0\u00022\b\b\u0001\u0010:\u001a\u00020\u00072\b\b\u0003\u0010<\u001a\u00020;H'¢\u0006\u0004\b>\u0010?J7\u0010D\u001a\b\u0012\u0004\u0012\u00020C0\u00022\b\b\u0001\u0010@\u001a\u00020\u00072\n\b\u0001\u0010A\u001a\u0004\u0018\u00010\u00072\n\b\u0001\u0010B\u001a\u0004\u0018\u00010\u0007H'¢\u0006\u0004\bD\u00109J\u001f\u0010F\u001a\b\u0012\u0004\u0012\u00020C0\u00022\b\b\u0001\u0010E\u001a\u00020\u0007H'¢\u0006\u0004\bF\u0010GJ/\u0010J\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020I060\u00022\b\b\u0001\u0010\u001a\u001a\u00020\u00072\b\b\u0001\u0010H\u001a\u00020\u0007H'¢\u0006\u0004\bJ\u0010K¨\u0006LÀ\u0006\u0003"}, d2 = {"Lcom/revolut/data/network/services/ExternalInstitutionsService;", "", "Lefm/d0;", "", "Lcom/revolut/data/network/models/openbanking/ExternalInstitutionDto;", "getInstitutions", "()Lefm/d0;", "", "bankLicenseCountries", "getPennyInstitutions", "(Ljava/util/List;)Lefm/d0;", "Lcom/revolut/data/network/models/openbanking/ExternalInstitutionStatusDto;", "getInstitutionsStatuses", "Lcom/revolut/data/network/models/openbanking/AuthorizationRequestDto;", "authorizationDto", "Lefm/b;", "uploadInstitutionData", "(Lcom/revolut/data/network/models/openbanking/AuthorizationRequestDto;)Lefm/b;", "Lcom/revolut/data/network/models/openbanking/penny_verification/AccountInformationServiceUrlResponseDto;", "getAccountInformationServiceAuthorisationUrl", "(Lcom/revolut/data/network/models/openbanking/AuthorizationRequestDto;)Lefm/d0;", "Lcom/revolut/data/network/models/openbanking/ExternalInstitutionLinkingScopeRequestDto;", "linkingScopeDto", "Lcom/revolut/data/network/models/openbanking/LinkTokenDto;", "getLinkToken", "(Lcom/revolut/data/network/models/openbanking/ExternalInstitutionLinkingScopeRequestDto;)Lefm/d0;", "institutionId", "revokeInstitution", "(Ljava/lang/String;)Lefm/b;", "Lcom/revolut/data/network/models/openbanking/AcknowledgeRequestDto;", "requestDto", "", "acknowledgeInstitution", "(Lcom/revolut/data/network/models/openbanking/AcknowledgeRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/revolut/data/network/models/openbanking/TopupRequestDto;", "Lwj0/b;", "idempotencyTag", "Lcom/revolut/data/network/models/openbanking/TopUpResponseDto;", "topupFromPocket", "(Lcom/revolut/data/network/models/openbanking/TopupRequestDto;Lwj0/b;)Lefm/d0;", "plaidTopupFromPocket", "(Lcom/revolut/data/network/models/openbanking/TopupRequestDto;Lwj0/b;)Lefm/b;", "Lcom/revolut/data/network/models/topup/PayToMandateTopupRequestDto;", "payToMandateTopup", "(Lcom/revolut/data/network/models/topup/PayToMandateTopupRequestDto;Lwj0/b;)Lefm/b;", "Lcom/revolut/data/network/models/openbanking/OneOffTopupRequestDto;", "oneOffTopup", "(Lcom/revolut/data/network/models/openbanking/OneOffTopupRequestDto;)Lefm/d0;", "Lcom/revolut/data/network/models/openbanking/penny_verification/PennyVerificationTopUpRequestDto;", "getPaymentInitiationServiceAuthorisationUrl", "(Lcom/revolut/data/network/models/openbanking/penny_verification/PennyVerificationTopUpRequestDto;)Lefm/d0;", "subjectType", "subjectId", "type", "Lretrofit2/Response;", "Lcom/revolut/data/network/models/openbanking/penny_verification/PennyAuthorisationResultDto;", "getPennyAuthorisationResult", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lefm/d0;", "externalPocketId", "", "realtime", "Lro3/e;", "getExternalAccount", "(Ljava/lang/String;Z)Lefm/d0;", "idempotencyKey", "fragment", "query", "Lcom/revolut/data/network/models/openbanking/ExternalPaymentStatusDto;", "getTopUpUniversalLinkData", "paymentId", "getTopUpStatus", "(Ljava/lang/String;)Lefm/d0;", "domain", "Lcom/revolut/data/network/models/openbanking/instructions/InstructionsDto;", "getInstructions", "(Ljava/lang/String;Ljava/lang/String;)Lefm/d0;", "retail_data_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface ExternalInstitutionsService {
    @POST("/external-institutions/acknowledge")
    Object acknowledgeInstitution(@Body @NotNull AcknowledgeRequestDto acknowledgeRequestDto, @NotNull Continuation<? super Unit> continuation);

    @POST("/external-institutions/application")
    @NotNull
    d0<AccountInformationServiceUrlResponseDto> getAccountInformationServiceAuthorisationUrl(@Body @NotNull AuthorizationRequestDto authorizationDto);

    @GET("/external-accounts/{id}")
    @NotNull
    d0<e> getExternalAccount(@Path("id") @NotNull String externalPocketId, @Query("realtime") boolean realtime);

    @GET("/external-institutions")
    @NotNull
    d0<List<ExternalInstitutionDto>> getInstitutions();

    @GET("/external-institutions/consents-statuses")
    @NotNull
    d0<List<ExternalInstitutionStatusDto>> getInstitutionsStatuses();

    @GET("/external-institutions/{institutionId}/instructions/{domain}")
    @NotNull
    d0<Response<InstructionsDto>> getInstructions(@Path("institutionId") @NotNull String institutionId, @Path("domain") @NotNull String domain);

    @POST("/external-institutions/link-token")
    @NotNull
    d0<LinkTokenDto> getLinkToken(@Body @NotNull ExternalInstitutionLinkingScopeRequestDto linkingScopeDto);

    @POST("/topup/direct-debit/penny")
    @NotNull
    d0<TopUpResponseDto> getPaymentInitiationServiceAuthorisationUrl(@Body @NotNull PennyVerificationTopUpRequestDto requestDto);

    @GET("/verifications")
    @NotNull
    d0<Response<PennyAuthorisationResultDto>> getPennyAuthorisationResult(@NotNull @Query("subjectType") String subjectType, @NotNull @Query("subjectId") String subjectId, @NotNull @Query("type") String type);

    @GET("/external-institutions/penny")
    @NotNull
    d0<List<ExternalInstitutionDto>> getPennyInstitutions(@NotNull @Query("bankingLicenseCountries") List<String> bankLicenseCountries);

    @GET("/topup/direct-debit/status/{id}")
    @NotNull
    d0<ExternalPaymentStatusDto> getTopUpStatus(@Path("id") @NotNull String paymentId);

    @GET("/topup/direct-debit/status/universal-link")
    @NotNull
    d0<ExternalPaymentStatusDto> getTopUpUniversalLinkData(@NotNull @Query("idempotencyKey") String idempotencyKey, @Query("fragment") String fragment, @Query("query") String query);

    @POST("/topup/direct-debit/one-off")
    @NotNull
    d0<TopUpResponseDto> oneOffTopup(@Body @NotNull OneOffTopupRequestDto requestDto);

    @POST("/topup/direct-debit")
    @NotNull
    b payToMandateTopup(@Body @NotNull PayToMandateTopupRequestDto requestDto, @Tag @NotNull wj0.b idempotencyTag);

    @POST("/topup/direct-debit")
    @NotNull
    b plaidTopupFromPocket(@Body @NotNull TopupRequestDto requestDto, @Tag @NotNull wj0.b idempotencyTag);

    @DELETE("/external-institutions/{id}")
    @NotNull
    b revokeInstitution(@Path("id") @NotNull String institutionId);

    @POST("/topup/direct-debit")
    @NotNull
    d0<TopUpResponseDto> topupFromPocket(@Body @NotNull TopupRequestDto requestDto, @Tag @NotNull wj0.b idempotencyTag);

    @POST("/external-institutions/application")
    @NotNull
    b uploadInstitutionData(@Body @NotNull AuthorizationRequestDto authorizationDto);
}
