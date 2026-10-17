package pq3;

import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class e {
    private e() {
    }

    public static z a(jf0.c deeplink) {
        Object next;
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        l lVar = new l("revolut://app/credit/ftc-application/?", deeplink);
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        f fVar = new f("revolut://app/credit/cc-application/?", deeplink);
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        g gVar = new g("revolut://app/credit/cc_cli-application/?", deeplink);
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        i iVar = new i("revolut://app/credit/fcc-application/?", deeplink);
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        x xVar = new x("revolut://app/credit/rfl-application/?", deeplink);
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        t tVar = new t("revolut://app/credit/bnpl-application/?", deeplink);
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        m mVar = new m("revolut://app/credit/mtg-application/?", deeplink);
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        y yVar = new y("revolut://app/credit/mtg-rf-application/?", deeplink);
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        s sVar = new s("revolut://app/credit/od-application/?", deeplink);
        j jVar = new j(deeplink);
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        v vVar = new v("revolut://app/credit/pt-rp-application/([0-9a-fA-F]{8}-[0-9a-fA-F]{4}-[0-9a-fA-F]{4}-[0-9a-fA-F]{4}-[0-9a-fA-F]{12})/?", deeplink);
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        u uVar = new u("revolut://app/credit/pt-ps-application/([0-9a-fA-F]{8}-[0-9a-fA-F]{4}-[0-9a-fA-F]{4}-[0-9a-fA-F]{4}-[0-9a-fA-F]{12})/?", deeplink);
        k kVar = new k(deeplink);
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        n nVar = new n("revolut://app/credit/mtg-rng-application/([0-9a-fA-F]{8}-[0-9a-fA-F]{4}-[0-9a-fA-F]{4}-[0-9a-fA-F]{4}-[0-9a-fA-F]{12})/FORBEARANCE/?", deeplink);
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        o oVar = new o("revolut://app/credit/mtg-rng-application/([0-9a-fA-F]{8}-[0-9a-fA-F]{4}-[0-9a-fA-F]{4}-[0-9a-fA-F]{4}-[0-9a-fA-F]{12})/REFURBISHMENT/?", deeplink);
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        r rVar = new r("revolut://app/credit/notify-me/?", deeplink);
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        w wVar = new w("revolut://app/credit/mtg/property-valuators/?", deeplink);
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        c cVar = new c("revolut://app/credit/cc-bcm-application/?", deeplink);
        h hVar = new h(deeplink);
        q qVar = new q(deeplink);
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        Iterator it8 = zhm.v.k(lVar, fVar, gVar, iVar, xVar, tVar, mVar, yVar, sVar, jVar, vVar, uVar, kVar, nVar, oVar, rVar, wVar, cVar, hVar, qVar, new d("revolut://app/credit/(.+)-application/([0-9a-fA-F]{8}-[0-9a-fA-F]{4}-[0-9a-fA-F]{4}-[0-9a-fA-F]{4}-[0-9a-fA-F]{12})/cancel/?", deeplink)).iterator();
        while (true) {
            if (!it8.hasNext()) {
                next = null;
                break;
            }
            next = it8.next();
            if (((z) next).f238681a.matches()) {
                break;
            }
        }
        return (z) next;
    }
}
