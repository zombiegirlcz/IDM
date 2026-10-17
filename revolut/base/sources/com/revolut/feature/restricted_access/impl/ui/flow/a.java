package com.revolut.feature.restricted_access.impl.ui.flow;

import android.net.Uri;
import c0b.c;
import com.revolut.feature.restricted_access.api.FeatureNotAvailableDestination;
import com.revolut.feature.restricted_access.impl.ui.flow.FeatureNotAvailableFlowContract$Step;
import com.revolut.kompot.bridge.navigation.MainScreenDestination;
import com.revolut.kompot.common.ExternalDestination;
import cp5.d;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import oki.h;
import org.jetbrains.annotations.NotNull;
import zhm.f0;

/* JADX INFO: loaded from: classes5.dex */
public final class a extends h implements c0b.b {

    @NotNull
    public static final c Companion = new c();
    public final FeatureNotAvailableFlowContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final f80.a f82051p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final yki.a f82052q;

    public a(FeatureNotAvailableFlowContract$InputData inputData, f80.a uriHelper) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(uriHelper, "uriHelper");
        this.o = inputData;
        this.f82051p = uriHelper;
        bwd.a aVar = new bwd.a(this, 7);
        this.f82052q = d.a(this, FeatureNotAvailableFlowContract$Step.Initial.f82048a, f0.f322471a, aVar);
    }

    public final void I2(FeatureNotAvailableDestination.Action action) {
        if (Intrinsics.f(action, FeatureNotAvailableDestination.Action.Close.f82019a)) {
            h.D2(this.f82052q);
            Unit unit = Unit.f186387a;
            return;
        }
        if (Intrinsics.f(action, FeatureNotAvailableDestination.Action.NavigateToMain.f82021a)) {
            C1(MainScreenDestination.f98280a);
            return;
        }
        if (action instanceof FeatureNotAvailableDestination.Action.NavigateToDestination) {
            C1(((FeatureNotAvailableDestination.Action.NavigateToDestination) action).f82020a);
            return;
        }
        if (!(action instanceof FeatureNotAvailableDestination.Action.OpenDeeplink)) {
            throw new NoWhenBranchMatchedException();
        }
        FeatureNotAvailableDestination.Action.OpenDeeplink openDeeplink = (FeatureNotAvailableDestination.Action.OpenDeeplink) action;
        Uri uriG = ((f80.b) this.f82051p).g(openDeeplink.f82022a);
        if (uriG != null) {
            C1(new ExternalDestination.ImplicitActivity("android.intent.action.VIEW", null, uriG, 0, null, 494));
        } else {
            I2(openDeeplink.f82023b);
            Unit unit2 = Unit.f186387a;
        }
    }

    @Override // yki.g
    public final yki.b s() {
        return this.f82052q;
    }
}
