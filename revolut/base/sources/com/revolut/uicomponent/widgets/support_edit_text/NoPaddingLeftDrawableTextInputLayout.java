package com.revolut.uicomponent.widgets.support_edit_text;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.widget.EditText;
import com.google.android.material.textfield.TextInputLayout;
import do3.q;
import gom.e;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import yhm.d;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/revolut/uicomponent/widgets/support_edit_text/NoPaddingLeftDrawableTextInputLayout;", "Lcom/revolut/uicomponent/widgets/support_edit_text/RevolutTextInputLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attributeSet", "", "defStyle", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "core_ui_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@d
public final class NoPaddingLeftDrawableTextInputLayout extends RevolutTextInputLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f107327a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Rect f107328b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Method f107329c;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public NoPaddingLeftDrawableTextInputLayout(@NotNull Context context) {
        this(context, null, 6, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    @Override // com.google.android.material.textfield.TextInputLayout, android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i5) {
        super.onLayout(z, i, i2, i3, i5);
        try {
            EditText editText = getEditText();
            if (editText != null) {
                Rect rect = this.f107328b;
                if (rect != null) {
                    rect.left = editText.getLeft() + editText.getPaddingLeft();
                }
                Method method = this.f107329c;
                if (method != null) {
                    method.invoke(this.f107327a, null);
                }
            }
        } catch (Throwable th10) {
            e.f145194a.e(th10);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public NoPaddingLeftDrawableTextInputLayout(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NoPaddingLeftDrawableTextInputLayout(@NotNull Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        try {
            Field fieldM = q.m(TextInputLayout.class, "mCollapsingTextHelper", "collapsingTextHelper");
            fieldM.setAccessible(true);
            Object obj2 = fieldM.get(this);
            this.f107327a = obj2;
            if (obj2 != null) {
                Field fieldM2 = q.m(obj2.getClass(), "mCollapsedBounds", "collapsedBounds");
                fieldM2.setAccessible(true);
                Object obj3 = fieldM2.get(this.f107327a);
                Intrinsics.i(obj3, "null cannot be cast to non-null type android.graphics.Rect");
                this.f107328b = (Rect) obj3;
            }
            Object obj4 = this.f107327a;
            this.f107329c = obj4 != null ? obj4.getClass().getDeclaredMethod("recalculate", null) : null;
        } catch (IllegalAccessException e) {
            e.f145194a.e(e);
            this.f107327a = null;
            this.f107328b = null;
            this.f107329c = null;
        } catch (NoSuchFieldException e2) {
            e.f145194a.e(e2);
            this.f107327a = null;
            this.f107328b = null;
            this.f107329c = null;
        } catch (NoSuchMethodException e4) {
            e.f145194a.e(e4);
            this.f107327a = null;
            this.f107328b = null;
            this.f107329c = null;
        }
    }

    public /* synthetic */ NoPaddingLeftDrawableTextInputLayout(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i & 2) != 0 ? null : attributeSet, 0);
    }
}
