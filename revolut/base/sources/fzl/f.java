package fzl;

import android.R;
import android.animation.ArgbEvaluator;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.text.Editable;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.method.TransformationMethod;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.View;
import android.widget.EditText;
import androidx.appcompat.widget.AppCompatEditText;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.uicomponent.R$dimen;
import com.revolut.uicomponent.R$drawable;
import com.revolut.uicomponent.R$styleable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes12.dex */
public class f extends AppCompatEditText {
    public static final /* synthetic */ int u0 = 0;
    public int A;
    public int B;
    public boolean C;
    public boolean D;
    public boolean E;
    public int F;
    public int G;
    public int H;
    public float I;
    public float J;
    public String K;
    public int L;
    public String M;
    public float N;
    public boolean O;
    public float P;
    public boolean Q;
    public Typeface R;
    public CharSequence S;
    public boolean T;
    public int U;
    public boolean V;
    public boolean W;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Paint f139211a;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public boolean f139212a0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextPaint f139213b;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public boolean f139214b0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public StaticLayout f139215c;
    public Bitmap[] c0;
    public ObjectAnimator d;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public Bitmap[] f139216d0;
    public ObjectAnimator e;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public Bitmap[] f139217e0;
    public ObjectAnimator f;
    public boolean f0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public e f139218g;
    public boolean g0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public View.OnFocusChangeListener f139219h;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public boolean f139220h0;
    public int i;
    public boolean i0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f139221j;
    public int j0;
    public int k;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public int f139222k0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f139223l;
    public int l0;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f139224m;
    public int m0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f139225n;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    public boolean f139226n0;
    public int o;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    public boolean f139227o0;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f139228p;
    public ColorStateList p0;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f139229q;
    public ColorStateList q0;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f139230r;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final ArgbEvaluator f139231r0;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f139232s;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public ArrayList f139233s0;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f139234t;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public b f139235t0;
    public int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f139236w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f139237x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f139238y;
    public int z;

    public f(Context context) {
        super(context);
        this.f139211a = new Paint(1);
        this.f139213b = new TextPaint(1);
        this.L = -1;
        this.f139231r0 = new ArgbEvaluator();
        n(context, null);
    }

    private int getBottomEllipsisWidth() {
        if (!this.C) {
            return 0;
        }
        return m(4) + (this.F * 5);
    }

    private int getBottomTextLeftOffset() {
        return s() ? getCharactersCounterWidth() : getBottomEllipsisWidth();
    }

    private int getBottomTextRightOffset() {
        return s() ? getBottomEllipsisWidth() : getCharactersCounterWidth();
    }

    private int getButtonsCount() {
        return this.f139220h0 ? 1 : 0;
    }

    private String getCharactersCounterText() {
        if (this.A <= 0) {
            if (s()) {
                return this.B + " / " + h(getText());
            }
            return h(getText()) + " / " + this.B;
        }
        if (this.B <= 0) {
            if (!s()) {
                StringBuilder sb6 = new StringBuilder();
                sb6.append(h(getText()));
                sb6.append(" / ");
                return j6.a.v(sb6, "+", this.A);
            }
            return "+" + this.A + " / " + h(getText());
        }
        if (s()) {
            return this.B + "-" + this.A + " / " + h(getText());
        }
        return h(getText()) + " / " + this.A + "-" + this.B;
    }

