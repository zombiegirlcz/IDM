package com.revolut.feature.chooser;

import efm.d0;
import kotlin.jvm.internal.Intrinsics;
import pfm.m;
import qc0.w;
import qe0.g;
import qg7.v;
import qi3.o;
import te0.r;
import te0.s;
import ufm.i;
import zhm.f0;

/* JADX INFO: loaded from: classes21.dex */
public final class a implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f65912a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final o f65913b;

    public a(d state, o chooserModelsProvider) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(chooserModelsProvider, "chooserModelsProvider");
        this.f65912a = state;
        this.f65913b = chooserModelsProvider;
    }

    @Override // com.revolut.feature.chooser.c
    public final efm.b H0(String query) {
        Intrinsics.checkNotNullParameter(query, "query");
        efm.b bVarIgnoreElements = ((r) this.f65912a.j()).b(query).ignoreElements();
        Intrinsics.checkNotNullExpressionValue(bVarIgnoreElements, "ignoreElements(...)");
        return bVarIgnoreElements;
    }

    @Override // com.revolut.feature.chooser.c
    public final d0 N2() {
        d0 d0VarFirstOrError = this.f65913b.a().firstOrError();
        g gVar = new g(7, new v(6));
        d0VarFirstOrError.getClass();
        i iVar = new i(d0VarFirstOrError, gVar, 1);
        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
        return iVar;
    }

    @Override // com.revolut.feature.chooser.c
    public final efm.b T0() {
        m mVar = m.f235744a;
        Intrinsics.checkNotNullExpressionValue(mVar, "complete(...)");
        return mVar;
    }

    @Override // com.revolut.feature.chooser.c
    public final efm.b a2(String id10) {
        Intrinsics.checkNotNullParameter(id10, "id");
        m mVar = m.f235744a;
        Intrinsics.checkNotNullExpressionValue(mVar, "complete(...)");
        return mVar;
    }

    @Override // com.revolut.feature.chooser.c
    public final d0 d1(String id10) {
        Intrinsics.checkNotNullParameter(id10, "id");
        d0 d0VarFirst = this.f65913b.a().first(f0.f322471a);
        g gVar = new g(8, new w(id10, 14));
        d0VarFirst.getClass();
        i iVar = new i(d0VarFirst, gVar, 1);
        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
        return iVar;
    }

    @Override // com.revolut.feature.chooser.c
    public final efm.r j() {
        return ((r) this.f65912a.j()).c(s.f270018a);
    }

    @Override // com.revolut.feature.chooser.c
    public final efm.r m() {
        efm.r map = te0.w.l(j(), this.f65913b.a()).map(new g(6, new v(5)));
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        return map;
    }
}
