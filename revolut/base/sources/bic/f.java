package bic;

import aw0.o9;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.tf;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.rewards.api.model.concierge.Cell;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import yy0.l;

/* JADX INFO: loaded from: classes6.dex */
public final class f implements Function2 {

    @NotNull
    public static final d Companion = new d();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f01.a f15470a;

    public f(f01.a uiKitResources) {
        Intrinsics.checkNotNullParameter(uiKitResources, "uiKitResources");
        this.f15470a = uiKitResources;
    }

    @Override // kotlin.jvm.functions.Function2
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final RowDelegate.Model invoke(String listId, Cell cell) {
        TextClause textClause;
        tf tfVar;
        Integer numValueOf;
        Intrinsics.checkNotNullParameter(listId, "listId");
        Intrinsics.checkNotNullParameter(cell, "cell");
        String str = cell.f84773b;
        String str2 = cell.d;
        TextClause textClause2 = new TextClause(str, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
        Cell.Subtitle subtitle = cell.f84774c;
        if (subtitle != null) {
            String str3 = subtitle.f84775a;
            int i = e.f15469a[subtitle.f84776b.ordinal()];
            if (i == 1) {
                numValueOf = Integer.valueOf(R$attr.uikit_colorOrange);
            } else {
                if (i != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                numValueOf = null;
            }
            textClause = new TextClause(str3, (Style) new Custom(numValueOf, false, null, false, null, 254), (Integer) null, false, (o9) null, (List) null, 124);
        } else {
            textClause = null;
        }
        RowDelegate.Model.MainImage.Image24 image24 = new RowDelegate.Model.MainImage.Image24(new ResourceImage(this.f15470a.a(cell.f84772a), (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorForeground), (List) null, (ImageTransformations) null, (Clause) null, 246), false, false, 6);
        if (str2 != null) {
            yy0.i iVar = l.Companion;
            ResourceImage resourceImage = new ResourceImage(R$drawable.uikit_icn_16_chevron_right, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorGreyTone50), (List) null, (ImageTransformations) null, (Clause) null, 246);
            iVar.getClass();
            tfVar = new tf(yy0.i.a(resourceImage));
        } else {
            tfVar = null;
        }
        return new RowDelegate.Model(listId, image24, textClause2, null, 0, textClause, null, null, 0, tfVar, str2 != null, null, false, null, null, null, null, null, null, str2 != null ? new c(str2) : null, null, 0, 0, 0, 0, 532673496);
    }
}
