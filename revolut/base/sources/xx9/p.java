package xx9;

import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import te0.w;
import v2e.x;
import zhm.h0;

/* JADX INFO: loaded from: classes13.dex */
public final class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final fc.g f309448a;

    public p(fc.g provider) {
        Intrinsics.checkNotNullParameter(provider, "provider");
        this.f309448a = provider;
    }

    public static efm.r b(p pVar, String searchQuery) {
        pVar.getClass();
        Intrinsics.checkNotNullParameter(searchQuery, "searchQuery");
        return nim.a.w(c(pVar, false, null, 2), new xf0.h(searchQuery, 14));
    }

    public static /* synthetic */ efm.r c(p pVar, boolean z, jq9.a aVar, int i) {
        if ((i & 1) != 0) {
            z = false;
        }
        if ((i & 2) != 0) {
            aVar = jq9.a.ALL;
        }
        return pVar.a(z, aVar);
    }

    public final efm.r a(boolean z, jq9.a juniorIncludingMode) {
        efm.r rVarW;
        Intrinsics.checkNotNullParameter(juniorIncludingMode, "juniorIncludingMode");
        fc.g gVar = this.f309448a;
        u0a.a aVar = (u0a.a) gVar.f133582g;
        Intrinsics.checkNotNullParameter(juniorIncludingMode, "juniorIncludingMode");
        int i = o.f309447a[juniorIncludingMode.ordinal()];
        boolean z3 = false;
        boolean z4 = true;
        if (i == 1) {
            rVarW = nim.a.w(aVar.e(z), new x(z3, gVar));
        } else if (i == 2) {
            rVarW = nim.a.w(aVar.e(z), new x(z4, gVar));
        } else {
            if (i != 3) {
                throw new NoWhenBranchMatchedException();
            }
            rVarW = w.l(aVar.e(false), rd0.e.c(mo3.a.f(rd0.e.n(((nj8.n) ((hj8.a) gVar.f133583h)).l(w4l.h.f294642c), h0.f322473a), new e(11), new x0b.h(18), new e(12)), kotlin.coroutines.g.f186406a)).map(new d(15, new f(gVar, 4)));
            Intrinsics.checkNotNullExpressionValue(rVarW, "map(...)");
        }
        efm.r rVarDoOnSubscribe = rVarW.doOnSubscribe(new d(11, new t9f.n(gVar, z, 19)));
        Intrinsics.checkNotNullExpressionValue(rVarDoOnSubscribe, "doOnSubscribe(...)");
        return rVarDoOnSubscribe;
    }
}
