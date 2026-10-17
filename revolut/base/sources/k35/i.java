package k35;

import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;
import zhm.v;

/* JADX INFO: loaded from: classes21.dex */
public final class i {
    private i() {
    }

    public static u a(String uri2) {
        Object next;
        Intrinsics.checkNotNullParameter(uri2, "uri");
        Intrinsics.checkNotNullParameter(uri2, "uri");
        Intrinsics.checkNotNullParameter(uri2, "uri");
        j jVar = new j("revolut://app/credit/loan/([0-9a-fA-F]{8}-[0-9a-fA-F]{4}-[0-9a-fA-F]{4}-[0-9a-fA-F]{4}-[0-9a-fA-F]{12})", uri2);
        Intrinsics.checkNotNullParameter(uri2, "uri");
        o oVar = new o("revolut://app/credit/loan/([0-9a-fA-F]{8}-[0-9a-fA-F]{4}-[0-9a-fA-F]{4}-[0-9a-fA-F]{4}-[0-9a-fA-F]{12})/repay", uri2);
        Intrinsics.checkNotNullParameter(uri2, "uri");
        k kVar = new k("revolut://app/credit/loan/([0-9a-fA-F]{8}-[0-9a-fA-F]{4}-[0-9a-fA-F]{4}-[0-9a-fA-F]{4}-[0-9a-fA-F]{12})/details", uri2);
        Intrinsics.checkNotNullParameter(uri2, "uri");
        g gVar = new g("revolut://app/credit/loan/([0-9a-fA-F]{8}-[0-9a-fA-F]{4}-[0-9a-fA-F]{4}-[0-9a-fA-F]{4}-[0-9a-fA-F]{12})/repayment-explainer", uri2);
        Intrinsics.checkNotNullParameter(uri2, "uri");
        p pVar = new p("revolut://app/credit/loan/([0-9a-fA-F]{8}-[0-9a-fA-F]{4}-[0-9a-fA-F]{4}-[0-9a-fA-F]{4}-[0-9a-fA-F]{12})/autopay", uri2);
        Intrinsics.checkNotNullParameter(uri2, "uri");
        e eVar = new e("revolut://app/credit/loan/([0-9a-fA-F]{8}-[0-9a-fA-F]{4}-[0-9a-fA-F]{4}-[0-9a-fA-F]{4}-[0-9a-fA-F]{12})/autopay/failed", uri2);
        Intrinsics.checkNotNullParameter(uri2, "uri");
        h hVar = new h("revolut://app/credit/loan/([0-9a-fA-F]{8}-[0-9a-fA-F]{4}-[0-9a-fA-F]{4}-[0-9a-fA-F]{4}-[0-9a-fA-F]{12})/change-repayment-day", uri2);
        Intrinsics.checkNotNullParameter(uri2, "uri");
        t tVar = new t("revolut://app/credit/loan/([0-9a-fA-F]{8}-[0-9a-fA-F]{4}-[0-9a-fA-F]{4}-[0-9a-fA-F]{4}-[0-9a-fA-F]{12})/statements", uri2);
        Intrinsics.checkNotNullParameter(uri2, "uri");
        d dVar = new d("revolut://app/credit/loan/([0-9a-fA-F]{8}-[0-9a-fA-F]{4}-[0-9a-fA-F]{4}-[0-9a-fA-F]{4}-[0-9a-fA-F]{12})/autopay/cancelled", uri2);
        Intrinsics.checkNotNullParameter(uri2, "uri");
        f fVar = new f("revolut://app/credit/loan/([0-9a-fA-F]{8}-[0-9a-fA-F]{4}-[0-9a-fA-F]{4}-[0-9a-fA-F]{4}-[0-9a-fA-F]{12})/backup-card", uri2);
        Intrinsics.checkNotNullParameter(uri2, "uri");
        q qVar = new q("revolut://app/credit/loan/([0-9a-fA-F]{8}-[0-9a-fA-F]{4}-[0-9a-fA-F]{4}-[0-9a-fA-F]{4}-[0-9a-fA-F]{12})/backup-card/select", uri2);
        Intrinsics.checkNotNullParameter(uri2, "uri");
        n nVar = new n("revolut://app/credit/loan/([0-9a-fA-F]{8}-[0-9a-fA-F]{4}-[0-9a-fA-F]{4}-[0-9a-fA-F]{4}-[0-9a-fA-F]{12})/refinanced-accounts", uri2);
        Intrinsics.checkNotNullParameter(uri2, "uri");
        m mVar = new m("revolut://app/credit/loan", uri2);
        Intrinsics.checkNotNullParameter(uri2, "uri");
        b bVar = new b("revolut://app/credit/cancellation-application", uri2);
        Intrinsics.checkNotNullParameter(uri2, "uri");
        c cVar = new c("revolut://app/credit/cancellation-application/([0-9a-fA-F]{8}-[0-9a-fA-F]{4}-[0-9a-fA-F]{4}-[0-9a-fA-F]{4}-[0-9a-fA-F]{12})", uri2);
        Intrinsics.checkNotNullParameter(uri2, "uri");
        l lVar = new l("revolut://app/credit/loan/([0-9a-fA-F]{8}-[0-9a-fA-F]{4}-[0-9a-fA-F]{4}-[0-9a-fA-F]{4}-[0-9a-fA-F]{12})/welcome", uri2);
        Intrinsics.checkNotNullParameter(uri2, "uri");
        r rVar = new r("revolut://app/credit/loan/([0-9a-fA-F]{8}-[0-9a-fA-F]{4}-[0-9a-fA-F]{4}-[0-9a-fA-F]{4}-[0-9a-fA-F]{12})/settle-refinanced", uri2);
        Intrinsics.checkNotNullParameter(uri2, "uri");
        Iterator it8 = v.k(jVar, oVar, kVar, gVar, pVar, eVar, hVar, tVar, dVar, fVar, qVar, nVar, mVar, bVar, cVar, lVar, rVar, new s("revolut://app/credit/loan/([0-9a-fA-F]{8}-[0-9a-fA-F]{4}-[0-9a-fA-F]{4}-[0-9a-fA-F]{4}-[0-9a-fA-F]{12})/setup-direct-debit", uri2)).iterator();
        while (true) {
            if (!it8.hasNext()) {
                next = null;
                break;
            }
            next = it8.next();
            if (((u) next).f180618a.matches()) {
                break;
            }
        }
        return (u) next;
    }
}
