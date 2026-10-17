package com.revolut.feature.selfserve.entity.config.shared.flow;

import com.revolut.feature.selfserve.entity.config.shared.flow.EntityConfigFlowContract$Step;
import cp5.d;
import kotlin.jvm.internal.Intrinsics;
import oki.h;
import xxc.b;
import zhm.f0;

/* JADX INFO: loaded from: classes7.dex */
public final class a extends h implements b {
    public final EntityConfigFlowContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final yki.a f85829p;

    public a(EntityConfigFlowContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.o = inputData;
        xwd.a aVar = new xwd.a(this, 2);
        this.f85829p = d.a(this, EntityConfigFlowContract$Step.Home.f85828a, f0.f322471a, aVar);
    }

    @Override // yki.g
    public final yki.b s() {
        return this.f85829p;
    }
}
