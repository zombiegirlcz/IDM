package com.onfido.android.sdk.capture.ui.proofOfAddress.network;

import al.a;
import io.reactivex.rxjava3.core.Single;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import retrofit2.http.GET;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\b`\u0018\u00002\u00020\u0001J\u0014\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0003H'¨\u0006\u0006"}, d2 = {"Lcom/onfido/android/sdk/capture/ui/proofOfAddress/network/ProofOfAddressApi;", "", "getSupportedCountries", "Lio/reactivex/rxjava3/core/Single;", "", "Lcom/onfido/android/sdk/capture/ui/proofOfAddress/network/PoaResponseItem;", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public interface ProofOfAddressApi {
    @GET("/report_types/proof_of_address/supported_countries")
    @a(version = "v3.3")
    @NotNull
    Single<List<PoaResponseItem>> getSupportedCountries();
}
