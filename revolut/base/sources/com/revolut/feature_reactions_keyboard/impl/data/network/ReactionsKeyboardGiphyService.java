package com.revolut.feature_reactions_keyboard.impl.data.network;

import efm.d0;
import kotlin.Metadata;
import m9i.c;
import org.jetbrains.annotations.NotNull;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.Query;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b`\u0018\u0000 \u000e2\u00020\u0001:\u0001\u000fJI\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0003\u0010\u0005\u001a\u00020\u00042\b\b\u0003\u0010\u0006\u001a\u00020\u00042\b\b\u0003\u0010\u0007\u001a\u00020\u00022\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u0002H'¢\u0006\u0004\b\u000b\u0010\fJI\u0010\r\u001a\b\u0012\u0004\u0012\u00020\n0\t2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0003\u0010\u0005\u001a\u00020\u00042\b\b\u0003\u0010\u0006\u001a\u00020\u00042\b\b\u0003\u0010\u0007\u001a\u00020\u00022\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u0002H'¢\u0006\u0004\b\r\u0010\f¨\u0006\u0010À\u0006\u0003"}, d2 = {"Lcom/revolut/feature_reactions_keyboard/impl/data/network/ReactionsKeyboardGiphyService;", "", "", "query", "", "limit", "offset", "rating", "lang", "Lefm/d0;", "Lm9i/c;", "searchGif", "(Ljava/lang/String;IILjava/lang/String;Ljava/lang/String;)Lefm/d0;", "searchSticker", "Companion", "a", "feature_reactions_keyboard_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface ReactionsKeyboardGiphyService {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final /* synthetic */ Companion INSTANCE = Companion.f97468a;

    /* JADX INFO: renamed from: com.revolut.feature_reactions_keyboard.impl.data.network.ReactionsKeyboardGiphyService$a, reason: from kotlin metadata */
    public static final class Companion {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ Companion f97468a = new Companion();

        private Companion() {
        }
    }

    @Headers({"X-Force-App-Auth: true"})
    @GET("giphy/v1/gifs/search")
    @NotNull
    d0<c> searchGif(@NotNull @Query("q") String query, @Query("limit") int limit, @Query("offset") int offset, @NotNull @Query("rating") String rating, @Query("lang") String lang);

    @Headers({"X-Force-App-Auth: true"})
    @GET("giphy/v1/stickers/search")
    @NotNull
    d0<c> searchSticker(@NotNull @Query("q") String query, @Query("limit") int limit, @Query("offset") int offset, @NotNull @Query("rating") String rating, @Query("lang") String lang);
}
