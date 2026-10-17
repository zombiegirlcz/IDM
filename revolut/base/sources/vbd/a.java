package vbd;

import com.revolut.feature.shared.savings.impl.core.account.data.network.SavingsAccountService;
import e4m.e;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.Json;
import ne0.j;
import nj0.d;
import retrofit2.Converter;
import rlm.o;
import sbd.h;
import ubd.i;
import ulm.b1;
import vc.s;
import xe0.f;

/* JADX INFO: loaded from: classes7.dex */
public final class a implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f287499a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f287500b;

    public a(b bVar, int i) {
        this.f287499a = bVar;
        this.f287500b = i;
    }

    @Override // phm.a
    public final Object get() {
        b bVar = this.f287499a;
        ee0.a aVar = bVar.f287502b;
        int i = this.f287500b;
        switch (i) {
            case 0:
                return new i(new h((SavingsAccountService) bVar.f287504g.get(), (j) bVar.f287505h.get(), (ue0.c) bVar.f287506j.get(), (com.revolut.feature.shared.savings.impl.core.error.c) bVar.k.get()), new dl2.a(bVar.d.f6618b.e(), 2));
            case 1:
                ik0.b retrofitFactory = ((d) bVar.f287501a).m();
                s.j(retrofitFactory);
                Converter.Factory converterFactory = (Converter.Factory) bVar.f.get();
                tbd.b.Companion.getClass();
                Intrinsics.checkNotNullParameter(retrofitFactory, "retrofitFactory");
                Intrinsics.checkNotNullParameter(converterFactory, "converterFactory");
                Object objCreate = ik0.b.a(retrofitFactory, null, null, converterFactory, null, 27).create(SavingsAccountService.class);
                Intrinsics.checkNotNullExpressionValue(objCreate, "create(...)");
                SavingsAccountService savingsAccountService = (SavingsAccountService) objCreate;
                s.k(savingsAccountService);
                return savingsAccountService;
            case 2:
                Json json = (Json) bVar.e.get();
                Intrinsics.checkNotNullParameter(json, "json");
                return p.a.g(b1.Companion, "application/json", json);
            case 3:
                bh3.a jsonProvider = new bh3.a(fe0.d.a(), 1);
                Intrinsics.checkNotNullParameter(jsonProvider, "jsonProvider");
                o oVar = jsonProvider.f15224a;
                s.k(oVar);
                return oVar;
            case 4:
                return new ne0.d();
            case 5:
                je0.d mapper = (je0.d) bVar.i.get();
                yk0.a databaseSessionProvider = bVar.f287503c.b();
                s.j(databaseSessionProvider);
                f storageFactory = aVar.f();
                s.j(storageFactory);
                tbd.b.Companion.getClass();
                Intrinsics.checkNotNullParameter(mapper, "mapper");
                Intrinsics.checkNotNullParameter(databaseSessionProvider, "databaseSessionProvider");
                Intrinsics.checkNotNullParameter(storageFactory, "storageFactory");
                return f.c(storageFactory, databaseSessionProvider, "savings_account_data_storage", mapper, 2, 16);
            case 6:
                Json json2 = (Json) bVar.e.get();
                me0.a factory = aVar.e();
                s.j(factory);
                Intrinsics.checkNotNullParameter(json2, "json");
                Intrinsics.checkNotNullParameter(factory, "factory");
                return factory.a(json2);
            case 7:
                return new com.revolut.feature.shared.savings.impl.core.error.c(fe0.c.a());
            default:
                throw new AssertionError(i);
        }
    }
}
