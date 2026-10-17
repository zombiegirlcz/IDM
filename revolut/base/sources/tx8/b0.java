package tx8;

import com.google.protobuf.b4;
import com.google.protobuf.d4;
import com.google.protobuf.f3;
import com.google.protobuf.h3;
import com.google.protobuf.w0;
import com.revolut.tracking.v3.SettingsThirdPartySdkContext;
import grl.cc;
import java.util.List;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import no.j2;
import zhm.d0;
import zhm.r0;

/* JADX INFO: loaded from: classes4.dex */
public final class b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j2 f275345a;

    public b0(j2 settingEventsTracker) {
        Intrinsics.checkNotNullParameter(settingEventsTracker, "settingEventsTracker");
        this.f275345a = settingEventsTracker;
    }

    public static String a(List list, Function1 function1) {
        if (list.isEmpty()) {
            return null;
        }
        return d0.k0(list, null, null, null, 0, function1, 31);
    }

    public final void b(cc ccVar, av1.c cVar, Map map) {
        Map mapQ;
        SettingsThirdPartySdkContext.a aVarNewBuilder = SettingsThirdPartySdkContext.newBuilder();
        aVarNewBuilder.c();
        ((SettingsThirdPartySdkContext) aVarNewBuilder.f49761b).setEvent(ccVar);
        String str = cVar.f9872b;
        aVarNewBuilder.c();
        ((SettingsThirdPartySdkContext) aVarNewBuilder.f49761b).setVendor(str);
        if (cVar instanceof q) {
            q qVar = (q) cVar;
            mapQ = foh.i.q(new Pair("document_type", qVar.f275360c.f77926a), new Pair("steps", a(qVar.d, new h0() { // from class: tx8.z
                @Override // kotlin.jvm.internal.h0, wim.p
                public final Object get(Object obj2) {
                    return ((my8.b0) obj2).name();
                }
            })), new Pair("nfc", qVar.e.name()));
        } else if (cVar instanceof m) {
            m mVar = (m) cVar;
            mapQ = foh.i.q(new Pair("document_pages", a(mVar.f275356c, new tx.f(6))), new Pair("steps", a(mVar.d, new h0() { // from class: tx8.a0
                @Override // kotlin.jvm.internal.h0, wim.p
                public final Object get(Object obj2) {
                    return ((my8.b0) obj2).name();
                }
            })));
        } else if (cVar instanceof t) {
            mapQ = foh.i.q(new Pair("profileId", ((t) cVar).f275363c), new Pair("mobilePlanType", null), new Pair("installationType", null));
        } else if (cVar instanceof g) {
            mapQ = foh.i.q(new Pair("document_type", ((g) cVar).f275350c.f77926a));
        } else {
            if (!(cVar instanceof o) && !(cVar instanceof a) && !(cVar instanceof b) && !(cVar instanceof c) && !(cVar instanceof d) && !(cVar instanceof e) && !(cVar instanceof f) && !(cVar instanceof h) && !(cVar instanceof i) && !(cVar instanceof j) && !(cVar instanceof k) && !(cVar instanceof l) && !(cVar instanceof n) && !(cVar instanceof p) && !(cVar instanceof s) && !(cVar instanceof u) && !(cVar instanceof v) && !(cVar instanceof w) && !(cVar instanceof x) && !(cVar instanceof y) && !cVar.equals(r.f275361c)) {
                throw new NoWhenBranchMatchedException();
            }
            mapQ = null;
        }
        if (mapQ != null && map != null) {
            map = r0.p(mapQ, map);
        } else if (mapQ != null) {
            map = mapQ;
        } else if (map == null) {
            map = null;
        }
        if (map != null && !map.isEmpty()) {
            f3 f3VarNewBuilder = h3.newBuilder();
            for (Map.Entry entry : map.entrySet()) {
                String str2 = (String) entry.getKey();
                String str3 = (String) entry.getValue();
                b4 b4VarNewBuilder = d4.newBuilder();
                b4VarNewBuilder.h(str3);
                f3VarNewBuilder.i(str2, (d4) b4VarNewBuilder.a());
            }
            h3 h3Var = (h3) f3VarNewBuilder.a();
            aVarNewBuilder.c();
            ((SettingsThirdPartySdkContext) aVarNewBuilder.f49761b).setParameters(h3Var);
        }
        w0 w0VarA = aVarNewBuilder.a();
        Intrinsics.checkNotNullExpressionValue(w0VarA, "build(...)");
        SettingsThirdPartySdkContext context = (SettingsThirdPartySdkContext) w0VarA;
        com.revolut.analytics.tracking.v3.l lVar = (com.revolut.analytics.tracking.v3.l) this.f275345a;
        Intrinsics.checkNotNullParameter(context, "context");
        com.revolut.analytics.tracking.v3.l.n3(lVar, null, new nmm.h(context, 7), 3);
    }

    public final void c(av1.c vendor) {
        Intrinsics.checkNotNullParameter(vendor, "vendor");
        b(cc.Started, vendor, null);
    }
}
