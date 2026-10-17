package com.revolut.feature.junior_allowance.impl.ui.screen.allowance_pager;

import aii.q;
import ali.g;
import cli.l;
import cli.o;
import com.revolut.feature.junior_allowance.impl.ui.screen.allowance_pager.JuniorAllowancePagerScreen;
import com.revolut.feature.junior_allowance.impl.ui.screen.allowance_pager.JuniorAllowancePagerScreenContract$Input;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.kompot.navigable.vc.pager.PagerItem;
import d34.b;
import dc8.f;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import pki.a;
import rb8.c;
import te0.w;
import xki.e;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/junior_allowance/impl/ui/screen/allowance_pager/JuniorAllowancePagerScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "Lali/g;", "Lcli/l;", "Lcom/revolut/feature/junior_allowance/impl/ui/screen/allowance_pager/JuniorAllowancePagerScreenContract$AllowancePage;", "feature_junior_allowance_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class JuniorAllowancePagerScreen extends ViewController<q> implements g {
    public final JuniorAllowancePagerScreenContract$Input K;
    public final Object L;
    public final Object M;
    public final Object N;

    public JuniorAllowancePagerScreen(JuniorAllowancePagerScreenContract$Input input) {
        Intrinsics.checkNotNullParameter(input, "input");
        this.K = input;
        final int i = 0;
        this.L = w.y0(new Function0(this) { // from class: dc8.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ JuniorAllowancePagerScreen f112812b;

            {
                this.f112812b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        return (f) ((rb8.c) this.f112812b.M.getValue()).f252990b.get();
                    case 1:
                        JuniorAllowancePagerScreen juniorAllowancePagerScreen = this.f112812b;
                        phm.a aVar = (phm.a) ue0.e.j(juniorAllowancePagerScreen.m2()).a().get(rb8.e.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", rb8.e.class, " is not found"));
                        }
                        rb8.a aVar3 = ((rb8.a) ((rb8.e) aVar2.b())).f252981m;
                        JuniorAllowancePagerScreenContract$Input juniorAllowancePagerScreenContract$Input = juniorAllowancePagerScreen.K;
                        juniorAllowancePagerScreenContract$Input.getClass();
                        return new rb8.c(aVar3, juniorAllowancePagerScreenContract$Input);
                    default:
                        int i2 = R$id.flow_pager;
                        JuniorAllowancePagerScreen juniorAllowancePagerScreen2 = this.f112812b;
                        return mif.a.a(juniorAllowancePagerScreen2, 0, i2, (f) juniorAllowancePagerScreen2.L.getValue(), 5);
                }
            }
        });
        final int i2 = 1;
        this.M = w.y0(new Function0(this) { // from class: dc8.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ JuniorAllowancePagerScreen f112812b;

            {
                this.f112812b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        return (f) ((rb8.c) this.f112812b.M.getValue()).f252990b.get();
                    case 1:
                        JuniorAllowancePagerScreen juniorAllowancePagerScreen = this.f112812b;
                        phm.a aVar = (phm.a) ue0.e.j(juniorAllowancePagerScreen.m2()).a().get(rb8.e.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", rb8.e.class, " is not found"));
                        }
                        rb8.a aVar3 = ((rb8.a) ((rb8.e) aVar2.b())).f252981m;
                        JuniorAllowancePagerScreenContract$Input juniorAllowancePagerScreenContract$Input = juniorAllowancePagerScreen.K;
                        juniorAllowancePagerScreenContract$Input.getClass();
                        return new rb8.c(aVar3, juniorAllowancePagerScreenContract$Input);
                    default:
                        int i22 = R$id.flow_pager;
                        JuniorAllowancePagerScreen juniorAllowancePagerScreen2 = this.f112812b;
                        return mif.a.a(juniorAllowancePagerScreen2, 0, i22, (f) juniorAllowancePagerScreen2.L.getValue(), 5);
                }
            }
        });
        final int i3 = 2;
        this.N = w.y0(new Function0(this) { // from class: dc8.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ JuniorAllowancePagerScreen f112812b;

            {
                this.f112812b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i3) {
                    case 0:
                        return (f) ((rb8.c) this.f112812b.M.getValue()).f252990b.get();
                    case 1:
                        JuniorAllowancePagerScreen juniorAllowancePagerScreen = this.f112812b;
                        phm.a aVar = (phm.a) ue0.e.j(juniorAllowancePagerScreen.m2()).a().get(rb8.e.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", rb8.e.class, " is not found"));
                        }
                        rb8.a aVar3 = ((rb8.a) ((rb8.e) aVar2.b())).f252981m;
                        JuniorAllowancePagerScreenContract$Input juniorAllowancePagerScreenContract$Input = juniorAllowancePagerScreen.K;
                        juniorAllowancePagerScreenContract$Input.getClass();
                        return new rb8.c(aVar3, juniorAllowancePagerScreenContract$Input);
                    default:
                        int i22 = R$id.flow_pager;
                        JuniorAllowancePagerScreen juniorAllowancePagerScreen2 = this.f112812b;
                        return mif.a.a(juniorAllowancePagerScreen2, 0, i22, (f) juniorAllowancePagerScreen2.L.getValue(), 5);
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, cli.q qVar) {
        l uiState = (l) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // ali.g
    public final void Q1(PagerItem pagerItem) {
        JuniorAllowancePagerScreenContract$AllowancePage page = (JuniorAllowancePagerScreenContract$AllowancePage) pagerItem;
        Intrinsics.checkNotNullParameter(page, "pagerItem");
        f fVar = (f) this.L.getValue();
        fVar.getClass();
        Intrinsics.checkNotNullParameter(page, "page");
        fVar.H2(fVar.f112818r, new b(page, 28));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (c) this.M.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController, qji.c
    public final qji.b R1() {
        return (c) this.M.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final pki.b d() {
        return (f) this.L.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId */
    public final int getL() {
        return R$layout.flow_pager;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final a k() {
        return (ali.c) this.N.getValue();
    }
}
