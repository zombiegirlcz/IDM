package h87;

import com.revolut.feature.global_markets.impl.navigation.GlobalMarketsCollectionDestination;
import ghk.a0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.h0;

/* JADX INFO: loaded from: classes3.dex */
public final class l extends c {

    @NotNull
    private static final j Companion = new j();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final ou5.b f149958l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final s4i.i f149959m;

    public l(ou5.b globalMarketsCollectionProvider, s4i.i globalMarketsAssetDetailsProvider) {
        Intrinsics.checkNotNullParameter(globalMarketsCollectionProvider, "globalMarketsCollectionProvider");
        Intrinsics.checkNotNullParameter(globalMarketsAssetDetailsProvider, "globalMarketsAssetDetailsProvider");
        this.f149958l = globalMarketsCollectionProvider;
        this.f149959m = globalMarketsAssetDetailsProvider;
    }

    @Override // h87.c
    public final a0 Z2(f collectionKey) {
        Intrinsics.checkNotNullParameter(collectionKey, "collectionKey");
        return new a0(rd0.e.n(this.f149958l.v(collectionKey), h0.f322473a), collectionKey, 11);
    }

    @Override // h87.c
    public final void b3(vel.f asset) {
        Intrinsics.checkNotNullParameter(asset, "asset");
        A2(this.f149959m.a(asset));
    }

    @Override // h87.c
    public final void c3(f collectionKey) {
        Intrinsics.checkNotNullParameter(collectionKey, "collectionKey");
        V2(new h54.o(this, collectionKey, null, 7), new yi5.b(29));
    }

    @Override // h87.c
    public final void d3(f collectionKey) {
        Intrinsics.checkNotNullParameter(collectionKey, "collectionKey");
        A2(new GlobalMarketsCollectionDestination(collectionKey));
    }
}
