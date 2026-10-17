package l36;

import android.content.Context;
import androidx.room.migration.Migration;
import com.revolut.feature.defi.currency.impl.data.database.DeFiCurrencyDatabase;
import com.revolut.feature.defi.currency.impl.data.network.DeFiCurrencyService;
import kotlin.jvm.internal.Intrinsics;
import ne0.j;
import vc.s;
import zhm.f0;

/* JADX INFO: loaded from: classes3.dex */
public final class a implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f191857a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f191858b;

    public a(b bVar, int i) {
        this.f191857a = bVar;
        this.f191858b = i;
    }

    @Override // phm.a
    public final Object get() {
        b bVar = this.f191857a;
        nj0.a aVar = bVar.f191859a;
        ee0.a aVar2 = bVar.f191860b;
        int i = this.f191858b;
        if (i == 0) {
            return new j36.e((DeFiCurrencyService) bVar.f.get(), (ue0.c) bVar.f191862g.get(), (j) bVar.f191863h.get(), e4m.b.a(bVar.f191864j));
        }
        if (i == 1) {
            ek.a converterFactory = ((nj0.d) aVar).d();
            ik0.b retrofitFactory = ((nj0.d) aVar).m();
            s.j(retrofitFactory);
            f.Companion.getClass();
            Intrinsics.checkNotNullParameter(converterFactory, "converterFactory");
            Intrinsics.checkNotNullParameter(retrofitFactory, "retrofitFactory");
            Object objCreate = ik0.b.a(retrofitFactory, null, null, converterFactory, null, 27).create(DeFiCurrencyService.class);
            Intrinsics.checkNotNullExpressionValue(objCreate, "create(...)");
            DeFiCurrencyService deFiCurrencyService = (DeFiCurrencyService) objCreate;
            s.k(deFiCurrencyService);
            return deFiCurrencyService;
        }
        if (i == 2) {
            je0.d mapper = aVar2.d();
            s.j(mapper);
            xe0.f storageFactory = aVar2.f();
            s.j(storageFactory);
            d.Companion.getClass();
            Intrinsics.checkNotNullParameter(mapper, "mapper");
            Intrinsics.checkNotNullParameter(storageFactory, "storageFactory");
            return storageFactory.d(1, "defi_currency_storage", f0.f322471a, mapper);
        }
        if (i == 3) {
            d.Companion.getClass();
            return new ne0.d();
        }
        if (i == 4) {
            DeFiCurrencyDatabase database = (DeFiCurrencyDatabase) bVar.i.get();
            d.Companion.getClass();
            Intrinsics.checkNotNullParameter(database, "database");
            g36.b bVarG = database.g();
            s.k(bVarG);
            return bVarG;
        }
        if (i != 5) {
            throw new AssertionError(i);
        }
        Context context = bVar.f191861c;
        yk0.a databaseSessionProvider = bVar.d.b();
        s.j(databaseSessionProvider);
        de0.a databaseEncryptionMigratorFactory = ((c21.b) bVar.e).b();
        d.Companion.getClass();
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(databaseSessionProvider, "databaseSessionProvider");
        Intrinsics.checkNotNullParameter(databaseEncryptionMigratorFactory, "databaseEncryptionMigratorFactory");
        DeFiCurrencyDatabase deFiCurrencyDatabase = (DeFiCurrencyDatabase) DeFiCurrencyDatabase.INSTANCE.a(context, databaseSessionProvider, new Migration[0], databaseEncryptionMigratorFactory);
        s.k(deFiCurrencyDatabase);
        return deFiCurrencyDatabase;
    }
}
