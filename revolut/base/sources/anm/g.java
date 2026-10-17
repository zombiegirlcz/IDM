package anm;

import java.io.IOException;
import java.io.StringWriter;

/* JADX INFO: loaded from: classes14.dex */
public final class g extends c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f7833b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f7834c;

    public g(int i, int i2) {
        this.f7833b = i;
        this.f7834c = i2;
    }

    @Override // anm.c
    public final boolean b(int i, StringWriter stringWriter) throws IOException {
        if (i < this.f7833b || i > this.f7834c) {
            return false;
        }
        stringWriter.write("&#");
        stringWriter.write(Integer.toString(i, 10));
        stringWriter.write(59);
        return true;
    }
}
