package com.revolut.feature.cms.stories.impl.data.network;

import ij3.n;
import java.util.Map;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.QueryMap;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J0\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\u0014\b\u0001\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0004H§@¢\u0006\u0004\b\u0007\u0010\b¨\u0006\tÀ\u0006\u0003"}, d2 = {"Lcom/revolut/feature/cms/stories/impl/data/network/CmsStoriesService;", "", "", "managedCampaignReference", "", "queryParameters", "Lij3/n;", "getStory", "(Ljava/lang/String;Ljava/util/Map;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "feature_cms_stories_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface CmsStoriesService {
    @GET("stories/v2/{managedCampaignReference}")
    Object getStory(@Path("managedCampaignReference") @NotNull String str, @QueryMap @NotNull Map<String, String> map, @NotNull Continuation<? super n> continuation);
}
