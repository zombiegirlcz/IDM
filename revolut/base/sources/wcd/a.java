package wcd;

import com.revolut.feature.shared.savings.request.impl.data.network.SavingsRequestService;
import e4m.e;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.Json;
import ne0.j;
import vc.s;
import xe0.f;

/* JADX INFO: loaded from: classes7.dex */
public final class a implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f296404a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f296405b;

    public a(b bVar, int i) {
        this.f296404a = bVar;
        this.f296405b = i;
    }

    @Override // phm.a
    public final Object get() {
        b bVar = this.f296404a;
        ee0.a aVar = bVar.f296406a;
        nj0.a aVar2 = bVar.f296408c;
        int i = this.f296405b;
        if (i == 0) {
            Json json = fe0.d.a();
            me0.a factory = aVar.e();
            s.j(factory);
            yk0.a databaseSessionProvider = bVar.f296407b.b();
            s.j(databaseSessionProvider);
            f storageFactory = aVar.f();
            s.j(storageFactory);
            d.Companion.getClass();
            Intrinsics.checkNotNullParameter(json, "json");
            Intrinsics.checkNotNullParameter(factory, "factory");
            Intrinsics.checkNotNullParameter(databaseSessionProvider, "databaseSessionProvider");
            Intrinsics.checkNotNullParameter(storageFactory, "storageFactory");
            return f.f(storageFactory, databaseSessionProvider, "savings_request_storage", factory.a(json), 1, null, 48);
        }
        if (i == 1) {
            return new ne0.d();
        }
        if (i == 2) {
            return new xcd.a((ucd.b) bVar.f296410h.get());
        }
        if (i == 3) {
            return new ucd.b((SavingsRequestService) bVar.f296409g.get(), (j) bVar.f.get(), (ue0.c) bVar.e.get());
        }
        if (i != 4) {
            throw new AssertionError(i);
        }
        ik0.b retrofitFactory = ((nj0.d) aVar2).m();
        s.j(retrofitFactory);
        ycd.a savingsRequestNetworkConfiguration = bVar.d.f3324a;
        ek.a converterFactory = ((nj0.d) aVar2).d();
        d.Companion.getClass();
        Intrinsics.checkNotNullParameter(retrofitFactory, "retrofitFactory");
        Intrinsics.checkNotNullParameter(savingsRequestNetworkConfiguration, "savingsRequestNetworkConfiguration");
        Intrinsics.checkNotNullParameter(converterFactory, "converterFactory");
        Object objCreate = ik0.b.a(retrofitFactory, null, savingsRequestNetworkConfiguration.getHostUrl(), converterFactory, null, 25).create(SavingsRequestService.class);
        Intrinsics.checkNotNullExpressionValue(objCreate, "create(...)");
        SavingsRequestService savingsRequestService = (SavingsRequestService) objCreate;
        s.k(savingsRequestService);
        return savingsRequestService;
    }
}
