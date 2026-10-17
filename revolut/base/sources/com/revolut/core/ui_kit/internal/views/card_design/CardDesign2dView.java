package com.revolut.core.ui_kit.internal.views.card_design;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.revolut.core.ui_kit.R$id;
import com.revolut.core.ui_kit.R$layout;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import or0.u;
import org.jetbrains.annotations.NotNull;
import yy0.f;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/revolut/core/ui_kit/internal/views/card_design/CardDesign2dView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class CardDesign2dView extends ConstraintLayout {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AppCompatImageView f56581b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CardDesign2dView(@NotNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        View.inflate(context, R$layout.internal_view_card_design, this);
        setClipChildren(false);
        setClipToPadding(false);
        View viewFindViewById = findViewById(R$id.internalCardDesignView_cardView);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        this.f56581b = (AppCompatImageView) viewFindViewById;
    }

    public final void f0(Image cardDesignImage) {
        Intrinsics.checkNotNullParameter(cardDesignImage, "cardDesignImage");
        f.e(u.k(this).Q(), cardDesignImage, this.f56581b, null, null, 12);
    }
}
