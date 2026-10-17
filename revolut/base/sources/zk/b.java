package zk;

import com.onfido.api.client.OnfidoAPI;
import com.onfido.api.client.data.DeviceInfo;
import com.onfido.api.client.data.DocType;
import com.onfido.api.client.data.DocumentMediaIntegrity;
import com.onfido.api.client.data.DocumentUpload;
import com.onfido.api.client.data.InternalDocSide;
import com.onfido.api.client.data.LivePhotoUpload;
import com.onfido.api.client.data.MRZDocument;
import com.onfido.api.client.data.PayloadIntegrity;
import com.onfido.api.client.data.PoaDocumentType;
import com.onfido.api.client.data.PoaDocumentUpload;
import com.onfido.api.client.data.SdkUploadMetaData;
import com.onfido.api.client.l;
import io.reactivex.rxjava3.core.Single;
import java.security.SecureRandom;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import jh.d;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.o0;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.JsonObject;
import rlm.j;

/* JADX INFO: loaded from: classes17.dex */
public final class b implements OnfidoAPI {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Json f322881a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final tul.b f322882b;

    public b(Json jsonParser) {
        Intrinsics.checkNotNullParameter(jsonParser, "jsonParser");
        this.f322881a = jsonParser;
        tul.b bVar = new tul.b();
        bVar.f274637b = new SecureRandom();
        this.f322882b = bVar;
    }

    @Override // com.onfido.api.client.OnfidoAPI
    public final Single a(String str, DocType docType, String str2, String str3, byte[] bArr, SdkUploadMetaData sdkUploadMetaData) {
        InternalDocSide internalDocSide = InternalDocSide.FRONT;
        this.f322882b.getClass();
        HashMap mapM = tul.b.m(docType, internalDocSide);
        Intrinsics.checkNotNullExpressionValue(mapM, "serializeDocumentUpload(...)");
        JsonObject jsonObject = new JsonObject(mapM);
        Json json = this.f322881a;
        tgm.b bVarF = Single.f((DocumentUpload) json.a(d.v(json.f187949b, o0.b(DocumentUpload.class)), jsonObject));
        Intrinsics.checkNotNullExpressionValue(bVarF, "just(...)");
        return bVarF;
    }

    @Override // com.onfido.api.client.OnfidoAPI
    public final void b(String fileName, DocType documentType, String fileType, byte[] data, l listener, LinkedHashMap validations, InternalDocSide internalDocSide, String str, DocumentMediaIntegrity documentMediaIntegrity, SdkUploadMetaData sdkUploadMetaData) {
        Intrinsics.checkNotNullParameter(fileName, "fileName");
        Intrinsics.checkNotNullParameter(documentType, "documentType");
        Intrinsics.checkNotNullParameter(fileType, "fileType");
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(listener, "listener");
        Intrinsics.checkNotNullParameter(validations, "validations");
        Intrinsics.checkNotNullParameter(documentMediaIntegrity, "documentMediaIntegrity");
        Intrinsics.checkNotNullParameter(sdkUploadMetaData, "sdkUploadMetaData");
        this.f322882b.getClass();
        HashMap mapM = tul.b.m(documentType, internalDocSide);
        Intrinsics.checkNotNullExpressionValue(mapM, "serializeDocumentUpload(...)");
        JsonObject jsonObject = new JsonObject(mapM);
        Json json = this.f322881a;
        listener.onSuccess((DocumentUpload) json.a(d.v(json.f187949b, o0.b(DocumentUpload.class)), jsonObject));
    }

    @Override // com.onfido.api.client.OnfidoAPI
    public final Single c(List documentIds, MRZDocument mrzDocument) {
        Intrinsics.checkNotNullParameter(documentIds, "documentIds");
        Intrinsics.checkNotNullParameter(mrzDocument, "mrzDocument");
        tgm.b bVar = new tgm.b(new a(this, 2), 3);
        Intrinsics.checkNotNullExpressionValue(bVar, "fromCallable(...)");
        return bVar;
    }

    @Override // com.onfido.api.client.OnfidoAPI
    public final Single d(String fileName, String fileType, byte[] data, String challengeId, List challengeList, Long l2, List languages, SdkUploadMetaData sdkUploadMetaData, PayloadIntegrity payloadIntegrity) {
        l2.getClass();
        Intrinsics.checkNotNullParameter(fileName, "fileName");
        Intrinsics.checkNotNullParameter(fileType, "fileType");
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(challengeId, "challengeId");
        Intrinsics.checkNotNullParameter(challengeList, "challengeList");
        Intrinsics.checkNotNullParameter(languages, "languages");
        Intrinsics.checkNotNullParameter(sdkUploadMetaData, "sdkUploadMetaData");
        Intrinsics.checkNotNullParameter(payloadIntegrity, "payloadIntegrity");
        tgm.b bVar = new tgm.b(new a(this, 3), 3);
        Intrinsics.checkNotNullExpressionValue(bVar, "fromCallable(...)");
        return bVar;
    }

