package com.revolut.retail.feature.payments.peer_to_peer.impl.ui_kompot.amount;

import android.animation.AnimatorSet;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import aw0.j8;
import com.revolut.core.ui_kit.R$style;
import com.revolut.core.ui_kit.delegates.CellDetailsActionDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsNoteDelegate;
import com.revolut.core.ui_kit.delegates.CenteredAmountDelegate;
import com.revolut.core.ui_kit.delegates.HighlightTileDelegate;
import com.revolut.core.ui_kit.delegates.ImageAttachmentDelegate;
import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.delegates.SelectableDelegate;
import com.revolut.core.ui_kit.delegates.SuggestionsBarDelegate;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.NavBarWithContainerBackground;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.BackgroundWallpaperView;
import com.revolut.core.ui_kit.views.FooterTextView;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.legacy.LegacyButtonContainerConstraintLayout;
import com.revolut.core.ui_kit.views.navbar.NavBarWithAvatar;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen;
import com.revolut.kompot.view.ControllerContainerConstraintLayout;
import com.revolut.recyclerkit.ScreenContentRecyclerView;
import com.revolut.retail.feature.payments.core.R$string;
import com.revolut.retail.feature.payments.peer_to_peer.api.models.PeerToPeerCustomization;
import com.revolut.retail.feature.payments.peer_to_peer.impl.R$id;
import com.revolut.retail.feature.payments.peer_to_peer.impl.R$layout;
import com.revolut.retail.feature.payments.peer_to_peer.impl.ui_kompot.amount.PeerToPeerAmountScreen;
import com.revolut.retail.feature.payments.peer_to_peer.impl.ui_kompot.amount.PeerToPeerAmountScreenContract$InputData;
import efm.r;
import ihm.f;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import mga.i0;
import org.jetbrains.annotations.NotNull;
import rd0.e;
import te0.w;
import v8k.d;
import vc.s;
import z8k.c0;
import z8k.e0;
import z8k.f0;
import z8k.i;
import z8k.k;
import z8k.l;
import z8k.m;
import z8k.n;
import z8k.o;
import z8k.p;
import z8k.q;
import z8k.v;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000 \u00062\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00012\u00020\u0005:\u0001\u0007¨\u0006\b"}, d2 = {"Lcom/revolut/retail/feature/payments/peer_to_peer/impl/ui_kompot/amount/PeerToPeerAmountScreen;", "Lcom/revolut/kompot/navigable/screen/BaseRecyclerViewScreen;", "Lz8k/f0;", "Lcom/revolut/retail/feature/payments/peer_to_peer/impl/ui_kompot/amount/PeerToPeerAmountScreenContract$InputData;", "Lz8k/c0;", "Lmga/i0;", "Companion", "a", "feature_payments_peer_to_peer_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class PeerToPeerAmountScreen extends BaseRecyclerViewScreen<f0, PeerToPeerAmountScreenContract$InputData, c0> implements i0 {
    public final int U;
    public final int V;
    public final h W;
    public final Object X;
    public final Integer Y;
    public qd0.b Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public n5k.b f102302a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public final Object f102303b0;
    public final InputTextDelegate c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public final ImageAttachmentDelegate f102304d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public final SuggestionsBarDelegate f102305e0;
    public final Object f0;
    public final Object g0;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public final Object f102306h0;
    public final Object i0;
    public final Object j0;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public final Object f102307k0;
    public final Object l0;
    public final Object m0;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    public final Object f102308n0;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    public final Object f102309o0;
    public final Object p0;
    public final Object q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public static final /* synthetic */ KProperty[] f102301r0 = {o0.f186429a.j(new h0(PeerToPeerAmountScreen.class, "binding", "getBinding()Lcom/revolut/retail/feature/payments/peer_to_peer/impl/databinding/ScreenTransferPeerToPeerAmountBinding;", 0))};

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: com.revolut.retail.feature.payments.peer_to_peer.impl.ui_kompot.amount.PeerToPeerAmountScreen$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PeerToPeerAmountScreen(PeerToPeerAmountScreenContract$InputData inputData) {
        super(inputData);
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.U = R$id.transferScreen_recyclerView;
        this.V = R$layout.screen_transfer_peer_to_peer_amount;
        this.W = s.t(this, k.f);
        final int i = 1;
        this.X = w.y0(new Function0(this) { // from class: z8k.j

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PeerToPeerAmountScreen f320189b;

            {
                this.f320189b = this;
            }

            /* JADX WARN: Type inference failed for: r0v15, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                PeerToPeerAmountScreen peerToPeerAmountScreen = this.f320189b;
                switch (i2) {
                    case 0:
                        PeerToPeerAmountScreen.Companion companion = PeerToPeerAmountScreen.INSTANCE;
                        return new SelectableDelegate((RowDelegate) peerToPeerAmountScreen.j0.getValue());
                    case 1:
                        PeerToPeerAmountScreen.Companion companion2 = PeerToPeerAmountScreen.INSTANCE;
                        ControllerContainerConstraintLayout transferScreenContainer = peerToPeerAmountScreen.i3().f278249b;
                        Intrinsics.checkNotNullExpressionValue(transferScreenContainer, "transferScreenContainer");
                        ScreenContentRecyclerView transferScreenRecyclerView = peerToPeerAmountScreen.i3().f278251g;
                        Intrinsics.checkNotNullExpressionValue(transferScreenRecyclerView, "transferScreenRecyclerView");
                        return new byl.h(transferScreenContainer, transferScreenRecyclerView, new ht0.b0(0, peerToPeerAmountScreen.T2(), e0.class, "onGifClicked", "onGifClicked()V", 0, 28), new ht0.b0(0, peerToPeerAmountScreen.T2(), e0.class, "onPersonalisationAnimationStarted", "onPersonalisationAnimationStarted()V", 0, 29));
                    case 2:
                        PeerToPeerAmountScreen.Companion companion3 = PeerToPeerAmountScreen.INSTANCE;
                        return new CenteredAmountDelegate(new yz4.b(peerToPeerAmountScreen, 20));
                    case 3:
                        PeerToPeerAmountScreen.Companion companion4 = PeerToPeerAmountScreen.INSTANCE;
                        return (e0) ((v8k.d) peerToPeerAmountScreen.f102309o0.getValue()).U.get();
                    case 4:
                        PeerToPeerAmountScreen.Companion companion5 = PeerToPeerAmountScreen.INSTANCE;
                        aqf.b bVar = (aqf.b) ((v8k.d) peerToPeerAmountScreen.f102309o0.getValue()).f286818g.d.i.get();
                        vc.s.j(bVar);
                        return bVar;
                    default:
                        PeerToPeerAmountScreen.Companion companion6 = PeerToPeerAmountScreen.INSTANCE;
                        qd0.b bVar2 = peerToPeerAmountScreen.Z;
                        if (bVar2 != null) {
                            return new u80.d(((s80.b) bVar2).b());
                        }
                        Intrinsics.r("languageProvider");
                        throw null;
                }
            }
        });
        this.Y = ((inputData instanceof PeerToPeerAmountScreenContract$InputData.WithTransferData) && (((PeerToPeerAmountScreenContract$InputData.WithTransferData) inputData).f102327l.f102249j instanceof PeerToPeerCustomization.Personalisation)) ? Integer.valueOf(R$style.UiKitTheme_TransparentNight) : null;
        final int i2 = 5;
        this.f102303b0 = w.y0(new Function0(this) { // from class: z8k.j

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PeerToPeerAmountScreen f320189b;

            {
                this.f320189b = this;
            }

            /* JADX WARN: Type inference failed for: r0v15, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                PeerToPeerAmountScreen peerToPeerAmountScreen = this.f320189b;
                switch (i22) {
                    case 0:
                        PeerToPeerAmountScreen.Companion companion = PeerToPeerAmountScreen.INSTANCE;
                        return new SelectableDelegate((RowDelegate) peerToPeerAmountScreen.j0.getValue());
                    case 1:
                        PeerToPeerAmountScreen.Companion companion2 = PeerToPeerAmountScreen.INSTANCE;
                        ControllerContainerConstraintLayout transferScreenContainer = peerToPeerAmountScreen.i3().f278249b;
                        Intrinsics.checkNotNullExpressionValue(transferScreenContainer, "transferScreenContainer");
                        ScreenContentRecyclerView transferScreenRecyclerView = peerToPeerAmountScreen.i3().f278251g;
                        Intrinsics.checkNotNullExpressionValue(transferScreenRecyclerView, "transferScreenRecyclerView");
                        return new byl.h(transferScreenContainer, transferScreenRecyclerView, new ht0.b0(0, peerToPeerAmountScreen.T2(), e0.class, "onGifClicked", "onGifClicked()V", 0, 28), new ht0.b0(0, peerToPeerAmountScreen.T2(), e0.class, "onPersonalisationAnimationStarted", "onPersonalisationAnimationStarted()V", 0, 29));
                    case 2:
                        PeerToPeerAmountScreen.Companion companion3 = PeerToPeerAmountScreen.INSTANCE;
                        return new CenteredAmountDelegate(new yz4.b(peerToPeerAmountScreen, 20));
                    case 3:
                        PeerToPeerAmountScreen.Companion companion4 = PeerToPeerAmountScreen.INSTANCE;
                        return (e0) ((v8k.d) peerToPeerAmountScreen.f102309o0.getValue()).U.get();
                    case 4:
                        PeerToPeerAmountScreen.Companion companion5 = PeerToPeerAmountScreen.INSTANCE;
                        aqf.b bVar = (aqf.b) ((v8k.d) peerToPeerAmountScreen.f102309o0.getValue()).f286818g.d.i.get();
                        vc.s.j(bVar);
                        return bVar;
                    default:
                        PeerToPeerAmountScreen.Companion companion6 = PeerToPeerAmountScreen.INSTANCE;
                        qd0.b bVar2 = peerToPeerAmountScreen.Z;
                        if (bVar2 != null) {
                            return new u80.d(((s80.b) bVar2).b());
                        }
                        Intrinsics.r("languageProvider");
                        throw null;
                }
            }
        });
        this.c0 = new InputTextDelegate(null);
        this.f102304d0 = new ImageAttachmentDelegate();
        this.f102305e0 = new SuggestionsBarDelegate();
        this.f0 = w.y0(new z1i.a(26));
        this.g0 = w.y0(new z1i.a(27));
        this.f102306h0 = w.y0(new z1i.a(28));
        this.i0 = w.y0(new z1i.a(29));
        this.j0 = w.y0(new i(0));
        this.f102307k0 = w.y0(new i(1));
        final int i3 = 0;
        this.l0 = w.y0(new Function0(this) { // from class: z8k.j

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PeerToPeerAmountScreen f320189b;

            {
                this.f320189b = this;
            }

            /* JADX WARN: Type inference failed for: r0v15, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                PeerToPeerAmountScreen peerToPeerAmountScreen = this.f320189b;
                switch (i22) {
                    case 0:
                        PeerToPeerAmountScreen.Companion companion = PeerToPeerAmountScreen.INSTANCE;
                        return new SelectableDelegate((RowDelegate) peerToPeerAmountScreen.j0.getValue());
                    case 1:
                        PeerToPeerAmountScreen.Companion companion2 = PeerToPeerAmountScreen.INSTANCE;
                        ControllerContainerConstraintLayout transferScreenContainer = peerToPeerAmountScreen.i3().f278249b;
                        Intrinsics.checkNotNullExpressionValue(transferScreenContainer, "transferScreenContainer");
                        ScreenContentRecyclerView transferScreenRecyclerView = peerToPeerAmountScreen.i3().f278251g;
                        Intrinsics.checkNotNullExpressionValue(transferScreenRecyclerView, "transferScreenRecyclerView");
                        return new byl.h(transferScreenContainer, transferScreenRecyclerView, new ht0.b0(0, peerToPeerAmountScreen.T2(), e0.class, "onGifClicked", "onGifClicked()V", 0, 28), new ht0.b0(0, peerToPeerAmountScreen.T2(), e0.class, "onPersonalisationAnimationStarted", "onPersonalisationAnimationStarted()V", 0, 29));
                    case 2:
                        PeerToPeerAmountScreen.Companion companion3 = PeerToPeerAmountScreen.INSTANCE;
                        return new CenteredAmountDelegate(new yz4.b(peerToPeerAmountScreen, 20));
                    case 3:
                        PeerToPeerAmountScreen.Companion companion4 = PeerToPeerAmountScreen.INSTANCE;
                        return (e0) ((v8k.d) peerToPeerAmountScreen.f102309o0.getValue()).U.get();
                    case 4:
                        PeerToPeerAmountScreen.Companion companion5 = PeerToPeerAmountScreen.INSTANCE;
                        aqf.b bVar = (aqf.b) ((v8k.d) peerToPeerAmountScreen.f102309o0.getValue()).f286818g.d.i.get();
                        vc.s.j(bVar);
                        return bVar;
                    default:
                        PeerToPeerAmountScreen.Companion companion6 = PeerToPeerAmountScreen.INSTANCE;
                        qd0.b bVar2 = peerToPeerAmountScreen.Z;
                        if (bVar2 != null) {
                            return new u80.d(((s80.b) bVar2).b());
                        }
                        Intrinsics.r("languageProvider");
                        throw null;
                }
            }
        });
        final int i5 = 2;
        this.m0 = w.y0(new i(2));
        this.f102308n0 = w.y0(new Function0(this) { // from class: z8k.j

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PeerToPeerAmountScreen f320189b;

            {
                this.f320189b = this;
            }

            /* JADX WARN: Type inference failed for: r0v15, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i5;
                PeerToPeerAmountScreen peerToPeerAmountScreen = this.f320189b;
                switch (i22) {
                    case 0:
                        PeerToPeerAmountScreen.Companion companion = PeerToPeerAmountScreen.INSTANCE;
                        return new SelectableDelegate((RowDelegate) peerToPeerAmountScreen.j0.getValue());
                    case 1:
                        PeerToPeerAmountScreen.Companion companion2 = PeerToPeerAmountScreen.INSTANCE;
                        ControllerContainerConstraintLayout transferScreenContainer = peerToPeerAmountScreen.i3().f278249b;
                        Intrinsics.checkNotNullExpressionValue(transferScreenContainer, "transferScreenContainer");
                        ScreenContentRecyclerView transferScreenRecyclerView = peerToPeerAmountScreen.i3().f278251g;
                        Intrinsics.checkNotNullExpressionValue(transferScreenRecyclerView, "transferScreenRecyclerView");
                        return new byl.h(transferScreenContainer, transferScreenRecyclerView, new ht0.b0(0, peerToPeerAmountScreen.T2(), e0.class, "onGifClicked", "onGifClicked()V", 0, 28), new ht0.b0(0, peerToPeerAmountScreen.T2(), e0.class, "onPersonalisationAnimationStarted", "onPersonalisationAnimationStarted()V", 0, 29));
                    case 2:
                        PeerToPeerAmountScreen.Companion companion3 = PeerToPeerAmountScreen.INSTANCE;
                        return new CenteredAmountDelegate(new yz4.b(peerToPeerAmountScreen, 20));
                    case 3:
                        PeerToPeerAmountScreen.Companion companion4 = PeerToPeerAmountScreen.INSTANCE;
                        return (e0) ((v8k.d) peerToPeerAmountScreen.f102309o0.getValue()).U.get();
                    case 4:
                        PeerToPeerAmountScreen.Companion companion5 = PeerToPeerAmountScreen.INSTANCE;
                        aqf.b bVar = (aqf.b) ((v8k.d) peerToPeerAmountScreen.f102309o0.getValue()).f286818g.d.i.get();
                        vc.s.j(bVar);
                        return bVar;
                    default:
                        PeerToPeerAmountScreen.Companion companion6 = PeerToPeerAmountScreen.INSTANCE;
                        qd0.b bVar2 = peerToPeerAmountScreen.Z;
                        if (bVar2 != null) {
                            return new u80.d(((s80.b) bVar2).b());
                        }
                        Intrinsics.r("languageProvider");
                        throw null;
                }
            }
        });
        this.f102309o0 = w.y0(new ywi.b(this, inputData, 18));
        final int i6 = 3;
        this.p0 = w.y0(new Function0(this) { // from class: z8k.j

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PeerToPeerAmountScreen f320189b;

            {
                this.f320189b = this;
            }

            /* JADX WARN: Type inference failed for: r0v15, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i6;
                PeerToPeerAmountScreen peerToPeerAmountScreen = this.f320189b;
                switch (i22) {
                    case 0:
                        PeerToPeerAmountScreen.Companion companion = PeerToPeerAmountScreen.INSTANCE;
                        return new SelectableDelegate((RowDelegate) peerToPeerAmountScreen.j0.getValue());
                    case 1:
                        PeerToPeerAmountScreen.Companion companion2 = PeerToPeerAmountScreen.INSTANCE;
                        ControllerContainerConstraintLayout transferScreenContainer = peerToPeerAmountScreen.i3().f278249b;
                        Intrinsics.checkNotNullExpressionValue(transferScreenContainer, "transferScreenContainer");
                        ScreenContentRecyclerView transferScreenRecyclerView = peerToPeerAmountScreen.i3().f278251g;
                        Intrinsics.checkNotNullExpressionValue(transferScreenRecyclerView, "transferScreenRecyclerView");
                        return new byl.h(transferScreenContainer, transferScreenRecyclerView, new ht0.b0(0, peerToPeerAmountScreen.T2(), e0.class, "onGifClicked", "onGifClicked()V", 0, 28), new ht0.b0(0, peerToPeerAmountScreen.T2(), e0.class, "onPersonalisationAnimationStarted", "onPersonalisationAnimationStarted()V", 0, 29));
                    case 2:
                        PeerToPeerAmountScreen.Companion companion3 = PeerToPeerAmountScreen.INSTANCE;
                        return new CenteredAmountDelegate(new yz4.b(peerToPeerAmountScreen, 20));
                    case 3:
                        PeerToPeerAmountScreen.Companion companion4 = PeerToPeerAmountScreen.INSTANCE;
                        return (e0) ((v8k.d) peerToPeerAmountScreen.f102309o0.getValue()).U.get();
                    case 4:
                        PeerToPeerAmountScreen.Companion companion5 = PeerToPeerAmountScreen.INSTANCE;
                        aqf.b bVar = (aqf.b) ((v8k.d) peerToPeerAmountScreen.f102309o0.getValue()).f286818g.d.i.get();
                        vc.s.j(bVar);
                        return bVar;
                    default:
                        PeerToPeerAmountScreen.Companion companion6 = PeerToPeerAmountScreen.INSTANCE;
                        qd0.b bVar2 = peerToPeerAmountScreen.Z;
                        if (bVar2 != null) {
                            return new u80.d(((s80.b) bVar2).b());
                        }
                        Intrinsics.r("languageProvider");
                        throw null;
                }
            }
        });
        final int i21 = 4;
        this.q0 = w.y0(new Function0(this) { // from class: z8k.j

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PeerToPeerAmountScreen f320189b;

            {
                this.f320189b = this;
            }

            /* JADX WARN: Type inference failed for: r0v15, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i21;
                PeerToPeerAmountScreen peerToPeerAmountScreen = this.f320189b;
                switch (i22) {
                    case 0:
                        PeerToPeerAmountScreen.Companion companion = PeerToPeerAmountScreen.INSTANCE;
                        return new SelectableDelegate((RowDelegate) peerToPeerAmountScreen.j0.getValue());
                    case 1:
                        PeerToPeerAmountScreen.Companion companion2 = PeerToPeerAmountScreen.INSTANCE;
                        ControllerContainerConstraintLayout transferScreenContainer = peerToPeerAmountScreen.i3().f278249b;
                        Intrinsics.checkNotNullExpressionValue(transferScreenContainer, "transferScreenContainer");
                        ScreenContentRecyclerView transferScreenRecyclerView = peerToPeerAmountScreen.i3().f278251g;
                        Intrinsics.checkNotNullExpressionValue(transferScreenRecyclerView, "transferScreenRecyclerView");
                        return new byl.h(transferScreenContainer, transferScreenRecyclerView, new ht0.b0(0, peerToPeerAmountScreen.T2(), e0.class, "onGifClicked", "onGifClicked()V", 0, 28), new ht0.b0(0, peerToPeerAmountScreen.T2(), e0.class, "onPersonalisationAnimationStarted", "onPersonalisationAnimationStarted()V", 0, 29));
                    case 2:
                        PeerToPeerAmountScreen.Companion companion3 = PeerToPeerAmountScreen.INSTANCE;
                        return new CenteredAmountDelegate(new yz4.b(peerToPeerAmountScreen, 20));
                    case 3:
                        PeerToPeerAmountScreen.Companion companion4 = PeerToPeerAmountScreen.INSTANCE;
                        return (e0) ((v8k.d) peerToPeerAmountScreen.f102309o0.getValue()).U.get();
                    case 4:
                        PeerToPeerAmountScreen.Companion companion5 = PeerToPeerAmountScreen.INSTANCE;
                        aqf.b bVar = (aqf.b) ((v8k.d) peerToPeerAmountScreen.f102309o0.getValue()).f286818g.d.i.get();
                        vc.s.j(bVar);
                        return bVar;
                    default:
                        PeerToPeerAmountScreen.Companion companion6 = PeerToPeerAmountScreen.INSTANCE;
                        qd0.b bVar2 = peerToPeerAmountScreen.Z;
                        if (bVar2 != null) {
                            return new u80.d(((s80.b) bVar2).b());
                        }
                        Intrinsics.r("languageProvider");
                        throw null;
                }
            }
        });
    }

    @Override // com.revolut.kompot.navigable.a
    /* JADX INFO: renamed from: A2, reason: from getter */
    public final Integer getY() {
        return this.Y;
    }

    @Override // com.revolut.kompot.navigable.a
    public final boolean F2() {
        b bVar = (b) T2();
        j60.a aVar = bVar.D;
        if (aVar.j()) {
            j60.a.v(aVar, false, null, 3);
            return true;
        }
        bVar.E.Q();
        bVar.v2(v.f320224a);
        return true;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // mga.i0
    public final r N0() {
        return ((HighlightTileDelegate) this.f102307k0.getValue()).f52437c;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    public final sji.b S2() {
        return (d) this.f102309o0.getValue();
    }

    /* JADX WARN: Type inference failed for: r6v20, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, com.revolut.kompot.navigable.screen.BaseScreen
    public final void V2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.V2(view);
        Continuation continuation = null;
        com.revolut.kompot.navigable.a.g2(this, ((b) T2()).P, null, new l(this, continuation, 4), 3);
        com.revolut.kompot.navigable.a.g2(this, e.b(i3().e.f59338a), null, new q(this, continuation, 1), 3);
        com.revolut.kompot.navigable.a.g2(this, e.b(i3().e.f59339b), null, new q(this, continuation, 2), 3);
        com.revolut.kompot.navigable.a.g2(this, e.b(i3().f278252h.o), null, new q(this, continuation, 3), 3);
        com.revolut.kompot.navigable.a.g2(this, e.b(i3().i.o), null, new q(this, continuation, 4), 3);
        com.revolut.kompot.navigable.a.g2(this, ((aqf.b) this.q0.getValue()).f8427b, null, new l(this, continuation, 5), 3);
        com.revolut.kompot.navigable.a.g2(this, e.b(w.a0(i3().f.I(), new z8h.b(3))), null, new l(this, continuation, 6), 3);
        r map = i3().d.f58608l.map(new z3e.a(new z8h.b(4), 25));
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        com.revolut.kompot.navigable.a.g2(this, e.b(map), null, new l(this, continuation, 0), 3);
        com.revolut.kompot.navigable.a.g2(this, e.b(h3().d.f121375b), null, new l(this, continuation, 1), 3);
        com.revolut.kompot.navigable.a.g2(this, e.b(w.a0(h3().f.f121375b, new z8h.b(5))), null, new l(this, continuation, 2), 3);
        com.revolut.kompot.navigable.a.g2(this, h30.l.y(h3().e.f121375b, h3().f51966j.f121375b, "merge(...)"), null, new m(this, null), 3);
        f fVar = h3().f51967l.f121375b;
        InputTextDelegate inputTextDelegate = this.c0;
        com.revolut.kompot.navigable.a.g2(this, h30.l.y(fVar, inputTextDelegate.f.f121375b, "merge(...)"), null, new l(this, continuation, 3), 3);
        com.revolut.kompot.navigable.a.g2(this, e.b(inputTextDelegate.e.f121375b), null, new n(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, e.b(inputTextDelegate.f52577j.f121375b), null, new o(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, e.b(this.f102305e0.p().d), null, new p(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, e.b(this.f102304d0.f52515c), null, new q(this, continuation, 0), 3);
    }

    /* JADX WARN: Type inference failed for: r11v0, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r13v0, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r15v0, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r4v4, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r9v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, com.revolut.kompot.navigable.screen.BaseScreen
    public final void W2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.W2(view);
        ?? r2 = this.f102309o0;
        d dVar = (d) r2.getValue();
        qd0.b bVarN = dVar.f286818g.f286799b.n();
        s.j(bVarN);
        this.Z = bVarN;
        this.f102302a0 = (n5k.b) dVar.I.get();
        pd.b.p(view, new TextLocalisedClause(R$string.payments_descriptor_transfer_p2p_amount_title, null, null, 14));
        j60.a aVar = (j60.a) ((d) r2.getValue()).k.get();
        ?? r23 = this.f0;
        LargeActionButtonDelegate largeActionButtonDelegate = (LargeActionButtonDelegate) r23.getValue();
        ?? r4 = this.g0;
        CellDetailsDelegate cellDetailsDelegate = (CellDetailsDelegate) r4.getValue();
        ?? r72 = this.f102306h0;
        CellDetailsActionDelegate cellDetailsActionDelegate = (CellDetailsActionDelegate) r72.getValue();
        ?? r92 = this.i0;
        CellDetailsNoteDelegate cellDetailsNoteDelegate = (CellDetailsNoteDelegate) r92.getValue();
        ?? r112 = this.j0;
        RowDelegate rowDelegate = (RowDelegate) r112.getValue();
        ?? r132 = this.f102307k0;
        HighlightTileDelegate highlightTileDelegate = (HighlightTileDelegate) r132.getValue();
        ?? r152 = this.m0;
        aVar.d(zhm.v.k(largeActionButtonDelegate, cellDetailsDelegate, cellDetailsActionDelegate, cellDetailsNoteDelegate, rowDelegate, highlightTileDelegate, (TextDelegate) r152.getValue(), (SelectableDelegate) this.l0.getValue()));
        n5k.b bVar = this.f102302a0;
        if (bVar == null) {
            Intrinsics.r("paymentFeesDialogExtension");
            throw null;
        }
        ((n5k.p) bVar).Z2((CellDetailsDelegate) r4.getValue(), (CellDetailsActionDelegate) r72.getValue(), (CellDetailsNoteDelegate) r92.getValue(), (LargeActionButtonDelegate) r23.getValue(), (TextDelegate) r152.getValue(), (RowDelegate) r112.getValue(), (HighlightTileDelegate) r132.getValue());
        i3().e.setNavigationButtonIcon(Integer.valueOf(R$drawable.uikit_icn_24_back_button_arrow));
        i3().f278252h.setIcon(new ResourceImage(R$drawable.uikit_icn_24_calendar, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorWhite), (List) null, (ImageTransformations) null, (Clause) null, 246));
        i3().f278252h.setCustomE2ETestId("PEER_TO_PEER_AMOUNT_SCREEN_SCHEDULE_BUTTON_TAG");
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, com.revolut.kompot.navigable.screen.BaseScreen
    public final void Y2() {
        byl.h hVar = (byl.h) this.X.getValue();
        AnimatorSet animatorSet = hVar.f;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        hVar.f = null;
        byl.k kVar = hVar.e;
        if (kVar != null) {
            hVar.f19867a.removeView(kVar);
        }
        hVar.e = null;
        super.Y2();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // mga.i0
    public final r a2() {
        return ((RowDelegate) this.j0.getValue()).f53218h;
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: c3 */
    public final List getF87162e0() {
        return zhm.v.k(h3(), this.c0, this.f102305e0, this.f102304d0, new RowLoadingDelegate());
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: e3, reason: from getter */
    public final int getU() {
        return this.U;
    }

    @Override // mga.l0
    public final View g0() {
        ControllerContainerConstraintLayout controllerContainerConstraintLayout = i3().f278248a;
        Intrinsics.checkNotNullExpressionValue(controllerContainerConstraintLayout, "getRoot(...)");
        return controllerContainerConstraintLayout;
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: g3, reason: merged with bridge method [inline-methods] */
    public final void Z2(f0 uiState, jki.o oVar) {
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        super.Z2(uiState, oVar);
        NavBarWithAvatar navBarWithAvatar = i3().e;
        j8 j8Var = uiState.f320173b;
        NavBarWithContainerBackground navBarWithContainerBackground = uiState.d;
        navBarWithAvatar.setModel(j8Var);
        LegacyButtonContainerConstraintLayout transferScreenFooterContainer = i3().f278250c;
        Intrinsics.checkNotNullExpressionValue(transferScreenFooterContainer, "transferScreenFooterContainer");
        z8k.r rVar = uiState.f320174c;
        transferScreenFooterContainer.setVisibility(rVar != null ? 0 : 8);
        if (rVar != null) {
            Clause clause = rVar.e;
            LargeActionButton largeActionButton = i3().f278252h;
            largeActionButton.setVisibility(rVar.f320202c ? 0 : 8);
            largeActionButton.setEnabled(rVar.d);
            largeActionButton.setLoadingButtonTag("PEER_TO_PEER_AMOUNT_SCHEDULE_CTA_BUTTON_TAG");
            LargeActionButton largeActionButton2 = i3().i;
            largeActionButton2.setEnabled(rVar.f320201b);
            largeActionButton2.setText(rVar.f320200a);
            largeActionButton2.setLoadingButtonTag("PEER_TO_PEER_AMOUNT_PROCEED_CTA_BUTTON_TAG");
            FooterTextView footerTextView = i3().d;
            footerTextView.setVisibility(clause != null ? 0 : 8);
            footerTextView.setTextClause(clause);
        }
        BackgroundWallpaperView transferScreenWallpaperView = i3().f278253j;
        Intrinsics.checkNotNullExpressionValue(transferScreenWallpaperView, "transferScreenWallpaperView");
        transferScreenWallpaperView.setBackground(navBarWithContainerBackground, null);
        BackgroundWallpaperView transferScreenWallpaperView2 = i3().f278253j;
        Intrinsics.checkNotNullExpressionValue(transferScreenWallpaperView2, "transferScreenWallpaperView");
        transferScreenWallpaperView2.setVisibility(navBarWithContainerBackground != null ? 0 : 8);
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getZ() {
        return this.V;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public final CenteredAmountDelegate h3() {
        return (CenteredAmountDelegate) this.f102308n0.getValue();
    }

    public final u8k.a i3() {
        ViewBinding value = this.W.getValue(this, f102301r0[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (u8k.a) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    /* JADX INFO: renamed from: j3, reason: merged with bridge method [inline-methods] */
    public final e0 T2() {
        return (e0) this.p0.getValue();
    }
}
