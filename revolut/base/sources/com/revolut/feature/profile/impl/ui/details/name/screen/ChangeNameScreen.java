package com.revolut.feature.profile.impl.ui.details.name.screen;

import android.view.View;
import com.revolut.core.ui_kit.delegates.TwinHorizontalButtonDelegate;
import com.revolut.feature.profile.impl.ui.details.name.screen.ChangeNameScreen;
import com.revolut.kompot.common.IOData$EmptyInput;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.screen.BaseScreen;
import cyc.c;
import dna.d;
import dna.e;
import fd2.n;
import j60.a;
import jki.h;
import jki.k;
import jki.m;
import jki.o;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import sji.b;
import te0.w;
import zhm.u;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/profile/impl/ui/details/name/screen/ChangeNameScreen;", "Lcom/revolut/kompot/navigable/screen/BaseScreen;", "Ljki/k;", "Lcom/revolut/kompot/common/IOData$EmptyInput;", "Ldna/d;", "<init>", "()V", "retail_feature_profile_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class ChangeNameScreen extends BaseScreen<k, IOData$EmptyInput, d> {
    public final Object M;
    public final TwinHorizontalButtonDelegate N;
    public final Object O;
    public final Object P;
    public final int Q;

    public ChangeNameScreen() {
        super(IOData$EmptyInput.f98299a);
        final int i = 0;
        this.M = w.y0(new Function0(this) { // from class: dna.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ChangeNameScreen f116251b;

            {
                this.f116251b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v24, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        return (j60.a) ((fma.b) this.f116251b.O.getValue()).e.get();
                    case 1:
                        ChangeNameScreen changeNameScreen = this.f116251b;
                        qji.b bVarQ2 = changeNameScreen.Q2();
                        Intrinsics.i(bVarQ2, "null cannot be cast to non-null type com.revolut.feature.profile.impl.ui.details.name.screen.di.ChangeNameScreenInjector");
                        fma.b bVar = new fma.b();
                        bVar.f136042a = e4m.b.b(e4m.c.a(changeNameScreen));
                        bVar.f136043b = e4m.b.b(new n(bVar, 2, 6));
                        bVar.f136044c = e4m.b.b(new n(bVar, 1, 6));
                        bVar.d = e4m.b.b(new n(bVar, 0, 6));
                        bVar.e = e4m.b.b(new n(bVar, 4, 6));
                        bVar.f = e4m.b.b(new n(bVar, 5, 6));
                        bVar.f136045g = e4m.b.b(new n(bVar, 3, 6));
                        return bVar;
                    default:
                        return (e) ((fma.b) this.f116251b.O.getValue()).f136045g.get();
                }
            }
        });
        this.N = new TwinHorizontalButtonDelegate();
        final int i2 = 1;
        this.O = w.y0(new Function0(this) { // from class: dna.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ChangeNameScreen f116251b;

            {
                this.f116251b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v24, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        return (j60.a) ((fma.b) this.f116251b.O.getValue()).e.get();
                    case 1:
                        ChangeNameScreen changeNameScreen = this.f116251b;
                        qji.b bVarQ2 = changeNameScreen.Q2();
                        Intrinsics.i(bVarQ2, "null cannot be cast to non-null type com.revolut.feature.profile.impl.ui.details.name.screen.di.ChangeNameScreenInjector");
                        fma.b bVar = new fma.b();
                        bVar.f136042a = e4m.b.b(e4m.c.a(changeNameScreen));
                        bVar.f136043b = e4m.b.b(new n(bVar, 2, 6));
                        bVar.f136044c = e4m.b.b(new n(bVar, 1, 6));
                        bVar.d = e4m.b.b(new n(bVar, 0, 6));
                        bVar.e = e4m.b.b(new n(bVar, 4, 6));
                        bVar.f = e4m.b.b(new n(bVar, 5, 6));
                        bVar.f136045g = e4m.b.b(new n(bVar, 3, 6));
                        return bVar;
                    default:
                        return (e) ((fma.b) this.f116251b.O.getValue()).f136045g.get();
                }
            }
        });
        final int i3 = 2;
        this.P = w.y0(new Function0(this) { // from class: dna.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ChangeNameScreen f116251b;

            {
                this.f116251b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v24, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i3) {
                    case 0:
                        return (j60.a) ((fma.b) this.f116251b.O.getValue()).e.get();
                    case 1:
                        ChangeNameScreen changeNameScreen = this.f116251b;
                        qji.b bVarQ2 = changeNameScreen.Q2();
                        Intrinsics.i(bVarQ2, "null cannot be cast to non-null type com.revolut.feature.profile.impl.ui.details.name.screen.di.ChangeNameScreenInjector");
                        fma.b bVar = new fma.b();
                        bVar.f136042a = e4m.b.b(e4m.c.a(changeNameScreen));
                        bVar.f136043b = e4m.b.b(new n(bVar, 2, 6));
                        bVar.f136044c = e4m.b.b(new n(bVar, 1, 6));
                        bVar.d = e4m.b.b(new n(bVar, 0, 6));
                        bVar.e = e4m.b.b(new n(bVar, 4, 6));
                        bVar.f = e4m.b.b(new n(bVar, 5, 6));
                        bVar.f136045g = e4m.b.b(new n(bVar, 3, 6));
                        return bVar;
                    default:
                        return (e) ((fma.b) this.f116251b.O.getValue()).f136045g.get();
                }
            }
        });
        this.Q = R$layout.screen_transparent;
    }

    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    /* JADX INFO: renamed from: O2 */
    public final void Z2(m mVar, o oVar) {
        k uiState = (k) mVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    public final b S2() {
        return (fma.b) this.O.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    public final h T2() {
        return (e) this.P.getValue();
    }

    /* JADX WARN: Type inference failed for: r10v0, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    public final void V2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        vkm.d dVarB = rd0.e.b(((a) this.M.getValue()).E());
        ?? r102 = this.P;
        com.revolut.kompot.navigable.a.g2(this, dVarB, null, new c(2, (e) r102.getValue(), e.class, "onDisclaimerDismissed", "onDisclaimerDismissed(Lcom/revolut/core/ui_kit/dialogs/ExpandableDialogDisplayer$DismissReason;)V", 4, 5), 3);
        TwinHorizontalButtonDelegate twinHorizontalButtonDelegate = this.N;
        int i = 4;
        int i2 = 2;
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(twinHorizontalButtonDelegate.f53572c.f121375b), null, new c(i2, (e) r102.getValue(), e.class, "onDisclaimerPrimaryButtonClicked", "onDisclaimerPrimaryButtonClicked(Lcom/revolut/core/ui_kit/delegates/TwinHorizontalButtonDelegate$Model;)V", i, 6), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(twinHorizontalButtonDelegate.d.f121375b), null, new c(i2, (e) r102.getValue(), e.class, "onDisclaimerSecondaryButtonClicked", "onDisclaimerSecondaryButtonClicked(Lcom/revolut/core/ui_kit/delegates/TwinHorizontalButtonDelegate$Model;)V", i, 7), 3);
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    public final void W2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        ((a) this.M.getValue()).d(u.c(this.N));
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getU() {
        return this.Q;
    }
}
