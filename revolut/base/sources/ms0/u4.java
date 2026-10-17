package ms0;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import aw0.ea;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.core.ui_kit.R$id;
import com.revolut.core.ui_kit.R$layout;
import com.revolut.core.ui_kit.delegates.StreakStepVerticalDelegate;
import com.revolut.core.ui_kit.internal.views.SmallActionButton;
import com.revolut.core.ui_kit.internal.views.UIKitTextView;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
public final class u4 extends ConstraintLayout {

    @NotNull
    private static final a Companion = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ImageView f208450b;
    public final UIKitTextView f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final UIKitTextView f208451g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public UIKitTextView f208452h;
    public ImageView i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public SmallActionButton f208453j;
    public View k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final ihm.f f208454l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final float f208455m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final Paint f208456n;
    public final Paint o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final Paint f208457p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public ea f208458q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public StreakStepVerticalDelegate.Model f208459r;

    public static final class a {
        private a() {
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public u4(@NotNull Context context) {
        this(context, null, 6, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public final ConstraintLayout.LayoutParams f0() {
        ConstraintLayout.LayoutParams layoutParams = new ConstraintLayout.LayoutParams(-2, -2);
        ImageView imageView = this.f208450b;
        layoutParams.topToTop = imageView.getId();
        layoutParams.bottomToBottom = imageView.getId();
        layoutParams.startToEnd = this.f.getId();
        layoutParams.endToEnd = 0;
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        layoutParams.setMarginStart(kli.a.k(context, 16.0f));
        return layoutParams;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        super.onDraw(canvas);
        ea eaVar = this.f208458q;
        float strokeWidth = BitmapDescriptorFactory.HUE_RED;
        Paint paint = this.f208457p;
        ImageView imageView = this.f208450b;
        if (eaVar != null) {
            float width = (imageView.getWidth() / 2.0f) + imageView.getX();
            float height = (imageView.getHeight() / 2.0f) + imageView.getY();
            float width2 = imageView.getWidth() / 2.0f;
            Paint paint2 = this.o;
            if (paint2.getAlpha() > 0) {
                canvas.drawCircle(width, height, width2, paint2);
            }
            if (eaVar.f10301c != null && eaVar.d > BitmapDescriptorFactory.HUE_RED) {
                canvas.drawCircle(width, height, (paint.getStrokeWidth() / 2.0f) + width2, paint);
            }
        }
        StreakStepVerticalDelegate.Model model = this.f208459r;
        if (model == null || !model.e) {
            ea eaVar2 = this.f208458q;
            if (eaVar2 != null && eaVar2.f10301c != null && eaVar2.d > BitmapDescriptorFactory.HUE_RED) {
                strokeWidth = paint.getStrokeWidth();
            }
            float width3 = (imageView.getWidth() / 2.0f) + imageView.getX();
            float f = this.f208455m / 2.0f;
            canvas.drawRect(width3 - f, imageView.getBottom() + strokeWidth, f + width3, getHeight(), this.f208456n);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x021d  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0229  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0235  */
    /* JADX WARN: Type inference failed for: r5v0, types: [com.revolut.core.ui_kit.models.Clause, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void setModel(@org.jetbrains.annotations.NotNull com.revolut.core.ui_kit.delegates.StreakStepVerticalDelegate.Model r25) {
        /*
            Method dump skipped, instruction units count: 663
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ms0.u4.setModel(com.revolut.core.ui_kit.delegates.StreakStepVerticalDelegate$Model):void");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public u4(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u4(@NotNull Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f208454l = v0.a.d("create(...)");
        this.f208455m = kli.a.l(context, 2.0f);
        Paint paint = new Paint(1);
        Paint.Style style = Paint.Style.FILL;
        paint.setStyle(style);
        this.f208456n = paint;
        Paint paint2 = new Paint(1);
        paint2.setStyle(style);
        this.o = paint2;
        Paint paint3 = new Paint(1);
        paint3.setStyle(Paint.Style.STROKE);
        this.f208457p = paint3;
        View.inflate(context, R$layout.internal_view_streak_step_vertical, this);
        View viewFindViewById = findViewById(R$id.streakStepVerticalView_icon);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        this.f208450b = (ImageView) viewFindViewById;
        View viewFindViewById2 = findViewById(R$id.streakStepVerticalView_title);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        this.f = (UIKitTextView) viewFindViewById2;
        View viewFindViewById3 = findViewById(R$id.streakStepVerticalView_subtitle);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
        this.f208451g = (UIKitTextView) viewFindViewById3;
        View viewFindViewById4 = findViewById(R$id.streakStepVerticalView_tag);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById4, "findViewById(...)");
        setClipChildren(false);
        setClipToPadding(false);
        setWillNotDraw(false);
    }

    public /* synthetic */ u4(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i & 2) != 0 ? null : attributeSet, 0);
    }
}
