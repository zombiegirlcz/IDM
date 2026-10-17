package com.revolut.feature.in_app_calls.screen.in_progress;

import aii.q;
import android.content.Context;
import android.view.View;
import android.widget.Chronometer;
import android.widget.TextView;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import com.revolut.core.ui_kit.R$style;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.CallHaloAvatarView;
import com.revolut.core.ui_kit.views.CircleActionButtonsBarView;
import com.revolut.feature.in_app_calls.R$layout;
import com.revolut.feature.in_app_calls.screen.in_progress.InProgressScreen;
import com.revolut.feature.in_app_calls.screen.in_progress.InProgressScreenContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;
import dli.a;
import ip0.g0;
import ke7.b;
import ke7.d;
import ke7.f;
import ke7.g;
import ke7.p;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import mx0.q2;
import te0.w;
import ty0.c;
import vc.s;
import xki.e;
import zhm.f0;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/in_app_calls/screen/in_progress/InProgressScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "Ldli/a;", "Lke7/p;", "feature_in_app_calls_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class InProgressScreen extends ViewController<q> implements a {
    public static final /* synthetic */ KProperty[] R = {o0.f186429a.j(new h0(InProgressScreen.class, "binding", "getBinding()Lcom/revolut/feature/in_app_calls/databinding/LayoutCallInProgressBinding;", 0))};
    public final InProgressScreenContract$InputData K;
    public final int L;
    public final int M;
    public final h N;
    public final Object O;
    public final Object P;
    public final Object Q;

    public InProgressScreen(InProgressScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = R$layout.layout_call_in_progress;
        this.M = R$style.UiKitTheme_TransparentNight;
        this.N = s.t(this, b.f);
        final int i = 0;
        this.O = w.y0(new Function0(this) { // from class: ke7.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InProgressScreen f183013b;

            {
                this.f183013b = this;
            }

            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                InProgressScreen inProgressScreen = this.f183013b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = InProgressScreen.R;
                        qji.b bVarU2 = inProgressScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.in_app_calls.screen.in_progress.di.InProgressScreenInjector");
                        ee7.a aVar = ((ee7.b) bVarU2).f125123b;
                        InProgressScreenContract$InputData inProgressScreenContract$InputData = inProgressScreen.K;
                        inProgressScreenContract$InputData.getClass();
                        return new ee7.c(aVar, inProgressScreenContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = InProgressScreen.R;
                        ee7.c cVar = (ee7.c) inProgressScreen.O.getValue();
                        InProgressScreenContract$InputData inProgressScreenContract$InputData2 = cVar.f125124a;
                        ee7.a aVar2 = cVar.f125125b;
                        fe7.b bVar = (fe7.b) aVar2.f125120p.get();
                        be7.h hVar = (be7.h) aVar2.k.get();
                        be7.k kVar = (be7.k) aVar2.f125115h.get();
                        n30.y yVar = (n30.y) aVar2.e.f224699s.get();
                        vc.s.j(yVar);
                        l70.e eVar = aVar2.f125111a;
                        l80.e eVarH = eVar.h();
                        vc.s.j(eVarH);
                        l80.h hVarV = eVar.v();
                        vc.s.j(hVarV);
                        be7.e eVar2 = (be7.e) aVar2.f125117l.get();
                        z70.a aVarF = eVar.f();
                        vc.s.j(aVarF);
                        return new w(inProgressScreenContract$InputData2, bVar, hVar, kVar, yVar, eVarH, hVarV, eVar2, new y(aVarF), new q());
                    default:
                        KProperty[] kPropertyArr3 = InProgressScreen.R;
                        InProgressScreen inProgressScreen2 = this.f183013b;
                        return dli.f.a(inProgressScreen2, inProgressScreen2.d(), f0.f322471a, 0, null, null, null, 60);
                }
            }
        });
        final int i2 = 1;
        this.P = w.y0(new Function0(this) { // from class: ke7.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InProgressScreen f183013b;

            {
                this.f183013b = this;
            }

            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                InProgressScreen inProgressScreen = this.f183013b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = InProgressScreen.R;
                        qji.b bVarU2 = inProgressScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.in_app_calls.screen.in_progress.di.InProgressScreenInjector");
                        ee7.a aVar = ((ee7.b) bVarU2).f125123b;
                        InProgressScreenContract$InputData inProgressScreenContract$InputData = inProgressScreen.K;
                        inProgressScreenContract$InputData.getClass();
                        return new ee7.c(aVar, inProgressScreenContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = InProgressScreen.R;
                        ee7.c cVar = (ee7.c) inProgressScreen.O.getValue();
                        InProgressScreenContract$InputData inProgressScreenContract$InputData2 = cVar.f125124a;
                        ee7.a aVar2 = cVar.f125125b;
                        fe7.b bVar = (fe7.b) aVar2.f125120p.get();
                        be7.h hVar = (be7.h) aVar2.k.get();
                        be7.k kVar = (be7.k) aVar2.f125115h.get();
                        n30.y yVar = (n30.y) aVar2.e.f224699s.get();
                        vc.s.j(yVar);
                        l70.e eVar = aVar2.f125111a;
                        l80.e eVarH = eVar.h();
                        vc.s.j(eVarH);
                        l80.h hVarV = eVar.v();
                        vc.s.j(hVarV);
                        be7.e eVar2 = (be7.e) aVar2.f125117l.get();
                        z70.a aVarF = eVar.f();
                        vc.s.j(aVarF);
                        return new w(inProgressScreenContract$InputData2, bVar, hVar, kVar, yVar, eVarH, hVarV, eVar2, new y(aVarF), new q());
                    default:
                        KProperty[] kPropertyArr3 = InProgressScreen.R;
                        InProgressScreen inProgressScreen2 = this.f183013b;
                        return dli.f.a(inProgressScreen2, inProgressScreen2.d(), f0.f322471a, 0, null, null, null, 60);
                }
            }
        });
        final int i3 = 2;
        this.Q = w.y0(new Function0(this) { // from class: ke7.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InProgressScreen f183013b;

            {
                this.f183013b = this;
            }

            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                InProgressScreen inProgressScreen = this.f183013b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = InProgressScreen.R;
                        qji.b bVarU2 = inProgressScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.in_app_calls.screen.in_progress.di.InProgressScreenInjector");
                        ee7.a aVar = ((ee7.b) bVarU2).f125123b;
                        InProgressScreenContract$InputData inProgressScreenContract$InputData = inProgressScreen.K;
                        inProgressScreenContract$InputData.getClass();
                        return new ee7.c(aVar, inProgressScreenContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = InProgressScreen.R;
                        ee7.c cVar = (ee7.c) inProgressScreen.O.getValue();
                        InProgressScreenContract$InputData inProgressScreenContract$InputData2 = cVar.f125124a;
                        ee7.a aVar2 = cVar.f125125b;
                        fe7.b bVar = (fe7.b) aVar2.f125120p.get();
                        be7.h hVar = (be7.h) aVar2.k.get();
                        be7.k kVar = (be7.k) aVar2.f125115h.get();
                        n30.y yVar = (n30.y) aVar2.e.f224699s.get();
                        vc.s.j(yVar);
                        l70.e eVar = aVar2.f125111a;
                        l80.e eVarH = eVar.h();
                        vc.s.j(eVarH);
                        l80.h hVarV = eVar.v();
                        vc.s.j(hVarV);
                        be7.e eVar2 = (be7.e) aVar2.f125117l.get();
                        z70.a aVarF = eVar.f();
                        vc.s.j(aVarF);
                        return new w(inProgressScreenContract$InputData2, bVar, hVar, kVar, yVar, eVarH, hVarV, eVar2, new y(aVarF), new q());
                    default:
                        KProperty[] kPropertyArr3 = InProgressScreen.R;
                        InProgressScreen inProgressScreen2 = this.f183013b;
                        return dli.f.a(inProgressScreen2, inProgressScreen2.d(), f0.f322471a, 0, null, null, null, 60);
                }
            }
        });
    }

    @Override // com.revolut.kompot.navigable.a
    /* JADX INFO: renamed from: A2 */
    public final Integer getN() {
        return Integer.valueOf(this.M);
    }

    /* JADX WARN: Type inference failed for: r4v0, types: [com.revolut.core.ui_kit.models.Clause, java.lang.Object] */
    @Override // cli.w
    public final void B(o oVar, cli.q qVar) {
        p uiState = (p) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        ce7.a aVarD3 = d3();
        a.z0(uiState);
        ke7.h hVar = uiState.f183027b;
        if (hVar instanceof f) {
            c cVarE3 = e3();
            TextLocalisedClause textLocalisedClause = ((f) hVar).f183015a;
            Chronometer callTime = aVarD3.f23398b.d;
            Intrinsics.checkNotNullExpressionValue(callTime, "callTime");
            c.b(cVarE3, textLocalisedClause, callTime, null, null, 12);
            aVarD3.f23398b.d.stop();
        } else {
            if (!(hVar instanceof g)) {
                throw new NoWhenBranchMatchedException();
            }
            aVarD3.f23398b.d.setBase(((g) hVar).f183016a);
            aVarD3.f23398b.d.start();
        }
        ce7.b bVar = aVarD3.f23398b;
        TextView tvAgentDescription = bVar.f;
        bVar.f23400b.setActions(uiState.f183028c);
        c cVarE32 = e3();
        ?? r4 = uiState.d;
        TextView tvAgentName = bVar.f23402g;
        Intrinsics.checkNotNullExpressionValue(tvAgentName, "tvAgentName");
        c.b(cVarE32, r4, tvAgentName, null, null, 12);
        c cVarE33 = e3();
        Clause clause = uiState.e;
        Intrinsics.checkNotNullExpressionValue(tvAgentDescription, "tvAgentDescription");
        c.b(cVarE33, clause, tvAgentDescription, null, null, 12);
        Intrinsics.checkNotNullExpressionValue(tvAgentDescription, "tvAgentDescription");
        tvAgentDescription.setVisibility(uiState.e != null ? 0 : 8);
        bVar.f23401c.setModel(new CallHaloAvatarView.b(uiState.f, q2.SIZE_120));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (ee7.c) this.O.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ce7.b bVar = d3().f23398b;
        CircleActionButtonsBarView circleActionButtonsBarView = bVar.f23400b;
        circleActionButtonsBarView.setSingleLine(true);
        circleActionButtonsBarView.setHapticFeedback(true);
        bVar.e.setOnClickListener(new g0(this, 12));
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewController.P2(this, rd0.e.b(d3().f23398b.f23400b.a()), new d(this, null), 3);
    }

    public final ce7.a d3() {
        ViewBinding value = this.N.getValue(this, R[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (ce7.a) value;
    }

    public final c e3() {
        Context context = d3().f23397a.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        return jh.d.f(context).b0();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: f3, reason: merged with bridge method [inline-methods] */
    public final ke7.o d() {
        return (ke7.o) this.P.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getF0() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.Q.getValue();
    }
}
