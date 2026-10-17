package com.revolut.core.ui_kit.views;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.revolut.core.ui_kit.R$drawable;
import com.revolut.core.ui_kit.R$id;
import com.revolut.core.ui_kit.R$layout;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import mx0.j7;
import mx0.qb;
import mx0.rb;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0001\bB\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\n2\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000f\u0010\u0010R\u001b\u0010\u0016\u001a\u00020\u00118BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001b\u0010\u001b\u001a\u00020\u00178BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0018\u0010\u0013\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001c"}, d2 = {"Lcom/revolut/core/ui_kit/views/ScanView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attributeSet", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "Lmx0/qb;", "state", "", "setState", "(Lmx0/qb;)V", "Lmx0/j7;", "content", "setHelperContent", "(Lmx0/j7;)V", "Landroid/widget/ImageView;", "b", "Le8/q;", "getImage", "()Landroid/widget/ImageView;", "image", "Lcom/revolut/core/ui_kit/views/HelperTextView;", "f", "getHelperText", "()Lcom/revolut/core/ui_kit/views/HelperTextView;", "helperText", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class ScanView extends ConstraintLayout {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public final e8.q image;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public final e8.q helperText;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScanView(@NotNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        this.image = kli.a.J(R$id.scanView_image, this);
        this.helperText = kli.a.J(R$id.scanView_helperText, this);
        View.inflate(context, R$layout.internal_scan_view, this);
    }

    private final HelperTextView getHelperText() {
        return (HelperTextView) this.helperText.f();
    }

    private final ImageView getImage() {
        return (ImageView) this.image.f();
    }

    public final void setHelperContent(j7 content) {
        getHelperText().setVisibility(8);
    }

    public final void setState(@NotNull qb state) {
        int i;
        Intrinsics.checkNotNullParameter(state, "state");
        int i2 = rb.f209978a[state.ordinal()];
        if (i2 == 1) {
            i = R$drawable.internal_scan_detecting;
        } else if (i2 == 2) {
            i = R$drawable.internal_scan_success;
        } else {
            if (i2 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            i = R$drawable.internal_scan_error;
        }
        getImage().setImageResource(i);
    }
}
