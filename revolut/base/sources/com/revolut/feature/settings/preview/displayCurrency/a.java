package com.revolut.feature.settings.preview.displayCurrency;

import aw0.n6;
import cli.g;
import cli.n;
import cli.y;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.data.model.Data;
import com.revolut.kompot.common.bottom_sheet.actions.ActionsBottomSheetController;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import mra.d;
import oki.h;
import xv4.o;
import y4d.e;
import y4d.f;
import y4d.i;
import y4d.l;

/* JADX INFO: loaded from: classes7.dex */
public final class a extends h implements f {
    public final l o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final y f86029p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final com.revolut.kompot.navigable.vc.modal.a f86030q;

    public a(n stateMapper, l displayCurrencyInteractor) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(displayCurrencyInteractor, "displayCurrencyInteractor");
        this.o = displayCurrencyInteractor;
        this.f86029p = d.b(this, new e(displayCurrencyInteractor.b(), new Data(null, null, true, 3, null)), stateMapper, null, false, 12);
        this.f86030q = new com.revolut.kompot.navigable.vc.modal.a(this, new xwd.a(this, 19));
    }

    public static ActionsBottomSheetController I2(i iVar) {
        return new ActionsBottomSheetController(new dii.a(new lw0.a(iVar.f310882a, iVar.f310883b, null, null, false, 28), new aw0.e(false, null, null, new n6(iVar.f310884c, LargeActionButton.ButtonStyle.f58725a, null, null, false, null, null, 1020), null, null, 55), iVar.d, null, null, 24));
    }

    @Override // yji.l
    public final void I1() {
        yji.l.a1(this, this.o.c(), null, null, new o(this, (Continuation) null, 21), 3);
    }

    @Override // zki.h
    public final com.revolut.kompot.navigable.vc.modal.a K() {
        return this.f86030q;
    }

    @Override // cli.z
    public final g getState() {
        return this.f86029p;
    }
}
