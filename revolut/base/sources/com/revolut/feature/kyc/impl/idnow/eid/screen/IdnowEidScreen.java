package com.revolut.feature.kyc.impl.idnow.eid.screen;

import android.app.Activity;
import android.view.View;
import cli.a0;
import cli.l;
import cli.o;
import cli.q;
import cli.w;
import com.revolut.feature.kyc.impl.idnow.eid.screen.IdnowEidScreen;
import com.revolut.feature.kyc.impl.idnow.eid.screen.IdnowEidScreenContract$InputData;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import ew8.d;
import java.lang.ref.WeakReference;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import pki.a;
import pki.b;
import xki.e;
import zu8.c0;
import zu8.t;
import zu8.u;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/kyc/impl/idnow/eid/screen/IdnowEidScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lew8/d;", "Lcli/w;", "Lcli/l;", "feature_kyc_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class IdnowEidScreen extends ViewController<d> implements w {
    public final IdnowEidScreenContract$InputData K;
    public final Object L;
    public final Object M;
    public final int N;
    public final Object O;

    public IdnowEidScreen(IdnowEidScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        final int i = 0;
        this.L = te0.w.y0(new Function0(this) { // from class: ew8.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ IdnowEidScreen f130107b;

            {
                this.f130107b = this;
            }

            /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        IdnowEidScreen idnowEidScreen = this.f130107b;
                        qji.b bVarU2 = idnowEidScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.kyc.impl.idnow.eid.screen.di.IdnowEidScreenInjector");
                        t tVar = (t) bVarU2;
                        c0 c0Var = tVar.f325365b;
                        t tVar2 = tVar.f325366c;
                        IdnowEidScreenContract$InputData idnowEidScreenContract$InputData = idnowEidScreen.K;
                        idnowEidScreenContract$InputData.getClass();
                        return new u(c0Var, tVar2, idnowEidScreenContract$InputData);
                    case 1:
                        return (e) ((u) this.f130107b.L.getValue()).f325386c.get();
                    default:
                        IdnowEidScreen idnowEidScreen2 = this.f130107b;
                        return n14.e.a(idnowEidScreen2, (e) idnowEidScreen2.M.getValue());
                }
            }
        });
        final int i2 = 1;
        this.M = te0.w.y0(new Function0(this) { // from class: ew8.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ IdnowEidScreen f130107b;

            {
                this.f130107b = this;
            }

            /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        IdnowEidScreen idnowEidScreen = this.f130107b;
                        qji.b bVarU2 = idnowEidScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.kyc.impl.idnow.eid.screen.di.IdnowEidScreenInjector");
                        t tVar = (t) bVarU2;
                        c0 c0Var = tVar.f325365b;
                        t tVar2 = tVar.f325366c;
                        IdnowEidScreenContract$InputData idnowEidScreenContract$InputData = idnowEidScreen.K;
                        idnowEidScreenContract$InputData.getClass();
                        return new u(c0Var, tVar2, idnowEidScreenContract$InputData);
                    case 1:
                        return (e) ((u) this.f130107b.L.getValue()).f325386c.get();
                    default:
                        IdnowEidScreen idnowEidScreen2 = this.f130107b;
                        return n14.e.a(idnowEidScreen2, (e) idnowEidScreen2.M.getValue());
                }
            }
        });
        this.N = R$layout.screen_transparent;
        final int i3 = 2;
        this.O = te0.w.y0(new Function0(this) { // from class: ew8.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ IdnowEidScreen f130107b;

            {
                this.f130107b = this;
            }

            /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i3) {
                    case 0:
                        IdnowEidScreen idnowEidScreen = this.f130107b;
                        qji.b bVarU2 = idnowEidScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.kyc.impl.idnow.eid.screen.di.IdnowEidScreenInjector");
                        t tVar = (t) bVarU2;
                        c0 c0Var = tVar.f325365b;
                        t tVar2 = tVar.f325366c;
                        IdnowEidScreenContract$InputData idnowEidScreenContract$InputData = idnowEidScreen.K;
                        idnowEidScreenContract$InputData.getClass();
                        return new u(c0Var, tVar2, idnowEidScreenContract$InputData);
                    case 1:
                        return (e) ((u) this.f130107b.L.getValue()).f325386c.get();
                    default:
                        IdnowEidScreen idnowEidScreen2 = this.f130107b;
                        return n14.e.a(idnowEidScreen2, (e) idnowEidScreen2.M.getValue());
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, q qVar) {
        l uiState = (l) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (u) this.L.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final b R2() {
        return (ew8.e) this.M.getValue();
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ew8.e eVar = (ew8.e) this.M.getValue();
        Activity activity = m2();
        eVar.getClass();
        Intrinsics.checkNotNullParameter(activity, "activity");
        eVar.f130112r = new WeakReference(activity);
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getN() {
        return this.N;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final a k() {
        return (a0) this.O.getValue();
    }
}
