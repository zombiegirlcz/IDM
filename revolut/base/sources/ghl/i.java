package ghl;

import ghk.r;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.d0;

/* JADX INFO: loaded from: classes12.dex */
public final class i {

    @NotNull
    private static final a Companion = new a();

    public static final class a {
        private a() {
        }
    }

    public final String a(shl.a params) {
        String strK0;
        String str;
        Intrinsics.checkNotNullParameter(params, "params");
        String strK02 = d0.k0(params.f263504a, ",", null, null, 0, new r(10), 30);
        List list = params.f263505b;
        if (list == null || (strK0 = d0.k0(list, ",", null, null, 0, new r(this), 30)) == null) {
            strK0 = "";
        }
        zel.g gVar = params.f263506c;
        String strQ = j6.a.q("sort:", gVar != null ? gVar.name() : null);
        zel.i iVar = params.e;
        String strQ2 = j6.a.q("direction:", iVar != null ? iVar.name() : null);
        Integer num = params.f;
        if (num != null) {
            str = "-limit:" + num;
        } else {
            str = "";
        }
        List list2 = params.d;
        String strQ3 = !list2.isEmpty() ? j6.a.q("-extraMetrics:", d0.k0(list2, ",", null, null, 0, new r(12), 30)) : "";
        StringBuilder sbM = v0.a.m("SCREENER_SEARCH_", strK02, "-filters:", strK0, "-");
        j6.a.D(sbM, strQ, "-", strQ2, str);
        return v0.a.i(sbM, "", strQ3);
    }
}
