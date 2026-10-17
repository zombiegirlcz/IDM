package com.revolut.core.ui_kit.views.stories;

import akl.s;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.lifecycle.Lifecycle;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import bx0.x;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.core.ui_kit.R$id;
import com.revolut.core.ui_kit.R$layout;
import com.revolut.core.ui_kit.R$styleable;
import com.revolut.core.ui_kit.internal.views.stories.StoryPagesView;
import com.revolut.core.ui_kit.internal.views.stories.TouchNavigatedViewPager;
import com.revolut.core.ui_kit.storiesdelegates.CircleProgressStoriesDelegate;
import com.revolut.core.ui_kit.storiesdelegates.ErrorStoriesPageDelegate;
import com.revolut.core.ui_kit.storiesdelegates.ImageStoriesDelegate;
import com.revolut.core.ui_kit.storiesdelegates.LoadingStoriesPageDelegate;
import com.revolut.core.ui_kit.storiesdelegates.MetadataStoriesPageDelegate;
import com.revolut.core.ui_kit.storiesdelegates.MultibarStoriesDelegate;
import com.revolut.core.ui_kit.storiesdelegates.SimpleStoriesDelegate;
import com.revolut.core.ui_kit.storiesdelegates.StickerStoriesPageDelegate;
import com.revolut.core.ui_kit.storiesdelegates.StoriesDelegate;
import com.revolut.core.ui_kit.storiesdelegates.StoriesDelegateModel;
import com.revolut.core.ui_kit_resources.R$style;
import e8.q;
import hy0.g;
import ihm.f;
import java.util.List;
import jo0.m;
import kli.a;
import koi.c;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import or0.u;
import org.jetbrains.annotations.NotNull;
import oz0.d;
import ru0.e;
import ru0.i;
import te0.w;
import yp0.j0;
import z4l.j;
import zhm.v;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 -2\u00020\u00012\u00020\u0002:\u0005.\u001f/01B'\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ\u001b\u0010\u0013\u001a\u00020\r2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0017\u001a\u00020\r2\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0017\u0010\u0018R\u001b\u0010\u001e\u001a\u00020\u00198BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001f\u0010$\u001a\u00060\u001fR\u00020\u00008BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u0016\u0010(\u001a\u0004\u0018\u00010%8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b&\u0010'R\u0014\u0010,\u001a\u00020)8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b*\u0010+¨\u00062"}, d2 = {"Lcom/revolut/core/ui_kit/views/stories/StoriesPagerView;", "Landroid/widget/FrameLayout;", "Lru0/i;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", "isSkippable", "", "setSkippable", "(Z)V", "", "Lcom/revolut/core/ui_kit/storiesdelegates/StoriesDelegateModel;", "items", "setItems", "(Ljava/util/List;)V", "Landroidx/lifecycle/Lifecycle;", "lifecycle", "setupStoryDelegate", "(Landroidx/lifecycle/Lifecycle;)V", "Lcom/revolut/core/ui_kit/internal/views/stories/TouchNavigatedViewPager;", "e", "Le8/q;", "getStoriesTouchPager", "()Lcom/revolut/core/ui_kit/internal/views/stories/TouchNavigatedViewPager;", "storiesTouchPager", "Lhy0/f;", "m", "Lkotlin/Lazy;", "getVolumeReceiverLifecycleObserver", "()Lhy0/f;", "volumeReceiverLifecycleObserver", "Lcom/revolut/core/ui_kit/internal/views/stories/StoryPagesView;", "getCurrentView", "()Lcom/revolut/core/ui_kit/internal/views/stories/StoryPagesView;", "currentView", "Landroidx/viewpager2/widget/ViewPager2;", "getViewPager", "()Landroidx/viewpager2/widget/ViewPager2;", "viewPager", "Companion", "b", "hy0/d", "a", "hy0/c", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class StoriesPagerView extends FrameLayout implements i {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final StoriesDelegate f59735a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ErrorStoriesPageDelegate f59736b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f59737c;
    public final j d;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public final q storiesTouchPager;
    public final f f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final f f59738g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final f f59739h;
    public final f i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final f f59740j;
    public final boolean k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f59741l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final Object f59742m;

    /* JADX INFO: renamed from: com.revolut.core.ui_kit.views.stories.StoriesPagerView$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }
    }

    public static final class b implements ViewPager2.PageTransformer {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f59743a = -1;

        @Override // androidx.viewpager2.widget.ViewPager2.PageTransformer
        public final void transformPage(View view, float f) {
            Intrinsics.checkNotNullParameter(view, "view");
            float width = BitmapDescriptorFactory.HUE_RED;
            if (f < BitmapDescriptorFactory.HUE_RED) {
                width = view.getWidth();
            }
            view.setPivotX(width);
            view.setPivotY(view.getHeight() * 0.5f);
            view.setRotationY(f * 20.0f);
            boolean z = f == BitmapDescriptorFactory.HUE_RED;
            StoryPagesView storyPagesView = (StoryPagesView) view;
            if (z) {
                storyPagesView.r0(this.f59743a != storyPagesView.getStoryPos());
            } else {
                storyPagesView.q0();
            }
            if (z) {
                this.f59743a = storyPagesView.getStoryPos();
            }
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public StoriesPagerView(@NotNull Context context) {
        this(context, null, 6, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public static void g(StoriesPagerView storiesPagerView) {
        StoryPagesView currentView = storiesPagerView.getCurrentView();
        if (currentView != null) {
            currentView.q0();
        }
    }

    private final StoryPagesView getCurrentView() {
        TouchNavigatedViewPager storiesTouchPager = getStoriesTouchPager();
        StoriesDelegate.Companion aVar = StoriesDelegate.INSTANCE;
        int currentItem = getViewPager().getCurrentItem();
        aVar.getClass();
        return (StoryPagesView) storiesTouchPager.findViewWithTag("PAGE_TAG" + currentItem);
    }

    private final TouchNavigatedViewPager getStoriesTouchPager() {
        return (TouchNavigatedViewPager) this.storiesTouchPager.f();
    }

    private final ViewPager2 getViewPager() {
        return getStoriesTouchPager().getPager();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    private final hy0.f getVolumeReceiverLifecycleObserver() {
        return (hy0.f) this.f59742m.getValue();
    }

    public static Unit h(StoriesPagerView storiesPagerView, e navigation) {
        Intrinsics.checkNotNullParameter(navigation, "navigation");
        int i = g.f156628a[navigation.ordinal()];
        if (i == 1) {
            int currentItem = storiesPagerView.getViewPager().getCurrentItem() + 1;
            storiesPagerView.getViewPager().setCurrentItem(currentItem);
            if (currentItem >= storiesPagerView.d.f319395l.size()) {
                storiesPagerView.f.onNext(new Object());
            }
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            storiesPagerView.getViewPager().setCurrentItem(storiesPagerView.getViewPager().getCurrentItem() - 1);
        }
        StoryPagesView currentView = storiesPagerView.getCurrentView();
        if (currentView != null) {
            currentView.setVideoVolumeMode(d.ALWAYS);
        }
        return Unit.f186387a;
    }

    public static void i(StoriesPagerView storiesPagerView) {
        StoryPagesView currentView = storiesPagerView.getCurrentView();
        if (currentView != null) {
            currentView.r0(false);
        }
    }

    public static WindowInsetsCompat j(StoriesPagerView storiesPagerView, View v, WindowInsetsCompat insets) {
        Intrinsics.checkNotNullParameter(v, "v");
        Intrinsics.checkNotNullParameter(insets, "insets");
        int systemWindowInsetTop = insets.getSystemWindowInsetTop();
        int systemWindowInsetBottom = storiesPagerView.k ? insets.getSystemWindowInsetBottom() : 0;
        StoriesDelegate storiesDelegate = storiesPagerView.f59735a;
        storiesDelegate.f58263l = systemWindowInsetTop;
        storiesDelegate.f58264m = systemWindowInsetBottom;
        RecyclerView recyclerViewA = j0.a(storiesPagerView.getViewPager());
        int childCount = recyclerViewA.getChildCount();
        for (int i = 0; i < childCount; i++) {
            RecyclerView.ViewHolder childViewHolder = recyclerViewA.getChildViewHolder(recyclerViewA.getChildAt(i));
            if (childViewHolder instanceof x) {
                ((x) childViewHolder).F(systemWindowInsetTop, systemWindowInsetBottom);
            }
        }
        return WindowInsetsCompat.toWindowInsetsCompat(v.onApplyWindowInsets(insets.toWindowInsets()));
    }

    public static final void k(StoriesPagerView storiesPagerView) {
        StoryPagesView currentView = storiesPagerView.getCurrentView();
        if (currentView != null) {
            currentView.setVideoVolumeMode(d.ALWAYS);
        }
    }

    @Override // ru0.i
    public final void a() {
        StoryPagesView currentView = getCurrentView();
        if (currentView != null) {
            currentView.r0(false);
        }
    }

    @Override // ru0.i
    public final void b() {
        if (!this.f59741l) {
            this.f59740j.onNext(Unit.f186387a);
            return;
        }
        hy0.d dVar = hy0.d.NEXT;
        this.f59739h.onNext(dVar);
        StoryPagesView currentView = getCurrentView();
        if (currentView != null) {
            currentView.n0();
        }
        this.f59738g.onNext(dVar);
    }

    @Override // ru0.i
    public final boolean c(MotionEvent e) {
        Intrinsics.checkNotNullParameter(e, "e");
        StoryPagesView currentView = getCurrentView();
        if (currentView != null) {
            return currentView.m0(e);
        }
        return false;
    }

    @Override // ru0.i
    public final void d() {
        hy0.d dVar = hy0.d.PREVIOUS;
        this.f59739h.onNext(dVar);
        StoryPagesView currentView = getCurrentView();
        if (currentView != null) {
            currentView.o0();
        }
        this.f59738g.onNext(dVar);
    }

    @Override // ru0.i
    public final void e() {
        this.i.onNext(Unit.f186387a);
    }

    @Override // ru0.i
    public final void f() {
        StoryPagesView currentView = getCurrentView();
        if (currentView != null) {
            currentView.q0();
        }
    }

    public final v60.i l() {
        return getStoriesTouchPager().getLifecycleEventSubject();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        u.g(this).addObserver(getVolumeReceiverLifecycleObserver());
        super.onAttachedToWindow();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        u.g(this).removeObserver(getVolumeReceiverLifecycleObserver());
    }

    public final void setItems(@NotNull List<? extends StoriesDelegateModel> items) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.d.c(items);
    }

    public final void setSkippable(boolean isSkippable) {
        this.f59741l = isSkippable;
    }

    public final void setupStoryDelegate(@NotNull Lifecycle lifecycle) {
        Intrinsics.checkNotNullParameter(lifecycle, "lifecycle");
        this.f59735a.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public StoriesPagerView(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public StoriesPagerView(@NotNull Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        StoriesDelegate storiesDelegate = new StoriesDelegate();
        this.f59735a = storiesDelegate;
        ErrorStoriesPageDelegate errorStoriesPageDelegate = new ErrorStoriesPageDelegate();
        this.f59736b = errorStoriesPageDelegate;
        List delegates = v.k(new SimpleStoriesDelegate(), new CircleProgressStoriesDelegate(), new MultibarStoriesDelegate(), new StickerStoriesPageDelegate(0), new LoadingStoriesPageDelegate(), new MetadataStoriesPageDelegate(), new ImageStoriesDelegate(), errorStoriesPageDelegate);
        this.f59737c = delegates;
        c cVar = new c(0);
        cVar.a(storiesDelegate);
        j jVar = new j(cVar, false, 14);
        this.d = jVar;
        this.storiesTouchPager = a.J(R$id.storiesTouchPager, this);
        this.f = v0.a.d("create(...)");
        this.f59738g = v0.a.d("create(...)");
        this.f59739h = v0.a.d("create(...)");
        this.i = v0.a.d("create(...)");
        this.f59740j = v0.a.d("create(...)");
        this.f59741l = true;
        this.f59742m = w.y0(new hy0.a(this, 0 == true ? 1 : 0));
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, R$styleable.StoriesPagerView, i, 0);
        Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, "obtainStyledAttributes(...)");
        boolean z = typedArrayObtainStyledAttributes.getBoolean(R$styleable.StoriesPagerView_uikit_drawBehindNavigationBar, false);
        this.k = z;
        Unit unit = Unit.f186387a;
        typedArrayObtainStyledAttributes.recycle();
        if (((Boolean) m.f176849c.f314188a).booleanValue()) {
            context.getTheme().applyStyle(R$style.UiKitThemeOverlay_TextAppearanceMarketing_New, true);
        }
        View.inflate(context, R$layout.internal_main_stories_pager, this);
        ViewPager2 viewPager = getViewPager();
        viewPager.setAdapter(jVar);
        viewPager.setPageTransformer(new b());
        s sVar = new s(this, 17);
        Intrinsics.checkNotNullParameter(sVar, "<set-?>");
        storiesDelegate.d = sVar;
        Intrinsics.checkNotNullParameter(delegates, "delegates");
        storiesDelegate.f58259c = delegates;
        getStoriesTouchPager().setTouchNavigationListener(this);
        setSystemUiVisibility(z ? 1792 : 1280);
        ViewCompat.setOnApplyWindowInsetsListener(this, new ag.j(this, 28));
    }

    public /* synthetic */ StoriesPagerView(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i & 2) != 0 ? null : attributeSet, 0);
    }
}
