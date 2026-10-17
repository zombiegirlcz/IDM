package com.google.crypto.tink.shaded.protobuf;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes17.dex */
public final class f implements Iterator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f49357a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f49358b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f49359c;
    public final /* synthetic */ Object d;

    public f(com.google.protobuf.p pVar) {
        this.d = pVar;
        this.f49359c = pVar.size();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.f49357a) {
            case 0:
                if (this.f49358b < this.f49359c) {
                }
                break;
            default:
                if (this.f49358b < this.f49359c) {
                }
                break;
        }
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f49357a) {
            case 0:
                int i = this.f49358b;
                if (i >= this.f49359c) {
                    throw new NoSuchElementException();
                }
                this.f49358b = i + 1;
                return Byte.valueOf(((i) this.d).h(i));
            default:
                int i2 = this.f49358b;
                if (i2 >= this.f49359c) {
                    throw new NoSuchElementException();
                }
                this.f49358b = i2 + 1;
                return Byte.valueOf(((com.google.protobuf.p) this.d).e(i2));
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f49357a) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    public f(i iVar) {
        this.d = iVar;
        this.f49359c = iVar.size();
    }
}
