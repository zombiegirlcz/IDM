package com.revolut.feature.apm.core.ui.impl.ui.alias_claim.form;

import com.revolut.feature.apm.core.ui.impl.ui.alias_claim.form.ApmAliasClaimFormFlowContract$Step;
import cp5.d;
import oki.h;
import wtj.c;
import x12.b;
import zhm.f0;

/* JADX INFO: loaded from: classes20.dex */
public final class a extends h implements b {
    public final yki.a o;

    public a() {
        f0 f0Var = f0.f322471a;
        this.o = d.a(this, new ApmAliasClaimFormFlowContract$Step.Upload(f0Var), f0Var, new c(this, 26));
    }

    @Override // yki.g
    public final yki.b s() {
        return this.o;
    }
}
