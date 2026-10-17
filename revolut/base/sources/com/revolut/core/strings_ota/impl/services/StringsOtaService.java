package com.revolut.core.strings_ota.impl.services;

import efm.d0;
import java.util.Map;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import qm0.g;
import retrofit2.http.GET;
import retrofit2.http.Path;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J5\u0010\u0007\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u00060\u00052\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u0002H'¢\u0006\u0004\b\u0007\u0010\b¨\u0006\tÀ\u0006\u0003"}, d2 = {"Lcom/revolut/core/strings_ota/impl/services/StringsOtaService;", "", "", "domain", "locale", "Lefm/d0;", "", "getStringsOtaInfo", "(Ljava/lang/String;Ljava/lang/String;)Lefm/d0;", "strings_ota_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface StringsOtaService {
    @g
    @GET("https://assets.revolut.{domain}/lokalise/api-errors/{locale}.json")
    @NotNull
    d0<Map<String, String>> getStringsOtaInfo(@Path("domain") @NotNull String domain, @Path("locale") @NotNull String locale);
}
