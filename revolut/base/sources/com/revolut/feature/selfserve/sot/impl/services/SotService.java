package com.revolut.feature.selfserve.sot.impl.services;

import efm.b;
import efm.d0;
import java.util.List;
import kotlin.Metadata;
import kyc.g;
import kyc.h;
import kyc.i;
import kyc.q;
import kyc.r;
import kyc.t;
import okhttp3.c;
import org.jetbrains.annotations.NotNull;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;
import retrofit2.http.Query;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J\u0015\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H'¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0002H'¢\u0006\u0004\b\u0007\u0010\u0005J\u001b\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u0002H'¢\u0006\u0004\b\n\u0010\u0005J\u0015\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0002H'¢\u0006\u0004\b\f\u0010\u0005J\u001f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00022\b\b\u0001\u0010\u000e\u001a\u00020\rH'¢\u0006\u0004\b\u0010\u0010\u0011JE\u0010\u001a\u001a\u00020\u00192\b\b\u0001\u0010\u0013\u001a\u00020\u00122\b\b\u0001\u0010\u0014\u001a\u00020\u00122\n\b\u0001\u0010\u0015\u001a\u0004\u0018\u00010\u00122\n\b\u0001\u0010\u0016\u001a\u0004\u0018\u00010\u00122\b\b\u0001\u0010\u0018\u001a\u00020\u0017H'¢\u0006\u0004\b\u001a\u0010\u001b¨\u0006\u001cÀ\u0006\u0003"}, d2 = {"Lcom/revolut/feature/selfserve/sot/impl/services/SotService;", "", "Lefm/d0;", "Lkyc/q;", "getSubmissionFlowsStates", "()Lefm/d0;", "Lkyc/t;", "getSubmissionsConfig", "", "Lkyc/i;", "getIncomeSources", "Lkyc/r;", "getSubmissionState", "Lkyc/g;", "evidenceRequest", "Lkyc/h;", "createEvidence", "(Lkyc/g;)Lefm/d0;", "", "evidenceId", "documentType", "actionToDoId", "userDefinedType", "Lokhttp3/c;", "documents", "Lefm/b;", "uploadEvidenceFiles", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lokhttp3/c;)Lefm/b;", "feature_selfserve_sot_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface SotService {
    @POST("/user/current/submissions/sot/v6/evidences")
    @NotNull
    d0<h> createEvidence(@Body @NotNull g evidenceRequest);

    @GET("/user/current/submissions/sot/v6/evidences/types")
    @NotNull
    d0<List<i>> getIncomeSources();

    @GET("/user/current/submissions/states")
    @NotNull
    d0<q> getSubmissionFlowsStates();

    @GET("/user/current/submissions/sot/v6/latest")
    @NotNull
    d0<r> getSubmissionState();

    @GET("/user/current/submissions/sot/v6/config")
    @NotNull
    d0<t> getSubmissionsConfig();

    @POST("/user/current/submissions/sot/v6/evidences/{evidenceId}/documents")
    @NotNull
    b uploadEvidenceFiles(@Path("evidenceId") @NotNull String evidenceId, @NotNull @Query("documentType") String documentType, @Query("actionToDoId") String actionToDoId, @Query("userDefinedType") String userDefinedType, @Body @NotNull c documents);
}
