package wkm;

import java.util.Arrays;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.StateFlow;
import yhm.m;

/* JADX INFO: loaded from: classes13.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public c[] f298300a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f298301b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f298302c;
    public y d;

    public final c a() {
        c cVarB;
        y yVar;
        synchronized (this) {
            try {
                c[] cVarArrC = this.f298300a;
                if (cVarArrC == null) {
                    cVarArrC = c();
                    this.f298300a = cVarArrC;
                } else if (this.f298301b >= cVarArrC.length) {
                    Object[] objArrCopyOf = Arrays.copyOf(cVarArrC, cVarArrC.length * 2);
                    Intrinsics.checkNotNullExpressionValue(objArrCopyOf, "copyOf(...)");
                    this.f298300a = (c[]) objArrCopyOf;
                    cVarArrC = (c[]) objArrCopyOf;
                }
                int i = this.f298302c;
                do {
                    cVarB = cVarArrC[i];
                    if (cVarB == null) {
                        cVarB = b();
                        cVarArrC[i] = cVarB;
                    }
                    i++;
                    if (i >= cVarArrC.length) {
                        i = 0;
                    }
                } while (!cVarB.a(this));
                this.f298302c = i;
                this.f298301b++;
                yVar = this.d;
            } catch (Throwable th10) {
                throw th10;
            }
        }
        if (yVar != null) {
            yVar.x(1);
        }
        return cVarB;
    }

    public abstract c b();

    public abstract c[] c();

    public final void e(c cVar) {
        y yVar;
        int i;
        Continuation[] continuationArrB;
        synchronized (this) {
            try {
                int i2 = this.f298301b - 1;
                this.f298301b = i2;
                yVar = this.d;
                if (i2 == 0) {
                    this.f298302c = 0;
                }
                Intrinsics.i(cVar, "null cannot be cast to non-null type kotlinx.coroutines.flow.internal.AbstractSharedFlowSlot<kotlin.Any>");
                continuationArrB = cVar.b(this);
            } catch (Throwable th10) {
                throw th10;
            }
        }
        for (Continuation continuation : continuationArrB) {
            if (continuation != null) {
                m.Companion companion = yhm.m.INSTANCE;
                continuation.resumeWith(Unit.f186387a);
            }
        }
        if (yVar != null) {
            yVar.x(-1);
        }
    }

    public final StateFlow l() {
        y yVar;
        synchronized (this) {
            yVar = this.d;
            if (yVar == null) {
                int i = this.f298301b;
                yVar = new y(1, Integer.MAX_VALUE, ukm.f.DROP_OLDEST);
                yVar.k(Integer.valueOf(i));
                this.d = yVar;
            }
        }
        return yVar;
    }
}
