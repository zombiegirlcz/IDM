package com.revolut.feature.card_personalisation.generation.impl.ui.generation;

import cli.g;
import cli.j;
import cli.n;
import cli.y;
import com.revolut.data.model.Data;
import d33.f;
import e93.g0;
import h6i.n0;
import hx7.e;
import imk.p0;
import j4h.m;
import j53.i;
import j53.k;
import j53.o;
import j53.p;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import mra.d;
import n60.b;
import oki.h;
import org.jetbrains.annotations.NotNull;
import r70.c;
import skm.a2;
import vkm.j2;
import yji.l;
import zhm.f0;

/* JADX INFO: loaded from: classes21.dex */
public final class a extends h implements j53.h {

    @NotNull
    public static final p Companion = new p();
    public final CustomisationImageGenerationControllerContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final a53.a f65313p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final wj0.a f65314q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final n60.a f65315r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final b f65316s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final sf0.h f65317t;
    public final c u;
    public final f v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public a2 f65318w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public a2 f65319x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final y f65320y;
    public final com.revolut.kompot.navigable.vc.modal.a z;

    public a(n stateMapper, CustomisationImageGenerationControllerContract$InputData inputData, a53.a customisationImageGenerationInteractor, wj0.a idempotencyKeyHolder, n60.a keyboardControllerExtension, b keyboardViewControllerExtension, sf0.h serverErrorParser, c hapticEngine, f guidelinesControllerFactory) {
        j iVar;
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(customisationImageGenerationInteractor, "customisationImageGenerationInteractor");
        Intrinsics.checkNotNullParameter(idempotencyKeyHolder, "idempotencyKeyHolder");
        Intrinsics.checkNotNullParameter(keyboardControllerExtension, "keyboardControllerExtension");
        Intrinsics.checkNotNullParameter(keyboardViewControllerExtension, "keyboardViewControllerExtension");
        Intrinsics.checkNotNullParameter(serverErrorParser, "serverErrorParser");
        Intrinsics.checkNotNullParameter(hapticEngine, "hapticEngine");
        Intrinsics.checkNotNullParameter(guidelinesControllerFactory, "guidelinesControllerFactory");
        this.o = inputData;
        this.f65313p = customisationImageGenerationInteractor;
        this.f65314q = idempotencyKeyHolder;
        this.f65315r = keyboardControllerExtension;
        this.f65316s = keyboardViewControllerExtension;
        this.f65317t = serverErrorParser;
        this.u = hapticEngine;
        this.v = guidelinesControllerFactory;
        g0 g0Var = inputData.f65311a;
        if (g0Var != null) {
            iVar = new k(new Data(g0Var, null, false, 6, null), new Data(f0.f322471a, null, false, 6, null), g0Var.f123865a, null);
        } else {
            iVar = new i(false);
        }
        this.f65320y = d.b(this, iVar, stateMapper, null, false, 12);
        this.z = e.a(this, new j2c.n(this, 6));
    }

    @Override // yji.l
    public final void I1() {
        this.f65314q.a("CUSTOMISATION_IMAGE_GENERATION");
        g0 g0Var = this.o.f65311a;
        Continuation continuation = null;
        if (g0Var != null) {
            a2 a2Var = this.f65319x;
            if (a2Var != null) {
                a2Var.f(null);
            }
            this.f65319x = l2(new n0(g0Var, this, continuation, 1), new yi5.b(26));
        }
        if (((j2) this.f65320y.f22677a).getValue() instanceof i) {
            l2(new p0(this, continuation, 16), new yi5.b(26));
        }
        l.a1(this, yh5.b.d(((h53.c) ((f53.b) this.f65313p).f132263a).f.b(Unit.f186387a, w4l.h.f294642c), rd0.e.b(this.f65316s.d)), null, null, new iug.j(this, continuation, 22), 3);
    }

    public final void I2(String input) {
        Intrinsics.checkNotNullParameter(input, "input");
        y yVar = this.f65320y;
        j53.l lVar = (j53.l) ((j2) yVar.f22677a).getValue();
        if (lVar instanceof i) {
            if (input.length() <= 80) {
                H2(yVar, new m((i) lVar, input, 2));
            } else {
                c.b(this.u, 3);
                H2(yVar, new o((i) lVar, 0));
            }
        }
    }

    public final void J2() {
        a2 a2Var = this.f65318w;
        if (a2Var != null) {
            a2Var.f(null);
        }
        a2 a2Var2 = this.f65319x;
        if (a2Var2 != null) {
            a2Var2.f(null);
        }
        this.f65314q.a("CUSTOMISATION_IMAGE_GENERATION");
        H2(this.f65320y, new j3f.d(9));
    }

    @Override // zki.h
    public final com.revolut.kompot.navigable.vc.modal.a K() {
        return this.z;
    }

    @Override // cli.z
    public final g getState() {
        return this.f65320y;
    }
}
