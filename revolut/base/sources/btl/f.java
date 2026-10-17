package btl;

import bn4.y;
import bt9.t;
import cli.j;
import cli.n;
import cli.o;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class f implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d4h.b f18652a;

    public f(d4h.b actionsToActionPanelStateMapper) {
        Intrinsics.checkNotNullParameter(actionsToActionPanelStateMapper, "actionsToActionPanelStateMapper");
        this.f18652a = actionsToActionPanelStateMapper;
    }

    @Override // cli.n
    public final o c(j jVar) {
        c domainState = (c) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        return (e) iii.c.f(domainState.f18650a, new t(4), new y(22), new b88.o(this, 18));
    }
}
