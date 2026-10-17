package lhi;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import skm.p0;

/* JADX INFO: loaded from: classes10.dex */
public final class e0 implements hpa.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f195272a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final q06.d f195273b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f195274c;
    public final Object d;

    public e0(q06.d deeplinkParser, b90.a pushMessagesTools, zm0.c sessionProvider) {
        Intrinsics.checkNotNullParameter(deeplinkParser, "deeplinkParser");
        Intrinsics.checkNotNullParameter(pushMessagesTools, "pushMessagesTools");
        Intrinsics.checkNotNullParameter(sessionProvider, "sessionProvider");
        this.f195273b = deeplinkParser;
        this.f195274c = pushMessagesTools;
        this.d = sessionProvider;
    }

    @Override // hpa.a
    public final boolean b(ipa.j message) {
        boolean zF;
        String strJ;
        switch (this.f195272a) {
            case 0:
                Intrinsics.checkNotNullParameter(message, "message");
                String strE = ipa.k.e(message);
                if ((strE != null ? ((s06.c) this.f195273b).f(strE) : null) != null) {
                    skm.e0.C((CoroutineScope) this.d, p0.f264002b, null, new kze.h(this, null, 13), 2);
                }
                break;
            default:
                Intrinsics.checkNotNullParameter(message, "message");
                Intrinsics.checkNotNullParameter(message, "<this>");
                q06.d deeplinkParser = this.f195273b;
                Intrinsics.checkNotNullParameter(deeplinkParser, "deeplinkParser");
                String strE2 = ipa.k.e(message);
                if (strE2 == null || strE2.length() == 0) {
                    zF = false;
                } else {
                    jf0.c cVarD = ((s06.c) deeplinkParser).d(strE2);
                    zF = Intrinsics.f(cVarD != null ? cVarD.e(1) : null, "3ds");
                }
                boolean z = ((cn0.g) ((zm0.c) this.d)).d() instanceof mm0.n;
                String strE3 = ipa.k.e(message);
                if (strE3 != null && (strJ = ipa.k.j(message)) != null && zF && z) {
                    b90.a.c((b90.a) this.f195274c, message, new b90.f(b90.b.DEEPLINK, strE3, 4), strJ, ipa.l.HIGH, null, null, 48);
                }
                break;
        }
        return false;
    }

    public e0(q06.d deeplinkParser, gq.f appWidgetsController, CoroutineScope scope) {
        Intrinsics.checkNotNullParameter(deeplinkParser, "deeplinkParser");
        Intrinsics.checkNotNullParameter(appWidgetsController, "appWidgetsController");
        Intrinsics.checkNotNullParameter(scope, "scope");
        this.f195273b = deeplinkParser;
        this.f195274c = appWidgetsController;
        this.d = scope;
    }
}
