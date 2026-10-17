package com.revolut.feature_tiles_api.models;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f97834a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TileCarouselType f97835b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f97836c;

    public a(String title, TileCarouselType type, List tiles) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(tiles, "tiles");
        this.f97834a = title;
        this.f97835b = type;
        this.f97836c = tiles;
    }

    public static a a(a aVar, List tiles) {
        String title = aVar.f97834a;
        TileCarouselType type = aVar.f97835b;
        aVar.getClass();
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(tiles, "tiles");
        return new a(title, type, tiles);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f97834a, aVar.f97834a) && Intrinsics.f(this.f97835b, aVar.f97835b) && Intrinsics.f(this.f97836c, aVar.f97836c);
    }

    public final int hashCode() {
        return this.f97836c.hashCode() + ((this.f97835b.hashCode() + (this.f97834a.hashCode() * 31)) * 31);
    }
}
