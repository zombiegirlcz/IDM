package com.revolut.feature.terms.impl.network;

import efm.b;
import efm.d0;
import java.util.List;
import kotlin.Metadata;
import okhttp3.ResponseBody;
import org.jetbrains.annotations.NotNull;
import qre.a;
import qre.d;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Headers;
import retrofit2.http.POST;
import retrofit2.http.Path;
import retrofit2.http.Query;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b`\u0018\u00002\u00020\u0001J3\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u00052\n\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0002H'¢\u0006\u0004\b\b\u0010\tJ1\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u00052\b\b\u0001\u0010\n\u001a\u00020\u00022\n\b\u0001\u0010\u000b\u001a\u0004\u0018\u00010\u0002H'¢\u0006\u0004\b\f\u0010\tJ=\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u00052\n\b\u0001\u0010\r\u001a\u0004\u0018\u00010\u00022\u0014\b\u0001\u0010\u000f\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00020\u000e\"\u00020\u0002H'¢\u0006\u0004\b\b\u0010\u0010J'\u0010\u0013\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u00060\u00052\n\b\u0001\u0010\u0011\u001a\u0004\u0018\u00010\u0002H'¢\u0006\u0004\b\u0013\u0010\u0014J/\u0010\u001a\u001a\u00020\u00192\b\b\u0001\u0010\u0015\u001a\u00020\u00022\b\b\u0001\u0010\u0017\u001a\u00020\u00162\n\b\u0003\u0010\u0018\u001a\u0004\u0018\u00010\u0002H'¢\u0006\u0004\b\u001a\u0010\u001bJ\u001f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\u00052\b\b\u0001\u0010\u0015\u001a\u00020\u0002H'¢\u0006\u0004\b\u001d\u0010\u0014¨\u0006\u001eÀ\u0006\u0003"}, d2 = {"Lcom/revolut/feature/terms/impl/network/TermsService;", "", "", "country", "service", "Lefm/d0;", "", "Lqre/d;", "getTerms", "(Ljava/lang/String;Ljava/lang/String;)Lefm/d0;", "documentId", "locale", "getTermsByDocumentId", "legalEntityId", "", "scopes", "(Ljava/lang/String;[Ljava/lang/String;)Lefm/d0;", "userId", "Lqre/b;", "getAcceptedTerms", "(Ljava/lang/String;)Lefm/d0;", "termId", "Lqre/a;", "body", "location", "Lefm/b;", "acceptTerms", "(Ljava/lang/String;Lqre/a;Ljava/lang/String;)Lefm/b;", "Lokhttp3/ResponseBody;", "getTermsHtmlPage", "feature_terms_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface TermsService {
    @POST("/terms/{id}/accept")
    @NotNull
    b acceptTerms(@Path("id") @NotNull String termId, @Body @NotNull a body, @Header("X-Client-Geo-Location") String location);

    @GET("/terms/accepted")
    @NotNull
    d0<List<qre.b>> getAcceptedTerms(@Query("userId") String userId);

    @GET("terms")
    @NotNull
    d0<List<d>> getTerms(@Query("country") String country, @Query("service") String service);

    @GET("terms")
    @NotNull
    d0<List<d>> getTerms(@Query("legalEntityId") String legalEntityId, @NotNull @Query("scopes") String... scopes);

    @GET("terms")
    @NotNull
    d0<List<d>> getTermsByDocumentId(@NotNull @Query("documentId") String documentId, @Query("locale") String locale);

    @Headers({"Content-Type: text/html"})
    @GET("/terms/{termId}")
    @NotNull
    d0<ResponseBody> getTermsHtmlPage(@Path("termId") @NotNull String termId);
}
