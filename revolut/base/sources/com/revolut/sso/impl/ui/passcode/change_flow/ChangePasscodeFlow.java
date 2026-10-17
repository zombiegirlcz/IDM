package com.revolut.sso.impl.ui.passcode.change_flow;

import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.sso.api.passcode.change.ChangePasscodeInputData;
import com.revolut.sso.impl.ui.passcode.change_flow.ChangePasscodeFlow;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import ljl.g;
import ljl.q0;
import qji.b;
import te0.w;
import uki.c;
import xki.e;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/sso/impl/ui/passcode/change_flow/ChangePasscodeFlow;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "", "Luki/c;", "revolut_sso_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class ChangePasscodeFlow extends ViewController<Object> implements c {
    public final ChangePasscodeInputData K;
    public final Object L;
    public final Object M;
    public final Object N;
    public final int O;

    public ChangePasscodeFlow(ChangePasscodeInputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        final int i = 0;
        this.L = w.y0(new Function0(this) { // from class: xnl.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ChangePasscodeFlow f307514b;

            {
                this.f307514b = this;
            }

            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        ChangePasscodeFlow changePasscodeFlow = this.f307514b;
                        return czi.c.a(R$id.screen_transparent_container, (b) changePasscodeFlow.N.getValue(), changePasscodeFlow);
                    case 1:
                        ChangePasscodeFlow changePasscodeFlow2 = this.f307514b;
                        q0 q0Var = ((q0) kli.a.n(changePasscodeFlow2.m2())).E;
                        ChangePasscodeInputData changePasscodeInputData = changePasscodeFlow2.K;
                        changePasscodeInputData.getClass();
                        return new ljl.g(q0Var, changePasscodeInputData);
                    default:
                        return (b) ((ljl.g) this.f307514b.M.getValue()).d.get();
                }
            }
        });
        final int i2 = 1;
        this.M = w.y0(new Function0(this) { // from class: xnl.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ChangePasscodeFlow f307514b;

            {
                this.f307514b = this;
            }

            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        ChangePasscodeFlow changePasscodeFlow = this.f307514b;
                        return czi.c.a(R$id.screen_transparent_container, (b) changePasscodeFlow.N.getValue(), changePasscodeFlow);
                    case 1:
                        ChangePasscodeFlow changePasscodeFlow2 = this.f307514b;
                        q0 q0Var = ((q0) kli.a.n(changePasscodeFlow2.m2())).E;
                        ChangePasscodeInputData changePasscodeInputData = changePasscodeFlow2.K;
                        changePasscodeInputData.getClass();
                        return new ljl.g(q0Var, changePasscodeInputData);
                    default:
                        return (b) ((ljl.g) this.f307514b.M.getValue()).d.get();
                }
            }
        });
        final int i3 = 2;
        this.N = w.y0(new Function0(this) { // from class: xnl.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ChangePasscodeFlow f307514b;

            {
                this.f307514b = this;
            }

            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i3) {
                    case 0:
                        ChangePasscodeFlow changePasscodeFlow = this.f307514b;
                        return czi.c.a(R$id.screen_transparent_container, (b) changePasscodeFlow.N.getValue(), changePasscodeFlow);
                    case 1:
                        ChangePasscodeFlow changePasscodeFlow2 = this.f307514b;
                        q0 q0Var = ((q0) kli.a.n(changePasscodeFlow2.m2())).E;
                        ChangePasscodeInputData changePasscodeInputData = changePasscodeFlow2.K;
                        changePasscodeInputData.getClass();
                        return new ljl.g(q0Var, changePasscodeInputData);
                    default:
                        return (b) ((ljl.g) this.f307514b.M.getValue()).d.get();
                }
            }
        });
        this.O = R$layout.screen_transparent;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (g) this.M.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController, qji.c
    public final b R1() {
        return (g) this.M.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final pki.b R2() {
        return (xnl.b) this.N.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getO() {
        return this.O;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (uki.a) this.L.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final yki.c k() {
        return (uki.a) this.L.getValue();
    }
}
