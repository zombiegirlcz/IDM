package mjf;

import android.os.Parcelable;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import et0.q0;
import grl.k9;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class q {

    @NotNull
    private static final g Companion = new g();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xif.b f206030a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final tif.b f206031b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final com.revolut.analytics.tracking.v3.d f206032c;
    public final wsg.b d;
    public final AtomicBoolean e;
    public final AtomicReference f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final AtomicReference f206033g;

    public q(xif.b calculatedBalanceRepository, tif.b loadingStateWrapper, com.revolut.analytics.tracking.v3.d diagnosticEventsTracker, wsg.b walletsInteractor, aif.a calculatedBalanceFeatureChecker) {
        Intrinsics.checkNotNullParameter(calculatedBalanceRepository, "calculatedBalanceRepository");
        Intrinsics.checkNotNullParameter(loadingStateWrapper, "loadingStateWrapper");
        Intrinsics.checkNotNullParameter(diagnosticEventsTracker, "diagnosticEventsTracker");
        Intrinsics.checkNotNullParameter(walletsInteractor, "walletsInteractor");
        Intrinsics.checkNotNullParameter(calculatedBalanceFeatureChecker, "calculatedBalanceFeatureChecker");
        this.f206030a = calculatedBalanceRepository;
        this.f206031b = loadingStateWrapper;
        this.f206032c = diagnosticEventsTracker;
        this.d = walletsInteractor;
        this.e = new AtomicBoolean(false);
        zhm.f0 f0Var = zhm.f0.f322471a;
        this.f = new AtomicReference(f0Var);
        this.f206033g = new AtomicReference(f0Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(gim.c r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof mjf.l
            if (r0 == 0) goto L13
            r0 = r7
            mjf.l r0 = (mjf.l) r0
            int r1 = r0.f206018w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f206018w = r1
            goto L18
        L13:
            mjf.l r0 = new mjf.l
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f206018w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r7)
            goto L5e
        L27:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L2f:
            yhm.o.b(r7)
            tif.b r7 = r6.f206031b
            mif.f r7 = r7.f271493a
            mif.g r7 = (mif.g) r7
            androidx.room.RoomDatabase r7 = r7.f205796a
            java.lang.String r2 = "loading_state"
            java.lang.String[] r2 = new java.lang.String[]{r2}
            mh4.x r4 = new mh4.x
            r5 = 11
            r4.<init>(r5)
            r5 = 0
            efm.r r7 = androidx.room.RxRoom.createObservable(r7, r5, r2, r4)
            efm.r r7 = r7.distinctUntilChanged()
            java.lang.String r2 = "distinctUntilChanged(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r7, r2)
            r0.f206018w = r3
            java.lang.Object r7 = nim.a.e(r7, r0)
            if (r7 != r1) goto L5e
            return r1
        L5e:
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = pd.b.j(r7)
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r7)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: mjf.q.a(gim.c):java.lang.Object");
    }

    public final void b(long j2, String sourceId) {
        boolean z = j2 == 0;
        Long lValueOf = Long.valueOf(j2);
        com.revolut.analytics.tracking.v3.f fVar = (com.revolut.analytics.tracking.v3.f) this.f206032c;
        Intrinsics.checkNotNullParameter(sourceId, "sourceId");
        k9 k9Var = k9.Transaction;
        Parcelable.Creator<AnalyticsProduct.Retail> creator = AnalyticsProduct.Retail.CREATOR;
        com.revolut.analytics.tracking.v3.f.g(fVar, com.google.android.gms.internal.mlkit_vision_face.a.h(k9Var, "value", k9Var), null, null, new q0(z, sourceId, lValueOf, 4), 14);
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00ec A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(java.util.Set r10, java.util.Set r11, gim.c r12) {
        /*
            Method dump skipped, instruction units count: 237
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: mjf.q.c(java.util.Set, java.util.Set, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0098 A[Catch: Exception -> 0x0047, CancellationException -> 0x004a, TryCatch #2 {CancellationException -> 0x004a, Exception -> 0x0047, blocks: (B:12:0x003a, B:30:0x00cd, B:33:0x00d3, B:24:0x0092, B:26:0x0098, B:35:0x00de, B:36:0x0104, B:21:0x0058, B:23:0x005e), top: B:41:0x0026 }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00de A[Catch: Exception -> 0x0047, CancellationException -> 0x004a, TryCatch #2 {CancellationException -> 0x004a, Exception -> 0x0047, blocks: (B:12:0x003a, B:30:0x00cd, B:33:0x00d3, B:24:0x0092, B:26:0x0098, B:35:0x00de, B:36:0x0104, B:21:0x0058, B:23:0x005e), top: B:41:0x0026 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x00c8 -> B:30:0x00cd). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(gim.c r18, java.util.List r19, boolean r20) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 274
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: mjf.q.d(gim.c, java.util.List, boolean):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0098 A[Catch: Exception -> 0x0047, CancellationException -> 0x004a, TryCatch #2 {CancellationException -> 0x004a, Exception -> 0x0047, blocks: (B:12:0x003a, B:30:0x00cd, B:33:0x00d3, B:24:0x0092, B:26:0x0098, B:35:0x00de, B:36:0x0104, B:21:0x0058, B:23:0x005e), top: B:41:0x0026 }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00de A[Catch: Exception -> 0x0047, CancellationException -> 0x004a, TryCatch #2 {CancellationException -> 0x004a, Exception -> 0x0047, blocks: (B:12:0x003a, B:30:0x00cd, B:33:0x00d3, B:24:0x0092, B:26:0x0098, B:35:0x00de, B:36:0x0104, B:21:0x0058, B:23:0x005e), top: B:41:0x0026 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x00c8 -> B:30:0x00cd). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(gim.c r18, java.util.List r19, boolean r20) {
        /*
            Method dump skipped, instruction units count: 274
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: mjf.q.e(gim.c, java.util.List, boolean):java.lang.Object");
    }
}
