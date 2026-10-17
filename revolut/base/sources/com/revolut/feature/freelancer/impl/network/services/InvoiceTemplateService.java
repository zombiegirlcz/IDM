package com.revolut.feature.freelancer.impl.network.services;

import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import okhttp3.ResponseBody;
import org.jetbrains.annotations.NotNull;
import r9d.a;
import r9d.b;
import r9d.d;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.PATCH;
import retrofit2.http.POST;
import retrofit2.http.Path;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\b`\u0018\u00002\u00020\u0001J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H§@¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\b\u001a\u00020\u00032\b\b\u0001\u0010\u0007\u001a\u00020\u0006H§@¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\f\u001a\u00020\u00032\b\b\u0001\u0010\u000b\u001a\u00020\nH§@¢\u0006\u0004\b\f\u0010\rJ \u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\b\b\u0001\u0010\u000b\u001a\u00020\nH§@¢\u0006\u0004\b\u0010\u0010\rJ$\u0010\u0012\u001a\u00020\u00032\b\b\u0001\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010\u000b\u001a\u00020\u0011H§@¢\u0006\u0004\b\u0012\u0010\u0013J \u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u000e2\b\b\u0001\u0010\u0007\u001a\u00020\u0006H§@¢\u0006\u0004\b\u0015\u0010\t¨\u0006\u0016À\u0006\u0003"}, d2 = {"Lcom/revolut/feature/freelancer/impl/network/services/InvoiceTemplateService;", "", "", "Lr9d/b;", "getTemplates", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "id", "getTemplate", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lr9d/a;", "payload", "createTemplate", "(Lr9d/a;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lretrofit2/Response;", "Lokhttp3/ResponseBody;", "previewTemplate", "Lr9d/d;", "updateTemplate", "(Ljava/lang/String;Lr9d/d;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "deleteTemplate", "feature_freelancer_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface InvoiceTemplateService {
    @POST("acquiring/merchant/invoice-templates")
    Object createTemplate(@Body @NotNull a aVar, @NotNull Continuation<? super b> continuation);

    @DELETE("acquiring/merchant/invoice-templates/{id}")
    Object deleteTemplate(@Path("id") @NotNull String str, @NotNull Continuation<? super Response<Unit>> continuation);

    @GET("acquiring/merchant/invoice-templates/{id}")
    Object getTemplate(@Path("id") @NotNull String str, @NotNull Continuation<? super b> continuation);

    @GET("acquiring/merchant/invoice-templates")
    Object getTemplates(@NotNull Continuation<? super List<b>> continuation);

    @POST("acquiring/merchant/invoice-templates/preview/pdf")
    Object previewTemplate(@Body @NotNull a aVar, @NotNull Continuation<? super Response<ResponseBody>> continuation);

    @PATCH("acquiring/merchant/invoice-templates/{id}")
    Object updateTemplate(@Path("id") @NotNull String str, @Body @NotNull d dVar, @NotNull Continuation<? super b> continuation);
}
