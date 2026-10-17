package com.revolut.core.ui_kit.internal.views.chat;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import au0.b2;
import au0.y1;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.core.ui_kit.R$id;
import com.revolut.core.ui_kit.R$layout;
import com.revolut.core.ui_kit.internal.views.UiKitMediaView;
import com.revolut.core.ui_kit.internal.views.chat.ChatBubbleStyle;
import com.revolut.core.ui_kit.internal.views.tag.TagView;
import com.revolut.core.ui_kit.internal.views.tag.TagViewData;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.views.OverlappedIconsView;
import com.revolut.core.ui_kit.views.SingleLineAutoSizeTextView;
import com.revolut.core.ui_kit_core.actionshandler.TrackableItem;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import e8.q;
import ehe.n;
import eif.c;
import et0.c0;
import et0.d0;
import et0.e0;
import et0.h;
import gw0.a;
import gw0.l;
import hb9.b;
import ihm.f;
import j01.e;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import mx0.bb;
import mx0.m4;
import or0.u;
import org.jetbrains.annotations.NotNull;
import ty0.d;
import ty0.g;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000à\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0010\r\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000 ¡\u00012\u00020\u00012\u00020\u0002:\u0004¢\u0001£\u0001B'\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0011\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0011\u0010\u000fJ\u0013\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u0015\u0010\u0018\u001a\u00020\r2\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0015\u0010\u001b\u001a\u00020\r2\u0006\u0010\u001a\u001a\u00020\u000b¢\u0006\u0004\b\u001b\u0010\u000fJ\u0017\u0010\u001d\u001a\u00020\r2\b\b\u0001\u0010\u001c\u001a\u00020\u0007¢\u0006\u0004\b\u001d\u0010\u001eJ\u0015\u0010 \u001a\u00020\r2\u0006\u0010\u001f\u001a\u00020\u0007¢\u0006\u0004\b \u0010\u001eJ\r\u0010!\u001a\u00020\u0007¢\u0006\u0004\b!\u0010\"J!\u0010'\u001a\u00020\r2\b\u0010$\u001a\u0004\u0018\u00010#2\b\u0010&\u001a\u0004\u0018\u00010%¢\u0006\u0004\b'\u0010(J\u0017\u0010+\u001a\u00020\r2\b\u0010*\u001a\u0004\u0018\u00010)¢\u0006\u0004\b+\u0010,J'\u00101\u001a\u00020\r2\b\u0010*\u001a\u0004\u0018\u00010)2\u0006\u0010.\u001a\u00020-2\u0006\u00100\u001a\u00020/¢\u0006\u0004\b1\u00102J\u0017\u00103\u001a\u00020\r2\b\u0010*\u001a\u0004\u0018\u00010)¢\u0006\u0004\b3\u0010,J!\u00106\u001a\u00020\r2\b\u0010*\u001a\u0004\u0018\u00010)2\b\b\u0002\u00105\u001a\u000204¢\u0006\u0004\b6\u00107J'\u00108\u001a\u00020\r2\b\u0010*\u001a\u0004\u0018\u00010)2\u0006\u0010.\u001a\u00020-2\u0006\u00100\u001a\u00020/¢\u0006\u0004\b8\u00102J)\u0010<\u001a\u00020\r2\b\u00109\u001a\u0004\u0018\u00010)2\b\u0010:\u001a\u0004\u0018\u00010#2\u0006\u0010;\u001a\u00020-¢\u0006\u0004\b<\u0010=J!\u0010B\u001a\u00020\r2\b\u0010?\u001a\u0004\u0018\u00010>2\b\u0010A\u001a\u0004\u0018\u00010@¢\u0006\u0004\bB\u0010CJ!\u0010D\u001a\u00020\r2\b\u0010?\u001a\u0004\u0018\u00010>2\b\u0010A\u001a\u0004\u0018\u00010@¢\u0006\u0004\bD\u0010CJ\u0017\u0010G\u001a\u00020\r2\b\u0010F\u001a\u0004\u0018\u00010E¢\u0006\u0004\bG\u0010HJ\u001b\u0010J\u001a\u00020\r2\f\u0010I\u001a\b\u0012\u0004\u0012\u00020#0\u0012¢\u0006\u0004\bJ\u0010KJ\u001f\u0010O\u001a\u00020\r2\b\u0010M\u001a\u0004\u0018\u00010L2\u0006\u0010N\u001a\u00020/¢\u0006\u0004\bO\u0010PJ#\u0010S\u001a\u00020\r2\u0014\u0010A\u001a\u0010\u0012\u0004\u0012\u00020R\u0012\u0004\u0012\u00020\r\u0018\u00010Q¢\u0006\u0004\bS\u0010TJ#\u0010U\u001a\u00020\r2\u0014\u0010A\u001a\u0010\u0012\u0004\u0012\u00020R\u0012\u0004\u0012\u00020\r\u0018\u00010Q¢\u0006\u0004\bU\u0010TJ\u0017\u0010V\u001a\u00020\r2\u0006\u0010N\u001a\u00020/H\u0002¢\u0006\u0004\bV\u0010WJ\u0019\u0010X\u001a\u00020\r2\b\u0010&\u001a\u0004\u0018\u00010%H\u0002¢\u0006\u0004\bX\u0010YR.\u0010b\u001a\u0004\u0018\u00010Z2\b\u0010[\u001a\u0004\u0018\u00010Z8\u0016@VX\u0096\u000e¢\u0006\u0012\n\u0004\b\\\u0010]\u001a\u0004\b^\u0010_\"\u0004\b`\u0010aR*\u0010l\u001a\u0004\u0018\u00010c8\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\bd\u0010e\u0012\u0004\bj\u0010k\u001a\u0004\bf\u0010g\"\u0004\bh\u0010iR\u001b\u0010q\u001a\u00020R8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bm\u0010n\u001a\u0004\bo\u0010pR\u001b\u0010v\u001a\u00020r8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bs\u0010n\u001a\u0004\bt\u0010uR\u001b\u0010{\u001a\u00020w8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bx\u0010n\u001a\u0004\by\u0010zR\u001c\u0010\u0080\u0001\u001a\u00020|8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b}\u0010n\u001a\u0004\b~\u0010\u007fR\u001e\u0010\u0083\u0001\u001a\u00020|8BX\u0082\u0084\u0002¢\u0006\u000e\n\u0005\b\u0081\u0001\u0010n\u001a\u0005\b\u0082\u0001\u0010\u007fR%\u0010\u0087\u0001\u001a\u00020|8FX\u0087\u0084\u0002¢\u0006\u0015\n\u0005\b\u0084\u0001\u0010n\u0012\u0005\b\u0086\u0001\u0010k\u001a\u0005\b\u0085\u0001\u0010\u007fR\u001e\u0010\u008a\u0001\u001a\u00020|8BX\u0082\u0084\u0002¢\u0006\u000e\n\u0005\b\u0088\u0001\u0010n\u001a\u0005\b\u0089\u0001\u0010\u007fR\u001f\u0010$\u001a\u00030\u008b\u00018BX\u0082\u0084\u0002¢\u0006\u000f\n\u0005\b\u008c\u0001\u0010n\u001a\u0006\b\u008d\u0001\u0010\u008e\u0001R\u001e\u0010\u0091\u0001\u001a\u00020R8BX\u0082\u0084\u0002¢\u0006\u000e\n\u0005\b\u008f\u0001\u0010n\u001a\u0005\b\u0090\u0001\u0010pR \u0010\u0096\u0001\u001a\u00030\u0092\u00018BX\u0082\u0084\u0002¢\u0006\u000f\n\u0005\b\u0093\u0001\u0010n\u001a\u0006\b\u0094\u0001\u0010\u0095\u0001R \u0010\u009b\u0001\u001a\u00030\u0097\u00018BX\u0082\u0084\u0002¢\u0006\u000f\n\u0005\b\u0098\u0001\u0010n\u001a\u0006\b\u0099\u0001\u0010\u009a\u0001R \u0010 \u0001\u001a\u00030\u009c\u00018FX\u0086\u0084\u0002¢\u0006\u000f\n\u0005\b\u009d\u0001\u0010n\u001a\u0006\b\u009e\u0001\u0010\u009f\u0001¨\u0006¤\u0001"}, d2 = {"Lcom/revolut/core/ui_kit/internal/views/chat/ChatBubbleView;", "Lcom/revolut/core/ui_kit/internal/views/chat/ChatBubbleContainer;", "Lcom/revolut/core/ui_kit_core/actionshandler/TrackableItem;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", "clickable", "", "setBubbleClickable", "(Z)V", "pressed", "setPressed", "", "", "getAccessibilityContentDescriptions", "()Ljava/util/List;", "Lgw0/a;", "orientation", "setActionButtonLayout", "(Lgw0/a;)V", "relaxed", "setInternalWidthConstraints", "attr", "setDescriptionTextAppearance", "(I)V", "maxLines", "setDescriptionMaxLines", "getDescriptionLineHeight", "()I", "Lcom/revolut/core/ui_kit_core/displayers/image/Image;", "image", "Law0/d0;", "aspectRatio", "setImage", "(Lcom/revolut/core/ui_kit_core/displayers/image/Image;Law0/d0;)V", "Lcom/revolut/core/ui_kit/models/Clause;", "clause", "setTitle", "(Lcom/revolut/core/ui_kit/models/Clause;)V", "Lcom/revolut/core/ui_kit/internal/views/chat/ChatBubbleStyle;", "bubbleStyle", "Lxo0/g;", "bubblePosition", "setTitleSmall", "(Lcom/revolut/core/ui_kit/models/Clause;Lcom/revolut/core/ui_kit/internal/views/chat/ChatBubbleStyle;Lxo0/g;)V", "setSubtitle", "Lty0/g;", "handleTypeface", "setDescription", "(Lcom/revolut/core/ui_kit/models/Clause;Lty0/g;)V", "setDescriptionAction", "timeStamp", "statusIcon", "style", "setMetaData", "(Lcom/revolut/core/ui_kit/models/Clause;Lcom/revolut/core/ui_kit_core/displayers/image/Image;Lcom/revolut/core/ui_kit/internal/views/chat/ChatBubbleStyle;)V", "Lcom/revolut/core/ui_kit/internal/views/chat/ChatBubbleButtonModel;", "model", "Landroid/view/View$OnClickListener;", "listener", "setPrimaryButton", "(Lcom/revolut/core/ui_kit/internal/views/chat/ChatBubbleButtonModel;Landroid/view/View$OnClickListener;)V", "setSecondaryButton", "Lcom/revolut/core/ui_kit/internal/views/tag/TagViewData;", "data", "setTagData", "(Lcom/revolut/core/ui_kit/internal/views/tag/TagViewData;)V", "icons", "setOverlappedIcons", "(Ljava/util/List;)V", "Lgw0/q;", "replyState", "position", "setReply", "(Lgw0/q;Lxo0/g;)V", "Lkotlin/Function1;", "Landroid/view/View;", "setDescriptionActionClickListener", "(Lkotlin/jvm/functions/Function1;)V", "setTitleSmallClickListener", "setupImageMinWidth", "(Lxo0/g;)V", "setupAspectRatioOfImage", "(Law0/d0;)V", "Landroid/os/Parcelable;", "value", "s", "Landroid/os/Parcelable;", "getAnalyticsContext", "()Landroid/os/Parcelable;", "setAnalyticsContext", "(Landroid/os/Parcelable;)V", "analyticsContext", "Lcom/revolut/core/ui_kit/internal/views/chat/ChatBubbleAppearance;", "v", "Lcom/revolut/core/ui_kit/internal/views/chat/ChatBubbleAppearance;", "getAppearance", "()Lcom/revolut/core/ui_kit/internal/views/chat/ChatBubbleAppearance;", "setAppearance", "(Lcom/revolut/core/ui_kit/internal/views/chat/ChatBubbleAppearance;)V", "getAppearance$annotations", "()V", "appearance", "y", "Le8/q;", "getMessageArea", "()Landroid/view/View;", "messageArea", "Lcom/revolut/core/ui_kit/internal/views/tag/TagView;", "z", "getTag", "()Lcom/revolut/core/ui_kit/internal/views/tag/TagView;", "tag", "Lcom/revolut/core/ui_kit/views/SingleLineAutoSizeTextView;", "A", "getTitle", "()Lcom/revolut/core/ui_kit/views/SingleLineAutoSizeTextView;", "title", "Landroid/widget/TextView;", "B", "getTitleSmall", "()Landroid/widget/TextView;", "titleSmall", "C", "getSubtitle", "subtitle", "D", "getDescription", "getDescription$annotations", "description", "E", "getDescriptionAction", "descriptionAction", "Landroid/widget/ImageView;", "F", "getImage", "()Landroid/widget/ImageView;", "G", "getImageLoadingBackground", "imageLoadingBackground", "Lcom/revolut/core/ui_kit/internal/views/chat/ChatBubbleMetaView;", "H", "getMetaView", "()Lcom/revolut/core/ui_kit/internal/views/chat/ChatBubbleMetaView;", "metaView", "Lcom/revolut/core/ui_kit/views/OverlappedIconsView;", "I", "getOverlappedIconsView", "()Lcom/revolut/core/ui_kit/views/OverlappedIconsView;", "overlappedIconsView", "Lcom/revolut/core/ui_kit/internal/views/UiKitMediaView;", "K", "getGiftPlayer", "()Lcom/revolut/core/ui_kit/internal/views/UiKitMediaView;", "giftPlayer", "Companion", "a", "et0/d0", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class ChatBubbleView extends ChatBubbleContainer implements TrackableItem {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: A, reason: from kotlin metadata */
    public final q title;

    /* JADX INFO: renamed from: B, reason: from kotlin metadata */
    public final q titleSmall;

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    public final q subtitle;

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    public final q description;

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    public final q descriptionAction;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    public final q image;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    public final q imageLoadingBackground;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    public final q metaView;

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    public final q overlappedIconsView;
    public final Barrier J;

    /* JADX INFO: renamed from: K, reason: from kotlin metadata */
    public final q giftPlayer;
    public h L;
    public a M;
    public m4 N;
    public final int O;
    public final int P;
    public final int Q;
    public final int R;
    public int S;
    public int T;
    public d0 U;
    public boolean V;

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
    public Parcelable analyticsContext;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public Image f56819t;
    public boolean u;

    /* JADX INFO: renamed from: v, reason: from kotlin metadata */
    public ChatBubbleAppearance appearance;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final f f56820w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final f f56821x;

    /* JADX INFO: renamed from: y, reason: collision with root package name and from kotlin metadata */
    public final q messageArea;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    public final q tag;

    /* JADX INFO: renamed from: com.revolut.core.ui_kit.internal.views.chat.ChatBubbleView$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ChatBubbleView(@NotNull Context context) {
        this(context, null, 6, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public static Unit g0(ChatBubbleView chatBubbleView) {
        chatBubbleView.getImageLoadingBackground().setVisibility(8);
        return Unit.f186387a;
    }

    public static /* synthetic */ void getAppearance$annotations() {
    }

    public static /* synthetic */ void getDescription$annotations() {
    }

    private final TextView getDescriptionAction() {
        return (TextView) this.descriptionAction.f();
    }

    private final ImageView getImage() {
        return (ImageView) this.image.f();
    }

    private final View getImageLoadingBackground() {
        return this.imageLoadingBackground.f();
    }

    private final View getMessageArea() {
        return this.messageArea.f();
    }

    private final ChatBubbleMetaView getMetaView() {
        return (ChatBubbleMetaView) this.metaView.f();
    }

    private final OverlappedIconsView getOverlappedIconsView() {
        return (OverlappedIconsView) this.overlappedIconsView.f();
    }

    private final TextView getSubtitle() {
        return (TextView) this.subtitle.f();
    }

    private final TagView getTag() {
        return (TagView) this.tag.f();
    }

    private final SingleLineAutoSizeTextView getTitle() {
        return (SingleLineAutoSizeTextView) this.title.f();
    }

    private final TextView getTitleSmall() {
        return (TextView) this.titleSmall.f();
    }

    public static /* synthetic */ void setDescription$default(ChatBubbleView chatBubbleView, Clause clause, g gVar, int i, Object obj2) {
        if ((i & 2) != 0) {
            gVar = d.f275448a;
        }
        chatBubbleView.setDescription(clause, gVar);
    }

    private final void setupAspectRatioOfImage(aw0.d0 aspectRatio) {
        ImageView image = getImage();
        ViewGroup.LayoutParams layoutParams = image.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        }
        ConstraintLayout.LayoutParams layoutParams2 = (ConstraintLayout.LayoutParams) layoutParams;
        if (aspectRatio != null) {
            ((ViewGroup.MarginLayoutParams) layoutParams2).height = 0;
            getImage().setAdjustViewBounds(false);
            layoutParams2.dimensionRatio = a0.d.i(aspectRatio.f10274a, ":", aspectRatio.f10275b);
        } else {
            ((ViewGroup.MarginLayoutParams) layoutParams2).height = -2;
            getImage().setAdjustViewBounds(true);
            layoutParams2.dimensionRatio = null;
        }
        image.setLayoutParams(layoutParams2);
    }

    private final void setupImageMinWidth(xo0.g position) {
        ImageView image = getImage();
        ViewGroup.LayoutParams layoutParams = image.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        }
        ConstraintLayout.LayoutParams layoutParams2 = (ConstraintLayout.LayoutParams) layoutParams;
        float f = position.b() ? 5.0f : BitmapDescriptorFactory.HUE_RED;
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        layoutParams2.matchConstraintMinWidth = kli.a.k(context, f + 230.0f);
        image.setLayoutParams(layoutParams2);
    }

    @NotNull
    public final List<CharSequence> getAccessibilityContentDescriptions() {
        CharSequence[] elements = {getImage().getContentDescription(), null, getTag().getContentDescription(), getTitle().getText(), getTitleSmall().getText(), getSubtitle().getText(), getDescription().getText(), getMetaView().getTimestampText()};
        Intrinsics.checkNotNullParameter(elements, "elements");
        return kotlin.collections.d.L(elements);
    }

    @Override // com.revolut.core.ui_kit_core.actionshandler.TrackableItem
    /* JADX INFO: renamed from: getAnalyticsContext, reason: from getter */
    public Parcelable getE() {
        return this.analyticsContext;
    }

    public final ChatBubbleAppearance getAppearance() {
        return this.appearance;
    }

    @NotNull
    public final TextView getDescription() {
        return (TextView) this.description.f();
    }

    public final int getDescriptionLineHeight() {
        return getDescription().getLineHeight();
    }

    @NotNull
    public final UiKitMediaView getGiftPlayer() {
        return (UiKitMediaView) this.giftPlayer.f();
    }

    public final void h0(ChatBubbleAppearance appearance) {
        ChatBubbleStyle chatBubbleStyle = appearance.f56787a;
        Intrinsics.checkNotNullParameter(appearance, "appearance");
        if (Intrinsics.f(this.appearance, appearance)) {
            i0(chatBubbleStyle);
            return;
        }
        this.appearance = appearance;
        xo0.g gVar = appearance.f56789c;
        int i = e0.f129024a[gVar.ordinal()];
        int i2 = this.Q;
        int i3 = this.P;
        switch (i) {
            case 1:
            case 2:
                break;
            case 3:
            case 4:
            case 5:
            case 8:
            case 9:
            case 10:
                i2 = i3;
                break;
            case 6:
            case 7:
                i3 = i2;
                i2 = i3;
                break;
            case 11:
            case 12:
                i2 = 0;
                i3 = 0;
                break;
            default:
                throw new NoWhenBranchMatchedException();
        }
        this.S = i2;
        this.T = i3;
        setChatPosition(gVar);
        chatBubbleStyle.a(getMessageArea());
        chatBubbleStyle.c(getImageLoadingBackground());
        appearance.f56788b.a(getTitle());
        chatBubbleStyle.b(getSubtitle());
        chatBubbleStyle.b(getDescription());
        m0(getTitle(), false);
        m0(getTitleSmall(), false);
        m0(getSubtitle(), false);
        m0(getDescription(), false);
        m0(getDescriptionAction(), true);
        m0(getTag(), false);
        m0(getOverlappedIconsView(), false);
        h hVar = this.L;
        if (hVar != null) {
            u.z(hVar, this.S, 0, this.T, 0, false, 26);
        }
        setupImageMinWidth(gVar);
        u.z(getMetaView(), n.e(this, "getContext(...)", 4.0f), 0, this.T, 0, false, 26);
        i0(chatBubbleStyle);
    }

    public final void i0(ChatBubbleStyle style) {
        c0 currentModel = getMetaView().getF56804j();
        if (currentModel != null) {
            ChatBubbleMetaView metaView = getMetaView();
            boolean zJ0 = j0();
            Clause clause = currentModel.f129013a;
            Image image = currentModel.f129014b;
            Intrinsics.checkNotNullParameter(style, "style");
            metaView.setModel(new c0(clause, image, style, zJ0));
        }
    }

    public final boolean j0() {
        return getImage().getVisibility() == 0 && getTitle().getVisibility() == 8 && getTitleSmall().getVisibility() == 8 && getSubtitle().getVisibility() == 8 && getDescription().getVisibility() == 8 && getDescriptionAction().getVisibility() == 8;
    }

    public final h l0() {
        h hVar = this.L;
        if (hVar != null) {
            return hVar;
        }
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        h hVar2 = new h(context, null, 6, 0);
        hVar2.setId(R$id.chatBubble_layoutActionButtons);
        hVar2.setAnalyticsContext(getE());
        hVar2.setVisibility(8);
        ConstraintLayout.LayoutParams layoutParams = new ConstraintLayout.LayoutParams(0, -2);
        layoutParams.startToStart = 0;
        layoutParams.endToEnd = 0;
        layoutParams.topToBottom = R$id.chatBubble_descriptionAction;
        layoutParams.bottomToTop = R$id.chatBubble_overlappedIcons;
        int iE = n.e(this, "getContext(...)", 16.0f);
        ((ViewGroup.MarginLayoutParams) layoutParams).topMargin = n.e(this, "getContext(...)", 8.0f);
        ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin = iE;
        layoutParams.goneEndMargin = iE;
        layoutParams.setMarginStart(this.S);
        layoutParams.setMarginEnd(this.T);
        layoutParams.horizontalBias = BitmapDescriptorFactory.HUE_RED;
        hVar2.setLayoutParams(layoutParams);
        hVar2.setButtonOrientation(this.M);
        addView(hVar2);
        OverlappedIconsView overlappedIconsView = getOverlappedIconsView();
        ViewGroup.LayoutParams layoutParams2 = overlappedIconsView.getLayoutParams();
        if (layoutParams2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        }
        ConstraintLayout.LayoutParams layoutParams3 = (ConstraintLayout.LayoutParams) layoutParams2;
        layoutParams3.topToTop = -1;
        layoutParams3.topToBottom = R$id.chatBubble_layoutActionButtons;
        overlappedIconsView.setLayoutParams(layoutParams3);
        TextView descriptionAction = getDescriptionAction();
        ViewGroup.LayoutParams layoutParams4 = descriptionAction.getLayoutParams();
        if (layoutParams4 == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        }
        ConstraintLayout.LayoutParams layoutParams5 = (ConstraintLayout.LayoutParams) layoutParams4;
        layoutParams5.bottomToBottom = -1;
        layoutParams5.bottomToTop = R$id.chatBubble_layoutActionButtons;
        descriptionAction.setLayoutParams(layoutParams5);
        this.L = hVar2;
        return hVar2;
    }

    public final void m0(View view, boolean z) {
        View view2;
        int i = this.S;
        int i2 = this.T;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        Intrinsics.i(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        if (z) {
            int i3 = this.O;
            int iMin = Math.min(i, i3);
            int i5 = marginLayoutParams.topMargin;
            int iMin2 = i5 != 0 ? Math.min(i5, i3) : view.getPaddingTop() != 0 ? Math.min(view.getPaddingTop(), i3) : 0;
            int iMin3 = Math.min(i2, i3);
            int i6 = marginLayoutParams.bottomMargin;
            int iMin4 = i6 != 0 ? Math.min(i6, i3) : view.getPaddingBottom() != 0 ? Math.min(view.getPaddingBottom(), i3) : 0;
            view.setPaddingRelative(iMin, iMin2, iMin3, iMin4);
            int i21 = i - iMin;
            int i22 = marginLayoutParams.topMargin;
            int i32 = i22 == 0 ? 0 : i22 - iMin2;
            int i33 = i2 - iMin3;
            int i43 = marginLayoutParams.bottomMargin;
            int i59 = i43 != 0 ? i43 - iMin4 : 0;
            marginLayoutParams.setMarginStart(i21);
            marginLayoutParams.topMargin = i32;
            marginLayoutParams.setMarginEnd(i33);
            marginLayoutParams.bottomMargin = i59;
            view2 = view;
        } else {
            view2 = view;
            u.z(view2, i, 0, i2, 0, false, 26);
        }
        view2.requestLayout();
    }

    public final void n0(l size) {
        int i;
        Intrinsics.checkNotNullParameter(size, "size");
        l lVar = l.LARGE;
        int i2 = 0;
        int i3 = this.O;
        if (size != lVar || getTag().getVisibility() == 0 || getTitle().getVisibility() == 0 || getSubtitle().getVisibility() == 0 || getTitleSmall().getVisibility() == 0 || getDescriptionAction().getVisibility() == 0 || getDescription().getVisibility() != 0) {
            i = i3;
        } else {
            h hVar = this.L;
            i = this.P;
            if (hVar == null || hVar.getVisibility() != 0) {
                i3 = i;
            } else {
                i2 = i3 / 2;
                i3 = i;
                i = i2;
            }
        }
        ViewGroup.LayoutParams layoutParams = getDescription().getLayoutParams();
        Intrinsics.i(layoutParams, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        ConstraintLayout.LayoutParams layoutParams2 = (ConstraintLayout.LayoutParams) layoutParams;
        layoutParams2.goneTopMargin = i3;
        layoutParams2.goneBottomMargin = i;
        this.J.setMargin(i2);
    }

    public final void o0() {
    }

    /* JADX WARN: Removed duplicated region for block: B:57:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0158 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x016f  */
    @Override // com.revolut.core.ui_kit.internal.views.chat.ChatBubbleContainer, androidx.constraintlayout.widget.ConstraintLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onMeasure(int r11, int r12) {
        /*
            Method dump skipped, instruction units count: 449
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.core.ui_kit.internal.views.chat.ChatBubbleView.onMeasure(int, int):void");
    }

    @Override // com.revolut.core.ui_kit.internal.views.chat.ChatBubbleContainer, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        Bundle bundle = parcelable instanceof Bundle ? (Bundle) parcelable : null;
        if (bundle == null) {
            return;
        }
        ChatBubbleAppearance chatBubbleAppearance = (ChatBubbleAppearance) bundle.getParcelable("STATE_KEY_APPEARANCE");
        if (chatBubbleAppearance != null) {
            this.appearance = chatBubbleAppearance;
            h0(chatBubbleAppearance);
        }
        super.onRestoreInstanceState(bundle.getParcelable("STATE_KEY_SUPER"));
    }

    @Override // com.revolut.core.ui_kit.internal.views.chat.ChatBubbleContainer, android.view.View
    public final Parcelable onSaveInstanceState() {
        Bundle bundle = new Bundle();
        bundle.putParcelable("STATE_KEY_SUPER", super.onSaveInstanceState());
        ChatBubbleAppearance chatBubbleAppearance = this.appearance;
        if (chatBubbleAppearance != null) {
            bundle.putParcelable("STATE_KEY_APPEARANCE", chatBubbleAppearance);
        }
        return bundle;
    }

    public final void setActionButtonLayout(@NotNull a orientation) {
        Intrinsics.checkNotNullParameter(orientation, "orientation");
        if (orientation == this.M) {
            return;
        }
        this.M = orientation;
        h hVar = this.L;
        if (hVar != null) {
            hVar.setButtonOrientation(orientation);
        }
    }

    @Override // com.revolut.core.ui_kit_core.actionshandler.TrackableItem
    public void setAnalyticsContext(Parcelable parcelable) {
        h hVar = this.L;
        if (hVar != null) {
            hVar.setAnalyticsContext(parcelable);
        }
        this.analyticsContext = parcelable;
    }

    public final void setAppearance(ChatBubbleAppearance chatBubbleAppearance) {
        this.appearance = chatBubbleAppearance;
    }

    public final void setBubbleClickable(boolean clickable) {
        if (clickable == this.V) {
            return;
        }
        this.V = clickable;
        if (clickable) {
            return;
        }
        setPressed(false);
    }

    public final void setDescription(Clause clause, @NotNull g handleTypeface) {
        Intrinsics.checkNotNullParameter(handleTypeface, "handleTypeface");
        kli.a.a(getDescription(), clause, this, new c(1, this.f56820w, f.class, "onNext", "onNext(Ljava/lang/Object;)V", 0, 17), handleTypeface);
        kli.a.I(getDescription(), clause);
        u.z(getDescription(), 0, n.e(this, "getContext(...)", (getTitle().getVisibility() != 0 && getSubtitle().getVisibility() == 0) ? BitmapDescriptorFactory.HUE_RED : 8.0f), 0, 0, false, 29);
        o0();
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void setDescriptionAction(com.revolut.core.ui_kit.models.Clause r2, @org.jetbrains.annotations.NotNull com.revolut.core.ui_kit.internal.views.chat.ChatBubbleStyle r3, @org.jetbrains.annotations.NotNull xo0.g r4) {
        /*
            r1 = this;
            java.lang.String r0 = "bubbleStyle"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            java.lang.String r0 = "bubblePosition"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            boolean r3 = r3 instanceof com.revolut.core.ui_kit.internal.views.chat.ChatBubbleStyle.Light
            if (r3 == 0) goto L26
            java.lang.String r3 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r3)
            int[] r3 = xo0.h.f307544a
            int r4 = r4.ordinal()
            r3 = r3[r4]
            switch(r3) {
                case 1: goto L24;
                case 2: goto L24;
                case 3: goto L26;
                case 4: goto L26;
                case 5: goto L26;
                case 6: goto L26;
                case 7: goto L26;
                case 8: goto L26;
                case 9: goto L26;
                case 10: goto L26;
                case 11: goto L26;
                case 12: goto L26;
                default: goto L1e;
            }
        L1e:
            kotlin.NoWhenBranchMatchedException r2 = new kotlin.NoWhenBranchMatchedException
            r2.<init>()
            throw r2
        L24:
            r3 = 1
            goto L27
        L26:
            r3 = 0
        L27:
            android.widget.TextView r4 = r1.getDescriptionAction()
            if (r3 == 0) goto L2e
            goto L2f
        L2e:
            r2 = 0
        L2f:
            kli.a.c(r4, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.core.ui_kit.internal.views.chat.ChatBubbleView.setDescriptionAction(com.revolut.core.ui_kit.models.Clause, com.revolut.core.ui_kit.internal.views.chat.ChatBubbleStyle, xo0.g):void");
    }

    public final void setDescriptionActionClickListener(Function1<? super View, Unit> listener) {
        if (listener != null) {
            getDescriptionAction().setOnClickListener(new y1(1, listener));
            getDescriptionAction().setOnTouchListener(new e(new View[]{getDescriptionAction()}));
        } else {
            getDescriptionAction().setOnClickListener(null);
            getDescriptionAction().setOnTouchListener(null);
        }
    }

    public final void setDescriptionMaxLines(int maxLines) {
        getDescription().setMaxLines(maxLines);
        getDescription().setEllipsize(TextUtils.TruncateAt.END);
    }

    public final void setDescriptionTextAppearance(int attr) {
        jb3.l.e(getDescription(), attr);
    }

    public final void setImage(Image image, aw0.d0 aspectRatio) {
        if (image == null) {
            this.f56819t = null;
            getImage().setImageDrawable(null);
            getImageLoadingBackground().setVisibility(8);
            getImage().setVisibility(8);
            getImage().setContentDescription(null);
            return;
        }
        if (image.equals(this.f56819t)) {
            return;
        }
        this.f56819t = image;
        getImage().setImageDrawable(null);
        setupAspectRatioOfImage(aspectRatio);
        getImageLoadingBackground().setVisibility(0);
        getImage().setVisibility(0);
        yy0.f.e(u.k(this).Q(), image, getImage(), new eq4.g(this, 18), null, 8);
        et0.f.a(getImage());
    }

    public final void setInternalWidthConstraints(boolean relaxed) {
        int iE;
        int iE2;
        int iE3;
        if (this.u != relaxed) {
            this.u = relaxed;
            if (relaxed) {
                iE = Integer.MAX_VALUE;
                iE3 = Integer.MAX_VALUE;
                iE2 = Integer.MAX_VALUE;
            } else {
                iE = n.e(this, "getContext(...)", 289.0f);
                iE2 = n.e(this, "getContext(...)", 252.0f);
                iE3 = n.e(this, "getContext(...)", 260.0f);
            }
            UiKitMediaView giftPlayer = getGiftPlayer();
            ViewGroup.LayoutParams layoutParams = giftPlayer.getLayoutParams();
            if (layoutParams == null) {
                throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
            }
            ConstraintLayout.LayoutParams layoutParams2 = (ConstraintLayout.LayoutParams) layoutParams;
            layoutParams2.matchConstraintMaxWidth = iE;
            giftPlayer.setLayoutParams(layoutParams2);
            ImageView image = getImage();
            ViewGroup.LayoutParams layoutParams3 = image.getLayoutParams();
            if (layoutParams3 == null) {
                throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
            }
            ConstraintLayout.LayoutParams layoutParams4 = (ConstraintLayout.LayoutParams) layoutParams3;
            layoutParams4.matchConstraintMaxWidth = iE;
            image.setLayoutParams(layoutParams4);
            getTitle().setMaxWidth(iE2);
            getTitleSmall().setMaxWidth(iE2);
            getSubtitle().setMaxWidth(iE2);
            getDescription().setMaxWidth(iE3);
        }
    }

    public final void setMetaData(Clause timeStamp, Image statusIcon, @NotNull ChatBubbleStyle style) {
        Intrinsics.checkNotNullParameter(style, "style");
        getMetaView().setModel(new c0(timeStamp, statusIcon, style, j0()));
    }

    public final void setOverlappedIcons(@NotNull List<? extends Image> icons) {
        Intrinsics.checkNotNullParameter(icons, "icons");
        OverlappedIconsView.setIcons$default(getOverlappedIconsView(), icons, bb.MEDIUM, null, 0, false, 28, null);
    }

    @Override // android.view.View
    public void setPressed(boolean pressed) {
        if (this.V && pressed) {
            super.setPressed(true);
        } else {
            super.setPressed(false);
        }
    }

    public final void setPrimaryButton(ChatBubbleButtonModel model, View.OnClickListener listener) {
        if (model == null && this.L == null) {
            return;
        }
        l0().setPrimaryButton(model, listener);
    }

    public final void setReply(gw0.q replyState, @NotNull xo0.g position) {
        m4 m4Var;
        Intrinsics.checkNotNullParameter(position, "position");
        if (replyState == null) {
            TagView tag2 = getTag();
            ViewGroup.LayoutParams layoutParams = tag2.getLayoutParams();
            if (layoutParams == null) {
                throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
            }
            ConstraintLayout.LayoutParams layoutParams2 = (ConstraintLayout.LayoutParams) layoutParams;
            layoutParams2.topToTop = -1;
            layoutParams2.topToBottom = R$id.chatBubble_contentBottomBarrier;
            tag2.setLayoutParams(layoutParams2);
            m4 m4Var2 = this.N;
            if (m4Var2 != null) {
                m4Var2.setVisibility(8);
                return;
            }
            return;
        }
        m4 m4Var3 = this.N;
        AttributeSet attributeSet = null;
        int i = 0;
        if (m4Var3 != null) {
            m4Var = m4Var3;
        } else {
            int iE = n.e(this, "getContext(...)", 8.0f);
            int iE2 = n.e(this, "getContext(...)", 12.0f);
            int iE3 = n.e(this, "getContext(...)", 4.0f);
            int iE4 = n.e(this, "getContext(...)", 260.0f);
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            m4 m4Var4 = new m4(context, attributeSet, 6, i);
            m4Var4.setId(R$id.chatBubble_reply);
            ConstraintLayout.LayoutParams layoutParams3 = new ConstraintLayout.LayoutParams(0, -2);
            int iE5 = ((b.s(position) && position.b()) ? n.e(this, "getContext(...)", 5.0f) : 0) + n.e(this, "getContext(...)", 4.0f);
            int iE6 = n.e(this, "getContext(...)", 4.0f);
            int iE7 = (b.s(position) || !position.b()) ? 0 : n.e(this, "getContext(...)", 5.0f);
            layoutParams3.setMarginStart(iE5);
            ((ViewGroup.MarginLayoutParams) layoutParams3).topMargin = iE3;
            layoutParams3.setMarginEnd(iE7 + iE6);
            ((ViewGroup.MarginLayoutParams) layoutParams3).bottomMargin = iE3;
            layoutParams3.matchConstraintMinWidth = iE4;
            int i2 = R$id.chatBubble_messageArea;
            layoutParams3.endToEnd = i2;
            layoutParams3.startToStart = i2;
            layoutParams3.topToBottom = R$id.chatBubble_contentBottomBarrier;
            m4Var4.setLayoutParams(layoutParams3);
            m4Var4.setPadding(iE2, iE, iE2, iE);
            m4.a aVar = m4.Companion;
            Context context2 = getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
            aVar.getClass();
            m4Var4.setBackground(m4.a.a(context2));
            m4Var4.setOnClickListener(new b2(this, 24));
            this.N = m4Var4;
            addView(m4Var4);
            m4Var = m4Var4;
        }
        u.z(m4Var, ((b.s(position) && position.b()) ? n.e(this, "getContext(...)", 5.0f) : 0) + n.e(this, "getContext(...)", 4.0f), 0, ((b.s(position) || !position.b()) ? 0 : n.e(this, "getContext(...)", 5.0f)) + n.e(this, "getContext(...)", 4.0f), 0, false, 26);
        m4 m4Var5 = m4Var;
        TagView tag3 = getTag();
        ViewGroup.LayoutParams layoutParams4 = tag3.getLayoutParams();
        if (layoutParams4 == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        }
        ConstraintLayout.LayoutParams layoutParams5 = (ConstraintLayout.LayoutParams) layoutParams4;
        layoutParams5.topToTop = -1;
        layoutParams5.topToBottom = R$id.chatBubble_reply;
        tag3.setLayoutParams(layoutParams5);
        m4.setContent$default(m4Var5, replyState, null, 2, null);
        m4Var5.setVisibility(0);
    }

    public final void setSecondaryButton(ChatBubbleButtonModel model, View.OnClickListener listener) {
        if (model == null && this.L == null) {
            return;
        }
        l0().setSecondaryButton(model, listener);
    }

    public final void setSubtitle(Clause clause) {
        kli.a.b(getSubtitle(), clause, ty0.f.f275450a);
        o0();
    }

    public final void setTagData(TagViewData data) {
        if (data != null) {
            getTag().setContent(data);
        }
        getTag().setVisibility(data != null ? 0 : 8);
    }

    public final void setTitle(Clause clause) {
        kli.a.b(getTitle(), clause, ty0.f.f275450a);
    }

    public final void setTitleSmall(Clause clause, @NotNull ChatBubbleStyle bubbleStyle, @NotNull xo0.g bubblePosition) {
        Intrinsics.checkNotNullParameter(bubbleStyle, "bubbleStyle");
        Intrinsics.checkNotNullParameter(bubblePosition, "bubblePosition");
        boolean z = (bubbleStyle instanceof ChatBubbleStyle.Light) && b.s(bubblePosition);
        TextView titleSmall = getTitleSmall();
        if (!z) {
            clause = null;
        }
        kli.a.b(titleSmall, clause, ty0.f.f275450a);
        o0();
    }

    public final void setTitleSmallClickListener(Function1<? super View, Unit> listener) {
        getTitleSmall().setOnClickListener(listener != null ? new y1(2, listener) : null);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ChatBubbleView(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatBubbleView(@NotNull Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f56820w = v0.a.d("create(...)");
        this.f56821x = v0.a.d("create(...)");
        this.messageArea = kli.a.J(R$id.chatBubble_messageArea, this);
        this.tag = kli.a.J(R$id.chatBubble_tag, this);
        this.title = kli.a.J(R$id.chatBubble_title, this);
        this.titleSmall = kli.a.J(R$id.chatBubble_titleSmall, this);
        this.subtitle = kli.a.J(R$id.chatBubble_subtitle, this);
        this.description = kli.a.J(R$id.chatBubble_description, this);
        this.descriptionAction = kli.a.J(R$id.chatBubble_descriptionAction, this);
        this.image = kli.a.J(R$id.chatBubble_image, this);
        this.imageLoadingBackground = kli.a.J(R$id.chatBubble_imageLoadingBackground, this);
        this.metaView = kli.a.J(R$id.chatBubble_bottomViewsContainer, this);
        this.overlappedIconsView = kli.a.J(R$id.chatBubble_overlappedIcons, this);
        this.giftPlayer = kli.a.J(R$id.chatBubble_giftPlayer, this);
        this.M = a.HORIZONTAL;
        this.O = kli.a.k(context, 8.0f);
        this.P = kli.a.k(context, 12.0f);
        this.Q = kli.a.k(context, 17.0f);
        this.R = kli.a.k(context, 15.0f);
        this.U = d0.IN_TEXT;
        View.inflate(context, R$layout.internal_view_chat_bubble, this);
        setFocusable(true);
        setClickable(true);
        pd.b.q(getTitle(), false);
        pd.b.q(getTitleSmall(), false);
        pd.b.q(getSubtitle(), false);
        pd.b.q(getDescription(), false);
        OverlappedIconsView overlappedIconsView = getOverlappedIconsView();
        Intrinsics.checkNotNullParameter(overlappedIconsView, "<this>");
        overlappedIconsView.setImportantForAccessibility(4);
        Barrier barrier = new Barrier(context);
        barrier.setReferencedIds(new int[]{R$id.chatBubble_giftPlayer, R$id.chatBubble_image});
        barrier.setId(R$id.chatBubble_contentBottomBarrier);
        barrier.setType(3);
        barrier.setAllowsGoneWidget(false);
        addView(barrier);
        Barrier barrier2 = new Barrier(context);
        barrier2.setReferencedIds(new int[]{R$id.chatBubble_overlappedIcons, R$id.chatBubble_layoutActionButtons, R$id.chatBubble_description, R$id.chatBubble_descriptionAction, R$id.chatBubble_subtitle, R$id.chatBubble_title, R$id.chatBubble_reply});
        barrier2.setId(R$id.chatBubble_bottomViewsBarrier);
        barrier2.setType(3);
        barrier2.setAllowsGoneWidget(false);
        this.J = barrier2;
        addView(barrier2);
    }

    public /* synthetic */ ChatBubbleView(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i & 2) != 0 ? null : attributeSet, 0);
    }
}
