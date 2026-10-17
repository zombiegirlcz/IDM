package ore;

import com.revolut.feature.terms.impl.network.TermsService;
import com.revolut.feature.terms.impl.network.UserDocumentsService;
import kotlin.jvm.internal.Intrinsics;
import ne0.j;
import retrofit2.Retrofit;
import sre.h;
import sre.i;
import sre.k;
import sri.m;
import vc.s;

/* JADX INFO: loaded from: classes13.dex */
public final class a implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f228114a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f228115b;

    public a(b bVar, int i) {
        this.f228114a = bVar;
        this.f228115b = i;
    }

    @Override // phm.a
    public final Object get() {
        b bVar = this.f228114a;
        int i = this.f228115b;
        switch (i) {
            case 0:
                return new pre.c((nre.a) bVar.f228122l.get());
            case 1:
                return new h((TermsService) bVar.i.get(), ((nj0.d) bVar.f228118c).o(), (j) bVar.f228121j.get(), (ue0.c) bVar.k.get());
            case 2:
                e eVar = bVar.f228116a;
                TermsService termsService = (TermsService) v0.a.f((c21.b) bVar.f228117b, "retrofit", TermsService.class, "create(...)");
                s.k(termsService);
                return termsService;
            case 3:
                return new ne0.d();
            case 4:
                e eVar2 = bVar.f228116a;
                ee0.a aVar = bVar.d;
                je0.d mapper = aVar.b();
                s.j(mapper);
                yk0.a databaseSessionProvider = bVar.e.b();
                s.j(databaseSessionProvider);
                xe0.f storageFactory = aVar.f();
                s.j(storageFactory);
                Intrinsics.checkNotNullParameter(mapper, "mapper");
                Intrinsics.checkNotNullParameter(databaseSessionProvider, "databaseSessionProvider");
                Intrinsics.checkNotNullParameter(storageFactory, "storageFactory");
                return xe0.f.f(storageFactory, databaseSessionProvider, "terms", mapper, 1, null, 48);
            case 5:
                return new rre.d((pre.c) bVar.f228123m.get());
            case 6:
                return new rre.c((mre.c) bVar.f228124n.get(), (m) bVar.o.get());
            case 7:
                return olc.c.p(bVar.f228116a, bVar.f);
            case 8:
                return new g();
            case 9:
                e eVar3 = bVar.f228116a;
                ee0.a aVar2 = bVar.d;
                je0.d dVarD = aVar2.d();
                s.j(dVarD);
                yk0.a aVarB = bVar.e.b();
                s.j(aVarB);
                xe0.f fVarF = aVar2.f();
                s.j(fVarF);
                return olc.c.A(eVar3, dVarD, aVarB, fVarF);
            case 10:
                return new pre.d((i) bVar.f228129t.get());
            case 11:
                return new k((UserDocumentsService) bVar.f228128s.get(), (ue0.c) bVar.f228127r.get(), (j) bVar.f228121j.get());
            case 12:
                e eVar4 = bVar.f228116a;
                Retrofit retrofitE = ((c21.b) bVar.f228117b).e();
                s.j(retrofitE);
                return f.a(eVar4, retrofitE, ((nj0.d) bVar.f228118c).d());
            default:
                throw new AssertionError(i);
        }
    }
}
