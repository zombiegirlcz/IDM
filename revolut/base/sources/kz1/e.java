package kz1;

import com.revolut.feature.apm.core.ui.api.navigation.pending_payments.ApmConsentNavigation$Destination;
import com.revolut.feature.apm.core.ui.api.navigation.pending_payments.ApmConsentNavigation$InputData;
import efm.d0;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Pair;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import pfm.z;
import sri.m;
import wp5.y;
import zhm.h0;
import zhm.y0;

/* JADX INFO: loaded from: classes20.dex */
public final class e implements xw1.f {

    @NotNull
    public static final d Companion = new d();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m f191046a;

    public e(m navigator) {
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        this.f191046a = navigator;
    }

    public static ApmConsentNavigation$Destination b(jf0.c cVar) {
        String str = (String) cVar.d.get("id");
        if (str == null) {
            IllegalStateException illegalStateException = new IllegalStateException(p.a.p("Deeplink ", cVar.f173629c, " for 'apm-consent' doesn't have 'id' param"));
            h0 h0Var = h0.f322473a;
            CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
            rd0.d.a(rd0.c.ERROR, null, null, illegalStateException, h0Var);
            str = "";
        }
        Intrinsics.checkNotNullExpressionValue("e", "APM_TAG");
        CopyOnWriteArrayList copyOnWriteArrayList2 = rd0.d.f253311a;
        rd0.d.b(rd0.c.INFO, "e", "ApmConsent Deeplink: open confirmation for id: ".concat(str), null, null, 16);
        return new ApmConsentNavigation$Destination(new ApmConsentNavigation$InputData(str, false));
    }

    @Override // jf0.d, q06.k
    public final boolean a(jf0.c cVar) {
        return y.D(cVar, "deeplink", 1, "apm-consent");
    }

    @Override // q06.k
    public final Object e(jf0.c cVar, Continuation continuation) {
        return new q06.h(b(cVar), new q06.b(ibb.c.f160140a, null));
    }

    @Override // jf0.d
    public final d0 f(jf0.c deeplink, boolean z) {
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        Intrinsics.checkNotNullExpressionValue("e", "APM_TAG");
        CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
        rd0.c cVar = rd0.c.INFO;
        String str = deeplink.f173629c;
        rd0.d.b(cVar, "e", "ApmConsent Deeplink: uri=" + str + ", type=" + deeplink.f173628b + ", parameters=" + deeplink.d + ", pattern=" + deeplink.e, null, null, 16);
        pfm.h hVar = new pfm.h(new hc7.a(this, b(deeplink), 25), 2);
        Intrinsics.checkNotNullExpressionValue(hVar, "fromAction(...)");
        z zVarD = ue0.e.r(hVar, y0.b(new Pair("deeplink", str))).D(Boolean.TRUE);
        Intrinsics.checkNotNullExpressionValue(zVarD, "toSingleDefault(...)");
        return zVarD;
    }
}
