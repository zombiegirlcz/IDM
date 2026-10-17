package com.revolut.core.ui_kit.internal.views.navbar;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import au0.b0;
import au0.c0;
import au0.d0;
import au0.e0;
import au0.f0;
import au0.p;
import au0.q;
import au0.r;
import au0.s;
import au0.t;
import aw0.db;
import aw0.fa;
import bp0.y;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.core.ui_kit.R$id;
import com.revolut.core.ui_kit.R$layout;
import com.revolut.core.ui_kit.internal.views.CircleProgressBar;
import com.revolut.core.ui_kit.internal.views.ProgressStyle;
import com.revolut.core.ui_kit.internal.views.animated_numbers.AnimatedNumbersView;
import com.revolut.core.ui_kit.internal.views.badge.CircleBadgeView;
import com.revolut.core.ui_kit.internal.views.tag.TagView;
import com.revolut.core.ui_kit.internal.views.tag.TagViewData;
import com.revolut.core.ui_kit.internal.views.timer.CountDownTextView;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.badge.CircleBadgeModel;
import com.revolut.core.ui_kit.views.ImageWithAnimatedBackgroundView;
import com.revolut.core.ui_kit_core.actionshandler.TrackableItem;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.youTransactor.uCube.rpc.Constants;
import foh.i;
import ix0.l0;
import java.util.Iterator;
import java.util.List;
import jb3.l;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import or0.m;
import org.jetbrains.annotations.NotNull;
import te0.w;
import tx0.g0;
import tx0.h0;
import tx0.i0;
import tx0.j0;
import tx0.k0;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000Þ\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b,\b\u0007\u0018\u0000 ª\u00012\u00020\u00012\u00020\u00022\u00020\u0003:\u0004[\u0012«\u0001B'\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0000¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0016\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u0012H\u0000¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0018\u001a\u00020\u000e2\u0006\u0010\u0017\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0018\u0010\u0010J\u0017\u0010\u001a\u001a\u00020\u000e2\u0006\u0010\u0017\u001a\u00020\fH\u0000¢\u0006\u0004\b\u0019\u0010\u0010J\u0017\u0010\u001b\u001a\u00020\u000e2\u0006\u0010\u0017\u001a\u00020\fH\u0016¢\u0006\u0004\b\u001b\u0010\u0010J\u0017\u0010\u001b\u001a\u00020\u000e2\u0006\u0010\u001d\u001a\u00020\u001cH\u0016¢\u0006\u0004\b\u001b\u0010\u001eJ\u0015\u0010!\u001a\u00020\u000e2\u0006\u0010 \u001a\u00020\u001f¢\u0006\u0004\b!\u0010\"J\u0017\u0010#\u001a\u00020\u000e2\u0006\u0010\u0017\u001a\u00020\fH\u0016¢\u0006\u0004\b#\u0010\u0010J\r\u0010$\u001a\u00020\b¢\u0006\u0004\b$\u0010%J#\u0010)\u001a\u00020\u000e2\b\u0010'\u001a\u0004\u0018\u00010&2\b\u0010(\u001a\u0004\u0018\u00010&H\u0016¢\u0006\u0004\b)\u0010*J\u0019\u0010)\u001a\u00020\u000e2\b\u0010,\u001a\u0004\u0018\u00010+H\u0016¢\u0006\u0004\b)\u0010-J\u0019\u0010/\u001a\u00020\u000e2\b\b\u0001\u0010.\u001a\u00020\bH\u0016¢\u0006\u0004\b/\u00100J1\u00106\u001a\u00020\u000e2\b\u0010'\u001a\u0004\u0018\u00010&2\u0006\u00102\u001a\u0002012\u0006\u00103\u001a\u00020\f2\b\u00105\u001a\u0004\u0018\u000104¢\u0006\u0004\b6\u00107J\u0015\u00108\u001a\u00020\u000e2\u0006\u0010\u0017\u001a\u00020\f¢\u0006\u0004\b8\u0010\u0010J\u0015\u0010:\u001a\u00020\u000e2\u0006\u00109\u001a\u00020\f¢\u0006\u0004\b:\u0010\u0010J\u0017\u0010=\u001a\u00020\u000e2\u0006\u0010<\u001a\u00020;H\u0016¢\u0006\u0004\b=\u0010>J\u0019\u0010@\u001a\u00020\u000e2\b\u00102\u001a\u0004\u0018\u00010?H\u0016¢\u0006\u0004\b@\u0010AJ\u0019\u0010B\u001a\u00020\u000e2\b\u0010'\u001a\u0004\u0018\u00010&H\u0016¢\u0006\u0004\bB\u0010CJ#\u0010E\u001a\u00020\u000e2\b\u0010'\u001a\u0004\u0018\u00010&2\b\u0010D\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\bE\u0010FJ\u0019\u0010I\u001a\u00020\u000e2\b\u0010H\u001a\u0004\u0018\u00010GH\u0016¢\u0006\u0004\bI\u0010JJ\u0019\u0010K\u001a\u00020\u000e2\b\u0010'\u001a\u0004\u0018\u00010&H\u0016¢\u0006\u0004\bK\u0010CJ\u0019\u0010M\u001a\u00020\u000e2\b\u00102\u001a\u0004\u0018\u00010LH\u0016¢\u0006\u0004\bM\u0010NJ\u0017\u0010Q\u001a\u00020\u000e2\u0006\u0010P\u001a\u00020OH\u0016¢\u0006\u0004\bQ\u0010RJ#\u0010V\u001a\u00020\u000e2\b\u0010T\u001a\u0004\u0018\u00010S2\b\b\u0001\u0010U\u001a\u00020\bH\u0016¢\u0006\u0004\bV\u0010WJ\u0019\u0010X\u001a\u00020\u000e2\b\u0010'\u001a\u0004\u0018\u00010&H\u0016¢\u0006\u0004\bX\u0010CJ\u0019\u0010Y\u001a\u00020\u000e2\b\u0010'\u001a\u0004\u0018\u00010&H\u0016¢\u0006\u0004\bY\u0010CJ\u0019\u0010Z\u001a\u00020\u000e2\b\u0010H\u001a\u0004\u0018\u00010GH\u0016¢\u0006\u0004\bZ\u0010JJ\u0015\u0010]\u001a\u00020\u000e2\u0006\u0010\\\u001a\u00020[¢\u0006\u0004\b]\u0010^J\u0017\u0010`\u001a\u00020\u000e2\u0006\u0010\\\u001a\u00020_H\u0016¢\u0006\u0004\b`\u0010aJ\u0017\u0010b\u001a\u00020\u000e2\u0006\u0010.\u001a\u00020\bH\u0016¢\u0006\u0004\bb\u00100J\u0019\u0010c\u001a\u00020\u000e2\b\b\u0001\u0010.\u001a\u00020\bH\u0016¢\u0006\u0004\bc\u00100J\u0015\u0010e\u001a\u00020\u000e2\u0006\u0010\\\u001a\u00020d¢\u0006\u0004\be\u0010fJ+\u0010j\u001a\u00020\u000e2\b\u00102\u001a\u0004\u0018\u00010L2\b\u0010h\u001a\u0004\u0018\u00010g2\u0006\u0010i\u001a\u00020\fH\u0016¢\u0006\u0004\bj\u0010kJ\u0015\u0010n\u001a\u00020\u000e2\u0006\u0010m\u001a\u00020l¢\u0006\u0004\bn\u0010oJ\u0019\u0010p\u001a\u00020\u000e2\b\u0010H\u001a\u0004\u0018\u00010GH\u0002¢\u0006\u0004\bp\u0010JJ\u0019\u0010r\u001a\u00020\u000e2\b\u0010q\u001a\u0004\u0018\u00010GH\u0002¢\u0006\u0004\br\u0010JR!\u0010y\u001a\b\u0012\u0004\u0012\u00020t0s8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bu\u0010v\u001a\u0004\bw\u0010xR\u001a\u0010\u007f\u001a\u00020z8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b{\u0010|\u001a\u0004\b}\u0010~R,\u0010\u0087\u0001\u001a\u0005\u0018\u00010\u0080\u00018\u0016@\u0016X\u0096\u000e¢\u0006\u0018\n\u0006\b\u0081\u0001\u0010\u0082\u0001\u001a\u0006\b\u0083\u0001\u0010\u0084\u0001\"\u0006\b\u0085\u0001\u0010\u0086\u0001R1\u0010\u008e\u0001\u001a\u00020\f2\u0007\u0010\u0088\u0001\u001a\u00020\f8\u0006@FX\u0086\u000e¢\u0006\u0017\n\u0006\b\u0089\u0001\u0010\u008a\u0001\u001a\u0006\b\u008b\u0001\u0010\u008c\u0001\"\u0005\b\u008d\u0001\u0010\u0010R)\u0010\u0091\u0001\u001a\u00020\f2\u0007\u0010\u0088\u0001\u001a\u00020\f8F@FX\u0086\u000e¢\u0006\u000f\u001a\u0006\b\u008f\u0001\u0010\u008c\u0001\"\u0005\b\u0090\u0001\u0010\u0010R)\u0010\u0094\u0001\u001a\u00020\f2\u0007\u0010\u0088\u0001\u001a\u00020\f8F@FX\u0086\u000e¢\u0006\u000f\u001a\u0006\b\u0092\u0001\u0010\u008c\u0001\"\u0005\b\u0093\u0001\u0010\u0010R)\u0010\u0097\u0001\u001a\u00020\f2\u0007\u0010\u0088\u0001\u001a\u00020\f8V@VX\u0096\u000e¢\u0006\u000f\u001a\u0006\b\u0095\u0001\u0010\u008c\u0001\"\u0005\b\u0096\u0001\u0010\u0010R)\u0010\u009a\u0001\u001a\u00020\f2\u0007\u0010\u0088\u0001\u001a\u00020\f8V@VX\u0096\u000e¢\u0006\u000f\u001a\u0006\b\u0098\u0001\u0010\u008c\u0001\"\u0005\b\u0099\u0001\u0010\u0010R)\u0010\u009d\u0001\u001a\u00020\f2\u0007\u0010\u0088\u0001\u001a\u00020\f8V@VX\u0096\u000e¢\u0006\u000f\u001a\u0006\b\u009b\u0001\u0010\u008c\u0001\"\u0005\b\u009c\u0001\u0010\u0010R)\u0010 \u0001\u001a\u00020\f2\u0007\u0010\u0088\u0001\u001a\u00020\f8V@VX\u0096\u000e¢\u0006\u000f\u001a\u0006\b\u009e\u0001\u0010\u008c\u0001\"\u0005\b\u009f\u0001\u0010\u0010R)\u0010£\u0001\u001a\u00020\f2\u0007\u0010\u0088\u0001\u001a\u00020\f8V@VX\u0096\u000e¢\u0006\u000f\u001a\u0006\b¡\u0001\u0010\u008c\u0001\"\u0005\b¢\u0001\u0010\u0010R)\u0010¦\u0001\u001a\u00020\f2\u0007\u0010\u0088\u0001\u001a\u00020\f8V@VX\u0096\u000e¢\u0006\u000f\u001a\u0006\b¤\u0001\u0010\u008c\u0001\"\u0005\b¥\u0001\u0010\u0010R)\u0010©\u0001\u001a\u00020\f2\u0007\u0010\u0088\u0001\u001a\u00020\f8V@VX\u0096\u000e¢\u0006\u000f\u001a\u0006\b§\u0001\u0010\u008c\u0001\"\u0005\b¨\u0001\u0010\u0010¨\u0006¬\u0001"}, d2 = {"Lcom/revolut/core/ui_kit/internal/views/navbar/ConstraintHeaderLayout;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Lau0/f0;", "Lcom/revolut/core/ui_kit_core/actionshandler/TrackableItem;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", "compact", "", "setCompactHorizontalPadding$ui_kit_components_release", "(Z)V", "setCompactHorizontalPadding", "Lau0/t;", "anchor", "setDescriptionEndAnchor$ui_kit_components_release", "(Lau0/t;)V", "setDescriptionEndAnchor", "clickable", "setTitleClickable", "setTopDescriptionClickable$ui_kit_components_release", "setTopDescriptionClickable", "setDescriptionClickable", "Lau0/c0;", "clickableMode", "(Lau0/c0;)V", "", "visibilityRatio", "setDescriptionsVisibilityRatio", "(F)V", "setSecondDescriptionClickable", "getCollapsedHeight", "()I", "Lcom/revolut/core/ui_kit/models/Clause;", "text", "topNote", "setTitle", "(Lcom/revolut/core/ui_kit/models/Clause;Lcom/revolut/core/ui_kit/models/Clause;)V", "Lau0/d0;", "compositeTitle", "(Lau0/d0;)V", "colorAttrId", "setTitleColor", "(I)V", "Lcom/revolut/core/ui_kit/views/ImageWithAnimatedBackgroundView$Model;", "image", "displayBadgeDot", "Lcom/revolut/core/ui_kit/models/badge/CircleBadgeModel;", "statusBadge", "setTitleWithLeadingIcon", "(Lcom/revolut/core/ui_kit/models/Clause;Lcom/revolut/core/ui_kit/views/ImageWithAnimatedBackgroundView$Model;ZLcom/revolut/core/ui_kit/models/badge/CircleBadgeModel;)V", "setTitleLeadingIconClickable", "useAutoSize", "setTitleAutoSize", "Ltx0/g0;", "state", "setTitleChevron", "(Ltx0/g0;)V", "Lcom/revolut/core/ui_kit_core/displayers/image/Image;", "setTitleChevronIcon", "(Lcom/revolut/core/ui_kit_core/displayers/image/Image;)V", "setDescriptionText", "(Lcom/revolut/core/ui_kit/models/Clause;)V", "endViewId", "setTitleDescription", "(Lcom/revolut/core/ui_kit/models/Clause;Ljava/lang/Integer;)V", "Lcom/revolut/core/ui_kit/internal/views/tag/TagViewData;", "tagViewData", "setTitleTag", "(Lcom/revolut/core/ui_kit/internal/views/tag/TagViewData;)V", "setTitleTopDescription", "Ltx0/i0;", "setTitleTopDescriptionImage", "(Ltx0/i0;)V", "", "payload", "setDescriptionClickPayload", "(Ljava/lang/Object;)V", "", "expirationTimeMillis", "countdownColorId", "setDescriptionCountdown", "(Ljava/lang/Long;I)V", "setSecondDescriptionText", "setThirdDescriptionText", "setBottomTag", "Lau0/u;", "style", "setDescriptionTextStyle", "(Lau0/u;)V", "Lau0/e0;", "setSecondDescriptionTextStyle", "(Lau0/e0;)V", "setSecondDescriptionColor", "setDescriptionColor", "Ltx0/k0;", "setTitleStyle", "(Ltx0/k0;)V", "Lcom/revolut/core/ui_kit/internal/views/ProgressStyle;", "progress", "imageBadgeVisible", "setDescriptionImage", "(Ltx0/i0;Lcom/revolut/core/ui_kit/internal/views/ProgressStyle;Z)V", "Ltx0/j0;", "mode", "setHeaderTitleMode", "(Ltx0/j0;)V", "setBottomTagViewContent", "titleTagContent", "setupTitleTag", "", "Landroid/view/View;", "P", "Lkotlin/Lazy;", "getTitleIconGroup", "()Ljava/util/List;", "titleIconGroup", "Lix0/l0;", "T", "Lix0/l0;", "getCutoutStage$ui_kit_components_release", "()Lix0/l0;", "cutoutStage", "Landroid/os/Parcelable;", "U", "Landroid/os/Parcelable;", "getAnalyticsContext", "()Landroid/os/Parcelable;", "setAnalyticsContext", "(Landroid/os/Parcelable;)V", "analyticsContext", "value", "V", "Z", "getUseAnimatedTitle", "()Z", "setUseAnimatedTitle", "useAnimatedTitle", "getAnimateSpin", "setAnimateSpin", "animateSpin", "getAnimateColour", "setAnimateColour", "animateColour", "getTitleTopDescriptionVisible", "setTitleTopDescriptionVisible", "titleTopDescriptionVisible", "getTitleTopDescriptionImageVisible", "setTitleTopDescriptionImageVisible", "titleTopDescriptionImageVisible", "getTitleVisible", "setTitleVisible", "titleVisible", "getDescriptionVisible", "setDescriptionVisible", "descriptionVisible", "getSecondDescriptionVisible", "setSecondDescriptionVisible", "secondDescriptionVisible", "getThirdDescriptionVisible", "setThirdDescriptionVisible", "thirdDescriptionVisible", "getCompactDescriptions", "setCompactDescriptions", "compactDescriptions", "Companion", "a", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class ConstraintHeaderLayout extends ConstraintLayout implements f0, TrackableItem {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();
    public final AnimatedNumbersView A;
    public final ImageView B;
    public final TextView C;
    public final TextView D;
    public final TextView E;
    public final ImageWithAnimatedBackgroundView F;
    public final ImageView G;
    public final ImageView H;
    public final CountDownTextView I;
    public final ImageView J;
    public final CircleBadgeView K;
    public final FrameLayout L;
    public final CircleProgressBar M;
    public TagView N;
    public TagView O;
    public final Object P;
    public d0 Q;
    public Clause R;
    public final int S;

    /* JADX INFO: renamed from: T, reason: from kotlin metadata */
    public final l0 cutoutStage;

    /* JADX INFO: renamed from: U, reason: from kotlin metadata */
    public Parcelable analyticsContext;

    /* JADX INFO: renamed from: V, reason: from kotlin metadata */
    public boolean useAnimatedTitle;
    public boolean W;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ihm.f f57243b;
    public final ihm.f f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ihm.f f57244g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ihm.f f57245h;
    public final ihm.f i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final ihm.f f57246j;
    public final ihm.f k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final ihm.f f57247l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final ihm.f f57248m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final ihm.f f57249n;
    public final ihm.f o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final ihm.f f57250p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public Object f57251q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final int f57252r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final AppCompatTextView f57253s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final AppCompatTextView f57254t;
    public final ImageView u;
    public final AppCompatTextView v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final ImageAutoSizeTextView f57255w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final LinearLayout f57256x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final LinearLayout f57257y;
    public final View z;

    /* JADX INFO: renamed from: com.revolut.core.ui_kit.internal.views.navbar.ConstraintHeaderLayout$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ConstraintHeaderLayout(@NotNull Context context) {
        this(context, null, 6, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public static LayeredImage g0(int i) {
        return new LayeredImage(v.k(new LayeredImage.Layer.Drawable(R$drawable.uikit_icn_circle_background, Integer.valueOf(R$attr.uikit_colorAccentNeutral_10), BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, (com.revolut.core.ui_kit_core.displayers.image.models.c) null, 124), new LayeredImage.Layer.Drawable(i, Integer.valueOf(R$attr.uikit_colorAccentNeutral), 5.33f, 5.33f, 5.33f, 5.33f, (com.revolut.core.ui_kit_core.displayers.image.models.c) null, 64)), (Float) null, (Float) null, 14);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    private final List<View> getTitleIconGroup() {
        return (List) this.P.getValue();
    }

    public static void m0(TextView textView, int i) {
        ViewGroup.LayoutParams layoutParams = textView.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        marginLayoutParams.topMargin = i;
        textView.setLayoutParams(marginLayoutParams);
    }

    public static CompositeClause n0(Clause clause, db dbVar) {
        fa faVar = clause instanceof fa ? (fa) clause : null;
        Style f = faVar != null ? faVar.getF57837c() : null;
        Custom custom = f instanceof Custom ? (Custom) f : null;
        return new CompositeClause(u.c(clause), null, custom != null ? Custom.a(custom, null, dbVar, Constants.TAG_FB_CHARGING_STATUS) : new Custom(null, false, dbVar, false, null, Constants.TAG_FB_CHARGING_STATUS), null, 10);
    }

    private final void setBottomTagViewContent(TagViewData tagViewData) {
        TagView tagView = this.N;
        if (tagView == null && tagViewData == null) {
            return;
        }
        if (tagView == null) {
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            tagView = new TagView(context, null, 6, 0);
            this.N = tagView;
            tagView.setId(View.generateViewId());
            ConstraintLayout.LayoutParams layoutParams = new ConstraintLayout.LayoutParams(-2, -2);
            Context context2 = tagView.getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
            ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin = kli.a.w(R$attr.uikit_dp16, context2);
            Context context3 = tagView.getContext();
            Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
            ((ViewGroup.MarginLayoutParams) layoutParams).topMargin = kli.a.w(R$attr.uikit_dp4, context3);
            Context context4 = tagView.getContext();
            Intrinsics.checkNotNullExpressionValue(context4, "getContext(...)");
            ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin = kli.a.w(R$attr.uikit_dp8, context4);
            layoutParams.topToBottom = R$id.headerLayout_thirdDescriptionText;
            layoutParams.startToStart = 0;
            layoutParams.endToStart = R$id.headerExtraContainer;
            layoutParams.constrainedWidth = true;
            layoutParams.horizontalBias = BitmapDescriptorFactory.HUE_RED;
            tagView.setLayoutParams(layoutParams);
            addView(tagView);
        }
        f0(tagView, tagViewData);
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
    private final void setupTitleTag(TagViewData titleTagContent) {
        int iK;
        int i;
        TagView tagView = this.O;
        if (tagView == null && titleTagContent == null) {
            return;
        }
        float f = 16.0f;
        if (tagView == null) {
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            tagView = new TagView(context, null, 6, 0);
            this.O = tagView;
            tagView.setId(R$id.internal_headerLayout_titleTagView);
            int i2 = this.useAnimatedTitle ? R$id.headerLayout_animatedViewContainer : R$id.headerLayout_chevronTextView;
            ConstraintLayout.LayoutParams layoutParams = new ConstraintLayout.LayoutParams(-2, -2);
            Context context2 = tagView.getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
            ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin = kli.a.k(context2, 7.0f);
            Context context3 = tagView.getContext();
            Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
            layoutParams.setMarginEnd(kli.a.k(context3, 16.0f));
            layoutParams.bottomToBottom = i2;
            layoutParams.startToEnd = i2;
            layoutParams.endToStart = R$id.headerExtraContainer;
            layoutParams.constrainedWidth = true;
            layoutParams.horizontalBias = BitmapDescriptorFactory.HUE_RED;
            tagView.setLayoutParams(layoutParams);
            addView(tagView);
        }
        f0(tagView, titleTagContent);
        if (this.useAnimatedTitle) {
            return;
        }
        if (titleTagContent != null) {
            f = 8.0f;
            iK = 0;
            i = -2;
        } else {
            Context context4 = getContext();
            Intrinsics.checkNotNullExpressionValue(context4, "getContext(...)");
            iK = kli.a.k(context4, 24.0f);
            i = 0;
        }
        ImageAutoSizeTextView headerLayout_chevronTextView = this.f57255w;
        if (headerLayout_chevronTextView.getLayoutParams().width != i) {
            headerLayout_chevronTextView.setDefaultEndPadding(iK);
            Intrinsics.checkNotNullExpressionValue(headerLayout_chevronTextView, "headerLayout_chevronTextView");
            ViewGroup.LayoutParams layoutParams2 = headerLayout_chevronTextView.getLayoutParams();
            if (layoutParams2 == null) {
                throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
            }
            ConstraintLayout.LayoutParams layoutParams3 = (ConstraintLayout.LayoutParams) layoutParams2;
            ((ViewGroup.MarginLayoutParams) layoutParams3).width = i;
            layoutParams3.constrainedWidth = i == -2;
            headerLayout_chevronTextView.setLayoutParams(layoutParams3);
            Intrinsics.checkNotNullExpressionValue(headerLayout_chevronTextView, "headerLayout_chevronTextView");
            Context context5 = getContext();
            Intrinsics.checkNotNullExpressionValue(context5, "getContext(...)");
            knm.b.w(kli.a.k(context5, f), headerLayout_chevronTextView);
        }
    }

    public final void f0(TagView tagView, TagViewData tagViewData) {
        tagView.setVisibility(tagViewData != null ? 0 : 8);
        if (tagViewData == null) {
            or0.u.o(tagView);
        } else {
            tagView.setContent(tagViewData);
            tagView.setOnClickListener(new ap0.f(this, tagViewData, 1));
        }
    }

    @Override // com.revolut.core.ui_kit_core.actionshandler.TrackableItem
    /* JADX INFO: renamed from: getAnalyticsContext, reason: from getter */
    public Parcelable getF57034j() {
        return this.analyticsContext;
    }

    public final boolean getAnimateColour() {
        return this.A.getAnimateColour();
    }

    public final boolean getAnimateSpin() {
        return this.A.getAnimateSpin();
    }

    public final int getCollapsedHeight() {
        return !this.useAnimatedTitle ? this.f57255w.getMeasuredHeight() : this.f57256x.getMeasuredHeight();
    }

    public boolean getCompactDescriptions() {
        TextView headerLayout_secondDescriptionText = this.D;
        Intrinsics.checkNotNullExpressionValue(headerLayout_secondDescriptionText, "headerLayout_secondDescriptionText");
        ViewGroup.LayoutParams layoutParams = headerLayout_secondDescriptionText.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
        if ((marginLayoutParams != null ? marginLayoutParams.topMargin : 0) == 0) {
            TextView headerLayout_thirdDescriptionText = this.E;
            Intrinsics.checkNotNullExpressionValue(headerLayout_thirdDescriptionText, "headerLayout_thirdDescriptionText");
            ViewGroup.LayoutParams layoutParams2 = headerLayout_thirdDescriptionText.getLayoutParams();
            ViewGroup.MarginLayoutParams marginLayoutParams2 = layoutParams2 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams2 : null;
            if ((marginLayoutParams2 != null ? marginLayoutParams2.topMargin : 0) == 0) {
                return true;
            }
        }
        return false;
    }

    @NotNull
    /* JADX INFO: renamed from: getCutoutStage$ui_kit_components_release, reason: from getter */
    public final l0 getCutoutStage() {
        return this.cutoutStage;
    }

    public boolean getDescriptionVisible() {
        LinearLayout headerLayout_description = this.f57257y;
        Intrinsics.checkNotNullExpressionValue(headerLayout_description, "headerLayout_description");
        return headerLayout_description.getVisibility() == 0;
    }

    public boolean getSecondDescriptionVisible() {
        TextView headerLayout_secondDescriptionText = this.D;
        Intrinsics.checkNotNullExpressionValue(headerLayout_secondDescriptionText, "headerLayout_secondDescriptionText");
        return headerLayout_secondDescriptionText.getVisibility() == 0;
    }

    public boolean getThirdDescriptionVisible() {
        TextView headerLayout_thirdDescriptionText = this.E;
        Intrinsics.checkNotNullExpressionValue(headerLayout_thirdDescriptionText, "headerLayout_thirdDescriptionText");
        return headerLayout_thirdDescriptionText.getVisibility() == 0;
    }

    public boolean getTitleTopDescriptionImageVisible() {
        ImageView headerLayout_titleTopDescriptionImage = this.u;
        Intrinsics.checkNotNullExpressionValue(headerLayout_titleTopDescriptionImage, "headerLayout_titleTopDescriptionImage");
        return headerLayout_titleTopDescriptionImage.getVisibility() == 0;
    }

    public boolean getTitleTopDescriptionVisible() {
        AppCompatTextView headerLayout_titleTopDescription = this.f57254t;
        Intrinsics.checkNotNullExpressionValue(headerLayout_titleTopDescription, "headerLayout_titleTopDescription");
        return headerLayout_titleTopDescription.getVisibility() == 0;
    }

    public boolean getTitleVisible() {
        ImageAutoSizeTextView headerLayout_chevronTextView = this.f57255w;
        Intrinsics.checkNotNullExpressionValue(headerLayout_chevronTextView, "headerLayout_chevronTextView");
        return headerLayout_chevronTextView.getVisibility() == 0;
    }

    public final boolean getUseAnimatedTitle() {
        return this.useAnimatedTitle;
    }

    public final void h0(Clause clause, Clause clause2, ty0.g gVar) {
        Iterator<T> it8 = getTitleIconGroup().iterator();
        while (it8.hasNext()) {
            ((View) it8.next()).setVisibility(8);
        }
        ImageAutoSizeTextView imageAutoSizeTextView = this.f57255w;
        imageAutoSizeTextView.setText(clause, gVar);
        this.A.setCurrentClause(clause);
        AppCompatTextView headerLayout_titleTopNote = this.v;
        Intrinsics.checkNotNullExpressionValue(headerLayout_titleTopNote, "headerLayout_titleTopNote");
        kli.a.b(headerLayout_titleTopNote, clause2, ty0.f.f275450a);
        ViewGroup.LayoutParams layoutParams = imageAutoSizeTextView.getLayoutParams();
        Intrinsics.i(layoutParams, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        ((ConstraintLayout.LayoutParams) layoutParams).topToBottom = clause2 != null ? headerLayout_titleTopNote.getId() : this.f57254t.getId();
    }

    public final int i0(h0 h0Var) {
        float f;
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        int i = au0.v.f9401g[h0Var.ordinal()];
        if (i == 1) {
            f = 16.0f;
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            f = 24.0f;
        }
        return kli.a.k(context, f);
    }

    public final void j0(TextView textView) {
        py0.f fVarN0 = or0.u.k(this).n0();
        Clause clauseO = ((y) or0.u.k(this).b0()).o(textView);
        fVarN0.a(this, this, clauseO != null ? new py0.c(clauseO) : null);
    }

    public final void l0() {
        py0.f fVarN0 = or0.u.k(this).n0();
        Clause text = this.f57255w.getText();
        fVarN0.a(this, this, text != null ? new py0.c(text) : null);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        Bundle bundle = parcelable instanceof Bundle ? (Bundle) parcelable : null;
        if (bundle == null) {
            return;
        }
        setDescriptionVisible(bundle.getBoolean("STATE_KEY_DESCRIPTION_VISIBLE"));
        setDescriptionClickable(c0.values()[bundle.getInt("STATE_KEY_DESCRIPTION_CLICKABLE")]);
        setSecondDescriptionClickable(bundle.getBoolean("STATE_KEY_SECOND_DESCRIPTION_CLICKABLE"));
        super.onRestoreInstanceState(bundle.getParcelable("STATE_KEY_SUPER"));
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        Bundle bundle = new Bundle();
        bundle.putParcelable("STATE_KEY_SUPER", super.onSaveInstanceState());
        bundle.putBoolean("STATE_KEY_DESCRIPTION_VISIBLE", getDescriptionVisible());
        bundle.putInt("STATE_KEY_DESCRIPTION_CLICKABLE", (this.f57257y.isClickable() ? c0.TEXT_AND_ICON : this.B.isClickable() ? c0.ICON : this.C.isClickable() ? c0.TEXT : c0.NONE).ordinal());
        bundle.putBoolean("STATE_KEY_SECOND_DESCRIPTION_CLICKABLE", this.D.getMovementMethod() == null);
        return bundle;
    }

    @Override // com.revolut.core.ui_kit_core.actionshandler.TrackableItem
    public void setAnalyticsContext(Parcelable parcelable) {
        this.analyticsContext = parcelable;
    }

    public final void setAnimateColour(boolean z) {
        this.A.setAnimateColour(z);
    }

    public final void setAnimateSpin(boolean z) {
        this.A.setAnimateSpin(z);
    }

    public void setBottomTag(TagViewData tagViewData) {
        setBottomTagViewContent(tagViewData);
    }

    public void setCompactDescriptions(boolean z) {
        TextView headerLayout_thirdDescriptionText = this.E;
        TextView headerLayout_secondDescriptionText = this.D;
        if (z) {
            Intrinsics.checkNotNullExpressionValue(headerLayout_secondDescriptionText, "headerLayout_secondDescriptionText");
            m0(headerLayout_secondDescriptionText, 0);
            Intrinsics.checkNotNullExpressionValue(headerLayout_thirdDescriptionText, "headerLayout_thirdDescriptionText");
            m0(headerLayout_thirdDescriptionText, 0);
            return;
        }
        Intrinsics.checkNotNullExpressionValue(headerLayout_secondDescriptionText, "headerLayout_secondDescriptionText");
        int i = this.S;
        m0(headerLayout_secondDescriptionText, i);
        Intrinsics.checkNotNullExpressionValue(headerLayout_thirdDescriptionText, "headerLayout_thirdDescriptionText");
        m0(headerLayout_thirdDescriptionText, i);
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
    public final void setCompactHorizontalPadding$ui_kit_components_release(boolean compact) {
        int i;
        int i2;
        int i3;
        int i5;
        int i6;
        int i21;
        int i22;
        int i32;
        int i33;
        int i43;
        int i59;
        int i66;
        int i74;
        int i92;
        int i96;
        int i99;
        int i100;
        int i101;
        if (this.W == compact) {
            return;
        }
        this.W = compact;
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        int iK = kli.a.k(context, 8.0f);
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        int iK2 = kli.a.k(context2, 16.0f);
        if (compact) {
            iK = 0;
            i = 0;
            i2 = 0;
            i101 = 0;
            i3 = 0;
            i22 = 0;
            i32 = 0;
            i33 = 0;
            i43 = 0;
            i59 = 0;
            i66 = 0;
            i74 = 0;
            i92 = 0;
            i96 = 0;
            i99 = 0;
            i5 = 0;
            i6 = 0;
            i100 = 0;
            i21 = 0;
        } else {
            i = iK;
            i2 = i;
            i3 = i2;
            i5 = i3;
            i6 = i5;
            i21 = i6;
            i22 = iK2;
            i32 = i22;
            i33 = i32;
            i43 = i33;
            i59 = i43;
            i66 = i59;
            i74 = i66;
            i92 = i74;
            i96 = i92;
            i99 = i96;
            i100 = i99;
            i101 = i21;
        }
        ImageAutoSizeTextView headerLayout_chevronTextView = this.f57255w;
        int i102 = i22;
        Intrinsics.checkNotNullExpressionValue(headerLayout_chevronTextView, "headerLayout_chevronTextView");
        ViewGroup.LayoutParams layoutParams = headerLayout_chevronTextView.getLayoutParams();
        int i103 = i3;
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        }
        ConstraintLayout.LayoutParams layoutParams2 = (ConstraintLayout.LayoutParams) layoutParams;
        layoutParams2.setMarginStart(i43);
        layoutParams2.goneStartMargin = iK;
        headerLayout_chevronTextView.setLayoutParams(layoutParams2);
        Intrinsics.checkNotNullExpressionValue(headerLayout_chevronTextView, "headerLayout_chevronTextView");
        knm.b.x(i2, headerLayout_chevronTextView);
        Intrinsics.checkNotNullExpressionValue(headerLayout_chevronTextView, "headerLayout_chevronTextView");
        knm.b.w(i59, headerLayout_chevronTextView);
        AppCompatTextView headerLayout_titleTopNote = this.v;
        Intrinsics.checkNotNullExpressionValue(headerLayout_titleTopNote, "headerLayout_titleTopNote");
        ViewGroup.LayoutParams layoutParams3 = headerLayout_titleTopNote.getLayoutParams();
        if (layoutParams3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams3;
        marginLayoutParams.setMarginStart(i66);
        headerLayout_titleTopNote.setLayoutParams(marginLayoutParams);
        AppCompatTextView headerLayout_titleTopDescription = this.f57254t;
        Intrinsics.checkNotNullExpressionValue(headerLayout_titleTopDescription, "headerLayout_titleTopDescription");
        ViewGroup.LayoutParams layoutParams4 = headerLayout_titleTopDescription.getLayoutParams();
        if (layoutParams4 == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        }
        ConstraintLayout.LayoutParams layoutParams5 = (ConstraintLayout.LayoutParams) layoutParams4;
        layoutParams5.setMarginStart(i101);
        layoutParams5.goneStartMargin = i74;
        headerLayout_titleTopDescription.setLayoutParams(layoutParams5);
        Intrinsics.checkNotNullExpressionValue(headerLayout_titleTopDescription, "headerLayout_titleTopDescription");
        headerLayout_titleTopDescription.setPaddingRelative(headerLayout_titleTopDescription.getPaddingStart(), headerLayout_titleTopDescription.getPaddingTop(), i92, headerLayout_titleTopDescription.getPaddingBottom());
        ImageView headerLayout_titleTopDescriptionImage = this.u;
        Intrinsics.checkNotNullExpressionValue(headerLayout_titleTopDescriptionImage, "headerLayout_titleTopDescriptionImage");
        ViewGroup.LayoutParams layoutParams6 = headerLayout_titleTopDescriptionImage.getLayoutParams();
        if (layoutParams6 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        }
        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams6;
        marginLayoutParams2.setMarginStart(i96);
        headerLayout_titleTopDescriptionImage.setLayoutParams(marginLayoutParams2);
        LinearLayout headerLayout_description = this.f57257y;
        Intrinsics.checkNotNullExpressionValue(headerLayout_description, "headerLayout_description");
        headerLayout_description.setPaddingRelative(i99, headerLayout_description.getPaddingTop(), i32, headerLayout_description.getPaddingBottom());
        TextView headerLayout_secondDescriptionText = this.D;
        Intrinsics.checkNotNullExpressionValue(headerLayout_secondDescriptionText, "headerLayout_secondDescriptionText");
        ViewGroup.LayoutParams layoutParams7 = headerLayout_secondDescriptionText.getLayoutParams();
        if (layoutParams7 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        }
        ViewGroup.MarginLayoutParams marginLayoutParams3 = (ViewGroup.MarginLayoutParams) layoutParams7;
        marginLayoutParams3.setMarginStart(i33);
        marginLayoutParams3.setMarginEnd(i103);
        headerLayout_secondDescriptionText.setLayoutParams(marginLayoutParams3);
        TextView headerLayout_thirdDescriptionText = this.E;
        Intrinsics.checkNotNullExpressionValue(headerLayout_thirdDescriptionText, "headerLayout_thirdDescriptionText");
        ViewGroup.LayoutParams layoutParams8 = headerLayout_thirdDescriptionText.getLayoutParams();
        if (layoutParams8 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        }
        ViewGroup.MarginLayoutParams marginLayoutParams4 = (ViewGroup.MarginLayoutParams) layoutParams8;
        marginLayoutParams4.setMarginStart(i102);
        marginLayoutParams4.setMarginEnd(i21);
        headerLayout_thirdDescriptionText.setLayoutParams(marginLayoutParams4);
        LinearLayout headerLayout_animatedViewContainer = this.f57256x;
        Intrinsics.checkNotNullExpressionValue(headerLayout_animatedViewContainer, "headerLayout_animatedViewContainer");
        ViewGroup.LayoutParams layoutParams9 = headerLayout_animatedViewContainer.getLayoutParams();
        if (layoutParams9 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        }
        ViewGroup.MarginLayoutParams marginLayoutParams5 = (ViewGroup.MarginLayoutParams) layoutParams9;
        marginLayoutParams5.setMarginStart(i6);
        headerLayout_animatedViewContainer.setLayoutParams(marginLayoutParams5);
        Intrinsics.checkNotNullExpressionValue(headerLayout_animatedViewContainer, "headerLayout_animatedViewContainer");
        headerLayout_animatedViewContainer.setPaddingRelative(i, headerLayout_animatedViewContainer.getPaddingTop(), i5, headerLayout_animatedViewContainer.getPaddingBottom());
        ImageWithAnimatedBackgroundView headerLayout_titleIcon = this.F;
        Intrinsics.checkNotNullExpressionValue(headerLayout_titleIcon, "headerLayout_titleIcon");
        ViewGroup.LayoutParams layoutParams10 = headerLayout_titleIcon.getLayoutParams();
        if (layoutParams10 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        }
        ViewGroup.MarginLayoutParams marginLayoutParams6 = (ViewGroup.MarginLayoutParams) layoutParams10;
        marginLayoutParams6.setMarginStart(i100);
        headerLayout_titleIcon.setLayoutParams(marginLayoutParams6);
    }

    public void setDescriptionClickPayload(@NotNull Object payload) {
        Intrinsics.checkNotNullParameter(payload, "payload");
        this.f57251q = payload;
    }

    public void setDescriptionClickable(boolean clickable) {
        setDescriptionClickable(clickable ? c0.TEXT_AND_ICON : c0.NONE);
    }

    public void setDescriptionColor(int colorAttrId) {
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        this.C.setTextColor(kli.a.s(colorAttrId, context));
    }

    public void setDescriptionCountdown(Long expirationTimeMillis, int countdownColorId) {
        CountDownTextView headerLayout_countDown = this.I;
        Intrinsics.checkNotNullExpressionValue(headerLayout_countDown, "headerLayout_countDown");
        headerLayout_countDown.setVisibility(expirationTimeMillis != null ? 0 : 8);
        if (expirationTimeMillis != null) {
            headerLayout_countDown.setTimeExpiredListener(new p(this, 1));
            headerLayout_countDown.setTextColorAttr(countdownColorId);
            headerLayout_countDown.setExpirationTime(expirationTimeMillis);
        }
    }

    public final void setDescriptionEndAnchor$ui_kit_components_release(@NotNull t anchor) {
        Intrinsics.checkNotNullParameter(anchor, "anchor");
        TextView headerLayout_secondDescriptionText = this.D;
        Intrinsics.checkNotNullExpressionValue(headerLayout_secondDescriptionText, "headerLayout_secondDescriptionText");
        ViewGroup.LayoutParams layoutParams = headerLayout_secondDescriptionText.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        }
        ConstraintLayout.LayoutParams layoutParams2 = (ConstraintLayout.LayoutParams) layoutParams;
        int[] iArr = au0.v.f9398a;
        int i = iArr[anchor.ordinal()];
        if (i == 1) {
            layoutParams2.endToEnd = -1;
            layoutParams2.endToStart = R$id.headerExtraContainer;
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            layoutParams2.endToStart = -1;
            layoutParams2.endToEnd = 0;
        }
        headerLayout_secondDescriptionText.setLayoutParams(layoutParams2);
        TextView headerLayout_thirdDescriptionText = this.E;
        Intrinsics.checkNotNullExpressionValue(headerLayout_thirdDescriptionText, "headerLayout_thirdDescriptionText");
        ViewGroup.LayoutParams layoutParams3 = headerLayout_thirdDescriptionText.getLayoutParams();
        if (layoutParams3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        }
        ConstraintLayout.LayoutParams layoutParams4 = (ConstraintLayout.LayoutParams) layoutParams3;
        int i2 = iArr[anchor.ordinal()];
        if (i2 == 1) {
            layoutParams4.endToEnd = -1;
            layoutParams4.endToStart = R$id.headerExtraContainer;
        } else {
            if (i2 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            layoutParams4.endToStart = -1;
            layoutParams4.endToEnd = 0;
        }
        headerLayout_thirdDescriptionText.setLayoutParams(layoutParams4);
    }

    @Override // au0.f0
    public void setDescriptionImage(Image image, ProgressStyle progressStyle, boolean z) {
        setDescriptionImage(image != null ? new i0(image, h0.SIZE_24) : null, progressStyle, z);
    }

    public void setDescriptionText(Clause text) {
        ty0.c cVarB0 = or0.u.k(this).b0();
        TextView headerLayout_descriptionText = this.C;
        Intrinsics.checkNotNullExpressionValue(headerLayout_descriptionText, "headerLayout_descriptionText");
        ty0.c.b(cVarB0, text, headerLayout_descriptionText, new q(this, text, 0), null, 8);
    }

    public final void setDescriptionTextStyle(@NotNull au0.u style) {
        int i;
        Intrinsics.checkNotNullParameter(style, "style");
        int i2 = au0.v.d[style.ordinal()];
        if (i2 == 1) {
            i = R$attr.internal_textAppearanceEmphasis1;
        } else {
            if (i2 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            i = R$attr.internal_textAppearanceBody2;
        }
        TextView headerLayout_descriptionText = this.C;
        Intrinsics.checkNotNullExpressionValue(headerLayout_descriptionText, "headerLayout_descriptionText");
        l.e(headerLayout_descriptionText, i);
    }

    public void setDescriptionVisible(boolean z) {
        LinearLayout headerLayout_description = this.f57257y;
        Intrinsics.checkNotNullExpressionValue(headerLayout_description, "headerLayout_description");
        headerLayout_description.setVisibility(z ? 0 : 8);
        TextView headerLayout_descriptionText = this.C;
        Intrinsics.checkNotNullExpressionValue(headerLayout_descriptionText, "headerLayout_descriptionText");
        headerLayout_descriptionText.setVisibility(z ? 0 : 8);
    }

    public final void setDescriptionsVisibilityRatio(float visibilityRatio) {
        LinearLayout linearLayout = this.f57257y;
        linearLayout.setAlpha(visibilityRatio);
        TextView textView = this.D;
        textView.setAlpha(visibilityRatio);
        float f = (0.19999999f * visibilityRatio) + 0.8f;
        linearLayout.setPivotX(BitmapDescriptorFactory.HUE_RED);
        linearLayout.setPivotY(linearLayout.getHeight());
        linearLayout.setScaleX(f);
        linearLayout.setScaleY(f);
        textView.setPivotX(BitmapDescriptorFactory.HUE_RED);
        textView.setPivotY(BitmapDescriptorFactory.HUE_RED);
        textView.setScaleX(f);
        textView.setScaleY(f);
        float f4 = (1 - visibilityRatio) * this.f57252r;
        linearLayout.setTranslationY(f4);
        textView.setTranslationY(f4);
    }

    public final void setHeaderTitleMode(@NotNull j0 mode) {
        Intrinsics.checkNotNullParameter(mode, "mode");
        int i = au0.v.f9402h[mode.ordinal()];
        int i2 = 1;
        if (i != 1) {
            if (i == 2) {
                i2 = 3;
            } else {
                if (i != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                i2 = 4;
            }
        }
        this.f57255w.setMaxLines(i2);
    }

    public void setSecondDescriptionClickable(boolean clickable) {
        TextView headerLayout_secondDescriptionText = this.D;
        for (TextView textView : u.c(headerLayout_secondDescriptionText)) {
            textView.setOnTouchListener(null);
            textView.setClickable(false);
        }
        if (clickable) {
            Intrinsics.checkNotNullExpressionValue(headerLayout_secondDescriptionText, "headerLayout_secondDescriptionText");
            headerLayout_secondDescriptionText.setOnTouchListener(new j01.e(new View[]{headerLayout_secondDescriptionText}));
            headerLayout_secondDescriptionText.setMovementMethod(null);
            headerLayout_secondDescriptionText.setClickable(true);
        } else {
            Intrinsics.checkNotNullExpressionValue(headerLayout_secondDescriptionText, "headerLayout_secondDescriptionText");
            kli.a.f(headerLayout_secondDescriptionText, ix0.c0.f169220a);
        }
        Intrinsics.checkNotNullExpressionValue(headerLayout_secondDescriptionText, "headerLayout_secondDescriptionText");
        or0.u.n(headerLayout_secondDescriptionText, headerLayout_secondDescriptionText.isClickable());
    }

    public void setSecondDescriptionColor(int colorAttrId) {
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        this.D.setTextColor(kli.a.s(colorAttrId, context));
    }

    public void setSecondDescriptionText(Clause text) {
        ty0.c cVarB0 = or0.u.k(this).b0();
        TextView headerLayout_secondDescriptionText = this.D;
        Intrinsics.checkNotNullExpressionValue(headerLayout_secondDescriptionText, "headerLayout_secondDescriptionText");
        ty0.c.b(cVarB0, text, headerLayout_secondDescriptionText, new q(this, text, 1), null, 8);
    }

    public void setSecondDescriptionTextStyle(@NotNull e0 style) {
        int i;
        Intrinsics.checkNotNullParameter(style, "style");
        int i2 = au0.v.e[style.ordinal()];
        if (i2 == 1) {
            i = R$attr.internal_textAppearanceEmphasis1;
        } else if (i2 == 2) {
            i = R$attr.internal_textAppearanceBody2;
        } else {
            if (i2 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            i = R$attr.internal_textAppearanceEmphasis2;
        }
        TextView headerLayout_secondDescriptionText = this.D;
        Intrinsics.checkNotNullExpressionValue(headerLayout_secondDescriptionText, "headerLayout_secondDescriptionText");
        l.e(headerLayout_secondDescriptionText, i);
    }

    public void setSecondDescriptionVisible(boolean z) {
        TextView headerLayout_secondDescriptionText = this.D;
        Intrinsics.checkNotNullExpressionValue(headerLayout_secondDescriptionText, "headerLayout_secondDescriptionText");
        headerLayout_secondDescriptionText.setVisibility(z ? 0 : 8);
    }

    public void setThirdDescriptionText(Clause text) {
        ty0.c cVarB0 = or0.u.k(this).b0();
        TextView headerLayout_thirdDescriptionText = this.E;
        Intrinsics.checkNotNullExpressionValue(headerLayout_thirdDescriptionText, "headerLayout_thirdDescriptionText");
        ty0.c.b(cVarB0, text, headerLayout_thirdDescriptionText, new arf.h(29), null, 8);
    }

    public void setThirdDescriptionVisible(boolean z) {
        TextView headerLayout_thirdDescriptionText = this.E;
        Intrinsics.checkNotNullExpressionValue(headerLayout_thirdDescriptionText, "headerLayout_thirdDescriptionText");
        headerLayout_thirdDescriptionText.setVisibility(z ? 0 : 8);
    }

    @Override // au0.f0
    public void setTitle(Clause text, Clause topNote) {
        if (!Intrinsics.f(this.R, text) || this.Q != null) {
            this.R = text;
            h0(text, topNote, ty0.f.f275450a);
        }
        this.f57255w.setTitleEndIconBaseline(b0.CENTER);
        this.Q = null;
    }

    public final void setTitleAutoSize(boolean useAutoSize) {
        this.f57255w.setTitleAutoSize(useAutoSize);
        this.A.setAutoSize(useAutoSize);
    }

    public void setTitleChevron(@NotNull g0 state) {
        LayeredImage layeredImageG0;
        Intrinsics.checkNotNullParameter(state, "state");
        int i = au0.v.f9400c[state.ordinal()];
        if (i == 1) {
            layeredImageG0 = g0(R$drawable.uikit_icn_16_chevron_up);
        } else if (i == 2) {
            layeredImageG0 = g0(R$drawable.uikit_icn_16_chevron_down);
        } else {
            if (i != 3) {
                throw new NoWhenBranchMatchedException();
            }
            layeredImageG0 = null;
        }
        setTitleChevronIcon(layeredImageG0);
    }

    public void setTitleChevronIcon(Image image) {
        this.f57255w.setEndImage(image);
        ImageView headerLayout_chevron = this.H;
        Intrinsics.checkNotNullExpressionValue(headerLayout_chevron, "headerLayout_chevron");
        headerLayout_chevron.setVisibility(image != null ? 0 : 8);
        if (image == null) {
            headerLayout_chevron.setImageDrawable(null);
            return;
        }
        yy0.f fVarQ = or0.u.k(this).Q();
        ImageView headerLayout_chevron2 = this.H;
        Intrinsics.checkNotNullExpressionValue(headerLayout_chevron2, "headerLayout_chevron");
        yy0.f.e(fVarQ, image, headerLayout_chevron2, null, null, 12);
    }

    public void setTitleClickable(boolean clickable) {
        ImageAutoSizeTextView imageAutoSizeTextView = this.f57255w;
        LinearLayout headerLayout_animatedViewContainer = this.f57256x;
        if (!clickable) {
            imageAutoSizeTextView.setOnTextClickListener(null);
            or0.u.p(imageAutoSizeTextView);
            headerLayout_animatedViewContainer.setOnTouchListener(null);
            or0.u.o(headerLayout_animatedViewContainer);
            or0.u.p(headerLayout_animatedViewContainer);
            return;
        }
        imageAutoSizeTextView.setOnTextClickListener(new ar1.c(this, 13));
        headerLayout_animatedViewContainer.setOnClickListener(new r(this, 3));
        s sVar = new s(this, 1);
        imageAutoSizeTextView.setOnLongClickListener(sVar);
        headerLayout_animatedViewContainer.setOnLongClickListener(sVar);
        Intrinsics.checkNotNullExpressionValue(headerLayout_animatedViewContainer, "headerLayout_animatedViewContainer");
        headerLayout_animatedViewContainer.setOnTouchListener(new j01.e(new View[]{headerLayout_animatedViewContainer}));
    }

    public void setTitleColor(int colorAttrId) {
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        int iS = kli.a.s(colorAttrId, context);
        this.f57255w.setTextColor(iS);
        this.A.setTextColor(iS);
    }

    @Override // au0.f0
    public void setTitleDescription(Clause text, Integer endViewId) {
        ty0.c cVarB0 = or0.u.k(this).b0();
        AppCompatTextView headerLayout_titleDescription = this.f57253s;
        Intrinsics.checkNotNullExpressionValue(headerLayout_titleDescription, "headerLayout_titleDescription");
        ty0.c.b(cVarB0, text, headerLayout_titleDescription, null, null, 12);
        if (endViewId != null) {
            ViewGroup.LayoutParams layoutParams = this.f57253s.getLayoutParams();
            Intrinsics.i(layoutParams, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
            ((ConstraintLayout.LayoutParams) layoutParams).endToStart = endViewId.intValue();
        }
    }

    public final void setTitleLeadingIconClickable(boolean clickable) {
        ImageWithAnimatedBackgroundView imageWithAnimatedBackgroundView = this.F;
        if (clickable) {
            imageWithAnimatedBackgroundView.setOnClickListener(new r(this, 4));
            imageWithAnimatedBackgroundView.setOnLongClickListener(new s(this, 2));
        } else {
            Intrinsics.h(imageWithAnimatedBackgroundView);
            or0.u.o(imageWithAnimatedBackgroundView);
            or0.u.p(imageWithAnimatedBackgroundView);
        }
    }

    public final void setTitleStyle(@NotNull k0 style) {
        int i;
        int iK;
        Intrinsics.checkNotNullParameter(style, "style");
        ImageAutoSizeTextView headerLayout_chevronTextView = this.f57255w;
        headerLayout_chevronTextView.setHeaderTitleStyle(style);
        if (!this.W) {
            if (au0.v.f[style.ordinal()] == 1) {
                Context context = getContext();
                Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                iK = kli.a.k(context, BitmapDescriptorFactory.HUE_RED);
            } else {
                Context context2 = getContext();
                Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
                iK = kli.a.k(context2, 8.0f);
            }
            Intrinsics.checkNotNullExpressionValue(headerLayout_chevronTextView, "headerLayout_chevronTextView");
            knm.b.x(iK, headerLayout_chevronTextView);
        }
        int i2 = au0.v.f[style.ordinal()];
        if (i2 == 1) {
            i = R$attr.internal_textAppearanceEmphasis1;
        } else if (i2 == 2) {
            i = R$attr.internal_textAppearanceHeading1;
        } else if (i2 == 3) {
            i = R$attr.internal_textAppearanceHeading2;
        } else if (i2 == 4) {
            i = R$attr.internal_textAppearanceHeading1;
        } else {
            if (i2 != 5) {
                throw new NoWhenBranchMatchedException();
            }
            i = R$attr.internal_textAppearanceHeading3;
        }
        this.A.setTextAppearance(i);
    }

    public void setTitleTag(TagViewData tagViewData) {
        setupTitleTag(tagViewData);
    }

    public void setTitleTopDescription(Clause text) {
        ty0.c cVarB0 = or0.u.k(this).b0();
        AppCompatTextView headerLayout_titleTopDescription = this.f57254t;
        Intrinsics.checkNotNullExpressionValue(headerLayout_titleTopDescription, "headerLayout_titleTopDescription");
        ty0.c.b(cVarB0, text, headerLayout_titleTopDescription, null, null, 12);
    }

    public void setTitleTopDescriptionImage(i0 image) {
        if (image != null) {
            int iI0 = i0(image.f275158b);
            ImageView headerLayout_titleTopDescriptionImage = this.u;
            Intrinsics.checkNotNullExpressionValue(headerLayout_titleTopDescriptionImage, "headerLayout_titleTopDescriptionImage");
            ViewGroup.LayoutParams layoutParams = headerLayout_titleTopDescriptionImage.getLayoutParams();
            if (layoutParams == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
            }
            layoutParams.width = iI0;
            layoutParams.height = iI0;
            headerLayout_titleTopDescriptionImage.setLayoutParams(layoutParams);
        }
        yy0.f fVarQ = or0.u.k(this).Q();
        Image image2 = image != null ? image.f275157a : null;
        ImageView headerLayout_titleTopDescriptionImage2 = this.u;
        Intrinsics.checkNotNullExpressionValue(headerLayout_titleTopDescriptionImage2, "headerLayout_titleTopDescriptionImage");
        yy0.f.e(fVarQ, image2, headerLayout_titleTopDescriptionImage2, null, null, 12);
    }

    public void setTitleTopDescriptionImageVisible(boolean z) {
        ImageView headerLayout_titleTopDescriptionImage = this.u;
        Intrinsics.checkNotNullExpressionValue(headerLayout_titleTopDescriptionImage, "headerLayout_titleTopDescriptionImage");
        headerLayout_titleTopDescriptionImage.setVisibility(z ? 0 : 8);
    }

    public void setTitleTopDescriptionVisible(boolean z) {
        AppCompatTextView headerLayout_titleTopDescription = this.f57254t;
        Intrinsics.checkNotNullExpressionValue(headerLayout_titleTopDescription, "headerLayout_titleTopDescription");
        headerLayout_titleTopDescription.setVisibility(z ? 0 : 8);
    }

    public void setTitleVisible(boolean z) {
        ImageAutoSizeTextView headerLayout_chevronTextView = this.f57255w;
        Intrinsics.checkNotNullExpressionValue(headerLayout_chevronTextView, "headerLayout_chevronTextView");
        headerLayout_chevronTextView.setVisibility(z ? 0 : 8);
    }

    public final void setTitleWithLeadingIcon(Clause text, @NotNull ImageWithAnimatedBackgroundView.Model image, boolean displayBadgeDot, CircleBadgeModel statusBadge) {
        Intrinsics.checkNotNullParameter(image, "image");
        ImageAutoSizeTextView headerLayout_chevronTextView = this.f57255w;
        Intrinsics.checkNotNullExpressionValue(headerLayout_chevronTextView, "headerLayout_chevronTextView");
        ImageAutoSizeTextView.setText$default(headerLayout_chevronTextView, text, null, 2, null);
        Intrinsics.checkNotNullExpressionValue(headerLayout_chevronTextView, "headerLayout_chevronTextView");
        headerLayout_chevronTextView.setVisibility(text == null ? 4 : 0);
        AnimatedNumbersView headerLayout_animatedTextView = this.A;
        Intrinsics.checkNotNullExpressionValue(headerLayout_animatedTextView, "headerLayout_animatedTextView");
        headerLayout_animatedTextView.setVisibility(4);
        ImageWithAnimatedBackgroundView headerLayout_titleIcon = this.F;
        Intrinsics.checkNotNullExpressionValue(headerLayout_titleIcon, "headerLayout_titleIcon");
        headerLayout_titleIcon.setVisibility(0);
        ImageView headerLayout_titleIconBadgeDot = this.G;
        Intrinsics.checkNotNullExpressionValue(headerLayout_titleIconBadgeDot, "headerLayout_titleIconBadgeDot");
        headerLayout_titleIconBadgeDot.setVisibility(displayBadgeDot ? 0 : 8);
        this.K.setBadgeAndVisibility(statusBadge, this.cutoutStage);
        headerLayout_titleIcon.setModel(image);
    }

    public final void setTopDescriptionClickable$ui_kit_components_release(boolean clickable) {
        AppCompatTextView headerLayout_titleTopNote = this.v;
        AppCompatTextView headerLayout_titleTopDescription = this.f57254t;
        if (clickable) {
            Intrinsics.checkNotNullExpressionValue(headerLayout_titleTopDescription, "headerLayout_titleTopDescription");
            headerLayout_titleTopDescription.setOnTouchListener(new j01.e(new View[]{headerLayout_titleTopDescription}));
            Intrinsics.checkNotNullExpressionValue(headerLayout_titleTopNote, "headerLayout_titleTopNote");
            headerLayout_titleTopNote.setOnTouchListener(new j01.e(new View[]{headerLayout_titleTopNote}));
            headerLayout_titleTopDescription.setOnClickListener(new r(this, 0));
            headerLayout_titleTopNote.setOnClickListener(new r(this, 1));
            return;
        }
        Intrinsics.checkNotNullExpressionValue(headerLayout_titleTopDescription, "headerLayout_titleTopDescription");
        or0.u.o(headerLayout_titleTopDescription);
        Intrinsics.checkNotNullExpressionValue(headerLayout_titleTopNote, "headerLayout_titleTopNote");
        or0.u.o(headerLayout_titleTopNote);
        headerLayout_titleTopDescription.setOnTouchListener(null);
        headerLayout_titleTopNote.setOnTouchListener(null);
    }

    public final void setUseAnimatedTitle(boolean z) {
        ConstraintLayout.LayoutParams layoutParams;
        if (z == this.useAnimatedTitle) {
            return;
        }
        this.useAnimatedTitle = z;
        View view = this.z;
        LinearLayout linearLayout = this.f57257y;
        AppCompatTextView appCompatTextView = this.f57253s;
        LinearLayout headerLayout_animatedViewContainer = this.f57256x;
        ImageAutoSizeTextView headerLayout_chevronTextView = this.f57255w;
        if (z) {
            Intrinsics.checkNotNullExpressionValue(headerLayout_chevronTextView, "headerLayout_chevronTextView");
            headerLayout_chevronTextView.setVisibility(8);
            Intrinsics.checkNotNullExpressionValue(headerLayout_animatedViewContainer, "headerLayout_animatedViewContainer");
            headerLayout_animatedViewContainer.setVisibility(0);
            ViewGroup.LayoutParams layoutParams2 = linearLayout.getLayoutParams();
            Intrinsics.i(layoutParams2, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
            ((ConstraintLayout.LayoutParams) layoutParams2).topToBottom = headerLayout_animatedViewContainer.getId();
            ViewGroup.LayoutParams layoutParams3 = view != null ? view.getLayoutParams() : null;
            layoutParams = layoutParams3 instanceof ConstraintLayout.LayoutParams ? (ConstraintLayout.LayoutParams) layoutParams3 : null;
            if (layoutParams != null) {
                layoutParams.topToTop = headerLayout_animatedViewContainer.getId();
                layoutParams.bottomToBottom = headerLayout_animatedViewContainer.getId();
            }
            ViewGroup.LayoutParams layoutParams4 = appCompatTextView.getLayoutParams();
            Intrinsics.i(layoutParams4, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
            ((ConstraintLayout.LayoutParams) layoutParams4).startToEnd = headerLayout_animatedViewContainer.getId();
            ViewGroup.LayoutParams layoutParams5 = appCompatTextView.getLayoutParams();
            Intrinsics.i(layoutParams5, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
            ((ConstraintLayout.LayoutParams) layoutParams5).bottomToBottom = headerLayout_animatedViewContainer.getId();
        } else {
            Intrinsics.checkNotNullExpressionValue(headerLayout_chevronTextView, "headerLayout_chevronTextView");
            headerLayout_chevronTextView.setVisibility(0);
            Intrinsics.checkNotNullExpressionValue(headerLayout_animatedViewContainer, "headerLayout_animatedViewContainer");
            headerLayout_animatedViewContainer.setVisibility(8);
            ViewGroup.LayoutParams layoutParams6 = linearLayout.getLayoutParams();
            Intrinsics.i(layoutParams6, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
            ((ConstraintLayout.LayoutParams) layoutParams6).topToBottom = headerLayout_chevronTextView.getId();
            ViewGroup.LayoutParams layoutParams7 = view != null ? view.getLayoutParams() : null;
            layoutParams = layoutParams7 instanceof ConstraintLayout.LayoutParams ? (ConstraintLayout.LayoutParams) layoutParams7 : null;
            if (layoutParams != null) {
                layoutParams.topToTop = headerLayout_chevronTextView.getId();
                layoutParams.bottomToBottom = headerLayout_chevronTextView.getId();
            }
            ViewGroup.LayoutParams layoutParams8 = appCompatTextView.getLayoutParams();
            Intrinsics.i(layoutParams8, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
            ((ConstraintLayout.LayoutParams) layoutParams8).startToEnd = headerLayout_chevronTextView.getId();
            ViewGroup.LayoutParams layoutParams9 = appCompatTextView.getLayoutParams();
            Intrinsics.i(layoutParams9, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
            ((ConstraintLayout.LayoutParams) layoutParams9).bottomToBottom = headerLayout_chevronTextView.getId();
        }
        requestLayout();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ConstraintHeaderLayout(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public void setDescriptionClickable(@NotNull c0 clickableMode) {
        Intrinsics.checkNotNullParameter(clickableMode, "clickableMode");
        LinearLayout linearLayout = this.f57257y;
        TextView headerLayout_descriptionText = this.C;
        ImageView headerLayout_descriptionIcon = this.B;
        for (View view : v.k(linearLayout, headerLayout_descriptionText, headerLayout_descriptionIcon)) {
            view.setOnTouchListener(null);
            view.setClickable(false);
            view.setLongClickable(false);
        }
        int i = au0.v.f9399b[clickableMode.ordinal()];
        if (i == 1) {
            Intrinsics.checkNotNullExpressionValue(headerLayout_descriptionText, "headerLayout_descriptionText");
            kli.a.f(headerLayout_descriptionText, ix0.c0.f169220a);
        } else if (i == 2) {
            headerLayout_descriptionText.setClickable(true);
            headerLayout_descriptionText.setLongClickable(true);
            Intrinsics.checkNotNullExpressionValue(headerLayout_descriptionText, "headerLayout_descriptionText");
            headerLayout_descriptionText.setOnTouchListener(new j01.e(new View[]{headerLayout_descriptionText}));
            headerLayout_descriptionText.setMovementMethod(null);
        } else if (i == 3) {
            headerLayout_descriptionIcon.setClickable(true);
            Intrinsics.checkNotNullExpressionValue(headerLayout_descriptionIcon, "headerLayout_descriptionIcon");
            headerLayout_descriptionIcon.setOnTouchListener(new j01.e(new View[]{headerLayout_descriptionIcon}));
            headerLayout_descriptionText.setMovementMethod(null);
        } else {
            if (i != 4) {
                throw new NoWhenBranchMatchedException();
            }
            linearLayout.setClickable(true);
            Intrinsics.checkNotNullExpressionValue(headerLayout_descriptionIcon, "headerLayout_descriptionIcon");
            Intrinsics.checkNotNullExpressionValue(headerLayout_descriptionText, "headerLayout_descriptionText");
            linearLayout.setOnTouchListener(new j01.e(new View[]{headerLayout_descriptionIcon, headerLayout_descriptionText}));
            headerLayout_descriptionText.setMovementMethod(null);
        }
        Intrinsics.checkNotNullExpressionValue(headerLayout_descriptionText, "headerLayout_descriptionText");
        or0.u.n(headerLayout_descriptionText, linearLayout.isClickable() || headerLayout_descriptionText.isClickable());
    }

    @Override // au0.f0
    public void setDescriptionImage(i0 image, ProgressStyle progress, boolean imageBadgeVisible) {
        int iW;
        ImageView headerLayout_badgeDot = this.J;
        ImageView headerLayout_descriptionIcon = this.B;
        if (image != null) {
            int iI0 = i0(image.f275158b);
            if (headerLayout_descriptionIcon.getLayoutParams().width != iI0) {
                Intrinsics.checkNotNullExpressionValue(headerLayout_descriptionIcon, "headerLayout_descriptionIcon");
                ViewGroup.LayoutParams layoutParams = headerLayout_descriptionIcon.getLayoutParams();
                if (layoutParams == null) {
                    throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                }
                layoutParams.width = iI0;
                layoutParams.height = iI0;
                headerLayout_descriptionIcon.setLayoutParams(layoutParams);
            }
            Intrinsics.checkNotNullExpressionValue(headerLayout_descriptionIcon, "headerLayout_descriptionIcon");
            headerLayout_descriptionIcon.setVisibility(0);
            Intrinsics.checkNotNullExpressionValue(headerLayout_badgeDot, "headerLayout_badgeDot");
            headerLayout_badgeDot.setVisibility(imageBadgeVisible ? 0 : 8);
            yy0.f fVarQ = or0.u.k(this).Q();
            Image image2 = image.f275157a;
            ImageView headerLayout_descriptionIcon2 = this.B;
            Intrinsics.checkNotNullExpressionValue(headerLayout_descriptionIcon2, "headerLayout_descriptionIcon");
            yy0.f.e(fVarQ, image2, headerLayout_descriptionIcon2, null, null, 12);
        } else {
            Intrinsics.checkNotNullExpressionValue(headerLayout_badgeDot, "headerLayout_badgeDot");
            headerLayout_badgeDot.setVisibility(8);
            Intrinsics.checkNotNullExpressionValue(headerLayout_descriptionIcon, "headerLayout_descriptionIcon");
            headerLayout_descriptionIcon.setVisibility(8);
        }
        if (progress == null && image == null) {
            iW = 0;
        } else {
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            iW = kli.a.w(R$attr.uikit_dp8, context);
        }
        FrameLayout descriptionContainer = this.L;
        Intrinsics.checkNotNullExpressionValue(descriptionContainer, "descriptionContainer");
        descriptionContainer.setPaddingRelative(descriptionContainer.getPaddingStart(), descriptionContainer.getPaddingTop(), iW, descriptionContainer.getPaddingBottom());
        CircleProgressBar headerLayout_descriptionProgress = this.M;
        if (progress != null) {
            Intrinsics.checkNotNullExpressionValue(headerLayout_descriptionProgress, "headerLayout_descriptionProgress");
            headerLayout_descriptionProgress.a(progress);
        }
        Intrinsics.checkNotNullExpressionValue(headerLayout_descriptionProgress, "headerLayout_descriptionProgress");
        headerLayout_descriptionProgress.setVisibility(progress != null ? 0 : 8);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConstraintHeaderLayout(@NotNull Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f57243b = v0.a.d("create(...)");
        this.f = v0.a.d("create(...)");
        this.f57244g = v0.a.d("create(...)");
        this.f57245h = v0.a.d("create(...)");
        this.i = v0.a.d("create(...)");
        this.f57246j = v0.a.d("create(...)");
        this.k = v0.a.d("create(...)");
        this.f57247l = v0.a.d("create(...)");
        this.f57248m = v0.a.d("create(...)");
        this.f57249n = v0.a.d("create(...)");
        this.o = v0.a.d("create(...)");
        this.f57250p = v0.a.d("create(...)");
        this.f57251q = Unit.f186387a;
        this.f57252r = -kli.a.k(context, 16.0f);
        View.inflate(context, R$layout.internal_view_header_layout, this);
        this.f57253s = (AppCompatTextView) findViewById(R$id.headerLayout_titleDescription);
        this.f57254t = (AppCompatTextView) findViewById(R$id.headerLayout_titleTopDescription);
        this.u = (ImageView) findViewById(R$id.headerLayout_titleTopDescriptionImage);
        this.v = (AppCompatTextView) findViewById(R$id.headerLayout_titleTopNote);
        this.f57255w = (ImageAutoSizeTextView) findViewById(R$id.headerLayout_chevronTextView);
        this.f57256x = (LinearLayout) findViewById(R$id.headerLayout_animatedViewContainer);
        LinearLayout linearLayout = (LinearLayout) findViewById(R$id.headerLayout_description);
        this.f57257y = linearLayout;
        this.z = findViewById(R$id.headerExtraContainer);
        this.A = (AnimatedNumbersView) findViewById(R$id.headerLayout_animatedTextView);
        ImageView headerLayout_descriptionIcon = (ImageView) findViewById(R$id.headerLayout_descriptionIcon);
        this.B = headerLayout_descriptionIcon;
        TextView headerLayout_descriptionText = (TextView) findViewById(R$id.headerLayout_descriptionText);
        this.C = headerLayout_descriptionText;
        TextView headerLayout_secondDescriptionText = (TextView) findViewById(R$id.headerLayout_secondDescriptionText);
        this.D = headerLayout_secondDescriptionText;
        this.E = (TextView) findViewById(R$id.headerLayout_thirdDescriptionText);
        ImageWithAnimatedBackgroundView imageWithAnimatedBackgroundView = (ImageWithAnimatedBackgroundView) findViewById(R$id.headerLayout_titleIcon);
        this.F = imageWithAnimatedBackgroundView;
        this.G = (ImageView) findViewById(R$id.headerLayout_titleIconBadgeDot);
        this.H = (ImageView) findViewById(R$id.headerLayout_chevron);
        this.I = (CountDownTextView) findViewById(R$id.headerLayout_countDown);
        this.J = (ImageView) findViewById(R$id.headerLayout_badgeDot);
        this.K = (CircleBadgeView) findViewById(R$id.headerLayout_statusBadgeIcon);
        this.L = (FrameLayout) findViewById(R$id.descriptionContainer);
        this.M = (CircleProgressBar) findViewById(R$id.headerLayout_descriptionProgress);
        this.P = w.y0(new p(this, 0));
        this.S = i.j(4);
        this.cutoutStage = new l0(this, v.k(imageWithAnimatedBackgroundView.getCutoutImageCutoutReceiver(), new ix0.k0(new p(this, 2))));
        setTitleClickable(false);
        setTitleLeadingIconClickable(false);
        linearLayout.setOnClickListener(new r(this, 2));
        linearLayout.setOnLongClickListener(new s(this, 0));
        Intrinsics.checkNotNullExpressionValue(headerLayout_descriptionIcon, "headerLayout_descriptionIcon");
        m.a(headerLayout_descriptionIcon);
        headerLayout_descriptionIcon.setOnClickListener(new au0.w(this, this, 0));
        Intrinsics.checkNotNullExpressionValue(headerLayout_descriptionText, "headerLayout_descriptionText");
        m.a(headerLayout_descriptionText);
        headerLayout_descriptionText.setOnClickListener(new au0.w(this, this, 1));
        Intrinsics.checkNotNullExpressionValue(headerLayout_secondDescriptionText, "headerLayout_secondDescriptionText");
        m.a(headerLayout_secondDescriptionText);
        headerLayout_secondDescriptionText.setOnClickListener(new au0.w(this, this, 2));
        setDescriptionClickable(false);
        setSecondDescriptionClickable(false);
        setClipChildren(false);
    }

    public void setTitle(d0 compositeTitle) {
        if (!Intrinsics.f(this.Q, compositeTitle) || this.R != null) {
            this.Q = compositeTitle;
            h0(compositeTitle != null ? new CompositeClause(v.k(n0(compositeTitle.f9162a, db.HEADING1), n0(compositeTitle.f9163b, db.HEADING3)), compositeTitle.f9164c, null, null, 12) : null, null, ty0.d.f275448a);
        }
        this.f57255w.setTitleEndIconBaseline(b0.BOTTOM);
        this.R = null;
    }

    public /* synthetic */ ConstraintHeaderLayout(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i & 2) != 0 ? null : attributeSet, 0);
    }
}
