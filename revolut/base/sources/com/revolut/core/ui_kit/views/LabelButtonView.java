package com.revolut.core.ui_kit.views;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import au0.p2;
import aw0.o9;
import com.revolut.core.ui_kit.R$id;
import com.revolut.core.ui_kit.R$layout;
import com.revolut.core.ui_kit.R$styleable;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit_core.actionshandler.TrackableItem;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.youTransactor.uCube.rpc.Constants;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u00012\u00020\u0002B'\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\r2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0014\u001a\u00020\r2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0014\u0010\u0013R\u001b\u0010\u001a\u001a\u00020\u00158BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001b\u0010\u001f\u001a\u00020\u001b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001c\u0010\u0017\u001a\u0004\b\u001d\u0010\u001eR\u001b\u0010\"\u001a\u00020\u00158BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b \u0010\u0017\u001a\u0004\b!\u0010\u0019R$\u0010*\u001a\u0004\u0018\u00010#8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)¨\u0006+"}, d2 = {"Lcom/revolut/core/ui_kit/views/LabelButtonView;", "Landroid/widget/LinearLayout;", "Lcom/revolut/core/ui_kit_core/actionshandler/TrackableItem;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lcom/revolut/core/ui_kit/models/Clause;", "clause", "", "setText", "(Lcom/revolut/core/ui_kit/models/Clause;)V", "Lcom/revolut/core/ui_kit_core/displayers/image/Image;", "image", "setStartIcon", "(Lcom/revolut/core/ui_kit_core/displayers/image/Image;)V", "setEndIcon", "Landroid/widget/ImageView;", "a", "Le8/q;", "getStartImage", "()Landroid/widget/ImageView;", "startImage", "Landroid/widget/TextView;", "b", "getTitle", "()Landroid/widget/TextView;", "title", "c", "getEndImage", "endImage", "Landroid/os/Parcelable;", "e", "Landroid/os/Parcelable;", "getAnalyticsContext", "()Landroid/os/Parcelable;", "setAnalyticsContext", "(Landroid/os/Parcelable;)V", "analyticsContext", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class LabelButtonView extends LinearLayout implements TrackableItem {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public final e8.q startImage;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public final e8.q title;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public final e8.q endImage;
    public final ihm.f d;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public Parcelable analyticsContext;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public LabelButtonView(@NotNull Context context) {
        this(context, null, 6, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public static ResourceImage b(TypedArray typedArray, int i, int i2) {
        int resourceId = typedArray.getResourceId(i, 0);
        Integer numValueOf = Integer.valueOf(resourceId);
        if (resourceId == 0) {
            numValueOf = null;
        }
        if (numValueOf == null) {
            return null;
        }
        int iIntValue = numValueOf.intValue();
        int color = typedArray.getColor(i2, 0);
        return new ResourceImage(iIntValue, (Integer) null, color != 0 ? Integer.valueOf(color) : null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, Constants.TAG_SUPPORTED_LOCALE_LIST);
    }

    private final ImageView getEndImage() {
        return (ImageView) this.endImage.f();
    }

    private final ImageView getStartImage() {
        return (ImageView) this.startImage.f();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final TextView getTitle() {
        return (TextView) this.title.f();
    }

    public final void d(ImageView imageView, Image image) {
        if (image == null) {
            imageView.setImageDrawable(null);
            imageView.setVisibility(8);
        } else {
            yy0.f.e(or0.u.k(this).Q(), image, imageView, null, null, 12);
            imageView.setVisibility(0);
        }
    }

    @Override // com.revolut.core.ui_kit_core.actionshandler.TrackableItem
    public Parcelable getAnalyticsContext() {
        return this.analyticsContext;
    }

    @Override // com.revolut.core.ui_kit_core.actionshandler.TrackableItem
    public void setAnalyticsContext(Parcelable parcelable) {
        this.analyticsContext = parcelable;
    }

    public final void setEndIcon(Image image) {
        d(getEndImage(), image);
    }

    public final void setStartIcon(Image image) {
        d(getStartImage(), image);
    }

    public final void setText(Clause clause) {
        ty0.c.b(or0.u.k(this).b0(), clause, getTitle(), null, null, 12);
        getTitle().setVisibility(clause != null ? 0 : 8);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public LabelButtonView(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LabelButtonView(@NotNull Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        this.startImage = kli.a.J(R$id.labelButton_startImage, this);
        this.title = kli.a.J(R$id.labelButton_title, this);
        this.endImage = kli.a.J(R$id.labelButton_endImage, this);
        this.d = v0.a.d("create(...)");
        fp0.p.Companion.getClass();
        fp0.p pVarA = fp0.m.a(this, gp0.b.f145198a);
        View.inflate(context, R$layout.internal_label_button_layout, this);
        setOrientation(0);
        fp0.p.b(pVarA, true);
        View view = pVarA.f137029a;
        or0.m.a(view);
        view.setOnClickListener(new p2(this, 7));
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, R$styleable.uikit_LabelButton, i, 0);
        Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, "obtainStyledAttributes(...)");
        setStartIcon(b(typedArrayObtainStyledAttributes, R$styleable.uikit_LabelButton_uikit_iconStart, R$styleable.uikit_LabelButton_uikit_iconStartTint));
        setEndIcon(b(typedArrayObtainStyledAttributes, R$styleable.uikit_LabelButton_uikit_iconEnd, R$styleable.uikit_LabelButton_uikit_iconEndTint));
        String string = typedArrayObtainStyledAttributes.getString(R$styleable.uikit_LabelButton_android_text);
        if (string != null) {
            setText(new TextClause(string, (Style) null, (Integer) null, false, (o9) null, (List) null, 126));
            Unit unit = Unit.f186387a;
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    public /* synthetic */ LabelButtonView(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i & 2) != 0 ? null : attributeSet, 0);
    }
}
