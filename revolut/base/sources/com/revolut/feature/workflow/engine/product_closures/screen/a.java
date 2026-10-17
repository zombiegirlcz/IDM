package com.revolut.feature.workflow.engine.product_closures.screen;

import c8g.c;
import cli.g;
import cli.y;
import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;
import mra.d;
import oki.h;
import org.jetbrains.annotations.NotNull;
import wpj.b;
import wth.e;
import wth.i;
import wth.k;
import wth.m;
import yji.l;
import zuh.o;

/* JADX INFO: loaded from: classes10.dex */
public final class a extends h implements i {

    @NotNull
    public static final k Companion = new k();
    public final jvh.a o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final ProductClosuresScreenContract$Input f96508p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final y f96509q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final com.revolut.kompot.navigable.vc.modal.a f96510r;

    public a(m stateMapper, jvh.a workflowInteractor, ProductClosuresScreenContract$Input inputData) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(workflowInteractor, "workflowInteractor");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.o = workflowInteractor;
        this.f96508p = inputData;
        this.f96509q = d.b(this, new e(new Data(null, null, true, 3, null)), stateMapper, null, false, 12);
        this.f96510r = hx7.e.a(this, new wsg.e(25));
    }

    public final void I2() {
        String migrationContext = this.f96508p.f96506c;
        jvh.a aVar = this.o;
        aVar.getClass();
        Intrinsics.checkNotNullParameter(migrationContext, "migrationContext");
        o oVar = aVar.f178883a;
        oVar.getClass();
        Intrinsics.checkNotNullParameter(migrationContext, "migrationContext");
        l.b1(this, c.d(oVar.f325484h.b(migrationContext, w4l.i.f294643c), new b(this, 13)), null, new wka.e(this, null, 28), 3);
    }

    @Override // zki.h
    public final com.revolut.kompot.navigable.vc.modal.a K() {
        return this.f96510r;
    }

    @Override // yji.l
    public final void T1(long j2) {
        I2();
    }

    @Override // cli.z
    public final g getState() {
        return this.f96509q;
    }
}
