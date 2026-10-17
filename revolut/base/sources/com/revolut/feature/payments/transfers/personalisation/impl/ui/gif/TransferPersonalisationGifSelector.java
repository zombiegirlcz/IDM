package com.revolut.feature.payments.transfers.personalisation.impl.ui.gif;

import android.view.View;
import androidx.core.view.ViewCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import ao.h;
import au0.p2;
import cli.a0;
import cli.o;
import cli.q;
import cli.w;
import com.revolut.core.ui.models.Color;
import com.revolut.core.ui_kit.delegates.EmojiImageDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.ReactionsKeyboardItemDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.internal.views.UIKitImageView;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.buttons.SearchButton;
import com.revolut.core.ui_kit.views.input.InputText;
import com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.payments.transfers.personalisation.impl.R$layout;
import com.revolut.feature.payments.transfers.personalisation.impl.ui.gif.TransferPersonalisationGifSelector;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.revolut.feature_fourthline_impl.R;
import g2a.f;
import jh.d;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;
import rx0.j;
import vc.s;
import vge.z1;
import w2a.b;
import w2a.c;
import w2a.m;
import w2a.n;
import xki.e;
import yp0.y;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000 \u00052\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003:\u0001\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/payments/transfers/personalisation/impl/ui/gif/TransferPersonalisationGifSelector;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lg2a/f;", "Lcli/w;", "Lw2a/n;", "Companion", "a", "feature_payments_transfers_personalisation_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class TransferPersonalisationGifSelector extends ViewController<f> implements w {
    public final TransferPersonalisationGifSelectorContract$InputData K;
    public final h L;
    public final int M;
    public final ReactionsKeyboardItemDelegate N;
    public final EmojiImageDelegate O;
    public final FullScreenStateDelegate P;
    public final koi.h Q;
    public final koi.h R;
    public final Object S;
    public final Object T;
    public final Object U;
    public static final /* synthetic */ KProperty[] V = {o0.f186429a.j(new h0(TransferPersonalisationGifSelector.class, "binding", "getBinding()Lcom/revolut/feature/payments/transfers/personalisation/impl/databinding/TransferPersonalisationGifScreenBinding;", 0))};

    @NotNull
    private static final a Companion = new a();

    public static final class a {
        private a() {
        }
    }

    public TransferPersonalisationGifSelector() {
        TransferPersonalisationGifSelectorContract$InputData inputData = TransferPersonalisationGifSelectorContract$InputData.f79967a;
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = s.t(this, c.f);
        this.M = R$layout.transfer_personalisation_gif_screen;
        ReactionsKeyboardItemDelegate reactionsKeyboardItemDelegate = new ReactionsKeyboardItemDelegate();
        this.N = reactionsKeyboardItemDelegate;
        EmojiImageDelegate emojiImageDelegate = new EmojiImageDelegate();
        this.O = emojiImageDelegate;
        FullScreenStateDelegate fullScreenStateDelegate = new FullScreenStateDelegate();
        this.P = fullScreenStateDelegate;
        final int i = 0;
        koi.c cVar = new koi.c(0);
        cVar.b(u.c(emojiImageDelegate));
        this.Q = new koi.h(cVar, false, false, 4);
        koi.c cVar2 = new koi.c(0);
        final int i2 = 1;
        final int i3 = 2;
        cVar2.b(v.k(reactionsKeyboardItemDelegate, fullScreenStateDelegate, new RowLoadingDelegate()));
        this.R = new koi.h(cVar2, false, false, 4);
        this.S = te0.w.y0(new Function0(this) { // from class: w2a.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TransferPersonalisationGifSelector f293985b;

            {
                this.f293985b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i5 = i;
                TransferPersonalisationGifSelector transferPersonalisationGifSelector = this.f293985b;
                switch (i5) {
                    case 0:
                        KProperty[] kPropertyArr = TransferPersonalisationGifSelector.V;
                        phm.a aVar = (phm.a) ue0.e.j(transferPersonalisationGifSelector.m2()).a().get(o2a.b.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", o2a.b.class, " is not found"));
                        }
                        o2a.b bVar = ((o2a.b) aVar2.b()).e;
                        transferPersonalisationGifSelector.K.getClass();
                        return new o2a.e(bVar, new o9i.a(), new o9i.b(), new o9i.c());
                    case 1:
                        KProperty[] kPropertyArr2 = TransferPersonalisationGifSelector.V;
                        return (s) ((o2a.e) transferPersonalisationGifSelector.S.getValue()).e.get();
                    default:
                        KProperty[] kPropertyArr3 = TransferPersonalisationGifSelector.V;
                        return n14.e.a(transferPersonalisationGifSelector, transferPersonalisationGifSelector.R2());
                }
            }
        });
        this.T = te0.w.y0(new Function0(this) { // from class: w2a.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TransferPersonalisationGifSelector f293985b;

            {
                this.f293985b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i5 = i2;
                TransferPersonalisationGifSelector transferPersonalisationGifSelector = this.f293985b;
                switch (i5) {
                    case 0:
                        KProperty[] kPropertyArr = TransferPersonalisationGifSelector.V;
                        phm.a aVar = (phm.a) ue0.e.j(transferPersonalisationGifSelector.m2()).a().get(o2a.b.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", o2a.b.class, " is not found"));
                        }
                        o2a.b bVar = ((o2a.b) aVar2.b()).e;
                        transferPersonalisationGifSelector.K.getClass();
                        return new o2a.e(bVar, new o9i.a(), new o9i.b(), new o9i.c());
                    case 1:
                        KProperty[] kPropertyArr2 = TransferPersonalisationGifSelector.V;
                        return (s) ((o2a.e) transferPersonalisationGifSelector.S.getValue()).e.get();
                    default:
                        KProperty[] kPropertyArr3 = TransferPersonalisationGifSelector.V;
                        return n14.e.a(transferPersonalisationGifSelector, transferPersonalisationGifSelector.R2());
                }
            }
        });
        this.U = te0.w.y0(new Function0(this) { // from class: w2a.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TransferPersonalisationGifSelector f293985b;

            {
                this.f293985b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i5 = i3;
                TransferPersonalisationGifSelector transferPersonalisationGifSelector = this.f293985b;
                switch (i5) {
                    case 0:
                        KProperty[] kPropertyArr = TransferPersonalisationGifSelector.V;
                        phm.a aVar = (phm.a) ue0.e.j(transferPersonalisationGifSelector.m2()).a().get(o2a.b.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", o2a.b.class, " is not found"));
                        }
                        o2a.b bVar = ((o2a.b) aVar2.b()).e;
                        transferPersonalisationGifSelector.K.getClass();
                        return new o2a.e(bVar, new o9i.a(), new o9i.b(), new o9i.c());
                    case 1:
                        KProperty[] kPropertyArr2 = TransferPersonalisationGifSelector.V;
                        return (s) ((o2a.e) transferPersonalisationGifSelector.S.getValue()).e.get();
                    default:
                        KProperty[] kPropertyArr3 = TransferPersonalisationGifSelector.V;
                        return n14.e.a(transferPersonalisationGifSelector, transferPersonalisationGifSelector.R2());
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, q qVar) {
        n uiState = (n) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        this.Q.c(uiState.f293997a);
        m mVar = qVar instanceof m ? (m) qVar : null;
        koi.h hVar = this.R;
        if (mVar != null) {
            int i = b.f293986a[mVar.f293996a.ordinal()];
            if (i == 1) {
                f3();
            } else {
                if (i != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                RecyclerView gifSelectorGifs = d3().d;
                Intrinsics.checkNotNullExpressionValue(gifSelectorGifs, "gifSelectorGifs");
                while (gifSelectorGifs.getItemDecorationCount() > 0) {
                    gifSelectorGifs.removeItemDecorationAt(0);
                }
                RecyclerView gifSelectorGifs2 = d3().d;
                Intrinsics.checkNotNullExpressionValue(gifSelectorGifs2, "gifSelectorGifs");
                y.h(gifSelectorGifs2, hVar, new LinearLayoutManager(gifSelectorGifs2.getContext()));
            }
        }
        hVar.c(uiState.f293998b.f293994a);
        boolean z = uiState.f293999c instanceof w2a.h;
        RecyclerView gifSelectorCategories = d3().f191723b;
        Intrinsics.checkNotNullExpressionValue(gifSelectorCategories, "gifSelectorCategories");
        gifSelectorCategories.setVisibility(!z ? 0 : 8);
        SearchButton gifSelectorSearchButton = d3().e;
        Intrinsics.checkNotNullExpressionValue(gifSelectorSearchButton, "gifSelectorSearchButton");
        gifSelectorSearchButton.setVisibility(!z ? 0 : 8);
        InputText gifSelectorSearchInput = d3().f;
        Intrinsics.checkNotNullExpressionValue(gifSelectorSearchInput, "gifSelectorSearchInput");
        gifSelectorSearchInput.setVisibility(z ? 0 : 8);
        UIKitImageView gifSelectorCloseSearchButton = d3().f191724c;
        Intrinsics.checkNotNullExpressionValue(gifSelectorCloseSearchButton, "gifSelectorCloseSearchButton");
        gifSelectorCloseSearchButton.setVisibility(z ? 0 : 8);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (o2a.e) this.S.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        RecyclerView recyclerView = d3().f191723b;
        recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext(), 0, false));
        recyclerView.setAdapter(this.Q);
        d3().d.setAdapter(this.R);
        f3();
        yy0.f fVarQ = d.f(m2()).Q();
        LayeredImage layeredImageA = LayeredImage.Companion.a(LayeredImage.INSTANCE, R$drawable.uikit_icn_24_cross, null, new Color.Solid(R$attr.uikit_colorSelectableItemBackground), 8.0f, null, 48);
        UIKitImageView gifSelectorCloseSearchButton = d3().f191724c;
        Intrinsics.checkNotNullExpressionValue(gifSelectorCloseSearchButton, "gifSelectorCloseSearchButton");
        yy0.f.e(fVarQ, layeredImageA, gifSelectorCloseSearchButton, null, null, 12);
        d3().e.setText(new TextLocalisedClause(R.string.common_search, null, null, 14));
        d3().f.setPlaceholder(new TextLocalisedClause(R.string.common_search, null, null, 14), j.OnFocus);
        ViewCompat.setOnApplyWindowInsetsListener(d3().f191722a, new vz4.c(this, 21));
    }

    /* JADX WARN: Type inference failed for: r5v15, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewController.P2(this, rd0.e.b(this.O.f52221c), new w2a.e(this, null, 0), 3);
        ViewController.P2(this, rd0.e.b(d3().e.f59002m), new z1(this, null, 27), 3);
        ViewController.P2(this, rd0.e.b(d3().f.s()), new w2a.e(this, null, 1), 3);
        UIKitImageView gifSelectorCloseSearchButton = d3().f191724c;
        Intrinsics.checkNotNullExpressionValue(gifSelectorCloseSearchButton, "gifSelectorCloseSearchButton");
        or0.m.a(gifSelectorCloseSearchButton);
        gifSelectorCloseSearchButton.setOnClickListener(new p2(this, 16));
        ViewController.P2(this, new v2e.h0(rd0.e.b((ihm.f) this.N.f53148c.getValue()), 26), new w2a.e(this, null, 2), 3);
        ViewController.P2(this, rd0.e.b(this.P.f52371h.f121375b), new w2a.f(this, null), 3);
    }

    public final l2a.b d3() {
        ViewBinding value = this.L.getValue(this, V[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (l2a.b) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final w2a.s R2() {
        return (w2a.s) this.T.getValue();
    }

    public final void f3() {
        RecyclerView gifSelectorGifs = d3().d;
        Intrinsics.checkNotNullExpressionValue(gifSelectorGifs, "gifSelectorGifs");
        while (gifSelectorGifs.getItemDecorationCount() > 0) {
            gifSelectorGifs.removeItemDecorationAt(0);
        }
        RecyclerView gifSelectorGifs2 = d3().d;
        Intrinsics.checkNotNullExpressionValue(gifSelectorGifs2, "gifSelectorGifs");
        y.j(gifSelectorGifs2, this.R, 3, R$attr.uikit_dp1, R$attr.uikit_dp0);
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getM() {
        return this.M;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (a0) this.U.getValue();
    }
}
