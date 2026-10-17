package roj;

import efm.d0;
import kotlin.jvm.internal.Intrinsics;
import ufm.c;

/* JADX INFO: loaded from: classes13.dex */
public final class a extends moj.a {
    public a() {
        super("ID_EVENT_LUNAR");
    }

    @Override // q7l.b
    public final boolean c(p7l.a user) {
        Intrinsics.checkNotNullParameter(user, "user");
        return false;
    }

    @Override // q7l.b
    public final boolean d() {
        return true;
    }

    @Override // q7l.b
    public final d0 e(p7l.a user) {
        Intrinsics.checkNotNullParameter(user, "user");
        c cVar = new c(new ooj.a(user, 2), 2);
        Intrinsics.checkNotNullExpressionValue(cVar, "fromCallable(...)");
        return cVar;
    }
}
