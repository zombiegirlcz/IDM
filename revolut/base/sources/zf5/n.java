package zf5;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.data.model.Data;
import com.revolut.feature.junior_payment_links.impl.R$string;
import com.revolut.feature.junior_settings.impl.ui_kompot.account_details.flow.JuniorAccountDetailsFlowContract$Step;
import ip0.qi;
import ip0.qj0;
import java.util.ArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import zhm.u;
import znd.c1;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class n implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f321881a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f321882b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f321883c;

    public /* synthetic */ n(com.revolut.feature.apm.aani.impl.ui.settings.a aVar, Data data) {
        this.f321881a = 16;
        this.f321883c = aVar;
        this.f321882b = data;
    }

    private final Object a(Object obj2) {
        com.revolut.feature.junior_settings.impl.ui_kompot.account_details.flow.a aVar = (com.revolut.feature.junior_settings.impl.ui_kompot.account_details.flow.a) this.f321882b;
        JuniorAccountDetailsFlowContract$Step juniorAccountDetailsFlowContract$Step = (JuniorAccountDetailsFlowContract$Step) this.f321883c;
        ti8.b it8 = (ti8.b) obj2;
        Intrinsics.checkNotNullParameter(it8, "it");
        JuniorAccountDetailsFlowContract$Step.CustomAmount customAmount = (JuniorAccountDetailsFlowContract$Step.CustomAmount) juniorAccountDetailsFlowContract$Step;
        if (it8 == null) {
            throw new NoWhenBranchMatchedException();
        }
        aVar.H2(aVar.f77275q, new yi8.f(it8, 1));
        aVar.B2();
        if (!customAmount.f77269a.a()) {
            aVar.f77274p.getClass();
            yji.l.a1(aVar, aVar.X1(new mii.k("DIALOG_ID_CUSTOM_LINK_UPDATED", new TextLocalisedClause(R$string.junior_payment_links_custom_amount_screen_shot_dialog_link_updated, null, null, 14), null, null, null, 28)), null, null, null, 7);
        }
        return Unit.f186387a;
    }

    private final Object b(Object obj2) {
        c1 c1Var = (c1) this.f321882b;
        znd.a aVar = (znd.a) this.f321883c;
        Function0 it8 = (Function0) obj2;
        Intrinsics.checkNotNullParameter(it8, "it");
        aim.e eVarB = u.b();
        qv0.i iVarC = c1Var.f323733c.c(0, null, aVar.f323708b, true);
        int i = R$attr.uikit_dp16;
        yp0.b.l(iVarC, i, i, 0, 0, null, false, 60);
        eVarB.add(iVarC);
        eVarB.add(c1Var.f323737l ? new qj0("tabs_loading", 5) : new qi("tabs_loading", 4));
        if (aVar.f == null) {
            eVarB.add(c1Var.f323732b.c(c1Var.e()));
        }
        ArrayList arrayListH = c1.h();
        c1.j(arrayListH);
        eVarB.addAll(arrayListH);
        return u.a(eVarB);
    }

    /* JADX WARN: Removed duplicated region for block: B:231:0x0633  */
    /* JADX WARN: Removed duplicated region for block: B:366:0x08f0  */
    @Override // kotlin.jvm.functions.Function1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invoke(java.lang.Object r41) {
        /*
            Method dump skipped, instruction units count: 3338
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: zf5.n.invoke(java.lang.Object):java.lang.Object");
    }

    public /* synthetic */ n(Object obj2, Object obj3, int i) {
        this.f321881a = i;
        this.f321882b = obj2;
        this.f321883c = obj3;
    }
}
