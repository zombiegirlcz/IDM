package ty8;

import aw0.o9;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.kyc_documents_scan.externalkyc.trustdock.TrustdockScreenContract$InputData;
import com.revolut.kompot.bridge.navigation.BridgeDestination;
import com.revolut.kompot.common.flow.permissions.PermissionsFlow;
import com.revolut.kompot.common.flow.permissions.PermissionsFlowContract$Explanation;
import com.revolut.retail.core.navigation.FinishCommand;
import com.revolut.revolut.feature_fourthline_impl.R;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import tx0.p4;
import zhm.q0;

/* JADX INFO: loaded from: classes4.dex */
public final class p extends jki.g implements d {

    @NotNull
    public static final i Companion = new i();

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final y80.a f275526p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final vw8.a f275527q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final c f275528r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(TrustdockScreenContract$InputData inputData, q stateMapper, y80.a permissionProvider, vw8.a documentScanResourcesProvider) {
        super(stateMapper);
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(permissionProvider, "permissionProvider");
        Intrinsics.checkNotNullParameter(documentScanResourcesProvider, "documentScanResourcesProvider");
        this.f275526p = permissionProvider;
        this.f275527q = documentScanResourcesProvider;
        this.f275528r = new c(false, false, inputData.f77943a, null);
    }

    @Override // yji.l
    public final void I1() {
        if (this.f275526p.c("android.permission.CAMERA")) {
            x2(new tx.f(20));
        } else {
            this.f275527q.getClass();
            yji.l.i2(this, new PermissionsFlow(q0.c(new Pair("android.permission.CAMERA", new PermissionsFlowContract$Explanation.PromptScreen(new TextLocalisedClause(R.string.camera_access_require, null, null, 14), new TextClause("", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), new TextLocalisedClause(R.string.camera_access_grant, null, null, 14), com.revolut.core.ui_kit_core.displayers.image.models.b.c("3D019", null, null, null, 30), (TextClause) null, 48)))), null, new p4(this, 2), 1);
        }
    }

    @Override // jki.g
    public final jki.i r2() {
        return this.f275528r;
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x0076  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void y2(java.lang.String r4) {
        /*
            r3 = this;
            java.lang.String r0 = "url"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            android.net.Uri r4 = android.net.Uri.parse(r4)
            java.lang.String r0 = "result"
            java.lang.String r0 = r4.getQueryParameter(r0)
            java.lang.String r1 = "error"
            java.lang.String r4 = r4.getQueryParameter(r1)
            ty8.m r1 = ty8.m.f275525a
            if (r0 == 0) goto L36
            int r2 = r0.length()
            if (r2 != 0) goto L20
            goto L36
        L20:
            java.lang.String r4 = "document_submitted"
            boolean r4 = r0.equals(r4)
            if (r4 == 0) goto L2b
            ty8.l r1 = ty8.l.f275524a
            goto L7d
        L2b:
            java.lang.String r4 = "canceled"
            boolean r4 = r0.equals(r4)
            if (r4 == 0) goto L7d
            ty8.j r1 = ty8.j.f275522a
            goto L7d
        L36:
            if (r4 == 0) goto L7d
            int r0 = r4.length()
            if (r0 != 0) goto L3f
            goto L7d
        L3f:
            int r0 = r4.hashCode()
            r1 = -1578219708(0xffffffffa1ee4744, float:-1.6146371E-18)
            if (r0 == r1) goto L6b
            r1 = -1252834965(0xffffffffb553416b, float:-7.869882E-7)
            if (r0 == r1) goto L5f
            r1 = -175999133(0xfffffffff5827763, float:-3.307715E32)
            if (r0 == r1) goto L53
            goto L76
        L53:
            java.lang.String r0 = "invalid_verification"
            boolean r4 = r4.equals(r0)
            if (r4 != 0) goto L5c
            goto L76
        L5c:
            ty8.e r4 = ty8.e.INVALID_VERIFICATION
            goto L78
        L5f:
            java.lang.String r0 = "invalid_settings"
            boolean r4 = r4.equals(r0)
            if (r4 != 0) goto L68
            goto L76
        L68:
            ty8.e r4 = ty8.e.INVALID_SETTINGS
            goto L78
        L6b:
            java.lang.String r0 = "access_token_expired"
            boolean r4 = r4.equals(r0)
            if (r4 == 0) goto L76
            ty8.e r4 = ty8.e.ACCESS_TOKEN_EXPIRED
            goto L78
        L76:
            ty8.e r4 = ty8.e.UNKNOWN
        L78:
            ty8.k r1 = new ty8.k
            r1.<init>(r4)
        L7d:
            r3.z2(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ty8.p.y2(java.lang.String):void");
    }

    public final void z2(n nVar) {
        if (nVar.equals(l.f275524a)) {
            C1(new BridgeDestination(new FinishCommand(-1, null, null, 6)));
            return;
        }
        if (nVar.equals(j.f275522a)) {
            C1(new BridgeDestination(new FinishCommand(0, null, null, 6)));
            return;
        }
        if (nVar instanceof k) {
            x2(new p4(nVar, 4));
            Unit unit = Unit.f186387a;
        } else {
            if (!nVar.equals(m.f275525a)) {
                throw new NoWhenBranchMatchedException();
            }
            String simpleName = p.class.getSimpleName();
            Intrinsics.checkNotNullExpressionValue(simpleName, "getSimpleName(...)");
            CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
            rd0.d.b(rd0.c.WARNING, simpleName, "Unknown submission result, trying to optimistically go through happy path", null, null, 16);
            C1(new BridgeDestination(new FinishCommand(-1, null, null, 6)));
        }
    }
}
