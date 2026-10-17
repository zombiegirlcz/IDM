package com.revolut.feature.security_hub.impl.ui.street_mode.flow;

import com.revolut.feature.security_hub.impl.ui.street_mode.flow.StreetModeFlowContract$Step;
import com.revolut.kompot.navigable.TransitionAnimation;
import cp5.d;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import oki.h;
import pvc.c;
import r10.t;
import vvc.i;
import vvc.j;
import vvc.k;
import vvc.l;
import zhm.f0;

/* JADX INFO: loaded from: classes7.dex */
public final class b extends h implements c {
    public final w39.b o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final pvc.a f85668p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final qvc.a f85669q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final t f85670r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final yki.a f85671s;

    public b(w39.b locationInteractor, pvc.a selectedLocationInteractor, StreetModeFlowContract$InputData inputData, qvc.a streetModeFlowDialogMapper, t streetModeProductArticleProvider) {
        Intrinsics.checkNotNullParameter(locationInteractor, "locationInteractor");
        Intrinsics.checkNotNullParameter(selectedLocationInteractor, "selectedLocationInteractor");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(streetModeFlowDialogMapper, "streetModeFlowDialogMapper");
        Intrinsics.checkNotNullParameter(streetModeProductArticleProvider, "streetModeProductArticleProvider");
        this.o = locationInteractor;
        this.f85668p = selectedLocationInteractor;
        this.f85669q = streetModeFlowDialogMapper;
        this.f85670r = streetModeProductArticleProvider;
        this.f85671s = d.a(this, inputData.f85655a, f0.f322471a, new pu4.d(this, 6));
    }

    public static final void I2(b bVar, l lVar) {
        yki.a aVar = bVar.f85671s;
        if (lVar instanceof i) {
            h.t2(bVar, aVar, new StreetModeFlowContract$Step.SearchLocationScreen(((i) lVar).f292512a), true, TransitionAnimation.FADE.f98392a, false, 8);
            return;
        }
        Continuation continuation = null;
        if (lVar instanceof j) {
            j jVar = (j) lVar;
            h.t2(bVar, aVar, new StreetModeFlowContract$Step.NameLocation(null, jVar.f292513a, jVar.f292514b), true, null, false, 12);
        } else if (lVar instanceof vvc.h) {
            h.D2(aVar);
        } else {
            if (!(lVar instanceof k)) {
                throw new NoWhenBranchMatchedException();
            }
            bVar.n2(new pe2.l(bVar, continuation, 29), new whi.b(6));
        }
    }

    @Override // yki.g
    public final yki.b s() {
        return this.f85671s;
    }
}
