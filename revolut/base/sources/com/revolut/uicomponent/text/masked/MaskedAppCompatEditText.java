package com.revolut.uicomponent.text.masked;

import android.content.Context;
import android.text.Editable;
import android.util.AttributeSet;
import androidx.appcompat.R$attr;
import gom.e;
import gzl.c;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import yhm.d;
import yz0.b;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tR$\u0010\u0011\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010¨\u0006\u0012"}, d2 = {"Lcom/revolut/uicomponent/text/masked/MaskedAppCompatEditText;", "Lgzl/c;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attributeSet", "", "defStyle", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lyz0/b;", "f", "Lyz0/b;", "getMaskingDelegate", "()Lyz0/b;", "setMaskingDelegate", "(Lyz0/b;)V", "maskingDelegate", "core_ui_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@d
public final class MaskedAppCompatEditText extends c {

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public b maskingDelegate;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public MaskedAppCompatEditText(@NotNull Context context) {
        this(context, null, 6, 0);
        Intrinsics.checkNotNullParameter(context, "context");
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

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public MaskedAppCompatEditText(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MaskedAppCompatEditText(@NotNull Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ MaskedAppCompatEditText(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i & 2) != 0 ? null : attributeSet, R$attr.editTextStyle);
    }
}
