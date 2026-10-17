package ha5;

import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;
import zhm.v;

/* JADX INFO: loaded from: classes21.dex */
public final class a {
    private a() {
    }

    public static d a(jf0.c deeplink) {
        Object next;
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        String uri2 = deeplink.f173629c;
        Intrinsics.checkNotNullParameter(uri2, "uri");
        Intrinsics.checkNotNullParameter(uri2, "uri");
        Intrinsics.checkNotNullParameter(uri2, "uri");
        c cVar = new c("revolut://app/credit/post-termination-plan/([0-9a-fA-F]{8}-[0-9a-fA-F]{4}-[0-9a-fA-F]{4}-[0-9a-fA-F]{4}-[0-9a-fA-F]{12})/repay", uri2);
        Intrinsics.checkNotNullParameter(uri2, "uri");
        Iterator it8 = v.k(cVar, new b("revolut://app/credit/post-termination-plan/([0-9a-fA-F]{8}-[0-9a-fA-F]{4}-[0-9a-fA-F]{4}-[0-9a-fA-F]{4}-[0-9a-fA-F]{12})/details", uri2)).iterator();
        while (true) {
            if (!it8.hasNext()) {
                next = null;
                break;
            }
            next = it8.next();
            if (((d) next).f150453a.matches()) {
                break;
            }
        }
        return (d) next;
    }
}
