package mx0;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.revolut.core.ui_kit.R$id;
import com.revolut.core.ui_kit.R$layout;
import com.revolut.core.ui_kit.models.Clause;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
public final class xc extends ConstraintLayout {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextView f210117b;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public xc(@NotNull Context context) {
        this(context, null, 6, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public final void setText(@NotNull Clause text) {
        Intrinsics.checkNotNullParameter(text, "text");
        ty0.c cVarB0 = or0.u.k(this).b0();
        TextView textView = this.f210117b;
        Intrinsics.checkNotNullExpressionValue(textView, "textView");
        ty0.c.b(cVarB0, text, textView, null, null, 12);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public xc(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xc(@NotNull Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        View.inflate(context, R$layout.internal_view_to_do_loading_item, this);
        this.f210117b = (TextView) findViewById(R$id.toDoItemLoadingView_text);
    }

    public /* synthetic */ xc(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i & 2) != 0 ? null : attributeSet, 0);
    }
}
