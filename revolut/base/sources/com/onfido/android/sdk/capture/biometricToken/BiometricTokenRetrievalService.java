package com.onfido.android.sdk.capture.biometricToken;

import android.app.Service;
import android.content.Intent;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import com.onfido.android.sdk.capture.config.BiometricTokenCallback;
import com.onfido.android.sdk.capture.internal.util.annotation.InternalOnfidoApi;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
@InternalOnfidoApi
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \t2\u00020\u0001:\u0002\t\nB\u0005¢\u0006\u0002\u0010\u0002J\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/onfido/android/sdk/capture/biometricToken/BiometricTokenRetrievalService;", "Landroid/app/Service;", "()V", "messenger", "Landroid/os/Messenger;", "onBind", "Landroid/os/IBinder;", "intent", "Landroid/content/Intent;", "Companion", "TokenRequestHandler", "onfido-public-api_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class BiometricTokenRetrievalService extends Service {
    private static BiometricTokenCallback tokenRetrievalCallback;

    @NotNull
    private final Messenger messenger = new Messenger(new TokenRequestHandler());

    @NotNull
    public static final String KEY_EXTERNAL_BIOMETRIC_TOKEN = "external_biometric_token";

    @NotNull
    public static final String KEY_BIOMETRIC_CUSTOMER_USER_HASH = "biometric_customer_user_hash";

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @InternalOnfidoApi
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087T¢\u0006\b\n\u0000\u0012\u0004\b\u0005\u0010\u0002R\u0016\u0010\u0006\u001a\u00020\u00048\u0006X\u0087T¢\u0006\b\n\u0000\u0012\u0004\b\u0007\u0010\u0002R&\u0010\b\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b\n\u0010\u0002\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/onfido/android/sdk/capture/biometricToken/BiometricTokenRetrievalService$Companion;", "", "()V", "KEY_BIOMETRIC_CUSTOMER_USER_HASH", "", "getKEY_BIOMETRIC_CUSTOMER_USER_HASH$annotations", "KEY_EXTERNAL_BIOMETRIC_TOKEN", "getKEY_EXTERNAL_BIOMETRIC_TOKEN$annotations", "tokenRetrievalCallback", "Lcom/onfido/android/sdk/capture/config/BiometricTokenCallback;", "getTokenRetrievalCallback$annotations", "getTokenRetrievalCallback", "()Lcom/onfido/android/sdk/capture/config/BiometricTokenCallback;", "setTokenRetrievalCallback", "(Lcom/onfido/android/sdk/capture/config/BiometricTokenCallback;)V", "onfido-public-api_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @InternalOnfidoApi
        public static /* synthetic */ void getKEY_BIOMETRIC_CUSTOMER_USER_HASH$annotations() {
        }

        @InternalOnfidoApi
        public static /* synthetic */ void getKEY_EXTERNAL_BIOMETRIC_TOKEN$annotations() {
        }

        @InternalOnfidoApi
        public static /* synthetic */ void getTokenRetrievalCallback$annotations() {
        }

        public final BiometricTokenCallback getTokenRetrievalCallback() {
            return BiometricTokenRetrievalService.tokenRetrievalCallback;
        }

        public final void setTokenRetrievalCallback(BiometricTokenCallback biometricTokenCallback) {
            BiometricTokenRetrievalService.tokenRetrievalCallback = biometricTokenCallback;
        }

        private Companion() {
        }
    }

    @InternalOnfidoApi
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/onfido/android/sdk/capture/biometricToken/BiometricTokenRetrievalService$TokenRequestHandler;", "Landroid/os/Handler;", "()V", "tokenReceiver", "Landroid/os/Messenger;", "handleMessage", "", "tokenRequestMessage", "Landroid/os/Message;", "onfido-public-api_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class TokenRequestHandler extends Handler {
        private Messenger tokenReceiver;

        public TokenRequestHandler() {
            super(Looper.getMainLooper());
        }

        @Override // android.os.Handler
        public void handleMessage(@NotNull Message tokenRequestMessage) {
            BiometricTokenCallback tokenRetrievalCallback;
            Intrinsics.checkNotNullParameter(tokenRequestMessage, "tokenRequestMessage");
            super.handleMessage(tokenRequestMessage);
            Messenger replyTo = tokenRequestMessage.replyTo;
            Intrinsics.checkNotNullExpressionValue(replyTo, "replyTo");
            this.tokenReceiver = replyTo;
            String string = tokenRequestMessage.getData().getString("biometric_customer_user_hash");
            if (string == null || (tokenRetrievalCallback = BiometricTokenRetrievalService.INSTANCE.getTokenRetrievalCallback()) == null) {
                return;
            }
            tokenRetrievalCallback.onTokenRequested(string, new BiometricTokenRetrievalService$TokenRequestHandler$handleMessage$1$1(this));
        }
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        return this.messenger.getBinder();
    }
}
