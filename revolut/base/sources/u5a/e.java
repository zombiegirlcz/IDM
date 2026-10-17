package u5a;

import com.revolut.feature.payments_migration.impl.network.PaymentsMigrationService;
import kotlin.jvm.internal.Intrinsics;
import retrofit2.Converter;
import rlm.o;
import ulm.a1;
import ulm.b1;
import vc.s;
import zhm.f0;

/* JADX INFO: loaded from: classes5.dex */
public final class e implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f f277412a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f277413b;

    public e(f fVar, int i) {
        this.f277412a = fVar;
        this.f277413b = i;
    }

    @Override // phm.a
    public final Object get() {
        f fVar = this.f277412a;
        ee0.a aVar = fVar.f277414a;
        int i = this.f277413b;
        switch (i) {
            case 0:
                je0.d mapper = (je0.d) fVar.f277424q.get();
                yk0.a databaseSessionProvider = fVar.f277415b.b();
                s.j(databaseSessionProvider);
                xe0.f storageFactory = aVar.f();
                s.j(storageFactory);
                l.Companion.getClass();
                Intrinsics.checkNotNullParameter(mapper, "mapper");
                Intrinsics.checkNotNullParameter(databaseSessionProvider, "databaseSessionProvider");
                Intrinsics.checkNotNullParameter(storageFactory, "storageFactory");
                return xe0.f.f(storageFactory, databaseSessionProvider, "payments_migration", mapper, 1, f0.f322471a, 32);
            case 1:
                a6a.a jsonProvider = (a6a.a) fVar.f277423p.get();
                me0.a factory = aVar.e();
                s.j(factory);
                Intrinsics.checkNotNullParameter(jsonProvider, "jsonProvider");
                Intrinsics.checkNotNullParameter(factory, "factory");
                return factory.a(jsonProvider.f1582a);
            case 2:
                return new a6a.a(fe0.d.a());
            case 3:
                return new b6a.e((PaymentsMigrationService) fVar.f277427t.get(), (ne0.j) fVar.u.get(), (ue0.c) fVar.f277425r.get());
            case 4:
                ik0.b retrofitFactory = ((nj0.d) fVar.d).m();
                s.j(retrofitFactory);
                Converter.Factory converterFactory = (Converter.Factory) fVar.f277426s.get();
                Intrinsics.checkNotNullParameter(retrofitFactory, "retrofitFactory");
                Intrinsics.checkNotNullParameter(converterFactory, "converterFactory");
                Object objCreate = ik0.b.a(retrofitFactory, null, null, converterFactory, null, 27).create(PaymentsMigrationService.class);
                Intrinsics.checkNotNullExpressionValue(objCreate, "create(...)");
                PaymentsMigrationService paymentsMigrationService = (PaymentsMigrationService) objCreate;
                s.k(paymentsMigrationService);
                return paymentsMigrationService;
            case 5:
                a6a.a jsonProvider2 = (a6a.a) fVar.f277423p.get();
                Intrinsics.checkNotNullParameter(jsonProvider2, "jsonProvider");
                o oVar = jsonProvider2.f1582a;
                b1.Companion.getClass();
                return ek.b.a(oVar, a1.a("application/json"));
            case 6:
                return new ne0.d();
            default:
                throw new AssertionError(i);
        }
    }
}
