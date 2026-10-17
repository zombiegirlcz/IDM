package x9k;

import a08.l;
import kotlin.jvm.internal.Intrinsics;
import pfm.h;
import pfm.r;
import te0.w;
import ue0.e;

/* JADX INFO: loaded from: classes13.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ba5.a f303746a;

    public a(ba5.a pcwAuthRepository) {
        Intrinsics.checkNotNullParameter(pcwAuthRepository, "pcwAuthRepository");
        this.f303746a = pcwAuthRepository;
    }

    public final pfm.a a() {
        h hVar = new h(new lm.a(this, 6), 2);
        Intrinsics.checkNotNullExpressionValue(hVar, "fromAction(...)");
        return e.v(hVar);
    }

    public final r b(z95.b session) {
        Intrinsics.checkNotNullParameter(session, "session");
        dak.b bVar = (dak.b) this.f303746a;
        bVar.getClass();
        Intrinsics.checkNotNullParameter(session, "session");
        h hVar = new h(new l(bVar, session, 19), 2);
        Intrinsics.checkNotNullExpressionValue(hVar, "fromAction(...)");
        return w.g0(hVar);
    }
}
