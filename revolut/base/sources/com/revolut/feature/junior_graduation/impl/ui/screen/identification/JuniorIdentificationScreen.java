package com.revolut.feature.junior_graduation.impl.ui.screen.identification;

import android.view.View;
import cli.o;
import cli.q;
import com.revolut.core.ui_kit.delegates.PromptMarketingContentDelegate;
import com.revolut.feature.junior_graduation.impl.ui.screen.identification.JuniorIdentificationScreen;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import gaa.b;
import gh8.c;
import gh8.d;
import gh8.h;
import gh8.i;
import gh8.j;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import te0.w;
import xki.e;
import zhm.u;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/junior_graduation/impl/ui/screen/identification/JuniorIdentificationScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lgh8/h;", "Ldli/a;", "Lgh8/j;", "feature_junior_graduation_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class JuniorIdentificationScreen extends ViewController<h> implements dli.a {
    public final int K;
    public final Object L;
    public final Object M;
    public final Object N;
    public final Object O;

    public JuniorIdentificationScreen(JuniorIdentificationScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = R$layout.screen_prompt;
        final int i = 0;
        this.L = w.y0(new Function0(this) { // from class: gh8.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ JuniorIdentificationScreen f143882b;

            {
                this.f143882b = this;
            }

            /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        JuniorIdentificationScreen juniorIdentificationScreen = this.f143882b;
                        return dli.f.a(juniorIdentificationScreen, (i) juniorIdentificationScreen.N.getValue(), u.c((PromptMarketingContentDelegate) juniorIdentificationScreen.O.getValue()), R$id.recyclerView, null, null, null, 56);
                    default:
                        return (i) ((sg8.e) this.f143882b.M.getValue()).f262625c.get();
                }
            }
        });
        this.M = w.y0(new fx5.a(this, inputData, 28));
        final int i2 = 1;
        this.N = w.y0(new Function0(this) { // from class: gh8.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ JuniorIdentificationScreen f143882b;

            {
                this.f143882b = this;
            }

            /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        JuniorIdentificationScreen juniorIdentificationScreen = this.f143882b;
                        return dli.f.a(juniorIdentificationScreen, (i) juniorIdentificationScreen.N.getValue(), u.c((PromptMarketingContentDelegate) juniorIdentificationScreen.O.getValue()), R$id.recyclerView, null, null, null, 56);
                    default:
                        return (i) ((sg8.e) this.f143882b.M.getValue()).f262625c.get();
                }
            }
        });
        this.O = w.y0(new b(18));
    }

    @Override // cli.w
    public final /* bridge */ void B(o oVar, q qVar) {
        dli.a.z0((j) oVar);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (sg8.e) this.M.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final pki.b d() {
        return (i) this.N.getValue();
    }

    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ?? r56 = this.O;
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((PromptMarketingContentDelegate) r56.getValue()).f.f121375b), null, new c(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((PromptMarketingContentDelegate) r56.getValue()).f53080g.f121375b), null, new d(this, null), 3);
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getW() {
        return this.K;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.L.getValue();
    }

    @Override // com.revolut.kompot.navigable.a
    public final Boolean s2() {
        return Boolean.FALSE;
    }
}
