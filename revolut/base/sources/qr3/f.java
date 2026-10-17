package qr3;

import he0.m;
import kotlin.jvm.internal.Intrinsics;
import qr3.e;

/* JADX INFO: loaded from: classes21.dex */
public final class f {
    private f() {
    }

    public static final m a() {
        m mVar = new m("id", e.class, true, false);
        mVar.c(e.a.class, "AGE");
        mVar.c(e.d.class, "EMPLOYMENT");
        mVar.c(e.C1359e.class, "INCOME");
        mVar.c(e.f.class, "LOCAL_PHONE_NUMBER");
        mVar.c(e.b.class, "BALANCE");
        mVar.c(e.g.class, "NEW_ACCOUNT");
        mVar.c(e.c.class, "DOCUMENTS");
        mVar.c(e.h.class, "RESIDENCY");
        mVar.c(e.i.class, "FALLBACK_SUBTYPE_LABEL");
        Intrinsics.checkNotNullExpressionValue(mVar, "registerFallbackSubtype(...)");
        return mVar;
    }
}
