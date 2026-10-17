package com.revolut.feature.junior_tasks.impl.ui.challenges_kompot.edit.screens.frequency;

import cli.y;
import com.revolut.feature.junior_tasks.impl.ui.challenges_kompot.edit.screens.frequency.ChallengeEditFrequencyScreenContract$ModalStep;
import com.revolut.kompot.common.ModalDestination;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import mra.d;
import oki.h;
import tp8.e;
import tp8.f;
import tp8.g;
import tp8.i;
import tp8.j;
import tp8.l;
import tp8.n;
import vkm.j2;

/* JADX INFO: loaded from: classes4.dex */
public final class a extends h implements j {
    public final y o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final com.revolut.kompot.navigable.vc.modal.a f77380p;

    public a(n stateMapper, ChallengeEditFrequencyScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.o = d.b(this, new e(inputData.f77376a, inputData.f77377b), stateMapper, null, false, 12);
        this.f77380p = hx7.e.a(this, new l(this, 0));
    }

    public final void I2(tp8.h event) {
        Intrinsics.checkNotNullParameter(event, "event");
        if (!(event instanceof f)) {
            if (!(event instanceof g)) {
                throw new NoWhenBranchMatchedException();
            }
            y yVar = this.o;
            C2(new i(((e) ((j2) yVar.f22677a).getValue()).f273313a, ((e) ((j2) yVar.f22677a).getValue()).f273314b));
            return;
        }
        String str = ((f) event).f273315a.f52580a;
        boolean zF = Intrinsics.f(str, "LIST_ID_START_DATE");
        ModalDestination.Style.BOTTOM_DIALOG bottom_dialog = ModalDestination.Style.BOTTOM_DIALOG.f98301a;
        com.revolut.kompot.navigable.vc.modal.a aVar = this.f77380p;
        if (zF) {
            h.v2(aVar, ChallengeEditFrequencyScreenContract$ModalStep.DatePicker.f77378a, bottom_dialog);
        } else if (Intrinsics.f(str, "LIST_ID_FREQUENCY")) {
            h.v2(aVar, ChallengeEditFrequencyScreenContract$ModalStep.FrequencyPicker.f77379a, bottom_dialog);
        }
    }

    @Override // zki.h
    public final com.revolut.kompot.navigable.vc.modal.a K() {
        return this.f77380p;
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.o;
    }
}
