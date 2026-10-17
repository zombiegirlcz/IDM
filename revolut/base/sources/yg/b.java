package yg;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatTextView;

/* JADX INFO: loaded from: classes17.dex */
public class b extends AppCompatTextView {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f313478a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f313479b;

    public b(Context context) {
        super(context);
        this.f313478a = 0;
        this.f313479b = 0;
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        canvas.translate(this.f313479b / 2, this.f313478a / 2);
        super.draw(canvas);
    }

    @Override // androidx.appcompat.widget.AppCompatTextView, android.widget.TextView, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        int iMax = Math.max(measuredWidth, measuredHeight);
        if (measuredWidth > measuredHeight) {
            this.f313478a = measuredWidth - measuredHeight;
            this.f313479b = 0;
        } else {
            this.f313478a = 0;
            this.f313479b = measuredHeight - measuredWidth;
        }
        setMeasuredDimension(iMax, iMax);
    }

    public b(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f313478a = 0;
        this.f313479b = 0;
    }

    public b(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f313478a = 0;
        this.f313479b = 0;
    }
}
