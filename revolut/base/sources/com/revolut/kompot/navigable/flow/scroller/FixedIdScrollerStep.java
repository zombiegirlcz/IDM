package com.revolut.kompot.navigable.flow.scroller;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/kompot/navigable/flow/scroller/FixedIdScrollerStep;", "Lcom/revolut/kompot/navigable/flow/scroller/ScrollerFlowStep;", "<init>", "()V", "kompot_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class FixedIdScrollerStep implements ScrollerFlowStep {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f98432a;

    public FixedIdScrollerStep() {
        String name = getClass().getName();
        Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
        this.f98432a = name;
    }

    @Override // com.revolut.kompot.navigable.vc.pager.PagerItem
    /* JADX INFO: renamed from: getId, reason: from getter */
    public String getF98432a() {
        return this.f98432a;
    }
}
