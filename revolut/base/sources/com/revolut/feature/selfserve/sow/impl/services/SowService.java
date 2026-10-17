package com.revolut.feature.selfserve.sow.impl.services;

import com.revolut.feature.selfserve.sow.impl.dto.UploadDocumentsResponseDto;
import efm.b;
import efm.d0;
import java.util.List;
import jzc.c;
import jzc.j;
import jzc.m;
import jzc.o;
import jzc.s;
import jzc.t;
import jzc.u;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import retrofit2.http.Query;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b`\u0018\u00002\u00020\u0001J\u0015\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H'¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0002H'¢\u0006\u0004\b\u0007\u0010\u0005J\u001b\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u0002H'¢\u0006\u0004\b\n\u0010\u0005J\u0015\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0002H'¢\u0006\u0004\b\f\u0010\u0005J\u001f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00022\b\b\u0001\u0010\u000e\u001a\u00020\rH'¢\u0006\u0004\b\u0010\u0010\u0011J\u0019\u0010\u0015\u001a\u00020\u00142\b\b\u0001\u0010\u0013\u001a\u00020\u0012H'¢\u0006\u0004\b\u0015\u0010\u0016JG\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\u00022\b\b\u0001\u0010\u0013\u001a\u00020\u00122\b\b\u0001\u0010\u0017\u001a\u00020\u00122\b\b\u0001\u0010\u0018\u001a\u00020\u00122\b\b\u0001\u0010\u0019\u001a\u00020\u00122\b\b\u0001\u0010\u001b\u001a\u00020\u001aH'¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\u0014H'¢\u0006\u0004\b\u001f\u0010 J#\u0010#\u001a\u00020\u00142\b\b\u0001\u0010\u0013\u001a\u00020\u00122\b\b\u0001\u0010\"\u001a\u00020!H'¢\u0006\u0004\b#\u0010$J\u001b\u0010&\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020%0\b0\u0002H'¢\u0006\u0004\b&\u0010\u0005¨\u0006'À\u0006\u0003"}, d2 = {"Lcom/revolut/feature/selfserve/sow/impl/services/SowService;", "", "Lefm/d0;", "Ljzc/t;", "getSubmissionsConfig", "()Lefm/d0;", "Ljzc/s;", "getFlowState", "", "Ljzc/m;", "getEvidenceTypes", "Ljzc/o;", "getLatestSubmission", "Ljzc/c;", "createEvidenceDto", "Ljzc/j;", "createEvidence", "(Ljzc/c;)Lefm/d0;", "", "evidenceId", "Lefm/b;", "deleteEvidence", "(Ljava/lang/String;)Lefm/b;", "documentType", "actionToDoId", "userDefinedType", "Lokhttp3/c;", "documents", "Lcom/revolut/feature/selfserve/sow/impl/dto/UploadDocumentsResponseDto;", "uploadDocuments", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lokhttp3/c;)Lefm/d0;", "confirmUpload", "()Lefm/b;", "Ljzc/b;", "answerQuestionRequestDto", "answerEvidenceQuestion", "(Ljava/lang/String;Ljzc/b;)Lefm/b;", "Ljzc/u;", "getWarnings", "feature_selfserve_sow_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface SowService {
    @POST("/user/current/submissions/sow/v6/evidences/{evidence_id}/questions")
    @NotNull
    b answerEvidenceQuestion(@Path("evidence_id") @NotNull String evidenceId, @Body @NotNull jzc.b answerQuestionRequestDto);

    @PUT("/user/current/submissions/sow/v5/confirm-upload")
    @NotNull
    b confirmUpload();

    @POST("/user/current/submissions/sow/v5/evidences")
    @NotNull
    d0<j> createEvidence(@Body @NotNull c createEvidenceDto);

    @DELETE("/user/current/submissions/sow/v5/evidences/{evidence_id}")
    @NotNull
    b deleteEvidence(@Path("evidence_id") @NotNull String evidenceId);

    @GET("/user/current/submissions/sow/v6/evidences/types")
    @NotNull
    d0<List<m>> getEvidenceTypes();

    @GET("/user/current/submissions/states")
    @NotNull
    d0<s> getFlowState();

    @GET("/user/current/submissions/sow/v5/latest")
    @NotNull
    d0<o> getLatestSubmission();

    @GET("/user/current/submissions/sow/v5/config")
    @NotNull
    d0<t> getSubmissionsConfig();

    @GET("/user/current/submissions/sow/v6/warnings")
    @NotNull
    d0<List<u>> getWarnings();

    @POST("/user/current/submissions/sow/v6/evidences/{evidence_id}/documents")
    @NotNull
    d0<UploadDocumentsResponseDto> uploadDocuments(@Path("evidence_id") @NotNull String evidenceId, @NotNull @Query("documentType") String documentType, @NotNull @Query("actionToDoId") String actionToDoId, @NotNull @Query("userDefinedType") String userDefinedType, @Body @NotNull okhttp3.c documents);
}
