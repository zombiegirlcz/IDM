package com.revolut.core.ui_kit.internal.views;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import au0.q4;
import com.revolut.core.ui_kit.R$id;
import com.revolut.core.ui_kit.R$layout;
import com.revolut.core.ui_kit.internal.views.NumberlessCardView;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import e8.q;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import or0.u;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\n\b\u0000\u0018\u0000 ?2\u00020\u0001:\u0001@B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u000f\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u000f\u0010\u000eJ\u0017\u0010\u0010\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0010\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0011\u0010\u000eJ\u0015\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\u0006¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0017\u001a\u00020\f2\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0017\u0010\u0018J3\u0010\u001e\u001a\u00020\f2\b\u0010\u001a\u001a\u0004\u0018\u00010\u00192\b\u0010\u001b\u001a\u0004\u0018\u00010\u00062\b\u0010\u001c\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u001d\u001a\u00020\u0015¢\u0006\u0004\b\u001e\u0010\u001fR\u001b\u0010%\u001a\u00020 8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\u001b\u0010(\u001a\u00020 8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b&\u0010\"\u001a\u0004\b'\u0010$R\u001b\u0010-\u001a\u00020)8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b*\u0010\"\u001a\u0004\b+\u0010,R\u001b\u00100\u001a\u00020)8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b.\u0010\"\u001a\u0004\b/\u0010,R\u001b\u00103\u001a\u00020)8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b1\u0010\"\u001a\u0004\b2\u0010,R\u001b\u00106\u001a\u00020)8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b4\u0010\"\u001a\u0004\b5\u0010,R\u001b\u0010;\u001a\u0002078BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b8\u0010\"\u001a\u0004\b9\u0010:R\u001b\u0010>\u001a\u0002078BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b<\u0010\"\u001a\u0004\b=\u0010:¨\u0006A"}, d2 = {"Lcom/revolut/core/ui_kit/internal/views/NumberlessCardView;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyle", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lcom/revolut/core/ui_kit_core/displayers/image/Image;", "image", "", "setCardFrontImage", "(Lcom/revolut/core/ui_kit_core/displayers/image/Image;)V", "setCardBackImage", "setCardBackOverlay", "setCustomisationImage", "width", "setCardWidth", "(I)V", "", "visible", "setDetailsVisible", "(Z)V", "Lcom/revolut/core/ui_kit/models/Clause;", "name", "x", "y", "isOnBackSide", "setCardHolderName", "(Lcom/revolut/core/ui_kit/models/Clause;Ljava/lang/Integer;Ljava/lang/Integer;Z)V", "Landroidx/constraintlayout/widget/ConstraintLayout;", "d", "Le8/q;", "getFrontView", "()Landroidx/constraintlayout/widget/ConstraintLayout;", "frontView", "e", "getBackView", "backView", "Landroidx/appcompat/widget/AppCompatImageView;", "f", "getCardFrontImage", "()Landroidx/appcompat/widget/AppCompatImageView;", "cardFrontImage", "g", "getCardBackImage", "cardBackImage", "h", "getBackOverlay", "backOverlay", "i", "getCustomisation", "customisation", "Landroidx/appcompat/widget/AppCompatTextView;", "j", "getFrontCardHolderName", "()Landroidx/appcompat/widget/AppCompatTextView;", "frontCardHolderName", "k", "getBackCardHolderName", "backCardHolderName", "Companion", "a", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class NumberlessCardView extends FrameLayout {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f56290a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final kq0.a f56291b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ihm.f f56292c;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public final q frontView;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public final q backView;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public final q cardFrontImage;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    public final q cardBackImage;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    public final q backOverlay;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    public final q customisation;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    public final q frontCardHolderName;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    public final q backCardHolderName;

    /* JADX INFO: renamed from: com.revolut.core.ui_kit.internal.views.NumberlessCardView$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public NumberlessCardView(@NotNull Context context) {
        this(context, null, 6, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    private final AppCompatTextView getBackCardHolderName() {
        return (AppCompatTextView) this.backCardHolderName.f();
    }

    private final AppCompatImageView getBackOverlay() {
        return (AppCompatImageView) this.backOverlay.f();
    }

    private final ConstraintLayout getBackView() {
        return (ConstraintLayout) this.backView.f();
    }

    private final AppCompatImageView getCardBackImage() {
        return (AppCompatImageView) this.cardBackImage.f();
    }

    private final AppCompatImageView getCardFrontImage() {
        return (AppCompatImageView) this.cardFrontImage.f();
    }

    private final AppCompatImageView getCustomisation() {
        return (AppCompatImageView) this.customisation.f();
    }

    private final AppCompatTextView getFrontCardHolderName() {
        return (AppCompatTextView) this.frontCardHolderName.f();
    }

    private final ConstraintLayout getFrontView() {
        return (ConstraintLayout) this.frontView.f();
    }

    public final void a(View view, int i, int i2) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        Intrinsics.i(layoutParams, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        ConstraintLayout.LayoutParams layoutParams2 = (ConstraintLayout.LayoutParams) layoutParams;
        layoutParams2.setMargins((int) (i * (getMeasuredWidth() / 2025.0f)), (int) (i2 * (getMeasuredHeight() / 1275.0f)), 0, 0);
        view.setLayoutParams(layoutParams2);
    }

    public final void b() {
        if (getBackView().getVisibility() == 0) {
            return;
        }
        ConstraintLayout frontView = getFrontView();
        ConstraintLayout backView = getBackView();
        kq0.a aVar = this.f56291b;
        aVar.b(frontView, backView);
        aVar.c(getFrontView(), getBackView());
    }

    public final void c() {
        if (getFrontView().getVisibility() == 0) {
            return;
        }
        ConstraintLayout frontView = getFrontView();
        ConstraintLayout backView = getBackView();
        kq0.a aVar = this.f56291b;
        aVar.b(frontView, backView);
        aVar.c(getBackView(), getFrontView());
    }

    public final void setCardBackImage(@NotNull Image image) {
        Intrinsics.checkNotNullParameter(image, "image");
        yy0.f.e(u.k(this).Q(), image, getCardBackImage(), null, null, 12);
    }

    public final void setCardBackOverlay(Image image) {
        yy0.f.e(u.k(this).Q(), image, getBackOverlay(), null, null, 12);
    }

    public final void setCardFrontImage(@NotNull Image image) {
        Intrinsics.checkNotNullParameter(image, "image");
        yy0.f.e(u.k(this).Q(), image, getCardFrontImage(), null, null, 12);
    }

    public final void setCardHolderName(Clause name, Integer x3, Integer y2, boolean isOnBackSide) {
        AppCompatTextView frontCardHolderName;
        if (isOnBackSide) {
            getFrontCardHolderName().setVisibility(8);
            frontCardHolderName = getBackCardHolderName();
        } else {
            getBackCardHolderName().setVisibility(8);
            frontCardHolderName = getFrontCardHolderName();
        }
        AppCompatTextView appCompatTextView = frontCardHolderName;
        ty0.c.b(u.k(this).b0(), name, appCompatTextView, null, null, 12);
        if (x3 == null || y2 == null) {
            return;
        }
        if (getMeasuredWidth() == 0 || getMeasuredHeight() == 0) {
            post(new b0.e(this, appCompatTextView, x3, y2, 5));
        } else {
            a(appCompatTextView, x3.intValue(), y2.intValue());
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public final void setCardWidth(int width) {
        if (((Boolean) jo0.g.f176833q.getValue()).booleanValue()) {
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            if (ny0.i.d(context)) {
                Context context2 = getContext();
                Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
                int iK = kli.a.k(context2, 350.0f);
                if (width > iK) {
                    width = iK;
                }
            }
        }
        int i = (int) (width / 1.592f);
        getFrontView().getLayoutParams().width = width;
        getFrontView().getLayoutParams().height = i;
        getBackView().getLayoutParams().width = width;
        getBackView().getLayoutParams().height = i;
    }

    public final void setCustomisationImage(Image image) {
        yy0.f.e(u.k(this).Q(), image, getCustomisation(), null, null, 12);
    }

    public final void setDetailsVisible(boolean visible) {
        getBackOverlay().setVisibility(visible ? 0 : 8);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public NumberlessCardView(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NumberlessCardView(@NotNull Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f56290a = kli.a.k(context, 12.0f);
        this.f56291b = new kq0.a();
        q4 q4Var = new q4(this, 4);
        this.f56292c = v0.a.d("create(...)");
        this.frontView = kli.a.J(R$id.internalNumberlessCard_frontView, this);
        this.backView = kli.a.J(R$id.internalNumberlessCard_backView, this);
        this.cardFrontImage = kli.a.J(R$id.internalNumberlessCard_cardFrontImage, this);
        this.cardBackImage = kli.a.J(R$id.internalNumberlessCard_cardBackImage, this);
        this.backOverlay = kli.a.J(R$id.internalNumberlessCard_cardBackOverlay, this);
        this.customisation = kli.a.J(R$id.internalNumberlessCard_customisationImage, this);
        this.frontCardHolderName = kli.a.J(R$id.internalNumberlessCard_frontCardHolderName, this);
        this.backCardHolderName = kli.a.J(R$id.internalNumberlessCard_backCardHolderName, this);
        View.inflate(context, R$layout.internal_view_numberless_card, this);
        getFrontView().setVisibility(0);
        getBackView().setVisibility(8);
        setClipToPadding(false);
        getFrontView().setClipToOutline(true);
        getFrontView().setOutlineProvider(q4Var);
        getBackView().setClipToOutline(true);
        getBackView().setOutlineProvider(q4Var);
        final int i2 = 0;
        getCardFrontImage().setOnClickListener(new View.OnClickListener(this) { // from class: ms0.h2

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ NumberlessCardView f208272b;

            {
                this.f208272b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i2) {
                    case 0:
                        this.f208272b.f56292c.onNext(Unit.f186387a);
                        break;
                    case 1:
                        this.f208272b.f56292c.onNext(Unit.f186387a);
                        break;
                    case 2:
                        this.f208272b.f56292c.onNext(Unit.f186387a);
                        break;
                    default:
                        this.f208272b.f56292c.onNext(Unit.f186387a);
                        break;
                }
            }
        });
        final int i3 = 1;
        getCardBackImage().setOnClickListener(new View.OnClickListener(this) { // from class: ms0.h2

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ NumberlessCardView f208272b;

            {
                this.f208272b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i3) {
                    case 0:
                        this.f208272b.f56292c.onNext(Unit.f186387a);
                        break;
                    case 1:
                        this.f208272b.f56292c.onNext(Unit.f186387a);
                        break;
                    case 2:
                        this.f208272b.f56292c.onNext(Unit.f186387a);
                        break;
                    default:
                        this.f208272b.f56292c.onNext(Unit.f186387a);
                        break;
                }
            }
        });
        final int i5 = 2;
        getBackOverlay().setOnClickListener(new View.OnClickListener(this) { // from class: ms0.h2

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ NumberlessCardView f208272b;

            {
                this.f208272b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i5) {
                    case 0:
                        this.f208272b.f56292c.onNext(Unit.f186387a);
                        break;
                    case 1:
                        this.f208272b.f56292c.onNext(Unit.f186387a);
                        break;
                    case 2:
                        this.f208272b.f56292c.onNext(Unit.f186387a);
                        break;
                    default:
                        this.f208272b.f56292c.onNext(Unit.f186387a);
                        break;
                }
            }
        });
        final int i6 = 3;
        getCustomisation().setOnClickListener(new View.OnClickListener(this) { // from class: ms0.h2

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ NumberlessCardView f208272b;

            {
                this.f208272b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i6) {
                    case 0:
                        this.f208272b.f56292c.onNext(Unit.f186387a);
                        break;
                    case 1:
                        this.f208272b.f56292c.onNext(Unit.f186387a);
                        break;
                    case 2:
                        this.f208272b.f56292c.onNext(Unit.f186387a);
                        break;
                    default:
                        this.f208272b.f56292c.onNext(Unit.f186387a);
                        break;
                }
            }
        });
    }

    public /* synthetic */ NumberlessCardView(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i & 2) != 0 ? null : attributeSet, 0);
    }
}
