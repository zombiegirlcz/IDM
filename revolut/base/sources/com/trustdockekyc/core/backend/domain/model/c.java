package com.trustdockekyc.core.backend.domain.model;

import com.trustdockekyc.core.backend.domain.model.AppError;
import java.io.IOException;
import java.net.ConnectException;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public abstract class c {
    public static final AppError a(Exception exc2) throws Exception {
        Intrinsics.checkNotNullParameter(exc2, "<this>");
        if (exc2 instanceof AppError) {
            return (AppError) exc2;
        }
        if (exc2 instanceof CancellationException) {
            throw exc2;
        }
        w1m.c cVar = new w1m.c(29, null, null, exc2);
        if (exc2 instanceof IllegalArgumentException) {
            return new AppError.IllegalArgumentError(cVar);
        }
        if (exc2 instanceof IllegalStateException) {
            return new AppError.IllegalStateError(cVar);
        }
        if (exc2 instanceof SocketTimeoutException) {
            return new AppError.TimeoutError(cVar);
        }
        return exc2 instanceof UnknownHostException ? true : exc2 instanceof ConnectException ? new AppError.NetworkConnectionFailedError(cVar) : exc2 instanceof IOException ? new AppError.IoError(cVar) : new AppError.UnknownError(cVar);
    }
}
