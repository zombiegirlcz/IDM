package com.revolut.feature.freelancer.impl.ui.tax_hub.assessment.assessment;

import cli.g;
import cli.y;
import com.revolut.data.model.Data;
import com.revolut.feature.freelancer.common.models.tax_hub.TaxHubAssessmentStep;
import com.revolut.feature.freelancer.common.models.tax_hub.TaxHubCalendarEvent;
import com.revolut.feature.freelancer.impl.ui.tax_hub.assessment.assessment.TaxHubAssessmentScreenContract$ModalStep;
import com.revolut.kompot.common.ModalDestination;
import ds6.m;
import ds6.o;
import ewh.x;
import java.util.Iterator;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import oki.h;
import vkm.j2;
import vkm.q;
import ymk.u;
import z27.a0;
import z27.l;
import z27.v;

/* JADX INFO: loaded from: classes3.dex */
public final class f extends h implements l {
    public final b37.c o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final TaxHubAssessmentScreenContract$InputData f74243p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final ex6.b f74244q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final r10.a f74245r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final r10.d f74246s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final ang.f f74247t;
    public final vii.b u;
    public final y v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final com.revolut.kompot.navigable.vc.modal.a f74248w;

    public f(b37.c dialogFactory, TaxHubAssessmentScreenContract$InputData inputData, ex6.b serverErrorHandlerExtension, r10.a taxAssessmentInteractor, r10.d taxCalendarEventsInteractor, ang.f userInteractor, a0 stateMapper) {
        Intrinsics.checkNotNullParameter(dialogFactory, "dialogFactory");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(serverErrorHandlerExtension, "serverErrorHandlerExtension");
        Intrinsics.checkNotNullParameter(taxAssessmentInteractor, "taxAssessmentInteractor");
        Intrinsics.checkNotNullParameter(taxCalendarEventsInteractor, "taxCalendarEventsInteractor");
        Intrinsics.checkNotNullParameter(userInteractor, "userInteractor");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = dialogFactory;
        this.f74243p = inputData;
        this.f74244q = serverErrorHandlerExtension;
        this.f74245r = taxAssessmentInteractor;
        this.f74246s = taxCalendarEventsInteractor;
        this.f74247t = userInteractor;
        this.u = new vii.b();
        this.v = mra.d.b(this, new z27.f(new Data(null, null, true, 3, null), inputData.f74236b, false), stateMapper, null, false, 12);
        this.f74248w = hx7.e.a(this, new yz4.b(this, 7));
    }

    public static final TaxHubAssessmentScreenContract$ModalStep.CompleteTaxReturn I2(f fVar, m mVar) {
        Object next;
        TaxHubCalendarEvent taxHubCalendarEvent = mVar.f117246a;
        String str = taxHubCalendarEvent.f73483a;
        Iterator it8 = taxHubCalendarEvent.f73488j.iterator();
        while (true) {
            if (!it8.hasNext()) {
                next = null;
                break;
            }
            next = it8.next();
            if (((TaxHubAssessmentStep) next).f73481b == o.GO_TO_TAX_AUTHORITY) {
                break;
            }
        }
        TaxHubAssessmentStep taxHubAssessmentStep = (TaxHubAssessmentStep) next;
        String str2 = taxHubAssessmentStep != null ? taxHubAssessmentStep.f73480a : null;
        if (str2 == null) {
            str2 = "";
        }
        return new TaxHubAssessmentScreenContract$ModalStep.CompleteTaxReturn(str, str2);
    }

    @Override // yji.l
    public final void I1() {
        Continuation continuation = null;
        yji.l.a1(this, q.Q(this.u, new y4f.o(continuation, this, 27)), null, null, new yy6.f(this, continuation, 6), 3);
        yji.l.b1(this, new u(q.P(mo3.a.g(this.v.B(v.f), null, new z0f.a0(7), 1), 1), this, 5), null, new d(this, null), 3);
    }

    public final void J2(String listId) {
        Intrinsics.checkNotNullParameter(listId, "listId");
        if (Intrinsics.f(listId, "LIST_ID_MENU_MARK_AS_PAID")) {
            h.v2(this.f74248w, new TaxHubAssessmentScreenContract$ModalStep.MarkEventAsCompleted(this.f74243p.f74235a), ModalDestination.Style.BOTTOM_DIALOG.f98301a);
        }
    }

    @Override // zki.h
    public final com.revolut.kompot.navigable.vc.modal.a K() {
        return this.f74248w;
    }

    @Override // yji.l
    public final void P1() {
        H2(this.v, new z2.a(this, 1));
    }

    @Override // yji.l
    public final void T1(long j2) {
        y yVar = this.v;
        if (((z27.f) ((j2) yVar.f22677a).getValue()).f318980c) {
            yji.l.b1(this, new u(q.P(mo3.a.g(yVar.B(v.f), null, new z0f.a0(7), 1), 1), this, 5), null, new e(this, null), 3);
        }
    }

    @Override // cli.z
    public final g getState() {
        return this.v;
    }

    @Override // yji.l
    public final boolean o1(Throwable throwable) {
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        ex6.a aVar = ex6.b.Companion;
        ((ex6.d) this.f74244q).Z2(throwable, new x(6));
        return true;
    }
}
