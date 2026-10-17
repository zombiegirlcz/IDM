package com.revolut.feature.vaults.impl.network;

import bqg.a;
import bqg.c;
import efm.b;
import efm.d0;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import okhttp3.ResponseBody;
import org.jetbrains.annotations.NotNull;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;
import retrofit2.http.Query;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b`\u0018\u00002\u00020\u0001J\u001f\u0010\u0006\u001a\u00020\u00052\u000e\b\u0001\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H'¢\u0006\u0004\b\u0006\u0010\u0007J)\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\b\b\u0001\u0010\b\u001a\u00020\u00032\b\b\u0001\u0010\t\u001a\u00020\u0003H'¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\b\u0001\u0010\u000e\u001a\u00020\u0003H§@¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012H§@¢\u0006\u0004\b\u0013\u0010\u0014J%\u0010\u0016\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\u00020\n2\b\b\u0001\u0010\u000e\u001a\u00020\u0003H'¢\u0006\u0004\b\u0016\u0010\u0017J\u001b\u0010\u0016\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\u00020\nH'¢\u0006\u0004\b\u0016\u0010\u0018J\u0019\u0010\u001a\u001a\u00020\u00052\b\b\u0001\u0010\u0019\u001a\u00020\u0003H'¢\u0006\u0004\b\u001a\u0010\u001bJ\u0019\u0010\u001c\u001a\u00020\u00052\b\b\u0001\u0010\u000e\u001a\u00020\u0003H'¢\u0006\u0004\b\u001c\u0010\u001b¨\u0006\u001dÀ\u0006\u0003"}, d2 = {"Lcom/revolut/feature/vaults/impl/network/SavingsService;", "", "", "", "productIdList", "Lefm/b;", "activateSavingsProducts", "(Ljava/util/List;)Lefm/b;", "transactionId", "format", "Lefm/d0;", "Lokhttp3/ResponseBody;", "getTransactionStatementHtml", "(Ljava/lang/String;Ljava/lang/String;)Lefm/d0;", "productId", "Lbqg/c;", "postSavingsEligibility", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lbqg/a;", "getIdentityDocumentIsOnVerification", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lbqg/b;", "getDocumentsToAccept", "(Ljava/lang/String;)Lefm/d0;", "()Lefm/d0;", "documentId", "acceptSavingsDocuments", "(Ljava/lang/String;)Lefm/b;", "sendEmailWithSavingsDocuments", "feature_vaults_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface SavingsService {
    @POST("/money-boxes/deposits/documents/{id}/accept")
    @NotNull
    b acceptSavingsDocuments(@Path("id") @NotNull String documentId);

    @POST("/money-boxes/deposits/activate")
    @NotNull
    b activateSavingsProducts(@Body @NotNull List<String> productIdList);

    @GET("/money-boxes/deposits/documents/to-accept")
    @NotNull
    d0<List<bqg.b>> getDocumentsToAccept();

    @GET("/money-boxes/deposits/products/{id}/documents/to-accept")
    @NotNull
    d0<List<bqg.b>> getDocumentsToAccept(@Path("id") @NotNull String productId);

    @GET("/money-boxes/deposits/eligibility/document-verification-status")
    Object getIdentityDocumentIsOnVerification(@NotNull Continuation<? super a> continuation);

    @GET("/money-boxes/deposits/transactions/{transaction_id}/statement")
    @NotNull
    d0<ResponseBody> getTransactionStatementHtml(@Path("transaction_id") @NotNull String transactionId, @NotNull @Query("format") String format);

    @POST("/money-boxes/deposits/products/{product_id}/eligibility/verification")
    Object postSavingsEligibility(@Path("product_id") @NotNull String str, @NotNull Continuation<? super c> continuation);

    @POST("/money-boxes/deposits/products/{id}/documents/email")
    @NotNull
    b sendEmailWithSavingsDocuments(@Path("id") @NotNull String productId);
}
