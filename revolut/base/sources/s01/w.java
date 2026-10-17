package s01;

import android.view.View;

/* JADX INFO: loaded from: classes20.dex */
public final class w implements View.OnTouchListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public float f258809a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float f258810b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Boolean f258811c;
    public boolean d;

    /* JADX WARN: Removed duplicated region for block: B:30:0x0080  */
    @Override // android.view.View.OnTouchListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onTouch(android.view.View r6, android.view.MotionEvent r7) {
        /*
            r5 = this;
            java.lang.String r0 = "v"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            java.lang.String r0 = "event"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r0)
            int r0 = r7.getAction()
            r1 = 0
            r2 = 0
            r3 = 1
            if (r0 == 0) goto L8c
            if (r0 == r3) goto L80
            r4 = 2
            if (r0 == r4) goto L1d
            r7 = 3
            if (r0 == r7) goto L80
            goto Lb5
        L1d:
            boolean r0 = r5.d
            if (r0 == 0) goto L2a
            android.view.ViewParent r6 = r6.getParent()
            r6.requestDisallowInterceptTouchEvent(r3)
            goto Lb5
        L2a:
            java.lang.Boolean r0 = r5.f258811c
            if (r0 != 0) goto L5c
            float r0 = r7.getX()
            float r1 = r5.f258809a
            float r0 = r0 - r1
            float r0 = java.lang.Math.abs(r0)
            float r7 = r7.getY()
            float r1 = r5.f258810b
            float r7 = r7 - r1
            float r7 = java.lang.Math.abs(r7)
            r1 = 10
            float r1 = (float) r1
            int r4 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r4 > 0) goto L4f
            int r1 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r1 <= 0) goto L5c
        L4f:
            int r7 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r7 <= 0) goto L55
            r7 = r3
            goto L56
        L55:
            r7 = r2
        L56:
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r7)
            r5.f258811c = r7
        L5c:
            java.lang.Boolean r7 = r5.f258811c
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            boolean r7 = kotlin.jvm.internal.Intrinsics.f(r7, r0)
            if (r7 == 0) goto L6e
            android.view.ViewParent r6 = r6.getParent()
            r6.requestDisallowInterceptTouchEvent(r3)
            goto Lb5
        L6e:
            java.lang.Boolean r7 = r5.f258811c
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            boolean r7 = kotlin.jvm.internal.Intrinsics.f(r7, r0)
            if (r7 == 0) goto Lb5
            android.view.ViewParent r6 = r6.getParent()
            r6.requestDisallowInterceptTouchEvent(r2)
            goto Lb5
        L80:
            android.view.ViewParent r6 = r6.getParent()
            r6.requestDisallowInterceptTouchEvent(r2)
            r5.f258811c = r1
            r5.d = r2
            goto Lb5
        L8c:
            float r0 = r7.getX()
            r5.f258809a = r0
            float r0 = r7.getY()
            r5.f258810b = r0
            r5.f258811c = r1
            int r0 = r6.getWidth()
            float r7 = r7.getX()
            int r0 = r0 + (-150)
            float r0 = (float) r0
            int r7 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            if (r7 <= 0) goto Lab
            r7 = r3
            goto Lac
        Lab:
            r7 = r2
        Lac:
            r5.d = r7
            android.view.ViewParent r6 = r6.getParent()
            r6.requestDisallowInterceptTouchEvent(r3)
        Lb5:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: s01.w.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }
}
