package com.revolut.feature.defi.settings.impl.data.network;

import a66.c;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import retrofit2.http.Body;
import retrofit2.http.POST;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b`\u0018\u00002\u00020\u0001J\u001a\u0010\u0004\u001a\u00020\u00012\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"Lcom/revolut/feature/defi/settings/impl/data/network/DeFiSeedPhraseExportService;", "", "La66/c;", "request", "export", "(La66/c;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "feature_defi_settings_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface DeFiSeedPhraseExportService {
    @POST("crypto/defi/seed-phrase-export")
    Object export(@Body @NotNull c cVar, @NotNull Continuation<Object> continuation);
}
