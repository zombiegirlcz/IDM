package io.ktor.utils.io;

import java.io.IOException;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes23.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00060\u0001j\u0002`\u0002¨\u0006\u0003"}, d2 = {"Lio/ktor/utils/io/ClosedByteChannelException;", "Ljava/io/IOException;", "Lkotlinx/io/IOException;", "ktor-io"}, k = 1, mv = {2, 2, 0}, xi = 48)
public class ClosedByteChannelException extends IOException {
    public ClosedByteChannelException(Throwable th10) {
        super(th10 != null ? th10.getMessage() : null, th10);
    }
}
