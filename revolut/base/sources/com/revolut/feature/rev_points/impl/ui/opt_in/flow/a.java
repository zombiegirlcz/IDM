package com.revolut.feature.rev_points.impl.ui.opt_in.flow;

import a2c.e;
import com.revolut.feature.rev_points.api.navigation.descriptor.LifestyleRevPointsOptInController$InputData;
import com.revolut.feature.rev_points.impl.ui.opt_in.flow.LifestyleRevPointsFlowContract$Step;
import com.revolut.kompot.navigable.vc.ViewController;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$BooleanRef;
import oki.h;
import pth.m;
import pu4.d;
import pzb.b;
import zhm.f0;

/* JADX INFO: loaded from: classes6.dex */
public final class a extends h implements b {
    public final eub.a o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final LifestyleRevPointsOptInController$InputData f83813p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final gte.a f83814q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final e f83815r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final yki.a f83816s;

    public a(eub.a revPointsAvailabilityInteractor, LifestyleRevPointsOptInController$InputData inputData, gte.a featureToggleInteractor, e spareChangeNavigationResolver) {
        Intrinsics.checkNotNullParameter(revPointsAvailabilityInteractor, "revPointsAvailabilityInteractor");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        Intrinsics.checkNotNullParameter(spareChangeNavigationResolver, "spareChangeNavigationResolver");
        this.o = revPointsAvailabilityInteractor;
        this.f83813p = inputData;
        this.f83814q = featureToggleInteractor;
        this.f83815r = spareChangeNavigationResolver;
        d dVar = new d(this, 14);
        this.f83816s = cp5.d.a(this, LifestyleRevPointsFlowContract$Step.OptIn.f83808a, f0.f322471a, dVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object I2(com.revolut.feature.rev_points.impl.ui.opt_in.flow.a r10, gim.c r11) {
        /*
            Method dump skipped, instruction units count: 208
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.rev_points.impl.ui.opt_in.flow.a.I2(com.revolut.feature.rev_points.impl.ui.opt_in.flow.a, gim.c):java.lang.Object");
    }

    public final void J2(ViewController viewController) {
        Ref$BooleanRef ref$BooleanRef = new Ref$BooleanRef();
        m block = new m(ref$BooleanRef, this, 16);
        Intrinsics.checkNotNullParameter(block, "block");
        viewController.H = block;
        viewController.k2(new pt4.d(ref$BooleanRef, this, 11));
    }

    @Override // yki.g
    public final yki.b s() {
        return this.f83816s;
    }
}
