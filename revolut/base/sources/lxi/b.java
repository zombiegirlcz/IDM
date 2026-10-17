package lxi;

import hxi.m;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final rvi.b f200578a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d f200579b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final f f200580c;
    public final h d;
    public final a e;
    public final egk.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final zjh.j f200581g;

    public b(rvi.b passItemMapper, d nearbyAirportsMapper, f passActivitySectionMapper, h savedLoungesItemsMapper, a helpItemsMapper, egk.e pricingPlansUiInteractor, zjh.j legalEntityDisclaimerMapper, m revPointsMenuItemMapper) {
        Intrinsics.checkNotNullParameter(passItemMapper, "passItemMapper");
        Intrinsics.checkNotNullParameter(nearbyAirportsMapper, "nearbyAirportsMapper");
        Intrinsics.checkNotNullParameter(passActivitySectionMapper, "passActivitySectionMapper");
        Intrinsics.checkNotNullParameter(savedLoungesItemsMapper, "savedLoungesItemsMapper");
        Intrinsics.checkNotNullParameter(helpItemsMapper, "helpItemsMapper");
        Intrinsics.checkNotNullParameter(pricingPlansUiInteractor, "pricingPlansUiInteractor");
        Intrinsics.checkNotNullParameter(legalEntityDisclaimerMapper, "legalEntityDisclaimerMapper");
        Intrinsics.checkNotNullParameter(revPointsMenuItemMapper, "revPointsMenuItemMapper");
        this.f200578a = passItemMapper;
        this.f200579b = nearbyAirportsMapper;
        this.f200580c = passActivitySectionMapper;
        this.d = savedLoungesItemsMapper;
        this.e = helpItemsMapper;
        this.f = pricingPlansUiInteractor;
        this.f200581g = legalEntityDisclaimerMapper;
    }
}
