package com.onfido.api.client;

import com.google.common.primitives.UnsignedBytes;
import com.onfido.api.client.data.DeviceInfo;
import com.onfido.api.client.data.DocType;
import com.onfido.api.client.data.DocumentMediaIntegrity;
import com.onfido.api.client.data.InternalDocSide;
import com.onfido.api.client.data.LiveVideoChallenges;
import com.onfido.api.client.data.LiveVideoLanguage;
import com.onfido.api.client.data.MRZDocument;
import com.onfido.api.client.data.NfcPropertiesRequest;
import com.onfido.api.client.data.PayloadIntegrity;
import com.onfido.api.client.data.PoaDocumentType;
import com.onfido.api.client.data.SdkConfigurationRequestBody;
import com.onfido.api.client.data.SdkUploadMetaData;
import com.onfido.api.client.data.SupportedDocuments;
import com.onfido.api.client.token.InternalToken;
import com.onfido.api.client.token.sdk.InternalSDKToken;
import com.onfido.api.client.token.sdk.model.InternalSDKTokenPayload;
import io.reactivex.rxjava3.core.Single;
import java.io.File;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KType;
import kotlin.reflect.KTypeProjection;
import kotlinx.serialization.json.JsonObject;
import okhttp3.RequestBody;
import ulm.a1;
import ulm.b1;
import ulm.c1;
import ulm.k1;
import ulm.p1;

/* JADX INFO: loaded from: classes17.dex */
public final class n implements OnfidoAPI {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f50140a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final r f50141b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final f f50142c;
    public final s d;
    public final f e;
    public final f f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final f f50143g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final f f50144h;
    public final String i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final String f50145j;

    public n(r rVar, f fVar, s sVar, f fVar2, f fVar3, f fVar4, c cVar, f fVar5, String str, String str2) {
        this.f50141b = rVar;
        this.f50142c = fVar;
        this.d = sVar;
        this.e = fVar2;
        this.f50140a = cVar;
        this.f = fVar3;
        this.f50143g = fVar4;
        this.f50144h = fVar5;
        this.i = str;
        this.f50145j = str2;
    }

    @Override // com.onfido.api.client.OnfidoAPI
    public final Single a(String str, DocType docType, String str2, String str3, byte[] bArr, SdkUploadMetaData sdkUploadMetaData) {
        return j(this.f50141b.f50150b.uploadSingle(new a(this.i, this.f50145j).e(str, docType, str2, bArr, null, null, null, sdkUploadMetaData, str3).e()));
    }

    @Override // com.onfido.api.client.OnfidoAPI
    public final void b(String str, DocType docType, String str2, byte[] bArr, l lVar, LinkedHashMap linkedHashMap, InternalDocSide internalDocSide, String str3, DocumentMediaIntegrity documentMediaIntegrity, SdkUploadMetaData sdkUploadMetaData) {
        okhttp3.c cVarE = new a(this.i, this.f50145j).e(str, docType, str2, bArr, linkedHashMap, internalDocSide, str3, sdkUploadMetaData, null).e();
        this.f50141b.f50150b.upload(documentMediaIntegrity.getSignatureBase64(), documentMediaIntegrity.getClientNonce(), cVarE).enqueue(new k(lVar, this.f50140a));
    }

    @Override // com.onfido.api.client.OnfidoAPI
    public final Single c(List list, MRZDocument mRZDocument) {
        return j(this.f50143g.f50135a.getNfcProperties(new NfcPropertiesRequest(list, mRZDocument)));
    }

