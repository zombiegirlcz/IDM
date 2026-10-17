package x92;

import android.content.Context;
import com.revolut.feature.apm.multibanco.sdk.proxy.models.results.MBWaySdkError;
import com.revolut.feature.apm.multibanco.sdk.proxy.models.results.MBWaySdkNotHandledError;
import com.revolut.feature.apm.multibanco.sdk.proxy.models.results.MBWaySdkUnavailable;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import tb4.t;
import zhm.h0;
import zhm.y0;

/* JADX INFO: loaded from: classes20.dex */
public final class j {

    @NotNull
    public static final b Companion = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m f303540a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final t f303541b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Lazy f303542c;

    public j(m instanceProvider, t loader) {
        Intrinsics.checkNotNullParameter(instanceProvider, "instanceProvider");
        Intrinsics.checkNotNullParameter(loader, "loader");
        this.f303540a = instanceProvider;
        this.f303541b = loader;
        this.f303542c = yhm.j.b(new wp0.b(this, 19));
    }

    public static MBWaySdkError c(String str, Throwable th10) {
        IllegalStateException illegalStateException = new IllegalStateException(p.a.p("MBWAY SDK: [", str, "]"), th10);
        h0 h0Var = h0.f322473a;
        CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
        rd0.d.a(rd0.c.ERROR, null, null, illegalStateException, h0Var);
        return th10 instanceof MBWaySdkUnavailable ? (MBWaySdkError) th10 : new MBWaySdkNotHandledError(str, th10);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(java.lang.String r5, java.lang.String r6, java.lang.String r7, gim.c r8) {
        /*
            r4 = this;
            boolean r0 = r8 instanceof x92.c
            if (r0 == 0) goto L13
            r0 = r8
            x92.c r0 = (x92.c) r0
            int r1 = r0.f303533w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f303533w = r1
            goto L18
        L13:
            x92.c r0 = new x92.c
            r0.<init>(r4, r8)
        L18:
            java.lang.Object r8 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f303533w
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            yhm.o.b(r8)     // Catch: java.lang.Throwable -> L27
            goto L41
        L27:
            r5 = move-exception
            goto L44
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            yhm.o.b(r8)
            x92.l r8 = r4.b()     // Catch: java.lang.Throwable -> L27
            r0.f303533w = r3     // Catch: java.lang.Throwable -> L27
            java.lang.Object r8 = r8.confirmPendingPayment(r5, r6, r7, r0)     // Catch: java.lang.Throwable -> L27
            if (r8 != r1) goto L41
            return r1
        L41:
            z92.j r8 = (z92.j) r8     // Catch: java.lang.Throwable -> L27
            return r8
        L44:
            z92.h r6 = new z92.h
            java.lang.String r7 = "PAY_AUTH_CONFIRM"
            com.revolut.feature.apm.multibanco.sdk.proxy.models.results.MBWaySdkError r5 = c(r7, r5)
            r6.<init>(r5)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: x92.j.a(java.lang.String, java.lang.String, java.lang.String, gim.c):java.lang.Object");
    }

    public final l b() throws MBWaySdkUnavailable {
        t tVar = this.f303541b;
        if (((oi0.b) ((xg0.a) tVar.f269456b)).d((Context) tVar.f269457c, y0.b("feature_apm_multibanco_sdk_impl")).f305464a.isEmpty()) {
            return (l) this.f303542c.getValue();
        }
        throw new MBWaySdkUnavailable("INSTANCE", null);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(android.app.Application r5, y92.b r6, gim.c r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof x92.d
            if (r0 == 0) goto L13
            r0 = r7
            x92.d r0 = (x92.d) r0
            int r1 = r0.f303534w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f303534w = r1
            goto L18
        L13:
            x92.d r0 = new x92.d
            r0.<init>(r4, r7)
        L18:
            java.lang.Object r7 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f303534w
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            yhm.o.b(r7)     // Catch: java.lang.Throwable -> L27
            goto L41
        L27:
            r5 = move-exception
            goto L44
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            yhm.o.b(r7)
            x92.l r7 = r4.b()     // Catch: java.lang.Throwable -> L27
            r0.f303534w = r3     // Catch: java.lang.Throwable -> L27
            java.lang.Object r7 = r7.init(r5, r6, r0)     // Catch: java.lang.Throwable -> L27
            if (r7 != r1) goto L41
            return r1
        L41:
            z92.j r7 = (z92.j) r7     // Catch: java.lang.Throwable -> L27
            return r7
        L44:
            z92.h r6 = new z92.h
            java.lang.String r7 = "INIT"
            com.revolut.feature.apm.multibanco.sdk.proxy.models.results.MBWaySdkError r5 = c(r7, r5)
            r6.<init>(r5)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: x92.j.d(android.app.Application, y92.b, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(java.lang.String r5, gim.c r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof x92.e
            if (r0 == 0) goto L13
            r0 = r6
            x92.e r0 = (x92.e) r0
            int r1 = r0.f303535w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f303535w = r1
            goto L18
        L13:
            x92.e r0 = new x92.e
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f303535w
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            yhm.o.b(r6)     // Catch: java.lang.Throwable -> L27
            goto L41
        L27:
            r5 = move-exception
            goto L4e
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            yhm.o.b(r6)
            x92.l r6 = r4.b()     // Catch: java.lang.Throwable -> L27
            r0.f303535w = r3     // Catch: java.lang.Throwable -> L27
            java.lang.Object r6 = r6.parseQRCodeInfo(r5, r0)     // Catch: java.lang.Throwable -> L27
            if (r6 != r1) goto L41
            return r1
        L41:
            z92.e r6 = (z92.e) r6     // Catch: java.lang.Throwable -> L27
            if (r6 != 0) goto L48
            z92.a r5 = z92.a.f320298a     // Catch: java.lang.Throwable -> L27
            return r5
        L48:
            z92.c r5 = new z92.c     // Catch: java.lang.Throwable -> L27
            r5.<init>(r6)     // Catch: java.lang.Throwable -> L27
            return r5
        L4e:
            z92.b r6 = new z92.b
            java.lang.String r0 = "PAY_QR_PARSE"
            com.revolut.feature.apm.multibanco.sdk.proxy.models.results.MBWaySdkError r5 = c(r0, r5)
            r6.<init>(r5)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: x92.j.e(java.lang.String, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(y92.c r5, gim.c r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof x92.f
            if (r0 == 0) goto L13
            r0 = r6
            x92.f r0 = (x92.f) r0
            int r1 = r0.f303536w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f303536w = r1
            goto L18
        L13:
            x92.f r0 = new x92.f
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f303536w
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            yhm.o.b(r6)     // Catch: java.lang.Throwable -> L27
            goto L41
        L27:
            r5 = move-exception
            goto L44
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            yhm.o.b(r6)
            x92.l r6 = r4.b()     // Catch: java.lang.Throwable -> L27
            r0.f303536w = r3     // Catch: java.lang.Throwable -> L27
            java.lang.Object r6 = r6.register(r5, r0)     // Catch: java.lang.Throwable -> L27
            if (r6 != r1) goto L41
            return r1
        L41:
            z92.j r6 = (z92.j) r6     // Catch: java.lang.Throwable -> L27
            return r6
        L44:
            z92.h r6 = new z92.h
            java.lang.String r0 = "INIT_REGISTER"
            com.revolut.feature.apm.multibanco.sdk.proxy.models.results.MBWaySdkError r5 = c(r0, r5)
            r6.<init>(r5)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: x92.j.f(y92.c, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object g(java.lang.String r5, java.lang.String r6, java.lang.String r7, gim.c r8) {
        /*
            r4 = this;
            boolean r0 = r8 instanceof x92.g
            if (r0 == 0) goto L13
            r0 = r8
            x92.g r0 = (x92.g) r0
            int r1 = r0.f303537w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f303537w = r1
            goto L18
        L13:
            x92.g r0 = new x92.g
            r0.<init>(r4, r8)
        L18:
            java.lang.Object r8 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f303537w
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            yhm.o.b(r8)     // Catch: java.lang.Throwable -> L27
            goto L41
        L27:
            r5 = move-exception
            goto L44
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            yhm.o.b(r8)
            x92.l r8 = r4.b()     // Catch: java.lang.Throwable -> L27
            r0.f303537w = r3     // Catch: java.lang.Throwable -> L27
            java.lang.Object r8 = r8.registerQRCodePayment(r5, r6, r7, r0)     // Catch: java.lang.Throwable -> L27
            if (r8 != r1) goto L41
            return r1
        L41:
            z92.j r8 = (z92.j) r8     // Catch: java.lang.Throwable -> L27
            return r8
        L44:
            z92.h r6 = new z92.h
            java.lang.String r7 = "PAY_QR_CONFIRMATION"
            com.revolut.feature.apm.multibanco.sdk.proxy.models.results.MBWaySdkError r5 = c(r7, r5)
            r6.<init>(r5)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: x92.j.g(java.lang.String, java.lang.String, java.lang.String, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object h(java.lang.String r5, java.lang.String r6, gim.c r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof x92.h
            if (r0 == 0) goto L13
            r0 = r7
            x92.h r0 = (x92.h) r0
            int r1 = r0.f303538w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f303538w = r1
            goto L18
        L13:
            x92.h r0 = new x92.h
            r0.<init>(r4, r7)
        L18:
            java.lang.Object r7 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f303538w
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            yhm.o.b(r7)     // Catch: java.lang.Throwable -> L27
            goto L41
        L27:
            r5 = move-exception
            goto L44
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            yhm.o.b(r7)
            x92.l r7 = r4.b()     // Catch: java.lang.Throwable -> L27
            r0.f303538w = r3     // Catch: java.lang.Throwable -> L27
            java.lang.Object r7 = r7.rejectPendingPayment(r5, r6, r0)     // Catch: java.lang.Throwable -> L27
            if (r7 != r1) goto L41
            return r1
        L41:
            z92.j r7 = (z92.j) r7     // Catch: java.lang.Throwable -> L27
            return r7
        L44:
            z92.h r6 = new z92.h
            java.lang.String r7 = "PAY_AUTH_REJECT"
            com.revolut.feature.apm.multibanco.sdk.proxy.models.results.MBWaySdkError r5 = c(r7, r5)
            r6.<init>(r5)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: x92.j.h(java.lang.String, java.lang.String, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object i(java.lang.String r5, java.lang.String r6, gim.c r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof x92.i
            if (r0 == 0) goto L13
            r0 = r7
            x92.i r0 = (x92.i) r0
            int r1 = r0.f303539w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f303539w = r1
            goto L18
        L13:
            x92.i r0 = new x92.i
            r0.<init>(r4, r7)
        L18:
            java.lang.Object r7 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f303539w
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            yhm.o.b(r7)     // Catch: java.lang.Throwable -> L27
            goto L41
        L27:
            r5 = move-exception
            goto L44
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            yhm.o.b(r7)
            x92.l r7 = r4.b()     // Catch: java.lang.Throwable -> L27
            r0.f303539w = r3     // Catch: java.lang.Throwable -> L27
            java.lang.Object r7 = r7.searchPendingPayment(r5, r6, r0)     // Catch: java.lang.Throwable -> L27
            if (r7 != r1) goto L41
            return r1
        L41:
            z92.d r7 = (z92.d) r7     // Catch: java.lang.Throwable -> L27
            return r7
        L44:
            z92.b r6 = new z92.b
            java.lang.String r7 = "PAY_AUTH_SEARCH"
            com.revolut.feature.apm.multibanco.sdk.proxy.models.results.MBWaySdkError r5 = c(r7, r5)
            r6.<init>(r5)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: x92.j.i(java.lang.String, java.lang.String, gim.c):java.lang.Object");
    }
}
