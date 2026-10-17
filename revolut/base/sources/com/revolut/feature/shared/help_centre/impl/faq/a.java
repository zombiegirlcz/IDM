package com.revolut.feature.shared.help_centre.impl.faq;

import com.revolut.feature.mainscreen.api.navigation.MainScreenFeatureConfig;
import com.revolut.feature.shared.help_centre.impl.faq.FaqFlowContract$Step;
import com.revolut.kompot.bridge.navigation.BridgeDestination;
import com.revolut.retail.core.navigation.FeatureCommand;
import e9d.l;
import e9d.m;
import e9d.n;
import e9d.o;
import e9d.p;
import e9d.r;
import e9d.s;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.q;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class a extends q implements Function1 {
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        s p0 = (s) obj2;
        Intrinsics.checkNotNullParameter(p0, "p0");
        c cVar = (c) this.receiver;
        cVar.getClass();
        if (p0 instanceof e9d.q) {
            cVar.E2(new FaqFlowContract$Step.AllUpcomingTransactions(((e9d.q) p0).f123962a), true, null, false);
        } else if (p0 instanceof p) {
            p pVar = (p) p0;
            cVar.E2(new FaqFlowContract$Step.UpcomingTransactionTroubleshooter(pVar.f123960a, pVar.f123961b), true, null, false);
        } else if (p0 instanceof r) {
            cVar.E2(new FaqFlowContract$Step.SomethingElse(((r) p0).f123963a), true, null, false);
        } else if (p0 instanceof m) {
            cVar.E2(new FaqFlowContract$Step.FaqList.ByKey(((m) p0).f123957a, null), true, null, false);
        } else if (p0 instanceof l) {
            cVar.E2(new FaqFlowContract$Step.FaqArticle.ByNode(((l) p0).f123956a), true, null, false);
        } else if (p0 instanceof n) {
            cVar.E2(new FaqFlowContract$Step.FaqList.ByNode(((n) p0).f123958a, true), true, null, false);
        } else {
            if (!Intrinsics.f(p0, o.f123959a)) {
                throw new NoWhenBranchMatchedException();
            }
            cVar.u.getClass();
            cVar.C1(new BridgeDestination(new FeatureCommand(new MainScreenFeatureConfig.JustShow(s49.a.SINGLE_TOP))));
        }
        return Unit.f186387a;
    }
}
