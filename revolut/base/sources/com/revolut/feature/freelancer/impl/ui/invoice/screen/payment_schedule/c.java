package com.revolut.feature.freelancer.impl.ui.invoice.screen.payment_schedule;

import cli.g;
import cli.y;
import com.revolut.data.model.Data;
import et6.p1;
import fna.f;
import fy6.i;
import fy6.o;
import java.time.LocalDate;
import java.time.ZoneId;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import l80.e;
import oki.h;
import org.joda.time.DateTime;
import vkm.q;
import yji.l;

/* JADX INFO: loaded from: classes3.dex */
public final class c extends h implements o {
    public final e o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final hy6.a f73914p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final InvoicePaymentScheduleScreenContract$InputData f73915q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final p1 f73916r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final qy6.d f73917s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final vii.b f73918t;
    public final com.revolut.kompot.navigable.vc.modal.a u;
    public final y v;

    public c(e dateProvider, hy6.a dialogFactory, InvoicePaymentScheduleScreenContract$InputData inputData, p1 invoiceInteractor, qy6.d recurringSettingsDialogFactory, d stateMapper) {
        Intrinsics.checkNotNullParameter(dateProvider, "dateProvider");
        Intrinsics.checkNotNullParameter(dialogFactory, "dialogFactory");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(invoiceInteractor, "invoiceInteractor");
        Intrinsics.checkNotNullParameter(recurringSettingsDialogFactory, "recurringSettingsDialogFactory");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = dateProvider;
        this.f73914p = dialogFactory;
        this.f73915q = inputData;
        this.f73916r = invoiceInteractor;
        this.f73917s = recurringSettingsDialogFactory;
        this.f73918t = new vii.b();
        this.u = hx7.e.a(this, new fv1.a(this, 7));
        this.v = mra.d.b(this, new i(new Data(null, null, true, 3, null), inputData.f73901b, null, inputData.f73902c), stateMapper, null, false, 12);
    }

    public static DateTime I2(LocalDate localDate) {
        ZoneId zoneIdOf = ZoneId.of("UTC");
        Intrinsics.checkNotNullExpressionValue(zoneIdOf, "of(...)");
        return new DateTime(ebm.a.O(localDate, zoneIdOf));
    }

    @Override // yji.l
    public final void I1() {
        Continuation continuation = null;
        l.a1(this, q.Q(this.f73918t, new f5h.b(continuation, this, 18)), null, null, new f(this, continuation, 26), 3);
    }

    @Override // zki.h
    public final com.revolut.kompot.navigable.vc.modal.a K() {
        return this.u;
    }

    @Override // cli.z
    public final g getState() {
        return this.v;
    }
}
