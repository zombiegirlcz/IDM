package com.revolut.uicomponent.toolbar.app_bar;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.view.WindowInsets;
import androidx.annotation.NonNull;
import androidx.appcompat.R$styleable;
import androidx.appcompat.widget.Toolbar;
import androidx.core.content.ContextCompat;
import androidx.core.graphics.Insets;
import androidx.core.view.WindowInsetsCompat;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.core.ui_kit_resources.R$attr;

/* JADX INFO: loaded from: classes13.dex */
@yhm.d
public abstract class BaseToolbar extends Toolbar {
    private static final int LINE_WIDTH_DP = 1;
    private int baseMarginTop;
    private boolean isHiding;
    private boolean isShowing;
    private final int mLineWidth;
    private boolean mShowUnderline;
    private float mUnderlineAlpha;
    private int mUnderlineMaxAlpha;
    private final Paint mUnderlinePaint;

    public BaseToolbar(Context context) {
        super(context);
        this.mUnderlinePaint = new Paint();
        this.mUnderlineAlpha = -1.0f;
        this.mUnderlineMaxAlpha = 255;
        this.baseMarginTop = Integer.MIN_VALUE;
        this.mLineWidth = dp2Px(1);
        init(context, null);
    }

    public void applyAttrs(@NonNull Context context, @NonNull AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.Toolbar);
        try {
            int resourceId = typedArrayObtainStyledAttributes.getResourceId(R$styleable.Toolbar_navigationIcon, 0);
            if (resourceId != 0) {
                setNavigationIcon(ContextCompat.getDrawable(getContext(), resourceId));
            }
            typedArrayObtainStyledAttributes.recycle();
            typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, com.revolut.uicomponent.R$styleable.RevolutToolbar);
            try {
                this.mShowUnderline = typedArrayObtainStyledAttributes.getBoolean(com.revolut.uicomponent.R$styleable.RevolutToolbar_rtb_show_underline, false);
                int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(com.revolut.uicomponent.R$styleable.RevolutToolbar_rtb_menu_layout, 0);
                if (resourceId2 != 0) {
                    inflateMenu(resourceId2);
                }
            } finally {
            }
        } finally {
        }
    }

    public int dp2Px(int i) {
        return kli.a.k(getContext(), i);
    }

    public abstract void hideTitle(boolean z);

    public void init(@NonNull Context context, AttributeSet attributeSet) {
        if (attributeSet != null) {
            applyAttrs(context, attributeSet);
        }
        setWillNotDraw(false);
        this.mUnderlinePaint.setStrokeWidth(this.mLineWidth);
        this.mUnderlinePaint.setColor(kli.a.s(R$attr.uikit_colorGreyTone20, context));
        this.mUnderlineMaxAlpha = this.mUnderlinePaint.getAlpha();
    }

    @Override // android.view.View
    public WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        WindowInsetsCompat windowInsetsCompat = WindowInsetsCompat.toWindowInsetsCompat(windowInsets, this);
        Insets insets = windowInsetsCompat.getInsets(WindowInsetsCompat.Type.systemBars());
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            if (this.baseMarginTop == Integer.MIN_VALUE) {
                this.baseMarginTop = marginLayoutParams.topMargin;
            }
            int i = this.baseMarginTop + insets.top;
            if (marginLayoutParams.topMargin != i) {
                marginLayoutParams.topMargin = i;
                setLayoutParams(marginLayoutParams);
            }
        }
        return new WindowInsetsCompat.Builder(windowInsetsCompat).setInsets(WindowInsetsCompat.Type.systemBars(), Insets.of(insets.left, 0, insets.right, insets.bottom)).build().toWindowInsets();
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.mShowUnderline) {
            float height = canvas.getHeight() - (this.mLineWidth / 2.0f);
            float f = this.mUnderlineAlpha;
            if (f != -1.0f) {
                this.mUnderlinePaint.setAlpha((int) (f * this.mUnderlineMaxAlpha));
            }
            canvas.drawLine(BitmapDescriptorFactory.HUE_RED, height, canvas.getWidth(), height, this.mUnderlinePaint);
        }
    }

    public BaseToolbar setShowUnderline(boolean z) {
        this.mShowUnderline = z;
        invalidate();
        return this;
    }

    public void setUnderlineAlpha(float f) {
        if (this.mUnderlineAlpha == f) {
            return;
        }
        this.mUnderlineAlpha = f;
        invalidate();
    }

    public void showTitle() {
        showTitle(true);
    }

    public abstract void showTitle(boolean z);

    public BaseToolbar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mUnderlinePaint = new Paint();
        this.mUnderlineAlpha = -1.0f;
        this.mUnderlineMaxAlpha = 255;
        this.baseMarginTop = Integer.MIN_VALUE;
        this.mLineWidth = dp2Px(1);
        init(context, attributeSet);
    }

    public BaseToolbar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mUnderlinePaint = new Paint();
        this.mUnderlineAlpha = -1.0f;
        this.mUnderlineMaxAlpha = 255;
        this.baseMarginTop = Integer.MIN_VALUE;
        this.mLineWidth = dp2Px(1);
        init(context, attributeSet);
    }
}
