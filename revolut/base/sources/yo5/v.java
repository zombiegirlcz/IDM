package yo5;

import android.content.Context;
import androidx.room.migration.Migration;
import az0.l1;
import com.google.common.collect.ImmutableSet;
import com.revolut.feature.crypto.withdraw.impl.database.CryptoWithdrawDatabase;
import com.revolut.feature.crypto.withdraw.impl.network.CryptoWithdrawService;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import retrofit2.Converter;

/* JADX INFO: loaded from: classes13.dex */
public final class v implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w f315587a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f315588b;

    public v(w wVar, int i) {
        this.f315587a = wVar;
        this.f315588b = i;
    }

    @Override // phm.a
    public final Object get() {
        w wVar = this.f315587a;
        int i = this.f315588b;
        switch (i) {
            case 0:
                return new ap5.b((no5.b) wVar.z.get(), (po5.a) wVar.A.get(), wVar.f315595l.b());
            case 1:
                e4m.e eVar = wVar.f315601s;
                ak5.a aVar = wVar.f;
                CryptoWithdrawService cryptoWithdrawService = (CryptoWithdrawService) eVar.get();
                ne0.j jVar = (ne0.j) wVar.f315602t.get();
                ne0.j jVar2 = (ne0.j) wVar.u.get();
                ne0.j jVar3 = (ne0.j) wVar.v.get();
                ro5.d dVar = (ro5.d) wVar.f315604x.get();
                ue0.c cVar = (ue0.c) wVar.f315605y.get();
                ik5.f fVar = (ik5.f) ((ak5.i) aVar).f5696m.get();
                vc.s.j(fVar);
                CoroutineScope coroutineScopeA = wVar.f315592g.a();
                vc.s.j(coroutineScopeA);
                f01.c cVarG = wVar.f315593h.g();
                l80.e eVarH = wVar.i.h();
                vc.s.j(eVarH);
                ik5.d dVarC = ((ak5.i) aVar).c();
                vc.s.j(dVarC);
                return new hp5.o(cryptoWithdrawService, jVar, jVar2, jVar3, dVar, cVar, fVar, coroutineScopeA, cVarG, eVarH, dVarC);
            case 2:
                ik0.b bVarM = ((nj0.d) wVar.f315589a).m();
                vc.s.j(bVarM);
                return l.a(bVarM, (Converter.Factory) wVar.f315600r.get());
            case 3:
                ee0.a aVar2 = wVar.f315590b;
                return i.a(fe0.d.a());
            case 4:
                return new ne0.d();
            case 5:
                m.Companion.getClass();
                return new ne0.n(TimeUnit.MINUTES.toMillis(15L), Integer.MAX_VALUE);
            case 6:
                return n.a();
            case 7:
                CryptoWithdrawDatabase database = (CryptoWithdrawDatabase) wVar.f315603w.get();
                d.Companion.getClass();
                Intrinsics.checkNotNullParameter(database, "database");
                ro5.d dVarG = database.g();
                vc.s.k(dVarG);
                return dVarG;
            case 8:
                Context context = wVar.f315591c;
                yk0.a databaseSessionProvider = wVar.d.b();
                vc.s.j(databaseSessionProvider);
                de0.a databaseEncryptionMigratorFactory = ((c21.b) wVar.e).b();
                ImmutableSet typeConverters = ImmutableSet.of((to5.d) new to5.a(fe0.d.a()), (to5.d) new to5.b(fe0.d.a()), (to5.d) new to5.c(fe0.d.a()), new to5.d(fe0.d.a()));
                d.Companion.getClass();
                Intrinsics.checkNotNullParameter(context, "context");
                Intrinsics.checkNotNullParameter(databaseSessionProvider, "databaseSessionProvider");
                Intrinsics.checkNotNullParameter(databaseEncryptionMigratorFactory, "databaseEncryptionMigratorFactory");
                Intrinsics.checkNotNullParameter(typeConverters, "typeConverters");
                CryptoWithdrawDatabase.Companion companion = CryptoWithdrawDatabase.INSTANCE;
                Migration[] migrations = {so5.c.f264778c, so5.d.f264779c, so5.e.f264780c, so5.f.f264781c, so5.g.f264782c, so5.h.f264783c, so5.i.f264784c, so5.j.f264785c, so5.k.f264786c, so5.a.f264776c, so5.b.f264777c};
                companion.getClass();
                Intrinsics.checkNotNullParameter(context, "context");
                Intrinsics.checkNotNullParameter(databaseSessionProvider, "databaseSessionProvider");
                Intrinsics.checkNotNullParameter(databaseEncryptionMigratorFactory, "databaseEncryptionMigratorFactory");
                Intrinsics.checkNotNullParameter(migrations, "migrations");
                Intrinsics.checkNotNullParameter(typeConverters, "typeConverters");
                CryptoWithdrawDatabase cryptoWithdrawDatabase = (CryptoWithdrawDatabase) ce0.a.b(new l1(context, migrations, databaseEncryptionMigratorFactory, databaseSessionProvider, typeConverters, 7));
                vc.s.k(cryptoWithdrawDatabase);
                return cryptoWithdrawDatabase;
            case 9:
                je0.d dVarD = wVar.f315590b.d();
                vc.s.j(dVarD);
                yk0.a aVarB = wVar.d.b();
                vc.s.j(aVarB);
                xe0.f fVarF = wVar.f315590b.f();
                vc.s.j(fVarF);
                return yf6.b.i(dVarD, fVarF, aVarB);
            case 10:
                sd5.c cVarA = wVar.f315594j.a();
                vc.s.j(cVarA);
                return new po5.a(cVarA, wVar.k.a());
            case 11:
                return new ap5.f((ue0.c) wVar.f315605y.get());
            case 12:
                sri.m mVar = (sri.m) wVar.D.get();
                po5.a aVar3 = (po5.a) wVar.A.get();
                xoj.a aVarA = wVar.f315596m.a();
                vc.s.j(aVarA);
                lo5.p pVar = (lo5.p) wVar.E.get();
                ai5.b bVarB = wVar.o.b();
                vc.s.j(bVarB);
                return new wo5.h(mVar, aVar3, aVarA, pVar, bVarB);
            case 13:
                return yf6.b.n(wVar.f315591c);
            case 14:
                po5.a aVar4 = (po5.a) wVar.A.get();
                zja.a aVarA2 = ((ika.b) wVar.f315597n).a();
                vc.s.j(aVarA2);
                ap5.b bVar = (ap5.b) wVar.B.get();
                uj5.b bVarE = ((ak5.i) wVar.f).e();
                vc.s.j(bVarE);
                return new fp5.f(aVar4, aVarA2, bVar, bVarE);
            case 15:
                return new bp5.b();
            case 16:
                ik5.d dVarC2 = ((ak5.i) wVar.f).c();
                vc.s.j(dVarC2);
                return new bp5.e(dVarC2);
            case 17:
                return new gp5.a(new gp5.b(), new gp5.c());
            case 18:
                return new op5.e();
            case 19:
                return new np5.a((ap5.b) wVar.B.get());
            case 20:
                return new fp5.g();
            default:
                throw new AssertionError(i);
        }
    }
}
