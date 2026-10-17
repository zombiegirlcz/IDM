package kotlin.reflect.jvm.internal.impl.protobuf;

import kotlin.reflect.jvm.internal.impl.protobuf.ByteString;

/* JADX INFO: loaded from: classes14.dex */
public final class h implements ByteString.ByteIterator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final sgm.f f187530a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public f f187531b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f187532c;

    public h(i iVar) {
        sgm.f fVar = new sgm.f(iVar);
        this.f187530a = fVar;
        this.f187531b = new f(fVar.a());
        this.f187532c = iVar.f187534a;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f187532c > 0;
    }

    @Override // java.util.Iterator
    public final Byte next() {
        return Byte.valueOf(nextByte());
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.ByteString.ByteIterator
    public final byte nextByte() {
        if (!this.f187531b.hasNext()) {
            this.f187531b = new f(this.f187530a.a());
        }
        this.f187532c--;
        return this.f187531b.nextByte();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
