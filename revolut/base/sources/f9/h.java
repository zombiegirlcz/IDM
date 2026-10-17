package f9;

import j9.j;
import java.io.Writer;

/* JADX INFO: loaded from: classes16.dex */
public final class h extends Writer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j f132805a;

    public h(j9.a aVar) {
        this.f132805a = new j(aVar);
    }

    @Override // java.io.Writer, java.lang.Appendable
    public final /* bridge */ /* synthetic */ Appendable append(CharSequence charSequence) {
        append(charSequence);
        return this;
    }

    @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }

    @Override // java.io.Writer, java.io.Flushable
    public final void flush() {
    }

    @Override // java.io.Writer
    public final void write(char[] cArr) {
        this.f132805a.b(cArr, 0, cArr.length);
    }

    @Override // java.io.Writer, java.lang.Appendable
    public final /* bridge */ /* synthetic */ Appendable append(CharSequence charSequence, int i, int i2) {
        append(charSequence, i, i2);
        return this;
    }

    @Override // java.io.Writer
    public final void write(char[] cArr, int i, int i2) {
        this.f132805a.b(cArr, i, i2);
    }

    @Override // java.io.Writer, java.lang.Appendable
    public final Writer append(char c2) {
        write(c2);
        return this;
    }

    @Override // java.io.Writer
    public final void write(String str) {
        this.f132805a.a(0, str.length(), str);
    }

    @Override // java.io.Writer, java.lang.Appendable
    public final Appendable append(char c2) {
        write(c2);
        return this;
    }

    @Override // java.io.Writer
    public final void write(String str, int i, int i2) {
        this.f132805a.a(i, i2, str);
    }

    @Override // java.io.Writer, java.lang.Appendable
    public final Writer append(CharSequence charSequence) {
        String string = charSequence.toString();
        this.f132805a.a(0, string.length(), string);
        return this;
    }

    @Override // java.io.Writer
    public final void write(int i) {
        char c2 = (char) i;
        j jVar = this.f132805a;
        if (jVar.f172266b >= 0) {
            jVar.i(16);
        }
        jVar.f172269h = null;
        jVar.i = null;
        char[] cArr = jVar.f;
        if (jVar.f172268g >= cArr.length) {
            jVar.e();
            cArr = jVar.f;
        }
        int i2 = jVar.f172268g;
        jVar.f172268g = i2 + 1;
        cArr[i2] = c2;
    }

    @Override // java.io.Writer, java.lang.Appendable
    public final Writer append(CharSequence charSequence, int i, int i2) {
        String string = charSequence.subSequence(i, i2).toString();
        this.f132805a.a(0, string.length(), string);
        return this;
    }
}
