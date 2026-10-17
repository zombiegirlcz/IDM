package com.revolut.feature.card_screen.impl.kompot.card_activation_methods.screen;

import android.view.View;
import cli.o;
import cli.q;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.feature.card_screen.impl.kompot.card_activation_methods.screen.CardActivationMethodsScreen;
import com.revolut.feature.card_screen.impl.kompot.card_activation_methods.screen.CardActivationMethodsScreenContract$InputData;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import dli.a;
import dli.f;
import j73.b;
import k73.d;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import o63.c;
import te0.w;
import xki.e;
import zhm.u;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/card_screen/impl/kompot/card_activation_methods/screen/CardActivationMethodsScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lo63/c;", "Ldli/a;", "Lk73/c;", "feature_card_screen_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class CardActivationMethodsScreen extends ViewController<c> implements a {
    public final CardActivationMethodsScreenContract$InputData K;
    public final int L;
    public final RowDelegate M;
    public final Object N;
    public final Object O;
    public final Object P;

    public CardActivationMethodsScreen(CardActivationMethodsScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = R$layout.screen_recycler_navbar_bottomsheet;
        this.M = new RowDelegate(null, null, 7);
        final int i = 0;
        this.N = w.y0(new Function0(this) { // from class: k73.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CardActivationMethodsScreen f181813b;

            {
                this.f181813b = this;
            }

            /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        CardActivationMethodsScreen cardActivationMethodsScreen = this.f181813b;
                        return f.a(cardActivationMethodsScreen, (d) cardActivationMethodsScreen.P.getValue(), u.c(cardActivationMethodsScreen.M), R$id.navBarBottomSheet_RecyclerView, null, null, null, 56);
                    case 1:
                        CardActivationMethodsScreen cardActivationMethodsScreen2 = this.f181813b;
                        phm.a aVar = (phm.a) ue0.e.j(cardActivationMethodsScreen2.m2()).a().get(j73.a.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", j73.a.class, " is not found"));
                        }
                        j73.a aVar3 = ((j73.a) aVar2.b()).f171844a;
                        CardActivationMethodsScreenContract$InputData cardActivationMethodsScreenContract$InputData = cardActivationMethodsScreen2.K;
                        cardActivationMethodsScreenContract$InputData.getClass();
                        return new j73.b(aVar3, cardActivationMethodsScreenContract$InputData);
                    default:
                        return (d) ((j73.b) this.f181813b.O.getValue()).f171847c.get();
                }
            }
        });
        final int i2 = 1;
        this.O = w.y0(new Function0(this) { // from class: k73.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CardActivationMethodsScreen f181813b;

            {
                this.f181813b = this;
            }

            /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        CardActivationMethodsScreen cardActivationMethodsScreen = this.f181813b;
                        return f.a(cardActivationMethodsScreen, (d) cardActivationMethodsScreen.P.getValue(), u.c(cardActivationMethodsScreen.M), R$id.navBarBottomSheet_RecyclerView, null, null, null, 56);
                    case 1:
                        CardActivationMethodsScreen cardActivationMethodsScreen2 = this.f181813b;
                        phm.a aVar = (phm.a) ue0.e.j(cardActivationMethodsScreen2.m2()).a().get(j73.a.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", j73.a.class, " is not found"));
                        }
                        j73.a aVar3 = ((j73.a) aVar2.b()).f171844a;
                        CardActivationMethodsScreenContract$InputData cardActivationMethodsScreenContract$InputData = cardActivationMethodsScreen2.K;
                        cardActivationMethodsScreenContract$InputData.getClass();
                        return new j73.b(aVar3, cardActivationMethodsScreenContract$InputData);
                    default:
                        return (d) ((j73.b) this.f181813b.O.getValue()).f171847c.get();
                }
            }
        });
        final int i3 = 2;
        this.P = w.y0(new Function0(this) { // from class: k73.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CardActivationMethodsScreen f181813b;

            {
                this.f181813b = this;
            }

            /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i3) {
                    case 0:
                        CardActivationMethodsScreen cardActivationMethodsScreen = this.f181813b;
                        return f.a(cardActivationMethodsScreen, (d) cardActivationMethodsScreen.P.getValue(), u.c(cardActivationMethodsScreen.M), R$id.navBarBottomSheet_RecyclerView, null, null, null, 56);
                    case 1:
                        CardActivationMethodsScreen cardActivationMethodsScreen2 = this.f181813b;
                        phm.a aVar = (phm.a) ue0.e.j(cardActivationMethodsScreen2.m2()).a().get(j73.a.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", j73.a.class, " is not found"));
                        }
                        j73.a aVar3 = ((j73.a) aVar2.b()).f171844a;
                        CardActivationMethodsScreenContract$InputData cardActivationMethodsScreenContract$InputData = cardActivationMethodsScreen2.K;
                        cardActivationMethodsScreenContract$InputData.getClass();
                        return new j73.b(aVar3, cardActivationMethodsScreenContract$InputData);
                    default:
                        return (d) ((j73.b) this.f181813b.O.getValue()).f171847c.get();
                }
            }
        });
    }

    @Override // cli.w
    public final /* bridge */ void B(o oVar, q qVar) {
        a.z0((k73.c) oVar);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (b) this.O.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final pki.b R2() {
        return (d) this.P.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewController.P2(this, rd0.e.b(this.M.f53218h), new k73.b(this, null), 3);
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getK() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.N.getValue();
    }
}
