package zb;

import java.io.Closeable;

/* JADX INFO: loaded from: classes.dex */
public abstract class t implements Closeable {
    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        ((gc.j) d()).close();
    }

    public abstract gc.d d();
}
