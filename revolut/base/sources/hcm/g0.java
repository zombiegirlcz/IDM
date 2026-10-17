package hcm;

import com.google.common.base.Preconditions;
import java.io.IOException;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.flow.Flow;
import org.bouncycastle.crypto.digests.Blake2xsDigest;

/* JADX INFO: loaded from: classes13.dex */
public final class g0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f151273a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f151274b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f151275c;
    public final Object d;

    public g0(t tVar, f fVar) {
        this.f151274b = (f0) Preconditions.checkNotNull(tVar, "transport");
        this.f151275c = (icm.b) Preconditions.checkNotNull(fVar, "frameWriter");
        this.f151273a = Blake2xsDigest.UNKNOWN_DIGEST_LENGTH;
        this.d = new e0(this, 0, Blake2xsDigest.UNKNOWN_DIGEST_LENGTH, null);
    }

    public void a(boolean z, e0 e0Var, mmm.h hVar, boolean z3) {
        Preconditions.checkNotNull(hVar, "source");
        int iMin = Math.min(e0Var.f151265c, ((e0) e0Var.f151266g.d).f151265c);
        mmm.h hVar2 = e0Var.f151263a;
        boolean z4 = hVar2.f207266b > 0;
        int i = (int) hVar.f207266b;
        if (z4 || iMin < i) {
            if (!z4 && iMin > 0) {
                e0Var.b(iMin, hVar, false);
            }
            hVar2.write(hVar, (int) hVar.f207266b);
            e0Var.f = z | e0Var.f;
        } else {
            e0Var.b(i, hVar, z);
        }
        if (z3) {
            try {
                ((icm.b) this.f151275c).flush();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public boolean b(int i) {
        if (i < 0) {
            throw new IllegalArgumentException(a0.d.n("Invalid initial window size: ", i));
        }
        int i2 = i - this.f151273a;
        this.f151273a = i;
        for (e0 e0Var : ((t) ((f0) this.f151274b)).i()) {
            e0Var.a(i2);
        }
        return i2 > 0;
    }

    public void c(e0 e0Var, int i) {
        if (e0Var == null) {
            ((e0) this.d).a(i);
            d();
            return;
        }
        e0Var.a(i);
        ag.w wVar = new ag.w();
        e0Var.c(Math.min(e0Var.f151265c, ((e0) e0Var.f151266g.d).f151265c), wVar);
        if (wVar.f4745a > 0) {
            try {
                ((icm.b) this.f151275c).flush();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }

    /*  JADX ERROR: JadxOverflowException in pass: LoopRegionVisitor
        jadx.core.utils.exceptions.JadxOverflowException: LoopRegionVisitor.assignOnlyInLoop endless recursion
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public void d() {
        /*
            r13 = this;
            java.lang.Object r0 = r13.f151274b
            hcm.f0 r0 = (hcm.f0) r0
            hcm.t r0 = (hcm.t) r0
            hcm.e0[] r1 = r0.i()
            java.util.List r2 = java.util.Arrays.asList(r1)
            java.util.Collections.shuffle(r2)
            java.lang.Object r2 = r13.d
            hcm.e0 r2 = (hcm.e0) r2
            int r2 = r2.f151265c
            int r3 = r1.length
        L18:
            r4 = 0
            if (r3 <= 0) goto L6c
            if (r2 <= 0) goto L6c
            float r5 = (float) r2
            float r6 = (float) r3
            float r5 = r5 / r6
            double r5 = (double) r5
            double r5 = java.lang.Math.ceil(r5)
            int r5 = (int) r5
            r6 = r4
            r7 = r6
        L28:
            if (r7 >= r3) goto L6a
            if (r2 <= 0) goto L6a
            r8 = r1[r7]
            int r9 = r8.f151265c
            mmm.h r10 = r8.f151263a
            long r11 = r10.f207266b
            int r11 = (int) r11
            int r9 = java.lang.Math.min(r9, r11)
            int r9 = java.lang.Math.max(r4, r9)
            int r11 = r8.d
            int r9 = r9 - r11
            int r9 = java.lang.Math.min(r9, r5)
            int r9 = java.lang.Math.min(r2, r9)
            if (r9 <= 0) goto L50
            int r11 = r8.d
            int r11 = r11 + r9
            r8.d = r11
            int r2 = r2 - r9
        L50:
            int r9 = r8.f151265c
            long r10 = r10.f207266b
            int r10 = (int) r10
            int r9 = java.lang.Math.min(r9, r10)
            int r9 = java.lang.Math.max(r4, r9)
            int r10 = r8.d
            int r9 = r9 - r10
            if (r9 <= 0) goto L67
            int r9 = r6 + 1
            r1[r6] = r8
            r6 = r9
        L67:
            int r7 = r7 + 1
            goto L28
        L6a:
            r3 = r6
            goto L18
        L6c:
            ag.w r1 = new ag.w
            r1.<init>()
            hcm.e0[] r0 = r0.i()
            int r2 = r0.length
            r3 = r4
        L77:
            if (r3 >= r2) goto L85
            r5 = r0[r3]
            int r6 = r5.d
            r5.c(r6, r1)
            r5.d = r4
            int r3 = r3 + 1
            goto L77
        L85:
            int r0 = r1.f4745a
            if (r0 <= 0) goto L98
            java.lang.Object r0 = r13.f151275c     // Catch: java.io.IOException -> L91
            icm.b r0 = (icm.b) r0     // Catch: java.io.IOException -> L91
            r0.flush()     // Catch: java.io.IOException -> L91
            return
        L91:
            r0 = move-exception
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            r1.<init>(r0)
            throw r1
        L98:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: hcm.g0.d():void");
    }

    public g0(int i, CoroutineContext coroutineContext, Flow flow, ukm.f fVar) {
        this.f151274b = flow;
        this.f151273a = i;
        this.f151275c = fVar;
        this.d = coroutineContext;
    }
}
