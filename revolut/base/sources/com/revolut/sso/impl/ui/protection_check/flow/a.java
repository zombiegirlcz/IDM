package com.revolut.sso.impl.ui.protection_check.flow;

import com.revolut.sso.impl.ui.protection_check.flow.ProtectionCheckFlowContract$Step;
import cp5.d;
import oki.h;
import vol.b;
import zhm.f0;

/* JADX INFO: loaded from: classes12.dex */
public final class a extends h implements b {
    public final yki.a o;

    public a() {
        vh9.b bVar = new vh9.b(this, 13);
        this.o = d.a(this, ProtectionCheckFlowContract$Step.ShowProtectionCheckScreen.f106686a, f0.f322471a, bVar);
    }

    @Override // yki.g
    public final yki.b s() {
        return this.o;
    }
}
