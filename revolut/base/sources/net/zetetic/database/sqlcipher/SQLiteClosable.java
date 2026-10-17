package net.zetetic.database.sqlcipher;

import java.io.Closeable;

/* JADX INFO: loaded from: classes14.dex */
public abstract class SQLiteClosable implements Closeable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f214677a = 1;

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        g();
    }

    public final void d() {
        synchronized (this) {
            try {
                int i = this.f214677a;
                if (i <= 0) {
                    throw new IllegalStateException("attempt to re-open an already-closed object: " + this);
                }
                this.f214677a = i + 1;
            } catch (Throwable th10) {
                throw th10;
            }
        }
    }

    public abstract void f();

    public final void g() {
        boolean z;
        synchronized (this) {
            z = true;
            int i = this.f214677a - 1;
            this.f214677a = i;
            if (i != 0) {
                z = false;
            }
        }
        if (z) {
            f();
        }
    }
}
