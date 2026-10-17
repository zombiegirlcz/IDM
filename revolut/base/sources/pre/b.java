package pre;

import com.revolut.feature.terms.api.model.Terms;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import od0.i;
import pfm.m;
import pfm.r;
import sre.h;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class b implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f238997a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c f238998b;

    public /* synthetic */ b(c cVar, int i) {
        this.f238997a = i;
        this.f238998b = cVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f238997a) {
            case 0:
                i termsToAccept = (i) obj2;
                Intrinsics.checkNotNullParameter(termsToAccept, "termsToAccept");
                return termsToAccept.d() ? nre.a.b(this.f238998b.f238999a, ((Terms) termsToAccept.c()).f90355a) : m.f235744a;
            case 1:
                List allTerms = (List) obj2;
                Intrinsics.checkNotNullParameter(allTerms, "allTerms");
                c cVar = this.f238998b;
                h hVar = (h) cVar.f238999a;
                hVar.getClass();
                lre.c termsSignatory = lre.c.f199507a;
                Intrinsics.checkNotNullParameter(termsSignatory, "termsSignatory");
                return nim.a.w(hVar.f265200g.f(termsSignatory, true), new a(allTerms, cVar, 1));
            default:
                nre.a aVar = this.f238998b.f238999a;
                i termsToAccept2 = (i) obj2;
                Intrinsics.checkNotNullParameter(termsToAccept2, "termsToAccept");
                if (!termsToAccept2.d()) {
                    return m.f235744a;
                }
                r rVarB = nre.a.b(aVar, ((Terms) termsToAccept2.c()).f90355a);
                h hVar2 = (h) aVar;
                hVar2.getClass();
                lre.c termsSignatory2 = lre.c.f199507a;
                Intrinsics.checkNotNullParameter(termsSignatory2, "termsSignatory");
                return rVarB.e(hVar2.f265200g.g(termsSignatory2, true));
        }
    }
}
