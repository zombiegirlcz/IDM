package fl1;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.revolut.feature.alipay_plus.mpm.webcontainer.APMPMContainerPresenter;
import com.revolut.feature.alipay_plus.mpm.webcontainer.APMPMWebContainerErrorPage;
import com.revolut.feature.alipay_plus.mpm.webcontainer.APMPMWebContainerParams;
import java.io.File;
import kl.c0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.d0;

/* JADX INFO: loaded from: classes20.dex */
public final class c implements APMPMContainerPresenter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public volatile boolean f135881a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f135882b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f135883c;
    public final Object d;
    public final Object e;
    public final Object f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Object f135884g;

    public c(APMPMWebContainerParams params, d contextProvider, d webViewProvider, APMPMWebContainerErrorPage errorPage, d closeAction) {
        Intrinsics.checkNotNullParameter(params, "params");
        Intrinsics.checkNotNullParameter(contextProvider, "contextProvider");
        Intrinsics.checkNotNullParameter(webViewProvider, "webViewProvider");
        Intrinsics.checkNotNullParameter(errorPage, "errorPage");
        Intrinsics.checkNotNullParameter(closeAction, "closeAction");
        this.f135882b = params;
        this.f135883c = contextProvider;
        this.d = webViewProvider;
        this.e = errorPage;
        this.f = closeAction;
        this.f135884g = new Handler(Looper.getMainLooper());
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0087, code lost:
    
        if (r10 == r2) goto L29;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object a(java.lang.String r9, gim.c r10) throws java.lang.Throwable {
        /*
            r8 = this;
            java.lang.Object r0 = r8.d
            kyl.j r0 = (kyl.j) r0
            boolean r1 = r10 instanceof kyl.a
            if (r1 == 0) goto L17
            r1 = r10
            kyl.a r1 = (kyl.a) r1
            int r2 = r1.f191008x
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L17
            int r2 = r2 - r3
            r1.f191008x = r2
            goto L1c
        L17:
            kyl.a r1 = new kyl.a
            r1.<init>(r8, r10)
        L1c:
            java.lang.Object r10 = r1.v
            fim.a r2 = fim.a.COROUTINE_SUSPENDED
            int r3 = r1.f191008x
            java.lang.String r4 = "key"
            r5 = 2
            r6 = 1
            r7 = 0
            if (r3 == 0) goto L41
            if (r3 == r6) goto L3b
            if (r3 != r5) goto L33
            java.lang.String r9 = r1.u
            yhm.o.b(r10)
            goto L8a
        L33:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L3b:
            java.lang.String r9 = r1.u
            yhm.o.b(r10)
            goto L5d
        L41:
            yhm.o.b(r10)
            r1.u = r9
            r1.f191008x = r6
            jyl.f r10 = new jyl.f
            r10.<init>(r8, r7)
            skm.p0 r3 = skm.p0.f264001a
            elm.f r3 = elm.f.f127540b
            java.lang.Object r10 = skm.e0.J(r3, r10, r1)
            if (r10 != r2) goto L58
            goto L5a
        L58:
            kotlin.Unit r10 = kotlin.Unit.f186387a
        L5a:
            if (r10 != r2) goto L5d
            goto L89
        L5d:
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r4)
            java.lang.Object r10 = r0.c(r9)
            java.lang.ref.WeakReference r10 = (java.lang.ref.WeakReference) r10
            if (r10 == 0) goto L6f
            java.lang.Object r10 = r10.get()
            android.graphics.Bitmap r10 = (android.graphics.Bitmap) r10
            goto L70
        L6f:
            r10 = r7
        L70:
            if (r10 != 0) goto La0
            java.lang.Object r10 = r8.f135883c
            kyl.i r10 = (kyl.i) r10
            r1.u = r9
            r1.f191008x = r5
            a41.j1 r3 = new a41.j1
            r3.<init>(r10, r9, r7)
            skm.p0 r10 = skm.p0.f264001a
            elm.f r10 = elm.f.f127540b
            java.lang.Object r10 = skm.e0.J(r10, r3, r1)
            if (r10 != r2) goto L8a
        L89:
            return r2
        L8a:
            android.graphics.Bitmap r10 = (android.graphics.Bitmap) r10
            if (r10 == 0) goto L9f
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r4)
            java.lang.String r1 = "bitmap"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r10, r1)
            java.lang.ref.WeakReference r1 = new java.lang.ref.WeakReference
            r1.<init>(r10)
            r0.d(r9, r1)
            return r10
        L9f:
            return r7
        La0:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: fl1.c.a(java.lang.String, gim.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x007d, code lost:
    
        if (r9.d(r7, r8, r0) == r1) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object b(java.lang.String r7, android.graphics.Bitmap r8, gim.c r9) throws java.lang.Throwable {
        /*
            r6 = this;
            boolean r0 = r9 instanceof kyl.b
            if (r0 == 0) goto L13
            r0 = r9
            kyl.b r0 = (kyl.b) r0
            int r1 = r0.f191011y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f191011y = r1
            goto L18
        L13:
            kyl.b r0 = new kyl.b
            r0.<init>(r6, r9)
        L18:
            java.lang.Object r9 = r0.f191009w
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f191011y
            r3 = 0
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L3b
            if (r2 == r5) goto L33
            if (r2 != r4) goto L2b
            yhm.o.b(r9)
            goto L80
        L2b:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L33:
            android.graphics.Bitmap r8 = r0.v
            java.lang.String r7 = r0.u
            yhm.o.b(r9)
            goto L59
        L3b:
            yhm.o.b(r9)
            r0.u = r7
            r0.v = r8
            r0.f191011y = r5
            jyl.f r9 = new jyl.f
            r9.<init>(r6, r3)
            skm.p0 r2 = skm.p0.f264001a
            elm.f r2 = elm.f.f127540b
            java.lang.Object r9 = skm.e0.J(r2, r9, r0)
            if (r9 != r1) goto L54
            goto L56
        L54:
            kotlin.Unit r9 = kotlin.Unit.f186387a
        L56:
            if (r9 != r1) goto L59
            goto L7f
        L59:
            java.lang.Object r9 = r6.d
            kyl.j r9 = (kyl.j) r9
            java.lang.String r2 = "key"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r2)
            java.lang.String r2 = "bitmap"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r2)
            java.lang.ref.WeakReference r2 = new java.lang.ref.WeakReference
            r2.<init>(r8)
            r9.d(r7, r2)
            java.lang.Object r9 = r6.f135883c
            kyl.i r9 = (kyl.i) r9
            r0.u = r3
            r0.v = r3
            r0.f191011y = r4
            java.lang.Object r7 = r9.d(r7, r8, r0)
            if (r7 != r1) goto L80
        L7f:
            return r1
        L80:
            kotlin.Unit r7 = kotlin.Unit.f186387a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: fl1.c.b(java.lang.String, android.graphics.Bitmap, gim.c):java.lang.Object");
    }

    @Override // com.revolut.feature.alipay_plus.mpm.webcontainer.APMPMContainerPresenter
    public void closeWebView() {
        if (this.f135881a) {
            return;
        }
        d dVar = (d) this.f;
        Looper looperMyLooper = Looper.myLooper();
        Handler handler = (Handler) this.f135884g;
        if (Intrinsics.f(looperMyLooper, handler.getLooper())) {
            dVar.invoke();
        } else {
            handler.post(new a3l.c(3, dVar));
        }
    }

    @Override // com.revolut.feature.alipay_plus.mpm.webcontainer.APMPMContainerPresenter
    public Context getContext() {
        return (Context) ((d) this.f135883c).invoke();
    }

    @Override // com.revolut.feature.alipay_plus.mpm.webcontainer.APMPMContainerPresenter
    public void loadUrl(String url2) {
        Intrinsics.checkNotNullParameter(url2, "url");
        if (this.f135881a) {
            return;
        }
        if (d0.W(url2)) {
            ((APMPMWebContainerErrorPage) this.e).showIfNeeded(url2, -1);
            return;
        }
        fb6.j jVar = new fb6.j(this, url2, 11);
        Looper looperMyLooper = Looper.myLooper();
        Handler handler = (Handler) this.f135884g;
        if (Intrinsics.f(looperMyLooper, handler.getLooper())) {
            jVar.invoke();
        } else {
            handler.post(new a3l.c(3, jVar));
        }
    }

    @Override // com.revolut.feature.alipay_plus.mpm.webcontainer.APMPMContainerPresenter
    public APMPMWebContainerParams params() {
        return (APMPMWebContainerParams) this.f135882b;
    }

    public c(File file, kyl.i diskCache, kyl.j memoryCache, c0 checkSumCache) {
        lyl.a hashCalculator = new lyl.a();
        Intrinsics.checkNotNullParameter(file, "file");
        Intrinsics.checkNotNullParameter(diskCache, "diskCache");
        Intrinsics.checkNotNullParameter(memoryCache, "memoryCache");
        Intrinsics.checkNotNullParameter(checkSumCache, "checkSumCache");
        Intrinsics.checkNotNullParameter(hashCalculator, "hashCalculator");
        this.f135882b = file;
        this.f135883c = diskCache;
        this.d = memoryCache;
        this.e = checkSumCache;
        this.f = hashCalculator;
        this.f135884g = hlm.d.a();
    }
}
