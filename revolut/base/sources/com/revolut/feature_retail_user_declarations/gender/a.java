package com.revolut.feature_retail_user_declarations.gender;

import cli.g;
import cli.y;
import hx7.e;
import kotlin.jvm.internal.Intrinsics;
import mbi.f;
import mbi.j;
import mbi.l;
import mra.d;
import od0.i;
import oki.h;

/* JADX INFO: loaded from: classes10.dex */
public final class a extends h implements j {
    public final GenderScreenContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final y f97653p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final com.revolut.kompot.navigable.vc.modal.a f97654q;

    public a(GenderScreenContract$InputData inputData, l stateMapper) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = inputData;
        i.Companion.getClass();
        this.f97653p = d.b(this, new f(i.f224256b), stateMapper, null, false, 12);
        this.f97654q = e.a(this, new m84.e(this, 8));
    }

    @Override // zki.h
    public final com.revolut.kompot.navigable.vc.modal.a K() {
        return this.f97654q;
    }

    @Override // cli.z
    public final g getState() {
        return this.f97653p;
    }
}
