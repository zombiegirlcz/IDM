package com.onfido.android.sdk.capture.ui.nfc;

import com.onfido.android.sdk.capture.internal.navigation.Screen;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001\u0082\u0001\u0006\u0002\u0003\u0004\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/onfido/android/sdk/capture/ui/nfc/NfcScreen;", "Lcom/onfido/android/sdk/capture/internal/navigation/Screen;", "Lcom/onfido/android/sdk/capture/ui/nfc/DocumentNotNfcCompatibleScreen;", "Lcom/onfido/android/sdk/capture/ui/nfc/NfcChipBlockedScreen;", "Lcom/onfido/android/sdk/capture/ui/nfc/NfcFailedScreen;", "Lcom/onfido/android/sdk/capture/ui/nfc/NfcPermissionsScreen;", "Lcom/onfido/android/sdk/capture/ui/nfc/NfcPinEntryScreen;", "Lcom/onfido/android/sdk/capture/ui/nfc/NfcScanScreen;", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public interface NfcScreen extends Screen {

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class DefaultImpls {
        @NotNull
        public static String screenKey(@NotNull NfcScreen nfcScreen) {
            return Screen.DefaultImpls.screenKey(nfcScreen);
        }
    }
}
