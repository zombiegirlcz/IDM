package com.onfido.android.sdk.capture.internal.usecase;

import android.os.ResultReceiver;
import androidx.core.os.BundleKt;
import ch.qos.logback.core.CoreConstants;
import com.onfido.android.sdk.capture.DocumentType;
import com.onfido.android.sdk.capture.common.di.qualifier.MediaCallbackResultReceiver;
import com.onfido.android.sdk.capture.internal.util.SchedulersProvider;
import com.onfido.android.sdk.capture.internal.util.annotation.InternalOnfidoApi;
import com.onfido.android.sdk.capture.internal.util.logging.Timber;
import com.onfido.android.sdk.capture.ui.CaptureType;
import com.onfido.android.sdk.capture.utils.CountryCode;
import com.onfido.android.sdk.capture.utils.ResultReceiverExtensionsKt;
import com.onfido.android.sdk.capture.utils.TimeProvider;
import com.onfido.api.client.data.DocSide;
import io.reactivex.rxjava3.core.Scheduler;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
@InternalOnfidoApi
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \u00162\u00020\u0001:\u0001\u0016B#\b\u0007\u0012\n\b\u0001\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJA\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0000¢\u0006\u0002\b\u0015R\u0010\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0017"}, d2 = {"Lcom/onfido/android/sdk/capture/internal/usecase/MediaCallbacksUseCase;", "", "mediaCallback", "Landroid/os/ResultReceiver;", "schedulersProvider", "Lcom/onfido/android/sdk/capture/internal/util/SchedulersProvider;", "timeProvider", "Lcom/onfido/android/sdk/capture/utils/TimeProvider;", "(Landroid/os/ResultReceiver;Lcom/onfido/android/sdk/capture/internal/util/SchedulersProvider;Lcom/onfido/android/sdk/capture/utils/TimeProvider;)V", "callMediaCallbackForPhotoCapture", "", "captureType", "Lcom/onfido/android/sdk/capture/ui/CaptureType;", "imageData", "", "documentType", "Lcom/onfido/android/sdk/capture/DocumentType;", "documentSide", "Lcom/onfido/api/client/data/DocSide;", "issueCountry", "Lcom/onfido/android/sdk/capture/utils/CountryCode;", "callMediaCallbackForPhotoCapture$onfido_capture_sdk_core_release", "Companion", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class MediaCallbacksUseCase {
    private final ResultReceiver mediaCallback;

    @NotNull
    private final SchedulersProvider schedulersProvider;

    @NotNull
    private final TimeProvider timeProvider;

    @NotNull
    private static final String SELFIE_PREFIX = "onfido-selfie";

    @NotNull
    private static final String JPEG_EXTENSION = "jpeg";

    @NotNull
    private static final String DOCUMENT_PREFIX = "onfido-document";

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[CaptureType.values().length];
            try {
                iArr[CaptureType.DOCUMENT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CaptureType.FACE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public MediaCallbacksUseCase(@MediaCallbackResultReceiver ResultReceiver resultReceiver, @NotNull SchedulersProvider schedulersProvider, @NotNull TimeProvider timeProvider) {
        Intrinsics.checkNotNullParameter(schedulersProvider, "schedulersProvider");
        Intrinsics.checkNotNullParameter(timeProvider, "timeProvider");
        this.mediaCallback = resultReceiver;
        this.schedulersProvider = schedulersProvider;
        this.timeProvider = timeProvider;
    }

    public static /* synthetic */ void callMediaCallbackForPhotoCapture$onfido_capture_sdk_core_release$default(MediaCallbacksUseCase mediaCallbacksUseCase, CaptureType captureType, byte[] bArr, DocumentType documentType, DocSide docSide, CountryCode countryCode, int i, Object obj2) {
        if ((i & 4) != 0) {
            documentType = null;
        }
        if ((i & 8) != 0) {
            docSide = DocSide.FRONT;
        }
        if ((i & 16) != 0) {
            countryCode = null;
        }
        mediaCallbacksUseCase.callMediaCallbackForPhotoCapture$onfido_capture_sdk_core_release(captureType, bArr, documentType, docSide, countryCode);
    }

    public final void callMediaCallbackForPhotoCapture$onfido_capture_sdk_core_release(@NotNull CaptureType captureType, @NotNull byte[] imageData, DocumentType documentType, DocSide documentSide, CountryCode issueCountry) {
        Intrinsics.checkNotNullParameter(captureType, "captureType");
        Intrinsics.checkNotNullParameter(imageData, "imageData");
        int i = WhenMappings.$EnumSwitchMapping$0[captureType.ordinal()];
        String str = i != 1 ? i != 2 ? "" : "onfido-selfie" : "onfido-document";
        String str2 = str + CoreConstants.DASH_CHAR + this.timeProvider.getCurrentTimestamp() + ".jpeg";
        ResultReceiver resultReceiver = this.mediaCallback;
        if (resultReceiver != null) {
            Scheduler io2 = this.schedulersProvider.getIo();
            Pair pair = new Pair("isDocument", captureType);
            Pair pair2 = new Pair("file_name", str2);
            Pair pair3 = new Pair("file_type", "jpeg");
            String alpha3 = issueCountry != null ? issueCountry.getAlpha3() : null;
            if (alpha3 == null) {
                alpha3 = "";
            }
            Pair pair4 = new Pair("country", alpha3);
            String strName = documentType != null ? documentType.name() : null;
            if (strName == null) {
                strName = "";
            }
            Pair pair5 = new Pair("doc_type", strName);
            String strName2 = documentSide != null ? documentSide.name() : null;
            if (ResultReceiverExtensionsKt.sendMedia(resultReceiver, imageData, io2, BundleKt.bundleOf(pair, pair2, pair3, pair4, pair5, new Pair("doc_side", strName2 != null ? strName2 : ""))) != null) {
                return;
            }
        }
        Timber.INSTANCE.d("No media callback provided", new Object[0]);
        Unit unit = Unit.f186387a;
    }
}
