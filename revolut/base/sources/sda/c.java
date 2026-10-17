package sda;

import com.revolut.core.model.account.AccountId;
import efm.d0;
import kotlin.jvm.internal.Intrinsics;
import l3d.f;
import pfm.z;
import q06.k;
import sc7.g;
import sri.m;
import ufm.i;
import wp5.y;
import wsg.n;

/* JADX INFO: loaded from: classes5.dex */
public final class c implements jf0.d, k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n f261840a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final m f261841b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e f261842c;
    public final gte.a d;

    public c(n walletInteractor, m navigator, e initialActionMapper, gte.a featureToggleInteractor) {
        Intrinsics.checkNotNullParameter(walletInteractor, "walletInteractor");
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(initialActionMapper, "initialActionMapper");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        this.f261840a = walletInteractor;
        this.f261841b = navigator;
        this.f261842c = initialActionMapper;
        this.d = featureToggleInteractor;
    }

    @Override // jf0.d, q06.k
    public final boolean a(jf0.c cVar) {
        return y.D(cVar, "deeplink", 1, "account") || Intrinsics.f(cVar.e(1), "topup-bank-transfer") || Intrinsics.f(cVar.e(1), "topup-bank-transfer-ccy");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final q06.h b(xi0.b r21, com.revolut.feature.pockets.api.navigation.PocketDetailsInitialAction.ShowCountryPicker r22) {
        /*
            r20 = this;
            r0 = r20
            io3.l r3 = io3.l.CURRENT
            io3.i r4 = io3.i.INTERNAL
            io3.j r5 = io3.j.PERSONAL
            r6 = 4
            wsg.n r1 = r0.f261840a
            r2 = r21
            io3.d r8 = osg.b.b(r1, r2, r3, r4, r5, r6)
            r1 = 0
            if (r8 == 0) goto L17
            io3.k r2 = r8.f
            goto L18
        L17:
            r2 = r1
        L18:
            io3.k r3 = io3.k.DELISTED
            if (r2 != r3) goto L2a
            com.revolut.feature.pockets.api.PocketsUIApi$Toggles$DisableDelistedAccountDetails r2 = com.revolut.feature.pockets.api.PocketsUIApi$Toggles.DisableDelistedAccountDetails.f80766c
            gte.a r3 = r0.d
            jte.d r3 = (jte.d) r3
            boolean r2 = r3.c(r2)
            if (r2 == 0) goto L2a
            r2 = 1
            goto L2b
        L2a:
            r2 = 0
        L2b:
            com.revolut.core.model.account.AccountId$Personal r9 = com.revolut.core.model.account.AccountId.Personal.f51414a
            if (r8 == 0) goto L4a
            if (r2 != 0) goto L4a
            com.revolut.feature.pockets.api.navigation.PocketDetailsDestination r2 = new com.revolut.feature.pockets.api.navigation.PocketDetailsDestination
            com.revolut.feature.pockets.api.navigation.PocketDetailsFlowContract$InputData r7 = new com.revolut.feature.pockets.api.navigation.PocketDetailsFlowContract$InputData
            r18 = 0
            r19 = 2992(0xbb0, float:4.193E-42)
            r10 = 1
            r11 = 1
            r12 = 0
            r13 = 0
            r14 = 1
            r15 = 0
            r16 = 0
            r17 = r22
            r7.<init>(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
            r2.<init>(r7)
            goto L5b
        L4a:
            com.revolut.kompot.bridge.navigation.BridgeDestination r2 = new com.revolut.kompot.bridge.navigation.BridgeDestination
            com.revolut.retail.core.navigation.FeatureCommand r3 = new com.revolut.retail.core.navigation.FeatureCommand
            com.revolut.feature.pockets.api.navigation.PocketsListFeatureConfig r4 = new com.revolut.feature.pockets.api.navigation.PocketsListFeatureConfig
            fda.a r5 = fda.a.FIAT_CURRENCIES_POCKETS
            r4.<init>(r5, r9)
            r3.<init>(r4)
            r2.<init>(r3)
        L5b:
            q06.h r3 = new q06.h
            q06.b r4 = new q06.b
            com.revolut.feature.rev10_main_screen.api.MainScreenTab r5 = ibb.c.f160140a
            r4.<init>(r5, r1)
            r3.<init>(r2, r4)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: sda.c.b(xi0.b, com.revolut.feature.pockets.api.navigation.PocketDetailsInitialAction$ShowCountryPicker):q06.h");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // q06.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(jf0.c r6, kotlin.coroutines.Continuation r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof sda.b
            if (r0 == 0) goto L13
            r0 = r7
            sda.b r0 = (sda.b) r0
            int r1 = r0.f261839w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f261839w = r1
            goto L1a
        L13:
            sda.b r0 = new sda.b
            gim.c r7 = (gim.c) r7
            r0.<init>(r5, r7)
        L1a:
            java.lang.Object r7 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f261839w
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            yhm.o.b(r7)
            goto L75
        L29:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L31:
            yhm.o.b(r7)
            r7 = 2
            java.lang.String r7 = r6.e(r7)
            boolean r7 = kotlin.text.d0.W(r7)
            if (r7 != 0) goto L4c
            fg8.b r7 = new fg8.b
            r2 = 5
            r7.<init>(r6, r2)
            ufm.c r2 = new ufm.c
            r4 = 2
            r2.<init>(r7, r4)
            goto L54
        L4c:
            wsg.n r7 = r5.f261840a
            com.revolut.core.model.account.AccountId$Personal r2 = com.revolut.core.model.account.AccountId.Personal.f51414a
            ufm.i r2 = r7.x(r2)
        L54:
            sda.a r7 = new sda.a
            r4 = 1
            r7.<init>(r5, r6, r4)
            sc7.g r6 = new sc7.g
            r4 = 20
            r6.<init>(r7, r4)
            ufm.i r7 = new ufm.i
            r4 = 1
            r7.<init>(r2, r6, r4)
            java.lang.String r6 = "map(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r7, r6)
            r0.f261839w = r3
            java.lang.Object r7 = nim.a.b(r7, r0)
            if (r7 != r1) goto L75
            return r1
        L75:
            java.lang.String r6 = "await(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r7, r6)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: sda.c.e(jf0.c, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // jf0.d
    public final d0 f(jf0.c deeplink, boolean z) {
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        z zVarD = new pfm.a(new i(!kotlin.text.d0.W(deeplink.e(2)) ? new ufm.c(new fg8.b(deeplink, 5), 2) : this.f261840a.x(AccountId.Personal.f51414a), new g(new a(this, deeplink, 0), 18), 1), new g(new f(z && deeplink.l(), this, 28), 19), 4).D(Boolean.TRUE);
        Intrinsics.checkNotNullExpressionValue(zVarD, "toSingleDefault(...)");
        return zVarD;
    }
}
