package dte;

import com.revolut.core.ui_kit.models.AppTipUIModel;
import dlk.k;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import skm.e0;

/* JADX INFO: loaded from: classes8.dex */
public final class f extends b {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final ate.e f117437l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final grb.a f117438m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final zq.a f117439n;
    public final CoroutineScope o;

    public f(ate.e interactor, grb.a appTipsProvider, zq.a appTipsContentProvider, CoroutineScope appTipsScope) {
        Intrinsics.checkNotNullParameter(interactor, "interactor");
        Intrinsics.checkNotNullParameter(appTipsProvider, "appTipsProvider");
        Intrinsics.checkNotNullParameter(appTipsContentProvider, "appTipsContentProvider");
        Intrinsics.checkNotNullParameter(appTipsScope, "appTipsScope");
        this.f117437l = interactor;
        this.f117438m = appTipsProvider;
        this.f117439n = appTipsContentProvider;
        this.o = appTipsScope;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // dte.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object Z2(java.lang.String r5, gim.c r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof dte.d
            if (r0 == 0) goto L13
            r0 = r6
            dte.d r0 = (dte.d) r0
            int r1 = r0.f117435w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f117435w = r1
            goto L18
        L13:
            dte.d r0 = new dte.d
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f117435w
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            yhm.o.b(r6)     // Catch: java.lang.Exception -> L27
            goto L3f
        L27:
            r5 = move-exception
            goto L42
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            yhm.o.b(r6)
            ate.e r6 = r4.f117437l     // Catch: java.lang.Exception -> L27
            r0.f117435w = r3     // Catch: java.lang.Exception -> L27
            java.lang.Object r5 = r6.b(r5, r0)     // Catch: java.lang.Exception -> L27
            if (r5 != r1) goto L3f
            return r1
        L3f:
            kotlin.Unit r5 = kotlin.Unit.f186387a     // Catch: java.lang.Exception -> L27
            goto L4c
        L42:
            zhm.h0 r6 = zhm.h0.f322473a
            java.util.concurrent.CopyOnWriteArrayList r0 = rd0.d.f253311a
            rd0.c r0 = rd0.c.ERROR
            r1 = 0
            rd0.d.a(r0, r1, r1, r5, r6)
        L4c:
            kotlin.Unit r5 = kotlin.Unit.f186387a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: dte.f.Z2(java.lang.String, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // dte.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b3(java.lang.String r5, gim.c r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof dte.e
            if (r0 == 0) goto L13
            r0 = r6
            dte.e r0 = (dte.e) r0
            int r1 = r0.f117436w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f117436w = r1
            goto L18
        L13:
            dte.e r0 = new dte.e
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f117436w
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            yhm.o.b(r6)     // Catch: java.lang.Exception -> L27
            goto L3f
        L27:
            r5 = move-exception
            goto L42
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            yhm.o.b(r6)
            ate.e r6 = r4.f117437l     // Catch: java.lang.Exception -> L27
            r0.f117436w = r3     // Catch: java.lang.Exception -> L27
            java.lang.Object r5 = r6.c(r5, r0)     // Catch: java.lang.Exception -> L27
            if (r5 != r1) goto L3f
            return r1
        L3f:
            kotlin.Unit r5 = kotlin.Unit.f186387a     // Catch: java.lang.Exception -> L27
            goto L4c
        L42:
            zhm.h0 r6 = zhm.h0.f322473a
            java.util.concurrent.CopyOnWriteArrayList r0 = rd0.d.f253311a
            rd0.c r0 = rd0.c.ERROR
            r1 = 0
            rd0.d.a(r0, r1, r1, r5, r6)
        L4c:
            kotlin.Unit r5 = kotlin.Unit.f186387a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: dte.f.b3(java.lang.String, gim.c):java.lang.Object");
    }

    public final boolean c3(AppTipUIModel appTipUIModel) {
        Intrinsics.checkNotNullParameter(appTipUIModel, "appTipUIModel");
        if (!(appTipUIModel.i instanceof wse.b)) {
            return false;
        }
        e0.C(this.o, null, null, new k(this, appTipUIModel, null, 22), 3);
        return true;
    }
}
