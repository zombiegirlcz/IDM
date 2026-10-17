package com.revolut.uicomponent.widgets.support_edit_text;

import android.content.Context;
import android.content.res.ColorStateList;
import android.util.AttributeSet;
import androidx.core.content.ContextCompat;
import com.google.android.material.textfield.TextInputLayout;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.uicomponent.R$style;
import do3.q;
import gzl.e;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import kli.a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import yhm.d;
import yhm.r;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\r\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0017\u0018\u0000 \u00132\u00020\u0001:\u0001\u0014B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0019\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0015"}, d2 = {"Lcom/revolut/uicomponent/widgets/support_edit_text/RevolutTextInputLayout;", "Lcom/google/android/material/textfield/TextInputLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attributeSet", "", "defStyle", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", "error", "", "setError", "(Ljava/lang/CharSequence;)V", "Lgzl/e;", "errorData", "setSoftError", "(Lgzl/e;)V", "Companion", "a", "core_ui_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@d
public class RevolutTextInputLayout extends TextInputLayout {
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public RevolutTextInputLayout(@NotNull Context context) {
        this(context, null, 6, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    @Override // com.google.android.material.textfield.TextInputLayout
    public void setError(CharSequence error) {
        r rVar;
        setErrorTextAppearance(R$style.RTextInputLayoutErrorTextAppearance);
        if (error == null || error.length() == 0) {
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            Integer numValueOf = Integer.valueOf(a.x(R$attr.uikit_colorAccent, context));
            Context context2 = getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
            rVar = new r(numValueOf, Integer.valueOf(a.x(R$attr.uikit_colorGreyTone50, context2)), Integer.valueOf(R$style.RTextInputLayoutTextAppearance));
        } else {
            Context context3 = getContext();
            Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
            Integer numValueOf2 = Integer.valueOf(a.x(R$attr.uikit_colorPink, context3));
            Context context4 = getContext();
            Intrinsics.checkNotNullExpressionValue(context4, "getContext(...)");
            rVar = new r(numValueOf2, Integer.valueOf(a.x(R$attr.uikit_colorPink, context4)), Integer.valueOf(R$style.RTextInputLayoutErrorTextAppearance));
        }
        int iIntValue = ((Number) rVar.f314201a).intValue();
        int iIntValue2 = ((Number) rVar.f314202b).intValue();
        int iIntValue3 = ((Number) rVar.f314203c).intValue();
        try {
            ColorStateList colorStateList = new ColorStateList(new int[][]{new int[]{-16842908}, new int[]{-16843518}, new int[0]}, new int[]{ContextCompat.getColor(getContext(), iIntValue2), ContextCompat.getColor(getContext(), iIntValue2), ContextCompat.getColor(getContext(), iIntValue)});
            Field fieldM = q.m(TextInputLayout.class, "mFocusedTextColor", "focusedTextColor");
            fieldM.setAccessible(true);
            fieldM.set(this, colorStateList);
            Field fieldM2 = q.m(TextInputLayout.class, "mDefaultTextColor", "defaultHintTextColor}");
            fieldM2.setAccessible(true);
            fieldM2.set(this, colorStateList);
            Method declaredMethod = TextInputLayout.class.getDeclaredMethod("updateLabelState", Boolean.TYPE);
            if (declaredMethod != null) {
                declaredMethod.setAccessible(true);
                declaredMethod.invoke(this, Boolean.TRUE);
            }
        } catch (Throwable unused) {
        }
        setHintTextAppearance(iIntValue3);
        super.setError(error);
    }

    public final void setSoftError(@NotNull e errorData) {
        Intrinsics.checkNotNullParameter(errorData, "errorData");
        errorData.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public RevolutTextInputLayout(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RevolutTextInputLayout(@NotNull Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        setHintTextAppearance(R$style.RTextInputLayoutTextAppearance);
        setErrorTextAppearance(R$style.RTextInputLayoutErrorTextAppearance);
    }

    public /* synthetic */ RevolutTextInputLayout(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i & 2) != 0 ? null : attributeSet, 0);
    }
}
