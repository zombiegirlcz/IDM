package xhc;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.rewards.impl.R$string;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.u;
import zsc.h;
import zsc.p;

/* JADX INFO: loaded from: classes6.dex */
public final class d {

    @NotNull
    public static final a Companion = new a();
    public static final h d = new h(new Pair(new b(), p.WORD_PREFIX));

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final kb8.a f305850a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final yik.h f305851b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final f01.c f305852c;

    public d(kb8.a iconMapper, yik.h pricingPlanStringMapper, f01.c uiKitResources) {
        Intrinsics.checkNotNullParameter(iconMapper, "iconMapper");
        Intrinsics.checkNotNullParameter(pricingPlanStringMapper, "pricingPlanStringMapper");
        Intrinsics.checkNotNullParameter(uiKitResources, "uiKitResources");
        this.f305850a = iconMapper;
        this.f305851b = pricingPlanStringMapper;
        this.f305852c = uiKitResources;
    }

    public final TextLocalisedClause a(hha.d dVar) {
        return dVar != null ? new TextLocalisedClause(R$string.subscriptions_global_search_section_title_with_plan, u.c(fgk.b.a(this.f305851b, dVar)), null, 12) : new TextLocalisedClause(R$string.subscriptions_global_search_section_title, null, null, 14);
    }
}
