package gv0;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.View;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit_resources.R$attr;
import com.youTransactor.uCube.rpc.Constants;
import ip0.v7;
import jb3.l;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import rim.d;
import ty0.c;

/* JADX INFO: loaded from: classes19.dex */
public final class a extends View {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Paint f147038a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final GradientDrawable f147039b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Rect f147040c;
    public final float d;
    public final float e;
    public final Path f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Paint f147041g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Rect f147042h;
    public String i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public float f147043j;
    public final int k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final int f147044l;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public a(@NotNull Context context) {
        this(context, null, 6, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight() - ((int) this.e);
        Rect rect = this.f147040c;
        rect.set(0, 0, measuredWidth, measuredHeight);
        GradientDrawable gradientDrawable = this.f147039b;
        gradientDrawable.setBounds(rect);
        gradientDrawable.draw(canvas);
        canvas.save();
        canvas.translate((getMeasuredWidth() / 2.0f) - (this.d / 2.0f), rect.bottom);
        canvas.drawPath(this.f, this.f147041g);
        canvas.restore();
        String str = this.i;
        int length = str.length();
        Paint paint = this.f147038a;
        Rect rect2 = this.f147042h;
        paint.getTextBounds(str, 0, length, rect2);
        canvas.drawText(this.i, getMeasuredWidth() / 2.0f, rect.exactCenterY() - rect2.exactCenterY(), paint);
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(d.c(this.f147043j + this.k), 1073741824), View.MeasureSpec.makeMeasureSpec(this.f147044l, 1073741824));
    }

    public final void setText(@NotNull Clause clause) {
        Intrinsics.checkNotNullParameter(clause, "clause");
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        c cVarB0 = jh.d.f(context).b0();
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        String string = c.a(cVarB0, clause, context2, null, null, null, null, Constants.TAG_FC_SPEED_MODE).toString();
        if (Intrinsics.f(this.i, string)) {
            return;
        }
        this.i = string;
        this.f147043j = this.f147038a.measureText(string);
        requestLayout();
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
        Paint paint = new Paint(1);
        paint.setColor(kli.a.s(R$attr.uikit_colorForeground, context));
        l.d(paint, context, R$attr.internal_textAppearanceEmphasis2);
        paint.setTextAlign(Paint.Align.CENTER);
        this.f147038a = paint;
        int iS = kli.a.s(R$attr.uikit_colorPopoverBackground, context);
        GradientDrawable gradientDrawableK = v7.k(0);
        gradientDrawableK.setCornerRadius(kli.a.l(context, 10.0f));
        gradientDrawableK.setTint(iS);
        this.f147039b = gradientDrawableK;
        this.f147040c = new Rect();
        float fL = kli.a.l(context, 19.0f);
        this.d = fL;
        float fL2 = kli.a.l(context, 6.0f);
        this.e = fL2;
        float f = fL / 19.0f;
        float f4 = fL2 / 6.0f;
        Path path = new Path();
        float f5 = 8.03746f * f;
        float f6 = f4 * 5.28983f;
        path.moveTo(f5, f6);
        float f32 = f4 * 6.23672f;
        path.cubicTo(f * 8.73459f, f32, f * 10.2654f, f32, f * 10.9625f, f6);
        float f35 = f4 * 3.53482f;
        path.lineTo(12.2547f * f, f35);
        float f36 = 1.5959f * f4;
        float f37 = 0.308404f * f4;
        path.cubicTo(13.6822f * f, f36, 15.9569f * f, f37, f * 18.5f, BitmapDescriptorFactory.HUE_RED);
        path.lineTo(0.5f * f, BitmapDescriptorFactory.HUE_RED);
        path.cubicTo(f * 3.04308f, f37, f * 5.31782f, f36, f * 6.74534f, f35);
        path.lineTo(f5, f6);
        path.close();
        this.f = path;
        Paint paint2 = new Paint(1);
        paint2.setStyle(Paint.Style.FILL);
        paint2.setColor(iS);
        this.f147041g = paint2;
        this.f147042h = new Rect();
        this.i = "";
        this.k = kli.a.k(context, 16.0f);
        this.f147044l = kli.a.k(context, 36.0f);
    }

    public /* synthetic */ a(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i & 2) != 0 ? null : attributeSet, 0);
    }
}
