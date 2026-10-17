package nt3;

import he0.m;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class f {
    private f() {
    }

    public static final m a() {
        m mVar = new m("type", e.class, true, false);
        mVar.c(d.class, "PROCEED");
        mVar.c(a.class, "CLOSE_APPLICATION");
        mVar.c(b.class, "DEEPLINK");
        mVar.c(c.class, "POP_UP");
        Intrinsics.checkNotNullExpressionValue(mVar, "registerSubtype(...)");
        return mVar;
    }
}
