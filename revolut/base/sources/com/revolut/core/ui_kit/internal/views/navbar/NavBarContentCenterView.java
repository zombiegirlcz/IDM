package com.revolut.core.ui_kit.internal.views.navbar;

import android.content.Context;
import android.content.res.ColorStateList;
import android.os.Parcelable;
import android.text.Layout;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.view.animation.AlphaAnimation;
import android.widget.TextView;
import android.widget.ViewSwitcher;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.ConstraintSet;
import au0.j;
import au0.k2;
import au0.n2;
import au0.o2;
import au0.p2;
import aw0.t1;
import aw0.u1;
import aw0.v1;
import com.facebook.shimmer.ShimmerFrameLayout;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.core.ui_kit.R$id;
import com.revolut.core.ui_kit.R$layout;
import com.revolut.core.ui_kit.internal.drawables.RoundedBackgroundDrawable;
import com.revolut.core.ui_kit.internal.views.LabelView;
import com.revolut.core.ui_kit.internal.views.SmallActionButton;
import com.revolut.core.ui_kit.internal.views.animated_numbers.AnimatedNumbersView;
import com.revolut.core.ui_kit.internal.views.tag.TagView;
import com.revolut.core.ui_kit.internal.views.tag.TagViewData;
import com.revolut.core.ui_kit.internal.views.timer.CountDownTimerView;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.NavBarCenterViewModel;
import com.revolut.core.ui_kit.models.NumberClause;
import com.revolut.core.ui_kit_core.actionshandler.TrackableItem;
import com.revolut.core.ui_kit_resources.R$attr;
import fp0.m;
import fp0.p;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import jb3.l;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import or0.u;
import org.jetbrains.annotations.NotNull;
import tx0.v2;
import zhm.d0;
import zhm.h0;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u0088\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0006\b\u0000\u0018\u0000 J2\u00020\u00012\u00020\u0002:\u0001KB\u001d\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000e\u0010\rJ\u0015\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\t¢\u0006\u0004\b\u0010\u0010\rJ\u001f\u0010\u0014\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\u00112\b\b\u0002\u0010\u0013\u001a\u00020\t¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0017\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0000¢\u0006\u0004\b\u0016\u0010\rJ\u0017\u0010\u001a\u001a\u00020\u000b2\u0006\u0010\u0019\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001c\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010 \u001a\u00020\u000b2\u0006\u0010\u001f\u001a\u00020\u001eH\u0002¢\u0006\u0004\b \u0010!J\u0017\u0010\"\u001a\u00020\u000b2\u0006\u0010\u001f\u001a\u00020\u001eH\u0002¢\u0006\u0004\b\"\u0010!J\u0019\u0010%\u001a\u00020\u000b2\b\u0010$\u001a\u0004\u0018\u00010#H\u0002¢\u0006\u0004\b%\u0010&J\u0017\u0010(\u001a\u00020\u000b2\u0006\u0010$\u001a\u00020'H\u0002¢\u0006\u0004\b(\u0010)J\u000f\u0010+\u001a\u00020*H\u0002¢\u0006\u0004\b+\u0010,J\u0019\u0010.\u001a\u00020\u000b2\b\u0010\u0012\u001a\u0004\u0018\u00010-H\u0002¢\u0006\u0004\b.\u0010/J\u0019\u00102\u001a\u00020\u000b2\b\u00101\u001a\u0004\u0018\u000100H\u0002¢\u0006\u0004\b2\u00103J\u0017\u00106\u001a\u00020\u000b2\u0006\u00105\u001a\u000204H\u0002¢\u0006\u0004\b6\u00107J\u0017\u00109\u001a\u00020\u000b2\u0006\u00108\u001a\u00020\tH\u0002¢\u0006\u0004\b9\u0010\rR\u001a\u0010?\u001a\u00020:8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b;\u0010<\u001a\u0004\b=\u0010>R\u0014\u0010C\u001a\u00020@8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bA\u0010BR\u0014\u0010E\u001a\u00020@8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bD\u0010BR\u0014\u0010I\u001a\u00020F8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bG\u0010H¨\u0006L"}, d2 = {"Lcom/revolut/core/ui_kit/internal/views/navbar/NavBarContentCenterView;", "Landroid/widget/ViewSwitcher;", "Lur0/a;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "visible", "", "setShimmerTextsVisible", "(Z)V", "setShimmerButtonVisible", "loading", "setLoading", "Lcom/revolut/core/ui_kit/models/NavBarCenterViewModel;", "model", "animate", "setContent", "(Lcom/revolut/core/ui_kit/models/NavBarCenterViewModel;Z)V", "setSensitiveBalanceVisible$ui_kit_components_release", "setSensitiveBalanceVisible", "Lcom/revolut/core/ui_kit/models/NavBarCenterViewModel$MainTextStyle;", "titleStyle", "setMainTextStyle", "(Lcom/revolut/core/ui_kit/models/NavBarCenterViewModel$MainTextStyle;)V", "setSmallActionButtonTag", "(Lcom/revolut/core/ui_kit/models/NavBarCenterViewModel;)V", "Lcom/revolut/core/ui_kit/models/NavBarCenterViewModel$MainText;", "mainText", "setMainText", "(Lcom/revolut/core/ui_kit/models/NavBarCenterViewModel$MainText;)V", "setMainTextConstraints", "Lcom/revolut/core/ui_kit/models/NavBarCenterViewModel$Subtitle;", "subtitle", "setSubtitle", "(Lcom/revolut/core/ui_kit/models/NavBarCenterViewModel$Subtitle;)V", "Lcom/revolut/core/ui_kit/models/NavBarCenterViewModel$Subtitle$CaptionComplex;", "setSubtitleParts", "(Lcom/revolut/core/ui_kit/models/NavBarCenterViewModel$Subtitle$CaptionComplex;)V", "Lau0/e;", "getOrCreateSubtitlePartsView", "()Lau0/e;", "Lcom/revolut/core/ui_kit/models/NavBarCenterViewModel$CountDown;", "setCountDown", "(Lcom/revolut/core/ui_kit/models/NavBarCenterViewModel$CountDown;)V", "Lcom/revolut/core/ui_kit/models/NavBarCenterViewModel$Subtitle$CaptionComplex$SubtitlePart;", "part", "setSubtitleLongClickListener", "(Lcom/revolut/core/ui_kit/models/NavBarCenterViewModel$Subtitle$CaptionComplex$SubtitlePart;)V", "Law0/v1;", "colorScheme", "setCountDownTimerTheme", "(Law0/v1;)V", "titleClickable", "setTitleClickListener", "Lcom/revolut/core/ui_kit/internal/views/animated_numbers/AnimatedNumbersView;", "f", "Lcom/revolut/core/ui_kit/internal/views/animated_numbers/AnimatedNumbersView;", "getMainTextView$ui_kit_components_release", "()Lcom/revolut/core/ui_kit/internal/views/animated_numbers/AnimatedNumbersView;", "mainTextView", "Landroid/view/View;", "getContentBoundsView$ui_kit_components_release", "()Landroid/view/View;", "contentBoundsView", "getMainTextBoundsView$ui_kit_components_release", "mainTextBoundsView", "", "getSubtitleAnchorId", "()I", "subtitleAnchorId", "Companion", "a", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class NavBarContentCenterView extends ViewSwitcher implements ur0.a {
    public Integer A;
    public au0.e B;
    public boolean C;
    public String D;
    public boolean E;
    public boolean F;
    public int G;
    public int H;
    public int I;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConstraintLayout f57296a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TagView f57297b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final SmallActionButton f57298c;
    public final LabelView d;
    public final TextView e;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public final AnimatedNumbersView mainTextView;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final TextView f57299g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final AppCompatImageView f57300h;
    public CountDownTimerView i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final ViewStub f57301j;
    public final p k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final p f57302l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final p f57303m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final p f57304n;
    public final ShimmerFrameLayout o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final AnimatedNumbersView f57305p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final TextView f57306q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final TextView f57307r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final View f57308s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public NavBarCenterViewModel f57309t;
    public final ihm.f u;
    public final ihm.f v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final ihm.f f57310w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final ihm.f f57311x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final ihm.f f57312y;
    public final ihm.f z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NavBarContentCenterView(@NotNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        this.u = v0.a.d("create(...)");
        this.v = v0.a.d("create(...)");
        this.f57310w = v0.a.d("create(...)");
        this.f57311x = v0.a.d("create(...)");
        this.f57312y = v0.a.d("create(...)");
        this.z = v0.a.d("create(...)");
        this.F = true;
        this.G = kli.a.s(R$attr.uikit_colorForeground, context);
        this.H = R$attr.uikit_colorForeground;
        this.I = R$attr.uikit_colorBackground;
        View.inflate(context, R$layout.internal_view_navbar_content_center, this);
        AlphaAnimation alphaAnimation = new AlphaAnimation(BitmapDescriptorFactory.HUE_RED, 1.0f);
        alphaAnimation.setDuration(300L);
        setInAnimation(alphaAnimation);
        AlphaAnimation alphaAnimation2 = new AlphaAnimation(1.0f, BitmapDescriptorFactory.HUE_RED);
        alphaAnimation2.setDuration(300L);
        setOutAnimation(alphaAnimation2);
        setAnimateFirstView(false);
        View viewFindViewById = findViewById(R$id.navbarContentCenter_contentLayout);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        ConstraintLayout constraintLayout = (ConstraintLayout) viewFindViewById;
        this.f57296a = constraintLayout;
        View viewFindViewById2 = findViewById(R$id.navbarContentCenter_smallActionButton);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        this.f57298c = (SmallActionButton) viewFindViewById2;
        View viewFindViewById3 = findViewById(R$id.navbarContentCenter_smallActionButtonTag);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
        this.f57297b = (TagView) viewFindViewById3;
        View viewFindViewById4 = findViewById(R$id.navbarContentCenter_title);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById4, "findViewById(...)");
        this.d = (LabelView) viewFindViewById4;
        View viewFindViewById5 = findViewById(R$id.navbarContentCenter_subtitle);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById5, "findViewById(...)");
        TextView textView = (TextView) viewFindViewById5;
        this.e = textView;
        View viewFindViewById6 = findViewById(R$id.navbarContentCenter_mainText);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById6, "findViewById(...)");
        AnimatedNumbersView animatedNumbersView = (AnimatedNumbersView) viewFindViewById6;
        this.mainTextView = animatedNumbersView;
        View viewFindViewById7 = findViewById(R$id.navbarContentCenter_mainText_static);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById7, "findViewById(...)");
        TextView textView2 = (TextView) viewFindViewById7;
        this.f57299g = textView2;
        View viewFindViewById8 = findViewById(R$id.navbarContentCenter_mainTextIcon);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById8, "findViewById(...)");
        AppCompatImageView appCompatImageView = (AppCompatImageView) viewFindViewById8;
        this.f57300h = appCompatImageView;
        View viewFindViewById9 = findViewById(R$id.navbarContentCenter_countDownTimerStub);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById9, "findViewById(...)");
        this.f57301j = (ViewStub) viewFindViewById9;
        View viewFindViewById10 = findViewById(R$id.navbarContentCenter_shimmerLayout);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById10, "findViewById(...)");
        ShimmerFrameLayout shimmerFrameLayout = (ShimmerFrameLayout) viewFindViewById10;
        this.o = shimmerFrameLayout;
        View viewFindViewById11 = findViewById(R$id.navbarContentCenter_shimmerMainText);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById11, "findViewById(...)");
        this.f57305p = (AnimatedNumbersView) viewFindViewById11;
        View viewFindViewById12 = findViewById(R$id.navbarContentCenter_shimmerTitle);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById12, "findViewById(...)");
        this.f57306q = (TextView) viewFindViewById12;
        View viewFindViewById13 = findViewById(R$id.navbarContentCenter_shimmerSubtitle);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById13, "findViewById(...)");
        this.f57307r = (TextView) viewFindViewById13;
        View viewFindViewById14 = findViewById(R$id.navbarContentCenter_shimmerSmallActionButton);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById14, "findViewById(...)");
        this.f57308s = viewFindViewById14;
        p.Companion.getClass();
        gp0.b bVar = gp0.b.f145198a;
        this.k = m.a(textView, bVar);
        this.f57302l = m.a(animatedNumbersView, bVar);
        this.f57303m = m.a(textView2, bVar);
        this.f57304n = m.a(appCompatImageView, bVar);
        int iS = kli.a.s(R$attr.uikit_colorGreyTone8, context);
        RoundedBackgroundDrawable.INSTANCE.getClass();
        viewFindViewById14.setBackground(RoundedBackgroundDrawable.Companion.c(iS, context));
        ifk.b.q(shimmerFrameLayout, null, 3);
        if (!jo0.m.f176851h) {
            shimmerFrameLayout.a();
        }
        setClipChildren(false);
        setClipToPadding(false);
        constraintLayout.setClipChildren(false);
        constraintLayout.setClipToPadding(false);
        int childCount = constraintLayout.getChildCount();
        for (int i = 0; i < childCount; i++) {
            constraintLayout.getChildAt(i).setLongClickable(true);
        }
        setMainTextStyle(NavBarCenterViewModel.MainTextStyle.Default.f57862a);
    }

    public static final void a(NavBarContentCenterView navBarContentCenterView, View view) {
        navBarContentCenterView.getClass();
        py0.f fVarN0 = u.k(navBarContentCenterView).n0();
        NavBarCenterViewModel navBarCenterViewModel = navBarContentCenterView.f57309t;
        Parcelable parcelable = navBarCenterViewModel != null ? navBarCenterViewModel.f57846l : null;
        TrackableItem.INSTANCE.getClass();
        fVarN0.a(view, TrackableItem.Companion.a(navBarContentCenterView, parcelable), null);
        navBarContentCenterView.f57310w.onNext(Unit.f186387a);
    }

    public static final void b(NavBarContentCenterView navBarContentCenterView, View view, NavBarCenterViewModel.Subtitle.CaptionComplex.SubtitlePart subtitlePart) {
        navBarContentCenterView.getClass();
        py0.f fVarN0 = u.k(navBarContentCenterView).n0();
        NavBarCenterViewModel navBarCenterViewModel = navBarContentCenterView.f57309t;
        Parcelable parcelable = navBarCenterViewModel != null ? navBarCenterViewModel.f57846l : null;
        TrackableItem.INSTANCE.getClass();
        fVarN0.a(view, TrackableItem.Companion.a(navBarContentCenterView, parcelable), new py0.c(subtitlePart.f57867a));
        ihm.f fVar = navBarContentCenterView.f57311x;
        Parcelable parcelable2 = subtitlePart.f57868b;
        if (parcelable2 == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        fVar.onNext(parcelable2);
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    private final au0.e getOrCreateSubtitlePartsView() {
        au0.e eVar = this.B;
        if (eVar != null) {
            return eVar;
        }
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        au0.e eVar2 = new au0.e(context, null);
        ConstraintLayout constraintLayout = this.f57296a;
        TextView textView = this.e;
        int iIndexOfChild = constraintLayout.indexOfChild(textView) + 1;
        ViewGroup.LayoutParams layoutParams = textView.getLayoutParams();
        Intrinsics.i(layoutParams, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        ConstraintLayout.LayoutParams layoutParams2 = new ConstraintLayout.LayoutParams((ConstraintLayout.LayoutParams) layoutParams);
        eVar2.setId(View.generateViewId());
        eVar2.setVisibility(8);
        ConstraintLayout.LayoutParams layoutParams3 = new ConstraintLayout.LayoutParams(layoutParams2);
        ((ViewGroup.MarginLayoutParams) layoutParams3).width = 0;
        Unit unit = Unit.f186387a;
        constraintLayout.addView(eVar2, iIndexOfChild, layoutParams3);
        this.B = eVar2;
        return eVar2;
    }

    private final int getSubtitleAnchorId() {
        au0.e eVar = this.B;
        if (eVar != null) {
            if (!this.C) {
                eVar = null;
            }
            if (eVar != null) {
                return eVar.getId();
            }
        }
        return this.e.getId();
    }

    public static /* synthetic */ void setContent$default(NavBarContentCenterView navBarContentCenterView, NavBarCenterViewModel navBarCenterViewModel, boolean z, int i, Object obj2) {
        if ((i & 2) != 0) {
            z = true;
        }
        navBarContentCenterView.setContent(navBarCenterViewModel, z);
    }

    private final void setCountDown(NavBarCenterViewModel.CountDown model) {
        View viewInflate;
        if (model == null) {
            CountDownTimerView countDownTimerView = this.i;
            if (countDownTimerView != null) {
                countDownTimerView.setVisibility(8);
            }
            CountDownTimerView countDownTimerView2 = this.i;
            if (countDownTimerView2 != null) {
                countDownTimerView2.setTimeExpiredListener(null);
            }
            CountDownTimerView countDownTimerView3 = this.i;
            if (countDownTimerView3 != null) {
                countDownTimerView3.setExpirationTime(null);
            }
            CountDownTimerView countDownTimerView4 = this.i;
            if (countDownTimerView4 != null) {
                countDownTimerView4.setTimeToShow(null);
                return;
            }
            return;
        }
        NavBarCenterViewModel.CountDown.TimerState timerState = model.f57850a;
        CountDownTimerView countDownTimerView5 = this.i;
        if (countDownTimerView5 == null) {
            try {
                viewInflate = this.f57301j.inflate();
            } catch (Exception e) {
                h0 h0Var = h0.f322473a;
                CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                rd0.d.a(rd0.c.ERROR, null, null, e, h0Var);
            }
            countDownTimerView5 = viewInflate instanceof CountDownTimerView ? (CountDownTimerView) viewInflate : null;
            if (countDownTimerView5 == null) {
                return;
            }
        }
        this.i = countDownTimerView5;
        countDownTimerView5.setVisibility(0);
        countDownTimerView5.setMode(model.f57852c);
        countDownTimerView5.setLabels(model.d);
        countDownTimerView5.setDividerLabel(model.f57851b);
        t1 t1Var = v1.Companion;
        Context context = countDownTimerView5.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        t1Var.getClass();
        setCountDownTimerTheme(t1.a(context));
        if (timerState instanceof NavBarCenterViewModel.CountDown.TimerState.ExpirationTime) {
            countDownTimerView5.setTimeExpiredListener(new aqe.a(this, 11));
            countDownTimerView5.setExpirationTime(Long.valueOf(((NavBarCenterViewModel.CountDown.TimerState.ExpirationTime) timerState).f57853a));
            countDownTimerView5.setTimeToShow(null);
        } else {
            if (!(timerState instanceof NavBarCenterViewModel.CountDown.TimerState.StaticTime)) {
                throw new NoWhenBranchMatchedException();
            }
            countDownTimerView5.setTimeExpiredListener(null);
            countDownTimerView5.setExpirationTime(null);
            countDownTimerView5.setTimeToShow(Long.valueOf(((NavBarCenterViewModel.CountDown.TimerState.StaticTime) timerState).f57854a));
        }
    }

    private final void setCountDownTimerTheme(v1 colorScheme) {
        ev0.d dVar;
        CountDownTimerView countDownTimerView = this.i;
        if (countDownTimerView != null) {
            int i = k2.f9247b[colorScheme.ordinal()];
            if (i == 1) {
                dVar = ev0.d.LIGHT;
            } else {
                if (i != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                dVar = ev0.d.DARK;
            }
            countDownTimerView.setTheme(dVar);
        }
    }

    private final void setMainText(NavBarCenterViewModel.MainText mainText) {
        boolean z = mainText instanceof NavBarCenterViewModel.MainText.Animated;
        boolean z3 = false;
        int i = z ? 0 : 8;
        AnimatedNumbersView animatedNumbersView = this.mainTextView;
        animatedNumbersView.setVisibility(i);
        int i2 = z ? 8 : 0;
        TextView textView = this.f57299g;
        textView.setVisibility(i2);
        if (z) {
            animatedNumbersView.setAutoSize(true);
            NavBarCenterViewModel.MainText.Animated animated = (NavBarCenterViewModel.MainText.Animated) mainText;
            String str = animated.f57856b;
            animatedNumbersView.setCurrentClause(animated.f57855a);
            String str2 = this.D;
            if (str2 != null && str2.equals(str)) {
                z3 = true;
            }
            animatedNumbersView.setAnimateSpin(z3);
            this.D = str;
        } else {
            if (!(mainText instanceof NavBarCenterViewModel.MainText.Static)) {
                throw new NoWhenBranchMatchedException();
            }
            kli.a.b(textView, ((NavBarCenterViewModel.MainText.Static) mainText).f57858a, ty0.f.f275450a);
        }
        animatedNumbersView.setTextColor(this.G);
        textView.setTextColor(this.G);
        setMainTextStyle(mainText.getF57859b());
    }

    private final void setMainTextConstraints(NavBarCenterViewModel.MainText mainText) {
        int id10 = (mainText instanceof NavBarCenterViewModel.MainText.Animated ? this.mainTextView : this.f57299g).getId();
        ConstraintSet constraintSet = new ConstraintSet();
        ConstraintLayout constraintLayout = this.f57296a;
        constraintSet.clone(constraintLayout);
        LabelView labelView = this.d;
        constraintSet.connect(labelView.getId(), 4, id10, 3);
        constraintSet.connect(getSubtitleAnchorId(), 3, id10, 4);
        constraintSet.setVerticalChainStyle(labelView.getId(), 2);
        AppCompatImageView appCompatImageView = this.f57300h;
        constraintSet.connect(appCompatImageView.getId(), 5, id10, 5);
        constraintSet.connect(appCompatImageView.getId(), 6, id10, 7);
        constraintSet.setHorizontalChainStyle(id10, 2);
        constraintSet.applyTo(constraintLayout);
    }

    private final void setMainTextStyle(NavBarCenterViewModel.MainTextStyle titleStyle) {
        int i;
        if (Intrinsics.f(titleStyle, NavBarCenterViewModel.MainTextStyle.Default.f57862a)) {
            i = R$attr.internal_textAppearanceDisplay2;
        } else {
            if (!Intrinsics.f(titleStyle, NavBarCenterViewModel.MainTextStyle.Marketing.f57863a)) {
                throw new NoWhenBranchMatchedException();
            }
            i = R$attr.internal_textAppearanceMarketingDisplay2_noXmlUsage;
        }
        this.mainTextView.setTextAppearance(i);
        this.f57305p.setTextAppearance(i);
        l.e(this.f57299g, i);
    }

    private final void setSmallActionButtonTag(NavBarCenterViewModel model) {
        Integer num;
        NavBarCenterViewModel.Button button = model.d;
        if (button == null || (num = button.d) == null) {
            return;
        }
        NumberClause numberClause = new NumberClause(num.intValue(), (NumberClause.Format.Compact) null, new Custom(Integer.valueOf(this.I), false, null, false, null, 254), 2);
        int i = this.H;
        this.f57297b.setContent(new TagViewData(null, numberClause, i, null, i, null, 1000));
    }

    private final void setSubtitle(NavBarCenterViewModel.Subtitle subtitle) {
        int i;
        List list;
        boolean z = subtitle instanceof NavBarCenterViewModel.Subtitle.CaptionComplex;
        NavBarCenterViewModel.Subtitle.CaptionComplex.SubtitlePart subtitlePart = null;
        NavBarCenterViewModel.Subtitle.CaptionComplex captionComplex = z ? (NavBarCenterViewModel.Subtitle.CaptionComplex) subtitle : null;
        if (captionComplex != null && captionComplex.f57866b.size() > 1) {
            setSubtitleParts(captionComplex);
            return;
        }
        boolean z3 = this.C;
        TextView textView = this.e;
        if (z3) {
            this.C = false;
            au0.e eVar = this.B;
            if (eVar != null) {
                eVar.setVisibility(8);
            }
            textView.setVisibility(0);
            NavBarCenterViewModel navBarCenterViewModel = this.f57309t;
            if (navBarCenterViewModel == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            setMainTextConstraints(navBarCenterViewModel.f57840a);
        }
        kli.a.b(textView, subtitle != null ? subtitle.getF57869a() : null, ty0.f.f275450a);
        if (z) {
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            textView.setPadding(0, kli.a.k(context, 4.0f), 0, 0);
            i = R$attr.internal_textAppearanceBody2;
        } else if (subtitle instanceof NavBarCenterViewModel.Subtitle.Secondary) {
            Context context2 = getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
            textView.setPadding(0, 0, 0, kli.a.k(context2, 8.0f));
            i = R$attr.internal_textAppearanceBody1;
        } else if (!(subtitle instanceof NavBarCenterViewModel.Subtitle.Caption)) {
            if (subtitle != null) {
                throw new NoWhenBranchMatchedException();
            }
            return;
        } else {
            textView.setPadding(0, 0, 0, 0);
            i = R$attr.internal_textAppearanceBody2;
        }
        Integer num = this.A;
        if (num == null || i != num.intValue()) {
            this.A = Integer.valueOf(i);
            l.e(textView, i);
        }
        if (captionComplex != null && (list = captionComplex.f57866b) != null) {
            subtitlePart = (NavBarCenterViewModel.Subtitle.CaptionComplex.SubtitlePart) d0.M0(list);
        }
        setSubtitleLongClickListener(subtitlePart);
    }

    private final void setSubtitleLongClickListener(NavBarCenterViewModel.Subtitle.CaptionComplex.SubtitlePart part) {
        Parcelable parcelable = part != null ? part.f57868b : null;
        TextView textView = this.e;
        if (parcelable != null) {
            textView.setOnLongClickListener(new j(this, part, 1));
        } else {
            u.p(textView);
        }
    }

    private final void setSubtitleParts(NavBarCenterViewModel.Subtitle.CaptionComplex subtitle) {
        boolean z = this.C;
        TextView textView = this.e;
        if (!z) {
            this.C = true;
            textView.setVisibility(8);
            getOrCreateSubtitlePartsView().setVisibility(0);
            NavBarCenterViewModel navBarCenterViewModel = this.f57309t;
            if (navBarCenterViewModel == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            setMainTextConstraints(navBarCenterViewModel.f57840a);
        }
        au0.e orCreateSubtitlePartsView = getOrCreateSubtitlePartsView();
        List list = subtitle.f57866b;
        int i = R$attr.internal_textAppearanceBody2;
        int i2 = this.G;
        float alpha = textView.getAlpha();
        NavBarCenterViewModel navBarCenterViewModel2 = this.f57309t;
        if (navBarCenterViewModel2 == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        orCreateSubtitlePartsView.setModel(new au0.f(list, i, i2, alpha, navBarCenterViewModel2.f57844h, new n2(1, 0, NavBarContentCenterView.class, this, "handleSubtitleClick", "handleSubtitleClick(Landroid/view/View;)V"), new o2(2, 0, NavBarContentCenterView.class, this, "handleSubtitleLongPress", "handleSubtitleLongPress(Landroid/view/View;Lcom/revolut/core/ui_kit/models/NavBarCenterViewModel$Subtitle$CaptionComplex$SubtitlePart;)V")));
    }

    private final void setTitleClickListener(boolean titleClickable) {
        p clickHandler = this.d.getClickHandler();
        p.b(clickHandler, titleClickable);
        View view = clickHandler.f137029a;
        or0.m.a(view);
        if (titleClickable) {
            view.setOnClickListener(new p2(this, 0));
        } else {
            u.o(view);
        }
    }

    public final void c() {
        float f;
        if (this.F) {
            NavBarCenterViewModel navBarCenterViewModel = this.f57309t;
            f = (navBarCenterViewModel == null || navBarCenterViewModel.f) ? 1.0f : 0.4f;
        } else {
            f = BitmapDescriptorFactory.HUE_RED;
        }
        this.mainTextView.setAlpha(f);
        this.f57299g.setAlpha(f);
    }

    public final int d(v2 contentAlignment, int i, int i2, int i3) {
        float f;
        int measuredHeight;
        Layout layout;
        int measuredHeight2;
        float measuredHeight3;
        Intrinsics.checkNotNullParameter(contentAlignment, "contentAlignment");
        int i5 = i2 - i;
        int i6 = k2.f9248c[contentAlignment.ordinal()];
        if (i6 == 1) {
            f = 0.38265306f;
        } else {
            if (i6 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            f = 0.28747627f;
        }
        AnimatedNumbersView animatedNumbersView = this.mainTextView;
        if (animatedNumbersView.getVisibility() == 0) {
            measuredHeight = animatedNumbersView.getMeasuredHeight();
        } else {
            TextView textView = this.f57299g;
            measuredHeight = (textView.getLineCount() <= 1 || (layout = textView.getLayout()) == null) ? textView.getMeasuredHeight() : layout.getLineBottom(0) + textView.getTotalPaddingTop();
        }
        LabelView labelView = this.d;
        float measuredHeight4 = labelView.getMeasuredHeight() + measuredHeight;
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        int iC = rim.d.c((i5 * f) - (measuredHeight4 - kli.a.l(context, 2.0f)));
        ConstraintLayout constraintLayout = this.f57296a;
        if (constraintLayout.getVisibility() == 0) {
            measuredHeight2 = constraintLayout.getMeasuredHeight();
            measuredHeight3 = labelView.getVisibility() == 4 ? -labelView.getMeasuredHeight() : BitmapDescriptorFactory.HUE_RED;
        } else {
            measuredHeight2 = this.o.getMeasuredHeight();
            measuredHeight3 = this.f57308s.getMeasuredHeight() - measuredHeight2;
        }
        float f4 = iC;
        float f5 = i + f4 + measuredHeight2;
        float f6 = i3;
        if (f5 > f6) {
            float f32 = f4 - (f5 - f6);
            if (f32 >= measuredHeight3) {
                measuredHeight3 = f32;
            }
            iC = rim.d.c(measuredHeight3);
        }
        return (i + iC) - getTop();
    }

    @NotNull
    public final View getContentBoundsView$ui_kit_components_release() {
        return this.f57296a;
    }

    @NotNull
    public final View getMainTextBoundsView$ui_kit_components_release() {
        AnimatedNumbersView animatedNumbersView = this.mainTextView;
        return animatedNumbersView.getVisibility() == 0 ? animatedNumbersView : this.f57299g;
    }

    @NotNull
    /* JADX INFO: renamed from: getMainTextView$ui_kit_components_release, reason: from getter */
    public final AnimatedNumbersView getMainTextView() {
        return this.mainTextView;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.E) {
            requestLayout();
        }
        this.E = true;
    }

    @Override // ur0.a
    public final void r(v1 colorScheme, int i, int i2, int i3) {
        int i5;
        Intrinsics.checkNotNullParameter(colorScheme, "colorScheme");
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        int iS = kli.a.s(colorScheme.a(), context);
        this.G = iS;
        ColorStateList colorStateListValueOf = ColorStateList.valueOf(iS);
        Intrinsics.checkNotNullExpressionValue(colorStateListValueOf, "valueOf(...)");
        this.d.setTextColor(colorStateListValueOf);
        this.e.setTextColor(iS);
        NavBarCenterViewModel navBarCenterViewModel = this.f57309t;
        NavBarCenterViewModel.Subtitle subtitle = navBarCenterViewModel != null ? navBarCenterViewModel.f57842c : null;
        NavBarCenterViewModel.Subtitle.CaptionComplex captionComplex = subtitle instanceof NavBarCenterViewModel.Subtitle.CaptionComplex ? (NavBarCenterViewModel.Subtitle.CaptionComplex) subtitle : null;
        if (captionComplex != null) {
            NavBarCenterViewModel.Subtitle.CaptionComplex captionComplex2 = captionComplex.f57866b.size() > 1 ? captionComplex : null;
            if (captionComplex2 != null) {
                setSubtitleParts(captionComplex2);
            }
        }
        AnimatedNumbersView animatedNumbersView = this.mainTextView;
        animatedNumbersView.setTextColor(iS);
        this.f57299g.setTextColor(iS);
        animatedNumbersView.setHigherColour(iS);
        animatedNumbersView.setLowerColour(iS);
        rd0.e.q(this.f57300h, Integer.valueOf(iS));
        ifk.b.q(this.o, colorScheme, 1);
        int iA = colorScheme.a();
        int i6 = u1.f10553a[colorScheme.ordinal()];
        if (i6 == 1) {
            i5 = com.revolut.core.ui_kit.R$attr.internal_colorForegroundTintOnLightBackground;
        } else {
            if (i6 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            i5 = com.revolut.core.ui_kit.R$attr.internal_colorForegroundTintOnDarkBackground;
        }
        if (this.H != iA || this.I != i5) {
            this.H = iA;
            this.I = i5;
            NavBarCenterViewModel navBarCenterViewModel2 = this.f57309t;
            if (navBarCenterViewModel2 != null) {
                setSmallActionButtonTag(navBarCenterViewModel2);
            }
        }
        setCountDownTimerTheme(colorScheme);
    }

    /* JADX WARN: Removed duplicated region for block: B:128:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x01c0 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:141:0x01c2  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x01cc  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x01d2  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x01f0  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x01f7  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x01fe A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0202  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x0208  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x022b  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x0274 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:209:0x0276  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x028f  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x0299  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x02ac  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x02b6  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x02cd  */
    /* JADX WARN: Removed duplicated region for block: B:311:0x03b6  */
    /* JADX WARN: Removed duplicated region for block: B:313:0x03bb  */
    /* JADX WARN: Removed duplicated region for block: B:315:0x03c0 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:318:0x03c5  */
    /* JADX WARN: Removed duplicated region for block: B:319:0x03c7  */
    /* JADX WARN: Removed duplicated region for block: B:323:0x03d0  */
    /* JADX WARN: Removed duplicated region for block: B:326:0x03e9  */
    /* JADX WARN: Removed duplicated region for block: B:327:0x03f3  */
    /* JADX WARN: Removed duplicated region for block: B:329:0x03f8  */
    /* JADX WARN: Removed duplicated region for block: B:336:0x0424  */
    /* JADX WARN: Removed duplicated region for block: B:338:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0071  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void setContent(@org.jetbrains.annotations.NotNull com.revolut.core.ui_kit.models.NavBarCenterViewModel r29, boolean r30) {
        /*
            Method dump skipped, instruction units count: 1066
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.core.ui_kit.internal.views.navbar.NavBarContentCenterView.setContent(com.revolut.core.ui_kit.models.NavBarCenterViewModel, boolean):void");
    }

    public final void setLoading(boolean loading) {
        int i = !loading ? 1 : 0;
        if (i == getDisplayedChild()) {
            return;
        }
        setDisplayedChild(i);
        ShimmerFrameLayout shimmerFrameLayout = this.o;
        if (loading) {
            shimmerFrameLayout.e();
        } else {
            shimmerFrameLayout.f();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void setSensitiveBalanceVisible$ui_kit_components_release(boolean r3) {
        /*
            r2 = this;
            if (r3 != 0) goto L21
            com.revolut.core.ui_kit.models.NavBarCenterViewModel r3 = r2.f57309t
            if (r3 == 0) goto L21
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            com.revolut.core.ui_kit.models.NavBarCenterViewModel$MainText r0 = r3.f57840a
            com.revolut.core.ui_kit.models.NavBarCenterViewModel$MainTextStyle r0 = r0.getF57859b()
            com.revolut.core.ui_kit.models.NavBarCenterViewModel$MainTextStyle$Marketing r1 = com.revolut.core.ui_kit.models.NavBarCenterViewModel.MainTextStyle.Marketing.f57863a
            boolean r0 = kotlin.jvm.internal.Intrinsics.f(r0, r1)
            if (r0 != 0) goto L21
            aw0.t8 r3 = com.revolut.core.ui_kit.models.a.a(r3)
            if (r3 == 0) goto L21
            r3 = 0
            goto L22
        L21:
            r3 = 1
        L22:
            boolean r0 = r2.F
            if (r0 != r3) goto L27
            return
        L27:
            r2.F = r3
            r2.c()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.core.ui_kit.internal.views.navbar.NavBarContentCenterView.setSensitiveBalanceVisible$ui_kit_components_release(boolean):void");
    }

    public final void setShimmerButtonVisible(boolean visible) {
        this.f57308s.setVisibility(visible ? 0 : 8);
    }

    public final void setShimmerTextsVisible(boolean visible) {
        this.f57305p.setVisibility(visible ? 0 : 8);
        this.f57306q.setVisibility(visible ? 0 : 8);
        this.f57307r.setVisibility(visible ? 0 : 8);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public NavBarContentCenterView(@NotNull Context context) {
        this(context, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }
}
