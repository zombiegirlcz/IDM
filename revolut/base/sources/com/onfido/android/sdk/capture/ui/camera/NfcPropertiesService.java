package com.onfido.android.sdk.capture.ui.camera;

import com.onfido.android.sdk.capture.detector.mrzextraction.MRZDocument;
import com.onfido.android.sdk.capture.network.OnfidoApiService;
import com.onfido.android.sdk.capture.ui.nfc.model.NfcProperties;
import com.onfido.api.client.data.DocumentFeatures;
import igm.o;
import io.reactivex.rxjava3.core.Single;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import tgm.g;
import zhm.d0;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\u0010\u0015\n\u0000\b\u0010\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J0\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\b\u0010\u000b\u001a\u0004\u0018\u00010\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0016J\f\u0010\u000f\u001a\u00020\u0010*\u00020\u0011H\u0012R\u000e\u0010\u0002\u001a\u00020\u0003X\u0092\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lcom/onfido/android/sdk/capture/ui/camera/NfcPropertiesService;", "", "apiService", "Lcom/onfido/android/sdk/capture/network/OnfidoApiService;", "(Lcom/onfido/android/sdk/capture/network/OnfidoApiService;)V", "get", "Lio/reactivex/rxjava3/core/Single;", "Lcom/onfido/android/sdk/capture/ui/nfc/model/NfcProperties;", "documentId", "", "", "mrzDocument", "Lcom/onfido/android/sdk/capture/detector/mrzextraction/MRZDocument;", ib.b.Features, "Lcom/onfido/api/client/data/DocumentFeatures;", "toByteArray", "", "", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public class NfcPropertiesService {

    @NotNull
    private final OnfidoApiService apiService;

    public NfcPropertiesService(@NotNull OnfidoApiService apiService) {
        Intrinsics.checkNotNullParameter(apiService, "apiService");
        this.apiService = apiService;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final NfcProperties get$lambda$0(Throwable it8) {
        Intrinsics.checkNotNullParameter(it8, "it");
        return new NfcProperties(false, "", new byte[0], "", false, false, 0, 0, it8.getMessage() + " - Cause: " + it8.getCause(), 160, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public byte[] toByteArray(int[] iArr) {
        ArrayList arrayList = new ArrayList(iArr.length);
        for (int i : iArr) {
            arrayList.add(Byte.valueOf((byte) i));
        }
        return d0.Y0(arrayList);
    }

    @NotNull
    public Single<NfcProperties> get(@NotNull List<String> documentId, MRZDocument mrzDocument, final DocumentFeatures features) {
        Intrinsics.checkNotNullParameter(documentId, "documentId");
        g gVar = new g(this.apiService.getNfcProperties$onfido_capture_sdk_core_release(documentId, mrzDocument).g(new o() { // from class: com.onfido.android.sdk.capture.ui.camera.NfcPropertiesService.get.1
            @Override // igm.o
            @NotNull
            public final NfcProperties apply(@NotNull com.onfido.api.client.data.NfcProperties propertiesDto) {
                byte[] byteArray;
                Intrinsics.checkNotNullParameter(propertiesDto, "propertiesDto");
                boolean zIsNfcSupported = propertiesDto.isNfcSupported();
                String nfcKey = propertiesDto.getNfcKey();
                if (nfcKey == null) {
                    nfcKey = "";
                }
                int[] aaChallenge = propertiesDto.getAaChallenge();
                if (aaChallenge == null || (byteArray = NfcPropertiesService.this.toByteArray(aaChallenge)) == null) {
                    byteArray = new byte[0];
                }
                String can = propertiesDto.getCan();
                String str = can != null ? can : "";
                DocumentFeatures documentFeatures = features;
                boolean hasCan = documentFeatures != null ? documentFeatures.getHasCan() : false;
                DocumentFeatures documentFeatures2 = features;
                boolean hasPin = documentFeatures2 != null ? documentFeatures2.getHasPin() : false;
                DocumentFeatures documentFeatures3 = features;
                int canLength = documentFeatures3 != null ? documentFeatures3.getCanLength() : 0;
                DocumentFeatures documentFeatures4 = features;
                return new NfcProperties(zIsNfcSupported, nfcKey, byteArray, str, hasCan, hasPin, canLength, documentFeatures4 != null ? documentFeatures4.getPinLength() : 0, null, 256, null);
            }
        }), new cie.b(20), 2);
        Intrinsics.checkNotNullExpressionValue(gVar, "onErrorReturn(...)");
        return gVar;
    }
}
