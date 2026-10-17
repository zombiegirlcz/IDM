package com.revolut.feature.junior.isa.impl.ui.child_details;

import ba8.f;
import cli.y;
import com.revolut.data.model.Data;
import com.revolut.feature.rev10_main_screen.api.MainScreenTab;
import fa8.g;
import fa8.k;
import kbb.c;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import o7.d;
import oki.h;
import prl.e;
import vii.b;
import vkm.q;
import yji.l;

/* JADX INFO: loaded from: classes4.dex */
public final class a extends h implements g {
    public final JuniorIsaChildDetailsScreenContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final hj8.a f76761p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final f f76762q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final e f76763r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final d f76764s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final c f76765t;
    public final y u;
    public final com.revolut.kompot.navigable.vc.modal.a v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final b f76766w;

    public a(k stateMapper, JuniorIsaChildDetailsScreenContract$InputData inputData, hj8.a juniorProfileInteractor, f juniorIsaNaviProvider, e juniorCreationInteractor, d jisaDateOfBirthValidator, c juniorConfigInteractor) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(juniorProfileInteractor, "juniorProfileInteractor");
        Intrinsics.checkNotNullParameter(juniorIsaNaviProvider, "juniorIsaNaviProvider");
        Intrinsics.checkNotNullParameter(juniorCreationInteractor, "juniorCreationInteractor");
        Intrinsics.checkNotNullParameter(jisaDateOfBirthValidator, "jisaDateOfBirthValidator");
        Intrinsics.checkNotNullParameter(juniorConfigInteractor, "juniorConfigInteractor");
        this.o = inputData;
        this.f76761p = juniorProfileInteractor;
        this.f76762q = juniorIsaNaviProvider;
        this.f76763r = juniorCreationInteractor;
        this.f76764s = jisaDateOfBirthValidator;
        this.f76765t = juniorConfigInteractor;
        this.u = mra.d.b(this, new fa8.f(new Data(null, null, true, 3, null), null, new Data(null, null, true, 3, null)), stateMapper, null, false, 12);
        this.v = hx7.e.a(this, new eul.f(this, 23));
        this.f76766w = new b();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object I2(com.revolut.feature.junior.isa.impl.ui.child_details.a r6, com.revolut.feature.junior_profile.api.models.a r7, gim.c r8) {
        /*
            boolean r0 = r8 instanceof fa8.i
            if (r0 == 0) goto L13
            r0 = r8
            fa8.i r0 = (fa8.i) r0
            int r1 = r0.f133256x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f133256x = r1
            goto L18
        L13:
            fa8.i r0 = new fa8.i
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f133256x
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            com.revolut.feature.junior_profile.api.models.a r7 = r0.u
            yhm.o.b(r8)
            goto L5c
        L29:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L31:
            yhm.o.b(r8)
            prl.e r8 = r6.f76763r
            java.lang.String r2 = r7.getF77098a()
            cli.y r6 = r6.u
            java.lang.Object r6 = r6.f22677a
            vkm.j2 r6 = (vkm.j2) r6
            java.lang.Object r6 = r6.getValue()
            fa8.f r6 = (fa8.f) r6
            com.revolut.feature.address.models.Address r6 = r6.f133251b
            if (r6 == 0) goto L8e
            kf8.i r4 = kf8.i.TRADING
            kf8.f r5 = new kf8.f
            r5.<init>(r2, r6, r4)
            r0.u = r7
            r0.f133256x = r3
            java.lang.Object r8 = r8.l(r5, r0)
            if (r8 != r1) goto L5c
            return r1
        L5c:
            com.revolut.feature.junior_profile.api.models.a r8 = (com.revolut.feature.junior_profile.api.models.a) r8
            boolean r6 = r8 instanceof com.revolut.feature.junior_profile.api.models.c
            r0 = 0
            if (r6 == 0) goto L66
            com.revolut.feature.junior_profile.api.models.c r8 = (com.revolut.feature.junior_profile.api.models.c) r8
            goto L67
        L66:
            r8 = r0
        L67:
            if (r8 == 0) goto L7e
            java.util.List r6 = r8.f77119j
            java.util.ArrayList r6 = uc0.b.o(r6)
            java.lang.Object r6 = zhm.d0.d0(r6)
            com.revolut.feature.junior_profile.api.models.f r6 = (com.revolut.feature.junior_profile.api.models.f) r6
            if (r6 == 0) goto L7b
            java.lang.String r0 = r6.a()
        L7b:
            if (r0 == 0) goto L7e
            return r0
        L7e:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = r7.getF77098a()
            java.lang.String r8 = "Junior profile with TRADING service not found after creation for id: "
            java.lang.String r7 = j6.a.q(r8, r7)
            r6.<init>(r7)
            throw r6
        L8e:
            java.lang.String r6 = r7.getF77098a()
            java.lang.String r7 = "Address is required for creating Junior ISA account for id: "
            java.lang.String r6 = j6.a.q(r7, r6)
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
            java.lang.String r6 = r6.toString()
            r7.<init>(r6)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.junior.isa.impl.ui.child_details.a.I2(com.revolut.feature.junior.isa.impl.ui.child_details.a, com.revolut.feature.junior_profile.api.models.a, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object J2(com.revolut.feature.junior.isa.impl.ui.child_details.a r4, java.lang.String r5, java.lang.String r6, gim.c r7) {
        /*
            boolean r0 = r7 instanceof fa8.j
            if (r0 == 0) goto L13
            r0 = r7
            fa8.j r0 = (fa8.j) r0
            int r1 = r0.f133259y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f133259y = r1
            goto L18
        L13:
            fa8.j r0 = new fa8.j
            r0.<init>(r4, r7)
        L18:
            java.lang.Object r7 = r0.f133257w
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f133259y
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
            r0.f133259y = r3
            java.lang.Object r7 = r4.K2(r5, r0)
            if (r7 != r1) goto L43
            return r1
        L43:
            com.revolut.retail.core.navigation.NaviCommand r7 = (com.revolut.retail.core.navigation.NaviCommand) r7
            s98.a r4 = s98.a.ACCOUNT_ONBOARDING
            com.revolut.feature.junior.isa.api.navigation.JuniorIsaDestination$JISANationalNumberDestination r0 = new com.revolut.feature.junior.isa.api.navigation.JuniorIsaDestination$JISANationalNumberDestination
            r0.<init>(r5, r6, r7, r4)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.junior.isa.impl.ui.child_details.a.J2(com.revolut.feature.junior.isa.impl.ui.child_details.a, java.lang.String, java.lang.String, gim.c):java.lang.Object");
    }

    @Override // yji.l
    public final void I1() {
        Continuation continuation = null;
        l.a1(this, q.Q(this.f76766w, new f5h.b(continuation, this, 1)), null, null, new f9d.c(this, continuation, 1), 3);
    }

    @Override // zki.h
    public final com.revolut.kompot.navigable.vc.modal.a K() {
        return this.v;
    }

    public final Object K2(String str, gim.c cVar) {
        MainScreenTab mainScreenTab = ibb.c.f160141b;
        return this.f76762q.c(str, jbb.a.a(mainScreenTab, null, null, null, 14), jbb.a.a(mainScreenTab, null, null, null, 14), cVar);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.u;
    }
}
