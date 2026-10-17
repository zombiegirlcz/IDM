package fp0;

import android.content.Context;
import android.content.res.ColorStateList;
import com.revolut.core.ui.models.Color;
import com.revolut.core.ui_kit_resources.R$attr;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class b implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f137017a = new b();

    private b() {
    }

    @Override // fp0.k
    public final boolean a() {
        return false;
    }

    @Override // fp0.i
    public final ColorStateList c(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        ColorStateList colorStateListValueOf = ColorStateList.valueOf(io0.a.c(context, new Color.ModifiedColor(new Color.Solid(R$attr.uikit_colorForeground), 0.12f)));
        Intrinsics.checkNotNullExpressionValue(colorStateListValueOf, "valueOf(...)");
        return colorStateListValueOf;
    }

    public final boolean equals(Object obj2) {
        return this == obj2 || (obj2 instanceof b);
    }

    public final int hashCode() {
        return -447643905;
    }
}
