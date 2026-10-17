package tv;

import com.revolut.camerakit.client.api.R$string;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import xv.q;

/* JADX INFO: loaded from: classes16.dex */
public abstract class c implements j {
    /* JADX WARN: Removed duplicated region for block: B:109:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x01ab  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x016b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static tv.i e(java.util.ArrayList r7, tv.i r8) {
        /*
            Method dump skipped, instruction units count: 457
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: tv.c.e(java.util.ArrayList, tv.i):tv.i");
    }

    public static i f(int i, int i2) {
        return new i(Integer.valueOf(i), Integer.valueOf(i2), m.PROBLEM, 8);
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0092 A[PHI: r6
      0x0092: PHI (r6v4 java.lang.Integer) = (r6v3 java.lang.Integer), (r6v5 java.lang.Integer) binds: [B:35:0x009a, B:31:0x008f] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // tv.j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final tv.i a(xv.l r6, boolean r7, boolean r8) {
        /*
            r5 = this;
            java.lang.String r0 = "detectorResult"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            java.lang.Iterable r0 = r6.a()
            java.util.Iterator r0 = r0.iterator()
        Ld:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L1d
            java.lang.Object r1 = r0.next()
            xv.q r1 = (xv.q) r1
            boolean r1 = r1 instanceof l00.b
            if (r1 == 0) goto Ld
        L1d:
            boolean r0 = i2b.a.n(r6)
            r1 = 10
            r2 = 0
            if (r0 == 0) goto L38
            if (r8 == 0) goto L38
            if (r7 == 0) goto L38
            tv.i r6 = new tv.i
            int r7 = com.revolut.camerakit.client.api.R$string.autocapture_general_hint_tap_shutter_button
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            tv.m r8 = tv.m.GUIDANCE
            r6.<init>(r7, r2, r8, r1)
            return r6
        L38:
            java.lang.Iterable r8 = r6.a()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r8 = r8.iterator()
        L45:
            boolean r3 = r8.hasNext()
            if (r3 == 0) goto L5c
            java.lang.Object r3 = r8.next()
            r4 = r3
            xv.q r4 = (xv.q) r4
            boolean r4 = r4.d()
            if (r4 != 0) goto L45
            r0.add(r3)
            goto L45
        L5c:
            tv.i r8 = new tv.i
            int r3 = r5.d()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            tv.m r4 = tv.m.GUIDANCE
            r8.<init>(r3, r2, r4, r1)
            tv.i r8 = e(r0, r8)
            if (r8 == 0) goto L7a
            java.lang.Integer r0 = r8.f274648a
            if (r0 == 0) goto L7a
            int r0 = r0.intValue()
            goto L7e
        L7a:
            int r0 = r5.d()
        L7e:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            boolean r6 = i2b.a.n(r6)
            if (r6 == 0) goto L8b
            if (r7 == 0) goto L8b
            goto L9d
        L8b:
            if (r8 == 0) goto L94
            java.lang.Integer r6 = r8.f274649b
            if (r6 != 0) goto L92
            goto L94
        L92:
            r2 = r6
            goto L9d
        L94:
            int r6 = com.revolut.camerakit.client.api.R$string.autocapture_general_hint_and_tap_shutter_button_suggestion
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            if (r7 == 0) goto L9d
            goto L92
        L9d:
            if (r8 == 0) goto La5
            tv.m r6 = r8.f274650c
            if (r6 != 0) goto La4
            goto La5
        La4:
            r4 = r6
        La5:
            tv.i r6 = new tv.i
            r7 = 8
            r6.<init>(r0, r2, r4, r7)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: tv.c.a(xv.l, boolean, boolean):tv.i");
    }

    @Override // tv.j
    public final i b(xv.l detectorResult) {
        Integer num;
        Integer num2;
        Intrinsics.checkNotNullParameter(detectorResult, "detectorResult");
        Iterable iterableA = detectorResult.a();
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : iterableA) {
            if (!((q) obj2).d()) {
                arrayList.add(obj2);
            }
        }
        i iVarE = e(arrayList, new i(Integer.valueOf(R$string.autocapture_document_hint_you_moved), (Integer) null, (m) null, 14));
        return new i(Integer.valueOf((iVarE == null || (num2 = iVarE.f274648a) == null) ? R$string.autocapture_document_hint_you_moved : num2.intValue()), Integer.valueOf((iVarE == null || (num = iVarE.f274649b) == null) ? R$string.autocapture_document_hint_you_moved_suggestion : num.intValue()), m.PROBLEM, 8);
    }

    @Override // tv.j
    public i c() {
        return new i(Integer.valueOf(R$string.autocapture_document_hint_hold_still), (Integer) null, m.GUIDANCE, 10);
    }

    public abstract int d();
}
