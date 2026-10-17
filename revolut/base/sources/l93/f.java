package l93;

import b93.k;
import efm.r;
import h43.q;
import ha3.t;
import ha3.x;
import kotlin.coroutines.g;
import kotlin.jvm.internal.Intrinsics;
import skm.p0;
import te0.w;
import w4l.i;

/* JADX INFO: loaded from: classes13.dex */
public interface f {
    static r a(f fVar) {
        k sortType = k.CREATED_DATE;
        Intrinsics.checkNotNullParameter(sortType, "sortType");
        return m70.a.g(((x) fVar).z(sortType), null, new q(23), 1);
    }

    static /* synthetic */ sfm.b b(f fVar, Iterable iterable, b93.d dVar, int i) {
        if ((i & 2) != 0) {
            dVar = b93.d.RETAIL;
        }
        return ((x) fVar).w(iterable, dVar, false, k.CREATED_DATE);
    }

    static r d(f fVar, b93.d cardScope, boolean z, int i) {
        if ((i & 1) != 0) {
            cardScope = b93.d.RETAIL;
        }
        if ((i & 2) != 0) {
            z = false;
        }
        k sortType = k.CREATED_DATE;
        x xVar = (x) fVar;
        xVar.getClass();
        Intrinsics.checkNotNullParameter(cardScope, "cardScope");
        Intrinsics.checkNotNullParameter(sortType, "sortType");
        return rd0.e.c(xVar.f.r(cardScope, z, sortType), g.f186406a);
    }

    static ufm.b e(f fVar) {
        x xVar = (x) fVar;
        xVar.getClass();
        return w.o0(p0.f264003c, new t(xVar, null, 0));
    }

    static r f(f fVar, String cardId) {
        x xVar = (x) fVar;
        xVar.getClass();
        Intrinsics.checkNotNullParameter(cardId, "cardId");
        i loadingStrategy = i.f294643c;
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        return rd0.e.c(xVar.f.x(cardId, loadingStrategy), g.f186406a);
    }

    static /* synthetic */ ufm.b g(f fVar, e93.e eVar, String str, int i) {
        if ((i & 16) != 0) {
            str = null;
        }
        return ((x) fVar).t(null, eVar, null, null, str, null, null, null);
    }

    static r i(f fVar) {
        b93.d cardScope = b93.d.RETAIL;
        k sortType = k.CREATED_DATE;
        x xVar = (x) fVar;
        xVar.getClass();
        Intrinsics.checkNotNullParameter(cardScope, "cardScope");
        Intrinsics.checkNotNullParameter(sortType, "sortType");
        return m70.a.g(xVar.x(null, cardScope, false, sortType), null, new q(21), 1);
    }

    static ufm.b j(f fVar, b93.d dVar, int i) {
        if ((i & 1) != 0) {
            dVar = b93.d.RETAIL;
        }
        b93.d cardScope = dVar;
        k sortType = k.CREATED_DATE;
        x xVar = (x) fVar;
        xVar.getClass();
        Intrinsics.checkNotNullParameter(cardScope, "cardScope");
        Intrinsics.checkNotNullParameter(sortType, "sortType");
        return w.o0(p0.f264003c, new gsh.w(xVar, cardScope, sortType, null, 20));
    }

    static /* synthetic */ sfm.b k(f fVar, String str, b93.d dVar, boolean z, int i) {
        if ((i & 1) != 0) {
            str = null;
        }
        if ((i & 2) != 0) {
            dVar = b93.d.RETAIL;
        }
        if ((i & 4) != 0) {
            z = false;
        }
        return ((x) fVar).x(str, dVar, z, k.CREATED_DATE);
    }
}
