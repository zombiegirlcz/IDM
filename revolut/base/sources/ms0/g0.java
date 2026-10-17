package ms0;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.revolut.core.ui_kit.R$drawable;
import com.revolut.core.ui_kit.R$id;
import com.revolut.core.ui_kit.R$layout;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_resources.R$attr;
import ip0.li0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
public final class g0 extends ConstraintLayout {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ihm.f f208254b;
    public final ihm.f f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final li0 f208255g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e8.q f208256h;
    public final e8.q i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final e8.q f208257j;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public g0(@NotNull Context context) {
        this(context, null, 6, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    private final ImageView getIcon() {
        return (ImageView) this.f208256h.f();
    }

    private final TextView getSubtitle() {
        return (TextView) this.f208257j.f();
    }

    private final TextView getTitle() {
        return (TextView) this.i.f();
    }

    public final efm.r f0() {
        return this.f208254b;
    }

    public final ihm.f g0() {
        return this.f;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        return this.f208255g.onTouch(this, event) || super.onTouchEvent(event);
    }

    public final void setIcon(Image image) {
        yy0.f.e(or0.u.k(this).Q(), image, getIcon(), null, null, 12);
    }

    public final void setSubtitle(Clause clause) {
        ty0.c.b(or0.u.k(this).b0(), clause, getSubtitle(), null, null, 12);
    }

    public final void setTitle(Clause clause) {
        ty0.c.b(or0.u.k(this).b0(), clause, getTitle(), null, null, 12);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public g0(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(@NotNull Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f208254b = v0.a.d("create(...)");
        this.f = v0.a.d("create(...)");
        this.f208255g = new li0(context, this);
        this.f208256h = kli.a.J(R$id.contextualPrompt_icon, this);
        this.i = kli.a.J(R$id.contextualPrompt_title, this);
        this.f208257j = kli.a.J(R$id.contextualPrompt_subtitle, this);
        View.inflate(context, R$layout.internal_contextual_prompt, this);
        setBackgroundResource(R$drawable.internal_contextual_prompt_background);
        setElevation(kli.a.w(R$attr.uikit_dp16, context));
        setOnClickListener(new ip0.g0(this, 16));
    }

    public /* synthetic */ g0(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i & 2) != 0 ? null : attributeSet, 0);
    }
}
