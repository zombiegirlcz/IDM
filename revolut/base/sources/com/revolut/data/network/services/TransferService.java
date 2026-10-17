package com.revolut.data.network.services;

import com.revolut.data.network.models.moneyrequest.RedeemTransferLinkRequestDto;
import com.revolut.data.network.models.moneyrequest.TransferLinkDetailsDto;
import com.revolut.data.network.models.moneyrequest.TransferLinkRequestDto;
import com.revolut.data.network.models.moneyrequest.TransferLinkResponseDto;
import com.revolut.data.network.models.transfer.CurrencyExchangeFromRequestDto;
import com.revolut.data.network.models.transfer.CurrencyExchangeToRequestDto;
import com.revolut.data.network.models.transfer.PocketExchangeRequestDto;
import efm.b;
import efm.d0;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.POST;
import retrofit2.http.Path;
import retrofit2.http.Query;
import retrofit2.http.Tag;
import xhf.d1;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b`\u0018\u0000 ,2\u00020\u0001:\u0001-J1\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00060\u00052\b\b\u0001\u0010\u0003\u001a\u00020\u00022\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0002H'¢\u0006\u0004\b\u0007\u0010\bJ1\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f0\u00052\b\b\u0001\u0010\n\u001a\u00020\t2\n\b\u0001\u0010\u000b\u001a\u0004\u0018\u00010\u0002H'¢\u0006\u0004\b\u000e\u0010\u000fJ1\u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f0\u00052\b\b\u0001\u0010\n\u001a\u00020\u00102\n\b\u0001\u0010\u000b\u001a\u0004\u0018\u00010\u0002H'¢\u0006\u0004\b\u0011\u0010\u0012J1\u0010\u0014\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f0\u00052\b\b\u0001\u0010\n\u001a\u00020\u00132\n\b\u0001\u0010\u000b\u001a\u0004\u0018\u00010\u0002H'¢\u0006\u0004\b\u0014\u0010\u0015J+\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00052\b\b\u0001\u0010\u0017\u001a\u00020\u00162\n\b\u0001\u0010\u0019\u001a\u0004\u0018\u00010\u0018H'¢\u0006\u0004\b\u001b\u0010\u001cJ\u001b\u0010\u001e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001d0\f0\u0005H'¢\u0006\u0004\b\u001e\u0010\u001fJ\u001f\u0010!\u001a\b\u0012\u0004\u0012\u00020\u001d0\u00052\b\b\u0001\u0010 \u001a\u00020\u0002H'¢\u0006\u0004\b!\u0010\"J\u0019\u0010%\u001a\u00020$2\b\b\u0001\u0010#\u001a\u00020\u0002H'¢\u0006\u0004\b%\u0010&J#\u0010)\u001a\u00020$2\b\b\u0001\u0010#\u001a\u00020\u00022\b\b\u0001\u0010(\u001a\u00020'H'¢\u0006\u0004\b)\u0010*J\u0019\u0010+\u001a\u00020$2\b\b\u0001\u0010#\u001a\u00020\u0002H'¢\u0006\u0004\b+\u0010&¨\u0006.À\u0006\u0003"}, d2 = {"Lcom/revolut/data/network/services/TransferService;", "", "", "username", "headerExperiments", "Lefm/d0;", "", "getAvailableCurrenciesByUsername", "(Ljava/lang/String;Ljava/lang/String;)Lefm/d0;", "Lcom/revolut/data/network/models/transfer/PocketExchangeRequestDto;", "body", "idempotencyKey", "", "Lxhf/d1;", "requestPocketExchange", "(Lcom/revolut/data/network/models/transfer/PocketExchangeRequestDto;Ljava/lang/String;)Lefm/d0;", "Lcom/revolut/data/network/models/transfer/CurrencyExchangeFromRequestDto;", "exchangeCurrencyFrom", "(Lcom/revolut/data/network/models/transfer/CurrencyExchangeFromRequestDto;Ljava/lang/String;)Lefm/d0;", "Lcom/revolut/data/network/models/transfer/CurrencyExchangeToRequestDto;", "exchangeCurrencyTo", "(Lcom/revolut/data/network/models/transfer/CurrencyExchangeToRequestDto;Ljava/lang/String;)Lefm/d0;", "Lcom/revolut/data/network/models/moneyrequest/TransferLinkRequestDto;", "linkRequest", "Lwj0/b;", "idempotencyTag", "Lcom/revolut/data/network/models/moneyrequest/TransferLinkResponseDto;", "createTransferLink", "(Lcom/revolut/data/network/models/moneyrequest/TransferLinkRequestDto;Lwj0/b;)Lefm/d0;", "Lcom/revolut/data/network/models/moneyrequest/TransferLinkDetailsDto;", "getTransferLinks", "()Lefm/d0;", "id", "getTransferLink", "(Ljava/lang/String;)Lefm/d0;", "transferLinkId", "Lefm/b;", "cancelTransferLink", "(Ljava/lang/String;)Lefm/b;", "Lcom/revolut/data/network/models/moneyrequest/RedeemTransferLinkRequestDto;", "redeemTransferLinkRequestDto", "redeemTransferLink", "(Ljava/lang/String;Lcom/revolut/data/network/models/moneyrequest/RedeemTransferLinkRequestDto;)Lefm/b;", "rejectTransferLink", "Companion", "a", "retail_data_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface TransferService {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.f60252a;

    /* JADX INFO: renamed from: com.revolut.data.network.services.TransferService$a, reason: from kotlin metadata */
    /* JADX INFO: loaded from: classes20.dex */
    public static final class Companion {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ Companion f60252a = new Companion();

        private Companion() {
        }
    }

    @DELETE("transfer-link/{id}")
    @NotNull
    b cancelTransferLink(@Path("id") @NotNull String transferLinkId);

    @POST("transfer-link")
    @NotNull
    d0<TransferLinkResponseDto> createTransferLink(@Body @NotNull TransferLinkRequestDto linkRequest, @Tag wj0.b idempotencyTag);

    @POST("exchange")
    @NotNull
    d0<List<d1>> exchangeCurrencyFrom(@Body @NotNull CurrencyExchangeFromRequestDto body, @Header("X-Idempotency-Key") String idempotencyKey);

    @POST("exchange")
    @NotNull
    d0<List<d1>> exchangeCurrencyTo(@Body @NotNull CurrencyExchangeToRequestDto body, @Header("X-Idempotency-Key") String idempotencyKey);

    @GET("transfer/allowed-currencies")
    @NotNull
    d0<Set<String>> getAvailableCurrenciesByUsername(@NotNull @Query("recipientUsername") String username, @Header("X-Enabled-Experiments") String headerExperiments);

    @GET("transfer-link/{id}")
    @NotNull
    d0<TransferLinkDetailsDto> getTransferLink(@Path("id") @NotNull String id10);

    @GET("transfer-link")
    @NotNull
    d0<List<TransferLinkDetailsDto>> getTransferLinks();

    @POST("transfer-link/{id}/redeem/confirm")
    @NotNull
    b redeemTransferLink(@Path("id") @NotNull String transferLinkId, @Body @NotNull RedeemTransferLinkRequestDto redeemTransferLinkRequestDto);

    @POST("transfer-link/{id}/reject")
    @NotNull
    b rejectTransferLink(@Path("id") @NotNull String transferLinkId);

    @POST("exchange")
    @NotNull
    d0<List<d1>> requestPocketExchange(@Body @NotNull PocketExchangeRequestDto body, @Header("X-Idempotency-Key") String idempotencyKey);
}
