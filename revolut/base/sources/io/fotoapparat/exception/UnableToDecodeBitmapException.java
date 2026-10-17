package io.fotoapparat.exception;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lio/fotoapparat/exception/UnableToDecodeBitmapException;", "Lio/fotoapparat/exception/RecoverableRuntimeException;", "()V", "fotoapparat_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class UnableToDecodeBitmapException extends RecoverableRuntimeException {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UnableToDecodeBitmapException() {
        super("Unable to decode bitmap");
        Intrinsics.checkNotNullParameter("Unable to decode bitmap", "message");
    }
}
