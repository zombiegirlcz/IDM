package mzd;

import aw0.o9;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.SelectableDelegate;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit_core.displayers.image.models.GlyphImage;
import com.revolut.feature.statements.api.models.SelectableOption;
import ip0.qd0;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class d {

    @NotNull
    public static final c Companion = new c();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f01.c f210759a;

    public d(f01.c uiKitResources) {
        Intrinsics.checkNotNullParameter(uiKitResources, "uiKitResources");
        this.f210759a = uiKitResources;
    }

    public final SelectableDelegate.Model a(String str, String str2, SelectableOption selectableOption, boolean z) {
        String strR = a0.d.r(str, selectableOption.getType());
        String strR2 = a0.d.r(str2, selectableOption.getType());
        TextClause textClause = new TextClause(selectableOption.getName(), (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
        String icon = selectableOption.getIcon();
        Integer numValueOf = icon != null ? Integer.valueOf(this.f210759a.a(icon)) : null;
        if (numValueOf != null && numValueOf.intValue() == 0) {
            numValueOf = null;
        }
        return new SelectableDelegate.Model(strR, new RowDelegate.Model(strR2, numValueOf != null ? new RowDelegate.Model.MainImage.Image40(new GlyphImage(numValueOf.intValue(), null, null, 6), null, null, false, null, false, 60) : null, textClause, null, 0, null, null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536870904), z ? qd0.SELECTED : qd0.UNSELECTED, null, null, false, null, null, null, false, 32760);
    }
}
