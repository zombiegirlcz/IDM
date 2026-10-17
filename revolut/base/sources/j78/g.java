package j78;

import com.revolut.core.ui_kit.delegates.t;
import iw6.l;
import j49.i;
import jla.h;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import org.jetbrains.annotations.NotNull;
import vkm.q;
import vkm.z1;

/* JADX INFO: loaded from: classes4.dex */
public final class g implements s68.a {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final hj8.a f171870a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h f171871b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final z1 f171872c;

    public g(hj8.a juniorProfileInteractor, h productCatalogueInteractor) {
        Intrinsics.checkNotNullParameter(juniorProfileInteractor, "juniorProfileInteractor");
        Intrinsics.checkNotNullParameter(productCatalogueInteractor, "productCatalogueInteractor");
        this.f171870a = juniorProfileInteractor;
        this.f171871b = productCatalogueInteractor;
        this.f171872c = q.b(0, 7, null);
    }

    @Override // i49.c
    public final boolean a(t data) {
        Intrinsics.checkNotNullParameter(data, "data");
        return data.f54722b.f51596l instanceof b;
    }

    @Override // i49.c
    public final Flow f(i params) {
        Intrinsics.checkNotNullParameter(params, "params");
        return q.Q(new ae8.c(bla.b.b(this.f171871b, "YOUTH"), 11), new l((Continuation) null, this, 6));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // i49.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object g(com.revolut.core.ui_kit.delegates.t r5, kotlin.coroutines.Continuation r6) throws java.lang.Throwable {
        /*
            r4 = this;
            boolean r0 = r6 instanceof j78.c
            if (r0 == 0) goto L13
            r0 = r6
            j78.c r0 = (j78.c) r0
            int r1 = r0.f171866w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f171866w = r1
            goto L1a
        L13:
            j78.c r0 = new j78.c
            gim.c r6 = (gim.c) r6
            r0.<init>(r4, r6)
        L1a:
            java.lang.Object r6 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f171866w
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            yhm.o.b(r6)
            goto L8f
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            yhm.o.b(r6)
            com.revolut.core.ui_kit.delegates.ActionWidgetDelegate$a r6 = r5.f54721a
            com.revolut.core.ui_kit.delegates.ActionWidgetDelegate$a$d r2 = com.revolut.core.ui_kit.delegates.ActionWidgetDelegate.a.d.f51610a
            boolean r2 = kotlin.jvm.internal.Intrinsics.f(r6, r2)
            if (r2 == 0) goto L93
            com.revolut.core.ui_kit.delegates.ActionWidgetDelegate$Model r5 = r5.f54722b
            java.lang.Object r5 = r5.f51596l
            java.lang.String r6 = "null cannot be cast to non-null type com.revolut.feature.junior.accounts.impl.delegate.JuniorTerminationRequestActionsDelegateImpl.JuniorAccountClosureRequest"
            kotlin.jvm.internal.Intrinsics.i(r5, r6)
            j78.b r5 = (j78.b) r5
            java.lang.String r5 = r5.f171865a
            r0.f171866w = r3
            vkm.z1 r6 = r4.f171872c
            yhm.m$a r2 = yhm.m.INSTANCE     // Catch: java.lang.Throwable -> L66 java.util.concurrent.CancellationException -> L68
            kotlinx.coroutines.flow.StateFlow r2 = r6.l()     // Catch: java.lang.Throwable -> L66 java.util.concurrent.CancellationException -> L68
            wkm.y r2 = (wkm.y) r2     // Catch: java.lang.Throwable -> L66 java.util.concurrent.CancellationException -> L68
            java.lang.Object r2 = r2.getValue()     // Catch: java.lang.Throwable -> L66 java.util.concurrent.CancellationException -> L68
            java.lang.Number r2 = (java.lang.Number) r2     // Catch: java.lang.Throwable -> L66 java.util.concurrent.CancellationException -> L68
            int r2 = r2.intValue()     // Catch: java.lang.Throwable -> L66 java.util.concurrent.CancellationException -> L68
            if (r2 < r3) goto L6a
            kotlin.Unit r2 = kotlin.Unit.f186387a     // Catch: java.lang.Throwable -> L66 java.util.concurrent.CancellationException -> L68
            goto L78
        L66:
            r2 = move-exception
            goto L72
        L68:
            r5 = move-exception
            goto L92
        L6a:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L66 java.util.concurrent.CancellationException -> L68
            java.lang.String r3 = "Cannot emit closure request. No subscribers to reviewActionFlow"
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L66 java.util.concurrent.CancellationException -> L68
            throw r2     // Catch: java.lang.Throwable -> L66 java.util.concurrent.CancellationException -> L68
        L72:
            yhm.m$a r3 = yhm.m.INSTANCE
            yhm.n r2 = yhm.o.a(r2)
        L78:
            java.lang.Throwable r2 = yhm.m.a(r2)
            if (r2 == 0) goto L81
            hx7.e.n(r2)
        L81:
            java.lang.Object r5 = r6.emit(r5, r0)
            fim.a r6 = fim.a.COROUTINE_SUSPENDED
            if (r5 != r6) goto L8a
            goto L8c
        L8a:
            kotlin.Unit r5 = kotlin.Unit.f186387a
        L8c:
            if (r5 != r1) goto L8f
            return r1
        L8f:
            j49.a r5 = j49.a.f171320a
            return r5
        L92:
            throw r5
        L93:
            boolean r5 = r6 instanceof com.revolut.core.ui_kit.delegates.h
            if (r5 != 0) goto Lb6
            com.revolut.core.ui_kit.delegates.ActionWidgetDelegate$a$c r5 = com.revolut.core.ui_kit.delegates.ActionWidgetDelegate.a.c.f51609a
            boolean r5 = kotlin.jvm.internal.Intrinsics.f(r6, r5)
            if (r5 != 0) goto Lb6
            com.revolut.core.ui_kit.delegates.ActionWidgetDelegate$a$a r5 = com.revolut.core.ui_kit.delegates.ActionWidgetDelegate.a.C0395a.f51607a
            boolean r5 = kotlin.jvm.internal.Intrinsics.f(r6, r5)
            if (r5 != 0) goto Lb6
            com.revolut.core.ui_kit.delegates.ActionWidgetDelegate$a$b r5 = com.revolut.core.ui_kit.delegates.ActionWidgetDelegate.a.b.f51608a
            boolean r5 = kotlin.jvm.internal.Intrinsics.f(r6, r5)
            if (r5 == 0) goto Lb0
            goto Lb6
        Lb0:
            kotlin.NoWhenBranchMatchedException r5 = new kotlin.NoWhenBranchMatchedException
            r5.<init>()
            throw r5
        Lb6:
            j49.c r5 = j49.c.f171322a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: j78.g.g(com.revolut.core.ui_kit.delegates.t, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
