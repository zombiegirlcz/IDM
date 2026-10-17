package k1c;

import com.revolut.core.ui_kit.delegates.widgets.BaseDraggableWidgetDelegate;
import com.revolut.feature.rev_points.api.navigation.RevPointsFlowDestination;
import com.revolut.feature.rev_points.api.widget.rim.RevPointsRimWidgetContext;
import com.revolut.feature.widgets.api.dependencies.WidgetContext;
import ish.a0;
import kotlin.jvm.internal.Intrinsics;
import nyb.k;
import pfm.h;
import q06.l;
import zh9.u0;

/* JADX INFO: loaded from: classes6.dex */
public final class d extends csh.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final fub.a f180209b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final k f180210c;
    public final a0 d;
    public final ash.d e;
    public final l f;

    public d(fub.a challengeClaimDialogMapper, k revPointsInteractor, a0 widgetsUiInteractor, ash.d widgetsCommonEventDispatcher, l deeplinkRouter) {
        Intrinsics.checkNotNullParameter(challengeClaimDialogMapper, "challengeClaimDialogMapper");
        Intrinsics.checkNotNullParameter(revPointsInteractor, "revPointsInteractor");
        Intrinsics.checkNotNullParameter(widgetsUiInteractor, "widgetsUiInteractor");
        Intrinsics.checkNotNullParameter(widgetsCommonEventDispatcher, "widgetsCommonEventDispatcher");
        Intrinsics.checkNotNullParameter(deeplinkRouter, "deeplinkRouter");
        this.f180209b = challengeClaimDialogMapper;
        this.f180210c = revPointsInteractor;
        this.d = widgetsUiInteractor;
        this.e = widgetsCommonEventDispatcher;
        this.f = deeplinkRouter;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r5v0, types: [csh.a, k1c.d] */
    /* JADX WARN: Type inference failed for: r5v1, types: [csh.a] */
    /* JADX WARN: Type inference failed for: r5v5, types: [ash.f] */
    /* JADX WARN: Type inference failed for: r7v0, types: [inh.g] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object e(k1c.d r5, java.lang.String r6, inh.g r7, gim.c r8) {
        /*
            boolean r0 = r8 instanceof k1c.c
            if (r0 == 0) goto L13
            r0 = r8
            k1c.c r0 = (k1c.c) r0
            int r1 = r0.f180208w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f180208w = r1
            goto L18
        L13:
            k1c.c r0 = new k1c.c
            r0.<init>(r5, r8)
        L18:
            java.lang.Object r8 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f180208w
            java.lang.String r3 = "Required value was null."
            r4 = 1
            if (r2 == 0) goto L33
            if (r2 != r4) goto L2b
            yhm.o.b(r8)     // Catch: java.lang.Throwable -> L29
            goto L47
        L29:
            r6 = move-exception
            goto L57
        L2b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L33:
            yhm.o.b(r8)
            lii.c r8 = new lii.c     // Catch: java.lang.Throwable -> L29
            r8.<init>(r6)     // Catch: java.lang.Throwable -> L29
            r5.c(r8)     // Catch: java.lang.Throwable -> L29
            r0.f180208w = r4     // Catch: java.lang.Throwable -> L29
            java.lang.Object r8 = r7.invoke(r0)     // Catch: java.lang.Throwable -> L29
            if (r8 != r1) goto L47
            return r1
        L47:
            ash.f r5 = r5.f108469a
            if (r5 == 0) goto L51
            nsh.o r5 = (nsh.o) r5
            r5.t2()
            return r8
        L51:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            r5.<init>(r3)
            throw r5
        L57:
            ash.f r5 = r5.f108469a
            if (r5 == 0) goto L61
            nsh.o r5 = (nsh.o) r5
            r5.t2()
            throw r6
        L61:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            r5.<init>(r3)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: k1c.d.e(k1c.d, java.lang.String, inh.g, gim.c):java.lang.Object");
    }

    public final void f(String str) {
        this.e.a(u0.b(vhi.c.c(new RevPointsFlowDestination(new RevPointsFlowDestination.StartType.OpenChallengeDetailsBottomSheet(str)), yhi.b.BOTTOM_DIALOG, null, false, 12)));
    }

    @Override // csh.f
    public final Class j() {
        return RevPointsRimWidgetContext.class;
    }

    @Override // csh.f
    public final efm.b w(WidgetContext widgetContext, BaseDraggableWidgetDelegate.a event) {
        RevPointsRimWidgetContext widgetContext2 = (RevPointsRimWidgetContext) widgetContext;
        Intrinsics.checkNotNullParameter(widgetContext2, "widgetContext");
        Intrinsics.checkNotNullParameter(event, "event");
        h hVar = new h(new a09.a0(event, 23, this, widgetContext2), 2);
        Intrinsics.checkNotNullExpressionValue(hVar, "fromAction(...)");
        return hVar;
    }
}
