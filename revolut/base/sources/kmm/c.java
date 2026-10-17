package kmm;

import java.io.Closeable;
import java.io.IOException;
import java.util.zip.Inflater;
import mmm.a0;

/* JADX INFO: loaded from: classes14.dex */
public final class c implements Closeable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f185911a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final mmm.h f185912b = new mmm.h();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Inflater f185913c;
    public a0 d;

    public c(boolean z) {
        this.f185911a = z;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        a0 a0Var = this.d;
        if (a0Var != null) {
            a0Var.close();
        }
        this.d = null;
        this.f185913c = null;
    }
}
