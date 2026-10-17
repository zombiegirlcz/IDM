package z8d;

import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import java.util.List;
import jki.m;
import jki.p;
import kotlin.jvm.internal.Intrinsics;
import y5g.l;
import yp0.e0;
import z55.w;
import zhm.f0;

/* JADX INFO: loaded from: classes7.dex */
public final class i implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p9d.c f320077a;

    public i(p9d.c doneButtonProvider) {
        Intrinsics.checkNotNullParameter(doneButtonProvider, "doneButtonProvider");
        this.f320077a = doneButtonProvider;
    }

    public static List b(List list, ListSubheaderDelegate.Model model) {
        return list.isEmpty() ? f0.f322471a : yp0.b.g(list, model, e0.INSIDE_BOX, 0, 0, 124);
    }

    @Override // jki.p
    public final m a(jki.i iVar) {
        c domainState = (c) iVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        return new g((List) iii.c.f(domainState.f320070a, new w(18), new h(0), new l(this, 20)), ((p9d.d) this.f320077a).a(domainState.f320071b));
    }
}
