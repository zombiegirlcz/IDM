package com.revolut.feature.crypto.earn.assets.shared.impl.ui.root;

import com.revolut.feature.crypto.earn.assets.shared.impl.ui.root.EarnAssetsRootScreenContract$Step;
import com.revolut.kompot.navigable.TransitionAnimation;
import cp5.d;
import if5.c;
import kotlin.jvm.internal.Intrinsics;
import mp.p;
import oki.h;
import yji.l;
import zhm.f0;

/* JADX INFO: loaded from: classes3.dex */
public final class b extends h implements if5.a {
    public final p o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final yki.a f70808p;

    public b(p stakeableAssetsProvider) {
        Intrinsics.checkNotNullParameter(stakeableAssetsProvider, "stakeableAssetsProvider");
        this.o = stakeableAssetsProvider;
        c cVar = new c(this, 0);
        this.f70808p = d.a(this, EarnAssetsRootScreenContract$Step.Loading.f70806a, f0.f322471a, cVar);
    }

    public static final void I2(b bVar, EarnAssetsRootScreenContract$Step earnAssetsRootScreenContract$Step) {
        yki.a aVar = bVar.f70808p;
        if (Intrinsics.f(aVar.d(), earnAssetsRootScreenContract$Step)) {
            return;
        }
        h.s2(aVar, earnAssetsRootScreenContract$Step, false, TransitionAnimation.NONE.f98393a, true);
    }

    @Override // yji.l
    public final void T1(long j2) {
        l.b1(this, this.o.q(), null, new a(this, null), 3);
    }

    @Override // yki.g
    public final yki.b s() {
        return this.f70808p;
    }
}
