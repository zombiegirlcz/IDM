package com.revolut.feature.retail.private_banking.impl.ui.deposit_assets.flow;

import com.revolut.feature.topup_screen.api.config.TopUpConfig;
import com.revolut.feature.topup_screen.api.destination.InitTopUpDestination;
import d8l.d;
import kotlin.jvm.internal.Intrinsics;
import oki.h;
import smd.s;
import y8a.g;
import ycb.c;
import yki.i;

/* JADX INFO: loaded from: classes6.dex */
public final class b extends h implements ycb.b {
    public final c o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final s f82794p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final vh5.a f82795q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final i f82796r;

    public b(c inputData, s depositAssetsTypesProvider, vh5.a cryptoPermissionExtensionModel) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(depositAssetsTypesProvider, "depositAssetsTypesProvider");
        Intrinsics.checkNotNullParameter(cryptoPermissionExtensionModel, "cryptoPermissionExtensionModel");
        this.o = inputData;
        this.f82794p = depositAssetsTypesProvider;
        this.f82795q = cryptoPermissionExtensionModel;
        this.f82796r = d.a(this, new g(this, 13));
    }

    public static final void I2(b bVar) {
        bVar.C1(new InitTopUpDestination(TopUpConfig.Companion.c(TopUpConfig.INSTANCE, null, null, null, bVar.o.f312604a ? pte.a.STANDARD : pte.a.NESTED_TOP_UP, 23)));
    }

    @Override // yki.j
    public final void M0() {
        n2(new y7i.h(this, null, 7), new whi.b(6));
    }

    @Override // yki.g
    public final yki.b s() {
        return this.f82796r;
    }
}
