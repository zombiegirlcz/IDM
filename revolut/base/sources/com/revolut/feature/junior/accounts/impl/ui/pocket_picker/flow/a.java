package com.revolut.feature.junior.accounts.impl.ui.pocket_picker.flow;

import com.revolut.feature.junior.accounts.impl.ui.pocket_picker.flow.JuniorPocketChildPickerFlowContract$Step;
import com.revolut.kompot.common.ModalDestination;
import d8l.d;
import oki.h;
import y78.b;
import yki.i;

/* JADX INFO: loaded from: classes4.dex */
public final class a extends h implements b {
    public final i o = d.a(this, new xwd.a(this, 26));

    @Override // yki.j
    public final void M0() {
        h.w2(this.o, JuniorPocketChildPickerFlowContract$Step.Picker.f76702a, ModalDestination.Style.BOTTOM_DIALOG.f98301a);
    }

    @Override // yki.g
    public final yki.b s() {
        return this.o;
    }
}
