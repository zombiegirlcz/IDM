package com.revolut.data.network.services;

import com.revolut.data.network.models.beneficiary.BankAccountSwitchingNewBeneficiaryNetworkModel;
import com.revolut.data.network.models.beneficiary.BankBeneficiaryDto;
import com.revolut.data.network.models.beneficiary.BankBeneficiaryParamsNetworkModel;
import com.revolut.data.network.models.beneficiary.BeneficiaryConfirmationResponseDto;
import com.revolut.data.network.models.beneficiary.BeneficiaryDto;
import com.revolut.data.network.models.beneficiary.BeneficiaryExtraAccountFieldsNetworkModel;
import com.revolut.data.network.models.beneficiary.BeneficiaryExtraFieldsDto;
import com.revolut.data.network.models.beneficiary.BeneficiaryFieldsDto;
import com.revolut.data.network.models.beneficiary.BeneficiaryLabelDto;
import com.revolut.data.network.models.beneficiary.BeneficiaryMissingExtraFieldsDto;
import com.revolut.data.network.models.beneficiary.BeneficiaryPdaDto;
import com.revolut.data.network.models.beneficiary.BeneficiarySearchListDto;
import com.revolut.data.network.models.beneficiary.BeneficiaryValidationResultDto;
import com.revolut.data.network.models.beneficiary.CounterPartyInformationDto;
import com.revolut.data.network.models.beneficiary.RouteDetailsDto;
import com.revolut.data.network.models.beneficiary.SupportedCountryDto;
import com.revolut.domain.models.beneficiary.BeneficiaryMatchScope;
import com.revolut.domain.models.beneficiary.BeneficiarySpecialPurpose;
import efm.b;
import efm.d0;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import o9l.r;
import org.jetbrains.annotations.NotNull;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Headers;
import retrofit2.http.PATCH;
import retrofit2.http.POST;
import retrofit2.http.Path;
import retrofit2.http.Query;
import retrofit2.http.QueryMap;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000¸\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b`\u0018\u0000 P2\u00020\u0001:\u0001QJ'\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00042\n\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0002H'¢\u0006\u0004\b\u0007\u0010\bJ+\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00060\u00042\b\b\u0001\u0010\n\u001a\u00020\t2\n\b\u0001\u0010\f\u001a\u0004\u0018\u00010\u000bH'¢\u0006\u0004\b\r\u0010\u000eJ)\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00042\b\b\u0001\u0010\n\u001a\u00020\t2\b\b\u0001\u0010\u0010\u001a\u00020\u000fH'¢\u0006\u0004\b\u0012\u0010\u0013J+\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u00042\b\b\u0001\u0010\n\u001a\u00020\t2\n\b\u0001\u0010\f\u001a\u0004\u0018\u00010\u000bH'¢\u0006\u0004\b\u0015\u0010\u000eJ\u0019\u0010\u0018\u001a\u00020\u00172\b\b\u0001\u0010\u0016\u001a\u00020\u000bH'¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001a\u001a\u00020\u00062\b\b\u0001\u0010\u0016\u001a\u00020\u000bH§@¢\u0006\u0004\b\u001a\u0010\u001bJ#\u0010\u001e\u001a\u00020\u00172\b\b\u0001\u0010\u0016\u001a\u00020\u000b2\b\b\u0001\u0010\u001d\u001a\u00020\u001cH'¢\u0006\u0004\b\u001e\u0010\u001fJY\u0010'\u001a\b\u0012\u0004\u0012\u00020&0\u00042\b\b\u0001\u0010 \u001a\u00020\u000b2\b\b\u0001\u0010!\u001a\u00020\u000b2\n\b\u0001\u0010\"\u001a\u0004\u0018\u00010\u000b2\n\b\u0001\u0010#\u001a\u0004\u0018\u00010\u000b2\n\b\u0001\u0010$\u001a\u0004\u0018\u00010\u000b2\n\b\u0001\u0010%\u001a\u0004\u0018\u00010\u000bH'¢\u0006\u0004\b'\u0010(Jk\u0010*\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020)0\u00050\u00042\b\b\u0001\u0010 \u001a\u00020\u000b2\b\b\u0001\u0010!\u001a\u00020\u000b2\n\b\u0001\u0010\"\u001a\u0004\u0018\u00010\u000b2\n\b\u0001\u0010#\u001a\u0004\u0018\u00010\u000b2\n\b\u0001\u0010$\u001a\u0004\u0018\u00010\u000b2\n\b\u0001\u0010%\u001a\u0004\u0018\u00010\u000b2\n\b\u0001\u0010\f\u001a\u0004\u0018\u00010\u000bH'¢\u0006\u0004\b*\u0010+J)\u0010.\u001a\b\u0012\u0004\u0012\u00020-0\u00042\b\b\u0001\u0010,\u001a\u00020\u000b2\b\b\u0001\u0010!\u001a\u00020\u000bH'¢\u0006\u0004\b.\u0010/J3\u00101\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002000\u00050\u00042\n\b\u0001\u0010$\u001a\u0004\u0018\u00010\u000b2\n\b\u0001\u0010%\u001a\u0004\u0018\u00010\u000bH'¢\u0006\u0004\b1\u0010/J?\u00102\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\u00050\u00042\n\b\u0001\u0010!\u001a\u0004\u0018\u00010\u000b2\n\b\u0001\u0010$\u001a\u0004\u0018\u00010\u000b2\n\b\u0001\u0010%\u001a\u0004\u0018\u00010\u000bH'¢\u0006\u0004\b2\u00103J\u001f\u00106\u001a\b\u0012\u0004\u0012\u0002050\u00042\b\b\u0001\u0010\n\u001a\u000204H'¢\u0006\u0004\b6\u00107J%\u00109\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002080\u00050\u00042\b\b\u0001\u0010\u0016\u001a\u00020\u000bH'¢\u0006\u0004\b9\u0010:J#\u0010<\u001a\u00020\u00172\b\b\u0001\u0010\u0016\u001a\u00020\u000b2\b\b\u0001\u0010\n\u001a\u00020;H'¢\u0006\u0004\b<\u0010=J\u001f\u0010?\u001a\b\u0012\u0004\u0012\u00020>0\u00042\b\b\u0001\u0010\u0016\u001a\u00020\u000bH'¢\u0006\u0004\b?\u0010:J\u0019\u0010@\u001a\u00020\u00172\b\b\u0001\u0010\u0016\u001a\u00020\u000bH'¢\u0006\u0004\b@\u0010\u0019J\u001b\u0010A\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u0004H'¢\u0006\u0004\bA\u0010BJQ\u0010H\u001a\b\u0012\u0004\u0012\u00020G0\u00042\b\b\u0001\u0010!\u001a\u00020\u000b2\n\b\u0001\u0010 \u001a\u0004\u0018\u00010\u000b2\n\b\u0001\u0010C\u001a\u0004\u0018\u00010\u000b2\u0018\b\u0001\u0010F\u001a\u0012\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000b0Dj\u0002`EH'¢\u0006\u0004\bH\u0010IJ\u001f\u0010L\u001a\b\u0012\u0004\u0012\u00020\u00060\u00042\b\b\u0001\u0010K\u001a\u00020JH'¢\u0006\u0004\bL\u0010MJ\u001a\u0010O\u001a\u00020N2\b\b\u0001\u0010\u0016\u001a\u00020\u000bH§@¢\u0006\u0004\bO\u0010\u001b¨\u0006RÀ\u0006\u0003"}, d2 = {"Lcom/revolut/data/network/services/BeneficiaryService;", "", "Lcom/revolut/domain/models/beneficiary/BeneficiarySpecialPurpose;", "specialPurpose", "Lefm/d0;", "", "Lcom/revolut/data/network/models/beneficiary/BeneficiaryDto;", "getAccounts", "(Lcom/revolut/domain/models/beneficiary/BeneficiarySpecialPurpose;)Lefm/d0;", "Lcom/revolut/data/network/models/beneficiary/BankBeneficiaryParamsNetworkModel;", "body", "", "headerExperiments", "createAccount", "(Lcom/revolut/data/network/models/beneficiary/BankBeneficiaryParamsNetworkModel;Ljava/lang/String;)Lefm/d0;", "Lcom/revolut/domain/models/beneficiary/BeneficiaryMatchScope;", "matchScope", "Lcom/revolut/data/network/models/beneficiary/BankBeneficiaryDto;", "checkBeneficiary", "(Lcom/revolut/data/network/models/beneficiary/BankBeneficiaryParamsNetworkModel;Lcom/revolut/domain/models/beneficiary/BeneficiaryMatchScope;)Lefm/d0;", "Lcom/revolut/data/network/models/beneficiary/BeneficiaryValidationResultDto;", "validateAccount", "beneficiaryId", "Lefm/b;", "deleteAccount", "(Ljava/lang/String;)Lefm/b;", "getBeneficiary", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/revolut/data/network/models/beneficiary/BeneficiaryLabelDto;", "label", "editLabel", "(Ljava/lang/String;Lcom/revolut/data/network/models/beneficiary/BeneficiaryLabelDto;)Lefm/b;", "currency", "bankCountry", "type", "accountOwner", "routeType", "transferVendor", "Lcom/revolut/data/network/models/beneficiary/BeneficiaryFieldsDto;", "getBankAccountFields", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lefm/d0;", "Lcom/revolut/data/network/models/beneficiary/RouteDetailsDto;", "getRouteDetails", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lefm/d0;", "field", "Lcom/revolut/data/network/models/beneficiary/BeneficiarySearchListDto;", "getSearchListData", "(Ljava/lang/String;Ljava/lang/String;)Lefm/d0;", "Lcom/revolut/data/network/models/beneficiary/SupportedCountryDto;", "getSupportedCountries", "getSupportedCurrencies", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lefm/d0;", "Lcom/revolut/data/network/models/beneficiary/BeneficiaryExtraAccountFieldsNetworkModel;", "Lcom/revolut/data/network/models/beneficiary/BeneficiaryMissingExtraFieldsDto;", "checkMissingBeneficiaryExtraFields", "(Lcom/revolut/data/network/models/beneficiary/BeneficiaryExtraAccountFieldsNetworkModel;)Lefm/d0;", "Lo9l/r;", "getRecurringPaymentsByBeneficiaryId", "(Ljava/lang/String;)Lefm/d0;", "Lcom/revolut/data/network/models/beneficiary/BeneficiaryExtraFieldsDto;", "submitBeneficiaryByIdExtraFields", "(Ljava/lang/String;Lcom/revolut/data/network/models/beneficiary/BeneficiaryExtraFieldsDto;)Lefm/b;", "Lcom/revolut/data/network/models/beneficiary/BeneficiaryPdaDto;", "getBeneficiaryPdaStatus", "setBeneficiaryAsPda", "getPotentialPdaList", "()Lefm/d0;", "copFlow", "", "Lcom/revolut/data/network/services/UserInputFieldValues;", "userInputFieldValues", "Lcom/revolut/data/network/models/beneficiary/CounterPartyInformationDto;", "getCounterPartyInformation", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)Lefm/d0;", "Lcom/revolut/data/network/models/beneficiary/BankAccountSwitchingNewBeneficiaryNetworkModel;", "oldBeneficiaryId", "getAccountSwitchingBeneficiary", "(Lcom/revolut/data/network/models/beneficiary/BankAccountSwitchingNewBeneficiaryNetworkModel;)Lefm/d0;", "Lcom/revolut/data/network/models/beneficiary/BeneficiaryConfirmationResponseDto;", "getBeneficiaryCop", "Companion", "a", "retail_data_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface BeneficiaryService {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.f60248a;

    /* JADX INFO: renamed from: com.revolut.data.network.services.BeneficiaryService$a, reason: from kotlin metadata */
    /* JADX INFO: loaded from: classes20.dex */
    public static final class Companion {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ Companion f60248a = new Companion();

        private Companion() {
        }
    }

    @POST("/beneficiary/exist")
    @NotNull
    d0<BankBeneficiaryDto> checkBeneficiary(@Body @NotNull BankBeneficiaryParamsNetworkModel body, @NotNull @Query("matchScope") BeneficiaryMatchScope matchScope);

    @POST("beneficiary/extra-fields")
    @NotNull
    d0<BeneficiaryMissingExtraFieldsDto> checkMissingBeneficiaryExtraFields(@Body @NotNull BeneficiaryExtraAccountFieldsNetworkModel body);

    @POST("beneficiary")
    @NotNull
    d0<BeneficiaryDto> createAccount(@Body @NotNull BankBeneficiaryParamsNetworkModel body, @Header("X-Enabled-Experiments") String headerExperiments);

    @DELETE("beneficiary/{id}")
    @NotNull
    b deleteAccount(@Path("id") @NotNull String beneficiaryId);

    @PATCH("/beneficiary/{id}/display-name")
    @NotNull
    b editLabel(@Path("id") @NotNull String beneficiaryId, @Body @NotNull BeneficiaryLabelDto label);

    @POST("/account-switches/beneficiary")
    @NotNull
    d0<BeneficiaryDto> getAccountSwitchingBeneficiary(@Body @NotNull BankAccountSwitchingNewBeneficiaryNetworkModel oldBeneficiaryId);

    @GET("user/current/accounts")
    @NotNull
    d0<List<BeneficiaryDto>> getAccounts(@Query("retailPurpose") BeneficiarySpecialPurpose specialPurpose);

    @GET("beneficiary/account-fields")
    @NotNull
    d0<BeneficiaryFieldsDto> getBankAccountFields(@NotNull @Query("currency") String currency, @NotNull @Query("bankCountry") String bankCountry, @Query("type") String type, @Query("accountOwner") String accountOwner, @Query("transferType") String routeType, @Query("transferVendor") String transferVendor);

    @GET("beneficiary/{id}")
    Object getBeneficiary(@Path("id") @NotNull String str, @NotNull Continuation<? super BeneficiaryDto> continuation);

    @POST("beneficiary/{id}/cop")
    Object getBeneficiaryCop(@Path("id") @NotNull String str, @NotNull Continuation<? super BeneficiaryConfirmationResponseDto> continuation);

    @GET("/beneficiary/{id}/personal-designated-account/validate")
    @NotNull
    d0<BeneficiaryPdaDto> getBeneficiaryPdaStatus(@Path("id") @NotNull String beneficiaryId);

    @GET("beneficiary/counterparty-information")
    @NotNull
    d0<CounterPartyInformationDto> getCounterPartyInformation(@NotNull @Query("bankCountry") String bankCountry, @Query("currency") String currency, @Query("copFlow") String copFlow, @QueryMap @NotNull Map<String, String> userInputFieldValues);

    @GET("/beneficiary/personal-designated-accounts")
    @NotNull
    d0<List<BeneficiaryDto>> getPotentialPdaList();

    @Headers({"X-Api-Version: v2"})
    @GET("/beneficiary/{id}/standing-orders")
    @NotNull
    d0<List<r>> getRecurringPaymentsByBeneficiaryId(@Path("id") @NotNull String beneficiaryId);

    @Headers({"X-Api-Version: v2"})
    @GET("/beneficiary/account-fields")
    @NotNull
    d0<List<RouteDetailsDto>> getRouteDetails(@NotNull @Query("currency") String currency, @NotNull @Query("bankCountry") String bankCountry, @Query("type") String type, @Query("accountOwner") String accountOwner, @Query("transferType") String routeType, @Query("transferVendor") String transferVendor, @Header("X-Enabled-Experiments") String headerExperiments);

    @GET("/beneficiary/account-fields/search-list-data")
    @NotNull
    d0<BeneficiarySearchListDto> getSearchListData(@NotNull @Query("field") String field, @NotNull @Query("bankCountry") String bankCountry);

    @GET("beneficiary/countries")
    @NotNull
    d0<List<SupportedCountryDto>> getSupportedCountries(@Query("transferType") String routeType, @Query("transferVendor") String transferVendor);

    @GET("beneficiary/currencies")
    @NotNull
    d0<List<String>> getSupportedCurrencies(@Query("bankCountry") String bankCountry, @Query("transferType") String routeType, @Query("transferVendor") String transferVendor);

    @POST("/beneficiary/{id}/personal-designated-account")
    @NotNull
    b setBeneficiaryAsPda(@Path("id") @NotNull String beneficiaryId);

    @PATCH("/beneficiary/{id}/extra-fields")
    @NotNull
    b submitBeneficiaryByIdExtraFields(@Path("id") @NotNull String beneficiaryId, @Body @NotNull BeneficiaryExtraFieldsDto body);

    @POST("beneficiary/validate")
    @NotNull
    d0<BeneficiaryValidationResultDto> validateAccount(@Body @NotNull BankBeneficiaryParamsNetworkModel body, @Header("X-Enabled-Experiments") String headerExperiments);
}
