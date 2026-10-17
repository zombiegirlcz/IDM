package w64;

import aii.m;
import android.graphics.Bitmap;
import com.revolut.domain.models.moneyrequest.TransferLinkDetails;
import com.revolut.feature.terms.api.model.TermsScope;
import gim.i;
import ihm.k;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.CoroutineScope;
import w75.l;
import w8l.j;
import wdb.n;
import wed.f0;
import wf4.h;
import wl3.s;
import wol.t;
import wp4.i0;
import wwf.o;
import x1g.c0;
import x36.y;
import x8j.g0;

/* JADX INFO: loaded from: classes22.dex */
public final class d extends i implements Function1 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public Object f295375w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public Object f295376x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(com.revolut.feature.credit.application.plugins.impl.ui.agreements.v1.a aVar, Continuation continuation) {
        super(1, continuation);
        this.u = 24;
        this.f295375w = aVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        switch (this.u) {
            case 0:
                return new d((com.revolut.feature.credit.application.plugins.impl.ui.congratulations.b) this.f295375w, (it3.d) this.f295376x, continuation, 0);
            case 1:
                return new d((l) this.f295376x, continuation, 1);
            case 2:
                return new d((w7k.b) this.f295375w, (TransferLinkDetails) this.f295376x, continuation, 2);
            case 3:
                return new d((j) this.f295375w, (String) this.f295376x, continuation, 3);
            case 4:
                return new d((com.revolut.feature.retail.global_accounts.impl.onboarding.ui.a) this.f295375w, (String) this.f295376x, continuation, 4);
            case 5:
                return new d((n) this.f295375w, (String) this.f295376x, continuation, 5);
            case 6:
                return new d((f0) this.f295375w, (Function1) this.f295376x, continuation, 6);
            case 7:
                return new d((h) this.f295375w, (cv3.h) this.f295376x, continuation, 7);
            case 8:
                return new d((com.revolut.kompot.bridge.impl.rootflow.a) this.f295375w, (m) this.f295376x, continuation, 8);
            case 9:
                return new d((com.revolut.feature.tab.crypto.impl.ui.settings.a) this.f295375w, (soa.b) this.f295376x, continuation, 9);
            case 10:
                return new d((s) this.f295375w, (k) this.f295376x, continuation, 10);
            case 11:
                return new d((wlh.k) this.f295376x, continuation, 11);
            case 12:
                return new d((com.revolut.feature.payees.impl.ui.payees_overview.personal.a) this.f295375w, (km9.f) this.f295376x, continuation, 12);
            case 13:
                return new d((t) this.f295375w, (String) this.f295376x, continuation, 13);
            case 14:
                return new d((i0) this.f295375w, (com.revolut.feature.credit_card.autopay.api.models_v3.c) this.f295376x, continuation, 14);
            case 15:
                return new d((com.revolut.feature.wealth_discovery.impl.screener.screens.edit_screener.a) this.f295375w, (String) this.f295376x, continuation, 15);
            case 16:
                return new d((com.revolut.retail.feature.impl.rewards_hub.ui.flow.rewards_hub.a) this.f295375w, (euj.j) this.f295376x, continuation, 16);
            case 17:
                return new d((wvl.g) this.f295375w, (CoroutineScope) this.f295376x, continuation, 17);
            case 18:
                return new d((o) this.f295375w, (bxf.e) this.f295376x, continuation, 18);
            case 19:
                return new d((com.revolut.feature.defi.accounts.impl.ui.extension.a) this.f295375w, (ty0.a) this.f295376x, continuation, 19);
            case 20:
                return new d((c0) this.f295375w, (TermsScope) this.f295376x, continuation, 20);
            case 21:
                return new d((com.revolut.feature.card_order_new.impl.kompot.screen.card_personalisation.c) this.f295375w, (Bitmap) this.f295376x, continuation, 21);
            case 22:
                return new d((com.revolut.feature.freelancer.impl.ui.subaccount.update.flow.a) this.f295375w, (t27.m) this.f295376x, continuation, 22);
            case 23:
                return new d((a46.d) this.f295375w, (y) this.f295376x, continuation, 23);
            case 24:
                return new d((com.revolut.feature.credit.application.plugins.impl.ui.agreements.v1.a) this.f295375w, continuation);
            case 25:
                return new d((com.revolut.feature.credit.application.plugins.impl.ui.agreements.v1.a) this.f295375w, (v44.j) this.f295376x, continuation, 25);
            case 26:
                return new d((x4a.h) this.f295375w, (jq9.t) this.f295376x, continuation, 26);
            case 27:
                return new d((x6h.d) this.f295376x, continuation, 27);
            case 28:
                return new d((g0) this.f295375w, (xi0.b) this.f295376x, continuation, 28);
            default:
                return new d((x9b.j) this.f295375w, (x9b.c) this.f295376x, continuation, 29);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Continuation continuation = (Continuation) obj2;
        switch (this.u) {
        }
        return ((d) create(continuation)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:125:0x02d1  */
    /* JADX WARN: Removed duplicated region for block: B:555:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x011b  */
    /* JADX WARN: Type inference failed for: r10v0, types: [kotlin.coroutines.Continuation] */
    /* JADX WARN: Type inference failed for: r10v25 */
    /* JADX WARN: Type inference failed for: r10v27 */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r31) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 3026
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: w64.d.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(Object obj2, Object obj3, Continuation continuation, int i) {
        super(1, continuation);
        this.u = i;
        this.f295375w = obj2;
        this.f295376x = obj3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(Object obj2, Continuation continuation, int i) {
        super(1, continuation);
        this.u = i;
        this.f295376x = obj2;
    }
}
