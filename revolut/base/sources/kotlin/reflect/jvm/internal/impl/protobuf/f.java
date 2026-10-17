package kotlin.reflect.jvm.internal.impl.protobuf;

import java.util.NoSuchElementException;
import kotlin.reflect.jvm.internal.impl.protobuf.ByteString;

/* JADX INFO: loaded from: classes14.dex */
public final class f implements ByteString.ByteIterator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f187525a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f187526b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ g f187527c;

    public f(g gVar) {
        this.f187527c = gVar;
        this.f187526b = gVar.f187528a.length;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f187525a < this.f187526b;
    }

    @Override // java.util.Iterator
    public final Byte next() {
        return Byte.valueOf(nextByte());
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.ByteString.ByteIterator
    public final byte nextByte() {
        try {
            byte[] bArr = this.f187527c.f187528a;
            int i = this.f187525a;
            this.f187525a = i + 1;
            return bArr[i];
        } catch (ArrayIndexOutOfBoundsException e) {
            throw new NoSuchElementException(e.getMessage());
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
