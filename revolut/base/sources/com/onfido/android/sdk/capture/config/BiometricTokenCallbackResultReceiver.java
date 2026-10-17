package com.onfido.android.sdk.capture.config;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.ResultReceiver;
import com.onfido.android.sdk.capture.internal.util.annotation.InternalOnfidoApi;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
@InternalOnfidoApi
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \r2\u00020\u0001:\u0001\rB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u001a\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0014R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000e"}, d2 = {"Lcom/onfido/android/sdk/capture/config/BiometricTokenCallbackResultReceiver;", "Landroid/os/ResultReceiver;", "biometricCallback", "Lcom/onfido/android/sdk/capture/config/BiometricTokenCallback;", "(Lcom/onfido/android/sdk/capture/config/BiometricTokenCallback;)V", "getBiometricCallback", "()Lcom/onfido/android/sdk/capture/config/BiometricTokenCallback;", "onReceiveResult", "", "resultCode", "", "resultData", "Landroid/os/Bundle;", "Companion", "onfido-public-api_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class BiometricTokenCallbackResultReceiver extends ResultReceiver {

    @NotNull
    private final BiometricTokenCallback biometricCallback;

    @NotNull
    public static final String KEY_BIOMETRIC_CUSTOMER_USER_HASH = "biometric_customer_user_hash";

    @NotNull
    public static final String KEY_BIOMETRIC_TOKEN = "biometric_token";

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @InternalOnfidoApi
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087T¢\u0006\b\n\u0000\u0012\u0004\b\u0005\u0010\u0002R\u0016\u0010\u0006\u001a\u00020\u00048\u0006X\u0087T¢\u0006\b\n\u0000\u0012\u0004\b\u0007\u0010\u0002¨\u0006\b"}, d2 = {"Lcom/onfido/android/sdk/capture/config/BiometricTokenCallbackResultReceiver$Companion;", "", "()V", "KEY_BIOMETRIC_CUSTOMER_USER_HASH", "", "getKEY_BIOMETRIC_CUSTOMER_USER_HASH$annotations", "KEY_BIOMETRIC_TOKEN", "getKEY_BIOMETRIC_TOKEN$annotations", "onfido-public-api_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @InternalOnfidoApi
        public static /* synthetic */ void getKEY_BIOMETRIC_CUSTOMER_USER_HASH$annotations() {
        }

        @InternalOnfidoApi
        public static /* synthetic */ void getKEY_BIOMETRIC_TOKEN$annotations() {
        }

        private Companion() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BiometricTokenCallbackResultReceiver(@NotNull BiometricTokenCallback biometricCallback) {
        super(new Handler(Looper.getMainLooper()));
        Intrinsics.checkNotNullParameter(biometricCallback, "biometricCallback");
        this.biometricCallback = biometricCallback;
    }

    @NotNull
    public final BiometricTokenCallback getBiometricCallback() {
        return this.biometricCallback;
    }

    @Override // android.os.ResultReceiver
    public void onReceiveResult(int resultCode, Bundle resultData) {
        super.onReceiveResult(resultCode, resultData);
        if (resultData != null) {
            String string = resultData.getString("biometric_token");
            String string2 = resultData.getString("biometric_customer_user_hash");
            if (string == null || string2 == null) {
                return;
            }
            this.biometricCallback.onTokenGenerated(string2, string);
        }
    }
}
