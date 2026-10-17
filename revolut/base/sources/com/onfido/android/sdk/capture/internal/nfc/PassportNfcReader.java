package com.onfido.android.sdk.capture.internal.nfc;

import android.nfc.Tag;
import com.onfido.android.sdk.capture.internal.analytics.inhouse.domain.NfcFlowType;
import com.onfido.android.sdk.capture.internal.nfc.data.PassportBACKey;
import com.onfido.android.sdk.capture.internal.util.annotation.InternalOnfidoApi;
import com.onfido.android.sdk.capture.nfc.MRTDDataGroup;
import io.reactivex.rxjava3.core.Observable;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
@InternalOnfidoApi
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J\u0083\u0001\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u00032\u0006\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\n2\u0006\u0010\u000b\u001a\u00020\u00062\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\b\u0010\u000f\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\b\b\u0002\u0010\u0015\u001a\u00020\u00122\b\b\u0002\u0010\u0016\u001a\u00020\u00122\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0018H&¢\u0006\u0002\u0010\u0019¨\u0006\u001a"}, d2 = {"Lcom/onfido/android/sdk/capture/internal/nfc/PassportNfcReader;", "", "readNfcTag", "Lio/reactivex/rxjava3/core/Observable;", "Lcom/onfido/android/sdk/capture/internal/nfc/PassportNfcExtractionState;", "nfcTagRetries", "Landroid/nfc/Tag;", "passportBACKey", "Lcom/onfido/android/sdk/capture/internal/nfc/data/PassportBACKey;", "aaChallenge", "", "tag", "fileIDs", "", "Lcom/onfido/android/sdk/capture/nfc/MRTDDataGroup;", "pinNumber", "", "isPaceEnabled", "", "nfcFlowType", "Lcom/onfido/android/sdk/capture/internal/analytics/inhouse/domain/NfcFlowType;", "chipAuthentication", "readRoId", "realtimeNfcEvents", "Lcom/onfido/android/sdk/capture/internal/nfc/RealtimeNfcEvents;", "(Lio/reactivex/rxjava3/core/Observable;Lcom/onfido/android/sdk/capture/internal/nfc/data/PassportBACKey;[BLandroid/nfc/Tag;[Lcom/onfido/android/sdk/capture/nfc/MRTDDataGroup;Ljava/lang/String;ZLcom/onfido/android/sdk/capture/internal/analytics/inhouse/domain/NfcFlowType;ZZLcom/onfido/android/sdk/capture/internal/nfc/RealtimeNfcEvents;)Lio/reactivex/rxjava3/core/Observable;", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public interface PassportNfcReader {

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class DefaultImpls {
        public static /* synthetic */ Observable readNfcTag$default(PassportNfcReader passportNfcReader, Observable observable, PassportBACKey passportBACKey, byte[] bArr, Tag tag2, MRTDDataGroup[] mRTDDataGroupArr, String str, boolean z, NfcFlowType nfcFlowType, boolean z3, boolean z4, RealtimeNfcEvents realtimeNfcEvents, int i, Object obj2) {
            if (obj2 != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: readNfcTag");
            }
            if ((i & 256) != 0) {
                z3 = false;
            }
            if ((i & 512) != 0) {
                z4 = false;
            }
            if ((i & 1024) != 0) {
                realtimeNfcEvents = null;
            }
            return passportNfcReader.readNfcTag(observable, passportBACKey, bArr, tag2, mRTDDataGroupArr, str, z, nfcFlowType, z3, z4, realtimeNfcEvents);
        }
    }

    @NotNull
    Observable readNfcTag(@NotNull Observable nfcTagRetries, @NotNull PassportBACKey passportBACKey, byte[] aaChallenge, @NotNull Tag tag2, @NotNull MRTDDataGroup[] fileIDs, String pinNumber, boolean isPaceEnabled, @NotNull NfcFlowType nfcFlowType, boolean chipAuthentication, boolean readRoId, RealtimeNfcEvents realtimeNfcEvents);
}
