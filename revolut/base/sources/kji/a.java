package kji;

/* JADX INFO: loaded from: classes10.dex */
public abstract class a {
    /* JADX WARN: Code restructure failed: missing block: B:21:0x001b, code lost:
    
        r0 = null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(com.revolut.kompot.navigable.vc.ViewController r3, dq0.b[] r4) {
        /*
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            java.lang.String r0 = "callbacks"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            android.view.View r3 = r3.D2()
            android.view.ViewParent r0 = r3.getParent()
            boolean r1 = r0 instanceof android.view.View
            r2 = 0
            if (r1 == 0) goto L1a
            android.view.View r0 = (android.view.View) r0
            goto L1b
        L1a:
            r0 = r2
        L1b:
            if (r0 == 0) goto L52
            boolean r1 = r0 instanceof hli.e
            if (r1 == 0) goto L47
            r1 = r0
            hli.e r1 = (hli.e) r1
            boolean r1 = r1.getFitNavigationBar()
            if (r1 == 0) goto L47
            od0.a r3 = od0.a.f224253a
            boolean r3 = od0.a.e()
            if (r3 != 0) goto L33
            return
        L33:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r1 = "'fitNavigationBar' must be 'false' for all parent controllers and views. Violation found at "
            r4.<init>(r1)
            r4.append(r0)
            java.lang.String r4 = r4.toString()
            r3.<init>(r4)
            throw r3
        L47:
            android.view.ViewParent r0 = r0.getParent()
            boolean r1 = r0 instanceof android.view.View
            if (r1 == 0) goto L1a
            android.view.View r0 = (android.view.View) r0
            goto L1b
        L52:
            dq0.c r0 = new dq0.c
            int r1 = androidx.core.view.WindowInsetsCompat.Type.systemBars()
            int r2 = androidx.core.view.WindowInsetsCompat.Type.ime()
            java.util.List r4 = kotlin.collections.d.v0(r4)
            r0.<init>(r1, r2, r4)
            androidx.core.view.ViewCompat.setWindowInsetsAnimationCallback(r3, r0)
            androidx.core.view.ViewCompat.setOnApplyWindowInsetsListener(r3, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kji.a.a(com.revolut.kompot.navigable.vc.ViewController, dq0.b[]):void");
    }
}
