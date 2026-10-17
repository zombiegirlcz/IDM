package ulm;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.nio.charset.Charset;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes13.dex */
public final class q1 extends Reader {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final mmm.k f281124a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Charset f281125b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f281126c;
    public InputStreamReader d;

    public q1(mmm.k source, Charset charset) {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(charset, "charset");
        this.f281124a = source;
        this.f281125b = charset;
    }

    @Override // java.io.Reader, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f281126c = true;
        InputStreamReader inputStreamReader = this.d;
        if (inputStreamReader != null) {
            inputStreamReader.close();
        } else {
            this.f281124a.close();
        }
    }

    @Override // java.io.Reader
    public final int read(char[] cbuf, int i, int i2) throws IOException {
        Intrinsics.checkNotNullParameter(cbuf, "cbuf");
        if (this.f281126c) {
            throw new IOException("Stream closed");
        }
        InputStreamReader inputStreamReader = this.d;
        if (inputStreamReader == null) {
            mmm.k kVar = this.f281124a;
            inputStreamReader = new InputStreamReader(kVar.Z9(), vlm.j.k(kVar, this.f281125b));
            this.d = inputStreamReader;
        }
        return inputStreamReader.read(cbuf, i, i2);
    }
}
