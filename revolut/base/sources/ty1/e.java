package ty1;

import ang.f;
import com.revolut.feature.apm.core.api.ApmToggles$Aani;
import com.revolut.feature.apm.core.api.ApmToggles$Breb;
import dx1.h;
import efm.d0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import pfm.z;
import rfm.f0;
import s78.n;
import tw8.g;
import tx0.o1;
import ufm.i;
import zhm.v;
import zhm.w;

/* JADX INFO: loaded from: classes20.dex */
public final class e implements uw1.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final uw1.c f275460a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f f275461b;

    public e(uw1.c apmFeatureChecker, f userInteractor) {
        Intrinsics.checkNotNullParameter(apmFeatureChecker, "apmFeatureChecker");
        Intrinsics.checkNotNullParameter(userInteractor, "userInteractor");
        this.f275460a = apmFeatureChecker;
        this.f275461b = userInteractor;
    }

    public static h c(h hVar, boolean z, wi0.b countryCode) {
        if (!z) {
            return null;
        }
        hVar.getClass();
        Intrinsics.checkNotNullParameter(countryCode, "countryCode");
        if (hVar.c().contains(countryCode)) {
            return hVar;
        }
        return null;
    }

    public final f0 a() {
        b bVar = (b) this.f275460a;
        bVar.getClass();
        ufm.c cVarD = bVar.d(uw1.f.AANI, ApmToggles$Aani.f61774c);
        bVar.getClass();
        z zVarC = bVar.c(yoj.c.APM_BIZUM);
        i iVarA = bVar.a();
        bVar.getClass();
        ufm.c cVarF = bVar.f(uw1.f.BLIK);
        bVar.getClass();
        ufm.c cVarD2 = bVar.d(uw1.f.BREB, ApmToggles$Breb.f61793c);
        ufm.c cVarE = bVar.e();
        bVar.getClass();
        z zVarC2 = bVar.c(yoj.c.APM_MULTIBANCO);
        bVar.getClass();
        ufm.c cVarF2 = bVar.f(uw1.f.PAY_ID);
        bVar.getClass();
        z zVarC3 = bVar.c(yoj.c.PIX_BRL);
        ufm.c cVarG = bVar.g();
        bVar.getClass();
        ufm.c cVarF3 = bVar.f(uw1.f.QVIK);
        bVar.getClass();
        ufm.c cVarF4 = bVar.f(uw1.f.SPIN);
        ufm.c cVar = new ufm.c(new d(this, 0), 2);
        Intrinsics.checkNotNullExpressionValue(cVar, "fromCallable(...)");
        bVar.getClass();
        f0 f0VarE = d0.E(v.k(cVarD, zVarC, iVarA, cVarF, cVarD2, cVarE, zVarC2, cVarF2, zVarC3, cVarG, cVarF3, cVarF4, cVar, bVar.c(yoj.c.APM_WERO)), new c(new tx.f(14), 1));
        Intrinsics.checkNotNullExpressionValue(f0VarE, "zip(...)");
        return f0VarE;
    }

    public final f0 b() {
        n02.b bVar = n02.b.BIZUM;
        b bVar2 = (b) this.f275460a;
        bVar2.getClass();
        Pair pair = new Pair(bVar, bVar2.c(yoj.c.APM_BIZUM));
        n02.b bVar3 = n02.b.BLIK;
        bVar2.getClass();
        Pair pair2 = new Pair(bVar3, bVar2.f(uw1.f.BLIK));
        n02.b bVar4 = n02.b.BREB;
        bVar2.getClass();
        Pair pair3 = new Pair(bVar4, bVar2.d(uw1.f.BREB, ApmToggles$Breb.f61793c));
        Pair pair4 = new Pair(n02.b.IRIS, bVar2.e());
        n02.b bVar5 = n02.b.MBWAY;
        bVar2.getClass();
        Pair pair5 = new Pair(bVar5, bVar2.c(yoj.c.APM_MULTIBANCO));
        n02.b bVar6 = n02.b.PIX;
        bVar2.getClass();
        i iVar = new i(bVar2.c(yoj.c.PIX_BRL), new o1(new a(bVar2, 1), 28), 1);
        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
        Pair pair6 = new Pair(bVar6, iVar);
        n02.b bVar7 = n02.b.QVIK;
        ufm.c cVarG = bVar2.g();
        bVar2.getClass();
        Pair pair7 = new Pair(bVar7, d0.D(cVarG, bVar2.f(uw1.f.QVIK), new c(new g(7), 3)));
        n02.b bVar8 = n02.b.SPIN;
        bVar2.getClass();
        Pair pair8 = new Pair(bVar8, bVar2.f(uw1.f.SPIN));
        n02.b bVar9 = n02.b.WERO;
        bVar2.getClass();
        List listK = v.k(pair, pair2, pair3, pair4, pair5, pair6, pair7, pair8, new Pair(bVar9, bVar2.c(yoj.c.APM_WERO)));
        List list = listK;
        ArrayList arrayList = new ArrayList(w.t(list, 10));
        Iterator it8 = list.iterator();
        while (it8.hasNext()) {
            arrayList.add((d0) ((Pair) it8.next()).f186386b);
        }
        f0 f0VarE = d0.E(arrayList, new c(new n(listK, 14), 4));
        Intrinsics.checkNotNullExpressionValue(f0VarE, "zip(...)");
        return f0VarE;
    }
}
