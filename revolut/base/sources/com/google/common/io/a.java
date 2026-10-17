package com.google.common.io;

import com.google.common.io.Closer;
import java.io.Closeable;

/* JADX INFO: loaded from: classes17.dex */
public final /* synthetic */ class a implements Closer.Suppressor {
    @Override // com.google.common.io.Closer.Suppressor
    public final void suppress(Closeable closeable, Throwable th10, Throwable th11) {
        Closer.lambda$static$0(closeable, th10, th11);
    }
}
