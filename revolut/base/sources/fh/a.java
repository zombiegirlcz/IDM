package fh;

import android.graphics.Rect;
import com.google.android.gms.internal.mlkit_vision_barcode.zzu;
import com.google.android.gms.internal.mlkit_vision_barcode.zzvj;
import hh.k;

/* JADX INFO: loaded from: classes17.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k f135117a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Rect f135118b;

    /* JADX WARN: Removed duplicated region for block: B:11:0x0049  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public a(hh.k r9, android.graphics.Matrix r10) {
        /*
            r8 = this;
            r8.<init>()
            java.lang.Object r0 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r9)
            hh.k r0 = (hh.k) r0
            r8.f135117a = r0
            int r0 = r9.f152211a
            switch(r0) {
                case 0: goto L4b;
                default: goto L10;
            }
        L10:
            com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable r0 = r9.f152212b
            com.google.android.gms.internal.mlkit_vision_barcode.zzu r0 = (com.google.android.gms.internal.mlkit_vision_barcode.zzu) r0
            android.graphics.Point[] r1 = r0.f42466zze
            if (r1 == 0) goto L49
            r1 = 0
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = 2147483647(0x7fffffff, float:NaN)
            r4 = r3
            r5 = r4
            r3 = r2
        L21:
            android.graphics.Point[] r6 = r0.f42466zze
            int r7 = r6.length
            if (r1 >= r7) goto L43
            r6 = r6[r1]
            int r7 = r6.x
            int r4 = java.lang.Math.min(r4, r7)
            int r7 = r6.x
            int r2 = java.lang.Math.max(r2, r7)
            int r7 = r6.y
            int r5 = java.lang.Math.min(r5, r7)
            int r6 = r6.y
            int r3 = java.lang.Math.max(r3, r6)
            int r1 = r1 + 1
            goto L21
        L43:
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>(r4, r5, r2, r3)
            goto L83
        L49:
            r0 = 0
            goto L83
        L4b:
            com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable r0 = r9.f152212b
            com.google.android.gms.internal.mlkit_vision_barcode.zzvj r0 = (com.google.android.gms.internal.mlkit_vision_barcode.zzvj) r0
            android.graphics.Point[] r0 = r0.zzo()
            if (r0 == 0) goto L49
            r1 = 0
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = 2147483647(0x7fffffff, float:NaN)
            r4 = r3
            r5 = r4
            r3 = r2
        L5e:
            int r6 = r0.length
            if (r1 >= r6) goto L7e
            r6 = r0[r1]
            int r7 = r6.x
            int r4 = java.lang.Math.min(r4, r7)
            int r7 = r6.x
            int r2 = java.lang.Math.max(r2, r7)
            int r7 = r6.y
            int r5 = java.lang.Math.min(r5, r7)
            int r6 = r6.y
            int r3 = java.lang.Math.max(r3, r6)
            int r1 = r1 + 1
            goto L5e
        L7e:
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>(r4, r5, r2, r3)
        L83:
            if (r0 == 0) goto L8a
            if (r10 == 0) goto L8a
            xam.a.I(r0, r10)
        L8a:
            r8.f135118b = r0
            int r0 = r9.f152211a
            switch(r0) {
                case 0: goto L98;
                default: goto L91;
            }
        L91:
            com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable r9 = r9.f152212b
            com.google.android.gms.internal.mlkit_vision_barcode.zzu r9 = (com.google.android.gms.internal.mlkit_vision_barcode.zzu) r9
            android.graphics.Point[] r9 = r9.f42466zze
            goto La0
        L98:
            com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable r9 = r9.f152212b
            com.google.android.gms.internal.mlkit_vision_barcode.zzvj r9 = (com.google.android.gms.internal.mlkit_vision_barcode.zzvj) r9
            android.graphics.Point[] r9 = r9.zzo()
        La0:
            if (r9 == 0) goto La7
            if (r10 == 0) goto La7
            xam.a.G(r9, r10)
        La7:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: fh.a.<init>(hh.k, android.graphics.Matrix):void");
    }

    public final int a() {
        int iZza;
        k kVar = this.f135117a;
        switch (kVar.f152211a) {
            case 0:
                iZza = ((zzvj) kVar.f152212b).zza();
                break;
            default:
                iZza = ((zzu) kVar.f152212b).f42462zza;
                break;
        }
        if (iZza > 4096 || iZza == 0) {
            return -1;
        }
        return iZza;
    }

    public final int b() {
        return this.f135117a.b();
    }
}
