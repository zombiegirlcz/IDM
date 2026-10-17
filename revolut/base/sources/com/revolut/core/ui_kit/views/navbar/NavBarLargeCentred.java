package com.revolut.core.ui_kit.views.navbar;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.graphics.LinearGradient;
import android.graphics.Shader;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Property;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.Interpolator;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.graphics.ColorUtils;
import androidx.core.graphics.Insets;
import androidx.core.view.OneShotPreDrawListener;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.RecyclerView;
import androidx.transition.ChangeBounds;
import androidx.transition.Fade;
import androidx.transition.TransitionManager;
import androidx.transition.TransitionSet;
import androidx.transition.revolut.RevGhostViewFacade;
import au0.g2;
import au0.r2;
import au0.z4;
import aw0.db;
import aw0.fa;
import com.facebook.shimmer.ShimmerFrameLayout;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.material.appbar.AppBarLayout;
import com.revolut.core.ui_kit.R$id;
import com.revolut.core.ui_kit.R$layout;
import com.revolut.core.ui_kit.R$string;
import com.revolut.core.ui_kit.internal.views.LabelView;
import com.revolut.core.ui_kit.internal.views.switcher_button.SwitcherButtonView;
import com.revolut.core.ui_kit.internal.views.tag.TagView;
import com.revolut.core.ui_kit.internal.views.tag.TagViewData;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.avatar.AvatarModel;
import com.revolut.core.ui_kit.views.ActionsView;
import com.revolut.core.ui_kit.views.AvatarView;
import com.revolut.core.ui_kit.views.ImageWithAnimatedBackgroundView;
import com.revolut.core.ui_kit_core.actionshandler.TrackableItem;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.rxdiffadapter.AsyncDiffRecyclerView;
import com.youTransactor.uCube.rpc.Constants;
import ix0.c0;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.o0;
import mx0.c9;
import mx0.i1;
import org.jetbrains.annotations.NotNull;
import tx0.a2;
import tx0.b2;
import tx0.c2;
import tx0.d2;
import tx0.n1;
import tx0.o1;
import tx0.p1;
import tx0.q1;
import tx0.s1;
import tx0.t1;
import tx0.u1;
import tx0.w1;
import tx0.x1;
import tx0.y1;
import tx0.z1;
import zhm.f0;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000È\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0007\u0018\u0000 }2\u00020\u00012\u00020\u00022\u00020\u0003:\f~\u007f1C\u0080\u0001\u0081\u0001\u0082\u0001\u0015mB\u001d\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ%\u0010\u0010\u001a\u00020\u000f2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u001d\u0010\u0010\u001a\u00020\u000f2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0016¢\u0006\u0004\b\u0010\u0010\u0012J#\u0010\u0017\u001a\u00020\u000f2\b\u0010\u0014\u001a\u0004\u0018\u00010\u00132\b\b\u0002\u0010\u0016\u001a\u00020\u0015H\u0007¢\u0006\u0004\b\u0017\u0010\u0018J#\u0010\u0017\u001a\u00020\u000f2\b\u0010\u001a\u001a\u0004\u0018\u00010\u00192\b\b\u0002\u0010\u0016\u001a\u00020\u0015H\u0007¢\u0006\u0004\b\u0017\u0010\u001bJ1\u0010\u0017\u001a\u00020\u000f\"\f\b\u0000\u0010\u001e*\u00020\u001c*\u00020\u001d2\b\u0010\u001a\u001a\u0004\u0018\u00018\u00002\b\b\u0002\u0010\u0016\u001a\u00020\u0015H\u0007¢\u0006\u0004\b\u0017\u0010\u001fJ\u0015\u0010!\u001a\u00020\u000f2\u0006\u0010\u001a\u001a\u00020 ¢\u0006\u0004\b!\u0010\"J\u0015\u0010%\u001a\u00020\u000f2\u0006\u0010$\u001a\u00020#¢\u0006\u0004\b%\u0010&J\u0019\u0010)\u001a\u00020\u000f2\b\u0010(\u001a\u0004\u0018\u00010'H\u0007¢\u0006\u0004\b)\u0010*J\u0017\u0010,\u001a\u00020\u000f2\u0006\u0010+\u001a\u00020#H\u0007¢\u0006\u0004\b,\u0010&J\u0019\u0010-\u001a\u00020\u000f2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0007¢\u0006\u0004\b-\u0010.J\u0019\u00100\u001a\u00020\u000f2\b\u0010/\u001a\u0004\u0018\u00010'H\u0007¢\u0006\u0004\b0\u0010*J\u0017\u00103\u001a\u00020\u000f2\u0006\u00102\u001a\u000201H\u0007¢\u0006\u0004\b3\u00104J!\u00108\u001a\u00020\u000f2\b\b\u0001\u00106\u001a\u0002052\b\b\u0001\u00107\u001a\u000205¢\u0006\u0004\b8\u00109J\u0019\u0010:\u001a\u00020\u000f2\b\u0010/\u001a\u0004\u0018\u00010'H\u0007¢\u0006\u0004\b:\u0010*J\u0019\u0010;\u001a\u00020\u000f2\b\u0010/\u001a\u0004\u0018\u00010'H\u0007¢\u0006\u0004\b;\u0010*J\u0017\u0010=\u001a\u00020\u000f2\u0006\u0010<\u001a\u00020'H\u0007¢\u0006\u0004\b=\u0010*J\u0017\u0010>\u001a\u00020\u000f2\b\u0010<\u001a\u0004\u0018\u00010'¢\u0006\u0004\b>\u0010*J\u001b\u0010@\u001a\u00020\u000f2\n\b\u0001\u0010?\u001a\u0004\u0018\u000105H\u0007¢\u0006\u0004\b@\u0010AJ\u0019\u0010B\u001a\u00020\u000f2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0007¢\u0006\u0004\bB\u0010.J\u0017\u0010D\u001a\u00020\u000f2\b\u0010\u001a\u001a\u0004\u0018\u00010C¢\u0006\u0004\bD\u0010EJ\u0017\u0010G\u001a\u00020\u000f2\u0006\u0010F\u001a\u000205H\u0016¢\u0006\u0004\bG\u0010HJ\u0015\u0010J\u001a\u00020\u000f2\u0006\u0010I\u001a\u00020#¢\u0006\u0004\bJ\u0010&J\u0015\u0010K\u001a\u00020\u000f2\u0006\u0010I\u001a\u00020#¢\u0006\u0004\bK\u0010&J\u0017\u0010P\u001a\u00020\u000f2\u0006\u0010M\u001a\u00020LH\u0000¢\u0006\u0004\bN\u0010OJ\u000f\u0010T\u001a\u00020QH\u0000¢\u0006\u0004\bR\u0010SJ\u0011\u0010V\u001a\u0004\u0018\u00010QH\u0000¢\u0006\u0004\bU\u0010SJ\u000f\u0010X\u001a\u00020QH\u0000¢\u0006\u0004\bW\u0010SJ\u0019\u0010Z\u001a\u00020\u000f2\b\u0010\u001a\u001a\u0004\u0018\u00010YH\u0002¢\u0006\u0004\bZ\u0010[J\u0019\u0010^\u001a\u00020\u000f2\b\u0010]\u001a\u0004\u0018\u00010\\H\u0002¢\u0006\u0004\b^\u0010_J\u0017\u0010`\u001a\u00020\u000f2\u0006\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b`\u0010aJ\u0017\u0010b\u001a\u00020\u000f2\u0006\u00102\u001a\u000201H\u0002¢\u0006\u0004\bb\u00104J\u0019\u0010c\u001a\u00020\u000f2\b\u0010/\u001a\u0004\u0018\u00010'H\u0002¢\u0006\u0004\bc\u0010*J\u0019\u0010d\u001a\u00020\u000f2\b\u0010/\u001a\u0004\u0018\u00010'H\u0002¢\u0006\u0004\bd\u0010*J\u001d\u0010g\u001a\u00020\u000f2\f\u0010f\u001a\b\u0012\u0004\u0012\u00020e0\nH\u0002¢\u0006\u0004\bg\u0010\u0012J\u000f\u0010i\u001a\u00020hH\u0002¢\u0006\u0004\bi\u0010jJ\u0019\u0010k\u001a\u00020\u000f2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0002¢\u0006\u0004\bk\u0010.J\u000f\u0010l\u001a\u00020QH\u0002¢\u0006\u0004\bl\u0010SR\"\u0010t\u001a\u00020m8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bn\u0010o\u001a\u0004\bp\u0010q\"\u0004\br\u0010sR$\u0010|\u001a\u0004\u0018\u00010u8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\bv\u0010w\u001a\u0004\bx\u0010y\"\u0004\bz\u0010{¨\u0006\u0083\u0001"}, d2 = {"Lcom/revolut/core/ui_kit/views/navbar/NavBarLargeCentred;", "Lau0/o;", "Lau0/g2;", "Lcom/revolut/core/ui_kit_core/actionshandler/TrackableItem;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "Lcom/revolut/core/ui_kit/views/navbar/NavBarMenuItem;", "menuItems", "Lyy0/f;", "imageDisplayer", "", "setMenuItems", "(Ljava/util/List;Lyy0/f;)V", "(Ljava/util/List;)V", "Lcom/revolut/core/ui_kit_core/displayers/image/Image;", "image", "Ltx0/q1;", "avatarVariant", "setLargeImage", "(Lcom/revolut/core/ui_kit_core/displayers/image/Image;Ltx0/q1;)V", "Lcom/revolut/core/ui_kit/views/ImageWithAnimatedBackgroundView$Model;", "model", "(Lcom/revolut/core/ui_kit/views/ImageWithAnimatedBackgroundView$Model;Ltx0/q1;)V", "Lcom/revolut/core/ui_kit/models/avatar/AvatarModel;", "", "T", "(Lcom/revolut/core/ui_kit/models/avatar/AvatarModel;Ltx0/q1;)V", "Lcom/revolut/core/ui_kit/views/navbar/NavBarLargeCentred$Model;", "setModel", "(Lcom/revolut/core/ui_kit/views/navbar/NavBarLargeCentred$Model;)V", "", "alwaysExpanded", "setAlwaysExpanded", "(Z)V", "Lcom/revolut/core/ui_kit/models/Clause;", "topLabel", "setTopLabel", "(Lcom/revolut/core/ui_kit/models/Clause;)V", "clickable", "setTopLabelClickable", "setTopLabelEndImage", "(Lcom/revolut/core/ui_kit_core/displayers/image/Image;)V", "text", "setTitle", "Ltx0/x1;", "style", "setTitleStyle", "(Ltx0/x1;)V", "", "color1", "color2", "setTitleGradient", "(II)V", "setSubtitleText", "setDescriptionText", "clause", "setToolbarTitle", "setToolbarTitleInternal", "iconRes", "setNavigationButtonIcon", "(Ljava/lang/Integer;)V", "setNavigationButtonImage", "Ltx0/w1;", "setSwitcherButton", "(Ltx0/w1;)V", "color", "setBackgroundColor", "(I)V", "visible", "setVisible", "setShadowVisible", "", "alpha", "setHeaderSubtitleAlpha$ui_kit_components_release", "(F)V", "setHeaderSubtitleAlpha", "Landroid/animation/Animator;", "getSubtitleAlphaAnimator$ui_kit_components_release", "()Landroid/animation/Animator;", "getSubtitleAlphaAnimator", "getTopLabelEndImageAlphaAnimator$ui_kit_components_release", "getTopLabelEndImageAlphaAnimator", "getContentRevealAnimator$ui_kit_components_release", "getContentRevealAnimator", "Lcom/revolut/core/ui_kit/internal/views/tag/TagViewData;", "setBadge", "(Lcom/revolut/core/ui_kit/internal/views/tag/TagViewData;)V", "Lcom/revolut/core/ui_kit/views/navbar/j;", "largeImage", "setLargeImageInternal", "(Lcom/revolut/core/ui_kit/views/navbar/j;)V", "setDefaultAvatarStyle", "(Ltx0/q1;)V", "setTitleStyleInternal", "setSubtitleInternal", "setDescriptionInternal", "Lcom/revolut/core/ui_kit/views/ActionsView$Item;", "actions", "setActions", "Lcom/revolut/core/ui_kit/views/ActionsView;", "getOrCreateHeaderActionsView", "()Lcom/revolut/core/ui_kit/views/ActionsView;", "setNavigationButtonImageInternal", "getContentSlideUpAnimator", "Ltx0/t1;", "w", "Ltx0/t1;", "getHeightMode", "()Ltx0/t1;", "setHeightMode", "(Ltx0/t1;)V", "heightMode", "Landroid/os/Parcelable;", "B", "Landroid/os/Parcelable;", "getAnalyticsContext", "()Landroid/os/Parcelable;", "setAnalyticsContext", "(Landroid/os/Parcelable;)V", "analyticsContext", "Companion", "Model", "tx0/u1", "a", "tx0/s1", "tx0/r1", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class NavBarLargeCentred extends au0.o implements g2, TrackableItem {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();
    public final s1 A;

    /* JADX INFO: renamed from: B, reason: from kotlin metadata */
    public Parcelable analyticsContext;
    public final b C;
    public final d2 D;
    public int E;
    public final ConstraintLayout F;
    public final TextView G;
    public final ConstraintLayout H;
    public final ConstraintLayout I;
    public final ShimmerFrameLayout J;
    public final View K;
    public final View L;
    public final AsyncDiffRecyclerView M;
    public final NavBarNavigationButtonView N;
    public final View O;
    public final LabelView P;
    public final TextView Q;
    public final TextView R;
    public final TextView S;
    public final View T;
    public final ViewStub U;
    public ActionsView V;
    public final AvatarView W;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public final TagView f59286a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public final SwitcherButtonView f59287b0;
    public final fp0.p c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public final fp0.p f59288d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public final fp0.p f59289e0;
    public boolean f0;
    public boolean g0;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public ifm.c f59290h0;
    public final vx0.e i0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final com.revolut.core.ui_kit.internal.views.navbar.d f59291l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final ihm.f f59292m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final ihm.f f59293n;
    public final ihm.f o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final ihm.f f59294p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final ihm.f f59295q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final ihm.f f59296r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final ihm.f f59297s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final ihm.f f59298t;
    public final ihm.f u;
    public final int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name and from kotlin metadata */
    public t1 heightMode;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final boolean f59300x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public u1 f59301y;
    public Model z;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001:\u0003\u0005\u0006\u0007J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\b"}, d2 = {"Lcom/revolut/core/ui_kit/views/navbar/NavBarLargeCentred$Model;", "Lcom/revolut/core/ui_kit_core/actionshandler/TrackableItem;", "", "toString", "()Ljava/lang/String;", "com/revolut/core/ui_kit/views/navbar/m", "com/revolut/core/ui_kit/views/navbar/n", "com/revolut/core/ui_kit/views/navbar/j", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Model implements TrackableItem {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final m f59302a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Clause f59303b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Clause f59304c;
        public final Clause d;
        public final n e;
        public final Image f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final TagViewData f59305g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final j f59306h;
        public Parcelable i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final List f59307j;

        public Model() {
            this(null, null, null, null, null, null, null, null, 1023);
        }

        public static Model a(Model model, m mVar, TextLocalisedClause textLocalisedClause, Clause clause, Clause clause2, n nVar, ResourceImage resourceImage, TagViewData tagViewData, int i) {
            if ((i & 1) != 0) {
                mVar = model.f59302a;
            }
            m mVar2 = mVar;
            Clause clause3 = textLocalisedClause;
            if ((i & 2) != 0) {
                clause3 = model.f59303b;
            }
            Clause clause4 = clause3;
            Clause clause5 = (i & 4) != 0 ? model.f59304c : clause;
            Clause clause6 = (i & 8) != 0 ? model.d : clause2;
            n nVar2 = (i & 16) != 0 ? model.e : nVar;
            Image image = (i & 32) != 0 ? model.f : resourceImage;
            TagViewData tagViewData2 = (i & 64) != 0 ? model.f59305g : tagViewData;
            j jVar = model.f59306h;
            Parcelable parcelable = model.i;
            List actions = model.f59307j;
            model.getClass();
            Intrinsics.checkNotNullParameter(actions, "actions");
            return new Model(mVar2, clause4, clause5, clause6, nVar2, image, tagViewData2, jVar, parcelable, actions);
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Model)) {
                return false;
            }
            Model model = (Model) obj2;
            return Intrinsics.f(this.f59302a, model.f59302a) && Intrinsics.f(this.f59303b, model.f59303b) && Intrinsics.f(this.f59304c, model.f59304c) && Intrinsics.f(this.d, model.d) && Intrinsics.f(this.e, model.e) && Intrinsics.f(this.f, model.f) && Intrinsics.f(this.f59305g, model.f59305g) && Intrinsics.f(this.f59306h, model.f59306h) && Intrinsics.f(this.i, model.i) && Intrinsics.f(this.f59307j, model.f59307j);
        }

        @Override // com.revolut.core.ui_kit_core.actionshandler.TrackableItem
        /* JADX INFO: renamed from: getAnalyticsContext, reason: from getter */
        public final Parcelable getF55075m() {
            return this.i;
        }

        public final int hashCode() {
            m mVar = this.f59302a;
            int iHashCode = (mVar == null ? 0 : mVar.hashCode()) * 31;
            Clause clause = this.f59303b;
            int iHashCode2 = (iHashCode + (clause == null ? 0 : clause.hashCode())) * 31;
            Clause clause2 = this.f59304c;
            int iHashCode3 = (iHashCode2 + (clause2 == null ? 0 : clause2.hashCode())) * 31;
            Clause clause3 = this.d;
            int iHashCode4 = (iHashCode3 + (clause3 == null ? 0 : clause3.hashCode())) * 31;
            n nVar = this.e;
            int iHashCode5 = (iHashCode4 + (nVar == null ? 0 : nVar.hashCode())) * 31;
            Image image = this.f;
            int iHashCode6 = (iHashCode5 + (image == null ? 0 : image.hashCode())) * 31;
            TagViewData tagViewData = this.f59305g;
            int iHashCode7 = (iHashCode6 + (tagViewData == null ? 0 : tagViewData.hashCode())) * 31;
            j jVar = this.f59306h;
            int iHashCode8 = (iHashCode7 + (jVar == null ? 0 : jVar.hashCode())) * 31;
            Parcelable parcelable = this.i;
            return this.f59307j.hashCode() + ((iHashCode8 + (parcelable != null ? parcelable.hashCode() : 0)) * 31);
        }

        @Override // com.revolut.core.ui_kit_core.actionshandler.TrackableItem
        public final void setAnalyticsContext(Parcelable parcelable) {
            this.i = parcelable;
        }

        public Model(l lVar, Clause clause, Clause clause2, Clause clause3, ResourceImage resourceImage, TagViewData tagViewData, j jVar, List list, int i) {
            this((i & 1) != 0 ? null : lVar, (i & 2) != 0 ? null : clause, (i & 4) != 0 ? null : clause2, (i & 8) != 0 ? null : clause3, null, (i & 32) != 0 ? null : resourceImage, (i & 64) != 0 ? null : tagViewData, (i & 128) != 0 ? null : jVar, null, (i & 512) != 0 ? f0.f322471a : list);
        }

        public Model(m mVar, Clause clause, Clause clause2, Clause clause3, n nVar, Image image, TagViewData tagViewData, j jVar, Parcelable parcelable, List actions) {
            Intrinsics.checkNotNullParameter(actions, "actions");
            this.f59302a = mVar;
            this.f59303b = clause;
            this.f59304c = clause2;
            this.d = clause3;
            this.e = nVar;
            this.f = image;
            this.f59305g = tagViewData;
            this.f59306h = jVar;
            this.i = parcelable;
            this.f59307j = actions;
        }
    }

    /* JADX INFO: renamed from: com.revolut.core.ui_kit.views.navbar.NavBarLargeCentred$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }
    }

    public static final class b implements RecyclerView.OnChildAttachStateChangeListener {
        @Override // androidx.recyclerview.widget.RecyclerView.OnChildAttachStateChangeListener
        public final void onChildViewAttachedToWindow(View view) {
            Intrinsics.checkNotNullParameter(view, "view");
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnChildAttachStateChangeListener
        public final void onChildViewDetachedFromWindow(View view) {
            Intrinsics.checkNotNullParameter(view, "view");
            view.setTranslationX(BitmapDescriptorFactory.HUE_RED);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NavBarLargeCentred(@NotNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f59292m = v0.a.d("create(...)");
        this.f59293n = v0.a.d("create(...)");
        this.o = v0.a.d("create(...)");
        this.f59294p = v0.a.d("create(...)");
        this.f59295q = v0.a.d("create(...)");
        this.f59296r = v0.a.d("create(...)");
        this.f59297s = v0.a.d("create(...)");
        this.f59298t = v0.a.d("create(...)");
        this.u = v0.a.d("create(...)");
        this.v = kli.a.k(context, 56.0f);
        this.heightMode = t1.DEFAULT;
        this.f59300x = true;
        this.A = new s1();
        this.C = new b();
        d2 d2Var = new d2(this, 0);
        this.D = d2Var;
        this.f0 = true;
        View.inflate(context, R$layout.internal_view_nav_bar_large_centred, this);
        View viewFindViewById = findViewById(R$id.navBarLargeCentred_menuLayout);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        ConstraintLayout constraintLayout = (ConstraintLayout) viewFindViewById;
        this.F = constraintLayout;
        View viewFindViewById2 = findViewById(R$id.navBarLargeCentred_toolbarTitle);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        TextView textView = (TextView) viewFindViewById2;
        this.G = textView;
        View viewFindViewById3 = findViewById(R$id.navBarLargeCentred_navBarLayout);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
        ConstraintLayout constraintLayout2 = (ConstraintLayout) viewFindViewById3;
        this.H = constraintLayout2;
        View viewFindViewById4 = findViewById(R$id.navBarLargeCentred_headerContainerLayout);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById4, "findViewById(...)");
        ConstraintLayout constraintLayout3 = (ConstraintLayout) viewFindViewById4;
        this.I = constraintLayout3;
        View viewFindViewById5 = findViewById(R$id.navBarLargeCentred_loadingShimmer);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById5, "findViewById(...)");
        this.J = (ShimmerFrameLayout) viewFindViewById5;
        View viewFindViewById6 = findViewById(R$id.navBarLargeCentred_subtitleLoading);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById6, "findViewById(...)");
        this.K = viewFindViewById6;
        View viewFindViewById7 = findViewById(R$id.navBarLargeCentred_descriptionLoading);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById7, "findViewById(...)");
        this.L = viewFindViewById7;
        View viewFindViewById8 = findViewById(R$id.navBarLargeCentred_menuRecyclerView);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById8, "findViewById(...)");
        AsyncDiffRecyclerView asyncDiffRecyclerView = (AsyncDiffRecyclerView) viewFindViewById8;
        this.M = asyncDiffRecyclerView;
        View viewFindViewById9 = findViewById(R$id.navBarLargeCentred_navigationButton);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById9, "findViewById(...)");
        NavBarNavigationButtonView navBarNavigationButtonView = (NavBarNavigationButtonView) viewFindViewById9;
        this.N = navBarNavigationButtonView;
        View viewFindViewById10 = findViewById(R$id.navBarLargeCentred_toolbarBackground);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById10, "findViewById(...)");
        this.O = viewFindViewById10;
        View viewFindViewById11 = findViewById(R$id.navBarLargeCentred_headerTopLabel);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById11, "findViewById(...)");
        this.P = (LabelView) viewFindViewById11;
        View viewFindViewById12 = findViewById(R$id.navBarLargeCentred_headerTitle);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById12, "findViewById(...)");
        TextView textView2 = (TextView) viewFindViewById12;
        this.Q = textView2;
        View viewFindViewById13 = findViewById(R$id.navBarLargeCentred_headerSubtitle);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById13, "findViewById(...)");
        TextView textView3 = (TextView) viewFindViewById13;
        this.R = textView3;
        View viewFindViewById14 = findViewById(R$id.navBarLargeCentred_headerDescription);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById14, "findViewById(...)");
        TextView textView4 = (TextView) viewFindViewById14;
        this.S = textView4;
        View viewFindViewById15 = findViewById(R$id.navBarLargeCentred_actionsContainer);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById15, "findViewById(...)");
        this.T = viewFindViewById15;
        View viewFindViewById16 = findViewById(R$id.navBarLargeCentred_actionsViewStub);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById16, "findViewById(...)");
        this.U = (ViewStub) viewFindViewById16;
        View viewFindViewById17 = findViewById(R$id.navBarLargeCentred_headerImageView);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById17, "findViewById(...)");
        AvatarView avatarView = (AvatarView) viewFindViewById17;
        this.W = avatarView;
        View viewFindViewById18 = findViewById(R$id.navBarLargeCentred_badge);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById18, "findViewById(...)");
        TagView tagView = (TagView) viewFindViewById18;
        this.f59286a0 = tagView;
        View viewFindViewById19 = findViewById(R$id.navBarLargeCentred_switcherButton);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById19, "findViewById(...)");
        this.f59287b0 = (SwitcherButtonView) viewFindViewById19;
        fp0.p.Companion.getClass();
        gp0.b bVar = gp0.b.f145198a;
        this.c0 = fp0.m.a(textView3, bVar);
        this.f59288d0 = fp0.m.a(textView2, bVar);
        this.f59289e0 = fp0.m.a(textView4, bVar);
        Intrinsics.checkNotNullParameter(this, "coordinatorChild");
        d2Var.d = new z4(this, R$id.internal_nav_bar_shadow);
        d2Var.e = new z4(this, R$id.internal_nav_bar_second_shadow);
        asyncDiffRecyclerView.setFocusableInTouchMode(false);
        fp0.p clickHandler = navBarNavigationButtonView.getClickHandler();
        fp0.p.b(clickHandler, true);
        View view = clickHandler.f137029a;
        or0.m.a(view);
        view.setOnClickListener(new b2(this, this, 2));
        or0.m.a(avatarView);
        avatarView.setOnClickListener(new b2(this, this, 0));
        or0.m.a(tagView);
        tagView.setOnClickListener(new b2(this, this, 1));
        this.f59291l = new com.revolut.core.ui_kit.internal.views.navbar.d(asyncDiffRecyclerView);
        setStateListAnimator(null);
        this.E = 0;
        viewFindViewById10.setOnClickListener(new lu0.j(1));
        viewFindViewById10.setHapticFeedbackEnabled(false);
        viewFindViewById10.setSoundEffectsEnabled(false);
        setBackground(null);
        ((bp0.y) or0.u.k(this).b0()).s(textView3, true);
        setDefaultAvatarStyle(q1.AVATAR_LARGE);
        A(getLastExpandRatio$ui_kit_components_release());
        this.i0 = new vx0.e(context, avatarView, constraintLayout3, constraintLayout2, constraintLayout, textView, new th9.t(this, 26));
    }

    public static void K(NavBarLargeCentred navBarLargeCentred, int i) {
        boolean zE = (i & 1) != 0 ? navBarLargeCentred.o.e() : true;
        boolean zE2 = (i & 2) != 0 ? navBarLargeCentred.f59296r.e() : true;
        fp0.p pVar = navBarLargeCentred.c0;
        c0 c0Var = c0.f169220a;
        if (!zE2) {
            c0Var = null;
        }
        View view = pVar.f137029a;
        if (!(view instanceof TextView)) {
            throw new IllegalArgumentException(j6.a.q("Cannot set movement method: view must be a TextView. Actual type: ", o0.f186429a.b(view.getClass()).m()).toString());
        }
        fp0.p.b(pVar, zE);
        or0.m.a(view);
        if (zE) {
            view.setOnClickListener(new r2(navBarLargeCentred, navBarLargeCentred, 25));
        } else {
            or0.u.o(view);
        }
        ((TextView) view).setMovementMethod(c0Var);
    }

    public static CompositeClause L(Clause clause, db dbVar) {
        fa faVar = clause instanceof fa ? (fa) clause : null;
        Style f57913b = faVar != null ? faVar.getF57837c() : null;
        Custom custom = f57913b instanceof Custom ? (Custom) f57913b : null;
        return new CompositeClause(zhm.u.c(clause), null, custom != null ? Custom.a(custom, null, dbVar, Constants.TAG_FB_CHARGING_STATUS) : new Custom(null, false, dbVar, false, null, Constants.TAG_FB_CHARGING_STATUS), null, 10);
    }

    private final Animator getContentSlideUpAnimator() {
        int[] iArr = new int[2];
        getRootView().getLocationOnScreen(iArr);
        float f = iArr[1];
        float height = getRootView().getHeight();
        ConstraintLayout constraintLayout = this.I;
        float height2 = constraintLayout.getHeight();
        constraintLayout.getLocationOnScreen(new int[2]);
        float f4 = (((height - height2) / 2.0f) + f) - r6[1];
        constraintLayout.setTranslationY(f4);
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(constraintLayout, (Property<ConstraintLayout, Float>) LinearLayout.TRANSLATION_Y, f4, BitmapDescriptorFactory.HUE_RED);
        Interpolator interpolator = jq0.r.f177392a;
        objectAnimatorOfFloat.setInterpolator(jq0.r.f177392a);
        objectAnimatorOfFloat.setDuration(500L);
        Intrinsics.checkNotNullExpressionValue(objectAnimatorOfFloat, "apply(...)");
        return objectAnimatorOfFloat;
    }

    private final ActionsView getOrCreateHeaderActionsView() {
        ActionsView actionsView = this.V;
        if (actionsView != null) {
            return actionsView;
        }
        View viewInflate = this.U.inflate();
        Intrinsics.i(viewInflate, "null cannot be cast to non-null type com.revolut.core.ui_kit.views.ActionsView");
        ActionsView actionsView2 = (ActionsView) viewInflate;
        this.V = actionsView2;
        I();
        return actionsView2;
    }

    private final void setActions(List<ActionsView.Item> actions) {
        if (actions.isEmpty()) {
            y(false);
            return;
        }
        ActionsView orCreateHeaderActionsView = getOrCreateHeaderActionsView();
        orCreateHeaderActionsView.setLayoutType(mx0.l.SCROLLABLE_CENTERED);
        orCreateHeaderActionsView.k(actions, mx0.t.f210002a);
        y(true);
    }

    private final void setBadge(TagViewData model) {
        int i = model != null ? 0 : 8;
        TagView tagView = this.f59286a0;
        tagView.setVisibility(i);
        if (model != null) {
            tagView.setContent(model);
        }
    }

    private final void setDefaultAvatarStyle(q1 avatarVariant) {
        i1 i1Var;
        int i = y1.f275276a[avatarVariant.ordinal()];
        if (i == 1) {
            i1Var = i1.SIZE_56_56;
        } else if (i == 2) {
            i1Var = i1.SIZE_80_80;
        } else {
            if (i != 3) {
                throw new NoWhenBranchMatchedException();
            }
            i1Var = i1.SIZE_100_100;
        }
        this.W.setDefaultAvatarStyle$ui_kit_components_release(i1Var);
    }

    private final void setDescriptionInternal(Clause text) {
        kli.a.d(this.S, text, this, null, 12);
    }

    public static /* synthetic */ void setLargeImage$default(NavBarLargeCentred navBarLargeCentred, Image image, q1 q1Var, int i, Object obj2) {
        if ((i & 2) != 0) {
            q1Var = q1.AVATAR_LARGE;
        }
        navBarLargeCentred.setLargeImage(image, q1Var);
    }

    private final void setLargeImageInternal(j largeImage) {
        AvatarView avatarView = this.W;
        vx0.e eVar = this.i0;
        if (largeImage == null) {
            eVar.b(false);
            avatarView.setVisibility(8);
            return;
        }
        avatarView.setVisibility(0);
        setDefaultAvatarStyle(largeImage.f59534b);
        avatarView.setModel(largeImage.f59533a);
        eVar.b(largeImage.f59535c);
        RevGhostViewFacade revGhostViewFacade = eVar.f292781h;
        if (revGhostViewFacade == null) {
            return;
        }
        if (revGhostViewFacade != null) {
            revGhostViewFacade.detach();
        }
        eVar.f292781h = null;
        if (eVar.f292784m) {
            return;
        }
        eVar.f292784m = true;
        AvatarView avatarView2 = eVar.f292778b;
        OneShotPreDrawListener.add(avatarView2, new r8.d(18, avatarView2, false, eVar));
    }

    private final void setNavigationButtonImageInternal(Image image) {
        int i = image == null ? 4 : 0;
        NavBarNavigationButtonView navBarNavigationButtonView = this.N;
        navBarNavigationButtonView.setVisibility(i);
        yy0.f.e(or0.u.k(this).Q(), image, this.N, null, null, 12);
        navBarNavigationButtonView.setContentDescription(navBarNavigationButtonView.getContext().getString(R$string.uikit_navigate_up_description));
    }

    private final void setSubtitleInternal(Clause text) {
        kli.a.d(this.R, text, this, new su0.c(1, this.f59296r, ihm.f.class, "onNext", "onNext(Ljava/lang/Object;)V", 0, 26), 8);
    }

    private final void setTitleStyleInternal(x1 style) {
        int i = y1.f275277b[style.ordinal()];
        TextView textView = this.Q;
        if (i == 1) {
            jb3.l.e(textView, R$attr.internal_textAppearanceHeading1);
        } else if (i == 2) {
            jb3.l.e(textView, R$attr.internal_textAppearanceDisplay2);
        } else {
            if (i != 3) {
                throw new NoWhenBranchMatchedException();
            }
            jb3.l.e(textView, R$attr.internal_textAppearanceHeading2);
        }
    }

    public final void A(float f) {
        int i = this.E;
        this.O.setBackgroundColor(ColorUtils.setAlphaComponent(i, (((i >> 24) & 255) * (f >= 1.0f ? 0 : f >= 0.8f ? 255 - rim.d.c(((f - 0.8f) * 5.0000005f) * 255) : 255)) / 255));
    }

    public final void B() {
        if (this.f59301y == null) {
            return;
        }
        this.f59301y = null;
        ShimmerFrameLayout shimmerFrameLayout = this.J;
        shimmerFrameLayout.f();
        AccelerateInterpolator accelerateInterpolator = ix0.u1.f169315a;
        ix0.u1.c(this.I, shimmerFrameLayout);
    }

    public final efm.r C() {
        int i = 0;
        efm.r rVarDoFinally = this.f59294p.doOnSubscribe(new o1(new n1(this, 0), i)).doFinally(new p1(this, i));
        Intrinsics.checkNotNullExpressionValue(rVarDoFinally, "doFinally(...)");
        return rVarDoFinally;
    }

    public final efm.r D() {
        int i = 2;
        efm.r rVarDoFinally = this.f59296r.doOnSubscribe(new o1(new n1(this, 2), i)).doFinally(new p1(this, i));
        Intrinsics.checkNotNullExpressionValue(rVarDoFinally, "doFinally(...)");
        return rVarDoFinally;
    }

    public final efm.r F() {
        efm.r rVarDoFinally = this.o.doOnSubscribe(new o1(new n1(this, 4), 4)).doFinally(new p1(this, 3));
        Intrinsics.checkNotNullExpressionValue(rVarDoFinally, "doFinally(...)");
        return rVarDoFinally;
    }

    public final void H(u1 loadingType) {
        Intrinsics.checkNotNullParameter(loadingType, "loadingType");
        if (loadingType == this.f59301y) {
            return;
        }
        this.f59301y = loadingType;
        int i = y1.f275278c[loadingType.ordinal()];
        View view = this.L;
        View view2 = this.K;
        if (i == 1) {
            view2.setVisibility(0);
            view.setVisibility(0);
        } else if (i == 2) {
            view2.setVisibility(8);
            view.setVisibility(8);
        } else {
            if (i != 3) {
                throw new NoWhenBranchMatchedException();
            }
            view2.setVisibility(0);
            view.setVisibility(8);
        }
        ShimmerFrameLayout shimmerFrameLayout = this.J;
        shimmerFrameLayout.e();
        AccelerateInterpolator accelerateInterpolator = ix0.u1.f169315a;
        ix0.u1.c(shimmerFrameLayout, this.I);
    }

    public final void I() {
        ihm.f fVar;
        if (this.f59290h0 == null) {
            ActionsView actionsView = this.V;
            this.f59290h0 = (actionsView == null || (fVar = actionsView.f58296a.f121375b) == null) ? null : fVar.subscribe(new o1(new n1(this, 3), 3), new mic.a0(14, c2.f275095a));
        }
    }

    @Override // au0.g2
    public final efm.r b() {
        throw null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if ((motionEvent == null || motionEvent.getAction() != 1) && motionEvent != null) {
            motionEvent.getAction();
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // com.revolut.core.ui_kit_core.actionshandler.TrackableItem
    /* JADX INFO: renamed from: getAnalyticsContext, reason: from getter */
    public Parcelable getF55075m() {
        return this.analyticsContext;
    }

    @NotNull
    public final Animator getContentRevealAnimator$ui_kit_components_release() {
        AnimatorSet animatorSetB = hx0.a0.b(null, this.I, new ts1.h(27), getContentSlideUpAnimator(), hx0.y.HEADER);
        animatorSetB.addListener(new z1(this, 1));
        animatorSetB.addListener(new z1(this, 0));
        return animatorSetB;
    }

    @NotNull
    public final t1 getHeightMode() {
        return this.heightMode;
    }

    @NotNull
    public final Animator getSubtitleAlphaAnimator$ui_kit_components_release() {
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.R, (Property<TextView, Float>) LinearLayout.ALPHA, BitmapDescriptorFactory.HUE_RED, 1.0f);
        Intrinsics.checkNotNullExpressionValue(objectAnimatorOfFloat, "ofFloat(...)");
        return objectAnimatorOfFloat;
    }

    public final Animator getTopLabelEndImageAlphaAnimator$ui_kit_components_release() {
        return this.P.getEndImageAlphaAnimator$ui_kit_components_release();
    }

    @Override // au0.o
    public final void k(float f, int i) {
        float f4 = -i;
        this.F.setTranslationY(f4);
        this.O.setTranslationY(f4);
        vx0.e eVar = this.i0;
        if (eVar.f292787q) {
            eVar.a(f, i);
        } else {
            boolean z = this.g0;
            float fA = BitmapDescriptorFactory.HUE_RED;
            if (!z) {
                this.I.setAlpha(kotlin.ranges.f.f((f - 0.6f) / 0.39999998f, BitmapDescriptorFactory.HUE_RED, 1.0f));
            }
            boolean z3 = this.f59300x;
            if (z3) {
                AccelerateInterpolator accelerateInterpolator = ix0.u1.f169315a;
                Context context = getContext();
                Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                fA = ix0.u1.a(context, f);
            }
            float fB = z3 ? 1 - ix0.u1.b(f) : 1.0f;
            TextView textView = this.G;
            textView.setTranslationY(fA);
            textView.setAlpha(fB);
        }
        A(f);
        ix0.t1.f(this.D, f, i, getAlpha(), this.H.getVisibility() == 0 && this.f0);
    }

    @Override // com.google.android.material.appbar.AppBarLayoutProxy
    public final WindowInsetsCompat onApplyWindowInsets(WindowInsetsCompat insets) {
        Intrinsics.checkNotNullParameter(insets, "insets");
        Insets insets2 = insets.getInsets(WindowInsetsCompat.Type.systemBars());
        Intrinsics.checkNotNullExpressionValue(insets2, "getInsets(...)");
        or0.u.z(this.F, 0, insets2.top, 0, 0, false, 29);
        this.H.setMinimumHeight(insets2.top + this.v);
        return super.onApplyWindowInsets(insets);
    }

    @Override // com.google.android.material.appbar.AppBarLayout, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        addOnOffsetChangedListener((AppBarLayout.OnOffsetChangedListener) this.A);
        addOnOffsetChangedListener((AppBarLayout.OnOffsetChangedListener) this.f59291l.f57404c);
        this.M.addOnChildAttachStateChangeListener(this.C);
        I();
    }

    @Override // au0.o, com.google.android.material.appbar.AppBarLayout, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        removeOnOffsetChangedListener((AppBarLayout.OnOffsetChangedListener) this.A);
        removeOnOffsetChangedListener((AppBarLayout.OnOffsetChangedListener) this.f59291l.f57404c);
        this.M.removeOnChildAttachStateChangeListener(this.C);
        ifm.c cVar = this.f59290h0;
        if (cVar != null) {
            cVar.dispose();
        }
        this.f59290h0 = null;
        vx0.e eVar = this.i0;
        RevGhostViewFacade revGhostViewFacade = eVar.f292781h;
        if (revGhostViewFacade != null) {
            revGhostViewFacade.detach();
        }
        eVar.f292781h = null;
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        Bundle bundle = parcelable instanceof Bundle ? (Bundle) parcelable : null;
        if (bundle == null) {
            return;
        }
        super.onRestoreInstanceState(bundle.getParcelable("STATE_KEY_SUPER"));
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        Bundle bundle = new Bundle();
        bundle.putParcelable("STATE_KEY_SUPER", super.onSaveInstanceState());
        return bundle;
    }

    @Override // android.view.View
    public final boolean onSetAlpha(int i) {
        ix0.t1.f(this.D, getLastExpandRatio$ui_kit_components_release(), getLastOffset(), getAlpha(), this.H.getVisibility() == 0 && this.f0);
        return super.onSetAlpha(i);
    }

    @Override // au0.o
    public final void q(int i, int i2, ViewGroup viewGroup) {
        int i3;
        int height;
        super.q(i, i2, viewGroup);
        if (this.heightMode != t1.FILL_AVAILABLE_SPACE || (height = (i3 = i2 - i) - getHeight()) <= 0) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        layoutParams.height = i3;
        setLayoutParams(layoutParams);
        this.I.offsetTopAndBottom(height / 2);
        viewGroup.offsetTopAndBottom(height);
    }

    public final void setAlwaysExpanded(boolean alwaysExpanded) {
        setAlwaysExpanded$ui_kit_components_release(0, alwaysExpanded);
    }

    @Override // com.revolut.core.ui_kit_core.actionshandler.TrackableItem
    public void setAnalyticsContext(Parcelable parcelable) {
        this.analyticsContext = parcelable;
    }

    @Override // android.view.View
    public void setBackgroundColor(int color) {
        super.setBackgroundColor(color);
        this.E = color;
    }

    @yhm.d
    public final void setDescriptionText(Clause text) {
        setDescriptionInternal(text);
    }

    public final void setHeaderSubtitleAlpha$ui_kit_components_release(float alpha) {
        this.R.setAlpha(alpha);
    }

    public final void setHeightMode(@NotNull t1 t1Var) {
        Intrinsics.checkNotNullParameter(t1Var, "<set-?>");
        this.heightMode = t1Var;
    }

    @yhm.d
    public final void setLargeImage(Image image, @NotNull q1 avatarVariant) {
        Intrinsics.checkNotNullParameter(avatarVariant, "avatarVariant");
        setLargeImageInternal(image != null ? new j(new AvatarModel.Default(image, null, null, null, null, null, 126), avatarVariant, 4) : null);
    }

    public void setMenuItems(@NotNull List<? extends NavBarMenuItem> menuItems, @NotNull yy0.f imageDisplayer) {
        Intrinsics.checkNotNullParameter(menuItems, "menuItems");
        Intrinsics.checkNotNullParameter(imageDisplayer, "imageDisplayer");
        this.f59291l.setMenuItems(menuItems);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00c9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void setModel(@org.jetbrains.annotations.NotNull com.revolut.core.ui_kit.views.navbar.NavBarLargeCentred.Model r24) {
        /*
            Method dump skipped, instruction units count: 490
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.core.ui_kit.views.navbar.NavBarLargeCentred.setModel(com.revolut.core.ui_kit.views.navbar.NavBarLargeCentred$Model):void");
    }

    @yhm.d
    public final void setNavigationButtonIcon(Integer iconRes) {
        setNavigationButtonImageInternal(iconRes != null ? new ResourceImage(iconRes.intValue(), (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254) : null);
    }

    @yhm.d
    public final void setNavigationButtonImage(Image image) {
        setNavigationButtonImageInternal(image);
    }

    public final void setShadowVisible(boolean visible) {
        this.f0 = visible;
        ix0.t1.f(this.D, getLastExpandRatio$ui_kit_components_release(), getLastOffset(), getAlpha(), this.H.getVisibility() == 0 && this.f0);
    }

    @yhm.d
    public final void setSubtitleText(Clause text) {
        setSubtitleInternal(text);
    }

    public final void setSwitcherButton(w1 model) {
        bv0.a aVar;
        int i = model != null ? 0 : 8;
        SwitcherButtonView switcherButtonView = this.f59287b0;
        switcherButtonView.setVisibility(i);
        if (model != null) {
            switcherButtonView.setLeftImage(model.f275259a);
            switcherButtonView.setText(model.f275260b, null);
            switcherButtonView.setChevronVisible(true);
            int i2 = y1.d[model.f275261c.ordinal()];
            if (i2 == 1) {
                aVar = bv0.a.ERROR;
            } else if (i2 == 2) {
                aVar = bv0.a.LOADING_LONG;
            } else {
                if (i2 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                aVar = bv0.a.ACTIVE_SYSTEM_THEME;
            }
            switcherButtonView.setState(aVar);
            switcherButtonView.setBadgeContent(null);
        }
    }

    @yhm.d
    public final void setTitle(Clause text) {
        this.Q.setVisibility(text != null ? 0 : 8);
        ty0.c.b(or0.u.k(this).b0(), text, this.Q, null, null, 12);
    }

    public final void setTitleGradient(int color1, int color2) {
        TextView textView = this.Q;
        if (!textView.isLaidOut() || textView.isLayoutRequested()) {
            textView.addOnLayoutChangeListener(new a2(this, color1, color2));
        } else {
            textView.getPaint().setShader(new LinearGradient(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, textView.getHeight(), new int[]{color1, color2}, (float[]) null, Shader.TileMode.CLAMP));
        }
    }

    @yhm.d
    public final void setTitleStyle(@NotNull x1 style) {
        Intrinsics.checkNotNullParameter(style, "style");
        setTitleStyleInternal(style);
    }

    @yhm.d
    public final void setToolbarTitle(@NotNull Clause clause) {
        Intrinsics.checkNotNullParameter(clause, "clause");
        setToolbarTitleInternal(clause);
    }

    public final void setToolbarTitleInternal(Clause clause) {
        ty0.c.b(or0.u.k(this).b0(), clause, this.G, null, null, 12);
        this.G.setVisibility(clause != null ? 0 : 8);
    }

    @yhm.d
    public final void setTopLabel(Clause topLabel) {
        int i = topLabel != null ? 0 : 8;
        LabelView labelView = this.P;
        labelView.setVisibility(i);
        LabelView.setText$default(labelView, topLabel, 0, 2, null);
    }

    @yhm.d
    public final void setTopLabelClickable(boolean clickable) {
        LabelView labelView = this.P;
        if (clickable) {
            labelView.setOnClickListener(new c9(this, 22));
        } else {
            labelView.setOnClickListener(null);
        }
    }

    @yhm.d
    public final void setTopLabelEndImage(Image image) {
        this.P.setEndIcon(image);
    }

    public final void setVisible(boolean visible) {
        this.H.setVisibility(visible ? 0 : 8);
    }

    public final void y(boolean z) {
        View view = this.T;
        if ((view.getVisibility() == 0) == z) {
            return;
        }
        TransitionSet transitionSet = new TransitionSet();
        Fade fade = new Fade();
        fade.addTarget(view);
        transitionSet.addTransition(fade);
        transitionSet.addTransition(new ChangeBounds());
        transitionSet.setOrdering(0);
        transitionSet.setInterpolator((TimeInterpolator) jq0.r.f177392a);
        transitionSet.setDuration(200L);
        TransitionManager.beginDelayedTransition(this.I, transitionSet);
        view.setVisibility(z ? 0 : 8);
    }

    @Override // au0.g2
    public void setMenuItems(@NotNull List<? extends NavBarMenuItem> menuItems) {
        Intrinsics.checkNotNullParameter(menuItems, "menuItems");
        this.f59291l.setMenuItems(menuItems);
    }

    public static /* synthetic */ void setLargeImage$default(NavBarLargeCentred navBarLargeCentred, ImageWithAnimatedBackgroundView.Model model, q1 q1Var, int i, Object obj2) {
        if ((i & 2) != 0) {
            q1Var = q1.AVATAR_LARGE;
        }
        navBarLargeCentred.setLargeImage(model, q1Var);
    }

    public static /* synthetic */ void setLargeImage$default(NavBarLargeCentred navBarLargeCentred, AvatarModel avatarModel, q1 q1Var, int i, Object obj2) {
        if ((i & 2) != 0) {
            q1Var = q1.AVATAR_LARGE;
        }
        navBarLargeCentred.setLargeImage(avatarModel, q1Var);
    }

    @yhm.d
    public final void setLargeImage(ImageWithAnimatedBackgroundView.Model model, @NotNull q1 avatarVariant) {
        Intrinsics.checkNotNullParameter(avatarVariant, "avatarVariant");
        setLargeImageInternal(model != null ? new j(new AvatarModel.Default(model.f58653a, null, null, null, null, model.f58654b, 62), avatarVariant, 4) : null);
    }

    @yhm.d
    public final <T extends AvatarModel> void setLargeImage(T model, @NotNull q1 avatarVariant) {
        Intrinsics.checkNotNullParameter(avatarVariant, "avatarVariant");
        setLargeImageInternal(model != null ? new j(model, avatarVariant, 4) : null);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public NavBarLargeCentred(@NotNull Context context) {
        this(context, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }
}
