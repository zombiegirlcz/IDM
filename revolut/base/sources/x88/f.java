package x88;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.tf;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import ij8.h;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import tnb.g0;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes4.dex */
public final class f implements c {

    @NotNull
    public static final d Companion = new d();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final List f303305b = v.k(h.ACTIVE, h.DISABLED);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g0 f303306a;

    public f(g0 savingsEntryPointsContentProvider) {
        Intrinsics.checkNotNullParameter(savingsEntryPointsContentProvider, "savingsEntryPointsContentProvider");
        this.f303306a = savingsEntryPointsContentProvider;
    }

    public static RowDelegate.Model.c a(int i, dj0.d dVar, boolean z) {
        return (dVar == null || z) ? new tf(6, new ResourceImage(R$drawable.uikit_icn_24_chevron_right, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorGreyTone20), (List) null, (ImageTransformations) null, (Clause) null, 246), false) : new RowDelegate.Model.c.b(new TextLocalisedClause(i, u.c(new MoneyClause(dVar, new MoneyClause.Format.Headers(null, null, null, false, false, 31), null, null, 12)), null, 12), null, null, false, 126);
    }

    public static LayeredImage c(y88.d dVar) {
        if (dVar instanceof y88.a) {
            return LayeredImage.Companion.b(LayeredImage.INSTANCE, R$drawable.uikit_icn_24_coins, Integer.valueOf(R$attr.uikit_colorWhite), R$attr.uikit_colorBlue, 8.0f, null, null, 48);
        }
        if (dVar instanceof y88.c) {
            return nib.a.a();
        }
        if (!(dVar instanceof y88.b)) {
            throw new NoWhenBranchMatchedException();
        }
        return LayeredImage.Companion.b(LayeredImage.INSTANCE, R$drawable.uikit_icn_24_invest, Integer.valueOf(R$attr.uikit_colorWhite), R$attr.uikit_colorLightBlue, 8.0f, null, null, 48);
    }

    /* JADX WARN: Removed duplicated region for block: B:54:0x01cc  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01dc  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01e4  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01ee  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.revolut.core.ui_kit.delegates.widgets.BaseDraggableWidgetDelegate.Model b(java.lang.String r51, sf8.m r52, java.util.List r53, java.lang.String r54) {
        /*
            Method dump skipped, instruction units count: 884
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: x88.f.b(java.lang.String, sf8.m, java.util.List, java.lang.String):com.revolut.core.ui_kit.delegates.widgets.BaseDraggableWidgetDelegate$Model");
    }
}
