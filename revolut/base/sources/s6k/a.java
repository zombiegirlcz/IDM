package s6k;

import android.content.Context;
import androidx.room.Room;
import com.revolut.shared.feature.payments.money_request.domain.impl.data.database.MoneyRequestDatabase;
import com.revolut.shared.feature.payments.money_request.domain.impl.data.network.MoneyRequestService;
import cw9.d;
import e4m.e;
import g48.r0;
import he0.m;
import j6k.o;
import kg.p;
import kotlin.jvm.internal.Intrinsics;
import l6k.f;
import mri.w;
import ne0.j;
import r10.q;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import u6k.h;
import vc.s;
import wsg.n;
import y8l.l;
import z8l.f;
import z8l.g;

/* JADX INFO: loaded from: classes13.dex */
public final class a implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f260372a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f260373b;

    public a(b bVar, int i) {
        this.f260372a = bVar;
        this.f260373b = i;
    }

    @Override // phm.a
    public final Object get() {
        b bVar = this.f260372a;
        int i = this.f260373b;
        switch (i) {
            case 0:
                o oVar = (o) bVar.z.get();
                u71.a aVarG = ((c21.b) bVar.d).g();
                s.j(aVarG);
                n nVarB = bVar.f260379j.b();
                gte.a aVarB = bVar.k.b();
                s.j(aVarB);
                return new h(oVar, aVarG, nVarB, aVarB);
            case 1:
                d dVarA = bVar.f260374a.a();
                xmg.a aVar = bVar.f260375b;
                q qVar = new q(dVarA, aVar.d(), aVar.e());
                MoneyRequestService moneyRequestServiceE = bVar.e();
                l lVar = (l) bVar.f260388w.get();
                r0 r0VarC = bVar.f260377g.c();
                fl3.a aVarE = bVar.f260378h.e();
                s.j(aVarE);
                return new o(qVar, moneyRequestServiceE, lVar, r0VarC, new j6k.c(aVarE), (j) bVar.f260389x.get(), (ue0.c) bVar.f260390y.get());
            case 2:
                ik0.b factory = ((nj0.d) bVar.f260376c).m();
                s.j(factory);
                kg.o gson = ((c21.b) bVar.d).h();
                s.j(gson);
                f.Companion.getClass();
                Intrinsics.checkNotNullParameter(gson, "gson");
                p pVar = new p(gson);
                m mVarB = m.b(g.class, "type");
                mVarB.c(f.c.class, "INDIVIDUAL");
                mVarB.c(f.a.class, "BUSINESS");
                mVarB.c(z8l.d.class, "APM_CONTACT");
                mVarB.c(z8l.e.class, "BANK_BENEFICIARY");
                mVarB.c(f.b.class, "FALLBACK_SUBTYPE_LABEL");
                Intrinsics.checkNotNullExpressionValue(mVarB, "registerFallbackSubtype(...)");
                pVar.e.add(mVarB);
                kg.o gson2 = pVar.b();
                Intrinsics.checkNotNullExpressionValue(gson2, "create(...)");
                Intrinsics.checkNotNullParameter(gson2, "gson");
                GsonConverterFactory converterFactory = GsonConverterFactory.create(gson2);
                Intrinsics.checkNotNullExpressionValue(converterFactory, "create(...)");
                s.k(converterFactory);
                Intrinsics.checkNotNullParameter(factory, "factory");
                Intrinsics.checkNotNullParameter(converterFactory, "converterFactory");
                Retrofit retrofitA = ik0.b.a(factory, null, null, converterFactory, null, 27);
                s.k(retrofitA);
                return retrofitA;
            case 3:
                MoneyRequestDatabase database = (MoneyRequestDatabase) bVar.v.get();
                l6k.d.Companion.getClass();
                Intrinsics.checkNotNullParameter(database, "database");
                l lVarG = database.g();
                s.k(lVarG);
                return lVarG;
            case 4:
                Context context = bVar.e;
                yk0.a databaseSessionProvider = bVar.f.b();
                s.j(databaseSessionProvider);
                de0.a databaseEncryptionMigratorFactory = ((c21.b) bVar.d).b();
                l6k.d.Companion.getClass();
                Intrinsics.checkNotNullParameter(context, "context");
                Intrinsics.checkNotNullParameter(databaseSessionProvider, "databaseSessionProvider");
                Intrinsics.checkNotNullParameter(databaseEncryptionMigratorFactory, "databaseEncryptionMigratorFactory");
                MoneyRequestDatabase moneyRequestDatabase = (MoneyRequestDatabase) Room.databaseBuilder(context, MoneyRequestDatabase.class, "payments_money_request_db").fallbackToDestructiveMigration().build();
                s.k(moneyRequestDatabase);
                return moneyRequestDatabase;
            case 5:
                return new ne0.d();
            case 6:
                je0.d mapper = bVar.i.b();
                s.j(mapper);
                yk0.a databaseSessionProvider2 = bVar.f.b();
                s.j(databaseSessionProvider2);
                xe0.f storageFactory = bVar.i.f();
                s.j(storageFactory);
                l6k.b.Companion.getClass();
                Intrinsics.checkNotNullParameter(mapper, "mapper");
                Intrinsics.checkNotNullParameter(databaseSessionProvider2, "databaseSessionProvider");
                Intrinsics.checkNotNullParameter(storageFactory, "storageFactory");
                return xe0.f.f(storageFactory, databaseSessionProvider2, "money_requests", mapper, 1, null, 48);
            case 7:
                o oVar2 = (o) bVar.z.get();
                j6k.a aVar2 = (j6k.a) bVar.B.get();
                pz1.b bVar2 = (pz1.b) bVar.f260380l.f210571b.get();
                s.j(bVar2);
                n nVarB2 = bVar.f260379j.b();
                b90.a aVarA = bVar.f260381m.a();
                s.j(aVarA);
                w wVarA = ((ozl.a) bVar.f260382n).a();
                s.j(wVarA);
                return new u6k.c(oVar2, aVar2, bVar2, nVarB2, aVarA, wVarA, bVar.o.b());
            case 8:
                return new j6k.a(bVar.e(), (o) bVar.z.get());
            case 9:
                utf.a aVarA2 = bVar.f260383p.a();
                s.j(aVarA2);
                k61.a aVarE2 = bVar.f260384q.e();
                s.j(aVarE2);
                return new u6k.f(aVarA2, aVarE2);
            case 10:
                return new v6k.c(bVar.f260385r.g());
            case 11:
                wv9.c cVar = (wv9.c) bVar.E.get();
                thf.c cVarC = bVar.f260387t.c();
                s.j(cVarC);
                return new v6k.f(cVar, cVarC);
            default:
                throw new AssertionError(i);
        }
    }
}
