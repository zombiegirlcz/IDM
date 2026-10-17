package vie;

import ft3.d1;
import ft3.j1;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import rfe.l;
import zhm.v;

/* JADX INFO: loaded from: classes8.dex */
public final class e implements l {

    @NotNull
    private static final d Companion = new d();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final List f289578b = v.k(new d1(j1.CREDIT_CARD, null, null), new d1(j1.BUY_NOW_PAY_LATER, null, null));

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final List f289579c = v.k(new d1(j1.FIXED_TERM_CREDIT, null, null), new d1(j1.MORTGAGE, null, null), new d1(j1.REFINANCING_MORTGAGE, null, null));

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final up3.b f289580a;

    public e(up3.b creditFeatureAvailabilityInteractor) {
        Intrinsics.checkNotNullParameter(creditFeatureAvailabilityInteractor, "creditFeatureAvailabilityInteractor");
        this.f289580a = creditFeatureAvailabilityInteractor;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0084 A[RETURN] */
    @Override // rfe.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean a(java.util.List r8) {
        /*
            r7 = this;
            r0 = 1
            if (r8 == 0) goto L85
            int r8 = r8.size()
            if (r8 > r0) goto L85
            java.util.List r8 = vie.e.f289579c
            java.lang.Iterable r8 = (java.lang.Iterable) r8
            boolean r1 = r8 instanceof java.util.Collection
            r2 = 0
            r3 = 0
            up3.b r4 = r7.f289580a
            if (r1 == 0) goto L20
            r1 = r8
            java.util.Collection r1 = (java.util.Collection) r1
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L20
            r1 = r3
            goto L43
        L20:
            java.util.Iterator r8 = r8.iterator()
            r1 = r3
        L25:
            boolean r5 = r8.hasNext()
            if (r5 == 0) goto L43
            java.lang.Object r5 = r8.next()
            ft3.d1 r5 = (ft3.d1) r5
            r6 = r4
            xq3.q r6 = (xq3.q) r6
            boolean r5 = r6.h(r5)
            if (r5 == 0) goto L25
            int r1 = r1 + 1
            if (r1 < 0) goto L3f
            goto L25
        L3f:
            zhm.v.r()
            throw r2
        L43:
            if (r1 <= 0) goto L47
        L45:
            r8 = r0
            goto L81
        L47:
            java.util.List r8 = vie.e.f289578b
            java.lang.Iterable r8 = (java.lang.Iterable) r8
            boolean r1 = r8 instanceof java.util.Collection
            if (r1 == 0) goto L5a
            r1 = r8
            java.util.Collection r1 = (java.util.Collection) r1
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L5a
            r1 = r3
            goto L7d
        L5a:
            java.util.Iterator r8 = r8.iterator()
            r1 = r3
        L5f:
            boolean r5 = r8.hasNext()
            if (r5 == 0) goto L7d
            java.lang.Object r5 = r8.next()
            ft3.d1 r5 = (ft3.d1) r5
            r6 = r4
            xq3.q r6 = (xq3.q) r6
            boolean r5 = r6.h(r5)
            if (r5 == 0) goto L5f
            int r1 = r1 + 1
            if (r1 < 0) goto L79
            goto L5f
        L79:
            zhm.v.r()
            throw r2
        L7d:
            if (r1 <= r0) goto L80
            goto L45
        L80:
            r8 = r3
        L81:
            if (r8 == 0) goto L84
            goto L85
        L84:
            return r3
        L85:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: vie.e.a(java.util.List):boolean");
    }
}
