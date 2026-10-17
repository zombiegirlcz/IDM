package kotlin.text;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes14.dex */
public final class l implements Iterator, pim.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CharSequence f187913a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f187914b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f187915c;
    public int d;
    public int e;

    public l(CharSequence string) {
        Intrinsics.checkNotNullParameter(string, "string");
        this.f187913a = string;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i;
        int i2;
        int i3 = this.f187914b;
        if (i3 != 0) {
            return i3 == 1;
        }
        if (this.e < 0) {
            this.f187914b = 2;
            return false;
        }
        CharSequence charSequence = this.f187913a;
        int length = charSequence.length();
        int length2 = charSequence.length();
        for (int i5 = this.f187915c; i5 < length2; i5++) {
            char cCharAt = charSequence.charAt(i5);
            if (cCharAt == '\n' || cCharAt == '\r') {
                i = (cCharAt == '\r' && (i2 = i5 + 1) < charSequence.length() && charSequence.charAt(i2) == '\n') ? 2 : 1;
                length = i5;
                this.f187914b = 1;
                this.e = i;
                this.d = length;
                return true;
            }
        }
        i = -1;
        this.f187914b = 1;
        this.e = i;
        this.d = length;
        return true;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.f187914b = 0;
        int i = this.d;
        int i2 = this.f187915c;
        this.f187915c = this.e + i;
        return this.f187913a.subSequence(i2, i).toString();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
