package com.revolut.uicomponent.widgets.material_edit_text;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.KeyEvent;
import androidx.annotation.NonNull;
import au0.a2;
import bzl.k;
import com.revolut.uicomponent.R$styleable;
import fzl.f;
import fzl.g;
import fzl.h;
import java.util.ArrayList;
import java.util.regex.Pattern;
import kotlin.jvm.internal.Intrinsics;
import v01.a;
import v01.c;
import yhm.d;

/* JADX INFO: loaded from: classes12.dex */
@d
public class TypefaceMaterialEditText extends f implements a {

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    public boolean f107324v0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public String f107325w0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public String f107326x0;
    public TextWatcher y0;

    public TypefaceMaterialEditText(Context context) {
        super(context);
        w(context, null);
    }

    public TextWatcher getTextChangedListener() {
        return this.y0;
    }

    @Override // android.widget.TextView, android.view.View
    public final boolean onKeyPreIme(int i, KeyEvent keyEvent) {
        if (i == 4 && this.f107324v0) {
            clearFocus();
        }
        return super.onKeyPreIme(i, keyEvent);
    }

    @Override // v01.a
    public void setClearFocusOnKeyboardClose(boolean z) {
        this.f107324v0 = z;
    }

    @Override // fzl.f, android.widget.TextView
    public void setError(CharSequence charSequence) {
        super.setError(charSequence);
    }

    @Override // v01.a
    public void setHint(String str) {
        super.setHint((CharSequence) str);
    }

    public void setHintAndFloatingLabel(String str) {
        setHint(str);
        setFloatingLabelText(null);
    }

    @Override // android.widget.TextView
    public void setInputType(int i) {
        super.setInputType(i);
        setTypeface(null);
    }

    public void setOnErrorListener(h hVar) {
    }

    public void setTextChangedListener(TextWatcher textWatcher) {
        this.y0 = textWatcher;
    }

    @Override // android.widget.TextView, v01.a
    public void setTypeface(@NonNull Typeface typeface) {
        super.setTypeface(typeface);
    }

    public final void w(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.TypefaceTextView);
        if (typedArrayObtainStyledAttributes != null) {
            this.f107325w0 = typedArrayObtainStyledAttributes.getString(R$styleable.TypefaceTextView_ttv_validation);
            String string = typedArrayObtainStyledAttributes.getString(R$styleable.TypefaceTextView_ttv_errorMessage);
            this.f107326x0 = string;
            if (!TextUtils.isEmpty(string) && !TextUtils.isEmpty(this.f107325w0)) {
                String errorMessage = this.f107326x0;
                String regex = this.f107325w0;
                Intrinsics.checkNotNullParameter(errorMessage, "errorMessage");
                Intrinsics.checkNotNullParameter(regex, "regex");
                g gVar = new g(errorMessage);
                Pattern patternCompile = Pattern.compile(regex);
                Intrinsics.checkNotNullExpressionValue(patternCompile, "compile(...)");
                gVar.f139239b = patternCompile;
                if (this.f139233s0 == null) {
                    this.f139233s0 = new ArrayList();
                }
                this.f139233s0.add(gVar);
            }
            typedArrayObtainStyledAttributes.recycle();
        }
        c.a(context, this, attributeSet);
        addTextChangedListener(new k(new a2(this, 4)));
    }

    public TypefaceMaterialEditText(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        w(context, attributeSet);
    }

    public TypefaceMaterialEditText(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        w(context, attributeSet);
    }
}
