package yhe;

import cli.y;
import com.revolut.data.model.Data;
import com.revolut.feature.tab.accounts.api.remove_account.RemoveAccountContract$InputData;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import vge.z2;

/* JADX INFO: loaded from: classes8.dex */
public final class l extends oki.h implements e {

    @NotNull
    public static final g Companion = new g();
    public final RemoveAccountContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final xfe.j f313921p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final pfe.b f313922q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final z2 f313923r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final qek.a f313924s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final wa7.m f313925t;
    public final y u;

    public l(RemoveAccountContract$InputData inputData, xfe.j contentProvider, pfe.b dataSource, z2 productAccountsInteractor, qek.a removeAccountErrorHandler, wa7.m hiddenAccountsInteractor, m stateMapper) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(contentProvider, "contentProvider");
        Intrinsics.checkNotNullParameter(dataSource, "dataSource");
        Intrinsics.checkNotNullParameter(productAccountsInteractor, "productAccountsInteractor");
        Intrinsics.checkNotNullParameter(removeAccountErrorHandler, "removeAccountErrorHandler");
        Intrinsics.checkNotNullParameter(hiddenAccountsInteractor, "hiddenAccountsInteractor");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = inputData;
        this.f313921p = contentProvider;
        this.f313922q = dataSource;
        this.f313923r = productAccountsInteractor;
        this.f313924s = removeAccountErrorHandler;
        this.f313925t = hiddenAccountsInteractor;
        this.u = mra.d.b(this, new d(new Data(null, null, true, 3, null), "CONFIRMATION_BUTTON_TAG"), stateMapper, null, false, 12);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object I2(yhe.l r4, gim.c r5) {
        /*
            boolean r0 = r5 instanceof yhe.k
            if (r0 == 0) goto L13
            r0 = r5
            yhe.k r0 = (yhe.k) r0
            int r1 = r0.f313920w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f313920w = r1
            goto L18
        L13:
            yhe.k r0 = new yhe.k
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f313920w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r5)     // Catch: java.lang.Throwable -> L57
            goto L41
        L27:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L2f:
            yhm.o.b(r5)
            pfe.b r5 = r4.f313922q     // Catch: java.lang.Throwable -> L57
            com.revolut.feature.tab.accounts.api.remove_account.RemoveAccountContract$InputData r2 = r4.o     // Catch: java.lang.Throwable -> L57
            com.revolut.feature.tab.accounts.models.ProductAccountId r2 = r2.f89568b     // Catch: java.lang.Throwable -> L57
            r0.f313920w = r3     // Catch: java.lang.Throwable -> L57
            java.lang.Object r5 = r5.c(r2, r0)     // Catch: java.lang.Throwable -> L57
            if (r5 != r1) goto L41
            return r1
        L41:
            com.revolut.feature.tab.accounts.models.ProductAccountDescriptor$Value$Main r5 = (com.revolut.feature.tab.accounts.models.ProductAccountDescriptor$Value.Main) r5     // Catch: java.lang.Throwable -> L57
            if (r5 == 0) goto L62
            vge.z2 r4 = r4.f313923r     // Catch: java.lang.Throwable -> L57
            vge.t3 r4 = (vge.t3) r4     // Catch: java.lang.Throwable -> L57
            r4.getClass()     // Catch: java.lang.Throwable -> L57
            java.lang.String r0 = "descriptor"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)     // Catch: java.lang.Throwable -> L57
            java.util.concurrent.atomic.AtomicReference r4 = r4.f289022l     // Catch: java.lang.Throwable -> L57
            r4.set(r5)     // Catch: java.lang.Throwable -> L57
            goto L62
        L57:
            r4 = move-exception
            zhm.h0 r5 = zhm.h0.f322473a
            java.util.concurrent.CopyOnWriteArrayList r0 = rd0.d.f253311a
            rd0.c r0 = rd0.c.ERROR
            r1 = 0
            rd0.d.a(r0, r1, r1, r4, r5)
        L62:
            kotlin.Unit r4 = kotlin.Unit.f186387a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: yhe.l.I2(yhe.l, gim.c):java.lang.Object");
    }

    @Override // yji.l
    public final void I1() {
        l2(new h(this, null, 0), new yi5.b(26));
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.u;
    }
}
