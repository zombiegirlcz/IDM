package qoc;

import android.os.Parcelable;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.retail.wealth.resources.R$string;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class s0 implements jlc.o {

    @NotNull
    public static final i0 Companion = new i0();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f248145h = R$attr.uikit_colorTeal;
    public static final int i = R$attr.uikit_colorPerformancePositive;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final int f248146j = R$attr.uikit_colorStatusWarning;
    public static final int k = R$attr.uikit_colorBlue;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f248147a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final n0 f248148b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final soc.e f248149c;
    public final soc.h d;
    public final f0 e;
    public final roc.c f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final gah.g f248150g;

    public s0(b goalResultWidgetMapper, n0 projectionChartMapper, soc.e disclaimerMapper, soc.h slidersMapper, f0 actionButtonMapper, j0 inputValidationConfig, woc.s sliderConfigProvider, roc.c goalStatusMapper, gah.g remoteDisclaimersMapper) {
        Intrinsics.checkNotNullParameter(goalResultWidgetMapper, "goalResultWidgetMapper");
        Intrinsics.checkNotNullParameter(projectionChartMapper, "projectionChartMapper");
        Intrinsics.checkNotNullParameter(disclaimerMapper, "disclaimerMapper");
        Intrinsics.checkNotNullParameter(slidersMapper, "slidersMapper");
        Intrinsics.checkNotNullParameter(actionButtonMapper, "actionButtonMapper");
        Intrinsics.checkNotNullParameter(inputValidationConfig, "inputValidationConfig");
        Intrinsics.checkNotNullParameter(sliderConfigProvider, "sliderConfigProvider");
        Intrinsics.checkNotNullParameter(goalStatusMapper, "goalStatusMapper");
        Intrinsics.checkNotNullParameter(remoteDisclaimersMapper, "remoteDisclaimersMapper");
        this.f248147a = goalResultWidgetMapper;
        this.f248148b = projectionChartMapper;
        this.f248149c = disclaimerMapper;
        this.d = slidersMapper;
        this.e = actionButtonMapper;
        this.f = goalStatusMapper;
        this.f248150g = remoteDisclaimersMapper;
    }

    public static ListSubheaderDelegate.Model c() {
        return new ListSubheaderDelegate.Model("strategies_template_overview_projection_subheader", (Image) null, (Clause) new TextLocalisedClause(R$string.wealth_robo_portfolio_projection_projected_value, null, null, 14), (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, 0, 0, 0, 0, 65530);
    }

    /* JADX WARN: Removed duplicated region for block: B:162:0x038c  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x038f  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0394  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x03ee  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x042b  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x0435  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0258  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List a(jlc.r r40) {
        /*
            Method dump skipped, instruction units count: 1104
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: qoc.s0.a(jlc.r):java.util.List");
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00da  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.ArrayList b(jlc.r r11) {
        /*
            Method dump skipped, instruction units count: 282
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: qoc.s0.b(jlc.r):java.util.ArrayList");
    }
}
