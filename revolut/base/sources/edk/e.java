package edk;

import com.revolut.feature.apm.payto.api.navigation.PayToConfirmationDestination;
import com.revolut.feature.atm.api.navigation.AtmLimitsExceptionDestination;
import com.revolut.kompot.bridge.navigation.KompotOverlayFeatureConfig;
import com.revolut.retail.core.navigation.FeatureCommand;
import j02.n;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.g;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import la8.j;
import pfm.z;
import q06.k;
import skm.p0;
import sri.m;
import te0.w;
import wp5.y;
import xo.h;
import zhm.d0;

/* JADX INFO: loaded from: classes11.dex */
public final class e implements jf0.d, k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f125036a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final m f125037b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f125038c;

    public e(m navigator, h commandProvider) {
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(commandProvider, "commandProvider");
        this.f125037b = navigator;
        this.f125038c = commandProvider;
    }

    public static PayToConfirmationDestination c(jf0.c cVar) {
        return new PayToConfirmationDestination(cVar.e(3), Intrinsics.f(d0.e0(4, cVar.h()), "amendment") ? n.AMENDMENT : n.MANDATE);
    }

    @Override // jf0.d, q06.k
    public final boolean a(jf0.c deeplink) {
        switch (this.f125036a) {
            case 0:
                return y.D(deeplink, "deeplink", 1, "monthly-draws") && Intrinsics.f(deeplink.e(2), "opt-in");
            case 1:
                return y.D(deeplink, "deeplink", 1, "progression");
            case 2:
                Intrinsics.checkNotNullParameter(deeplink, "deeplink");
                return a0.z(deeplink.e, "/overdraft", false);
            case 3:
                Intrinsics.checkNotNullParameter(deeplink, "deeplink");
                return ((jla.h) this.f125038c).d("BILLS_AND_TAXES.payto", null) == bla.c.ENABLED && Intrinsics.f(deeplink.e(1), "payto");
            case 4:
                return y.D(deeplink, "deeplink", 1, "bug-report");
            default:
                return y.D(deeplink, "deeplink", 1, "cards") && Intrinsics.f(deeplink.e(2), "cash-withdrawal-exception");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object b(jf0.c r5, gim.c r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof ik8.b
            if (r0 == 0) goto L13
            r0 = r6
            ik8.b r0 = (ik8.b) r0
            int r1 = r0.f161909x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f161909x = r1
            goto L18
        L13:
            ik8.b r0 = new ik8.b
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f161909x
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            jf0.c r5 = r0.u
            yhm.o.b(r6)
            goto L43
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            yhm.o.b(r6)
            java.lang.Object r6 = r4.f125038c
            jx0.a r6 = (jx0.a) r6
            r0.u = r5
            r0.f161909x = r3
            java.lang.Object r6 = r6.m(r0)
            if (r6 != r1) goto L43
            return r1
        L43:
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            if (r6 != 0) goto L4c
            goto L5c
        L4c:
            r6 = 2
            java.lang.String r5 = r5.e(r6)
            java.lang.String r6 = "prompt"
            boolean r5 = kotlin.jvm.internal.Intrinsics.f(r5, r6)
            if (r5 == 0) goto L5c
            com.revolut.feature.junior_progression.api.navigation.JuniorProgressionDestination r5 = com.revolut.feature.junior_progression.api.navigation.JuniorProgressionDestination.f77141a
            return r5
        L5c:
            r5 = 0
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: edk.e.b(jf0.c, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00be  */
    @Override // q06.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(jf0.c r7, kotlin.coroutines.Continuation r8) {
        /*
            Method dump skipped, instruction units count: 320
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: edk.e.e(jf0.c, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // jf0.d
    public final efm.d0 f(jf0.c deeplink, boolean z) {
        switch (this.f125036a) {
            case 0:
                Intrinsics.checkNotNullParameter(deeplink, "deeplink");
                ufm.c cVar = new ufm.c(new c86.d(this, z, 1), 2);
                Intrinsics.checkNotNullExpressionValue(cVar, "fromCallable(...)");
                return cVar;
            case 1:
                Intrinsics.checkNotNullParameter(deeplink, "deeplink");
                return ue0.e.F(w.o0(p0.f264003c, new ald.m(this, deeplink, z, (Continuation) null, 24)), Boolean.FALSE);
            case 2:
                Intrinsics.checkNotNullParameter(deeplink, "deeplink");
                return w.o0(g.f186406a, new af3.f(z, this, (Continuation) null, 23));
            case 3:
                Intrinsics.checkNotNullParameter(deeplink, "deeplink");
                z zVarD = new pfm.h(new j(this, deeplink, 1), 2).D(Boolean.TRUE);
                Intrinsics.checkNotNullExpressionValue(zVarD, "toSingleDefault(...)");
                return zVarD;
            case 4:
                Intrinsics.checkNotNullParameter(deeplink, "deeplink");
                if (!a(deeplink)) {
                    return efm.d0.m(Boolean.FALSE);
                }
                this.f125037b.c(new FeatureCommand(((h) this.f125038c).b()));
                return efm.d0.m(Boolean.TRUE);
            default:
                Intrinsics.checkNotNullParameter(deeplink, "deeplink");
                this.f125037b.c(new FeatureCommand(new KompotOverlayFeatureConfig((AtmLimitsExceptionDestination) this.f125038c, yhi.b.POPUP, (Integer) null, 12)));
                ufm.b bVarM = efm.d0.m(Boolean.TRUE);
                Intrinsics.checkNotNullExpressionValue(bVarM, "just(...)");
                return bVarM;
        }
    }

    public e(m navigator, h95.a overdraftNavigationCommandFactory) {
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(overdraftNavigationCommandFactory, "overdraftNavigationCommandFactory");
        this.f125037b = navigator;
        this.f125038c = overdraftNavigationCommandFactory;
    }

    public e(m navigator) {
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        this.f125037b = navigator;
        this.f125038c = new AtmLimitsExceptionDestination(null);
    }

    public e(jla.h productCatalogueInteractor, m navigator) {
        Intrinsics.checkNotNullParameter(productCatalogueInteractor, "productCatalogueInteractor");
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        this.f125038c = productCatalogueInteractor;
        this.f125037b = navigator;
    }

    public e(gte.a featureToggleInteractor, m navigator) {
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        this.f125037b = navigator;
        this.f125038c = featureToggleInteractor;
    }

    public e(jx0.a availabilityInteractor, m navigator) {
        Intrinsics.checkNotNullParameter(availabilityInteractor, "availabilityInteractor");
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        this.f125038c = availabilityInteractor;
        this.f125037b = navigator;
    }
}
