package com.revolut.feature.apm.aani.impl.ui.settings;

import cli.y;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.data.model.Data;
import com.revolut.feature.apm.aani.impl.ui.settings.AaniSettingsContract$ModalStep;
import com.revolut.feature.apm.core.models.alias.Alias;
import com.revolut.kompot.common.ModalDestination;
import hx7.e;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import mra.d;
import oki.h;
import org.jetbrains.annotations.NotNull;
import t9f.n;
import ukm.f;
import vkm.j2;
import vkm.q;
import vkm.z1;
import z6e.g;
import zfd.s;
import zl1.b;
import zl1.c;
import zl1.i;
import zl1.l;
import zl1.r;
import zl1.t;

/* JADX INFO: loaded from: classes20.dex */
public final class a extends h implements i {

    @NotNull
    private static final r Companion = new r();
    public final l o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final y f61141p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final com.revolut.kompot.navigable.vc.modal.a f61142q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final z1 f61143r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public volatile boolean f61144s;

    public a(l settingsInteractor, t stateMapper) {
        Intrinsics.checkNotNullParameter(settingsInteractor, "settingsInteractor");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = settingsInteractor;
        this.f61141p = d.b(this, new zl1.a(new Data(null, null, true, 3, null)), stateMapper, null, false, 12);
        this.f61142q = e.a(this, new zba.a(this, 23));
        this.f61143r = q.b(0, 2, f.DROP_OLDEST);
    }

    @Override // yji.l
    public final void I1() {
        Continuation continuation = null;
        yji.l.a1(this, q.Q(this.f61143r, new g(continuation, this, 16)), null, null, new s(this, continuation, 11), 3);
    }

    public final void I2(zl1.g uiEvent) {
        Intrinsics.checkNotNullParameter(uiEvent, "uiEvent");
        boolean zEquals = uiEvent.equals(zl1.e.f323161a);
        y yVar = this.f61141p;
        if (zEquals) {
            H2(yVar, new zke.f(26));
            this.f61143r.k(Unit.f186387a);
            return;
        }
        if (uiEvent.equals(c.f323159a)) {
            B2();
            return;
        }
        if (uiEvent.equals(zl1.d.f323160a)) {
            b bVar = (b) ((zl1.a) ((j2) yVar.f22677a).getValue()).f323156a.getContent();
            if (bVar != null) {
                boolean z = bVar.f323158b;
                A1(new mt8.b(this, z, null, 22), new n(this, z, 23));
                return;
            }
            return;
        }
        if (!(uiEvent instanceof zl1.f)) {
            throw new NoWhenBranchMatchedException();
        }
        RowDelegate.Model model = ((zl1.f) uiEvent).f323162a;
        Object obj2 = model.u;
        boolean zF = Intrinsics.f(model.f53228a, "ITEM_UNLINK_ID");
        ModalDestination.Style.BOTTOM_DIALOG bottom_dialog = ModalDestination.Style.BOTTOM_DIALOG.f98301a;
        com.revolut.kompot.navigable.vc.modal.a aVar = this.f61142q;
        if (zF) {
            h.v2(aVar, AaniSettingsContract$ModalStep.UnlinkAccount.f61140a, bottom_dialog);
        } else if (obj2 instanceof Alias) {
            h.v2(aVar, new AaniSettingsContract$ModalStep.AliasDetails((Alias) obj2), bottom_dialog);
        }
    }

    @Override // zki.h
    public final com.revolut.kompot.navigable.vc.modal.a K() {
        return this.f61142q;
    }

    @Override // yji.l
    public final void T1(long j2) {
        this.f61143r.k(Unit.f186387a);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f61141p;
    }
}
