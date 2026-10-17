package m3h;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;
import lk7.n;
import lxi.g;

/* JADX INFO: loaded from: classes9.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d4h.b f202570a;

    public c(d4h.b actionsToActionPanelStateMapper) {
        Intrinsics.checkNotNullParameter(actionsToActionPanelStateMapper, "actionsToActionPanelStateMapper");
        this.f202570a = actionsToActionPanelStateMapper;
    }

    public final x2h.b a(Data actions) {
        Intrinsics.checkNotNullParameter(actions, "actions");
        return (x2h.b) iii.c.f(actions, new m30.c(20), new g(27), new n(this, 18));
    }
}
