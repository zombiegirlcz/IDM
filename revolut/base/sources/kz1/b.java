package kz1;

import com.revolut.feature.retail.main_screen.container.models.action_payload.ApmDeeplinkPayload;
import com.revolut.feature.rev10_main_screen.api.action.MainScreenContainerActionData;
import com.revolut.feature.rev10_main_screen.api.action.MainScreenContainerActionId;
import efm.d0;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import pfm.z;
import sri.m;
import wp5.y;
import zhm.h0;

/* JADX INFO: loaded from: classes20.dex */
public final class b implements xw1.b {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m f191044a;

    public b(m navigator) {
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        this.f191044a = navigator;
    }

    public static ApmDeeplinkPayload b(jf0.c cVar) {
        String strE = cVar.e(2);
        ApmDeeplinkPayload.Apm.INSTANCE.getClass();
        ApmDeeplinkPayload.Apm apmA = ApmDeeplinkPayload.Apm.Companion.a(strE);
        if (apmA == null) {
            IllegalStateException illegalStateException = new IllegalStateException("Unknown APM type: ".concat(strE));
            h0 h0Var = h0.f322473a;
            CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
            rd0.d.a(rd0.c.ERROR, null, null, illegalStateException, h0Var);
            return null;
        }
        String strE2 = cVar.e(3);
        int iHashCode = strE2.hashCode();
        if (iHashCode != -1031001564) {
            if (iHashCode != 293838746) {
                if (iHashCode == 1434631203 && strE2.equals("settings")) {
                    return new ApmDeeplinkPayload.Settings(apmA);
                }
            } else if (strE2.equals("disable-extension")) {
                return new ApmDeeplinkPayload.DisableExtension(apmA);
            }
        } else if (strE2.equals("deregister")) {
            return new ApmDeeplinkPayload.Deregister(apmA, cVar.e(4));
        }
        return new ApmDeeplinkPayload.Area(apmA);
    }

    @Override // jf0.d, q06.k
    public final boolean a(jf0.c cVar) {
        return y.D(cVar, "deeplink", 1, "apm-area");
    }

    @Override // q06.k
    public final Object e(jf0.c cVar, Continuation continuation) {
        ApmDeeplinkPayload apmDeeplinkPayloadB = b(cVar);
        if (apmDeeplinkPayloadB == null) {
            return null;
        }
        return new q06.i(new q06.a(new MainScreenContainerActionData(new MainScreenContainerActionId("APM_DEEPLINK"), apmDeeplinkPayloadB)));
    }

    @Override // jf0.d
    public final d0 f(jf0.c deeplink, boolean z) {
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        ApmDeeplinkPayload apmDeeplinkPayloadB = b(deeplink);
        if (apmDeeplinkPayloadB == null) {
            ufm.b bVarM = d0.m(Boolean.FALSE);
            Intrinsics.checkNotNullExpressionValue(bVarM, "just(...)");
            return bVarM;
        }
        z zVarD = new pfm.h(new hc7.a(this, apmDeeplinkPayloadB, 23), 2).D(Boolean.TRUE);
        Intrinsics.checkNotNullExpressionValue(zVarD, "toSingleDefault(...)");
        return zVarD;
    }
}
