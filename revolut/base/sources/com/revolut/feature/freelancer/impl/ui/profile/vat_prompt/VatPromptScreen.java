package com.revolut.feature.freelancer.impl.ui.profile.vat_prompt;

import a17.c;
import a17.d;
import a17.e;
import a17.f;
import android.view.View;
import com.revolut.core.ui_kit.delegates.PromptMarketingContentDelegate;
import com.revolut.feature.freelancer.impl.ui.profile.vat_prompt.VatPromptScreen;
import com.revolut.kompot.common.IOData$EmptyInput;
import com.revolut.kompot.navigable.a;
import com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen;
import java.util.List;
import jki.h;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import sji.b;
import te0.w;
import us6.o1;
import us6.p0;
import us6.q;
import us6.q0;
import zhm.u;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/freelancer/impl/ui/profile/vat_prompt/VatPromptScreen;", "Lcom/revolut/kompot/navigable/screen/BaseRecyclerViewScreen;", "La17/f;", "Lcom/revolut/kompot/common/IOData$EmptyInput;", "La17/e;", "<init>", "()V", "feature_freelancer_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class VatPromptScreen extends BaseRecyclerViewScreen<f, IOData$EmptyInput, e> {
    public final PromptMarketingContentDelegate U;
    public final Object V;
    public final Object W;
    public final List X;

    public VatPromptScreen() {
        super(IOData$EmptyInput.f98299a);
        PromptMarketingContentDelegate promptMarketingContentDelegate = new PromptMarketingContentDelegate();
        this.U = promptMarketingContentDelegate;
        final int i = 0;
        this.V = w.y0(new Function0(this) { // from class: a17.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ VatPromptScreen f552b;

            {
                this.f552b = this;
            }

            /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        qji.b bVarQ2 = this.f552b.Q2();
                        Intrinsics.i(bVarQ2, "null cannot be cast to non-null type com.revolut.feature.freelancer.impl.ui.profile.vat_prompt.di.VatPromptScreenInjector");
                        q qVar = ((p0) bVarQ2).f282658b;
                        o1 o1Var = new o1();
                        int i2 = 11;
                        o1Var.f282644a = e4m.b.b(new q0(qVar, o1Var, 1, i2));
                        o1Var.f282645b = e4m.b.b(new q0(qVar, o1Var, 0, i2));
                        return o1Var;
                    default:
                        return (h) ((o1) this.f552b.V.getValue()).f282645b.get();
                }
            }
        });
        final int i2 = 1;
        this.W = w.y0(new Function0(this) { // from class: a17.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ VatPromptScreen f552b;

            {
                this.f552b = this;
            }

            /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        qji.b bVarQ2 = this.f552b.Q2();
                        Intrinsics.i(bVarQ2, "null cannot be cast to non-null type com.revolut.feature.freelancer.impl.ui.profile.vat_prompt.di.VatPromptScreenInjector");
                        q qVar = ((p0) bVarQ2).f282658b;
                        o1 o1Var = new o1();
                        int i22 = 11;
                        o1Var.f282644a = e4m.b.b(new q0(qVar, o1Var, 1, i22));
                        o1Var.f282645b = e4m.b.b(new q0(qVar, o1Var, 0, i22));
                        return o1Var;
                    default:
                        return (h) ((o1) this.f552b.V.getValue()).f282645b.get();
                }
            }
        });
        this.X = u.c(promptMarketingContentDelegate);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    public final b S2() {
        return (o1) this.V.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    public final h T2() {
        return (a17.h) this.W.getValue();
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, com.revolut.kompot.navigable.screen.BaseScreen
    public final void V2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.V2(view);
        PromptMarketingContentDelegate promptMarketingContentDelegate = this.U;
        a.g2(this, rd0.e.b(promptMarketingContentDelegate.f.f121375b), null, new a17.b(this, null), 3);
        a.g2(this, rd0.e.b(promptMarketingContentDelegate.f53080g.f121375b), null, new c(this, null), 3);
        a.g2(this, rd0.e.b(promptMarketingContentDelegate.f53079c), null, new d(this, null), 3);
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: c3, reason: from getter */
    public final List getX() {
        return this.X;
    }
}
