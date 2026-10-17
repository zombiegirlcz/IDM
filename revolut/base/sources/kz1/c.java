package kz1;

import com.revolut.feature.retail.main_screen.container.models.action_payload.ApmDeeplinkPayload;
import com.revolut.feature.rev10_main_screen.api.action.MainScreenContainerActionData;
import com.revolut.feature.rev10_main_screen.api.action.MainScreenContainerActionId;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.d0;
import pfm.z;
import sri.m;
import wp5.y;

/* JADX INFO: loaded from: classes20.dex */
public final class c implements xw1.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m f191045a;

    public c(m navigator) {
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        this.f191045a = navigator;
    }

    @Override // jf0.d, q06.k
    public final boolean a(jf0.c cVar) {
        return y.D(cVar, "deeplink", 1, "apm-chat");
    }

    @Override // q06.k
    public final Object e(jf0.c cVar, Continuation continuation) {
        String strE = cVar.e(2);
        if (d0.W(strE)) {
            strE = null;
        }
        if (strE != null) {
            return new q06.i(new q06.a(new MainScreenContainerActionData(new MainScreenContainerActionId("APM_DEEPLINK"), new ApmDeeplinkPayload.Chat(strE))));
        }
        return null;
    }

    @Override // jf0.d
    public final efm.d0 f(jf0.c deeplink, boolean z) {
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        String strE = deeplink.e(2);
        if (d0.W(strE)) {
            strE = null;
        }
        if (strE == null) {
            ufm.b bVarM = efm.d0.m(Boolean.FALSE);
            Intrinsics.checkNotNullExpressionValue(bVarM, "just(...)");
            return bVarM;
        }
        z zVarD = new pfm.h(new hc7.a(this, strE, 24), 2).D(Boolean.TRUE);
        Intrinsics.checkNotNullExpressionValue(zVarD, "toSingleDefault(...)");
        return zVarD;
    }
}
