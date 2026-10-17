package wz1;

import c12.o0;
import com.revolut.core.ui_kit.delegates.ActionWidgetDelegate;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.t;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.apm.core.api.R$string;
import com.revolut.feature.apm.core.ui.api.navigation.ApmTopupRequestNavigation$Destination;
import com.revolut.feature.apm.core.ui.api.navigation.ApmTopupRequestNavigation$InputData;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import rp0.d0;
import rp0.d2;
import vkm.q;
import vkm.v1;
import zhm.h0;
import zhm.v;

/* JADX INFO: loaded from: classes20.dex */
public final class k implements gx1.i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f f301351a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c f301352b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final gx1.e f301353c;
    public final uw1.c d;
    public final eli.j e;

    public k(f apmTopupRequestsRepository, c pendingActionsMapper, gx1.e apmTopupRequestMapper, uw1.c apmFeatureChecker, eli.j twoFaErrorHandler) {
        Intrinsics.checkNotNullParameter(apmTopupRequestsRepository, "apmTopupRequestsRepository");
        Intrinsics.checkNotNullParameter(pendingActionsMapper, "pendingActionsMapper");
        Intrinsics.checkNotNullParameter(apmTopupRequestMapper, "apmTopupRequestMapper");
        Intrinsics.checkNotNullParameter(apmFeatureChecker, "apmFeatureChecker");
        Intrinsics.checkNotNullParameter(twoFaErrorHandler, "twoFaErrorHandler");
        this.f301351a = apmTopupRequestsRepository;
        this.f301352b = pendingActionsMapper;
        this.f301353c = apmTopupRequestMapper;
        this.d = apmFeatureChecker;
        this.e = twoFaErrorHandler;
    }

    @Override // i49.c
    public final boolean a(t data) {
        Intrinsics.checkNotNullParameter(data, "data");
        return data.f54722b.f51596l instanceof p02.a;
    }

    @Override // i49.c
    public final Object e(Object obj2, j60.a aVar, Continuation continuation) {
        LargeActionButtonDelegate.Model model = obj2 instanceof LargeActionButtonDelegate.Model ? (LargeActionButtonDelegate.Model) obj2 : null;
        Object obj3 = model != null ? model.i : null;
        gx1.d dVar = obj3 instanceof gx1.d ? (gx1.d) obj3 : null;
        if (dVar == null) {
            IllegalStateException illegalStateException = new IllegalStateException(a0.d.m(obj2, "Unknown action: "));
            h0 h0Var = h0.f322473a;
            CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
            rd0.d.a(rd0.c.ERROR, null, null, illegalStateException, h0Var);
            return j49.c.f171322a;
        }
        if (dVar instanceof gx1.a) {
            p02.a aVar2 = ((gx1.a) dVar).f147611a;
            j60.a.v(aVar, false, null, 3);
            return new j49.b(new ApmTopupRequestNavigation$Destination(new ApmTopupRequestNavigation$InputData(aVar2.f231467a, o0.ACCEPT)));
        }
        if (dVar instanceof gx1.b) {
            return h(((gx1.b) dVar).f147612a, aVar, (gim.c) continuation);
        }
        if (!(dVar instanceof gx1.c)) {
            throw new NoWhenBranchMatchedException();
        }
        j60.a.v(aVar, false, null, 3);
        return j49.a.f171320a;
    }

    @Override // i49.c
    public final Flow f(j49.i params) {
        Intrinsics.checkNotNullParameter(params, "params");
        Continuation continuation = null;
        return q.Q(new v1(new wih.c(this, continuation, 17)), new w2a.q(continuation, this, 25));
    }

    @Override // i49.c
    public final Object g(t tVar, Continuation continuation) {
        Object obj2 = tVar.f54722b.f51596l;
        Intrinsics.i(obj2, "null cannot be cast to non-null type com.revolut.feature.apm.core.models.topup_requests.ApmTopupRequest");
        p02.a request = (p02.a) obj2;
        ActionWidgetDelegate.a aVar = tVar.f54721a;
        boolean z = aVar instanceof ActionWidgetDelegate.a.c;
        gx1.e eVar = this.f301353c;
        if (z) {
            a aVar2 = (a) eVar;
            aVar2.getClass();
            Intrinsics.checkNotNullParameter(request, "request");
            return new j49.d(d0.d(new TextLocalisedClause(R$string.apm_topup_request_receiving_dialog_accept_title, v.k(aVar2.a(request), aVar2.d(request)), null, 12), null, new d2("BOTTOM_DIALOG_BUTTON_ACCEPT_YES", new TextLocalisedClause(R$string.apm_topup_request_receiving_dialog_accept_action_yes, null, null, 14), new gx1.a(request), 56), new d2("BOTTOM_DIALOG_BUTTON_ACCEPT_NO", new TextLocalisedClause(R$string.apm_topup_request_receiving_dialog_accept_action_no, null, null, 14), new gx1.c(request), 56), null, 114));
        }
        if (aVar instanceof ActionWidgetDelegate.a.d) {
            a aVar3 = (a) eVar;
            aVar3.getClass();
            Intrinsics.checkNotNullParameter(request, "request");
            return new j49.d(d0.d(new TextLocalisedClause(R$string.apm_topup_request_receiving_dialog_decline_title, v.k(aVar3.a(request), aVar3.d(request)), null, 12), null, new d2("BOTTOM_DIALOG_BUTTON_DECLINE_YES", new TextLocalisedClause(R$string.apm_topup_request_receiving_dialog_decline_action_yes, null, null, 14), new gx1.b(request), 56), new d2("BOTTOM_DIALOG_BUTTON_DECLINE_NO", new TextLocalisedClause(R$string.apm_topup_request_receiving_dialog_decline_action_no, null, null, 14), new gx1.c(request), 56), null, 114));
        }
        if (aVar instanceof ActionWidgetDelegate.a.b) {
            return new j49.b(new ApmTopupRequestNavigation$Destination(new ApmTopupRequestNavigation$InputData(request.f231467a)));
        }
        if ((aVar instanceof com.revolut.core.ui_kit.delegates.h) || (aVar instanceof ActionWidgetDelegate.a.C0395a)) {
            return j49.c.f171322a;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object h(p02.a r6, j60.a r7, gim.c r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof wz1.g
            if (r0 == 0) goto L13
            r0 = r8
            wz1.g r0 = (wz1.g) r0
            int r1 = r0.f301347x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f301347x = r1
            goto L18
        L13:
            wz1.g r0 = new wz1.g
            r0.<init>(r5, r8)
        L18:
            java.lang.Object r8 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f301347x
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L32
            if (r2 != r3) goto L2a
            j60.a r7 = r0.u
            yhm.o.b(r8)
            goto L5c
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L32:
            yhm.o.b(r8)
            wtj.f r8 = new wtj.f
            r2 = 8
            r8.<init>(r5, r6, r4, r2)
            kotlin.coroutines.g r6 = kotlin.coroutines.g.f186406a
            pfm.h r6 = pd.b.n(r6, r8)
            eli.j r8 = r5.e
            eli.a r8 = sjg.a.b(r8)
            efm.b r6 = r6.h(r8)
            java.lang.String r8 = "compose(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r6, r8)
            r0.u = r7
            r0.f301347x = r3
            java.lang.Object r6 = nim.a.a(r6, r0)
            if (r6 != r1) goto L5c
            return r1
        L5c:
            r6 = 0
            r8 = 3
            j60.a.v(r7, r6, r4, r8)
            j49.a r6 = j49.a.f171320a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: wz1.k.h(p02.a, j60.a, gim.c):java.lang.Object");
    }
}
