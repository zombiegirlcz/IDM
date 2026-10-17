package j23;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.card_order_new.impl.kompot.ordernewcard.tab.OrderNewCardTabControllerContract$InputData;
import com.revolut.feature.cards_core.R$string;
import et6.u1;
import et6.y0;
import g23.f0;
import g23.g0;
import g23.l0;
import g23.o0;
import g23.z;
import h93.j0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import org.bouncycastle.asn1.BERTags;
import tcg.a0;
import te8.c0;
import vkm.y;
import zhm.u;

/* JADX INFO: loaded from: classes21.dex */
public final class l extends a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f170670c = 1;
    public final Object d;

    public l(z freelancerCardsBlockProvider) {
        Intrinsics.checkNotNullParameter(freelancerCardsBlockProvider, "freelancerCardsBlockProvider");
        this.d = freelancerCardsBlockProvider;
    }

    @Override // j23.p
    public final Flow a() {
        switch (this.f170670c) {
            case 0:
                z zVar = (z) this.d;
                k23.b bVar = zVar.o;
                j0 j0Var = j0.PRO;
                OrderNewCardTabControllerContract$InputData orderNewCardTabControllerContract$InputData = zVar.f139842l;
                return c(u.c(new o(new y(new a35.j(2, 26, null), new y(ta6.a.h(zVar.f139844n.a(), bVar.b(new k23.a(null, j0Var, orderNewCardTabControllerContract$InputData.f65114g, 1), orderNewCardTabControllerContract$InputData.f, orderNewCardTabControllerContract$InputData.f65115h), new y(new a35.j(2, 27, null), new y(new a87.b(mo3.a.g(((y0) zVar.f139845p).b(), null, null, 3), 27), new g23.j(3, 8, null))), new ate.b(zVar, null, 3)), new g23.j(3, 7, null))), u.c(zVar), null, "FreelancerCards", 4)));
            case 1:
                g0 g0Var = (g0) this.d;
                y yVar = new y(new a87.b(mo3.a.g(g0Var.f139795p.c(), null, null, 3), 28), new g23.j(3, 10, null));
                k23.b bVar2 = g0Var.o;
                u1 u1Var = new u1(yVar, g0Var, 15);
                OrderNewCardTabControllerContract$InputData orderNewCardTabControllerContract$InputData2 = g0Var.f139792l;
                wkm.l lVarC = bVar2.c(u1Var, orderNewCardTabControllerContract$InputData2.f, orderNewCardTabControllerContract$InputData2.f65115h);
                k23.f fVar = g0Var.f139794n;
                return c(u.c(new o(new y(new a35.j(2, 28, null), new y(ta6.a.g(fVar.a(), (Flow) fVar.f180318g.getValue(), (Flow) fVar.f180319h.getValue(), lVarC, new f0(g0Var, null)), new g23.j(3, 9, null))), u.c(g0Var), null, "JointCards", 4)));
            case 2:
                i23.d dVar = (i23.d) this.d;
                jhi.b bVarG = mo3.a.g(dVar.f157815c.j(w4l.h.f294642c), null, null, 3);
                c0 c0Var = dVar.d;
                return c(u.c(new o(new y(new g2d.c(2, 13, null), new y(new t38.e(bVarG, 24, new y(new g2d.c(2, 14, null), new y(mo3.a.g(nim.a.v(nim.a.v(rd0.e.b(c0Var.f270057a.a(null, false)), new a0(c0Var, 22)), new a0(21)), null, null, 3), new i23.c(3, 0, null))), new i23.b(dVar, null)), new g23.j(3, 29, null))), u.c(dVar.f), null, "JuniorCards", 4)));
            default:
                o0 o0Var = (o0) this.d;
                return c(u.c(new o(new go.g(u.c(l0.b(o0Var.f139826n, "NEW_PAY_LATER_LIST_ID", new TextLocalisedClause(R$string.card_name_pay_later_virtual, null, null, 14), new TextLocalisedClause(R$string.card_order_pay_later_virtual_card_subtitle, null, null, 14), R$drawable.uikit_icn_24_smartphone, R$attr.uikit_colorTeal, null, BERTags.FLAGS)), 2), u.c(o0Var), null, "PayLaterCards", 4)));
        }
    }

    public l(g0 jointCardsBlockProvider) {
        Intrinsics.checkNotNullParameter(jointCardsBlockProvider, "jointCardsBlockProvider");
        this.d = jointCardsBlockProvider;
    }

    public l(o0 payLaterCardsBlockProvider) {
        Intrinsics.checkNotNullParameter(payLaterCardsBlockProvider, "payLaterCardsBlockProvider");
        this.d = payLaterCardsBlockProvider;
    }

    public l(i23.d juniorCardsBlockProvider) {
        Intrinsics.checkNotNullParameter(juniorCardsBlockProvider, "juniorCardsBlockProvider");
        this.d = juniorCardsBlockProvider;
    }
}
