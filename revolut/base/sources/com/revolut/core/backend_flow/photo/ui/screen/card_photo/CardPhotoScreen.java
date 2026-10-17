package com.revolut.core.backend_flow.photo.ui.screen.card_photo;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.constraintlayout.widget.Group;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.a0;
import cli.o;
import cli.w;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.core.backend_flow.photo.R$id;
import com.revolut.core.backend_flow.photo.R$layout;
import com.revolut.core.backend_flow.photo.R$string;
import com.revolut.core.backend_flow.photo.selfserve.selfie.common.selfiewithcard.selfiecamera.NumberCoverDrawView;
import com.revolut.core.backend_flow.photo.selfserve.selfie.common.selfiewithcard.selfiecamera.NumberCoverDrawable;
import com.revolut.core.backend_flow.photo.ui.screen.card_photo.CardPhotoScreen;
import com.revolut.core.backend_flow.photo.ui.screen.card_photo.CardPhotoScreenContract$InputData;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.ListCellDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.buttons.TwinVerticalButton;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.kompot.navigable.vc.ViewController;
import cp5.d;
import io.fotoapparat.view.CameraView;
import ip0.g0;
import kc0.a;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import kotlinx.coroutines.flow.MutableSharedFlow;
import lc0.b;
import lc0.b0;
import lc0.c;
import lc0.f;
import lc0.g;
import lc0.l;
import lc0.m;
import lc0.p;
import lc0.r;
import org.jetbrains.annotations.NotNull;
import skm.a2;
import vc.s;
import vkm.q;
import vkm.z1;
import xki.e;
import yhm.j;
import zhm.v;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u00052\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003:\u0001\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/core/backend_flow/photo/ui/screen/card_photo/CardPhotoScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Llc0/m;", "Lcli/w;", "Llc0/r;", "Companion", "a", "core_backend_flow_photo_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class CardPhotoScreen extends ViewController<m> implements w {
    public final CardPhotoScreenContract$InputData K;
    public final int L;
    public final Object M;
    public final Object N;
    public final Object O;
    public final h P;
    public final Object Q;
    public final LargeActionButtonDelegate R;
    public final ListCellDelegate S;
    public final Lazy T;
    public final Object U;
    public final z1 V;
    public a2 W;
    public lc0.h X;
    public static final /* synthetic */ KProperty[] Y = {o0.f186429a.j(new h0(CardPhotoScreen.class, "binding", "getBinding()Lcom/revolut/core/backend_flow/photo/databinding/ScreenCardPhotoBinding;", 0))};

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: com.revolut.core.backend_flow.photo.ui.screen.card_photo.CardPhotoScreen$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }
    }

    public CardPhotoScreen(CardPhotoScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = R$layout.screen_card_photo;
        final int i = 0;
        this.M = te0.w.y0(new Function0(this) { // from class: lc0.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CardPhotoScreen f193738b;

            {
                this.f193738b = this;
            }

            /* JADX WARN: Type inference failed for: r0v20, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                CardPhotoScreen cardPhotoScreen = this.f193738b;
                switch (i2) {
                    case 0:
                        CardPhotoScreen.Companion companion = CardPhotoScreen.INSTANCE;
                        return n14.e.a(cardPhotoScreen, cardPhotoScreen.d());
                    case 1:
                        CardPhotoScreen.Companion companion2 = CardPhotoScreen.INSTANCE;
                        qji.b bVarU2 = cardPhotoScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.core.backend_flow.photo.ui.screen.card_photo.di.CardPhotoScreenInjector");
                        fa0.c cVar = (fa0.c) bVarU2;
                        fa0.k kVar = cVar.f133022c;
                        fa0.c cVar2 = cVar.d;
                        CardPhotoScreenContract$InputData cardPhotoScreenContract$InputData = cardPhotoScreen.K;
                        cardPhotoScreenContract$InputData.getClass();
                        return new fa0.e(kVar, cVar2, cardPhotoScreen, cardPhotoScreenContract$InputData);
                    case 2:
                        CardPhotoScreen.Companion companion3 = CardPhotoScreen.INSTANCE;
                        return (o) ((fa0.e) cardPhotoScreen.N.getValue()).f133030h.get();
                    case 3:
                        CardPhotoScreen.Companion companion4 = CardPhotoScreen.INSTANCE;
                        return new NumberCoverDrawable(kli.a.k(cardPhotoScreen.m2(), 3.0f));
                    default:
                        CardPhotoScreen.Companion companion5 = CardPhotoScreen.INSTANCE;
                        return new iam.e(cardPhotoScreen.m2(), cardPhotoScreen.e3(), cardPhotoScreen.K.f51306c == n.CARD ? new fbm.d(lam.b.f193471b, 1) : cp5.d.i(), uam.j.CenterCrop, (nam.b) cardPhotoScreen.U.getValue(), new cia.d(1, cardPhotoScreen.V, MutableSharedFlow.class, "tryEmit", "tryEmit(Ljava/lang/Object;)Z", 8, 3), null, 388);
                }
            }
        });
        final int i2 = 1;
        this.N = te0.w.y0(new Function0(this) { // from class: lc0.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CardPhotoScreen f193738b;

            {
                this.f193738b = this;
            }

            /* JADX WARN: Type inference failed for: r0v20, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                CardPhotoScreen cardPhotoScreen = this.f193738b;
                switch (i22) {
                    case 0:
                        CardPhotoScreen.Companion companion = CardPhotoScreen.INSTANCE;
                        return n14.e.a(cardPhotoScreen, cardPhotoScreen.d());
                    case 1:
                        CardPhotoScreen.Companion companion2 = CardPhotoScreen.INSTANCE;
                        qji.b bVarU2 = cardPhotoScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.core.backend_flow.photo.ui.screen.card_photo.di.CardPhotoScreenInjector");
                        fa0.c cVar = (fa0.c) bVarU2;
                        fa0.k kVar = cVar.f133022c;
                        fa0.c cVar2 = cVar.d;
                        CardPhotoScreenContract$InputData cardPhotoScreenContract$InputData = cardPhotoScreen.K;
                        cardPhotoScreenContract$InputData.getClass();
                        return new fa0.e(kVar, cVar2, cardPhotoScreen, cardPhotoScreenContract$InputData);
                    case 2:
                        CardPhotoScreen.Companion companion3 = CardPhotoScreen.INSTANCE;
                        return (o) ((fa0.e) cardPhotoScreen.N.getValue()).f133030h.get();
                    case 3:
                        CardPhotoScreen.Companion companion4 = CardPhotoScreen.INSTANCE;
                        return new NumberCoverDrawable(kli.a.k(cardPhotoScreen.m2(), 3.0f));
                    default:
                        CardPhotoScreen.Companion companion5 = CardPhotoScreen.INSTANCE;
                        return new iam.e(cardPhotoScreen.m2(), cardPhotoScreen.e3(), cardPhotoScreen.K.f51306c == n.CARD ? new fbm.d(lam.b.f193471b, 1) : cp5.d.i(), uam.j.CenterCrop, (nam.b) cardPhotoScreen.U.getValue(), new cia.d(1, cardPhotoScreen.V, MutableSharedFlow.class, "tryEmit", "tryEmit(Ljava/lang/Object;)Z", 8, 3), null, 388);
                }
            }
        });
        final int i3 = 2;
        this.O = te0.w.y0(new Function0(this) { // from class: lc0.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CardPhotoScreen f193738b;

            {
                this.f193738b = this;
            }

            /* JADX WARN: Type inference failed for: r0v20, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                CardPhotoScreen cardPhotoScreen = this.f193738b;
                switch (i22) {
                    case 0:
                        CardPhotoScreen.Companion companion = CardPhotoScreen.INSTANCE;
                        return n14.e.a(cardPhotoScreen, cardPhotoScreen.d());
                    case 1:
                        CardPhotoScreen.Companion companion2 = CardPhotoScreen.INSTANCE;
                        qji.b bVarU2 = cardPhotoScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.core.backend_flow.photo.ui.screen.card_photo.di.CardPhotoScreenInjector");
                        fa0.c cVar = (fa0.c) bVarU2;
                        fa0.k kVar = cVar.f133022c;
                        fa0.c cVar2 = cVar.d;
                        CardPhotoScreenContract$InputData cardPhotoScreenContract$InputData = cardPhotoScreen.K;
                        cardPhotoScreenContract$InputData.getClass();
                        return new fa0.e(kVar, cVar2, cardPhotoScreen, cardPhotoScreenContract$InputData);
                    case 2:
                        CardPhotoScreen.Companion companion3 = CardPhotoScreen.INSTANCE;
                        return (o) ((fa0.e) cardPhotoScreen.N.getValue()).f133030h.get();
                    case 3:
                        CardPhotoScreen.Companion companion4 = CardPhotoScreen.INSTANCE;
                        return new NumberCoverDrawable(kli.a.k(cardPhotoScreen.m2(), 3.0f));
                    default:
                        CardPhotoScreen.Companion companion5 = CardPhotoScreen.INSTANCE;
                        return new iam.e(cardPhotoScreen.m2(), cardPhotoScreen.e3(), cardPhotoScreen.K.f51306c == n.CARD ? new fbm.d(lam.b.f193471b, 1) : cp5.d.i(), uam.j.CenterCrop, (nam.b) cardPhotoScreen.U.getValue(), new cia.d(1, cardPhotoScreen.V, MutableSharedFlow.class, "tryEmit", "tryEmit(Ljava/lang/Object;)Z", 8, 3), null, 388);
                }
            }
        });
        this.P = s.t(this, b.f);
        final int i5 = 3;
        this.Q = te0.w.y0(new Function0(this) { // from class: lc0.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CardPhotoScreen f193738b;

            {
                this.f193738b = this;
            }

            /* JADX WARN: Type inference failed for: r0v20, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i5;
                CardPhotoScreen cardPhotoScreen = this.f193738b;
                switch (i22) {
                    case 0:
                        CardPhotoScreen.Companion companion = CardPhotoScreen.INSTANCE;
                        return n14.e.a(cardPhotoScreen, cardPhotoScreen.d());
                    case 1:
                        CardPhotoScreen.Companion companion2 = CardPhotoScreen.INSTANCE;
                        qji.b bVarU2 = cardPhotoScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.core.backend_flow.photo.ui.screen.card_photo.di.CardPhotoScreenInjector");
                        fa0.c cVar = (fa0.c) bVarU2;
                        fa0.k kVar = cVar.f133022c;
                        fa0.c cVar2 = cVar.d;
                        CardPhotoScreenContract$InputData cardPhotoScreenContract$InputData = cardPhotoScreen.K;
                        cardPhotoScreenContract$InputData.getClass();
                        return new fa0.e(kVar, cVar2, cardPhotoScreen, cardPhotoScreenContract$InputData);
                    case 2:
                        CardPhotoScreen.Companion companion3 = CardPhotoScreen.INSTANCE;
                        return (o) ((fa0.e) cardPhotoScreen.N.getValue()).f133030h.get();
                    case 3:
                        CardPhotoScreen.Companion companion4 = CardPhotoScreen.INSTANCE;
                        return new NumberCoverDrawable(kli.a.k(cardPhotoScreen.m2(), 3.0f));
                    default:
                        CardPhotoScreen.Companion companion5 = CardPhotoScreen.INSTANCE;
                        return new iam.e(cardPhotoScreen.m2(), cardPhotoScreen.e3(), cardPhotoScreen.K.f51306c == n.CARD ? new fbm.d(lam.b.f193471b, 1) : cp5.d.i(), uam.j.CenterCrop, (nam.b) cardPhotoScreen.U.getValue(), new cia.d(1, cardPhotoScreen.V, MutableSharedFlow.class, "tryEmit", "tryEmit(Ljava/lang/Object;)Z", 8, 3), null, 388);
                }
            }
        });
        this.R = new LargeActionButtonDelegate();
        this.S = new ListCellDelegate();
        final int i6 = 4;
        this.T = j.b(new Function0(this) { // from class: lc0.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CardPhotoScreen f193738b;

            {
                this.f193738b = this;
            }

            /* JADX WARN: Type inference failed for: r0v20, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i6;
                CardPhotoScreen cardPhotoScreen = this.f193738b;
                switch (i22) {
                    case 0:
                        CardPhotoScreen.Companion companion = CardPhotoScreen.INSTANCE;
                        return n14.e.a(cardPhotoScreen, cardPhotoScreen.d());
                    case 1:
                        CardPhotoScreen.Companion companion2 = CardPhotoScreen.INSTANCE;
                        qji.b bVarU2 = cardPhotoScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.core.backend_flow.photo.ui.screen.card_photo.di.CardPhotoScreenInjector");
                        fa0.c cVar = (fa0.c) bVarU2;
                        fa0.k kVar = cVar.f133022c;
                        fa0.c cVar2 = cVar.d;
                        CardPhotoScreenContract$InputData cardPhotoScreenContract$InputData = cardPhotoScreen.K;
                        cardPhotoScreenContract$InputData.getClass();
                        return new fa0.e(kVar, cVar2, cardPhotoScreen, cardPhotoScreenContract$InputData);
                    case 2:
                        CardPhotoScreen.Companion companion3 = CardPhotoScreen.INSTANCE;
                        return (o) ((fa0.e) cardPhotoScreen.N.getValue()).f133030h.get();
                    case 3:
                        CardPhotoScreen.Companion companion4 = CardPhotoScreen.INSTANCE;
                        return new NumberCoverDrawable(kli.a.k(cardPhotoScreen.m2(), 3.0f));
                    default:
                        CardPhotoScreen.Companion companion5 = CardPhotoScreen.INSTANCE;
                        return new iam.e(cardPhotoScreen.m2(), cardPhotoScreen.e3(), cardPhotoScreen.K.f51306c == n.CARD ? new fbm.d(lam.b.f193471b, 1) : cp5.d.i(), uam.j.CenterCrop, (nam.b) cardPhotoScreen.U.getValue(), new cia.d(1, cardPhotoScreen.V, MutableSharedFlow.class, "tryEmit", "tryEmit(Ljava/lang/Object;)Z", 8, 3), null, 388);
                }
            }
        });
        this.U = te0.w.y0(new l92.h(19));
        this.V = q.b(0, 6, null);
    }

    /* JADX WARN: Type inference failed for: r10v15, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r11v12, types: [java.lang.Object, kotlin.Lazy] */
    @Override // cli.w
    public final void B(o oVar, cli.q qVar) {
        int i;
        int[] referencedIds;
        lc0.h hVar;
        r uiState = (r) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        lc0.h hVar2 = uiState.f193768a;
        lc0.q qVar2 = uiState.f193769b;
        if (hVar2 != null && !Intrinsics.f(this.X, hVar2)) {
            lc0.h hVar3 = this.X;
            boolean z = hVar3 != null;
            boolean z3 = hVar3 == null || hVar2.b() != hVar3.b() || (hVar = this.X) == null || hVar2.a() != hVar.a();
            if (z3) {
                g3().removeAllViews();
            }
            if (z3) {
                boolean zB = hVar2.b();
                ?? r102 = this.U;
                if (zB && hVar2.a()) {
                    m2().getLayoutInflater().inflate(R$layout.selfie_with_card_mask, (ViewGroup) g3(), true);
                    h3().c(d.i(), (nam.b) r102.getValue());
                } else if (hVar2.b()) {
                    m2().getLayoutInflater().inflate(R$layout.card_photo_mask, (ViewGroup) g3(), true);
                    View viewFindViewById = g3().findViewById(R$id.numberCoverView);
                    if (viewFindViewById != null) {
                        viewFindViewById.setBackground((NumberCoverDrawable) this.Q.getValue());
                    }
                    h3().c(new fbm.d(lam.b.f193471b, 1), (nam.b) r102.getValue());
                } else {
                    m2().getLayoutInflater().inflate(R$layout.selfie_mask, (ViewGroup) g3(), true);
                    h3().c(d.i(), (nam.b) r102.getValue());
                }
                m3();
            }
            boolean z4 = hVar2 instanceof g;
            g gVar = z4 ? (g) hVar2 : null;
            View viewFindViewById2 = g3().findViewById(R$id.numberCoverView);
            if (viewFindViewById2 != null) {
                viewFindViewById2.setVisibility((gVar != null ? gVar.d : null) == l.VISIBLE ? 0 : 8);
            }
            NumberCoverDrawView numberCoverDrawViewI3 = i3();
            if (numberCoverDrawViewI3 != null) {
                numberCoverDrawViewI3.setVisibility((gVar != null ? gVar.d : null) == l.EDIT ? 0 : 8);
            }
            boolean z6 = hVar2 instanceof f;
            if (z6) {
                g3().setAlpha(0.8f);
                i = -16777216;
            } else {
                if (!z4) {
                    throw new NoWhenBranchMatchedException();
                }
                g3().setAlpha(1.0f);
                i = -1;
            }
            ImageView imageView = (ImageView) g3().findViewById(R$id.faceMaskImageView);
            if (imageView != null) {
                imageView.setColorFilter(i);
            }
            ImageView imageView2 = (ImageView) g3().findViewById(R$id.cardMaskView);
            if (imageView2 != null) {
                imageView2.setColorFilter(i);
            }
            Group group = (Group) g3().findViewById(R$id.overlayGroup);
            if (group != null && (referencedIds = group.getReferencedIds()) != null) {
                for (int i2 : referencedIds) {
                    View viewFindViewById3 = g3().findViewById(i2);
                    if (viewFindViewById3 != null) {
                        viewFindViewById3.setBackgroundColor(i);
                    }
                }
            }
            if (z6) {
                h3().a();
                if (z) {
                    l3().setVisibility(0);
                    l3().setAlpha(BitmapDescriptorFactory.HUE_RED);
                    l3().animate().alpha(1.0f).setInterpolator(new AccelerateDecelerateInterpolator()).setDuration(200L).start();
                    e3().setVisibility(0);
                    e3().setAlpha(BitmapDescriptorFactory.HUE_RED);
                    e3().animate().alpha(1.0f).setInterpolator(new AccelerateDecelerateInterpolator()).setDuration(200L).start();
                } else {
                    e3().setVisibility(0);
                    l3().setVisibility(0);
                }
                k3().setVisibility(8);
                pd.b.p(l3(), new TextLocalisedClause(R$string.cnp_card_verification_card_photo_accessibility_label, null, null, 14));
                l3().setEnabled(true);
            } else {
                if (!z4) {
                    throw new NoWhenBranchMatchedException();
                }
                Bitmap bitmap = ((g) hVar2).f193751a;
                h3().b();
                if (z) {
                    ImageView imageViewK3 = k3();
                    Rect bitmapRect = vc.o.g(bitmap);
                    Rect appWindowRect = j3();
                    Intrinsics.checkNotNullParameter(bitmapRect, "bitmapRect");
                    Intrinsics.checkNotNullParameter(appWindowRect, "appWindowRect");
                    Matrix matrix = new Matrix();
                    matrix.preTranslate(appWindowRect.exactCenterX() - bitmapRect.exactCenterX(), appWindowRect.exactCenterY() - bitmapRect.exactCenterY());
                    float fA = a.a(bitmapRect, appWindowRect);
                    matrix.postScale(fA, fA, appWindowRect.exactCenterX(), appWindowRect.exactCenterY());
                    imageViewK3.setImageMatrix(matrix);
                    k3().setImageBitmap(bitmap);
                    l3().animate().alpha(BitmapDescriptorFactory.HUE_RED).setInterpolator(new AccelerateDecelerateInterpolator()).setDuration(200L).start();
                } else {
                    l3().setVisibility(8);
                }
                e3().setVisibility(8);
                k3().setVisibility(0);
            }
            this.X = hVar2;
        }
        TwinVerticalButton cardPhotoTwinVerticalButton = d3().f160200g;
        Intrinsics.checkNotNullExpressionValue(cardPhotoTwinVerticalButton, "cardPhotoTwinVerticalButton");
        cardPhotoTwinVerticalButton.setVisibility(qVar2 != null ? qVar2.e : false ? 0 : 8);
        if (qVar2 != null) {
            boolean z11 = qVar2.f;
            cardPhotoTwinVerticalButton.setMainButtonText(qVar2.f193765a);
            cardPhotoTwinVerticalButton.setMainButtonIcon(qVar2.f193767c);
            cardPhotoTwinVerticalButton.setSecondaryButtonText(qVar2.f193766b);
            cardPhotoTwinVerticalButton.setSecondaryButtonIcon(qVar2.d);
            cardPhotoTwinVerticalButton.setSecondaryButtonVisible(true);
            cardPhotoTwinVerticalButton.setFabEnabled(false);
            cardPhotoTwinVerticalButton.setMainButtonEnabled(z11);
            cardPhotoTwinVerticalButton.setSecondaryButtonEnabled(z11);
        }
        NavBarWithToolbar cardPhotoNavBarWithToolbar = d3().d;
        Intrinsics.checkNotNullExpressionValue(cardPhotoNavBarWithToolbar, "cardPhotoNavBarWithToolbar");
        p pVar = uiState.f193770c;
        if (pVar != null) {
            cardPhotoNavBarWithToolbar.setTitle(pVar.f193762a, null);
            cardPhotoNavBarWithToolbar.setDescriptionText(pVar.f193763b);
            cardPhotoNavBarWithToolbar.setNavigationButtonImage(pVar.f193764c);
            cardPhotoNavBarWithToolbar.setDescriptionVisible(true);
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (fa0.e) this.N.getValue();
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ((j60.a) ((fa0.e) this.N.getValue()).d.get()).d(v.k(this.R, this.S));
        l3().setOnClickListener(new g0(this, 14));
        k3().addOnLayoutChangeListener(new androidx.camera.viewfinder.a(this, 18));
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void a3() {
        h3().b();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        TwinVerticalButton cardPhotoTwinVerticalButton = d3().f160200g;
        Intrinsics.checkNotNullExpressionValue(cardPhotoTwinVerticalButton, "cardPhotoTwinVerticalButton");
        Continuation continuation = null;
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(cardPhotoTwinVerticalButton.o0()), null, new lc0.d(this, continuation, 0), 3);
        TwinVerticalButton cardPhotoTwinVerticalButton2 = d3().f160200g;
        Intrinsics.checkNotNullExpressionValue(cardPhotoTwinVerticalButton2, "cardPhotoTwinVerticalButton");
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(cardPhotoTwinVerticalButton2.p0()), null, new lc0.d(this, continuation, 1), 3);
        NavBarWithToolbar cardPhotoNavBarWithToolbar = d3().d;
        Intrinsics.checkNotNullExpressionValue(cardPhotoNavBarWithToolbar, "cardPhotoNavBarWithToolbar");
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(cardPhotoNavBarWithToolbar.f59410q), null, new lc0.d(this, continuation, 2), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.R.d.f121375b), null, new lc0.e(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, ((b0) d()).f193744w, null, new c(this, continuation, 1), 3);
        com.revolut.kompot.navigable.a.g2(this, ((b0) d()).v, null, new lc0.d(this, continuation, 3), 3);
        com.revolut.kompot.navigable.a.g2(this, this.V, null, new c(this, continuation, 2), 3);
        com.revolut.kompot.navigable.a.g2(this, ((b0) d()).f193745x, null, new lc0.d(this, continuation, 4), 3);
        m3();
    }

    public final ic0.a d3() {
        ViewBinding value = this.P.getValue(this, Y[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (ic0.a) value;
    }

    public final CameraView e3() {
        CameraView cardPhotoCameraView = d3().f160198b;
        Intrinsics.checkNotNullExpressionValue(cardPhotoCameraView, "cardPhotoCameraView");
        return cardPhotoCameraView;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: f3, reason: merged with bridge method [inline-methods] */
    public final lc0.o R2() {
        return (lc0.o) this.O.getValue();
    }

    public final FrameLayout g3() {
        FrameLayout cardPhotoFinderGroup = d3().f160199c;
        Intrinsics.checkNotNullExpressionValue(cardPhotoFinderGroup, "cardPhotoFinderGroup");
        return cardPhotoFinderGroup;
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.L;
    }

    public final iam.e h3() {
        return (iam.e) this.T.getValue();
    }

    public final NumberCoverDrawView i3() {
        return (NumberCoverDrawView) g3().findViewById(R$id.numberCoverDrawView);
    }

    public final Rect j3() {
        return new Rect(0, 0, e3().getWidth(), e3().getHeight());
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (a0) this.M.getValue();
    }

    public final ImageView k3() {
        ImageView cardPhotoPreviewView = d3().e;
        Intrinsics.checkNotNullExpressionValue(cardPhotoPreviewView, "cardPhotoPreviewView");
        return cardPhotoPreviewView;
    }

    public final Button l3() {
        Button cardPhotoTakePhotoButton = d3().f;
        Intrinsics.checkNotNullExpressionValue(cardPhotoTakePhotoButton, "cardPhotoTakePhotoButton");
        return cardPhotoTakePhotoButton;
    }

    public final void m3() {
        ihm.b bVar;
        a2 a2Var = this.W;
        a2 a2VarG2 = null;
        if (a2Var != null) {
            a2Var.f(null);
        }
        NumberCoverDrawView numberCoverDrawViewI3 = i3();
        if (numberCoverDrawViewI3 != null && (bVar = numberCoverDrawViewI3.f51293a) != null) {
            a2VarG2 = com.revolut.kompot.navigable.a.g2(this, rd0.e.b(bVar), null, new c(this, a2VarG2, 0), 3);
        }
        this.W = a2VarG2;
    }
}
