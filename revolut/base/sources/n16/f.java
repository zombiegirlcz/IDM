package n16;

import android.content.Context;
import androidx.room.migration.Migration;
import com.revolut.feature.defi.accounts.impl.data.DeFiAccountsDatabase;
import com.revolut.feature.defi.accounts.impl.data.network.DeFiAccountsService;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import vc.s;

/* JADX INFO: loaded from: classes3.dex */
public final class f implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g f211271a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f211272b;

    public f(g gVar, int i) {
        this.f211271a = gVar;
        this.f211272b = i;
    }

    @Override // phm.a
    public final Object get() {
        g gVar = this.f211271a;
        nj0.a aVar = gVar.f211273a;
        int i = this.f211272b;
        if (i == 0) {
            DeFiAccountsService deFiAccountsService = (DeFiAccountsService) gVar.f211277h.get();
            ne0.d dVar = new ne0.d();
            h16.a aVar2 = (h16.a) gVar.f211278j.get();
            CoroutineScope coroutineScopeA = gVar.e.a();
            s.j(coroutineScopeA);
            return new l16.e(deFiAccountsService, dVar, aVar2, coroutineScopeA);
        }
        if (i == 1) {
            ek.a converterFactory = ((nj0.d) aVar).d();
            ik0.b factory = ((nj0.d) aVar).m();
            s.j(factory);
            l.Companion.getClass();
            Intrinsics.checkNotNullParameter(converterFactory, "converterFactory");
            Intrinsics.checkNotNullParameter(factory, "factory");
            Object objCreate = ik0.b.a(factory, null, null, converterFactory, null, 27).create(DeFiAccountsService.class);
            Intrinsics.checkNotNullExpressionValue(objCreate, "create(...)");
            DeFiAccountsService deFiAccountsService2 = (DeFiAccountsService) objCreate;
            s.k(deFiAccountsService2);
            return deFiAccountsService2;
        }
        if (i == 2) {
            DeFiAccountsDatabase database = (DeFiAccountsDatabase) gVar.i.get();
            j.Companion.getClass();
            Intrinsics.checkNotNullParameter(database, "database");
            h16.a aVarG = database.g();
            s.k(aVarG);
            return aVarG;
        }
        if (i != 3) {
            throw new AssertionError(i);
        }
        Context context = gVar.f211274b;
        yk0.a databaseSessionProvider = gVar.f211275c.b();
        s.j(databaseSessionProvider);
        de0.a databaseEncryptionMigratorFactory = ((c21.b) gVar.d).b();
        j.Companion.getClass();
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(databaseSessionProvider, "databaseSessionProvider");
        Intrinsics.checkNotNullParameter(databaseEncryptionMigratorFactory, "databaseEncryptionMigratorFactory");
        DeFiAccountsDatabase deFiAccountsDatabase = (DeFiAccountsDatabase) DeFiAccountsDatabase.INSTANCE.a(context, databaseSessionProvider, new Migration[0], databaseEncryptionMigratorFactory);
        s.k(deFiAccountsDatabase);
        return deFiAccountsDatabase;
    }
}
