package com.onfido.api.client;

import com.onfido.api.client.data.DeviceInfo;
import com.onfido.api.client.data.DocType;
import com.onfido.api.client.data.DocumentMediaIntegrity;
import com.onfido.api.client.data.InternalDocSide;
import com.onfido.api.client.data.MRZDocument;
import com.onfido.api.client.data.PayloadIntegrity;
import com.onfido.api.client.data.PoaDocumentType;
import com.onfido.api.client.data.SdkUploadMetaData;
import io.reactivex.rxjava3.core.Single;
import java.util.LinkedHashMap;
import java.util.List;

/* JADX INFO: loaded from: classes17.dex */
public interface OnfidoAPI {
    Single a(String str, DocType docType, String str2, String str3, byte[] bArr, SdkUploadMetaData sdkUploadMetaData);

    void b(String str, DocType docType, String str2, byte[] bArr, l lVar, LinkedHashMap linkedHashMap, InternalDocSide internalDocSide, String str3, DocumentMediaIntegrity documentMediaIntegrity, SdkUploadMetaData sdkUploadMetaData);

    Single c(List list, MRZDocument mRZDocument);

    Single d(String str, String str2, byte[] bArr, String str3, List list, Long l2, List list2, SdkUploadMetaData sdkUploadMetaData, PayloadIntegrity payloadIntegrity);

    Single e(String str, String str2, SdkUploadMetaData sdkUploadMetaData, DocumentMediaIntegrity documentMediaIntegrity, InternalDocSide internalDocSide, DocType docType, String str3);

    Single f(DeviceInfo deviceInfo);

    Single g(String str, String str2, String str3, String str4, String str5, LinkedHashMap linkedHashMap, byte[] bArr, SdkUploadMetaData sdkUploadMetaData);

    Single getLiveVideoChallenges();

    Single getSupportedDocuments();

    void h(String str, String str2, byte[] bArr, boolean z, l lVar, SdkUploadMetaData sdkUploadMetaData, PayloadIntegrity payloadIntegrity);

    Single i(String str, PoaDocumentType poaDocumentType, String str2, byte[] bArr, String str3, SdkUploadMetaData sdkUploadMetaData);
}
