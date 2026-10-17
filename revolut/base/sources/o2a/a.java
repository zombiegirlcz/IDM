package o2a;

import android.content.Context;
import com.revolut.feature.shared.network_authentication.impl.network.TokenService;
import com.revolut.feature_retail_user_declarations.employer.screen.EmployerControllerContract$InputData;
import com.revolut.feature_retail_user_declarations.transaction_countries.countries_selection.CountriesSelectionScreenContract$InputData;
import kbi.o;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.Json;
import o5k.i;
import o73.j;
import o73.k;
import oai.h0;
import oai.m;
import oai.p;
import oai.u;
import r73.g;
import retrofit2.Retrofit;
import t2a.h;
import tyc.l;
import ulm.b1;
import w2a.s;

/* JADX INFO: loaded from: classes5.dex */
public final class a implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f221596a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f221597b;

    public /* synthetic */ a(Object obj2, int i) {
        this.f221596a = i;
        this.f221597b = obj2;
    }

    @Override // phm.a
    public final Object get() {
        switch (this.f221596a) {
            case 0:
                return new p2a.a(((n2a.a) ((b) this.f221597b).f221598a).b());
            case 1:
                return new com.revolut.feature.payments.transfers.personalisation.impl.ui.flow.a(((c) this.f221597b).f221601a, new h());
            case 2:
                e eVar = (e) this.f221597b;
                o9i.a aVar = eVar.f221606a;
                o9i.b bVar = eVar.f221607b;
                o9i.c cVar = eVar.f221608c;
                Retrofit retrofit = ((nj0.d) eVar.d.f221599b).f();
                Intrinsics.checkNotNullParameter(retrofit, "retrofit");
                return new s(i.e(aVar, i.c(bVar, i.y(cVar, retrofit), new l9i.a(), new p9i.a())), new y2a.a(), new l(new x2a.a()));
            case 3:
                o41.d dVar = (o41.d) this.f221597b;
                return new o41.e(dVar.f221944a, dVar.f221945b, dVar.f221946c, dVar.d, dVar.e, dVar.f, dVar.f221947g, dVar.f221948h, dVar.i, dVar.f221949j, dVar.k, dVar.f221950l, dVar.f221951m, dVar.f221952n, dVar.o, dVar.f221953p, dVar.f221954q, dVar.f221955r, dVar.f221956s, dVar.f221957t, dVar.u, dVar.v, dVar.f221958w, dVar.f221959x, dVar.f221960y, dVar.z, dVar.A, dVar.B, dVar.C, dVar.D, dVar.E, dVar.F, dVar.G, dVar.H, dVar.I, dVar.J, dVar.K);
            case 4:
                return new com.revolut.feature.shared.branding.impl.ui.a(((o6d.c) this.f221597b).f222543a);
            case 5:
                return new h83.e(new h83.f(), ((o73.i) this.f221597b).f222695a);
            case 6:
                return new p73.e(new p73.f(((j) this.f221597b).f222697a));
            case 7:
                return new r73.e(new g(((k) this.f221597b).f222699a));
            case 8:
                o76.a aVar2 = (o76.a) this.f221597b;
                return new afh.f(aVar2.f222726a, aVar2.f222727b, aVar2.f222728c, aVar2.d, aVar2.e, aVar2.f, aVar2.f222729g, aVar2.f222730h, 3);
            case 9:
                return new n8j.a(((o7a.b) this.f221597b).f222733a, 7);
            case 10:
                return new n8j.a(((o8j.a) this.f221597b).f223037a, 0);
            case 11:
                oa3.a aVar3 = (oa3.a) this.f221597b;
                gte.a aVarB = aVar3.f223511a.b();
                vc.s.j(aVarB);
                l61.a aVarB2 = aVar3.f223512b.b();
                vc.s.j(aVarB2);
                return new pa3.c(aVarB, aVarB2);
            case 12:
                oa5.a aVar4 = (oa5.a) this.f221597b;
                return new ee6.f(aVar4.f223522a, aVar4.f223523b, aVar4.f223524c, aVar4.d, aVar4.e, aVar4.f, aVar4.f223525g, aVar4.f223526h, aVar4.i, 9);
            case 13:
                oad.c cVar2 = (oad.c) this.f221597b;
                return new bo9.d(cVar2.f223586a, cVar2.f223587b, cVar2.f223588c, cVar2.d, cVar2.e, cVar2.f);
            case 14:
                nj0.a coreNetworkApi = ((oad.d) this.f221597b).f223590a;
                oad.j.Companion.getClass();
                Intrinsics.checkNotNullParameter(coreNetworkApi, "coreNetworkApi");
                nj0.d dVar2 = (nj0.d) coreNetworkApi;
                Object objCreate = ik0.b.a(dVar2.m(), xj0.i.a(dVar2.l(), null, false, false, null, null, null, 255), null, null, null, 30).create(TokenService.class);
                Intrinsics.checkNotNullExpressionValue(objCreate, "create(...)");
                TokenService tokenService = (TokenService) objCreate;
                vc.s.k(tokenService);
                return tokenService;
            case 15:
                return new n8j.a(((oad.f) this.f221597b).f223592a, 8);
            case 16:
                oai.f fVar = (oai.f) this.f221597b;
                CountriesSelectionScreenContract$InputData countriesSelectionScreenContract$InputData = fVar.f223679a;
                return new com.revolut.feature_retail_user_declarations.transaction_countries.countries_selection.a(countriesSelectionScreenContract$InputData, new qci.j(countriesSelectionScreenContract$InputData, new qci.l(countriesSelectionScreenContract$InputData, new ntf.a((f01.a) fVar.f223680b.z.get(), 1), new qci.a(), new xci.b())));
            case 17:
                o oVar = new o();
                m mVar = (m) this.f221597b;
                EmployerControllerContract$InputData employerControllerContract$InputData = mVar.f223735a;
                jvh.a aVarA = mVar.f223736b.f.a();
                vc.s.j(aVarA);
                return new com.revolut.feature_retail_user_declarations.employer.screen.b(oVar, employerControllerContract$InputData, new jbi.h(aVarA, new jbi.i()));
            case 18:
                return new com.revolut.feature_retail_user_declarations.gender.a(((p) this.f221597b).f223753a, new mbi.l());
            case 19:
                return new com.revolut.feature_retail_user_declarations.occupation.flow.a(((u) this.f221597b).f223775a);
            case 20:
                return new vci.e(new vci.f(((h0) this.f221597b).f223694a, new xci.b()));
            case 21:
                oda.i iVar = (oda.i) this.f221597b;
                return new com.revolut.feature.pockets.impl.ui.add_new.d(iVar.f224363a, iVar.f224364b);
            case 22:
                Context context = ((of3.h) this.f221597b).f224720a;
                pf3.b.Companion.getClass();
                Intrinsics.checkNotNullParameter(context, "context");
                return sri.o.c(context, null, null, 14);
            case 23:
                of3.i iVar2 = (of3.i) this.f221597b;
                return new a16.b(iVar2.f224723a, iVar2.f224724b, 10);
            case 24:
                ofb.a aVar5 = (ofb.a) this.f221597b;
                return new c3d.d(aVar5.f224794a, aVar5.f224795b, 25);
            case 25:
                return new com.revolut.feature.transaction.troubleshooter.impl.ui.flow.a(((off.c) this.f221597b).f224822a);
            case 26:
                return new com.revolut.feature.add_card_to_google_pay_shared.impl.card_security.a(((og1.b) this.f221597b).f224958a);
            case 27:
                og1.k kVar = (og1.k) this.f221597b;
                return new ax4.c(kVar.f224988a, kVar.f224989b, kVar.d, kVar.f224990c);
            case 28:
                og1.l lVar = (og1.l) this.f221597b;
                return new bo9.d(lVar.f224991a, lVar.f224992b, lVar.f224993c, lVar.d, lVar.e, lVar.f, 11);
            default:
                ik0.b retrofitFactory = ((nj0.d) ((og3.f) this.f221597b).f225020a).m();
                vc.s.j(retrofitFactory);
                Json baseJson = fe0.d.a();
                og3.h.Companion.getClass();
                Intrinsics.checkNotNullParameter(retrofitFactory, "retrofitFactory");
                Intrinsics.checkNotNullParameter(baseJson, "baseJson");
                Retrofit retrofitA = ik0.b.a(retrofitFactory, null, null, p.a.g(b1.Companion, "application/json", baseJson), null, 27);
                vc.s.k(retrofitA);
                return retrofitA;
        }
    }
}