    private int getCharactersCounterWidth() {
        if (this.A > 0 || this.B > 0) {
            return (int) this.f139213b.measureText(getCharactersCounterText());
        }
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public ObjectAnimator getLabelAnimator() {
        if (this.d == null) {
            this.d = ObjectAnimator.ofFloat(this, "floatingLabelFraction", BitmapDescriptorFactory.HUE_RED, 1.0f);
        }
        this.d.setDuration(this.f139212a0 ? 300L : 0L);
        return this.d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public ObjectAnimator getLabelFocusAnimator() {
        if (this.e == null) {
            this.e = ObjectAnimator.ofFloat(this, "focusFraction", BitmapDescriptorFactory.HUE_RED, 1.0f);
        }
        return this.e;
    }

    private void setFloatingLabelInternal(int i) {
        if (i == 1) {
            this.f139230r = true;
            this.f139232s = false;
        } else if (i != 2) {
            this.f139230r = false;
            this.f139232s = false;
        } else {
            this.f139230r = true;
            this.f139232s = true;
        }
    }

    public final boolean f() {
        int iMax;
        if (getWidth() == 0) {
            return false;
        }
        this.f139213b.setTextSize(this.o);
        if (this.M == null && this.K == null) {
            iMax = this.G;
        } else {
            Layout.Alignment alignment = ((getGravity() & 5) == 5 || s()) ? Layout.Alignment.ALIGN_OPPOSITE : (getGravity() & 3) == 3 ? Layout.Alignment.ALIGN_NORMAL : Layout.Alignment.ALIGN_CENTER;
            String str = this.M;
            if (str == null) {
                str = this.K;
            }
            StaticLayout staticLayout = new StaticLayout(str, this.f139213b, (((getWidth() - getBottomTextLeftOffset()) - getBottomTextRightOffset()) - getPaddingLeft()) - getPaddingRight(), alignment, 1.0f, BitmapDescriptorFactory.HUE_RED, true);
            this.f139215c = staticLayout;
            iMax = Math.max(staticLayout.getLineCount(), this.H);
        }
        float f = iMax;
        if (this.J != f) {
            ObjectAnimator objectAnimator = this.f;
            if (objectAnimator == null) {
                this.f = ObjectAnimator.ofFloat(this, "currentBottomLines", f);
            } else {
                objectAnimator.cancel();
                this.f.setFloatValues(f);
            }
            this.f.start();
        }
        this.J = f;
        return true;
    }

    public final void g() {
        int i;
        boolean z = true;
        if ((!this.i0 && !this.f139214b0) || (this.A <= 0 && this.B <= 0)) {
            this.W = true;
            return;
        }
        Editable text = getText();
        int iH = text == null ? 0 : h(text);
        if (iH < this.A || ((i = this.B) > 0 && iH > i)) {
            z = false;
        }
        this.W = z;
    }

    public Typeface getAccentTypeface() {
        return this.R;
    }

    public int getBottomTextSize() {
        return this.o;
    }

    public float getCurrentBottomLines() {
        return this.I;
    }

    @Override // android.widget.TextView
    public CharSequence getError() {
        return this.M;
    }

    public int getErrorColor() {
        return this.z;
    }

    public float getFloatingLabelFraction() {
        return this.N;
    }

    public int getFloatingLabelPadding() {
        return this.f139228p;
    }

    public CharSequence getFloatingLabelText() {
        return this.S;
    }

    public int getFloatingLabelTextColor() {
        return this.f139225n;
    }

    public int getFloatingLabelTextSize() {
        return this.f139224m;
    }

    public float getFocusFraction() {
        return this.P;
    }

    public String getHelperText() {
        return this.K;
    }

    public int getHelperTextColor() {
        return this.L;
    }

    public int getInnerPaddingBottom() {
        return this.v;
    }

    public int getInnerPaddingLeft() {
        return this.f139236w;
    }

    public int getInnerPaddingRight() {
        return this.f139237x;
    }

    public int getInnerPaddingTop() {
        return this.u;
    }

    public int getMaxCharacters() {
        return this.B;
    }

    public int getMinBottomTextLines() {
        return this.H;
    }

    public int getMinCharacters() {
        return this.A;
    }

    public int getUnderlineColor() {
        return this.U;
    }

    public List<c> getValidators() {
        return this.f139233s0;
    }

    public final int h(Editable editable) {
        b bVar = this.f139235t0;
        return bVar == null ? editable.length() : bVar.a();
    }

    public final void i() {
        int buttonsCount = this.f139222k0 * getButtonsCount();
        int i = 0;
        if (!s()) {
            i = buttonsCount;
            buttonsCount = 0;
        }
        super.setPadding(this.f139236w + this.k + buttonsCount, this.u + this.i, this.f139237x + this.f139223l + i, this.v + this.f139221j);
    }

    public final Bitmap[] j(int i) {
        if (i == -1) {
            return null;
        }
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeResource(getResources(), i, options);
        int iMax = Math.max(options.outWidth, options.outHeight);
        int i2 = this.j0;
        options.inSampleSize = iMax > i2 ? iMax / i2 : 1;
        options.inJustDecodeBounds = false;
        return k(BitmapFactory.decodeResource(getResources(), i, options));
    }

    public final Bitmap[] k(Bitmap bitmap) {
        int i;
        if (bitmap == null) {
            return null;
        }
        Bitmap[] bitmapArr = new Bitmap[4];
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        int iMax = Math.max(width, height);
        int i2 = this.j0;
        if (iMax != i2 && iMax > i2) {
            if (width > i2) {
                i = (int) ((height / width) * i2);
            } else {
                i2 = (int) ((width / height) * i2);
                i = i2;
            }
            bitmap = Bitmap.createScaledBitmap(bitmap, i2, i, false);
        }
        Bitmap.Config config = Bitmap.Config.ARGB_8888;
        bitmapArr[0] = bitmap.copy(config, true);
        Canvas canvas = new Canvas(bitmapArr[0]);
        int i3 = this.f139234t;
        int i5 = (a.a(i3) ? -16777216 : -1979711488) | (i3 & 16777215);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        canvas.drawColor(i5, mode);
        bitmapArr[1] = bitmap.copy(config, true);
        new Canvas(bitmapArr[1]).drawColor(this.f139238y, mode);
        bitmapArr[2] = bitmap.copy(config, true);
        Canvas canvas2 = new Canvas(bitmapArr[2]);
        int i6 = this.f139234t;
        canvas2.drawColor((a.a(i6) ? 1275068416 : 1107296256) | (16777215 & i6), mode);
        bitmapArr[3] = bitmap.copy(config, true);
        new Canvas(bitmapArr[3]).drawColor(this.z, mode);
        return bitmapArr;
    }

    public final Bitmap[] l(Drawable drawable) {
        if (drawable == null) {
            return null;
        }
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        drawable.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
        drawable.draw(canvas);
        int i = this.j0;
        return k(Bitmap.createScaledBitmap(bitmapCreateBitmap, i, i, false));
    }

    public final int m(int i) {
        return kli.a.k(getContext(), i);
    }

    public final void n(Context context, AttributeSet attributeSet) {
        int i;
        if (isInEditMode()) {
            return;
        }
        this.j0 = m(32);
        this.f139222k0 = m(48);
        this.l0 = m(32);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.MaterialEditText);
        this.p0 = typedArrayObtainStyledAttributes.getColorStateList(R$styleable.MaterialEditText_met_textColor);
        this.q0 = typedArrayObtainStyledAttributes.getColorStateList(R$styleable.MaterialEditText_met_textColorHint);
        this.f139234t = typedArrayObtainStyledAttributes.getColor(R$styleable.MaterialEditText_met_baseColor, -16777216);
        TypedValue typedValue = new TypedValue();
        try {
            try {
                context.getTheme().resolveAttribute(R.attr.colorPrimary, typedValue, true);
                i = typedValue.data;
            } catch (Exception unused) {
                int identifier = getResources().getIdentifier("colorPrimary", "attr", getContext().getPackageName());
                if (identifier == 0) {
                    throw new RuntimeException("colorPrimary not found");
                }
                context.getTheme().resolveAttribute(identifier, typedValue, true);
                i = typedValue.data;
            }
        } catch (Exception unused2) {
            i = this.f139234t;
        }
        this.f139229q = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.MaterialEditText_met_bottomSpacing, getResources().getDimensionPixelSize(R$dimen.inner_components_spacing));
        this.F = getResources().getDimensionPixelSize(R$dimen.bottom_ellipsis_height);
        this.f139238y = typedArrayObtainStyledAttributes.getColor(R$styleable.MaterialEditText_met_primaryColor, i);
        setFloatingLabelInternal(typedArrayObtainStyledAttributes.getInt(R$styleable.MaterialEditText_met_floatingLabel, 0));
        this.z = typedArrayObtainStyledAttributes.getColor(R$styleable.MaterialEditText_met_errorColor, Color.parseColor("#F54C3E"));
        this.A = typedArrayObtainStyledAttributes.getInt(R$styleable.MaterialEditText_met_minCharacters, 0);
        this.B = typedArrayObtainStyledAttributes.getInt(R$styleable.MaterialEditText_met_maxCharacters, 0);
        this.C = typedArrayObtainStyledAttributes.getBoolean(R$styleable.MaterialEditText_met_singleLineEllipsis, false);
        this.K = typedArrayObtainStyledAttributes.getString(R$styleable.MaterialEditText_met_helperText);
        this.L = typedArrayObtainStyledAttributes.getColor(R$styleable.MaterialEditText_met_helperTextColor, -1);
        this.H = typedArrayObtainStyledAttributes.getInt(R$styleable.MaterialEditText_met_minBottomTextLines, 0);
        String string = typedArrayObtainStyledAttributes.getString(R$styleable.MaterialEditText_met_accentTypeface);
        if (string != null && !isInEditMode()) {
            Typeface typefaceCreateFromAsset = Typeface.createFromAsset(getContext().getAssets(), string);
            this.R = typefaceCreateFromAsset;
            this.f139213b.setTypeface(typefaceCreateFromAsset);
        }
        String string2 = typedArrayObtainStyledAttributes.getString(R$styleable.MaterialEditText_met_typeface);
        if (string2 != null && !isInEditMode()) {
            setTypeface(Typeface.createFromAsset(getContext().getAssets(), string2));
        }
        String string3 = typedArrayObtainStyledAttributes.getString(R$styleable.MaterialEditText_met_floatingLabelText);
        this.S = string3;
        if (string3 == null) {
            this.S = getHint();
        }
        this.f139228p = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.MaterialEditText_met_floatingLabelPadding, this.f139229q);
        this.f139224m = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.MaterialEditText_met_floatingLabelTextSize, getResources().getDimensionPixelSize(R$dimen.floating_label_text_size));
        this.f139225n = typedArrayObtainStyledAttributes.getColor(R$styleable.MaterialEditText_met_floatingLabelTextColor, -1);
        this.f139212a0 = typedArrayObtainStyledAttributes.getBoolean(R$styleable.MaterialEditText_met_floatingLabelAnimating, true);
        this.o = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.MaterialEditText_met_bottomTextSize, getResources().getDimensionPixelSize(R$dimen.bottom_text_size));
        this.T = typedArrayObtainStyledAttributes.getBoolean(R$styleable.MaterialEditText_met_hideUnderline, false);
        this.U = typedArrayObtainStyledAttributes.getColor(R$styleable.MaterialEditText_met_underlineColor, -1);
        this.V = typedArrayObtainStyledAttributes.getBoolean(R$styleable.MaterialEditText_met_autoValidate, false);
        this.c0 = j(typedArrayObtainStyledAttributes.getResourceId(R$styleable.MaterialEditText_met_iconLeft, -1));
        this.f139216d0 = j(typedArrayObtainStyledAttributes.getResourceId(R$styleable.MaterialEditText_met_iconRight, -1));
        this.f139220h0 = typedArrayObtainStyledAttributes.getBoolean(R$styleable.MaterialEditText_met_clearButton, false);
        this.f139217e0 = j(R$drawable.ic_clear_m);
        this.m0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.MaterialEditText_met_iconPadding, m(16));
        this.D = typedArrayObtainStyledAttributes.getBoolean(R$styleable.MaterialEditText_met_floatingLabelAlwaysShown, false);
        this.E = typedArrayObtainStyledAttributes.getBoolean(R$styleable.MaterialEditText_met_helperTextAlwaysShown, false);
        this.f0 = typedArrayObtainStyledAttributes.getBoolean(R$styleable.MaterialEditText_met_validateOnFocusLost, false);
        this.f139214b0 = typedArrayObtainStyledAttributes.getBoolean(R$styleable.MaterialEditText_met_checkCharactersCountAtBeginning, true);
        typedArrayObtainStyledAttributes.recycle();
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.padding, R.attr.paddingLeft, R.attr.paddingTop, R.attr.paddingRight, R.attr.paddingBottom});
        int dimensionPixelSize = typedArrayObtainStyledAttributes2.getDimensionPixelSize(0, 0);
        this.f139236w = typedArrayObtainStyledAttributes2.getDimensionPixelSize(1, dimensionPixelSize);
        this.u = typedArrayObtainStyledAttributes2.getDimensionPixelSize(2, dimensionPixelSize);
        this.f139237x = typedArrayObtainStyledAttributes2.getDimensionPixelSize(3, dimensionPixelSize);
        this.v = typedArrayObtainStyledAttributes2.getDimensionPixelSize(4, dimensionPixelSize);
        typedArrayObtainStyledAttributes2.recycle();
        setBackgroundDrawable(null);
        if (this.C) {
            TransformationMethod transformationMethod = getTransformationMethod();
            setSingleLine();
            setTransformationMethod(transformationMethod);
        }
        o();
        p();
        q();
        addTextChangedListener(new d(this, 1));
        int i2 = 0;
        e eVar = new e(this, i2);
        this.f139218g = eVar;
        super.setOnFocusChangeListener(eVar);
        addTextChangedListener(new d(this, i2));
        g();
    }

    public final void o() {
        int i = 1;
        boolean z = this.A > 0 || this.B > 0 || this.C || this.M != null || this.K != null;
        int i2 = this.H;
        if (i2 > 0) {
            i = i2;
        } else if (!z) {
            i = 0;
        }
        this.G = i;
        this.I = i;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.i0) {
            return;
        }
        this.i0 = true;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onDraw(Canvas canvas) {
        int i;
        int i2;
        int i3;
        int i5;
        Canvas canvas2 = canvas;
        int paddingLeft = getPaddingLeft() + getScrollX() + (this.c0 == null ? 0 : this.f139222k0 + this.m0);
        int scrollX = (getScrollX() + (this.f139216d0 == null ? getWidth() : (getWidth() - this.f139222k0) - this.m0)) - getPaddingRight();
        int height = (getHeight() + getScrollY()) - getPaddingBottom();
        Paint paint = this.f139211a;
        paint.setAlpha(255);
        Bitmap[] bitmapArr = this.c0;
        if (bitmapArr != null) {
            Bitmap bitmap = bitmapArr[(this.M == null && this.W) ? !isEnabled() ? (char) 2 : hasFocus() ? (char) 1 : (char) 0 : (char) 3];
            int i6 = paddingLeft - this.m0;
            int i21 = this.f139222k0;
            int width = ((i21 - bitmap.getWidth()) / 2) + (i6 - i21);
            int i22 = this.f139229q + height;
            int i32 = this.l0;
            canvas2.drawBitmap(bitmap, width, ((i32 - bitmap.getHeight()) / 2) + (i22 - i32), paint);
        }
        Bitmap[] bitmapArr2 = this.f139216d0;
        if (bitmapArr2 != null) {
            Bitmap bitmap2 = bitmapArr2[(this.M == null && this.W) ? !isEnabled() ? (char) 2 : hasFocus() ? (char) 1 : (char) 0 : (char) 3];
            int width2 = ((this.f139222k0 - bitmap2.getWidth()) / 2) + this.m0 + scrollX;
            int i33 = this.f139229q + height;
            int i43 = this.l0;
            canvas2.drawBitmap(bitmap2, width2, ((i43 - bitmap2.getHeight()) / 2) + (i33 - i43), paint);
        }
        if (hasFocus() && this.f139220h0 && !TextUtils.isEmpty(getText()) && isEnabled()) {
            paint.setAlpha(255);
            int i59 = s() ? paddingLeft : scrollX - this.f139222k0;
            Bitmap bitmap3 = this.f139217e0[0];
            int width3 = ((this.f139222k0 - bitmap3.getWidth()) / 2) + i59;
            int i66 = this.f139229q + height;
            int i74 = this.l0;
            canvas2.drawBitmap(bitmap3, width3, ((i74 - bitmap3.getHeight()) / 2) + (i66 - i74), paint);
        }
        int i92 = this.g0 ? this.z : this.U;
        boolean z = this.T;
        ArgbEvaluator argbEvaluator = this.f139231r0;
        int i96 = -1;
        if (z) {
            i = -1;
        } else {
            int i99 = height + this.f139229q;
            if (this.M != null || !this.W) {
                i5 = i99;
                i = -1;
                paint.setColor(this.z);
                canvas2 = canvas;
                canvas2.drawRect(paddingLeft, i5, scrollX, m(2) + i5, paint);
            } else if (isEnabled()) {
                i5 = i99;
                i = -1;
                float f = (this.Q && this.g0) ? BitmapDescriptorFactory.HUE_RED : this.P * (isEnabled() ? 1.0f : 0.0f);
                if (i92 == -1) {
                    i92 = (this.f139234t & 16777215) | 503316480;
                }
                paint.setColor(((Integer) argbEvaluator.evaluate(f, Integer.valueOf(i92), Integer.valueOf(this.f139238y))).intValue());
                canvas2 = canvas;
                canvas2.drawRect(paddingLeft, i5, scrollX, ((this.g0 || hasFocus()) ? m(2) : m(1)) + i5, paint);
            } else {
                if (i92 == -1) {
                    i92 = (this.f139234t & 16777215) | 1140850688;
                }
                paint.setColor(i92);
                float fM = m(1);
                float f4 = BitmapDescriptorFactory.HUE_RED;
                while (f4 < getWidth()) {
                    float f5 = paddingLeft + f4;
                    int i100 = i99;
                    float f6 = fM;
                    canvas2.drawRect(f5, i100, f5 + f6, m(1) + i100, paint);
                    f4 = (f6 * 3.0f) + f4;
                    canvas2 = canvas;
                    i99 = i100;
                    i96 = -1;
                    fM = f6;
                }
                i5 = i99;
                i = i96;
                canvas2 = canvas;
            }
            height = i5;
        }
        float f32 = this.o;
        TextPaint textPaint = this.f139213b;
        textPaint.setTextSize(f32);
        Paint.FontMetrics fontMetrics = textPaint.getFontMetrics();
        float f35 = fontMetrics.ascent;
        float f36 = fontMetrics.descent;
        float f37 = (-f35) - f36;
        float f41 = this.o + f35 + f36;
        if ((!hasFocus() || (this.A <= 0 && this.B <= 0)) && this.W) {
            i2 = 1140850688;
        } else {
            textPaint.setColor(this.W ? (this.f139234t & 16777215) | 1140850688 : this.z);
            String charactersCounterText = getCharactersCounterText();
            i2 = 1140850688;
            canvas2.drawText(charactersCounterText, s() ? paddingLeft : scrollX - textPaint.measureText(charactersCounterText), this.f139229q + height + f37, textPaint);
        }
        if (this.f139215c != null && (this.M != null || ((this.E || hasFocus()) && !TextUtils.isEmpty(this.K)))) {
            if (this.M != null) {
                i3 = this.z;
            } else {
                i3 = this.L;
                if (i3 == i) {
                    i3 = (this.f139234t & 16777215) | i2;
                }
            }
            textPaint.setColor(i3);
            canvas2.save();
            if (s()) {
                canvas2.translate(scrollX - this.f139215c.getWidth(), (this.f139229q + height) - f41);
            } else {
                canvas2.translate(getBottomTextLeftOffset() + paddingLeft, (this.f139229q + height) - f41);
            }
            this.f139215c.draw(canvas2);
            canvas2.restore();
        }
        int i101 = this.g0 ? this.z : this.f139225n;
        if (this.f139230r && !TextUtils.isEmpty(this.S)) {
            textPaint.setTextSize(this.f139224m);
            textPaint.setColor(((Integer) argbEvaluator.evaluate((this.Q && this.g0) ? BitmapDescriptorFactory.HUE_RED : this.P * (isEnabled() ? 1.0f : 0.0f), Integer.valueOf(i101 != i ? i101 : (this.f139234t & 16777215) | i2), Integer.valueOf(this.g0 ? this.z : this.f139238y))).intValue());
            float fMeasureText = textPaint.measureText(this.S.toString());
            int width4 = ((getGravity() & 5) == 5 || s()) ? (int) (scrollX - fMeasureText) : (getGravity() & 3) == 3 ? paddingLeft : ((int) (((((getWidth() - getInnerPaddingLeft()) - getInnerPaddingRight()) - fMeasureText) / 2.0f) + getInnerPaddingLeft())) + paddingLeft;
            int scrollY = (int) ((((this.u + this.f139224m) + r10) - (this.f139228p * (this.D ? 1.0f : this.N))) + getScrollY());
            textPaint.setAlpha((int) (a0.d.a(this.N * 0.74f, isEnabled() ? 1.0f : 0.0f, 0.26f, this.D ? 1.0f : this.N) * (i101 != i ? 255 : Color.alpha(i101))));
            canvas2.drawText(this.S.toString(), width4, scrollY, textPaint);
        }
        if (hasFocus() && this.C && getScrollX() != 0) {
            paint.setColor((this.M == null && this.W) ? this.f139238y : this.z);
            float f42 = height + this.f139229q;
            if (s()) {
                paddingLeft = scrollX;
            }
            int i102 = s() ? i : 1;
            int i103 = this.F;
            float fD = a0.d.D(i102, i103, 2, paddingLeft);
            float f57 = i103 / 2;
            canvas2.drawCircle(fD, f42 + f57, f57, paint);
            int i104 = this.F;
            float f69 = (((i102 * i104) * 5) / 2) + paddingLeft;
            float f75 = i104 / 2;
            canvas2.drawCircle(f69, f42 + f75, f75, paint);
            int i105 = this.F;
            float f77 = (((i102 * i105) * 9) / 2) + paddingLeft;
            float f81 = i105 / 2;
            canvas2.drawCircle(f77, f42 + f81, f81, paint);
        }
        super.onDraw(canvas);
    }

    @Override // android.widget.TextView, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i5) {
        super.onLayout(z, i, i2, i3, i5);
        if (z) {
            f();
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.C && getScrollX() > 0 && motionEvent.getAction() == 0 && motionEvent.getX() < m(20) && motionEvent.getY() > (getHeight() - this.f139221j) - this.v && motionEvent.getY() < getHeight() - this.v) {
            setSelection(0);
            return false;
        }
        if (hasFocus() && this.f139220h0 && isEnabled()) {
            int action = motionEvent.getAction();
            if (action != 0) {
                if (action == 1) {
                    if (this.f139227o0) {
                        if (!TextUtils.isEmpty(getText())) {
                            setText((CharSequence) null);
                        }
                        this.f139227o0 = false;
                    }
                    if (this.f139226n0) {
                        this.f139226n0 = false;
                        return true;
                    }
                    this.f139226n0 = false;
                } else if (action != 2) {
                    if (action == 3) {
                        this.f139226n0 = false;
                        this.f139227o0 = false;
                    }
                }
            } else if (r(motionEvent)) {
                this.f139226n0 = true;
                this.f139227o0 = true;
                return true;
            }
            if (this.f139227o0 && !r(motionEvent)) {
                this.f139227o0 = false;
            }
            if (this.f139226n0) {
                return true;
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    public final void p() {
        this.i = this.f139230r ? this.f139224m + this.f139228p : this.f139228p;
        float f = this.o;
        TextPaint textPaint = this.f139213b;
        textPaint.setTextSize(f);
        Paint.FontMetrics fontMetrics = textPaint.getFontMetrics();
        this.f139221j = ((int) ((fontMetrics.descent - fontMetrics.ascent) * this.I)) + (this.T ? this.f139229q : this.f139229q * 2);
        this.k = this.c0 == null ? 0 : this.f139222k0 + this.m0;
        this.f139223l = this.f139216d0 != null ? this.m0 + this.f139222k0 : 0;
        i();
    }

    public final void q() {
        if (TextUtils.isEmpty(getText())) {
            t();
        } else {
            Editable text = getText();
            setText((CharSequence) null);
            t();
            setText(text);
            setSelection(text.length());
            this.N = 1.0f;
            this.O = true;
        }
        u();
    }

    public final boolean r(MotionEvent motionEvent) {
        float x3 = motionEvent.getX();
        float y2 = motionEvent.getY();
        int scrollX = getScrollX() + (this.c0 == null ? 0 : this.f139222k0 + this.m0);
        int scrollX2 = getScrollX() + (this.f139216d0 == null ? getWidth() : (getWidth() - this.f139222k0) - this.m0);
        if (!s()) {
            scrollX = scrollX2 - this.f139222k0;
        }
        int height = ((getHeight() + getScrollY()) - getPaddingBottom()) + this.f139229q;
        int i = this.l0;
        int i2 = height - i;
        return x3 >= ((float) scrollX) && x3 < ((float) (scrollX + this.f139222k0)) && y2 >= ((float) i2) && y2 < ((float) (i2 + i));
    }

    public final boolean s() {
        return getResources().getConfiguration().getLayoutDirection() == 1;
    }

    public void setAccentTypeface(Typeface typeface) {
        this.R = typeface;
        this.f139213b.setTypeface(typeface);
        postInvalidate();
    }

    public void setAutoValidate(boolean z) {
        this.V = z;
        if (z) {
            v();
        }
    }

    public void setBaseColor(int i) {
        if (this.f139234t != i) {
            this.f139234t = i;
        }
        q();
        postInvalidate();
    }

    public void setBottomTextSize(int i) {
        this.o = i;
        p();
    }

    public void setCurrentBottomLines(float f) {
        this.I = f;
        p();
    }

    @Override // android.widget.TextView
    public void setError(CharSequence charSequence) {
        String string = (charSequence == null || charSequence.length() == 0) ? null : charSequence.toString();
        this.M = string;
        setError(string != null);
        if (f()) {
            postInvalidate();
        }
    }

    public void setErrorColor(int i) {
        this.z = i;
        postInvalidate();
    }

    public void setFloatingLabel(int i) {
        setFloatingLabelInternal(i);
        p();
    }

    public void setFloatingLabelAlwaysShown(boolean z) {
        this.D = z;
        invalidate();
    }

    public void setFloatingLabelAnimating(boolean z) {
        this.f139212a0 = z;
    }

    public void setFloatingLabelFraction(float f) {
        this.N = f;
        invalidate();
    }

    public void setFloatingLabelPadding(int i) {
        this.f139228p = i;
        postInvalidate();
    }

    public void setFloatingLabelText(CharSequence charSequence) {
        if (charSequence == null) {
            charSequence = getHint();
        }
        this.S = charSequence;
        postInvalidate();
    }

    public void setFloatingLabelTextColor(int i) {
        this.f139225n = i;
        postInvalidate();
    }

    public void setFloatingLabelTextSize(int i) {
        this.f139224m = i;
        p();
    }

    public void setFocusFraction(float f) {
        this.P = f;
        invalidate();
    }

    public void setHelperText(CharSequence charSequence) {
        this.K = charSequence == null ? null : charSequence.toString();
        if (f()) {
            postInvalidate();
        }
    }

    public void setHelperTextAlwaysShown(boolean z) {
        this.E = z;
        invalidate();
    }

    public void setHelperTextColor(int i) {
        this.L = i;
        postInvalidate();
    }

    public void setHideUnderline(boolean z) {
        this.T = z;
        p();
        postInvalidate();
    }

    public void setIconLeft(int i) {
        this.c0 = j(i);
        p();
    }

    public void setIconRight(int i) {
        this.f139216d0 = j(i);
        p();
    }

    public void setImmediateError(boolean z) {
        this.Q = z;
    }

    public void setLengthChecker(b bVar) {
        this.f139235t0 = bVar;
    }

    public void setMaxCharacters(int i) {
        this.B = i;
        o();
        p();
        postInvalidate();
    }

    public void setMetHintTextColor(int i) {
        this.q0 = ColorStateList.valueOf(i);
        t();
    }

    public void setMetTextColor(int i) {
        this.p0 = ColorStateList.valueOf(i);
        u();
    }

    public void setMinBottomTextLines(int i) {
        this.H = i;
        o();
        p();
        postInvalidate();
    }

    public void setMinCharacters(int i) {
        this.A = i;
        o();
        p();
        postInvalidate();
    }

    @Override // android.view.View
    public void setOnFocusChangeListener(View.OnFocusChangeListener onFocusChangeListener) {
        if (this.f139218g == null) {
            super.setOnFocusChangeListener(onFocusChangeListener);
        } else {
            this.f139219h = onFocusChangeListener;
        }
    }

    @Override // android.widget.TextView, android.view.View
    @yhm.d
    public final void setPadding(int i, int i2, int i3, int i5) {
        super.setPadding(i, i2, i3, i5);
    }

    public void setPaddings(int i, int i2, int i3, int i5) {
        this.u = i2;
        this.v = i5;
        this.f139236w = i;
        this.f139237x = i3;
        i();
    }

    public void setPrimaryColor(int i) {
        this.f139238y = i;
        postInvalidate();
    }

    public void setShowClearButton(boolean z) {
        this.f139220h0 = z;
        i();
    }

    public void setSingleLineEllipsis() {
        setSingleLineEllipsis(true);
    }

    public void setUnderlineColor(int i) {
        this.U = i;
        postInvalidate();
    }

    public void setValidateOnFocusLost(boolean z) {
        this.f0 = z;
    }

    public final void t() {
        ColorStateList colorStateList = this.q0;
        if (colorStateList == null) {
            setHintTextColor((this.f139234t & 16777215) | 1140850688);
        } else {
            setHintTextColor(colorStateList);
        }
    }

    public final void u() {
        ColorStateList colorStateList = this.p0;
        if (colorStateList != null) {
            setTextColor(colorStateList);
            return;
        }
        int[][] iArr = {new int[]{R.attr.state_enabled}, EditText.EMPTY_STATE_SET};
        int i = this.f139234t;
        ColorStateList colorStateList2 = new ColorStateList(iArr, new int[]{(i & 16777215) | (-553648128), (i & 16777215) | 1140850688});
        this.p0 = colorStateList2;
        setTextColor(colorStateList2);
    }

    public final void v() {
        ArrayList arrayList = this.f139233s0;
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        Editable text = getText();
        text.length();
        Iterator it8 = this.f139233s0.iterator();
        boolean z = true;
        while (true) {
            if (!it8.hasNext()) {
                break;
            }
            c cVar = (c) it8.next();
            z = z && cVar.a(text);
            if (!z) {
                setError(cVar.f139206a);
                break;
            }
        }
        if (z) {
            setError((CharSequence) null);
        }
        postInvalidate();
    }

    public void setSingleLineEllipsis(boolean z) {
        this.C = z;
        o();
        p();
        postInvalidate();
    }

    public void setIconLeft(Drawable drawable) {
        this.c0 = l(drawable);
        p();
    }

    public void setIconRight(Drawable drawable) {
        this.f139216d0 = l(drawable);
        p();
    }

    public void setMetHintTextColor(ColorStateList colorStateList) {
        this.q0 = colorStateList;
        t();
    }

    public void setMetTextColor(ColorStateList colorStateList) {
        this.p0 = colorStateList;
        u();
    }

    public void setError(boolean z) {
        this.g0 = z;
        postInvalidate();
    }

    public void setIconLeft(Bitmap bitmap) {
        this.c0 = k(bitmap);
        p();
    }

    public void setIconRight(Bitmap bitmap) {
        this.f139216d0 = k(bitmap);
        p();
    }

    public f(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f139211a = new Paint(1);
        this.f139213b = new TextPaint(1);
        this.L = -1;
        this.f139231r0 = new ArgbEvaluator();
        n(context, attributeSet);
    }

    public f(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f139211a = new Paint(1);
        this.f139213b = new TextPaint(1);
        this.L = -1;
        this.f139231r0 = new ArgbEvaluator();
        n(context, attributeSet);
    }
}
