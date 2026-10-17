package tz1;

import bt9.v;
import ipa.j;
import ipa.k;
import ipa.l;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import skm.e0;
import skm.p0;

/* JADX INFO: loaded from: classes20.dex */
public final class d implements hpa.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q06.d f275734a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b90.a f275735b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final cx1.a f275736c;
    public final CoroutineScope d;

    public d(q06.d deeplinkParser, b90.a pushMessageHandler, cx1.a notificationHandler, CoroutineScope scope) {
        Intrinsics.checkNotNullParameter(deeplinkParser, "deeplinkParser");
        Intrinsics.checkNotNullParameter(pushMessageHandler, "pushMessageHandler");
        Intrinsics.checkNotNullParameter(notificationHandler, "notificationHandler");
        Intrinsics.checkNotNullParameter(scope, "scope");
        this.f275734a = deeplinkParser;
        this.f275735b = pushMessageHandler;
        this.f275736c = notificationHandler;
        this.d = scope;
    }

    public final void a(String str, String str2, j jVar, Function1 function1) {
        CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
        rd0.d.b(rd0.c.INFO, "APM-PUSH", "PushNotification received: ".concat(str2), null, null, 16);
        b90.a.c(this.f275735b, jVar, new b90.f(b90.b.DEEPLINK, str2, 4), str, l.DEFAULT, null, null, 48);
        p0 p0Var = p0.f264001a;
        e0.C(this.d, elm.f.f127540b, null, new v(6, null, function1), 2);
    }

    @Override // hpa.a
    public final boolean b(j message) {
        jf0.c cVarD;
        Intrinsics.checkNotNullParameter(message, "message");
        String strE = k.e(message);
        if (strE == null || (cVarD = ((s06.c) this.f275734a).d(strE)) == null) {
            return false;
        }
        String strJ = k.j(message);
        if (Intrinsics.f(cVarD.e(1), "apm-consent")) {
            a(strJ, strE, message, new c(this, strJ, null, 0));
            return true;
        }
        if (Intrinsics.f(cVarD.e(1), "token-transfers")) {
            a(strJ, strE, message, new c(this, strJ, null, 1));
            return true;
        }
        if (!Intrinsics.f(cVarD.e(1), "mbway") || !Intrinsics.f(cVarD.e(2), "authorisation")) {
            return false;
        }
        a(strJ, strE, message, new c(this, strJ, null, 2));
        return true;
    }
}
