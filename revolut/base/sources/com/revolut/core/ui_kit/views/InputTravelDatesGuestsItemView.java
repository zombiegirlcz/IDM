package com.revolut.core.ui_kit.views;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.ConstraintSet;
import com.revolut.core.ui_kit.R$id;
import com.revolut.core.ui_kit.R$layout;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import mx0.x7;
import mx0.y7;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001:\u0001\nB'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u0015\u0010\u0015\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0015\u0010\u0016J\u0015\u0010\u0018\u001a\u00020\f2\u0006\u0010\u0017\u001a\u00020\u000f¢\u0006\u0004\b\u0018\u0010\u0012J\u0015\u0010\u0019\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0019\u0010\u0016R\u001b\u0010\u001f\u001a\u00020\u001a8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001b\u0010\"\u001a\u00020\u001a8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b \u0010\u001c\u001a\u0004\b!\u0010\u001e¨\u0006#"}, d2 = {"Lcom/revolut/core/ui_kit/views/InputTravelDatesGuestsItemView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lmx0/x7;", "configuration", "", "setConfiguration", "(Lmx0/x7;)V", "Lcom/revolut/core/ui_kit/models/Clause;", "datesText", "setPrimaryInputText", "(Lcom/revolut/core/ui_kit/models/Clause;)V", "Lcom/revolut/core/ui_kit_core/displayers/image/Image;", "image", "setPrimaryInputIconImage", "(Lcom/revolut/core/ui_kit_core/displayers/image/Image;)V", "guestsText", "setSecondaryInputText", "setSecondaryInputIconImage", "Lcom/revolut/core/ui_kit/views/InputTravelView;", "f", "Le8/q;", "getPrimaryInput", "()Lcom/revolut/core/ui_kit/views/InputTravelView;", "primaryInput", "g", "getSecondaryInput", "secondaryInput", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class InputTravelDatesGuestsItemView extends ConstraintLayout {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ny0.k f58667b;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public final e8.q primaryInput;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    public final e8.q secondaryInput;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public x7 f58669h;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public InputTravelDatesGuestsItemView(@NotNull Context context) {
        this(context, null, 6, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    private final InputTravelView getPrimaryInput() {
        return (InputTravelView) this.primaryInput.f();
    }

    private final InputTravelView getSecondaryInput() {
        return (InputTravelView) this.secondaryInput.f();
    }

    public final efm.r f0() {
        return getPrimaryInput().a();
    }

    public final efm.r g0() {
        return getSecondaryInput().a();
    }

    public final void h0(x7 x7Var) {
        ConstraintSet constraintSet = new ConstraintSet();
        constraintSet.clone(this);
        constraintSet.clear(R$id.inputTravelSearchDatesGuests_primary, 7);
        int i = y7.f210124a[x7Var.ordinal()];
        if (i == 1) {
            constraintSet.connect(R$id.inputTravelSearchDatesGuests_primary, 7, R$id.inputTravelSearchDatesGuests_guideline, 6, 0);
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            int i2 = R$id.inputTravelSearchDatesGuests_primary;
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            constraintSet.connect(i2, 7, 0, 7, kli.a.k(context, 16.0f));
        }
        constraintSet.applyTo(this);
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        this.f58667b.b(i);
        super.onMeasure(i, i2);
    }

    public final void setConfiguration(@NotNull x7 configuration) {
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        this.f58669h = configuration;
        int i = y7.f210124a[configuration.ordinal()];
        if (i == 1) {
            getSecondaryInput().setVisibility(0);
            h0(configuration);
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            getSecondaryInput().setVisibility(8);
            h0(configuration);
        }
        requestLayout();
    }

    public final void setPrimaryInputIconImage(@NotNull Image image) {
        Intrinsics.checkNotNullParameter(image, "image");
        getPrimaryInput().setIconImage(image);
    }

    public final void setPrimaryInputText(@NotNull Clause datesText) {
        Intrinsics.checkNotNullParameter(datesText, "datesText");
        getPrimaryInput().setPrimaryText(datesText);
    }

    public final void setSecondaryInputIconImage(@NotNull Image image) {
        Intrinsics.checkNotNullParameter(image, "image");
        if (this.f58669h != x7.DUAL) {
            throw new IllegalStateException("View is set to SINGLE configuration, it's forbidden to interact with secondary input");
        }
        getSecondaryInput().setIconImage(image);
    }

    public final void setSecondaryInputText(@NotNull Clause guestsText) {
        Intrinsics.checkNotNullParameter(guestsText, "guestsText");
        if (this.f58669h != x7.DUAL) {
            throw new IllegalStateException("View is set to SINGLE configuration, it's forbidden to interact with secondary input");
        }
        getSecondaryInput().setPrimaryText(guestsText);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public InputTravelDatesGuestsItemView(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InputTravelDatesGuestsItemView(@NotNull Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        ny0.k kVar = new ny0.k(this);
        this.f58667b = kVar;
        this.primaryInput = kli.a.J(R$id.inputTravelSearchDatesGuests_primary, this);
        this.secondaryInput = kli.a.J(R$id.inputTravelSearchDatesGuests_secondary, this);
        this.f58669h = x7.DUAL;
        View.inflate(context, R$layout.internal_view_travel_dates_guests_item, this);
        kVar.d(true);
    }

    public /* synthetic */ InputTravelDatesGuestsItemView(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i & 2) != 0 ? null : attributeSet, 0);
    }
}
