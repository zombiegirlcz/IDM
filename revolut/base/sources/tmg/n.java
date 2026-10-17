package tmg;

import aw0.o9;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit_resources.R$attr;
import fmg.i0;
import fmg.j0;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
public final class n {

    @NotNull
    public static final m Companion = new m();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g f272220a;

    public n(l resourceProvider, g iconMapper) {
        Intrinsics.checkNotNullParameter(resourceProvider, "resourceProvider");
        Intrinsics.checkNotNullParameter(iconMapper, "iconMapper");
        this.f272220a = iconMapper;
    }

    public final TextClause a(i0 i0Var) {
        int i;
        String str = i0Var.f136430a;
        j0 color = i0Var.f136431b;
        Intrinsics.checkNotNullParameter(color, "color");
        switch (k.f272217a[color.ordinal()]) {
            case 1:
                i = R$attr.uikit_colorAccent;
                break;
            case 2:
                i = R$attr.uikit_colorForeground;
                break;
            case 3:
                i = R$attr.uikit_colorGrey50;
                break;
            case 4:
                i = R$attr.uikit_colorGrey20;
                break;
            case 5:
                i = R$attr.uikit_colorGrey20;
                break;
            case 6:
                i = R$attr.uikit_colorPink;
                break;
            case 7:
                i = R$attr.uikit_colorOrange;
                break;
            case 8:
                i = R$attr.uikit_colorWhite;
                break;
            case 9:
                i = R$attr.uikit_colorRed;
                break;
            case 10:
                i = R$attr.uikit_colorBlack;
                break;
            case 11:
                i = R$attr.uikit_colorGreen;
                break;
            case 12:
                i = R$attr.uikit_colorPerformancePositive;
                break;
            case 13:
                i = R$attr.uikit_colorPerformanceNegative;
                break;
            default:
                throw new NoWhenBranchMatchedException();
        }
        return new TextClause(str, (Style) new Custom(Integer.valueOf(i), false, null, false, null, 254), (Integer) null, false, (o9) null, (List) null, 124);
    }
}
