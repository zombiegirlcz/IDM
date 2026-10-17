package fp0;

import android.content.Context;
import android.content.res.ColorStateList;
import com.revolut.core.ui.models.Color;
import com.revolut.core.ui_kit_resources.R$attr;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class f implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final f f137022a = new f();

    private f() {
    }

    @Override // fp0.i
    public final ColorStateList c(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        ColorStateList colorStateListValueOf = ColorStateList.valueOf(io0.a.c(context, new Color.Solid(R$attr.uikit_colorSelectableItemBackground)));
        Intrinsics.checkNotNullExpressionValue(colorStateListValueOf, "valueOf(...)");
        return colorStateListValueOf;
    }
}
