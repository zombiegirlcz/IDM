package com.revolut.data.network.services;

import com.revolut.data.network.models.statements.StatementTemplateInfoDto;
import efm.d0;
import kotlin.Metadata;
import okhttp3.ResponseBody;
import org.jetbrains.annotations.NotNull;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Url;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u001f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u00042\b\b\u0001\u0010\b\u001a\u00020\u0002H'¢\u0006\u0004\b\n\u0010\u0007¨\u0006\u000bÀ\u0006\u0003"}, d2 = {"Lcom/revolut/data/network/services/StatementTemplateService;", "", "", "templateId", "Lefm/d0;", "Lcom/revolut/data/network/models/statements/StatementTemplateInfoDto;", "getTemplateInfo", "(Ljava/lang/String;)Lefm/d0;", "url", "Lokhttp3/ResponseBody;", "getTemplate", "retail_data_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface StatementTemplateService {
    @GET
    @NotNull
    d0<ResponseBody> getTemplate(@Url @NotNull String url2);

    @GET("/user/current/statements/templates/{id}")
    @NotNull
    d0<StatementTemplateInfoDto> getTemplateInfo(@Path("id") @NotNull String templateId);
}
