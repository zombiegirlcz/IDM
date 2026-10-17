package ln;

import com.revolut.retail.core.navigation.NaviCommand;
import efm.r;
import ihm.j;
import kotlin.jvm.internal.Intrinsics;
import pfm.h;

/* JADX INFO: loaded from: classes.dex */
public final class c implements a, d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j f197105a = p.a.D("toSerialized(...)");

    @Override // ln.d
    public final r T() {
        return this.f197105a;
    }

    @Override // ln.a
    public final h a(NaviCommand command) {
        Intrinsics.checkNotNullParameter(command, "command");
        h hVar = new h(new la8.j(this, command, 3), 2);
        Intrinsics.checkNotNullExpressionValue(hVar, "fromAction(...)");
        return hVar;
    }

    @Override // ln.a
    public final void b(NaviCommand command) {
        Intrinsics.checkNotNullParameter(command, "command");
        this.f197105a.onNext(command);
    }
}
