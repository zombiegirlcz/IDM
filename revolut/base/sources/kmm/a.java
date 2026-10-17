package kmm;

import java.io.Closeable;
import java.util.zip.Deflater;

/* JADX INFO: loaded from: classes14.dex */
public final class a implements Closeable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f185907a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final mmm.h f185908b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Deflater f185909c;
    public final amm.h d;

    public a(boolean z) {
        this.f185907a = z;
        mmm.h hVar = new mmm.h();
        this.f185908b = hVar;
        Deflater deflater = new Deflater(-1, true);
        this.f185909c = deflater;
        this.d = new amm.h(hVar, deflater);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws Throwable {
        this.d.close();
    }
}
