package com.revolut.feature.apm.iris.impl.ui.settings;

import c62.d;
import c62.e;
import cli.y;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.data.model.Data;
import com.revolut.feature.apm.core.api.product.ApmIris;
import com.revolut.feature.apm.core.models.alias.Alias;
import com.revolut.feature.apm.core.models.alias.AliasStatus;
import com.revolut.feature.apm.iris.api.R$string;
import com.revolut.feature.apm.iris.impl.ui.settings.IrisSettingsScreenContract$ModalStep;
import com.revolut.kompot.common.ModalDestination;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import okf.m;
import oki.h;
import org.jetbrains.annotations.NotNull;
import p62.g;
import p62.j;
import p62.k;
import p62.n;
import p62.s;
import ukm.f;
import v02.b;
import v02.c;
import vkm.q;
import vkm.z1;
import yji.l;

/* JADX INFO: loaded from: classes20.dex */
public final class a extends h implements p62.h {

    @NotNull
    public static final k Companion = new k();
    public final IrisSettingsScreenContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final e f62533p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final d f62534q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final b f62535r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final c f62536s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final y f62537t;
    public final com.revolut.kompot.navigable.vc.modal.a u;
    public final z1 v;

    public a(IrisSettingsScreenContract$InputData inputData, e irisInteractor, d irisAliasInteractor, b aliasDeregisterExtension, c aliasDialogProvider, s stateMapper) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(irisInteractor, "irisInteractor");
        Intrinsics.checkNotNullParameter(irisAliasInteractor, "irisAliasInteractor");
        Intrinsics.checkNotNullParameter(aliasDeregisterExtension, "aliasDeregisterExtension");
        Intrinsics.checkNotNullParameter(aliasDialogProvider, "aliasDialogProvider");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = inputData;
        this.f62533p = irisInteractor;
        this.f62534q = irisAliasInteractor;
        this.f62535r = aliasDeregisterExtension;
        this.f62536s = aliasDialogProvider;
        this.f62537t = mra.d.b(this, new g(new Data(null, null, true, 3, null)), stateMapper, null, false, 12);
        this.u = hx7.e.a(this, new p5f.c(this, 1));
        z1 z1VarB = q.b(0, 2, f.DROP_OLDEST);
        z1VarB.k(Unit.f186387a);
        this.v = z1VarB;
    }

    @Override // yji.l
    public final void I1() {
        l.a1(this, q.Q(this.v, new m((Continuation) null, this, 17)), null, null, new n(this, null, 1), 3);
    }

    public final void I2(Alias alias) {
        zz1.b bVar = alias.d.e;
        int i = bVar == null ? -1 : p62.l.f233208a[bVar.ordinal()];
        if (i != -1) {
            if (i == 1) {
                ((j12.b) this.f62535r).Z2(alias, new j(this, 0));
                return;
            } else if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
        }
        h.v2(this.u, new IrisSettingsScreenContract$ModalStep.DeregisterAlias(alias), ModalDestination.Style.BOTTOM_DIALOG.f98301a);
    }

    public final void J2(zz1.e eVar) {
        int i = eVar == null ? -1 : p62.l.f233209b[eVar.ordinal()];
        c cVar = this.f62536s;
        if (i != -1) {
            Continuation continuation = null;
            if (i == 1) {
                X1(new mii.k("DEREGISTER_SUCCEED_TOAST_ID", new TextLocalisedClause(R$string.iris_settings_deregister_success, null, null, 14), null, null, null, 28));
                C2(aii.q.f5292a);
                Unit unit = Unit.f186387a;
                return;
            } else if (i == 2 || i == 3) {
                l.a1(this, X1(((j12.d) cVar).d(ApmIris.f61811c.e())), null, null, new p0l.d(this, continuation, 8), 3);
                return;
            } else if (i != 4) {
                throw new NoWhenBranchMatchedException();
            }
        }
        X1(((j12.d) cVar).b());
    }

    @Override // zki.h
    public final com.revolut.kompot.navigable.vc.modal.a K() {
        return this.u;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void K2(RowDelegate.Model model) {
        Intrinsics.checkNotNullParameter(model, "model");
        Object obj2 = model.u;
        Object[] objArr = 0;
        Alias alias = obj2 instanceof Alias ? (Alias) obj2 : null;
        AliasStatus aliasStatus = alias != null ? alias.f61880c : null;
        if (Intrinsics.f(aliasStatus, AliasStatus.ACTIVE.f61885b)) {
            I2(alias);
        } else {
            if (Intrinsics.f(aliasStatus, AliasStatus.AVAILABLE.f61886b)) {
                l2(new omg.e(this, objArr == true ? 1 : 0, 22), new yi5.b(26));
                return;
            }
            throw new IllegalStateException("Unexpected status: " + (alias != null ? alias.f61880c : null));
        }
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f62537t;
    }
}
