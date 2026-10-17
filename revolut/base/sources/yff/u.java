package yff;

import com.revolut.data.model.Data;
import com.revolut.feature.transaction.troubleshooter.impl.ui.flow.screen.list.TroubleshooterListScreenContract$InputData;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import y7k.g0;
import yff.h;

/* JADX INFO: loaded from: classes8.dex */
public final class u extends jki.g implements j {

    @NotNull
    public static final n Companion = new n();

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final TroubleshooterListScreenContract$InputData f313358p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final pff.a f313359q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final bef.b f313360r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final j60.a f313361s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final f80.a f313362t;
    public final mde.e u;
    public final lde.n v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final uig.a f313363w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final mde.e f313364x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final g f313365y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(jki.p stateMapper, TroubleshooterListScreenContract$InputData input, pff.a transactionTroubleshooterInteractor, bef.b transactionItemProvider, j60.a bottomExpandableDialogControllerExtension, f80.a uriHelper, mde.e sharedHelpDestinationProvider, lde.n sharedHelpWidgetsInteractor, uig.a troubleshooterFeatureToggleProvider, mde.e helpDestinationProvider) {
        super(stateMapper);
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(input, "input");
        Intrinsics.checkNotNullParameter(transactionTroubleshooterInteractor, "transactionTroubleshooterInteractor");
        Intrinsics.checkNotNullParameter(transactionItemProvider, "transactionItemProvider");
        Intrinsics.checkNotNullParameter(bottomExpandableDialogControllerExtension, "bottomExpandableDialogControllerExtension");
        Intrinsics.checkNotNullParameter(uriHelper, "uriHelper");
        Intrinsics.checkNotNullParameter(sharedHelpDestinationProvider, "sharedHelpDestinationProvider");
        Intrinsics.checkNotNullParameter(sharedHelpWidgetsInteractor, "sharedHelpWidgetsInteractor");
        Intrinsics.checkNotNullParameter(troubleshooterFeatureToggleProvider, "troubleshooterFeatureToggleProvider");
        Intrinsics.checkNotNullParameter(helpDestinationProvider, "helpDestinationProvider");
        this.f313358p = input;
        this.f313359q = transactionTroubleshooterInteractor;
        this.f313360r = transactionItemProvider;
        this.f313361s = bottomExpandableDialogControllerExtension;
        this.f313362t = uriHelper;
        this.u = sharedHelpDestinationProvider;
        this.v = sharedHelpWidgetsInteractor;
        this.f313363w = troubleshooterFeatureToggleProvider;
        this.f313364x = helpDestinationProvider;
        String str = input.f91892a;
        String str2 = input.f91894c;
        Data data = new Data(null, null, true, 3, null);
        boolean z = input.f;
        this.f313365y = new g(str, str2, data, new k(null, null), l7d.a.d(4, input.f91892a, input.f91894c), z);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object y2(yff.u r4, kotlin.jvm.functions.Function1 r5, gim.c r6) {
        /*
            boolean r0 = r6 instanceof yff.s
            if (r0 == 0) goto L13
            r0 = r6
            yff.s r0 = (yff.s) r0
            int r1 = r0.f313356w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f313356w = r1
            goto L18
        L13:
            yff.s r0 = new yff.s
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r4 = r0.u
            fim.a r6 = fim.a.COROUTINE_SUSPENDED
            int r1 = r0.f313356w
            r2 = 1
            if (r1 == 0) goto L2f
            if (r1 != r2) goto L27
            yhm.o.b(r4)     // Catch: java.lang.Exception -> L3e
            goto L3b
        L27:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L2f:
            yhm.o.b(r4)
            r0.f313356w = r2     // Catch: java.lang.Exception -> L3e
            java.lang.Object r4 = r5.invoke(r0)     // Catch: java.lang.Exception -> L3e
            if (r4 != r6) goto L3b
            return r6
        L3b:
            od0.i r4 = (od0.i) r4     // Catch: java.lang.Exception -> L3e
            return r4
        L3e:
            r4 = move-exception
            zhm.h0 r5 = zhm.h0.f322473a
            java.util.concurrent.CopyOnWriteArrayList r6 = rd0.d.f253311a
            rd0.c r6 = rd0.c.ERROR
            r0 = 0
            rd0.d.a(r6, r0, r0, r4, r5)
            od0.h r4 = od0.i.Companion
            r4.getClass()
            od0.i r4 = od0.i.f224256b
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: yff.u.y2(yff.u, kotlin.jvm.functions.Function1, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object z2(yff.u r4, gim.c r5) {
        /*
            boolean r0 = r5 instanceof yff.t
            if (r0 == 0) goto L13
            r0 = r5
            yff.t r0 = (yff.t) r0
            int r1 = r0.f313357w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f313357w = r1
            goto L18
        L13:
            yff.t r0 = new yff.t
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f313357w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r5)
            goto L3d
        L27:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L2f:
            yhm.o.b(r5)
            r0.f313357w = r3
            r2 = 1
            java.lang.Object r5 = skm.k0.b(r2, r0)
            if (r5 != r1) goto L3d
            return r1
        L3d:
            jki.i r5 = r4.t2()
            yff.g r5 = (yff.g) r5
            com.revolut.data.model.Data r5 = r5.f313339c
            java.lang.Object r5 = r5.getContent()
            java.util.List r5 = (java.util.List) r5
            if (r5 == 0) goto L70
            java.lang.Iterable r5 = (java.lang.Iterable) r5
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = 10
            int r1 = zhm.w.t(r5, r1)
            r0.<init>(r1)
            java.util.Iterator r5 = r5.iterator()
        L5e:
            boolean r1 = r5.hasNext()
            if (r1 == 0) goto L71
            java.lang.Object r1 = r5.next()
            com.revolut.feature.transaction.troubleshooter.api.domain.models.Troubleshooter r1 = (com.revolut.feature.transaction.troubleshooter.api.domain.models.Troubleshooter) r1
            java.lang.String r1 = r1.f91842c
            r0.add(r1)
            goto L5e
        L70:
            r0 = 0
        L71:
            y7k.g0 r5 = new y7k.g0
            r1 = 23
            r5.<init>(r4, r0, r1)
            r4.x2(r5)
            kotlin.Unit r4 = kotlin.Unit.f186387a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: yff.u.z2(yff.u, gim.c):java.lang.Object");
    }

    public final void A2() {
        TroubleshooterListScreenContract$InputData troubleshooterListScreenContract$InputData = this.f313358p;
        yji.l.a1(this, this.f313359q.a(troubleshooterListScreenContract$InputData.f91892a, troubleshooterListScreenContract$InputData.f91893b, this.v.c(), w4l.i.f294643c), null, null, new q(this, null), 3);
    }

    @Override // yji.l
    public final void I1() {
        A2();
    }

    @Override // yji.l
    public final void T1(long j2) {
        v2(h.b.f313341a);
        if (j2 > 0) {
            Continuation continuation = null;
            x2(new g0(this, continuation, 23));
            n2(new p(this, continuation, 4), new whi.b(6));
        }
    }

    @Override // jki.g
    public final jki.i r2() {
        return this.f313365y;
    }
}
