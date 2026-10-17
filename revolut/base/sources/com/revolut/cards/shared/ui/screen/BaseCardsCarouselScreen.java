package com.revolut.cards.shared.ui.screen;

import aii.r;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.ViewGroupKt;
import androidx.recyclerview.widget.RecyclerView;
import au0.s4;
import ch.qos.logback.core.net.SyslogConstants;
import cli.j;
import com.revolut.carousel_with_sheet.shared.ui.screen.CarouselWithBottomSheetScreen;
import com.revolut.core.ui_kit.delegates.t9;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.feature.card_screen.impl.kompot.cards_carousel.screen.CardsCarouselScreen;
import com.revolut.ui_kit.carousel_with_sheet.layout.ControllerContainerCardsCarouselLayout;
import com.revolut.ui_kit.carousel_with_sheet.view.HorizontalScrollExpandableLayoutView;
import dli.a;
import g73.c;
import g73.d;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import koi.h;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import lki.z;
import o10.b;
import t73.i;
import t73.i1;
import te0.w;
import tw0.k;
import yp0.y;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b&\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\b\b\u0001\u0010\u0004*\u00020\u0003*\b\b\u0002\u0010\u0006*\u00020\u00052\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u00072\b\u0012\u0004\u0012\u00028\u00010\b2\u00020\tB\u0007¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/revolut/cards/shared/ui/screen/BaseCardsCarouselScreen;", "Lcli/j;", "DOMAIN_STATE", "Lt73/i1;", "UI_STATE", "Laii/r;", "OUTPUT_DATA", "Lcom/revolut/carousel_with_sheet/shared/ui/screen/CarouselWithBottomSheetScreen;", "Ldli/a;", "", "<init>", "()V", "cards_shared_ui_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class BaseCardsCarouselScreen<DOMAIN_STATE extends j, UI_STATE extends i1, OUTPUT_DATA extends r> extends CarouselWithBottomSheetScreen<DOMAIN_STATE, UI_STATE, OUTPUT_DATA> implements a {
    public k O;
    public final h P = new h(null, false, false, 1);
    public final Object Q = w.y0(new jj2.a(this, 21));

    @Override // o10.a
    public final void A1(float f) {
        ((CardsCarouselScreen) this).q3().g().f0(f);
    }

    @Override // o10.a
    public final CoordinatorLayout F0() {
        i iVarQ3 = ((CardsCarouselScreen) this).q3();
        switch (iVarQ3.f268474a) {
            case 0:
                CoordinatorLayout cardsCarouselExpandableLayoutViewContainer = ((c) iVarQ3.f268475b).f141092g;
                Intrinsics.checkNotNullExpressionValue(cardsCarouselExpandableLayoutViewContainer, "cardsCarouselExpandableLayoutViewContainer");
                return cardsCarouselExpandableLayoutViewContainer;
            default:
                CoordinatorLayout cardsCarouselExpandableLayoutViewContainer2 = ((d) iVarQ3.f268475b).f141098g;
                Intrinsics.checkNotNullExpressionValue(cardsCarouselExpandableLayoutViewContainer2, "cardsCarouselExpandableLayoutViewContainer");
                return cardsCarouselExpandableLayoutViewContainer2;
        }
    }

    @Override // o10.a
    public final int K() {
        return h().getChildCount();
    }

    @Override // o10.a
    public final int V() {
        Context context = h().getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        int iJ = foh.i.j(16);
        int iJ2 = foh.i.j(16);
        ((CardsCarouselScreen) this).f65400r0.getClass();
        Intrinsics.checkNotNullParameter(context, "context");
        return ((int) (r0.p(context) / 1.592f)) + iJ2 + iJ;
    }

    @Override // com.revolut.carousel_with_sheet.shared.ui.screen.CarouselWithBottomSheetScreen, com.revolut.kompot.navigable.vc.ViewController
    public void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.Y2(view);
        RecyclerView recyclerViewH = h();
        k10.a aVar = new k10.a(this);
        aVar.setSupportsChangeAnimations(false);
        recyclerViewH.setItemAnimator(aVar);
    }

    @Override // o10.a
    public final HorizontalScrollExpandableLayoutView Z1() {
        return ((CardsCarouselScreen) this).q3().e();
    }

    @Override // com.revolut.carousel_with_sheet.shared.ui.screen.CarouselWithBottomSheetScreen, o10.a
    public final int a0() {
        Iterator it8 = ViewGroupKt.getChildren(h()).iterator();
        if (!it8.hasNext()) {
            throw new NoSuchElementException();
        }
        View view = (View) it8.next();
        int iC = rim.d.c((view.getY() + view.getHeight()) - view.getTranslationY());
        while (it8.hasNext()) {
            View view2 = (View) it8.next();
            int iC2 = rim.d.c((view2.getY() + view2.getHeight()) - view2.getTranslationY());
            if (iC < iC2) {
                iC = iC2;
            }
        }
        return iC;
    }

    @Override // o10.a
    public final ViewGroup d1() {
        return ((CardsCarouselScreen) this).q3().g();
    }

    @Override // com.revolut.carousel_with_sheet.shared.ui.screen.CarouselWithBottomSheetScreen
    public final void e3() {
        k kVar = this.O;
        if (kVar != null) {
            ((t9) kVar).f.endFakeDrag();
        }
        this.O = null;
    }

    @Override // com.revolut.carousel_with_sheet.shared.ui.screen.CarouselWithBottomSheetScreen
    public final void f3(b bVar) {
        i1 uiState = (i1) bVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        CardsCarouselScreen cardsCarouselScreen = (CardsCarouselScreen) this;
        LargeActionButton largeActionButtonA = cardsCarouselScreen.q3().a();
        boolean z = uiState.d;
        largeActionButtonA.animate().cancel();
        if (z != (largeActionButtonA.getVisibility() == 0)) {
            float fJ = foh.i.j(200);
            largeActionButtonA.setAlpha(z ? 0.0f : 1.0f);
            largeActionButtonA.setTranslationY(z ? fJ : 0.0f);
            ViewPropertyAnimator viewPropertyAnimatorAlpha = largeActionButtonA.animate().alpha(z ? 1.0f : 0.0f);
            if (z) {
                fJ = 0.0f;
            }
            viewPropertyAnimatorAlpha.translationY(fJ).setDuration(300L).setListener(new s4(z, largeActionButtonA, 2)).start();
        }
        cardsCarouselScreen.q3().e().setRecyclerBottomPadding(foh.i.j(uiState.d ? SyslogConstants.LOG_LOCAL2 : 64));
    }

    public abstract RecyclerView h();

    @Override // com.revolut.carousel_with_sheet.shared.ui.screen.CarouselWithBottomSheetScreen
    public final void i3(float f) {
        k kVar = this.O;
        if (kVar != null) {
            ((t9) kVar).f.fakeDragBy(f);
        }
    }

    @Override // com.revolut.carousel_with_sheet.shared.ui.screen.CarouselWithBottomSheetScreen
    public final void j3() {
        Object objF = y.f(h(), "cards");
        k kVar = objF instanceof k ? (k) objF : null;
        this.O = kVar;
        if (kVar != null) {
            ((t9) kVar).f.beginFakeDrag();
        }
    }

    public abstract dli.b k3();

    public abstract List l3();

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    /* JADX INFO: renamed from: m3, reason: merged with bridge method [inline-methods] */
    public dli.c k() {
        return (dli.c) this.Q.getValue();
    }

    @Override // o10.a
    public final boolean n1() {
        ControllerContainerCardsCarouselLayout controllerContainerCardsCarouselLayoutG = ((CardsCarouselScreen) this).q3().g();
        if (controllerContainerCardsCarouselLayoutG.f107105j) {
            Function0 function0 = controllerContainerCardsCarouselLayoutG.i;
            if (function0 != null) {
                function0.invoke();
            }
            z zVar = controllerContainerCardsCarouselLayoutG.f107104h;
            if (zVar != null) {
                zVar.o();
                z zVar2 = controllerContainerCardsCarouselLayoutG.f107104h;
                if (zVar2 != null) {
                    zVar2.p();
                }
                controllerContainerCardsCarouselLayoutG.g0(false);
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: n3 */
    public abstract int getF65404w0();

    @Override // com.revolut.carousel_with_sheet.shared.ui.screen.CarouselWithBottomSheetScreen
    /* JADX INFO: renamed from: o3, reason: merged with bridge method [inline-methods] */
    public void B(i1 uiState, Object obj2) {
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        super.B(uiState, obj2);
    }
}
