package com.revolut.uicomponent.widgets;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.uicomponent.R$drawable;
import com.revolut.uicomponent.R$id;
import com.revolut.uicomponent.R$layout;
import com.revolut.uicomponent.widgets.VerticalImageTitleTextView;
import dzl.b;
import kli.a;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import te0.w;
import yhm.d;
import yy0.f;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\r\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001:\u0001\nB'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eR\"\u0010\u0016\u001a\u00020\u000f8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R#\u0010\u001d\u001a\n \u0018*\u0004\u0018\u00010\u00170\u00178BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR#\u0010 \u001a\n \u0018*\u0004\u0018\u00010\u00170\u00178BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001e\u0010\u001a\u001a\u0004\b\u001f\u0010\u001cR#\u0010%\u001a\n \u0018*\u0004\u0018\u00010!0!8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\"\u0010\u001a\u001a\u0004\b#\u0010$R#\u0010*\u001a\n \u0018*\u0004\u0018\u00010&0&8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b'\u0010\u001a\u001a\u0004\b(\u0010)R*\u00102\u001a\u00020\u00062\u0006\u0010+\u001a\u00020\u00068\u0006@FX\u0087\u000e¢\u0006\u0012\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/\"\u0004\b0\u00101R.\u0010:\u001a\u0004\u0018\u0001032\b\u0010+\u001a\u0004\u0018\u0001038\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b4\u00105\u001a\u0004\b6\u00107\"\u0004\b8\u00109R$\u0010@\u001a\u00020;2\u0006\u0010+\u001a\u00020;8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b<\u0010=\"\u0004\b>\u0010?R$\u0010C\u001a\u00020;2\u0006\u0010+\u001a\u00020;8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bA\u0010=\"\u0004\bB\u0010?¨\u0006D"}, d2 = {"Lcom/revolut/uicomponent/widgets/VerticalImageTitleTextView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Ldzl/b;", "model", "", "setModel", "(Ldzl/b;)V", "Lyy0/f;", "b", "Lyy0/f;", "getImageDisplayer", "()Lyy0/f;", "setImageDisplayer", "(Lyy0/f;)V", "imageDisplayer", "Landroid/widget/TextView;", "kotlin.jvm.PlatformType", "f", "Lkotlin/Lazy;", "getDelegateTitle", "()Landroid/widget/TextView;", "delegateTitle", "g", "getDelegateSubtitle", "delegateSubtitle", "Landroid/widget/ImageView;", "h", "getDelegateIcon", "()Landroid/widget/ImageView;", "delegateIcon", "Landroid/view/View;", "i", "getDelegateNewBadge", "()Landroid/view/View;", "delegateNewBadge", "value", "j", "I", "getTitleTextColorAttr", "()I", "setTitleTextColorAttr", "(I)V", "titleTextColorAttr", "Lcom/revolut/core/ui_kit_core/displayers/image/Image;", "k", "Lcom/revolut/core/ui_kit_core/displayers/image/Image;", "getIcon", "()Lcom/revolut/core/ui_kit_core/displayers/image/Image;", "setIcon", "(Lcom/revolut/core/ui_kit_core/displayers/image/Image;)V", "icon", "", "getTitleText", "()Ljava/lang/CharSequence;", "setTitleText", "(Ljava/lang/CharSequence;)V", "titleText", "getSubtitleText", "setSubtitleText", "subtitleText", "core_ui_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@d
public final class VerticalImageTitleTextView extends ConstraintLayout {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final /* synthetic */ int f107315l = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public f imageDisplayer;
    public final Object f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Object f107317g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Object f107318h;
    public final Object i;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    public int titleTextColorAttr;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    public Image icon;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public VerticalImageTitleTextView(@NotNull Context context) {
        this(context, null, 6, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    private final ImageView getDelegateIcon() {
        return (ImageView) this.f107318h.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    private final View getDelegateNewBadge() {
        return (View) this.i.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    private final TextView getDelegateSubtitle() {
        return (TextView) this.f107317g.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    private final TextView getDelegateTitle() {
        return (TextView) this.f.getValue();
    }

    public final Image getIcon() {
        return this.icon;
    }

    @NotNull
    public final f getImageDisplayer() {
        f fVar = this.imageDisplayer;
        if (fVar != null) {
            return fVar;
        }
        Intrinsics.r("imageDisplayer");
        throw null;
    }

    @NotNull
    public final CharSequence getSubtitleText() {
        CharSequence text = getDelegateSubtitle().getText();
        Intrinsics.checkNotNullExpressionValue(text, "getText(...)");
        return text;
    }

    @NotNull
    public final CharSequence getTitleText() {
        CharSequence text = getDelegateTitle().getText();
        Intrinsics.checkNotNullExpressionValue(text, "getText(...)");
        return text;
    }

    public final int getTitleTextColorAttr() {
        return this.titleTextColorAttr;
    }

    public final void setIcon(Image image) {
        this.icon = image;
        f imageDisplayer = getImageDisplayer();
        ImageView delegateIcon = getDelegateIcon();
        Intrinsics.checkNotNullExpressionValue(delegateIcon, "<get-delegateIcon>(...)");
        f.e(imageDisplayer, image, delegateIcon, null, null, 12);
    }

    public final void setImageDisplayer(@NotNull f fVar) {
        Intrinsics.checkNotNullParameter(fVar, "<set-?>");
        this.imageDisplayer = fVar;
    }

    public final void setModel(@NotNull b model) {
        Intrinsics.checkNotNullParameter(model, "model");
        throw null;
    }

    public final void setSubtitleText(@NotNull CharSequence value) {
        Intrinsics.checkNotNullParameter(value, "value");
        getDelegateSubtitle().setText(value);
    }

    public final void setTitleText(@NotNull CharSequence value) {
        Intrinsics.checkNotNullParameter(value, "value");
        getDelegateTitle().setText(value);
    }

    public final void setTitleTextColorAttr(int i) {
        this.titleTextColorAttr = i;
        TextView delegateTitle = getDelegateTitle();
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        delegateTitle.setTextColor(a.s(i, context));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public VerticalImageTitleTextView(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VerticalImageTitleTextView(@NotNull Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        final int i2 = 0;
        this.f = w.y0(new Function0(this) { // from class: dzl.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ VerticalImageTitleTextView f121357b;

            {
                this.f121357b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i3 = i2;
                VerticalImageTitleTextView verticalImageTitleTextView = this.f121357b;
                switch (i3) {
                    case 0:
                        int i5 = VerticalImageTitleTextView.f107315l;
                        return (TextView) verticalImageTitleTextView.findViewById(R$id.delegate_title);
                    case 1:
                        int i6 = VerticalImageTitleTextView.f107315l;
                        return (TextView) verticalImageTitleTextView.findViewById(R$id.delegate_subtitle);
                    case 2:
                        int i21 = VerticalImageTitleTextView.f107315l;
                        return (ImageView) verticalImageTitleTextView.findViewById(R$id.delegate_icon);
                    default:
                        int i22 = VerticalImageTitleTextView.f107315l;
                        return verticalImageTitleTextView.findViewById(R$id.delegate_new_badge);
                }
            }
        });
        final int i3 = 1;
        this.f107317g = w.y0(new Function0(this) { // from class: dzl.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ VerticalImageTitleTextView f121357b;

            {
                this.f121357b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i32 = i3;
                VerticalImageTitleTextView verticalImageTitleTextView = this.f121357b;
                switch (i32) {
                    case 0:
                        int i5 = VerticalImageTitleTextView.f107315l;
                        return (TextView) verticalImageTitleTextView.findViewById(R$id.delegate_title);
                    case 1:
                        int i6 = VerticalImageTitleTextView.f107315l;
                        return (TextView) verticalImageTitleTextView.findViewById(R$id.delegate_subtitle);
                    case 2:
                        int i21 = VerticalImageTitleTextView.f107315l;
                        return (ImageView) verticalImageTitleTextView.findViewById(R$id.delegate_icon);
                    default:
                        int i22 = VerticalImageTitleTextView.f107315l;
                        return verticalImageTitleTextView.findViewById(R$id.delegate_new_badge);
                }
            }
        });
        final int i5 = 2;
        this.f107318h = w.y0(new Function0(this) { // from class: dzl.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ VerticalImageTitleTextView f121357b;

            {
                this.f121357b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i32 = i5;
                VerticalImageTitleTextView verticalImageTitleTextView = this.f121357b;
                switch (i32) {
                    case 0:
                        int i59 = VerticalImageTitleTextView.f107315l;
                        return (TextView) verticalImageTitleTextView.findViewById(R$id.delegate_title);
                    case 1:
                        int i6 = VerticalImageTitleTextView.f107315l;
                        return (TextView) verticalImageTitleTextView.findViewById(R$id.delegate_subtitle);
                    case 2:
                        int i21 = VerticalImageTitleTextView.f107315l;
                        return (ImageView) verticalImageTitleTextView.findViewById(R$id.delegate_icon);
                    default:
                        int i22 = VerticalImageTitleTextView.f107315l;
                        return verticalImageTitleTextView.findViewById(R$id.delegate_new_badge);
                }
            }
        });
        final int i6 = 3;
        this.i = w.y0(new Function0(this) { // from class: dzl.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ VerticalImageTitleTextView f121357b;

            {
                this.f121357b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i32 = i6;
                VerticalImageTitleTextView verticalImageTitleTextView = this.f121357b;
                switch (i32) {
                    case 0:
                        int i59 = VerticalImageTitleTextView.f107315l;
                        return (TextView) verticalImageTitleTextView.findViewById(R$id.delegate_title);
                    case 1:
                        int i66 = VerticalImageTitleTextView.f107315l;
                        return (TextView) verticalImageTitleTextView.findViewById(R$id.delegate_subtitle);
                    case 2:
                        int i21 = VerticalImageTitleTextView.f107315l;
                        return (ImageView) verticalImageTitleTextView.findViewById(R$id.delegate_icon);
                    default:
                        int i22 = VerticalImageTitleTextView.f107315l;
                        return verticalImageTitleTextView.findViewById(R$id.delegate_new_badge);
                }
            }
        });
        this.titleTextColorAttr = R$attr.uikit_colorForeground;
        View.inflate(context, R$layout.layout_vertical_image_text, this);
        if (getBackground() == null) {
            setBackgroundResource(R$drawable.deprecated_background_selectable_white);
        }
    }

    public /* synthetic */ VerticalImageTitleTextView(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i & 2) != 0 ? null : attributeSet, 0);
    }
}
