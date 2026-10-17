package ms0;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import com.revolut.core.ui_kit.R$id;
import com.revolut.core.ui_kit.R$layout;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit_core.actionshandler.TrackableItem;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
public final class q0 extends LinearLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextView f208377a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextView f208378b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AppCompatImageView f208379c;
    public yy0.l d;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public q0(@NotNull Context context) {
        this(context, null, 6, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public final void setEndLabel(@NotNull Clause text) {
        Intrinsics.checkNotNullParameter(text, "text");
        ty0.c cVarB0 = or0.u.k(this).b0();
        TextView endLabel = this.f208378b;
        Intrinsics.checkNotNullExpressionValue(endLabel, "endLabel");
        ty0.c.b(cVarB0, text, endLabel, null, null, 12);
    }

    public final void setEndLabelImage(yy0.l lVar, @NotNull TrackableItem trackableItem, @NotNull Function0<Unit> onClick) {
        Intrinsics.checkNotNullParameter(trackableItem, "trackableItem");
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        AppCompatImageView endLabelImage = this.f208379c;
        Intrinsics.checkNotNullExpressionValue(endLabelImage, "endLabelImage");
        zi0.c.h(endLabelImage, lVar, !Intrinsics.f(this.d, lVar), new ky4.f(this, 7, trackableItem, onClick), false);
        this.d = lVar;
    }

    public final void setStartLabel(@NotNull Clause text) {
        Intrinsics.checkNotNullParameter(text, "text");
        ty0.c cVarB0 = or0.u.k(this).b0();
        TextView startLabel = this.f208377a;
        Intrinsics.checkNotNullExpressionValue(startLabel, "startLabel");
        ty0.c.b(cVarB0, text, startLabel, null, null, 12);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public q0(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q0(@NotNull Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        View.inflate(context, R$layout.internal_view_esim_additional_description, this);
        this.f208377a = (TextView) findViewById(R$id.esimAdditionalDescription_startLabel);
        this.f208378b = (TextView) findViewById(R$id.esimAdditionalDescription_endLabel);
        this.f208379c = (AppCompatImageView) findViewById(R$id.esimAdditionalDescription_endLabelImage);
    }

    public /* synthetic */ q0(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i & 2) != 0 ? null : attributeSet, 0);
    }
}
