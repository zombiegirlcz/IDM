package com.revolut.feature.staking.impl.unstake.v2;

import cli.n;
import cli.y;
import com.revolut.feature.staking.api.model.StakingPocket;
import com.revolut.feature.staking.api.model.StakingProduct;
import dj0.d;
import efm.r;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import oki.h;
import ppk.f;
import w80.b;
import xv4.o;
import xv5.c;
import xwd.j;
import xwd.k;
import xwd.l;
import yud.g;
import zwd.e;

/* JADX INFO: loaded from: classes7.dex */
public final class a extends h implements j {
    public final com.revolut.kompot.navigable.vc.modal.a A;
    public final StakingPocket o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final g f88162p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final f f88163q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final c f88164r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final b f88165s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final rud.a f88166t;
    public final zwd.b u;
    public final e v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final j60.a f88167w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final wwd.b f88168x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final ihm.b f88169y;
    public final y z;

    public a(n stateMapper, StakingPocket stakingPocket, g stakingInteractor, f ratesInteractor, c cryptoBaseCurrencyInteractor, b amountFormatter, rud.a statusDialogModelProvider, zwd.b amountErrorMapperProvider, e unstakeValidator, j60.a bottomDialogControllerExtension, wwd.b tiersRateBottomSheetProvider, i90.b uuidGenerator) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(stakingPocket, "stakingPocket");
        Intrinsics.checkNotNullParameter(stakingInteractor, "stakingInteractor");
        Intrinsics.checkNotNullParameter(ratesInteractor, "ratesInteractor");
        Intrinsics.checkNotNullParameter(cryptoBaseCurrencyInteractor, "cryptoBaseCurrencyInteractor");
        Intrinsics.checkNotNullParameter(amountFormatter, "amountFormatter");
        Intrinsics.checkNotNullParameter(statusDialogModelProvider, "statusDialogModelProvider");
        Intrinsics.checkNotNullParameter(amountErrorMapperProvider, "amountErrorMapperProvider");
        Intrinsics.checkNotNullParameter(unstakeValidator, "unstakeValidator");
        Intrinsics.checkNotNullParameter(bottomDialogControllerExtension, "bottomDialogControllerExtension");
        Intrinsics.checkNotNullParameter(tiersRateBottomSheetProvider, "tiersRateBottomSheetProvider");
        Intrinsics.checkNotNullParameter(uuidGenerator, "uuidGenerator");
        this.o = stakingPocket;
        this.f88162p = stakingInteractor;
        this.f88163q = ratesInteractor;
        this.f88164r = cryptoBaseCurrencyInteractor;
        this.f88165s = amountFormatter;
        this.f88166t = statusDialogModelProvider;
        this.u = amountErrorMapperProvider;
        this.v = unstakeValidator;
        this.f88167w = bottomDialogControllerExtension;
        this.f88168x = tiersRateBottomSheetProvider;
        ihm.b bVarE = ihm.b.e(new d(0L, stakingPocket.f88082b.d));
        Intrinsics.checkNotNullExpressionValue(bVarE, "createDefault(...)");
        this.f88169y = bVarE;
        StakingProduct stakingProduct = stakingPocket.f88082b;
        xi0.b bVar = stakingProduct.d;
        this.z = mra.d.b(this, new l(0L, bVar, bVar, new k(null, new d(0L, stakingProduct.d)), stakingPocket.f88083c, null, wp5.y.u(uuidGenerator, "toString(...)"), stakingProduct.f88087b.f88062c), stateMapper, null, false, 12);
        this.A = hx7.e.a(this, new xwd.a(this, 1));
    }

    @Override // zki.h
    public final com.revolut.kompot.navigable.vc.modal.a K() {
        return this.A;
    }

    @Override // yji.l
    public final void T1(long j2) {
        r rVarSwitchMap = c.b(this.f88164r).switchMap(new xt1.a(20, new xwd.n(this, 0))).switchMap(new xt1.a(21, new xwd.n(this, 1)));
        Intrinsics.checkNotNullExpressionValue(rVarSwitchMap, "switchMap(...)");
        yji.l.b1(this, rd0.e.b(rVarSwitchMap), null, new o(this, (Continuation) null, 4), 3);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.z;
    }
}
