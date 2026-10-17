package com.onfido.android.sdk.capture.token;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import cmc.d;
import com.onfido.android.sdk.capture.common.di.qualifier.ApplicationContext;
import com.onfido.android.sdk.capture.component.active.video.capture.data.repository.b;
import com.onfido.android.sdk.capture.errors.OnfidoException;
import com.onfido.android.sdk.capture.internal.token.OnfidoTokenProvider;
import com.onfido.api.client.exception.TokenExpiredException;
import igm.o;
import io.reactivex.rxjava3.core.Completable;
import io.reactivex.rxjava3.core.CompletableEmitter;
import io.reactivex.rxjava3.core.CompletableSource;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import ogm.a;
import ogm.e;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u0000 \u000b2\u00020\u0001:\u0001\u000bB\u0019\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0006\u0010\t\u001a\u00020\nR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/onfido/android/sdk/capture/token/TokenExpirationServiceConnector;", "", "tokenProvider", "Lcom/onfido/android/sdk/capture/internal/token/OnfidoTokenProvider;", "applicationContext", "Landroid/content/Context;", "(Lcom/onfido/android/sdk/capture/internal/token/OnfidoTokenProvider;Landroid/content/Context;)V", "tokenExpirationHandlerServiceConnection", "Landroid/content/ServiceConnection;", "connect", "Lio/reactivex/rxjava3/core/Completable;", "Companion", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class TokenExpirationServiceConnector {

    @NotNull
    private static final Companion Companion = new Companion(null);
    private static final long TOKEN_EXPIRE_TIMEOUT_IN_SECONDS = 10;

    @NotNull
    private final Context applicationContext;
    private ServiceConnection tokenExpirationHandlerServiceConnection;

    @NotNull
    private final OnfidoTokenProvider tokenProvider;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/onfido/android/sdk/capture/token/TokenExpirationServiceConnector$Companion;", "", "()V", "TOKEN_EXPIRE_TIMEOUT_IN_SECONDS", "", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public TokenExpirationServiceConnector(@NotNull OnfidoTokenProvider tokenProvider, @ApplicationContext @NotNull Context applicationContext) {
        Intrinsics.checkNotNullParameter(tokenProvider, "tokenProvider");
        Intrinsics.checkNotNullParameter(applicationContext, "applicationContext");
        this.tokenProvider = tokenProvider;
        this.applicationContext = applicationContext;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void connect$lambda$0(final TokenExpirationServiceConnector this$0, final CompletableEmitter emitter) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(emitter, "emitter");
        final Looper mainLooper = Looper.getMainLooper();
        Handler handler = new Handler(mainLooper) { // from class: com.onfido.android.sdk.capture.token.TokenExpirationServiceConnector$connect$1$handler$1
            @Override // android.os.Handler
            public void handleMessage(@NotNull Message msg) throws OnfidoException {
                Intrinsics.checkNotNullParameter(msg, "msg");
                String string = msg.getData().getString("token");
                if (string == null) {
                    emitter.onError(new TokenExpiredException());
                } else {
                    this.this$0.tokenProvider.updateToken$onfido_capture_sdk_core_release(string);
                    emitter.onComplete();
                }
            }
        };
        Intent intent = new Intent(this$0.applicationContext, (Class<?>) TokenExpirationHandlerService.class);
        final Messenger messenger = new Messenger(handler);
        ServiceConnection serviceConnection = new ServiceConnection() { // from class: com.onfido.android.sdk.capture.token.TokenExpirationServiceConnector$connect$1$1
            @Override // android.content.ServiceConnection
            public void onServiceConnected(ComponentName name, IBinder service) throws RemoteException {
                Messenger messenger2 = new Messenger(service);
                Message message = new Message();
                message.replyTo = messenger;
                messenger2.send(message);
            }

            @Override // android.content.ServiceConnection
            public void onServiceDisconnected(ComponentName name) {
            }
        };
        this$0.tokenExpirationHandlerServiceConnection = serviceConnection;
        this$0.applicationContext.bindService(intent, serviceConnection, 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void connect$lambda$1(TokenExpirationServiceConnector this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Context context = this$0.applicationContext;
        ServiceConnection serviceConnection = this$0.tokenExpirationHandlerServiceConnection;
        if (serviceConnection != null) {
            context.unbindService(serviceConnection);
        } else {
            Intrinsics.r("tokenExpirationHandlerServiceConnection");
            throw null;
        }
    }

    @NotNull
    public final Completable connect() {
        e eVar = new e(new d(this, 22), 0);
        TimeUnit timeUnit = TimeUnit.SECONDS;
        vgm.e eVar2 = ehm.e.f126319b;
        Objects.requireNonNull(timeUnit, "unit is null");
        Objects.requireNonNull(eVar2, "scheduler is null");
        a aVar = new a(eVar, eVar2);
        o oVar = new o() { // from class: com.onfido.android.sdk.capture.token.TokenExpirationServiceConnector.connect.2
            @Override // igm.o
            @NotNull
            public final CompletableSource apply(@NotNull Throwable it8) {
                Intrinsics.checkNotNullParameter(it8, "it");
                return new e(new TokenExpiredException(), 1);
            }
        };
        Objects.requireNonNull(oVar, "fallbackSupplier is null");
        a aVar2 = new a(new a(aVar, oVar, 3), new b(this, 6), 1);
        Intrinsics.checkNotNullExpressionValue(aVar2, "doFinally(...)");
        return aVar2;
    }
}
