package fp0;

import android.content.Context;
import android.content.res.ColorStateList;
import com.revolut.core.ui.models.Color;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class g implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Color.Solid f137023a;

    public g(Color.Solid contentColor) {
        Intrinsics.checkNotNullParameter(contentColor, "contentColor");
        this.f137023a = contentColor;
    }

    @Override // fp0.i
    public final ColorStateList c(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        ColorStateList colorStateListValueOf = ColorStateList.valueOf(io0.a.d(0.3f, io0.a.c(context, this.f137023a)));
        Intrinsics.checkNotNullExpressionValue(colorStateListValueOf, "valueOf(...)");
        return colorStateListValueOf;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof g) && this.f137023a.equals(((g) obj2).f137023a);
    }

    public final int hashCode() {
        return Integer.hashCode(this.f137023a.f51464b);
    }
}
