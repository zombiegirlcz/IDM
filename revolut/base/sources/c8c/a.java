package c8c;

import b90.b;
import b90.f;
import ipa.j;
import ipa.k;
import ipa.l;
import jf0.c;
import kotlin.jvm.internal.Intrinsics;
import q06.d;

/* JADX INFO: loaded from: classes13.dex */
public final class a implements hpa.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b90.a f22155a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d f22156b;

    public a(b90.a pushMessagesTools, d deeplinkParser) {
        Intrinsics.checkNotNullParameter(pushMessagesTools, "pushMessagesTools");
        Intrinsics.checkNotNullParameter(deeplinkParser, "deeplinkParser");
        this.f22155a = pushMessagesTools;
        this.f22156b = deeplinkParser;
    }

    @Override // hpa.a
    public final boolean b(j message) {
        c cVarD;
        Intrinsics.checkNotNullParameter(message, "message");
        String strE = k.e(message);
        if (strE == null || strE.length() == 0 || (cVarD = ((s06.c) this.f22156b).d(strE)) == null || !Intrinsics.f(cVarD.a(), "revolut-pay")) {
            return false;
        }
        b90.a.c(this.f22155a, message, new f(b.DEEPLINK, strE, 4), null, l.HIGH, null, null, 52);
        return true;
    }
}
