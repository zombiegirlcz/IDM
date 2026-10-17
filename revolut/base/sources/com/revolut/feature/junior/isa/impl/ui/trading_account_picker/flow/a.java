package com.revolut.feature.junior.isa.impl.ui.trading_account_picker.flow;

import com.revolut.feature.junior.isa.impl.ui.trading_account_picker.flow.JuniorTradingAccountPickerFlowContract$Step;
import com.revolut.kompot.common.ModalDestination;
import d8l.d;
import oki.h;
import xa8.b;
import yki.i;

/* JADX INFO: loaded from: classes4.dex */
public final class a extends h implements b {
    public final i o = d.a(this, new x2g.b(this, 12));

    @Override // yki.j
    public final void M0() {
        h.w2(this.o, JuniorTradingAccountPickerFlowContract$Step.JuniorAccountPicker.f76810a, ModalDestination.Style.BOTTOM_DIALOG.f98301a);
    }

    @Override // yki.g
    public final yki.b s() {
        return this.o;
    }
}
