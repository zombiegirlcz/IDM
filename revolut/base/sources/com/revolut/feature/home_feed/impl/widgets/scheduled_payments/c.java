package com.revolut.feature.home_feed.impl.widgets.scheduled_payments;

import c1g.o;
import com.revolut.core.model.account.AccountId;
import com.revolut.core.ui_kit.delegates.widgets.BaseDraggableWidgetDelegate;
import com.revolut.feature.widgets.api.dependencies.WidgetContext;
import csh.f;
import efm.d0;
import g48.r0;
import hc7.d;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import n38.q;
import rd0.e;
import skm.p0;
import w4l.j;

/* JADX INFO: loaded from: classes21.dex */
public final class c implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k39.b f74739a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d f74740b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final r0 f74741c;

    public c(k39.b navigationCommandsDispatcher, d naviCommandsProvider, r0 jointInteractor) {
        Intrinsics.checkNotNullParameter(navigationCommandsDispatcher, "navigationCommandsDispatcher");
        Intrinsics.checkNotNullParameter(naviCommandsProvider, "naviCommandsProvider");
        Intrinsics.checkNotNullParameter(jointInteractor, "jointInteractor");
        this.f74739a = navigationCommandsDispatcher;
        this.f74740b = naviCommandsProvider;
        this.f74741c = jointInteractor;
    }

    @Override // csh.f
    public final Class j() {
        return ScheduledPaymentsWidgetContext.class;
    }

    @Override // csh.f
    public final efm.b w(WidgetContext widgetContext, BaseDraggableWidgetDelegate.a event) {
        Object objFirstOrError;
        ScheduledPaymentsWidgetContext widgetContext2 = (ScheduledPaymentsWidgetContext) widgetContext;
        Intrinsics.checkNotNullParameter(widgetContext2, "widgetContext");
        Intrinsics.checkNotNullParameter(event, "event");
        int i = cd7.d.f23206a[widgetContext2.getAccountType().ordinal()];
        if (i == 1) {
            q[] elements = {q.ACTIVE, q.OFFBOARDING, q.PENDING};
            Intrinsics.checkNotNullParameter(elements, "elements");
            objFirstOrError = e.c(mo3.a.g(nim.a.v(this.f74741c.e(kotlin.collections.d.y0(elements), j.f294644c), new ccg.c(8)), null, new ccg.a(6), 1), p0.f264003c).firstOrError();
            Intrinsics.checkNotNullExpressionValue(objFirstOrError, "firstOrError(...)");
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            objFirstOrError = d0.m(AccountId.Personal.f51414a);
            Intrinsics.checkNotNullExpressionValue(objFirstOrError, "just(...)");
        }
        cd0.c cVar = new cd0.c(new o(event, 11, this, widgetContext2), 6);
        objFirstOrError.getClass();
        pfm.a aVar = new pfm.a(objFirstOrError, cVar, 4);
        Intrinsics.checkNotNullExpressionValue(aVar, "flatMapCompletable(...)");
        return aVar;
    }
}
