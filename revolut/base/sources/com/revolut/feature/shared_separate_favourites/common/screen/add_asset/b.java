package com.revolut.feature.shared_separate_favourites.common.screen.add_asset;

import ifd.d;
import ip0.pb0;
import java.util.List;
import jki.p;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import yfd.x;
import zhm.v;

/* JADX INFO: loaded from: classes7.dex */
public final class b implements p {

    @NotNull
    public static final x Companion = new x();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SharedFavouritesAddAssetScreenContract$InputData f86814a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d f86815b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f86816c;

    public b(SharedFavouritesAddAssetScreenContract$InputData inputData, d assetMapper) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(assetMapper, "assetMapper");
        this.f86814a = inputData;
        this.f86815b = assetMapper;
        this.f86816c = v.k(new pb0("LOADING_ID_0"), new pb0("LOADING_ID_1"), new pb0("LOADING_ID_2"));
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00ed  */
    @Override // jki.p
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final jki.m a(jki.i r20) {
        /*
            Method dump skipped, instruction units count: 300
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.shared_separate_favourites.common.screen.add_asset.b.a(jki.i):jki.m");
    }
}
