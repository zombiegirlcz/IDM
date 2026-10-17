package h72;

import com.revolut.feature.apm.multibanco.api.navigation.MultibancoExternalEnrollmentFlowDestination;
import com.revolut.feature.apm.multibanco.api.navigation.MultibancoFlowDestination;
import com.revolut.feature.apm.multibanco.api.navigation.MultibancoFlowInputData;
import com.revolut.kompot.common.InternalDestination;
import gvi.s;
import h0l.g;
import java.util.HashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.d0;
import org.jetbrains.annotations.NotNull;
import rd0.d;
import sri.m;
import ufm.i;
import wp5.y;
import zhm.h0;

/* JADX INFO: loaded from: classes20.dex */
public final class c implements u62.b {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m f149838a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final uw1.c f149839b;

    public c(m navigator, uw1.c apmFeatureChecker) {
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(apmFeatureChecker, "apmFeatureChecker");
        this.f149838a = navigator;
        this.f149839b = apmFeatureChecker;
    }

    public static InternalDestination c(jf0.c cVar) {
        HashMap map = cVar.d;
        Object obj2 = map.get("token");
        String str = (String) obj2;
        if (str == null || d0.W(str)) {
            obj2 = null;
        }
        String str2 = (String) obj2;
        if (str2 == null) {
            throw new IllegalArgumentException("Missing deeplink parameter token");
        }
        String str3 = (String) map.get("returnUrl");
        String str4 = (String) map.get("link");
        if (str3 == null) {
            str3 = str4;
        }
        if (str3 != null) {
            return new MultibancoExternalEnrollmentFlowDestination(str2, str3);
        }
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException("Missing deeplink parameters: returnUrl and link");
        h0 h0Var = h0.f322473a;
        CopyOnWriteArrayList copyOnWriteArrayList = d.f253311a;
        d.a(rd0.c.ERROR, null, null, illegalArgumentException, h0Var);
        return new MultibancoFlowDestination(0);
    }

    @Override // jf0.d, q06.k
    public final boolean a(jf0.c cVar) {
        return y.D(cVar, "deeplink", 1, "mbway") || Intrinsics.f(cVar.e(1), "mbway-card-enrollment") || Intrinsics.f(cVar.e(1), "via-verde");
    }

