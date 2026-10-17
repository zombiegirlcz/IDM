package com.revolut.feature.checklist_challenges.impl.network;

import com.revolut.feature.checklist_challenges.api.models.ChecklistChallenge;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import qg3.c;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.POST;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J(\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00042\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002H§@¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\f\u001a\u00020\u000b2\b\b\u0001\u0010\n\u001a\u00020\tH§@¢\u0006\u0004\b\f\u0010\r¨\u0006\u000eÀ\u0006\u0003"}, d2 = {"Lcom/revolut/feature/checklist_challenges/impl/network/ChecklistChallengesService;", "", "", "ifModifiedSince", "Lretrofit2/Response;", "", "Lcom/revolut/feature/checklist_challenges/api/models/ChecklistChallenge;", "getChecklistChallenges", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lqg3/c;", "data", "", "optInToChecklistChallenge", "(Lqg3/c;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "feature_checklist_challenges_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface ChecklistChallengesService {
    @GET("/incentives/checklist-challenges")
    Object getChecklistChallenges(@Header("If-Modified-Since") String str, @NotNull Continuation<? super Response<List<ChecklistChallenge>>> continuation);

    @POST("/incentives/checklist-challenges/opt-in")
    Object optInToChecklistChallenge(@Body @NotNull c cVar, @NotNull Continuation<? super Unit> continuation);
}
