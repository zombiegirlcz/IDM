package mj8;

import com.revolut.feature.junior_profile.impl.services.JuniorProfileService;
import com.revolut.feature.junior_profile.impl.services.JuniorWorkflowBasedProfileService;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import vc.s;
import zhm.v;

/* JADX INFO: loaded from: classes13.dex */
public final class a implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f205941a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f205942b;

    public a(b bVar, int i) {
        this.f205941a = bVar;
        this.f205942b = i;
    }

    @Override // phm.a
    public final Object get() {
        b bVar = this.f205941a;
        xmg.a aVar = bVar.f205943a;
        an0.c cVar = bVar.e;
        nj0.a aVar2 = bVar.f205945c;
        ee0.a aVar3 = bVar.d;
        int i = this.f205942b;
        switch (i) {
            case 0:
                return new nj8.n(aVar.e(), (qj8.b) bVar.f205949l.get(), bVar.f205946g.a(), aVar.d());
            case 1:
                JuniorProfileService juniorProfileService = (JuniorProfileService) bVar.i.get();
                ne0.j jVar = (ne0.j) bVar.f205948j.get();
                ue0.c cVar2 = (ue0.c) bVar.k.get();
                CoroutineScope coroutineScopeA = bVar.f.a();
                s.j(coroutineScopeA);
                ze0.a aVarA = aVar3.a();
                s.j(aVarA);
                return new qj8.j(juniorProfileService, jVar, cVar2, coroutineScopeA, aVarA);
            case 2:
                ik0.b retrofitFactory = ((nj0.d) aVar2).m();
                s.j(retrofitFactory);
                ek.a converterFactory = ((nj0.d) aVar2).d();
                Intrinsics.checkNotNullParameter(retrofitFactory, "retrofitFactory");
                Intrinsics.checkNotNullParameter(converterFactory, "converterFactory");
                Object objCreate = ik0.b.a(retrofitFactory, null, null, converterFactory, null, 27).create(JuniorProfileService.class);
                Intrinsics.checkNotNullExpressionValue(objCreate, "create(...)");
                JuniorProfileService juniorProfileService2 = (JuniorProfileService) objCreate;
                s.k(juniorProfileService2);
                return juniorProfileService2;
            case 3:
                return new ne0.d();
            case 4:
                je0.d mapper = aVar3.d();
                s.j(mapper);
                yk0.a databaseSessionProvider = cVar.b();
                s.j(databaseSessionProvider);
                xe0.f storageFactory = aVar3.f();
                s.j(storageFactory);
                m.Companion.getClass();
                Intrinsics.checkNotNullParameter(mapper, "mapper");
                Intrinsics.checkNotNullParameter(databaseSessionProvider, "databaseSessionProvider");
                Intrinsics.checkNotNullParameter(storageFactory, "storageFactory");
                return xe0.f.f(storageFactory, databaseSessionProvider, "junior_profiles", mapper, 9, v.k(new rj8.a(), new rj8.b(), new exa.a(3, 4, 5), new exa.a(4, 5, 5), new exa.a(5, 6, 5), new exa.a(6, 7, 5), new exa.a(7, 8, 5), new exa.a(8, 9, 5)), 32);
            case 5:
                return new qj8.l((JuniorWorkflowBasedProfileService) bVar.f205951n.get(), (ne0.j) bVar.f205948j.get(), (ue0.c) bVar.o.get());
            case 6:
                j jVar2 = bVar.f205944b;
                ik0.b bVarM = ((nj0.d) aVar2).m();
                s.j(bVarM);
                return k.a(jVar2, bVarM, ((nj0.d) aVar2).d());
            case 7:
                yk0.a aVarB = cVar.b();
                s.j(aVarB);
                je0.d dVarD = aVar3.d();
                s.j(dVarD);
                xe0.f fVarF = aVar3.f();
                s.j(fVarF);
                return n.g(dVarD, fVarF, aVarB);
            default:
                throw new AssertionError(i);
        }
    }
}