    public final efm.d0 b(jf0.c cVar) {
        Object multibancoFlowDestination;
        MultibancoFlowDestination multibancoFlowDestination2;
        String strE = cVar.e(1);
        if (Intrinsics.f(strE, "mbway-card-enrollment")) {
            try {
                multibancoFlowDestination = c(cVar);
            } catch (Throwable th10) {
                h0 h0Var = h0.f322473a;
                CopyOnWriteArrayList copyOnWriteArrayList = d.f253311a;
                d.a(rd0.c.ERROR, null, null, th10, h0Var);
                multibancoFlowDestination = new MultibancoFlowDestination(0);
            }
            ufm.b bVarM = efm.d0.m(multibancoFlowDestination);
            Intrinsics.checkNotNullExpressionValue(bVarM, "just(...)");
            return bVarM;
        }
        if (Intrinsics.f(strE, "via-verde")) {
            return new i(((ty1.b) this.f149839b).c(yoj.c.APM_MULTIBANCO), new g(new h5i.b(19), 24), 1);
        }
        if (Intrinsics.f(cVar.e(2), "authorisation")) {
            multibancoFlowDestination2 = new MultibancoFlowDestination(new MultibancoFlowInputData.StartType.PendingPayment(cVar.e(3)));
        } else {
            IllegalStateException illegalStateException = new IllegalStateException(j6.a.q("Not supported: ", cVar.f173629c));
            h0 h0Var2 = h0.f322473a;
            CopyOnWriteArrayList copyOnWriteArrayList2 = d.f253311a;
            d.a(rd0.c.ERROR, null, null, illegalStateException, h0Var2);
            multibancoFlowDestination2 = new MultibancoFlowDestination(0);
        }
        ufm.b bVarM2 = efm.d0.m(multibancoFlowDestination2);
        Intrinsics.checkNotNullExpressionValue(bVarM2, "just(...)");
        return bVarM2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0067, code lost:
    
        if (r8 == r1) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // q06.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(jf0.c r7, kotlin.coroutines.Continuation r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof h72.b
            if (r0 == 0) goto L13
            r0 = r8
            h72.b r0 = (h72.b) r0
            int r1 = r0.f149837x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f149837x = r1
            goto L1a
        L13:
            h72.b r0 = new h72.b
            gim.c r8 = (gim.c) r8
            r0.<init>(r6, r8)
        L1a:
            java.lang.Object r8 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f149837x
            r3 = 1
            r4 = 2
            r5 = 0
            if (r2 == 0) goto L3b
            if (r2 == r3) goto L35
            if (r2 != r4) goto L2d
            yhm.o.b(r8)
            goto L6a
        L2d:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L35:
            jf0.c r7 = r0.u
            yhm.o.b(r8)
            goto L53
        L3b:
            yhm.o.b(r8)
            uw1.c r8 = r6.f149839b
            ty1.b r8 = (ty1.b) r8
            yoj.c r2 = yoj.c.APM_MULTIBANCO
            pfm.z r8 = r8.c(r2)
            r0.u = r7
            r0.f149837x = r3
            java.lang.Object r8 = nim.a.b(r8, r0)
            if (r8 != r1) goto L53
            goto L69
        L53:
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            if (r8 == 0) goto L7c
            efm.d0 r7 = r6.b(r7)
            r0.u = r5
            r0.f149837x = r4
            java.lang.Object r8 = nim.a.b(r7, r0)
            if (r8 != r1) goto L6a
        L69:
            return r1
        L6a:
            com.revolut.kompot.common.StackDestination r8 = (com.revolut.kompot.common.StackDestination) r8
            q06.h r7 = new q06.h
            kotlin.jvm.internal.Intrinsics.h(r8)
            q06.b r0 = new q06.b
            com.revolut.feature.rev10_main_screen.api.MainScreenTab r1 = ibb.c.f160140a
            r0.<init>(r1, r5)
            r7.<init>(r8, r0)
            return r7
        L7c:
            q06.i r7 = new q06.i
            q06.a r8 = new q06.a
            com.revolut.feature.rev10_main_screen.api.action.MainScreenContainerActionData r0 = new com.revolut.feature.rev10_main_screen.api.action.MainScreenContainerActionData
            com.revolut.feature.rev10_main_screen.api.action.MainScreenContainerActionId r1 = new com.revolut.feature.rev10_main_screen.api.action.MainScreenContainerActionId
            java.lang.String r2 = "APM_DEEPLINK"
            r1.<init>(r2)
            com.revolut.feature.retail.main_screen.container.models.action_payload.ApmDeeplinkPayload$Unavailable r2 = new com.revolut.feature.retail.main_screen.container.models.action_payload.ApmDeeplinkPayload$Unavailable
            com.revolut.feature.retail.main_screen.container.models.action_payload.ApmDeeplinkPayload$Apm$MBWAY r3 = com.revolut.feature.retail.main_screen.container.models.action_payload.ApmDeeplinkPayload.Apm.MBWAY.f82734b
            r2.<init>(r3)
            r0.<init>(r1, r2)
            r8.<init>(r0)
            r7.<init>(r8)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: h72.c.e(jf0.c, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // jf0.d
    public final efm.d0 f(jf0.c deeplink, boolean z) {
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        Intrinsics.checkNotNullExpressionValue("c", "MB_TAG");
        CopyOnWriteArrayList copyOnWriteArrayList = d.f253311a;
        d.b(rd0.c.INFO, "c", j6.a.q("MBWAY Deeplink uri: ", deeplink.f173629c), null, null, 16);
        i iVar = new i(((ty1.b) this.f149839b).c(yoj.c.APM_MULTIBANCO), new g(new s(this, deeplink, 28), 22), 0);
        Intrinsics.checkNotNullExpressionValue(iVar, "flatMap(...)");
        return iVar;
    }
}
