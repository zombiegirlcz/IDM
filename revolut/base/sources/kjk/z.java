package kjk;

import java.util.Base64;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import zhm.q0;
import zhm.r0;
import zhm.t0;

/* JADX INFO: loaded from: classes11.dex */
public final class z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f184477a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f184478b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f184479c;
    public final String d;
    public final LinkedHashMap e;
    public final String f;

    public z(String currentPlanId, String bottomSheetId, List enabledExperiments, String str, LinkedHashMap parameters) {
        Intrinsics.checkNotNullParameter(currentPlanId, "currentPlanId");
        Intrinsics.checkNotNullParameter(bottomSheetId, "bottomSheetId");
        Intrinsics.checkNotNullParameter(enabledExperiments, "enabledExperiments");
        Intrinsics.checkNotNullParameter(parameters, "parameters");
        this.f184477a = currentPlanId;
        this.f184478b = bottomSheetId;
        this.f184479c = enabledExperiments;
        this.d = str;
        this.e = parameters;
        Map mapK = r0.k(new Pair("currentPlanId", currentPlanId), new Pair("bottomSheetId", bottomSheetId), new Pair("entrypoint", str));
        LinkedHashMap linkedHashMap = new LinkedHashMap(q0.b(parameters.size()));
        for (Map.Entry entry : parameters.entrySet()) {
            linkedHashMap.put(j6.a.q("query.", (String) entry.getKey()), entry.getValue());
        }
        LinkedHashMap params = r0.p(mapK, linkedHashMap);
        Base64.Encoder encoder = a.f184418a;
        Intrinsics.checkNotNullParameter("plans_bottom_sheet_layout_", "prefix");
        Intrinsics.checkNotNullParameter(params, "params");
        this.f = a.a("plans_bottom_sheet_layout_", t0.C(params));
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof z)) {
            return false;
        }
        z zVar = (z) obj2;
        return Intrinsics.f(this.f184477a, zVar.f184477a) && Intrinsics.f(this.f184478b, zVar.f184478b) && this.f184479c.equals(zVar.f184479c) && Intrinsics.f(this.d, zVar.d) && this.e.equals(zVar.e);
    }

    public final int hashCode() {
        int iD = p.a.d(p.a.c(this.f184477a.hashCode() * 31, 31, this.f184478b), 31, this.f184479c);
        String str = this.d;
        return this.e.hashCode() + ((iD + (str == null ? 0 : str.hashCode())) * 31);
    }
}
