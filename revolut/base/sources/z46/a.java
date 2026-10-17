package z46;

import android.content.Context;
import androidx.room.migration.Migration;
import com.revolut.feature.defi.rates.impl.data.DeFiRatesDatabase;
import com.revolut.feature.defi.rates.impl.data.network.DeFiRatesService;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import vc.s;

/* JADX INFO: loaded from: classes3.dex */
public final class a implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f319324a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f319325b;

    public a(b bVar, int i) {
        this.f319324a = bVar;
        this.f319325b = i;
    }

    @Override // phm.a
    public final Object get() {
        b bVar = this.f319324a;
        nj0.a aVar = bVar.f319326a;
        int i = this.f319325b;
        if (i == 0) {
            DeFiRatesService deFiRatesService = (DeFiRatesService) bVar.f.get();
            v46.a aVar2 = (v46.a) bVar.f319330h.get();
            CoroutineScope coroutineScopeA = bVar.e.a();
            s.j(coroutineScopeA);
            return new x46.b(deFiRatesService, aVar2, coroutineScopeA);
        }
        if (i == 1) {
            ek.a converterFactory = ((nj0.d) aVar).d();
            ik0.b factory = ((nj0.d) aVar).m();
            s.j(factory);
            f.Companion.getClass();
            Intrinsics.checkNotNullParameter(converterFactory, "converterFactory");
            Intrinsics.checkNotNullParameter(factory, "factory");
            Object objCreate = ik0.b.a(factory, null, null, converterFactory, null, 27).create(DeFiRatesService.class);
            Intrinsics.checkNotNullExpressionValue(objCreate, "create(...)");
            DeFiRatesService deFiRatesService2 = (DeFiRatesService) objCreate;
            s.k(deFiRatesService2);
            return deFiRatesService2;
        }
        if (i == 2) {
            DeFiRatesDatabase database = (DeFiRatesDatabase) bVar.f319329g.get();
            d.Companion.getClass();
            Intrinsics.checkNotNullParameter(database, "database");
            v46.a aVarG = database.g();
            s.k(aVarG);
            return aVarG;
        }
        if (i != 3) {
            throw new AssertionError(i);
        }
        Context context = bVar.f319327b;
        yk0.a databaseSessionProvider = bVar.f319328c.b();
        s.j(databaseSessionProvider);
        de0.a databaseEncryptionMigratorFactory = ((c21.b) bVar.d).b();
        d.Companion.getClass();
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(databaseSessionProvider, "databaseSessionProvider");
        Intrinsics.checkNotNullParameter(databaseEncryptionMigratorFactory, "databaseEncryptionMigratorFactory");
        DeFiRatesDatabase deFiRatesDatabase = (DeFiRatesDatabase) DeFiRatesDatabase.INSTANCE.a(context, databaseSessionProvider, new Migration[0], databaseEncryptionMigratorFactory);
        s.k(deFiRatesDatabase);
        return deFiRatesDatabase;
    }
}
