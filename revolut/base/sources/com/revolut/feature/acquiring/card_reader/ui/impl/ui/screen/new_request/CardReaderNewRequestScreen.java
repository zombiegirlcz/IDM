package com.revolut.feature.acquiring.card_reader.ui.impl.ui.screen.new_request;

import aii.q;
import android.content.Intent;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import ao.h;
import aw0.f4;
import com.revolut.core.ui_kit.delegates.AmountEditDelegate;
import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.acquiring.card_reader.ui.api.R$string;
import com.revolut.feature.acquiring.card_reader.ui.impl.R$id;
import com.revolut.feature.acquiring.card_reader.ui.impl.R$layout;
import com.revolut.feature.acquiring.card_reader.ui.impl.ui.screen.new_request.CardReaderNewRequestScreen;
import com.revolut.kompot.common.IOData$EmptyInput;
import com.revolut.kompot.common.rx_navigable.screen.BaseRxRecyclerViewScreen;
import com.revolut.kompot.view.ControllerContainerCoordinatorLayout;
import com.revolut.recyclerkit.ScreenContentRecyclerView;
import java.util.List;
import jki.o;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import n8i.e;
import nc1.f;
import nc1.m;
import sji.b;
import te0.w;
import vc.s;
import xb1.j;
import zhm.v;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/acquiring/card_reader/ui/impl/ui/screen/new_request/CardReaderNewRequestScreen;", "Lcom/revolut/kompot/common/rx_navigable/screen/BaseRxRecyclerViewScreen;", "Lnc1/f;", "Lcom/revolut/kompot/common/IOData$EmptyInput;", "Laii/q;", "<init>", "()V", "feature_acquiring_card_reader_ui_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class CardReaderNewRequestScreen extends BaseRxRecyclerViewScreen<f, IOData$EmptyInput, q> {

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public static final /* synthetic */ KProperty[] f60651e0 = {o0.f186429a.j(new h0(CardReaderNewRequestScreen.class, "binding", "getBinding()Lcom/revolut/feature/acquiring/card_reader/ui/impl/databinding/ScreenCardReaderNewRequestBinding;", 0))};
    public final int X;
    public final int Y;
    public final h Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public final Object f60652a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public final Object f60653b0;
    public final InputTextDelegate c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public final List f60654d0;

    public static final /* synthetic */ class a extends kotlin.jvm.internal.q implements Function1 {
        public static final a f = new a();

        public a() {
            super(1, vb1.a.class, "bind", "bind(Landroid/view/View;)Lcom/revolut/feature/acquiring/card_reader/ui/impl/databinding/ScreenCardReaderNewRequestBinding;", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj2) {
            View p0 = (View) obj2;
            Intrinsics.checkNotNullParameter(p0, "p0");
            int i = R$id.cardReaderNewRequestScreen_continueButton;
            LargeActionButton largeActionButton = (LargeActionButton) ViewBindings.findChildViewById(p0, i);
            if (largeActionButton != null) {
                i = R$id.cardReaderNewRequestScreen_navBar;
                NavBarWithToolbar navBarWithToolbar = (NavBarWithToolbar) ViewBindings.findChildViewById(p0, i);
                if (navBarWithToolbar != null) {
                    i = R$id.cardReaderNewRequestScreen_recyclerView;
                    if (((ScreenContentRecyclerView) ViewBindings.findChildViewById(p0, i)) != null) {
                        return new vb1.a(largeActionButton, navBarWithToolbar, (ControllerContainerCoordinatorLayout) p0);
                    }
                }
            }
            throw new NullPointerException("Missing required view with ID: ".concat(p0.getResources().getResourceName(i)));
        }
    }

    public CardReaderNewRequestScreen() {
        super(IOData$EmptyInput.f98299a);
        this.X = R$layout.screen_card_reader_new_request;
        this.Y = R$id.cardReaderNewRequestScreen_recyclerView;
        this.Z = s.t(this, a.f);
        final int i = 0;
        this.f60652a0 = w.y0(new Function0(this) { // from class: nc1.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CardReaderNewRequestScreen f214121b;

            {
                this.f214121b = this;
            }

            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                CardReaderNewRequestScreen cardReaderNewRequestScreen = this.f214121b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = CardReaderNewRequestScreen.f60651e0;
                        qji.b bVarQ2 = cardReaderNewRequestScreen.Q2();
                        Intrinsics.i(bVarQ2, "null cannot be cast to non-null type com.revolut.feature.acquiring.card_reader.ui.impl.ui.screen.new_request.di.CardReaderNewRequestScreenInjector");
                        xb1.n nVar = (xb1.n) bVarQ2;
                        return new xb1.j(nVar.f303950b, nVar.f303951c, cardReaderNewRequestScreen);
                    default:
                        KProperty[] kPropertyArr2 = CardReaderNewRequestScreen.f60651e0;
                        return (e) ((xb1.j) cardReaderNewRequestScreen.f60652a0.getValue()).f303938l.get();
                }
            }
        });
        final int i2 = 1;
        this.f60653b0 = w.y0(new Function0(this) { // from class: nc1.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CardReaderNewRequestScreen f214121b;

            {
                this.f214121b = this;
            }

            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                CardReaderNewRequestScreen cardReaderNewRequestScreen = this.f214121b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = CardReaderNewRequestScreen.f60651e0;
                        qji.b bVarQ2 = cardReaderNewRequestScreen.Q2();
                        Intrinsics.i(bVarQ2, "null cannot be cast to non-null type com.revolut.feature.acquiring.card_reader.ui.impl.ui.screen.new_request.di.CardReaderNewRequestScreenInjector");
                        xb1.n nVar = (xb1.n) bVarQ2;
                        return new xb1.j(nVar.f303950b, nVar.f303951c, cardReaderNewRequestScreen);
                    default:
                        KProperty[] kPropertyArr2 = CardReaderNewRequestScreen.f60651e0;
                        return (e) ((xb1.j) cardReaderNewRequestScreen.f60652a0.getValue()).f303938l.get();
                }
            }
        });
        AmountEditDelegate amountEditDelegate = new AmountEditDelegate(new e(this, 5));
        InputTextDelegate inputTextDelegate = new InputTextDelegate(null);
        this.c0 = inputTextDelegate;
        this.f60654d0 = v.k(amountEditDelegate, inputTextDelegate, new RowDelegate(null, null, 7));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    public final b S2() {
        return (j) this.f60652a0.getValue();
    }

    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    public final void U2(int i, int i2, Intent intent) {
        if (i == 60) {
            m mVar = (m) T2();
            if (i2 == -1) {
                mVar.C2();
            } else {
                mVar.getClass();
            }
        }
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, com.revolut.kompot.navigable.screen.BaseScreen
    public final void V2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.V2(view);
        m2().getWindow().addFlags(128);
        NavBarWithToolbar navBarWithToolbar = i3().f287352c;
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(R$drawable.uikit_icn_24_back_button_arrow));
        navBarWithToolbar.setTitle(new TextLocalisedClause(R$string.merchant_card_reader_payment_request_new_request_title, null, null, 14), null);
        navBarWithToolbar.setToolbarTitle(new TextLocalisedClause(R$string.merchant_card_reader_payment_request_new_request_title, null, null, 14));
        final int i = 3;
        BaseRxRecyclerViewScreen.g3(this, navBarWithToolbar.o.f57403b, new Function1(this) { // from class: nc1.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CardReaderNewRequestScreen f214119b;

            {
                this.f214119b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                int i2 = i;
                CardReaderNewRequestScreen cardReaderNewRequestScreen = this.f214119b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = CardReaderNewRequestScreen.f60651e0;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "it");
                        ((m) cardReaderNewRequestScreen.T2()).C2();
                        return Unit.f186387a;
                    case 1:
                        InputTextDelegate.TextData it8 = (InputTextDelegate.TextData) obj2;
                        KProperty[] kPropertyArr2 = CardReaderNewRequestScreen.f60651e0;
                        Intrinsics.checkNotNullParameter(it8, "it");
                        e eVarT2 = cardReaderNewRequestScreen.T2();
                        String text = it8.f52598b.toString();
                        m mVar = (m) eVarT2;
                        mVar.getClass();
                        Intrinsics.checkNotNullParameter(text, "text");
                        mVar.I.d(text);
                        return Unit.f186387a;
                    case 2:
                        f4 it9 = (f4) obj2;
                        KProperty[] kPropertyArr3 = CardReaderNewRequestScreen.f60651e0;
                        Intrinsics.checkNotNullParameter(it9, "it");
                        e eVarT22 = cardReaderNewRequestScreen.T2();
                        boolean z = it9.f10304b;
                        m mVar2 = (m) eVarT22;
                        mVar2.getClass();
                        if (z) {
                            mVar2.G2(d.DESCRIPTION);
                        }
                        return Unit.f186387a;
                    case 3:
                        KProperty[] kPropertyArr4 = CardReaderNewRequestScreen.f60651e0;
                        Intrinsics.checkNotNullParameter((String) obj2, "it");
                        m controllerModel = (m) cardReaderNewRequestScreen.T2();
                        controllerModel.f214140x.getClass();
                        Intrinsics.checkNotNullParameter(controllerModel, "controllerModel");
                        throw new IllegalStateException("Feedback is not supported in Retail app");
                    default:
                        KProperty[] kPropertyArr5 = CardReaderNewRequestScreen.f60651e0;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "it");
                        cardReaderNewRequestScreen.m2().onBackPressed();
                        return Unit.f186387a;
                }
            }
        });
        final int i2 = 4;
        BaseRxRecyclerViewScreen.g3(this, navBarWithToolbar.f59410q, new Function1(this) { // from class: nc1.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CardReaderNewRequestScreen f214119b;

            {
                this.f214119b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                int i22 = i2;
                CardReaderNewRequestScreen cardReaderNewRequestScreen = this.f214119b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = CardReaderNewRequestScreen.f60651e0;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "it");
                        ((m) cardReaderNewRequestScreen.T2()).C2();
                        return Unit.f186387a;
                    case 1:
                        InputTextDelegate.TextData it8 = (InputTextDelegate.TextData) obj2;
                        KProperty[] kPropertyArr2 = CardReaderNewRequestScreen.f60651e0;
                        Intrinsics.checkNotNullParameter(it8, "it");
                        e eVarT2 = cardReaderNewRequestScreen.T2();
                        String text = it8.f52598b.toString();
                        m mVar = (m) eVarT2;
                        mVar.getClass();
                        Intrinsics.checkNotNullParameter(text, "text");
                        mVar.I.d(text);
                        return Unit.f186387a;
                    case 2:
                        f4 it9 = (f4) obj2;
                        KProperty[] kPropertyArr3 = CardReaderNewRequestScreen.f60651e0;
                        Intrinsics.checkNotNullParameter(it9, "it");
                        e eVarT22 = cardReaderNewRequestScreen.T2();
                        boolean z = it9.f10304b;
                        m mVar2 = (m) eVarT22;
                        mVar2.getClass();
                        if (z) {
                            mVar2.G2(d.DESCRIPTION);
                        }
                        return Unit.f186387a;
                    case 3:
                        KProperty[] kPropertyArr4 = CardReaderNewRequestScreen.f60651e0;
                        Intrinsics.checkNotNullParameter((String) obj2, "it");
                        m controllerModel = (m) cardReaderNewRequestScreen.T2();
                        controllerModel.f214140x.getClass();
                        Intrinsics.checkNotNullParameter(controllerModel, "controllerModel");
                        throw new IllegalStateException("Feedback is not supported in Retail app");
                    default:
                        KProperty[] kPropertyArr5 = CardReaderNewRequestScreen.f60651e0;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "it");
                        cardReaderNewRequestScreen.m2().onBackPressed();
                        return Unit.f186387a;
                }
            }
        });
        final int i3 = 0;
        BaseRxRecyclerViewScreen.g3(this, i3().f287351b.o, new Function1(this) { // from class: nc1.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CardReaderNewRequestScreen f214119b;

            {
                this.f214119b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                int i22 = i3;
                CardReaderNewRequestScreen cardReaderNewRequestScreen = this.f214119b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = CardReaderNewRequestScreen.f60651e0;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "it");
                        ((m) cardReaderNewRequestScreen.T2()).C2();
                        return Unit.f186387a;
                    case 1:
                        InputTextDelegate.TextData it8 = (InputTextDelegate.TextData) obj2;
                        KProperty[] kPropertyArr2 = CardReaderNewRequestScreen.f60651e0;
                        Intrinsics.checkNotNullParameter(it8, "it");
                        e eVarT2 = cardReaderNewRequestScreen.T2();
                        String text = it8.f52598b.toString();
                        m mVar = (m) eVarT2;
                        mVar.getClass();
                        Intrinsics.checkNotNullParameter(text, "text");
                        mVar.I.d(text);
                        return Unit.f186387a;
                    case 2:
                        f4 it9 = (f4) obj2;
                        KProperty[] kPropertyArr3 = CardReaderNewRequestScreen.f60651e0;
                        Intrinsics.checkNotNullParameter(it9, "it");
                        e eVarT22 = cardReaderNewRequestScreen.T2();
                        boolean z = it9.f10304b;
                        m mVar2 = (m) eVarT22;
                        mVar2.getClass();
                        if (z) {
                            mVar2.G2(d.DESCRIPTION);
                        }
                        return Unit.f186387a;
                    case 3:
                        KProperty[] kPropertyArr4 = CardReaderNewRequestScreen.f60651e0;
                        Intrinsics.checkNotNullParameter((String) obj2, "it");
                        m controllerModel = (m) cardReaderNewRequestScreen.T2();
                        controllerModel.f214140x.getClass();
                        Intrinsics.checkNotNullParameter(controllerModel, "controllerModel");
                        throw new IllegalStateException("Feedback is not supported in Retail app");
                    default:
                        KProperty[] kPropertyArr5 = CardReaderNewRequestScreen.f60651e0;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "it");
                        cardReaderNewRequestScreen.m2().onBackPressed();
                        return Unit.f186387a;
                }
            }
        });
        InputTextDelegate inputTextDelegate = this.c0;
        final int i5 = 1;
        BaseRxRecyclerViewScreen.g3(this, inputTextDelegate.e.f121375b, new Function1(this) { // from class: nc1.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CardReaderNewRequestScreen f214119b;

            {
                this.f214119b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                int i22 = i5;
                CardReaderNewRequestScreen cardReaderNewRequestScreen = this.f214119b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = CardReaderNewRequestScreen.f60651e0;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "it");
                        ((m) cardReaderNewRequestScreen.T2()).C2();
                        return Unit.f186387a;
                    case 1:
                        InputTextDelegate.TextData it8 = (InputTextDelegate.TextData) obj2;
                        KProperty[] kPropertyArr2 = CardReaderNewRequestScreen.f60651e0;
                        Intrinsics.checkNotNullParameter(it8, "it");
                        e eVarT2 = cardReaderNewRequestScreen.T2();
                        String text = it8.f52598b.toString();
                        m mVar = (m) eVarT2;
                        mVar.getClass();
                        Intrinsics.checkNotNullParameter(text, "text");
                        mVar.I.d(text);
                        return Unit.f186387a;
                    case 2:
                        f4 it9 = (f4) obj2;
                        KProperty[] kPropertyArr3 = CardReaderNewRequestScreen.f60651e0;
                        Intrinsics.checkNotNullParameter(it9, "it");
                        e eVarT22 = cardReaderNewRequestScreen.T2();
                        boolean z = it9.f10304b;
                        m mVar2 = (m) eVarT22;
                        mVar2.getClass();
                        if (z) {
                            mVar2.G2(d.DESCRIPTION);
                        }
                        return Unit.f186387a;
                    case 3:
                        KProperty[] kPropertyArr4 = CardReaderNewRequestScreen.f60651e0;
                        Intrinsics.checkNotNullParameter((String) obj2, "it");
                        m controllerModel = (m) cardReaderNewRequestScreen.T2();
                        controllerModel.f214140x.getClass();
                        Intrinsics.checkNotNullParameter(controllerModel, "controllerModel");
                        throw new IllegalStateException("Feedback is not supported in Retail app");
                    default:
                        KProperty[] kPropertyArr5 = CardReaderNewRequestScreen.f60651e0;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "it");
                        cardReaderNewRequestScreen.m2().onBackPressed();
                        return Unit.f186387a;
                }
            }
        });
        final int i6 = 2;
        BaseRxRecyclerViewScreen.g3(this, inputTextDelegate.f.f121375b, new Function1(this) { // from class: nc1.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CardReaderNewRequestScreen f214119b;

            {
                this.f214119b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                int i22 = i6;
                CardReaderNewRequestScreen cardReaderNewRequestScreen = this.f214119b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = CardReaderNewRequestScreen.f60651e0;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "it");
                        ((m) cardReaderNewRequestScreen.T2()).C2();
                        return Unit.f186387a;
                    case 1:
                        InputTextDelegate.TextData it8 = (InputTextDelegate.TextData) obj2;
                        KProperty[] kPropertyArr2 = CardReaderNewRequestScreen.f60651e0;
                        Intrinsics.checkNotNullParameter(it8, "it");
                        e eVarT2 = cardReaderNewRequestScreen.T2();
                        String text = it8.f52598b.toString();
                        m mVar = (m) eVarT2;
                        mVar.getClass();
                        Intrinsics.checkNotNullParameter(text, "text");
                        mVar.I.d(text);
                        return Unit.f186387a;
                    case 2:
                        f4 it9 = (f4) obj2;
                        KProperty[] kPropertyArr3 = CardReaderNewRequestScreen.f60651e0;
                        Intrinsics.checkNotNullParameter(it9, "it");
                        e eVarT22 = cardReaderNewRequestScreen.T2();
                        boolean z = it9.f10304b;
                        m mVar2 = (m) eVarT22;
                        mVar2.getClass();
                        if (z) {
                            mVar2.G2(d.DESCRIPTION);
                        }
                        return Unit.f186387a;
                    case 3:
                        KProperty[] kPropertyArr4 = CardReaderNewRequestScreen.f60651e0;
                        Intrinsics.checkNotNullParameter((String) obj2, "it");
                        m controllerModel = (m) cardReaderNewRequestScreen.T2();
                        controllerModel.f214140x.getClass();
                        Intrinsics.checkNotNullParameter(controllerModel, "controllerModel");
                        throw new IllegalStateException("Feedback is not supported in Retail app");
                    default:
                        KProperty[] kPropertyArr5 = CardReaderNewRequestScreen.f60651e0;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "it");
                        cardReaderNewRequestScreen.m2().onBackPressed();
                        return Unit.f186387a;
                }
            }
        });
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, com.revolut.kompot.navigable.screen.BaseScreen
    public final void W2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.W2(view);
        i3().f287351b.setEnabled(false);
    }

    @Override // com.revolut.kompot.common.rx_navigable.screen.BaseRxRecyclerViewScreen, com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, com.revolut.kompot.navigable.screen.BaseScreen
    public final void Y2() {
        super.Y2();
        m2().getWindow().clearFlags(128);
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: c3, reason: from getter */
    public final List getF95992b0() {
        return this.f60654d0;
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: e3, reason: from getter */
    public final int getZ() {
        return this.Y;
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getK() {
        return this.X;
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: h3, reason: merged with bridge method [inline-methods] */
    public final void Z2(f uiState, o oVar) {
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        super.Z2(uiState, oVar);
        i3().f287351b.setEnabled(uiState.f214126b);
        i3().f287351b.setText(uiState.f214127c);
        i3().f287352c.setMenuItems(uiState.d);
    }

    public final vb1.a i3() {
        ViewBinding value = this.Z.getValue(this, f60651e0[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (vb1.a) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    /* JADX INFO: renamed from: j3, reason: merged with bridge method [inline-methods] */
    public final nc1.e T2() {
        return (nc1.e) this.f60653b0.getValue();
    }
}
