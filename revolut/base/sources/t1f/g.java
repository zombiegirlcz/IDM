package t1f;

import android.content.Context;
import androidx.room.migration.Migration;
import com.revolut.feature.trade_rev_points.impl.data.network.TradeRevPointsService;
import com.revolut.feature.trade_rev_points.impl.database.TradeRevPointsDatabase;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class g implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h f267295a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f267296b;

    public g(h hVar, int i) {
        this.f267295a = hVar;
        this.f267296b = i;
    }

    @Override // phm.a
    public final Object get() {
        h hVar = this.f267295a;
        nj0.a aVar = hVar.f267297a;
        an0.c cVar = hVar.f267299c;
        ee0.a aVar2 = hVar.f;
        int i = this.f267296b;
        switch (i) {
            case 0:
                return new k1f.d((TradeRevPointsService) hVar.v.get(), (ne0.j) hVar.f267311w.get(), (n1f.b) hVar.f267313y.get());
            case 1:
                ek.a converterFactory = ((nj0.d) aVar).d();
                ik0.b factory = ((nj0.d) aVar).m();
                vc.s.j(factory);
                Intrinsics.checkNotNullParameter(converterFactory, "converterFactory");
                Intrinsics.checkNotNullParameter(factory, "factory");
                Object objCreate = ik0.b.a(factory, null, null, converterFactory, null, 27).create(TradeRevPointsService.class);
                Intrinsics.checkNotNullExpressionValue(objCreate, "create(...)");
                TradeRevPointsService tradeRevPointsService = (TradeRevPointsService) objCreate;
                vc.s.k(tradeRevPointsService);
                return tradeRevPointsService;
            case 2:
                return new ne0.d();
            case 3:
                TradeRevPointsDatabase database = (TradeRevPointsDatabase) hVar.f267312x.get();
                r.Companion.getClass();
                Intrinsics.checkNotNullParameter(database, "database");
                n1f.b bVarG = database.g();
                vc.s.k(bVarG);
                return bVarG;
            case 4:
                Context context = hVar.f267298b;
                yk0.a databaseSessionProvider = cVar.b();
                vc.s.j(databaseSessionProvider);
                de0.a databaseEncryptionMigratorFactory = ((cl0.a) hVar.d).a();
                vc.s.j(databaseEncryptionMigratorFactory);
                r.Companion.getClass();
                Intrinsics.checkNotNullParameter(context, "context");
                Intrinsics.checkNotNullParameter(databaseSessionProvider, "databaseSessionProvider");
                Intrinsics.checkNotNullParameter(databaseEncryptionMigratorFactory, "databaseEncryptionMigratorFactory");
                TradeRevPointsDatabase tradeRevPointsDatabase = (TradeRevPointsDatabase) TradeRevPointsDatabase.INSTANCE.a(context, databaseSessionProvider, new Migration[]{o1f.a.f221383c, o1f.b.f221384c}, databaseEncryptionMigratorFactory);
                vc.s.k(tradeRevPointsDatabase);
                return tradeRevPointsDatabase;
            case 5:
                return new k1f.h((TradeRevPointsService) hVar.v.get(), (ne0.j) hVar.f267311w.get(), (n1f.d) hVar.A.get());
            case 6:
                TradeRevPointsDatabase database2 = (TradeRevPointsDatabase) hVar.f267312x.get();
                r.Companion.getClass();
                Intrinsics.checkNotNullParameter(database2, "database");
                n1f.d dVarH = database2.h();
                vc.s.k(dVarH);
                return dVarH;
            case 7:
                je0.d mapper = aVar2.b();
                vc.s.j(mapper);
                yk0.a databaseSessionProvider2 = cVar.b();
                vc.s.j(databaseSessionProvider2);
                xe0.f storageFactory = aVar2.f();
                vc.s.j(storageFactory);
                r.Companion.getClass();
                Intrinsics.checkNotNullParameter(mapper, "mapper");
                Intrinsics.checkNotNullParameter(databaseSessionProvider2, "databaseSessionProvider");
                Intrinsics.checkNotNullParameter(storageFactory, "storageFactory");
                return xe0.f.f(storageFactory, databaseSessionProvider2, "trade_rev_points", mapper, 1, null, 48);
            default:
                throw new AssertionError(i);
        }
    }
}
