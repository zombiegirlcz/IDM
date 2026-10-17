package com.revolut.core.ui_kit.views;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import com.revolut.core.ui_kit.R$id;
import com.revolut.core.ui_kit.R$layout;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import mx0.b3;
import mx0.c3;
import mx0.d3;
import org.jetbrains.annotations.NotNull;
import zhm.h0;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0016\u0018\u0000 \u001a2\u00020\u0001:\u0005\u001b\u001c\u000f\u001d\u001eB'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u001b\u0010\u0016\u001a\u00020\f2\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013¢\u0006\u0004\b\u0016\u0010\u0017J\r\u0010\u0018\u001a\u00020\u0006¢\u0006\u0004\b\u0018\u0010\u0019¨\u0006\u001f"}, d2 = {"Lcom/revolut/core/ui_kit/views/CardsCarouselView;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lz4l/j;", "adapter", "", "setUpPageChangeCallback", "(Lz4l/j;)V", "Lmx0/c3;", "model", "setModel", "(Lmx0/c3;)V", "", "Lkoi/j;", "items", "setItems", "(Ljava/util/List;)V", "getItemsCount", "()I", "Companion", "mx0/d3", "mx0/b3", "tpl/b", "a", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public class CardsCarouselView extends FrameLayout {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ViewPager2 f58404a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public z4l.j f58405b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final d3 f58406c;
    public final ihm.f d;
    public final ihm.f e;
    public final ArrayList f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public b3 f58407g;

    /* JADX INFO: renamed from: com.revolut.core.ui_kit.views.CardsCarouselView$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CardsCarouselView(@NotNull Context context) {
        this(context, null, 6, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setItems$lambda$0(CardsCarouselView cardsCarouselView) {
        cardsCarouselView.f58404a.requestTransform();
    }

    private final void setUpPageChangeCallback(z4l.j adapter) {
        b3 b3Var = this.f58407g;
        ViewPager2 viewPager2 = this.f58404a;
        if (b3Var != null) {
            viewPager2.unregisterOnPageChangeCallback(b3Var);
        }
        b3 b3Var2 = new b3(adapter, this.d, this.e, this.f);
        this.f58407g = b3Var2;
        viewPager2.registerOnPageChangeCallback(b3Var2);
    }

    public final int getItemsCount() {
        return this.f58404a.getChildCount();
    }

    /* JADX WARN: Type inference failed for: r3v4, types: [java.lang.Object, kotlin.Lazy] */
    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i5) {
        float f;
        super.onSizeChanged(i, i2, i3, i5);
        if (i == i3 || this.f58405b == null) {
            return;
        }
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        float fL = kli.a.l(context, 10.0f);
        Companion companion = INSTANCE;
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        companion.getClass();
        Intrinsics.checkNotNullParameter(context2, "context");
        if (((Boolean) jo0.g.f176833q.getValue()).booleanValue() && ny0.i.d(context2)) {
            float f4 = -fL;
            float f5 = fL * 0.5f;
            Context context3 = this.f58404a.getContext();
            Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
            float fL2 = kli.a.l(context3, 48.0f);
            if (f5 > fL2) {
                f5 = fL2;
            }
            f = f4 + f5;
        } else {
            f = -fL;
        }
        this.f58406c.f209645b = f;
    }

    public final void setItems(@NotNull List<? extends koi.j> items) {
        Intrinsics.checkNotNullParameter(items, "items");
        z4l.j jVar = this.f58405b;
        if (jVar != null) {
            jVar.c(items);
            this.f58404a.post(new kt0.d(this, 15));
        } else {
            IllegalStateException illegalStateException = new IllegalStateException("adapter is not initialised: forgot to call setModel() before setItems()?");
            h0 h0Var = h0.f322473a;
            CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
            rd0.d.a(rd0.c.ERROR, "CardsCarouselView", null, illegalStateException, h0Var);
        }
    }

    public final void setModel(@NotNull c3 model) {
        Intrinsics.checkNotNullParameter(model, "model");
        z4l.j jVar = new z4l.j(7, model.f209628a, false);
        this.f58405b = jVar;
        this.f58404a.setAdapter(jVar);
        setUpPageChangeCallback(jVar);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CardsCarouselView(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CardsCarouselView(@NotNull Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        this.d = v0.a.d("create(...)");
        this.e = v0.a.d("create(...)");
        this.f = new ArrayList();
        View.inflate(context, R$layout.internal_view_cards_carousel, this);
        View viewFindViewById = findViewById(R$id.cardsCarousel_viewPager);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        ViewPager2 viewPager = (ViewPager2) viewFindViewById;
        this.f58404a = viewPager;
        View childAt = viewPager.getChildAt(0);
        Intrinsics.i(childAt, "null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView");
        RecyclerView recyclerView = (RecyclerView) childAt;
        int iK = kli.a.k(context, 16.0f);
        recyclerView.setPadding(iK, 0, iK, 0);
        recyclerView.setClipToPadding(false);
        recyclerView.setClipChildren(false);
        d3 d3Var = new d3(viewPager);
        this.f58406c = d3Var;
        ls0.c cVar = ls0.d.Companion;
        mm7.h translationXDelegate = new mm7.h(1, d3Var, d3.class, "calculateTranslation", "calculateTranslation(F)F", 0, 25);
        cVar.getClass();
        Intrinsics.checkNotNullParameter(translationXDelegate, "translationXDelegate");
        Intrinsics.checkNotNullParameter(viewPager, "viewPager");
        ls0.c.a(Integer.MIN_VALUE, translationXDelegate, null, viewPager);
    }

    public /* synthetic */ CardsCarouselView(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i & 2) != 0 ? null : attributeSet, 0);
    }
}
