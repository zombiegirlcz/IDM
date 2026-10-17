package com.revolut.feature.freelancer.impl.ui.invoice.templates.override;

import cli.g;
import cli.y;
import com.revolut.feature.shared.invoices.api.domain.model.InvoiceTemplate;
import com.revolut.feature.shared.invoices.api.domain.model.InvoiceTemplateOverride;
import fz6.j;
import fz6.u;
import hx7.e;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import mra.d;
import oki.h;
import u9d.b;
import u9d.c;

/* JADX INFO: loaded from: classes3.dex */
public final class a extends h implements j {
    public final y o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final com.revolut.kompot.navigable.vc.modal.a f73973p;

    public a(InvoiceTemplateOverrideScreenContract$InputData inputData, u stateMapper) {
        String str;
        String str2;
        List list;
        String str3;
        b bVar;
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        InvoiceTemplate invoiceTemplate = inputData.f73969a;
        InvoiceTemplateOverride invoiceTemplateOverride = inputData.f73970b;
        b bVar2 = (invoiceTemplateOverride == null || (bVar = invoiceTemplateOverride.f86410a) == null) ? invoiceTemplate.i : bVar;
        String str4 = (invoiceTemplateOverride == null || (str3 = invoiceTemplateOverride.f86411b) == null) ? invoiceTemplate.d : str3;
        List list2 = (invoiceTemplateOverride == null || (list = invoiceTemplateOverride.f86412c) == null) ? invoiceTemplate.f86401h : list;
        String str5 = null;
        InvoiceTemplateOverride.Value value = invoiceTemplateOverride != null ? invoiceTemplateOverride.d : null;
        if (value == null) {
            str = invoiceTemplate.f86402j;
        } else {
            str = value.f86414b;
            if (value.f86413a != c.SET) {
                str = null;
            }
        }
        InvoiceTemplateOverride.Value value2 = invoiceTemplateOverride != null ? invoiceTemplateOverride.e : null;
        if (value2 != null) {
            str2 = value2.f86413a == c.SET ? value2.f86414b : str2;
            this.o = d.b(this, new fz6.h(invoiceTemplate, bVar2, str4, list2, str, str2, false), stateMapper, null, false, 12);
            this.f73973p = e.a(this, new fv1.a(this, 10));
        }
        str5 = invoiceTemplate.k;
        str2 = str5;
        this.o = d.b(this, new fz6.h(invoiceTemplate, bVar2, str4, list2, str, str2, false), stateMapper, null, false, 12);
        this.f73973p = e.a(this, new fv1.a(this, 10));
    }

    @Override // zki.h
    public final com.revolut.kompot.navigable.vc.modal.a K() {
        return this.f73973p;
    }

    @Override // cli.z
    public final g getState() {
        return this.o;
    }
}
