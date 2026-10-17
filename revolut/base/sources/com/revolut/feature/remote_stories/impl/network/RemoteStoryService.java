package com.revolut.feature.remote_stories.impl.network;

import efm.b;
import efm.d0;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import oza.d;
import oza.h;
import oza.i;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;
import retrofit2.http.QueryMap;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J5\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\u0014\b\u0001\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0004H'¢\u0006\u0004\b\b\u0010\tJ5\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\u0014\b\u0001\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0004H'¢\u0006\u0004\b\n\u0010\tJ#\u0010\u000e\u001a\u00020\r2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\f\u001a\u00020\u000bH'¢\u0006\u0004\b\u000e\u0010\u000fJ!\u0010\u0010\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u00040\u0006H'¢\u0006\u0004\b\u0010\u0010\u0011J\u0015\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u0006H'¢\u0006\u0004\b\u0013\u0010\u0011J5\u0010\u0018\u001a\u001e\u0012\u001a\u0012\u0018\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00160\u0004j\u0002`\u00170\u00062\b\b\u0001\u0010\u0015\u001a\u00020\u0014H'¢\u0006\u0004\b\u0018\u0010\u0019¨\u0006\u001aÀ\u0006\u0003"}, d2 = {"Lcom/revolut/feature/remote_stories/impl/network/RemoteStoryService;", "", "", "storyId", "", "substitutionData", "Lefm/d0;", "Loza/d;", "loadStory", "(Ljava/lang/String;Ljava/util/Map;)Lefm/d0;", "loadUnauthorizedStory", "Loza/b;", "remoteStoryCallbackRequest", "Lefm/b;", "markStoryAsOpened", "(Ljava/lang/String;Loza/b;)Lefm/b;", "getRemoteStoriesConfig", "()Lefm/d0;", "Loza/i;", "getStoriesListWithUpdateTimestamps", "Loza/h;", "storyTemplateIds", "", "Lcom/revolut/feature/remote_stories/impl/network/RemoteStoriesVideoAssetsUrlsDto;", "getRemoteStoryVideoAssetsUrls", "(Loza/h;)Lefm/d0;", "feature_remote_stories_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface RemoteStoryService {
    @GET("/config/stories")
    @NotNull
    d0<Map<String, String>> getRemoteStoriesConfig();

    @POST("/stories/assets/find")
    @NotNull
    d0<Map<String, List<String>>> getRemoteStoryVideoAssetsUrls(@Body @NotNull h storyTemplateIds);

    @GET("/stories-list")
    @NotNull
    d0<i> getStoriesListWithUpdateTimestamps();

    @GET("/stories/{storyId}")
    @NotNull
    d0<d> loadStory(@Path("storyId") @NotNull String storyId, @QueryMap @NotNull Map<String, String> substitutionData);

    @GET("/onboarding-stories/{storyId}")
    @NotNull
    d0<d> loadUnauthorizedStory(@Path("storyId") @NotNull String storyId, @QueryMap @NotNull Map<String, String> substitutionData);

    @POST("/stories/{storyId}/open")
    @NotNull
    b markStoryAsOpened(@Path("storyId") @NotNull String storyId, @Body @NotNull oza.b remoteStoryCallbackRequest);
}
