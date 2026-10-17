package vtc;

import com.revolut.feature.security_hub.impl.network.SecurityDelayService;
import com.revolut.feature.security_hub.impl.network.StreetModeService;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class j0 implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k0 f291996a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f291997b;

    public j0(k0 k0Var, int i) {
        this.f291996a = k0Var;
        this.f291997b = i;
    }

    @Override // phm.a
    public final Object get() {
        k0 k0Var = this.f291996a;
        ee0.a aVar = k0Var.f291999a;
        nj0.a aVar2 = k0Var.f292001c;
        int i = this.f291997b;
        switch (i) {
            case 0:
                return new ztc.a();
            case 1:
                return new cuc.e0((ue0.c) k0Var.k.get(), (ne0.j) k0Var.f292005l.get(), (StreetModeService) k0Var.f292006m.get(), new cuc.a0());
            case 2:
                je0.d mapper = aVar.d();
                vc.s.j(mapper);
                yk0.a databaseSessionProvider = k0Var.f292000b.b();
                vc.s.j(databaseSessionProvider);
                xe0.f storageFactory = aVar.f();
                vc.s.j(storageFactory);
                t0.Companion.getClass();
                Intrinsics.checkNotNullParameter(mapper, "mapper");
                Intrinsics.checkNotNullParameter(databaseSessionProvider, "databaseSessionProvider");
                Intrinsics.checkNotNullParameter(storageFactory, "storageFactory");
                return xe0.f.f(storageFactory, databaseSessionProvider, "security_hub_street_mode_json_storage", mapper, 0, null, 56);
            case 3:
                t0.Companion.getClass();
                return new ne0.d();
            case 4:
                ik0.b retrofitFactory = ((nj0.d) aVar2).m();
                vc.s.j(retrofitFactory);
                ek.a converterFactory = ((nj0.d) aVar2).d();
                t0.Companion.getClass();
                Intrinsics.checkNotNullParameter(retrofitFactory, "retrofitFactory");
                Intrinsics.checkNotNullParameter(converterFactory, "converterFactory");
                Object objCreate = ik0.b.a(retrofitFactory, null, null, converterFactory, null, 27).create(StreetModeService.class);
                Intrinsics.checkNotNullExpressionValue(objCreate, "create(...)");
                StreetModeService streetModeService = (StreetModeService) objCreate;
                vc.s.k(streetModeService);
                return streetModeService;
            case 5:
                return new cuc.r((ue0.c) k0Var.k.get(), (ne0.j) k0Var.f292005l.get(), (SecurityDelayService) k0Var.o.get(), new cuc.i(), fe0.d.a());
            case 6:
                ik0.b retrofitFactory2 = ((nj0.d) aVar2).m();
                vc.s.j(retrofitFactory2);
                ek.a converterFactory2 = ((nj0.d) aVar2).d();
                t0.Companion.getClass();
                Intrinsics.checkNotNullParameter(retrofitFactory2, "retrofitFactory");
                Intrinsics.checkNotNullParameter(converterFactory2, "converterFactory");
                Object objCreate2 = ik0.b.a(retrofitFactory2, null, null, converterFactory2, null, 27).create(SecurityDelayService.class);
                Intrinsics.checkNotNullExpressionValue(objCreate2, "create(...)");
                SecurityDelayService securityDelayService = (SecurityDelayService) objCreate2;
                vc.s.k(securityDelayService);
                return securityDelayService;
            default:
                throw new AssertionError(i);
        }
    }
}
