package dfb;

import com.revolut.feature.retail.reverywhere.impl.network.ReverywhereService;
import kotlin.jvm.internal.Intrinsics;
import vc.s;

/* JADX INFO: loaded from: classes6.dex */
public final class e implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f f113851a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f113852b;

    public e(f fVar, int i) {
        this.f113851a = fVar;
        this.f113852b = i;
    }

    @Override // phm.a
    public final Object get() {
        f fVar = this.f113851a;
        nj0.a aVar = fVar.f113853a;
        ee0.a aVar2 = fVar.f113855c;
        ore.b bVar = fVar.d;
        int i = this.f113852b;
        if (i == 0) {
            zeb.g gVar = (zeb.g) fVar.f113857h.get();
            pre.c cVarA = bVar.a();
            s.j(cVarA);
            mre.c cVarB = bVar.b();
            s.j(cVarB);
            zja.a aVarA = ((ika.b) fVar.e).a();
            s.j(aVarA);
            pre.c cVarA2 = bVar.a();
            s.j(cVarA2);
            return new efb.g(gVar, cVarA, cVarB, aVarA, new zjh.i(cVarA2));
        }
        if (i == 1) {
            return new zeb.g((ReverywhereService) fVar.f.get(), new ne0.d(), (ue0.c) fVar.f113856g.get(), new zeb.d());
        }
        if (i == 2) {
            ik0.b bVarM = ((nj0.d) aVar).m();
            s.j(bVarM);
            yeb.a aVar3 = (yeb.a) fVar.f113854b.f113859b.get();
            s.j(aVar3);
            return p.a(bVarM, aVar3, ((nj0.d) aVar).d());
        }
        if (i != 3) {
            throw new AssertionError(i);
        }
        je0.d mapper = aVar2.d();
        s.j(mapper);
        xe0.f storageFactory = aVar2.f();
        s.j(storageFactory);
        l.Companion.getClass();
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        Intrinsics.checkNotNullParameter(storageFactory, "storageFactory");
        return storageFactory.b("reverywhere_onboarding_config", mapper, 2);
    }
}
