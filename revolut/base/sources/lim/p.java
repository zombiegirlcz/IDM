package lim;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes13.dex */
public final class p implements Iterator, pim.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f195573a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f195574b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ q f195575c;

    public p(q qVar) {
        this.f195575c = qVar;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() throws IOException {
        if (this.f195573a == null && !this.f195574b) {
            String line = ((BufferedReader) this.f195575c.f195577b).readLine();
            this.f195573a = line;
            if (line == null) {
                this.f195574b = true;
            }
        }
        return this.f195573a != null;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        String str = this.f195573a;
        this.f195573a = null;
        Intrinsics.h(str);
        return str;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
