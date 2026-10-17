package xmm;

import java.io.Serializable;
import java.io.Writer;

/* JADX INFO: loaded from: classes14.dex */
public final class b extends Writer implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final StringBuilder f307288a = new StringBuilder();

    @Override // java.io.Writer, java.lang.Appendable
    public final Writer append(char c2) {
        this.f307288a.append(c2);
        return this;
    }

    @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }

    @Override // java.io.Writer, java.io.Flushable
    public final void flush() {
    }

    public final String toString() {
        return this.f307288a.toString();
    }

    @Override // java.io.Writer
    public final void write(char[] cArr, int i, int i2) {
        if (cArr != null) {
            this.f307288a.append(cArr, i, i2);
        }
    }

    @Override // java.io.Writer, java.lang.Appendable
    public final Appendable append(char c2) {
        this.f307288a.append(c2);
        return this;
    }

    @Override // java.io.Writer
    public final void write(String str) {
        if (str != null) {
            this.f307288a.append(str);
        }
    }

    @Override // java.io.Writer, java.lang.Appendable
    public final Writer append(CharSequence charSequence) {
        this.f307288a.append(charSequence);
        return this;
    }

    @Override // java.io.Writer, java.lang.Appendable
    public final Appendable append(CharSequence charSequence) {
        this.f307288a.append(charSequence);
        return this;
    }

    @Override // java.io.Writer, java.lang.Appendable
    public final Writer append(CharSequence charSequence, int i, int i2) {
        this.f307288a.append(charSequence, i, i2);
        return this;
    }

    @Override // java.io.Writer, java.lang.Appendable
    public final Appendable append(CharSequence charSequence, int i, int i2) {
        this.f307288a.append(charSequence, i, i2);
        return this;
    }
}
