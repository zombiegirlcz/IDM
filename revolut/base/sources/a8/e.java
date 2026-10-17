package a8;

import android.graphics.Bitmap;
import android.util.Log;
import cpi.g;
import f8.f;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Iterator;

/* JADX INFO: loaded from: classes16.dex */
public final class e implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int[] f1965a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final g f1967c;
    public ByteBuffer d;
    public byte[] e;
    public short[] f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public byte[] f1968g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public byte[] f1969h;
    public byte[] i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int[] f1970j;
    public int k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public c f1971l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public Bitmap f1972m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final boolean f1973n;
    public int o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final int f1974p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final int f1975q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final int f1976r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public Boolean f1977s;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int[] f1966b = new int[256];

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public Bitmap.Config f1978t = Bitmap.Config.ARGB_8888;

    public e(g gVar, c cVar, ByteBuffer byteBuffer, int i) {
        this.f1967c = gVar;
        this.f1971l = new c();
        synchronized (this) {
            try {
                if (i <= 0) {
                    throw new IllegalArgumentException("Sample size must be >=0, not: " + i);
                }
                int iHighestOneBit = Integer.highestOneBit(i);
                this.o = 0;
                this.f1971l = cVar;
                this.k = -1;
                ByteBuffer byteBufferAsReadOnlyBuffer = byteBuffer.asReadOnlyBuffer();
                this.d = byteBufferAsReadOnlyBuffer;
                byteBufferAsReadOnlyBuffer.position(0);
                this.d.order(ByteOrder.LITTLE_ENDIAN);
                this.f1973n = false;
                Iterator it8 = cVar.e.iterator();
                while (true) {
                    if (!it8.hasNext()) {
                        break;
                    } else if (((b) it8.next()).f1953g == 3) {
                        this.f1973n = true;
                        break;
                    }
                }
                this.f1974p = iHighestOneBit;
                int i2 = cVar.f;
                this.f1976r = i2 / iHighestOneBit;
                int i3 = cVar.f1959g;
                this.f1975q = i3 / iHighestOneBit;
                int i5 = i2 * i3;
                f fVar = (f) this.f1967c.f107955c;
                this.i = fVar == null ? new byte[i5] : (byte[]) fVar.c(i5, byte[].class);
                g gVar2 = this.f1967c;
                int i6 = this.f1976r * this.f1975q;
                f fVar2 = (f) gVar2.f107955c;
                this.f1970j = fVar2 == null ? new int[i6] : (int[]) fVar2.c(i6, int[].class);
            } catch (Throwable th10) {
                throw th10;
            }
        }
    }

    public final void a() {
        this.k = (this.k + 1) % this.f1971l.f1958c;
    }

    public final Bitmap b() {
        Boolean bool = this.f1977s;
        Bitmap bitmapC = ((f8.a) this.f1967c.f107954b).c(this.f1976r, this.f1975q, (bool == null || bool.booleanValue()) ? Bitmap.Config.ARGB_8888 : this.f1978t);
        bitmapC.setHasAlpha(true);
        return bitmapC;
    }

    public final synchronized Bitmap c() {
        try {
            if (this.f1971l.f1958c <= 0 || this.k < 0) {
                if (Log.isLoggable("e", 3)) {
                    String str = "Unable to decode frame, frameCount=" + this.f1971l.f1958c + ", framePointer=" + this.k;
                }
                this.o = 1;
            }
            int i = this.o;
            if (i != 1 && i != 2) {
                this.o = 0;
                if (this.e == null) {
                    f fVar = (f) this.f1967c.f107955c;
                    this.e = fVar == null ? new byte[255] : (byte[]) fVar.c(255, byte[].class);
                }
                b bVar = (b) this.f1971l.e.get(this.k);
                int i2 = this.k - 1;
                b bVar2 = i2 >= 0 ? (b) this.f1971l.e.get(i2) : null;
                int[] iArr = bVar.k;
                if (iArr == null) {
                    iArr = this.f1971l.f1956a;
                }
                this.f1965a = iArr;
                if (iArr == null) {
                    if (Log.isLoggable("e", 3)) {
                        String str2 = "No valid color table found for frame #" + this.k;
                    }
                    this.o = 1;
                    return null;
                }
                if (bVar.f) {
                    System.arraycopy(iArr, 0, this.f1966b, 0, iArr.length);
                    int[] iArr2 = this.f1966b;
                    this.f1965a = iArr2;
                    iArr2[bVar.f1954h] = 0;
                    if (bVar.f1953g == 2 && this.k == 0) {
                        this.f1977s = Boolean.TRUE;
                    }
                }
                return e(bVar, bVar2);
            }
            if (Log.isLoggable("e", 3)) {
                String str3 = "Unable to decode frame, status=" + this.o;
            }
            return null;
        } catch (Throwable th10) {
            throw th10;
        }
    }

    public final void d(Bitmap.Config config) {
        Bitmap.Config config2;
        Bitmap.Config config3 = Bitmap.Config.ARGB_8888;
        if (config == config3 || config == (config2 = Bitmap.Config.RGB_565)) {
            this.f1978t = config;
            return;
        }
        throw new IllegalArgumentException("Unsupported format: " + config + ", must be one of " + config3 + " or " + config2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0047  */
    /* JADX WARN: Type inference failed for: r7v17 */
    /* JADX WARN: Type inference failed for: r7v18 */
    /* JADX WARN: Type inference failed for: r7v19 */
    /* JADX WARN: Type inference failed for: r7v23, types: [short] */
    /* JADX WARN: Type inference failed for: r7v25 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.graphics.Bitmap e(a8.b r35, a8.b r36) {
        /*
            Method dump skipped, instruction units count: 1029
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a8.e.e(a8.b, a8.b):android.graphics.Bitmap");
    }
}
