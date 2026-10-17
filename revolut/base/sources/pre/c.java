package pre;

import com.revolut.feature.terms.api.model.TermsScope;
import com.revolut.feature.terms.api.model.TermsServiceType;
import efm.d0;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import njf.e;
import pfm.r;
import po9.w;
import rfm.l;
import rfm.m;
import sre.g;
import sre.h;
import ufm.i;
import zhm.f0;
import zhm.u;

/* JADX INFO: loaded from: classes13.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final nre.a f238999a;

    public c(nre.a termsRepository) {
        Intrinsics.checkNotNullParameter(termsRepository, "termsRepository");
        this.f238999a = termsRepository;
    }

    public static pfm.a a(c cVar, TermsScope termsScope) {
        cVar.getClass();
        Intrinsics.checkNotNullParameter(termsScope, "termsScope");
        pfm.a aVar = new pfm.a(cVar.j(termsScope), new w(18, new b(cVar, 0)), 4);
        Intrinsics.checkNotNullExpressionValue(aVar, "flatMapCompletable(...)");
        return aVar;
    }

    public static r b(c cVar, String termsId) {
        cVar.getClass();
        Intrinsics.checkNotNullParameter(termsId, "termsId");
        h hVar = (h) cVar.f238999a;
        hVar.getClass();
        Intrinsics.checkNotNullParameter(termsId, "termsId");
        return te0.w.g0(hVar.f265197a.acceptTerms(termsId, new qre.a(null), null));
    }

    public static pfm.a c(c cVar, TermsScope termsScope) {
        Intrinsics.checkNotNullParameter(termsScope, "termsScope");
        lre.c termsSignatory = lre.c.f199507a;
        Intrinsics.checkNotNullParameter(termsSignatory, "termsSignatory");
        pfm.a aVar = new pfm.a(cVar.j(termsScope), new w(21, new b(cVar, 2)), 4);
        Intrinsics.checkNotNullExpressionValue(aVar, "flatMapCompletable(...)");
        return aVar;
    }

    public static efm.r d(c cVar, List terms) {
        Intrinsics.checkNotNullParameter(terms, "terms");
        lre.c termsSignatory = lre.c.f199507a;
        Intrinsics.checkNotNullParameter(termsSignatory, "termsSignatory");
        h hVar = (h) cVar.f238999a;
        efm.r rVarN = new m(hVar.d(), new w(23, new e(terms, 24)), 0).n();
        Intrinsics.checkNotNullParameter(termsSignatory, "termsSignatory");
        efm.r rVarSwitchIfEmpty = rVarN.switchIfEmpty(nim.a.w(hVar.f265200g.f(termsSignatory, true), new e(terms, 21)));
        Intrinsics.checkNotNullExpressionValue(rVarSwitchIfEmpty, "switchIfEmpty(...)");
        return rVarSwitchIfEmpty;
    }

    public static l e(c cVar, TermsScope termsScope) {
        Intrinsics.checkNotNullParameter(termsScope, "termsScope");
        m mVar = new m(((h) cVar.f238999a).d(), new w(19, new arg.a(termsScope, 3)), 0);
        i iVar = new i(cVar.k(termsScope), new w(20, new arg.a(termsScope, 4)), 1);
        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
        l lVarL = mVar.l(iVar);
        Intrinsics.checkNotNullExpressionValue(lVarL, "switchIfEmpty(...)");
        return lVarL;
    }

    public static d0 h(c cVar, wi0.b bVar, List list, int i) {
        if ((i & 1) != 0) {
            bVar = null;
        }
        cVar.getClass();
        d0 d0VarFirst = m70.a.g(zi0.c.J(l(cVar, bVar, null, list, 2)), null, new pof.e(21), 1).first(f0.f322471a);
        Intrinsics.checkNotNullExpressionValue(d0VarFirst, "first(...)");
        return d0VarFirst;
    }

    public static efm.r l(c cVar, wi0.b bVar, TermsServiceType termsServiceType, List list, int i) {
        List list2 = null;
        if ((i & 1) != 0) {
            bVar = null;
        }
        if ((i & 2) != 0) {
            termsServiceType = null;
        }
        if ((i & 4) != 0) {
            list = null;
        }
        return nim.a.w(((h) cVar.f238999a).e.f(new g(bVar != null ? bVar.f297794a : null, termsServiceType != null ? termsServiceType.getType() : null), true), new eh1.d(list, 10, list2));
    }

    public final d0 f(TermsScope termsScope, wi0.b bVar) {
        Intrinsics.checkNotNullParameter(termsScope, "termsScope");
        efm.r rVarF = m70.a.f(l(this, bVar, null, u.c(termsScope), 10), new p2b.a(22), new pof.e(20), new pof.e(22));
        od0.i.Companion.getClass();
        d0 d0VarFirst = rVarF.first(od0.i.f224256b);
        Intrinsics.checkNotNullExpressionValue(d0VarFirst, "first(...)");
        return d0VarFirst;
    }

    public final d0 i(String documentId, String str) {
        Intrinsics.checkNotNullParameter(documentId, "documentId");
        h hVar = (h) this.f238999a;
        hVar.getClass();
        Intrinsics.checkNotNullParameter(documentId, "documentId");
        efm.r rVarF = m70.a.f(te0.w.f0(hVar.f265202j.e(new sre.e(documentId, str), w4l.h.f294642c)), new p2b.a(23), new pof.e(17), new pof.e(18));
        od0.i.Companion.getClass();
        d0 d0VarFirst = rVarF.first(od0.i.f224256b);
        Intrinsics.checkNotNullExpressionValue(d0VarFirst, "first(...)");
        return d0VarFirst;
    }

    public final i j(TermsScope termsScope) {
        Intrinsics.checkNotNullParameter(termsScope, "termsScope");
        i iVar = new i(k(termsScope), new w(22, new arg.a(termsScope, 5)), 1);
        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
        return iVar;
    }

    public final i k(TermsScope termsScope) {
        List listC = u.c(termsScope);
        d0 d0VarFirstOrError = m70.a.g(zi0.c.J(nre.a.a(this.f238999a, 2)), new pof.e(this, 16), null, 2).firstOrError();
        w wVar = new w(16, new a(listC, this, 0));
        d0VarFirstOrError.getClass();
        i iVar = new i(d0VarFirstOrError, wVar, 0);
        Intrinsics.checkNotNullExpressionValue(iVar, "flatMap(...)");
        return iVar;
    }

    public final efm.r m(String url2) {
        Intrinsics.checkNotNullParameter(url2, "termsHtmlUrl");
        h hVar = (h) this.f238999a;
        hVar.getClass();
        Intrinsics.checkNotNullParameter(url2, "url");
        return hVar.i.f(url2, true);
    }
}
