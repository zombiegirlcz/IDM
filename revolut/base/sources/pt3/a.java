package pt3;

import he0.m;
import kotlin.jvm.internal.Intrinsics;
import ot3.i;
import ot3.j;
import ot3.n;

/* JADX INFO: loaded from: classes21.dex */
public final class a {
    private a() {
    }

    public static final m a() {
        m mVar = new m("type", n.class, true, false);
        mVar.c(j.class, "PROCEED_APPLICATION");
        mVar.c(ot3.g.class, "CREATE_CALENDAR_EVENT");
        mVar.c(ot3.h.class, "DEEPLINK");
        mVar.c(ot3.m.class, "UPGRADE_PLAN");
        mVar.c(i.class, "CLOSE");
        mVar.c(ot3.f.class, "CANCEL");
        Intrinsics.checkNotNullExpressionValue(mVar, "registerSubtype(...)");
        return mVar;
    }
}
