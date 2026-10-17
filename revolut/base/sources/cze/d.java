package cze;

import android.app.Activity;
import kotlin.jvm.internal.Intrinsics;
import kotlin.time.b;
import org.jetbrains.annotations.NotNull;
import pkm.e;

/* JADX INFO: loaded from: classes8.dex */
public final class d {

    @NotNull
    public static final a Companion = new a();
    public static final long d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Activity f110228a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final wwh.a f110229b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final rve.d f110230c;

    static {
        b.Companion companion = kotlin.time.b.INSTANCE;
        d = kotlin.time.c.g(2, e.SECONDS);
    }

    public d(Activity activity, wwh.a cpgInteractor, rve.d cardTopUpInteractor) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(cpgInteractor, "cpgInteractor");
        Intrinsics.checkNotNullParameter(cardTopUpInteractor, "cardTopUpInteractor");
        this.f110228a = activity;
        this.f110229b = cpgInteractor;
        this.f110230c = cardTopUpInteractor;
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.io.Serializable a(cue.d r17, gim.c r18) throws java.lang.Throwable {
        /*
            r16 = this;
            r1 = r16
            r3 = r17
            r0 = r18
            boolean r2 = r0 instanceof cze.b
            if (r2 == 0) goto L1a
            r2 = r0
            cze.b r2 = (cze.b) r2
            int r4 = r2.f110225x
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = r4 & r5
            if (r6 == 0) goto L1a
            int r4 = r4 - r5
            r2.f110225x = r4
        L18:
            r7 = r2
            goto L20
        L1a:
            cze.b r2 = new cze.b
            r2.<init>(r1, r0)
            goto L18
        L20:
            java.lang.Object r0 = r7.v
            fim.a r8 = fim.a.COROUTINE_SUSPENDED
            int r2 = r7.f110225x
            r9 = 0
            r4 = 1
            if (r2 == 0) goto L3c
            if (r2 != r4) goto L34
            android.webkit.WebView r2 = r7.u
            yhm.o.b(r0)     // Catch: java.lang.Throwable -> L32
            goto L82
        L32:
            r0 = move-exception
            goto L9c
        L34:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r2)
            throw r0
        L3c:
            yhm.o.b(r0)
            java.lang.String r12 = r3.e
            if (r12 != 0) goto L44
            return r3
        L44:
            android.webkit.WebView r10 = new android.webkit.WebView
            android.app.Activity r0 = r1.f110228a
            r10.<init>(r0)
            r2 = 0
            r10.setAlpha(r2)
            android.webkit.WebSettings r2 = r10.getSettings()
            r2.setJavaScriptEnabled(r4)
            r2.setDomStorageEnabled(r4)
            android.widget.FrameLayout$LayoutParams r2 = new android.widget.FrameLayout$LayoutParams     // Catch: java.lang.Throwable -> L9a
            r2.<init>(r4, r4)     // Catch: java.lang.Throwable -> L9a
            r0.addContentView(r10, r2)     // Catch: java.lang.Throwable -> L9a
            java.lang.String r13 = "text/html"
            java.lang.String r14 = "utf-8"
            r15 = 0
            r11 = 0
            r10.loadDataWithBaseURL(r11, r12, r13, r14, r15)     // Catch: java.lang.Throwable -> L9a
            wwh.a r0 = r1.f110229b     // Catch: java.lang.Throwable -> L9a
            long r5 = cze.d.d     // Catch: java.lang.Throwable -> L9a
            r7.u = r10     // Catch: java.lang.Throwable -> L9a
            r7.f110225x = r4     // Catch: java.lang.Throwable -> L9a
            exh.b r0 = (exh.b) r0     // Catch: java.lang.Throwable -> L9a
            exh.k r0 = r0.f130431b     // Catch: java.lang.Throwable -> L9a
            r2 = r0
            exh.g r2 = (exh.g) r2     // Catch: java.lang.Throwable -> L9a
            r4 = 5
            java.io.Serializable r0 = r2.a(r3, r4, r5, r7)     // Catch: java.lang.Throwable -> L9a
            if (r0 != r8) goto L81
            return r8
        L81:
            r2 = r10
        L82:
            cue.d r0 = (cue.d) r0     // Catch: java.lang.Throwable -> L32
            android.view.ViewParent r3 = r2.getParent()
            boolean r4 = r3 instanceof android.view.ViewGroup
            if (r4 == 0) goto L8f
            r9 = r3
            android.view.ViewGroup r9 = (android.view.ViewGroup) r9
        L8f:
            if (r9 == 0) goto L94
            r9.removeView(r2)
        L94:
            r2.destroy()
            return r0
        L98:
            r2 = r10
            goto L9c
        L9a:
            r0 = move-exception
            goto L98
        L9c:
            android.view.ViewParent r3 = r2.getParent()
            boolean r4 = r3 instanceof android.view.ViewGroup
            if (r4 == 0) goto La7
            r9 = r3
            android.view.ViewGroup r9 = (android.view.ViewGroup) r9
        La7:
            if (r9 == 0) goto Lac
            r9.removeView(r2)
        Lac:
            r2.destroy()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: cze.d.a(cue.d, gim.c):java.io.Serializable");
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.String r12, java.lang.String r13, java.lang.String r14, gim.c r15) throws java.lang.Throwable {
        /*
            r11 = this;
            boolean r0 = r15 instanceof cze.c
            if (r0 == 0) goto L13
            r0 = r15
            cze.c r0 = (cze.c) r0
            int r1 = r0.f110227x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f110227x = r1
            goto L18
        L13:
            cze.c r0 = new cze.c
            r0.<init>(r11, r15)
        L18:
            java.lang.Object r15 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f110227x
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L35
            if (r2 != r4) goto L2d
            android.webkit.WebView r12 = r0.u
            yhm.o.b(r15)     // Catch: java.lang.Throwable -> L2a
            goto L6d
        L2a:
            r0 = move-exception
            r13 = r0
            goto L86
        L2d:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L35:
            yhm.o.b(r15)
            android.webkit.WebView r5 = new android.webkit.WebView
            android.app.Activity r15 = r11.f110228a
            r5.<init>(r15)
            r2 = 0
            r5.setAlpha(r2)
            android.webkit.WebSettings r2 = r5.getSettings()
            r2.setJavaScriptEnabled(r4)
            r2.setDomStorageEnabled(r4)
            android.widget.FrameLayout$LayoutParams r2 = new android.widget.FrameLayout$LayoutParams     // Catch: java.lang.Throwable -> L83
            r2.<init>(r4, r4)     // Catch: java.lang.Throwable -> L83
            r15.addContentView(r5, r2)     // Catch: java.lang.Throwable -> L83
            java.lang.String r8 = "text/html"
            java.lang.String r9 = "utf-8"
            r10 = 0
            r6 = 0
            r7 = r13
            r5.loadDataWithBaseURL(r6, r7, r8, r9, r10)     // Catch: java.lang.Throwable -> L83
            rve.d r13 = r11.f110230c     // Catch: java.lang.Throwable -> L83
            r0.u = r5     // Catch: java.lang.Throwable -> L83
            r0.f110227x = r4     // Catch: java.lang.Throwable -> L83
            java.lang.Object r15 = r13.c(r12, r14, r0)     // Catch: java.lang.Throwable -> L83
            if (r15 != r1) goto L6c
            return r1
        L6c:
            r12 = r5
        L6d:
            zve.h r15 = (zve.h) r15     // Catch: java.lang.Throwable -> L2a
            android.view.ViewParent r13 = r12.getParent()
            boolean r14 = r13 instanceof android.view.ViewGroup
            if (r14 == 0) goto L7a
            r3 = r13
            android.view.ViewGroup r3 = (android.view.ViewGroup) r3
        L7a:
            if (r3 == 0) goto L7f
            r3.removeView(r12)
        L7f:
            r12.destroy()
            return r15
        L83:
            r0 = move-exception
            r13 = r0
            r12 = r5
        L86:
            android.view.ViewParent r14 = r12.getParent()
            boolean r15 = r14 instanceof android.view.ViewGroup
            if (r15 == 0) goto L91
            r3 = r14
            android.view.ViewGroup r3 = (android.view.ViewGroup) r3
        L91:
            if (r3 == 0) goto L96
            r3.removeView(r12)
        L96:
            r12.destroy()
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: cze.d.b(java.lang.String, java.lang.String, java.lang.String, gim.c):java.lang.Object");
    }
}
