package ol8;

import aii.u;
import com.revolut.feature.address.models.Address;
import com.revolut.feature.categorisation.api.model.CategorisationFilter;
import com.revolut.feature.travel.miles.api.model.TravelMilesRate;
import com.revolut.feature_travel_hotels_models.property.HotelsProperty;
import efm.d0;
import gim.i;
import h93.f0;
import hs3.i1;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import oo2.p;
import ood.q0;
import osf.g;
import ot1.b0;
import pdg.i0;
import pj4.k;
import pm9.f;
import s06.j;
import wli.x;
import yhm.o;
import yji.l;
import zhm.h0;

/* JADX INFO: loaded from: classes4.dex */
public final class e extends i implements Function1 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public Object f226358w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ Object f226359x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(int i, Continuation continuation, l lVar) {
        super(1, continuation);
        this.u = i;
        this.f226359x = lVar;
    }

    private final Object b(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.v;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj2);
            return obj2;
        }
        o.b(obj2);
        d0 d0VarC = ((j) ((k) this.f226358w).f236674s).c((String) this.f226359x, false, lg0.a.IGNORE);
        this.v = 1;
        Object objB = nim.a.b(d0VarC, this);
        return objB == aVar ? aVar : objB;
    }

    private final Object c(Object obj2) {
        pkh.k kVar = (pkh.k) this.f226358w;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.v;
        if (i == 0) {
            o.b(obj2);
            tkh.b bVar = kVar.f237193p;
            ty0.a aVar2 = (ty0.a) this.f226359x;
            this.v = 1;
            obj2 = bVar.a(aVar2, this);
            if (obj2 == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj2);
        }
        u uVar = (u) obj2;
        if (uVar != null) {
            return kVar.C1(uVar);
        }
        return null;
    }

    private final Object n(Object obj2) {
        com.revolut.feature.retail.savings.impl.core.product.presentation.rate_explanation.a aVar = (com.revolut.feature.retail.savings.impl.core.product.presentation.rate_explanation.a) this.f226358w;
        String str = (String) this.f226359x;
        fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
        int i = this.v;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj2);
            return obj2;
        }
        o.b(obj2);
        if (!((f80.b) aVar.f83223p).e(str)) {
            IllegalArgumentException illegalArgumentException = new IllegalArgumentException(p.a.p("Can't open url ", str, " on SavingsInterestRateExplanation screen"));
            h0 h0Var = h0.f322473a;
            CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
            rd0.d.a(rd0.c.ERROR, null, null, illegalArgumentException, h0Var);
            return Unit.f186387a;
        }
        x xVar = aVar.f83224q;
        lg0.a aVar3 = lg0.a.OPEN_BROWSER;
        Boolean bool = Boolean.FALSE;
        this.v = 1;
        Object objL1 = xVar.L1(str, aVar3, bool, this);
        return objL1 == aVar2 ? aVar2 : objL1;
    }

    /* JADX WARN: Type inference failed for: r2v26, types: [gim.i, kotlin.jvm.functions.Function1] */
    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        switch (this.u) {
            case 0:
                return new e((com.revolut.feature.junior_remote_login.impl.ui.flow.create_phone_number.b) this.f226358w, (em8.a) this.f226359x, continuation, 0);
            case 1:
                return new e((lal.a) this.f226358w, (String) this.f226359x, continuation, 1);
            case 2:
                return new e((p) this.f226358w, (qo2.k) this.f226359x, continuation, 2);
            case 3:
                return new e((q0) this.f226358w, (CategorisationFilter) this.f226359x, continuation, 3);
            case 4:
                return new e((oqk.k) this.f226358w, (uhf.i) this.f226359x, continuation, 4);
            case 5:
                return new e((os9.u) this.f226358w, (oq9.o) this.f226359x, continuation, 5);
            case 6:
                return new e((g) this.f226358w, (bsf.e) this.f226359x, continuation, 6);
            case 7:
                return new e(7, continuation, (b0) this.f226359x);
            case 8:
                return new e((ot8.c) this.f226358w, (ot8.b) this.f226359x, continuation, 8);
            case 9:
                return new e((com.revolut.feature.card_add_to_googlepay.impl.verification.confirmation.e) this.f226358w, (f0) this.f226359x, continuation, 9);
            case 10:
                return new e(10, continuation, (ow6.j) this.f226359x);
            case 11:
                return new e((p0d.e) this.f226358w, (String) this.f226359x, continuation, 11);
            case 12:
                return new e(12, continuation, (com.revolut.feature.rev_points.spare_change.impl.ui.screen.spare_change.a) this.f226359x);
            case 13:
                return new e((com.revolut.feature.payments_migration.impl.ui.screen.search.b) this.f226358w, (String) this.f226359x, continuation, 13);
            case 14:
                return new e((com.revolut.feature.payments_migration.impl.ui.screen.search.b) this.f226358w, (Function1) this.f226359x, continuation);
            case 15:
                return new e((com.revolut.feature.credit.application.plugins.impl.ui.email_verification.c) this.f226358w, (it3.d) this.f226359x, continuation, 15);
            case 16:
                return new e((com.revolut.feature.junior.isa.impl.ui.jisa_details.a) this.f226358w, (Address) this.f226359x, continuation, 16);
            case 17:
                return new e((com.revolut.feature.junior.isa.impl.ui.jisa_details.a) this.f226358w, (bj0.b) this.f226359x, continuation, 17);
            case 18:
                return new e((com.revolut.feature.credit.application.plugins.impl.ui.manual_underwriting.document.d) this.f226358w, (String) this.f226359x, continuation, 18);
            case 19:
                return new e((i0) this.f226358w, (HotelsProperty) this.f226359x, continuation, 19);
            case 20:
                return new e((com.revolut.feature.retail.salary_account.impl.salary_hub_phase3.a) this.f226358w, (tgb.o) this.f226359x, continuation, 20);
            case 21:
                return new e((com.revolut.feature.credit.application.plugins.impl.ui.rejected.flow.d) this.f226358w, (i1) this.f226359x, continuation, 21);
            case 22:
                return new e((com.revolut.feature.credit.application.plugins.impl.ui.rejected.flow.d) this.f226358w, (String) this.f226359x, continuation, 22);
            case 23:
                return new e((com.revolut.feature.credit.application.plugins.impl.ui.rejected.flow.e) this.f226358w, (String) this.f226359x, continuation, 23);
            case 24:
                return new e((com.revolut.feature.travel.miles.impl.ui.screen.transfer.a) this.f226358w, (TravelMilesRate) this.f226359x, continuation, 24);
            case 25:
                return new e((com.revolut.retail.feature.esim.impl.ui.screens.home.subscriptions.b) this.f226358w, (String) this.f226359x, continuation, 25);
            case 26:
                return new e((k) this.f226358w, (String) this.f226359x, continuation, 26);
            case 27:
                return new e((pkh.k) this.f226358w, (ty0.a) this.f226359x, continuation, 27);
            case 28:
                return new e((com.revolut.feature.retail.savings.impl.core.product.presentation.rate_explanation.a) this.f226358w, (String) this.f226359x, continuation, 28);
            default:
                return new e((f) this.f226358w, (km9.f) this.f226359x, continuation, 29);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Continuation continuation = (Continuation) obj2;
        switch (this.u) {
        }
        return ((e) create(continuation)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:395:0x09b7, code lost:
    
        if (r0 == r7) goto L396;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:220:0x0486  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x053e  */
    /* JADX WARN: Removed duplicated region for block: B:254:0x056e  */
    /* JADX WARN: Type inference failed for: r11v26, types: [gim.i, kotlin.jvm.functions.Function1] */
    /* JADX WARN: Type inference failed for: r12v5, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r13v13, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r14v1, types: [zhm.f0] */
    /* JADX WARN: Type inference failed for: r14v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r14v3, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v155 */
    /* JADX WARN: Type inference failed for: r1v156 */
    /* JADX WARN: Type inference failed for: r1v157 */
    /* JADX WARN: Type inference failed for: r1v83 */
    /* JADX WARN: Type inference failed for: r1v84, types: [yr6.a] */
    /* JADX WARN: Type inference failed for: r1v90, types: [java.lang.Object, yr6.a] */
    /* JADX WARN: Type inference failed for: r1v91 */
    /* JADX WARN: Type inference failed for: r1v94, types: [yr6.a] */
    /* JADX WARN: Type inference failed for: r2v31, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r33v0, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v27, types: [zhm.f0] */
    /* JADX WARN: Type inference failed for: r3v28, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v29, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r6v17, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r8v18, types: [zhm.f0] */
    /* JADX WARN: Type inference failed for: r8v19 */
    /* JADX WARN: Type inference failed for: r8v32, types: [java.util.ArrayList] */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r40) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 3244
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ol8.e.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public e(com.revolut.feature.payments_migration.impl.ui.screen.search.b bVar, Function1 function1, Continuation continuation) {
        super(1, continuation);
        this.u = 14;
        this.f226358w = bVar;
        this.f226359x = (i) function1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(Object obj2, Object obj3, Continuation continuation, int i) {
        super(1, continuation);
        this.u = i;
        this.f226358w = obj2;
        this.f226359x = obj3;
    }
}
