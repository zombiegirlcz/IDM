package t29;

import com.revolut.feature.lifestyle.core.impl.network.LifestyleHomeService;
import kotlinx.serialization.json.Json;
import retrofit2.Converter;

/* JADX INFO: loaded from: classes13.dex */
public final class e implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f f267482a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f267483b;

    public e(f fVar, int i) {
        this.f267482a = fVar;
        this.f267483b = i;
    }

    @Override // phm.a
    public final Object get() {
        f fVar = this.f267482a;
        ee0.a aVar = fVar.f267485b;
        int i = this.f267483b;
        switch (i) {
            case 0:
                o29.b bVar = (o29.b) fVar.i.get();
                f39.c cVarA = fVar.f267486c.a();
                vc.s.j(cVarA);
                return new u29.b(bVar, cVarA);
            case 1:
                return new o29.d((LifestyleHomeService) fVar.f.get(), (ne0.j) fVar.f267487g.get(), (ue0.c) fVar.f267488h.get());
            case 2:
                ik0.b bVarM = ((nj0.d) fVar.f267484a).m();
                vc.s.j(bVarM);
                return n.a(bVarM, (Converter.Factory) fVar.e.get());
            case 3:
                return q.a((Json) fVar.d.get());
            case 4:
                return sg8.j.h(new w29.b(fe0.d.a(), 0));
            case 5:
                return s.a();
            case 6:
                je0.d dVarB = aVar.b();
                vc.s.j(dVarB);
                xe0.f fVarF = aVar.f();
                vc.s.j(fVarF);
                return sg8.j.k(dVarB, fVarF);
            default:
                throw new AssertionError(i);
        }
    }
}
