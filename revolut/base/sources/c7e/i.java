package c7e;

import aw0.a8;
import aw0.d8;
import aw0.e8;
import cie.o1;
import com.revolut.feature.shops.impl.model.ShopsInstruction;
import com.revolut.feature.tab.accounts.models.ProductAccountDescriptor$Value;
import com.revolut.kompot.navigable.vc.ui.States$PersistentDomain;
import com.revolut.retail.core.navigation.ActivityNavigateCommand;
import com.revolut.retail.core.navigation.ImplicitActivityDestination;
import com.revolut.retail.feature.pricing_plans.ui.api.models.PricingPlanAction;
import com.youTransactor.uCube.rpc.Constants;
import java.util.Iterator;
import java.util.List;
import jlk.j;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.d0;
import pjd.b;
import q7c.p;
import zhm.u;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class i implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f21954a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f21955b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f21956c;

    public /* synthetic */ i(Object obj2, Object obj3, int i) {
        this.f21954a = i;
        this.f21955b = obj2;
        this.f21956c = obj3;
    }

    private final Object a(Object obj2) {
        o1 o1Var = (o1) this.f21955b;
        nie.c cVar = (nie.c) this.f21956c;
        Function0 it8 = (Function0) obj2;
        Intrinsics.checkNotNullParameter(it8, "it");
        ola.c cVarB = cVar != null ? o1Var.f24511c.b(cVar) : null;
        return u.c(new aw0.b(cVarB != null ? new d8(cVarB, a8.f10234a) : new e8(true), new tx0.l(null, 7)));
    }

    private final Object b(Object obj2) {
        com.revolut.retail.feature.pricing_plans.ui.impl.flows.plan_referral_claim.c cVar = (com.revolut.retail.feature.pricing_plans.ui.impl.flows.plan_referral_claim.c) this.f21955b;
        PricingPlanAction.ClaimPlanReferral claimPlanReferral = (PricingPlanAction.ClaimPlanReferral) this.f21956c;
        jlk.j output = (jlk.j) obj2;
        Intrinsics.checkNotNullParameter(output, "output");
        if (!(output instanceof j.a)) {
            if (!(output instanceof j.b)) {
                throw new NoWhenBranchMatchedException();
            }
            yji.l.a1(cVar, cVar.f103218r.e3(claimPlanReferral.f102797c, claimPlanReferral.f102795a, claimPlanReferral.f102796b), null, null, new com.revolut.retail.feature.pricing_plans.ui.impl.flows.plan_referral_claim.b(cVar, null), 3);
        }
        return Unit.f186387a;
    }

    private final Object c(Object obj2) {
        ri6.d dVar = (ri6.d) this.f21955b;
        ei6.d dVar2 = (ei6.d) this.f21956c;
        ((cj6.d) obj2).getClass();
        return new cj6.d(dVar, dVar2);
    }

    private final Object d(Object obj2) {
        ShopsInstruction shopsInstruction = (ShopsInstruction) this.f21955b;
        com.revolut.feature.shops.impl.ui.details.a aVar = (com.revolut.feature.shops.impl.ui.details.a) this.f21956c;
        cjd.d dVar = (cjd.d) obj2;
        b.a aVarA = b.a.a(dVar.f, shopsInstruction != null ? shopsInstruction.f87125b : null, null, false, false, false, false, null, 126);
        int i = -1;
        if (shopsInstruction != null) {
            b6c.c cVar = aVar.f87169r;
            List instructions = shopsInstruction.f87124a;
            ((p) cVar).getClass();
            Intrinsics.checkNotNullParameter(instructions, "instructions");
            Iterator it8 = instructions.iterator();
            int i2 = 0;
            while (true) {
                if (!it8.hasNext()) {
                    break;
                }
                if (d0.J((String) it8.next(), "Revolut Pay", false)) {
                    i = i2;
                    break;
                }
                i2++;
            }
        }
        return cjd.d.a(dVar, null, null, null, i, false, aVarA, false, false, Constants.TAG_EMV_L2_VERSION);
    }

    private final Object e(Object obj2) {
        cle.j jVar = (cle.j) this.f21955b;
        String str = (String) this.f21956c;
        Boolean handled = (Boolean) obj2;
        Intrinsics.checkNotNullParameter(handled, "handled");
        if (handled.booleanValue()) {
            return pfm.m.f235744a;
        }
        pfm.h hVar = new pfm.h(new a08.l(jVar, new ActivityNavigateCommand(new ImplicitActivityDestination("android.intent.action.VIEW", null, null, null, ((f80.b) jVar.f24983n).f(str), 14), null, null, null, 0, null, null, null, null, false, 1022), 11), 2);
        Intrinsics.checkNotNullExpressionValue(hVar, "fromAction(...)");
        return hVar;
    }

    private final Object g(Object obj2) {
        cli.h hVar = (cli.h) this.f21955b;
        States$PersistentDomain states$PersistentDomain = (States$PersistentDomain) this.f21956c;
        States$PersistentDomain update = (States$PersistentDomain) obj2;
        Intrinsics.checkNotNullParameter(update, "$this$update");
        return (States$PersistentDomain) hVar.f.invoke(hVar.f25027g, states$PersistentDomain);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00cf  */
    /* JADX WARN: Type inference failed for: r0v154, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r11v0, types: [kotlin.coroutines.Continuation] */
    /* JADX WARN: Type inference failed for: r11v34 */
    /* JADX WARN: Type inference failed for: r7v31 */
    /* JADX WARN: Type inference failed for: r7v32, types: [com.revolut.core.ui_kit.models.Style, java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r7v34 */
    @Override // kotlin.jvm.functions.Function1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invoke(java.lang.Object r58) {
        /*
            Method dump skipped, instruction units count: 3236
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: c7e.i.invoke(java.lang.Object):java.lang.Object");
    }

    public /* synthetic */ i(List list, com.revolut.feature.tab.accounts.impl.ui.tab.d dVar, ProductAccountDescriptor$Value productAccountDescriptor$Value) {
        this.f21954a = 21;
        this.f21955b = list;
        this.f21956c = productAccountDescriptor$Value;
    }
}
