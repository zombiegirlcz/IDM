package com.revolut.feature.kyc.impl.ondemand;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.kyc.api.R$string;
import com.revolut.feature.kyc.impl.ondemand.OnDemandFeatureInstallFlowContract$Step;
import com.revolut.kompot.navigable.TransitionAnimation;
import d8l.d;
import kotlin.jvm.internal.Intrinsics;
import nii.y0;
import nii.z;
import oi0.b;
import oki.h;
import tna.p;
import tqh.j;
import tw8.c;
import tw8.g;
import vkm.q;
import vkm.z1;
import yji.l;
import yki.i;

/* JADX INFO: loaded from: classes4.dex */
public final class a extends h implements c {
    public final OnDemandFeatureInstallFlowContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final z70.a f77842p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final xg0.a f77843q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final tw8.a f77844r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final z1 f77845s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final i f77846t;

    public a(OnDemandFeatureInstallFlowContract$InputData inputData, z70.a contextProvider, xg0.a dynamicDelivery, tw8.a dialogProvider) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(contextProvider, "contextProvider");
        Intrinsics.checkNotNullParameter(dynamicDelivery, "dynamicDelivery");
        Intrinsics.checkNotNullParameter(dialogProvider, "dialogProvider");
        this.o = inputData;
        this.f77842p = contextProvider;
        this.f77843q = dynamicDelivery;
        this.f77844r = dialogProvider;
        this.f77845s = q.b(0, 6, null);
        this.f77846t = d.a(this, new g(this, 0));
    }

    public final void I2() {
        Clause clause = this.o.f77840b;
        this.f77844r.getClass();
        l.a1(this, X1(new y0("ON_DEMAND_FEATURE_STATUS_DIALOG_ID", new z(new TextLocalisedClause(R$string.kyc_on_demand_feature_error_title, null, null, 14), new TextLocalisedClause(R$string.kyc_on_demand_feature_error_subtitle, null, null, 14), new TextLocalisedClause(R$string.common_action_try_again, null, null, 14), clause, null, null, false, null, null, null, null, null, null, 32724), false, 4)), null, null, new tw8.h(this, null), 3);
    }

    public final void J2(TransitionAnimation transitionAnimation) {
        h.t2(this, this.f77846t, OnDemandFeatureInstallFlowContract$Step.Intro.f77841a, false, transitionAnimation, false, 8);
        l.b1(this, ((b) this.f77843q).e(this.f77842p.getContext(), zhm.y0.b(this.o.f77839a)), null, new p(this, null, 22), 3);
    }

    @Override // yki.j
    public final void M0() {
        l2(new j(this, null, 16), new yi5.b(26));
    }

    @Override // yki.g
    public final yki.b s() {
        return this.f77846t;
    }
}
