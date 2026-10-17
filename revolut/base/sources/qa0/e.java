package qa0;

import com.revolut.feature.backend_flow.domain.models.BackendFlow;
import com.revolut.kompot.common.ParcelableDestination;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import no.m;
import org.jetbrains.annotations.NotNull;
import wli.x;

/* JADX INFO: loaded from: classes19.dex */
public final class e extends b {

    @NotNull
    private static final c Companion = new c();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final BackendFlow f243925l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final f80.a f243926m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final o90.a f243927n;
    public final m o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final x f243928p;

    public e(BackendFlow backendFlow, f80.a uriHelper, o90.a externalNavigationProvider, m analyticsProductProvider, x deeplinkHandler) {
        Intrinsics.checkNotNullParameter(backendFlow, "backendFlow");
        Intrinsics.checkNotNullParameter(uriHelper, "uriHelper");
        Intrinsics.checkNotNullParameter(externalNavigationProvider, "externalNavigationProvider");
        Intrinsics.checkNotNullParameter(analyticsProductProvider, "analyticsProductProvider");
        Intrinsics.checkNotNullParameter(deeplinkHandler, "deeplinkHandler");
        this.f243925l = backendFlow;
        this.f243926m = uriHelper;
        this.f243927n = externalNavigationProvider;
        this.o = analyticsProductProvider;
        this.f243928p = deeplinkHandler;
    }

    @Override // qa0.b
    public final void Z2(String url2) {
        Intrinsics.checkNotNullParameter(url2, "url");
        ParcelableDestination parcelableDestinationD3 = d3(url2);
        if (parcelableDestinationD3 != null) {
            A2(parcelableDestinationD3);
        } else {
            V2(new q03.m(this, url2, null, 25), new yi5.b(29));
        }
    }

    @Override // qa0.b
    public final Object b3(String str, la0.f fVar) {
        ParcelableDestination parcelableDestinationD3 = d3(str);
        if (parcelableDestinationD3 != null) {
            A2(parcelableDestinationD3);
            return Unit.f186387a;
        }
        Object objC3 = c3(str, fVar);
        return objC3 == fim.a.COROUTINE_SUSPENDED ? objC3 : Unit.f186387a;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c3(java.lang.String r8, gim.c r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof qa0.d
            if (r0 == 0) goto L13
            r0 = r9
            qa0.d r0 = (qa0.d) r0
            int r1 = r0.f243924x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f243924x = r1
            goto L18
        L13:
            qa0.d r0 = new qa0.d
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f243924x
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            java.lang.String r8 = r0.u
            yhm.o.b(r9)
            goto L45
        L29:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L31:
            yhm.o.b(r9)
            lg0.a r9 = lg0.a.IGNORE
            java.lang.Boolean r2 = java.lang.Boolean.FALSE
            r0.u = r8
            r0.f243924x = r3
            wli.x r3 = r7.f243928p
            java.lang.Object r9 = r3.L1(r8, r9, r2, r0)
            if (r9 != r1) goto L45
            return r1
        L45:
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = r9.booleanValue()
            if (r9 != 0) goto L64
            com.revolut.kompot.common.ExternalDestination$ImplicitActivity r0 = new com.revolut.kompot.common.ExternalDestination$ImplicitActivity
            f80.a r9 = r7.f243926m
            f80.b r9 = (f80.b) r9
            android.net.Uri r3 = r9.f(r8)
            r5 = 0
            r6 = 494(0x1ee, float:6.92E-43)
            java.lang.String r1 = "android.intent.action.VIEW"
            r2 = 0
            r4 = 0
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r7.A2(r0)
        L64:
            kotlin.Unit r8 = kotlin.Unit.f186387a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: qa0.e.c3(java.lang.String, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x012c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.revolut.kompot.common.ParcelableDestination d3(java.lang.String r12) {
        /*
            Method dump skipped, instruction units count: 328
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: qa0.e.d3(java.lang.String):com.revolut.kompot.common.ParcelableDestination");
    }
}
