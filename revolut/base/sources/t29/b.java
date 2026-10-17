package t29;

import android.content.Context;
import com.revolut.feature.lifestyle.core.impl.database.LifestyleCoreDatabase;
import com.revolut.feature.lifestyle.core.impl.network.LifestyleHomeService;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.Json;
import retrofit2.Converter;

/* JADX INFO: loaded from: classes4.dex */
public final class b implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f267460a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f267461b;

    public b(c cVar, int i) {
        this.f267460a = cVar;
        this.f267461b = i;
    }

    @Override // phm.a
    public final Object get() {
        c cVar = this.f267460a;
        int i = this.f267461b;
        switch (i) {
            case 0:
                o29.n nVar = (o29.n) cVar.f267475t.get();
                y29.a aVar = (y29.a) cVar.u.get();
                nyb.k kVarC = cVar.e.c();
                vc.s.j(kVarC);
                o29.a aVar2 = (o29.a) cVar.f267476w.get();
                p19.a aVarA = ((o19.b) cVar.f).a();
                vc.s.j(aVarA);
                f39.c cVarA = cVar.f267465g.a();
                vc.s.j(cVarA);
                return new u29.m(nVar, aVar, kVarC, aVar2, aVarA, cVarA);
            case 1:
                LifestyleHomeService lifestyleHomeService = (LifestyleHomeService) cVar.f267472q.get();
                ne0.d dVar = new ne0.d();
                ue0.c cVar2 = (ue0.c) cVar.f267474s.get();
                w39.b bVarA = cVar.d.a();
                vc.s.j(bVarA);
                return new o29.u(lifestyleHomeService, dVar, cVar2, bVarA);
            case 2:
                ik0.b bVarM = ((nj0.d) cVar.f267462a).m();
                vc.s.j(bVarM);
                return n.a(bVarM, (Converter.Factory) cVar.f267471p.get());
            case 3:
                return q.a((Json) cVar.o.get());
            case 4:
                ee0.a aVar3 = cVar.f267463b;
                return sg8.j.h(new w29.b(fe0.d.a(), 0));
            case 5:
                je0.d mapper = (je0.d) cVar.f267473r.get();
                yk0.a databaseSecurityProvider = cVar.f267464c.b();
                vc.s.j(databaseSecurityProvider);
                xe0.f storageFactory = cVar.f267463b.f();
                vc.s.j(storageFactory);
                p.Companion.getClass();
                Intrinsics.checkNotNullParameter(mapper, "mapper");
                Intrinsics.checkNotNullParameter(databaseSecurityProvider, "databaseSecurityProvider");
                Intrinsics.checkNotNullParameter(storageFactory, "storageFactory");
                return xe0.f.f(storageFactory, databaseSecurityProvider, "lifestyle_home_feed", mapper, 2, zhm.u.c(f29.b.d), 32);
            case 6:
                Json json = (Json) cVar.o.get();
                me0.a factory = cVar.f267463b.e();
                vc.s.j(factory);
                Intrinsics.checkNotNullParameter(json, "json");
                Intrinsics.checkNotNullParameter(factory, "factory");
                return factory.a(json);
            case 7:
                eub.a aVarA2 = cVar.e.a();
                vc.s.j(aVarA2);
                return new y29.a(aVarA2);
            case 8:
                return new o29.a((ue0.c) cVar.v.get());
            case 9:
                je0.d mapper2 = cVar.f267463b.b();
                vc.s.j(mapper2);
                yk0.a databaseSessionProvider = cVar.f267464c.b();
                vc.s.j(databaseSessionProvider);
                xe0.f storageFactory2 = cVar.f267463b.f();
                vc.s.j(storageFactory2);
                p.Companion.getClass();
                Intrinsics.checkNotNullParameter(mapper2, "mapper");
                Intrinsics.checkNotNullParameter(databaseSessionProvider, "databaseSessionProvider");
                Intrinsics.checkNotNullParameter(storageFactory2, "storageFactory");
                return xe0.f.f(storageFactory2, databaseSessionProvider, "lifestyle_core", mapper2, 2, zhm.u.c(f29.a.d), 32);
            case 10:
                return new u29.p();
            case 11:
                u29.g gVarA = cVar.f267466h.a();
                vc.s.j(gVarA);
                eub.a aVarA3 = cVar.e.a();
                vc.s.j(aVarA3);
                return new u29.o(gVarA, aVarA3);
            case 12:
                return new u29.a();
            case 13:
                pre.c cVarA2 = cVar.f267467j.a();
                vc.s.j(cVarA2);
                return new v29.c(cVarA2);
            case 14:
                Context context = cVar.k;
                yk0.a databaseSessionProvider2 = cVar.f267464c.b();
                vc.s.j(databaseSessionProvider2);
                de0.a databaseEncryptionMigratorFactory = ((c21.b) cVar.f267468l).b();
                l.Companion.getClass();
                Intrinsics.checkNotNullParameter(context, "context");
                Intrinsics.checkNotNullParameter(databaseSessionProvider2, "databaseSessionProvider");
                Intrinsics.checkNotNullParameter(databaseEncryptionMigratorFactory, "databaseEncryptionMigratorFactory");
                LifestyleCoreDatabase.Companion companion = LifestyleCoreDatabase.INSTANCE;
                companion.getClass();
                LifestyleCoreDatabase lifestyleCoreDatabase = (LifestyleCoreDatabase) companion.a(context, databaseSessionProvider2, LifestyleCoreDatabase.f, databaseEncryptionMigratorFactory);
                vc.s.k(lifestyleCoreDatabase);
                return lifestyleCoreDatabase;
            case 15:
                sri.m mVar = (sri.m) cVar.C.get();
                u29.g gVarA2 = cVar.f267466h.a();
                vc.s.j(gVarA2);
                return new s29.g(mVar, gVarA2, cVar.f267470n.b());
            case 16:
                z70.a contextProvider = cVar.f267469m.f();
                vc.s.j(contextProvider);
                s29.h.Companion.getClass();
                Intrinsics.checkNotNullParameter(contextProvider, "contextProvider");
                return sri.o.c(contextProvider.getContext(), null, null, 14);
            case 17:
                sri.m mVar2 = (sri.m) cVar.C.get();
                u29.g gVarA3 = cVar.f267466h.a();
                vc.s.j(gVarA3);
                return new s29.b(mVar2, gVarA3);
            case 18:
                return new r29.g();
            default:
                throw new AssertionError(i);
        }
    }
}
