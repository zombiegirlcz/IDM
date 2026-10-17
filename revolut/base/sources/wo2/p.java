package wo2;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.tf;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import ip0.j50;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import wnc.x;

/* JADX INFO: loaded from: classes21.dex */
public final class p implements cli.n {

    @NotNull
    public static final n Companion = new n();

    public static RowDelegate.Model a(int i, int i2, String str) {
        return new RowDelegate.Model(str, new RowDelegate.Model.MainImage.Image24(new ResourceImage(i2, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorAccent), (List) null, (ImageTransformations) null, (Clause) null, 246), false, false, 6), new TextLocalisedClause(i, null, null, 14), null, 0, null, null, null, 0, new tf(6, new ResourceImage(R$drawable.uikit_icn_24_chevron_right, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), false), false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536869880);
    }

    public static j50 b(yo2.i iVar) {
        int i = o.f298877b[iVar.d.ordinal()];
        if (i == 1) {
            return j50.PENDING;
        }
        if (i == 2) {
            return j50.NORMAL;
        }
        if (i == 3) {
            return j50.COMPLETED;
        }
        if (i == 4) {
            return j50.FAILED;
        }
        if (i == 5) {
            return j50.WARNING;
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // cli.n
    public final cli.o c(cli.j jVar) {
        g domainState = (g) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        return (i) iii.c.f(domainState.f298868b, new x(this, 4), new wm9.k(this, 7), new w2a.o(this, 20));
    }
}
