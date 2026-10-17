package yj;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: classes17.dex */
public final class b implements xj.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f314344a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f314345b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f314346c;

    public b(byte[] bArr, ie.a aVar) {
        this.f314345b = bArr;
        this.f314346c = (af.f) aVar.f160500b;
    }

    @Override // xj.a
    public final Object getValue() {
        switch (this.f314344a) {
            case 0:
                return (byte[]) this.f314345b;
            default:
                return new HashSet((Set) this.f314345b);
        }
    }

    @Override // xj.a
    public final byte[] serialize() {
        int i = this.f314344a;
        Object obj2 = this.f314345b;
        Object obj3 = this.f314346c;
        int length = 1;
        switch (i) {
            case 0:
                byte[] bArr = (byte[]) obj2;
                ((af.f) obj3).getClass();
                byte[] bArr2 = new byte[bArr.length + 1];
                bArr2[0] = -12;
                System.arraycopy(bArr, 0, bArr2, 1, bArr.length);
                return bArr2;
            default:
                Set set = (Set) obj2;
                ((qf.b) obj3).getClass();
                int size = set.size();
                byte[][] bArr3 = new byte[size][];
                Iterator it8 = set.iterator();
                int i2 = 1;
                int i3 = 0;
                while (it8.hasNext()) {
                    byte[] bytes = ((String) it8.next()).getBytes();
                    int length2 = bytes.length;
                    byte[] bArr4 = {(byte) ((length2 >>> 24) & 255), (byte) ((length2 >>> 16) & 255), (byte) ((length2 >>> 8) & 255), (byte) (length2 & 255)};
                    int length3 = bytes.length + 4;
                    byte[] bArr5 = new byte[length3];
                    System.arraycopy(bArr4, 0, bArr5, 0, 4);
                    System.arraycopy(bytes, 0, bArr5, 4, bytes.length);
                    bArr3[i3] = bArr5;
                    i2 += length3;
                    i3++;
                }
                byte[] bArr6 = new byte[i2];
                bArr6[0] = -1;
                for (int i5 = 0; i5 < size; i5++) {
                    byte[] bArr7 = bArr3[i5];
                    System.arraycopy(bArr7, 0, bArr6, length, bArr7.length);
                    length += bArr7.length;
                }
                return bArr6;
        }
    }

    public b(Set set, ie.a aVar) {
        this.f314345b = set;
        this.f314346c = (qf.b) aVar.f160502g;
    }
}
