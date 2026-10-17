package js8;

import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import ljl.q0;
import vc.s;
import vil.f;
import zhm.y0;

/* JADX INFO: loaded from: classes4.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xd6.a f178158a;

    public a(xd6.a aVar) {
        this.f178158a = aVar;
    }

    public final Set a() {
        d.Companion.getClass();
        xd6.a extensionAuthApi = this.f178158a;
        Intrinsics.checkNotNullParameter(extensionAuthApi, "extensionAuthApi");
        ee6.b bVar = (ee6.b) extensionAuthApi;
        fe6.a aVar = (fe6.a) bVar.f125085m.get();
        qpa.b bVarB = bVar.e.b();
        s.j(bVarB);
        f fVar = (f) ((q0) bVar.f125079b).f196070n0.get();
        s.j(fVar);
        q06.d dVarA = bVar.f.a();
        s.j(dVarA);
        Set setB = y0.b(new ee6.a(aVar, bVarB, fVar, dVarA, bVar.o));
        s.k(setB);
        return setB;
    }
}
