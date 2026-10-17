package com.revolut.feature.shared_separate_favourites.common.screen.add_asset_rev10;

import ifd.d;
import jki.i;
import jki.m;
import jki.p;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import y66.q;
import za9.c;
import zc0.z;
import zfd.h;
import zfd.t;

/* JADX INFO: loaded from: classes7.dex */
public final class b implements p {

    @NotNull
    public static final t Companion = new t();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f86828a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AddAssetRev10ScreenContract$InputData f86829b;

    public b(d assetMapper, AddAssetRev10ScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(assetMapper, "assetMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.f86828a = assetMapper;
        this.f86829b = inputData;
    }

    @Override // jki.p
    public final m a(i iVar) {
        h domainState = (h) iVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        return new zfd.p(ce9.m.y(domainState.f321929a, new z(29), new z8d.h(16), new q(domainState, this, 27), new c(this, 17), new z8d.h(17)));
    }
}
