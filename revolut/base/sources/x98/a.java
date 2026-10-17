package x98;

import com.revolut.feature.junior.isa.impl.services.JuniorIsaService;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class a implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f303598a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f303599b;

    public a(b bVar, int i) {
        this.f303598a = bVar;
        this.f303599b = i;
    }

    @Override // phm.a
    public final Object get() {
        b bVar = this.f303598a;
        nj0.a aVar = bVar.f303600a;
        ee0.a aVar2 = bVar.f303601b;
        int i = this.f303599b;
        switch (i) {
            case 0:
                return new z98.d((ca8.a) bVar.f303603g.get());
            case 1:
                return new ca8.a((JuniorIsaService) bVar.d.get(), (ne0.j) bVar.e.get(), (ue0.c) bVar.f.get());
            case 2:
                ik0.b retrofitFactory = ((nj0.d) aVar).m();
                vc.s.j(retrofitFactory);
                ek.a converterFactory = ((nj0.d) aVar).d();
                Intrinsics.checkNotNullParameter(retrofitFactory, "retrofitFactory");
                Intrinsics.checkNotNullParameter(converterFactory, "converterFactory");
                Object objCreate = ik0.b.a(retrofitFactory, null, null, converterFactory, null, 27).create(JuniorIsaService.class);
                Intrinsics.checkNotNullExpressionValue(objCreate, "create(...)");
                JuniorIsaService juniorIsaService = (JuniorIsaService) objCreate;
                vc.s.k(juniorIsaService);
                return juniorIsaService;
            case 3:
                return new ne0.d();
            case 4:
                je0.d mapper = aVar2.d();
                vc.s.j(mapper);
                yk0.a databaseSessionProvider = bVar.f303602c.b();
                vc.s.j(databaseSessionProvider);
                xe0.f storageFactory = aVar2.f();
                vc.s.j(storageFactory);
                u.Companion.getClass();
                Intrinsics.checkNotNullParameter(mapper, "mapper");
                Intrinsics.checkNotNullParameter(databaseSessionProvider, "databaseSessionProvider");
                Intrinsics.checkNotNullParameter(storageFactory, "storageFactory");
                return xe0.f.f(storageFactory, databaseSessionProvider, "junior_trading", mapper, 1, null, 48);
            case 5:
                return new z98.c((ue0.c) bVar.i.get());
            case 6:
                je0.d mapper2 = aVar2.d();
                vc.s.j(mapper2);
                xe0.f storageFactory2 = aVar2.f();
                vc.s.j(storageFactory2);
                u.Companion.getClass();
                Intrinsics.checkNotNullParameter(mapper2, "mapper");
                Intrinsics.checkNotNullParameter(storageFactory2, "storageFactory");
                return xe0.f.e(storageFactory2, "personal_jisa_add_money_warning", mapper2, 12);
            default:
                throw new AssertionError(i);
        }
    }
}
