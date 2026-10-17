package com.revolut.core.ui_kit.internal.views;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import aw0.i9;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.core.ui_kit.R$id;
import com.revolut.core.ui_kit.R$layout;
import e8.q;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eJ'\u0010\u0014\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0019\u001a\u00020\f2\u0006\u0010\u0016\u001a\u00020\u0015H\u0000¢\u0006\u0004\b\u0017\u0010\u0018R\u001b\u0010\u001f\u001a\u00020\u001a8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001b\u0010\"\u001a\u00020\u001a8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b \u0010\u001c\u001a\u0004\b!\u0010\u001eR\u001b\u0010'\u001a\u00020#8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b$\u0010\u001c\u001a\u0004\b%\u0010&¨\u0006("}, d2 = {"Lcom/revolut/core/ui_kit/internal/views/RatingCell;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Law0/i9;", "content", "", "setContent", "(Law0/i9;)V", "textColor", "starRatingColor", "starBackgroundColor", "setColors$ui_kit_components_release", "(III)V", "setColors", "", "editable", "setEditable$ui_kit_components_release", "(Z)V", "setEditable", "Landroid/widget/TextView;", "b", "Le8/q;", "getValueText", "()Landroid/widget/TextView;", "valueText", "f", "getDescriptionText", "descriptionText", "Lcom/revolut/core/ui_kit/internal/views/RatingBar;", "g", "getStarRatingView", "()Lcom/revolut/core/ui_kit/internal/views/RatingBar;", "starRatingView", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class RatingCell extends ConstraintLayout {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public final q valueText;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public final q descriptionText;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    public final q starRatingView;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public RatingCell(@NotNull Context context) {
        this(context, null, 6, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    private final TextView getDescriptionText() {
        return (TextView) this.descriptionText.f();
    }

    private final RatingBar getStarRatingView() {
        return (RatingBar) this.starRatingView.f();
    }

    private final TextView getValueText() {
        return (TextView) this.valueText.f();
    }

    public final void setColors$ui_kit_components_release(int textColor, int starRatingColor, int starBackgroundColor) {
        getValueText().setTextColor(textColor);
        getDescriptionText().setTextColor(textColor);
        getStarRatingView().setColors$ui_kit_components_release(starRatingColor, starBackgroundColor);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [com.revolut.core.ui_kit.models.Clause, java.lang.Object] */
    public final void setContent(@NotNull i9 content) {
        Intrinsics.checkNotNullParameter(content, "content");
        kli.a.b(getValueText(), content.f10360a, ty0.f.f275450a);
        kli.a.b(getDescriptionText(), content.f10361b, ty0.f.f275450a);
        Float f = content.f10362c;
        if (f == null) {
            getStarRatingView().setVisibility(8);
            getStarRatingView().setRating$ui_kit_components_release(BitmapDescriptorFactory.HUE_RED);
        } else {
            getStarRatingView().setMaxRating$ui_kit_components_release((int) f.floatValue());
            getStarRatingView().setVisibility(0);
            getStarRatingView().setRating$ui_kit_components_release(f.floatValue());
        }
    }

    public final void setEditable$ui_kit_components_release(boolean editable) {
        getStarRatingView().setIndicator(!editable);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public RatingCell(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RatingCell(@NotNull Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        this.valueText = kli.a.J(R$id.ratingView_valueText, this);
        this.descriptionText = kli.a.J(R$id.ratingView_descriptionText, this);
        this.starRatingView = kli.a.J(R$id.ratingView_starRating, this);
        View.inflate(context, R$layout.internal_cell_rating, this);
    }

    public /* synthetic */ RatingCell(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i & 2) != 0 ? null : attributeSet, 0);
    }
}
