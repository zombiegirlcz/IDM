package com.revolut.feature.sca_prompt.impl.trusted_entities;

import cli.y;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.data.model.Data;
import com.revolut.retail.common.ui.R$string;
import hx7.e;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import nii.t0;
import nii.y0;
import nii.z;
import nsc.f;
import nsc.g;
import nsc.j;
import nsc.o;
import oki.h;
import org.jetbrains.annotations.NotNull;
import psc.b;
import skm.a2;
import vrc.k;
import yji.l;
import zrc.d;

/* JADX INFO: loaded from: classes6.dex */
public final class a extends h implements g {

    @NotNull
    public static final j Companion = new j();
    public final d o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final t0 f85350p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final b f85351q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public a2 f85352r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final y f85353s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final com.revolut.kompot.navigable.vc.modal.a f85354t;

    public a(o stateMapper, d cryptoScaInteractor, t0 statusViewDialogDisplayer, dsc.a dependenciesProvider, b trustedEntitiesDialogProvider) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(cryptoScaInteractor, "cryptoScaInteractor");
        Intrinsics.checkNotNullParameter(statusViewDialogDisplayer, "statusViewDialogDisplayer");
        Intrinsics.checkNotNullParameter(dependenciesProvider, "dependenciesProvider");
        Intrinsics.checkNotNullParameter(trustedEntitiesDialogProvider, "trustedEntitiesDialogProvider");
        this.o = cryptoScaInteractor;
        this.f85350p = statusViewDialogDisplayer;
        this.f85351q = trustedEntitiesDialogProvider;
        this.f85353s = mra.d.b(this, new f(new Data(null, null, true, 3, null), k.OPTIONAL_TO_SKIP_2FA), stateMapper, null, false, 12);
        this.f85354t = e.a(this, new nk4.o(this, 16));
    }

    public final void I2() {
        a2 a2Var = this.f85352r;
        Continuation continuation = null;
        if (a2Var != null) {
            a2Var.f(null);
        }
        this.f85352r = l.b1(this, this.o.d(), null, new nn7.d(this, continuation, 16), 3);
    }

    public final void J2() {
        X1(new y0(null, new z(new TextLocalisedClause(R$string.common_state_error_title_generic, null, null, 14), null, null, null, null, null, false, null, null, null, null, null, null, 32766), false, 5));
    }

    @Override // zki.h
    public final com.revolut.kompot.navigable.vc.modal.a K() {
        return this.f85354t;
    }

    @Override // yji.l
    public final void T1(long j2) {
        I2();
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f85353s;
    }
}
