package yj0;

import java.io.IOException;
import java.security.GeneralSecurityException;
import kotlin.jvm.internal.Intrinsics;
import mmm.v;

/* JADX INFO: loaded from: classes.dex */
public final class b extends v {
    @Override // mmm.v, mmm.s0
    public final long read(mmm.h sink, long j2) throws IOException {
        Intrinsics.checkNotNullParameter(sink, "sink");
        try {
            return super.read(sink, j2);
        } catch (GeneralSecurityException e) {
            throw new IOException("Error reading from encrypted cache", e);
        }
    }
}
