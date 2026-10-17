package com.revolut.feature.junior_graduation.impl.ui.screen.identification;

import cli.g;
import cli.k;
import cli.n;
import cli.y;
import gh8.i;
import gh8.l;
import kotlin.jvm.internal.Intrinsics;
import mra.d;
import oki.h;
import om4.d0;
import rul.e;
import yi5.b;

/* JADX INFO: loaded from: classes4.dex */
public final class a extends h implements i {
    public final JuniorIdentificationScreenContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final e f76941p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final d0 f76942q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final kye.e f76943r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final gh8.a f76944s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final jh8.a f76945t;
    public final y u;
    public final com.revolut.kompot.navigable.vc.modal.a v;

    public a(n stateMapper, JuniorIdentificationScreenContract$InputData inputData, e juniorGraduationInteractor, d0 juniorPersonalisationInteractor, kye.e juniorGraduationDebugRepository, gh8.a bottomSheetMapper, jh8.a identificationIntentProvider) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(juniorGraduationInteractor, "juniorGraduationInteractor");
        Intrinsics.checkNotNullParameter(juniorPersonalisationInteractor, "juniorPersonalisationInteractor");
        Intrinsics.checkNotNullParameter(juniorGraduationDebugRepository, "juniorGraduationDebugRepository");
        Intrinsics.checkNotNullParameter(bottomSheetMapper, "bottomSheetMapper");
        Intrinsics.checkNotNullParameter(identificationIntentProvider, "identificationIntentProvider");
        this.o = inputData;
        this.f76941p = juniorGraduationInteractor;
        this.f76942q = juniorPersonalisationInteractor;
        this.f76943r = juniorGraduationDebugRepository;
        this.f76944s = bottomSheetMapper;
        this.f76945t = identificationIntentProvider;
        this.u = d.b(this, k.f25028a, stateMapper, null, false, 12);
        this.v = hx7.e.a(this, new g75.i(this, 27));
    }

    @Override // yji.l
    public final void I1() {
        if (this.o.f76939c) {
            l2(new l(this, null, 0), new b(26));
        }
    }

    @Override // zki.h
    public final com.revolut.kompot.navigable.vc.modal.a K() {
        return this.v;
    }

    @Override // cli.z
    public final g getState() {
        return this.u;
    }
}
