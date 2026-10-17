package com.revolut.feature.freelancer.impl.ui.invoice.templates.details;

import cli.g;
import cli.y;
import com.revolut.data.model.Data;
import com.revolut.feature.freelancer.impl.ui.invoice.templates.details.InvoiceTemplateDetailsScreenContract$InputData;
import com.revolut.feature.freelancer.impl.ui.invoice.templates.details.a;
import com.revolut.feature.shared.invoices.api.domain.model.InvoiceTemplate;
import et6.h1;
import hx7.e;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import mra.d;
import oki.h;
import vkm.q;
import y4f.o;
import yy6.f;
import yy6.l;
import yy6.n;
import yy6.s;
import zjh.i;

/* JADX INFO: loaded from: classes3.dex */
public final class c extends h implements n {
    public final h1 o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final InvoiceTemplateDetailsScreenContract$InputData f73956p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final i f73957q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final vii.b f73958r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final y f73959s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final com.revolut.kompot.navigable.vc.modal.a f73960t;

    public c(h1 freelancerInteractor, InvoiceTemplateDetailsScreenContract$InputData inputData, i invoiceTemplateInteractor, s stateMapper) {
        a aVar;
        Intrinsics.checkNotNullParameter(freelancerInteractor, "freelancerInteractor");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(invoiceTemplateInteractor, "invoiceTemplateInteractor");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = freelancerInteractor;
        this.f73956p = inputData;
        this.f73957q = invoiceTemplateInteractor;
        this.f73958r = new vii.b();
        if (Intrinsics.f(inputData, InvoiceTemplateDetailsScreenContract$InputData.CreateTemplate.f73944a)) {
            a.Companion.getClass();
            aVar = new a(0);
        } else {
            if (!(inputData instanceof InvoiceTemplateDetailsScreenContract$InputData.EditTemplate)) {
                throw new NoWhenBranchMatchedException();
            }
            a.C0491a c0491a = a.Companion;
            InvoiceTemplate template = ((InvoiceTemplateDetailsScreenContract$InputData.EditTemplate) inputData).f73945a;
            c0491a.getClass();
            Intrinsics.checkNotNullParameter(template, "template");
            aVar = new a(template.f86397a, template.f86398b, template.f86399c, template.d, template.e, template.f, template.f86400g, template.f86401h, template.i, template.f86402j, template.k);
        }
        this.f73959s = d.b(this, new l(false, new Data(null, null, true, 3, null), aVar, aVar), stateMapper, null, false, 12);
        this.f73960t = e.a(this, new yi3.d(this, 29));
    }

    @Override // yji.l
    public final void I1() {
        Continuation continuation = null;
        yji.l.a1(this, q.Q(this.f73958r, new o(continuation, this, 23)), null, null, new f(this, continuation, 1), 3);
    }

    @Override // zki.h
    public final com.revolut.kompot.navigable.vc.modal.a K() {
        return this.f73960t;
    }

    @Override // cli.z
    public final g getState() {
        return this.f73959s;
    }
}
