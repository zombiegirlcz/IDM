package mx0;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.revolut.core.ui_kit.R$id;
import com.revolut.core.ui_kit.R$layout;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
public final class wc extends ConstraintLayout {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ImageView f210096b;
    public final TextView f;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public wc(@NotNull Context context) {
        this(context, null, 6, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public final void setImage(@NotNull Image image) {
        Intrinsics.checkNotNullParameter(image, "image");
        yy0.f.e(or0.u.k(this).Q(), image, this.f210096b, null, null, 12);
    }

    public final void setText(@NotNull Clause text) {
        Intrinsics.checkNotNullParameter(text, "text");
        ty0.c.b(or0.u.k(this).b0(), text, this.f, null, null, 12);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public wc(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wc(@NotNull Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        View.inflate(context, R$layout.internal_view_title_with_image, this);
        View viewFindViewById = findViewById(R$id.titleWithImageView_image);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        this.f210096b = (ImageView) viewFindViewById;
        View viewFindViewById2 = findViewById(R$id.titleWithImageView_text);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        this.f = (TextView) viewFindViewById2;
    }

    public /* synthetic */ wc(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i & 2) != 0 ? null : attributeSet, 0);
    }
}
