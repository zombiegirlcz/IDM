package com.revolut.feature.credit.loan.impl.ui.rev10.refinancedsettlementprompt;

import aii.q;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import com.revolut.core.ui_kit.delegates.PromptMarketingContentDelegate;
import com.revolut.feature.credit.loan.impl.ui.rev10.refinancedsettlementprompt.LoanRefinancedSettlementPromptScreen;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.a;
import com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import nsh.e;
import o75.b;
import o75.c;
import o75.d;
import o75.g;
import o75.h;
import te0.w;
import u45.a0;
import vc.s;
import zhm.u;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/loan/impl/ui/rev10/refinancedsettlementprompt/LoanRefinancedSettlementPromptScreen;", "Lcom/revolut/kompot/navigable/screen/BaseRecyclerViewScreen;", "Lo75/h;", "Lcom/revolut/feature/credit/loan/impl/ui/rev10/refinancedsettlementprompt/LoanRefinancedSettlementPromptScreenContract$InputData;", "Laii/q;", "feature_credit_loan_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class LoanRefinancedSettlementPromptScreen extends BaseRecyclerViewScreen<h, LoanRefinancedSettlementPromptScreenContract$InputData, q> {

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public static final /* synthetic */ KProperty[] f70481b0 = {o0.f186429a.j(new h0(LoanRefinancedSettlementPromptScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenPromptBinding;", 0))};
    public final int U;
    public final int V;
    public final PromptMarketingContentDelegate W;
    public final ao.h X;
    public final Object Y;
    public final Object Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public final Object f70482a0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LoanRefinancedSettlementPromptScreen(LoanRefinancedSettlementPromptScreenContract$InputData inputData) {
        super(inputData);
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.U = R$layout.screen_prompt;
        this.V = R$id.recyclerView;
        this.W = new PromptMarketingContentDelegate();
        this.X = s.t(this, b.f);
        final int i = 0;
        this.Y = w.y0(new Function0(this) { // from class: o75.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ LoanRefinancedSettlementPromptScreen f222720b;

            {
                this.f222720b = this;
            }

            /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                LoanRefinancedSettlementPromptScreen loanRefinancedSettlementPromptScreen = this.f222720b;
                switch (i2) {
                    case 0:
                        return u.c(loanRefinancedSettlementPromptScreen.W);
                    default:
                        KProperty[] kPropertyArr = LoanRefinancedSettlementPromptScreen.f70481b0;
                        return (g) ((a0) loanRefinancedSettlementPromptScreen.Z.getValue()).f277049c.get();
                }
            }
        });
        this.Z = w.y0(new e(this, inputData, 23));
        final int i2 = 1;
        this.f70482a0 = w.y0(new Function0(this) { // from class: o75.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ LoanRefinancedSettlementPromptScreen f222720b;

            {
                this.f222720b = this;
            }

            /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                LoanRefinancedSettlementPromptScreen loanRefinancedSettlementPromptScreen = this.f222720b;
                switch (i22) {
                    case 0:
                        return u.c(loanRefinancedSettlementPromptScreen.W);
                    default:
                        KProperty[] kPropertyArr = LoanRefinancedSettlementPromptScreen.f70481b0;
                        return (g) ((a0) loanRefinancedSettlementPromptScreen.Z.getValue()).f277049c.get();
                }
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    public final sji.b S2() {
        return (a0) this.Z.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    public final jki.h T2() {
        return (g) this.f70482a0.getValue();
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, com.revolut.kompot.navigable.screen.BaseScreen
    public final void V2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.V2(view);
        PromptMarketingContentDelegate promptMarketingContentDelegate = this.W;
        a.g2(this, rd0.e.b(promptMarketingContentDelegate.f.f121375b), null, new c(this, null), 3);
        a.g2(this, rd0.e.b(promptMarketingContentDelegate.f53080g.f121375b), null, new d(this, null), 3);
        a.g2(this, rd0.e.b(promptMarketingContentDelegate.f53079c), null, new o75.e(this, null), 3);
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, com.revolut.kompot.navigable.screen.BaseScreen
    public final void W2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.W2(view);
        ViewBinding value = this.X.getValue(this, f70481b0[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        ((jii.h) value).f174525b.setTag("LoanRefinancedSettlementPromptScreen_RecyclerView");
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: c3 */
    public final List getF66956b0() {
        return (List) this.Y.getValue();
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: e3, reason: from getter */
    public final int getV() {
        return this.V;
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.U;
    }
}
