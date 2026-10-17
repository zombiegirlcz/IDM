package a8;

import android.util.Log;
import com.google.common.primitives.UnsignedBytes;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;

/* JADX INFO: loaded from: classes16.dex */
public final class d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ByteBuffer f1963b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public c f1964c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[] f1962a = new byte[256];
    public int d = 0;

    public final void a() {
        this.f1963b = null;
        this.f1964c = null;
    }

    public final boolean b() {
        return this.f1964c.f1957b != 0;
    }

    public final c c() {
        byte[] bArr;
        if (this.f1963b == null) {
            throw new IllegalStateException("You must call setData() before parseHeader()");
        }
        if (b()) {
            return this.f1964c;
        }
        StringBuilder sb6 = new StringBuilder();
        for (int i = 0; i < 6; i++) {
            sb6.append((char) d());
        }
        if (sb6.toString().startsWith("GIF")) {
            this.f1964c.f = this.f1963b.getShort();
            this.f1964c.f1959g = this.f1963b.getShort();
            int iD = d();
            c cVar = this.f1964c;
            cVar.f1960h = (iD & 128) != 0;
            cVar.i = (int) Math.pow(2.0d, (iD & 7) + 1);
            this.f1964c.f1961j = d();
            c cVar2 = this.f1964c;
            d();
            cVar2.getClass();
            if (this.f1964c.f1960h && !b()) {
                c cVar3 = this.f1964c;
                cVar3.f1956a = f(cVar3.i);
                c cVar4 = this.f1964c;
                cVar4.k = cVar4.f1956a[cVar4.f1961j];
            }
        } else {
            this.f1964c.f1957b = 1;
        }
        if (!b()) {
            boolean z = false;
            while (!z && !b() && this.f1964c.f1958c <= Integer.MAX_VALUE) {
                int iD2 = d();
                if (iD2 == 33) {
                    int iD3 = d();
                    if (iD3 == 1) {
                        h();
                    } else if (iD3 == 249) {
                        this.f1964c.d = new b();
                        d();
                        int iD4 = d();
                        b bVar = this.f1964c.d;
                        int i2 = (iD4 & 28) >> 2;
                        bVar.f1953g = i2;
                        if (i2 == 0) {
                            bVar.f1953g = 1;
                        }
                        bVar.f = (iD4 & 1) != 0;
                        short s2 = this.f1963b.getShort();
                        if (s2 < 2) {
                            s2 = 10;
                        }
                        b bVar2 = this.f1964c.d;
                        bVar2.i = s2 * 10;
                        bVar2.f1954h = d();
                        d();
                    } else if (iD3 == 254) {
                        h();
                    } else if (iD3 != 255) {
                        h();
                    } else {
                        e();
                        StringBuilder sb9 = new StringBuilder();
                        int i3 = 0;
                        while (true) {
                            bArr = this.f1962a;
                            if (i3 >= 11) {
                                break;
                            }
                            sb9.append((char) bArr[i3]);
                            i3++;
                        }
                        if (sb9.toString().equals("NETSCAPE2.0")) {
                            do {
                                e();
                                if (bArr[0] == 1) {
                                    byte b4 = bArr[1];
                                    byte b5 = bArr[2];
                                    this.f1964c.getClass();
                                }
                                if (this.d > 0) {
                                }
                            } while (!b());
                        } else {
                            h();
                        }
                    }
                } else if (iD2 == 44) {
                    c cVar5 = this.f1964c;
                    if (cVar5.d == null) {
                        cVar5.d = new b();
                    }
                    cVar5.d.f1950a = this.f1963b.getShort();
                    this.f1964c.d.f1951b = this.f1963b.getShort();
                    this.f1964c.d.f1952c = this.f1963b.getShort();
                    this.f1964c.d.d = this.f1963b.getShort();
                    int iD5 = d();
                    boolean z3 = (iD5 & 128) != 0;
                    int iPow = (int) Math.pow(2.0d, (iD5 & 7) + 1);
                    b bVar3 = this.f1964c.d;
                    bVar3.e = (iD5 & 64) != 0;
                    if (z3) {
                        bVar3.k = f(iPow);
                    } else {
                        bVar3.k = null;
                    }
                    this.f1964c.d.f1955j = this.f1963b.position();
                    d();
                    h();
                    if (!b()) {
                        c cVar6 = this.f1964c;
                        cVar6.f1958c++;
                        cVar6.e.add(cVar6.d);
                    }
                } else if (iD2 != 59) {
                    this.f1964c.f1957b = 1;
                } else {
                    z = true;
                }
            }
            c cVar7 = this.f1964c;
            if (cVar7.f1958c < 0) {
                cVar7.f1957b = 1;
            }
        }
        return this.f1964c;
    }

    public final int d() {
        try {
            return this.f1963b.get() & UnsignedBytes.MAX_VALUE;
        } catch (Exception unused) {
            this.f1964c.f1957b = 1;
            return 0;
        }
    }

    public final void e() {
        int iD = d();
        this.d = iD;
        if (iD <= 0) {
            return;
        }
        int i = 0;
        int i2 = 0;
        while (true) {
            try {
                i2 = this.d;
                if (i >= i2) {
                    return;
                }
                i2 -= i;
                this.f1963b.get(this.f1962a, i, i2);
                i += i2;
            } catch (Exception e) {
                if (Log.isLoggable("GifHeaderParser", 3)) {
                    StringBuilder sbW = com.google.android.gms.internal.mlkit_vision_face.a.w("Error Reading Block n: ", i, i2, " count: ", " blockSize: ");
                    sbW.append(this.d);
                    sbW.toString();
                }
                this.f1964c.f1957b = 1;
                return;
            }
        }
    }

    public final int[] f(int i) {
        byte[] bArr = new byte[i * 3];
        int[] iArr = null;
        try {
            this.f1963b.get(bArr);
            iArr = new int[256];
            int i2 = 0;
            int i3 = 0;
            while (i2 < i) {
                int i5 = bArr[i3] & UnsignedBytes.MAX_VALUE;
                int i6 = i3 + 2;
                int i21 = bArr[i3 + 1] & UnsignedBytes.MAX_VALUE;
                i3 += 3;
                int i22 = i2 + 1;
                iArr[i2] = (i21 << 8) | (i5 << 16) | (-16777216) | (bArr[i6] & UnsignedBytes.MAX_VALUE);
                i2 = i22;
            }
            return iArr;
        } catch (BufferUnderflowException e) {
            if (Log.isLoggable("GifHeaderParser", 3)) {
            }
            this.f1964c.f1957b = 1;
            return iArr;
        }
    }

    public final void g(ByteBuffer byteBuffer) {
        this.f1963b = null;
        Arrays.fill(this.f1962a, (byte) 0);
        this.f1964c = new c();
        this.d = 0;
        ByteBuffer byteBufferAsReadOnlyBuffer = byteBuffer.asReadOnlyBuffer();
        this.f1963b = byteBufferAsReadOnlyBuffer;
        byteBufferAsReadOnlyBuffer.position(0);
        this.f1963b.order(ByteOrder.LITTLE_ENDIAN);
    }

    public final void h() {
        int iD;
        do {
            iD = d();
            this.f1963b.position(Math.min(this.f1963b.position() + iD, this.f1963b.limit()));
        } while (iD > 0);
    }
}
