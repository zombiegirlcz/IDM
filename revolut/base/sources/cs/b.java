package cs;

import com.google.protobuf.w0;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.biometric_verification.api.models.BiometricVerificationDocument;
import com.revolut.camerakit.client.api.models.CameraCaptureSettings;
import com.revolut.camerakit.core.settings.VideoEncodingBitRate;
import com.revolut.tracking.v3.CameraCaptureContext;
import com.revolut.tracking.v3.VisionDocumentSelectionContext;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import zhm.d0;
import zhm.w;

/* JADX INFO: loaded from: classes17.dex */
public abstract class b {
    public static final CameraCaptureContext.a a(CameraCaptureContext.a aVar, CameraCaptureSettings cameraCaptureSettings) {
        Integer numValueOf;
        if (cameraCaptureSettings instanceof CameraCaptureSettings.Compound) {
            CameraCaptureSettings.Video video = ((CameraCaptureSettings.Compound) cameraCaptureSettings).f50695b;
            VideoEncodingBitRate videoEncodingBitRate = video.f50703c;
            VideoEncodingBitRate.Custom custom = videoEncodingBitRate instanceof VideoEncodingBitRate.Custom ? (VideoEncodingBitRate.Custom) videoEncodingBitRate : null;
            numValueOf = custom != null ? Integer.valueOf(custom.f50740a) : null;
            if (numValueOf != null) {
                int iIntValue = numValueOf.intValue();
                aVar.c();
                ((CameraCaptureContext) aVar.f49761b).setVideoEncodingBitRate(iIntValue);
            }
            aVar.c();
            ((CameraCaptureContext) aVar.f49761b).setCapturePhoto(true);
            aVar.c();
            ((CameraCaptureContext) aVar.f49761b).setCaptureVideo(true);
            boolean z = video.d;
            aVar.c();
            ((CameraCaptureContext) aVar.f49761b).setCaptureAudio(z);
            return aVar;
        }
        if (cameraCaptureSettings instanceof CameraCaptureSettings.Photo) {
            aVar.c();
            ((CameraCaptureContext) aVar.f49761b).setCapturePhoto(true);
            aVar.c();
            ((CameraCaptureContext) aVar.f49761b).setCaptureVideo(false);
            aVar.c();
            ((CameraCaptureContext) aVar.f49761b).setCaptureAudio(false);
            return aVar;
        }
        if (!(cameraCaptureSettings instanceof CameraCaptureSettings.Video)) {
            if (!Intrinsics.f(cameraCaptureSettings, CameraCaptureSettings.CompactSelfie.f50693a) && !Intrinsics.f(cameraCaptureSettings, CameraCaptureSettings.FaceEmbedding.f50696a)) {
                throw new NoWhenBranchMatchedException();
            }
            aVar.c();
            ((CameraCaptureContext) aVar.f49761b).setCapturePhoto(true);
            aVar.c();
            ((CameraCaptureContext) aVar.f49761b).setCaptureVideo(false);
            aVar.c();
            ((CameraCaptureContext) aVar.f49761b).setCaptureAudio(false);
            return aVar;
        }
        CameraCaptureSettings.Video video2 = (CameraCaptureSettings.Video) cameraCaptureSettings;
        VideoEncodingBitRate videoEncodingBitRate2 = video2.f50703c;
        VideoEncodingBitRate.Custom custom2 = videoEncodingBitRate2 instanceof VideoEncodingBitRate.Custom ? (VideoEncodingBitRate.Custom) videoEncodingBitRate2 : null;
        numValueOf = custom2 != null ? Integer.valueOf(custom2.f50740a) : null;
        if (numValueOf != null) {
            int iIntValue2 = numValueOf.intValue();
            aVar.c();
            ((CameraCaptureContext) aVar.f49761b).setVideoEncodingBitRate(iIntValue2);
        }
        aVar.c();
        ((CameraCaptureContext) aVar.f49761b).setCapturePhoto(false);
        aVar.c();
        ((CameraCaptureContext) aVar.f49761b).setCaptureVideo(true);
        boolean z3 = video2.d;
        aVar.c();
        ((CameraCaptureContext) aVar.f49761b).setCaptureAudio(z3);
        return aVar;
    }

    public static final w0 b(ArrayList documents) throws IOException {
        Intrinsics.checkNotNullParameter(documents, "documents");
        VisionDocumentSelectionContext.a aVarNewBuilder = VisionDocumentSelectionContext.newBuilder();
        String strK0 = d0.k0(documents, ",", null, null, 0, new a(0), 30);
        aVarNewBuilder.c();
        ((VisionDocumentSelectionContext) aVarNewBuilder.f49761b).setAvailableDocuments(strK0);
        ArrayList arrayList = new ArrayList(w.t(documents, 10));
        Iterator it8 = documents.iterator();
        while (it8.hasNext()) {
            arrayList.add(((BiometricVerificationDocument) it8.next()).f50376b.f297794a);
        }
        String strK02 = d0.k0(d0.U(arrayList), ",", null, null, 0, null, 62);
        aVarNewBuilder.c();
        ((VisionDocumentSelectionContext) aVarNewBuilder.f49761b).setAvailableCountries(strK02);
        VisionDocumentSelectionContext visionDocumentSelectionContext = (VisionDocumentSelectionContext) aVarNewBuilder.a();
        AnalyticsContext.INSTANCE.getClass();
        return AnalyticsContext.Companion.a(visionDocumentSelectionContext);
    }
}
