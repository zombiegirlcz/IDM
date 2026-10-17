package com.revolut.core.ui_kit.views.navbar;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.RectF;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.core.graphics.ColorUtils;
import androidx.core.graphics.Insets;
import androidx.core.view.WindowInsetsCompat;
import au0.c0;
import au0.d5;
import au0.e5;
import au0.f0;
import au0.g2;
import au0.j4;
import au0.k0;
import au0.k4;
import au0.l0;
import au0.n4;
import au0.r5;
import au0.s2;
import au0.z4;
import aw0.e0;
import aw0.e4;
import aw0.h0;
import aw0.i0;
import aw0.k9;
import aw0.x8;
import com.facebook.shimmer.ShimmerFrameLayout;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.material.appbar.AppBarLayout;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.core.ui_kit.R$id;
import com.revolut.core.ui_kit.R$layout;
import com.revolut.core.ui_kit.R$string;
import com.revolut.core.ui_kit.background.AnimatedBackgroundView;
import com.revolut.core.ui_kit.base.UIKitView;
import com.revolut.core.ui_kit.internal.animation.BlinkingDotsAnimation;
import com.revolut.core.ui_kit.internal.drawables.RoundedBackgroundDrawable;
import com.revolut.core.ui_kit.internal.shimmer.RevolutShimmerDrawable;
import com.revolut.core.ui_kit.internal.views.CircleProgressBar;
import com.revolut.core.ui_kit.internal.views.CutoutImageView;
import com.revolut.core.ui_kit.internal.views.ProgressStyle;
import com.revolut.core.ui_kit.internal.views.animated_numbers.AnimatedNumbersView;
import com.revolut.core.ui_kit.internal.views.badge.CircleBadgeView;
import com.revolut.core.ui_kit.internal.views.layout.UIKitConstraintLayout;
import com.revolut.core.ui_kit.internal.views.navbar.ConstraintHeaderLayout;
import com.revolut.core.ui_kit.internal.views.navbar.HeaderLoadingLayout;
import com.revolut.core.ui_kit.internal.views.navbar.SearchView;
import com.revolut.core.ui_kit.internal.views.switcher_button.SwitcherButtonView;
import com.revolut.core.ui_kit.internal.views.tag.TagView;
import com.revolut.core.ui_kit.internal.views.tag.TagViewData;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.avatar.AvatarModel;
import com.revolut.core.ui_kit.models.badge.CircleBadgeModel;
import com.revolut.core.ui_kit.models.badge.RawImageBadge;
import com.revolut.core.ui_kit.views.ActionsView;
import com.revolut.core.ui_kit.views.AvatarView;
import com.revolut.core.ui_kit.views.ExpandableTextView;
import com.revolut.core.ui_kit.views.FixedTabs;
import com.revolut.core.ui_kit.views.OverlappedIconsView;
import com.revolut.core.ui_kit.views.buttons.SearchButton;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_core.actionshandler.TrackableItem;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.rxdiffadapter.AsyncDiffRecyclerView;
import cs0.a;
import ix0.h2;
import ix0.t1;
import ix0.u1;
import java.util.List;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import mx0.i1;
import mx0.q5;
import mx0.v5;
import org.jetbrains.annotations.NotNull;
import tx0.d2;
import tx0.g0;
import tx0.i3;
import tx0.j0;
import tx0.k3;
import tx0.m3;
import tx0.o1;
import tx0.o3;
import tx0.p3;
import tx0.q3;
import tx0.r3;
import tx0.s3;
import tx0.t3;
import tx0.u3;
import tx0.v3;
import tx0.w3;
import tx0.x3;
import tx0.y3;
import zhm.d0;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000ô\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u001d\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u0000 \u0092\u00032\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u0006:\u0010\u0093\u0003\u0094\u0003\u0095\u0003\u0096\u0003\"q\u0097\u0003Î\u0002\u0098\u0003B\u001d\b\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u0010\u0010\u0011J%\u0010\u0017\u001a\u00020\u000f2\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u00122\u0006\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u001d\u0010\u0017\u001a\u00020\u000f2\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012H\u0016¢\u0006\u0004\b\u0017\u0010\u0019J#\u0010\u001d\u001a\u00020\u000f2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001a2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001aH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u0019\u0010\u001d\u001a\u00020\u000f2\b\u0010 \u001a\u0004\u0018\u00010\u001fH\u0016¢\u0006\u0004\b\u001d\u0010!J\u0015\u0010$\u001a\u00020\u000f2\u0006\u0010#\u001a\u00020\"¢\u0006\u0004\b$\u0010%J#\u0010(\u001a\u00020\u000f2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001a2\b\u0010'\u001a\u0004\u0018\u00010&H\u0016¢\u0006\u0004\b(\u0010)J\u0019\u0010,\u001a\u00020\u000f2\b\u0010+\u001a\u0004\u0018\u00010*H\u0016¢\u0006\u0004\b,\u0010-J\u0019\u0010.\u001a\u00020\u000f2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aH\u0016¢\u0006\u0004\b.\u0010/J\u0019\u00102\u001a\u00020\u000f2\b\u00101\u001a\u0004\u0018\u000100H\u0016¢\u0006\u0004\b2\u00103J\u0019\u00105\u001a\u00020\u000f2\b\b\u0001\u00104\u001a\u00020&H\u0016¢\u0006\u0004\b5\u00106J\u0019\u00107\u001a\u00020\u000f2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aH\u0016¢\u0006\u0004\b7\u0010/J\u0019\u00108\u001a\u00020\u000f2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aH\u0016¢\u0006\u0004\b8\u0010/J\u0019\u00109\u001a\u00020\u000f2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aH\u0016¢\u0006\u0004\b9\u0010/J\u0019\u0010:\u001a\u00020\u000f2\b\u0010+\u001a\u0004\u0018\u00010*H\u0016¢\u0006\u0004\b:\u0010-J\u0017\u0010=\u001a\u00020\u000f2\u0006\u0010<\u001a\u00020;H\u0016¢\u0006\u0004\b=\u0010>J\u0019\u0010?\u001a\u00020\u000f2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aH\u0016¢\u0006\u0004\b?\u0010/J\u0017\u0010A\u001a\u00020\u000f2\u0006\u0010@\u001a\u00020\u0005H\u0016¢\u0006\u0004\bA\u0010BJ#\u0010F\u001a\u00020\u000f2\b\u0010D\u001a\u0004\u0018\u00010C2\b\b\u0001\u0010E\u001a\u00020&H\u0016¢\u0006\u0004\bF\u0010GJ\u0019\u0010H\u001a\u00020\u000f2\b\b\u0001\u00104\u001a\u00020&H\u0016¢\u0006\u0004\bH\u00106J\u0019\u0010I\u001a\u00020\u000f2\b\b\u0001\u00104\u001a\u00020&H\u0016¢\u0006\u0004\bI\u00106J\u0017\u0010L\u001a\u00020\u000f2\u0006\u0010K\u001a\u00020JH\u0016¢\u0006\u0004\bL\u0010MJ\u0017\u0010N\u001a\u00020\u000f2\u0006\u0010K\u001a\u00020JH\u0016¢\u0006\u0004\bN\u0010MJ\u0017\u0010N\u001a\u00020\u000f2\u0006\u0010P\u001a\u00020OH\u0016¢\u0006\u0004\bN\u0010QJ\u0017\u0010R\u001a\u00020\u000f2\u0006\u0010K\u001a\u00020JH\u0016¢\u0006\u0004\bR\u0010MJ+\u0010V\u001a\u00020\u000f2\b\u00101\u001a\u0004\u0018\u0001002\b\u0010T\u001a\u0004\u0018\u00010S2\u0006\u0010U\u001a\u00020JH\u0016¢\u0006\u0004\bV\u0010WJ\u0015\u0010Z\u001a\u00020\u000f2\u0006\u0010Y\u001a\u00020X¢\u0006\u0004\bZ\u0010[J\u001b\u0010^\u001a\u00020\u000f2\f\u0010]\u001a\b\u0012\u0004\u0012\u00020\\0\u0012¢\u0006\u0004\b^\u0010\u0019J\u0015\u0010a\u001a\u00020\u000f2\u0006\u0010`\u001a\u00020_¢\u0006\u0004\ba\u0010bJ\u001b\u0010d\u001a\u00020\u000f2\f\u0010c\u001a\b\u0012\u0004\u0012\u00020\\0\u0012¢\u0006\u0004\bd\u0010\u0019J\u001d\u0010e\u001a\u00020\u000f2\f\u0010]\u001a\b\u0012\u0004\u0012\u00020\\0\u0012H\u0007¢\u0006\u0004\be\u0010\u0019J7\u0010k\u001a\u00020\u000f2\b\u00101\u001a\u0004\u0018\u00010f2\n\b\u0002\u0010h\u001a\u0004\u0018\u00010g2\b\b\u0003\u0010i\u001a\u00020&2\b\b\u0003\u0010j\u001a\u00020&¢\u0006\u0004\bk\u0010lJ\u0019\u0010o\u001a\u00020\u000f2\b\u0010n\u001a\u0004\u0018\u00010mH\u0007¢\u0006\u0004\bo\u0010pJ\u0015\u0010o\u001a\u00020\u000f2\u0006\u0010r\u001a\u00020q¢\u0006\u0004\bo\u0010sJ\u0019\u0010t\u001a\u00020\u000f2\b\u00101\u001a\u0004\u0018\u00010fH\u0007¢\u0006\u0004\bt\u0010uJ\u0017\u0010v\u001a\u00020\u000f2\u0006\u0010K\u001a\u00020JH\u0007¢\u0006\u0004\bv\u0010MJ\u0019\u0010w\u001a\u00020\u000f2\b\u00101\u001a\u0004\u0018\u00010fH\u0007¢\u0006\u0004\bw\u0010uJ\u0017\u0010z\u001a\u00020\u000f2\b\u0010y\u001a\u0004\u0018\u00010x¢\u0006\u0004\bz\u0010{J\u0017\u0010|\u001a\u00020\u000f2\b\u0010T\u001a\u0004\u0018\u00010S¢\u0006\u0004\b|\u0010}J\u0015\u0010\u007f\u001a\u00020\u000f2\u0006\u0010~\u001a\u00020J¢\u0006\u0004\b\u007f\u0010MJ\u0017\u0010\u0080\u0001\u001a\u00020\u000f2\u0006\u0010~\u001a\u00020J¢\u0006\u0005\b\u0080\u0001\u0010MJ!\u0010\u0082\u0001\u001a\u00020\u000f2\u0006\u0010T\u001a\u00020&2\u0007\u0010\u0081\u0001\u001a\u00020&¢\u0006\u0006\b\u0082\u0001\u0010\u0083\u0001J\u001c\u0010\u0086\u0001\u001a\u00020\u000f2\b\u0010\u0085\u0001\u001a\u00030\u0084\u0001H\u0016¢\u0006\u0006\b\u0086\u0001\u0010\u0087\u0001J\u001b\u0010\u0088\u0001\u001a\u00020\u000f2\b\u00101\u001a\u0004\u0018\u00010fH\u0016¢\u0006\u0005\b\u0088\u0001\u0010uJ\u0018\u0010\u008a\u0001\u001a\u00020\u000f2\u0007\u0010\u0089\u0001\u001a\u00020\u001a¢\u0006\u0005\b\u008a\u0001\u0010/J/\u0010\u008e\u0001\u001a\u00020\u000f2\u0007\u0010\u008b\u0001\u001a\u00020\u001a2\u0007\u0010\u008c\u0001\u001a\u00020\u001a2\u000b\b\u0002\u0010\u008d\u0001\u001a\u0004\u0018\u00010\u001a¢\u0006\u0006\b\u008e\u0001\u0010\u008f\u0001J\u0017\u0010\u0090\u0001\u001a\u00020\u000f2\u0006\u0010K\u001a\u00020J¢\u0006\u0005\b\u0090\u0001\u0010MJ\u0017\u0010\u0091\u0001\u001a\u00020\u000f2\u0006\u0010K\u001a\u00020J¢\u0006\u0005\b\u0091\u0001\u0010MJ\u0018\u0010\u0093\u0001\u001a\u00020\u000f2\u0007\u0010\u0092\u0001\u001a\u00020J¢\u0006\u0005\b\u0093\u0001\u0010MJ\u001d\u0010\u0095\u0001\u001a\u00020\u000f2\u000b\b\u0001\u0010\u0094\u0001\u001a\u0004\u0018\u00010&¢\u0006\u0006\b\u0095\u0001\u0010\u0096\u0001J\u0019\u0010\u0097\u0001\u001a\u00020\u000f2\b\u00101\u001a\u0004\u0018\u00010f¢\u0006\u0005\b\u0097\u0001\u0010uJ+\u0010\u009b\u0001\u001a\u00020\u000f2\u000e\u0010\u0099\u0001\u001a\t\u0012\u0005\u0012\u00030\u0098\u00010\u00122\t\u0010\u009a\u0001\u001a\u0004\u0018\u00010g¢\u0006\u0006\b\u009b\u0001\u0010\u009c\u0001J4\u0010 \u0001\u001a\u00020\u000f2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001a2\u000e\u0010\u009e\u0001\u001a\t\u0012\u0005\u0012\u00030\u009d\u00010\u00122\b\u0010\u0085\u0001\u001a\u00030\u009f\u0001¢\u0006\u0006\b \u0001\u0010¡\u0001J\u0018\u0010¢\u0001\u001a\u00020\u000f2\u0007\u0010\u0092\u0001\u001a\u00020J¢\u0006\u0005\b¢\u0001\u0010MJ\u001a\u0010¤\u0001\u001a\u00020\u000f2\t\u0010£\u0001\u001a\u0004\u0018\u00010*¢\u0006\u0005\b¤\u0001\u0010-J \u0010¦\u0001\u001a\u00020\u000f2\r\u0010c\u001a\t\u0012\u0005\u0012\u00030¥\u00010\u0012H\u0016¢\u0006\u0005\b¦\u0001\u0010\u0019J\u001a\u0010¨\u0001\u001a\u00020\u000f2\u0007\u0010§\u0001\u001a\u00020\u001aH\u0016¢\u0006\u0005\b¨\u0001\u0010/J\u001a\u0010©\u0001\u001a\u00020\u000f2\u0007\u0010§\u0001\u001a\u00020\u001aH\u0016¢\u0006\u0005\b©\u0001\u0010/J\u001b\u0010¨\u0001\u001a\u00020\u000f2\u0007\u0010§\u0001\u001a\u00020gH\u0016¢\u0006\u0006\b¨\u0001\u0010ª\u0001J \u0010¬\u0001\u001a\u00020\u000f2\r\u0010«\u0001\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0012H\u0016¢\u0006\u0005\b¬\u0001\u0010\u0019J\u001c\u0010\u00ad\u0001\u001a\u00020\u000f2\t\u0010\u0089\u0001\u001a\u0004\u0018\u00010\u001aH\u0016¢\u0006\u0005\b\u00ad\u0001\u0010/J\u001c\u0010°\u0001\u001a\u00020\u000f2\b\u0010¯\u0001\u001a\u00030®\u0001H\u0016¢\u0006\u0006\b°\u0001\u0010±\u0001J\u001c\u0010³\u0001\u001a\u00020\u000f2\b\u0010\u0085\u0001\u001a\u00030²\u0001H\u0016¢\u0006\u0006\b³\u0001\u0010´\u0001J\u001a\u0010µ\u0001\u001a\u00020\u000f2\u0007\u0010\u0092\u0001\u001a\u00020JH\u0016¢\u0006\u0005\bµ\u0001\u0010MJ\u001a\u0010·\u0001\u001a\u00020\u000f2\u0007\u0010¶\u0001\u001a\u00020&H\u0016¢\u0006\u0005\b·\u0001\u00106J\u0018\u0010¹\u0001\u001a\u00020\u000f2\u0007\u0010¸\u0001\u001a\u00020J¢\u0006\u0005\b¹\u0001\u0010MJ\u001a\u0010»\u0001\u001a\u00020\u000f2\u0007\u0010º\u0001\u001a\u00020JH\u0007¢\u0006\u0005\b»\u0001\u0010MJ\u001b\u0010¼\u0001\u001a\u00020\u000f2\b\b\u0001\u00104\u001a\u00020&H\u0007¢\u0006\u0005\b¼\u0001\u00106J\u001a\u0010¾\u0001\u001a\u00020\u000f2\u0007\u0010½\u0001\u001a\u00020&H\u0016¢\u0006\u0005\b¾\u0001\u00106J\u001a\u0010À\u0001\u001a\u00020\u000f2\u0007\u0010¿\u0001\u001a\u00020JH\u0016¢\u0006\u0005\bÀ\u0001\u0010MJ\u0017\u0010Á\u0001\u001a\u00020\u000f2\u0006\u0010~\u001a\u00020J¢\u0006\u0005\bÁ\u0001\u0010MJ\u0017\u0010Â\u0001\u001a\u00020\u000f2\u0006\u0010~\u001a\u00020J¢\u0006\u0005\bÂ\u0001\u0010MJ\u001c\u0010Å\u0001\u001a\u00020\u000f2\n\u0010Ä\u0001\u001a\u0005\u0018\u00010Ã\u0001¢\u0006\u0006\bÅ\u0001\u0010Æ\u0001J\u001e\u0010È\u0001\u001a\u00020\u000f2\n\u0010Ä\u0001\u001a\u0005\u0018\u00010Ç\u0001H\u0002¢\u0006\u0006\bÈ\u0001\u0010É\u0001J\u001e\u0010Ë\u0001\u001a\u00020\u000f2\n\u0010Ä\u0001\u001a\u0005\u0018\u00010Ê\u0001H\u0002¢\u0006\u0006\bË\u0001\u0010Ì\u0001J\u0019\u0010Í\u0001\u001a\u00020\u000f2\u0006\u0010~\u001a\u00020JH\u0002¢\u0006\u0005\bÍ\u0001\u0010MJ\u0019\u0010Î\u0001\u001a\u00020\u000f2\u0006\u0010~\u001a\u00020JH\u0002¢\u0006\u0005\bÎ\u0001\u0010MJ\u0019\u0010Ï\u0001\u001a\u00020\u000f2\u0006\u0010~\u001a\u00020JH\u0002¢\u0006\u0005\bÏ\u0001\u0010MR\u001c\u0010Ô\u0001\u001a\u00020&8\u0006¢\u0006\u0010\n\u0006\bÐ\u0001\u0010Ñ\u0001\u001a\u0006\bÒ\u0001\u0010Ó\u0001R8\u0010Ý\u0001\u001a\u0005\u0018\u00010Õ\u00012\n\u0010Ö\u0001\u001a\u0005\u0018\u00010Õ\u00018\u0016@VX\u0096\u000e¢\u0006\u0018\n\u0006\b×\u0001\u0010Ø\u0001\u001a\u0006\bÙ\u0001\u0010Ú\u0001\"\u0006\bÛ\u0001\u0010Ü\u0001R!\u0010ã\u0001\u001a\u00030Þ\u00018BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\bß\u0001\u0010à\u0001\u001a\u0006\bá\u0001\u0010â\u0001R!\u0010è\u0001\u001a\u00030ä\u00018BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\bå\u0001\u0010à\u0001\u001a\u0006\bæ\u0001\u0010ç\u0001R!\u0010í\u0001\u001a\u00030é\u00018BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\bê\u0001\u0010à\u0001\u001a\u0006\bë\u0001\u0010ì\u0001R!\u0010ò\u0001\u001a\u00030î\u00018BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\bï\u0001\u0010à\u0001\u001a\u0006\bð\u0001\u0010ñ\u0001R!\u0010÷\u0001\u001a\u00030ó\u00018BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\bô\u0001\u0010à\u0001\u001a\u0006\bõ\u0001\u0010ö\u0001R!\u0010ú\u0001\u001a\u00030ó\u00018BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\bø\u0001\u0010à\u0001\u001a\u0006\bù\u0001\u0010ö\u0001R!\u0010ÿ\u0001\u001a\u00030û\u00018BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\bü\u0001\u0010à\u0001\u001a\u0006\bý\u0001\u0010þ\u0001R!\u0010\u0082\u0002\u001a\u00030û\u00018BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\b\u0080\u0002\u0010à\u0001\u001a\u0006\b\u0081\u0002\u0010þ\u0001R!\u0010\u0087\u0002\u001a\u00030\u0083\u00028BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\b\u0084\u0002\u0010à\u0001\u001a\u0006\b\u0085\u0002\u0010\u0086\u0002R!\u0010\u008a\u0002\u001a\u00030\u0083\u00028BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\b\u0088\u0002\u0010à\u0001\u001a\u0006\b\u0089\u0002\u0010\u0086\u0002R!\u0010\u008f\u0002\u001a\u00030\u008b\u00028BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\b\u008c\u0002\u0010à\u0001\u001a\u0006\b\u008d\u0002\u0010\u008e\u0002R!\u0010\u0092\u0002\u001a\u00030\u008b\u00028BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\b\u0090\u0002\u0010à\u0001\u001a\u0006\b\u0091\u0002\u0010\u008e\u0002R!\u0010\u0095\u0002\u001a\u00030\u008b\u00028BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\b\u0093\u0002\u0010à\u0001\u001a\u0006\b\u0094\u0002\u0010\u008e\u0002R!\u0010\u0098\u0002\u001a\u00030\u008b\u00028BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\b\u0096\u0002\u0010à\u0001\u001a\u0006\b\u0097\u0002\u0010\u008e\u0002R!\u0010\u009b\u0002\u001a\u00030\u008b\u00028BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\b\u0099\u0002\u0010à\u0001\u001a\u0006\b\u009a\u0002\u0010\u008e\u0002R!\u0010\u009e\u0002\u001a\u00030ó\u00018BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\b\u009c\u0002\u0010à\u0001\u001a\u0006\b\u009d\u0002\u0010ö\u0001R!\u0010£\u0002\u001a\u00030\u009f\u00028BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\b \u0002\u0010à\u0001\u001a\u0006\b¡\u0002\u0010¢\u0002R!\u0010¨\u0002\u001a\u00030¤\u00028BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\b¥\u0002\u0010à\u0001\u001a\u0006\b¦\u0002\u0010§\u0002R!\u0010\u00ad\u0002\u001a\u00030©\u00028BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\bª\u0002\u0010à\u0001\u001a\u0006\b«\u0002\u0010¬\u0002R!\u0010°\u0002\u001a\u00030ó\u00018BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\b®\u0002\u0010à\u0001\u001a\u0006\b¯\u0002\u0010ö\u0001R!\u0010µ\u0002\u001a\u00030±\u00028BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\b²\u0002\u0010à\u0001\u001a\u0006\b³\u0002\u0010´\u0002R!\u0010º\u0002\u001a\u00030¶\u00028BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\b·\u0002\u0010à\u0001\u001a\u0006\b¸\u0002\u0010¹\u0002R!\u0010¿\u0002\u001a\u00030»\u00028BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\b¼\u0002\u0010à\u0001\u001a\u0006\b½\u0002\u0010¾\u0002R!\u0010Å\u0002\u001a\u00030À\u00028BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\bÁ\u0002\u0010Â\u0002\u001a\u0006\bÃ\u0002\u0010Ä\u0002R(\u0010Í\u0002\u001a\u00030Æ\u00028\u0000X\u0081\u0004¢\u0006\u0018\n\u0006\bÇ\u0002\u0010È\u0002\u0012\u0006\bË\u0002\u0010Ì\u0002\u001a\u0006\bÉ\u0002\u0010Ê\u0002R4\u0010Õ\u0002\u001a\u00030Î\u00022\b\u0010Ö\u0001\u001a\u00030Î\u00028\u0006@FX\u0086\u000e¢\u0006\u0018\n\u0006\bÏ\u0002\u0010Ð\u0002\u001a\u0006\bÑ\u0002\u0010Ò\u0002\"\u0006\bÓ\u0002\u0010Ô\u0002R)\u0010Ù\u0002\u001a\u00020J2\u0007\u0010Ö\u0001\u001a\u00020J8V@VX\u0096\u000e¢\u0006\u000f\u001a\u0006\bÖ\u0002\u0010×\u0002\"\u0005\bØ\u0002\u0010MR)\u0010Ü\u0002\u001a\u00020J2\u0007\u0010Ö\u0001\u001a\u00020J8V@VX\u0096\u000e¢\u0006\u000f\u001a\u0006\bÚ\u0002\u0010×\u0002\"\u0005\bÛ\u0002\u0010MR)\u0010ß\u0002\u001a\u00020J2\u0007\u0010Ö\u0001\u001a\u00020J8V@VX\u0096\u000e¢\u0006\u000f\u001a\u0006\bÝ\u0002\u0010×\u0002\"\u0005\bÞ\u0002\u0010MR)\u0010â\u0002\u001a\u00020J2\u0007\u0010Ö\u0001\u001a\u00020J8V@VX\u0096\u000e¢\u0006\u000f\u001a\u0006\bà\u0002\u0010×\u0002\"\u0005\bá\u0002\u0010MR)\u0010å\u0002\u001a\u00020J2\u0007\u0010Ö\u0001\u001a\u00020J8V@VX\u0096\u000e¢\u0006\u000f\u001a\u0006\bã\u0002\u0010×\u0002\"\u0005\bä\u0002\u0010MR)\u0010è\u0002\u001a\u00020J2\u0007\u0010Ö\u0001\u001a\u00020J8V@VX\u0096\u000e¢\u0006\u000f\u001a\u0006\bæ\u0002\u0010×\u0002\"\u0005\bç\u0002\u0010MR)\u0010ë\u0002\u001a\u00020J2\u0007\u0010Ö\u0001\u001a\u00020J8V@VX\u0096\u000e¢\u0006\u000f\u001a\u0006\bé\u0002\u0010×\u0002\"\u0005\bê\u0002\u0010MR!\u0010ñ\u0002\u001a\u00030ì\u00028BX\u0082\u0084\u0002¢\u0006\u0010\u001a\u0006\bí\u0002\u0010î\u0002*\u0006\bï\u0002\u0010ð\u0002R!\u0010ô\u0002\u001a\u00030ì\u00028BX\u0082\u0084\u0002¢\u0006\u0010\u001a\u0006\bò\u0002\u0010î\u0002*\u0006\bó\u0002\u0010ð\u0002R\u0017\u0010r\u001a\u00030õ\u00028BX\u0082\u0004¢\u0006\b\u001a\u0006\bö\u0002\u0010÷\u0002R\u0018\u0010û\u0002\u001a\u00030ø\u00028BX\u0082\u0004¢\u0006\b\u001a\u0006\bù\u0002\u0010ú\u0002R\u0018\u0010ÿ\u0002\u001a\u00030ü\u00028BX\u0082\u0004¢\u0006\b\u001a\u0006\bý\u0002\u0010þ\u0002R\u0018\u0010\u0081\u0003\u001a\u00030\u0083\u00028BX\u0082\u0004¢\u0006\b\u001a\u0006\b\u0080\u0003\u0010\u0086\u0002R\u0018\u0010\u0085\u0003\u001a\u00030\u0082\u00038BX\u0082\u0004¢\u0006\b\u001a\u0006\b\u0083\u0003\u0010\u0084\u0003R\u0018\u0010\u0087\u0003\u001a\u00030õ\u00028BX\u0082\u0004¢\u0006\b\u001a\u0006\b\u0086\u0003\u0010÷\u0002R\u0018\u0010\u0089\u0003\u001a\u00030õ\u00028BX\u0082\u0004¢\u0006\b\u001a\u0006\b\u0088\u0003\u0010÷\u0002R\u0018\u0010\u008d\u0003\u001a\u00030\u008a\u00038BX\u0082\u0004¢\u0006\b\u001a\u0006\b\u008b\u0003\u0010\u008c\u0003R\u0018\u0010\u0091\u0003\u001a\u00030\u008e\u00038BX\u0082\u0004¢\u0006\b\u001a\u0006\b\u008f\u0003\u0010\u0090\u0003¨\u0006\u0099\u0003"}, d2 = {"Lcom/revolut/core/ui_kit/views/navbar/NavBarWithToolbar;", "Lau0/o;", "Lau0/f0;", "Lau0/g2;", "Lau0/k4;", "", "Lcom/revolut/core/ui_kit_core/actionshandler/TrackableItem;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "Llw0/o;", "searchViewMode", "", "setSearchViewMode", "(Llw0/o;)V", "", "Lcom/revolut/core/ui_kit/views/navbar/NavBarMenuItem;", "menuItems", "Lyy0/f;", "imageDisplayer", "setMenuItems", "(Ljava/util/List;Lyy0/f;)V", "(Ljava/util/List;)V", "Lcom/revolut/core/ui_kit/models/Clause;", "text", "topNote", "setTitle", "(Lcom/revolut/core/ui_kit/models/Clause;Lcom/revolut/core/ui_kit/models/Clause;)V", "Lau0/d0;", "compositeTitle", "(Lau0/d0;)V", "Ltx0/m3;", "animatedHeaderTitle", "setStickyAnimatedTitle", "(Ltx0/m3;)V", "", "endViewId", "setTitleDescription", "(Lcom/revolut/core/ui_kit/models/Clause;Ljava/lang/Integer;)V", "Lcom/revolut/core/ui_kit/internal/views/tag/TagViewData;", "tagViewData", "setTitleTag", "(Lcom/revolut/core/ui_kit/internal/views/tag/TagViewData;)V", "setTitleTopDescription", "(Lcom/revolut/core/ui_kit/models/Clause;)V", "Ltx0/i0;", "image", "setTitleTopDescriptionImage", "(Ltx0/i0;)V", "colorAttrId", "setTitleColor", "(I)V", "setDescriptionText", "setSecondDescriptionText", "setThirdDescriptionText", "setBottomTag", "Lau0/e0;", "style", "setSecondDescriptionTextStyle", "(Lau0/e0;)V", "setHeaderDisclaimerSticky", "payload", "setDescriptionClickPayload", "(Ljava/lang/Object;)V", "", "expirationTimeMillis", "countdownColorId", "setDescriptionCountdown", "(Ljava/lang/Long;I)V", "setSecondDescriptionColor", "setDescriptionColor", "", "clickable", "setTitleClickable", "(Z)V", "setDescriptionClickable", "Lau0/c0;", "clickableMode", "(Lau0/c0;)V", "setSecondDescriptionClickable", "Lcom/revolut/core/ui_kit/internal/views/ProgressStyle;", "progress", "imageBadgeVisible", "setDescriptionImage", "(Ltx0/i0;Lcom/revolut/core/ui_kit/internal/views/ProgressStyle;Z)V", "Ltx0/j0;", "mode", "setHeaderTitleMode", "(Ltx0/j0;)V", "Lcom/revolut/core/ui_kit/views/ActionsView$Item;", "actions", "setTopActions", "Lmx0/l;", "layoutType", "setTopActionsLayoutType", "(Lmx0/l;)V", "filters", "setFilters", "setActions", "Lcom/revolut/core/ui_kit_core/displayers/image/Image;", "", "switcherViewTag", "backgroundAttr", "iconColorAttr", "setSwitcherIcon", "(Lcom/revolut/core/ui_kit_core/displayers/image/Image;Ljava/lang/String;II)V", "Lyy0/l;", "imageUiElement", "setEndImage", "(Lyy0/l;)V", "Ltx0/s3;", "endImage", "(Ltx0/s3;)V", "setEndIconImage", "(Lcom/revolut/core/ui_kit_core/displayers/image/Image;)V", "setEndImageClickable", "setEndIconBadgeImage", "Lcom/revolut/core/ui_kit/models/badge/CircleBadgeModel;", "badge", "setEndIconBadge", "(Lcom/revolut/core/ui_kit/models/badge/CircleBadgeModel;)V", "setEndProgress", "(Lcom/revolut/core/ui_kit/internal/views/ProgressStyle;)V", "visible", "setLoadingVisible", "setToolbarProgressVisible", "max", "setToolbarProgress", "(II)V", "Ltx0/g0;", "state", "setTitleChevron", "(Ltx0/g0;)V", "setTitleChevronIcon", "clause", "setToolbarTitle", "titleClause", "subtitleClause", "descriptionClause", "setToolbar", "(Lcom/revolut/core/ui_kit/models/Clause;Lcom/revolut/core/ui_kit/models/Clause;Lcom/revolut/core/ui_kit/models/Clause;)V", "setToolbarSubtitleClickable", "setToolbarDescriptionClickable", "enabled", "setToolbarSubtitleShimmeringEnabled", "iconRes", "setNavigationButtonIcon", "(Ljava/lang/Integer;)V", "setNavigationButtonImage", "Lcom/revolut/core/ui_kit/views/FixedTabs$BaseItem;", "items", "selectedItemId", "setSegmentedControl", "(Ljava/util/List;Ljava/lang/String;)V", "Lmx0/q5;", "links", "Lmx0/v5;", "setExpandableText", "(Lcom/revolut/core/ui_kit/models/Clause;Ljava/util/List;Lmx0/v5;)V", "setToolbarModeAnimationEnabled", "content", "setMenuTagContent", "Landroid/text/InputFilter;", "setSearchInputFilters", "input", "setSearchInput", "setSearchInputSilently", "(Ljava/lang/String;)V", "hints", "setHints", "setSearchContentDescription", "Law0/k9;", "buttons", "setSearchFieldActionButtons", "(Law0/k9;)V", "Law0/e4;", "setFiltersState", "(Law0/e4;)V", "setSortingEnabled", "index", "setSearchInputSelection", "useAutoSize", "setTitleAutoSize", "alwaysExpanded", "setAlwaysExpanded", "setToolbarBackgroundColor", "color", "setBackgroundColor", "active", "setSearchButtonActive", "setVisible", "setShadowVisible", "Lcom/revolut/core/ui_kit/views/navbar/NavBarWithToolbar$b;", "model", "setNavBarDescriptionModel", "(Lcom/revolut/core/ui_kit/views/navbar/NavBarWithToolbar$b;)V", "Lcom/revolut/core/ui_kit/models/avatar/AvatarModel;", "setEndAvatar", "(Lcom/revolut/core/ui_kit/models/avatar/AvatarModel;)V", "Ltx0/q3;", "setEndAvatarGroup", "(Ltx0/q3;)V", "setHeaderVisibility", "setSubtitleTypingIndicatorVisibility", "setCenteredTypingIndicatorVisibility", "l", "I", "getMinBarHeight", "()I", "minBarHeight", "Landroid/os/Parcelable;", "value", "m", "Landroid/os/Parcelable;", "getAnalyticsContext", "()Landroid/os/Parcelable;", "setAnalyticsContext", "(Landroid/os/Parcelable;)V", "analyticsContext", "Lcom/revolut/rxdiffadapter/AsyncDiffRecyclerView;", "P", "Le8/q;", "getMenuRecyclerView", "()Lcom/revolut/rxdiffadapter/AsyncDiffRecyclerView;", "menuRecyclerView", "Lcom/revolut/core/ui_kit/views/navbar/NavBarNavigationButtonView;", "Q", "getNavigationButton", "()Lcom/revolut/core/ui_kit/views/navbar/NavBarNavigationButtonView;", "navigationButton", "Lcom/revolut/core/ui_kit/internal/views/navbar/ConstraintHeaderLayout;", "R", "getHeaderLayout", "()Lcom/revolut/core/ui_kit/internal/views/navbar/ConstraintHeaderLayout;", "headerLayout", "Lcom/revolut/core/ui_kit/base/UIKitView;", "S", "getToolbarBackground", "()Lcom/revolut/core/ui_kit/base/UIKitView;", "toolbarBackground", "Lcom/revolut/core/ui_kit/internal/views/layout/UIKitConstraintLayout;", "T", "getMenuLayout", "()Lcom/revolut/core/ui_kit/internal/views/layout/UIKitConstraintLayout;", "menuLayout", "U", "getMenuLayoutInner", "menuLayoutInner", "Lcom/revolut/core/ui_kit/views/ActionsView;", "V", "getNavBarWithToolbar_topActionsView", "()Lcom/revolut/core/ui_kit/views/ActionsView;", "navBarWithToolbar_topActionsView", "W", "getNavBarWithToolbar_actionsView", "navBarWithToolbar_actionsView", "Landroid/widget/ProgressBar;", "a0", "getNavBarWithToolbar_menuIndefiniteLoading", "()Landroid/widget/ProgressBar;", "navBarWithToolbar_menuIndefiniteLoading", "b0", "getNavBarWithToolbar_toolbarProgress", "navBarWithToolbar_toolbarProgress", "Landroid/widget/TextView;", "c0", "getNavBarWithToolbar_toolbarTitle", "()Landroid/widget/TextView;", "navBarWithToolbar_toolbarTitle", "d0", "getNavBarWithToolbar_toolbarTitleChained", "navBarWithToolbar_toolbarTitleChained", "e0", "getNavBarWithToolbar_toolbarSubtitleChained", "navBarWithToolbar_toolbarSubtitleChained", "f0", "getNavBarWithToolbar_toolbarDescriptionChained", "navBarWithToolbar_toolbarDescriptionChained", "g0", "getHeaderDisclaimerSticky", "headerDisclaimerSticky", "h0", "getNavBarLayout", "navBarLayout", "Lcom/revolut/core/ui_kit/views/ExpandableTextView;", "i0", "getNavBarWithToolbar_expandableTextView", "()Lcom/revolut/core/ui_kit/views/ExpandableTextView;", "navBarWithToolbar_expandableTextView", "Lcom/revolut/core/ui_kit/views/buttons/SearchButton;", "j0", "getSearchButton", "()Lcom/revolut/core/ui_kit/views/buttons/SearchButton;", "searchButton", "Lcom/facebook/shimmer/ShimmerFrameLayout;", "k0", "getMenuShimmeringView", "()Lcom/facebook/shimmer/ShimmerFrameLayout;", "menuShimmeringView", "l0", "getHeaderContainerLayout", "headerContainerLayout", "Landroidx/constraintlayout/widget/Guideline;", "m0", "getTopGuideline", "()Landroidx/constraintlayout/widget/Guideline;", "topGuideline", "Lcom/revolut/core/ui_kit/internal/views/tag/TagView;", "n0", "getMenuTagView", "()Lcom/revolut/core/ui_kit/internal/views/tag/TagView;", "menuTagView", "Landroidx/constraintlayout/widget/Barrier;", "r0", "getHeaderBarrier", "()Landroidx/constraintlayout/widget/Barrier;", "headerBarrier", "Lix0/h2;", "s0", "Lkotlin/Lazy;", "getHeaderContentViews", "()Lix0/h2;", "headerContentViews", "Lau0/s2;", "t0", "Lau0/s2;", "getNavBarEndValueImpl$ui_kit_components_release", "()Lau0/s2;", "getNavBarEndValueImpl$ui_kit_components_release$annotations", "()V", "navBarEndValueImpl", "Ltx0/u3;", "Y0", "Ltx0/u3;", "getToolbarTitleVisibilityMode", "()Ltx0/u3;", "setToolbarTitleVisibilityMode", "(Ltx0/u3;)V", "toolbarTitleVisibilityMode", "getTitleTopDescriptionVisible", "()Z", "setTitleTopDescriptionVisible", "titleTopDescriptionVisible", "getTitleTopDescriptionImageVisible", "setTitleTopDescriptionImageVisible", "titleTopDescriptionImageVisible", "getTitleVisible", "setTitleVisible", "titleVisible", "getDescriptionVisible", "setDescriptionVisible", "descriptionVisible", "getSecondDescriptionVisible", "setSecondDescriptionVisible", "secondDescriptionVisible", "getThirdDescriptionVisible", "setThirdDescriptionVisible", "thirdDescriptionVisible", "getCompactDescriptions", "setCompactDescriptions", "compactDescriptions", "Lau0/e5;", "getTitleTransition", "()Lau0/e5;", "getTitleTransition$delegate", "(Lcom/revolut/core/ui_kit/views/navbar/NavBarWithToolbar;)Ljava/lang/Object;", "titleTransition", "getHeaderTitleTransition", "getHeaderTitleTransition$delegate", "headerTitleTransition", "Landroid/widget/ImageView;", "getEndImage", "()Landroid/widget/ImageView;", "Lcom/revolut/core/ui_kit/internal/views/badge/CircleBadgeView;", "getEndImageBadge", "()Lcom/revolut/core/ui_kit/internal/views/badge/CircleBadgeView;", "endImageBadge", "Lcom/revolut/core/ui_kit/internal/views/CircleProgressBar;", "getEndProgress", "()Lcom/revolut/core/ui_kit/internal/views/CircleProgressBar;", "endProgress", "getNavBarWithToolbar_headerIndefiniteLoading", "navBarWithToolbar_headerIndefiniteLoading", "Landroid/widget/LinearLayout;", "getNavBarWithToolbar_switcher", "()Landroid/widget/LinearLayout;", "navBarWithToolbar_switcher", "getNavBarWithToolbar_switcherIcon", "navBarWithToolbar_switcherIcon", "getNavBarWithToolbar_switcherChevron", "navBarWithToolbar_switcherChevron", "Lcom/revolut/core/ui_kit/views/AvatarView;", "getEndAvatar", "()Lcom/revolut/core/ui_kit/views/AvatarView;", "endAvatar", "Lcom/revolut/core/ui_kit/views/OverlappedIconsView;", "getEndAvatarGroup", "()Lcom/revolut/core/ui_kit/views/OverlappedIconsView;", "endAvatarGroup", "Companion", "b", "a", "tx0/o3", "tx0/n3", "tx0/t3", "com/revolut/core/ui_kit/views/navbar/p", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class NavBarWithToolbar extends au0.o implements f0, g2, k4, TrackableItem {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();
    public final vx0.f A;
    public RectF A0;
    public int B;
    public Animator B0;
    public int C;
    public HeaderLoadingLayout C0;
    public final ifm.b D;
    public t3 D0;
    public float E;
    public BlinkingDotsAnimation E0;
    public float F;
    public BlinkingDotsAnimation F0;
    public float G;
    public final Lazy G0;
    public boolean H;
    public boolean H0;
    public ValueAnimator I;
    public boolean I0;
    public final float J;
    public boolean J0;
    public final boolean K;
    public boolean K0;
    public final Object L;
    public boolean L0;
    public final Object M;
    public boolean M0;
    public final d2 N;
    public boolean N0;
    public int O;
    public boolean O0;

    /* JADX INFO: renamed from: P, reason: from kotlin metadata */
    public final e8.q menuRecyclerView;
    public final ihm.f P0;

    /* JADX INFO: renamed from: Q, reason: from kotlin metadata */
    public final e8.q navigationButton;
    public final ihm.f Q0;

    /* JADX INFO: renamed from: R, reason: from kotlin metadata */
    public final e8.q headerLayout;
    public final ihm.f R0;

    /* JADX INFO: renamed from: S, reason: from kotlin metadata */
    public final e8.q toolbarBackground;
    public final ihm.f S0;

    /* JADX INFO: renamed from: T, reason: from kotlin metadata */
    public final e8.q menuLayout;
    public final ihm.f T0;

    /* JADX INFO: renamed from: U, reason: from kotlin metadata */
    public final e8.q menuLayoutInner;
    public final ihm.f U0;

    /* JADX INFO: renamed from: V, reason: from kotlin metadata */
    public final e8.q navBarWithToolbar_topActionsView;
    public final ihm.f V0;

    /* JADX INFO: renamed from: W, reason: from kotlin metadata */
    public final e8.q navBarWithToolbar_actionsView;
    public final ihm.f W0;
    public final ihm.f X0;

    /* JADX INFO: renamed from: Y0, reason: from kotlin metadata */
    public u3 toolbarTitleVisibilityMode;

    /* JADX INFO: renamed from: a0, reason: collision with root package name and from kotlin metadata */
    public final e8.q navBarWithToolbar_menuIndefiniteLoading;

    /* JADX INFO: renamed from: b0, reason: collision with root package name and from kotlin metadata */
    public final e8.q navBarWithToolbar_toolbarProgress;

    /* JADX INFO: renamed from: c0, reason: from kotlin metadata */
    public final e8.q navBarWithToolbar_toolbarTitle;

    /* JADX INFO: renamed from: d0, reason: collision with root package name and from kotlin metadata */
    public final e8.q navBarWithToolbar_toolbarTitleChained;

    /* JADX INFO: renamed from: e0, reason: collision with root package name and from kotlin metadata */
    public final e8.q navBarWithToolbar_toolbarSubtitleChained;

    /* JADX INFO: renamed from: f0, reason: from kotlin metadata */
    public final e8.q navBarWithToolbar_toolbarDescriptionChained;

    /* JADX INFO: renamed from: g0, reason: from kotlin metadata */
    public final e8.q headerDisclaimerSticky;

    /* JADX INFO: renamed from: h0, reason: collision with root package name and from kotlin metadata */
    public final e8.q navBarLayout;

    /* JADX INFO: renamed from: i0, reason: from kotlin metadata */
    public final e8.q navBarWithToolbar_expandableTextView;

    /* JADX INFO: renamed from: j0, reason: from kotlin metadata */
    public final e8.q searchButton;

    /* JADX INFO: renamed from: k0, reason: collision with root package name and from kotlin metadata */
    public final e8.q menuShimmeringView;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    public final int minBarHeight;

    /* JADX INFO: renamed from: l0, reason: from kotlin metadata */
    public final e8.q headerContainerLayout;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    public Parcelable analyticsContext;

    /* JADX INFO: renamed from: m0, reason: from kotlin metadata */
    public final e8.q topGuideline;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final ryc.a f59406n;

    /* JADX INFO: renamed from: n0, reason: collision with root package name and from kotlin metadata */
    public final e8.q menuTagView;
    public final com.revolut.core.ui_kit.internal.views.navbar.d o;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    public AnimatedNumbersView f59408o0;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final SearchView f59409p;
    public AppCompatTextView p0;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final ihm.f f59410q;
    public final p q0;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public Image f59411r;

    /* JADX INFO: renamed from: r0, reason: collision with root package name and from kotlin metadata */
    public final e8.q headerBarrier;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public oy0.b f59413s;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final Object f59414s0;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public ValueAnimator f59415t;

    /* JADX INFO: renamed from: t0, reason: collision with root package name and from kotlin metadata */
    public final s2 navBarEndValueImpl;
    public boolean u;
    public final ifm.b u0;
    public boolean v;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    public boolean f59417v0;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f59418w;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public boolean f59419w0;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f59420x;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public boolean f59421x0;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final o3 f59422y;
    public e4 y0;
    public boolean z;
    public MotionEvent z0;

    /* JADX INFO: renamed from: com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }
    }

    public static abstract class b {
        private b() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r1v8, types: [java.lang.Object, kotlin.Lazy] */
    public NavBarWithToolbar(@NotNull final Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        this.minBarHeight = kli.a.k(context, 56.0f);
        this.f59410q = v0.a.d("create(...)");
        Intrinsics.checkNotNullExpressionValue(new ihm.f(), "create(...)");
        final int i = 1;
        this.u = true;
        this.f59422y = new o3();
        this.z = true;
        this.A = new vx0.f();
        this.B = kli.a.s(R$attr.uikit_colorWhite, context);
        this.D = new ifm.b();
        this.F = 1.0f;
        this.J = kli.a.l(context, 14.0f);
        this.K = ((Boolean) jo0.g.H.getValue()).booleanValue();
        final int i2 = 0;
        this.L = te0.w.y0(new Function0() { // from class: tx0.l3
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        return NavBarWithToolbar.x(context, this);
                    default:
                        return NavBarWithToolbar.N(context, this);
                }
            }
        });
        this.M = te0.w.y0(new Function0() { // from class: tx0.l3
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        return NavBarWithToolbar.x(context, this);
                    default:
                        return NavBarWithToolbar.N(context, this);
                }
            }
        });
        d2 d2Var = new d2(this, i);
        this.N = d2Var;
        this.menuRecyclerView = kli.a.J(R$id.menuRecyclerView, this);
        this.navigationButton = kli.a.J(R$id.navigationButton, this);
        this.headerLayout = kli.a.J(R$id.headerLayout, this);
        this.toolbarBackground = kli.a.J(R$id.navBarWithToolbar_toolbarBackground, this);
        this.menuLayout = kli.a.J(R$id.menuLayout, this);
        this.menuLayoutInner = kli.a.J(R$id.navBarWithToolbar_innerMenuLayout, this);
        this.navBarWithToolbar_topActionsView = kli.a.J(R$id.navBarWithToolbar_topActionsView, this);
        this.navBarWithToolbar_actionsView = kli.a.J(R$id.navBarWithToolbar_actionsView, this);
        this.navBarWithToolbar_menuIndefiniteLoading = kli.a.J(R$id.navBarWithToolbar_menuIndefiniteLoading, this);
        this.navBarWithToolbar_toolbarProgress = kli.a.J(R$id.navBarWithToolbar_toolbarProgress, this);
        this.navBarWithToolbar_toolbarTitle = kli.a.J(R$id.navBarWithToolbar_toolbarTitle, this);
        this.navBarWithToolbar_toolbarTitleChained = kli.a.J(R$id.navBarWithToolbar_toolbarTitleChained, this);
        this.navBarWithToolbar_toolbarSubtitleChained = kli.a.J(R$id.navBarWithToolbar_toolbarSubtitleChained, this);
        this.navBarWithToolbar_toolbarDescriptionChained = kli.a.J(R$id.navBarWithToolbar_toolbarDescriptionChained, this);
        this.headerDisclaimerSticky = kli.a.J(R$id.navBarWithToolbar_headerDisclaimerSticky, this);
        this.navBarLayout = kli.a.J(R$id.navBarLayout, this);
        this.navBarWithToolbar_expandableTextView = kli.a.J(R$id.navBarWithToolbar_expandableTextView, this);
        this.searchButton = kli.a.J(R$id.navBarWithToolbar_searchButton, this);
        this.menuShimmeringView = kli.a.J(R$id.navBarWithToolbar_menuShimmeringView, this);
        this.headerContainerLayout = kli.a.J(R$id.navBarWithToolbar_headerContainerLayout, this);
        this.topGuideline = kli.a.J(R$id.navBarWithToolbar_guidelineTop, this);
        this.menuTagView = kli.a.J(R$id.navBarWithToolbar_menuTagView, this);
        this.q0 = new p(this);
        this.headerBarrier = kli.a.J(R$id.headerBarrier, this);
        this.f59414s0 = te0.w.y0(new i3(this, 3));
        this.navBarEndValueImpl = new s2(this);
        this.u0 = new ifm.b();
        this.f59417v0 = true;
        this.A0 = new RectF();
        int i3 = 4;
        this.G0 = yhm.j.b(new i3(this, i3));
        this.I0 = true;
        this.J0 = true;
        this.N0 = true;
        this.P0 = v0.a.d("create(...)");
        this.Q0 = v0.a.d("create(...)");
        this.R0 = v0.a.d("create(...)");
        this.S0 = v0.a.d("create(...)");
        this.T0 = v0.a.d("create(...)");
        this.U0 = v0.a.d("create(...)");
        this.V0 = v0.a.d("create(...)");
        this.W0 = v0.a.d("create(...)");
        this.X0 = v0.a.d("create(...)");
        lw0.o oVar = lw0.o.REGULAR;
        View.inflate(context, R$layout.internal_view_nav_bar_with_toolbar, this);
        getMenuRecyclerView().setFocusableInTouchMode(false);
        View viewFindViewById = findViewById(R$id.navBarWithToolbar_searchView);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        this.f59409p = (SearchView) viewFindViewById;
        Intrinsics.checkNotNullParameter(this, "coordinatorChild");
        d2Var.d = new z4(this, R$id.internal_nav_bar_shadow);
        d2Var.e = new z4(this, R$id.internal_nav_bar_second_shadow);
        fp0.p clickHandler = getNavigationButton().getClickHandler();
        fp0.p.b(clickHandler, true);
        View view = clickHandler.f137029a;
        or0.m.a(view);
        view.setOnClickListener(new x3(this, this, 6));
        TextView navBarWithToolbar_toolbarSubtitleChained = getNavBarWithToolbar_toolbarSubtitleChained();
        or0.m.a(navBarWithToolbar_toolbarSubtitleChained);
        navBarWithToolbar_toolbarSubtitleChained.setOnClickListener(new x3(this, this, i3));
        TextView navBarWithToolbar_toolbarDescriptionChained = getNavBarWithToolbar_toolbarDescriptionChained();
        or0.m.a(navBarWithToolbar_toolbarDescriptionChained);
        navBarWithToolbar_toolbarDescriptionChained.setOnClickListener(new x3(this, this, 5));
        this.o = new com.revolut.core.ui_kit.internal.views.navbar.d(getMenuRecyclerView());
        this.f59406n = new ryc.a(getHeaderDisclaimerSticky());
        setStateListAnimator(null);
        getToolbarBackground().setBackgroundColor(this.O);
        getToolbarBackground().setOnClickListener(new lu0.j(2));
        getToolbarBackground().setHapticFeedbackEnabled(false);
        getToolbarBackground().setSoundEffectsEnabled(false);
        getToolbarBackground().setFitsReadableArea(false);
        e0(getLastExpandRatio$ui_kit_components_release());
        setBackground(null);
        setToolbarSubtitleClickable(false);
        setToolbarDescriptionClickable(false);
        getHeaderContainerLayout().setReadableAreaGuidelinesEnabled(true);
        getMenuLayout().setReadableAreaGuidelinesEnabled(true);
        getMenuLayoutInner().setFitsReadableArea(false);
        getNavBarLayout().setReadableAreaGuidelinesEnabled(true);
        this.toolbarTitleVisibilityMode = u3.AUTOMATIC;
    }

    public static h2 A(NavBarWithToolbar navBarWithToolbar) {
        return new h2(navBarWithToolbar.getNavBarWithToolbar_expandableTextView(), navBarWithToolbar.getNavBarWithToolbar_topActionsView(), navBarWithToolbar.getSearchButton(), navBarWithToolbar.getNavBarWithToolbar_actionsView());
    }

    public static Unit B(NavBarWithToolbar navBarWithToolbar) {
        navBarWithToolbar.getMenuLayout().setVisibility(0);
        return Unit.f186387a;
    }

    public static Unit C(NavBarWithToolbar navBarWithToolbar, float f) {
        navBarWithToolbar.getMenuLayout().setAlpha(1 - f);
        return Unit.f186387a;
    }

    public static Unit D(NavBarWithToolbar navBarWithToolbar) {
        navBarWithToolbar.getMenuLayout().setVisibility(0);
        return Unit.f186387a;
    }

    public static Unit F(NavBarWithToolbar navBarWithToolbar, boolean z) {
        SearchView searchView = navBarWithToolbar.f59409p;
        int i = 0;
        if (z) {
            navBarWithToolbar.getMenuLayout().setVisibility(4);
            navBarWithToolbar.getMenuLayout().setAlpha(BitmapDescriptorFactory.HUE_RED);
            navBarWithToolbar.getNavigationButton().setTranslationX(-navBarWithToolbar.getNavigationButton().getWidth());
            AsyncDiffRecyclerView menuRecyclerView = navBarWithToolbar.getMenuRecyclerView();
            int childCount = menuRecyclerView.getChildCount();
            while (i < childCount) {
                View childAt = menuRecyclerView.getChildAt(i);
                RectF rectF = navBarWithToolbar.A0;
                if ((rectF.width() / 2) + rectF.left + searchView.getLeft() < navBarWithToolbar.getMenuRecyclerView().getLeft() + childAt.getLeft()) {
                    childAt.setTranslationX(navBarWithToolbar.getMenuRecyclerView().getWidth() - childAt.getLeft());
                }
                i++;
            }
        } else {
            navBarWithToolbar.getMenuLayout().setVisibility(0);
            navBarWithToolbar.getMenuLayout().setAlpha(1.0f);
            navBarWithToolbar.getNavigationButton().setTranslationX(BitmapDescriptorFactory.HUE_RED);
            AsyncDiffRecyclerView menuRecyclerView2 = navBarWithToolbar.getMenuRecyclerView();
            int childCount2 = menuRecyclerView2.getChildCount();
            while (i < childCount2) {
                View childAt2 = menuRecyclerView2.getChildAt(i);
                RectF rectF2 = navBarWithToolbar.A0;
                if ((rectF2.width() / 2) + rectF2.left + searchView.getLeft() < navBarWithToolbar.getMenuRecyclerView().getLeft() + childAt2.getLeft()) {
                    childAt2.setTranslationX(BitmapDescriptorFactory.HUE_RED);
                }
                i++;
            }
        }
        return Unit.f186387a;
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r3v7, types: [java.lang.Object, kotlin.Lazy] */
    public static Unit H(NavBarWithToolbar navBarWithToolbar, x8 x8Var) {
        Context context = navBarWithToolbar.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        navBarWithToolbar.B = kli.a.s(x8Var.f10609a.a(), context);
        navBarWithToolbar.C = x8Var.f10610b;
        if (!((Boolean) jo0.g.D.getValue()).booleanValue()) {
            navBarWithToolbar.getNavigationButton().setBackgroundColor(navBarWithToolbar.C);
        }
        navBarWithToolbar.o.f(navBarWithToolbar.B, navBarWithToolbar.C);
        if (!((Boolean) jo0.g.D.getValue()).booleanValue()) {
            navBarWithToolbar.getNavigationButton().setDrawableTint(navBarWithToolbar.B);
        }
        int i = navBarWithToolbar.B;
        navBarWithToolbar.getNavBarWithToolbar_toolbarTitle().setTextColor(i);
        navBarWithToolbar.getNavBarWithToolbar_toolbarTitleChained().setTextColor(i);
        navBarWithToolbar.getNavBarWithToolbar_toolbarSubtitleChained().setTextColor(i);
        navBarWithToolbar.getNavBarWithToolbar_toolbarDescriptionChained().setTextColor(i);
        AnimatedNumbersView animatedNumbersView = navBarWithToolbar.f59408o0;
        if (animatedNumbersView != null) {
            animatedNumbersView.setTextColor(i);
        }
        AppCompatTextView appCompatTextView = navBarWithToolbar.p0;
        if (appCompatTextView != null) {
            appCompatTextView.setTextColor(i);
        }
        return Unit.f186387a;
    }

    public static Unit I(NavBarWithToolbar navBarWithToolbar, float f) {
        navBarWithToolbar.getMenuLayout().setAlpha(1 - f);
        navBarWithToolbar.getNavigationButton().setTranslationX((-navBarWithToolbar.getNavigationButton().getWidth()) * f);
        AsyncDiffRecyclerView menuRecyclerView = navBarWithToolbar.getMenuRecyclerView();
        int childCount = menuRecyclerView.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = menuRecyclerView.getChildAt(i);
            RectF rectF = navBarWithToolbar.A0;
            if ((rectF.width() / 2) + rectF.left + navBarWithToolbar.f59409p.getLeft() < navBarWithToolbar.getMenuRecyclerView().getLeft() + childAt.getLeft()) {
                childAt.setTranslationX((navBarWithToolbar.getMenuRecyclerView().getWidth() - childAt.getLeft()) * f);
            }
        }
        return Unit.f186387a;
    }

    public static Unit K(NavBarWithToolbar navBarWithToolbar) {
        ImageView endImage = navBarWithToolbar.getEndImage();
        or0.m.a(endImage);
        endImage.setOnClickListener(new x3(navBarWithToolbar, navBarWithToolbar, 3));
        return Unit.f186387a;
    }

    public static Unit L(NavBarWithToolbar navBarWithToolbar, Clause clause, ty0.a it8) {
        Intrinsics.checkNotNullParameter(it8, "it");
        or0.u.k(navBarWithToolbar).n0().a(navBarWithToolbar.getNavBarWithToolbar_toolbarSubtitleChained(), navBarWithToolbar, new py0.c(clause));
        navBarWithToolbar.T0.onNext(it8);
        return Unit.f186387a;
    }

    public static void M(NavBarWithToolbar navBarWithToolbar, int i, int i2, ValueAnimator valueAnimator) {
        float fFloatValue = ((Float) z9h.n.g(valueAnimator, "it", "null cannot be cast to non-null type kotlin.Float")).floatValue();
        navBarWithToolbar.getHeaderLayout().setTranslationY(fFloatValue);
        UIKitConstraintLayout navBarLayout = navBarWithToolbar.getNavBarLayout();
        ViewGroup.LayoutParams layoutParams = navBarLayout.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        marginLayoutParams.height = (int) (i + i2 + fFloatValue);
        navBarLayout.setLayoutParams(marginLayoutParams);
        navBarWithToolbar.getNavBarLayout().requestLayout();
    }

    public static e5 N(Context context, NavBarWithToolbar navBarWithToolbar) {
        return new e5(context, zhm.u.c(navBarWithToolbar.getHeaderLayout()));
    }

    public static void O(NavBarWithToolbar navBarWithToolbar, boolean z) {
        int i = 0;
        int i2 = z ? 0 : -navBarWithToolbar.getHeaderLayout().getHeight();
        int height = navBarWithToolbar.getHeaderLayout().getHeight();
        int iMax = Math.max(navBarWithToolbar.minBarHeight, navBarWithToolbar.getMenuLayout().getHeight());
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(navBarWithToolbar.getHeaderLayout().getTranslationY(), i2);
        Intrinsics.h(valueAnimatorOfFloat);
        valueAnimatorOfFloat.addListener(new w3(z, navBarWithToolbar, 1));
        valueAnimatorOfFloat.addUpdateListener(new r5(navBarWithToolbar, iMax, height, 2));
        valueAnimatorOfFloat.addListener(new w3(z, navBarWithToolbar, i));
        valueAnimatorOfFloat.start();
        navBarWithToolbar.f59415t = valueAnimatorOfFloat;
        navBarWithToolbar.u = z;
    }

    public static Unit P(NavBarWithToolbar navBarWithToolbar, Clause clause, ty0.a it8) {
        Intrinsics.checkNotNullParameter(it8, "it");
        or0.u.k(navBarWithToolbar).n0().a(navBarWithToolbar.getNavBarWithToolbar_toolbarDescriptionChained(), navBarWithToolbar, clause != null ? new py0.c(clause) : null);
        navBarWithToolbar.V0.onNext(it8);
        return Unit.f186387a;
    }

    private final AvatarView getEndAvatar() {
        s2 s2Var = this.navBarEndValueImpl;
        AvatarView avatarView = s2Var.f9357m;
        if (avatarView != null) {
            return avatarView;
        }
        AvatarView avatarView2 = new AvatarView(s2Var.a(), null, 6, 0);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 17;
        avatarView2.setLayoutParams(layoutParams);
        avatarView2.setDefaultAvatarStyle$ui_kit_components_release(i1.SIZE_56_56);
        s2Var.b().addView(avatarView2);
        s2Var.f9357m = avatarView2;
        return avatarView2;
    }

    private final OverlappedIconsView getEndAvatarGroup() {
        s2 s2Var = this.navBarEndValueImpl;
        OverlappedIconsView overlappedIconsView = s2Var.f9358n;
        if (overlappedIconsView != null) {
            return overlappedIconsView;
        }
        OverlappedIconsView overlappedIconsView2 = new OverlappedIconsView(s2Var.a(), null, 6, 0);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 17;
        overlappedIconsView2.setLayoutParams(layoutParams);
        s2Var.b().addView(overlappedIconsView2);
        s2Var.f9358n = overlappedIconsView2;
        return overlappedIconsView2;
    }

    private final ImageView getEndImage() {
        s2 s2Var = this.navBarEndValueImpl;
        CutoutImageView cutoutImageView = s2Var.i;
        if (cutoutImageView != null) {
            return cutoutImageView;
        }
        CutoutImageView cutoutImageView2 = new CutoutImageView(s2Var.a(), null, 6, 0);
        cutoutImageView2.setId(R$id.endImage);
        int i = s2Var.f9352c;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i, i);
        layoutParams.gravity = 17;
        cutoutImageView2.setLayoutParams(layoutParams);
        cutoutImageView2.setScaleType(ImageView.ScaleType.FIT_CENTER);
        s2Var.b().addView(cutoutImageView2);
        s2Var.i = cutoutImageView2;
        return cutoutImageView2;
    }

    private final CircleBadgeView getEndImageBadge() {
        s2 s2Var = this.navBarEndValueImpl;
        CircleBadgeView circleBadgeView = s2Var.f9355j;
        if (circleBadgeView != null) {
            return circleBadgeView;
        }
        CircleBadgeView circleBadgeView2 = new CircleBadgeView(s2Var.a(), null, 0, null, 14);
        circleBadgeView2.setId(R$id.endImageBadge);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 8388693;
        Context context = circleBadgeView2.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        layoutParams.setMarginStart(kli.a.k(context, 38.0f));
        Context context2 = circleBadgeView2.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        layoutParams.topMargin = kli.a.k(context2, 38.0f);
        circleBadgeView2.setLayoutParams(layoutParams);
        circleBadgeView2.setBadgeSize(os0.a.SMALL);
        s2Var.b().addView(circleBadgeView2);
        s2Var.f9355j = circleBadgeView2;
        return circleBadgeView2;
    }

    private final CircleProgressBar getEndProgress() {
        s2 s2Var = this.navBarEndValueImpl;
        CircleProgressBar circleProgressBar = s2Var.k;
        if (circleProgressBar != null) {
            return circleProgressBar;
        }
        CircleProgressBar circleProgressBar2 = new CircleProgressBar(s2Var.a(), null, 6, 0);
        circleProgressBar2.setId(R$id.endProgress);
        int i = s2Var.d;
        circleProgressBar2.setLayoutParams(new FrameLayout.LayoutParams(i, i));
        circleProgressBar2.setVisibility(8);
        s2Var.b().addView(circleProgressBar2);
        s2Var.k = circleProgressBar2;
        return circleProgressBar2;
    }

    private final Barrier getHeaderBarrier() {
        return (Barrier) this.headerBarrier.f();
    }

    private final UIKitConstraintLayout getHeaderContainerLayout() {
        return (UIKitConstraintLayout) this.headerContainerLayout.f();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    private final h2 getHeaderContentViews() {
        return (h2) this.f59414s0.getValue();
    }

    private final TextView getHeaderDisclaimerSticky() {
        return (TextView) this.headerDisclaimerSticky.f();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ConstraintHeaderLayout getHeaderLayout() {
        return (ConstraintHeaderLayout) this.headerLayout.f();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    private final e5 getHeaderTitleTransition() {
        return (e5) this.M.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final UIKitConstraintLayout getMenuLayout() {
        return (UIKitConstraintLayout) this.menuLayout.f();
    }

    private final UIKitConstraintLayout getMenuLayoutInner() {
        return (UIKitConstraintLayout) this.menuLayoutInner.f();
    }

    private final AsyncDiffRecyclerView getMenuRecyclerView() {
        return (AsyncDiffRecyclerView) this.menuRecyclerView.f();
    }

    private final ShimmerFrameLayout getMenuShimmeringView() {
        return (ShimmerFrameLayout) this.menuShimmeringView.f();
    }

    private final TagView getMenuTagView() {
        return (TagView) this.menuTagView.f();
    }

    public static /* synthetic */ void getNavBarEndValueImpl$ui_kit_components_release$annotations() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final UIKitConstraintLayout getNavBarLayout() {
        return (UIKitConstraintLayout) this.navBarLayout.f();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ActionsView getNavBarWithToolbar_actionsView() {
        return (ActionsView) this.navBarWithToolbar_actionsView.f();
    }

    private final ExpandableTextView getNavBarWithToolbar_expandableTextView() {
        return (ExpandableTextView) this.navBarWithToolbar_expandableTextView.f();
    }

    private final ProgressBar getNavBarWithToolbar_headerIndefiniteLoading() {
        s2 s2Var = this.navBarEndValueImpl;
        ProgressBar progressBar = s2Var.f9356l;
        if (progressBar != null) {
            return progressBar;
        }
        ProgressBar progressBar2 = new ProgressBar(s2Var.a(), null, R$attr.uikit_progressBarPrimary);
        int i = s2Var.e;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i, i);
        Context context = progressBar2.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        layoutParams.topMargin = kli.a.k(context, 6.0f);
        progressBar2.setLayoutParams(layoutParams);
        s2Var.b().addView(progressBar2);
        s2Var.f9356l = progressBar2;
        return progressBar2;
    }

    private final ProgressBar getNavBarWithToolbar_menuIndefiniteLoading() {
        return (ProgressBar) this.navBarWithToolbar_menuIndefiniteLoading.f();
    }

    private final LinearLayout getNavBarWithToolbar_switcher() {
        return (LinearLayout) this.navBarEndValueImpl.c().f207709b;
    }

    private final ImageView getNavBarWithToolbar_switcherChevron() {
        return (ImageView) this.navBarEndValueImpl.c().d;
    }

    private final ImageView getNavBarWithToolbar_switcherIcon() {
        return (ImageView) this.navBarEndValueImpl.c().f207710c;
    }

    private final TextView getNavBarWithToolbar_toolbarDescriptionChained() {
        return (TextView) this.navBarWithToolbar_toolbarDescriptionChained.f();
    }

    private final ProgressBar getNavBarWithToolbar_toolbarProgress() {
        return (ProgressBar) this.navBarWithToolbar_toolbarProgress.f();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final TextView getNavBarWithToolbar_toolbarSubtitleChained() {
        return (TextView) this.navBarWithToolbar_toolbarSubtitleChained.f();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final TextView getNavBarWithToolbar_toolbarTitle() {
        return (TextView) this.navBarWithToolbar_toolbarTitle.f();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final TextView getNavBarWithToolbar_toolbarTitleChained() {
        return (TextView) this.navBarWithToolbar_toolbarTitleChained.f();
    }

    private final ActionsView getNavBarWithToolbar_topActionsView() {
        return (ActionsView) this.navBarWithToolbar_topActionsView.f();
    }

    private final NavBarNavigationButtonView getNavigationButton() {
        return (NavBarNavigationButtonView) this.navigationButton.f();
    }

    private final SearchButton getSearchButton() {
        return (SearchButton) this.searchButton.f();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    private final e5 getTitleTransition() {
        return (e5) this.L.getValue();
    }

    private final UIKitView getToolbarBackground() {
        return (UIKitView) this.toolbarBackground.f();
    }

    private final Guideline getTopGuideline() {
        return (Guideline) this.topGuideline.f();
    }

    private final void setCenteredTypingIndicatorVisibility(boolean visible) {
        if (visible || this.E0 != null) {
            BlinkingDotsAnimation blinkingDotsAnimation = this.E0;
            if (blinkingDotsAnimation == null) {
                ConstraintLayout constraintLayout = (ConstraintLayout) findViewById(R$id.navBarWithToolbar_innerMenuLayout);
                Context context = getContext();
                Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                BlinkingDotsAnimation blinkingDotsAnimation2 = new BlinkingDotsAnimation(context, null, 6, i);
                ConstraintLayout.LayoutParams layoutParams = new ConstraintLayout.LayoutParams(-2, -2);
                layoutParams.startToStart = 0;
                layoutParams.endToEnd = 0;
                layoutParams.topToTop = 0;
                layoutParams.bottomToBottom = 0;
                blinkingDotsAnimation2.setLayoutParams(layoutParams);
                Context context2 = getContext();
                Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
                float fK = kli.a.k(context2, 5.0f);
                blinkingDotsAnimation2.setDotSize(fK);
                blinkingDotsAnimation2.setDotGap(fK);
                constraintLayout.addView(blinkingDotsAnimation2);
                this.E0 = blinkingDotsAnimation2;
                blinkingDotsAnimation = blinkingDotsAnimation2;
            }
            blinkingDotsAnimation.setVisibility(visible ? 0 : 8);
        }
    }

    private final void setEndAvatar(AvatarModel model) {
        boolean z = model != null;
        s2 s2Var = this.navBarEndValueImpl;
        s2Var.d(z);
        if (model == null) {
            if (s2Var.f9357m != null) {
                getEndAvatar().setVisibility(8);
            }
        } else {
            getEndAvatar().setModel(model);
            AvatarView endAvatar = getEndAvatar();
            or0.m.a(endAvatar);
            endAvatar.setOnClickListener(new x3(this, this, 1));
            getEndAvatar().setVisibility(0);
        }
    }

    private final void setEndAvatarGroup(q3 model) {
        s2 s2Var = this.navBarEndValueImpl;
        s2Var.d(false);
        if (model == null) {
            if (s2Var.f9358n != null) {
                getEndAvatarGroup().setVisibility(8);
            }
        } else {
            List list = model.f275229a;
            yp0.u.a(getEndAvatarGroup(), model.f275230b ? new i0(list, e0.DP_40, new aw0.f0(), 8) : new i0(d0.V0(list, 4), e0.DP_40, (h0) null, 12), 8);
            OverlappedIconsView endAvatarGroup = getEndAvatarGroup();
            or0.m.a(endAvatarGroup);
            endAvatarGroup.setOnClickListener(new x3(this, this, 2));
            getEndAvatarGroup().setVisibility(0);
        }
    }

    private final void setHeaderVisibility(boolean visible) {
        if (this.u == visible) {
            return;
        }
        getHeaderLayout().setTranslationY(visible ? 0 : -getHeaderLayout().getHeight());
        UIKitConstraintLayout navBarLayout = getNavBarLayout();
        ViewGroup.LayoutParams layoutParams = navBarLayout.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        marginLayoutParams.height = -2;
        navBarLayout.setLayoutParams(marginLayoutParams);
        getHeaderLayout().setVisibility(visible ? 0 : 4);
        ConstraintHeaderLayout headerLayout = getHeaderLayout();
        ViewGroup.LayoutParams layoutParams2 = headerLayout.getLayoutParams();
        if (layoutParams2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        }
        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams2;
        marginLayoutParams2.height = visible ? -2 : 1;
        headerLayout.setLayoutParams(marginLayoutParams2);
        this.u = visible;
    }

    private final void setSubtitleTypingIndicatorVisibility(boolean visible) {
        if (visible || this.F0 != null) {
            BlinkingDotsAnimation blinkingDotsAnimation = this.F0;
            if (blinkingDotsAnimation == null) {
                ConstraintLayout constraintLayout = (ConstraintLayout) findViewById(R$id.navBarWithToolbar_innerMenuLayout);
                Context context = getContext();
                Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                int iK = kli.a.k(context, 4.0f);
                Context context2 = getContext();
                Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
                BlinkingDotsAnimation blinkingDotsAnimation2 = new BlinkingDotsAnimation(context2, null, 6, i);
                ConstraintLayout.LayoutParams layoutParams = new ConstraintLayout.LayoutParams(-2, -2);
                int i = R$id.navBarWithToolbar_toolbarSubtitleChained;
                layoutParams.startToEnd = i;
                layoutParams.endToStart = R$id.navBarWithToolbar_menuIndefiniteLoading;
                layoutParams.topToTop = i;
                layoutParams.bottomToBottom = i;
                layoutParams.horizontalBias = BitmapDescriptorFactory.HUE_RED;
                layoutParams.setMarginStart((iK * 3) / 4);
                layoutParams.setMarginEnd(iK);
                ((ViewGroup.MarginLayoutParams) layoutParams).topMargin = iK / 2;
                blinkingDotsAnimation2.setLayoutParams(layoutParams);
                float f = iK;
                blinkingDotsAnimation2.setDotSize(f);
                blinkingDotsAnimation2.setDotGap(f);
                constraintLayout.addView(blinkingDotsAnimation2);
                this.F0 = blinkingDotsAnimation2;
                blinkingDotsAnimation = blinkingDotsAnimation2;
            }
            blinkingDotsAnimation.setVisibility(visible ? 0 : 8);
        }
    }

    public static /* synthetic */ void setSwitcherIcon$default(NavBarWithToolbar navBarWithToolbar, Image image, String str, int i, int i2, int i3, Object obj2) {
        if ((i3 & 2) != 0) {
            str = null;
        }
        if ((i3 & 4) != 0) {
            i = R$attr.uikit_colorForeground;
        }
        if ((i3 & 8) != 0) {
            i2 = R$attr.uikit_colorGreyTone50;
        }
        navBarWithToolbar.setSwitcherIcon(image, str, i, i2);
    }

    public static /* synthetic */ void setToolbar$default(NavBarWithToolbar navBarWithToolbar, Clause clause, Clause clause2, Clause clause3, int i, Object obj2) {
        if ((i & 4) != 0) {
            clause3 = null;
        }
        navBarWithToolbar.setToolbar(clause, clause2, clause3);
    }

    public static e5 x(Context context, NavBarWithToolbar navBarWithToolbar) {
        return new e5(context, zhm.v.k(navBarWithToolbar.getNavBarWithToolbar_toolbarTitle(), navBarWithToolbar.getNavBarWithToolbar_toolbarTitleChained(), navBarWithToolbar.getNavBarWithToolbar_toolbarSubtitleChained(), navBarWithToolbar.getNavBarWithToolbar_toolbarDescriptionChained()));
    }

    public static Unit y(NavBarWithToolbar navBarWithToolbar, boolean z) {
        if (z) {
            navBarWithToolbar.getMenuLayout().setVisibility(4);
            navBarWithToolbar.getMenuLayout().setAlpha(BitmapDescriptorFactory.HUE_RED);
        } else {
            navBarWithToolbar.getMenuLayout().setVisibility(0);
            navBarWithToolbar.getMenuLayout().setAlpha(1.0f);
        }
        return Unit.f186387a;
    }

    public final efm.r A0() {
        efm.r rVarMerge = efm.r.merge(getHeaderLayout().f57250p, this.W0);
        Intrinsics.checkNotNullExpressionValue(rVarMerge, "merge(...)");
        return rVarMerge;
    }

    public final efm.r B0() {
        return getHeaderLayout().f57243b;
    }

    public final ihm.f C0() {
        return getNavBarWithToolbar_topActionsView().f58296a.f121375b;
    }

    public final void D0() {
        if (this.f59419w0) {
            if (this.f59421x0) {
                setAlwaysExpandedFlagEnabled$ui_kit_components_release(false);
                setScrollEnabled$ui_kit_components_release(false);
                setExpanded(false);
                O0();
            } else {
                setExpanded(true);
                if (getLastOffset() == 0) {
                    setAlwaysExpandedFlagEnabled$ui_kit_components_release(true);
                    O0();
                } else {
                    this.f59420x = true;
                }
            }
            this.X0.onNext(Boolean.valueOf(this.f59421x0));
        }
    }

    public final void E0() {
        SearchView searchView = this.f59409p;
        if (!searchView.isAttachedToWindow() || !searchView.isLaidOut()) {
            searchView.post(new cgd.e(this, 4));
            return;
        }
        searchView.o();
        View viewFindFocus = searchView.findFocus();
        if (viewFindFocus != null) {
            kli.c.d(viewFindFocus, 0L);
        }
    }

    public final boolean F0(float f) {
        int i = v3.f275251a[this.toolbarTitleVisibilityMode.ordinal()];
        if (i == 1 || i == 2) {
            return !this.u || kotlin.ranges.f.f((f - 0.6f) / 0.39999998f, BitmapDescriptorFactory.HUE_RED, 1.0f) <= BitmapDescriptorFactory.HUE_RED;
        }
        if (i == 3) {
            return true;
        }
        throw new NoWhenBranchMatchedException();
    }

    public final boolean G0() {
        boolean z;
        if (!this.K) {
            return false;
        }
        int i = v3.f275251a[this.toolbarTitleVisibilityMode.ordinal()];
        if (i == 1) {
            z = this.v;
        } else {
            if (i != 2 && i != 3) {
                throw new NoWhenBranchMatchedException();
            }
            z = true;
        }
        return z;
    }

    public final void H0(boolean z) {
        if (z) {
            b0(true);
        } else {
            setHeaderVisibility(true);
        }
    }

    public final void I0(t3 loadingType, boolean z) {
        k0 type;
        boolean z3;
        Intrinsics.checkNotNullParameter(loadingType, "loadingType");
        ValueAnimator valueAnimator = this.I;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        t3 t3Var = this.D0;
        if (t3Var == loadingType) {
            return;
        }
        SearchView searchView = this.f59409p;
        boolean z4 = true;
        if (t3Var == null) {
            this.H0 = searchView.getVisibility() == 0;
            this.I0 = getNavBarWithToolbar_toolbarTitle().getVisibility() == 0;
            this.J0 = getNavBarWithToolbar_toolbarTitleChained().getVisibility() == 0;
            this.K0 = getNavBarWithToolbar_toolbarSubtitleChained().getVisibility() == 0;
            this.L0 = getNavBarWithToolbar_toolbarDescriptionChained().getVisibility() == 0;
            this.M0 = getNavBarWithToolbar_menuIndefiniteLoading().getVisibility() == 0;
            this.N0 = getMenuRecyclerView().getVisibility() == 0;
        }
        this.D0 = loadingType;
        getHeaderContainerLayout().setVisibility(8);
        searchView.setVisibility(8);
        getNavBarWithToolbar_toolbarTitle().setVisibility(8);
        getNavBarWithToolbar_toolbarTitleChained().setVisibility(8);
        getNavBarWithToolbar_toolbarSubtitleChained().setVisibility(8);
        getNavBarWithToolbar_toolbarDescriptionChained().setVisibility(8);
        getNavBarWithToolbar_menuIndefiniteLoading().setVisibility(8);
        setCenteredTypingIndicatorVisibility(false);
        setSubtitleTypingIndicatorVisibility(false);
        getMenuRecyclerView().setVisibility(8);
        HeaderLoadingLayout headerLoadingLayout = this.C0;
        if (headerLoadingLayout == null) {
            View viewInflate = ((ViewStub) findViewById(R$id.navBarWithToolbar_headerLoadingStub)).inflate();
            Intrinsics.i(viewInflate, "null cannot be cast to non-null type com.revolut.core.ui_kit.internal.views.navbar.HeaderLoadingLayout");
            headerLoadingLayout = (HeaderLoadingLayout) viewInflate;
            this.C0 = headerLoadingLayout;
        }
        int i = v3.f275252b[loadingType.ordinal()];
        if (i == 1) {
            type = k0.DEFAULT;
        } else if (i == 2) {
            type = k0.PROFILE;
        } else {
            if (i != 3) {
                throw new NoWhenBranchMatchedException();
            }
            type = k0.TWO_LINES;
        }
        headerLoadingLayout.setVisibility(0);
        Intrinsics.checkNotNullParameter(type, "type");
        int i2 = l0.f9256a[type.ordinal()];
        if (i2 == 1) {
            z3 = false;
        } else if (i2 == 2) {
            z3 = true;
        } else {
            if (i2 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            z3 = false;
            z4 = false;
        }
        View headerLoadingDescription = headerLoadingLayout.i;
        Intrinsics.checkNotNullExpressionValue(headerLoadingDescription, "headerLoadingDescription");
        headerLoadingDescription.setVisibility(z4 ? 0 : 8);
        AppCompatImageView headerLoadingProfileAvatar = headerLoadingLayout.f57262j;
        Intrinsics.checkNotNullExpressionValue(headerLoadingProfileAvatar, "headerLoadingProfileAvatar");
        headerLoadingProfileAvatar.setVisibility(z3 ? 0 : 8);
        ShimmerFrameLayout headerLayoutShimmeringView = headerLoadingLayout.f57261h;
        Intrinsics.checkNotNullExpressionValue(headerLayoutShimmeringView, "headerLayoutShimmeringView");
        ifk.b.r(headerLayoutShimmeringView);
        if (!z) {
            getMenuShimmeringView().setVisibility(8);
        } else {
            ifk.b.r(getMenuShimmeringView());
            getMenuShimmeringView().setVisibility(0);
        }
    }

    public final void K0(j4 animation) {
        Intrinsics.checkNotNullParameter(animation, "animation");
        d0(true, animation);
    }

    public final void L0(boolean z) {
        if (this.O0 == z) {
            return;
        }
        this.O0 = z;
        if (this.u) {
            return;
        }
        boolean z3 = false;
        setCenteredTypingIndicatorVisibility(z && getNavBarWithToolbar_toolbarSubtitleChained().getVisibility() != 0);
        if (z && getNavBarWithToolbar_toolbarSubtitleChained().getVisibility() == 0) {
            z3 = true;
        }
        setSubtitleTypingIndicatorVisibility(z3);
    }

    public final void M0(boolean z) {
        ValueAnimator valueAnimator = this.I;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        float f = z ? 1.0f : BitmapDescriptorFactory.HUE_RED;
        if (G0()) {
            this.G = f;
            h0(z);
            e5 titleTransition = getTitleTransition();
            ValueAnimator valueAnimator2 = titleTransition.d;
            if (valueAnimator2 != null) {
                valueAnimator2.cancel();
            }
            titleTransition.e = d5.UNKNOWN;
            getTitleTransition().b(F0(getLastExpandRatio$ui_kit_components_release()));
            return;
        }
        if (isLaidOut() && this.H) {
            float f4 = this.G;
            if (f != f4) {
                ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(f4, f);
                valueAnimatorOfFloat.setDuration(250L);
                y3 y3Var = new y3(valueAnimatorOfFloat, this, f, z);
                valueAnimatorOfFloat.addListener(y3Var);
                valueAnimatorOfFloat.addUpdateListener(y3Var);
                valueAnimatorOfFloat.start();
                this.I = valueAnimatorOfFloat;
                return;
            }
        }
        this.G = f;
        h0(z);
        g0();
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0030  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void O0() {
        /*
            r2 = this;
            boolean r0 = r2.f59420x
            if (r0 == 0) goto L5
            goto L57
        L5:
            boolean r0 = r2.f59421x0
            int r1 = r2.minBarHeight
            if (r0 == 0) goto Lc
            goto L43
        Lc:
            android.widget.TextView r0 = r2.getHeaderDisclaimerSticky()
            int r0 = r0.getVisibility()
            if (r0 != 0) goto L17
            goto L30
        L17:
            com.revolut.core.ui_kit.internal.views.animated_numbers.AnimatedNumbersView r0 = r2.f59408o0
            if (r0 == 0) goto L29
            int r0 = r0.getVisibility()
            if (r0 != 0) goto L23
            r0 = 1
            goto L24
        L23:
            r0 = 0
        L24:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            goto L2a
        L29:
            r0 = 0
        L2a:
            boolean r0 = pd.b.j(r0)
            if (r0 == 0) goto L43
        L30:
            com.revolut.core.ui_kit.internal.views.layout.UIKitConstraintLayout r0 = r2.getMenuLayout()
            int r0 = r0.getMeasuredHeight()
            if (r0 != 0) goto L3b
            goto L57
        L3b:
            com.revolut.core.ui_kit.internal.views.layout.UIKitConstraintLayout r0 = r2.getMenuLayout()
            int r1 = r0.getMeasuredHeight()
        L43:
            int r0 = r2.f59418w
            int r0 = r0 + r1
            com.revolut.core.ui_kit.internal.views.layout.UIKitConstraintLayout r1 = r2.getNavBarLayout()
            int r1 = r1.getMinimumHeight()
            if (r1 == r0) goto L57
            com.revolut.core.ui_kit.internal.views.layout.UIKitConstraintLayout r1 = r2.getNavBarLayout()
            r1.setMinimumHeight(r0)
        L57:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar.O0():void");
    }

    @Override // au0.g2
    public final efm.r b() {
        return this.o.f57403b;
    }

    public final void b0(boolean z) {
        if (this.u == z) {
            return;
        }
        ValueAnimator valueAnimator = this.f59415t;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        if (z) {
            ConstraintHeaderLayout headerLayout = getHeaderLayout();
            ViewGroup.LayoutParams layoutParams = headerLayout.getLayoutParams();
            if (layoutParams == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            }
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            marginLayoutParams.height = -2;
            headerLayout.setLayoutParams(marginLayoutParams);
        }
        post(new n4(this, z, 9));
    }

    public final void d0(boolean z, j4 j4Var) {
        Animator animatorL;
        e4 e4Var;
        if (this.f59421x0 == z) {
            return;
        }
        this.f59421x0 = z;
        Animator animator = this.B0;
        if (animator != null) {
            animator.cancel();
        }
        if (this.K) {
            e5 titleTransition = getTitleTransition();
            ValueAnimator valueAnimator = titleTransition.d;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            d5 d5Var = d5.UNKNOWN;
            titleTransition.e = d5Var;
            e5 headerTitleTransition = getHeaderTitleTransition();
            ValueAnimator valueAnimator2 = headerTitleTransition.d;
            if (valueAnimator2 != null) {
                valueAnimator2.cancel();
            }
            headerTitleTransition.e = d5Var;
        }
        boolean z3 = this.f59421x0;
        SearchView searchView = this.f59409p;
        if (z3 && (e4Var = this.y0) != null) {
            searchView.setFiltersState(e4Var);
        }
        if (this.f59419w0) {
            D0();
            if (!z) {
                i0();
                e0m.e.a(searchView.getFocusedChild());
            }
        }
        if (j4Var == j4.NO_ANIMATION) {
            if (z) {
                getMenuLayout().setVisibility(4);
                searchView.setVisibility(0);
                return;
            } else {
                getMenuLayout().setVisibility(0);
                searchView.setVisibility(4);
                return;
            }
        }
        MotionEvent motionEvent = this.z0;
        if (!z) {
            this.z0 = null;
        }
        if (j4Var == j4.FADE || motionEvent == null) {
            animatorL = searchView.l(z, new i3(this, 1), new k3(this, 0), new t9f.n(z, this, 4));
        } else {
            if (z) {
                this.A0 = searchView.g(motionEvent);
            }
            animatorL = this.f59409p.k(z, this.A0, new i3(this, 2), new k3(this, 1), new k3(this, 2));
        }
        animatorL.setDuration(400L);
        this.B0 = animatorL;
        animatorL.start();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (!this.f59421x0 && ((motionEvent != null && motionEvent.getAction() == 1) || (motionEvent != null && motionEvent.getAction() == 3))) {
            this.z0 = motionEvent;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public final void e0(float f) {
        int i = this.O;
        getToolbarBackground().setBackgroundColor(ColorUtils.setAlphaComponent(i, (((i >> 24) & 255) * (f >= 1.0f ? 0 : f >= 0.8f ? 255 - rim.d.c(((f - 0.8f) * 5.0000005f) * 255) : 255)) / 255));
    }

    public final void f0(float f) {
        float fA;
        if (this.u) {
            AccelerateInterpolator accelerateInterpolator = u1.f169315a;
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            fA = u1.a(context, f);
        } else {
            fA = 0.0f;
        }
        this.E = fA;
        float fB = u1.b(f);
        this.F = this.u ? 1 - fB : 1.0f;
        if (G0()) {
            boolean z = !this.u || kotlin.ranges.f.f((f - 0.6f) / 0.39999998f, BitmapDescriptorFactory.HUE_RED, 1.0f) <= BitmapDescriptorFactory.HUE_RED;
            getTitleTransition().b(F0(f));
            getHeaderTitleTransition().b(!z);
        } else {
            g0();
        }
        getNavBarWithToolbar_menuIndefiniteLoading().setTranslationY(this.E);
        getNavBarWithToolbar_menuIndefiniteLoading().setAlpha(this.F);
        Lazy lazy = this.G0;
        if (lazy.isInitialized()) {
            ((FixedTabs) lazy.getValue()).setAlpha(fB);
        }
    }

    public final void g0() {
        float f = this.E;
        float f4 = this.G;
        float f5 = this.J;
        float f6 = (f5 * f4) + f;
        float f32 = this.F;
        float f35 = (1.0f - f4) * f32;
        float f36 = f - ((1.0f - f4) * f5);
        float f37 = f32 * f4;
        getNavBarWithToolbar_toolbarTitle().setTranslationY(f6);
        getNavBarWithToolbar_toolbarTitle().setAlpha(f35);
        getNavBarWithToolbar_toolbarTitleChained().setTranslationY(f36);
        getNavBarWithToolbar_toolbarTitleChained().setAlpha(f37);
        getNavBarWithToolbar_toolbarSubtitleChained().setTranslationY(f36);
        getNavBarWithToolbar_toolbarSubtitleChained().setAlpha(f37);
        getNavBarWithToolbar_toolbarDescriptionChained().setTranslationY(f36);
        getNavBarWithToolbar_toolbarDescriptionChained().setAlpha(f37);
    }

    @Override // com.revolut.core.ui_kit_core.actionshandler.TrackableItem
    /* JADX INFO: renamed from: getAnalyticsContext, reason: from getter */
    public Parcelable getF() {
        return this.analyticsContext;
    }

    public boolean getCompactDescriptions() {
        return getHeaderLayout().getCompactDescriptions();
    }

    public boolean getDescriptionVisible() {
        return getHeaderLayout().getDescriptionVisible();
    }

    public final int getMinBarHeight() {
        return this.minBarHeight;
    }

    @NotNull
    /* JADX INFO: renamed from: getNavBarEndValueImpl$ui_kit_components_release, reason: from getter */
    public final s2 getNavBarEndValueImpl() {
        return this.navBarEndValueImpl;
    }

    public boolean getSecondDescriptionVisible() {
        return getHeaderLayout().getSecondDescriptionVisible();
    }

    public boolean getThirdDescriptionVisible() {
        return getHeaderLayout().getThirdDescriptionVisible();
    }

    public boolean getTitleTopDescriptionImageVisible() {
        return getHeaderLayout().getTitleTopDescriptionImageVisible();
    }

    public boolean getTitleTopDescriptionVisible() {
        return getHeaderLayout().getTitleTopDescriptionVisible();
    }

    public boolean getTitleVisible() {
        return getHeaderLayout().getTitleVisible();
    }

    @NotNull
    public final u3 getToolbarTitleVisibilityMode() {
        return this.toolbarTitleVisibilityMode;
    }

    public final void h0(boolean z) {
        getNavBarWithToolbar_toolbarTitle().setVisibility(!z ? 0 : 8);
        getNavBarWithToolbar_toolbarTitleChained().setVisibility(z ? 0 : 8);
        getNavBarWithToolbar_toolbarSubtitleChained().setVisibility(z ? 0 : 8);
        if (z) {
            return;
        }
        getNavBarWithToolbar_toolbarDescriptionChained().setVisibility(8);
    }

    public final void i0() {
        this.f59409p.j();
    }

    public final void j0(boolean z) {
        if (z) {
            b0(false);
        } else {
            setHeaderVisibility(false);
        }
    }

    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // au0.o
    public final void k(float f, int i) {
        float f4 = i;
        float f5 = -f4;
        getMenuLayout().setTranslationY(f5);
        this.f59409p.setTranslationY(f5);
        getToolbarBackground().setTranslationY(f5);
        float fA = BitmapDescriptorFactory.HUE_RED;
        float f6 = kotlin.ranges.f.f((f - 0.6f) / 0.39999998f, BitmapDescriptorFactory.HUE_RED, 1.0f);
        if (this.K) {
            for (View view : getHeaderContentViews().f169242a) {
                view.setAlpha(f6);
            }
            p pVar = this.q0;
            pVar.e = f6;
            if (pVar.d.isInitialized()) {
                pVar.a().setAlpha(f6);
            }
        } else {
            getHeaderContainerLayout().setAlpha(f6);
        }
        if (!this.f59421x0) {
            f6 = 1.0f;
        }
        AnimatedNumbersView animatedNumbersView = this.f59408o0;
        if (animatedNumbersView != null) {
            animatedNumbersView.setAlpha(f6);
        }
        AppCompatTextView appCompatTextView = this.p0;
        if (appCompatTextView != null) {
            appCompatTextView.setAlpha(f6);
        }
        f0(f);
        if (!this.f59421x0 && !this.f59420x) {
            f4 = 0.0f;
        }
        AnimatedNumbersView animatedNumbersView2 = this.f59408o0;
        if (animatedNumbersView2 != null) {
            animatedNumbersView2.setTranslationY(f4);
        }
        AppCompatTextView appCompatTextView2 = this.p0;
        if (appCompatTextView2 != null) {
            appCompatTextView2.setTranslationY(f4);
        }
        if (this.O0) {
            float fB = u1.b(f);
            BlinkingDotsAnimation blinkingDotsAnimation = this.E0;
            if (blinkingDotsAnimation != null) {
                blinkingDotsAnimation.setAlpha(this.u ? 1 - fB : 1.0f);
                if (this.u) {
                    Context context = blinkingDotsAnimation.getContext();
                    Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                    fA = u1.a(context, f);
                }
                blinkingDotsAnimation.setTranslationY(fA);
            }
        }
        e0(f);
        if (this.f59419w0 && !isLaidOut()) {
            getSearchButton().setExpandRatio(f);
        }
        t1.f(this.N, f, i, getAlpha(), n0());
        if (this.f59420x && i == 0) {
            this.f59420x = false;
            setAlwaysExpandedFlagEnabled$ui_kit_components_release(true);
            O0();
        }
    }

    public final void l0() {
        if (this.D0 == null) {
            return;
        }
        this.D0 = null;
        HeaderLoadingLayout headerLoadingLayout = this.C0;
        if (headerLoadingLayout != null) {
            headerLoadingLayout.setVisibility(8);
        }
        getMenuShimmeringView().setVisibility(8);
        getHeaderContainerLayout().setVisibility(0);
        this.f59409p.setVisibility(this.H0 ? 0 : 8);
        getNavBarWithToolbar_toolbarTitle().setVisibility(this.I0 ? 0 : 8);
        getNavBarWithToolbar_toolbarTitleChained().setVisibility(this.J0 ? 0 : 8);
        getNavBarWithToolbar_toolbarSubtitleChained().setVisibility(this.K0 ? 0 : 8);
        getNavBarWithToolbar_toolbarDescriptionChained().setVisibility(this.L0 ? 0 : 8);
        getNavBarWithToolbar_menuIndefiniteLoading().setVisibility(this.M0 ? 0 : 8);
        setCenteredTypingIndicatorVisibility(this.O0);
        getMenuRecyclerView().setVisibility(this.N0 ? 0 : 8);
    }

    public final void m0(j4 animation) {
        Intrinsics.checkNotNullParameter(animation, "animation");
        d0(false, animation);
    }

    public final boolean n0() {
        return getNavBarLayout().getVisibility() == 0 && this.z;
    }

    public final void o0() {
        ConstraintLayout constraintLayout = (ConstraintLayout) findViewById(R$id.menuLayout);
        AnimatedNumbersView animatedNumbersView = this.f59408o0;
        if (animatedNumbersView != null) {
            if (animatedNumbersView != null) {
                animatedNumbersView.setTranslationY(BitmapDescriptorFactory.HUE_RED);
                animatedNumbersView.setAlpha(1.0f);
                constraintLayout.removeView(animatedNumbersView);
                ((LinearLayout) getHeaderLayout().findViewById(R$id.headerLayout_animatedViewContainer)).addView(animatedNumbersView, 0);
                animatedNumbersView.setVisibility(8);
            }
            this.f59408o0 = null;
        }
        AppCompatTextView appCompatTextView = this.p0;
        if (appCompatTextView != null) {
            if (appCompatTextView != null) {
                appCompatTextView.setTranslationY(BitmapDescriptorFactory.HUE_RED);
                appCompatTextView.setAlpha(1.0f);
                constraintLayout.removeView(appCompatTextView);
                getHeaderLayout().addView(appCompatTextView);
                ViewGroup.LayoutParams layoutParams = appCompatTextView.getLayoutParams();
                Intrinsics.i(layoutParams, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
                ConstraintLayout.LayoutParams layoutParams2 = (ConstraintLayout.LayoutParams) layoutParams;
                ((ViewGroup.MarginLayoutParams) layoutParams2).width = -2;
                ((ViewGroup.MarginLayoutParams) layoutParams2).height = -2;
                Context context = getContext();
                Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                layoutParams2.setMarginStart(kli.a.k(context, 16.0f));
                Context context2 = getContext();
                Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
                ((ViewGroup.MarginLayoutParams) layoutParams2).topMargin = kli.a.k(context2, 4.0f);
                Context context3 = getContext();
                Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
                layoutParams2.setMarginEnd(kli.a.k(context3, 8.0f));
                layoutParams2.constrainedWidth = true;
                layoutParams2.endToStart = R$id.headerExtraContainer;
                layoutParams2.horizontalBias = BitmapDescriptorFactory.HUE_RED;
                layoutParams2.startToStart = 0;
                layoutParams2.topToBottom = R$id.headerLayout_description;
                appCompatTextView.setVisibility(8);
            }
            this.p0 = null;
        }
    }

    @Override // com.google.android.material.appbar.AppBarLayoutProxy
    public final WindowInsetsCompat onApplyWindowInsets(WindowInsetsCompat insets) {
        Intrinsics.checkNotNullParameter(insets, "insets");
        Insets insets2 = insets.getInsets(WindowInsetsCompat.Type.systemBars());
        Intrinsics.checkNotNullExpressionValue(insets2, "getInsets(...)");
        getTopGuideline().setGuidelineBegin(insets2.top);
        this.f59418w = insets2.top;
        O0();
        return super.onApplyWindowInsets(insets);
    }

    @Override // com.google.android.material.appbar.AppBarLayout, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        addOnOffsetChangedListener((AppBarLayout.OnOffsetChangedListener) this.f59422y);
        addOnOffsetChangedListener((AppBarLayout.OnOffsetChangedListener) this.o.f57404c);
        getMenuRecyclerView().addOnChildAttachStateChangeListener(this.A);
        AnimatedBackgroundView animatedBackgroundViewI = jb3.l.i(js0.f.Companion, this);
        if (animatedBackgroundViewI == null) {
            return;
        }
        te0.w.j0(this.D, animatedBackgroundViewI.f51492b.subscribe(new o1(new k3(this, 3), 9)));
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object, kotlin.Lazy] */
    @Override // au0.o, com.google.android.material.appbar.AppBarLayout, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        ValueAnimator valueAnimator;
        ValueAnimator valueAnimator2;
        removeOnOffsetChangedListener((AppBarLayout.OnOffsetChangedListener) this.f59422y);
        removeOnOffsetChangedListener((AppBarLayout.OnOffsetChangedListener) this.o.f57404c);
        getMenuRecyclerView().removeOnChildAttachStateChangeListener(this.A);
        if (this.K) {
            if (this.L.isInitialized() && (valueAnimator2 = getTitleTransition().d) != null) {
                valueAnimator2.cancel();
            }
            if (this.M.isInitialized() && (valueAnimator = getHeaderTitleTransition().d) != null) {
                valueAnimator.cancel();
            }
        }
        this.D.d();
        super.onDetachedFromWindow();
    }

    @Override // au0.o, com.google.android.material.appbar.AppBarLayoutProxy, com.google.android.material.appbar.AppBarLayout, android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i5) {
        super.onLayout(z, i, i2, i3, i5);
        O0();
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        Bundle bundle = parcelable instanceof Bundle ? (Bundle) parcelable : null;
        if (bundle == null) {
            return;
        }
        if (bundle.getBoolean("STATE_KEY_SEARCH_VISIBLE")) {
            K0(j4.NO_ANIMATION);
        } else {
            m0(j4.NO_ANIMATION);
        }
        super.onRestoreInstanceState(bundle.getParcelable("STATE_KEY_SUPER"));
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        Bundle bundle = new Bundle();
        bundle.putParcelable("STATE_KEY_SUPER", super.onSaveInstanceState());
        bundle.putBoolean("STATE_KEY_SEARCH_VISIBLE", this.f59421x0);
        return bundle;
    }

    @Override // android.view.View
    public final boolean onSetAlpha(int i) {
        t1.f(this.N, getLastExpandRatio$ui_kit_components_release(), getLastOffset(), getAlpha(), n0());
        return super.onSetAlpha(i);
    }

    public final efm.r p0() {
        return getHeaderLayout().f57247l;
    }

    public final efm.r q0() {
        return getHeaderLayout().f57245h;
    }

    public final efm.r r0() {
        efm.r rVarMerge = efm.r.merge(this.Q0, this.P0, this.R0);
        Intrinsics.checkNotNullExpressionValue(rVarMerge, "merge(...)");
        return rVarMerge;
    }

    public final ihm.f s0() {
        return getNavBarWithToolbar_actionsView().f58296a.f121375b;
    }

    @yhm.d
    public final void setActions(@NotNull List<ActionsView.Item> actions) {
        Intrinsics.checkNotNullParameter(actions, "actions");
        setFilters(actions);
    }

    @yhm.d
    public final void setAlwaysExpanded(boolean alwaysExpanded) {
        setAlwaysExpanded$ui_kit_components_release(0, alwaysExpanded);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.core.ui_kit_core.actionshandler.TrackableItem
    public void setAnalyticsContext(Parcelable parcelable) {
        getHeaderLayout().setAnalyticsContext(parcelable);
        p pVar = this.q0;
        ?? r110 = pVar.d;
        trackableItem = null;
        TrackableItem trackableItem = null;
        if (r110.isInitialized()) {
            if (r110.isInitialized()) {
                View viewA = pVar.a();
                if (viewA instanceof TrackableItem) {
                    trackableItem = (TrackableItem) viewA;
                }
            }
            if (trackableItem != null) {
                trackableItem.setAnalyticsContext(parcelable);
            }
        } else {
            pVar.f168695c = parcelable instanceof AnalyticsContext ? (AnalyticsContext) parcelable : null;
        }
        this.analyticsContext = parcelable;
    }

    @Override // android.view.View
    public void setBackgroundColor(int color) {
        this.O = color;
        e0(getLastExpandRatio$ui_kit_components_release());
    }

    public void setBottomTag(TagViewData tagViewData) {
        getHeaderLayout().setBottomTag(tagViewData);
    }

    public void setCompactDescriptions(boolean z) {
        getHeaderLayout().setCompactDescriptions(z);
    }

    public void setDescriptionClickPayload(@NotNull Object payload) {
        Intrinsics.checkNotNullParameter(payload, "payload");
        getHeaderLayout().setDescriptionClickPayload(payload);
    }

    public void setDescriptionClickable(boolean clickable) {
        setDescriptionClickable(clickable ? c0.TEXT_AND_ICON : c0.NONE);
    }

    public void setDescriptionColor(int colorAttrId) {
        getHeaderLayout().setDescriptionColor(colorAttrId);
    }

    public void setDescriptionCountdown(Long expirationTimeMillis, int countdownColorId) {
        getHeaderLayout().setDescriptionCountdown(expirationTimeMillis, countdownColorId);
    }

    @Override // au0.f0
    public void setDescriptionImage(Image image, ProgressStyle progressStyle, boolean z) {
        setDescriptionImage(image != null ? new tx0.i0(image, tx0.h0.SIZE_24) : null, progressStyle, z);
    }

    public void setDescriptionText(Clause text) {
        getHeaderLayout().setDescriptionText(text);
    }

    public void setDescriptionVisible(boolean z) {
        getHeaderLayout().setDescriptionVisible(z);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, kotlin.Lazy] */
    public final void setEndIconBadge(CircleBadgeModel badge) {
        getEndImageBadge().setBadgeAndVisibility(badge, (ix0.l0) this.navBarEndValueImpl.o.getValue());
    }

    @yhm.d
    public final void setEndIconBadgeImage(Image image) {
        setEndIconBadge(image != null ? new RawImageBadge(image) : null);
    }

    @yhm.d
    public final void setEndIconImage(Image image) {
        if (image == null) {
            getEndImage().setVisibility(8);
            return;
        }
        if (!getEndImage().hasOnClickListeners()) {
            ImageView endImage = getEndImage();
            or0.m.a(endImage);
            endImage.setOnClickListener(new x3(this, this, 0));
        }
        if (!image.equals(this.f59413s)) {
            this.f59413s = image;
            yy0.f.e(or0.u.k(this).Q(), image, getEndImage(), null, null, 12);
        }
        getEndImage().setVisibility(0);
    }

    public final void setEndImage(@NotNull s3 endImage) {
        Intrinsics.checkNotNullParameter(endImage, "endImage");
        s2 s2Var = this.navBarEndValueImpl;
        if (s2Var.i != null && !(endImage instanceof r3)) {
            getEndImage().setVisibility(8);
        }
        if (s2Var.f9355j != null && !(endImage instanceof r3)) {
            getEndImageBadge().setVisibility(8);
        }
        if (s2Var.f9357m != null && !(endImage instanceof p3)) {
            getEndAvatar().setVisibility(8);
        }
        if (s2Var.f9358n != null && !(endImage instanceof q3)) {
            getEndAvatarGroup().setVisibility(8);
        }
        if (endImage instanceof p3) {
            setEndAvatar(((p3) endImage).f275223a);
        } else if (endImage instanceof r3) {
            setEndImage(((r3) endImage).f275236a);
        } else {
            if (!(endImage instanceof q3)) {
                throw new NoWhenBranchMatchedException();
            }
            setEndAvatarGroup((q3) endImage);
        }
    }

    @yhm.d
    public final void setEndImageClickable(boolean clickable) {
        getEndImage().setClickable(clickable);
    }

    public final void setEndProgress(ProgressStyle progress) {
        if (progress != null) {
            getEndProgress().a(progress);
        }
        getEndProgress().setVisibility(progress != null ? 0 : 8);
    }

    public final void setExpandableText(Clause text, @NotNull List<q5> links, @NotNull v5 state) {
        Intrinsics.checkNotNullParameter(links, "links");
        Intrinsics.checkNotNullParameter(state, "state");
        getNavBarWithToolbar_expandableTextView().setVisibility((text == null && links.isEmpty()) ? 8 : 0);
        if (text != null) {
            getNavBarWithToolbar_expandableTextView().setText(text);
        }
        getNavBarWithToolbar_expandableTextView().setLinks(state, links);
        getNavBarWithToolbar_expandableTextView().f0(state);
    }

    public final void setFilters(@NotNull List<ActionsView.Item> filters) {
        Intrinsics.checkNotNullParameter(filters, "filters");
        getNavBarWithToolbar_actionsView().k(filters, mx0.t.f210002a);
        getNavBarWithToolbar_actionsView().setVisibility(!filters.isEmpty() ? 0 : 8);
    }

    public void setFiltersState(@NotNull e4 state) {
        Intrinsics.checkNotNullParameter(state, "state");
        this.y0 = state;
        if (this.f59421x0) {
            this.f59409p.setFiltersState(state);
        } else if (this.f59419w0) {
            getSearchButton().setFiltersState(state);
        }
    }

    public void setHeaderDisclaimerSticky(Clause text) {
        this.f59406n.k(text);
    }

    public final void setHeaderTitleMode(@NotNull j0 mode) {
        Intrinsics.checkNotNullParameter(mode, "mode");
        getHeaderLayout().setHeaderTitleMode(mode);
    }

    @Override // au0.k4
    public void setHint(@NotNull Clause hint) {
        Intrinsics.checkNotNullParameter(hint, "hint");
        setHints(zhm.u.c(hint));
    }

    @Override // au0.k4
    public void setHints(@NotNull List<? extends Clause> hints) {
        Intrinsics.checkNotNullParameter(hints, "hints");
        this.f59409p.setHints(hints);
        if (this.f59419w0) {
            getSearchButton().setText((Clause) d0.d0(hints));
        }
    }

    public final void setLoadingVisible(boolean visible) {
        getNavBarWithToolbar_menuIndefiniteLoading().setVisibility(visible ? 0 : 8);
        getNavBarWithToolbar_headerIndefiniteLoading().setVisibility(visible ? 0 : 8);
    }

    public void setMenuItems(@NotNull List<? extends NavBarMenuItem> menuItems, @NotNull yy0.f imageDisplayer) {
        Intrinsics.checkNotNullParameter(menuItems, "menuItems");
        Intrinsics.checkNotNullParameter(imageDisplayer, "imageDisplayer");
        this.o.setMenuItems(menuItems);
    }

    public final void setMenuTagContent(TagViewData content) {
        ValueAnimator valueAnimator = this.I;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        if (content != null) {
            getMenuTagView().setContent(content);
            setTag(R$id.internal_nav_bar_title_clause, content.f57641b);
            getMenuTagView().setOnClickListener(new kp0.l(this, content, 23));
            getNavBarWithToolbar_toolbarTitle().setVisibility(8);
            getNavBarWithToolbar_toolbarTitleChained().setVisibility(8);
            getNavBarWithToolbar_toolbarSubtitleChained().setVisibility(8);
            setSubtitleTypingIndicatorVisibility(false);
            getNavBarWithToolbar_toolbarDescriptionChained().setVisibility(8);
            setCenteredTypingIndicatorVisibility(false);
        }
        getMenuTagView().setVisibility(content == null ? 8 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v3, types: [com.revolut.core.ui_kit.models.Clause, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v1, types: [com.revolut.core.ui_kit.models.Clause, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, kotlin.Lazy] */
    public final void setNavBarDescriptionModel(b model) {
        Boolean boolValueOf;
        int iK;
        bv0.a aVar;
        boolean z = model instanceof s;
        p pVar = this.q0;
        pVar.d(z);
        boolean z3 = model instanceof q;
        getHeaderLayout().setDescriptionVisible(z3);
        Barrier headerBarrier = getHeaderBarrier();
        if (pVar.d.isInitialized()) {
            boolValueOf = Boolean.valueOf(pVar.a().getVisibility() == 0);
        } else {
            boolValueOf = null;
        }
        if (boolValueOf != null ? boolValueOf.booleanValue() : false) {
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            iK = kli.a.k(context, 16.0f);
        } else {
            iK = 0;
        }
        headerBarrier.setMargin(iK);
        if (z3) {
            ConstraintHeaderLayout headerLayout = getHeaderLayout();
            q qVar = (q) model;
            Image image = qVar.f59546c;
            headerLayout.setDescriptionText(qVar.f59544a);
            getHeaderLayout().setDescriptionClickable(qVar.f59545b);
            if (image != null) {
                getHeaderLayout().setDescriptionImage(image, (ProgressStyle) null, false);
                return;
            }
            return;
        }
        if (!z) {
            if (model != null) {
                throw new NoWhenBranchMatchedException();
            }
            return;
        }
        s model2 = (s) model;
        Intrinsics.checkNotNullParameter(model2, "model");
        SwitcherButtonView switcherButtonView = (SwitcherButtonView) pVar.a();
        Image image2 = model2.f59547a;
        ?? r3 = model2.f59548b;
        int i = o.f59542a[model2.f59549c.ordinal()];
        if (i == 1) {
            aVar = bv0.a.ERROR;
        } else if (i == 2) {
            aVar = bv0.a.LOADING_LONG;
        } else {
            if (i != 3) {
                throw new NoWhenBranchMatchedException();
            }
            aVar = bv0.a.ACTIVE_SYSTEM_THEME;
        }
        switcherButtonView.setModel(new bv0.b(image2, r3, aVar));
    }

    public final void setNavigationButtonIcon(Integer iconRes) {
        setNavigationButtonImage(iconRes != null ? new ResourceImage(iconRes.intValue(), (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254) : null);
    }

    public final void setNavigationButtonImage(Image image) {
        getNavigationButton().setVisibility(image == null ? 8 : 0);
        yy0.f.e(or0.u.k(this).Q(), image, getNavigationButton(), null, null, 12);
        getNavigationButton().setContentDescription(getNavigationButton().getContext().getString(R$string.uikit_navigate_up_description));
    }

    @Override // au0.a
    public void setSearchButtonActive(boolean active) {
        if (active == this.f59419w0) {
            return;
        }
        this.f59419w0 = active;
        getSearchButton().setVisibility(active ? 0 : 8);
        SearchButton searchButton = getSearchButton();
        SearchView searchView = this.f59409p;
        searchButton.setText((Clause) d0.d0(searchView.getHints()));
        ifm.b bVar = this.u0;
        if (!active) {
            setAlwaysExpandedFlagEnabled$ui_kit_components_release(true);
            bVar.d();
            return;
        }
        te0.w.j0(bVar, getSearchButton().f59002m.subscribe(new o1(new k3(this, 4), 10)));
        te0.w.j0(bVar, searchView.f57336l.subscribe(new o1(new k3(this, 5), 11)));
        float lastExpandRatio$ui_kit_components_release = getLastExpandRatio$ui_kit_components_release();
        if (this.f59419w0 && !isLaidOut()) {
            getSearchButton().setExpandRatio(lastExpandRatio$ui_kit_components_release);
        }
        D0();
    }

    public void setSearchContentDescription(Clause clause) {
        this.f59409p.setSearchContentDescription(clause);
    }

    public void setSearchFieldActionButtons(@NotNull k9 buttons) {
        Intrinsics.checkNotNullParameter(buttons, "buttons");
        this.f59409p.setActionButtons(buttons);
        if (this.f59419w0) {
            getSearchButton().setActionButtons(buttons);
        }
    }

    public void setSearchInput(@NotNull Clause input) {
        Intrinsics.checkNotNullParameter(input, "input");
        this.f59409p.setSearchInput(input);
    }

    public void setSearchInputFilters(@NotNull List<? extends InputFilter> filters) {
        Intrinsics.checkNotNullParameter(filters, "filters");
        this.f59409p.setSearchInputFilters(filters);
    }

    public void setSearchInputSelection(int index) {
        this.f59409p.setSearchInputSelection(index);
    }

    public void setSearchInputSilently(@NotNull Clause input) {
        Intrinsics.checkNotNullParameter(input, "input");
        this.f59409p.setSearchInputSilently(input);
    }

    public final void setSearchViewMode(@NotNull lw0.o searchViewMode) {
        Intrinsics.checkNotNullParameter(searchViewMode, "searchViewMode");
        boolean z = searchViewMode == lw0.o.REGULAR;
        getNavBarLayout().setClipChildren(z);
        getNavBarLayout().setClipToPadding(z);
        setClipChildren(z);
        setClipToPadding(z);
        this.f59409p.setMode(searchViewMode);
        getSearchButton().setMode$ui_kit_components_release(searchViewMode.a());
    }

    public void setSecondDescriptionClickable(boolean clickable) {
        getHeaderLayout().setSecondDescriptionClickable(clickable);
    }

    public void setSecondDescriptionColor(int colorAttrId) {
        getHeaderLayout().setSecondDescriptionColor(colorAttrId);
    }

    public void setSecondDescriptionText(Clause text) {
        o0();
        getHeaderLayout().setSecondDescriptionText(text);
    }

    public void setSecondDescriptionTextStyle(@NotNull au0.e0 style) {
        Intrinsics.checkNotNullParameter(style, "style");
        getHeaderLayout().setSecondDescriptionTextStyle(style);
    }

    public void setSecondDescriptionVisible(boolean z) {
        getHeaderLayout().setSecondDescriptionVisible(z);
    }

    public final void setSegmentedControl(@NotNull List<? extends FixedTabs.BaseItem> items, String selectedItemId) {
        Intrinsics.checkNotNullParameter(items, "items");
        FixedTabs fixedTabs = (FixedTabs) this.G0.getValue();
        fixedTabs.setVisibility(!items.isEmpty() ? 0 : 8);
        fixedTabs.setItems(items, selectedItemId);
    }

    public final void setShadowVisible(boolean visible) {
        this.z = visible;
        t1.f(this.N, getLastExpandRatio$ui_kit_components_release(), getLastOffset(), getAlpha(), n0());
    }

    public void setSortingEnabled(boolean enabled) {
        if (this.f59419w0) {
            getSearchButton().setSortingEnabled(enabled);
        }
    }

    public final void setStickyAnimatedTitle(@NotNull m3 animatedHeaderTitle) {
        Intrinsics.checkNotNullParameter(animatedHeaderTitle, "animatedHeaderTitle");
        if (this.f59408o0 == null && this.p0 == null) {
            ConstraintLayout constraintLayout = (ConstraintLayout) findViewById(R$id.menuLayout);
            AnimatedNumbersView animatedNumbersView = (AnimatedNumbersView) getHeaderLayout().findViewById(R$id.headerLayout_animatedTextView);
            this.f59408o0 = animatedNumbersView;
            if (animatedNumbersView != null) {
                ((LinearLayout) getHeaderLayout().findViewById(R$id.headerLayout_animatedViewContainer)).removeView(animatedNumbersView);
                constraintLayout.addView(animatedNumbersView);
                ViewGroup.LayoutParams layoutParams = animatedNumbersView.getLayoutParams();
                Intrinsics.i(layoutParams, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
                ConstraintLayout.LayoutParams layoutParams2 = (ConstraintLayout.LayoutParams) layoutParams;
                layoutParams2.startToStart = 0;
                layoutParams2.topToBottom = R$id.navBarWithToolbar_innerMenuLayout;
                Context context = getContext();
                Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                layoutParams2.setMarginStart(kli.a.k(context, 16.0f));
                Context context2 = getContext();
                Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
                ((ViewGroup.MarginLayoutParams) layoutParams2).bottomMargin = kli.a.k(context2, 16.0f);
                animatedNumbersView.setVisibility(0);
                animatedNumbersView.setAnimateColour(false);
                animatedNumbersView.setAnimateSpin(true);
                animatedNumbersView.setAnimationDuration(300L);
                animatedNumbersView.setTextAppearance(R$attr.internal_textAppearanceHeading1);
            }
            AppCompatTextView appCompatTextView = (AppCompatTextView) getHeaderLayout().findViewById(R$id.headerLayout_secondDescriptionText);
            this.p0 = appCompatTextView;
            if (appCompatTextView != null) {
                getHeaderLayout().removeView(appCompatTextView);
                constraintLayout.addView(appCompatTextView);
                ViewGroup.LayoutParams layoutParams3 = appCompatTextView.getLayoutParams();
                Intrinsics.i(layoutParams3, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
                ConstraintLayout.LayoutParams layoutParams4 = (ConstraintLayout.LayoutParams) layoutParams3;
                layoutParams4.startToStart = 0;
                layoutParams4.bottomToBottom = 0;
                AnimatedNumbersView animatedNumbersView2 = this.f59408o0;
                if (animatedNumbersView2 != null) {
                    layoutParams4.topToBottom = animatedNumbersView2.getId();
                    Context context3 = getContext();
                    Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
                    layoutParams4.setMarginStart(kli.a.k(context3, 16.0f));
                    Context context4 = getContext();
                    Intrinsics.checkNotNullExpressionValue(context4, "getContext(...)");
                    ((ViewGroup.MarginLayoutParams) layoutParams4).bottomMargin = kli.a.k(context4, 16.0f);
                    getNavBarWithToolbar_toolbarTitle().setVisibility(8);
                }
            } else {
                getNavBarWithToolbar_toolbarTitle().setVisibility(8);
            }
        }
        this.v = true;
        AnimatedNumbersView animatedNumbersView3 = this.f59408o0;
        if (animatedNumbersView3 != null) {
            animatedNumbersView3.setCurrentClause(animatedHeaderTitle.f275201a);
        }
        AppCompatTextView appCompatTextView2 = this.p0;
        if (appCompatTextView2 != null) {
            kli.a.e(appCompatTextView2, animatedHeaderTitle.f275202b, null, null, 4, 6);
        }
        getHeaderLayout().setVisibility(8);
    }

    public final void setSwitcherIcon(Image image, String switcherViewTag, int backgroundAttr, int iconColorAttr) {
        if (image == null) {
            getNavBarWithToolbar_switcher().setVisibility(8);
            getNavBarWithToolbar_switcher().setClickable(false);
            getNavBarWithToolbar_switcherIcon().setVisibility(8);
            getNavBarWithToolbar_switcherChevron().setVisibility(8);
            return;
        }
        if (!image.equals(this.f59411r)) {
            this.f59411r = image;
            yy0.f.e(or0.u.k(this).Q(), image, getNavBarWithToolbar_switcherIcon(), null, null, 12);
        }
        LinearLayout navBarWithToolbar_switcher = getNavBarWithToolbar_switcher();
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        RoundedBackgroundDrawable roundedBackgroundDrawable = new RoundedBackgroundDrawable(context, kli.a.s(backgroundAttr, context2), 4);
        Context context3 = getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
        roundedBackgroundDrawable.f(kli.a.k(context3, 18.0f));
        navBarWithToolbar_switcher.setBackground(roundedBackgroundDrawable);
        getNavBarWithToolbar_switcher().setVisibility(0);
        getNavBarWithToolbar_switcher().setClickable(true);
        getNavBarWithToolbar_switcher().setTag(switcherViewTag);
        Context context4 = getContext();
        Intrinsics.checkNotNullExpressionValue(context4, "getContext(...)");
        int iS = kli.a.s(iconColorAttr, context4);
        getNavBarWithToolbar_switcherIcon().setColorFilter(iS);
        getNavBarWithToolbar_switcherChevron().setColorFilter(iS);
    }

    public void setThirdDescriptionText(Clause text) {
        getHeaderLayout().setThirdDescriptionText(text);
    }

    public void setThirdDescriptionVisible(boolean z) {
        getHeaderLayout().setThirdDescriptionVisible(z);
    }

    @Override // au0.f0
    public void setTitle(Clause text, Clause topNote) {
        o0();
        this.v = text != null;
        getHeaderLayout().setVisibility(0);
        getHeaderLayout().setTitle(text, topNote);
        getHeaderLayout().setTag(R$id.internal_nav_bar_title_clause, text);
    }

    public final void setTitleAutoSize(boolean useAutoSize) {
        getHeaderLayout().setTitleAutoSize(useAutoSize);
    }

    public void setTitleChevron(@NotNull g0 state) {
        Intrinsics.checkNotNullParameter(state, "state");
        getHeaderLayout().setTitleChevron(state);
    }

    public void setTitleChevronIcon(Image image) {
        getHeaderLayout().setTitleChevronIcon(image);
    }

    public void setTitleClickable(boolean clickable) {
        getHeaderLayout().setTitleClickable(clickable);
    }

    public void setTitleColor(int colorAttrId) {
        getHeaderLayout().setTitleColor(colorAttrId);
    }

    @Override // au0.f0
    public void setTitleDescription(Clause text, Integer endViewId) {
        getHeaderLayout().setTitleDescription(text, endViewId);
    }

    public void setTitleTag(TagViewData tagViewData) {
        getHeaderLayout().setTitleTag(tagViewData);
    }

    public void setTitleTopDescription(Clause text) {
        getHeaderLayout().setTitleTopDescription(text);
    }

    public void setTitleTopDescriptionImage(tx0.i0 image) {
        getHeaderLayout().setTitleTopDescriptionImage(image);
    }

    public void setTitleTopDescriptionImageVisible(boolean z) {
        getHeaderLayout().setTitleTopDescriptionImageVisible(z);
    }

    public void setTitleTopDescriptionVisible(boolean z) {
        getHeaderLayout().setTitleTopDescriptionVisible(z);
    }

    public void setTitleVisible(boolean z) {
        getHeaderLayout().setTitleVisible(z);
    }

    public final void setToolbar(@NotNull Clause titleClause, @NotNull final Clause subtitleClause, final Clause descriptionClause) {
        Intrinsics.checkNotNullParameter(titleClause, "titleClause");
        Intrinsics.checkNotNullParameter(subtitleClause, "subtitleClause");
        ty0.c.b(or0.u.k(this).b0(), titleClause, getNavBarWithToolbar_toolbarTitleChained(), null, null, 12);
        getNavBarWithToolbar_toolbarTitle().setTag(R$id.internal_nav_bar_title_clause, titleClause);
        final int i = 0;
        ty0.c.b(or0.u.k(this).b0(), subtitleClause, getNavBarWithToolbar_toolbarSubtitleChained(), new Function1(this) { // from class: tx0.j3

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ NavBarWithToolbar f275169b;

            {
                this.f275169b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                switch (i) {
                    case 0:
                        return NavBarWithToolbar.L(this.f275169b, subtitleClause, (ty0.a) obj2);
                    default:
                        return NavBarWithToolbar.P(this.f275169b, subtitleClause, (ty0.a) obj2);
                }
            }
        }, null, 8);
        final int i2 = 1;
        ty0.c.b(or0.u.k(this).b0(), descriptionClause, getNavBarWithToolbar_toolbarDescriptionChained(), new Function1(this) { // from class: tx0.j3

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ NavBarWithToolbar f275169b;

            {
                this.f275169b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                switch (i2) {
                    case 0:
                        return NavBarWithToolbar.L(this.f275169b, descriptionClause, (ty0.a) obj2);
                    default:
                        return NavBarWithToolbar.P(this.f275169b, descriptionClause, (ty0.a) obj2);
                }
            }
        }, null, 8);
        setMenuTagContent(null);
        setCenteredTypingIndicatorVisibility(false);
        setSubtitleTypingIndicatorVisibility(this.O0);
        getNavBarWithToolbar_toolbarDescriptionChained().setVisibility(descriptionClause == null ? 8 : 0);
        M0(true);
    }

    @yhm.d
    public final void setToolbarBackgroundColor(int colorAttrId) {
        Context context = getRootView().getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        int iS = kli.a.s(colorAttrId, context);
        getToolbarBackground().setBackgroundColor(iS);
        setBackgroundColor(iS);
    }

    public final void setToolbarDescriptionClickable(boolean clickable) {
        if (!clickable) {
            kli.a.f(getNavBarWithToolbar_toolbarDescriptionChained(), ix0.c0.f169220a);
            setOnTouchListener(null);
        } else {
            getNavBarWithToolbar_toolbarDescriptionChained().setClickable(true);
            getNavBarWithToolbar_toolbarDescriptionChained().setLongClickable(true);
            getNavBarWithToolbar_toolbarDescriptionChained().setOnTouchListener(new j01.e(new View[]{getNavBarWithToolbar_toolbarDescriptionChained()}));
            getNavBarWithToolbar_toolbarDescriptionChained().setMovementMethod(null);
        }
    }

    public final void setToolbarModeAnimationEnabled(boolean enabled) {
        this.H = enabled;
    }

    public final void setToolbarProgress(int progress, int max) {
        getNavBarWithToolbar_toolbarProgress().setMax(max);
        getNavBarWithToolbar_toolbarProgress().setProgress(progress);
    }

    public final void setToolbarProgressVisible(boolean visible) {
        getNavBarWithToolbar_toolbarProgress().setVisibility(visible ? 0 : 8);
    }

    public final void setToolbarSubtitleClickable(boolean clickable) {
        if (!clickable) {
            kli.a.f(getNavBarWithToolbar_toolbarSubtitleChained(), ix0.c0.f169220a);
            setOnTouchListener(null);
        } else {
            getNavBarWithToolbar_toolbarSubtitleChained().setClickable(true);
            getNavBarWithToolbar_toolbarSubtitleChained().setLongClickable(true);
            getNavBarWithToolbar_toolbarSubtitleChained().setOnTouchListener(new j01.e(new View[]{getNavBarWithToolbar_toolbarSubtitleChained()}));
            getNavBarWithToolbar_toolbarSubtitleChained().setMovementMethod(null);
        }
    }

    public final void setToolbarSubtitleShimmeringEnabled(boolean enabled) {
        TextView navBarWithToolbar_toolbarSubtitleChained = getNavBarWithToolbar_toolbarSubtitleChained();
        if (!enabled || navBarWithToolbar_toolbarSubtitleChained.getForeground() == null) {
            if (enabled || navBarWithToolbar_toolbarSubtitleChained.getForeground() != null) {
                if (!enabled) {
                    navBarWithToolbar_toolbarSubtitleChained.setForeground(null);
                    navBarWithToolbar_toolbarSubtitleChained.setLayerType(0, null);
                    return;
                }
                a.d dVar = cs0.a.Companion;
                a.C0641a c0641a = new a.C0641a();
                c0641a.c(0.4f);
                c0641a.g(1.0f);
                c0641a.d(cs0.d.LEFT_TO_RIGHT);
                c0641a.f(1300L);
                c0641a.h();
                c0641a.e();
                cs0.a aVar = c0641a.f108423a;
                aVar.o = 1;
                LinearInterpolator interpolator = new LinearInterpolator();
                Intrinsics.checkNotNullParameter(interpolator, "interpolator");
                aVar.f108422t = interpolator;
                aVar.f108416m = true;
                cs0.a aVarA = c0641a.a();
                RevolutShimmerDrawable revolutShimmerDrawable = new RevolutShimmerDrawable();
                revolutShimmerDrawable.a(aVarA);
                navBarWithToolbar_toolbarSubtitleChained.setForeground(revolutShimmerDrawable);
                navBarWithToolbar_toolbarSubtitleChained.setLayerType(2, null);
            }
        }
    }

    public final void setToolbarTitle(@NotNull Clause clause) {
        Intrinsics.checkNotNullParameter(clause, "clause");
        ty0.c.b(or0.u.k(this).b0(), clause, getNavBarWithToolbar_toolbarTitle(), null, null, 12);
        getNavBarWithToolbar_toolbarTitle().setTag(R$id.internal_nav_bar_title_clause, clause);
        setSubtitleTypingIndicatorVisibility(false);
        setMenuTagContent(null);
        M0(false);
    }

    public final void setToolbarTitleVisibilityMode(@NotNull u3 value) {
        Intrinsics.checkNotNullParameter(value, "value");
        if (this.toolbarTitleVisibilityMode == value) {
            return;
        }
        this.toolbarTitleVisibilityMode = value;
        if (isLaidOut()) {
            f0(getLastExpandRatio$ui_kit_components_release());
        }
    }

    public final void setTopActions(@NotNull List<ActionsView.Item> actions) {
        Intrinsics.checkNotNullParameter(actions, "actions");
        getNavBarWithToolbar_topActionsView().k(actions, mx0.t.f210002a);
        getNavBarWithToolbar_topActionsView().setVisibility(!actions.isEmpty() ? 0 : 8);
    }

    public final void setTopActionsLayoutType(@NotNull mx0.l layoutType) {
        Intrinsics.checkNotNullParameter(layoutType, "layoutType");
        getNavBarWithToolbar_topActionsView().setLayoutType(layoutType);
    }

    public final void setVisible(boolean visible) {
        getNavBarLayout().setVisibility(visible ? 0 : 8);
        t1.f(this.N, getLastExpandRatio$ui_kit_components_release(), getLastOffset(), getAlpha(), n0());
    }

    public final ihm.f t0() {
        return getNavBarWithToolbar_actionsView().f58297b.f121375b;
    }

    public final efm.r u0() {
        efm.r rVarMerge = efm.r.merge(getSearchButton().o, this.f59409p.f57339p);
        Intrinsics.checkNotNullExpressionValue(rVarMerge, "merge(...)");
        return rVarMerge;
    }

    public final efm.r v0() {
        return getSearchButton().f59002m;
    }

    public final efm.r w0() {
        efm.r rVarMerge = efm.r.merge(getSearchButton().f59003n, this.f59409p.f57338n);
        Intrinsics.checkNotNullExpressionValue(rVarMerge, "merge(...)");
        return rVarMerge;
    }

    public final efm.r x0() {
        return getHeaderLayout().f57249n;
    }

    public final efm.r y0() {
        return getHeaderLayout().o;
    }

    public final efm.r z0() {
        return getSearchButton().f59004p;
    }

    public void setDescriptionClickable(@NotNull c0 clickableMode) {
        Intrinsics.checkNotNullParameter(clickableMode, "clickableMode");
        getHeaderLayout().setDescriptionClickable(clickableMode);
    }

    @Override // au0.f0
    public void setDescriptionImage(tx0.i0 image, ProgressStyle progress, boolean imageBadgeVisible) {
        getHeaderLayout().setDescriptionImage(image, progress, imageBadgeVisible);
    }

    @Override // au0.g2
    public void setMenuItems(@NotNull List<? extends NavBarMenuItem> menuItems) {
        Intrinsics.checkNotNullParameter(menuItems, "menuItems");
        this.o.setMenuItems(menuItems);
    }

    public void setSearchInput(@NotNull String input) {
        Intrinsics.checkNotNullParameter(input, "input");
        this.f59409p.setSearchInput(input);
    }

    @Override // au0.k4
    @yhm.d
    public /* bridge */ void setHint(@NotNull String str) {
        super.setHint(str);
    }

    public void setTitle(au0.d0 compositeTitle) {
        o0();
        this.v = compositeTitle != null;
        getHeaderLayout().setVisibility(0);
        getHeaderLayout().setTitle(compositeTitle);
        getHeaderLayout().setTag(R$id.internal_nav_bar_title_clause, compositeTitle != null ? new CompositeClause(zhm.v.k(compositeTitle.f9162a, compositeTitle.f9163b), compositeTitle.f9164c, null, null, 12) : null);
    }

    @yhm.d
    public final void setEndImage(yy0.l imageUiElement) {
        this.navBarEndValueImpl.d(false);
        zi0.c.h(getEndImage(), imageUiElement, !Intrinsics.f(imageUiElement, this.f59413s), new i3(this, 0), false);
        this.f59413s = imageUiElement;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public NavBarWithToolbar(@NotNull Context context) {
        this(context, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }
}
