package gcm;

import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes22.dex */
public final class x3 extends OutputStream {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f142957a = new ArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public hcm.b0 f142958b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ a4 f142959c;

    public x3(a4 a4Var) {
        this.f142959c = a4Var;
    }

    public static int d(x3 x3Var) {
        Iterator it8 = x3Var.f142957a.iterator();
        int i = 0;
        while (it8.hasNext()) {
            i += ((hcm.b0) it8.next()).f151252c;
        }
        return i;
    }

    @Override // java.io.OutputStream
    public final void write(int i) {
        hcm.b0 b0Var = this.f142958b;
        if (b0Var == null || b0Var.f151251b <= 0) {
            write(new byte[]{(byte) i}, 0, 1);
            return;
        }
        b0Var.f151250a.w((byte) i);
        b0Var.f151251b--;
        b0Var.f151252c++;
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) {
        hcm.c0 c0Var = this.f142959c.f142563g;
        hcm.b0 b0Var = this.f142958b;
        ArrayList arrayList = this.f142957a;
        if (b0Var == null) {
            c0Var.getClass();
            hcm.b0 b0VarA = hcm.c0.a(i2);
            this.f142958b = b0VarA;
            arrayList.add(b0VarA);
        }
        while (i2 > 0) {
            int iMin = Math.min(i2, this.f142958b.f151251b);
            if (iMin == 0) {
                int iMax = Math.max(i2, this.f142958b.f151252c * 2);
                c0Var.getClass();
                hcm.b0 b0VarA2 = hcm.c0.a(iMax);
                this.f142958b = b0VarA2;
                arrayList.add(b0VarA2);
            } else {
                this.f142958b.a(bArr, i, iMin);
                i += iMin;
                i2 -= iMin;
            }
        }
    }
}
