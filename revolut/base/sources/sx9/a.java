package sx9;

import asi.d;
import au0.n4;
import fc.g;
import ipa.j;
import java.util.concurrent.ThreadPoolExecutor;
import kotlin.jvm.internal.Intrinsics;
import xx9.p;

/* JADX INFO: loaded from: classes13.dex */
public final class a implements hpa.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p f266377a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d f266378b;

    public a(p recentRecipientInteractor, d sessionInteractor) {
        Intrinsics.checkNotNullParameter(recentRecipientInteractor, "recentRecipientInteractor");
        Intrinsics.checkNotNullParameter(sessionInteractor, "sessionInteractor");
        this.f266377a = recentRecipientInteractor;
        this.f266378b = sessionInteractor;
    }

    @Override // hpa.a
    public final boolean b(j message) {
        Intrinsics.checkNotNullParameter(message, "message");
        if (!jh.d.h(this.f266378b.a())) {
            return false;
        }
        g gVar = this.f266377a.f309448a;
        ((ThreadPoolExecutor) gVar.i).submit(new n4(true, (Object) gVar, 10));
        return false;
    }
}
