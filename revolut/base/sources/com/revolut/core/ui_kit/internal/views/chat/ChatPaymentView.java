package com.revolut.core.ui_kit.internal.views.chat;

import a0.d;
import android.content.Context;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import au0.y1;
import aw0.d0;
import aw0.i3;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.core.ui_kit.R$id;
import com.revolut.core.ui_kit.R$layout;
import com.revolut.core.ui_kit.internal.views.SmallActionButton;
import com.revolut.core.ui_kit.internal.views.tag.TagView;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.NavBarWithContainerBackground;
import com.revolut.core.ui_kit.views.BackgroundWallpaperView;
import com.revolut.core.ui_kit.views.OverlappedIconsView;
import com.revolut.core.ui_kit.views.SingleLineAutoSizeTextView;
import com.revolut.core.ui_kit_core.actionshandler.TrackableItem;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_resources.R$attr;
import foh.i;
import java.util.List;
import jb3.l;
import kli.a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import mx0.bb;
import or0.u;
import org.jetbrains.annotations.NotNull;
import xo0.g;
import yy0.f;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u0096\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\r\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B'\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0019\u0010\u0015\u001a\u00020\u00102\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0019\u001a\u00020\u00102\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001b\u001a\u00020\u00102\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017¢\u0006\u0004\b\u001b\u0010\u001aJ\u0017\u0010\u001c\u001a\u00020\u00102\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017¢\u0006\u0004\b\u001c\u0010\u001aJ!\u0010\u001f\u001a\u00020\u00102\b\u0010\u001e\u001a\u0004\u0018\u00010\u001d2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u001f\u0010 J#\u0010$\u001a\u00020\u00102\u0014\u0010#\u001a\u0010\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020\u0010\u0018\u00010!¢\u0006\u0004\b$\u0010%J#\u0010&\u001a\u00020\u00102\u0014\u0010#\u001a\u0010\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020\u0010\u0018\u00010!¢\u0006\u0004\b&\u0010%J\u0017\u0010)\u001a\u00020\u00102\b\u0010(\u001a\u0004\u0018\u00010'¢\u0006\u0004\b)\u0010*J\u0017\u0010-\u001a\u00020\u00102\b\u0010,\u001a\u0004\u0018\u00010+¢\u0006\u0004\b-\u0010.J\u0017\u00101\u001a\u00020\u00102\b\u00100\u001a\u0004\u0018\u00010/¢\u0006\u0004\b1\u00102J\u0017\u00103\u001a\u00020\u00102\b\u00100\u001a\u0004\u0018\u00010/¢\u0006\u0004\b3\u00102J\u001b\u00106\u001a\u00020\u00102\f\u00105\u001a\b\u0012\u0004\u0012\u00020\u001d04¢\u0006\u0004\b6\u00107J\u001d\u0010;\u001a\u00020\u00102\u000e\u0010:\u001a\n\u0018\u000108j\u0004\u0018\u0001`9¢\u0006\u0004\b;\u0010<J\u0013\u0010>\u001a\b\u0012\u0004\u0012\u00020=04¢\u0006\u0004\b>\u0010?R.\u0010H\u001a\u0004\u0018\u00010@2\b\u0010A\u001a\u0004\u0018\u00010@8\u0016@VX\u0096\u000e¢\u0006\u0012\n\u0004\bB\u0010C\u001a\u0004\bD\u0010E\"\u0004\bF\u0010G¨\u0006I"}, d2 = {"Lcom/revolut/core/ui_kit/internal/views/chat/ChatPaymentView;", "Lcom/revolut/core/ui_kit/internal/views/chat/ChatBubbleContainer;", "Lcom/revolut/core/ui_kit_core/actionshandler/TrackableItem;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lcom/revolut/core/ui_kit/views/BackgroundWallpaperView;", "getOrCreateWallpaperView", "()Lcom/revolut/core/ui_kit/views/BackgroundWallpaperView;", "Lxo0/g;", "position", "", "setupImageMinWidth", "(Lxo0/g;)V", "Law0/d0;", "aspectRatio", "setupAspectRatioOfImage", "(Law0/d0;)V", "Lcom/revolut/core/ui_kit/models/Clause;", "clause", "setTitle", "(Lcom/revolut/core/ui_kit/models/Clause;)V", "setSubtitle", "setTimestamp", "Lcom/revolut/core/ui_kit_core/displayers/image/Image;", "image", "setImage", "(Lcom/revolut/core/ui_kit_core/displayers/image/Image;Law0/d0;)V", "Lkotlin/Function1;", "Landroid/view/View;", "listener", "setPrimaryButtonClickListener", "(Lkotlin/jvm/functions/Function1;)V", "setSecondaryButtonClickListener", "Law0/i3;", "customFont", "setTitleCustomFont", "(Law0/i3;)V", "Lgw0/u;", "data", "setTagData", "(Lgw0/u;)V", "Lcom/revolut/core/ui_kit/internal/views/chat/ChatBubbleButtonModel;", "chatBubbleButtonModel", "setPrimaryButton", "(Lcom/revolut/core/ui_kit/internal/views/chat/ChatBubbleButtonModel;)V", "setSecondaryButton", "", "icons", "setOverlappedIcons", "(Ljava/util/List;)V", "Lcom/revolut/core/ui_kit/models/NavBarWithContainerBackground;", "Lcom/revolut/core/ui_kit/models/NavBarBackground;", "background", "setMediaBackground", "(Lcom/revolut/core/ui_kit/models/NavBarWithContainerBackground;)V", "", "getAccessibilityContentDescriptions", "()Ljava/util/List;", "Landroid/os/Parcelable;", "value", "G", "Landroid/os/Parcelable;", "getAnalyticsContext", "()Landroid/os/Parcelable;", "setAnalyticsContext", "(Landroid/os/Parcelable;)V", "analyticsContext", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class ChatPaymentView extends ChatBubbleContainer implements TrackableItem {
    public static final /* synthetic */ int H = 0;
    public final SmallActionButton A;
    public final SmallActionButton B;
    public final TextView C;
    public final OverlappedIconsView D;
    public final TagView E;
    public final ImageView F;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    public Parcelable analyticsContext;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final int f56832s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final int f56833t;
    public BackgroundWallpaperView u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f56834w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final SingleLineAutoSizeTextView f56835x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final TextView f56836y;
    public final ImageView z;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ChatPaymentView(@NotNull Context context) {
        this(context, null, 6, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    private final BackgroundWallpaperView getOrCreateWallpaperView() {
        BackgroundWallpaperView backgroundWallpaperView = this.u;
        if (backgroundWallpaperView != null) {
            return backgroundWallpaperView;
        }
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        BackgroundWallpaperView backgroundWallpaperView2 = new BackgroundWallpaperView(context, null, 6);
        backgroundWallpaperView2.setId(View.generateViewId());
        ConstraintLayout.LayoutParams layoutParams = new ConstraintLayout.LayoutParams(0, 0);
        layoutParams.startToStart = 0;
        layoutParams.endToEnd = 0;
        layoutParams.topToTop = 0;
        layoutParams.bottomToBottom = 0;
        layoutParams.setMarginStart(-this.v);
        layoutParams.setMarginEnd(-this.f56834w);
        backgroundWallpaperView2.setLayoutParams(layoutParams);
        addView(backgroundWallpaperView2, 0);
        this.u = backgroundWallpaperView2;
        return backgroundWallpaperView2;
    }

    public static void h0(SmallActionButton smallActionButton, ChatBubbleButtonModel chatBubbleButtonModel) {
        smallActionButton.setVisibility(chatBubbleButtonModel != null ? 0 : 8);
        if (chatBubbleButtonModel != null) {
            smallActionButton.setText(chatBubbleButtonModel.f56790a);
            smallActionButton.setIcon(chatBubbleButtonModel.f56792c);
            smallActionButton.i(chatBubbleButtonModel.f56791b);
        }
    }

    private final void setupAspectRatioOfImage(d0 aspectRatio) {
        ImageView imageView = this.z;
        ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        }
        ConstraintLayout.LayoutParams layoutParams2 = (ConstraintLayout.LayoutParams) layoutParams;
        if (aspectRatio != null) {
            ((ViewGroup.MarginLayoutParams) layoutParams2).height = 0;
            imageView.setAdjustViewBounds(false);
            layoutParams2.dimensionRatio = d.i(aspectRatio.f10274a, ":", aspectRatio.f10275b);
        } else {
            ((ViewGroup.MarginLayoutParams) layoutParams2).height = -2;
            imageView.setAdjustViewBounds(true);
            layoutParams2.dimensionRatio = null;
        }
        imageView.setLayoutParams(layoutParams2);
    }

    private final void setupImageMinWidth(g position) {
        ImageView imageView = this.z;
        ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        }
        ConstraintLayout.LayoutParams layoutParams2 = (ConstraintLayout.LayoutParams) layoutParams;
        float f = position.b() ? 5.0f : BitmapDescriptorFactory.HUE_RED;
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        layoutParams2.matchConstraintMinWidth = a.k(context, f + 230.0f);
        imageView.setLayoutParams(layoutParams2);
    }

    public final void g0(ChatBubbleAppearance appearance) {
        Intrinsics.checkNotNullParameter(appearance, "appearance");
        ChatBubbleStyle chatBubbleStyle = appearance.f56787a;
        chatBubbleStyle.d(this.C, false);
        chatBubbleStyle.a(this);
        chatBubbleStyle.b(this.f56836y);
        appearance.f56788b.a(this.f56835x);
        g gVar = appearance.f56789c;
        setChatPosition(gVar);
        setupImageMinWidth(gVar);
    }

    @NotNull
    public final List<CharSequence> getAccessibilityContentDescriptions() {
        CharSequence[] elements = {this.z.getContentDescription(), this.E.getContentDescription(), this.f56835x.getText(), this.f56836y.getText(), this.C.getText()};
        Intrinsics.checkNotNullParameter(elements, "elements");
        return kotlin.collections.d.L(elements);
    }

    @Override // com.revolut.core.ui_kit_core.actionshandler.TrackableItem
    /* JADX INFO: renamed from: getAnalyticsContext, reason: from getter */
    public Parcelable getF51669t() {
        return this.analyticsContext;
    }

    public final void i0(int i, int i2) {
        setPaddingRelative(i, getPaddingTop(), i2, getPaddingBottom());
        this.v = i;
        this.f56834w = i2;
        BackgroundWallpaperView backgroundWallpaperView = this.u;
        if (backgroundWallpaperView != null) {
            ViewGroup.LayoutParams layoutParams = backgroundWallpaperView.getLayoutParams();
            if (layoutParams == null) {
                throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
            }
            ConstraintLayout.LayoutParams layoutParams2 = (ConstraintLayout.LayoutParams) layoutParams;
            layoutParams2.setMarginStart(-i);
            layoutParams2.setMarginEnd(-i2);
            backgroundWallpaperView.setLayoutParams(layoutParams2);
        }
    }

    @Override // com.revolut.core.ui_kit_core.actionshandler.TrackableItem
    public void setAnalyticsContext(Parcelable parcelable) {
        this.A.setAnalyticsContext(parcelable);
        this.B.setAnalyticsContext(parcelable);
        this.analyticsContext = parcelable;
    }

    public final void setImage(Image image, d0 aspectRatio) {
        ImageView imageView = this.z;
        if (image == null) {
            imageView.setImageDrawable(null);
            imageView.setVisibility(8);
            imageView.setContentDescription(null);
        } else {
            imageView.setImageDrawable(null);
            setupAspectRatioOfImage(aspectRatio);
            imageView.setVisibility(0);
            f.e(u.k(this).Q(), image, this.z, null, null, 12);
            et0.f.a(imageView);
        }
    }

    public final void setMediaBackground(NavBarWithContainerBackground background) throws Throwable {
        if (background != null) {
            BackgroundWallpaperView orCreateWallpaperView = getOrCreateWallpaperView();
            orCreateWallpaperView.setVisibility(0);
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            if (layoutParams == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
            }
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            layoutParams.width = a.k(context, 212.0f);
            Context context2 = getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
            layoutParams.height = a.k(context2, 360.0f);
            setLayoutParams(layoutParams);
            orCreateWallpaperView.setBackground(background, null);
            return;
        }
        BackgroundWallpaperView backgroundWallpaperView = this.u;
        if (backgroundWallpaperView == null || backgroundWallpaperView.getVisibility() != 0) {
            return;
        }
        BackgroundWallpaperView backgroundWallpaperView2 = this.u;
        if (backgroundWallpaperView2 != null) {
            backgroundWallpaperView2.setVisibility(8);
        }
        ViewGroup.LayoutParams layoutParams2 = getLayoutParams();
        if (layoutParams2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        }
        layoutParams2.width = -2;
        layoutParams2.height = -2;
        setLayoutParams(layoutParams2);
        BackgroundWallpaperView backgroundWallpaperView3 = this.u;
        if (backgroundWallpaperView3 != null) {
            backgroundWallpaperView3.setBackground(null, null);
        }
    }

    public final void setOverlappedIcons(@NotNull List<? extends Image> icons) {
        Intrinsics.checkNotNullParameter(icons, "icons");
        OverlappedIconsView.setIcons$default(this.D, icons, bb.MEDIUM, null, 0, false, 28, null);
    }

    public final void setPrimaryButton(ChatBubbleButtonModel chatBubbleButtonModel) {
        h0(this.A, chatBubbleButtonModel);
    }

    public final void setPrimaryButtonClickListener(Function1<? super View, Unit> listener) {
        this.A.setOnClickListener(listener != null ? new y1(4, listener) : null);
    }

    public final void setSecondaryButton(ChatBubbleButtonModel chatBubbleButtonModel) {
        h0(this.B, chatBubbleButtonModel);
    }

    public final void setSecondaryButtonClickListener(Function1<? super View, Unit> listener) {
        this.B.setOnClickListener(listener != null ? new y1(3, listener) : null);
    }

    public final void setSubtitle(Clause clause) {
        a.b(this.f56836y, clause, ty0.f.f275450a);
    }

    public final void setTagData(gw0.u data) {
        ImageView imageView = this.F;
        TagView tagView = this.E;
        if (data == null) {
            tagView.setVisibility(8);
            imageView.setVisibility(8);
        } else {
            tagView.setContent(data.f147258a);
            tagView.setVisibility(0);
            imageView.setVisibility(data.f147259b ? 0 : 8);
        }
    }

    public final void setTimestamp(Clause clause) {
        a.b(this.C, clause, ty0.f.f275450a);
    }

    public final void setTitle(Clause clause) {
        a.b(this.f56835x, clause, ty0.f.f275450a);
    }

    public final void setTitleCustomFont(i3 customFont) {
        g4i.a.j(this.f56835x).a(customFont);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ChatPaymentView(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatPaymentView(@NotNull Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f56832s = i.j(4);
        this.f56833t = i.j(0);
        setClipToOutline(true);
        setClipToPadding(false);
        View.inflate(context, R$layout.internal_view_payment_bubble, this);
        View viewFindViewById = findViewById(R$id.chatPaymentBubble_title);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        SingleLineAutoSizeTextView singleLineAutoSizeTextView = (SingleLineAutoSizeTextView) viewFindViewById;
        this.f56835x = singleLineAutoSizeTextView;
        View viewFindViewById2 = findViewById(R$id.chatPaymentBubble_subtitle);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        this.f56836y = (TextView) viewFindViewById2;
        View viewFindViewById3 = findViewById(R$id.chatPaymentBubble_image);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
        this.z = (ImageView) viewFindViewById3;
        View viewFindViewById4 = findViewById(R$id.chatPaymentBubble_primaryButton);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById4, "findViewById(...)");
        this.A = (SmallActionButton) viewFindViewById4;
        View viewFindViewById5 = findViewById(R$id.chatPaymentBubble_secondaryButton);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById5, "findViewById(...)");
        this.B = (SmallActionButton) viewFindViewById5;
        View viewFindViewById6 = findViewById(R$id.chatPaymentBubble_timestamp);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById6, "findViewById(...)");
        this.C = (TextView) viewFindViewById6;
        View viewFindViewById7 = findViewById(R$id.chatPaymentBubble_overlappedIcons);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById7, "findViewById(...)");
        this.D = (OverlappedIconsView) viewFindViewById7;
        View viewFindViewById8 = findViewById(R$id.chatPaymentBubble_tag);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById8, "findViewById(...)");
        this.E = (TagView) viewFindViewById8;
        View viewFindViewById9 = findViewById(R$id.chatPaymentBubble_tagChevron);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById9, "findViewById(...)");
        this.F = (ImageView) viewFindViewById9;
        l.e(singleLineAutoSizeTextView, R$attr.internal_textAppearanceHeading1);
    }

    public /* synthetic */ ChatPaymentView(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i & 2) != 0 ? null : attributeSet, 0);
    }
}
