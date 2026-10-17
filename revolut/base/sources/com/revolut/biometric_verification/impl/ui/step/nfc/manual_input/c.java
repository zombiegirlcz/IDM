package com.revolut.biometric_verification.impl.ui.step.nfc.manual_input;

import at.r;
import com.revolut.biometric_verification.impl.ui.step.nfc.manual_input.BiometricVerificationManualInputContract$ModalStep;
import com.revolut.biometric_verification.impl.ui.step.nfc.manual_input.BiometricVerificationManualInputContract$ViewControllerModelApi$InputEvent$CalendarSelectionEvent;
import com.revolut.kompot.common.ModalDestination;
import dt4.p;
import du.d;
import du.f;
import du.g;
import du.i;
import du.j;
import hx7.e;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import oki.h;
import te0.w;
import vkm.j2;

/* JADX INFO: loaded from: classes17.dex */
public final class c extends h implements i {
    public final BiometricVerificationManualInputContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final fu.a f50648p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final com.revolut.kompot.navigable.vc.modal.a f50649q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final Object f50650r;

    public c(r stateMapper, BiometricVerificationManualInputContract$InputData inputData, fu.a datePickerDialogTitleMapper) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(datePickerDialogTitleMapper, "datePickerDialogTitleMapper");
        this.o = inputData;
        this.f50648p = datePickerDialogTitleMapper;
        this.f50649q = e.a(this, new p(this, 4));
        this.f50650r = w.y0(new dgg.b(this, stateMapper, 19));
    }

    public final void I2(final du.h event) {
        Intrinsics.checkNotNullParameter(event, "event");
        if (event.equals(f.f117493a)) {
            B2();
            return;
        }
        boolean zEquals = event.equals(BiometricVerificationManualInputContract$ViewControllerModelApi$InputEvent$CalendarSelectionEvent.SelectDob.f50646a);
        ModalDestination.Style.BOTTOM_DIALOG bottom_dialog = ModalDestination.Style.BOTTOM_DIALOG.f98301a;
        com.revolut.kompot.navigable.vc.modal.a aVar = this.f50649q;
        if (zEquals) {
            h.v2(aVar, new BiometricVerificationManualInputContract$ModalStep.PickDateStep(gu.a.b(((j) ((j2) getState().f22677a).getValue()).f117496b), (BiometricVerificationManualInputContract$ViewControllerModelApi$InputEvent$CalendarSelectionEvent) event), bottom_dialog);
            return;
        }
        if (event.equals(BiometricVerificationManualInputContract$ViewControllerModelApi$InputEvent$CalendarSelectionEvent.SelectExpiryDate.f50647a)) {
            h.v2(aVar, new BiometricVerificationManualInputContract$ModalStep.PickDateStep(gu.a.b(((j) ((j2) getState().f22677a).getValue()).f117497c), (BiometricVerificationManualInputContract$ViewControllerModelApi$InputEvent$CalendarSelectionEvent) event), bottom_dialog);
            return;
        }
        if (event.equals(du.c.f117490a)) {
            C2(new du.a(((j) ((j2) getState().f22677a).getValue()).f117495a, ((j) ((j2) getState().f22677a).getValue()).f117496b, ((j) ((j2) getState().f22677a).getValue()).f117497c));
            return;
        }
        if (event instanceof g) {
            final int i = 0;
            H2(getState(), new Function1() { // from class: du.s
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    j update = (j) obj2;
                    switch (i) {
                        case 0:
                            Intrinsics.checkNotNullParameter(update, "$this$update");
                            return j.a(update, ((g) event).f117494a, null, null, 14);
                        case 1:
                            Intrinsics.checkNotNullParameter(update, "$this$update");
                            return j.a(update, null, gu.a.a(((e) event).f117492a), null, 13);
                        default:
                            Intrinsics.checkNotNullParameter(update, "$this$update");
                            return j.a(update, null, null, gu.a.a(((d) event).f117491a), 11);
                    }
                }
            });
        } else if (event instanceof du.e) {
            final int i2 = 1;
            H2(getState(), new Function1() { // from class: du.s
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    j update = (j) obj2;
                    switch (i2) {
                        case 0:
                            Intrinsics.checkNotNullParameter(update, "$this$update");
                            return j.a(update, ((g) event).f117494a, null, null, 14);
                        case 1:
                            Intrinsics.checkNotNullParameter(update, "$this$update");
                            return j.a(update, null, gu.a.a(((e) event).f117492a), null, 13);
                        default:
                            Intrinsics.checkNotNullParameter(update, "$this$update");
                            return j.a(update, null, null, gu.a.a(((d) event).f117491a), 11);
                    }
                }
            });
        } else {
            if (!(event instanceof d)) {
                throw new NoWhenBranchMatchedException();
            }
            final int i3 = 2;
            H2(getState(), new Function1() { // from class: du.s
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    j update = (j) obj2;
                    switch (i3) {
                        case 0:
                            Intrinsics.checkNotNullParameter(update, "$this$update");
                            return j.a(update, ((g) event).f117494a, null, null, 14);
                        case 1:
                            Intrinsics.checkNotNullParameter(update, "$this$update");
                            return j.a(update, null, gu.a.a(((e) event).f117492a), null, 13);
                        default:
                            Intrinsics.checkNotNullParameter(update, "$this$update");
                            return j.a(update, null, null, gu.a.a(((d) event).f117491a), 11);
                    }
                }
            });
        }
    }

    @Override // zki.h
    public final com.revolut.kompot.navigable.vc.modal.a K() {
        return this.f50649q;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // cli.z
    public final cli.g getState() {
        return (cli.g) this.f50650r.getValue();
    }
}
