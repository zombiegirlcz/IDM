package hcm;

import com.google.common.base.Preconditions;
import java.io.IOException;

/* JADX INFO: loaded from: classes13.dex */
public final class e0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f151264b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f151265c;
    public int d;
    public final d0 e;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ g0 f151266g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final mmm.h f151263a = new mmm.h();
    public boolean f = false;

    public e0(g0 g0Var, int i, int i2, d0 d0Var) {
        this.f151266g = g0Var;
        this.f151264b = i;
        this.f151265c = i2;
        this.e = d0Var;
    }

    public final int a(int i) {
        if (i <= 0 || Integer.MAX_VALUE - i >= this.f151265c) {
            int i2 = this.f151265c + i;
            this.f151265c = i2;
            return i2;
        }
        throw new IllegalArgumentException("Window size overflow for stream: " + this.f151264b);
    }

    public final void b(int i, mmm.h hVar, boolean z) {
        boolean zE;
        do {
            int iMin = Math.min(i, ((icm.b) this.f151266g.f151275c).H7());
            int i2 = -iMin;
            ((e0) this.f151266g.d).a(i2);
            a(i2);
            try {
                boolean z3 = false;
                ((icm.b) this.f151266g.f151275c).D9(hVar.f207266b == ((long) iMin) && z, this.f151264b, hVar, iMin);
                gcm.b bVar = (gcm.b) this.e;
                synchronized (bVar.f142573b) {
                    Preconditions.checkState(bVar.f, "onStreamAllocated was not called, but it seems the stream is active");
                    int i3 = bVar.e;
                    int i5 = bVar.f142576h;
                    boolean z4 = i3 < i5;
                    int i6 = i3 - iMin;
                    bVar.e = i6;
                    boolean z6 = i6 < i5;
                    if (!z4 && z6) {
                        z3 = true;
                    }
                }
                if (z3) {
                    synchronized (bVar.f142573b) {
                        zE = bVar.e();
                    }
                    if (zE) {
                        bVar.k.d();
                    }
                }
                i -= iMin;
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        } while (i > 0);
    }

    public final void c(int i, ag.w wVar) {
        int i2 = this.f151265c;
        g0 g0Var = this.f151266g;
        int iMin = Math.min(i, Math.min(i2, ((e0) g0Var.d).f151265c));
        int i3 = 0;
        while (true) {
            mmm.h hVar = this.f151263a;
            long j2 = hVar.f207266b;
            if (j2 <= 0 || iMin <= 0) {
                return;
            }
            if (iMin >= j2) {
                int i5 = (int) j2;
                i3 += i5;
                b(i5, hVar, this.f);
            } else {
                i3 += iMin;
                b(iMin, hVar, false);
            }
            wVar.f4745a++;
            iMin = Math.min(i - i3, Math.min(this.f151265c, ((e0) g0Var.d).f151265c));
        }
    }
}
