package vkc;

import com.revolut.feature.rfi_tool.api.RfiToolDestination;
import com.revolut.feature.rfi_tool.api.RfiToolFeatureConfig;
import com.revolut.feature.rfi_tool.api.RfiToolFlowInputData;
import com.revolut.retail.core.navigation.FeatureCommand;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.d0;
import org.jetbrains.annotations.NotNull;
import pfm.z;
import v3e.t;
import wp5.y;

/* JADX INFO: loaded from: classes6.dex */
public final class b implements nkc.b {

    @NotNull
    private static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final sri.m f289901a;

    public b(sri.m navigator) {
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        this.f289901a = navigator;
    }

    public static RfiToolFlowInputData b(jf0.c cVar) {
        String strE = cVar.e(2);
        HashMap map = cVar.d;
        String str = null;
        if (strE.length() <= 0) {
            strE = null;
        }
        if (strE == null) {
            return null;
        }
        String str2 = (String) map.get("intro");
        if (str2 != null && !d0.W(str2)) {
            str = str2;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : map.entrySet()) {
            if (!Intrinsics.f((String) entry.getKey(), "intro")) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        return new RfiToolFlowInputData(strE, str, linkedHashMap);
    }

    @Override // jf0.d, q06.k
    public final boolean a(jf0.c cVar) {
        return y.D(cVar, "deeplink", 1, "information-request") && cVar.e(2).length() > 0;
    }

    @Override // q06.k
    public final Object e(jf0.c cVar, Continuation continuation) {
        RfiToolFlowInputData rfiToolFlowInputDataB = b(cVar);
        if (rfiToolFlowInputDataB == null) {
            return null;
        }
        return new q06.h(new RfiToolDestination(rfiToolFlowInputDataB), new q06.b(ibb.c.f160140a, null));
    }

    @Override // jf0.d
    public final efm.d0 f(jf0.c deeplink, boolean z) {
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        RfiToolFlowInputData rfiToolFlowInputDataB = b(deeplink);
        if (rfiToolFlowInputDataB == null) {
            ufm.b bVarM = efm.d0.m(Boolean.FALSE);
            Intrinsics.checkNotNullExpressionValue(bVarM, "just(...)");
            return bVarM;
        }
        z zVarD = new pfm.h(new t(this, com.revolut.retail.core.navigation.a.c(jbb.a.a(ibb.c.f160140a, null, null, null, 14), new FeatureCommand(new RfiToolFeatureConfig(rfiToolFlowInputDataB))), 10), 2).D(Boolean.TRUE);
        Intrinsics.checkNotNullExpressionValue(zVarD, "toSingleDefault(...)");
        return ue0.e.F(zVarD, Boolean.FALSE);
    }
}
