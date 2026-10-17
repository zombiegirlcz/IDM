package com.revolut.retail.feature.stockdetails.impl.ui.screens.key_stats.edit_key_stats;

import cli.y;
import hx7.e;
import kotlin.jvm.internal.Intrinsics;
import mra.d;
import nd.p;
import ogm.i;
import oki.h;
import ybl.l;
import yvk.f;
import yvk.g;
import yvk.o;

/* JADX INFO: loaded from: classes12.dex */
public final class a extends h implements g {
    public final EditKeyStatsScreenContract$Input o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final i f104029p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final l f104030q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final p f104031r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final y f104032s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final com.revolut.kompot.navigable.vc.modal.a f104033t;

    public a(yvk.l mapper, EditKeyStatsScreenContract$Input input, i displayAssetStatsInteractor, l tradingConfigInteractor, p assetStatsIdListReducer) {
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        Intrinsics.checkNotNullParameter(input, "input");
        Intrinsics.checkNotNullParameter(displayAssetStatsInteractor, "displayAssetStatsInteractor");
        Intrinsics.checkNotNullParameter(tradingConfigInteractor, "tradingConfigInteractor");
        Intrinsics.checkNotNullParameter(assetStatsIdListReducer, "assetStatsIdListReducer");
        this.o = input;
        this.f104029p = displayAssetStatsInteractor;
        this.f104030q = tradingConfigInteractor;
        this.f104031r = assetStatsIdListReducer;
        this.f104032s = d.b(this, new f(0), mapper, null, false, 12);
        this.f104033t = e.a(this, new yi3.d(this, 25));
    }

    @Override // yji.l
    public final void I1() {
        yji.l.a1(this, this.f104029p.i(this.o.f104027a), null, null, new o(this, null, 0), 3);
        yji.l.b1(this, l.d(this.f104030q), null, new o(this, null, 1), 3);
    }

    @Override // zki.h
    public final com.revolut.kompot.navigable.vc.modal.a K() {
        return this.f104033t;
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f104032s;
    }
}
