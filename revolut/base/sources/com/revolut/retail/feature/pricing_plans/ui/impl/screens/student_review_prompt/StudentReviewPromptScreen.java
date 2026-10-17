package com.revolut.retail.feature.pricing_plans.ui.impl.screens.student_review_prompt;

import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.viewbinding.ViewBinding;
import ao.h;
import com.revolut.core.ui_kit.delegates.PromptMarketingContentDelegate;
import com.revolut.feature.full_screen_prompt.R$layout;
import com.revolut.kompot.navigable.vc.SimpleViewController;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.recyclerkit.ScreenContentRecyclerView;
import com.revolut.retail.feature.pricing_plans.ui.impl.screens.student_review_prompt.StudentReviewPromptScreen;
import com.revolut.retail.feature.pricing_plans.ui.impl.screens.student_review_prompt.StudentReviewPromptScreenContract$InputData;
import e67.a;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import qgk.i0;
import qgk.w1;
import qgk.y1;
import te0.w;
import vc.s;
import wnk.b;
import wnk.c;
import wnk.d;
import wnk.f;
import wnk.g;
import wnk.i;
import xki.e;
import yp0.y;
import z4l.j;
import zhm.u;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/revolut/retail/feature/pricing_plans/ui/impl/screens/student_review_prompt/StudentReviewPromptScreen;", "Lcom/revolut/kompot/navigable/vc/SimpleViewController;", "Lwnk/i;", "feature_retail_pricing_plans_ui_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class StudentReviewPromptScreen extends SimpleViewController<i> {
    public static final /* synthetic */ KProperty[] T = {o0.f186429a.j(new h0(StudentReviewPromptScreen.class, "binding", "getBinding()Lcom/revolut/feature/full_screen_prompt/databinding/ScreenFullScreenPromptBinding;", 0))};
    public final StudentReviewPromptScreenContract$InputData N;
    public final PromptMarketingContentDelegate O;
    public final j P;
    public final h Q;
    public final Object R;
    public final Object S;

    public StudentReviewPromptScreen(StudentReviewPromptScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.N = inputData;
        PromptMarketingContentDelegate promptMarketingContentDelegate = new PromptMarketingContentDelegate();
        this.O = promptMarketingContentDelegate;
        this.P = new j(7, u.c(promptMarketingContentDelegate), false);
        this.Q = s.t(this, b.f);
        final int i = 0;
        this.R = w.y0(new Function0(this) { // from class: wnk.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ StudentReviewPromptScreen f298845b;

            {
                this.f298845b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                StudentReviewPromptScreen studentReviewPromptScreen = this.f298845b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = StudentReviewPromptScreen.T;
                        return (g) ((w1) studentReviewPromptScreen.S.getValue()).f246307b.get();
                    default:
                        KProperty[] kPropertyArr2 = StudentReviewPromptScreen.T;
                        qji.b bVarU2 = studentReviewPromptScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.retail.feature.pricing_plans.ui.impl.screens.student_review_prompt.di.StudentReviewPromptScreenInjector");
                        y1 y1Var = (y1) bVarU2;
                        i0 i0Var = y1Var.f246334b;
                        y1 y1Var2 = y1Var.f246335c;
                        StudentReviewPromptScreenContract$InputData studentReviewPromptScreenContract$InputData = studentReviewPromptScreen.N;
                        studentReviewPromptScreenContract$InputData.getClass();
                        return new w1(i0Var, y1Var2, studentReviewPromptScreenContract$InputData);
                }
            }
        });
        final int i2 = 1;
        this.S = w.y0(new Function0(this) { // from class: wnk.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ StudentReviewPromptScreen f298845b;

            {
                this.f298845b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                StudentReviewPromptScreen studentReviewPromptScreen = this.f298845b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = StudentReviewPromptScreen.T;
                        return (g) ((w1) studentReviewPromptScreen.S.getValue()).f246307b.get();
                    default:
                        KProperty[] kPropertyArr2 = StudentReviewPromptScreen.T;
                        qji.b bVarU2 = studentReviewPromptScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.retail.feature.pricing_plans.ui.impl.screens.student_review_prompt.di.StudentReviewPromptScreenInjector");
                        y1 y1Var = (y1) bVarU2;
                        i0 i0Var = y1Var.f246334b;
                        y1 y1Var2 = y1Var.f246335c;
                        StudentReviewPromptScreenContract$InputData studentReviewPromptScreenContract$InputData = studentReviewPromptScreen.N;
                        studentReviewPromptScreenContract$InputData.getClass();
                        return new w1(i0Var, y1Var2, studentReviewPromptScreenContract$InputData);
                }
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.SimpleViewController, com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (w1) this.S.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        StudentReviewPromptScreenContract$InputData studentReviewPromptScreenContract$InputData = this.N;
        pd.b.p(view, studentReviewPromptScreenContract$InputData.f103641a.f74501a.f53083b);
        ViewBinding value = this.Q.getValue(this, T[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        ScreenContentRecyclerView recyclerView = ((a) value).f122938c;
        Intrinsics.checkNotNullExpressionValue(recyclerView, "recyclerView");
        j jVar = this.P;
        y.h(recyclerView, jVar, new LinearLayoutManager(recyclerView.getContext()));
        jVar.c(u.c(studentReviewPromptScreenContract$InputData.f103641a.f74501a));
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        PromptMarketingContentDelegate promptMarketingContentDelegate = this.O;
        ViewController.P2(this, rd0.e.b(promptMarketingContentDelegate.f53079c), new c(this, null), 3);
        ViewController.P2(this, rd0.e.b(promptMarketingContentDelegate.d), new wka.e(this, null, 8), 3);
        ViewController.P2(this, rd0.e.b(promptMarketingContentDelegate.f.f121375b), new d(this, null), 3);
        ViewController.P2(this, rd0.e.b(promptMarketingContentDelegate.f53080g.f121375b), new wnk.e(this, null), 3);
        ViewController.P2(this, rd0.e.b(promptMarketingContentDelegate.e), new f(this, null), 3);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.SimpleViewController, com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: d3, reason: merged with bridge method [inline-methods] */
    public final g d() {
        return (g) this.R.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId */
    public final int getM() {
        return R$layout.screen_full_screen_prompt;
    }
}
