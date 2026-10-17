package cu0;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.revolut.core.ui_kit.R$id;
import com.revolut.core.ui_kit.R$layout;
import com.revolut.core.ui_kit.models.Clause;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ty0.f;

/* JADX INFO: loaded from: classes19.dex */
public final class a extends ConstraintLayout {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextView f108705b;
    public final TextView f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ProgressBar f108706g;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public a(@NotNull Context context) {
        this(context, null, 6, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public static /* synthetic */ void setProgress$default(a aVar, int i, boolean z, int i2, Object obj2) {
        if ((i2 & 2) != 0) {
            z = true;
        }
        aVar.setProgress(i, z);
    }

    public final void setProgress(int i, boolean z) {
        ProgressBar progressBar = this.f108706g;
        progressBar.setProgress(i);
        progressBar.setVisibility(z ? 8 : 0);
    }

    public final void setText(@NotNull Clause start, @NotNull Clause end2) {
        Intrinsics.checkNotNullParameter(start, "start");
        Intrinsics.checkNotNullParameter(end2, "end");
        kli.a.b(this.f108705b, start, f.f275450a);
        kli.a.b(this.f, end2, f.f275450a);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public a(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(@NotNull Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        View.inflate(context, R$layout.internal_progress_with_text_on_upper_sides, this);
        View viewFindViewById = findViewById(R$id.progressWithTextOnUpperSides_startText);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        this.f108705b = (TextView) viewFindViewById;
        View viewFindViewById2 = findViewById(R$id.progressWithTextOnUpperSides_endText);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        this.f = (TextView) viewFindViewById2;
        View viewFindViewById3 = findViewById(R$id.progressWithTextOnUpperSides_progress);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
        this.f108706g = (ProgressBar) viewFindViewById3;
    }

    public /* synthetic */ a(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i & 2) != 0 ? null : attributeSet, 0);
    }
}
