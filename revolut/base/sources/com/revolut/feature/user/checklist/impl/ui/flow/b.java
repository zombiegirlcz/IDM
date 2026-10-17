package com.revolut.feature.user.checklist.impl.ui.flow;

import com.revolut.feature.user.checklist.api.UserChecklistContentType;
import com.revolut.feature.user.checklist.impl.ui.flow.ChecklistFlowContract$Step;
import com.revolut.kompot.common.ModalDestination;
import d8l.d;
import jid.z;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import oki.h;
import pe2.l;
import plb.g;
import wli.x;
import yki.i;

/* JADX INFO: loaded from: classes9.dex */
public final class b extends h implements pmg.b {
    public final ChecklistFlowContract$ChecklistFlowInputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final x f94608p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final emg.a f94609q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final z f94610r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final i f94611s;

    public b(ChecklistFlowContract$ChecklistFlowInputData inputData, x deeplinkHandler, emg.a userChecklistInteractor, z fincrimeChecklistSlotManagerDelegate) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(deeplinkHandler, "deeplinkHandler");
        Intrinsics.checkNotNullParameter(userChecklistInteractor, "userChecklistInteractor");
        Intrinsics.checkNotNullParameter(fincrimeChecklistSlotManagerDelegate, "fincrimeChecklistSlotManagerDelegate");
        this.o = inputData;
        this.f94608p = deeplinkHandler;
        this.f94609q = userChecklistInteractor;
        this.f94610r = fincrimeChecklistSlotManagerDelegate;
        this.f94611s = d.a(this, new g(this, 6));
    }

    @Override // yki.j
    public final void M0() {
        ChecklistFlowContract$ChecklistFlowInputData checklistFlowContract$ChecklistFlowInputData = this.o;
        UserChecklistContentType userChecklistContentType = checklistFlowContract$ChecklistFlowInputData.f94603b;
        boolean z = checklistFlowContract$ChecklistFlowInputData.f94604c;
        boolean zF = Intrinsics.f(userChecklistContentType, UserChecklistContentType.AdoptionJourney.f94595a);
        ModalDestination.Style.BOTTOM_DIALOG bottom_dialog = ModalDestination.Style.BOTTOM_DIALOG.f98301a;
        i iVar = this.f94611s;
        if (zF) {
            h.w2(iVar, new ChecklistFlowContract$Step.UserChecklistStep(z), bottom_dialog);
            return;
        }
        if (!Intrinsics.f(userChecklistContentType, UserChecklistContentType.FincrimeChecklist.f94596a)) {
            throw new NoWhenBranchMatchedException();
        }
        if (z) {
            h.w2(iVar, new ChecklistFlowContract$Step.UserChecklistStep(false), bottom_dialog);
        } else {
            n2(new l(this, null, 16), new whi.b(6));
        }
    }

    @Override // yki.g
    public final yki.b s() {
        return this.f94611s;
    }
}
