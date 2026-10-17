package jei;

import efm.d0;
import gei.f;
import jeg.h;
import jf0.c;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import mei.g;
import pfm.m;
import q06.d;

/* JADX INFO: loaded from: classes10.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g f173401a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d f173402b;

    public b(g tilesRepository, d deeplinkParser) {
        Intrinsics.checkNotNullParameter(tilesRepository, "tilesRepository");
        Intrinsics.checkNotNullParameter(deeplinkParser, "deeplinkParser");
        this.f173401a = tilesRepository;
        this.f173402b = deeplinkParser;
    }

    public final String a(gei.a aVar, String str) {
        c cVarD;
        String str2 = aVar.d.f143309h;
        if (str2 == null || (cVarD = ((s06.c) this.f173402b).d(str2)) == null) {
            return null;
        }
        return (String) cVarD.d.get(str);
    }

    public final boolean b(gei.a tile) {
        Intrinsics.checkNotNullParameter(tile, "tile");
        String str = tile.d.f143309h;
        if (str == null) {
            return false;
        }
        c cVarD = ((s06.c) this.f173402b).d(str);
        return Intrinsics.f(cVarD != null ? cVarD.e(1) : null, "stories");
    }

    public final efm.b c(gei.a tile) {
        Intrinsics.checkNotNullParameter(tile, "tile");
        if (tile.f143300b == f.OPENED) {
            return m.f235744a;
        }
        g gVar = this.f173401a;
        d0 d0VarFirstOrError = m70.a.g(gVar.d.f("TILES", gVar.f204693c.a(Unit.f186387a, false)), null, new j7b.m(27), 1).firstOrError();
        h hVar = new h(new a(this, tile, 0), 1);
        d0VarFirstOrError.getClass();
        return new pfm.a(d0VarFirstOrError, hVar, 4);
    }
}
