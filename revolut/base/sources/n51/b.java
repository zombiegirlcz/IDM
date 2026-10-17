package n51;

import a0b.g;
import at.r;
import c3d.d;
import com.revolut.feature.user_declarations.shared.flows.address_suggestion.screen.AddressSuggestionScreenContract$InputData;
import com.revolut.feature.user_declarations.shared.flows.pep.screens.pep_form.PepFormScreenContract$InputData;
import com.revolut.feature.user_declarations.shared.flows.pep.screens.persons_list.PersonsListScreenContract$InputData;
import com.revolut.shared.feature.move_money.impl.data.MoveMoneyService;
import dfb.i;
import e4m.e;
import h6i.o;
import iog.n;
import kotlin.jvm.internal.Intrinsics;
import nd.m;
import nng.l;
import nsf.p;
import nsf.u;
import oh3.f;
import vc.s;
import x9b.j;
import x9b.k;

/* JADX INFO: loaded from: classes20.dex */
public final class b implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f212530a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f212531b;

    public /* synthetic */ b(Object obj2, int i) {
        this.f212530a = i;
        this.f212531b = obj2;
    }

    @Override // phm.a
    public final Object get() {
        switch (this.f212530a) {
            case 0:
                c cVar = (c) this.f212531b;
                return new d(cVar.f212532a, cVar.f212533b, 19);
            case 1:
                n8l.a aVar = (n8l.a) this.f212531b;
                ik0.b retrofitFactory = ((nj0.d) aVar.f213514a).m();
                s.j(retrofitFactory);
                l8l.a moveMoneyNetworkConfiguration = aVar.f213515b;
                n8l.d.Companion.getClass();
                Intrinsics.checkNotNullParameter(retrofitFactory, "retrofitFactory");
                Intrinsics.checkNotNullParameter(moveMoneyNetworkConfiguration, "moveMoneyNetworkConfiguration");
                Object objCreate = ik0.b.a(retrofitFactory, null, moveMoneyNetworkConfiguration.getHostUrl(), null, null, 29).create(MoveMoneyService.class);
                Intrinsics.checkNotNullExpressionValue(objCreate, "create(...)");
                MoveMoneyService moveMoneyService = (MoveMoneyService) objCreate;
                s.k(moveMoneyService);
                return moveMoneyService;
            case 2:
                n8l.b bVar = (n8l.b) this.f212531b;
                return new c3d.a(bVar.f213517a, bVar.f213518b, bVar.f213519c, 15);
            case 3:
                return new j(new k(), ((n9b.c) this.f212531b).d.d(), new m(new np.a()));
            case 4:
                na3.a aVar2 = (na3.a) this.f212531b;
                return new d(aVar2.f213709a, aVar2.f213710b, 21);
            case 5:
                nab.a aVar3 = (nab.a) this.f212531b;
                return new ax4.c(aVar3.f213849a, aVar3.f213850b, aVar3.f213851c, aVar3.d, 14);
            case 6:
                naj.c cVar2 = (naj.c) this.f212531b;
                return new g(cVar2.f213920a, cVar2.f213921b, cVar2.f213922c, cVar2.d, cVar2.e, cVar2.f, cVar2.f213923g, 5);
            case 7:
                return new add.b(((nf0.b) this.f212531b).f214798a, 8);
            case 8:
                ng3.a aVar4 = (ng3.a) this.f212531b;
                return new g(aVar4.f215098a, aVar4.f215099b, aVar4.f215100c, aVar4.d, aVar4.e, aVar4.f, aVar4.f215101g, 6);
            case 9:
                ng3.b bVar2 = (ng3.b) this.f212531b;
                return new d(bVar2.f215103a, bVar2.f215104b, 22);
            case 10:
                ngi.a aVar5 = (ngi.a) this.f212531b;
                return new d(aVar5.f215173a, aVar5.f215174b, 23);
            case 11:
                ngl.a aVar6 = (ngl.a) this.f212531b;
                return new ajf.d(aVar6.f215227a, aVar6.f215228b, aVar6.f215229c, aVar6.d, aVar6.e, 18);
            case 12:
                nh3.a aVar7 = (nh3.a) this.f212531b;
                m2j.j jVarC = aVar7.f215368a.c();
                v7i.a aVar8 = aVar7.f215369b;
                w5i.c cVarC = aVar8.c();
                s.j(cVarC);
                u51.a aVarA = aVar7.f215370c.a();
                s.j(aVarA);
                o oVarH = aVar8.h();
                w5i.d dVarD = aVar8.d();
                s.j(dVarD);
                return new f(jVarC, cVarC, aVarA, oVarH, dVarD);
            case 13:
                nj0.e eVar = (nj0.e) this.f212531b;
                return new i(eVar.f216310a, eVar.f216311b, eVar.f216312c, eVar.d, eVar.e, eVar.f, eVar.f216313g, eVar.f216314h, eVar.i, eVar.f216315j, eVar.k, eVar.f216316l, eVar.f216317m, eVar.f216318n, eVar.o, eVar.f216319p);
            case 14:
                return new pj7.o(new r(new oj7.a(), new oj7.f(), new oj7.e(), new oj7.d(), new oj7.c()), ((nk7.i) this.f212531b).f216685a);
            case 15:
                nkg.a aVar9 = (nkg.a) this.f212531b;
                return new ap3.b(aVar9.f216809a, aVar9.f216810b, aVar9.f216811c, aVar9.d, aVar9.e, aVar9.f, aVar9.f216812g, 8);
            case 16:
                nng.b bVar3 = (nng.b) this.f212531b;
                AddressSuggestionScreenContract$InputData addressSuggestionScreenContract$InputData = bVar3.f217634a;
                uh1.a aVar10 = (uh1.a) ((yh1.e) bVar3.f217635b.i).f.get();
                s.j(aVar10);
                return new qng.k(addressSuggestionScreenContract$InputData, new qng.m(aVar10));
            case 17:
                return new com.revolut.feature.user_declarations.shared.flows.income.a(((nng.f) this.f212531b).f217644a);
            case 18:
                nng.k kVar = (nng.k) this.f212531b;
                PepFormScreenContract$InputData pepFormScreenContract$InputData = kVar.f217660a;
                return new com.revolut.feature.user_declarations.shared.flows.pep.screens.pep_form.b(pepFormScreenContract$InputData, new n(pepFormScreenContract$InputData), new i90.b(), new eog.d((f01.a) kVar.f217661b.k.get()));
            case 19:
                PersonsListScreenContract$InputData personsListScreenContract$InputData = ((l) this.f212531b).f217663a;
                return new com.revolut.feature.user_declarations.shared.flows.pep.screens.persons_list.b(personsListScreenContract$InputData, new kog.n(personsListScreenContract$InputData), new kog.a());
            case 20:
                npa.a aVar11 = (npa.a) this.f212531b;
                return new bo9.g(aVar11.f218169a, aVar11.f218170b, aVar11.f218171c, aVar11.d, aVar11.f, aVar11.f218172g, aVar11.f218173h, aVar11.e);
            case 21:
                t99.k kVarA = ((s99.a) ((nq6.a) this.f212531b).f218365a).a();
                s.j(kVarA);
                return new com.revolut.feature.foreign_currencies.impl.ui.flow.a(kVarA);
            case 22:
                sd5.c cVarA = ((nr5.a) this.f212531b).f218530a.a();
                s.j(cVarA);
                return new lr5.c(cVarA);
            case 23:
                return new n8j.a(((nr5.b) this.f212531b).f218532a, 4);
            case 24:
                return new gtf.c(new gtf.e(((nsf.a) this.f212531b).f218792a));
            case 25:
                return new btf.e(new btf.f(), ((p) this.f212531b).f218845b);
            case 26:
                return new btf.e(new btf.f(), ((p) this.f212531b).f218845b);
            case 27:
                gte.a aVarB = ((u) this.f212531b).f218860a.b();
                s.j(aVarB);
                return new ftf.c(aVarB);
            case 28:
                return new add.b(((nt2.b) this.f212531b).f218947a, 9);
            default:
                return new com.revolut.feature.apm.breb.impl.ui.qr_request.a(((nv1.p) this.f212531b).f219436a);
        }
    }

    public b(nng.p pVar, nng.k kVar) {
        this.f212530a = 18;
        this.f212531b = kVar;
    }
}
