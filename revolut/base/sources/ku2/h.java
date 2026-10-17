package ku2;

import android.os.Handler;
import android.os.Looper;
import com.hcaptcha.sdk.HCaptchaConfig;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import skm.r;
import vkm.j2;
import vkm.q;
import zhm.h0;

/* JADX INFO: loaded from: classes21.dex */
public final class h {

    @NotNull
    public static final d Companion = new d();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.hcaptcha.sdk.a f189641a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HCaptchaConfig f189642b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final aoi.c f189643c;
    public final dm0.d d;
    public Handler e;
    public boolean f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public volatile boolean f189644g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final j2 f189645h;
    public r i;

    public h(com.hcaptcha.sdk.a hCaptcha, HCaptchaConfig hCaptchaConfig, aoi.c performanceAnalyticsInteractor, dm0.d deviceIdProvider) {
        Intrinsics.checkNotNullParameter(hCaptcha, "hCaptcha");
        Intrinsics.checkNotNullParameter(hCaptchaConfig, "hCaptchaConfig");
        Intrinsics.checkNotNullParameter(performanceAnalyticsInteractor, "performanceAnalyticsInteractor");
        Intrinsics.checkNotNullParameter(deviceIdProvider, "deviceIdProvider");
        this.f189641a = hCaptcha;
        this.f189642b = hCaptchaConfig;
        this.f189643c = performanceAnalyticsInteractor;
        this.d = deviceIdProvider;
        this.f189645h = q.c(Boolean.TRUE);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(ku2.h r4, gim.c r5) {
        /*
            boolean r0 = r5 instanceof ku2.e
            if (r0 == 0) goto L13
            r0 = r5
            ku2.e r0 = (ku2.e) r0
            int r1 = r0.f189636w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f189636w = r1
            goto L18
        L13:
            ku2.e r0 = new ku2.e
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f189636w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r5)
            goto L3f
        L27:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L2f:
            yhm.o.b(r5)
            skm.r r4 = r4.i
            if (r4 == 0) goto L55
            r0.f189636w = r3
            java.lang.Object r5 = r4.y(r0)
            if (r5 != r1) goto L3f
            return r1
        L3f:
            iu2.a r5 = (iu2.a) r5
            boolean r4 = r5 instanceof com.revolut.feature.captcha.api.models.CaptchaError
            if (r4 != 0) goto L52
            boolean r4 = r5 instanceof iu2.b
            if (r4 == 0) goto L4c
            iu2.b r5 = (iu2.b) r5
            return r5
        L4c:
            kotlin.NoWhenBranchMatchedException r4 = new kotlin.NoWhenBranchMatchedException
            r4.<init>()
            throw r4
        L52:
            java.lang.Throwable r5 = (java.lang.Throwable) r5
            throw r5
        L55:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "No captcha result deferred"
            r4.<init>(r5)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: ku2.h.a(ku2.h, gim.c):java.lang.Object");
    }

    public final void b() {
        try {
            if (Intrinsics.f(Looper.myLooper(), Looper.getMainLooper())) {
                this.f189641a.a(this.f189642b);
                return;
            }
            Handler handler = this.e;
            if (handler == null) {
                handler = new Handler(Looper.getMainLooper());
            }
            this.e = handler;
            handler.post(new kt0.d(this, 1));
        } catch (Exception e) {
            h0 h0Var = h0.f322473a;
            CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
            rd0.d.a(rd0.c.ERROR, null, null, e, h0Var);
        }
    }
}
