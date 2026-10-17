package com.revolut.feature.tab.crypto.impl.ui.v2;

import com.revolut.feature.tab.crypto.impl.ui.v2.TabCryptoRootFlowV2Contract$Step;
import cp5.d;
import kotlin.jvm.internal.Intrinsics;
import oki.h;
import yki.b;
import zhm.f0;
import zje.r;
import zje.s;

/* JADX INFO: loaded from: classes8.dex */
public final class a extends h implements r {
    public final zje.a o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final yki.a f89816p;

    public a(zje.a accountSelectionRelay) {
        Intrinsics.checkNotNullParameter(accountSelectionRelay, "accountSelectionRelay");
        this.o = accountSelectionRelay;
        s sVar = new s(this, 0);
        this.f89816p = d.a(this, TabCryptoRootFlowV2Contract$Step.Home.f89815a, f0.f322471a, sVar);
    }

    @Override // yki.g
    public final b s() {
        return this.f89816p;
    }
}
