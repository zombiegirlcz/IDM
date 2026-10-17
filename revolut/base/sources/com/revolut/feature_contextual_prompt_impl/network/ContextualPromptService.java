package com.revolut.feature_contextual_prompt_impl.network;

import efm.b;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import retrofit2.http.POST;
import retrofit2.http.Path;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b`\u0018\u00002\u00020\u0001J\u0019\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0005\u0010\u0006J\u0019\u0010\u0007\u001a\u00020\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0007\u0010\u0006¨\u0006\bÀ\u0006\u0003"}, d2 = {"Lcom/revolut/feature_contextual_prompt_impl/network/ContextualPromptService;", "", "", "id", "Lefm/b;", "markAsViewed", "(Ljava/lang/String;)Lefm/b;", "markAsOpened", "feature_contextual_prompt_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface ContextualPromptService {
    @POST("/in-app-pushes/{id}/open")
    @NotNull
    b markAsOpened(@Path("id") @NotNull String id10);

    @POST("/in-app-pushes/{id}/view")
    @NotNull
    b markAsViewed(@Path("id") @NotNull String id10);
}
