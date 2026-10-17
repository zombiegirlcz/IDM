package ms0;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.revolut.core.ui_kit.R$id;
import com.revolut.core.ui_kit.R$layout;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
public final class r0 extends LinearLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ImageView f208391a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextView f208392b;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public r0(@NotNull Context context) {
        this(context, null, 6, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void setLabel$default(r0 r0Var, Clause clause, Function1 function1, int i, Object obj2) {
        if ((i & 2) != 0) {
            function1 = null;
        }
        r0Var.setLabel(clause, function1);
    }

    public final void setLabel(@NotNull Clause text, Function1<? super ty0.a, Unit> function1) {
        Intrinsics.checkNotNullParameter(text, "text");
        ty0.c.b(or0.u.k(this).b0(), text, this.f208392b, function1, null, 8);
    }

    public final void setStartImage(Image image) {
        int i = image != null ? 0 : 8;
        ImageView imageView = this.f208391a;
        imageView.setVisibility(i);
        yy0.f.e(or0.u.k(imageView).Q(), image, this.f208391a, null, null, 12);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public r0(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r0(@NotNull Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        View.inflate(context, R$layout.internal_view_esim_details_additional_description, this);
        View viewFindViewById = findViewById(R$id.esimDetailsAdditionalDescription_startImage);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        this.f208391a = (ImageView) viewFindViewById;
        View viewFindViewById2 = findViewById(R$id.esimDetailsAdditionalDescription_label);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        TextView textView = (TextView) viewFindViewById2;
        this.f208392b = textView;
        textView.setMovementMethod(ix0.c0.f169220a);
    }

    public /* synthetic */ r0(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i & 2) != 0 ? null : attributeSet, 0);
    }
}
