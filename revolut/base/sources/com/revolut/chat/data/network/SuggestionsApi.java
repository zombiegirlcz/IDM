package com.revolut.chat.data.network;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import l20.b;
import org.jetbrains.annotations.NotNull;
import retrofit2.http.GET;
import retrofit2.http.Query;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J\u001c\u0010\u0005\u001a\u00020\u00042\n\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0002H§@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007À\u0006\u0003"}, d2 = {"Lcom/revolut/chat/data/network/SuggestionsApi;", "", "", "entryPoint", "Ll20/b;", "getSuggestions", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "chat_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface SuggestionsApi {
    @GET("/api/client/suggestions/assistant")
    Object getSuggestions(@Query("entryPoint") String str, @NotNull Continuation<? super b> continuation);
}
