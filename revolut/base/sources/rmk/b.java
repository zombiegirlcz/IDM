package rmk;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.feature.terms.api.model.TermsScope;
import com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_management.termsandconditions.screen.TermsAndConditionsScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import yhm.o;

/* JADX INFO: loaded from: classes11.dex */
public final class b extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ TermsAndConditionsScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(TermsAndConditionsScreen termsAndConditionsScreen, Continuation continuation) {
        super(2, continuation);
        this.v = termsAndConditionsScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        b bVar = new b(this.v, continuation);
        bVar.u = obj2;
        return bVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((b) create((RowDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        RowDelegate.Model model = (RowDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        d dVar = (d) this.v.X.getValue();
        String listId = model.f53228a;
        i iVar = (i) dVar;
        iVar.getClass();
        Intrinsics.checkNotNullParameter(listId, "listId");
        switch (listId.hashCode()) {
            case -1909910869:
                if (listId.equals("PROMOTION_TERMS")) {
                    iVar.l2(new h(iVar, null, 2), new yi5.b(26));
                }
                break;
            case -1197017930:
                if (listId.equals("PLAN_PARTNERSHIP_TERMS")) {
                    iVar.l2(new h(iVar, null, 1), new yi5.b(26));
                }
                break;
            case 468061041:
                if (listId.equals("EXTRA_MEMBER_TERMS")) {
                    TermsScope.INSTANCE.getClass();
                    iVar.l2(new rm6.c(iVar, TermsScope.Q, null, 3), new yi5.b(26));
                }
                break;
            case 1035991076:
                if (listId.equals("PAID_PLAN_TERMS")) {
                    iVar.l2(new h(iVar, null, 0), new yi5.b(26));
                }
                break;
            case 1368295890:
                if (listId.equals("DUO_PLAN_TERMS")) {
                    TermsScope.INSTANCE.getClass();
                    iVar.l2(new rm6.c(iVar, TermsScope.P, null, 3), new yi5.b(26));
                }
                break;
        }
        return Unit.f186387a;
    }
}
