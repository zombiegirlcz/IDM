package com.revolut.core.ui_kit.views;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.view.ViewCompat;
import au0.q4;
import aw0.o9;
import com.facebook.shimmer.ShimmerFrameLayout;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.bitmap_effects.BitmapEffects;
import com.revolut.core.extensions.rx.BreadcrumbException;
import com.revolut.core.ui_kit.R$id;
import com.revolut.core.ui_kit.R$layout;
import com.revolut.core.ui_kit.internal.views.tag.TagView;
import com.revolut.core.ui_kit.internal.views.tag.TagViewData;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.views.NewRevolutCardView;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.BitmapImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$color;
import efm.c0;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import mx0.pa;
import mx0.qa;
import mx0.ra;
import mx0.s2;
import mx0.sa;
import mx0.ta;
import mx0.ua;
import mx0.va;
import mx0.wa;
import org.jetbrains.annotations.NotNull;
import org.joda.time.LocalDate;
import zhm.f0;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000¢\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b$\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 ²\u00012\u00020\u0001:\u0004'\u001e\fGB'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJM\u0010\u0014\u001a\u00020\u00112\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\u0010\r\u001a\u0004\u0018\u00010\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0010\b\u0002\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u00102\u0010\b\u0002\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0010¢\u0006\u0004\b\u0014\u0010\u0015J'\u0010\u0016\u001a\u00020\u00112\u0006\u0010\u000b\u001a\u00020\n2\u0010\b\u0002\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0010¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0018\u001a\u00020\u00112\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001c\u001a\u00020\u00112\b\u0010\u001b\u001a\u0004\u0018\u00010\u001a¢\u0006\u0004\b\u001c\u0010\u001dJ\u0015\u0010 \u001a\u00020\u00112\u0006\u0010\u001f\u001a\u00020\u001e¢\u0006\u0004\b \u0010!J\u0017\u0010#\u001a\u00020\u00112\b\u0010\"\u001a\u0004\u0018\u00010\u001a¢\u0006\u0004\b#\u0010\u001dJ\u0015\u0010$\u001a\u00020\u00112\u0006\u0010\u001f\u001a\u00020\u001e¢\u0006\u0004\b$\u0010!J\u0017\u0010&\u001a\u00020\u00112\b\u0010%\u001a\u0004\u0018\u00010\u001a¢\u0006\u0004\b&\u0010\u001dJ\u0015\u0010)\u001a\u00020\u00112\u0006\u0010(\u001a\u00020'¢\u0006\u0004\b)\u0010*J\u0017\u0010-\u001a\u00020\u00112\b\u0010,\u001a\u0004\u0018\u00010+¢\u0006\u0004\b-\u0010.J\u0015\u00100\u001a\u00020\u00112\u0006\u0010/\u001a\u00020\u000e¢\u0006\u0004\b0\u00101J\u0015\u00102\u001a\u00020\u00112\u0006\u0010\u001f\u001a\u00020\u001e¢\u0006\u0004\b2\u0010!J\u0017\u00104\u001a\u00020\u00112\b\b\u0001\u00103\u001a\u00020\u0006¢\u0006\u0004\b4\u00105J\u0017\u00106\u001a\u00020\u00112\b\b\u0001\u00103\u001a\u00020\u0006¢\u0006\u0004\b6\u00105J\u0017\u00107\u001a\u00020\u00112\b\b\u0001\u00103\u001a\u00020\u0006¢\u0006\u0004\b7\u00105J\u0017\u00108\u001a\u00020\u00112\b\b\u0001\u00103\u001a\u00020\u0006¢\u0006\u0004\b8\u00105J\u0017\u0010;\u001a\u00020\u00112\b\u0010:\u001a\u0004\u0018\u000109¢\u0006\u0004\b;\u0010<J\u0017\u0010=\u001a\u00020\u00112\b\u0010:\u001a\u0004\u0018\u000109¢\u0006\u0004\b=\u0010<J\u0017\u0010>\u001a\u00020\u00112\b\u0010:\u001a\u0004\u0018\u000109¢\u0006\u0004\b>\u0010<J\u0017\u0010?\u001a\u00020\u00112\b\u0010:\u001a\u0004\u0018\u000109¢\u0006\u0004\b?\u0010<J\u0017\u0010@\u001a\u00020\u00112\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b@\u0010AJ\u0015\u0010C\u001a\u00020\u00112\u0006\u0010B\u001a\u00020\u0006¢\u0006\u0004\bC\u00105J\u0017\u0010E\u001a\u00020\u00112\u0006\u0010D\u001a\u00020\u000eH\u0016¢\u0006\u0004\bE\u00101R\u001b\u0010K\u001a\u00020F8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bG\u0010H\u001a\u0004\bI\u0010JR\u001b\u0010P\u001a\u00020L8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bM\u0010H\u001a\u0004\bN\u0010OR\u001b\u0010V\u001a\u00020Q8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bR\u0010S\u001a\u0004\bT\u0010UR\u001b\u0010Y\u001a\u00020Q8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bW\u0010S\u001a\u0004\bX\u0010UR\u001b\u0010\\\u001a\u00020Q8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bZ\u0010S\u001a\u0004\b[\u0010UR\u001b\u0010a\u001a\u00020]8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b^\u0010S\u001a\u0004\b_\u0010`R\u001b\u0010d\u001a\u00020]8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bb\u0010S\u001a\u0004\bc\u0010`R\u001b\u0010g\u001a\u00020]8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\be\u0010S\u001a\u0004\bf\u0010`R\u001b\u0010k\u001a\u00020\u00018BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bh\u0010S\u001a\u0004\bi\u0010jR\u001b\u0010n\u001a\u00020]8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bl\u0010S\u001a\u0004\bm\u0010`R\u001b\u0010q\u001a\u00020]8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bo\u0010S\u001a\u0004\bp\u0010`R\u001b\u0010v\u001a\u00020r8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bs\u0010S\u001a\u0004\bt\u0010uR\u001b\u0010y\u001a\u00020r8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bw\u0010S\u001a\u0004\bx\u0010uR\u001b\u0010,\u001a\u00020r8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bz\u0010S\u001a\u0004\b{\u0010uR\u001b\u0010~\u001a\u00020r8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b|\u0010S\u001a\u0004\b}\u0010uR\u001d\u0010\u0081\u0001\u001a\u00020r8BX\u0082\u0084\u0002¢\u0006\r\n\u0004\b\u007f\u0010S\u001a\u0005\b\u0080\u0001\u0010uR\u001e\u0010\u0084\u0001\u001a\u00020r8BX\u0082\u0084\u0002¢\u0006\u000e\n\u0005\b\u0082\u0001\u0010S\u001a\u0005\b\u0083\u0001\u0010uR\u001e\u0010\u0087\u0001\u001a\u00020r8BX\u0082\u0084\u0002¢\u0006\u000e\n\u0005\b\u0085\u0001\u0010S\u001a\u0005\b\u0086\u0001\u0010uR\u001e\u0010\u008a\u0001\u001a\u00020r8BX\u0082\u0084\u0002¢\u0006\u000e\n\u0005\b\u0088\u0001\u0010S\u001a\u0005\b\u0089\u0001\u0010uR\u001e\u0010\u008d\u0001\u001a\u00020r8BX\u0082\u0084\u0002¢\u0006\u000e\n\u0005\b\u008b\u0001\u0010S\u001a\u0005\b\u008c\u0001\u0010uR\u001e\u0010\u0090\u0001\u001a\u00020r8BX\u0082\u0084\u0002¢\u0006\u000e\n\u0005\b\u008e\u0001\u0010S\u001a\u0005\b\u008f\u0001\u0010uR\u001e\u0010\u0093\u0001\u001a\u00020]8BX\u0082\u0084\u0002¢\u0006\u000e\n\u0005\b\u0091\u0001\u0010S\u001a\u0005\b\u0092\u0001\u0010`R\u001e\u0010\u0096\u0001\u001a\u00020]8BX\u0082\u0084\u0002¢\u0006\u000e\n\u0005\b\u0094\u0001\u0010S\u001a\u0005\b\u0095\u0001\u0010`R \u0010\u009b\u0001\u001a\u00030\u0097\u00018BX\u0082\u0084\u0002¢\u0006\u000f\n\u0005\b\u0098\u0001\u0010S\u001a\u0006\b\u0099\u0001\u0010\u009a\u0001R \u0010\u009e\u0001\u001a\u00030\u0097\u00018BX\u0082\u0084\u0002¢\u0006\u000f\n\u0005\b\u009c\u0001\u0010S\u001a\u0006\b\u009d\u0001\u0010\u009a\u0001R \u0010¡\u0001\u001a\u00030\u0097\u00018BX\u0082\u0084\u0002¢\u0006\u000f\n\u0005\b\u009f\u0001\u0010S\u001a\u0006\b \u0001\u0010\u009a\u0001R \u0010¤\u0001\u001a\u00030\u0097\u00018BX\u0082\u0084\u0002¢\u0006\u000f\n\u0005\b¢\u0001\u0010S\u001a\u0006\b£\u0001\u0010\u009a\u0001R \u0010©\u0001\u001a\u00030¥\u00018BX\u0082\u0084\u0002¢\u0006\u000f\n\u0005\b¦\u0001\u0010S\u001a\u0006\b§\u0001\u0010¨\u0001R \u0010®\u0001\u001a\u00030ª\u00018BX\u0082\u0084\u0002¢\u0006\u000f\n\u0005\b«\u0001\u0010H\u001a\u0006\b¬\u0001\u0010\u00ad\u0001R \u0010±\u0001\u001a\u00030ª\u00018BX\u0082\u0084\u0002¢\u0006\u000f\n\u0005\b¯\u0001\u0010H\u001a\u0006\b°\u0001\u0010\u00ad\u0001¨\u0006³\u0001"}, d2 = {"Lcom/revolut/core/ui_kit/views/NewRevolutCardView;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyle", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lcom/revolut/core/ui_kit_core/displayers/image/Image;", "image", "Lmx0/ta;", "cardOverlayType", "", "showPendingState", "Lkotlin/Function0;", "", "onErrorAction", "onSuccessAction", "setCardFrontImage", "(Lcom/revolut/core/ui_kit_core/displayers/image/Image;Lmx0/ta;ZLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)V", "setCardBackImage", "(Lcom/revolut/core/ui_kit_core/displayers/image/Image;Lkotlin/jvm/functions/Function0;)V", "setCustomisationImage", "(Lcom/revolut/core/ui_kit_core/displayers/image/Image;)V", "Lcom/revolut/core/ui_kit/models/Clause;", "label", "setCardLabel", "(Lcom/revolut/core/ui_kit/models/Clause;)V", "Lmx0/ua;", "textAppearance", "setCardLabelTextAppearance", "(Lmx0/ua;)V", "cardType", "setCardTypeLabel", "setCardTypeLabelTextAppearance", "name", "setCardHolderName", "Lmx0/qa;", "style", "setCardHolderNameStyle", "(Lmx0/qa;)V", "", "lastFour", "setLastFour", "(Ljava/lang/String;)V", "visible", "setLastFourVisible", "(Z)V", "setLastFourTextAppearance", "color", "setFrontPrimaryColor", "(I)V", "setBackPrimaryColor", "setFrontSecondaryColor", "setBackSecondaryColor", "Lcom/revolut/core/ui_kit/internal/views/tag/TagViewData;", "tagData", "setFrontCardTag", "(Lcom/revolut/core/ui_kit/internal/views/tag/TagViewData;)V", "setBackCardTag", "setFrontSecondaryCardTag", "setBackSecondaryCardTag", "setCardOverlay", "(Lmx0/ta;)V", "width", "setCardWidth", "clickable", "setClickable", "Lcom/revolut/bitmap_effects/BitmapEffects;", "a", "Lkotlin/Lazy;", "getBitmapEffects", "()Lcom/revolut/bitmap_effects/BitmapEffects;", "bitmapEffects", "Lto0/c;", "b", "getBitmapBlurProcessor", "()Lto0/c;", "bitmapBlurProcessor", "Landroidx/constraintlayout/widget/ConstraintLayout;", "u", "Le8/q;", "getFrontView", "()Landroidx/constraintlayout/widget/ConstraintLayout;", "frontView", "v", "getBackView", "backView", "w", "getCardDetailsView", "cardDetailsView", "Landroidx/appcompat/widget/AppCompatImageView;", "x", "getCardFrontImage", "()Landroidx/appcompat/widget/AppCompatImageView;", "cardFrontImage", "y", "getCardBackImage", "cardBackImage", "z", "getCardCustomisationImage", "cardCustomisationImage", "A", "getCardOverlayContainer", "()Landroid/widget/FrameLayout;", "cardOverlayContainer", "B", "getOverlayView", "overlayView", "C", "getCardOverlayIcon", "cardOverlayIcon", "Landroidx/appcompat/widget/AppCompatTextView;", "D", "getCardLabel", "()Landroidx/appcompat/widget/AppCompatTextView;", "cardLabel", "E", "getCardTypeLabel", "cardTypeLabel", "F", "getLastFour", "G", "getCardHolderName", "cardHolderName", "H", "getCardNumber", "cardNumber", "I", "getExpiryDate", "expiryDate", "J", "getCvv", "cvv", "K", "getCardNumberLabel", "cardNumberLabel", "L", "getExpiryDateLabel", "expiryDateLabel", "M", "getCvvLabel", "cvvLabel", "N", "getCopyCardNumberIcon", "copyCardNumberIcon", "O", "getCopyCvvIcon", "copyCvvIcon", "Lcom/revolut/core/ui_kit/internal/views/tag/TagView;", "P", "getCardFrontTag", "()Lcom/revolut/core/ui_kit/internal/views/tag/TagView;", "cardFrontTag", "Q", "getCardSecondaryFrontTag", "cardSecondaryFrontTag", "R", "getCardBackTag", "cardBackTag", "S", "getCardSecondaryBackTag", "cardSecondaryBackTag", "Lcom/facebook/shimmer/ShimmerFrameLayout;", "T", "getShimmerView", "()Lcom/facebook/shimmer/ShimmerFrameLayout;", "shimmerView", "Lj01/e;", "U", "getCopyCardViewHighlightListener", "()Lj01/e;", "copyCardViewHighlightListener", "V", "getCopyCvvViewHighlightListener", "copyCvvViewHighlightListener", "Companion", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class NewRevolutCardView extends FrameLayout {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: A, reason: from kotlin metadata */
    public final e8.q cardOverlayContainer;

    /* JADX INFO: renamed from: B, reason: from kotlin metadata */
    public final e8.q overlayView;

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    public final e8.q cardOverlayIcon;

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    public final e8.q cardLabel;

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    public final e8.q cardTypeLabel;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    public final e8.q lastFour;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    public final e8.q cardHolderName;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    public final e8.q cardNumber;

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    public final e8.q expiryDate;

    /* JADX INFO: renamed from: J, reason: from kotlin metadata */
    public final e8.q cvv;

    /* JADX INFO: renamed from: K, reason: from kotlin metadata */
    public final e8.q cardNumberLabel;

    /* JADX INFO: renamed from: L, reason: from kotlin metadata */
    public final e8.q expiryDateLabel;

    /* JADX INFO: renamed from: M, reason: from kotlin metadata */
    public final e8.q cvvLabel;

    /* JADX INFO: renamed from: N, reason: from kotlin metadata */
    public final e8.q copyCardNumberIcon;

    /* JADX INFO: renamed from: O, reason: from kotlin metadata */
    public final e8.q copyCvvIcon;

    /* JADX INFO: renamed from: P, reason: from kotlin metadata */
    public final e8.q cardFrontTag;

    /* JADX INFO: renamed from: Q, reason: from kotlin metadata */
    public final e8.q cardSecondaryFrontTag;

    /* JADX INFO: renamed from: R, reason: from kotlin metadata */
    public final e8.q cardBackTag;

    /* JADX INFO: renamed from: S, reason: from kotlin metadata */
    public final e8.q cardSecondaryBackTag;

    /* JADX INFO: renamed from: T, reason: from kotlin metadata */
    public final e8.q shimmerView;
    public final Object U;
    public final Object V;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public final Lazy bitmapEffects;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public final Lazy bitmapBlurProcessor;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ihm.f f58795c;
    public final ihm.f d;
    public final ihm.f e;
    public final ihm.f f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ihm.f f58796g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ihm.f f58797h;
    public final ihm.f i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final float f58798j;
    public final kq0.a k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Handler f58799l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final im.c f58800m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public ofm.i f58801n;
    public gu0.a o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public ta f58802p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f58803q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public Integer f58804r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public Integer f58805s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public qa f58806t;

    /* JADX INFO: renamed from: u, reason: from kotlin metadata */
    public final e8.q frontView;

    /* JADX INFO: renamed from: v, reason: from kotlin metadata */
    public final e8.q backView;

    /* JADX INFO: renamed from: w, reason: collision with root package name and from kotlin metadata */
    public final e8.q cardDetailsView;

    /* JADX INFO: renamed from: x, reason: collision with root package name and from kotlin metadata */
    public final e8.q cardFrontImage;

    /* JADX INFO: renamed from: y, reason: collision with root package name and from kotlin metadata */
    public final e8.q cardBackImage;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    public final e8.q cardCustomisationImage;

    /* JADX INFO: renamed from: com.revolut.core.ui_kit.views.NewRevolutCardView$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public NewRevolutCardView(@NotNull Context context) {
        this(context, null, 6, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public static Unit a(NewRevolutCardView newRevolutCardView, boolean z, Function0 function0) {
        newRevolutCardView.f58803q = true;
        newRevolutCardView.getFrontView().setTag("FrontImageLoaded");
        ta taVar = newRevolutCardView.f58802p;
        if (taVar != null) {
            newRevolutCardView.i(200L, taVar);
        }
        newRevolutCardView.s(z);
        if (function0 != null) {
            function0.invoke();
        }
        return Unit.f186387a;
    }

    public static void b(ta taVar, NewRevolutCardView newRevolutCardView, Bitmap bitmap) {
        if (taVar instanceof ra) {
            BitmapEffects bitmapEffects = newRevolutCardView.getBitmapEffects();
            Intrinsics.h(bitmap);
            Bitmap bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(((ra) taVar).f209977a, bitmap.getWidth(), bitmap.getHeight(), false);
            Intrinsics.checkNotNullExpressionValue(bitmapCreateScaledBitmap, "createScaledBitmap(...)");
            bitmapEffects.applyFreezeFilter(bitmap, bitmapCreateScaledBitmap);
            return;
        }
        if (!(taVar instanceof sa)) {
            throw new NoWhenBranchMatchedException();
        }
        BitmapEffects bitmapEffects2 = newRevolutCardView.getBitmapEffects();
        Intrinsics.h(bitmap);
        Bitmap bitmapCreateScaledBitmap2 = Bitmap.createScaledBitmap(((sa) taVar).f210000a, bitmap.getWidth(), bitmap.getHeight(), false);
        Intrinsics.checkNotNullExpressionValue(bitmapCreateScaledBitmap2, "createScaledBitmap(...)");
        bitmapEffects2.applyFreezeFilter(bitmap, bitmapCreateScaledBitmap2);
    }

    public static Unit c(NewRevolutCardView newRevolutCardView, Bitmap bitmap) {
        Intrinsics.h(bitmap);
        newRevolutCardView.getCardOverlayIcon().setVisibility(8);
        or0.u.k(newRevolutCardView).Q().b(newRevolutCardView.getCardOverlayIcon());
        ImageTransformations imageTransformations = null;
        or0.m.c(newRevolutCardView.getFrontView(), null);
        newRevolutCardView.getCardOverlayContainer().animate().cancel();
        if (newRevolutCardView.getCardOverlayContainer().getVisibility() == 0) {
            newRevolutCardView.getCardOverlayContainer().setAlpha(1.0f);
            newRevolutCardView.getOverlayView().setImageBitmap(bitmap);
        } else {
            yy0.f.e(or0.u.k(newRevolutCardView).Q(), new BitmapImage(bitmap, false, imageTransformations, 12), newRevolutCardView.getOverlayView(), null, null, 12);
            newRevolutCardView.getCardOverlayContainer().setVisibility(0);
            newRevolutCardView.getCardOverlayContainer().setAlpha(BitmapDescriptorFactory.HUE_RED);
            newRevolutCardView.getCardOverlayContainer().animate().alpha(1.0f).setDuration(500L).setInterpolator(new LinearInterpolator()).start();
        }
        return Unit.f186387a;
    }

    public static Unit d(NewRevolutCardView newRevolutCardView) {
        boolean z = newRevolutCardView.getCardOverlayContainer().getVisibility() == 0 || newRevolutCardView.f58801n != null;
        if (newRevolutCardView.f58801n != null) {
            newRevolutCardView.j();
        }
        if (z) {
            ta taVar = newRevolutCardView.f58802p;
            if (taVar != null) {
                newRevolutCardView.i(200L, taVar);
            } else {
                newRevolutCardView.k(true);
            }
        }
        return Unit.f186387a;
    }

    public static void e(NewRevolutCardView newRevolutCardView) {
        newRevolutCardView.getCardOverlayContainer().setVisibility(8);
    }

    public static Bitmap f(int i, int i2, NewRevolutCardView newRevolutCardView) {
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i, i2, Bitmap.Config.ARGB_8888);
        newRevolutCardView.getCardDetailsView().draw(ch.qos.logback.core.util.a.e(bitmapCreateBitmap, "createBitmap(...)", bitmapCreateBitmap));
        return bitmapCreateBitmap;
    }

    public static j01.e g(NewRevolutCardView newRevolutCardView) {
        return new j01.e(new View[]{newRevolutCardView.getCopyCvvIcon(), newRevolutCardView.getCvv(), newRevolutCardView.getCvvLabel()});
    }

    private final ConstraintLayout getBackView() {
        return (ConstraintLayout) this.backView.f();
    }

    private final to0.c getBitmapBlurProcessor() {
        return (to0.c) this.bitmapBlurProcessor.getValue();
    }

    private final BitmapEffects getBitmapEffects() {
        return (BitmapEffects) this.bitmapEffects.getValue();
    }

    private final AppCompatImageView getCardBackImage() {
        return (AppCompatImageView) this.cardBackImage.f();
    }

    private final TagView getCardBackTag() {
        return (TagView) this.cardBackTag.f();
    }

    private final AppCompatImageView getCardCustomisationImage() {
        return (AppCompatImageView) this.cardCustomisationImage.f();
    }

    private final ConstraintLayout getCardDetailsView() {
        return (ConstraintLayout) this.cardDetailsView.f();
    }

    private final AppCompatImageView getCardFrontImage() {
        return (AppCompatImageView) this.cardFrontImage.f();
    }

    private final TagView getCardFrontTag() {
        return (TagView) this.cardFrontTag.f();
    }

    private final AppCompatTextView getCardHolderName() {
        return (AppCompatTextView) this.cardHolderName.f();
    }

    private final AppCompatTextView getCardLabel() {
        return (AppCompatTextView) this.cardLabel.f();
    }

    private final AppCompatTextView getCardNumber() {
        return (AppCompatTextView) this.cardNumber.f();
    }

    private final AppCompatTextView getCardNumberLabel() {
        return (AppCompatTextView) this.cardNumberLabel.f();
    }

    private final FrameLayout getCardOverlayContainer() {
        return (FrameLayout) this.cardOverlayContainer.f();
    }

    private final AppCompatImageView getCardOverlayIcon() {
        return (AppCompatImageView) this.cardOverlayIcon.f();
    }

    private final TagView getCardSecondaryBackTag() {
        return (TagView) this.cardSecondaryBackTag.f();
    }

    private final TagView getCardSecondaryFrontTag() {
        return (TagView) this.cardSecondaryFrontTag.f();
    }

    private final AppCompatTextView getCardTypeLabel() {
        return (AppCompatTextView) this.cardTypeLabel.f();
    }

    private final AppCompatImageView getCopyCardNumberIcon() {
        return (AppCompatImageView) this.copyCardNumberIcon.f();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    private final j01.e getCopyCardViewHighlightListener() {
        return (j01.e) this.U.getValue();
    }

    private final AppCompatImageView getCopyCvvIcon() {
        return (AppCompatImageView) this.copyCvvIcon.f();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    private final j01.e getCopyCvvViewHighlightListener() {
        return (j01.e) this.V.getValue();
    }

    private final AppCompatTextView getCvv() {
        return (AppCompatTextView) this.cvv.f();
    }

    private final AppCompatTextView getCvvLabel() {
        return (AppCompatTextView) this.cvvLabel.f();
    }

    private final AppCompatTextView getExpiryDate() {
        return (AppCompatTextView) this.expiryDate.f();
    }

    private final AppCompatTextView getExpiryDateLabel() {
        return (AppCompatTextView) this.expiryDateLabel.f();
    }

    private final ConstraintLayout getFrontView() {
        return (ConstraintLayout) this.frontView.f();
    }

    private final AppCompatTextView getLastFour() {
        return (AppCompatTextView) this.lastFour.f();
    }

    private final AppCompatImageView getOverlayView() {
        return (AppCompatImageView) this.overlayView.f();
    }

    private final ShimmerFrameLayout getShimmerView() {
        return (ShimmerFrameLayout) this.shimmerView.f();
    }

    public static j01.e h(NewRevolutCardView newRevolutCardView) {
        return new j01.e(new View[]{newRevolutCardView.getCopyCardNumberIcon(), newRevolutCardView.getCardNumber(), newRevolutCardView.getCardNumberLabel()});
    }

    public static void m(TagView tagView, TagViewData tagViewData) {
        tagView.setVisibility(tagViewData != null ? 0 : 8);
        if (tagViewData != null) {
            tagView.setContent(tagViewData);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void setCardBackImage$default(NewRevolutCardView newRevolutCardView, Image image, Function0 function0, int i, Object obj2) {
        if ((i & 2) != 0) {
            function0 = null;
        }
        newRevolutCardView.setCardBackImage(image, function0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void setCardFrontImage$default(NewRevolutCardView newRevolutCardView, Image image, ta taVar, boolean z, Function0 function0, Function0 function02, int i, Object obj2) {
        if ((i & 8) != 0) {
            function0 = null;
        }
        if ((i & 16) != 0) {
            function02 = null;
        }
        newRevolutCardView.setCardFrontImage(image, taVar, z, function0, function02);
    }

    public final void i(long j2, ta taVar) {
        gu0.a aVar;
        j();
        gu0.a aVar2 = this.o;
        if (aVar2 != null) {
            aVar2.cancel();
        }
        if (getCardDetailsView().getWidth() == 0 || getCardDetailsView().getHeight() == 0) {
            if (getCardDetailsView().isLaidOut()) {
                return;
            }
            ConstraintLayout cardDetailsView = getCardDetailsView();
            if (!ViewCompat.isLaidOut(cardDetailsView) || cardDetailsView.isLayoutRequested()) {
                gu0.a aVar3 = new gu0.a(cardDetailsView, 3, this);
                cardDetailsView.addOnLayoutChangeListener(aVar3);
                aVar = aVar3;
            } else {
                ta taVar2 = this.f58802p;
                if (taVar2 != null) {
                    i(0L, taVar2);
                }
                aVar = null;
            }
            this.o = aVar;
            return;
        }
        final int width = getCardDetailsView().getWidth();
        final int height = getCardDetailsView().getHeight();
        ufm.c cVar = new ufm.c(new Callable() { // from class: mx0.oa
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return NewRevolutCardView.f(width, height, this);
            }
        }, 2);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        c0 c0Var = hfm.c.f152030a;
        m70.a.p(c0Var);
        ufm.i iVar = new ufm.i(cVar.k(j2, c0Var), new s2(new mt9.c(taVar, this, 15), 24), 0);
        Intrinsics.checkNotNullExpressionValue(iVar, "flatMap(...)");
        ufm.n nVarI = o70.a.i(iVar);
        pa paVar = new pa(this, taVar);
        ufm.i iVar2 = new ufm.i(nVarI, new ks0.n(new ms2.j(new BreadcrumbException(), 2), (byte) 0), 2);
        Intrinsics.checkNotNullExpressionValue(iVar2, "onErrorResumeNext(...)");
        ofm.i iVar3 = new ofm.i(new m3l.d(2, paVar), new m3l.d(2, wa.f210082a), 0);
        iVar2.q(iVar3);
        Intrinsics.checkNotNullExpressionValue(iVar3, "subscribe(...)");
        this.f58801n = iVar3;
    }

    public final void j() {
        ofm.i iVar = this.f58801n;
        if (iVar != null) {
            te0.w.p0(iVar);
        }
        this.f58801n = null;
    }

    public final void k(boolean z) {
        if (getCardOverlayContainer().getVisibility() == 0) {
            or0.m.c(getFrontView(), null);
            getCardOverlayContainer().animate().cancel();
            if (!z) {
                getCardOverlayContainer().setVisibility(8);
            } else {
                getCardOverlayContainer().setAlpha(1.0f);
                getCardOverlayContainer().animate().alpha(BitmapDescriptorFactory.HUE_RED).setDuration(500L).setInterpolator(new LinearInterpolator()).withEndAction(new kt0.d(this, 20)).start();
            }
        }
    }

    public final void l() {
        or0.u.k(this).Q().b(getOverlayView());
        getOverlayView().setImageDrawable(null);
        k(false);
        getCardOverlayIcon().setVisibility(8);
        getCardOverlayIcon().setImageDrawable(null);
        or0.u.k(this).Q().b(getCardOverlayIcon());
        or0.u.k(this).Q().b(getCardFrontImage());
        or0.u.k(this).Q().b(getCardBackImage());
        or0.u.k(this).Q().b(getCardCustomisationImage());
        this.f58799l.removeCallbacksAndMessages(null);
        this.k.b(getFrontView(), getBackView());
        j();
        gu0.a aVar = this.o;
        if (aVar != null) {
            aVar.cancel();
        }
        this.f58802p = null;
        or0.m.c(getFrontView(), null);
    }

    public final void n(boolean z) {
        if (getBackView().getVisibility() == 0) {
            return;
        }
        ConstraintLayout frontView = getFrontView();
        ConstraintLayout backView = getBackView();
        kq0.a aVar = this.k;
        aVar.b(frontView, backView);
        if (z) {
            aVar.c(getFrontView(), getBackView());
        } else {
            getBackView().setVisibility(0);
            getFrontView().setVisibility(8);
        }
    }

    public final void o(String pan, String cvv, LocalDate localDate) {
        String string;
        Intrinsics.checkNotNullParameter(pan, "pan");
        Intrinsics.checkNotNullParameter(cvv, "cvv");
        r(true);
        kli.a.b(getCardNumber(), new TextClause(this.f58800m.b(new jm.a(pan, pan.length()), true).f162271a.f175891b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), ty0.f.f275450a);
        kli.a.b(getCvv(), new TextClause(cvv, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), ty0.f.f275450a);
        kli.a.b(getExpiryDate(), (localDate == null || (string = localDate.toString("MM/yy")) == null) ? null : new TextClause(string, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), ty0.f.f275450a);
        for (AppCompatTextView appCompatTextView : zhm.v.k(getCardNumber(), getCvv(), getExpiryDate())) {
            appCompatTextView.post(new kt0.d(appCompatTextView, 21));
        }
    }

    public final void p(boolean z) {
        getCopyCardNumberIcon().setVisibility(z ? 0 : 8);
        getCopyCvvIcon().setVisibility(z ? 0 : 8);
    }

    public final void q(boolean z) {
        if (getFrontView().getVisibility() == 0) {
            return;
        }
        ConstraintLayout frontView = getFrontView();
        ConstraintLayout backView = getBackView();
        kq0.a aVar = this.k;
        aVar.b(frontView, backView);
        if (z) {
            aVar.c(getBackView(), getFrontView());
        } else {
            getFrontView().setVisibility(0);
            getBackView().setVisibility(8);
        }
    }

    public final void r(boolean z) {
        getCardNumber().setVisibility(z ? 0 : 8);
        getCardNumberLabel().setVisibility(z ? 0 : 8);
        getCvv().setVisibility(z ? 0 : 8);
        getCvvLabel().setVisibility(z ? 0 : 8);
        getExpiryDate().setVisibility(z ? 0 : 8);
        getExpiryDateLabel().setVisibility(z ? 0 : 8);
    }

    public final void s(boolean z) {
        if ((getShimmerView().getVisibility() == 0) != z) {
            getShimmerView().setVisibility(z ? 0 : 8);
        }
    }

    public final void setBackCardTag(TagViewData tagData) {
        m(getCardBackTag(), tagData);
    }

    public final void setBackPrimaryColor(int color) {
        getCardNumber().setTextColor(color);
        getExpiryDate().setTextColor(color);
        getCvv().setTextColor(color);
        rd0.e.q(getCopyCardNumberIcon(), Integer.valueOf(color));
        rd0.e.q(getCopyCvvIcon(), Integer.valueOf(color));
    }

    public final void setBackSecondaryCardTag(TagViewData tagData) {
        m(getCardSecondaryBackTag(), tagData);
    }

    public final void setBackSecondaryColor(int color) {
        getCardTypeLabel().setTextColor(color);
        getCardNumberLabel().setTextColor(color);
        getExpiryDateLabel().setTextColor(color);
        getCvvLabel().setTextColor(color);
    }

    public final void setCardBackImage(@NotNull Image image, Function0<Unit> onErrorAction) {
        Intrinsics.checkNotNullParameter(image, "image");
        yy0.f.e(or0.u.k(this).Q(), image, getCardBackImage(), null, onErrorAction, 4);
    }

    public final void setCardFrontImage(Image image, ta cardOverlayType, boolean showPendingState, Function0<Unit> onErrorAction, Function0<Unit> onSuccessAction) {
        boolean zF = Intrinsics.f(this.f58802p, cardOverlayType);
        this.f58802p = cardOverlayType;
        if (image != null) {
            j();
            k(false);
            this.f58803q = false;
            getFrontView().setElevation(BitmapDescriptorFactory.HUE_RED);
            getBackView().setElevation(BitmapDescriptorFactory.HUE_RED);
            getShimmerView().setElevation(BitmapDescriptorFactory.HUE_RED);
            s(false);
            or0.u.k(this).Q().a(image, getCardFrontImage(), new l1.e(this, showPendingState, onSuccessAction, 14), onErrorAction);
        } else if (!zF && cardOverlayType != null && this.f58803q) {
            i(0L, cardOverlayType);
        } else if (!zF && cardOverlayType == null) {
            j();
            k(true);
        }
        if (image == null) {
            s(showPendingState);
        }
    }

    public final void setCardHolderName(Clause name) {
        ty0.c.b(or0.u.k(this).b0(), name, getCardHolderName(), null, null, 12);
    }

    public final void setCardHolderNameStyle(@NotNull qa style) {
        Intrinsics.checkNotNullParameter(style, "style");
        this.f58806t = style;
        int i = va.f210056b[style.ordinal()];
        if (i == 1) {
            getCardHolderName().setTextSize(2, 12.0f);
            Integer num = this.f58805s;
            if (num != null) {
                getCardHolderName().setTextColor(num.intValue());
            }
            ViewGroup.LayoutParams layoutParams = getCardHolderName().getLayoutParams();
            Intrinsics.i(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            ((ViewGroup.MarginLayoutParams) layoutParams).setMargins(0, 0, 0, 0);
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            getCardHolderName().setTextSize(2, 16.0f);
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            int iK = kli.a.k(context, 15.0f);
            Context context2 = getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
            int iK2 = kli.a.k(context2, 16.0f);
            ViewGroup.LayoutParams layoutParams2 = getCardHolderName().getLayoutParams();
            Intrinsics.i(layoutParams2, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            ((ViewGroup.MarginLayoutParams) layoutParams2).setMargins(iK, 0, 0, iK2);
        }
        Integer num2 = this.f58804r;
        if (num2 != null) {
            getCardHolderName().setTextColor(num2.intValue());
        }
    }

    public final void setCardLabel(Clause label) {
        ty0.c.b(or0.u.k(this).b0(), label, getCardLabel(), null, null, 12);
    }

    public final void setCardLabelTextAppearance(@NotNull ua textAppearance) {
        int i;
        Intrinsics.checkNotNullParameter(textAppearance, "textAppearance");
        AppCompatTextView cardLabel = getCardLabel();
        int i2 = va.f210055a[textAppearance.ordinal()];
        if (i2 == 1) {
            i = R$attr.internal_textAppearanceBody3;
        } else {
            if (i2 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            i = R$attr.internal_textAppearanceEmphasis1;
        }
        jb3.l.e(cardLabel, i);
    }

    public final void setCardOverlay(ta cardOverlayType) {
        boolean zF = Intrinsics.f(this.f58802p, cardOverlayType);
        this.f58802p = cardOverlayType;
        if (zF) {
            return;
        }
        if (cardOverlayType != null && this.f58803q) {
            i(0L, cardOverlayType);
        } else if (cardOverlayType == null) {
            j();
            k(true);
        }
    }

    public final void setCardTypeLabel(Clause cardType) {
        ty0.c.b(or0.u.k(this).b0(), cardType, getCardTypeLabel(), null, null, 12);
    }

    public final void setCardTypeLabelTextAppearance(@NotNull ua textAppearance) {
        int i;
        Intrinsics.checkNotNullParameter(textAppearance, "textAppearance");
        AppCompatTextView cardTypeLabel = getCardTypeLabel();
        int i2 = va.f210055a[textAppearance.ordinal()];
        if (i2 == 1) {
            i = R$attr.internal_textAppearanceBody3;
        } else {
            if (i2 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            i = R$attr.internal_textAppearanceEmphasis1;
        }
        jb3.l.e(cardTypeLabel, i);
    }

    public final void setCardWidth(int width) {
        int i = (int) (width / 1.592f);
        getFrontView().getLayoutParams().width = width;
        getFrontView().getLayoutParams().height = i;
        getBackView().getLayoutParams().width = width;
        getBackView().getLayoutParams().height = i;
        getShimmerView().getLayoutParams().width = width;
        getShimmerView().getLayoutParams().height = i;
    }

    @Override // android.view.View
    public void setClickable(boolean clickable) {
        if (clickable) {
            getCopyCardNumberIcon().setOnTouchListener(getCopyCardViewHighlightListener());
            getCardNumber().setOnTouchListener(getCopyCardViewHighlightListener());
            getCopyCvvIcon().setOnTouchListener(getCopyCvvViewHighlightListener());
            getCvv().setOnTouchListener(getCopyCvvViewHighlightListener());
        } else {
            getCopyCardNumberIcon().setOnTouchListener(null);
            getCardNumber().setOnTouchListener(null);
            getCopyCvvIcon().setOnTouchListener(null);
            getCvv().setOnTouchListener(null);
        }
        getCardFrontImage().setClickable(clickable);
        getCardBackImage().setClickable(clickable);
        getOverlayView().setClickable(clickable);
        super.setClickable(clickable);
    }

    public final void setCustomisationImage(Image image) {
        yy0.f.e(or0.u.k(this).Q(), image, getCardCustomisationImage(), new pa(this), null, 8);
    }

    public final void setFrontCardTag(TagViewData tagData) {
        m(getCardFrontTag(), tagData);
    }

    public final void setFrontPrimaryColor(int color) {
        this.f58804r = Integer.valueOf(color);
        getCardLabel().setTextColor(color);
        getLastFour().setTextColor(color);
        setCardHolderNameStyle(this.f58806t);
    }

    public final void setFrontSecondaryCardTag(TagViewData tagData) {
        m(getCardSecondaryFrontTag(), tagData);
    }

    public final void setFrontSecondaryColor(int color) {
        this.f58805s = Integer.valueOf(color);
        getCardTypeLabel().setTextColor(color);
        setCardHolderNameStyle(this.f58806t);
    }

    public final void setLastFour(String lastFour) {
        ty0.c.b(or0.u.k(this).b0(), lastFour != null ? new TextClause("·· ".concat(lastFour), (Style) null, (Integer) null, false, (o9) null, (List) null, 126) : null, getLastFour(), null, null, 12);
    }

    public final void setLastFourTextAppearance(@NotNull ua textAppearance) {
        int i;
        Intrinsics.checkNotNullParameter(textAppearance, "textAppearance");
        AppCompatTextView lastFour = getLastFour();
        int i2 = va.f210055a[textAppearance.ordinal()];
        if (i2 == 1) {
            i = R$attr.internal_textAppearanceBody3;
        } else {
            if (i2 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            i = R$attr.internal_textAppearanceEmphasis1;
        }
        jb3.l.e(lastFour, i);
    }

    public final void setLastFourVisible(boolean visible) {
        getLastFour().setVisibility(visible ? 0 : 8);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public NewRevolutCardView(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NewRevolutCardView(@NotNull Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        final int i2 = 8;
        this.bitmapEffects = yhm.j.b(new mw1.a(i2));
        final int i3 = 7;
        this.bitmapBlurProcessor = yhm.j.b(new mw1.a(i3));
        this.f58795c = v0.a.d("create(...)");
        this.d = v0.a.d("create(...)");
        this.e = v0.a.d("create(...)");
        this.f = v0.a.d("create(...)");
        this.f58796g = v0.a.d("create(...)");
        this.f58797h = v0.a.d("create(...)");
        this.i = v0.a.d("create(...)");
        this.f58798j = kli.a.k(context, 12.0f);
        this.k = new kq0.a();
        this.f58799l = new Handler(Looper.getMainLooper());
        final int i5 = 5;
        q4 q4Var = new q4(this, 5);
        HashMap map = im.c.f162274c;
        this.f58800m = v13.d.l("[0000] [0000] [0000] [0000]", f0.f322471a);
        this.f58806t = qa.SECONDARY;
        this.frontView = kli.a.J(R$id.internalNewRevolutCardView_frontView, this);
        this.backView = kli.a.J(R$id.internalNewRevolutCardView_backView, this);
        this.cardDetailsView = kli.a.J(R$id.internalNewRevolutCardView_cardDetailsView, this);
        this.cardFrontImage = kli.a.J(R$id.internalNewRevolutCardView_cardFrontImage, this);
        this.cardBackImage = kli.a.J(R$id.internalNewRevolutCardView_cardBackImage, this);
        this.cardCustomisationImage = kli.a.J(R$id.internalNewRevolutCardView_cardCustomisationImage, this);
        this.cardOverlayContainer = kli.a.J(R$id.internalNewRevolutCardView_cardOverlayContainer, this);
        this.overlayView = kli.a.J(R$id.internalNewRevolutCardView_cardFreezeView, this);
        this.cardOverlayIcon = kli.a.J(R$id.internalNewRevolutCardView_cardOverlayIcon, this);
        this.cardLabel = kli.a.J(R$id.internalNewRevolutCardView_cardLabel, this);
        this.cardTypeLabel = kli.a.J(R$id.internalNewRevolutCardView_cardTypeLabel, this);
        this.lastFour = kli.a.J(R$id.internalNewRevolutCardView_lastFour, this);
        this.cardHolderName = kli.a.J(R$id.internalNewRevolutCardView_cardHolderName, this);
        this.cardNumber = kli.a.J(R$id.internalNewRevolutCardView_cardNumber, this);
        this.expiryDate = kli.a.J(R$id.internalNewRevolutCardView_expiryDate, this);
        this.cvv = kli.a.J(R$id.internalNewRevolutCardView_cvv, this);
        this.cardNumberLabel = kli.a.J(R$id.internalNewRevolutCardView_cardNumberLabel, this);
        this.expiryDateLabel = kli.a.J(R$id.internalNewRevolutCardView_expiryDateLabel, this);
        this.cvvLabel = kli.a.J(R$id.internalNewRevolutCardView_cvvLabel, this);
        this.copyCardNumberIcon = kli.a.J(R$id.internalNewRevolutCardView_copyCardNumberIcon, this);
        this.copyCvvIcon = kli.a.J(R$id.internalNewRevolutCardView_copyCvvIcon, this);
        this.cardFrontTag = kli.a.J(R$id.internalNewRevolutCardView_frontTagView, this);
        this.cardSecondaryFrontTag = kli.a.J(R$id.internalNewRevolutCardView_frontSecondaryTagView, this);
        this.cardBackTag = kli.a.J(R$id.internalNewRevolutCardView_backTagView, this);
        this.cardSecondaryBackTag = kli.a.J(R$id.internalNewRevolutCardView_backSecondaryTagView, this);
        this.shimmerView = kli.a.J(R$id.internalNewRevolutCardView_shimmerLayout, this);
        final int i6 = 0;
        this.U = te0.w.y0(new Function0(this) { // from class: mx0.na

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ NewRevolutCardView f209861b;

            {
                this.f209861b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i6) {
                    case 0:
                        return NewRevolutCardView.h(this.f209861b);
                    default:
                        return NewRevolutCardView.g(this.f209861b);
                }
            }
        });
        final int i21 = 1;
        this.V = te0.w.y0(new Function0(this) { // from class: mx0.na

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ NewRevolutCardView f209861b;

            {
                this.f209861b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i21) {
                    case 0:
                        return NewRevolutCardView.h(this.f209861b);
                    default:
                        return NewRevolutCardView.g(this.f209861b);
                }
            }
        });
        View.inflate(context, R$layout.internal_view_new_revolut_card, this);
        getFrontView().setVisibility(0);
        getBackView().setVisibility(8);
        setClipToPadding(false);
        getFrontView().setClipToOutline(true);
        getFrontView().setOutlineProvider(q4Var);
        getBackView().setClipToOutline(true);
        getBackView().setOutlineProvider(q4Var);
        ShimmerFrameLayout shimmerView = getShimmerView();
        c9.d dVar = new c9.d();
        ((c9.e) dVar.f22248b).d = getContext().getColor(R$color.internal_white);
        shimmerView.d(((c9.d) ((c9.d) ((c9.d) dVar.k(1000L)).l(0.2f)).j(BitmapDescriptorFactory.HUE_RED)).c());
        getCopyCardNumberIcon().setOnTouchListener(getCopyCardViewHighlightListener());
        getCardNumber().setOnTouchListener(getCopyCardViewHighlightListener());
        final int i22 = 2;
        getCopyCardNumberIcon().setOnClickListener(new View.OnClickListener(this) { // from class: mx0.ma

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ NewRevolutCardView f209843b;

            {
                this.f209843b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i22) {
                    case 0:
                        this.f209843b.f58797h.onNext(Unit.f186387a);
                        break;
                    case 1:
                        this.f209843b.i.onNext(Unit.f186387a);
                        break;
                    case 2:
                        this.f209843b.f58795c.onNext(Unit.f186387a);
                        break;
                    case 3:
                        this.f209843b.f58795c.onNext(Unit.f186387a);
                        break;
                    case 4:
                        this.f209843b.d.onNext(Unit.f186387a);
                        break;
                    case 5:
                        this.f209843b.d.onNext(Unit.f186387a);
                        break;
                    case 6:
                        this.f209843b.e.onNext(Unit.f186387a);
                        break;
                    case 7:
                        this.f209843b.f.onNext(Unit.f186387a);
                        break;
                    case 8:
                        this.f209843b.e.onNext(Unit.f186387a);
                        break;
                    case 9:
                        this.f209843b.f.onNext(Unit.f186387a);
                        break;
                    case 10:
                        this.f209843b.f58796g.onNext(Unit.f186387a);
                        break;
                    default:
                        this.f209843b.f58797h.onNext(Unit.f186387a);
                        break;
                }
            }
        });
        final int i32 = 3;
        getCardNumber().setOnClickListener(new View.OnClickListener(this) { // from class: mx0.ma

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ NewRevolutCardView f209843b;

            {
                this.f209843b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i32) {
                    case 0:
                        this.f209843b.f58797h.onNext(Unit.f186387a);
                        break;
                    case 1:
                        this.f209843b.i.onNext(Unit.f186387a);
                        break;
                    case 2:
                        this.f209843b.f58795c.onNext(Unit.f186387a);
                        break;
                    case 3:
                        this.f209843b.f58795c.onNext(Unit.f186387a);
                        break;
                    case 4:
                        this.f209843b.d.onNext(Unit.f186387a);
                        break;
                    case 5:
                        this.f209843b.d.onNext(Unit.f186387a);
                        break;
                    case 6:
                        this.f209843b.e.onNext(Unit.f186387a);
                        break;
                    case 7:
                        this.f209843b.f.onNext(Unit.f186387a);
                        break;
                    case 8:
                        this.f209843b.e.onNext(Unit.f186387a);
                        break;
                    case 9:
                        this.f209843b.f.onNext(Unit.f186387a);
                        break;
                    case 10:
                        this.f209843b.f58796g.onNext(Unit.f186387a);
                        break;
                    default:
                        this.f209843b.f58797h.onNext(Unit.f186387a);
                        break;
                }
            }
        });
        getCopyCvvIcon().setOnTouchListener(getCopyCvvViewHighlightListener());
        getCvv().setOnTouchListener(getCopyCvvViewHighlightListener());
        final int i33 = 4;
        getCopyCvvIcon().setOnClickListener(new View.OnClickListener(this) { // from class: mx0.ma

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ NewRevolutCardView f209843b;

            {
                this.f209843b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i33) {
                    case 0:
                        this.f209843b.f58797h.onNext(Unit.f186387a);
                        break;
                    case 1:
                        this.f209843b.i.onNext(Unit.f186387a);
                        break;
                    case 2:
                        this.f209843b.f58795c.onNext(Unit.f186387a);
                        break;
                    case 3:
                        this.f209843b.f58795c.onNext(Unit.f186387a);
                        break;
                    case 4:
                        this.f209843b.d.onNext(Unit.f186387a);
                        break;
                    case 5:
                        this.f209843b.d.onNext(Unit.f186387a);
                        break;
                    case 6:
                        this.f209843b.e.onNext(Unit.f186387a);
                        break;
                    case 7:
                        this.f209843b.f.onNext(Unit.f186387a);
                        break;
                    case 8:
                        this.f209843b.e.onNext(Unit.f186387a);
                        break;
                    case 9:
                        this.f209843b.f.onNext(Unit.f186387a);
                        break;
                    case 10:
                        this.f209843b.f58796g.onNext(Unit.f186387a);
                        break;
                    default:
                        this.f209843b.f58797h.onNext(Unit.f186387a);
                        break;
                }
            }
        });
        getCvv().setOnClickListener(new View.OnClickListener(this) { // from class: mx0.ma

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ NewRevolutCardView f209843b;

            {
                this.f209843b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i5) {
                    case 0:
                        this.f209843b.f58797h.onNext(Unit.f186387a);
                        break;
                    case 1:
                        this.f209843b.i.onNext(Unit.f186387a);
                        break;
                    case 2:
                        this.f209843b.f58795c.onNext(Unit.f186387a);
                        break;
                    case 3:
                        this.f209843b.f58795c.onNext(Unit.f186387a);
                        break;
                    case 4:
                        this.f209843b.d.onNext(Unit.f186387a);
                        break;
                    case 5:
                        this.f209843b.d.onNext(Unit.f186387a);
                        break;
                    case 6:
                        this.f209843b.e.onNext(Unit.f186387a);
                        break;
                    case 7:
                        this.f209843b.f.onNext(Unit.f186387a);
                        break;
                    case 8:
                        this.f209843b.e.onNext(Unit.f186387a);
                        break;
                    case 9:
                        this.f209843b.f.onNext(Unit.f186387a);
                        break;
                    case 10:
                        this.f209843b.f58796g.onNext(Unit.f186387a);
                        break;
                    default:
                        this.f209843b.f58797h.onNext(Unit.f186387a);
                        break;
                }
            }
        });
        final int i43 = 6;
        getCardFrontTag().setOnClickListener(new View.OnClickListener(this) { // from class: mx0.ma

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ NewRevolutCardView f209843b;

            {
                this.f209843b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i43) {
                    case 0:
                        this.f209843b.f58797h.onNext(Unit.f186387a);
                        break;
                    case 1:
                        this.f209843b.i.onNext(Unit.f186387a);
                        break;
                    case 2:
                        this.f209843b.f58795c.onNext(Unit.f186387a);
                        break;
                    case 3:
                        this.f209843b.f58795c.onNext(Unit.f186387a);
                        break;
                    case 4:
                        this.f209843b.d.onNext(Unit.f186387a);
                        break;
                    case 5:
                        this.f209843b.d.onNext(Unit.f186387a);
                        break;
                    case 6:
                        this.f209843b.e.onNext(Unit.f186387a);
                        break;
                    case 7:
                        this.f209843b.f.onNext(Unit.f186387a);
                        break;
                    case 8:
                        this.f209843b.e.onNext(Unit.f186387a);
                        break;
                    case 9:
                        this.f209843b.f.onNext(Unit.f186387a);
                        break;
                    case 10:
                        this.f209843b.f58796g.onNext(Unit.f186387a);
                        break;
                    default:
                        this.f209843b.f58797h.onNext(Unit.f186387a);
                        break;
                }
            }
        });
        getCardSecondaryFrontTag().setOnClickListener(new View.OnClickListener(this) { // from class: mx0.ma

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ NewRevolutCardView f209843b;

            {
                this.f209843b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i3) {
                    case 0:
                        this.f209843b.f58797h.onNext(Unit.f186387a);
                        break;
                    case 1:
                        this.f209843b.i.onNext(Unit.f186387a);
                        break;
                    case 2:
                        this.f209843b.f58795c.onNext(Unit.f186387a);
                        break;
                    case 3:
                        this.f209843b.f58795c.onNext(Unit.f186387a);
                        break;
                    case 4:
                        this.f209843b.d.onNext(Unit.f186387a);
                        break;
                    case 5:
                        this.f209843b.d.onNext(Unit.f186387a);
                        break;
                    case 6:
                        this.f209843b.e.onNext(Unit.f186387a);
                        break;
                    case 7:
                        this.f209843b.f.onNext(Unit.f186387a);
                        break;
                    case 8:
                        this.f209843b.e.onNext(Unit.f186387a);
                        break;
                    case 9:
                        this.f209843b.f.onNext(Unit.f186387a);
                        break;
                    case 10:
                        this.f209843b.f58796g.onNext(Unit.f186387a);
                        break;
                    default:
                        this.f209843b.f58797h.onNext(Unit.f186387a);
                        break;
                }
            }
        });
        getCardBackTag().setOnClickListener(new View.OnClickListener(this) { // from class: mx0.ma

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ NewRevolutCardView f209843b;

            {
                this.f209843b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i2) {
                    case 0:
                        this.f209843b.f58797h.onNext(Unit.f186387a);
                        break;
                    case 1:
                        this.f209843b.i.onNext(Unit.f186387a);
                        break;
                    case 2:
                        this.f209843b.f58795c.onNext(Unit.f186387a);
                        break;
                    case 3:
                        this.f209843b.f58795c.onNext(Unit.f186387a);
                        break;
                    case 4:
                        this.f209843b.d.onNext(Unit.f186387a);
                        break;
                    case 5:
                        this.f209843b.d.onNext(Unit.f186387a);
                        break;
                    case 6:
                        this.f209843b.e.onNext(Unit.f186387a);
                        break;
                    case 7:
                        this.f209843b.f.onNext(Unit.f186387a);
                        break;
                    case 8:
                        this.f209843b.e.onNext(Unit.f186387a);
                        break;
                    case 9:
                        this.f209843b.f.onNext(Unit.f186387a);
                        break;
                    case 10:
                        this.f209843b.f58796g.onNext(Unit.f186387a);
                        break;
                    default:
                        this.f209843b.f58797h.onNext(Unit.f186387a);
                        break;
                }
            }
        });
        final int i59 = 9;
        getCardSecondaryBackTag().setOnClickListener(new View.OnClickListener(this) { // from class: mx0.ma

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ NewRevolutCardView f209843b;

            {
                this.f209843b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i59) {
                    case 0:
                        this.f209843b.f58797h.onNext(Unit.f186387a);
                        break;
                    case 1:
                        this.f209843b.i.onNext(Unit.f186387a);
                        break;
                    case 2:
                        this.f209843b.f58795c.onNext(Unit.f186387a);
                        break;
                    case 3:
                        this.f209843b.f58795c.onNext(Unit.f186387a);
                        break;
                    case 4:
                        this.f209843b.d.onNext(Unit.f186387a);
                        break;
                    case 5:
                        this.f209843b.d.onNext(Unit.f186387a);
                        break;
                    case 6:
                        this.f209843b.e.onNext(Unit.f186387a);
                        break;
                    case 7:
                        this.f209843b.f.onNext(Unit.f186387a);
                        break;
                    case 8:
                        this.f209843b.e.onNext(Unit.f186387a);
                        break;
                    case 9:
                        this.f209843b.f.onNext(Unit.f186387a);
                        break;
                    case 10:
                        this.f209843b.f58796g.onNext(Unit.f186387a);
                        break;
                    default:
                        this.f209843b.f58797h.onNext(Unit.f186387a);
                        break;
                }
            }
        });
        final int i66 = 10;
        getCardLabel().setOnClickListener(new View.OnClickListener(this) { // from class: mx0.ma

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ NewRevolutCardView f209843b;

            {
                this.f209843b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i66) {
                    case 0:
                        this.f209843b.f58797h.onNext(Unit.f186387a);
                        break;
                    case 1:
                        this.f209843b.i.onNext(Unit.f186387a);
                        break;
                    case 2:
                        this.f209843b.f58795c.onNext(Unit.f186387a);
                        break;
                    case 3:
                        this.f209843b.f58795c.onNext(Unit.f186387a);
                        break;
                    case 4:
                        this.f209843b.d.onNext(Unit.f186387a);
                        break;
                    case 5:
                        this.f209843b.d.onNext(Unit.f186387a);
                        break;
                    case 6:
                        this.f209843b.e.onNext(Unit.f186387a);
                        break;
                    case 7:
                        this.f209843b.f.onNext(Unit.f186387a);
                        break;
                    case 8:
                        this.f209843b.e.onNext(Unit.f186387a);
                        break;
                    case 9:
                        this.f209843b.f.onNext(Unit.f186387a);
                        break;
                    case 10:
                        this.f209843b.f58796g.onNext(Unit.f186387a);
                        break;
                    default:
                        this.f209843b.f58797h.onNext(Unit.f186387a);
                        break;
                }
            }
        });
        final int i74 = 11;
        getCardFrontImage().setOnClickListener(new View.OnClickListener(this) { // from class: mx0.ma

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ NewRevolutCardView f209843b;

            {
                this.f209843b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i74) {
                    case 0:
                        this.f209843b.f58797h.onNext(Unit.f186387a);
                        break;
                    case 1:
                        this.f209843b.i.onNext(Unit.f186387a);
                        break;
                    case 2:
                        this.f209843b.f58795c.onNext(Unit.f186387a);
                        break;
                    case 3:
                        this.f209843b.f58795c.onNext(Unit.f186387a);
                        break;
                    case 4:
                        this.f209843b.d.onNext(Unit.f186387a);
                        break;
                    case 5:
                        this.f209843b.d.onNext(Unit.f186387a);
                        break;
                    case 6:
                        this.f209843b.e.onNext(Unit.f186387a);
                        break;
                    case 7:
                        this.f209843b.f.onNext(Unit.f186387a);
                        break;
                    case 8:
                        this.f209843b.e.onNext(Unit.f186387a);
                        break;
                    case 9:
                        this.f209843b.f.onNext(Unit.f186387a);
                        break;
                    case 10:
                        this.f209843b.f58796g.onNext(Unit.f186387a);
                        break;
                    default:
                        this.f209843b.f58797h.onNext(Unit.f186387a);
                        break;
                }
            }
        });
        getOverlayView().setOnClickListener(new View.OnClickListener(this) { // from class: mx0.ma

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ NewRevolutCardView f209843b;

            {
                this.f209843b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i6) {
                    case 0:
                        this.f209843b.f58797h.onNext(Unit.f186387a);
                        break;
                    case 1:
                        this.f209843b.i.onNext(Unit.f186387a);
                        break;
                    case 2:
                        this.f209843b.f58795c.onNext(Unit.f186387a);
                        break;
                    case 3:
                        this.f209843b.f58795c.onNext(Unit.f186387a);
                        break;
                    case 4:
                        this.f209843b.d.onNext(Unit.f186387a);
                        break;
                    case 5:
                        this.f209843b.d.onNext(Unit.f186387a);
                        break;
                    case 6:
                        this.f209843b.e.onNext(Unit.f186387a);
                        break;
                    case 7:
                        this.f209843b.f.onNext(Unit.f186387a);
                        break;
                    case 8:
                        this.f209843b.e.onNext(Unit.f186387a);
                        break;
                    case 9:
                        this.f209843b.f.onNext(Unit.f186387a);
                        break;
                    case 10:
                        this.f209843b.f58796g.onNext(Unit.f186387a);
                        break;
                    default:
                        this.f209843b.f58797h.onNext(Unit.f186387a);
                        break;
                }
            }
        });
        getCardBackImage().setOnClickListener(new View.OnClickListener(this) { // from class: mx0.ma

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ NewRevolutCardView f209843b;

            {
                this.f209843b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i21) {
                    case 0:
                        this.f209843b.f58797h.onNext(Unit.f186387a);
                        break;
                    case 1:
                        this.f209843b.i.onNext(Unit.f186387a);
                        break;
                    case 2:
                        this.f209843b.f58795c.onNext(Unit.f186387a);
                        break;
                    case 3:
                        this.f209843b.f58795c.onNext(Unit.f186387a);
                        break;
                    case 4:
                        this.f209843b.d.onNext(Unit.f186387a);
                        break;
                    case 5:
                        this.f209843b.d.onNext(Unit.f186387a);
                        break;
                    case 6:
                        this.f209843b.e.onNext(Unit.f186387a);
                        break;
                    case 7:
                        this.f209843b.f.onNext(Unit.f186387a);
                        break;
                    case 8:
                        this.f209843b.e.onNext(Unit.f186387a);
                        break;
                    case 9:
                        this.f209843b.f.onNext(Unit.f186387a);
                        break;
                    case 10:
                        this.f209843b.f58796g.onNext(Unit.f186387a);
                        break;
                    default:
                        this.f209843b.f58797h.onNext(Unit.f186387a);
                        break;
                }
            }
        });
    }

    public /* synthetic */ NewRevolutCardView(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i & 2) != 0 ? null : attributeSet, 0);
    }
}
