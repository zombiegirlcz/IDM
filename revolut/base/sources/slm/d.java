package slm;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes14.dex */
public final class d implements CharSequence {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final char[] f264245a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f264246b;

    public d(char[] buffer) {
        Intrinsics.checkNotNullParameter(buffer, "buffer");
        this.f264245a = buffer;
        this.f264246b = buffer.length;
    }

    @Override // java.lang.CharSequence
    public final char charAt(int i) {
        return this.f264245a[i];
    }

    @Override // java.lang.CharSequence
    public final int length() {
        return this.f264246b;
    }

    @Override // java.lang.CharSequence
    public final CharSequence subSequence(int i, int i2) {
        return kotlin.text.a0.s(this.f264245a, i, Math.min(i2, this.f264246b));
    }

    @Override // java.lang.CharSequence
    public final String toString() {
        int i = this.f264246b;
        return kotlin.text.a0.s(this.f264245a, 0, Math.min(i, i));
    }
}
