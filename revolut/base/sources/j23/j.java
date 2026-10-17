package j23;

import ahe.m0;
import com.revolut.feature.card_order_new.impl.kompot.ordernewcard.tab.OrderNewCardTabControllerContract$InputData;
import dp4.f1;
import dp4.z0;
import et6.u1;
import g23.k0;
import g23.r;
import grl.r2;
import h93.l0;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import om4.s3;
import om4.y3;
import vkm.v1;
import vkm.y;
import zhm.f0;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes21.dex */
public final class j extends a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f170668c = 0;
    public final yji.n d;
    public final yji.n e;
    public final yji.n f;

    public j(g23.l creditCardsBlockProvider, g23.d creditCardEntryPointsBlockProvider, k0 linkCardBlockProvider) {
        Intrinsics.checkNotNullParameter(creditCardsBlockProvider, "creditCardsBlockProvider");
        Intrinsics.checkNotNullParameter(creditCardEntryPointsBlockProvider, "creditCardEntryPointsBlockProvider");
        Intrinsics.checkNotNullParameter(linkCardBlockProvider, "linkCardBlockProvider");
        this.d = creditCardsBlockProvider;
        this.e = creditCardEntryPointsBlockProvider;
        this.f = linkCardBlockProvider;
    }

    @Override // j23.p
    public final Flow a() {
        switch (this.f170668c) {
            case 0:
                g23.l lVar = (g23.l) this.d;
                Continuation continuation = null;
                int i = 3;
                y yVar = new y(new a87.b(mo3.a.g(lVar.f139813p.a(), null, null, 3), 25), new g23.j(3, 3, null));
                y yVar2 = new y(mo3.a.g(((y3) lVar.f139814q).e(w4l.h.f294642c, true), null, null, 3), new g23.j(3, 0, null));
                k23.f fVar = lVar.f139812n;
                y yVar3 = new y(new t38.e(yVar2, 24, fVar.a(), new z0(i, 15, continuation)), new g23.j(3, 1, null));
                k23.b bVar = lVar.o;
                t38.e eVar = new t38.e(yVar, 24, yVar3, new z0(i, 14, continuation));
                OrderNewCardTabControllerContract$InputData orderNewCardTabControllerContract$InputData = lVar.f139810l;
                wkm.l lVarC = bVar.c(eVar, orderNewCardTabControllerContract$InputData.f, orderNewCardTabControllerContract$InputData.f65115h);
                y yVar4 = new y(new a87.b(mo3.a.g(((s3) lVar.f139815r).r(), null, null, 3), 26), new eob.e(3, 29, null));
                om4.b bVar2 = (om4.b) lVar.f139816s;
                w4l.j jVar = w4l.j.f294644c;
                o oVar = new o(new y(new a35.j(2, 22, null), new y(ta6.a.e(fVar.a(), lVarC, yVar4, new y(mo3.a.g(bVar2.c(jVar), null, null, 3), new g23.j(3, 2, null)), yVar3, new g23.i(lVar, continuation, 0)), new eob.e(3, 28, null))), u.c(lVar), null, "CreditCards", 4);
                g23.d dVar = (g23.d) this.e;
                it4.b bVar3 = (it4.b) dVar.f139780n;
                return c(v.k(oVar, new o(new y(new a35.j(2, 21, null), new y(ta6.a.h(new y(mo3.a.g(boh.f.e(((om4.b) bVar3.f168341b).e(r2.CARD_ORDERING), new it4.a(bVar3, 3)), null, null, 3), new eob.e(3, 25, null)), new y(new a87.b(mo3.a.g(((s3) dVar.o).r(), null, null, 3), 24), new eob.e(3, 27, null)), new y(mo3.a.g(((om4.b) dVar.f139781p).c(jVar), null, null, 3), new eob.e(3, 26, null)), new g23.c(dVar, null)), new eob.e(3, 24, null))), u.c(dVar), null, "CreditCardEntryPoints", 4), ((k0) this.f).Z2()));
            default:
                r rVar = (r) this.d;
                rVar.getClass();
                o oVar2 = new o(new y(new a35.j(2, 24, null), new m0(new y(new v1(new g23.q(rVar, (Continuation) null, 0)), new g23.j(3, 5, null)), 4)), null, u.c(rVar), "CryptoDisclaimer", 2);
                g23.o oVar3 = (g23.o) this.e;
                k23.b bVar4 = oVar3.o;
                k23.a aVar = new k23.a(null, null, l0.CRYPTO, 3);
                OrderNewCardTabControllerContract$InputData orderNewCardTabControllerContract$InputData2 = oVar3.f139820l;
                o oVar4 = new o(new y(new a35.j(2, 23, null), new y(new t38.e(oVar3.f139822n.a(), 24, bVar4.b(aVar, orderNewCardTabControllerContract$InputData2.f, orderNewCardTabControllerContract$InputData2.f65115h), new f1(oVar3, null, 23)), new g23.j(3, 4, null))), u.c(oVar3), null, "CryptoCards", 4);
                g23.u uVar = (g23.u) this.f;
                uVar.getClass();
                return c(v.k(oVar2, oVar4, new o(new go.g(f0.f322471a, 2), null, u.c(uVar), "CryptoFooterDisclaimer", 2)));
        }
    }

    @Override // j23.p
    public Flow b() {
        switch (this.f170668c) {
            case 1:
                g23.u uVar = (g23.u) this.f;
                w9j.e eVar = uVar.f139834l;
                eVar.getClass();
                return new y(new a35.j(2, 25, null), new y(new u1(new v1(new w3k.i(eVar, (Continuation) null, 14)), uVar, 14), new g23.j(3, 6, null)));
            default:
                return super.b();
        }
    }

    public j(r cryptoDisclaimerBlockProvider, g23.o cryptoCardsBlockProvider, g23.u cryptoFooterDisclaimerBlockProvider) {
        Intrinsics.checkNotNullParameter(cryptoDisclaimerBlockProvider, "cryptoDisclaimerBlockProvider");
        Intrinsics.checkNotNullParameter(cryptoCardsBlockProvider, "cryptoCardsBlockProvider");
        Intrinsics.checkNotNullParameter(cryptoFooterDisclaimerBlockProvider, "cryptoFooterDisclaimerBlockProvider");
        this.d = cryptoDisclaimerBlockProvider;
        this.e = cryptoCardsBlockProvider;
        this.f = cryptoFooterDisclaimerBlockProvider;
    }
}
