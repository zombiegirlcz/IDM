package kotlin.reflect.jvm.internal.impl.protobuf;

import java.io.IOException;
import java.io.OutputStream;
import java.util.Iterator;

/* JADX INFO: loaded from: classes13.dex */
public class g extends ByteString {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[] f187528a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f187529b = 0;

    public g(byte[] bArr) {
        this.f187528a = bArr;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.ByteString
    public void b(byte[] bArr, int i, int i2, int i3) {
        System.arraycopy(this.f187528a, i, bArr, i2, i3);
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.ByteString
    public final int c() {
        return 0;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.ByteString
    public final boolean d() {
        return true;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.ByteString
    public final int e(int i, int i2, int i3) {
        for (int i5 = i2; i5 < i2 + i3; i5++) {
            i = (i * 31) + this.f187528a[i5];
        }
        return i;
    }

    public final boolean equals(Object obj2) {
        if (obj2 == this) {
            return true;
        }
        if (!(obj2 instanceof ByteString) || size() != ((ByteString) obj2).size()) {
            return false;
        }
        if (size() == 0) {
            return true;
        }
        if (obj2 instanceof g) {
            return i((g) obj2, 0, size());
        }
        if (obj2 instanceof i) {
            return obj2.equals(this);
        }
        String strValueOf = String.valueOf(obj2.getClass());
        throw new IllegalArgumentException(v0.a.i(new StringBuilder(strValueOf.length() + 49), "Has a new type of ByteString been created? Found ", strValueOf));
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0018, code lost:
    
        if (r0[r9] > (-65)) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x001c, code lost:
    
        r9 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0049, code lost:
    
        if (r0[r9] > (-65)) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0092, code lost:
    
        if (r0[r8] > (-65)) goto L59;
     */
    @Override // kotlin.reflect.jvm.internal.impl.protobuf.ByteString
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int f(int r8, int r9, int r10) {
        /*
            r7 = this;
            int r10 = r10 + r9
            byte[] r0 = r7.f187528a
            if (r8 == 0) goto L95
            if (r9 < r10) goto L8
            return r8
        L8:
            byte r1 = (byte) r8
            r2 = -32
            r3 = -1
            r4 = -65
            if (r1 >= r2) goto L1f
            r8 = -62
            if (r1 < r8) goto L94
            int r8 = r9 + 1
            r9 = r0[r9]
            if (r9 <= r4) goto L1c
            goto L94
        L1c:
            r9 = r8
            goto L95
        L1f:
            r5 = -16
            if (r1 >= r5) goto L4c
            int r8 = r8 >> 8
            int r8 = ~r8
            byte r8 = (byte) r8
            if (r8 != 0) goto L37
            int r8 = r9 + 1
            r9 = r0[r9]
            if (r8 < r10) goto L34
            int r8 = vjm.h.a(r1, r9)
            return r8
        L34:
            r6 = r9
            r9 = r8
            r8 = r6
        L37:
            if (r8 > r4) goto L94
            r5 = -96
            if (r1 != r2) goto L3f
            if (r8 < r5) goto L94
        L3f:
            r2 = -19
            if (r1 != r2) goto L45
            if (r8 >= r5) goto L94
        L45:
            int r8 = r9 + 1
            r9 = r0[r9]
            if (r9 <= r4) goto L1c
            goto L94
        L4c:
            int r2 = r8 >> 8
            int r2 = ~r2
            byte r2 = (byte) r2
            if (r2 != 0) goto L5f
            int r8 = r9 + 1
            r2 = r0[r9]
            if (r8 < r10) goto L5d
            int r8 = vjm.h.a(r1, r2)
            return r8
        L5d:
            r9 = 0
            goto L65
        L5f:
            int r8 = r8 >> 16
            byte r8 = (byte) r8
            r6 = r9
            r9 = r8
            r8 = r6
        L65:
            if (r9 != 0) goto L81
            int r9 = r8 + 1
            r8 = r0[r8]
            if (r9 < r10) goto L7e
            r9 = -12
            if (r1 > r9) goto L7d
            if (r2 > r4) goto L7d
            if (r8 <= r4) goto L76
            goto L7d
        L76:
            int r9 = r2 << 8
            r9 = r9 ^ r1
            int r8 = r8 << 16
            r8 = r8 ^ r9
            return r8
        L7d:
            return r3
        L7e:
            r6 = r9
            r9 = r8
            r8 = r6
        L81:
            if (r2 > r4) goto L94
            int r1 = r1 << 28
            int r2 = r2 + 112
            int r2 = r2 + r1
            int r1 = r2 >> 30
            if (r1 != 0) goto L94
            if (r9 > r4) goto L94
            int r9 = r8 + 1
            r8 = r0[r8]
            if (r8 <= r4) goto L95
        L94:
            return r3
        L95:
            int r8 = vjm.h.c(r0, r9, r10)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.protobuf.g.f(int, int, int):int");
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.ByteString
    public final int g() {
        return this.f187529b;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.ByteString
    public final void h(OutputStream outputStream, int i, int i2) throws IOException {
        outputStream.write(this.f187528a, i, i2);
    }

    public final int hashCode() {
        int iE = this.f187529b;
        if (iE == 0) {
            int size = size();
            iE = e(size, 0, size);
            if (iE == 0) {
                iE = 1;
            }
            this.f187529b = iE;
        }
        return iE;
    }

    public final boolean i(g gVar, int i, int i2) {
        byte[] bArr = gVar.f187528a;
        int length = bArr.length;
        byte[] bArr2 = this.f187528a;
        if (i2 > length) {
            int length2 = bArr2.length;
            StringBuilder sb6 = new StringBuilder(40);
            sb6.append("Length too large: ");
            sb6.append(i2);
            sb6.append(length2);
            throw new IllegalArgumentException(sb6.toString());
        }
        if (i + i2 <= bArr.length) {
            int i3 = 0;
            while (i3 < i2) {
                if (bArr2[i3] != bArr[i]) {
                    return false;
                }
                i3++;
                i++;
            }
            return true;
        }
        int length3 = gVar.f187528a.length;
        StringBuilder sb9 = new StringBuilder(59);
        sb9.append("Ran off end of other: ");
        sb9.append(i);
        sb9.append(", ");
        sb9.append(i2);
        throw new IllegalArgumentException(com.google.android.gms.internal.mlkit_vision_face.a.s(sb9, ", ", length3));
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.ByteString
    public final boolean isValidUtf8() {
        byte[] bArr = this.f187528a;
        return vjm.h.c(bArr, 0, bArr.length) == 0;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.ByteString, java.lang.Iterable
    public Iterator<Byte> iterator() {
        return new f(this);
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.ByteString
    public final CodedInputStream newCodedInput() {
        CodedInputStream codedInputStream = new CodedInputStream(this);
        try {
            codedInputStream.pushLimit(this.f187528a.length);
            return codedInputStream;
        } catch (InvalidProtocolBufferException e) {
            throw new IllegalArgumentException(e);
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.ByteString
    public int size() {
        return this.f187528a.length;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.ByteString
    public final String toString(String str) {
        byte[] bArr = this.f187528a;
        return new String(bArr, 0, bArr.length, str);
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.ByteString, java.lang.Iterable
    public Iterator<Byte> iterator() {
        return new f(this);
    }
}
