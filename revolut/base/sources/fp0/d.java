package fp0;

import android.content.Context;
import android.content.res.ColorStateList;
import androidx.core.graphics.ColorUtils;
import com.revolut.core.ui.models.Color;
import com.revolut.core.ui_kit_resources.R$attr;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
public final class d implements i {

    @NotNull
    private static final c Companion = new c();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Color f137018a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Color f137019b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f137020c;

    public d(Color contentColor, Color backgroundColor, boolean z) {
        Intrinsics.checkNotNullParameter(contentColor, "contentColor");
        Intrinsics.checkNotNullParameter(backgroundColor, "backgroundColor");
        this.f137018a = contentColor;
        this.f137019b = backgroundColor;
        this.f137020c = z;
    }

    @Override // fp0.k
    public final boolean b() {
        return this.f137020c;
    }

    @Override // fp0.i
    public final ColorStateList c(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        int iC = io0.a.c(context, this.f137018a);
        int iC2 = io0.a.c(context, this.f137019b);
        ColorStateList colorStateListValueOf = ColorStateList.valueOf(io0.a.d(android.graphics.Color.alpha(iC2) >= 255 ? (float) ((((double) 0.10000001f) * kotlin.ranges.f.e((4.5d - ColorUtils.calculateContrast(iC, android.graphics.Color.alpha(iC2) == 255 ? iC2 : ColorUtils.compositeColors(iC2, io0.a.c(context, new Color.Solid(R$attr.uikit_colorBackground))))) / 3.5d, 0.0d, 1.0d)) + ((double) 0.2f)) : 0.2f, iC));
        Intrinsics.checkNotNullExpressionValue(colorStateListValueOf, "valueOf(...)");
        return colorStateListValueOf;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.f137018a, dVar.f137018a) && Intrinsics.f(this.f137019b, dVar.f137019b) && this.f137020c == dVar.f137020c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f137020c) + ehe.n.d(this.f137019b, this.f137018a.hashCode() * 31, 31);
    }
}
