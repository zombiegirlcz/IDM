package cqg;

import b90.f;
import ihm.j;
import ipa.k;
import jf0.c;
import kotlin.jvm.internal.Intrinsics;
import q06.d;
import zhm.f0;

/* JADX INFO: loaded from: classes13.dex */
public final class b implements lpg.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b90.a f108099a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d f108100b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final j f108101c;

    public b(b90.a pushMessagesTools, d deeplinkParser) {
        Intrinsics.checkNotNullParameter(pushMessagesTools, "pushMessagesTools");
        Intrinsics.checkNotNullParameter(deeplinkParser, "deeplinkParser");
        this.f108099a = pushMessagesTools;
        this.f108100b = deeplinkParser;
        this.f108101c = p.a.D("toSerialized(...)");
    }

    @Override // hpa.a
    public final boolean b(ipa.j message) {
        c cVarD;
        Intrinsics.checkNotNullParameter(message, "message");
        int i = a.f108098a[k.l(message).ordinal()];
        b90.a aVar = this.f108099a;
        if (i != 1) {
            if (i != 2) {
                return false;
            }
            String strE = k.e(message);
            b90.a.c(aVar, message, new f(b90.b.DEEPLINK, strE, 4), strE, null, null, null, 56);
            return true;
        }
        String strE2 = k.e(message);
        s06.c cVar = (s06.c) this.f108100b;
        String strG = null;
        if (strE2 != null) {
            String str = cVar.c(strE2) ? strE2 : null;
            if (str != null && (cVarD = cVar.d(str)) != null) {
                if (!Intrinsics.f(cVarD.a(), "money-box-invitations")) {
                    cVarD = null;
                }
                if (cVarD != null) {
                    strG = cVarD.g();
                }
            }
        }
        if (strG == null) {
            return false;
        }
        this.f108101c.onNext(strG);
        String str2 = strG;
        f fVar = new f(b90.b.DEEPLINK, strE2, f0.f322471a);
        lpg.b.Companion.getClass();
        b90.a.c(aVar, message, fVar, lpg.a.a(str2), null, null, null, 56);
        return true;
    }
}
