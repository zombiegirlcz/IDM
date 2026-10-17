package mmm;

import java.io.Closeable;
import java.io.Flushable;

/* JADX INFO: loaded from: classes13.dex */
public interface q0 extends Closeable, Flushable {
    @Override // java.io.Closeable, java.lang.AutoCloseable
    void close();

    void flush();

    v0 timeout();

    void write(h hVar, long j2);
}
