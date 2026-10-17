package com.revolut.feature.defi.trade.impl.ui.trade;

import a76.b;
import cli.g;
import cli.y;
import com.google.crypto.tink.shaded.protobuf.t1;
import com.revolut.feature.cryptocommodity_invest.models.SortingType;
import ihm.f;
import java.util.List;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import mra.d;
import o16.e;
import oki.h;
import org.jetbrains.annotations.NotNull;
import skm.a2;
import vkm.q;
import vkm.t0;
import yji.l;
import z66.c;
import z66.m;
import z66.n;
import z66.o;
import z66.p;
import z66.t;
import zhm.v;

/* JADX INFO: loaded from: classes3.dex */
public final class a extends h implements c {

    @NotNull
    public static final m Companion = new m();

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final List f71885y = v.k(new SortingType.MarketCap(0), new SortingType.CurrentPrice(0), new SortingType.PriceChange(0));
    public final b o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final t46.a f71886p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final xv5.c f71887q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final e f71888r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final DefiTradeContract$InputData f71889s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final f f71890t;
    public a2 u;
    public final vii.b v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final com.revolut.kompot.navigable.vc.modal.a f71891w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final y f71892x;

    public a(t stateMapper, b assetsPagingInteractor, t46.a ratesRepository, xv5.c baseCurrencyInteractor, e disclaimerWidget, DefiTradeContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(assetsPagingInteractor, "assetsPagingInteractor");
        Intrinsics.checkNotNullParameter(ratesRepository, "ratesRepository");
        Intrinsics.checkNotNullParameter(baseCurrencyInteractor, "baseCurrencyInteractor");
        Intrinsics.checkNotNullParameter(disclaimerWidget, "disclaimerWidget");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.o = assetsPagingInteractor;
        this.f71886p = ratesRepository;
        this.f71887q = baseCurrencyInteractor;
        this.f71888r = disclaimerWidget;
        this.f71889s = inputData;
        this.f71890t = v0.a.d("create(...)");
        this.v = new vii.b();
        this.f71891w = hx7.e.a(this, new yz4.b(this, 13));
        this.f71892x = d.b(this, new z66.b(0), stateMapper, null, false, 12);
    }

    @Override // yji.l
    public final void I1() {
        Continuation continuation = null;
        l2(new n(0, this, continuation), new yi5.b(26));
        l2(new n(1, this, continuation), new yi5.b(26));
        l.a1(this, rd0.e.b(((a76.e) this.o).f1775c), null, null, new o(0, this, continuation), 3);
        l.a1(this, t1.g(q.Q(this.v, new p(0, this, continuation)), 300L), null, null, new o(1, this, continuation), 3);
    }

    @Override // zki.h
    public final com.revolut.kompot.navigable.vc.modal.a K() {
        return this.f71891w;
    }

    @Override // yji.l
    public final void T1(long j2) {
        Continuation continuation = null;
        l.b1(this, q.Q(t1.g(new t0(this.f71892x.B(new z66.l(this, 0)), 1), 300L), new p(1, this, continuation)), null, new o(2, this, continuation), 3);
    }

    @Override // cli.z
    public final g getState() {
        return this.f71892x;
    }
}
