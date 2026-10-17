package com.revolut.core.ui_kit.models.badge;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001\u0082\u0001\u0005\u0002\u0003\u0004\u0005\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/core/ui_kit/models/badge/PlanBadge;", "Lcom/revolut/core/ui_kit/models/badge/CircleBadgeModel;", "Lcom/revolut/core/ui_kit/models/badge/MetalPlanBadge;", "Lcom/revolut/core/ui_kit/models/badge/PlusPlanBadge;", "Lcom/revolut/core/ui_kit/models/badge/PremiumPlanBadge;", "Lcom/revolut/core/ui_kit/models/badge/PrivatePlanBadge;", "Lcom/revolut/core/ui_kit/models/badge/UltraPlanBadge;", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class PlanBadge implements CircleBadgeModel {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f58057a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f58058b;

    public PlanBadge(int i, int i2) {
        this.f58057a = i;
        this.f58058b = i2;
    }
}
