package androidx.compose.material3;

import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.material3.internal.TextFieldImplKt;
import androidx.compose.ui.unit.Dp;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0014\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J7\u0010\f\u001a\u00020\t2\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\n\u0010\u000bR\u0017\u0010\r\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0011\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u000e\u001a\u0004\b\u0012\u0010\u0010R\u0017\u0010\u0013\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u000e\u001a\u0004\b\u0014\u0010\u0010R\u0017\u0010\u0015\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u000e\u001a\u0004\b\u0016\u0010\u0010R \u0010\u0017\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0017\u0010\u000e\u0012\u0004\b\u0019\u0010\u0003\u001a\u0004\b\u0018\u0010\u0010R \u0010\u001a\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001a\u0010\u000e\u0012\u0004\b\u001c\u0010\u0003\u001a\u0004\b\u001b\u0010\u0010¨\u0006\u001d"}, d2 = {"Landroidx/compose/material3/TextFieldDefaults;", "", "<init>", "()V", "Landroidx/compose/ui/unit/Dp;", "start", "top", "end", "bottom", "Landroidx/compose/foundation/layout/PaddingValues;", "supportingTextPadding-a9UjIt4$material3", "(FFFF)Landroidx/compose/foundation/layout/PaddingValues;", "supportingTextPadding", "MinHeight", "F", "getMinHeight-D9Ej5fM", "()F", "MinWidth", "getMinWidth-D9Ej5fM", "UnfocusedIndicatorThickness", "getUnfocusedIndicatorThickness-D9Ej5fM", "FocusedIndicatorThickness", "getFocusedIndicatorThickness-D9Ej5fM", "UnfocusedBorderThickness", "getUnfocusedBorderThickness-D9Ej5fM", "getUnfocusedBorderThickness-D9Ej5fM$annotations", "FocusedBorderThickness", "getFocusedBorderThickness-D9Ej5fM", "getFocusedBorderThickness-D9Ej5fM$annotations", "material3"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class TextFieldDefaults {
    private static final float FocusedBorderThickness;
    private static final float FocusedIndicatorThickness;

    @NotNull
    public static final TextFieldDefaults INSTANCE = new TextFieldDefaults();
    private static final float MinHeight = Dp.m3297constructorimpl(56);
    private static final float MinWidth = Dp.m3297constructorimpl(280);
    private static final float UnfocusedBorderThickness;
    private static final float UnfocusedIndicatorThickness;

    static {
        float fM3297constructorimpl = Dp.m3297constructorimpl(1);
        UnfocusedIndicatorThickness = fM3297constructorimpl;
        float fM3297constructorimpl2 = Dp.m3297constructorimpl(2);
        FocusedIndicatorThickness = fM3297constructorimpl2;
        UnfocusedBorderThickness = fM3297constructorimpl;
        FocusedBorderThickness = fM3297constructorimpl2;
    }

    private TextFieldDefaults() {
    }

    /* JADX INFO: renamed from: supportingTextPadding-a9UjIt4$material3$default, reason: not valid java name */
    public static /* synthetic */ PaddingValues m1415supportingTextPaddinga9UjIt4$material3$default(TextFieldDefaults textFieldDefaults, float f, float f4, float f5, float f6, int i, Object obj2) {
        if ((i & 1) != 0) {
            f = TextFieldImplKt.getTextFieldPadding();
        }
        if ((i & 2) != 0) {
            f4 = TextFieldImplKt.getSupportingTopPadding();
        }
        if ((i & 4) != 0) {
            f5 = TextFieldImplKt.getTextFieldPadding();
        }
        if ((i & 8) != 0) {
            f6 = Dp.m3297constructorimpl(0);
        }
        return textFieldDefaults.m1416supportingTextPaddinga9UjIt4$material3(f, f4, f5, f6);
    }

    @NotNull
    /* JADX INFO: renamed from: supportingTextPadding-a9UjIt4$material3, reason: not valid java name */
    public final PaddingValues m1416supportingTextPaddinga9UjIt4$material3(float start, float top, float end2, float bottom) {
        return PaddingKt.m860PaddingValuesa9UjIt4(start, top, end2, bottom);
    }
}
