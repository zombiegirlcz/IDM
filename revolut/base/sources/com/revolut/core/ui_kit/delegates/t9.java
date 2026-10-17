package com.revolut.core.ui_kit.delegates;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import com.revolut.core.ui_kit.R$id;
import com.revolut.core.ui_kit.delegates.NewRevolutCardsCarouselDelegate;
import com.revolut.core.ui_kit_resources.R$drawable;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class t9 extends koi.b implements tw0.k {
    public final ViewPager2 f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final NewRevolutCardDelegate f54759g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public u9 f54760h;
    public boolean i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final z4l.j f54761j;
    public final /* synthetic */ NewRevolutCardsCarouselDelegate k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t9(NewRevolutCardsCarouselDelegate newRevolutCardsCarouselDelegate, View itemView, int i, int i2) {
        super(itemView);
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        this.k = newRevolutCardsCarouselDelegate;
        View viewFindViewById = itemView.findViewById(R$id.internalDelegateNewRevolutCards_viewPager);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        ViewPager2 viewPager2 = (ViewPager2) viewFindViewById;
        this.f = viewPager2;
        Context context = itemView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        Bitmap bitmapDecodeResource = newRevolutCardsCarouselDelegate.e;
        if (bitmapDecodeResource == null) {
            bitmapDecodeResource = BitmapFactory.decodeResource(context.getResources(), R$drawable.uikit_pic_602_card_freeze);
            newRevolutCardsCarouselDelegate.e = bitmapDecodeResource;
            Intrinsics.checkNotNullExpressionValue(bitmapDecodeResource, "also(...)");
        }
        Context context2 = itemView.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        Bitmap bitmapDecodeResource2 = newRevolutCardsCarouselDelegate.f;
        if (bitmapDecodeResource2 == null) {
            bitmapDecodeResource2 = BitmapFactory.decodeResource(context2.getResources(), R$drawable.uikit_pic_602_locked_card);
            newRevolutCardsCarouselDelegate.f = bitmapDecodeResource2;
        }
        NewRevolutCardDelegate newRevolutCardDelegate = new NewRevolutCardDelegate(true, bitmapDecodeResource, i, bitmapDecodeResource2);
        this.f54759g = newRevolutCardDelegate;
        z4l.j jVar = new z4l.j(7, zhm.u.c(newRevolutCardDelegate), false);
        this.f54761j = jVar;
        viewPager2.setAdapter(jVar);
        RecyclerView recyclerViewA = yp0.j0.a(viewPager2);
        recyclerViewA.setNestedScrollingEnabled(false);
        recyclerViewA.setOverScrollMode(2);
        H(i2, i);
        c8g.a.a(itemView, ny0.a.f220589a, new hsa.l(newRevolutCardsCarouselDelegate, 24, this, itemView));
        viewPager2.registerOnPageChangeCallback(new s9(this, newRevolutCardsCarouselDelegate));
    }

    public final float F(int i, int i2) {
        Context context = this.itemView.getContext();
        float f = (i - i2) / 2.0f;
        NewRevolutCardsCarouselDelegate.Companion companion = NewRevolutCardsCarouselDelegate.INSTANCE;
        Intrinsics.h(context);
        companion.getClass();
        if (!NewRevolutCardsCarouselDelegate.Companion.a(context)) {
            return (i2 * 0.02f) + f;
        }
        float f4 = 0.5f * f;
        float fL = kli.a.l(context, 48.0f);
        if (f4 > fL) {
            f4 = fL;
        }
        return f + f4;
    }

    public final void H(int i, int i2) {
        boolean z = this.i;
        ViewPager2 viewPager = this.f;
        if (z) {
            final float F = F(i, i2);
            ls0.c cVar = ls0.d.Companion;
            final int i3 = 0;
            Function1 function1 = new Function1(this) { // from class: ip0.oy

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ com.revolut.core.ui_kit.delegates.t9 f165736b;

                {
                    this.f165736b = this;
                }

                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    int i5;
                    float f;
                    int i6 = i3;
                    float f4 = F;
                    com.revolut.core.ui_kit.delegates.t9 t9Var = this.f165736b;
                    float fFloatValue = ((Float) obj2).floatValue();
                    switch (i6) {
                        case 0:
                            ViewPager2 viewPager2 = t9Var.f;
                            Object obj3 = or0.u.f228038a;
                            Intrinsics.checkNotNullParameter(viewPager2, "<this>");
                            i5 = viewPager2.getLayoutDirection() == 1 ? 1 : -1;
                            f = kotlin.ranges.f.f(fFloatValue, -1.0f, 1.0f);
                            break;
                        default:
                            ViewPager2 viewPager22 = t9Var.f;
                            Object obj4 = or0.u.f228038a;
                            Intrinsics.checkNotNullParameter(viewPager22, "<this>");
                            i5 = viewPager22.getLayoutDirection() == 1 ? 1 : -1;
                            f = kotlin.ranges.f.f(fFloatValue, -1.0f, 1.0f);
                            break;
                    }
                    return Float.valueOf(f * f4 * i5);
                }
            };
            ip0.za zaVar = new ip0.za(10);
            cVar.getClass();
            ls0.c.a(i2, function1, zaVar, viewPager);
            return;
        }
        final float F2 = F(i, i2);
        ls0.c cVar2 = ls0.d.Companion;
        final int i5 = 1;
        Function1 translationXDelegate = new Function1(this) { // from class: ip0.oy

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ com.revolut.core.ui_kit.delegates.t9 f165736b;

            {
                this.f165736b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                int i59;
                float f;
                int i6 = i5;
                float f4 = F2;
                com.revolut.core.ui_kit.delegates.t9 t9Var = this.f165736b;
                float fFloatValue = ((Float) obj2).floatValue();
                switch (i6) {
                    case 0:
                        ViewPager2 viewPager2 = t9Var.f;
                        Object obj3 = or0.u.f228038a;
                        Intrinsics.checkNotNullParameter(viewPager2, "<this>");
                        i59 = viewPager2.getLayoutDirection() == 1 ? 1 : -1;
                        f = kotlin.ranges.f.f(fFloatValue, -1.0f, 1.0f);
                        break;
                    default:
                        ViewPager2 viewPager22 = t9Var.f;
                        Object obj4 = or0.u.f228038a;
                        Intrinsics.checkNotNullParameter(viewPager22, "<this>");
                        i59 = viewPager22.getLayoutDirection() == 1 ? 1 : -1;
                        f = kotlin.ranges.f.f(fFloatValue, -1.0f, 1.0f);
                        break;
                }
                return Float.valueOf(f * f4 * i59);
            }
        };
        cVar2.getClass();
        Intrinsics.checkNotNullParameter(translationXDelegate, "translationXDelegate");
        Intrinsics.checkNotNullParameter(viewPager, "viewPager");
        ls0.c.a(Integer.MIN_VALUE, translationXDelegate, null, viewPager);
    }

    public final void I() {
        Context context = this.itemView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        NewRevolutCardsCarouselDelegate newRevolutCardsCarouselDelegate = this.k;
        int iQ = newRevolutCardsCarouselDelegate.q(context);
        Context context2 = this.itemView.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        H(iQ, newRevolutCardsCarouselDelegate.p(context2));
        this.f.post(new fp0.l(this, 11));
    }
}
