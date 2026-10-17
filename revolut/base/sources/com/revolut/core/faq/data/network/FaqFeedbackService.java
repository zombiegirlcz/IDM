package com.revolut.core.faq.data.network;

import cg0.g;
import cg0.g0;
import cg0.h;
import cg0.i;
import efm.b;
import efm.d0;
import efm.k;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.PATCH;
import retrofit2.http.POST;
import retrofit2.http.Path;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J\u001f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bH'¢\u0006\u0004\b\n\u0010\u000bJ)\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00050\b2\b\b\u0001\u0010\f\u001a\u00020\u00022\b\b\u0001\u0010\u000e\u001a\u00020\rH'¢\u0006\u0004\b\u000f\u0010\u0010J#\u0010\u0014\u001a\u00020\u00132\b\b\u0001\u0010\u0011\u001a\u00020\u00022\b\b\u0001\u0010\u000e\u001a\u00020\u0012H'¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0016À\u0006\u0003"}, d2 = {"Lcom/revolut/core/faq/data/network/FaqFeedbackService;", "", "", "faqKey", "Lefm/k;", "Lcg0/h;", "getFeedbackForFaq", "(Ljava/lang/String;)Lefm/k;", "Lefm/d0;", "Lcg0/g0;", "getTagsForFaqFeedback", "()Lefm/d0;", "key", "Lcg0/i;", "request", "rateFaq", "(Ljava/lang/String;Lcg0/i;)Lefm/d0;", "feedbackId", "Lcg0/g;", "Lefm/b;", "editFeedbackFaq", "(Ljava/lang/String;Lcg0/g;)Lefm/b;", "core_faq_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface FaqFeedbackService {
    @PATCH("/support/feedbacks/{feedbackId}")
    @NotNull
    b editFeedbackFaq(@Path("feedbackId") @NotNull String feedbackId, @Body @NotNull g request);

    @GET("/support/feedbacks/faq/{faqKey}")
    @NotNull
    k<h> getFeedbackForFaq(@Path("faqKey") @NotNull String faqKey);

    @GET("/support/faq-feedback-tags")
    @NotNull
    d0<g0> getTagsForFaqFeedback();

    @POST("/support/feedbacks/faq/{faqKey}")
    @NotNull
    d0<h> rateFaq(@Path("faqKey") @NotNull String key, @Body @NotNull i request);
}
