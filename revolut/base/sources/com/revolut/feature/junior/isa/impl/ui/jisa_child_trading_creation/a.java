package com.revolut.feature.junior.isa.impl.ui.jisa_child_trading_creation;

import ang.f;
import cli.y;
import com.revolut.data.model.Data;
import com.revolut.feature.rev10_main_screen.api.MainScreenTab;
import kbb.c;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import mx5.g;
import na8.i;
import na8.l;
import na8.n;
import na8.u;
import o7.d;
import oki.h;
import prl.e;
import vii.b;
import vkm.q;
import zhm.d0;

/* JADX INFO: loaded from: classes4.dex */
public final class a extends h implements n {
    public final f o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final d f76781p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final hj8.a f76782q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final c f76783r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final e f76784s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final ba8.f f76785t;
    public final y u;
    public final com.revolut.kompot.navigable.vc.modal.a v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final b f76786w;

    public a(f userInteractor, d jisaDateOfBirthValidator, hj8.a juniorProfileInteractor, c juniorConfigInteractor, e juniorCreationInteractor, ba8.f juniorIsaNaviProvider, u stateMapper, JuniorIsaChildCreationScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(userInteractor, "userInteractor");
        Intrinsics.checkNotNullParameter(jisaDateOfBirthValidator, "jisaDateOfBirthValidator");
        Intrinsics.checkNotNullParameter(juniorProfileInteractor, "juniorProfileInteractor");
        Intrinsics.checkNotNullParameter(juniorConfigInteractor, "juniorConfigInteractor");
        Intrinsics.checkNotNullParameter(juniorCreationInteractor, "juniorCreationInteractor");
        Intrinsics.checkNotNullParameter(juniorIsaNaviProvider, "juniorIsaNaviProvider");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.o = userInteractor;
        this.f76781p = jisaDateOfBirthValidator;
        this.f76782q = juniorProfileInteractor;
        this.f76783r = juniorConfigInteractor;
        this.f76784s = juniorCreationInteractor;
        this.f76785t = juniorIsaNaviProvider;
        this.u = mra.d.b(this, new l(new Data(null, null, true, 3, null), new Data(null, null, true, 3, null), new Data(null, null, true, 3, null), new Data(null, null, true, 3, null), null, false, null, i.f213826a, null, null, null, inputData.f76778a), stateMapper, null, false, 12);
        this.v = hx7.e.a(this, new n8i.e(this, 3));
        this.f76786w = new b();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object I2(com.revolut.feature.junior.isa.impl.ui.jisa_child_trading_creation.a r4, java.lang.String r5, java.lang.String r6, gim.c r7) {
        /*
            boolean r0 = r7 instanceof na8.r
            if (r0 == 0) goto L13
            r0 = r7
            na8.r r0 = (na8.r) r0
            int r1 = r0.f213845y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f213845y = r1
            goto L18
        L13:
            na8.r r0 = new na8.r
            r0.<init>(r4, r7)
        L18:
            java.lang.Object r7 = r0.f213843w
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f213845y
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            java.lang.String r6 = r0.v
            java.lang.String r5 = r0.u
            yhm.o.b(r7)
            goto L43
        L2b:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L33:
            yhm.o.b(r7)
            r0.u = r5
            r0.v = r6
            r0.f213845y = r3
            java.lang.Object r7 = r4.J2(r5, r0)
            if (r7 != r1) goto L43
            return r1
        L43:
            com.revolut.retail.core.navigation.NaviCommand r7 = (com.revolut.retail.core.navigation.NaviCommand) r7
            s98.a r4 = s98.a.ACCOUNT_ONBOARDING
            com.revolut.feature.junior.isa.api.navigation.JuniorIsaDestination$JISANationalNumberDestination r0 = new com.revolut.feature.junior.isa.api.navigation.JuniorIsaDestination$JISANationalNumberDestination
            r0.<init>(r5, r6, r7, r4)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.junior.isa.impl.ui.jisa_child_trading_creation.a.I2(com.revolut.feature.junior.isa.impl.ui.jisa_child_trading_creation.a, java.lang.String, java.lang.String, gim.c):java.lang.Object");
    }

    public static String K2(com.revolut.feature.junior_profile.api.models.a aVar) {
        com.revolut.feature.junior_profile.api.models.f fVar;
        String strA;
        com.revolut.feature.junior_profile.api.models.c cVar = aVar instanceof com.revolut.feature.junior_profile.api.models.c ? (com.revolut.feature.junior_profile.api.models.c) aVar : null;
        if (cVar == null || (fVar = (com.revolut.feature.junior_profile.api.models.f) d0.d0(uc0.b.o(cVar.f77119j))) == null || (strA = fVar.a()) == null) {
            throw new IllegalStateException(j6.a.q("Junior profile with TRADING service not found for id: ", aVar.getF77098a()));
        }
        return strA;
    }

    @Override // yji.l
    public final void I1() {
        Continuation continuation = null;
        yji.l.a1(this, q.Q(this.f76786w, new mk0.f(continuation, this, 20)), null, null, new g(this, continuation, 29), 3);
    }

    public final Object J2(String str, gim.c cVar) {
        MainScreenTab mainScreenTab = ibb.c.f160141b;
        return this.f76785t.c(str, jbb.a.a(mainScreenTab, null, null, null, 14), jbb.a.a(mainScreenTab, null, null, null, 14), cVar);
    }

    @Override // zki.h
    public final com.revolut.kompot.navigable.vc.modal.a K() {
        return this.v;
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.u;
    }
}
