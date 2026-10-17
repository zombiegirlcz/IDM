package iyl;

import android.view.View;
import android.webkit.WebView;

/* JADX INFO: loaded from: classes12.dex */
public final /* synthetic */ class b implements View.OnTouchListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f169783a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ WebView f169784b;

    public /* synthetic */ b(WebView webView, int i) {
        this.f169783a = i;
        this.f169784b = webView;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0029  */
    @Override // android.view.View.OnTouchListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onTouch(android.view.View r4, android.view.MotionEvent r5) {
        /*
            r3 = this;
            int r4 = r3.f169783a
            r0 = 0
            r1 = 1
            android.webkit.WebView r2 = r3.f169784b
            switch(r4) {
                case 0: goto L37;
                case 1: goto L31;
                case 2: goto Lf;
                default: goto L9;
            }
        L9:
            kotlin.reflect.KProperty[] r4 = com.revolut.feature.credit.application.plugins.impl.ui.kontomatik.sign_in.KontomatikSignInController.U
            r2.requestDisallowInterceptTouchEvent(r1)
            return r0
        Lf:
            kotlin.reflect.KProperty[] r4 = com.revolut.feature.credit.application.plugins.impl.ui.kontomatik.external_bank_sign_in.KontomatikExternalBankSignInController.S
            int r4 = r5.getAction()
            if (r4 == 0) goto L2d
            if (r4 == r1) goto L29
            r5 = 2
            if (r4 == r5) goto L20
            r5 = 3
            if (r4 == r5) goto L29
            goto L30
        L20:
            r4 = -1
            boolean r4 = r2.canScrollVertically(r4)
            r2.requestDisallowInterceptTouchEvent(r4)
            goto L30
        L29:
            r2.requestDisallowInterceptTouchEvent(r0)
            goto L30
        L2d:
            r2.requestDisallowInterceptTouchEvent(r1)
        L30:
            return r0
        L31:
            kotlin.reflect.KProperty[] r4 = com.revolut.feature.credit.application.plugins.impl.ui.rollee.RolleeScreen.T
            r2.requestDisallowInterceptTouchEvent(r1)
            return r0
        L37:
            int r4 = iyl.c.f169785s
            r2.requestDisallowInterceptTouchEvent(r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: iyl.b.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }
}
