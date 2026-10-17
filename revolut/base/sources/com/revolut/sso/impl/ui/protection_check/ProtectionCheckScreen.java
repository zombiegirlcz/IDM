package com.revolut.sso.impl.ui.protection_check;

import android.content.Intent;
import android.view.View;
import com.revolut.core.ui_kit.delegates.PromptMarketingContentDelegate;
import com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen;
import com.revolut.sso.impl.R$id;
import com.revolut.sso.impl.R$layout;
import com.revolut.sso.impl.ui.protection_check.ProtectionCheckScreen;
import java.util.List;
import jki.h;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import ljl.k0;
import ljl.l0;
import ljl.q0;
import ljl.u;
import sji.b;
import te0.w;
import tl7.a;
import tol.d;
import tol.e;
import tol.f;
import tol.g;
import yhm.j;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005"}, d2 = {"Lcom/revolut/sso/impl/ui/protection_check/ProtectionCheckScreen;", "Lcom/revolut/kompot/navigable/screen/BaseRecyclerViewScreen;", "Ltol/f;", "Lcom/revolut/sso/impl/ui/protection_check/ProtectionCheckScreenContract$InputData;", "Ltol/d;", "revolut_sso_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class ProtectionCheckScreen extends BaseRecyclerViewScreen<f, ProtectionCheckScreenContract$InputData, d> {
    public final int U;
    public final Object V;
    public final Object W;
    public final Lazy X;
    public final List Y;

    /* JADX WARN: Illegal instructions before constructor call */
    public ProtectionCheckScreen() {
        ProtectionCheckScreenContract$InputData inputData = ProtectionCheckScreenContract$InputData.f106685a;
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        super(inputData);
        this.U = R$layout.screen_protection_check;
        final int i = 0;
        this.V = w.y0(new Function0(this) { // from class: tol.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ProtectionCheckScreen f273243b;

            {
                this.f273243b = this;
            }

            /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        qji.b bVarQ2 = this.f273243b.Q2();
                        Intrinsics.i(bVarQ2, "null cannot be cast to non-null type com.revolut.sso.impl.ui.protection_check.di.ProtectionCheckScreenInjector");
                        q0 q0Var = ((k0) bVarQ2).f196007a;
                        l0 l0Var = new l0();
                        int i2 = 4;
                        l0Var.f196020a = e4m.b.b(new u(q0Var, l0Var, 1, i2));
                        l0Var.f196021b = e4m.b.b(new u(q0Var, l0Var, 0, i2));
                        return l0Var;
                    default:
                        return (e) ((l0) this.f273243b.V.getValue()).f196021b.get();
                }
            }
        });
        final int i2 = 1;
        this.W = w.y0(new Function0(this) { // from class: tol.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ProtectionCheckScreen f273243b;

            {
                this.f273243b = this;
            }

            /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        qji.b bVarQ2 = this.f273243b.Q2();
                        Intrinsics.i(bVarQ2, "null cannot be cast to non-null type com.revolut.sso.impl.ui.protection_check.di.ProtectionCheckScreenInjector");
                        q0 q0Var = ((k0) bVarQ2).f196007a;
                        l0 l0Var = new l0();
                        int i22 = 4;
                        l0Var.f196020a = e4m.b.b(new u(q0Var, l0Var, 1, i22));
                        l0Var.f196021b = e4m.b.b(new u(q0Var, l0Var, 0, i22));
                        return l0Var;
                    default:
                        return (e) ((l0) this.f273243b.V.getValue()).f196021b.get();
                }
            }
        });
        Lazy lazyB = j.b(new a(8));
        this.X = lazyB;
        this.Y = zhm.u.c((PromptMarketingContentDelegate) lazyB.getValue());
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    public final b S2() {
        return (l0) this.V.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    public final h T2() {
        return (e) this.W.getValue();
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    public final void U2(int i, int i2, Intent intent) {
        if (i == 12321) {
            g gVar = (g) ((e) this.W.getValue());
            if (gVar.f273248p.a()) {
                gVar.v2(d.b.f273246a);
            }
        }
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, com.revolut.kompot.navigable.screen.BaseScreen
    public final void V2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.V2(view);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((PromptMarketingContentDelegate) this.X.getValue()).f.f121375b), null, new tol.b(this, null), 3);
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: c3, reason: from getter */
    public final List getY() {
        return this.Y;
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: e3 */
    public final int getV() {
        return R$id.protectionCheckScreen_recyclerView;
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getT() {
        return this.U;
    }
}
