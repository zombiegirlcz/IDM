package y20;

import com.revolut.feature.acquiring.lite_pos.api.model.CatalogueProduct;
import com.revolut.feature.cards.models.revolutcard.TerminatedCard;
import com.revolut.feature.hyper_text.model.HyperTextTarget;
import com.revolut.feature.shared.invoices.api.domain.model.InvoiceTemplateCreatePayload;
import com.revolut.feature.shared_separate_favourites.common.screen.add_asset.SharedFavouritesAddAssetScreen;
import com.revolut.feature.terms.api.model.TermsScope;
import com.revolut.feature.wealth.api.navigation.models.RecurringDepositSchedule;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: classes19.dex */
public final class a1 extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public Object f310449w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ Object f310450x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a1(Object obj2, Object obj3, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f310449w = obj2;
        this.f310450x = obj3;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new a1((b1) this.f310449w, (v20.n) this.f310450x, continuation, 0);
            case 1:
                return new a1((y24.a) this.f310449w, (ft3.h1) this.f310450x, continuation, 1);
            case 2:
                a1 a1Var = new a1((y29.a) this.f310450x, continuation, 2);
                a1Var.f310449w = obj2;
                return a1Var;
            case 3:
                return new a1((smd.s) this.f310449w, (ft3.h1) this.f310450x, continuation, 3);
            case 4:
                return new a1((y3f.v) this.f310449w, (List) this.f310450x, continuation, 4);
            case 5:
                a1 a1Var2 = new a1((y59.e) this.f310450x, continuation, 5);
                a1Var2.f310449w = obj2;
                return a1Var2;
            case 6:
                a1 a1Var3 = new a1((y62.b) this.f310450x, continuation, 6);
                a1Var3.f310449w = obj2;
                return a1Var3;
            case 7:
                return new a1((com.revolut.feature.credit.loan.impl.ui.rev10.instalmentdetails.a) this.f310449w, (String) this.f310450x, continuation, 7);
            case 8:
                return new a1((y6b.k) this.f310449w, (HyperTextTarget) this.f310450x, continuation, 8);
            case 9:
                return new a1((com.revolut.feature.card_screen.impl.kompot.cards_list.c) this.f310449w, (TerminatedCard) this.f310450x, continuation, 9);
            case 10:
                return new a1((y7d.x) this.f310449w, (String) this.f310450x, continuation, 10);
            case 11:
                return new a1((com.revolut.retail.feature.payments.payment_links.impl.ui_kompot.amount.a) this.f310449w, (String) this.f310450x, continuation, 11);
            case 12:
                return new a1((y9d.e) this.f310449w, (InvoiceTemplateCreatePayload) this.f310450x, continuation, 12);
            case 13:
                return new a1((y9d.e) this.f310449w, (String) this.f310450x, continuation, 13);
            case 14:
                return new a1((ya5.l) this.f310450x, continuation, 14);
            case 15:
                return new a1((ya5.l) this.f310449w, (dj0.d) this.f310450x, continuation, 15);
            case 16:
                return new a1((com.revolut.feature_retail_user_declarations.email.screen.a) this.f310449w, (TermsScope) this.f310450x, continuation, 16);
            case 17:
                a1 a1Var4 = new a1((yb0.i) this.f310450x, continuation, 17);
                a1Var4.f310449w = obj2;
                return a1Var4;
            case 18:
                return new a1((yb5.e) this.f310449w, (String) this.f310450x, continuation, 18);
            case 19:
                return new a1((com.revolut.feature.wealth.impl.ui.screens.composite_add_money.b) this.f310449w, (RecurringDepositSchedule) this.f310450x, continuation, 19);
            case 20:
                return new a1((com.revolut.feature.wealth.impl.ui.screens.composite_add_money.b) this.f310449w, (dj0.d) this.f310450x, continuation, 20);
            case 21:
                return new a1((com.revolut.feature.travel.hotels.impl.ui_kompot.screen.picker.dates.a) this.f310449w, (vim.d) this.f310450x, continuation, 21);
            case 22:
                return new a1((com.revolut.feature.acquiring.lite_pos.impl.ui.screen.product.a) this.f310449w, (CatalogueProduct) this.f310450x, continuation, 22);
            case 23:
                return new a1((com.revolut.feature.pockets.impl.ui.add_new.c) this.f310449w, (s7a.c0) this.f310450x, continuation, 23);
            case 24:
                return new a1((com.revolut.feature.pockets.impl.ui.add_new.c) this.f310449w, (xi0.b) this.f310450x, continuation, 24);
            case 25:
                return new a1((com.revolut.feature.pockets.impl.ui.add_new.d) this.f310449w, (jda.a) this.f310450x, continuation, 25);
            case 26:
                a1 a1Var5 = new a1((SharedFavouritesAddAssetScreen) this.f310450x, continuation, 26);
                a1Var5.f310449w = obj2;
                return a1Var5;
            case 27:
                return new a1((yg5.u) this.f310449w, (ArrayList) this.f310450x, continuation, 27);
            case 28:
                return new a1((yg5.u) this.f310449w, (String) this.f310450x, continuation, 28);
            default:
                a1 a1Var6 = new a1((yg6.u) this.f310450x, continuation, 29);
                a1Var6.f310449w = obj2;
                return a1Var6;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((a1) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 1:
                return ((a1) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 2:
                return ((a1) create((FlowCollector) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 3:
                return ((a1) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 4:
                return ((a1) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 5:
                return ((a1) create((FlowCollector) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 6:
                return ((a1) create((FlowCollector) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 7:
                return ((a1) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 8:
                return ((a1) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 9:
                return ((a1) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 10:
                return ((a1) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 11:
                return ((a1) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 12:
                return ((a1) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 13:
                return ((a1) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 14:
                return ((a1) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 15:
                return ((a1) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 16:
                return ((a1) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 17:
                return ((a1) create((FlowCollector) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 18:
                return ((a1) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 19:
                return ((a1) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 20:
                return ((a1) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 21:
                return ((a1) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 22:
                return ((a1) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 23:
                return ((a1) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 24:
                return ((a1) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 25:
                return ((a1) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 26:
                return ((a1) create((ty0.a) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 27:
                return ((a1) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 28:
                return ((a1) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((a1) create((FlowCollector) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Removed duplicated region for block: B:333:0x0637  */
    /* JADX WARN: Removed duplicated region for block: B:336:0x064e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:337:0x0659 -> B:333:0x0637). Please report as a decompilation issue!!! */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r20) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 2292
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: y20.a1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a1(Object obj2, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f310450x = obj2;
    }
}