    @Override // com.onfido.api.client.OnfidoAPI
    public final Single d(String fileName, String fileType, byte[] data, String challengeId, List challenges, Long l2, List languages, SdkUploadMetaData sdkUploadMetaData, PayloadIntegrity payloadIntegrity) {
        long jLongValue = l2.longValue();
        String sdkSource = this.i;
        Intrinsics.checkNotNullParameter(sdkSource, "sdkSource");
        String sdkVersion = this.f50145j;
        Intrinsics.checkNotNullParameter(sdkVersion, "sdkVersion");
        j jVar = new j(sdkSource, sdkVersion);
        Intrinsics.checkNotNullParameter(fileName, "fileName");
        Intrinsics.checkNotNullParameter(fileType, "fileType");
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(challengeId, "challengeId");
        Intrinsics.checkNotNullParameter(challenges, "challenges");
        Intrinsics.checkNotNullParameter(languages, "languages");
        jVar.c("challenge_id", challengeId);
        rlm.o oVar = e.f50133a;
        tlm.e eVar = oVar.f187949b;
        KTypeProjection.Companion companion = KTypeProjection.INSTANCE;
        KType kTypeB = o0.b(LiveVideoChallenges.LiveVideoChallenge.class);
        companion.getClass();
        jVar.c("challenge", oVar.c(jh.d.v(eVar, o0.c(List.class, KTypeProjection.Companion.a(kTypeB))), challenges));
        jVar.b(fileName, fileType, data);
        jVar.c("challenge_switch_at", String.valueOf(jLongValue));
        jVar.c("languages", oVar.c(jh.d.v(oVar.f187949b, o0.c(List.class, KTypeProjection.Companion.a(o0.b(LiveVideoLanguage.class)))), languages));
        jVar.d(sdkUploadMetaData);
        if (payloadIntegrity != null && !payloadIntegrity.isEmpty()) {
            String signature = payloadIntegrity.getSignatureBase64();
            Intrinsics.h(signature);
            Intrinsics.checkNotNullParameter(signature, "signature");
            jVar.c("s", signature);
            String clientNonce = payloadIntegrity.getClientNonce();
            Intrinsics.h(clientNonce);
            Intrinsics.checkNotNullParameter(clientNonce, "clientNonce");
            jVar.c("n", clientNonce);
        }
        return j(this.d.f50151a.uploadLiveVideo(jVar.f50136a.e()));
    }

    @Override // com.onfido.api.client.OnfidoAPI
    public final Single e(String str, String str2, SdkUploadMetaData sdkUploadMetaData, DocumentMediaIntegrity documentMediaIntegrity, InternalDocSide internalDocSide, DocType docType, String str3) {
        a aVar = new a(this.i, this.f50145j);
        aVar.c("document_id", str);
        aVar.d(sdkUploadMetaData);
        aVar.c("type", docType.getId());
        aVar.c("side", internalDocSide.getId());
        if (str3 != null && !str3.isEmpty()) {
            aVar.c("issuing_country", str3);
        }
        File file = new File(str2);
        Intrinsics.checkNotNullParameter(file, "file");
        Intrinsics.checkNotNullParameter("video/mp4", "fileType");
        p1 p1Var = RequestBody.Companion;
        b1.Companion.getClass();
        b1 b1VarA = a1.a("video/mp4");
        p1Var.getClass();
        k1 k1VarA = p1.a(file, b1VarA);
        String name = file.getName();
        Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
        c1 c1Var = aVar.f50136a;
        c1Var.a("name", name);
        c1Var.b("file", file.getName(), k1VarA);
        okhttp3.c cVarE = c1Var.e();
        return j(this.f50141b.f50150b.uploadDocumentVideo(documentMediaIntegrity.getSignatureBase64(), documentMediaIntegrity.getClientNonce(), cVarE).g(new cie.b(22)));
    }

    @Override // com.onfido.api.client.OnfidoAPI
    public final Single f(DeviceInfo deviceInfo) {
        return j(this.f.f50135a.getSdkConfiguration(new SdkConfigurationRequestBody(this.i, this.f50145j, deviceInfo)));
    }

