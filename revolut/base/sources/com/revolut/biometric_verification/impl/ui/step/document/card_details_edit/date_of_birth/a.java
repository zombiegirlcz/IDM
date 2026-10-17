package com.revolut.biometric_verification.impl.ui.step.document.card_details_edit.date_of_birth;

import cli.g;
import cli.n;
import com.revolut.biometric_verification.impl.ui.step.document.card_details_edit.date_of_birth.BiometricVerificationMyNumberDateOfBirthEditScreenContract$ModalStep;
import com.revolut.biometric_verification.impl.ui.step.document.flow.BiometricVerificationDocumentStepFlowContract$MyNumberCardDetails;
import com.revolut.kompot.common.ModalDestination;
import hx7.e;
import java.time.LocalDate;
import java.util.Iterator;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.d0;
import mra.d;
import oki.h;
import omi.b;
import vkm.j2;
import yo7.p;
import ys.a0;
import ys.b0;
import ys.c0;
import ys.j;
import ys.k;
import ys.l;
import ys.m;
import ys.o;
import ys.q;
import ys.r;
import ys.s;
import ys.t;
import ys.x;
import ys.y;
import ys.z;

/* JADX INFO: loaded from: classes17.dex */
public final class a extends h implements t {
    public final BiometricVerificationMyNumberDateOfBirthEditScreenContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final z f50532p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final y f50533q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final cli.y f50534r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final com.revolut.kompot.navigable.vc.modal.a f50535s;

    public a(BiometricVerificationMyNumberDateOfBirthEditScreenContract$InputData inputData, z dateConverter, y calendarPickerMapper, n stateMapper) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(dateConverter, "dateConverter");
        Intrinsics.checkNotNullParameter(calendarPickerMapper, "calendarPickerMapper");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = inputData;
        this.f50532p = dateConverter;
        this.f50533q = calendarPickerMapper;
        BiometricVerificationDocumentStepFlowContract$MyNumberCardDetails details = inputData.f50529a;
        Intrinsics.checkNotNullParameter(details, "details");
        b bVar = details.d;
        LocalDate localDate = details.f50545a;
        c0 c0Var = null;
        Object obj2 = null;
        if (bVar == b.JAPANESE) {
            Iterator it8 = z.f316371b.iterator();
            while (true) {
                if (!it8.hasNext()) {
                    break;
                }
                Object next = it8.next();
                c0 c0Var2 = (c0) next;
                LocalDate localDate2 = c0Var2.f316343b;
                LocalDate localDate3 = c0Var2.f316344c;
                if (localDate.compareTo((Object) localDate2) >= 0 && localDate.compareTo((Object) localDate3) <= 0) {
                    obj2 = next;
                    break;
                }
            }
            c0Var = (c0) obj2;
        }
        b0 b0Var = c0Var == null ? new b0(x.GREGORIAN, d0.b0(String.valueOf(localDate.getYear()), 4, '0'), d0.b0(String.valueOf(localDate.getMonthValue()), 2, '0'), d0.b0(String.valueOf(localDate.getDayOfMonth()), 2, '0')) : new b0(c0Var.f316342a, String.valueOf((localDate.getYear() - c0Var.f316343b.getYear()) + 1), d0.b0(String.valueOf(localDate.getMonthValue()), 2, '0'), d0.b0(String.valueOf(localDate.getDayOfMonth()), 2, '0'));
        this.f50534r = d.b(this, new j(b0Var.f316338a, b0Var.f316339b, b0Var.f316340c, b0Var.d), stateMapper, null, false, 12);
        this.f50535s = e.a(this, new yi3.d(this, 16));
    }

    public final void I2(final r event) {
        Intrinsics.checkNotNullParameter(event, "event");
        if (Intrinsics.f(event, k.f316354a)) {
            B2();
            return;
        }
        if (Intrinsics.f(event, l.f316355a)) {
            h.v2(this.f50535s, BiometricVerificationMyNumberDateOfBirthEditScreenContract$ModalStep.CalendarPicker.f50531a, ModalDestination.Style.BOTTOM_DIALOG.f98301a);
            return;
        }
        boolean z = event instanceof m;
        cli.y yVar = this.f50534r;
        if (z) {
            x xVar = ((m) event).f316356a;
            if (xVar == ((j) ((j2) yVar.f22677a).getValue()).f316351a) {
                return;
            }
            H2(yVar, new p(xVar, 15));
            return;
        }
        if (event instanceof q) {
            final int i = 0;
            H2(yVar, new Function1() { // from class: ys.v
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    j update = (j) obj2;
                    switch (i) {
                        case 0:
                            Intrinsics.checkNotNullParameter(update, "$this$update");
                            return j.a(update, ((q) event).f316360a, null, null, 13);
                        case 1:
                            Intrinsics.checkNotNullParameter(update, "$this$update");
                            return j.a(update, null, ((p) event).f316359a, null, 11);
                        default:
                            Intrinsics.checkNotNullParameter(update, "$this$update");
                            return j.a(update, null, null, ((o) event).f316358a, 7);
                    }
                }
            });
            return;
        }
        if (event instanceof ys.p) {
            final int i2 = 1;
            H2(yVar, new Function1() { // from class: ys.v
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    j update = (j) obj2;
                    switch (i2) {
                        case 0:
                            Intrinsics.checkNotNullParameter(update, "$this$update");
                            return j.a(update, ((q) event).f316360a, null, null, 13);
                        case 1:
                            Intrinsics.checkNotNullParameter(update, "$this$update");
                            return j.a(update, null, ((p) event).f316359a, null, 11);
                        default:
                            Intrinsics.checkNotNullParameter(update, "$this$update");
                            return j.a(update, null, null, ((o) event).f316358a, 7);
                    }
                }
            });
            return;
        }
        if (event instanceof o) {
            final int i3 = 2;
            H2(yVar, new Function1() { // from class: ys.v
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    j update = (j) obj2;
                    switch (i3) {
                        case 0:
                            Intrinsics.checkNotNullParameter(update, "$this$update");
                            return j.a(update, ((q) event).f316360a, null, null, 13);
                        case 1:
                            Intrinsics.checkNotNullParameter(update, "$this$update");
                            return j.a(update, null, ((p) event).f316359a, null, 11);
                        default:
                            Intrinsics.checkNotNullParameter(update, "$this$update");
                            return j.a(update, null, null, ((o) event).f316358a, 7);
                    }
                }
            });
            return;
        }
        if (!Intrinsics.f(event, ys.n.f316357a)) {
            throw new NoWhenBranchMatchedException();
        }
        j jVar = (j) ((j2) yVar.f22677a).getValue();
        x xVar2 = jVar.f316351a;
        String str = jVar.f316352b;
        String str2 = jVar.f316353c;
        String str3 = jVar.d;
        this.f50532p.getClass();
        a0 a0VarA = z.a(xVar2, str, str2, str3);
        if (a0VarA == null) {
            return;
        }
        C2(new s(BiometricVerificationDocumentStepFlowContract$MyNumberCardDetails.a(this.o.f50529a, a0VarA.f316336a, null, null, a0VarA.f316337b, 6)));
    }

    @Override // zki.h
    public final com.revolut.kompot.navigable.vc.modal.a K() {
        return this.f50535s;
    }

    @Override // cli.z
    public final g getState() {
        return this.f50534r;
    }
}
