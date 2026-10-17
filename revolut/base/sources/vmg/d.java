package vmg;

import do3.h;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import le.u1;
import zhm.r0;

/* JADX INFO: loaded from: classes9.dex */
public abstract class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Object f290577a = r0.k(new Pair("INACTIVE", do3.g.INACTIVE), new Pair("ACTIVE", do3.g.ACTIVE), new Pair("GRACE_PERIOD", do3.g.GRACE_PERIOD), new Pair("EXPIRED", do3.g.EXPIRED));

    /* JADX WARN: Removed duplicated region for block: B:13:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final do3.h a(dng.d r6) {
        /*
            if (r6 == 0) goto L24
            java.lang.String r6 = r6.getState()
            if (r6 == 0) goto L24
            do3.g[] r0 = do3.g.values()
            int r1 = r0.length
            r2 = 0
        Le:
            if (r2 >= r1) goto L21
            r3 = r0[r2]
            java.lang.String r4 = r3.name()
            r5 = 1
            boolean r4 = kotlin.text.a0.z(r4, r6, r5)
            if (r4 == 0) goto L1e
            goto L22
        L1e:
            int r2 = r2 + 1
            goto Le
        L21:
            r3 = 0
        L22:
            if (r3 != 0) goto L26
        L24:
            do3.g r3 = do3.g.INACTIVE
        L26:
            do3.h r6 = new do3.h
            r6.<init>(r3)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: vmg.d.a(dng.d):do3.h");
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final do3.h b(jng.d r6) {
        /*
            if (r6 == 0) goto L24
            java.lang.String r6 = r6.getState()
            if (r6 == 0) goto L24
            do3.g[] r0 = do3.g.values()
            int r1 = r0.length
            r2 = 0
        Le:
            if (r2 >= r1) goto L21
            r3 = r0[r2]
            java.lang.String r4 = r3.name()
            r5 = 1
            boolean r4 = kotlin.text.a0.z(r4, r6, r5)
            if (r4 == 0) goto L1e
            goto L22
        L1e:
            int r2 = r2 + 1
            goto Le
        L21:
            r3 = 0
        L22:
            if (r3 != 0) goto L26
        L24:
            do3.g r3 = do3.g.INACTIVE
        L26:
            do3.h r6 = new do3.h
            r6.<init>(r3)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: vmg.d.b(jng.d):do3.h");
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, java.util.Map] */
    public static final jng.d c(h hVar) {
        Intrinsics.checkNotNullParameter(hVar, "<this>");
        return new jng.d(u1.g(hVar.f116401a, f290577a));
    }
}
