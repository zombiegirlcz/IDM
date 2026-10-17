package com.revolut.uicomponent.text.masked;

import android.content.Context;
import android.text.Editable;
import android.util.AttributeSet;
import android.view.View;
import androidx.appcompat.R$attr;
import au0.m4;
import com.revolut.uicomponent.widgets.material_edit_text.TypefaceMaterialEditText;
import gom.e;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import yhm.d;
import yz0.a;
import yz0.b;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B'\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0019\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0017¢\u0006\u0004\b\u000e\u0010\u000fR$\u0010\u0017\u001a\u0004\u0018\u00010\u00108\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016¨\u0006\u0018"}, d2 = {"Lcom/revolut/uicomponent/text/masked/MaskedEditText;", "Lcom/revolut/uicomponent/widgets/material_edit_text/TypefaceMaterialEditText;", "Lyz0/a;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attributeSet", "", "defStyle", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Landroid/view/View$OnFocusChangeListener;", "l", "", "setOnFocusChangeListener", "(Landroid/view/View$OnFocusChangeListener;)V", "Lyz0/b;", "A0", "Lyz0/b;", "getMaskingDelegate", "()Lyz0/b;", "setMaskingDelegate", "(Lyz0/b;)V", "maskingDelegate", "core_ui_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@d
public final class MaskedEditText extends TypefaceMaterialEditText implements a {

    /* JADX INFO: renamed from: A0, reason: from kotlin metadata */
    public b maskingDelegate;
    public final ArrayList B0;
    public View.OnFocusChangeListener z0;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public MaskedEditText(@NotNull Context context) {
        this(context, null, 6, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    @Override // yz0.a
    public final void a(View.OnFocusChangeListener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.B0.add(listener);
    }

    @Override // yz0.a
    public final void b(View.OnFocusChangeListener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.B0.remove(listener);
    }

    public final b getMaskingDelegate() {
        return this.maskingDelegate;
    }

    @Override // android.widget.TextView
    public final boolean isSuggestionsEnabled() {
        return false;
    }

    @Override // android.widget.TextView
    public final void onSelectionChanged(int i, int i2) {
        super.onSelectionChanged(i, i2);
        b bVar = this.maskingDelegate;
        if (bVar == null || !bVar.d()) {
            return;
        }
        Editable text = getText();
        int length = text != null ? text.length() : 0;
        int iF = bVar.f();
        if (iF >= 0 && iF <= length) {
            setSelection(bVar.f());
            return;
        }
        Editable text2 = getText();
        setSelection(text2 != null ? text2.length() : 0);
        e.f145194a.e(new IllegalStateException("Wrong selection position!"));
    }

    public final void setMaskingDelegate(b bVar) {
        this.maskingDelegate = bVar;
    }

    @Override // fzl.f, android.view.View
    @d
    public void setOnFocusChangeListener(View.OnFocusChangeListener l2) {
        View.OnFocusChangeListener onFocusChangeListener = this.z0;
        if (onFocusChangeListener != null) {
            b(onFocusChangeListener);
        }
        this.z0 = l2;
        if (l2 != null) {
            a(l2);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public MaskedEditText(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MaskedEditText(@NotNull Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        m4 m4Var = new m4(this, 2);
        this.B0 = new ArrayList();
        super.setOnFocusChangeListener(m4Var);
    }

    public /* synthetic */ MaskedEditText(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i & 2) != 0 ? null : attributeSet, R$attr.editTextStyle);
    }
}
