package com.trustdockekyc.core.backend.internal.infrastructure.api;

import com.trustdockekyc.core.backend.internal.infrastructure.api.entity.transactionapi.GetSettingResponse;
import com.trustdockekyc.core.backend.internal.infrastructure.api.entity.transactionapi.PostPackageRequestBody;
import com.trustdockekyc.core.backend.internal.infrastructure.api.entity.transactionapi.PostPackageResponse;
import com.trustdockekyc.core.backend.internal.infrastructure.api.entity.transactionapi.PostVerificationResultRequestBody;
import com.trustdockekyc.core.backend.internal.infrastructure.api.entity.transactionapi.PostVerificationResultResponse;
import com.trustdockekyc.core.backend.internal.infrastructure.api.entity.transactionapi.process.facematchingjapantd.GetFaceMatchingJapanTdProcessesSettingResponse;
import com.trustdockekyc.core.backend.internal.infrastructure.api.entity.transactionapi.process.facematchingjapantd.PostFaceMatchingJapanTdProcessesFaceMatchingsRequestBody;
import com.trustdockekyc.core.backend.internal.infrastructure.api.entity.transactionapi.process.facematchingjapantd.PostFaceMatchingJapanTdProcessesFaceMatchingsResponse;
import com.trustdockekyc.core.backend.internal.infrastructure.api.entity.transactionapi.process.facematchingjapantd.PostFaceMatchingJapanTdProcessesRandomShootingPatternResponse;
import com.trustdockekyc.core.backend.internal.infrastructure.api.entity.transactionapi.process.icchipreaderjapanct.GetIcChipReaderJapanCtProcessesSettingResponse;
import com.trustdockekyc.core.backend.internal.infrastructure.api.entity.transactionapi.process.icchipreaderjapanct.PostIcChipReaderJapanCtProcessesDocumentRequestBody;
import com.trustdockekyc.core.backend.internal.infrastructure.api.entity.transactionapi.process.icchipreaderjapanct.PostIcChipReaderJapanCtProcessesDocumentResponse;
import com.trustdockekyc.core.backend.internal.infrastructure.api.entity.transactionapi.process.jpkict.GetJpkiCtProcessesSettingResponse;
import com.trustdockekyc.core.backend.internal.infrastructure.api.entity.transactionapi.process.jpkict.JPKICTIdentificationResult;
import com.trustdockekyc.core.backend.internal.infrastructure.api.entity.transactionapi.process.jpkict.JPKICTProcessesTbsDataRequestBody;
import com.trustdockekyc.core.backend.internal.infrastructure.api.entity.transactionapi.process.jpkict.JPKICTProcessesTbsDataResponse;
import com.trustdockekyc.core.backend.internal.infrastructure.api.entity.transactionapi.process.jpkict.PostJpkiCtProcessesChallengeRequestBody;
import com.trustdockekyc.core.backend.internal.infrastructure.api.entity.transactionapi.process.jpkict.PostJpkiCtProcessesChallengeResponse;
import com.trustdockekyc.core.backend.internal.infrastructure.api.entity.transactionapi.process.jpkict.PostJpkiCtProcessesIdentificationRequestBody;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b`\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0003\u001a\u00020\u00072\b\b\u0001\u0010\u0006\u001a\u00020\u0005H§@¢\u0006\u0004\b\u0003\u0010\bJ\u001a\u0010\u0003\u001a\u00020\n2\b\b\u0001\u0010\u0006\u001a\u00020\tH§@¢\u0006\u0004\b\u0003\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\b\u0001\u0010\r\u001a\u00020\fH§@¢\u0006\u0004\b\u000f\u0010\u0010J$\u0010\u0003\u001a\u00020\u00122\b\b\u0001\u0010\r\u001a\u00020\f2\b\b\u0001\u0010\u0006\u001a\u00020\u0011H§@¢\u0006\u0004\b\u0003\u0010\u0013J$\u0010\u0003\u001a\u00020\u00152\b\b\u0001\u0010\r\u001a\u00020\f2\b\b\u0001\u0010\u0006\u001a\u00020\u0014H§@¢\u0006\u0004\b\u0003\u0010\u0016J$\u0010\u0003\u001a\u00020\u00182\b\b\u0001\u0010\r\u001a\u00020\f2\b\b\u0001\u0010\u0006\u001a\u00020\u0017H§@¢\u0006\u0004\b\u0003\u0010\u0019J\u001a\u0010\u001b\u001a\u00020\u001a2\b\b\u0001\u0010\r\u001a\u00020\fH§@¢\u0006\u0004\b\u001b\u0010\u0010J$\u0010\u0003\u001a\u00020\u001d2\b\b\u0001\u0010\r\u001a\u00020\f2\b\b\u0001\u0010\u0006\u001a\u00020\u001cH§@¢\u0006\u0004\b\u0003\u0010\u001eJ\u001a\u0010 \u001a\u00020\u001f2\b\b\u0001\u0010\r\u001a\u00020\fH§@¢\u0006\u0004\b \u0010\u0010J\u001a\u0010\u0003\u001a\u00020!2\b\b\u0001\u0010\r\u001a\u00020\fH§@¢\u0006\u0004\b\u0003\u0010\u0010J$\u0010\u0003\u001a\u00020#2\b\b\u0001\u0010\r\u001a\u00020\f2\b\b\u0001\u0010\u0006\u001a\u00020\"H§@¢\u0006\u0004\b\u0003\u0010$¨\u0006%"}, d2 = {"Lcom/trustdockekyc/core/backend/internal/infrastructure/api/r;", "", "Lcom/trustdockekyc/core/backend/internal/infrastructure/api/entity/transactionapi/GetSettingResponse;", "a", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/trustdockekyc/core/backend/internal/infrastructure/api/entity/transactionapi/PostVerificationResultRequestBody;", "param", "Lcom/trustdockekyc/core/backend/internal/infrastructure/api/entity/transactionapi/PostVerificationResultResponse;", "(Lcom/trustdockekyc/core/backend/internal/infrastructure/api/entity/transactionapi/PostVerificationResultRequestBody;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/trustdockekyc/core/backend/internal/infrastructure/api/entity/transactionapi/PostPackageRequestBody;", "Lcom/trustdockekyc/core/backend/internal/infrastructure/api/entity/transactionapi/PostPackageResponse;", "(Lcom/trustdockekyc/core/backend/internal/infrastructure/api/entity/transactionapi/PostPackageRequestBody;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "processId", "Lcom/trustdockekyc/core/backend/internal/infrastructure/api/entity/transactionapi/process/jpkict/GetJpkiCtProcessesSettingResponse;", "c", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/trustdockekyc/core/backend/internal/infrastructure/api/entity/transactionapi/process/jpkict/PostJpkiCtProcessesChallengeRequestBody;", "Lcom/trustdockekyc/core/backend/internal/infrastructure/api/entity/transactionapi/process/jpkict/PostJpkiCtProcessesChallengeResponse;", "(Ljava/lang/String;Lcom/trustdockekyc/core/backend/internal/infrastructure/api/entity/transactionapi/process/jpkict/PostJpkiCtProcessesChallengeRequestBody;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/trustdockekyc/core/backend/internal/infrastructure/api/entity/transactionapi/process/jpkict/PostJpkiCtProcessesIdentificationRequestBody;", "Lcom/trustdockekyc/core/backend/internal/infrastructure/api/entity/transactionapi/process/jpkict/JPKICTIdentificationResult;", "(Ljava/lang/String;Lcom/trustdockekyc/core/backend/internal/infrastructure/api/entity/transactionapi/process/jpkict/PostJpkiCtProcessesIdentificationRequestBody;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/trustdockekyc/core/backend/internal/infrastructure/api/entity/transactionapi/process/jpkict/JPKICTProcessesTbsDataRequestBody;", "Lcom/trustdockekyc/core/backend/internal/infrastructure/api/entity/transactionapi/process/jpkict/JPKICTProcessesTbsDataResponse;", "(Ljava/lang/String;Lcom/trustdockekyc/core/backend/internal/infrastructure/api/entity/transactionapi/process/jpkict/JPKICTProcessesTbsDataRequestBody;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/trustdockekyc/core/backend/internal/infrastructure/api/entity/transactionapi/process/icchipreaderjapanct/GetIcChipReaderJapanCtProcessesSettingResponse;", "d", "Lcom/trustdockekyc/core/backend/internal/infrastructure/api/entity/transactionapi/process/icchipreaderjapanct/PostIcChipReaderJapanCtProcessesDocumentRequestBody;", "Lcom/trustdockekyc/core/backend/internal/infrastructure/api/entity/transactionapi/process/icchipreaderjapanct/PostIcChipReaderJapanCtProcessesDocumentResponse;", "(Ljava/lang/String;Lcom/trustdockekyc/core/backend/internal/infrastructure/api/entity/transactionapi/process/icchipreaderjapanct/PostIcChipReaderJapanCtProcessesDocumentRequestBody;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/trustdockekyc/core/backend/internal/infrastructure/api/entity/transactionapi/process/facematchingjapantd/GetFaceMatchingJapanTdProcessesSettingResponse;", "b", "Lcom/trustdockekyc/core/backend/internal/infrastructure/api/entity/transactionapi/process/facematchingjapantd/PostFaceMatchingJapanTdProcessesRandomShootingPatternResponse;", "Lcom/trustdockekyc/core/backend/internal/infrastructure/api/entity/transactionapi/process/facematchingjapantd/PostFaceMatchingJapanTdProcessesFaceMatchingsRequestBody;", "Lcom/trustdockekyc/core/backend/internal/infrastructure/api/entity/transactionapi/process/facematchingjapantd/PostFaceMatchingJapanTdProcessesFaceMatchingsResponse;", "(Ljava/lang/String;Lcom/trustdockekyc/core/backend/internal/infrastructure/api/entity/transactionapi/process/facematchingjapantd/PostFaceMatchingJapanTdProcessesFaceMatchingsRequestBody;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "backend_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public interface r {
    @POST("/package")
    Object a(@Body @NotNull PostPackageRequestBody postPackageRequestBody, @NotNull Continuation<? super PostPackageResponse> continuation);

    @POST("/verification_result")
    Object a(@Body @NotNull PostVerificationResultRequestBody postVerificationResultRequestBody, @NotNull Continuation<? super PostVerificationResultResponse> continuation);

    @POST("/face_matching_japan_td_processes/{process_id}/face_matchings")
    Object a(@Path("process_id") @NotNull String str, @Body @NotNull PostFaceMatchingJapanTdProcessesFaceMatchingsRequestBody postFaceMatchingJapanTdProcessesFaceMatchingsRequestBody, @NotNull Continuation<? super PostFaceMatchingJapanTdProcessesFaceMatchingsResponse> continuation);

    @POST("/ic_chip_reader_japan_ct_processes/{process_id}/document")
    Object a(@Path("process_id") @NotNull String str, @Body @NotNull PostIcChipReaderJapanCtProcessesDocumentRequestBody postIcChipReaderJapanCtProcessesDocumentRequestBody, @NotNull Continuation<? super PostIcChipReaderJapanCtProcessesDocumentResponse> continuation);

    @POST("/jpki_ct_processes/{process_id}/tbs_data")
    Object a(@Path("process_id") @NotNull String str, @Body @NotNull JPKICTProcessesTbsDataRequestBody jPKICTProcessesTbsDataRequestBody, @NotNull Continuation<? super JPKICTProcessesTbsDataResponse> continuation);

    @POST("/jpki_ct_processes/{process_id}/challenge")
    Object a(@Path("process_id") @NotNull String str, @Body @NotNull PostJpkiCtProcessesChallengeRequestBody postJpkiCtProcessesChallengeRequestBody, @NotNull Continuation<? super PostJpkiCtProcessesChallengeResponse> continuation);

    @POST("/jpki_ct_processes/{process_id}/identification")
    Object a(@Path("process_id") @NotNull String str, @Body @NotNull PostJpkiCtProcessesIdentificationRequestBody postJpkiCtProcessesIdentificationRequestBody, @NotNull Continuation<? super JPKICTIdentificationResult> continuation);

    @POST("/face_matching_japan_td_processes/{process_id}/random_shooting_pattern")
    Object a(@Path("process_id") @NotNull String str, @NotNull Continuation<? super PostFaceMatchingJapanTdProcessesRandomShootingPatternResponse> continuation);

    @GET("/setting")
    Object a(@NotNull Continuation<? super GetSettingResponse> continuation);

    @GET("/face_matching_japan_td_processes/{process_id}/setting")
    Object b(@Path("process_id") @NotNull String str, @NotNull Continuation<? super GetFaceMatchingJapanTdProcessesSettingResponse> continuation);

    @GET("/jpki_ct_processes/{process_id}/setting")
    Object c(@Path("process_id") @NotNull String str, @NotNull Continuation<? super GetJpkiCtProcessesSettingResponse> continuation);

    @GET("/ic_chip_reader_japan_ct_processes/{process_id}/setting")
    Object d(@Path("process_id") @NotNull String str, @NotNull Continuation<? super GetIcChipReaderJapanCtProcessesSettingResponse> continuation);
}
