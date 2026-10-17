package com.revolut.feature.credit.application.plugins.impl.ui.personal_details;

import c84.t;
import com.revolut.feature.credit.application.plugins.impl.ui.personal_details.PersonalDetailsFlowContract$Step;
import cp5.d;
import e54.r;
import e84.e;
import kotlin.jvm.internal.Intrinsics;
import yki.b;
import zhm.f0;

/* JADX INFO: loaded from: classes22.dex */
public final class a extends t implements eg4.a {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final PersonalDetailsFlowContract$InputData f68185p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final yki.a f68186q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(PersonalDetailsFlowContract$InputData inputData, e pluginControllerResolver) {
        super(pluginControllerResolver);
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(pluginControllerResolver, "pluginControllerResolver");
        this.f68185p = inputData;
        r rVar = new r(this, 27);
        this.f68186q = d.a(this, PersonalDetailsFlowContract$Step.Details.f68183a, f0.f322471a, rVar);
    }

    @Override // yki.g
    public final b s() {
        return this.f68186q;
    }
}
