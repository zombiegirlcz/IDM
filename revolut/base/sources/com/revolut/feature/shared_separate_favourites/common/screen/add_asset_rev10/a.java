package com.revolut.feature.shared_separate_favourites.common.screen.add_asset_rev10;

import ce9.n;
import com.revolut.feature.shared_separate_favourites.common.screen.add_asset_rev10.AddAssetRev10ScreenContract$InputData;
import jki.g;
import jki.i;
import jki.p;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import m3d.d;
import org.jetbrains.annotations.NotNull;
import rd0.e;
import yji.l;
import yui.v;
import zc0.z;
import zfd.h;
import zfd.j;
import zfd.k;
import zfd.m;
import zfd.o;
import zfd.q;
import zfd.s;

/* JADX INFO: loaded from: classes7.dex */
public final class a extends g implements j {

    @NotNull
    public static final q Companion = new q();

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final d f86824p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final AddAssetRev10ScreenContract$InputData f86825q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final ce9.j f86826r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final h f86827s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(p stateMapper, d watchlistAssetsProvider, AddAssetRev10ScreenContract$InputData inputData) {
        super(stateMapper);
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(watchlistAssetsProvider, "watchlistAssetsProvider");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.f86824p = watchlistAssetsProvider;
        this.f86825q = inputData;
        this.f86826r = new ce9.j(new z8d.h(15), new zba.a(this, 9));
        this.f86827s = new h(0);
    }

    @Override // yji.l
    public final void I1() {
        AddAssetRev10ScreenContract$InputData addAssetRev10ScreenContract$InputData = this.f86825q;
        if (addAssetRev10ScreenContract$InputData instanceof AddAssetRev10ScreenContract$InputData.Content) {
            l.a1(this, e.b(this.f86826r.e), null, null, new s(this, (Continuation) null, 0), 3);
        } else {
            if (!(addAssetRev10ScreenContract$InputData instanceof AddAssetRev10ScreenContract$InputData.Loading)) {
                throw new NoWhenBranchMatchedException();
            }
            x2(new z(28));
        }
    }

    @Override // jki.g
    public final i r2() {
        return this.f86827s;
    }

    public final void y2(k event) {
        Intrinsics.checkNotNullParameter(event, "event");
        boolean z = event instanceof k.a;
        ce9.j jVar = this.f86826r;
        if (z) {
            io3.h.a(jVar, n.RETRY_LAST_PAGE);
            return;
        }
        if (event instanceof zfd.n) {
            String str = ((zfd.n) event).f321939a;
            if (str == null) {
                str = "";
            }
            x2(new v(str, 14));
            io3.h.a(jVar, n.REFRESH);
            return;
        }
        if (event instanceof o) {
            x2(new z2d.a(1, ((o) event).f321940a));
            return;
        }
        if (event instanceof m) {
            m mVar = (m) event;
            io3.h.p(jVar, mVar.f321937a, mVar.f321938b);
        } else {
            if (!(event instanceof zfd.l)) {
                throw new NoWhenBranchMatchedException();
            }
            x2(new x5f.m(((zfd.l) event).f321936a, 26));
        }
    }
}
