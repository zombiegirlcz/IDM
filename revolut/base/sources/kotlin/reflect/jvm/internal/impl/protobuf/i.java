package kotlin.reflect.jvm.internal.impl.protobuf;

import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes13.dex */
public final class i extends ByteString {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int[] f187533g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f187534a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ByteString f187535b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ByteString f187536c;
    public final int d;
    public final int e;
    public int f = 0;

    static {
        ArrayList arrayList = new ArrayList();
        int i = 1;
        int i2 = 1;
        while (i > 0) {
            arrayList.add(Integer.valueOf(i));
            int i3 = i2 + i;
            i2 = i;
            i = i3;
        }
        arrayList.add(Integer.MAX_VALUE);
        f187533g = new int[arrayList.size()];
        int i5 = 0;
        while (true) {
            int[] iArr = f187533g;
            if (i5 >= iArr.length) {
                return;
            }
            iArr[i5] = ((Integer) arrayList.get(i5)).intValue();
            i5++;
        }
    }

    public i(ByteString byteString, ByteString byteString2) {
        this.f187535b = byteString;
        this.f187536c = byteString2;
        int size = byteString.size();
        this.d = size;
        this.f187534a = byteString2.size() + size;
        this.e = Math.max(byteString.c(), byteString2.c()) + 1;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.ByteString
    public final void b(byte[] bArr, int i, int i2, int i3) {
        int i5 = i + i3;
        ByteString byteString = this.f187535b;
        int i6 = this.d;
        if (i5 <= i6) {
            byteString.b(bArr, i, i2, i3);
            return;
        }
        ByteString byteString2 = this.f187536c;
        if (i >= i6) {
            byteString2.b(bArr, i - i6, i2, i3);
            return;
        }
        int i21 = i6 - i;
        byteString.b(bArr, i, i2, i21);
        byteString2.b(bArr, 0, i2 + i21, i3 - i21);
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.ByteString
    public final int c() {
        return this.e;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.ByteString
    public final boolean d() {
        return this.f187534a >= f187533g[this.e];
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.ByteString
    public final int e(int i, int i2, int i3) {
        int i5 = i2 + i3;
        ByteString byteString = this.f187535b;
        int i6 = this.d;
        if (i5 <= i6) {
            return byteString.e(i, i2, i3);
        }
        ByteString byteString2 = this.f187536c;
        if (i2 >= i6) {
            return byteString2.e(i, i2 - i6, i3);
        }
        int i21 = i6 - i2;
        return byteString2.e(byteString.e(i, i2, i21), 0, i3 - i21);
    }

    public final boolean equals(Object obj2) {
        int iG;
        if (obj2 == this) {
            return true;
        }
        if (obj2 instanceof ByteString) {
            ByteString byteString = (ByteString) obj2;
            int size = byteString.size();
            int i = this.f187534a;
            if (i == size) {
                if (i == 0) {
                    return true;
                }
                if (this.f == 0 || (iG = byteString.g()) == 0 || this.f == iG) {
                    sgm.f fVar = new sgm.f(this);
                    g gVar = (g) fVar.next();
                    sgm.f fVar2 = new sgm.f(byteString);
                    g gVar2 = (g) fVar2.next();
                    int i2 = 0;
                    int i3 = 0;
                    int i5 = 0;
                    while (true) {
                        int length = gVar.f187528a.length - i2;
                        int length2 = gVar2.f187528a.length - i3;
                        int iMin = Math.min(length, length2);
                        if (!(i2 == 0 ? gVar.i(gVar2, i3, iMin) : gVar2.i(gVar, i2, iMin))) {
                            break;
                        }
                        i5 += iMin;
                        if (i5 >= i) {
                            if (i5 == i) {
                                return true;
                            }
                            throw new IllegalStateException();
                        }
                        if (iMin == length) {
                            gVar = (g) fVar.next();
                            i2 = 0;
                        } else {
                            i2 += iMin;
                        }
                        if (iMin == length2) {
                            gVar2 = (g) fVar2.next();
                            i3 = 0;
                        } else {
                            i3 += iMin;
                        }
                    }
                }
            }
        }
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.ByteString
    public final int f(int i, int i2, int i3) {
        int i5 = i2 + i3;
        ByteString byteString = this.f187535b;
        int i6 = this.d;
        if (i5 <= i6) {
            return byteString.f(i, i2, i3);
        }
        ByteString byteString2 = this.f187536c;
        if (i2 >= i6) {
            return byteString2.f(i, i2 - i6, i3);
        }
        int i21 = i6 - i2;
        return byteString2.f(byteString.f(i, i2, i21), 0, i3 - i21);
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.ByteString
    public final int g() {
        return this.f;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.ByteString
    public final void h(OutputStream outputStream, int i, int i2) {
        int i3 = i + i2;
        ByteString byteString = this.f187535b;
        int i5 = this.d;
        if (i3 <= i5) {
            byteString.h(outputStream, i, i2);
            return;
        }
        ByteString byteString2 = this.f187536c;
        if (i >= i5) {
            byteString2.h(outputStream, i - i5, i2);
            return;
        }
        int i6 = i5 - i;
        byteString.h(outputStream, i, i6);
        byteString2.h(outputStream, 0, i2 - i6);
    }

    public final int hashCode() {
        int iE = this.f;
        if (iE == 0) {
            int i = this.f187534a;
            iE = e(i, 0, i);
            if (iE == 0) {
                iE = 1;
            }
            this.f = iE;
        }
        return iE;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.ByteString
    public final boolean isValidUtf8() {
        int iF = this.f187535b.f(0, 0, this.d);
        ByteString byteString = this.f187536c;
        return byteString.f(iF, 0, byteString.size()) == 0;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.ByteString, java.lang.Iterable
    public final Iterator<Byte> iterator() {
        return new h(this);
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.ByteString
    public final CodedInputStream newCodedInput() {
        return CodedInputStream.newInstance(new vjm.d(this));
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.ByteString
    public final int size() {
        return this.f187534a;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.ByteString
    public final String toString(String str) {
        return new String(toByteArray(), str);
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.ByteString, java.lang.Iterable
    public final Iterator<Byte> iterator() {
        return new h(this);
    }
}
