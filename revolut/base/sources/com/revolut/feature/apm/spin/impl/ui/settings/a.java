package com.revolut.feature.apm.spin.impl.ui.settings;

import cli.g;
import cli.n;
import cli.y;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.data.model.Data;
import com.revolut.feature.apm.core.models.alias.Alias;
import com.revolut.feature.apm.core.models.alias.AliasStatus;
import com.revolut.feature.apm.spin.impl.ui.settings.SpinSettingsScreenContract$ModalStep;
import com.revolut.kompot.common.ModalDestination;
import hx7.e;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import mra.d;
import oki.h;
import org.jetbrains.annotations.NotNull;
import v02.b;
import v02.c;
import vkm.q;
import vkm.z1;
import xd2.f;
import xd2.k;
import xd2.l;
import xd2.o;
import xd2.p;
import xd2.s;

/* JADX INFO: loaded from: classes20.dex */
public final class a extends h implements l {

    @NotNull
    public static final p Companion = new p();
    public final f o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final c f62882p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final b f62883q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final y f62884r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final com.revolut.kompot.navigable.vc.modal.a f62885s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final z1 f62886t;

    public a(f aliasExtension, c aliasDialogProvider, b aliasDeregisterExtension, n stateMapper) {
        Intrinsics.checkNotNullParameter(aliasExtension, "aliasExtension");
        Intrinsics.checkNotNullParameter(aliasDialogProvider, "aliasDialogProvider");
        Intrinsics.checkNotNullParameter(aliasDeregisterExtension, "aliasDeregisterExtension");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = aliasExtension;
        this.f62882p = aliasDialogProvider;
        this.f62883q = aliasDeregisterExtension;
        this.f62884r = d.b(this, new k(new Data(null, null, true, 3, null)), stateMapper, null, false, 12);
        this.f62885s = e.a(this, new x2g.b(this, 18));
        z1 z1VarB = q.b(0, 2, ukm.f.DROP_OLDEST);
        z1VarB.k(Unit.f186387a);
        this.f62886t = z1VarB;
    }

    @Override // yji.l
    public final void I1() {
        Continuation continuation = null;
        yji.l.a1(this, q.Q(this.f62886t, new x18.e(continuation, this, 7)), null, null, new x64.b(this, continuation, 14), 3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void I2(RowDelegate.Model model) {
        Intrinsics.checkNotNullParameter(model, "model");
        Object obj2 = model.u;
        Object[] objArr = 0;
        Alias alias = obj2 instanceof Alias ? (Alias) obj2 : null;
        AliasStatus aliasStatus = alias != null ? alias.f61880c : null;
        if (Intrinsics.f(aliasStatus, AliasStatus.ACTIVE.f61885b)) {
            ((j12.b) this.f62883q).Z2(alias, new o(this, alias, 0));
            return;
        }
        if (!Intrinsics.f(aliasStatus, AliasStatus.AVAILABLE.f61886b)) {
            throw new IllegalStateException("Unexpected status: " + (alias != null ? alias.f61880c : null));
        }
        String str = alias.d.d;
        if (str != null) {
            h.v2(this.f62885s, new SpinSettingsScreenContract$ModalStep.HandleClaim(str), ModalDestination.Style.FULLSCREEN_FADE.f98307a);
        } else {
            l2(new s(this, alias, objArr == true ? 1 : 0, 1), new yi5.b(26));
        }
    }

    @Override // zki.h
    public final com.revolut.kompot.navigable.vc.modal.a K() {
        return this.f62885s;
    }

    @Override // cli.z
    public final g getState() {
        return this.f62884r;
    }
}
