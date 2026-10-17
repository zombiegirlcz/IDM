package ms0;

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
import ms0.j;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
public final class o extends ConstraintLayout {
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public o(@NotNull Context context) {
        this(context, null, 6, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public final void setBackground(@NotNull j background) {
        Intrinsics.checkNotNullParameter(background, "background");
        background.getClass();
        setBackgroundResource(j.a.f208295b);
    }

    @yhm.d
    public final void setContent(@NotNull k content, @NotNull yy0.f imageDisplayer) {
        Intrinsics.checkNotNullParameter(content, "content");
        Intrinsics.checkNotNullParameter(imageDisplayer, "imageDisplayer");
        setContent(content);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public o(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public final void setContent(@NotNull k content) {
        Intrinsics.checkNotNullParameter(content, "content");
        yy0.f fVarQ = or0.u.k(this).Q();
        Image image = content.f208303a;
        View viewFindViewById = findViewById(R$id.badgeIcon);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        yy0.f.e(fVarQ, image, (ImageView) viewFindViewById, null, null, 12);
        View viewFindViewById2 = findViewById(R$id.badgeIcon);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        viewFindViewById2.setVisibility(content.f208303a != null ? 0 : 8);
        ty0.c cVarB0 = or0.u.k(this).b0();
        Clause clause = content.f208304b;
        View viewFindViewById3 = findViewById(R$id.badgeLabel);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
        ty0.c.b(cVarB0, clause, (TextView) viewFindViewById3, null, null, 12);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(@NotNull Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        View.inflate(context, R$layout.internal_view_badge, this);
        setBackground(j.a.f208294a);
        int iK = kli.a.k(context, 8.0f);
        int iK2 = kli.a.k(context, 6.0f);
        setPaddingRelative(iK, iK2, iK, iK2);
    }

    public /* synthetic */ o(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i & 2) != 0 ? null : attributeSet, 0);
    }
}
