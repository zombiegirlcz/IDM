package yt0;

import com.google.android.material.bottomsheet.BottomSheetBehavior;

/* JADX INFO: loaded from: classes19.dex */
public final class d extends BottomSheetBehavior.BottomSheetCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ j f316527a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h f316528b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ BottomSheetBehavior f316529c;

    public d(j jVar, h hVar, BottomSheetBehavior bottomSheetBehavior) {
        this.f316527a = jVar;
        this.f316528b = hVar;
        this.f316529c = bottomSheetBehavior;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0090  */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.BottomSheetCallback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onSlide(android.view.View r9, float r10) {
        /*
            r8 = this;
            java.lang.String r0 = "bottomSheet"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r0)
            yt0.h r1 = r8.f316528b
            com.revolut.core.ui_kit.views.o r2 = r1.f316561a
            r3 = 0
            r4 = 1065353216(0x3f800000, float:1.0)
            float r5 = kotlin.ranges.f.f(r10, r3, r4)
            r6 = 0
            r1.s(r5, r6)
            java.lang.Object r5 = jo0.g.k
            java.lang.Object r5 = r5.getValue()
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
            if (r5 != 0) goto L4c
            java.util.List r5 = r2.getFooterViews()
            r7 = 0
            java.lang.Object r5 = zhm.d0.e0(r7, r5)
            android.view.View r5 = (android.view.View) r5
            if (r5 == 0) goto L4c
            int r7 = r1.f316550t
            if (r7 != 0) goto L39
            int r7 = r5.getTop()
            r1.f316550t = r7
        L39:
            int r2 = r2.getHeight()
            com.google.android.material.bottomsheet.BottomSheetBehavior r7 = r8.f316529c
            int r7 = r7.getPeekHeight()
            float r7 = ix0.i1.c(r10, r7, r2)
            float r2 = (float) r2
            float r7 = r7 - r2
            r5.setTranslationY(r7)
        L4c:
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r0)
            yt0.j r0 = r8.f316527a
            boolean r2 = r0.d()
            if (r2 == 0) goto La6
            mx0.da r2 = r0.f316568b
            boolean r5 = r2 instanceof mx0.ca
            if (r5 == 0) goto L60
            mx0.ca r2 = (mx0.ca) r2
            goto L61
        L60:
            r2 = r6
        L61:
            if (r2 != 0) goto L64
            goto L68
        L64:
            java.lang.Float r5 = r2.f209641c
            if (r5 != 0) goto L6a
        L68:
            r9 = r10
            goto L9d
        L6a:
            android.view.ViewParent r5 = r9.getParent()
            boolean r7 = r5 instanceof android.view.View
            if (r7 == 0) goto L75
            r6 = r5
            android.view.View r6 = (android.view.View) r6
        L75:
            if (r6 == 0) goto L90
            int r5 = r6.getHeight()
            float r5 = (float) r5
            float r2 = r2.f209640b
            float r2 = r4 - r2
            float r2 = r2 * r5
            com.google.android.material.bottomsheet.BottomSheetBehavior r5 = com.google.android.material.bottomsheet.BottomSheetBehavior.from(r9)
            int r5 = r5.getExpandedOffset()
            float r5 = (float) r5
            float r5 = r2 - r5
            int r6 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r6 > 0) goto L92
        L90:
            r9 = r3
            goto L9d
        L92:
            int r9 = r9.getTop()
            float r9 = (float) r9
            float r2 = r2 - r9
            float r2 = r2 / r5
            float r9 = kotlin.ranges.f.f(r2, r3, r4)
        L9d:
            float r9 = kotlin.ranges.f.f(r9, r3, r4)
            r0.e = r9
            r0.b(r9)
        La6:
            r1.f316552x = r10
            java.util.ArrayList r9 = r1.f316553y
            java.util.Iterator r9 = r9.iterator()
        Lae:
            boolean r0 = r9.hasNext()
            if (r0 == 0) goto Lbe
            java.lang.Object r0 = r9.next()
            ek2.g r0 = (ek2.g) r0
            r0.a(r10)
            goto Lae
        Lbe:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: yt0.d.onSlide(android.view.View, float):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001e  */
    @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.BottomSheetCallback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onStateChanged(android.view.View r13, int r14) {
        /*
            Method dump skipped, instruction units count: 530
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: yt0.d.onStateChanged(android.view.View, int):void");
    }
}
