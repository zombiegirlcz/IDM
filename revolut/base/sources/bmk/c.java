package bmk;

import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.feature.pockets.impl.details_v2.pocket_actions.PocketDetailsContext;
import com.revolut.retail.feature.pricing_plans.ui.api.models.PlanOfferPromptLayout;
import d67.u;
import hea.n0;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import rrc.i0;
import rrc.w;

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class c implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16853a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f16854b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f16855c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f16856g;

    public /* synthetic */ c(Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, int i) {
        this.f16853a = i;
        this.f16854b = obj2;
        this.f16855c = obj3;
        this.d = obj4;
        this.e = obj5;
        this.f = obj6;
        this.f16856g = obj7;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.f16853a) {
            case 0:
                q qVar = (q) this.f16854b;
                hha.d dVar = (hha.d) this.f16855c;
                iha.h hVar = (iha.h) this.d;
                whk.e eVar = (whk.e) this.e;
                PlanOfferPromptLayout planOfferPromptLayout = (PlanOfferPromptLayout) this.f;
                Function1 function1 = (Function1) this.f16856g;
                oki.g showModalSticky = (oki.g) obj2;
                u result = (u) obj3;
                Intrinsics.checkNotNullParameter(showModalSticky, "$this$showModalSticky");
                Intrinsics.checkNotNullParameter(result, "result");
                qVar.d3(result, dVar, hVar, eVar, planOfferPromptLayout, new aik.g(showModalSticky, 1), function1);
                return Unit.f186387a;
            case 1:
                TextLocalisedClause textLocalisedClause = (TextLocalisedClause) this.f16854b;
                CompositeClause compositeClause = (CompositeClause) this.f16855c;
                NavBarWithToolbar.b bVar = (NavBarWithToolbar.b) this.d;
                n0 n0Var = (n0) this.e;
                hea.o oVar = (hea.o) this.f;
                io3.d dVar2 = (io3.d) this.f16856g;
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                aim.e eVarB = zhm.u.b();
                eVarB.add(n0Var.f151645c.b());
                PocketDetailsContext pocketDetailsContext = (PocketDetailsContext) oVar.f151648c.getContent();
                if (pocketDetailsContext != null) {
                    eVarB.addAll(n0Var.f151643a.a(dVar2, pocketDetailsContext));
                }
                List listV = zjh.j.v(n0Var.d, oVar.f151651j);
                yp0.b.q(listV, 0, 0, 0, 0, 15);
                eVarB.addAll(listV);
                TextDelegate.Model modelA = n0.a(oVar);
                if (modelA != null) {
                    eVarB.add(modelA);
                }
                return new hea.q(zhm.u.a(eVarB), textLocalisedClause, compositeClause, bVar);
            case 2:
                kwg.l lVar = (kwg.l) this.f16854b;
                iwg.a aVar = (iwg.a) this.f16855c;
                String str = (String) this.d;
                eel.c cVar = (eel.c) this.e;
                iwg.c cVar2 = (iwg.c) this.f;
                String str2 = (String) this.f16856g;
                String userId = (String) obj2;
                xi0.b currency = (xi0.b) obj3;
                Intrinsics.checkNotNullParameter(userId, "userId");
                Intrinsics.checkNotNullParameter(currency, "currency");
                return rd0.e.c(nim.a.v(lVar.f190364r.a(userId, kwg.l.a(aVar), str, cVar, currency, cVar2, str2), new kvg.j(lVar, 18)), kotlin.coroutines.g.f186406a);
            default:
                Clause clause = (Clause) this.f16854b;
                Clause clause2 = (Clause) this.f16855c;
                Clause clause3 = (Clause) this.d;
                Clause clause4 = (Clause) this.e;
                ResourceImage resourceImage = (ResourceImage) this.f;
                i0 i0Var = (i0) this.f16856g;
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                aim.e eVarB2 = zhm.u.b();
                eVarB2.add(i0Var.f256778a.b());
                return new w(zhm.u.a(eVarB2), false, clause, clause2, clause3, clause4, resourceImage);
        }
    }
}
