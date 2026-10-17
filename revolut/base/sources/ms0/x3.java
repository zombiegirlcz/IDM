package ms0;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.revolut.core.ui_kit.R$id;
import com.revolut.core.ui_kit.R$layout;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
public final class x3 extends FrameLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public y3 f208487a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Function1 f208488b;

    public /* synthetic */ x3(Context context) {
        this(context, null, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void setContent$default(x3 x3Var, y3 y3Var, Function1 function1, int i, Object obj2) {
        if ((i & 2) != 0) {
            function1 = null;
        }
        x3Var.setContent(y3Var, function1);
    }

    public final void setContent(@NotNull y3 content, Function1<? super ty0.a, Unit> function1) {
        Intrinsics.checkNotNullParameter(content, "content");
        if (Intrinsics.f(content, this.f208487a) && Intrinsics.f(function1, this.f208488b)) {
            return;
        }
        this.f208487a = content;
        this.f208488b = function1;
        View viewFindViewById = findViewById(R$id.stageIcon);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        ImageView imageView = (ImageView) viewFindViewById;
        View viewFindViewById2 = findViewById(R$id.stageTitle);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        TextView textView = (TextView) viewFindViewById2;
        kli.a.e(textView, content.f208498b, function1, null, 0, 12);
        kli.a.I(textView, content.f208498b);
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        textView.setTextColor(kli.a.s(content.f208499c, context));
        zi0.c.g(imageView, content.f208497a);
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        rd0.e.q(imageView, Integer.valueOf(kli.a.s(content.d, context2)));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x3(@NotNull Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        View.inflate(context, R$layout.internal_layout_referral_stage, this);
    }
}
