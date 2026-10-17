package com.revolut.core.ui_kit.views.navbar;

import android.R;
import android.animation.Animator;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.graphics.RectF;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.ConstraintSet;
import androidx.constraintlayout.widget.Group;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.graphics.Insets;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.RecyclerView;
import au0.a1;
import au0.b1;
import au0.c1;
import au0.d5;
import au0.e5;
import au0.f1;
import au0.f2;
import au0.g2;
import au0.j4;
import au0.k4;
import au0.m0;
import au0.p0;
import au0.p2;
import au0.q0;
import au0.r0;
import au0.s0;
import au0.u0;
import au0.u1;
import au0.v0;
import au0.w1;
import au0.x0;
import au0.x1;
import au0.z0;
import au0.z4;
import aw0.e4;
import aw0.i3;
import aw0.k9;
import aw0.v1;
import aw0.x8;
import aw0.y9;
import com.facebook.shimmer.ShimmerConstraintLayout;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.core.ui_kit.R$dimen;
import com.revolut.core.ui_kit.R$id;
import com.revolut.core.ui_kit.R$layout;
import com.revolut.core.ui_kit.R$string;
import com.revolut.core.ui_kit.internal.views.navbar.HeaderWithBigTileLayout;
import com.revolut.core.ui_kit.internal.views.navbar.SearchView;
import com.revolut.core.ui_kit.internal.views.tag.TagView;
import com.revolut.core.ui_kit.internal.views.tag.TagViewData;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.ImageClause;
import com.revolut.core.ui_kit.models.avatar.AvatarModel;
import com.revolut.core.ui_kit.views.ActionsView;
import com.revolut.core.ui_kit.views.navbar.NavBarWithBigTile;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import ix0.h2;
import ix0.n1;
import ix0.o1;
import ix0.r1;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import ms0.s4;
import org.jetbrains.annotations.NotNull;
import tx0.e2;
import tx0.m2;
import tx0.q2;
import tx0.r2;
import tx0.s2;
import zhm.d0;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000¼\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 ²\u00012\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u00062\u00020\u0007:\u0004_p³\u0001B\u001d\b\u0007\u0012\u0006\u0010\t\u001a\u00020\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0019\u0010\u0015\u001a\u00020\u00102\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0017¢\u0006\u0004\b\u0015\u0010\u0016J'\u0010\u001b\u001a\u00020\u00102\u0006\u0010\u0017\u001a\u00020\u00132\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u0013H\u0017¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u0015\u001a\u00020\u00102\u0006\u0010\u001e\u001a\u00020\u001dH\u0016¢\u0006\u0004\b\u0015\u0010\u001fJ\u0019\u0010\"\u001a\u00020\u00102\b\u0010!\u001a\u0004\u0018\u00010 H\u0016¢\u0006\u0004\b\"\u0010#J\u0017\u0010&\u001a\u00020\u00102\u0006\u0010%\u001a\u00020$H\u0016¢\u0006\u0004\b&\u0010'J\u0019\u0010(\u001a\u00020\u00102\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0016¢\u0006\u0004\b(\u0010\u0016J\u0019\u0010(\u001a\u00020\u00102\b\u0010*\u001a\u0004\u0018\u00010)H\u0016¢\u0006\u0004\b(\u0010+J\u0017\u0010.\u001a\u00020\u00102\u0006\u0010-\u001a\u00020,H\u0016¢\u0006\u0004\b.\u0010/J\u0017\u00102\u001a\u00020\u00102\u0006\u00101\u001a\u000200H\u0016¢\u0006\u0004\b2\u00103J!\u00107\u001a\u00020\u00102\b\u00105\u001a\u0004\u0018\u0001042\u0006\u0010%\u001a\u000206H\u0016¢\u0006\u0004\b7\u00108J!\u0010;\u001a\u00020\u00102\b\u0010:\u001a\u0004\u0018\u0001092\u0006\u0010%\u001a\u000206H\u0016¢\u0006\u0004\b;\u0010<J\u001f\u0010?\u001a\u00020\u00102\u0006\u0010>\u001a\u00020=2\u0006\u0010%\u001a\u000206H\u0016¢\u0006\u0004\b?\u0010@J%\u0010D\u001a\u00020\u00102\f\u0010B\u001a\b\u0012\u0004\u0012\u0002040A2\u0006\u0010C\u001a\u000200H\u0016¢\u0006\u0004\bD\u0010EJ\u0017\u0010G\u001a\u00020\u00102\u0006\u0010F\u001a\u000200H\u0016¢\u0006\u0004\bG\u00103J\u0019\u0010J\u001a\u00020\u00102\b\u0010I\u001a\u0004\u0018\u00010HH\u0016¢\u0006\u0004\bJ\u0010KJ\u0019\u0010M\u001a\u00020\u00102\b\u0010I\u001a\u0004\u0018\u00010LH\u0016¢\u0006\u0004\bM\u0010NJ-\u0010U\u001a\u00020\u00102\f\u0010P\u001a\b\u0012\u0004\u0012\u00020O0A2\u0006\u0010R\u001a\u00020Q2\u0006\u0010T\u001a\u00020SH\u0016¢\u0006\u0004\bU\u0010VJ\u0019\u0010Y\u001a\u00020\u00102\b\u0010X\u001a\u0004\u0018\u00010WH\u0016¢\u0006\u0004\bY\u0010ZJ\u0019\u0010]\u001a\u00020\u00102\b\u0010\\\u001a\u0004\u0018\u00010[H\u0016¢\u0006\u0004\b]\u0010^J\u0017\u0010a\u001a\u00020\u00102\u0006\u0010`\u001a\u00020_H\u0016¢\u0006\u0004\ba\u0010bJ%\u0010g\u001a\u00020\u00102\f\u0010d\u001a\b\u0012\u0004\u0012\u00020c0A2\u0006\u0010f\u001a\u00020eH\u0016¢\u0006\u0004\bg\u0010hJ\u001d\u0010g\u001a\u00020\u00102\f\u0010d\u001a\b\u0012\u0004\u0012\u00020c0AH\u0016¢\u0006\u0004\bg\u0010iJ\u0017\u0010k\u001a\u00020\u00102\b\u0010j\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\bk\u0010\u0016J\u001d\u0010n\u001a\u00020\u00102\u0006\u0010l\u001a\u00020\u00132\u0006\u0010m\u001a\u00020\u0013¢\u0006\u0004\bn\u0010oJ\u0017\u0010q\u001a\u00020\u00102\b\u0010:\u001a\u0004\u0018\u00010p¢\u0006\u0004\bq\u0010rJ\u0015\u0010s\u001a\u00020\u00102\u0006\u00101\u001a\u000200¢\u0006\u0004\bs\u00103J\u001b\u0010v\u001a\u00020\u00102\n\b\u0001\u0010u\u001a\u0004\u0018\u00010tH\u0007¢\u0006\u0004\bv\u0010wJ\u0017\u0010v\u001a\u00020\u00102\b\u00105\u001a\u0004\u0018\u000104¢\u0006\u0004\bv\u0010xJ\u001d\u0010{\u001a\u00020\u00102\f\u0010z\u001a\b\u0012\u0004\u0012\u00020y0AH\u0016¢\u0006\u0004\b{\u0010iJ#\u0010~\u001a\u00020\u00102\b\b\u0001\u0010|\u001a\u00020t2\b\b\u0001\u0010}\u001a\u00020tH\u0016¢\u0006\u0004\b~\u0010\u007fJ\u001b\u0010\u0081\u0001\u001a\u00020\u00102\u0007\u0010\u0080\u0001\u001a\u00020tH\u0016¢\u0006\u0006\b\u0081\u0001\u0010\u0082\u0001J\u001a\u0010\u0084\u0001\u001a\u00020\u00102\u0007\u0010\u0083\u0001\u001a\u000200H\u0016¢\u0006\u0005\b\u0084\u0001\u00103J!\u0010\u0085\u0001\u001a\u00020\u00102\u0006\u0010|\u001a\u00020t2\u0006\u0010}\u001a\u00020tH\u0016¢\u0006\u0005\b\u0085\u0001\u0010\u007fJ\u0012\u0010\u0086\u0001\u001a\u00020tH\u0016¢\u0006\u0006\b\u0086\u0001\u0010\u0087\u0001J\u001c\u0010\u008a\u0001\u001a\u00020\u00102\b\u0010\u0089\u0001\u001a\u00030\u0088\u0001H\u0016¢\u0006\u0006\b\u008a\u0001\u0010\u008b\u0001J\u001a\u0010\u008a\u0001\u001a\u00020\u00102\u0007\u0010\u0089\u0001\u001a\u00020\u0013H\u0016¢\u0006\u0005\b\u008a\u0001\u0010\u0016J\u001a\u0010\u008c\u0001\u001a\u00020\u00102\u0007\u0010\u0089\u0001\u001a\u00020\u0013H\u0016¢\u0006\u0005\b\u008c\u0001\u0010\u0016J!\u0010\u008f\u0001\u001a\u00020\u00102\u000e\u0010\u008e\u0001\u001a\t\u0012\u0005\u0012\u00030\u008d\u00010AH\u0016¢\u0006\u0005\b\u008f\u0001\u0010iJ \u0010\u0091\u0001\u001a\u00020\u00102\r\u0010\u0090\u0001\u001a\b\u0012\u0004\u0012\u00020\u00130AH\u0016¢\u0006\u0005\b\u0091\u0001\u0010iJ\u001b\u0010\u0092\u0001\u001a\u00020\u00102\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0016¢\u0006\u0005\b\u0092\u0001\u0010\u0016J\u001c\u0010\u0095\u0001\u001a\u00020\u00102\b\u0010\u0094\u0001\u001a\u00030\u0093\u0001H\u0016¢\u0006\u0006\b\u0095\u0001\u0010\u0096\u0001J\u001c\u0010\u0099\u0001\u001a\u00020\u00102\b\u0010\u0098\u0001\u001a\u00030\u0097\u0001H\u0016¢\u0006\u0006\b\u0099\u0001\u0010\u009a\u0001J\u0019\u0010\u009b\u0001\u001a\u00020\u00102\u0006\u00101\u001a\u000200H\u0016¢\u0006\u0005\b\u009b\u0001\u00103J\u001b\u0010\u009d\u0001\u001a\u00020\u00102\u0007\u0010\u009c\u0001\u001a\u00020tH\u0016¢\u0006\u0006\b\u009d\u0001\u0010\u0082\u0001J\u001a\u0010\u009f\u0001\u001a\u00020\u00102\u0007\u0010\u009e\u0001\u001a\u000200H\u0016¢\u0006\u0005\b\u009f\u0001\u00103J\u001a\u0010¢\u0001\u001a\u00020\u00102\b\u0010¡\u0001\u001a\u00030 \u0001¢\u0006\u0006\b¢\u0001\u0010£\u0001J\u0018\u0010¥\u0001\u001a\u00020\u00102\u0007\u0010¤\u0001\u001a\u000200¢\u0006\u0005\b¥\u0001\u00103J\u0019\u0010¦\u0001\u001a\u00020\u00102\u0006\u00101\u001a\u000200H\u0002¢\u0006\u0005\b¦\u0001\u00103J\u0012\u0010§\u0001\u001a\u00020tH\u0002¢\u0006\u0006\b§\u0001\u0010\u0087\u0001J\u0012\u0010¨\u0001\u001a\u00020tH\u0002¢\u0006\u0006\b¨\u0001\u0010\u0087\u0001J\u001c\u0010«\u0001\u001a\u00020\u00102\b\u0010ª\u0001\u001a\u00030©\u0001H\u0002¢\u0006\u0006\b«\u0001\u0010¬\u0001J\u001a\u0010\u00ad\u0001\u001a\u00020\u00102\u0007\u0010\u0083\u0001\u001a\u000200H\u0002¢\u0006\u0005\b\u00ad\u0001\u00103R\u0018\u0010±\u0001\u001a\u00030®\u00018BX\u0082\u0004¢\u0006\b\u001a\u0006\b¯\u0001\u0010°\u0001¨\u0006´\u0001"}, d2 = {"Lcom/revolut/core/ui_kit/views/navbar/NavBarWithBigTile;", "Lau0/o;", "Lau0/c1;", "Lau0/g2;", "Lau0/k4;", "Lur0/a;", "Lau0/f1;", "Ltx0/e2;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "Lau0/s0;", "layoutType", "", "setLayoutType", "(Lau0/s0;)V", "Lcom/revolut/core/ui_kit/models/Clause;", "clause", "setTitle", "(Lcom/revolut/core/ui_kit/models/Clause;)V", "firstText", "Lcom/revolut/core/ui_kit/models/ImageClause;", "icon", "secondText", "setCompoundTitle", "(Lcom/revolut/core/ui_kit/models/Clause;Lcom/revolut/core/ui_kit/models/ImageClause;Lcom/revolut/core/ui_kit/models/Clause;)V", "Lau0/a1;", "title", "(Lau0/a1;)V", "Law0/i3;", "customFont", "setCustomFont", "(Law0/i3;)V", "Lau0/b1;", "style", "setTitleStyle", "(Lau0/b1;)V", "setDescription", "Lau0/p0;", "description", "(Lau0/p0;)V", "Lau0/m0;", "decoration", "setBackgroundOverlayDecoration", "(Lau0/m0;)V", "", "enabled", "setThemeBasedColorSchemeEnabled", "(Z)V", "Lcom/revolut/core/ui_kit_core/displayers/image/Image;", "image", "Lau0/r0;", "setIcon", "(Lcom/revolut/core/ui_kit_core/displayers/image/Image;Lau0/r0;)V", "Lcom/revolut/core/ui_kit/models/avatar/AvatarModel;", "model", "setAvatar", "(Lcom/revolut/core/ui_kit/models/avatar/AvatarModel;Lau0/r0;)V", "Lau0/q0;", "avatar", "setDuoAvatar", "(Lau0/q0;Lau0/r0;)V", "", "avatars", "showOverflowCounter", "setAvatarGroup", "(Ljava/util/List;Z)V", "isClickable", "setIconClickable", "Law0/k;", "content", "setActionStatusLabel", "(Law0/k;)V", "Lms0/s4;", "setSocialProofLabel", "(Lms0/s4;)V", "Lau0/u0;", "pages", "Lau0/f2;", "previewMode", "Lau0/v0;", "pageAutoScroll", "setPages", "(Ljava/util/List;Lau0/f2;Lau0/v0;)V", "", "stars", "setRatingStars", "(Ljava/lang/Double;)V", "Lcom/revolut/core/ui_kit/internal/views/tag/TagViewData;", "tagViewData", "setTagViewData", "(Lcom/revolut/core/ui_kit/internal/views/tag/TagViewData;)V", "Ltx0/q2;", "heightMode", "setHeightMode", "(Ltx0/q2;)V", "Lcom/revolut/core/ui_kit/views/navbar/NavBarMenuItem;", "menuItems", "Lyy0/f;", "imageDisplayer", "setMenuItems", "(Ljava/util/List;Lyy0/f;)V", "(Ljava/util/List;)V", "text", "setToolbarTitle", "titleClause", "subtitleClause", "setToolbarTitleWithSubtitle", "(Lcom/revolut/core/ui_kit/models/Clause;Lcom/revolut/core/ui_kit/models/Clause;)V", "Ltx0/r2;", "setToolbarTagView", "(Ltx0/r2;)V", "setAlwaysShowToolbar", "", "iconRes", "setNavigationButtonIcon", "(Ljava/lang/Integer;)V", "(Lcom/revolut/core/ui_kit_core/displayers/image/Image;)V", "Lcom/revolut/core/ui_kit/views/ActionsView$Item;", "actions", "setActions", "baseColor", "progressColor", "setLinePageIndicatorColors", "(II)V", "percentage", "setLineProgressIndicatorPercentage", "(I)V", "visible", "setLineProgressIndicatorVisible", "setLineProgressIndicatorColors", "getOverlapMode", "()I", "", "input", "setSearchInput", "(Ljava/lang/String;)V", "setSearchInputSilently", "Landroid/text/InputFilter;", "filters", "setSearchInputFilters", "hints", "setHints", "setSearchContentDescription", "Law0/k9;", "buttons", "setSearchFieldActionButtons", "(Law0/k9;)V", "Law0/e4;", "state", "setFiltersState", "(Law0/e4;)V", "setSortingEnabled", "index", "setSearchInputSelection", "active", "setSearchButtonActive", "Llw0/n;", "mode", "setSearchButtonMode", "(Llw0/n;)V", "loading", "setLoadingState", "setReflectiveSurface", "getLegacyCollapsedHeight", "getReflectiveSurfaceCollapsedHeight", "", "alpha", "setToolbarContentAlpha", "(F)V", "setToolbarContentVisible", "Lau0/x1;", "getToolbarLayout", "()Lau0/x1;", "toolbarLayout", "Companion", "a", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class NavBarWithBigTile extends au0.o implements c1, g2, k4, ur0.a, f1, e2 {

    @NotNull
    private static final a Companion = new a();
    public static final /* synthetic */ int f0 = 0;
    public final TextView A;
    public final TextView B;
    public final SearchView C;
    public final TagView D;
    public n1 E;
    public y9 F;
    public y9 G;
    public q2 H;
    public s0 I;
    public final ifm.b J;
    public boolean K;
    public boolean L;
    public boolean M;
    public Animator N;
    public boolean O;
    public final boolean P;
    public Integer Q;
    public final e5 R;
    public RectF S;
    public MotionEvent T;
    public final ColorDrawable U;
    public u1 V;
    public h2 W;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public final h2 f59346a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public int f59347b0;
    public final int c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public final ArrayList f59348d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public final r10.v f59349e0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final boolean f59350l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f59351m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public Clause f59352n;
    public Clause o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public z4 f59353p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f59354q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f59355r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f59356s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final ihm.f f59357t;
    public final ihm.f u;
    public final ConstraintLayout v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final NavBarNavigationButtonView f59358w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final RecyclerView f59359x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final HeaderWithBigTileLayout f59360y;
    public final TextView z;

    public static final class a {
        private a() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
    public NavBarWithBigTile(@NotNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        boolean zBooleanValue = ((Boolean) jo0.g.D.getValue()).booleanValue();
        this.f59350l = zBooleanValue;
        this.f59353p = new z4(this);
        this.f59354q = kli.a.s(R$attr.uikit_colorForeground, context);
        this.f59355r = kli.a.s(R$attr.uikit_colorWhite, context);
        this.f59357t = v0.a.d("create(...)");
        this.u = v0.a.d("create(...)");
        this.F = y9.THEME;
        this.J = new ifm.b();
        this.K = true;
        this.P = ((Boolean) jo0.g.H.getValue()).booleanValue();
        this.S = new RectF();
        ColorDrawable colorDrawable = new ColorDrawable(kli.a.s(R$attr.uikit_colorBackground, context));
        this.U = colorDrawable;
        this.c0 = kli.a.s(R$attr.uikit_colorGreyTone8, context);
        this.f59348d0 = new ArrayList();
        setStateListAnimator(null);
        setBackground(null);
        setFitsSystemWindows(true);
        View.inflate(context, R$layout.internal_view_nav_bar_with_big_tile, this);
        View viewFindViewById = findViewById(R$id.navBarWithBigTile_navBarLayout);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        this.v = (ConstraintLayout) viewFindViewById;
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        x1 x1Var = new x1(context2, null, 6, 0);
        x1Var.setId(R$id.navBarWithBigTile_toolbarLayout);
        this.f59349e0 = new r10.v(this, x1Var, new su0.c(1, this, NavBarWithBigTile.class, "onHeaderViewAddedToParent", "onHeaderViewAddedToParent(Lcom/revolut/core/ui_kit/internal/views/navbar/HeaderWithBigTileToolbarLayout;)V", 0, 28));
        setReflectiveSurface(zBooleanValue);
        TextView toolbarTitle = getToolbarLayout().getToolbarTitle();
        this.z = toolbarTitle;
        TextView toolbarTitleChained = getToolbarLayout().getToolbarTitleChained();
        this.A = toolbarTitleChained;
        TextView toolbarSubtitleChained = getToolbarLayout().getToolbarSubtitleChained();
        this.B = toolbarSubtitleChained;
        this.R = new e5(context, zhm.v.k(toolbarTitle, toolbarTitleChained, toolbarSubtitleChained));
        NavBarNavigationButtonView navigationButton = getToolbarLayout().getNavigationButton();
        this.f59358w = navigationButton;
        this.C = getToolbarLayout().getSearchView();
        this.f59359x = getToolbarLayout().getMenuRecyclerView();
        View viewFindViewById2 = findViewById(R$id.navBarWithBigTile_headerLayout);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        HeaderWithBigTileLayout headerWithBigTileLayout = (HeaderWithBigTileLayout) viewFindViewById2;
        this.f59360y = headerWithBigTileLayout;
        this.D = getToolbarLayout().getTagView();
        fp0.p clickHandler = navigationButton.getClickHandler();
        fp0.p.b(clickHandler, true);
        View view = clickHandler.f137029a;
        or0.m.a(view);
        view.setOnClickListener(new p2(this, 14));
        this.f59346a0 = new h2(headerWithBigTileLayout);
        headerWithBigTileLayout.setColorSchemeListener$ui_kit_components_release(this);
        headerWithBigTileLayout.setForeground(colorDrawable);
        getToolbarLayout().setClickable(true);
    }

    public static Unit A(NavBarWithBigTile navBarWithBigTile) {
        navBarWithBigTile.setToolbarContentVisible(true);
        return Unit.f186387a;
    }

    public static Unit B(NavBarWithBigTile navBarWithBigTile, boolean z) {
        SearchView searchView = navBarWithBigTile.C;
        NavBarNavigationButtonView navBarNavigationButtonView = navBarWithBigTile.f59358w;
        RecyclerView recyclerView = navBarWithBigTile.f59359x;
        int i = 0;
        if (z) {
            navBarWithBigTile.setToolbarContentAlpha(BitmapDescriptorFactory.HUE_RED);
            navBarNavigationButtonView.setTranslationX(-navBarNavigationButtonView.getWidth());
            int childCount = recyclerView.getChildCount();
            while (i < childCount) {
                View childAt = recyclerView.getChildAt(i);
                RectF rectF = navBarWithBigTile.S;
                if ((rectF.width() / 2) + rectF.left + searchView.getLeft() < recyclerView.getLeft() + childAt.getLeft()) {
                    childAt.setTranslationX(recyclerView.getWidth() - childAt.getLeft());
                }
                i++;
            }
        } else {
            navBarWithBigTile.setToolbarContentAlpha(1.0f);
            navBarNavigationButtonView.setTranslationX(BitmapDescriptorFactory.HUE_RED);
            int childCount2 = recyclerView.getChildCount();
            while (i < childCount2) {
                View childAt2 = recyclerView.getChildAt(i);
                RectF rectF2 = navBarWithBigTile.S;
                if ((rectF2.width() / 2) + rectF2.left + searchView.getLeft() < recyclerView.getLeft() + childAt2.getLeft()) {
                    childAt2.setTranslationX(BitmapDescriptorFactory.HUE_RED);
                }
                i++;
            }
        }
        navBarWithBigTile.setToolbarContentVisible(!z);
        return Unit.f186387a;
    }

    public static Unit C(NavBarWithBigTile navBarWithBigTile, boolean z) {
        navBarWithBigTile.setToolbarContentAlpha(!z ? 1.0f : BitmapDescriptorFactory.HUE_RED);
        navBarWithBigTile.setToolbarContentVisible(!z);
        return Unit.f186387a;
    }

    public static Unit D(NavBarWithBigTile navBarWithBigTile, float f) {
        navBarWithBigTile.setToolbarContentAlpha(1 - f);
        return Unit.f186387a;
    }

    private final int getLegacyCollapsedHeight() {
        return getResources().getDimensionPixelSize(R$dimen.internal_nav_bar_height) + this.f59356s;
    }

    private final int getReflectiveSurfaceCollapsedHeight() {
        int legacyCollapsedHeight = getLegacyCollapsedHeight();
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        return kli.a.k(context, 32.0f) + legacyCollapsedHeight;
    }

    private final x1 getToolbarLayout() {
        r10.v vVar = this.f59349e0;
        vVar.c();
        return (x1) ((ViewGroup) vVar.f250864c);
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
    private final void setReflectiveSurface(boolean enabled) {
        if (this.f59351m != enabled || getToolbarLayout().getLayoutParams() == null) {
            setReflectiveSurfaceCollapsedHeight$ui_kit_components_release(enabled ? Integer.valueOf(getReflectiveSurfaceCollapsedHeight()) : null);
            int legacyCollapsedHeight = enabled ? 0 : getLegacyCollapsedHeight();
            ConstraintLayout constraintLayout = this.v;
            constraintLayout.setMinimumHeight(legacyCollapsedHeight);
            if (enabled) {
                x1 toolbarLayout = getToolbarLayout();
                ViewParent parent = toolbarLayout.getParent();
                ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
                if (viewGroup != null) {
                    viewGroup.removeView(toolbarLayout);
                }
                toolbarLayout.setLayoutParams(new CoordinatorLayout.LayoutParams(-1, -2));
                this.f59349e0.c();
                this.f59351m = true;
                getToolbarLayout().setReflectiveSurfaceEnabled(true);
            } else {
                getToolbarLayout().setReflectiveSurfaceEnabled(false);
                View toolbarLayout2 = getToolbarLayout();
                ViewParent parent2 = toolbarLayout2.getParent();
                ViewGroup viewGroup2 = parent2 instanceof ViewGroup ? (ViewGroup) parent2 : null;
                if (viewGroup2 != null) {
                    viewGroup2.removeView(toolbarLayout2);
                }
                ConstraintLayout.LayoutParams layoutParams = new ConstraintLayout.LayoutParams(0, getResources().getDimensionPixelSize(R$dimen.internal_nav_bar_height));
                layoutParams.startToStart = 0;
                layoutParams.endToEnd = 0;
                layoutParams.topToTop = 0;
                toolbarLayout2.setLayoutParams(layoutParams);
                constraintLayout.addView(toolbarLayout2);
                this.f59351m = false;
                this.k.h();
            }
            this.f59353p = enabled ? null : new z4(this);
            H(this.f59356s);
            this.Q = null;
            requestLayout();
        }
    }

    private final void setToolbarContentAlpha(float alpha) {
        this.f59358w.setAlpha(alpha);
        this.f59359x.setAlpha(alpha);
        this.z.setAlpha(alpha);
        this.A.setAlpha(alpha);
        this.B.setAlpha(alpha);
    }

    private final void setToolbarContentVisible(boolean visible) {
        this.f59358w.setVisibility(!visible ? 4 : 0);
        this.f59359x.setVisibility(!visible ? 4 : 0);
        this.z.setVisibility(!visible ? 4 : 0);
        this.A.setVisibility(!visible ? 4 : 0);
        this.B.setVisibility(visible ? 0 : 4);
    }

    public static Unit x(NavBarWithBigTile navBarWithBigTile) {
        navBarWithBigTile.setToolbarContentVisible(true);
        return Unit.f186387a;
    }

    public static Unit y(NavBarWithBigTile navBarWithBigTile, float f) {
        navBarWithBigTile.setToolbarContentAlpha(1 - f);
        navBarWithBigTile.f59358w.setTranslationX((-r0.getWidth()) * f);
        RecyclerView recyclerView = navBarWithBigTile.f59359x;
        int childCount = recyclerView.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = recyclerView.getChildAt(i);
            RectF rectF = navBarWithBigTile.S;
            if ((rectF.width() / 2) + rectF.left + navBarWithBigTile.C.getLeft() < recyclerView.getLeft() + childAt.getLeft()) {
                childAt.setTranslationX((recyclerView.getWidth() - childAt.getLeft()) * f);
            }
        }
        return Unit.f186387a;
    }

    public final void F(boolean z, j4 j4Var) {
        Animator animatorL;
        if (this.L == z) {
            return;
        }
        this.L = z;
        Animator animator = this.N;
        if (animator != null) {
            animator.cancel();
        }
        e5 e5Var = this.R;
        ValueAnimator valueAnimator = e5Var.d;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        e5Var.e = d5.UNKNOWN;
        boolean z3 = this.M;
        SearchView searchView = this.C;
        if (z3) {
            L();
            if (!z) {
                searchView.j();
                e0m.e.a(searchView.getFocusedChild());
            }
        }
        if (j4Var == j4.NO_ANIMATION) {
            if (z) {
                searchView.setVisibility(0);
                searchView.setAlpha(1.0f);
                setToolbarContentVisible(false);
                return;
            } else {
                searchView.setVisibility(4);
                searchView.setAlpha(BitmapDescriptorFactory.HUE_RED);
                setToolbarContentVisible(true);
                return;
            }
        }
        MotionEvent motionEvent = this.T;
        if (!z) {
            this.T = null;
        }
        if (j4Var == j4.FADE || motionEvent == null) {
            final int i = 0;
            animatorL = searchView.l(z, new Function0(this) { // from class: tx0.n2

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ NavBarWithBigTile f275209b;

                {
                    this.f275209b = this;
                }

                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    switch (i) {
                        case 0:
                            return NavBarWithBigTile.x(this.f275209b);
                        default:
                            return NavBarWithBigTile.A(this.f275209b);
                    }
                }
            }, new m2(this, 3), new m2(this, 4));
        } else {
            if (z) {
                this.S = searchView.g(motionEvent);
            }
            final int i2 = 1;
            animatorL = this.C.k(z, this.S, new Function0(this) { // from class: tx0.n2

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ NavBarWithBigTile f275209b;

                {
                    this.f275209b = this;
                }

                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    switch (i2) {
                        case 0:
                            return NavBarWithBigTile.x(this.f275209b);
                        default:
                            return NavBarWithBigTile.A(this.f275209b);
                    }
                }
            }, new m2(this, 5), new m2(this, 0));
        }
        animatorL.setDuration(400L);
        animatorL.start();
        this.N = animatorL;
    }

    public final void H(int i) {
        if (this.f59351m) {
            or0.u.y(getToolbarLayout(), 0, 0, 0, 0, 13);
            x1 toolbarLayout = getToolbarLayout();
            toolbarLayout.setPadding(toolbarLayout.getPaddingLeft(), i, toolbarLayout.getPaddingRight(), toolbarLayout.getPaddingBottom());
        } else {
            x1 toolbarLayout2 = getToolbarLayout();
            toolbarLayout2.setPadding(toolbarLayout2.getPaddingLeft(), 0, toolbarLayout2.getPaddingRight(), toolbarLayout2.getPaddingBottom());
            or0.u.y(getToolbarLayout(), 0, i, 0, 0, 13);
        }
    }

    public final void I(v1 colorScheme, int i, int i2, int i3) {
        Intrinsics.checkNotNullParameter(colorScheme, "colorScheme");
        foh.i.e(this, colorScheme, i, i2, i3);
        ArrayList arrayList = this.f59348d0;
        int size = arrayList.size();
        for (int i5 = 0; i5 < size; i5++) {
            View view = (View) ((WeakReference) arrayList.get(i5)).get();
            if (view != null) {
                foh.i.e(view, colorScheme, i, i2, i3);
            }
        }
    }

    public final efm.r K() {
        return this.f59360y.f57264a0.f58296a.f121375b;
    }

    public final void L() {
        if (this.M) {
            if (this.L) {
                setAlwaysExpandedFlagEnabled$ui_kit_components_release(false);
                setScrollEnabled$ui_kit_components_release(false);
                setExpanded(false);
            } else {
                setAlwaysExpandedFlagEnabled$ui_kit_components_release(true);
            }
            this.u.onNext(Boolean.valueOf(this.L));
        }
    }

    @Override // au0.g2
    public final efm.r b() {
        return getToolbarLayout().f9429r.f57403b;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (!this.L && ((motionEvent != null && motionEvent.getAction() == 1) || (motionEvent != null && motionEvent.getAction() == 3))) {
            this.T = motionEvent;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // tx0.e2
    public int getOverlapMode() {
        return this.f59351m ? 1 : 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x009f  */
    @Override // au0.o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void k(float r11, int r12) {
        /*
            Method dump skipped, instruction units count: 369
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.core.ui_kit.views.navbar.NavBarWithBigTile.k(float, int):void");
    }

    @Override // com.google.android.material.appbar.AppBarLayoutProxy
    public final WindowInsetsCompat onApplyWindowInsets(WindowInsetsCompat insets) {
        Intrinsics.checkNotNullParameter(insets, "insets");
        int iSystemBars = WindowInsetsCompat.Type.systemBars();
        Insets insets2 = insets.getInsets(iSystemBars);
        Intrinsics.checkNotNullExpressionValue(insets2, "getInsets(...)");
        int i = insets2.top;
        if (!getFitsSystemWindows()) {
            i = 0;
        }
        if (i != this.f59356s) {
            this.f59356s = i;
            if (this.f59351m) {
                setReflectiveSurfaceCollapsedHeight$ui_kit_components_release(Integer.valueOf(getReflectiveSurfaceCollapsedHeight()));
            }
            this.f59360y.setTopInset$ui_kit_components_release(i);
            u1 u1Var = this.V;
            if (u1Var != null) {
                u1Var.setTopInset(i);
            }
            H(i);
        }
        Insets insetsOf = Insets.of(insets.getSystemWindowInsetLeft(), 0, insets.getSystemWindowInsetRight(), insets.getSystemWindowInsetBottom());
        Intrinsics.checkNotNullExpressionValue(insetsOf, "of(...)");
        WindowInsetsCompat windowInsetsCompatBuild = new WindowInsetsCompat.Builder(insets).setSystemWindowInsets(insetsOf).setInsets(iSystemBars, Insets.of(insets2.left, 0, insets2.right, insets2.bottom)).build();
        Intrinsics.checkNotNullExpressionValue(windowInsetsCompatBuild, "build(...)");
        return (this.f59351m && getFitsSystemWindows()) ? windowInsetsCompatBuild : insets;
    }

    @Override // com.google.android.material.appbar.AppBarLayout, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        h30.q qVar;
        Window window;
        View decorView;
        super.onAttachedToWindow();
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        Intrinsics.checkNotNullParameter(context, "context");
        int i = R$id.internal_status_bar_controller_tag;
        y9 y9Var = y9.THEME;
        a5.a styleApplicator = new a5.a(19);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(styleApplicator, "styleApplicator");
        Activity activityI = z92.f.i(context);
        View viewFindViewById = (activityI == null || (window = activityI.getWindow()) == null || (decorView = window.getDecorView()) == null) ? null : decorView.findViewById(R.id.content);
        if (activityI == null || viewFindViewById == null) {
            qVar = null;
        } else {
            Object tag2 = viewFindViewById.getTag(i);
            r1 r1Var = tag2 instanceof r1 ? (r1) tag2 : null;
            if (r1Var == null) {
                r1Var = new r1();
                viewFindViewById.setTag(i, r1Var);
            }
            qVar = new h30.q(y9Var, styleApplicator, r1Var, context);
        }
        o1 priority = o1.OVERLAY;
        Intrinsics.checkNotNullParameter(priority, "priority");
        n1 n1Var = new n1(qVar, qVar != null ? Long.valueOf(qVar.K0(priority)) : null);
        this.E = n1Var;
        y9 y9Var2 = this.G;
        if (y9Var2 != null) {
            n1Var.a(y9Var2);
        }
    }

    @Override // au0.o, com.google.android.material.appbar.AppBarLayout, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        ValueAnimator valueAnimator = this.R.d;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        n1 n1Var = this.E;
        if (n1Var != null) {
            n1Var.b();
            this.E = null;
        }
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        this.f59349e0.c();
    }

    @Override // au0.o, com.google.android.material.appbar.AppBarLayoutProxy, com.google.android.material.appbar.AppBarLayout, android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i5) {
        super.onLayout(z, i, i2, i3, i5);
        this.Q = null;
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        Bundle bundle = parcelable instanceof Bundle ? (Bundle) parcelable : null;
        if (bundle == null) {
            return;
        }
        if (bundle.getBoolean("STATE_KEY_SEARCH_VISIBLE")) {
            j4 animation = j4.NO_ANIMATION;
            Intrinsics.checkNotNullParameter(animation, "animation");
            F(true, animation);
        } else {
            j4 animation2 = j4.NO_ANIMATION;
            Intrinsics.checkNotNullParameter(animation2, "animation");
            F(false, animation2);
        }
        super.onRestoreInstanceState(bundle.getParcelable("STATE_KEY_SUPER"));
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        Bundle bundle = new Bundle();
        bundle.putParcelable("STATE_KEY_SUPER", super.onSaveInstanceState());
        bundle.putBoolean("STATE_KEY_SEARCH_VISIBLE", this.L);
        return bundle;
    }

    @Override // ur0.a
    public final void r(v1 colorScheme, int i, int i2, int i3) {
        Intrinsics.checkNotNullParameter(colorScheme, "colorScheme");
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        this.f59355r = kli.a.s(colorScheme.a(), context);
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        this.f59354q = kli.a.s(R$attr.uikit_colorForeground, context2);
        this.U.setColor(i3);
        this.F = colorScheme.c();
        this.f59347b0 = i;
        k(this.f9292a, this.f9294c);
    }

    @Override // au0.o
    public final void s(SlidingFromTopViewContainer view) {
        f1 f1Var;
        Intrinsics.checkNotNullParameter(view, "view");
        int i = 0;
        if (this.f59351m) {
            setReflectiveSurface(false);
        }
        ArrayList arrayList = this.f59348d0;
        int size = arrayList.size();
        while (true) {
            if (i >= size) {
                i = -1;
                break;
            } else if (((WeakReference) arrayList.get(i)).get() == view) {
                break;
            } else {
                i++;
            }
        }
        if (i == -1) {
            arrayList.add(new WeakReference(view));
            HeaderWithBigTileLayout headerWithBigTileLayout = this.f59360y;
            x8 x8Var = headerWithBigTileLayout.q0;
            if (x8Var == null || (f1Var = headerWithBigTileLayout.f57280r0) == null) {
                return;
            }
            ((NavBarWithBigTile) f1Var).I(x8Var.f10609a, x8Var.f10610b, x8Var.f10611c, x8Var.e);
        }
    }

    public void setActionStatusLabel(aw0.k content) {
        this.f59360y.setActionStatusLabel(content);
    }

    public void setActions(@NotNull List<ActionsView.Item> actions) {
        Intrinsics.checkNotNullParameter(actions, "actions");
        this.f59360y.setActions(actions);
    }

    public final void setAlwaysShowToolbar(boolean enabled) {
        if (this.O == enabled) {
            return;
        }
        this.O = enabled;
        k(this.f9292a, this.f9294c);
    }

    @Override // au0.c1
    public void setAvatar(AvatarModel model, @NotNull r0 style) {
        Intrinsics.checkNotNullParameter(style, "style");
        this.f59360y.setAvatar(model, style);
    }

    @Override // au0.c1
    public void setAvatarGroup(@NotNull List<? extends Image> avatars, boolean showOverflowCounter) {
        Intrinsics.checkNotNullParameter(avatars, "avatars");
        this.f59360y.setAvatarGroup(avatars, showOverflowCounter);
    }

    @Override // au0.c1
    @yhm.d
    public /* bridge */ void setBackgroundImage(Image image) {
        super.setBackgroundImage(image);
    }

    @Override // au0.c1
    @yhm.d
    public /* bridge */ void setBackgroundImages(@NotNull List<? extends Image> list, @NotNull f2 f2Var, boolean z) {
        super.setBackgroundImages(list, f2Var, z);
    }

    public void setBackgroundOverlayDecoration(@NotNull m0 decoration) {
        Intrinsics.checkNotNullParameter(decoration, "decoration");
        this.f59360y.setBackgroundOverlayDecoration(decoration);
    }

    @yhm.d
    public void setCompoundTitle(@NotNull Clause firstText, @NotNull ImageClause icon, @NotNull Clause secondText) {
        Intrinsics.checkNotNullParameter(firstText, "firstText");
        Intrinsics.checkNotNullParameter(icon, "icon");
        Intrinsics.checkNotNullParameter(secondText, "secondText");
        setTitle(new x0(firstText, icon, secondText));
    }

    public void setCustomFont(i3 customFont) {
        this.f59360y.setCustomFont(customFont);
    }

    public void setDescription(Clause clause) {
        this.f59360y.setDescription(clause);
    }

    @Override // au0.c1
    public void setDuoAvatar(@NotNull q0 avatar, @NotNull r0 style) {
        Intrinsics.checkNotNullParameter(avatar, "avatar");
        Intrinsics.checkNotNullParameter(style, "style");
        this.f59360y.setDuoAvatar(avatar, style);
    }

    public void setFiltersState(@NotNull e4 state) {
        Intrinsics.checkNotNullParameter(state, "state");
        this.C.setFiltersState(state);
        if (this.M) {
            this.f59360y.setSearchButtonFilterState(state);
        }
    }

    public void setHeightMode(@NotNull q2 heightMode) {
        Intrinsics.checkNotNullParameter(heightMode, "heightMode");
        this.H = heightMode;
        this.f59360y.setHeightMode(heightMode);
        u1 u1Var = this.V;
        if (u1Var != null) {
            u1Var.setHeightMode(heightMode);
        }
    }

    @Override // au0.k4
    public void setHint(@NotNull Clause hint) {
        Intrinsics.checkNotNullParameter(hint, "hint");
        setHints(zhm.u.c(hint));
    }

    @Override // au0.k4
    public void setHints(@NotNull List<? extends Clause> hints) {
        Intrinsics.checkNotNullParameter(hints, "hints");
        this.C.setHints(hints);
        if (this.M) {
            this.f59360y.setSearchButtonText((Clause) d0.d0(hints));
        }
    }

    @Override // au0.c1
    public void setIcon(Image image, @NotNull r0 style) {
        Intrinsics.checkNotNullParameter(style, "style");
        this.f59360y.setIcon(image, style);
    }

    public void setIconClickable(boolean isClickable) {
        this.f59360y.setIconClickable(isClickable);
    }

    public void setLayoutType(@NotNull s0 layoutType) {
        Intrinsics.checkNotNullParameter(layoutType, "layoutType");
        this.I = layoutType;
        this.f59360y.setLayoutType(layoutType);
    }

    public void setLinePageIndicatorColors(int baseColor, int progressColor) {
        this.f59360y.setLinePageIndicatorColors(baseColor, progressColor);
    }

    public void setLineProgressIndicatorColors(int baseColor, int progressColor) {
        this.f59360y.setLineProgressIndicatorColors(baseColor, progressColor);
    }

    public void setLineProgressIndicatorPercentage(int percentage) {
        this.f59360y.setLineProgressIndicatorPercentage(percentage);
    }

    public void setLineProgressIndicatorVisible(boolean visible) {
        this.f59360y.setLineProgressIndicatorVisible(visible);
    }

    public final void setLoadingState(boolean loading) {
        h2 h2Var = this.f59346a0;
        if (!loading) {
            h2 h2Var2 = this.W;
            if (h2Var2 == null || !h2Var2.b()) {
                return;
            }
            h2Var2.a(false, false);
            h2Var.a(true, false);
            return;
        }
        h2 h2Var3 = this.W;
        if (h2Var3 == null || !h2Var3.b()) {
            u1 u1Var = this.V;
            if (u1Var == null) {
                Context context = getContext();
                Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                u1Var = new u1(context, null);
                u1Var.setLayoutParams(new ConstraintLayout.LayoutParams(-1, -2));
                u1Var.setTopInset(this.f59356s);
                q2 q2Var = this.H;
                if (q2Var != null) {
                    u1Var.setHeightMode(q2Var);
                }
                HeaderWithBigTileLayout headerWithBigTileLayout = this.f59360y;
                ConstraintLayout constraintLayout = this.v;
                constraintLayout.addView(u1Var, constraintLayout.indexOfChild(headerWithBigTileLayout));
                ConstraintSet constraintSet = new ConstraintSet();
                constraintSet.clone(constraintLayout);
                constraintSet.connect(u1Var.getId(), 3, 0, 3);
                constraintSet.applyTo(constraintLayout);
                this.V = u1Var;
                this.W = new h2(u1Var);
            }
            s0 s0Var = this.I;
            au0.v1 type = (s0Var != null ? s2.f275242a[s0Var.ordinal()] : -1) == 1 ? au0.v1.CENTERED_SMALL_BUTTONS : au0.v1.CENTERED;
            Group headerLoadingCenteredWithIconGroup = u1Var.f9382j;
            Group headerLoadingCenteredGroup = u1Var.i;
            Intrinsics.checkNotNullParameter(type, "type");
            int i = w1.f9413a[type.ordinal()];
            if (i == 1) {
                Intrinsics.checkNotNullExpressionValue(headerLoadingCenteredWithIconGroup, "headerLoadingCenteredWithIconGroup");
                headerLoadingCenteredWithIconGroup.setVisibility(8);
                Intrinsics.checkNotNullExpressionValue(headerLoadingCenteredGroup, "headerLoadingCenteredGroup");
                headerLoadingCenteredGroup.setVisibility(0);
            } else {
                if (i != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                Intrinsics.checkNotNullExpressionValue(headerLoadingCenteredGroup, "headerLoadingCenteredGroup");
                headerLoadingCenteredGroup.setVisibility(8);
                Intrinsics.checkNotNullExpressionValue(headerLoadingCenteredWithIconGroup, "headerLoadingCenteredWithIconGroup");
                headerLoadingCenteredWithIconGroup.setVisibility(0);
            }
            ShimmerConstraintLayout headerLoading = u1Var.f9381h;
            Intrinsics.checkNotNullExpressionValue(headerLoading, "headerLoading");
            io3.h.s(headerLoading);
            h2 h2Var4 = this.W;
            if (h2Var4 != null) {
                h2Var4.a(true, false);
            }
            h2Var.a(false, true);
        }
    }

    public void setMenuItems(@NotNull List<? extends NavBarMenuItem> menuItems, @NotNull yy0.f imageDisplayer) {
        Intrinsics.checkNotNullParameter(menuItems, "menuItems");
        Intrinsics.checkNotNullParameter(imageDisplayer, "imageDisplayer");
        getToolbarLayout().setMenuItems(menuItems, imageDisplayer);
    }

    @yhm.d
    public final void setNavigationButtonIcon(Integer iconRes) {
        setNavigationButtonIcon(iconRes != null ? new ResourceImage(iconRes.intValue(), (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254) : null);
    }

    @Override // au0.c1
    public void setPages(@NotNull List<u0> pages, @NotNull f2 previewMode, @NotNull v0 pageAutoScroll) {
        Intrinsics.checkNotNullParameter(pages, "pages");
        Intrinsics.checkNotNullParameter(previewMode, "previewMode");
        Intrinsics.checkNotNullParameter(pageAutoScroll, "pageAutoScroll");
        this.f59360y.setPages(pages, previewMode, pageAutoScroll);
    }

    public void setRatingStars(Double stars) {
        this.f59360y.setRatingStars(stars);
    }

    @Override // au0.a
    public void setSearchButtonActive(boolean active) {
        if (active == this.M) {
            return;
        }
        this.M = active;
        HeaderWithBigTileLayout headerWithBigTileLayout = this.f59360y;
        headerWithBigTileLayout.setSearchButtonActive(active);
        SearchView searchView = this.C;
        headerWithBigTileLayout.setSearchButtonText((Clause) d0.d0(searchView.getHints()));
        ifm.b bVar = this.J;
        if (!active) {
            setAlwaysExpandedFlagEnabled$ui_kit_components_release(true);
            bVar.d();
        } else {
            te0.w.j0(bVar, headerWithBigTileLayout.f57265b0.f59002m.subscribe(new tx0.o1(new m2(this, 1), 6)));
            te0.w.j0(bVar, searchView.f57336l.subscribe(new tx0.o1(new m2(this, 2), 7)));
            L();
        }
    }

    public final void setSearchButtonMode(@NotNull lw0.n mode) {
        Intrinsics.checkNotNullParameter(mode, "mode");
        this.f59360y.setSearchButtonMode(mode);
    }

    public void setSearchContentDescription(Clause clause) {
        this.C.setSearchContentDescription(clause);
    }

    public void setSearchFieldActionButtons(@NotNull k9 buttons) {
        Intrinsics.checkNotNullParameter(buttons, "buttons");
        this.C.setActionButtons(buttons);
        if (this.M) {
            this.f59360y.setSearchButtonActionButtons(buttons);
        }
    }

    public void setSearchInput(@NotNull String input) {
        Intrinsics.checkNotNullParameter(input, "input");
        this.C.setSearchInput(input);
    }

    public void setSearchInputFilters(@NotNull List<? extends InputFilter> filters) {
        Intrinsics.checkNotNullParameter(filters, "filters");
        this.C.setSearchInputFilters(filters);
    }

    public void setSearchInputSelection(int index) {
        this.C.setSearchInputSelection(index);
    }

    public void setSearchInputSilently(@NotNull Clause input) {
        Intrinsics.checkNotNullParameter(input, "input");
        this.C.setSearchInputSilently(input);
    }

    public void setSocialProofLabel(s4 content) {
        this.f59360y.setSocialProofLabel(content);
    }

    public void setSortingEnabled(boolean enabled) {
        if (this.M) {
            this.f59360y.setSearchButtonSortingEnabled(enabled);
        }
    }

    public void setTagViewData(TagViewData tagViewData) {
        this.f59360y.setTagViewData(tagViewData);
    }

    public void setThemeBasedColorSchemeEnabled(boolean enabled) {
        this.f59360y.setThemeBasedColorSchemeEnabled(enabled);
    }

    @yhm.d
    public void setTitle(Clause clause) {
        setTitle(new z0(clause, false));
    }

    public void setTitleStyle(@NotNull b1 style) {
        Intrinsics.checkNotNullParameter(style, "style");
        this.f59360y.setTitleStyle(style);
    }

    public final void setToolbarTagView(r2 model) {
        int i = model != null ? 0 : 8;
        TagView tagView = this.D;
        tagView.setVisibility(i);
        if (model != null) {
            tagView.setContent(new TagViewData(new ResourceImage(model.f275234a.intValue(), (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorWhite), (List) null, (ImageTransformations) null, (Clause) null, 246), model.f275235b, R$attr.uikit_colorBlack_30, null, R$attr.uikit_colorTransparent, null, 1000));
        }
    }

    public final void setToolbarTitle(Clause text) {
        ty0.c.b(or0.u.k(this).b0(), text, this.z, null, null, 12);
        this.z.setVisibility(0);
        this.A.setVisibility(8);
        this.B.setVisibility(8);
        this.o = text;
        int i = R$id.internal_nav_bar_title_clause;
        Clause clause = this.f59352n;
        if (clause == null) {
            clause = text;
        }
        setTag(i, clause);
    }

    public final void setToolbarTitleWithSubtitle(@NotNull Clause titleClause, @NotNull Clause subtitleClause) {
        Intrinsics.checkNotNullParameter(titleClause, "titleClause");
        Intrinsics.checkNotNullParameter(subtitleClause, "subtitleClause");
        ty0.c.b(or0.u.k(this).b0(), titleClause, this.A, null, null, 12);
        ty0.c.b(or0.u.k(this).b0(), subtitleClause, this.B, null, null, 12);
        this.z.setVisibility(8);
        this.A.setVisibility(0);
        this.B.setVisibility(0);
        this.o = titleClause;
        int i = R$id.internal_nav_bar_title_clause;
        Clause clause = this.f59352n;
        if (clause == null) {
            clause = titleClause;
        }
        setTag(i, clause);
    }

    @Override // au0.o
    public final void u(SlidingFromTopViewContainer view) {
        Intrinsics.checkNotNullParameter(view, "view");
        ArrayList arrayList = this.f59348d0;
        for (int iJ = zhm.v.j(arrayList); -1 < iJ; iJ--) {
            if (((WeakReference) arrayList.get(iJ)).get() == view) {
                arrayList.remove(iJ);
            }
        }
    }

    public void setDescription(p0 description) {
        this.f59360y.setDescription(description);
    }

    @Override // au0.g2
    public void setMenuItems(@NotNull List<? extends NavBarMenuItem> menuItems) {
        Intrinsics.checkNotNullParameter(menuItems, "menuItems");
        getToolbarLayout().setMenuItems(menuItems);
    }

    public void setSearchInput(@NotNull Clause input) {
        Intrinsics.checkNotNullParameter(input, "input");
        this.C.setSearchInput(input);
    }

    @Override // au0.k4
    @yhm.d
    public /* bridge */ void setHint(@NotNull String str) {
        super.setHint(str);
    }

    public final void setNavigationButtonIcon(Image image) {
        int i = image == null ? 8 : 0;
        NavBarNavigationButtonView navBarNavigationButtonView = this.f59358w;
        navBarNavigationButtonView.setVisibility(i);
        yy0.f.e(or0.u.k(this).Q(), image, this.f59358w, null, null, 12);
        navBarNavigationButtonView.setContentDescription(navBarNavigationButtonView.getContext().getString(R$string.uikit_navigate_up_description));
    }

    public void setTitle(@NotNull a1 title) {
        Intrinsics.checkNotNullParameter(title, "title");
        this.f59360y.setTitle(title);
        if (title instanceof z0) {
            Clause clause = ((z0) title).f9448a;
            this.f59352n = clause;
            int i = R$id.internal_nav_bar_title_clause;
            if (clause == null) {
                clause = this.o;
            }
            setTag(i, clause);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public NavBarWithBigTile(@NotNull Context context) {
        this(context, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }
}
