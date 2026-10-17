package com.onfido.android.sdk.capture.common.cryptography;

import android.util.Base64;
import com.onfido.android.sdk.capture.common.cryptography.Cryptography;
import com.onfido.android.sdk.capture.utils.ByteArrayExtensionsKt;
import com.onfido.api.client.data.PayloadIntegrity;
import com.onfido.api.client.data.SdkUploadMetaData;
import com.onfido.api.client.token.sdk.ApplicantId;
import java.io.File;
import jh.d;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.o0;
import kotlin.text.Charsets;
import kotlin.text.a0;
import kotlinx.serialization.json.Json;
import lim.m;
import okhttp3.RequestBody;
import okhttp3.c;
import org.jetbrains.annotations.NotNull;
import ulm.b1;
import ulm.p1;
import zhm.p;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u001f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u000e\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fJ\u000e\u0010\r\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fJ\u001e\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015J\u0016\u0010\u000e\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0016\u001a\u00020\u0017J\u001e\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015J\u0018\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0016\u001a\u00020\u0017H\u0002J\u0018\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u0016\u001a\u00020\u0017H\u0002R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001b"}, d2 = {"Lcom/onfido/android/sdk/capture/common/cryptography/PayloadHelper;", "", "cryptography", "Lcom/onfido/android/sdk/capture/common/cryptography/Cryptography;", "jsonParser", "Lkotlinx/serialization/json/Json;", "applicantId", "Lcom/onfido/api/client/token/sdk/ApplicantId;", "(Lcom/onfido/android/sdk/capture/common/cryptography/Cryptography;Lkotlinx/serialization/json/Json;Lcom/onfido/api/client/token/sdk/ApplicantId;)V", "getClientNoncePart", "Lokhttp3/RequestBody;", "payload", "Lcom/onfido/android/sdk/capture/common/cryptography/Cryptography$Result;", "getSignaturePart", "getSignedPayload", "Lcom/onfido/api/client/data/PayloadIntegrity;", "file", "Ljava/io/File;", "metadataJson", "Lcom/onfido/api/client/data/SdkUploadMetaData;", "isSigningEnabled", "", "metadata", "", "binaryCapture", "", "getUnsignedPayload", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class PayloadHelper {

    @NotNull
    private final ApplicantId applicantId;

    @NotNull
    private final Cryptography cryptography;

    @NotNull
    private final Json jsonParser;

    public PayloadHelper(@NotNull Cryptography cryptography, @NotNull Json jsonParser, @NotNull ApplicantId applicantId) {
        Intrinsics.checkNotNullParameter(cryptography, "cryptography");
        Intrinsics.checkNotNullParameter(jsonParser, "jsonParser");
        Intrinsics.checkNotNullParameter(applicantId, "applicantId");
        this.cryptography = cryptography;
        this.jsonParser = jsonParser;
        this.applicantId = applicantId;
    }

    private final byte[] getUnsignedPayload(File file, String metadata) {
        return getUnsignedPayload(m.d(file), metadata);
    }

    @NotNull
    public final RequestBody getClientNoncePart(@NotNull Cryptography.Result payload) {
        Intrinsics.checkNotNullParameter(payload, "payload");
        String strU = a0.u(payload.getClientNonce());
        p1 p1Var = RequestBody.Companion;
        b1 b1Var = c.f226117n;
        p1Var.getClass();
        return p1.b(strU, b1Var);
    }

    @NotNull
    public final RequestBody getSignaturePart(@NotNull Cryptography.Result payload) {
        Intrinsics.checkNotNullParameter(payload, "payload");
        byte[] bArrEncode = Base64.encode(payload.getSignature(), 2);
        p1 p1Var = RequestBody.Companion;
        Intrinsics.h(bArrEncode);
        return p1.d(p1Var, bArrEncode, c.f226117n, 0, 6);
    }

    @NotNull
    public final Cryptography.Result getSignedPayload(@NotNull File file, @NotNull String metadata) {
        Intrinsics.checkNotNullParameter(file, "file");
        Intrinsics.checkNotNullParameter(metadata, "metadata");
        return this.cryptography.sign(getUnsignedPayload(file, metadata), this.applicantId);
    }

    private final byte[] getUnsignedPayload(byte[] binaryCapture, String metadata) {
        byte[] bytes = metadata.getBytes(Charsets.UTF_8);
        Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
        return p.v(binaryCapture, bytes);
    }

    @NotNull
    public final PayloadIntegrity getSignedPayload(@NotNull File file, @NotNull SdkUploadMetaData metadataJson, boolean isSigningEnabled) {
        Intrinsics.checkNotNullParameter(file, "file");
        Intrinsics.checkNotNullParameter(metadataJson, "metadataJson");
        return getSignedPayload(m.d(file), metadataJson, isSigningEnabled);
    }

    @NotNull
    public final PayloadIntegrity getSignedPayload(@NotNull byte[] binaryCapture, @NotNull SdkUploadMetaData metadata, boolean isSigningEnabled) {
        Intrinsics.checkNotNullParameter(binaryCapture, "binaryCapture");
        Intrinsics.checkNotNullParameter(metadata, "metadata");
        if (!isSigningEnabled) {
            return PayloadIntegrity.INSTANCE.getEMPTY();
        }
        Json json = this.jsonParser;
        Cryptography.Result resultSign = this.cryptography.sign(getUnsignedPayload(binaryCapture, json.c(d.v(json.f187949b, o0.b(SdkUploadMetaData.class)), metadata)), this.applicantId);
        return new PayloadIntegrity(ByteArrayExtensionsKt.toBase64String(resultSign.getSignature()), a0.u(resultSign.getClientNonce()));
    }
}
