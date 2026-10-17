package xza;

import android.app.Activity;
import com.revolut.feature.restricted_access.api.RestrictedAccessDestination;
import com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig;
import com.revolut.kompot.common.ParcelableDestination;
import com.revolut.retail.core.navigation.ActivityAnimation;
import com.revolut.retail.core.navigation.FeatureCommand;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import sri.m;
import v60.g;

/* JADX INFO: loaded from: classes5.dex */
public final class e extends fsi.c {

    @NotNull
    public static final b Companion = new b();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Activity f309916h;
    public final m i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final g f309917j;
    public final mli.e k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final asi.d f309918l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(Activity activity, m navigator, g policiesRepository, mli.e userLogoutInteractor, asi.d userSessionInteractor) {
        super(new fsi.b("GlobalComplianceActivityDelegate"));
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(policiesRepository, "policiesRepository");
        Intrinsics.checkNotNullParameter(userLogoutInteractor, "userLogoutInteractor");
        Intrinsics.checkNotNullParameter(userSessionInteractor, "userSessionInteractor");
        this.f309916h = activity;
        this.i = navigator;
        this.f309917j = policiesRepository;
        this.k = userLogoutInteractor;
        this.f309918l = userSessionInteractor;
    }

    public final void N(vza.a aVar) {
        this.i.c(new FeatureCommand(new KompotBridgeFeatureConfig((ActivityAnimation) null, (ParcelableDestination) new RestrictedAccessDestination(aVar, false), false, (Integer) null, 335577088, 41)));
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x0011  */
    @Override // fsi.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onStart() {
        /*
            r4 = this;
            v60.g r0 = r4.f309917j
            vza.b r1 = vza.b.GLOBAL
            vza.a r0 = r0.i(r1)
            if (r0 == 0) goto L8c
            android.app.Activity r1 = r4.f309916h
            boolean r2 = r1 instanceof nri.b
            r3 = 0
            if (r2 != 0) goto L13
        L11:
            r1 = r3
            goto L26
        L13:
            nri.b r1 = (nri.b) r1
            android.os.Parcelable r1 = r1.I0()
            boolean r2 = r1 instanceof com.revolut.kompot.bridge.impl.rootflow.KompotFlowContract$Configuration
            if (r2 != 0) goto L1e
            goto L11
        L1e:
            com.revolut.kompot.bridge.impl.rootflow.KompotFlowContract$Configuration r1 = (com.revolut.kompot.bridge.impl.rootflow.KompotFlowContract$Configuration) r1
            com.revolut.kompot.common.ParcelableDestination r1 = r1.getF98264a()
            boolean r1 = r1 instanceof com.revolut.feature.restricted_access.api.RestrictedAccessDestination
        L26:
            if (r1 != 0) goto L8c
            asi.d r1 = r4.f309918l
            asi.c r1 = r1.a()
            asi.c r2 = asi.c.ABSENT
            if (r1 == r2) goto L33
            r3 = 1
        L33:
            if (r3 != 0) goto L39
            r4.N(r0)
            return
        L39:
            mli.e r1 = r4.k
            efm.b r1 = mli.e.b(r1)
            java.lang.String r2 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r2)
            pfm.r r1 = te0.w.g0(r1)
            pfm.r r1 = o70.a.g(r1)
            xza.a r2 = new xza.a
            r3 = 0
            r2.<init>(r4, r0, r3)
            pfm.l r0 = new pfm.l
            r0.<init>(r1, r2, r3)
            java.lang.String r1 = "doFinally(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            com.revolut.core.extensions.rx.BreadcrumbException r1 = new com.revolut.core.extensions.rx.BreadcrumbException
            r1.<init>()
            xy7.n r2 = new xy7.n
            r3 = 10
            r2.<init>(r1, r3)
            tnb.g0 r1 = new tnb.g0
            r1.<init>(r2)
            pfm.a r2 = new pfm.a
            r3 = 2
            r2.<init>(r0, r1, r3)
            java.lang.String r0 = "onErrorResumeNext(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r0)
            xza.d r0 = xza.d.f309915a
            twl.o r1 = new twl.o
            r3 = 10
            r1.<init>(r3, r0)
            xza.c r0 = xza.c.f309914a
            ofm.h r0 = r2.w(r1, r0)
            java.lang.String r1 = "subscribe(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
        L8c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: xza.e.onStart():void");
    }
}
