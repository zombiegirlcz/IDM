package com.revolut.feature.junior_graduation.impl.ui.flow.identification;

import com.revolut.feature.junior_graduation.impl.ui.flow.identification.IdentificationFlowContract$Step;
import cp5.d;
import kotlin.jvm.internal.Intrinsics;
import oki.h;
import org.jetbrains.annotations.NotNull;
import zg8.b;
import zg8.c;
import zhm.f0;

/* JADX INFO: loaded from: classes4.dex */
public final class a extends h implements b {

    @NotNull
    public static final c Companion = new c();
    public final IdentificationFlowContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final yg8.c f76929p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final c90.c f76930q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final yki.a f76931r;

    public a(IdentificationFlowContract$InputData inputData, yg8.c juniorAppNaviCommandProvider, c90.c uiResources) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(juniorAppNaviCommandProvider, "juniorAppNaviCommandProvider");
        Intrinsics.checkNotNullParameter(uiResources, "uiResources");
        this.o = inputData;
        this.f76929p = juniorAppNaviCommandProvider;
        this.f76930q = uiResources;
        zba.a aVar = new zba.a(this, 14);
        this.f76931r = d.a(this, IdentificationFlowContract$Step.JuniorIdentificationScreen.f76928a, f0.f322471a, aVar);
    }

    @Override // yki.g
    public final yki.b s() {
        return this.f76931r;
    }
}
