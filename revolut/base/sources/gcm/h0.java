package gcm;

import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.InvalidMarkException;
import java.util.ArrayDeque;
import java.util.Iterator;

/* JADX INFO: loaded from: classes13.dex */
public final class h0 extends d {
    public static final m e = new m(1);
    public static final m f = new m(2);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final m f142666g = new m(3);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final m f142667h = new m(4);
    public static final m i = new m(5);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayDeque f142668a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ArrayDeque f142669b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f142670c;
    public boolean d;

    public h0() {
        new ArrayDeque(2);
        this.f142668a = new ArrayDeque();
    }

    @Override // gcm.d, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        while (true) {
            ArrayDeque arrayDeque = this.f142668a;
            if (arrayDeque.isEmpty()) {
                break;
            } else {
                ((d) arrayDeque.remove()).close();
            }
        }
        if (this.f142669b != null) {
            while (!this.f142669b.isEmpty()) {
                ((d) this.f142669b.remove()).close();
            }
        }
    }

    @Override // gcm.d
    public final void f() throws IOException {
        ArrayDeque arrayDeque = this.f142669b;
        ArrayDeque arrayDeque2 = this.f142668a;
        if (arrayDeque == null) {
            this.f142669b = new ArrayDeque(Math.min(arrayDeque2.size(), 16));
        }
        while (!this.f142669b.isEmpty()) {
            ((d) this.f142669b.remove()).close();
        }
        this.d = true;
        d dVar = (d) arrayDeque2.peek();
        if (dVar != null) {
            dVar.f();
        }
    }

    @Override // gcm.d
    public final boolean g() {
        Iterator it8 = this.f142668a.iterator();
        while (it8.hasNext()) {
            if (!((d) it8.next()).g()) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v3, types: [gcm.d] */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6, types: [gcm.d] */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v9 */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v2, types: [gcm.h0] */
    /* JADX WARN: Type inference failed for: r1v3, types: [gcm.h0] */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v7 */
    @Override // gcm.d
    public final d h(int i2) throws IOException {
        d dVarH;
        int i3;
        d dVarH2;
        ?? r110;
        ?? r06;
        if (i2 <= 0) {
            return v4.f142912a;
        }
        d(i2);
        this.f142670c -= i2;
        ?? r09 = 0;
        ?? h0Var = 0;
        while (true) {
            ArrayDeque arrayDeque = this.f142668a;
            d dVar = (d) arrayDeque.peek();
            int iM = dVar.m();
            if (iM > i2) {
                dVarH2 = dVar.h(i2);
                i3 = 0;
            } else {
                if (this.d) {
                    dVarH = dVar.h(iM);
                    p();
                } else {
                    dVarH = (d) arrayDeque.poll();
                }
                d dVar2 = dVarH;
                i3 = i2 - iM;
                dVarH2 = dVar2;
            }
            if (r09 == 0) {
                r06 = dVarH2;
                r110 = h0Var;
            } else {
                if (h0Var == 0) {
                    h0Var = new h0(i3 != 0 ? Math.min(arrayDeque.size() + 2, 16) : 2);
                    h0Var.o(r09);
                    r09 = h0Var;
                }
                h0Var.o(dVarH2);
                r06 = r09;
                r110 = h0Var;
            }
            if (i3 <= 0) {
                return r06;
            }
            i2 = i3;
            r09 = r06;
            h0Var = r110;
        }
    }

    @Override // gcm.d
    public final void i(OutputStream outputStream, int i2) throws IOException {
        q(i, i2, outputStream, 0);
    }

    @Override // gcm.d
    public final void j(ByteBuffer byteBuffer) {
        r(f142667h, byteBuffer.remaining(), byteBuffer, 0);
    }

    @Override // gcm.d
    public final void k(byte[] bArr, int i2, int i3) {
        r(f142666g, i3, bArr, i2);
    }

    @Override // gcm.d
    public final int l() {
        return r(e, 1, null, 0);
    }

    @Override // gcm.d
    public final int m() {
        return this.f142670c;
    }

    @Override // gcm.d
    public final void n(int i2) {
        r(f, i2, null, 0);
    }

    public final void o(d dVar) throws IOException {
        boolean z = this.d;
        ArrayDeque arrayDeque = this.f142668a;
        boolean z3 = z && arrayDeque.isEmpty();
        if (dVar instanceof h0) {
            h0 h0Var = (h0) dVar;
            ArrayDeque arrayDeque2 = h0Var.f142668a;
            while (!arrayDeque2.isEmpty()) {
                arrayDeque.add((d) arrayDeque2.remove());
            }
            this.f142670c += h0Var.f142670c;
            h0Var.f142670c = 0;
            h0Var.close();
        } else {
            arrayDeque.add(dVar);
            this.f142670c = dVar.m() + this.f142670c;
        }
        if (z3) {
            ((d) arrayDeque.peek()).f();
        }
    }

    public final void p() throws IOException {
        boolean z = this.d;
        ArrayDeque arrayDeque = this.f142668a;
        if (!z) {
            ((d) arrayDeque.remove()).close();
            return;
        }
        this.f142669b.add((d) arrayDeque.remove());
        d dVar = (d) arrayDeque.peek();
        if (dVar != null) {
            dVar.f();
        }
    }

    public final int q(g0 g0Var, int i2, Object obj2, int i3) throws IOException {
        d(i2);
        ArrayDeque arrayDeque = this.f142668a;
        if (!arrayDeque.isEmpty() && ((d) arrayDeque.peek()).m() == 0) {
            p();
        }
        while (i2 > 0 && !arrayDeque.isEmpty()) {
            d dVar = (d) arrayDeque.peek();
            int iMin = Math.min(i2, dVar.m());
            i3 = g0Var.a(dVar, iMin, obj2, i3);
            i2 -= iMin;
            this.f142670c -= iMin;
            if (((d) arrayDeque.peek()).m() == 0) {
                p();
            }
        }
        if (i2 <= 0) {
            return i3;
        }
        throw new AssertionError("Failed executing read operation");
    }

    public final int r(m mVar, int i2, Object obj2, int i3) {
        try {
            return q(mVar, i2, obj2, i3);
        } catch (IOException e2) {
            throw new AssertionError(e2);
        }
    }

    @Override // gcm.d
    public final void reset() {
        if (!this.d) {
            throw new InvalidMarkException();
        }
        ArrayDeque arrayDeque = this.f142668a;
        d dVar = (d) arrayDeque.peek();
        if (dVar != null) {
            int iM = dVar.m();
            dVar.reset();
            this.f142670c = (dVar.m() - iM) + this.f142670c;
        }
        while (true) {
            d dVar2 = (d) this.f142669b.pollLast();
            if (dVar2 == null) {
                return;
            }
            dVar2.reset();
            arrayDeque.addFirst(dVar2);
            this.f142670c = dVar2.m() + this.f142670c;
        }
    }

    public h0(int i2) {
        new ArrayDeque(2);
        this.f142668a = new ArrayDeque(i2);
    }
}
