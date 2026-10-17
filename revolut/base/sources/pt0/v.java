package pt0;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.revolut.core.ui_kit.R$id;
import com.revolut.core.ui_kit.R$layout;
import com.revolut.core.ui_kit.internal.views.gaugechart.SegmentedPieSmallView;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
public final class v extends FrameLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextView f239591a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e8.q f239592b;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public v(@NotNull Context context) {
        this(context, null, 6, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    private final SegmentedPieSmallView getSegmentedPie() {
        return (SegmentedPieSmallView) this.f239592b.f();
    }

    public final void setModel(@NotNull u model) {
        Intrinsics.checkNotNullParameter(model, "model");
        kli.a.b(this.f239591a, model.f239588a, ty0.f.f275450a);
        getSegmentedPie().setProgressStyle(new t(model.f239589b, model.f239590c));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public v(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(@NotNull Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        View.inflate(context, R$layout.internal_view_segmente_pie_with_text, this);
        View viewFindViewById = findViewById(R$id.segmented_pie_title);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        this.f239591a = (TextView) viewFindViewById;
        this.f239592b = kli.a.J(R$id.segmented_pie, this);
    }

    public /* synthetic */ v(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i & 2) != 0 ? null : attributeSet, 0);
    }
}
