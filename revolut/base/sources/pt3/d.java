package pt3;

import he0.m;
import kotlin.jvm.internal.Intrinsics;
import st3.c0;
import st3.d0;
import st3.e0;
import st3.f0;
import st3.u;

/* JADX INFO: loaded from: classes21.dex */
public final class d {
    private d() {
    }

    public static final m a() {
        m mVar = new m("layoutType", u.class, true, false);
        mVar.c(e0.class, "DEFAULT");
        mVar.c(d0.class, "CUSTOM");
        mVar.c(c0.class, "MEDIA_HEADER");
        mVar.c(st3.a.class, "CONSTRUCTOR");
        mVar.c(f0.class, "FALLBACK_SUBTYPE_LABEL");
        Intrinsics.checkNotNullExpressionValue(mVar, "registerFallbackSubtype(...)");
        return mVar;
    }
}
