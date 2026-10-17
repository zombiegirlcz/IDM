package com.onfido.android.sdk.capture.token;

import android.app.Service;
import android.content.Intent;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import com.onfido.android.sdk.capture.internal.util.annotation.InternalOnfidoApi;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
@InternalOnfidoApi
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \t2\u00020\u0001:\u0002\t\nB\u0005¢\u0006\u0002\u0010\u0002J\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/onfido/android/sdk/capture/token/TokenExpirationHandlerService;", "Landroid/app/Service;", "()V", "messenger", "Landroid/os/Messenger;", "onBind", "Landroid/os/IBinder;", "intent", "Landroid/content/Intent;", "Companion", "IncomingHandler", "onfido-public-api_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class TokenExpirationHandlerService extends Service {
    private static TokenExpirationHandler tokenExpirationHandler;

    @NotNull
    private final Messenger messenger = new Messenger(new IncomingHandler());

    @NotNull
    public static final String TOKEN_KEY = "token";

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087T¢\u0006\b\n\u0000\u0012\u0004\b\u0005\u0010\u0002R&\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b\b\u0010\u0002\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/onfido/android/sdk/capture/token/TokenExpirationHandlerService$Companion;", "", "()V", "TOKEN_KEY", "", "getTOKEN_KEY$annotations", "tokenExpirationHandler", "Lcom/onfido/android/sdk/capture/token/TokenExpirationHandler;", "getTokenExpirationHandler$annotations", "getTokenExpirationHandler", "()Lcom/onfido/android/sdk/capture/token/TokenExpirationHandler;", "setTokenExpirationHandler", "(Lcom/onfido/android/sdk/capture/token/TokenExpirationHandler;)V", "onfido-public-api_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @InternalOnfidoApi
        public static /* synthetic */ void getTOKEN_KEY$annotations() {
        }

        @InternalOnfidoApi
        public static /* synthetic */ void getTokenExpirationHandler$annotations() {
        }

        public final TokenExpirationHandler getTokenExpirationHandler() {
            return TokenExpirationHandlerService.tokenExpirationHandler;
        }

        public final void setTokenExpirationHandler(TokenExpirationHandler tokenExpirationHandler) {
            TokenExpirationHandlerService.tokenExpirationHandler = tokenExpirationHandler;
        }

        private Companion() {
        }
    }

    @InternalOnfidoApi
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/onfido/android/sdk/capture/token/TokenExpirationHandlerService$IncomingHandler;", "Landroid/os/Handler;", "()V", "tokenRecevier", "Landroid/os/Messenger;", "handleMessage", "", "msg", "Landroid/os/Message;", "onfido-public-api_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class IncomingHandler extends Handler {
        private Messenger tokenRecevier;

        public IncomingHandler() {
            super(Looper.getMainLooper());
        }

        @Override // android.os.Handler
        public void handleMessage(@NotNull Message msg) {
            Intrinsics.checkNotNullParameter(msg, "msg");
            super.handleMessage(msg);
            Messenger replyTo = msg.replyTo;
            Intrinsics.checkNotNullExpressionValue(replyTo, "replyTo");
            this.tokenRecevier = replyTo;
            TokenExpirationHandler tokenExpirationHandler = TokenExpirationHandlerService.INSTANCE.getTokenExpirationHandler();
            if (tokenExpirationHandler != null) {
                tokenExpirationHandler.refreshToken(new TokenExpirationHandlerService$IncomingHandler$handleMessage$1(this));
            }
        }
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        return this.messenger.getBinder();
    }
}
