package zkm;

import java.util.Arrays;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.jvm.internal.Intrinsics;
import skm.x0;
import skm.y0;

/* JADX INFO: loaded from: classes13.dex */
public class z {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f323133b = AtomicIntegerFieldUpdater.newUpdater(z.class, "_size$volatile");
    private volatile /* synthetic */ int _size$volatile;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public x0[] f323134a;

    public final void a(x0 x0Var) {
        x0Var.c((y0) this);
        x0[] x0VarArr = this.f323134a;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f323133b;
        if (x0VarArr == null) {
            x0VarArr = new x0[4];
            this.f323134a = x0VarArr;
        } else if (atomicIntegerFieldUpdater.get(this) >= x0VarArr.length) {
            Object[] objArrCopyOf = Arrays.copyOf(x0VarArr, atomicIntegerFieldUpdater.get(this) * 2);
            Intrinsics.checkNotNullExpressionValue(objArrCopyOf, "copyOf(...)");
            x0VarArr = (x0[]) objArrCopyOf;
            this.f323134a = x0VarArr;
        }
        int i = atomicIntegerFieldUpdater.get(this);
        atomicIntegerFieldUpdater.set(this, i + 1);
        x0VarArr[i] = x0Var;
        x0Var.f264018b = i;
        c(i);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:26:? A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final skm.x0 b(int r9) {
        /*
            r8 = this;
            skm.x0[] r0 = r8.f323134a
            kotlin.jvm.internal.Intrinsics.h(r0)
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r1 = zkm.z.f323133b
            int r2 = r1.get(r8)
            r3 = -1
            int r2 = r2 + r3
            r1.set(r8, r2)
            int r2 = r1.get(r8)
            if (r9 >= r2) goto L7a
            int r2 = r1.get(r8)
            r8.d(r9, r2)
            int r2 = r9 + (-1)
            int r2 = r2 / 2
            if (r9 <= 0) goto L3a
            r4 = r0[r9]
            kotlin.jvm.internal.Intrinsics.h(r4)
            r5 = r0[r2]
            kotlin.jvm.internal.Intrinsics.h(r5)
            int r4 = r4.compareTo(r5)
            if (r4 >= 0) goto L3a
            r8.d(r9, r2)
            r8.c(r2)
            goto L7a
        L3a:
            int r2 = r9 * 2
            int r4 = r2 + 1
            int r5 = r1.get(r8)
            if (r4 < r5) goto L45
            goto L7a
        L45:
            skm.x0[] r5 = r8.f323134a
            kotlin.jvm.internal.Intrinsics.h(r5)
            int r2 = r2 + 2
            int r6 = r1.get(r8)
            if (r2 >= r6) goto L63
            r6 = r5[r2]
            kotlin.jvm.internal.Intrinsics.h(r6)
            r7 = r5[r4]
            kotlin.jvm.internal.Intrinsics.h(r7)
            int r6 = r6.compareTo(r7)
            if (r6 >= 0) goto L63
            goto L64
        L63:
            r2 = r4
        L64:
            r4 = r5[r9]
            kotlin.jvm.internal.Intrinsics.h(r4)
            r5 = r5[r2]
            kotlin.jvm.internal.Intrinsics.h(r5)
            int r4 = r4.compareTo(r5)
            if (r4 > 0) goto L75
            goto L7a
        L75:
            r8.d(r9, r2)
            r9 = r2
            goto L3a
        L7a:
            int r9 = r1.get(r8)
            r9 = r0[r9]
            kotlin.jvm.internal.Intrinsics.h(r9)
            r2 = 0
            r9.c(r2)
            r9.f264018b = r3
            int r1 = r1.get(r8)
            r0[r1] = r2
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: zkm.z.b(int):skm.x0");
    }

    public final void c(int i) {
        while (i > 0) {
            x0[] x0VarArr = this.f323134a;
            Intrinsics.h(x0VarArr);
            int i2 = (i - 1) / 2;
            x0 x0Var = x0VarArr[i2];
            Intrinsics.h(x0Var);
            x0 x0Var2 = x0VarArr[i];
            Intrinsics.h(x0Var2);
            if (x0Var.compareTo(x0Var2) <= 0) {
                return;
            }
            d(i, i2);
            i = i2;
        }
    }

    public final void d(int i, int i2) {
        x0[] x0VarArr = this.f323134a;
        Intrinsics.h(x0VarArr);
        x0 x0Var = x0VarArr[i2];
        Intrinsics.h(x0Var);
        x0 x0Var2 = x0VarArr[i];
        Intrinsics.h(x0Var2);
        x0VarArr[i] = x0Var;
        x0VarArr[i2] = x0Var2;
        x0Var.f264018b = i;
        x0Var2.f264018b = i2;
    }
}
