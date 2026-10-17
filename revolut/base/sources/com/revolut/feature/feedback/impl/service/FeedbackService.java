package com.revolut.feature.feedback.impl.service;

import hp6.a;
import hp6.b;
import hp6.c;
import hp6.e;
import hp6.f;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.PATCH;
import retrofit2.http.POST;
import retrofit2.http.Path;
import retrofit2.http.Query;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b`\u0018\u00002\u00020\u0001J$\u0010\u0006\u001a\u00020\u00052\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\t\u001a\u00020\b2\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\t\u0010\nJ:\u0010\u0010\u001a\u00020\u000f2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u00022\b\b\u0001\u0010\f\u001a\u00020\u000b2\n\b\u0003\u0010\u000e\u001a\u0004\u0018\u00010\rH§@¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\b\u0001\u0010\u0012\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0014\u0010\nJ$\u0010\u0015\u001a\u00020\u000f2\b\b\u0001\u0010\u0012\u001a\u00020\u00022\b\b\u0001\u0010\f\u001a\u00020\u000bH§@¢\u0006\u0004\b\u0015\u0010\u0016J$\u0010\u0018\u001a\u00020\u00172\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0018\u0010\u0007¨\u0006\u0019À\u0006\u0003"}, d2 = {"Lcom/revolut/feature/feedback/impl/service/FeedbackService;", "", "", "referenceType", "referenceId", "Lhp6/a;", "getFeedbackActions", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lhp6/f;", "getTagsForFeedback", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lhp6/e;", "request", "", "shouldOverwrite", "Lhp6/c;", "postFeedback", "(Ljava/lang/String;Ljava/lang/String;Lhp6/e;Ljava/lang/Boolean;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "feedbackId", "", "deleteFeedback", "updateFeedback", "(Ljava/lang/String;Lhp6/e;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lhp6/b;", "getFeedbackConfig", "feature_feedback_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface FeedbackService {
    @DELETE("/support/feedbacks/{feedbackId}")
    Object deleteFeedback(@Path("feedbackId") @NotNull String str, @NotNull Continuation<? super Unit> continuation);

    @GET("/support/feedbacks/{referenceType}/{referenceId}/actions")
    Object getFeedbackActions(@Path("referenceType") @NotNull String str, @Path("referenceId") @NotNull String str2, @NotNull Continuation<? super a> continuation);

    @GET("support/feedbacks/{referenceType}/{referenceId}/config")
    Object getFeedbackConfig(@Path("referenceType") @NotNull String str, @Path("referenceId") @NotNull String str2, @NotNull Continuation<? super b> continuation);

    @GET("/support/feedbacks/{referenceType}/tags")
    Object getTagsForFeedback(@Path("referenceType") @NotNull String str, @NotNull Continuation<? super f> continuation);

    @POST("/support/feedbacks/{referenceType}/{referenceId}")
    Object postFeedback(@Path("referenceType") @NotNull String str, @Path("referenceId") @NotNull String str2, @Body @NotNull e eVar, @Query("overwrite") Boolean bool, @NotNull Continuation<? super c> continuation);

    @PATCH("/support/feedbacks/{feedbackId}")
    Object updateFeedback(@Path("feedbackId") @NotNull String str, @Body @NotNull e eVar, @NotNull Continuation<? super c> continuation);
}
