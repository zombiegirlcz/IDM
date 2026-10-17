package com.revolut.feature.credit.application.plugins.impl.ui.akahu;

import a3i.i;
import android.os.Parcelable;
import av8.n;
import c84.t;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.credit.application.plugins.impl.ui.akahu.AkahuFlowContract$Step;
import com.revolut.feature.credit.core.R$string;
import cp5.d;
import grl.k9;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.o0;
import mw3.c;
import mw3.e;
import nii.y;
import nii.y0;
import nii.z;
import yji.l;
import zhm.f0;

/* JADX INFO: loaded from: classes22.dex */
public final class b extends t implements b54.a {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final AkahuFlowContract$InputData f67026p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final c f67027q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final e f67028r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final yki.a f67029s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(AkahuFlowContract$InputData inputData, c akahuInteractor, e akahuPendingDeeplinkRelay, e84.e pluginControllerResolver) {
        super(pluginControllerResolver);
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(akahuInteractor, "akahuInteractor");
        Intrinsics.checkNotNullParameter(akahuPendingDeeplinkRelay, "akahuPendingDeeplinkRelay");
        Intrinsics.checkNotNullParameter(pluginControllerResolver, "pluginControllerResolver");
        this.f67026p = inputData;
        this.f67027q = akahuInteractor;
        this.f67028r = akahuPendingDeeplinkRelay;
        n nVar = new n(this, 22);
        this.f67029s = d.a(this, AkahuFlowContract$Step.Intro.f67025a, f0.f322471a, nVar);
    }

    @Override // yji.l
    public final void I1() {
        Continuation continuation = null;
        l.a1(this, new i(this.f67028r.f209325c, this, 28), new avk.i(this, continuation, 25), null, new b54.e(this, continuation, 0), 2);
    }

    @Override // yji.l
    public final void O1() throws Throwable {
        String applicationId = this.f67026p.a9().f137835a;
        e eVar = this.f67028r;
        eVar.getClass();
        Intrinsics.checkNotNullParameter(applicationId, "applicationId");
        if (Intrinsics.f(eVar.f209323a, applicationId)) {
            eVar.f209323a = null;
            eVar.f209324b.i();
        }
    }

    public final void P2(Throwable th10) {
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.credit_common_error_title, null, null, 14);
        k9 k9Var = k9.Credit;
        Parcelable.Creator<AnalyticsProduct.Retail> creator = AnalyticsProduct.Retail.CREATOR;
        l.a1(this, X1(new y0(null, new z(textLocalisedClause, null, null, null, null, null, false, com.google.android.gms.internal.mlkit_vision_face.a.h(k9Var, "value", k9Var), null, null, null, new y(com.google.android.gms.internal.mlkit_vision_face.a.o(o0.f186429a.b(th10.getClass()).m(), ": ", th10.getMessage()), n14.e.m(th10)), null, 24062), false, 5)), null, null, new az.i(this, null, 7), 3);
    }

    @Override // yki.g
    public final yki.b s() {
        return this.f67029s;
    }
}
