package pxc;

import com.revolut.feature.backend_driven_limits.api.navigation.BackendDrivenLimitsDestination;
import com.revolut.kompot.bridge.navigation.KompotDestination;
import efm.d0;
import java.util.HashMap;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import pfm.z;
import wp5.y;
import zh9.u0;

/* JADX INFO: loaded from: classes7.dex */
public final class i implements g {

    @NotNull
    private static final h Companion = new h();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final sri.m f240607a;

    public i(sri.m navigator) {
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        this.f240607a = navigator;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.revolut.shared.feature.selfserve.entity.config.api.navigation.EntityConfigDestination b(java.lang.String r3, java.util.HashMap r4) {
        /*
            com.revolut.shared.feature.selfserve.entity.config.api.navigation.EntityConfigDestination r0 = new com.revolut.shared.feature.selfserve.entity.config.api.navigation.EntityConfigDestination
            java.lang.String r1 = "skippable"
            java.lang.Object r1 = r4.get(r1)
            java.lang.String r1 = (java.lang.String) r1
            if (r1 == 0) goto L24
            java.util.Locale r2 = java.util.Locale.ROOT
            java.lang.String r1 = r1.toLowerCase(r2)
            java.lang.String r2 = "toLowerCase(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r2)
            if (r1 == 0) goto L24
            java.lang.Boolean r1 = kotlin.text.d0.E0(r1)
            if (r1 == 0) goto L24
            boolean r1 = r1.booleanValue()
            goto L25
        L24:
            r1 = 1
        L25:
            com.revolut.shared.feature.selfserve.entity.config.api.navigation.EntityConfigDestination$InputData$Config r2 = new com.revolut.shared.feature.selfserve.entity.config.api.navigation.EntityConfigDestination$InputData$Config
            r2.<init>(r3, r4, r1)
            r0.<init>(r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: pxc.i.b(java.lang.String, java.util.HashMap):com.revolut.shared.feature.selfserve.entity.config.api.navigation.EntityConfigDestination");
    }

    public static KompotDestination c(jf0.c cVar) {
        String strE = cVar.e(2);
        HashMap map = cVar.d;
        if (strE.length() == 0) {
            String str = (String) map.get(ib.b.Flow);
            if (str == null) {
                str = "";
            }
            if (str.length() > 0) {
                String str2 = (String) map.get(ib.b.Flow);
                return b(str2 != null ? str2 : "", map);
            }
        }
        if (Intrinsics.f(cVar.e(2), "offboarding")) {
            return b("offboarding", map);
        }
        if (Intrinsics.f(cVar.e(2), "limits")) {
            return new BackendDrivenLimitsDestination(Boolean.parseBoolean((String) map.get("presentChecklistOnDismiss")), Boolean.parseBoolean((String) map.get("hideCTA")));
        }
        return null;
    }

    @Override // jf0.d, q06.k
    public final boolean a(jf0.c cVar) {
        return y.D(cVar, "deeplink", 1, "self-serve");
    }

    @Override // q06.k
    public final Object e(jf0.c cVar, Continuation continuation) {
        KompotDestination kompotDestinationC = c(cVar);
        if (kompotDestinationC != null) {
            return new q06.h(kompotDestinationC, null);
        }
        return null;
    }

    @Override // jf0.d
    public final d0 f(jf0.c deeplink, boolean z) {
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        KompotDestination kompotDestinationC = c(deeplink);
        if (kompotDestinationC != null) {
            z zVarD = new pfm.h(new phc.d(this, u0.f(kompotDestinationC), 2), 2).D(Boolean.TRUE);
            Intrinsics.checkNotNullExpressionValue(zVarD, "toSingleDefault(...)");
            return zVarD;
        }
        ufm.b bVarM = d0.m(Boolean.FALSE);
        Intrinsics.checkNotNullExpressionValue(bVarM, "just(...)");
        return bVarM;
    }
}