    @Override // com.onfido.api.client.OnfidoAPI
    public final Single g(String str, String str2, String str3, String str4, String str5, LinkedHashMap linkedHashMap, byte[] bArr, SdkUploadMetaData sdkUploadMetaData) {
        String uuid;
        r rVar = this.f50141b;
        InternalToken internalTokenProvideToken = rVar.f50149a.provideToken();
        String string = null;
        if (internalTokenProvideToken instanceof InternalSDKToken) {
            InternalSDKTokenPayload internalSDKTokenPayloadA = ((InternalSDKToken) internalTokenProvideToken).a();
            uuid = internalSDKTokenPayloadA != null ? internalSDKTokenPayloadA.getUuid() : null;
        } else {
            uuid = "";
        }
        byte[] bytes = uuid == null ? null : uuid.getBytes(xk.a.f306591a);
        byte[] bArr2 = new byte[bArr.length + bytes.length];
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        System.arraycopy(bytes, 0, bArr2, bArr.length, bytes.length);
        try {
            byte[] bArrDigest = MessageDigest.getInstance("SHA-256").digest(bArr2);
            StringBuilder sb6 = new StringBuilder(bArrDigest.length * 2);
            for (byte b4 : bArrDigest) {
                String hexString = Integer.toHexString(b4 & UnsignedBytes.MAX_VALUE);
                if (hexString.length() == 1) {
                    sb6.append('0');
                }
                sb6.append(hexString);
            }
            string = sb6.toString();
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
        a aVar = new a(this.i, this.f50145j);
        aVar.a(str, str2, "binary_media", bArr);
        aVar.c("media_type", str3);
        if (str4 != null) {
            aVar.c("sdk_selected_document_side", str4);
        }
        if (str5 != null) {
            aVar.c("sdk_selected_document_type", str5);
        }
        HashMap map = new HashMap();
        if (linkedHashMap != null) {
            for (Map.Entry entry : linkedHashMap.entrySet()) {
                map.put(((ValidationType) entry.getKey()).getId(), rlm.j.c(((ValidationLevel) entry.getValue()).getId()));
            }
        }
        aVar.c("sdk_validations", new JsonObject(map).toString());
        aVar.d(sdkUploadMetaData);
        return j(rVar.f50150b.uploadMediaFile(string, aVar.f50136a.e()));
    }

    @Override // com.onfido.api.client.OnfidoAPI
    public final Single getLiveVideoChallenges() {
        return j(this.e.f50135a.getLiveVideoChallenges());
    }

    @Override // com.onfido.api.client.OnfidoAPI
    public final Single getSupportedDocuments() {
        Single<SupportedDocuments> supportedDocuments = this.f50144h.f50135a.getSupportedDocuments();
        Intrinsics.checkNotNullExpressionValue(supportedDocuments, "getSupportedDocuments(...)");
        return j(supportedDocuments);
    }

    @Override // com.onfido.api.client.OnfidoAPI
    public final void h(String str, String str2, byte[] bArr, boolean z, l lVar, SdkUploadMetaData sdkUploadMetaData, PayloadIntegrity payloadIntegrity) {
        a aVar = new a(this.i, this.f50145j);
        aVar.b(str, str2, bArr);
        aVar.c("advanced_validation", String.valueOf(z));
        aVar.d(sdkUploadMetaData);
        if (payloadIntegrity != null && !payloadIntegrity.isEmpty()) {
            String signature = payloadIntegrity.getSignatureBase64();
            Intrinsics.checkNotNullParameter(signature, "signature");
            aVar.c("s", signature);
            String clientNonce = payloadIntegrity.getClientNonce();
            Intrinsics.checkNotNullParameter(clientNonce, "clientNonce");
            aVar.c("n", clientNonce);
        }
        this.f50142c.f50135a.uploadLivePhoto(aVar.f50136a.e()).enqueue(new k(lVar, this.f50140a));
    }

    @Override // com.onfido.api.client.OnfidoAPI
    public final Single i(String str, PoaDocumentType poaDocumentType, String str2, byte[] bArr, String str3, SdkUploadMetaData sdkUploadMetaData) {
        a aVar = new a(this.i, this.f50145j);
        aVar.b(str, str2, bArr);
        aVar.c("type", poaDocumentType.getId());
        if (str3 != null) {
            aVar.c("issuing_country", str3);
        }
        aVar.d(sdkUploadMetaData);
        return j(this.f50141b.f50150b.uploadPoa(aVar.f50136a.e()));
    }

    public final Single j(Single single) {
        single.getClass();
        return new tgm.g(single, new com.onfido.android.sdk.capture.ui.userconsent.c(this, 1), 3);
    }
}
