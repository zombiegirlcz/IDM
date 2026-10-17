package com.revolut.analytics.tracking.v3;

import kotlin.jvm.internal.Intrinsics;
import uo.q0;

/* JADX INFO: loaded from: classes.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final mo.c f50335a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final uo.l f50336b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final q0 f50337c;

    public k(mo.c ownerProvider, uo.l productMapper, q0 screenNameFinder) {
        Intrinsics.checkNotNullParameter(ownerProvider, "ownerProvider");
        Intrinsics.checkNotNullParameter(productMapper, "productMapper");
        Intrinsics.checkNotNullParameter(screenNameFinder, "screenNameFinder");
        this.f50335a = ownerProvider;
        this.f50336b = productMapper;
        this.f50337c = screenNameFinder;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x004a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final com.google.protobuf.w0 a(com.revolut.analytics.tracking.v3.k r4, java.lang.Object r5) {
        /*
            com.revolut.analytics.tracking.v3.AnalyticsMetadata$b r4 = com.revolut.analytics.tracking.v3.AnalyticsMetadata.INSTANCE
            boolean r0 = r5 instanceof androidx.fragment.app.Fragment
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L24
            r0 = r5
            androidx.fragment.app.Fragment r0 = (androidx.fragment.app.Fragment) r0
            boolean r3 = b(r0)
            if (r3 != 0) goto L22
            androidx.fragment.app.FragmentActivity r0 = r0.getActivity()
            if (r0 == 0) goto L1c
            boolean r0 = b(r0)
            goto L1d
        L1c:
            r0 = r2
        L1d:
            if (r0 == 0) goto L20
            goto L22
        L20:
            r0 = r2
            goto L3b
        L22:
            r0 = r1
            goto L3b
        L24:
            boolean r0 = r5 instanceof com.revolut.kompot.navigable.a
            if (r0 == 0) goto L37
            r0 = r5
            com.revolut.kompot.navigable.a r0 = (com.revolut.kompot.navigable.a) r0
        L2b:
            if (r0 == 0) goto L20
            boolean r3 = b(r0)
            if (r3 == 0) goto L34
            goto L22
        L34:
            com.revolut.kompot.navigable.a r0 = r0.f98405m
            goto L2b
        L37:
            boolean r0 = b(r5)
        L3b:
            if (r0 == 0) goto L3e
            goto L78
        L3e:
            java.lang.String r0 = "screen"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            android.view.View r5 = rd0.e.k(r5)
            if (r5 != 0) goto L4c
        L4a:
            r1 = r2
            goto L78
        L4c:
            j5l.a r0 = j5l.a.f171648a
            java.lang.String r1 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r1)
            java.lang.String r0 = "view"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            android.content.Context r5 = r5.getContext()
            if (r5 == 0) goto L4a
            android.app.Activity r5 = z92.f.i(r5)
            if (r5 != 0) goto L66
            goto L4a
        L66:
            java.lang.String r0 = "activity"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            java.util.WeakHashMap r0 = j5l.a.f171649b
            java.lang.Object r5 = r0.get(r5)
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            boolean r5 = kotlin.jvm.internal.Intrinsics.f(r5, r0)
            r1 = r5
        L78:
            com.google.protobuf.w0 r4 = eo.a.a(r4, r1)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.analytics.tracking.v3.k.a(com.revolut.analytics.tracking.v3.k, java.lang.Object):com.google.protobuf.w0");
    }

    public static boolean b(Object obj2) {
        in0.g gVar = obj2 instanceof in0.g ? (in0.g) obj2 : null;
        return gVar != null && gVar.p0();
    }
}
