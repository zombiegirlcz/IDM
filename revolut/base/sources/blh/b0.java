package blh;

import com.revolut.feature.globalsearch.models.GlobalSearchContext;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class b0 implements z87.e {

    @NotNull
    public static final z Companion = new z();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f01.c f16636a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i f16637b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final x8h.m f16638c;
    public final o97.r d;
    public final ble.z e;
    public final y f;

    public b0(f01.c uikitResources, i instrumentsSearchDelegate, j searchSourceInstrumentFilter, x8h.m etpProductAvailabilityInteractor) {
        Intrinsics.checkNotNullParameter(uikitResources, "uikitResources");
        Intrinsics.checkNotNullParameter(instrumentsSearchDelegate, "instrumentsSearchDelegate");
        Intrinsics.checkNotNullParameter(searchSourceInstrumentFilter, "searchSourceInstrumentFilter");
        Intrinsics.checkNotNullParameter(etpProductAvailabilityInteractor, "etpProductAvailabilityInteractor");
        this.f16636a = uikitResources;
        this.f16637b = instrumentsSearchDelegate;
        this.f16638c = etpProductAvailabilityInteractor;
        this.d = o97.r.WEALTH_ETFS;
        this.e = new ble.z(this, 29);
        this.f = new y(0);
    }

    @Override // z87.e
    public final o97.m a() {
        return this.f16637b.e;
    }

    @Override // z87.e
    public final efm.r e(String searchQuery, GlobalSearchContext context, efm.r remoteObservable) {
        Intrinsics.checkNotNullParameter(searchQuery, "searchQuery");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(remoteObservable, "remoteObservable");
        zsc.m.Companion.getClass();
        zsc.m mVarA = zsc.l.a(searchQuery);
        efm.r rVarSwitchMap = rd0.e.c(this.f16638c.b(), kotlin.coroutines.g.f186406a).switchMap(new bjg.d(27, new b4d.c(this, 18, mVarA, remoteObservable)));
        Intrinsics.checkNotNullExpressionValue(rVarSwitchMap, "switchMap(...)");
        return rVarSwitchMap;
    }

    @Override // z87.f
    public final void g(Set extensions) {
        Intrinsics.checkNotNullParameter(extensions, "extensions");
        this.f16637b.c(extensions);
    }

    @Override // z87.f
    public final o97.r h() {
        return this.d;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // z87.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object l(java.lang.String r4, o97.y r5, kotlin.coroutines.Continuation r6) {
        /*
            r3 = this;
            boolean r4 = r6 instanceof blh.a0
            if (r4 == 0) goto L13
            r4 = r6
            blh.a0 r4 = (blh.a0) r4
            int r0 = r4.f16635w
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = r0 & r1
            if (r2 == 0) goto L13
            int r0 = r0 - r1
            r4.f16635w = r0
            goto L1a
        L13:
            blh.a0 r4 = new blh.a0
            gim.c r6 = (gim.c) r6
            r4.<init>(r3, r6)
        L1a:
            java.lang.Object r6 = r4.u
            fim.a r0 = fim.a.COROUTINE_SUSPENDED
            int r1 = r4.f16635w
            r2 = 1
            if (r1 == 0) goto L31
            if (r1 != r2) goto L29
            yhm.o.b(r6)
            goto L43
        L29:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L31:
            yhm.o.b(r6)
            blh.i r6 = r3.f16637b
            ufm.c r5 = r6.b(r5)
            r4.f16635w = r2
            java.lang.Object r6 = nim.a.b(r5, r4)
            if (r6 != r0) goto L43
            return r0
        L43:
            java.lang.String r4 = "await(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r6, r4)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: blh.b0.l(java.lang.String, o97.y, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
