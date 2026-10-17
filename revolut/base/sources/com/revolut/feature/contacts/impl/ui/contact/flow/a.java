package com.revolut.feature.contacts.impl.ui.contact.flow;

import c9f.c;
import cm3.b;
import com.revolut.feature.contacts.impl.ui.contact.flow.ContactFlowContract$Step;
import cp5.d;
import kotlin.jvm.internal.Intrinsics;
import oki.h;
import zhm.f0;

/* JADX INFO: loaded from: classes21.dex */
public final class a extends h implements b {
    public final yki.a o;

    public a(ContactFlowContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.o = d.a(this, new ContactFlowContract$Step.Details(inputData.f65999a.f65982a), f0.f322471a, new c(this, 26));
    }

    @Override // yki.g
    public final yki.b s() {
        return this.o;
    }
}
