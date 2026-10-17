package com.revolut.feature.junior_graduation.impl.ui.screen.personalised;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import cli.q;
import com.revolut.core.ui_kit.delegates.PromptMarketingContentDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LogoWithTaglineView;
import com.revolut.feature.junior_graduation.impl.R$id;
import com.revolut.feature.junior_graduation.impl.R$layout;
import com.revolut.feature.junior_graduation.impl.R$string;
import com.revolut.feature.junior_graduation.impl.ui.screen.personalised.JuniorPersonalisedGraduationScreen;
import com.revolut.kompot.navigable.vc.ViewController;
import dli.a;
import hx0.n;
import ih8.b;
import ih8.c;
import ih8.g;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import lg8.d;
import te0.w;
import vc.s;
import xki.e;
import zhm.u;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/junior_graduation/impl/ui/screen/personalised/JuniorPersonalisedGraduationScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Llg8/d;", "Ldli/a;", "Lih8/g;", "feature_junior_graduation_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class JuniorPersonalisedGraduationScreen extends ViewController<d> implements a {
    public static final /* synthetic */ KProperty[] R = {o0.f186429a.j(new h0(JuniorPersonalisedGraduationScreen.class, "binding", "getBinding()Lcom/revolut/feature/junior_graduation/impl/databinding/ScreenJuniorPersonalisedGraduationBinding;", 0))};
    public final lg8.a K;
    public final int L;
    public final Object M;
    public final Object N;
    public final h O;
    public final PromptMarketingContentDelegate P;
    public final Object Q;

    public JuniorPersonalisedGraduationScreen(lg8.a inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = R$layout.screen_junior_personalised_graduation;
        final int i = 0;
        this.M = w.y0(new Function0(this) { // from class: ih8.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ JuniorPersonalisedGraduationScreen f161301b;

            {
                this.f161301b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v23, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                JuniorPersonalisedGraduationScreen juniorPersonalisedGraduationScreen = this.f161301b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = JuniorPersonalisedGraduationScreen.R;
                        phm.a aVar = (phm.a) ue0.e.j(juniorPersonalisedGraduationScreen.m2()).a().get(sg8.c.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", sg8.c.class, " is not found"));
                        }
                        sg8.c cVar = ((sg8.c) aVar2.b()).o;
                        lg8.a aVar3 = juniorPersonalisedGraduationScreen.K;
                        aVar3.getClass();
                        return new sg8.d(cVar, aVar3);
                    case 1:
                        KProperty[] kPropertyArr2 = JuniorPersonalisedGraduationScreen.R;
                        return (e) ((sg8.d) juniorPersonalisedGraduationScreen.M.getValue()).f262622c.get();
                    default:
                        KProperty[] kPropertyArr3 = JuniorPersonalisedGraduationScreen.R;
                        JuniorPersonalisedGraduationScreen juniorPersonalisedGraduationScreen2 = this.f161301b;
                        return dli.f.a(juniorPersonalisedGraduationScreen2, (e) juniorPersonalisedGraduationScreen2.N.getValue(), u.c(juniorPersonalisedGraduationScreen2.P), R$id.screenJuniorPersonalisedGraduation_recyclerView, null, null, null, 56);
                }
            }
        });
        final int i2 = 1;
        this.N = w.y0(new Function0(this) { // from class: ih8.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ JuniorPersonalisedGraduationScreen f161301b;

            {
                this.f161301b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v23, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                JuniorPersonalisedGraduationScreen juniorPersonalisedGraduationScreen = this.f161301b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = JuniorPersonalisedGraduationScreen.R;
                        phm.a aVar = (phm.a) ue0.e.j(juniorPersonalisedGraduationScreen.m2()).a().get(sg8.c.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", sg8.c.class, " is not found"));
                        }
                        sg8.c cVar = ((sg8.c) aVar2.b()).o;
                        lg8.a aVar3 = juniorPersonalisedGraduationScreen.K;
                        aVar3.getClass();
                        return new sg8.d(cVar, aVar3);
                    case 1:
                        KProperty[] kPropertyArr2 = JuniorPersonalisedGraduationScreen.R;
                        return (e) ((sg8.d) juniorPersonalisedGraduationScreen.M.getValue()).f262622c.get();
                    default:
                        KProperty[] kPropertyArr3 = JuniorPersonalisedGraduationScreen.R;
                        JuniorPersonalisedGraduationScreen juniorPersonalisedGraduationScreen2 = this.f161301b;
                        return dli.f.a(juniorPersonalisedGraduationScreen2, (e) juniorPersonalisedGraduationScreen2.N.getValue(), u.c(juniorPersonalisedGraduationScreen2.P), R$id.screenJuniorPersonalisedGraduation_recyclerView, null, null, null, 56);
                }
            }
        });
        this.O = s.t(this, b.f);
        this.P = new PromptMarketingContentDelegate();
        final int i3 = 2;
        this.Q = w.y0(new Function0(this) { // from class: ih8.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ JuniorPersonalisedGraduationScreen f161301b;

            {
                this.f161301b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v23, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                JuniorPersonalisedGraduationScreen juniorPersonalisedGraduationScreen = this.f161301b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = JuniorPersonalisedGraduationScreen.R;
                        phm.a aVar = (phm.a) ue0.e.j(juniorPersonalisedGraduationScreen.m2()).a().get(sg8.c.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", sg8.c.class, " is not found"));
                        }
                        sg8.c cVar = ((sg8.c) aVar2.b()).o;
                        lg8.a aVar3 = juniorPersonalisedGraduationScreen.K;
                        aVar3.getClass();
                        return new sg8.d(cVar, aVar3);
                    case 1:
                        KProperty[] kPropertyArr2 = JuniorPersonalisedGraduationScreen.R;
                        return (e) ((sg8.d) juniorPersonalisedGraduationScreen.M.getValue()).f262622c.get();
                    default:
                        KProperty[] kPropertyArr3 = JuniorPersonalisedGraduationScreen.R;
                        JuniorPersonalisedGraduationScreen juniorPersonalisedGraduationScreen2 = this.f161301b;
                        return dli.f.a(juniorPersonalisedGraduationScreen2, (e) juniorPersonalisedGraduationScreen2.N.getValue(), u.c(juniorPersonalisedGraduationScreen2.P), R$id.screenJuniorPersonalisedGraduation_recyclerView, null, null, null, 56);
                }
            }
        });
    }

    @Override // cli.w
    public final /* bridge */ void B(o oVar, q qVar) {
        a.z0((g) oVar);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (sg8.d) this.M.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final pki.b R2() {
        return (ih8.e) this.N.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) throws Throwable {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        pd.b.p(view, new TextLocalisedClause(R$string.signup_personalised_welcome_subtitle, null, null, 14));
        ViewBinding value = this.O.getValue(this, R[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        LogoWithTaglineView logoWithTaglineView = ((ng8.a) value).f215123b;
        Intrinsics.checkNotNullExpressionValue(logoWithTaglineView, "screenJuniorPersonalised…uationLogoWithTaglineView");
        n.a(logoWithTaglineView);
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        PromptMarketingContentDelegate promptMarketingContentDelegate = this.P;
        ViewController.P2(this, rd0.e.b(promptMarketingContentDelegate.f.f121375b), new c(this, null), 3);
        ViewController.P2(this, rd0.e.b(promptMarketingContentDelegate.f53080g.f121375b), new ih8.d(this, null), 3);
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getN() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.Q.getValue();
    }
}