    @Override // com.onfido.api.client.OnfidoAPI
    public final Single e(String documentId, String videoPath, SdkUploadMetaData sdkUploadMetaData, DocumentMediaIntegrity documentMediaIntegrity, InternalDocSide docSide, DocType docType, String str) {
        Intrinsics.checkNotNullParameter(documentId, "documentId");
        Intrinsics.checkNotNullParameter(videoPath, "videoPath");
        Intrinsics.checkNotNullParameter(sdkUploadMetaData, "sdkUploadMetaData");
        Intrinsics.checkNotNullParameter(documentMediaIntegrity, "documentMediaIntegrity");
        Intrinsics.checkNotNullParameter(docSide, "docSide");
        Intrinsics.checkNotNullParameter(docType, "docType");
        tgm.b bVarF = Single.f("");
        Intrinsics.checkNotNullExpressionValue(bVarF, "just(...)");
        return bVarF;
    }

    @Override // com.onfido.api.client.OnfidoAPI
    public final Single f(DeviceInfo deviceInfo) {
        Intrinsics.checkNotNullParameter(deviceInfo, "deviceInfo");
        tgm.b bVar = new tgm.b(new a(this, 5), 3);
        Intrinsics.checkNotNullExpressionValue(bVar, "fromCallable(...)");
        return bVar;
    }

    @Override // com.onfido.api.client.OnfidoAPI
    public final Single g(String fileName, String fileType, String mediaType, String str, String str2, LinkedHashMap validations, byte[] data, SdkUploadMetaData sdkUploadMetaData) {
        Intrinsics.checkNotNullParameter(fileName, "fileName");
        Intrinsics.checkNotNullParameter(fileType, "fileType");
        Intrinsics.checkNotNullParameter(mediaType, "mediaType");
        Intrinsics.checkNotNullParameter(validations, "validations");
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(sdkUploadMetaData, "sdkUploadMetaData");
        tgm.b bVar = new tgm.b(new a(this, 4), 3);
        Intrinsics.checkNotNullExpressionValue(bVar, "fromCallable(...)");
        return bVar;
    }

    @Override // com.onfido.api.client.OnfidoAPI
    public final Single getLiveVideoChallenges() {
        tgm.b bVar = new tgm.b(new a(this, 0), 3);
        Intrinsics.checkNotNullExpressionValue(bVar, "fromCallable(...)");
        return bVar;
    }

    @Override // com.onfido.api.client.OnfidoAPI
    public final Single getSupportedDocuments() {
        tgm.b bVar = new tgm.b(new a(this, 1), 3);
        Intrinsics.checkNotNullExpressionValue(bVar, "fromCallable(...)");
        return bVar;
    }

    @Override // com.onfido.api.client.OnfidoAPI
    public final void h(String fileName, String fileType, byte[] data, boolean z, l listener, SdkUploadMetaData sdkUploadMetaData, PayloadIntegrity payloadIntegrity) {
        Intrinsics.checkNotNullParameter(fileName, "fileName");
        Intrinsics.checkNotNullParameter(fileType, "fileType");
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(listener, "listener");
        Intrinsics.checkNotNullParameter(sdkUploadMetaData, "sdkUploadMetaData");
        Intrinsics.checkNotNullParameter(payloadIntegrity, "payloadIntegrity");
        this.f322882b.getClass();
        JsonObject jsonObject = new JsonObject(tul.b.l());
        Intrinsics.checkNotNullExpressionValue(jsonObject, "serializeLivePhotoUpload(...)");
        Json json = this.f322881a;
        listener.onSuccess(json.a(d.v(json.f187949b, o0.b(LivePhotoUpload.class)), jsonObject));
    }

    @Override // com.onfido.api.client.OnfidoAPI
    public final Single i(String str, PoaDocumentType poaDocumentType, String str2, byte[] bArr, String str3, SdkUploadMetaData sdkUploadMetaData) {
        this.f322882b.getClass();
        HashMap mapL = tul.b.l();
        mapL.put("applicant_id", j.c("applicant_id"));
        mapL.put("type", j.c(poaDocumentType.getId()));
        mapL.put("side", j.c(InternalDocSide.FRONT.getId()));
        Intrinsics.checkNotNullExpressionValue(mapL, "serializePoaDocumentUpload(...)");
        JsonObject jsonObject = new JsonObject(mapL);
        Json json = this.f322881a;
        tgm.b bVarF = Single.f((PoaDocumentUpload) json.a(d.v(json.f187949b, o0.b(PoaDocumentUpload.class)), jsonObject));
        Intrinsics.checkNotNullExpressionValue(bVarF, "just(...)");
        return bVarF;
    }
}
