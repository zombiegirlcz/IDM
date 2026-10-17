package com.revolut.data.network.services;

import com.revolut.data.network.models.moneyrequest.TransferLinkRequestDto;
import com.revolut.data.network.models.moneyrequest.TransferLinkResponseDto;
import com.revolut.data.network.models.transfer.PeerToPeerTransferDto;
import com.revolut.data.network.models.transfer.TransferDto;
import efm.d0;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import retrofit2.http.Body;
import retrofit2.http.Header;
import retrofit2.http.Headers;
import retrofit2.http.POST;
import retrofit2.http.Tag;
import wj0.b;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b`\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001bJ7\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u0006H'¢\u0006\u0004\b\n\u0010\u000bJC\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\t0\b2\b\b\u0001\u0010\u0003\u001a\u00020\f2\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0001\u0010\r\u001a\u0004\u0018\u00010\u0006H'¢\u0006\u0004\b\u000e\u0010\u000fJC\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\t0\b2\b\b\u0001\u0010\u0003\u001a\u00020\u00102\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0001\u0010\r\u001a\u0004\u0018\u00010\u0006H'¢\u0006\u0004\b\u0011\u0010\u0012JC\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\b\b\u0001\u0010\u0003\u001a\u00020\u00132\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0001\u0010\r\u001a\u0004\u0018\u00010\u0006H'¢\u0006\u0004\b\n\u0010\u0014J7\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\b2\b\b\u0001\u0010\u0016\u001a\u00020\u00152\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u0006H'¢\u0006\u0004\b\u0018\u0010\u0019¨\u0006\u001cÀ\u0006\u0003"}, d2 = {"Lcom/revolut/data/network/services/PeerToPeerTransferService;", "", "Lcom/revolut/data/network/models/transfer/TransferDto$TransferDtoId;", "body", "Lwj0/b;", "idempotencyTag", "", "headerExperiments", "Lefm/d0;", "Lcom/revolut/data/network/models/transfer/PeerToPeerTransferDto;", "transferById", "(Lcom/revolut/data/network/models/transfer/TransferDto$TransferDtoId;Lwj0/b;Ljava/lang/String;)Lefm/d0;", "Lcom/revolut/data/network/models/transfer/TransferDto$TransferDtoPhone;", "registeredIdentityId", "transferByPhone", "(Lcom/revolut/data/network/models/transfer/TransferDto$TransferDtoPhone;Lwj0/b;Ljava/lang/String;Ljava/lang/String;)Lefm/d0;", "Lcom/revolut/data/network/models/transfer/TransferDto$TransferDtoCode;", "transferByCode", "(Lcom/revolut/data/network/models/transfer/TransferDto$TransferDtoCode;Lwj0/b;Ljava/lang/String;Ljava/lang/String;)Lefm/d0;", "Lcom/revolut/data/network/models/transfer/TransferDto$TransferDtoRecipientId;", "(Lcom/revolut/data/network/models/transfer/TransferDto$TransferDtoRecipientId;Lwj0/b;Ljava/lang/String;Ljava/lang/String;)Lefm/d0;", "Lcom/revolut/data/network/models/moneyrequest/TransferLinkRequestDto;", "linkRequest", "Lcom/revolut/data/network/models/moneyrequest/TransferLinkResponseDto;", "createTransferLink", "(Lcom/revolut/data/network/models/moneyrequest/TransferLinkRequestDto;Lwj0/b;Ljava/lang/String;)Lefm/d0;", "Companion", "a", "retail_data_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface PeerToPeerTransferService {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.f60251a;

    /* JADX INFO: renamed from: com.revolut.data.network.services.PeerToPeerTransferService$a, reason: from kotlin metadata */
    public static final class Companion {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ Companion f60251a = new Companion();

        private Companion() {
        }
    }

    @Headers({"X-Enabled-Features: MOVE_OUTGOING_PAYMENT_LINKS_TO_ACTIONS"})
    @POST("transfer-link")
    @NotNull
    d0<TransferLinkResponseDto> createTransferLink(@Body @NotNull TransferLinkRequestDto linkRequest, @Tag b idempotencyTag, @Header("X-Enabled-Experiments") String headerExperiments);

    @Headers({"X-Enabled-Features: MOVE_OUTGOING_PAYMENT_LINKS_TO_ACTIONS"})
    @POST("transfer")
    @NotNull
    d0<PeerToPeerTransferDto> transferByCode(@Body @NotNull TransferDto.TransferDtoCode body, @Tag b idempotencyTag, @Header("X-Enabled-Experiments") String headerExperiments, @Header("X-Registered-Identity") String registeredIdentityId);

    @Headers({"X-Enabled-Features: MOVE_OUTGOING_PAYMENT_LINKS_TO_ACTIONS"})
    @POST("transfer")
    @NotNull
    d0<PeerToPeerTransferDto> transferById(@Body @NotNull TransferDto.TransferDtoId body, @Tag b idempotencyTag, @Header("X-Enabled-Experiments") String headerExperiments);

    @Headers({"X-Enabled-Features: MOVE_OUTGOING_PAYMENT_LINKS_TO_ACTIONS"})
    @POST("transfer")
    @NotNull
    d0<PeerToPeerTransferDto> transferById(@Body @NotNull TransferDto.TransferDtoRecipientId body, @Tag b idempotencyTag, @Header("X-Enabled-Experiments") String headerExperiments, @Header("X-Registered-Identity") String registeredIdentityId);

    @Headers({"X-Enabled-Features: MOVE_OUTGOING_PAYMENT_LINKS_TO_ACTIONS"})
    @POST("transfer")
    @NotNull
    d0<PeerToPeerTransferDto> transferByPhone(@Body @NotNull TransferDto.TransferDtoPhone body, @Tag b idempotencyTag, @Header("X-Enabled-Experiments") String headerExperiments, @Header("X-Registered-Identity") String registeredIdentityId);
}
