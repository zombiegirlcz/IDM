package kzb;

import aw0.m6;
import aw0.n6;
import aw0.o9;
import cli.n;
import cli.o;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.rev_points.api.R$string;
import com.revolut.feature.rev_points.api.navigation.RevPointsEarnOptionsScreenApi$InputData;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.Intrinsics;
import kye.l0;
import kye.m0;
import org.jetbrains.annotations.NotNull;
import zhm.h0;
import zhm.u;

/* JADX INFO: loaded from: classes6.dex */
public final class k implements n {

    @NotNull
    public static final i Companion = new i();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RevPointsEarnOptionsScreenApi$InputData f191094a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f01.c f191095b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ozb.e f191096c;

    public k(RevPointsEarnOptionsScreenApi$InputData inputData, f01.c uiKitResources, ozb.e disclaimerMapper) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(uiKitResources, "uiKitResources");
        Intrinsics.checkNotNullParameter(disclaimerMapper, "disclaimerMapper");
        this.f191094a = inputData;
        this.f191095b = uiKitResources;
        this.f191096c = disclaimerMapper;
    }

    public static n6 a(String str, String str2) {
        return m6.c(n6.Companion, new TextLocalisedClause(R$string.rev_points_earn_options_bottom_sheet_cta_primary, u.c(new TextClause(str, (Style) null, (Integer) null, false, (o9) null, (List) null, 126)), null, 12), LargeActionButton.ButtonStyle.f58725a, null, null, false, null, null, str2 != null ? new e(str2) : null, 508);
    }

    public final int b(String str) {
        int iA = this.f191095b.a(str);
        if (iA > 0) {
            return iA;
        }
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException(p.a.p("Icon ", str, " not found"));
        h0 h0Var = h0.f322473a;
        CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
        rd0.d.a(rd0.c.ERROR, null, null, illegalArgumentException, h0Var);
        return R$drawable.uikit_icn_24_revolut;
    }

    @Override // cli.n
    public final o c(cli.j jVar) {
        f domainState = (f) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        return (cii.b) iii.c.f(domainState.f191088a, new m0(18), new l0(7), new kcg.j(this, 19));
    }
}
