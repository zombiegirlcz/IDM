package ctj;

import ce0.h;
import com.google.common.collect.ImmutableSet;
import com.revolut.retail.feature.impl.AnalyticsDatabase;
import com.revolut.retail.feature.impl.income_sorter.network.IncomeSorterService;
import dqj.p;
import etj.o;
import jtj.k;
import jtj.l;
import jtj.n;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.Json;
import retrofit2.Converter;
import vc.s;
import xe0.f;

/* JADX INFO: loaded from: classes11.dex */
public final class a implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f108662a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f108663b;

    public a(b bVar, int i) {
        this.f108662a = bVar;
        this.f108663b = i;
    }

    @Override // phm.a
    public final Object get() {
        b bVar = this.f108662a;
        int i = this.f108663b;
        switch (i) {
            case 0:
                je0.d mapper = (je0.d) bVar.f108670l.get();
                yk0.a databaseSessionProvider = bVar.f108665b.b();
                s.j(databaseSessionProvider);
                f storageFactory = bVar.f108664a.f();
                s.j(storageFactory);
                d.Companion.getClass();
                Intrinsics.checkNotNullParameter(mapper, "mapper");
                Intrinsics.checkNotNullParameter(databaseSessionProvider, "databaseSessionProvider");
                Intrinsics.checkNotNullParameter(storageFactory, "storageFactory");
                return f.f(storageFactory, databaseSessionProvider, "income_sorter", mapper, 1, null, 48);
            case 1:
                Json json = (Json) bVar.k.get();
                me0.a aVarE = bVar.f108664a.e();
                s.j(aVarE);
                return dqj.d.s(json, aVarE);
            case 2:
                ee0.a aVar = bVar.f108664a;
                Json baseJson = fe0.d.a();
                Intrinsics.checkNotNullParameter(baseJson, "baseJson");
                return baseJson;
            case 3:
                z70.a aVarF = bVar.d.f();
                s.j(aVarF);
                yk0.a aVarB = bVar.f108665b.b();
                s.j(aVarB);
                return dqj.d.k(aVarF, aVarB, ((c21.b) bVar.e).b(), ImmutableSet.of((qsj.c) new xsj.a((Json) bVar.k.get()), (qsj.c) new xsj.d((Json) bVar.k.get()), (qsj.c) new xsj.b((Json) bVar.k.get()), (qsj.c) new xsj.c((Json) bVar.k.get()), (qsj.c) new rvj.a((Json) bVar.k.get()), new qsj.c((Json) bVar.k.get()), (qsj.c[]) new h[]{new qsj.a((Json) bVar.k.get()), new qsj.b((Json) bVar.k.get())}));
            case 4:
                z70.a aVarF2 = bVar.d.f();
                s.j(aVarF2);
                yk0.a aVarB2 = bVar.f108665b.b();
                s.j(aVarB2);
                return dqj.d.d(aVarF2, aVarB2, ((c21.b) bVar.e).b(), new sqj.a((Json) bVar.k.get()));
            case 5:
                return new o((l) bVar.f108676s.get(), (jtj.a) bVar.u.get(), bVar.f108667g.b(), bVar.f108668h.e(), bVar.i.a(), bVar.f108669j.f());
            case 6:
                return new n((wsj.e) bVar.f108673p.get(), new ne0.d(), (IncomeSorterService) bVar.f108675r.get());
            case 7:
                AnalyticsDatabase db8 = (AnalyticsDatabase) bVar.f108672n.get();
                dqj.o.Companion.getClass();
                Intrinsics.checkNotNullParameter(db8, "db");
                wsj.e eVarK = db8.k();
                s.k(eVarK);
                return eVarK;
            case 8:
                ik0.b retrofitFactory = ((nj0.d) bVar.f).m();
                s.j(retrofitFactory);
                Converter.Factory converterFactory = (Converter.Factory) bVar.f108674q.get();
                d.Companion.getClass();
                Intrinsics.checkNotNullParameter(retrofitFactory, "retrofitFactory");
                Intrinsics.checkNotNullParameter(converterFactory, "converterFactory");
                Object objCreate = ik0.b.a(retrofitFactory, null, null, converterFactory, null, 27).create(IncomeSorterService.class);
                Intrinsics.checkNotNullExpressionValue(objCreate, "create(...)");
                IncomeSorterService incomeSorterService = (IncomeSorterService) objCreate;
                s.k(incomeSorterService);
                return incomeSorterService;
            case 9:
                return p.a((Json) bVar.k.get());
            case 10:
                ue0.c cVar = (ue0.c) bVar.f108671m.get();
                wsj.a aVar2 = (wsj.a) bVar.f108677t.get();
                ne0.d dVar = new ne0.d();
                IncomeSorterService incomeSorterService2 = (IncomeSorterService) bVar.f108675r.get();
                l80.e eVarH = bVar.d.h();
                s.j(eVarH);
                return new k(cVar, aVar2, dVar, incomeSorterService2, eVarH);
            case 11:
                AnalyticsDatabase db10 = (AnalyticsDatabase) bVar.f108672n.get();
                dqj.o.Companion.getClass();
                Intrinsics.checkNotNullParameter(db10, "db");
                wsj.a aVarJ = db10.j();
                s.k(aVarJ);
                return aVarJ;
            default:
                throw new AssertionError(i);
        }
    }
}
