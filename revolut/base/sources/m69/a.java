package m69;

import a2d.m;
import af5.f;
import anb.c0;
import android.view.View;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.sso.impl.ui.revolut_id.documents.document_photo.DocumentPhotoScreenContract$InputData;
import e4m.e;
import epl.h;
import epl.k;
import kotlin.jvm.internal.Intrinsics;
import lpl.j;
import mb3.p;
import mjl.d;
import mjl.i;
import mkh.r;
import mn8.o;
import nb3.c;
import retrofit2.Retrofit;
import rp0.g1;
import rp0.x0;
import rpl.l;
import t70.g;
import vc.s;

/* JADX INFO: loaded from: classes4.dex */
public final class a implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f203033a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f203034b;

    public /* synthetic */ a(Object obj2, int i) {
        this.f203033a = i;
        this.f203034b = obj2;
    }

    @Override // phm.a
    public final Object get() {
        switch (this.f203033a) {
            case 0:
                b bVar = (b) this.f203034b;
                return new a16.b(bVar.f203035a, bVar.f203036b, 9);
            case 1:
                return new add.b(((m6h.b) this.f203034b).f203120a, 7);
            case 2:
                m9b.a aVar = (m9b.a) this.f203034b;
                return new f(aVar.f203677a, aVar.f203678b, aVar.f203679c, aVar.d, aVar.e, aVar.f, aVar.f203680g, aVar.f203681h, aVar.i, aVar.f203682j, 5);
            case 3:
                p pVar = (p) this.f203034b;
                dj3.a aVarA = pVar.f204091a.a();
                s.j(aVarA);
                return new com.revolut.feature.cash_topup.impl.ui.flow.map.a(aVarA, pVar.f204092b.a(), new c());
            case 4:
                mh3.a aVar2 = (mh3.a) this.f203034b;
                return new m(aVar2.f205376a, aVar2.f205377b, aVar2.f205378c, 18);
            case 5:
                mh5.a aVar3 = (mh5.a) this.f203034b;
                return new c0(aVar3.f205416a, aVar3.f205417b, aVar3.f205418c, aVar3.d, 19);
            case 6:
                return new n8j.a(((mh5.b) this.f203034b).f205419a, 1);
            case 7:
                return new h(new k(((d) this.f203034b).f206074a));
            case 8:
                return new hpl.c(new hpl.d(((mjl.e) this.f203034b).f206076a));
            case 9:
                ViewController controller = ((mjl.f) this.f203034b).f206079b;
                npl.b.Companion.getClass();
                Intrinsics.checkNotNullParameter(controller, "controller");
                x0 x0Var = g1.Companion;
                View decorView = controller.m2().getWindow().getDecorView();
                Intrinsics.checkNotNullExpressionValue(decorView, "getDecorView(...)");
                return x0.a(x0Var, decorView);
            case 10:
                return new lpl.h(new j(((mjl.h) this.f203034b).f206083a));
            case 11:
                i iVar = (i) this.f203034b;
                DocumentPhotoScreenContract$InputData documentPhotoScreenContract$InputData = iVar.f206085a;
                l lVar = new l();
                mjl.m mVar = iVar.f206086b;
                zk0.b bVarL = mVar.d.l();
                s.j(bVarL);
                return new rpl.h(documentPhotoScreenContract$InputData, lVar, new rpl.k(bVarL, (qz0.j) mVar.P.get()));
            case 12:
                mkh.b bVar2 = (mkh.b) this.f203034b;
                mkh.s sVar = bVar2.f206313b;
                gte.a aVarB = sVar.f206400a.b();
                s.j(aVarB);
                tzg.h hVarJ = sVar.d.j();
                s.j(hVarJ);
                return new bkh.e(new bkh.f(new ckh.e(aVarB, hVarJ), new ckh.a(), new ckh.c()), bVar2.f206312a);
            case 13:
                return new flh.b(new flh.d(), ((mkh.e) this.f203034b).f206320a);
            case 14:
                r rVar = (r) this.f203034b;
                mkh.s sVar2 = rVar.f206398b;
                return new com.revolut.feature.wealth.ui.impl.transfer_picker.e(new com.revolut.feature.wealth.ui.impl.transfer_picker.f(new tnh.c(sVar2.f206429w.d(), sVar2.j())), rVar.f206397a, new mlh.a());
            case 15:
                Retrofit baseRetrofit = ((nj0.d) ((ml0.c) this.f203034b).f206556a).f();
                ml0.b.Companion.getClass();
                Intrinsics.checkNotNullParameter(baseRetrofit, "baseRetrofit");
                return baseRetrofit;
            case 16:
                mlg.b bVar3 = (mlg.b) this.f203034b;
                dj3.a aVarA2 = bVar3.f206946h.a();
                s.j(aVarA2);
                g gVarO = bVar3.i.o();
                s.j(gVarO);
                return new com.revolut.feature.us_send_checks.impl.flow.a(aVarA2, gVarO);
            case 17:
                ko8.j jVar = new ko8.j();
                c70.a aVarZ = ((o) this.f203034b).f207462a.z();
                s.j(aVarZ);
                return new ko8.i(jVar, aVarZ);
            case 18:
                return new xn8.h(new xn8.g(), ((mn8.e) this.f203034b).f207424a);
            case 19:
                return new com.revolut.feature.junior_settings.impl.ui_kompot.account_details.flow.a(((mn8.g) this.f203034b).f207429a, new xi8.c());
            case 20:
                return new com.revolut.feature.junior_settings.impl.ui_kompot.settings_flow.a(((mn8.m) this.f203034b).f207456a);
            case 21:
                return new n8j.a(((mpk.b) this.f203034b).f207840a, 2);
            case 22:
                return new n8j.a(((mpk.c) this.f203034b).f207842a, 3);
            case 23:
                mqb.a aVar4 = (mqb.a) this.f203034b;
                return new ku5.a(aVar4.f207934a, aVar4.f207935b, aVar4.f207936c, aVar4.d, aVar4.e, aVar4.f, aVar4.f207937g, aVar4.f207938h, aVar4.i, aVar4.f207939j, aVar4.k, aVar4.f207940l, aVar4.f207941m, aVar4.f207942n, aVar4.o, aVar4.f207943p, aVar4.f207944q, aVar4.f207945r, 1);
            case 24:
                bk0.e authHeadersProvider = ((nj0.d) ((mrg.c) this.f203034b).f208126b).h();
                mrg.f.Companion.getClass();
                Intrinsics.checkNotNullParameter(authHeadersProvider, "authHeadersProvider");
                return authHeadersProvider;
            case 25:
                fx5.j jVar2 = new fx5.j();
                mw5.k kVar = (mw5.k) this.f203034b;
                return new fx5.i(jVar2, kVar.f209370a, new ny5.i(new ny5.g((nw5.a) kVar.f209371b.C.get()), new ny5.e()));
            case 26:
                n16.b bVar4 = (n16.b) this.f203034b;
                f16.b bVar5 = (f16.b) bVar4.f211248b.k.get();
                s.j(bVar5);
                return new com.revolut.feature.defi.accounts.impl.ui.creation.flow.a(bVar5, bVar4.f211254m.g());
            case 27:
                n19.a aVar5 = (n19.a) this.f203034b;
                return new ajf.d(aVar5.f211295a, aVar5.f211296b, aVar5.f211297c, aVar5.d, aVar5.e, 17);
            case 28:
                n4e.a aVar6 = (n4e.a) this.f203034b;
                return new mo9.d(aVar6.f212423a, aVar6.f212424b, aVar6.f212425c, aVar6.d, aVar6.e, aVar6.f, aVar6.f212426g, aVar6.f212427h, aVar6.i, aVar6.f212428j, aVar6.k, aVar6.f212429l, aVar6.f212430m, aVar6.f212431n, 1);
            default:
                n51.a aVar7 = (n51.a) this.f203034b;
                return new e61.a(aVar7.f212527a.a(), aVar7.f212528b.b());
        }
    }

    public a(o oVar, mn8.g gVar) {
        this.f203033a = 19;
        this.f203034b = gVar;
    }
}
