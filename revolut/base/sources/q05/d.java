package q05;

import ch.qos.logback.core.net.SyslogConstants;
import com.revolut.feature.credit.health.impl.data.network.CreditHealthService;
import kotlin.jvm.internal.Intrinsics;
import vc.s;

/* JADX INFO: loaded from: classes22.dex */
public final class d implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e f241141a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f241142b;

    public d(e eVar, int i) {
        this.f241141a = eVar;
        this.f241142b = i;
    }

    @Override // phm.a
    public final Object get() {
        e eVar = this.f241141a;
        nj0.a aVar = eVar.f241143a;
        ee0.a aVar2 = eVar.f241144b;
        int i = this.f241142b;
        switch (i) {
            case 0:
                return new r05.g((l05.i) eVar.f241148j.get());
            case 1:
                return new l05.i((CreditHealthService) eVar.f241147h.get(), new ne0.d(), (ue0.c) eVar.i.get());
            case 2:
                ik0.b retrofitFactory = ((nj0.d) aVar).m();
                s.j(retrofitFactory);
                ek.a converterFactory = ((nj0.d) aVar).d();
                c.Companion.getClass();
                Intrinsics.checkNotNullParameter(retrofitFactory, "retrofitFactory");
                Intrinsics.checkNotNullParameter(converterFactory, "converterFactory");
                Object objCreate = ik0.b.a(retrofitFactory, null, null, converterFactory, null, 27).create(CreditHealthService.class);
                Intrinsics.checkNotNullExpressionValue(objCreate, "create(...)");
                CreditHealthService creditHealthService = (CreditHealthService) objCreate;
                s.k(creditHealthService);
                return creditHealthService;
            case 3:
                je0.d mapper = aVar2.d();
                s.j(mapper);
                yk0.a databaseSessionProvider = eVar.f241145c.b();
                s.j(databaseSessionProvider);
                xe0.f storageFactory = aVar2.f();
                s.j(storageFactory);
                c.Companion.getClass();
                Intrinsics.checkNotNullParameter(mapper, "mapper");
                Intrinsics.checkNotNullParameter(databaseSessionProvider, "databaseSessionProvider");
                Intrinsics.checkNotNullParameter(storageFactory, "storageFactory");
                return xe0.f.g(storageFactory, databaseSessionProvider, "credit_health", mapper, 0, null, false, SyslogConstants.LOG_CLOCK);
            case 4:
                return new l05.c((CreditHealthService) eVar.f241147h.get(), new ne0.d(), (ue0.c) eVar.i.get());
            case 5:
                return new r05.f((l05.g) eVar.f241150m.get());
            case 6:
                return new l05.g((CreditHealthService) eVar.f241147h.get(), new ne0.d(), (ue0.c) eVar.i.get());
            default:
                throw new AssertionError(i);
        }
    }
}
