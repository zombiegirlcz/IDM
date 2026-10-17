package com.revolut.feature.credit.application.plugins.impl.ui.preapplication;

import cli.g;
import cli.y;
import com.revolut.data.model.Data;
import com.revolut.feature.credit.application.models.preapplication.PreApplicationCheckItem;
import com.revolut.feature.credit.application.models.preapplication.PreApplicationChecksScenario;
import com.revolut.feature.credit.application.plugins.impl.ui.preapplication.PreApplicationChecksScreenContract$ModalStep;
import com.revolut.kompot.common.ModalDestination;
import hx7.e;
import java.util.ArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import mra.d;
import oki.h;
import r6f.i;
import rg4.n;
import rg4.p;
import rg4.q;
import rg4.s;
import rg4.v;
import rg4.x;
import vkm.j2;
import xq3.z;

/* JADX INFO: loaded from: classes22.dex */
public final class b extends h implements s {
    public final PreApplicationChecksScreenContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final z f68230p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final com.revolut.feature.credit.application.models.preapplication.a f68231q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final wsg.b f68232r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final y f68233s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final com.revolut.kompot.navigable.vc.modal.a f68234t;

    public b(PreApplicationChecksScreenContract$InputData inputData, z interactor, com.revolut.feature.credit.application.models.preapplication.a scenarioMapper, wsg.b newWalletsInteractor, x stateMapper) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(interactor, "interactor");
        Intrinsics.checkNotNullParameter(scenarioMapper, "scenarioMapper");
        Intrinsics.checkNotNullParameter(newWalletsInteractor, "newWalletsInteractor");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = inputData;
        this.f68230p = interactor;
        this.f68231q = scenarioMapper;
        this.f68232r = newWalletsInteractor;
        this.f68233s = d.b(this, new n(new Data(inputData.f68226c, null, false, 6, null), false), stateMapper, null, false, 12);
        this.f68234t = e.a(this, new i(this, 19));
    }

    public final void I2() {
        l2(new v(this, null, 0), new yi5.b(26));
    }

    public final void J2() {
        PreApplicationChecksScenario preApplicationChecksScenario = (PreApplicationChecksScenario) ((n) ((j2) this.f68233s.f22677a).getValue()).f254027a.getContent();
        boolean z = preApplicationChecksScenario instanceof PreApplicationChecksScenario.ReadyWithInfo;
        q qVar = q.f254031a;
        if (z) {
            C2(qVar);
            return;
        }
        if (!(preApplicationChecksScenario instanceof PreApplicationChecksScenario.RemediationRequired)) {
            if ((preApplicationChecksScenario instanceof PreApplicationChecksScenario.Blocked) || (preApplicationChecksScenario instanceof PreApplicationChecksScenario.RejectedUndisclosed)) {
                C2(p.f254030a);
                return;
            } else {
                if (!(preApplicationChecksScenario instanceof PreApplicationChecksScenario.Ready) && preApplicationChecksScenario != null) {
                    throw new NoWhenBranchMatchedException();
                }
                return;
            }
        }
        ArrayList<PreApplicationCheckItem> arrayList = ((PreApplicationChecksScenario.RemediationRequired) preApplicationChecksScenario).f66272a;
        if (!arrayList.isEmpty()) {
            for (PreApplicationCheckItem preApplicationCheckItem : arrayList) {
                if ((preApplicationCheckItem instanceof PreApplicationCheckItem.Remediable) || (preApplicationCheckItem instanceof PreApplicationCheckItem.Pending)) {
                    return;
                }
            }
        }
        C2(qVar);
    }

    @Override // zki.h
    public final com.revolut.kompot.navigable.vc.modal.a K() {
        return this.f68234t;
    }

    public final void K2() {
        if (((PreApplicationChecksScenario) ((n) ((j2) this.f68233s.f22677a).getValue()).f254027a.getContent()) instanceof PreApplicationChecksScenario.RejectedUndisclosed) {
            h.y2(this.f68234t, PreApplicationChecksScreenContract$ModalStep.Reapply.f68228a, ModalDestination.Style.BOTTOM_DIALOG.f98301a);
        }
    }

    @Override // yji.l
    public final void T1(long j2) {
        y yVar = this.f68233s;
        if (((n) ((j2) yVar.f22677a).getValue()).f254028b) {
            H2(yVar, new rg3.d(2));
            I2();
        }
    }

    @Override // cli.z
    public final g getState() {
        return this.f68233s;
    }
}
