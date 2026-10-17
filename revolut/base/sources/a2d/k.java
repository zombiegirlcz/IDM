package a2d;

import android.content.Context;
import ho.t;
import kotlin.jvm.internal.Intrinsics;
import ljl.q0;
import vc.s;

/* JADX INFO: loaded from: classes13.dex */
public final class k implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f773a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f774b;

    public /* synthetic */ k(Object obj2, int i) {
        this.f773a = i;
        this.f774b = obj2;
    }

    @Override // phm.a
    public final Object get() {
        switch (this.f773a) {
            case 0:
                l lVar = (l) this.f774b;
                return new n(lVar.f775a, lVar.f776b, lVar.f777c, lVar.d, lVar.e, lVar.f, lVar.f778g, lVar.f779h, lVar.i, lVar.f780j, lVar.k, lVar.f781l, lVar.f782m, lVar.f783n, lVar.o, 0);
            case 1:
                return new c4f.p(((a4f.c) this.f774b).f1254a, 0);
            case 2:
                a96.h hVar = (a96.h) this.f774b;
                return new a96.i(hVar.f2354a, hVar.f2355b, hVar.f2356c, hVar.d, hVar.e, hVar.f, hVar.f2357g, 0);
            case 3:
                afc.a aVar = (afc.a) this.f774b;
                return new bfc.c(aVar.f4020a, aVar.f4021b, aVar.f4022c, aVar.d, aVar.e, aVar.f, aVar.f4023g, aVar.f4024h, aVar.i, 0);
            case 4:
                aq.b bVar = (aq.b) this.f774b;
                return new bq.a(bVar.f8202a, bVar.f8203b, bVar.f8204c, bVar.d);
            case 5:
                poi.b bVar2 = ((awj.a) this.f774b).f10790a;
                com.revolut.analytics.tracking.v3.d dVarF = bVar2.f();
                s.j(dVarF);
                t tVarC = bVar2.c();
                s.j(tVarC);
                return new fwj.d(dVarF, tVarC);
            case 6:
                axc.a aVar2 = (axc.a) this.f774b;
                return new bwj.b(aVar2.f10923a, aVar2.f10924b, aVar2.f10925c, 1);
            case 7:
                b06.a aVar3 = (b06.a) this.f774b;
                return new c06.a(aVar3.f11616a, aVar3.f11617b, 0);
            case 8:
                b6e.a aVar4 = (b6e.a) this.f774b;
                return new c6e.b(aVar4.f12735a, aVar4.f12736b, aVar4.f12737c, aVar4.d, aVar4.e, aVar4.f, aVar4.f12738g, aVar4.f12739h, aVar4.i, aVar4.f12740j, aVar4.k, 0);
            case 9:
                return new c4f.p(((bf0.a) this.f774b).f14891a, 1);
            case 10:
                bf7.a aVar5 = (bf7.a) this.f774b;
                return new cf7.m(aVar5.f14903a, aVar5.f14904b, aVar5.f14905c, aVar5.d, aVar5.e, aVar5.f, aVar5.f14906g, aVar5.f14907h, aVar5.i, aVar5.f14908j, aVar5.k, aVar5.f14909l, aVar5.f14910m, aVar5.f14911n, aVar5.o, aVar5.f14912p, aVar5.f14913q, 0);
            case 11:
                bl2.a aVar6 = (bl2.a) this.f774b;
                return new bwj.b(aVar6.f16460a, aVar6.f16461b, aVar6.f16462c, 2);
            case 12:
                return new c4f.p(((bo0.a) this.f774b).f17261a, 2);
            case 13:
                bp3.a aVar7 = (bp3.a) this.f774b;
                return agk.b.b(aVar7.f17550a, aVar7.f17551b, aVar7.f17552c, aVar7.d, aVar7.e, aVar7.f, aVar7.f17553g);
            case 14:
                bq.j jVar = (bq.j) this.f774b;
                ee0.a aVar8 = jVar.f17655a;
                je0.d dVarB = aVar8.b();
                s.j(dVarB);
                yk0.a aVarB = jVar.f17656b.b();
                s.j(aVarB);
                xe0.f fVarF = aVar8.f();
                s.j(fVarF);
                return bjf.f.v(dVarB, aVarB, fVarF);
            case 15:
                bxj.a aVar9 = (bxj.a) this.f774b;
                return new cxj.c(aVar9.f19711a, aVar9.f19712b, 0);
            case 16:
                c1j.a aVar10 = (c1j.a) this.f774b;
                d1j.a aVar11 = (d1j.a) aVar10.f20526a.d.get();
                s.j(aVar11);
                zm0.c cVarJ = aVar10.f20527b.j();
                s.j(cVarJ);
                return new b1j.a(aVar11, cVarJ);
            case 17:
                c51.d dVar = (c51.d) this.f774b;
                return new bfc.c(dVar.f21328a, dVar.f21329b, dVar.f21330c, dVar.d, dVar.e, dVar.f, dVar.f21331g, dVar.f21332h, dVar.i, 1);
            case 18:
                c63.d dVar2 = (c63.d) this.f774b;
                return new c63.a(dVar2.f21601a, dVar2.f21602b, 0);
            case 19:
                c73.h hVar2 = (c73.h) this.f774b;
                return new cf7.m(hVar2.f21844a, hVar2.f21845b, hVar2.f21846c, hVar2.d, hVar2.e, hVar2.f, hVar2.f21847g, hVar2.f21848h, hVar2.i, hVar2.f21849j, hVar2.k, hVar2.f21850l, hVar2.f21851m, hVar2.f21852n, hVar2.o, hVar2.f21853p, hVar2.f21854q);
            case 20:
                cb5.a aVar12 = (cb5.a) this.f774b;
                return new db5.a(aVar12.f22721a, aVar12.f22722b, aVar12.f22723c, 0);
            case 21:
                cfe.a aVar13 = (cfe.a) this.f774b;
                return new ayb.b(aVar13.f23684a, aVar13.f23685b, aVar13.f23686c, aVar13.d, 1);
            case 22:
                ckg.b bVar3 = (ckg.b) this.f774b;
                return new ckg.e(bVar3.f24840a, bVar3.f24841b, bVar3.f24842c, bVar3.d, bVar3.e);
            case 23:
                clg.a aVar14 = (clg.a) this.f774b;
                return efk.j.a(aVar14.f24993b, aVar14.f24992a);
            case 24:
                Context context = ((co0.a) this.f774b).f25482a;
                co0.c.Companion.getClass();
                Intrinsics.checkNotNullParameter(context, "context");
                return new ao0.a(new f01.c(context));
            case 25:
                cp.a aVar15 = (cp.a) this.f774b;
                return new cxj.c(aVar15.f107750a, aVar15.f107751b);
            case 26:
                cqj.a aVar16 = (cqj.a) this.f774b;
                return new ak5.b(aVar16.f108139a, aVar16.f108140b, aVar16.f108141c, aVar16.d, aVar16.e, aVar16.f, aVar16.f108142g, aVar16.f108143h, aVar16.i, aVar16.k, aVar16.f108145l, aVar16.f108146m, aVar16.f108147n, aVar16.f108144j);
            case 27:
                cw3.a aVar17 = (cw3.a) this.f774b;
                return new cxj.c(aVar17.f109528a, aVar17.f109529b, 2);
            case 28:
                cwh.b bVar4 = (cwh.b) this.f774b;
                return new dwh.a(bVar4.f109610a, bVar4.f109611b, bVar4.f109612c, bVar4.d, bVar4.e, bVar4.f, bVar4.f109613g, bVar4.f109614h, bVar4.i, bVar4.f109615j, 0);
            default:
                return new com.revolut.retail.feature.impl.userauth.screen.sso_sign_in_sessions.flow.a(((q0) ((cxj.a) this.f774b).f109994a).i());
        }
    }
}
