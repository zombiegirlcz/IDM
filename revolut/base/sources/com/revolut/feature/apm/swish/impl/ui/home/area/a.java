package com.revolut.feature.apm.swish.impl.ui.home.area;

import cli.n;
import cli.y;
import com.revolut.data.model.Data;
import com.revolut.feature.apm.swish.impl.ui.home.domain.AreaContent;
import hx7.e;
import kotlin.jvm.internal.Intrinsics;
import mra.d;
import oki.h;
import org.jetbrains.annotations.NotNull;
import pe2.g;
import pe2.k;
import pe2.l;
import vkm.j2;
import yi5.b;
import zi0.c;

/* JADX INFO: loaded from: classes20.dex */
public final class a extends h implements pe2.h {

    @NotNull
    public static final k Companion = new k();
    public final com.revolut.feature.apm.swish.impl.domain.a o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final pe2.a f62925p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final y f62926q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final com.revolut.kompot.navigable.vc.modal.a f62927r;

    public a(n stateMapper, SwishHomeAreaScreenContract$InputData inputData, com.revolut.feature.apm.swish.impl.domain.a swishInteractor, pe2.a dialogProvider) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(swishInteractor, "swishInteractor");
        Intrinsics.checkNotNullParameter(dialogProvider, "dialogProvider");
        this.o = swishInteractor;
        this.f62925p = dialogProvider;
        AreaContent areaContent = inputData.f62921a;
        this.f62926q = d.b(this, new g(areaContent != null ? c.P(areaContent, false, null, 3) : new Data(null, null, true, 3, null)), stateMapper, null, false, 12);
        this.f62927r = e.a(this, new p5f.c(this, 14));
    }

    @Override // yji.l
    public final void I1() {
        if (((AreaContent) ((g) ((j2) this.f62926q.f22677a).getValue()).f235320a.getContent()) == null) {
            l2(new l(this, null, 0), new b(26));
        }
    }

    @Override // zki.h
    public final com.revolut.kompot.navigable.vc.modal.a K() {
        return this.f62927r;
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f62926q;
    }
}
