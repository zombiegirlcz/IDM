package com.onfido.android.sdk.capture.ui.camera.exception;

import com.onfido.android.sdk.capture.internal.util.annotation.InternalOnfidoApi;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
@InternalOnfidoApi
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00060\u0001j\u0002`\u0002B\u0007\b\u0002¢\u0006\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/onfido/android/sdk/capture/ui/camera/exception/TokenExpiredException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "()V", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class TokenExpiredException extends Exception {

    @NotNull
    public static final TokenExpiredException INSTANCE = new TokenExpiredException();

    private TokenExpiredException() {
        super("token expired");
    }
}
