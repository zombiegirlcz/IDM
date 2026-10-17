package fwf;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
public final class u implements jki.p {

    @NotNull
    public static final o Companion = new o();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final nvf.c f138637a;

    public u(nvf.c purchasedTransitTicketMapper, nvf.l getHelpProvider) {
        Intrinsics.checkNotNullParameter(purchasedTransitTicketMapper, "purchasedTransitTicketMapper");
        Intrinsics.checkNotNullParameter(getHelpProvider, "getHelpProvider");
        this.f138637a = purchasedTransitTicketMapper;
    }

    @Override // jki.p
    public final jki.m a(jki.i iVar) {
        f domainState = (f) iVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        return new i((List) iii.c.f(domainState.f138620a, new n(0), new fv0.c(5), new f0e.i(this, domainState, 27)));
    }
}
