package com.revolut.core.ui_kit.internal.views.stories;

import akl.t;
import android.animation.ValueAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.ContextCompat;
import androidx.media3.exoplayer.ExoPlayer;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.RecyclerView;
import aw0.o9;
import bx0.a0;
import bx0.b0;
import bx0.c0;
import bx0.d;
import bx0.z;
import com.facebook.shimmer.ShimmerFrameLayout;
import com.revolut.core.ui_kit.R$drawable;
import com.revolut.core.ui_kit.R$id;
import com.revolut.core.ui_kit.R$layout;
import com.revolut.core.ui_kit.internal.drawables.TransitionColorDrawable;
import com.revolut.core.ui_kit.internal.views.videoplayer.UiKitPlayerView;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.storiesdelegates.BaseStoriesDelegate;
import com.revolut.core.ui_kit.storiesdelegates.BaseStoriesModel;
import com.revolut.core.ui_kit.storiesdelegates.StickerStoriesModel;
import com.revolut.core.ui_kit.storiesdelegates.StickerStoriesPageDelegate;
import com.revolut.core.ui_kit.storiesdelegates.StoryColours;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import d7.w;
import e8.q;
import ifm.b;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import jv0.o;
import kli.a;
import koi.c;
import koi.k;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import or0.u;
import org.jetbrains.annotations.NotNull;
import ru0.f;
import ru0.g;
import xv0.e;
import xv0.h;
import xv0.i;
import z4l.j;
import zhm.d0;
import zhm.f0;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000¦\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b#\b\u0007\u0018\u0000 \u0090\u00012\u00020\u0001:\u0006h\u0091\u0001\u0092\u0001\u000fB'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J#\u0010\u0016\u001a\u00020\f2\u0014\u0010\u0015\u001a\u0010\u0012\f\u0012\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u00140\u0013¢\u0006\u0004\b\u0016\u0010\u0017JA\u0010!\u001a\u00020\f2\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u00132\u0006\u0010\u001b\u001a\u00020\u001a2\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001c2\b\b\u0002\u0010\u001e\u001a\u00020\u00062\u0006\u0010 \u001a\u00020\u001f¢\u0006\u0004\b!\u0010\"J\u001b\u0010#\u001a\u00020\f2\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u0013¢\u0006\u0004\b#\u0010\u0017J\u0015\u0010$\u001a\u00020\f2\u0006\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b$\u0010%J\u0015\u0010'\u001a\u00020\f2\u0006\u0010&\u001a\u00020\u001f¢\u0006\u0004\b'\u0010(J\u0017\u0010*\u001a\u00020\f2\u0006\u0010)\u001a\u00020\u0018H\u0002¢\u0006\u0004\b*\u0010+J\u0017\u0010.\u001a\u00020\f2\u0006\u0010-\u001a\u00020,H\u0002¢\u0006\u0004\b.\u0010/J\u0017\u00101\u001a\u00020\f2\u0006\u00100\u001a\u00020\u0006H\u0002¢\u0006\u0004\b1\u00102J\u001b\u00103\u001a\u00020\f2\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001cH\u0002¢\u0006\u0004\b3\u00104R\u001b\u0010:\u001a\u0002058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b6\u00107\u001a\u0004\b8\u00109R\u001b\u0010?\u001a\u00020;8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b<\u00107\u001a\u0004\b=\u0010>R\u001b\u0010D\u001a\u00020@8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bA\u00107\u001a\u0004\bB\u0010CR\u001b\u0010I\u001a\u00020E8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bF\u00107\u001a\u0004\bG\u0010HR\u001b\u0010L\u001a\u00020;8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bJ\u00107\u001a\u0004\bK\u0010>R\u001b\u0010Q\u001a\u00020M8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bN\u00107\u001a\u0004\bO\u0010PR\u001b\u0010T\u001a\u00020;8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bR\u00107\u001a\u0004\bS\u0010>R\u001b\u0010W\u001a\u00020;8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bU\u00107\u001a\u0004\bV\u0010>R\u001b\u0010\\\u001a\u00020X8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bY\u00107\u001a\u0004\bZ\u0010[R\u001b\u0010a\u001a\u00020\u00068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b]\u0010^\u001a\u0004\b_\u0010`R\"\u0010f\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bb\u0010c\u001a\u0004\bd\u0010`\"\u0004\be\u00102R.\u0010o\u001a\u000e\u0012\u0004\u0012\u00020h\u0012\u0004\u0012\u00020\f0g8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bi\u0010j\u001a\u0004\bk\u0010l\"\u0004\bm\u0010nR(\u0010w\u001a\b\u0012\u0004\u0012\u00020\f0p8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bq\u0010r\u001a\u0004\bs\u0010t\"\u0004\bu\u0010vR.\u0010{\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\f0g8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bx\u0010j\u001a\u0004\by\u0010l\"\u0004\bz\u0010nR.\u0010\u007f\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\f0g8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b|\u0010j\u001a\u0004\b}\u0010l\"\u0004\b~\u0010nRG\u0010\u0084\u0001\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\f0g2\u0013\u0010\u0080\u0001\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\f0g8\u0006@FX\u0086\u000e¢\u0006\u0015\n\u0005\b\u0081\u0001\u0010j\u001a\u0005\b\u0082\u0001\u0010l\"\u0005\b\u0083\u0001\u0010nRG\u0010\u0088\u0001\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\f0g2\u0013\u0010\u0080\u0001\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\f0g8\u0006@FX\u0086\u000e¢\u0006\u0015\n\u0005\b\u0085\u0001\u0010j\u001a\u0005\b\u0086\u0001\u0010l\"\u0005\b\u0087\u0001\u0010nRF\u0010\u008b\u0001\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\f0g2\u0013\u0010\u0080\u0001\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\f0g8\u0006@FX\u0086\u000e¢\u0006\u0014\n\u0004\bc\u0010j\u001a\u0005\b\u0089\u0001\u0010l\"\u0005\b\u008a\u0001\u0010nRG\u0010\u008f\u0001\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\f0g2\u0013\u0010\u0080\u0001\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\f0g8\u0006@FX\u0086\u000e¢\u0006\u0015\n\u0005\b\u008c\u0001\u0010j\u001a\u0005\b\u008d\u0001\u0010l\"\u0005\b\u008e\u0001\u0010n¨\u0006\u0093\u0001"}, d2 = {"Lcom/revolut/core/ui_kit/internal/views/stories/StoryPagesView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Loz0/d;", "videoVolumeMode", "", "setVideoVolumeMode", "(Loz0/d;)V", "Lru0/f;", "state", "setState", "(Lru0/f;)V", "", "Lcom/revolut/core/ui_kit/storiesdelegates/BaseStoriesDelegate;", "delegates", "setStoryDelegates", "(Ljava/util/List;)V", "Lcom/revolut/core/ui_kit/storiesdelegates/BaseStoriesModel;", "models", "Lcom/revolut/core/ui_kit/models/Clause;", "title", "Lcom/revolut/core/ui_kit_core/displayers/image/Image;", "icon", "startIndex", "", "loop", "setStoryPages", "(Ljava/util/List;Lcom/revolut/core/ui_kit/models/Clause;Lcom/revolut/core/ui_kit_core/displayers/image/Image;IZ)V", "setStories", "setTitle", "(Lcom/revolut/core/ui_kit/models/Clause;)V", "isVisible", "setCloseIconVisible", "(Z)V", "story", "setPageBackground", "(Lcom/revolut/core/ui_kit/storiesdelegates/BaseStoriesModel;)V", "Lxv0/i;", "renderState", "setRenderStateForChildViewHolders", "(Lxv0/i;)V", "index", "setCurrentPageIndex", "(I)V", "setIcon", "(Lcom/revolut/core/ui_kit_core/displayers/image/Image;)V", "Lcom/revolut/core/ui_kit/internal/views/stories/StoriesHorizontalStepsProgressView;", "o", "Le8/q;", "getStepsProgressView", "()Lcom/revolut/core/ui_kit/internal/views/stories/StoriesHorizontalStepsProgressView;", "stepsProgressView", "Landroid/widget/ImageView;", "p", "getIconClose", "()Landroid/widget/ImageView;", "iconClose", "Lcom/revolut/core/ui_kit/internal/views/videoplayer/UiKitPlayerView;", "q", "getBackgroundPlayerView", "()Lcom/revolut/core/ui_kit/internal/views/videoplayer/UiKitPlayerView;", "backgroundPlayerView", "Landroidx/recyclerview/widget/RecyclerView;", "r", "getStoryContentRecycler", "()Landroidx/recyclerview/widget/RecyclerView;", "storyContentRecycler", "s", "getBackgroundImage", "backgroundImage", "Landroid/widget/TextView;", "t", "getTitleView", "()Landroid/widget/TextView;", "titleView", "u", "getCustomIconStart", "customIconStart", "v", "getIconStart", "iconStart", "Lcom/facebook/shimmer/ShimmerFrameLayout;", "w", "getTitleShimmer", "()Lcom/facebook/shimmer/ShimmerFrameLayout;", "titleShimmer", "x", "Lkotlin/Lazy;", "getInitialProgressViewTopMargin", "()I", "initialProgressViewTopMargin", "B", "I", "getStoryPos", "setStoryPos", "storyPos", "Lkotlin/Function1;", "Lru0/e;", "C", "Lkotlin/jvm/functions/Function1;", "getPageNavigationListener", "()Lkotlin/jvm/functions/Function1;", "setPageNavigationListener", "(Lkotlin/jvm/functions/Function1;)V", "pageNavigationListener", "Lkotlin/Function0;", "D", "Lkotlin/jvm/functions/Function0;", "getCloseClickListener", "()Lkotlin/jvm/functions/Function0;", "setCloseClickListener", "(Lkotlin/jvm/functions/Function0;)V", "closeClickListener", "E", "getPageShownListener", "setPageShownListener", "pageShownListener", "F", "getPageCompletedListener", "setPageCompletedListener", "pageCompletedListener", "value", "G", "getButtonClickListener", "setButtonClickListener", "buttonClickListener", "H", "getSecondaryButtonClickListener", "setSecondaryButtonClickListener", "secondaryButtonClickListener", "getLinkClickListener", "setLinkClickListener", "linkClickListener", "J", "getBottomSwipeListener", "setBottomSwipeListener", "bottomSwipeListener", "Companion", "yf/c", "a", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class StoryPagesView extends ConstraintLayout {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();
    public f A;

    /* JADX INFO: renamed from: B, reason: from kotlin metadata */
    public int storyPos;

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    public Function1 pageNavigationListener;

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    public Function0 closeClickListener;

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    public Function1 pageShownListener;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    public Function1 pageCompletedListener;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    public Function1 buttonClickListener;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    public Function1 secondaryButtonClickListener;

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    public Function1 linkClickListener;

    /* JADX INFO: renamed from: J, reason: from kotlin metadata */
    public Function1 bottomSwipeListener;
    public final b K;
    public boolean L;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ihm.f f57579b;
    public List f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Clause f57580g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f57581h;
    public c0 i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public TransitionColorDrawable f57582j;
    public int k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public List f57583l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final c f57584m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final j f57585n;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    public final q stepsProgressView;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    public final q iconClose;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    public final q backgroundPlayerView;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    public final q storyContentRecycler;

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
    public final q backgroundImage;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    public final q titleView;

    /* JADX INFO: renamed from: u, reason: from kotlin metadata */
    public final q customIconStart;

    /* JADX INFO: renamed from: v, reason: from kotlin metadata */
    public final q iconStart;

    /* JADX INFO: renamed from: w, reason: collision with root package name and from kotlin metadata */
    public final q titleShimmer;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final Object f57592x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final LinkedHashMap f57593y;
    public boolean z;

    /* JADX INFO: renamed from: com.revolut.core.ui_kit.internal.views.stories.StoryPagesView$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public StoryPagesView(@NotNull Context context) {
        this(context, null, 6, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public static Unit f0(StoryPagesView storyPagesView, StickerStoriesModel storyModel, int i) {
        Intrinsics.checkNotNullParameter(storyModel, "storyModel");
        storyPagesView.f57593y.put(storyModel, Integer.valueOf(i));
        if (Intrinsics.f(storyPagesView.f.get(storyPagesView.f57581h), storyModel)) {
            storyPagesView.setPageBackground(storyModel);
        }
        return Unit.f186387a;
    }

    public static Unit g0(b0 b0Var, yf.c cVar, StoryPagesView storyPagesView, o oVar) {
        long jMax = 5000;
        if (b0Var.f19398c) {
            long j2 = oVar.f178757c;
            if (j2 != -9223372036854775807L && j2 != 0) {
                jMax = b0Var.d ? Math.max(5000L, j2) : j2;
            }
        }
        boolean z = oVar.f178755a;
        float overallProgress = storyPagesView.getStepsProgressView().getOverallProgress();
        StoryPagesView storyPagesView2 = (StoryPagesView) cVar.b;
        if (z) {
            if (storyPagesView2.getBackgroundImage().getVisibility() == 0) {
                storyPagesView2.getBackgroundImage().setVisibility(8);
            }
            storyPagesView2.getStepsProgressView().c(overallProgress, jMax);
        } else {
            storyPagesView2.getStepsProgressView().f57578m.a();
        }
        return Unit.f186387a;
    }

    private final ImageView getBackgroundImage() {
        return (ImageView) this.backgroundImage.f();
    }

    private final UiKitPlayerView getBackgroundPlayerView() {
        return (UiKitPlayerView) this.backgroundPlayerView.f();
    }

    private final ImageView getCustomIconStart() {
        return (ImageView) this.customIconStart.f();
    }

    private final ImageView getIconClose() {
        return (ImageView) this.iconClose.f();
    }

    private final ImageView getIconStart() {
        return (ImageView) this.iconStart.f();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    private final int getInitialProgressViewTopMargin() {
        return ((Number) this.f57592x.getValue()).intValue();
    }

    private final StoriesHorizontalStepsProgressView getStepsProgressView() {
        return (StoriesHorizontalStepsProgressView) this.stepsProgressView.f();
    }

    private final RecyclerView getStoryContentRecycler() {
        return (RecyclerView) this.storyContentRecycler.f();
    }

    private final ShimmerFrameLayout getTitleShimmer() {
        return (ShimmerFrameLayout) this.titleShimmer.f();
    }

    private final TextView getTitleView() {
        return (TextView) this.titleView.f();
    }

    public static Unit h0(StoryPagesView storyPagesView) {
        storyPagesView.setRenderStateForChildViewHolders(h.f309151a);
        return Unit.f186387a;
    }

    public static Unit i0(StoryPagesView storyPagesView) {
        storyPagesView.setRenderStateForChildViewHolders(e.f309148a);
        return Unit.f186387a;
    }

    public static Unit j0(StoryPagesView storyPagesView, int i) {
        if (i != storyPagesView.f57581h) {
            storyPagesView.setCurrentPageIndex(i);
        }
        return Unit.f186387a;
    }

    public static int l0(StoryPagesView storyPagesView) {
        ViewGroup.LayoutParams layoutParams = storyPagesView.getStepsProgressView().getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
        if (marginLayoutParams != null) {
            return marginLayoutParams.topMargin;
        }
        return 0;
    }

    private final void setCurrentPageIndex(int index) {
        if (this.f57581h == index) {
            return;
        }
        this.f57581h = index;
        ihm.f fVar = this.f57579b;
        if (index < 0) {
            this.f57581h = 0;
            Function1 function1 = this.pageNavigationListener;
            ru0.e eVar = ru0.e.PREV;
            function1.invoke(eVar);
            fVar.onNext(eVar);
        } else if (this.z && index >= this.f.size()) {
            this.f57581h = 0;
            s0();
        } else if (this.f57581h >= this.f.size()) {
            this.f57581h = this.f.size() - 1;
            Function1 function12 = this.pageNavigationListener;
            ru0.e eVar2 = ru0.e.NEXT;
            function12.invoke(eVar2);
            fVar.onNext(eVar2);
        } else {
            s0();
        }
        int i = this.f57581h;
        if (i >= 0) {
            StoryColours i2 = ((BaseStoriesModel) this.f.get(i)).getI();
            TextView titleView = getTitleView();
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            titleView.setTextColor(a.s(i2.f58279c, context));
            ImageView iconStart = getIconStart();
            Context context2 = getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
            rd0.e.q(iconStart, Integer.valueOf(a.s(i2.f, context2)));
            ImageView iconClose = getIconClose();
            Context context3 = getContext();
            Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
            rd0.e.q(iconClose, Integer.valueOf(a.s(i2.f58280g, context3)));
            StoriesHorizontalStepsProgressView stepsProgressView = getStepsProgressView();
            Context context4 = getContext();
            Intrinsics.checkNotNullExpressionValue(context4, "getContext(...)");
            stepsProgressView.setBaseColor(a.s(i2.d, context4));
            StoriesHorizontalStepsProgressView stepsProgressView2 = getStepsProgressView();
            Context context5 = getContext();
            Intrinsics.checkNotNullExpressionValue(context5, "getContext(...)");
            stepsProgressView2.setProgressColor(a.s(i2.e, context5));
        }
    }

    private final void setIcon(Image icon) {
        boolean z = this.A == f.CONTENT;
        if (icon == null) {
            getCustomIconStart().setVisibility(4);
            getIconStart().setVisibility(z ? 0 : 4);
        } else {
            getCustomIconStart().setVisibility(z ? 0 : 4);
            getIconStart().setVisibility(4);
            yy0.f.e(u.k(this).Q(), icon, getCustomIconStart(), null, null, 12);
        }
    }

    private final void setPageBackground(BaseStoriesModel story) {
        c0 f58214g = story.getF58214g();
        this.i = f58214g;
        TransitionColorDrawable transitionColorDrawable = this.f57582j;
        if (transitionColorDrawable == null) {
            Intrinsics.r("backgroundDrawable");
            throw null;
        }
        c0 f58214g2 = story.getF58214g();
        Integer num = ((f58214g2 instanceof a0) && ((a0) f58214g2).f19391b) ? (Integer) this.f57593y.get(story) : null;
        int iIntValue = num != null ? num.intValue() : f58214g.a();
        if (iIntValue != transitionColorDrawable.f56021a) {
            transitionColorDrawable.f56021a = iIntValue;
            ValueAnimator valueAnimator = transitionColorDrawable.f56023c;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            ValueAnimator valueAnimatorOfArgb = ValueAnimator.ofArgb(transitionColorDrawable.f56022b.getColor(), transitionColorDrawable.f56021a);
            valueAnimatorOfArgb.addUpdateListener(new w(transitionColorDrawable, 1));
            transitionColorDrawable.f56023c = valueAnimatorOfArgb;
            valueAnimatorOfArgb.setDuration(200L);
            ValueAnimator valueAnimator2 = transitionColorDrawable.f56023c;
            if (valueAnimator2 != null) {
                valueAnimator2.start();
            }
        }
        if (f58214g instanceof z) {
            getBackgroundPlayerView().setVisibility(8);
            getBackgroundImage().setVisibility(0);
            getBackgroundPlayerView().setForeground(null);
            z zVar = (z) f58214g;
            getBackgroundImage().setForeground(zVar.f19478c ? ContextCompat.getDrawable(getContext(), R$drawable.internal_story_gradient_overlay) : null);
            setRenderStateForChildViewHolders(xv0.f.f309149a);
            u.k(this).Q().a(zVar.f19476a, getBackgroundImage(), new ru0.a(this, 1), new ru0.b(this, 0));
            return;
        }
        if (!(f58214g instanceof b0)) {
            if (!(f58214g instanceof a0)) {
                throw new NoWhenBranchMatchedException();
            }
            getBackgroundPlayerView().setVisibility(8);
            getBackgroundImage().setVisibility(8);
            setRenderStateForChildViewHolders(h.f309151a);
            return;
        }
        getBackgroundPlayerView().setVisibility(0);
        getBackgroundImage().setVisibility(8);
        b0 b0Var = (b0) f58214g;
        getBackgroundPlayerView().setForeground(b0Var.e ? ContextCompat.getDrawable(getContext(), R$drawable.internal_story_gradient_overlay) : null);
        getBackgroundImage().setForeground(null);
        u.k(this).V().a(b0Var.f19396a, getBackgroundPlayerView(), null);
    }

    private final void setRenderStateForChildViewHolders(i renderState) {
        RecyclerView storyContentRecycler = getStoryContentRecycler();
        int childCount = storyContentRecycler.getChildCount();
        for (int i = 0; i < childCount; i++) {
            RecyclerView.ViewHolder childViewHolder = storyContentRecycler.getChildViewHolder(storyContentRecycler.getChildAt(i));
            if (childViewHolder instanceof d) {
                ((d) childViewHolder).setItemRenderState(renderState);
            }
        }
    }

    public static /* synthetic */ void setStoryPages$default(StoryPagesView storyPagesView, List list, Clause clause, Image image, int i, boolean z, int i2, Object obj2) {
        if ((i2 & 4) != 0) {
            image = null;
        }
        Image image2 = image;
        if ((i2 & 8) != 0) {
            i = 0;
        }
        storyPagesView.setStoryPages(list, clause, image2, i, z);
    }

    @NotNull
    public final Function1<BaseStoriesModel, Unit> getBottomSwipeListener() {
        return this.bottomSwipeListener;
    }

    @NotNull
    public final Function1<BaseStoriesModel, Unit> getButtonClickListener() {
        return this.buttonClickListener;
    }

    @NotNull
    public final Function0<Unit> getCloseClickListener() {
        return this.closeClickListener;
    }

    @NotNull
    public final Function1<BaseStoriesModel, Unit> getLinkClickListener() {
        return this.linkClickListener;
    }

    @NotNull
    public final Function1<BaseStoriesModel, Unit> getPageCompletedListener() {
        return this.pageCompletedListener;
    }

    @NotNull
    public final Function1<ru0.e, Unit> getPageNavigationListener() {
        return this.pageNavigationListener;
    }

    @NotNull
    public final Function1<BaseStoriesModel, Unit> getPageShownListener() {
        return this.pageShownListener;
    }

    @NotNull
    public final Function1<BaseStoriesModel, Unit> getSecondaryButtonClickListener() {
        return this.secondaryButtonClickListener;
    }

    public final int getStoryPos() {
        return this.storyPos;
    }

    public final boolean m0(MotionEvent e) {
        Intrinsics.checkNotNullParameter(e, "e");
        View viewFindChildViewUnder = getStoryContentRecycler().findChildViewUnder(e.getX(), e.getY());
        if (viewFindChildViewUnder != null) {
            return viewFindChildViewUnder.dispatchTouchEvent(e);
        }
        return false;
    }

    public final void n0() {
        if (this.A != f.CONTENT) {
            return;
        }
        setCurrentPageIndex(this.f57581h + 1);
    }

    public final void o0() {
        if (this.A != f.CONTENT) {
            return;
        }
        setCurrentPageIndex(this.f57581h - 1);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        q0();
        super.onDetachedFromWindow();
    }

    public final void p0(int i, int i2) {
        u.y(getStepsProgressView(), 0, getInitialProgressViewTopMargin() + i, 0, 0, 13);
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        int iK = a.k(context, 50.0f) + i;
        for (BaseStoriesDelegate baseStoriesDelegate : this.f57583l) {
            baseStoriesDelegate.f58177h = iK;
            baseStoriesDelegate.f58176g = i2;
        }
        RecyclerView storyContentRecycler = getStoryContentRecycler();
        int childCount = storyContentRecycler.getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            RecyclerView.ViewHolder childViewHolder = storyContentRecycler.getChildViewHolder(storyContentRecycler.getChildAt(i3));
            if (childViewHolder instanceof d) {
                d dVar = (d) childViewHolder;
                if (dVar.f19401h != iK || dVar.f19400g != i2) {
                    dVar.f19401h = iK;
                    dVar.f19400g = i2;
                    dVar.F(iK, i2);
                }
            }
        }
    }

    public final void q0() {
        if (this.L) {
            b bVar = this.K;
            bVar.d();
            bVar.d();
            if (this.i instanceof b0) {
                getBackgroundPlayerView().h();
            }
            getStepsProgressView().f57578m.a();
            this.L = false;
        }
    }

    public final void r0(boolean z) {
        if (this.L) {
            return;
        }
        this.L = true;
        BaseStoriesModel baseStoriesModel = (BaseStoriesModel) d0.e0(this.f57581h - 1, this.f);
        if (baseStoriesModel != null) {
            this.pageCompletedListener.invoke(baseStoriesModel);
        }
        int i = this.f57581h;
        if (i != -1 && i != this.k) {
            BaseStoriesModel baseStoriesModel2 = (BaseStoriesModel) d0.e0(i, this.f);
            if (baseStoriesModel2 != null) {
                this.pageShownListener.invoke(baseStoriesModel2);
            }
            this.k = this.f57581h;
        }
        if (this.i instanceof b0) {
            if (z && this.A == f.CONTENT) {
                getStepsProgressView().setStartPosition(this.f57581h);
            }
            c0 c0Var = this.i;
            if (!(c0Var instanceof b0)) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            b0 b0Var = (b0) c0Var;
            te0.w.j0(this.K, te0.w.a0(getBackgroundPlayerView().f57715r, new qza.q(1)).subscribe(new pv9.b(new ru0.c(b0Var, new yf.c(this, b0Var), this), 17)));
            if (z) {
                UiKitPlayerView backgroundPlayerView = getBackgroundPlayerView();
                backgroundPlayerView.f57710l = 0L;
                ExoPlayer exoPlayer = backgroundPlayerView.f57712n;
                if (exoPlayer != null) {
                    exoPlayer.seekTo(0L);
                    backgroundPlayerView.f57710l = null;
                }
            }
            getBackgroundPlayerView().i();
        } else if (this.A == f.CONTENT) {
            if (z) {
                getStepsProgressView().c(this.f57581h, 5000L);
            } else {
                getStepsProgressView().f57578m.b();
            }
        }
        if (this.A != f.CONTENT) {
            getStepsProgressView().f57578m.a();
        }
    }

    public final void s0() {
        boolean z = this.L;
        q0();
        BaseStoriesModel baseStoriesModel = (BaseStoriesModel) this.f.get(this.f57581h);
        setPageBackground(baseStoriesModel);
        getStoryContentRecycler().scrollToPosition(this.f57581h);
        Clause f58215h = baseStoriesModel.getF58215h();
        if (f58215h == null) {
            f58215h = this.f57580g;
        }
        setTitle(f58215h);
        if (z) {
            r0(true);
        }
    }

    public final void setBottomSwipeListener(@NotNull Function1<? super BaseStoriesModel, Unit> value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.bottomSwipeListener = value;
        for (k kVar : this.f57584m.e()) {
            if (!(kVar instanceof BaseStoriesDelegate)) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            Intrinsics.checkNotNullParameter(value, "<set-?>");
            ((BaseStoriesDelegate) kVar).f = value;
        }
    }

    public final void setButtonClickListener(@NotNull Function1<? super BaseStoriesModel, Unit> value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.buttonClickListener = value;
        for (k kVar : this.f57584m.e()) {
            if (!(kVar instanceof BaseStoriesDelegate)) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            Intrinsics.checkNotNullParameter(value, "<set-?>");
            ((BaseStoriesDelegate) kVar).f58175c = value;
        }
    }

    public final void setCloseClickListener(@NotNull Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(function0, "<set-?>");
        this.closeClickListener = function0;
    }

    public final void setCloseIconVisible(boolean isVisible) {
        getIconClose().setVisibility(isVisible ? 0 : 8);
    }

    public final void setLinkClickListener(@NotNull Function1<? super BaseStoriesModel, Unit> value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.linkClickListener = value;
        for (k kVar : this.f57584m.e()) {
            if (!(kVar instanceof BaseStoriesDelegate)) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            Intrinsics.checkNotNullParameter(value, "<set-?>");
            ((BaseStoriesDelegate) kVar).e = value;
        }
    }

    public final void setPageCompletedListener(@NotNull Function1<? super BaseStoriesModel, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "<set-?>");
        this.pageCompletedListener = function1;
    }

    public final void setPageNavigationListener(@NotNull Function1<? super ru0.e, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "<set-?>");
        this.pageNavigationListener = function1;
    }

    public final void setPageShownListener(@NotNull Function1<? super BaseStoriesModel, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "<set-?>");
        this.pageShownListener = function1;
    }

    public final void setSecondaryButtonClickListener(@NotNull Function1<? super BaseStoriesModel, Unit> value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.secondaryButtonClickListener = value;
        for (k kVar : this.f57584m.e()) {
            if (!(kVar instanceof BaseStoriesDelegate)) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            Intrinsics.checkNotNullParameter(value, "<set-?>");
            ((BaseStoriesDelegate) kVar).d = value;
        }
    }

    public final void setState(@NotNull f state) {
        Intrinsics.checkNotNullParameter(state, "state");
        if (state == this.A) {
            return;
        }
        this.A = state;
        int i = g.f257401a[state.ordinal()];
        if (i == 1) {
            getStepsProgressView().setVisibility(4);
            getTitleShimmer().f();
            getTitleShimmer().setVisibility(4);
            getTitleView().setVisibility(4);
            getIconStart().setVisibility(4);
            return;
        }
        if (i != 2) {
            if (i != 3) {
                throw new NoWhenBranchMatchedException();
            }
            getStepsProgressView().setVisibility(0);
            getTitleShimmer().f();
            getTitleShimmer().setVisibility(4);
            getTitleView().setVisibility(0);
            return;
        }
        getStepsProgressView().setVisibility(0);
        getTitleShimmer().setVisibility(0);
        ifk.b.r(getTitleShimmer());
        getTitleShimmer().e();
        getIconStart().setVisibility(4);
        getTitleView().setVisibility(4);
    }

    public final void setStories(@NotNull List<? extends BaseStoriesModel> models) {
        Intrinsics.checkNotNullParameter(models, "models");
        this.f = models;
        this.f57585n.c(models);
    }

    public final void setStoryDelegates(@NotNull List<? extends BaseStoriesDelegate<?, ?>> delegates) {
        Intrinsics.checkNotNullParameter(delegates, "delegates");
        this.f57583l = delegates;
        Iterator<T> it8 = delegates.iterator();
        while (it8.hasNext()) {
            BaseStoriesDelegate baseStoriesDelegate = (BaseStoriesDelegate) it8.next();
            this.f57584m.a(baseStoriesDelegate);
            Function1 function1 = this.buttonClickListener;
            Intrinsics.checkNotNullParameter(function1, "<set-?>");
            baseStoriesDelegate.f58175c = function1;
            Function1 function12 = this.secondaryButtonClickListener;
            Intrinsics.checkNotNullParameter(function12, "<set-?>");
            baseStoriesDelegate.d = function12;
            Function1 function13 = this.linkClickListener;
            Intrinsics.checkNotNullParameter(function13, "<set-?>");
            baseStoriesDelegate.e = function13;
            Function1 function14 = this.bottomSwipeListener;
            Intrinsics.checkNotNullParameter(function14, "<set-?>");
            baseStoriesDelegate.f = function14;
            if (baseStoriesDelegate instanceof StickerStoriesPageDelegate) {
                t tVar = new t(this, 8);
                Intrinsics.checkNotNullParameter(tVar, "<set-?>");
                ((StickerStoriesPageDelegate) baseStoriesDelegate).f58258j = tVar;
            }
        }
    }

    public final void setStoryPages(@NotNull List<? extends BaseStoriesModel> models, @NotNull Clause title, Image icon, int startIndex, boolean loop) {
        Intrinsics.checkNotNullParameter(models, "models");
        Intrinsics.checkNotNullParameter(title, "title");
        this.f = models;
        this.f57580g = title;
        this.z = loop;
        setTitle(title);
        setIcon(icon);
        getStepsProgressView().setItemsCount(models.size());
        this.f57585n.c(models);
        this.f57581h = -1;
        this.k = -1;
        this.i = null;
        TransitionColorDrawable transitionColorDrawable = new TransitionColorDrawable(models.get(startIndex).getF58214g().a());
        this.f57582j = transitionColorDrawable;
        setBackground(transitionColorDrawable);
        setCurrentPageIndex(startIndex);
    }

    public final void setStoryPos(int i) {
        this.storyPos = i;
    }

    public final void setTitle(@NotNull Clause title) {
        Intrinsics.checkNotNullParameter(title, "title");
        ty0.c.b(u.k(this).b0(), title, getTitleView(), null, null, 12);
    }

    public final void setVideoVolumeMode(@NotNull oz0.d videoVolumeMode) {
        Intrinsics.checkNotNullParameter(videoVolumeMode, "videoVolumeMode");
        getBackgroundPlayerView().setVideoVolumeMode(videoVolumeMode);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public StoryPagesView(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StoryPagesView(@NotNull Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f57579b = v0.a.d("create(...)");
        f0 f0Var = f0.f322471a;
        this.f = f0Var;
        this.f57580g = new TextClause("", (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
        this.f57581h = -1;
        this.k = -1;
        this.f57583l = f0Var;
        c cVar = new c(0);
        this.f57584m = cVar;
        j jVar = new j(cVar, false, 14);
        this.f57585n = jVar;
        this.stepsProgressView = a.J(R$id.storiesHost_stepsProgressView, this);
        this.iconClose = a.J(R$id.iconClose, this);
        this.backgroundPlayerView = a.J(R$id.storiesHost_backgroundPlayerView, this);
        this.storyContentRecycler = a.J(R$id.storiesHost_storyContentRecycler, this);
        this.backgroundImage = a.J(R$id.storiesHost_backgroundImage, this);
        this.titleView = a.J(R$id.storiesHost_titleView, this);
        this.customIconStart = a.J(R$id.storiesHost_customIconStart, this);
        this.iconStart = a.J(R$id.storiesHost_iconStart, this);
        this.titleShimmer = a.J(R$id.storiesHost_titleShimmer, this);
        this.f57592x = yhm.j.c(yhm.k.NONE, new ru0.b(this, 1));
        this.f57593y = new LinkedHashMap();
        this.A = f.CONTENT;
        this.storyPos = -1;
        this.pageNavigationListener = new qza.q(5);
        this.closeClickListener = new ru0.d(0);
        this.pageShownListener = new qza.q(6);
        this.pageCompletedListener = new qza.q(7);
        this.buttonClickListener = new qza.q(8);
        this.secondaryButtonClickListener = new qza.q(2);
        this.linkClickListener = new qza.q(3);
        this.bottomSwipeListener = new qza.q(4);
        View.inflate(context, R$layout.internal_view_stories_host, this);
        getStepsProgressView().setPageChangeListener(new ru0.a(this, 0));
        getIconClose().setOnClickListener(new hqi.c(this, 2));
        getBackgroundPlayerView().setScaleType(oz0.b.CENTER_CROP);
        getBackgroundPlayerView().setVideoVolumeMode(oz0.d.AUTO);
        RecyclerView storyContentRecycler = getStoryContentRecycler();
        StoryPagesView$3$1 storyPagesView$3$1 = new StoryPagesView$3$1(context);
        storyPagesView$3$1.setRecycleChildrenOnDetach(false);
        storyContentRecycler.setLayoutManager(storyPagesView$3$1);
        storyContentRecycler.setAdapter(jVar);
        storyContentRecycler.setItemAnimator(new DefaultItemAnimator());
        this.K = new b();
    }

    public /* synthetic */ StoryPagesView(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i & 2) != 0 ? null : attributeSet, 0);
    }
}
