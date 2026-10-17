package com.revolut.core.ui_kit.delegates;

import android.animation.ValueAnimator;
import androidx.viewpager2.widget.ViewPager2;
import com.revolut.core.ui_kit.delegates.NewRevolutCardDelegate;
import com.revolut.feature.card_screen.impl.kompot.cards_carousel.screen.CardsCarouselScreen;
import com.revolut.shared.cards.model.card_config.domain.CardDetailsDesignConfig;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class s9 extends ViewPager2.OnPageChangeCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ t9 f54698a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ NewRevolutCardsCarouselDelegate f54699b;

    public s9(t9 t9Var, NewRevolutCardsCarouselDelegate newRevolutCardsCarouselDelegate) {
        this.f54698a = t9Var;
        this.f54699b = newRevolutCardsCarouselDelegate;
    }

    @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
    public final void onPageScrollStateChanged(int i) {
        super.onPageScrollStateChanged(i);
        this.f54699b.f52828r.onNext(Boolean.valueOf(i != 0));
    }

    @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
    public final void onPageScrolled(int i, float f, int i2) {
        super.onPageScrolled(i, f, i2);
        t9 t9Var = this.f54698a;
        u9 u9Var = t9Var.f54760h;
        if (u9Var != null) {
            z4l.j jVar = t9Var.f54761j;
            if (i < jVar.f319395l.size() - 1) {
                koi.j jVarA = jVar.a(i);
                Intrinsics.i(jVarA, "null cannot be cast to non-null type com.revolut.core.ui_kit.delegates.NewRevolutCardDelegate.Model");
                NewRevolutCardDelegate.Model leftCard = (NewRevolutCardDelegate.Model) jVarA;
                koi.j jVarA2 = jVar.a(i + 1);
                Intrinsics.i(jVarA2, "null cannot be cast to non-null type com.revolut.core.ui_kit.delegates.NewRevolutCardDelegate.Model");
                NewRevolutCardDelegate.Model rightCard = (NewRevolutCardDelegate.Model) jVarA2;
                Intrinsics.checkNotNullParameter(leftCard, "leftCard");
                Intrinsics.checkNotNullParameter(rightCard, "rightCard");
                ArrayList arrayList = u9Var.f54824a.f52829s;
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    r9 r9Var = (r9) arrayList.get(size);
                    String listId = u9Var.f54825b.f54623a;
                    t73.j jVar2 = (t73.j) r9Var;
                    jVar2.getClass();
                    Intrinsics.checkNotNullParameter(listId, "listId");
                    Intrinsics.checkNotNullParameter(leftCard, "leftCard");
                    Intrinsics.checkNotNullParameter(rightCard, "rightCard");
                    CardsCarouselScreen cardsCarouselScreen = jVar2.f268482a;
                    ValueAnimator valueAnimator = cardsCarouselScreen.q0;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                    }
                    cardsCarouselScreen.q0 = null;
                    if (f >= 1.0E-4f && f <= 0.9999f) {
                        Object obj2 = leftCard.k;
                        Intrinsics.i(obj2, "null cannot be cast to non-null type com.revolut.feature.card_screen.common.cards.presentation.listitems.CardsCarouselItemParcel");
                        CardDetailsDesignConfig cardDetailsDesignConfig = ((t63.a) obj2).f268174b;
                        Object obj3 = rightCard.k;
                        Intrinsics.i(obj3, "null cannot be cast to non-null type com.revolut.feature.card_screen.common.cards.presentation.listitems.CardsCarouselItemParcel");
                        cardsCarouselScreen.p3(cardDetailsDesignConfig, ((t63.a) obj3).f268174b, f);
                    }
                }
            }
        }
    }

    @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
    public final void onPageSelected(int i) {
        super.onPageSelected(i);
        koi.j jVarA = this.f54698a.f54761j.a(i);
        Intrinsics.i(jVarA, "null cannot be cast to non-null type com.revolut.core.ui_kit.delegates.NewRevolutCardDelegate.Model");
        this.f54699b.f52827q.onNext((NewRevolutCardDelegate.Model) jVarA);
    }
}
