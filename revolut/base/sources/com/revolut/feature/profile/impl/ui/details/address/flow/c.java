package com.revolut.feature.profile.impl.ui.details.address.flow;

import ang.f;
import com.revolut.feature.profile.api.navigation.ProfileAddressControllerDescriptor;
import d8l.d;
import kotlin.jvm.internal.Intrinsics;
import oki.h;
import qgf.o;
import v60.e;
import yki.i;

/* JADX INFO: loaded from: classes5.dex */
public final class c extends h implements qma.b {
    public final ProfileAddressControllerDescriptor.InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final f f81372p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final xoj.a f81373q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final fk3.a f81374r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final kma.b f81375s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final sf0.h f81376t;
    public final e u;
    public final i v;

    public c(ProfileAddressControllerDescriptor.InputData inputData, f userInteractor, xoj.a featuresInteractor, fk3.a configurationInteractor, kma.b countryChangePickerInteractorProvider, sf0.h serverErrorParser, e serverErrorsProvider) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(userInteractor, "userInteractor");
        Intrinsics.checkNotNullParameter(featuresInteractor, "featuresInteractor");
        Intrinsics.checkNotNullParameter(configurationInteractor, "configurationInteractor");
        Intrinsics.checkNotNullParameter(countryChangePickerInteractorProvider, "countryChangePickerInteractorProvider");
        Intrinsics.checkNotNullParameter(serverErrorParser, "serverErrorParser");
        Intrinsics.checkNotNullParameter(serverErrorsProvider, "serverErrorsProvider");
        this.o = inputData;
        this.f81372p = userInteractor;
        this.f81373q = featuresInteractor;
        this.f81374r = configurationInteractor;
        this.f81375s = countryChangePickerInteractorProvider;
        this.f81376t = serverErrorParser;
        this.u = serverErrorsProvider;
        this.v = d.a(this, new qm2.c(this, 1));
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0063, code lost:
    
        if (nim.a.a(r5, r0) == r1) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object I2(com.revolut.feature.profile.impl.ui.details.address.flow.c r5, com.revolut.feature.address.models.Address r6, gim.c r7) {
        /*
            boolean r0 = r7 instanceof qma.d
            if (r0 == 0) goto L13
            r0 = r7
            qma.d r0 = (qma.d) r0
            int r1 = r0.f247790w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f247790w = r1
            goto L18
        L13:
            qma.d r0 = new qma.d
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f247790w
            r3 = 1
            r4 = 2
            if (r2 == 0) goto L36
            if (r2 == r3) goto L32
            if (r2 != r4) goto L2a
            yhm.o.b(r7)
            goto L66
        L2a:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L32:
            yhm.o.b(r7)
            goto L51
        L36:
            yhm.o.b(r7)
            ang.f r7 = r5.f81372p
            eo3.a$a r2 = new eo3.a$a
            r2.<init>(r6, r4)
            java.util.List r6 = zhm.u.c(r2)
            pfm.t r6 = ylg.b.c(r7, r6)
            r0.f247790w = r3
            java.lang.Object r6 = nim.a.a(r6, r0)
            if (r6 != r1) goto L51
            goto L65
        L51:
            xoj.a r5 = r5.f81373q
            cpj.b r5 = (cpj.b) r5
            efm.b r5 = r5.i()
            pfm.a r5 = ue0.e.v(r5)
            r0.f247790w = r4
            java.lang.Object r5 = nim.a.a(r5, r0)
            if (r5 != r1) goto L66
        L65:
            return r1
        L66:
            kotlin.Unit r5 = kotlin.Unit.f186387a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.profile.impl.ui.details.address.flow.c.I2(com.revolut.feature.profile.impl.ui.details.address.flow.c, com.revolut.feature.address.models.Address, gim.c):java.lang.Object");
    }

    @Override // yki.j
    public final void M0() {
        l2(new b(this, null), new o(this, 14));
    }

    @Override // yki.g
    public final yki.b s() {
        return this.v;
    }
}
