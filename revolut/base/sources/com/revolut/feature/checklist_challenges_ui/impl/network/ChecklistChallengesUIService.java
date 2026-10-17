package com.revolut.feature.checklist_challenges_ui.impl.network;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import retrofit2.http.GET;
import retrofit2.http.Path;
import xg3.c;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J$\u0010\u0006\u001a\u00020\u00052\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\n\u001a\u00020\t2\b\b\u0001\u0010\b\u001a\u00020\u0002H§@¢\u0006\u0004\b\n\u0010\u000b¨\u0006\fÀ\u0006\u0003"}, d2 = {"Lcom/revolut/feature/checklist_challenges_ui/impl/network/ChecklistChallengesUIService;", "", "", "campaignId", "stepId", "Lyg3/c;", "getStepDetails", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "id", "Lxg3/c;", "getCollection", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "feature_checklist_challenges_ui_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface ChecklistChallengesUIService {
    @GET("/incentives/checklist-challenges/{id}/campaign")
    Object getCollection(@Path("id") @NotNull String str, @NotNull Continuation<? super c> continuation);

    @GET("/incentives/campaigns/{campaignId}/steps/{stepId}/details")
    Object getStepDetails(@Path("campaignId") @NotNull String str, @Path("stepId") @NotNull String str2, @NotNull Continuation<? super yg3.c> continuation);
}
