package l35;

import androidx.room.RxRoom;
import com.revolut.data.model.Data;
import efm.d0;
import efm.r;
import kotlin.jvm.internal.Intrinsics;
import le.u1;
import o55.s;
import o55.w;
import o55.z;
import ufm.n;
import y45.j;
import zhm.h0;

/* JADX INFO: loaded from: classes13.dex */
public interface b {
    static r a(b bVar, String loanId) {
        y45.f fVar = (y45.f) bVar;
        fVar.getClass();
        Intrinsics.checkNotNullParameter(loanId, "loanId");
        w4l.h loadingStrategy = w4l.h.f294642c;
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        return nim.a.w(pd.b.r(fVar.f310796c.a(loanId, loadingStrategy), new y45.c(fVar, loadingStrategy, 1)), new y25.d(12));
    }

    static r c(b bVar, String loanId) {
        y45.f fVar = (y45.f) bVar;
        fVar.getClass();
        Intrinsics.checkNotNullParameter(loanId, "loanId");
        w4l.h loadingStrategy = w4l.h.f294642c;
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        z zVar = fVar.f310794a;
        zVar.getClass();
        Intrinsics.checkNotNullParameter(loanId, "loanId");
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        r rVarE = zVar.f222384g.e(new o55.a(loanId), loadingStrategy);
        Intrinsics.checkNotNullParameter(loanId, "loanId");
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        return ue0.e.p(nim.a.w(u1.d(rVarE, zVar.f222385h.e(new o55.f(loanId), loadingStrategy)), new y25.d(13)), h0.f322473a);
    }

    static /* synthetic */ n d(b bVar, String str, Long l2, int i) {
        if ((i & 2) != 0) {
            l2 = null;
        }
        return ((y45.f) bVar).i(str, l2, null);
    }

    static r e(b bVar, String loanId) {
        y45.f fVar = (y45.f) bVar;
        fVar.getClass();
        Intrinsics.checkNotNullParameter(loanId, "loanId");
        w4l.h loadingStrategy = w4l.h.f294642c;
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        j jVar = fVar.f310798h;
        Intrinsics.checkNotNullParameter(loanId, "loanId");
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        w wVar = jVar.f310804a;
        wVar.getClass();
        Intrinsics.checkNotNullParameter(loanId, "loanId");
        d0 d0VarK = wVar.f.k(loanId);
        d0VarK.getClass();
        pfm.h hVar = new pfm.h(d0VarK, 4);
        Intrinsics.checkNotNullExpressionValue(hVar, "ignoreElement(...)");
        pfm.r rVarG0 = te0.w.g0(hVar);
        n45.d dVar = wVar.f222375b;
        sfm.b bVarG = rVarG0.g(RxRoom.createObservable(dVar.f212298a, false, new String[]{"loan_repayments"}, new mll.h(dVar, loanId)).take(1L).map(new o4a.e(11, new o5.b(17))));
        Intrinsics.checkNotNullExpressionValue(bVarG, "andThen(...)");
        r rVarStartWith = ue0.e.H(bVarG, h0.f322473a, new o5.b(18)).startWith(new Data(null, null, true, 3, null));
        r rVarL = wVar.e.l(new s(loanId));
        Intrinsics.h(rVarStartWith);
        r rVarDistinctUntilChanged = te0.w.l(rVarL, rVarStartWith).map(new o4a.e(12, new o5.b(19))).distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(rVarDistinctUntilChanged, "distinctUntilChanged(...)");
        return rVarDistinctUntilChanged;
    }
}
