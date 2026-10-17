package tv;

import com.revolut.camerakit.client.api.R$string;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import xv.q;

/* JADX INFO: loaded from: classes16.dex */
public final class h implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f274647a = R$string.autocapture_selfie_hint_position_your_face;

    /* JADX WARN: Removed duplicated region for block: B:105:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0165  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static tv.i d(java.util.ArrayList r7) {
        /*
            Method dump skipped, instruction units count: 454
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: tv.h.d(java.util.ArrayList):tv.i");
    }

    public static i e(int i, int i2) {
        return new i(Integer.valueOf(i), Integer.valueOf(i2), m.PROBLEM, 8);
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0069 A[PHI: r6
      0x0069: PHI (r6v4 java.lang.Integer) = (r6v3 java.lang.Integer), (r6v5 java.lang.Integer) binds: [B:30:0x0071, B:26:0x0066] A[DONT_GENERATE, DONT_INLINE]] */
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
            boolean r0 = i2b.a.n(r6)
            r1 = 8
            r2 = 0
            if (r0 == 0) goto L20
            if (r8 == 0) goto L20
            if (r7 == 0) goto L20
            tv.i r6 = new tv.i
            int r7 = com.revolut.camerakit.client.api.R$string.autocapture_general_hint_tap_shutter_button
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            tv.m r8 = tv.m.GUIDANCE
            r6.<init>(r7, r2, r8, r1)
            return r6
        L20:
            java.lang.Iterable r8 = r6.a()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r8 = r8.iterator()
        L2d:
            boolean r3 = r8.hasNext()
            if (r3 == 0) goto L44
            java.lang.Object r3 = r8.next()
            r4 = r3
            xv.q r4 = (xv.q) r4
            boolean r4 = r4.d()
            if (r4 != 0) goto L2d
            r0.add(r3)
            goto L2d
        L44:
            tv.i r8 = d(r0)
            if (r8 == 0) goto L53
            java.lang.Integer r0 = r8.f274648a
            if (r0 == 0) goto L53
            int r0 = r0.intValue()
            goto L55
        L53:
            int r0 = r5.f274647a
        L55:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            boolean r6 = i2b.a.n(r6)
            if (r6 == 0) goto L62
            if (r7 == 0) goto L62
            goto L74
        L62:
            if (r8 == 0) goto L6b
            java.lang.Integer r6 = r8.f274649b
            if (r6 != 0) goto L69
            goto L6b
        L69:
            r2 = r6
            goto L74
        L6b:
            int r6 = com.revolut.camerakit.client.api.R$string.autocapture_general_hint_and_tap_shutter_button_suggestion
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            if (r7 == 0) goto L74
            goto L69
        L74:
            if (r8 == 0) goto L7a
            tv.m r6 = r8.f274650c
            if (r6 != 0) goto L7c
        L7a:
            tv.m r6 = tv.m.GUIDANCE
        L7c:
            tv.i r7 = new tv.i
            r7.<init>(r0, r2, r6, r1)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: tv.h.a(xv.l, boolean, boolean):tv.i");
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
        i iVarD = d(arrayList);
        return new i(Integer.valueOf((iVarD == null || (num2 = iVarD.f274648a) == null) ? R$string.autocapture_selfie_hint_you_moved : num2.intValue()), Integer.valueOf((iVarD == null || (num = iVarD.f274649b) == null) ? R$string.autocapture_selfie_hint_you_moved_suggestion : num.intValue()), m.PROBLEM, 8);
    }

    @Override // tv.j
    public final i c() {
        return new i(Integer.valueOf(R$string.autocapture_selfie_hint_hold_still), (Integer) null, m.GUIDANCE, 10);
    }
}
